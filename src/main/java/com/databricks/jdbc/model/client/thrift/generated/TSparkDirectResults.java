/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * <p>DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.databricks.jdbc.model.client.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(
    value = "Autogenerated by Thrift Compiler (0.19.0)",
    date = "2025-05-08")
public class TSparkDirectResults
    implements org.apache.thrift.TBase<TSparkDirectResults, TSparkDirectResults._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TSparkDirectResults> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
      new org.apache.thrift.protocol.TStruct("TSparkDirectResults");

  private static final org.apache.thrift.protocol.TField OPERATION_STATUS_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "operationStatus", org.apache.thrift.protocol.TType.STRUCT, (short) 1);
  private static final org.apache.thrift.protocol.TField RESULT_SET_METADATA_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "resultSetMetadata", org.apache.thrift.protocol.TType.STRUCT, (short) 2);
  private static final org.apache.thrift.protocol.TField RESULT_SET_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "resultSet", org.apache.thrift.protocol.TType.STRUCT, (short) 3);
  private static final org.apache.thrift.protocol.TField CLOSE_OPERATION_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "closeOperation", org.apache.thrift.protocol.TType.STRUCT, (short) 4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
      new TSparkDirectResultsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
      new TSparkDirectResultsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TGetOperationStatusResp operationStatus; // optional
  public @org.apache.thrift.annotation.Nullable TGetResultSetMetadataResp
      resultSetMetadata; // optional
  public @org.apache.thrift.annotation.Nullable TFetchResultsResp resultSet; // optional
  public @org.apache.thrift.annotation.Nullable TCloseOperationResp closeOperation; // optional

  /**
   * The set of fields this struct contains, along with convenience methods for finding and
   * manipulating them.
   */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATION_STATUS((short) 1, "operationStatus"),
    RESULT_SET_METADATA((short) 2, "resultSetMetadata"),
    RESULT_SET((short) 3, "resultSet"),
    CLOSE_OPERATION((short) 4, "closeOperation");

    private static final java.util.Map<java.lang.String, _Fields> byName =
        new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /** Find the _Fields constant that matches fieldId, or null if its not found. */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // OPERATION_STATUS
          return OPERATION_STATUS;
        case 2: // RESULT_SET_METADATA
          return RESULT_SET_METADATA;
        case 3: // RESULT_SET
          return RESULT_SET;
        case 4: // CLOSE_OPERATION
          return CLOSE_OPERATION;
        default:
          return null;
      }
    }

    /** Find the _Fields constant that matches fieldId, throwing an exception if it is not found. */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /** Find the _Fields constant that matches name, or null if its not found. */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {
    _Fields.OPERATION_STATUS,
    _Fields.RESULT_SET_METADATA,
    _Fields.RESULT_SET,
    _Fields.CLOSE_OPERATION
  };
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
        new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(
        _Fields.OPERATION_STATUS,
        new org.apache.thrift.meta_data.FieldMetaData(
            "operationStatus",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.StructMetaData(
                org.apache.thrift.protocol.TType.STRUCT, TGetOperationStatusResp.class)));
    tmpMap.put(
        _Fields.RESULT_SET_METADATA,
        new org.apache.thrift.meta_data.FieldMetaData(
            "resultSetMetadata",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.StructMetaData(
                org.apache.thrift.protocol.TType.STRUCT, TGetResultSetMetadataResp.class)));
    tmpMap.put(
        _Fields.RESULT_SET,
        new org.apache.thrift.meta_data.FieldMetaData(
            "resultSet",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.StructMetaData(
                org.apache.thrift.protocol.TType.STRUCT, TFetchResultsResp.class)));
    tmpMap.put(
        _Fields.CLOSE_OPERATION,
        new org.apache.thrift.meta_data.FieldMetaData(
            "closeOperation",
            org.apache.thrift.TFieldRequirementType.OPTIONAL,
            new org.apache.thrift.meta_data.StructMetaData(
                org.apache.thrift.protocol.TType.STRUCT, TCloseOperationResp.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
        TSparkDirectResults.class, metaDataMap);
  }

  public TSparkDirectResults() {}

  /** Performs a deep copy on <i>other</i>. */
  public TSparkDirectResults(TSparkDirectResults other) {
    if (other.isSetOperationStatus()) {
      this.operationStatus = new TGetOperationStatusResp(other.operationStatus);
    }
    if (other.isSetResultSetMetadata()) {
      this.resultSetMetadata = new TGetResultSetMetadataResp(other.resultSetMetadata);
    }
    if (other.isSetResultSet()) {
      this.resultSet = new TFetchResultsResp(other.resultSet);
    }
    if (other.isSetCloseOperation()) {
      this.closeOperation = new TCloseOperationResp(other.closeOperation);
    }
  }

  @Override
  public TSparkDirectResults deepCopy() {
    return new TSparkDirectResults(this);
  }

  @Override
  public void clear() {
    this.operationStatus = null;
    this.resultSetMetadata = null;
    this.resultSet = null;
    this.closeOperation = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TGetOperationStatusResp getOperationStatus() {
    return this.operationStatus;
  }

  public TSparkDirectResults setOperationStatus(
      @org.apache.thrift.annotation.Nullable TGetOperationStatusResp operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

  public void unsetOperationStatus() {
    this.operationStatus = null;
  }

  /**
   * Returns true if field operationStatus is set (has been assigned a value) and false otherwise
   */
  public boolean isSetOperationStatus() {
    return this.operationStatus != null;
  }

  public void setOperationStatusIsSet(boolean value) {
    if (!value) {
      this.operationStatus = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TGetResultSetMetadataResp getResultSetMetadata() {
    return this.resultSetMetadata;
  }

  public TSparkDirectResults setResultSetMetadata(
      @org.apache.thrift.annotation.Nullable TGetResultSetMetadataResp resultSetMetadata) {
    this.resultSetMetadata = resultSetMetadata;
    return this;
  }

  public void unsetResultSetMetadata() {
    this.resultSetMetadata = null;
  }

  /**
   * Returns true if field resultSetMetadata is set (has been assigned a value) and false otherwise
   */
  public boolean isSetResultSetMetadata() {
    return this.resultSetMetadata != null;
  }

  public void setResultSetMetadataIsSet(boolean value) {
    if (!value) {
      this.resultSetMetadata = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TFetchResultsResp getResultSet() {
    return this.resultSet;
  }

  public TSparkDirectResults setResultSet(
      @org.apache.thrift.annotation.Nullable TFetchResultsResp resultSet) {
    this.resultSet = resultSet;
    return this;
  }

  public void unsetResultSet() {
    this.resultSet = null;
  }

  /** Returns true if field resultSet is set (has been assigned a value) and false otherwise */
  public boolean isSetResultSet() {
    return this.resultSet != null;
  }

  public void setResultSetIsSet(boolean value) {
    if (!value) {
      this.resultSet = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TCloseOperationResp getCloseOperation() {
    return this.closeOperation;
  }

  public TSparkDirectResults setCloseOperation(
      @org.apache.thrift.annotation.Nullable TCloseOperationResp closeOperation) {
    this.closeOperation = closeOperation;
    return this;
  }

  public void unsetCloseOperation() {
    this.closeOperation = null;
  }

  /** Returns true if field closeOperation is set (has been assigned a value) and false otherwise */
  public boolean isSetCloseOperation() {
    return this.closeOperation != null;
  }

  public void setCloseOperationIsSet(boolean value) {
    if (!value) {
      this.closeOperation = null;
    }
  }

  @Override
  public void setFieldValue(
      _Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
      case OPERATION_STATUS:
        if (value == null) {
          unsetOperationStatus();
        } else {
          setOperationStatus((TGetOperationStatusResp) value);
        }
        break;

      case RESULT_SET_METADATA:
        if (value == null) {
          unsetResultSetMetadata();
        } else {
          setResultSetMetadata((TGetResultSetMetadataResp) value);
        }
        break;

      case RESULT_SET:
        if (value == null) {
          unsetResultSet();
        } else {
          setResultSet((TFetchResultsResp) value);
        }
        break;

      case CLOSE_OPERATION:
        if (value == null) {
          unsetCloseOperation();
        } else {
          setCloseOperation((TCloseOperationResp) value);
        }
        break;
    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
      case OPERATION_STATUS:
        return getOperationStatus();

      case RESULT_SET_METADATA:
        return getResultSetMetadata();

      case RESULT_SET:
        return getResultSet();

      case CLOSE_OPERATION:
        return getCloseOperation();
    }
    throw new java.lang.IllegalStateException();
  }

  /**
   * Returns true if field corresponding to fieldID is set (has been assigned a value) and false
   * otherwise
   */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
      case OPERATION_STATUS:
        return isSetOperationStatus();
      case RESULT_SET_METADATA:
        return isSetResultSetMetadata();
      case RESULT_SET:
        return isSetResultSet();
      case CLOSE_OPERATION:
        return isSetCloseOperation();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSparkDirectResults) return this.equals((TSparkDirectResults) that);
    return false;
  }

  public boolean equals(TSparkDirectResults that) {
    if (that == null) return false;
    if (this == that) return true;

    boolean this_present_operationStatus = true && this.isSetOperationStatus();
    boolean that_present_operationStatus = true && that.isSetOperationStatus();
    if (this_present_operationStatus || that_present_operationStatus) {
      if (!(this_present_operationStatus && that_present_operationStatus)) return false;
      if (!this.operationStatus.equals(that.operationStatus)) return false;
    }

    boolean this_present_resultSetMetadata = true && this.isSetResultSetMetadata();
    boolean that_present_resultSetMetadata = true && that.isSetResultSetMetadata();
    if (this_present_resultSetMetadata || that_present_resultSetMetadata) {
      if (!(this_present_resultSetMetadata && that_present_resultSetMetadata)) return false;
      if (!this.resultSetMetadata.equals(that.resultSetMetadata)) return false;
    }

    boolean this_present_resultSet = true && this.isSetResultSet();
    boolean that_present_resultSet = true && that.isSetResultSet();
    if (this_present_resultSet || that_present_resultSet) {
      if (!(this_present_resultSet && that_present_resultSet)) return false;
      if (!this.resultSet.equals(that.resultSet)) return false;
    }

    boolean this_present_closeOperation = true && this.isSetCloseOperation();
    boolean that_present_closeOperation = true && that.isSetCloseOperation();
    if (this_present_closeOperation || that_present_closeOperation) {
      if (!(this_present_closeOperation && that_present_closeOperation)) return false;
      if (!this.closeOperation.equals(that.closeOperation)) return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOperationStatus()) ? 131071 : 524287);
    if (isSetOperationStatus()) hashCode = hashCode * 8191 + operationStatus.hashCode();

    hashCode = hashCode * 8191 + ((isSetResultSetMetadata()) ? 131071 : 524287);
    if (isSetResultSetMetadata()) hashCode = hashCode * 8191 + resultSetMetadata.hashCode();

    hashCode = hashCode * 8191 + ((isSetResultSet()) ? 131071 : 524287);
    if (isSetResultSet()) hashCode = hashCode * 8191 + resultSet.hashCode();

    hashCode = hashCode * 8191 + ((isSetCloseOperation()) ? 131071 : 524287);
    if (isSetCloseOperation()) hashCode = hashCode * 8191 + closeOperation.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TSparkDirectResults other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison =
        java.lang.Boolean.compare(isSetOperationStatus(), other.isSetOperationStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationStatus()) {
      lastComparison =
          org.apache.thrift.TBaseHelper.compareTo(this.operationStatus, other.operationStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison =
        java.lang.Boolean.compare(isSetResultSetMetadata(), other.isSetResultSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultSetMetadata()) {
      lastComparison =
          org.apache.thrift.TBaseHelper.compareTo(this.resultSetMetadata, other.resultSetMetadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResultSet(), other.isSetResultSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultSet, other.resultSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCloseOperation(), other.isSetCloseOperation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCloseOperation()) {
      lastComparison =
          org.apache.thrift.TBaseHelper.compareTo(this.closeOperation, other.closeOperation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot)
      throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSparkDirectResults(");
    boolean first = true;

    if (isSetOperationStatus()) {
      sb.append("operationStatus:");
      if (this.operationStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.operationStatus);
      }
      first = false;
    }
    if (isSetResultSetMetadata()) {
      if (!first) sb.append(", ");
      sb.append("resultSetMetadata:");
      if (this.resultSetMetadata == null) {
        sb.append("null");
      } else {
        sb.append(this.resultSetMetadata);
      }
      first = false;
    }
    if (isSetResultSet()) {
      if (!first) sb.append(", ");
      sb.append("resultSet:");
      if (this.resultSet == null) {
        sb.append("null");
      } else {
        sb.append(this.resultSet);
      }
      first = false;
    }
    if (isSetCloseOperation()) {
      if (!first) sb.append(", ");
      sb.append("closeOperation:");
      if (this.closeOperation == null) {
        sb.append("null");
      } else {
        sb.append(this.closeOperation);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (operationStatus != null) {
      operationStatus.validate();
    }
    if (resultSetMetadata != null) {
      resultSetMetadata.validate();
    }
    if (resultSet != null) {
      resultSet.validate();
    }
    if (closeOperation != null) {
      closeOperation.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(
          new org.apache.thrift.protocol.TCompactProtocol(
              new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in)
      throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(
          new org.apache.thrift.protocol.TCompactProtocol(
              new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSparkDirectResultsStandardSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSparkDirectResultsStandardScheme getScheme() {
      return new TSparkDirectResultsStandardScheme();
    }
  }

  private static class TSparkDirectResultsStandardScheme
      extends org.apache.thrift.scheme.StandardScheme<TSparkDirectResults> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TSparkDirectResults struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATION_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.operationStatus = new TGetOperationStatusResp();
              struct.operationStatus.read(iprot);
              struct.setOperationStatusIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESULT_SET_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resultSetMetadata = new TGetResultSetMetadataResp();
              struct.resultSetMetadata.read(iprot);
              struct.setResultSetMetadataIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULT_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resultSet = new TFetchResultsResp();
              struct.resultSet.read(iprot);
              struct.setResultSetIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLOSE_OPERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.closeOperation = new TCloseOperationResp();
              struct.closeOperation.read(iprot);
              struct.setCloseOperationIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, TSparkDirectResults struct)
        throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operationStatus != null) {
        if (struct.isSetOperationStatus()) {
          oprot.writeFieldBegin(OPERATION_STATUS_FIELD_DESC);
          struct.operationStatus.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resultSetMetadata != null) {
        if (struct.isSetResultSetMetadata()) {
          oprot.writeFieldBegin(RESULT_SET_METADATA_FIELD_DESC);
          struct.resultSetMetadata.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resultSet != null) {
        if (struct.isSetResultSet()) {
          oprot.writeFieldBegin(RESULT_SET_FIELD_DESC);
          struct.resultSet.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.closeOperation != null) {
        if (struct.isSetCloseOperation()) {
          oprot.writeFieldBegin(CLOSE_OPERATION_FIELD_DESC);
          struct.closeOperation.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }

  private static class TSparkDirectResultsTupleSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TSparkDirectResultsTupleScheme getScheme() {
      return new TSparkDirectResultsTupleScheme();
    }
  }

  private static class TSparkDirectResultsTupleScheme
      extends org.apache.thrift.scheme.TupleScheme<TSparkDirectResults> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSparkDirectResults struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOperationStatus()) {
        optionals.set(0);
      }
      if (struct.isSetResultSetMetadata()) {
        optionals.set(1);
      }
      if (struct.isSetResultSet()) {
        optionals.set(2);
      }
      if (struct.isSetCloseOperation()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetOperationStatus()) {
        struct.operationStatus.write(oprot);
      }
      if (struct.isSetResultSetMetadata()) {
        struct.resultSetMetadata.write(oprot);
      }
      if (struct.isSetResultSet()) {
        struct.resultSet.write(oprot);
      }
      if (struct.isSetCloseOperation()) {
        struct.closeOperation.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSparkDirectResults struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.operationStatus = new TGetOperationStatusResp();
        struct.operationStatus.read(iprot);
        struct.setOperationStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.resultSetMetadata = new TGetResultSetMetadataResp();
        struct.resultSetMetadata.read(iprot);
        struct.setResultSetMetadataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.resultSet = new TFetchResultsResp();
        struct.resultSet.read(iprot);
        struct.setResultSetIsSet(true);
      }
      if (incoming.get(3)) {
        struct.closeOperation = new TCloseOperationResp();
        struct.closeOperation.read(iprot);
        struct.setCloseOperationIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(
      org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme())
            ? STANDARD_SCHEME_FACTORY
            : TUPLE_SCHEME_FACTORY)
        .getScheme();
  }
}
