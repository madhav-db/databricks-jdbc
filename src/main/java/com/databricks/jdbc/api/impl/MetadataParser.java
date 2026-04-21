package com.databricks.jdbc.api.impl;

import com.databricks.jdbc.exception.DatabricksDriverException;
import com.databricks.jdbc.model.telemetry.enums.DatabricksDriverErrorCode;
import java.util.LinkedHashMap;
import java.util.Map;

/** Utility class for parsing metadata descriptions into structured type mappings. */
public class MetadataParser {

  /**
   * Parses STRUCT metadata to extract field types.
   *
   * @param metadata the metadata string representing a STRUCT type
   * @return a map where each key is a field name, and the value is the field's data type. Returns
   *     an empty map when the metadata lacks field parameters (e.g., bare {@code STRUCT} sent by
   *     older servers that did not populate parameterized type names).
   */
  public static Map<String, String> parseStructMetadata(String metadata) {
    Map<String, String> typeMap = new LinkedHashMap<>();
    if (!hasAngleBrackets(metadata)) {
      return typeMap;
    }
    metadata = metadata.substring("STRUCT<".length(), metadata.length() - 1);
    String[] fields = splitFields(metadata);

    for (String field : fields) {
      String[] parts = field.split(":", 2);
      String fieldName = parts[0].trim();
      String fieldType = cleanTypeName(parts[1].trim());

      if (fieldType.startsWith("STRUCT")) {
        typeMap.put(fieldName, fieldType);
      } else if (fieldType.startsWith("ARRAY")) {
        typeMap.put(fieldName, "ARRAY<" + parseArrayMetadata(fieldType) + ">");
      } else if (fieldType.startsWith("MAP")) {
        typeMap.put(fieldName, "MAP<" + parseMapMetadata(fieldType) + ">");
      } else {
        typeMap.put(fieldName, fieldType);
      }
    }

    return typeMap;
  }

  /**
   * Parses ARRAY metadata to retrieve the element type.
   *
   * @param metadata the metadata string representing an ARRAY type
   * @return the element type contained within the array, or an empty string when the metadata lacks
   *     the element type parameter (e.g., bare {@code ARRAY}). Callers should treat an empty return
   *     as "unknown element type" and fall back to dynamic inference.
   */
  public static String parseArrayMetadata(String metadata) {
    if (!hasAngleBrackets(metadata)) {
      return "";
    }
    return cleanTypeName(metadata.substring("ARRAY<".length(), metadata.length() - 1).trim());
  }

  /**
   * Parses MAP metadata to retrieve key and value types.
   *
   * @param metadata the metadata string representing a MAP type
   * @return a string formatted as "keyType, valueType", or {@code ", "} when the metadata lacks
   *     type parameters (e.g., bare {@code MAP}). Callers should treat the empty halves as
   *     "unknown" and fall back to dynamic inference.
   * @throws DatabricksDriverException if the MAP metadata format is invalid
   */
  public static String parseMapMetadata(String metadata) {
    if (!hasAngleBrackets(metadata)) {
      return ", ";
    }
    metadata = metadata.substring("MAP<".length(), metadata.length() - 1).trim();

    int depth = 0;
    int splitIndex = -1;

    for (int i = 0; i < metadata.length(); i++) {
      char ch = metadata.charAt(i);
      if (ch == '<') {
        depth++;
      } else if (ch == '>') {
        depth--;
      }

      if (ch == ',' && depth == 0) {
        splitIndex = i;
        break;
      }
    }

    if (splitIndex == -1) {
      throw new DatabricksDriverException(
          "Invalid MAP metadata: " + metadata,
          DatabricksDriverErrorCode.COMPLEX_DATA_TYPE_MAP_CONVERSION_ERROR);
    }

    String keyType = cleanTypeName(metadata.substring(0, splitIndex).trim());
    String valueType = cleanTypeName(metadata.substring(splitIndex + 1).trim());

    return keyType + ", " + valueType;
  }

  /**
   * Splits fields in a STRUCT metadata string, accounting for nested types.
   *
   * @param metadata the STRUCT metadata string to split
   * @return an array of field definitions in the STRUCT
   */
  private static String[] splitFields(String metadata) {
    int angleBracketDepth = 0;
    int parenDepth = 0;
    StringBuilder currentField = new StringBuilder();
    java.util.List<String> fields = new java.util.ArrayList<>();

    for (char ch : metadata.toCharArray()) {
      if (ch == '<') {
        angleBracketDepth++;
      } else if (ch == '>') {
        angleBracketDepth--;
      } else if (ch == '(') {
        parenDepth++;
      } else if (ch == ')') {
        parenDepth--;
      }

      // Only split on commas when we're at the top level (both depths are 0)
      if (ch == ',' && angleBracketDepth == 0 && parenDepth == 0) {
        String field = currentField.toString().trim();
        fields.add(field);
        currentField.setLength(0);
      } else {
        currentField.append(ch);
      }
    }
    String finalField = currentField.toString().trim();
    fields.add(finalField);
    return fields.toArray(new String[0]);
  }

  /**
   * Removes any "NOT NULL" constraints and trims the type name.
   *
   * @param typeName the type name to clean
   * @return the cleaned type name without "NOT NULL" constraints
   */
  private static String cleanTypeName(String typeName) {
    return typeName.replaceAll(" NOT NULL", "").trim();
  }

  /**
   * Returns true when the metadata contains angle brackets, i.e. looks parameterized. Used to skip
   * the parameterized parsing logic for bare type names like {@code ARRAY}, {@code MAP}, or {@code
   * STRUCT} that some servers return when the full parameterized type is unavailable (e.g., when
   * the Thrift {@code TColumnDesc} carries only {@code ARRAY_TYPE} without element information and
   * the arrow schema is not populated).
   */
  private static boolean hasAngleBrackets(String metadata) {
    return metadata != null
        && metadata.indexOf('<') >= 0
        && metadata.lastIndexOf('>') > metadata.indexOf('<');
  }
}
