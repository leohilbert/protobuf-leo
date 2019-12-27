// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.example.tutorial;

/**
 * Protobuf type {@code tutorial.Person}
 */
public  final class Person extends
    PersonCustom implements
    // @@protoc_insertion_point(message_implements:tutorial.Person)
    PersonInterface<Person> {
private static final long serialVersionUID = 0L;
  public Person() {
    id_ = null;
    name_ = "";
    email_ = "";
    phones_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Person();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public Person(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    updateFrom(input, extensionRegistry);
  }
  public void updateFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            id_ = de.leohilbert.protoconverter.ProtoConverter_JAVA_UTIL_UUID.fromProto(input.readString());
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            age_ = (input.readInt32());
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              phones_ = new java.util.ArrayList<com.example.tutorial.Person.PhoneNumber>();
              mutable_bitField0_ |= 0x00000001;
            }
            phones_.add(
                input.readMessage(com.example.tutorial.Person.PhoneNumber.parser(), extensionRegistry));
            break;
          }
          case 50: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (lastUpdated_ != null) {
              subBuilder = lastUpdated_.toBuilder();
            }
            lastUpdated_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastUpdated_);
              lastUpdated_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        phones_ = java.util.Collections.unmodifiableList(phones_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.tutorial.AddressBookProtos.internal_static_tutorial_Person_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.tutorial.AddressBookProtos.internal_static_tutorial_Person_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.tutorial.Person.class, com.example.tutorial.Person.Builder.class);
  }

  public interface PhoneNumberInterface<SELF> extends
      // @@protoc_insertion_point(interface_extends:tutorial.Person.PhoneNumber)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string number = 1[json_name = "number"];</code>
     * @return The number.
     */
    java.lang.String getNumber();
    /**
     * <code>string number = 1[json_name = "number"];</code>
     * @return The bytes for number.
     */
    com.google.protobuf.ByteString
        getNumberBytes();
    /**
     * <code>string number = 1[json_name = "number"];</code>
     * @param value The number to set.
     */
    SELF setNumber(java.lang.String value);

    /**
     * <code>.tutorial.PhoneType type = 2[json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.tutorial.PhoneType type = 2[json_name = "type"];</code>
     * @return The type.
     */
    com.example.tutorial.PhoneType getType();
    /**
     * <code>.tutorial.PhoneType type = 2[json_name = "type"];</code>
     * @param value The type to set.
     */
    SELF setType(com.example.tutorial.PhoneType value);
  }
  /**
   * Protobuf type {@code tutorial.Person.PhoneNumber}
   */
  public  static final class PhoneNumber extends
      PhoneNumberCustom implements
      // @@protoc_insertion_point(message_implements:tutorial.Person.PhoneNumber)
      PhoneNumberInterface<PhoneNumber> {
  private static final long serialVersionUID = 0L;
    public PhoneNumber() {
      number_ = "";
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PhoneNumber();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public PhoneNumber(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      updateFrom(input, extensionRegistry);
    }
    public void updateFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              number_ = s;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.tutorial.AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.tutorial.AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.tutorial.Person.PhoneNumber.class, com.example.tutorial.Person.PhoneNumber.Builder.class);
    }

    public static final int NUMBER_FIELD_NUMBER = 1;
    private volatile java.lang.Object number_;
    /**
     * <code>string number = 1[json_name = "number"];</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      }
    }
    /**
     * <code>string number = 1[json_name = "number"];</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 1[json_name = "number"];</code>
     * @param value The number to set.
     */
    public PhoneNumber setNumber(
        java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      if(!value.equals(number_)) {
        number_ = value;
        onChanged();
      }
      return this;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>.tutorial.PhoneType type = 2[json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.tutorial.PhoneType type = 2[json_name = "type"];</code>
     * @return The type.
     */
    public com.example.tutorial.PhoneType getType() {
      @SuppressWarnings("deprecation")
      com.example.tutorial.PhoneType result = com.example.tutorial.PhoneType.valueOf(type_);
      return result == null ? com.example.tutorial.PhoneType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tutorial.PhoneType type = 2[json_name = "type"];</code>
     * @param value The type to set.
     */
    public PhoneNumber setType(com.example.tutorial.PhoneType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      int valueNumber = value.getNumber();
      if(type_ != valueNumber) {    
        type_ = valueNumber;
        onChanged();
      }
      return this;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
      }
      if (type_ != com.example.tutorial.PhoneType.MOBILE.getNumber()) {
        output.writeEnum(2, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
      }
      if (type_ != com.example.tutorial.PhoneType.MOBILE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.example.tutorial.Person.PhoneNumber)) {
        return super.equals(obj);
      }
      com.example.tutorial.Person.PhoneNumber other = (com.example.tutorial.Person.PhoneNumber) obj;

      if (!getNumber()
          .equals(other.getNumber())) return false;
      if (type_ != other.type_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getNumber().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.tutorial.Person.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.tutorial.Person.PhoneNumber parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.tutorial.Person.PhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }


    // @@protoc_insertion_point(class_scope:tutorial.Person.PhoneNumber)
    private static final com.example.tutorial.Person.PhoneNumber DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.tutorial.Person.PhoneNumber();
    }

    public static com.example.tutorial.Person.PhoneNumber getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PhoneNumber>
        PARSER = new com.google.protobuf.AbstractParser<PhoneNumber>() {
      @java.lang.Override
      public PhoneNumber parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PhoneNumber(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PhoneNumber> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PhoneNumber> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.tutorial.Person.PhoneNumber getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int ID_FIELD_NUMBER = 1;
  private java.util.UUID id_;
  /**
   * <code>string id = 1[json_name = "id", (.javaleo.proto.javatype) = "java.util.UUID"];</code>
   * @return The id.
   */
  public java.util.UUID getId() {
    return id_;
  }
  /**
   * <code>string id = 1[json_name = "id", (.javaleo.proto.javatype) = "java.util.UUID"];</code>
   * @param value The id to set.
   */
  public Person setId(java.util.UUID value) {
    if (value == null) {
    throw new NullPointerException();
  }
  if(id_ != value) {    
      id_ = value;
      onChanged();
    }
    return this;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2[json_name = "name"];</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2[json_name = "name"];</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }
  /**
   * <code>string name = 2[json_name = "name"];</code>
   * @param value The name to set.
   */
  public Person setName(
      java.lang.String value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    if(!value.equals(name_)) {
      name_ = value;
      onChanged();
    }
    return this;
  }

  public static final int AGE_FIELD_NUMBER = 3;
  private int age_;
  /**
   * <code>int32 age = 3[json_name = "age"];</code>
   * @return The age.
   */
  public int getAge() {
    return age_;
  }
  /**
   * <code>int32 age = 3[json_name = "age"];</code>
   * @param value The age to set.
   */
  public Person setAge(int value) {
    if(age_ != value) {    
      age_ = value;
      onChanged();
    }
    return this;
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 4[json_name = "email"];</code>
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 4[json_name = "email"];</code>
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }
  /**
   * <code>string email = 4[json_name = "email"];</code>
   * @param value The email to set.
   */
  public Person setEmail(
      java.lang.String value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    if(!value.equals(email_)) {
      email_ = value;
      onChanged();
    }
    return this;
  }

  public static final int PHONES_FIELD_NUMBER = 5;
  private java.util.List<com.example.tutorial.Person.PhoneNumber> phones_;
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 5[json_name = "phones"];</code>
   */
  public java.util.List<com.example.tutorial.Person.PhoneNumber> getPhonesList() {
    return phones_;
  }
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 5[json_name = "phones"];</code>
   */
  public java.util.List<? extends com.example.tutorial.Person.PhoneNumberInterface> 
      getPhonesInterfaceList() {
    return phones_;
  }
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 5[json_name = "phones"];</code>
   */
  public int getPhonesCount() {
    return phones_.size();
  }
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 5[json_name = "phones"];</code>
   */
  public com.example.tutorial.Person.PhoneNumber getPhones(int index) {
    return phones_.get(index);
  }

  public static final int LAST_UPDATED_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp lastUpdated_;
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6[json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  public boolean hasLastUpdated() {
    return lastUpdated_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6[json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  public com.google.protobuf.Timestamp getLastUpdated() {
    return lastUpdated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
  }
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6[json_name = "lastUpdated"];</code>
   * @param value The lastUpdated to set.
   */
  public Person setLastUpdated(com.google.protobuf.Timestamp value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if(!value.equals(lastUpdated_)) {
      lastUpdated_ = value;
      onChanged();
    }
    return this;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != null) {
      output.writeString(1, de.leohilbert.protoconverter.ProtoConverter_JAVA_UTIL_UUID.toProto(id_));
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (age_ != 0) {
      output.writeInt32(3, (age_));
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
    }
    for (int i = 0; i < phones_.size(); i++) {
      output.writeMessage(5, phones_.get(i));
    }
    if (lastUpdated_ != null) {
      output.writeMessage(6, getLastUpdated());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, de.leohilbert.protoconverter.ProtoConverter_JAVA_UTIL_UUID.toProto(id_));
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, (age_));
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
    }
    for (int i = 0; i < phones_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, phones_.get(i));
    }
    if (lastUpdated_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getLastUpdated());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.tutorial.Person)) {
      return super.equals(obj);
    }
    com.example.tutorial.Person other = (com.example.tutorial.Person) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getAge()
        != other.getAge()) return false;
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getPhonesList()
        .equals(other.getPhonesList())) return false;
    if (hasLastUpdated() != other.hasLastUpdated()) return false;
    if (hasLastUpdated()) {
      if (!getLastUpdated()
          .equals(other.getLastUpdated())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (getPhonesCount() > 0) {
      hash = (37 * hash) + PHONES_FIELD_NUMBER;
      hash = (53 * hash) + getPhonesList().hashCode();
    }
    if (hasLastUpdated()) {
      hash = (37 * hash) + LAST_UPDATED_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdated().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.tutorial.Person parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.Person parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.Person parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.Person parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.Person parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.Person parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.Person parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.Person parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.Person parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.tutorial.Person parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.Person parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.Person parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }


  // @@protoc_insertion_point(class_scope:tutorial.Person)
  private static final com.example.tutorial.Person DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.tutorial.Person();
  }

  public static com.example.tutorial.Person getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Person>
      PARSER = new com.google.protobuf.AbstractParser<Person>() {
    @java.lang.Override
    public Person parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Person(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Person> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Person> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.tutorial.Person getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

