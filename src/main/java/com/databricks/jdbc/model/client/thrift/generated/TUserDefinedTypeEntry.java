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
public class TUserDefinedTypeEntry
    implements org.apache.thrift.TBase<TUserDefinedTypeEntry, TUserDefinedTypeEntry._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TUserDefinedTypeEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
      new org.apache.thrift.protocol.TStruct("TUserDefinedTypeEntry");

  private static final org.apache.thrift.protocol.TField TYPE_CLASS_NAME_FIELD_DESC =
      new org.apache.thrift.protocol.TField(
          "typeClassName", org.apache.thrift.protocol.TType.STRING, (short) 1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
      new TUserDefinedTypeEntryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
      new TUserDefinedTypeEntryTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String typeClassName; // required

  /**
   * The set of fields this struct contains, along with convenience methods for finding and
   * manipulating them.
   */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE_CLASS_NAME((short) 1, "typeClassName");

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
        case 1: // TYPE_CLASS_NAME
          return TYPE_CLASS_NAME;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
        new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(
        _Fields.TYPE_CLASS_NAME,
        new org.apache.thrift.meta_data.FieldMetaData(
            "typeClassName",
            org.apache.thrift.TFieldRequirementType.REQUIRED,
            new org.apache.thrift.meta_data.FieldValueMetaData(
                org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
        TUserDefinedTypeEntry.class, metaDataMap);
  }

  public TUserDefinedTypeEntry() {}

  public TUserDefinedTypeEntry(java.lang.String typeClassName) {
    this();
    this.typeClassName = typeClassName;
  }

  /** Performs a deep copy on <i>other</i>. */
  public TUserDefinedTypeEntry(TUserDefinedTypeEntry other) {
    if (other.isSetTypeClassName()) {
      this.typeClassName = other.typeClassName;
    }
  }

  @Override
  public TUserDefinedTypeEntry deepCopy() {
    return new TUserDefinedTypeEntry(this);
  }

  @Override
  public void clear() {
    this.typeClassName = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTypeClassName() {
    return this.typeClassName;
  }

  public TUserDefinedTypeEntry setTypeClassName(
      @org.apache.thrift.annotation.Nullable java.lang.String typeClassName) {
    this.typeClassName = typeClassName;
    return this;
  }

  public void unsetTypeClassName() {
    this.typeClassName = null;
  }

  /** Returns true if field typeClassName is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeClassName() {
    return this.typeClassName != null;
  }

  public void setTypeClassNameIsSet(boolean value) {
    if (!value) {
      this.typeClassName = null;
    }
  }

  @Override
  public void setFieldValue(
      _Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
      case TYPE_CLASS_NAME:
        if (value == null) {
          unsetTypeClassName();
        } else {
          setTypeClassName((java.lang.String) value);
        }
        break;
    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
      case TYPE_CLASS_NAME:
        return getTypeClassName();
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
      case TYPE_CLASS_NAME:
        return isSetTypeClassName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUserDefinedTypeEntry) return this.equals((TUserDefinedTypeEntry) that);
    return false;
  }

  public boolean equals(TUserDefinedTypeEntry that) {
    if (that == null) return false;
    if (this == that) return true;

    boolean this_present_typeClassName = true && this.isSetTypeClassName();
    boolean that_present_typeClassName = true && that.isSetTypeClassName();
    if (this_present_typeClassName || that_present_typeClassName) {
      if (!(this_present_typeClassName && that_present_typeClassName)) return false;
      if (!this.typeClassName.equals(that.typeClassName)) return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTypeClassName()) ? 131071 : 524287);
    if (isSetTypeClassName()) hashCode = hashCode * 8191 + typeClassName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TUserDefinedTypeEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTypeClassName(), other.isSetTypeClassName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeClassName()) {
      lastComparison =
          org.apache.thrift.TBaseHelper.compareTo(this.typeClassName, other.typeClassName);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUserDefinedTypeEntry(");
    boolean first = true;

    sb.append("typeClassName:");
    if (this.typeClassName == null) {
      sb.append("null");
    } else {
      sb.append(this.typeClassName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (typeClassName == null) {
      throw new org.apache.thrift.protocol.TProtocolException(
          "Required field 'typeClassName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class TUserDefinedTypeEntryStandardSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserDefinedTypeEntryStandardScheme getScheme() {
      return new TUserDefinedTypeEntryStandardScheme();
    }
  }

  private static class TUserDefinedTypeEntryStandardScheme
      extends org.apache.thrift.scheme.StandardScheme<TUserDefinedTypeEntry> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, TUserDefinedTypeEntry struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE_CLASS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.typeClassName = iprot.readString();
              struct.setTypeClassNameIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, TUserDefinedTypeEntry struct)
        throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.typeClassName != null) {
        oprot.writeFieldBegin(TYPE_CLASS_NAME_FIELD_DESC);
        oprot.writeString(struct.typeClassName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }

  private static class TUserDefinedTypeEntryTupleSchemeFactory
      implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public TUserDefinedTypeEntryTupleScheme getScheme() {
      return new TUserDefinedTypeEntryTupleScheme();
    }
  }

  private static class TUserDefinedTypeEntryTupleScheme
      extends org.apache.thrift.scheme.TupleScheme<TUserDefinedTypeEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUserDefinedTypeEntry struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.typeClassName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUserDefinedTypeEntry struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot =
          (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.typeClassName = iprot.readString();
      struct.setTypeClassNameIsSet(true);
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
