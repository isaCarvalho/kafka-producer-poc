package com.isabela.kafkaproducerpoc.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: taskPB.proto

public final class TaskPBOuterClass {
  private TaskPBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TaskPBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TaskPB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>.google.protobuf.Timestamp startDate = 2;</code>
     */
    boolean hasStartDate();
    /**
     * <code>.google.protobuf.Timestamp startDate = 2;</code>
     */
    com.google.protobuf.Timestamp getStartDate();
    /**
     * <code>.google.protobuf.Timestamp startDate = 2;</code>
     */
    com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

    /**
     * <code>.google.protobuf.Timestamp endDate = 3;</code>
     */
    boolean hasEndDate();
    /**
     * <code>.google.protobuf.Timestamp endDate = 3;</code>
     */
    com.google.protobuf.Timestamp getEndDate();
    /**
     * <code>.google.protobuf.Timestamp endDate = 3;</code>
     */
    com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder();

    /**
     * <code>bool done = 4;</code>
     */
    boolean getDone();
  }
  /**
   * Protobuf type {@code TaskPB}
   */
  public  static final class TaskPB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TaskPB)
      TaskPBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TaskPB.newBuilder() to construct.
    private TaskPB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TaskPB() {
      name_ = "";
      done_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TaskPB(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 18: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (startDate_ != null) {
                subBuilder = startDate_.toBuilder();
              }
              startDate_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startDate_);
                startDate_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (endDate_ != null) {
                subBuilder = endDate_.toBuilder();
              }
              endDate_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endDate_);
                endDate_ = subBuilder.buildPartial();
              }

              break;
            }
            case 32: {

              done_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return TaskPBOuterClass.internal_static_TaskPB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TaskPBOuterClass.internal_static_TaskPB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TaskPBOuterClass.TaskPB.class, TaskPBOuterClass.TaskPB.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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

    public static final int STARTDATE_FIELD_NUMBER = 2;
    private com.google.protobuf.Timestamp startDate_;
    /**
     * <code>.google.protobuf.Timestamp startDate = 2;</code>
     */
    public boolean hasStartDate() {
      return startDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp startDate = 2;</code>
     */
    public com.google.protobuf.Timestamp getStartDate() {
      return startDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDate_;
    }
    /**
     * <code>.google.protobuf.Timestamp startDate = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder() {
      return getStartDate();
    }

    public static final int ENDDATE_FIELD_NUMBER = 3;
    private com.google.protobuf.Timestamp endDate_;
    /**
     * <code>.google.protobuf.Timestamp endDate = 3;</code>
     */
    public boolean hasEndDate() {
      return endDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp endDate = 3;</code>
     */
    public com.google.protobuf.Timestamp getEndDate() {
      return endDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
    }
    /**
     * <code>.google.protobuf.Timestamp endDate = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder() {
      return getEndDate();
    }

    public static final int DONE_FIELD_NUMBER = 4;
    private boolean done_;
    /**
     * <code>bool done = 4;</code>
     */
    public boolean getDone() {
      return done_;
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (startDate_ != null) {
        output.writeMessage(2, getStartDate());
      }
      if (endDate_ != null) {
        output.writeMessage(3, getEndDate());
      }
      if (done_ != false) {
        output.writeBool(4, done_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (startDate_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getStartDate());
      }
      if (endDate_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getEndDate());
      }
      if (done_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, done_);
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
      if (!(obj instanceof TaskPBOuterClass.TaskPB)) {
        return super.equals(obj);
      }
      TaskPBOuterClass.TaskPB other = (TaskPBOuterClass.TaskPB) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && (hasStartDate() == other.hasStartDate());
      if (hasStartDate()) {
        result = result && getStartDate()
            .equals(other.getStartDate());
      }
      result = result && (hasEndDate() == other.hasEndDate());
      if (hasEndDate()) {
        result = result && getEndDate()
            .equals(other.getEndDate());
      }
      result = result && (getDone()
          == other.getDone());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      if (hasStartDate()) {
        hash = (37 * hash) + STARTDATE_FIELD_NUMBER;
        hash = (53 * hash) + getStartDate().hashCode();
      }
      if (hasEndDate()) {
        hash = (37 * hash) + ENDDATE_FIELD_NUMBER;
        hash = (53 * hash) + getEndDate().hashCode();
      }
      hash = (37 * hash) + DONE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDone());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TaskPBOuterClass.TaskPB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TaskPBOuterClass.TaskPB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TaskPBOuterClass.TaskPB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TaskPBOuterClass.TaskPB parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(TaskPBOuterClass.TaskPB prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TaskPB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TaskPB)
        TaskPBOuterClass.TaskPBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TaskPBOuterClass.internal_static_TaskPB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TaskPBOuterClass.internal_static_TaskPB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TaskPBOuterClass.TaskPB.class, TaskPBOuterClass.TaskPB.Builder.class);
      }

      // Construct using TaskPBOuterClass.TaskPB.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        if (startDateBuilder_ == null) {
          startDate_ = null;
        } else {
          startDate_ = null;
          startDateBuilder_ = null;
        }
        if (endDateBuilder_ == null) {
          endDate_ = null;
        } else {
          endDate_ = null;
          endDateBuilder_ = null;
        }
        done_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TaskPBOuterClass.internal_static_TaskPB_descriptor;
      }

      @java.lang.Override
      public TaskPBOuterClass.TaskPB getDefaultInstanceForType() {
        return TaskPBOuterClass.TaskPB.getDefaultInstance();
      }

      @java.lang.Override
      public TaskPBOuterClass.TaskPB build() {
        TaskPBOuterClass.TaskPB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public TaskPBOuterClass.TaskPB buildPartial() {
        TaskPBOuterClass.TaskPB result = new TaskPBOuterClass.TaskPB(this);
        result.name_ = name_;
        if (startDateBuilder_ == null) {
          result.startDate_ = startDate_;
        } else {
          result.startDate_ = startDateBuilder_.build();
        }
        if (endDateBuilder_ == null) {
          result.endDate_ = endDate_;
        } else {
          result.endDate_ = endDateBuilder_.build();
        }
        result.done_ = done_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TaskPBOuterClass.TaskPB) {
          return mergeFrom((TaskPBOuterClass.TaskPB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TaskPBOuterClass.TaskPB other) {
        if (other == TaskPBOuterClass.TaskPB.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.hasStartDate()) {
          mergeStartDate(other.getStartDate());
        }
        if (other.hasEndDate()) {
          mergeEndDate(other.getEndDate());
        }
        if (other.getDone() != false) {
          setDone(other.getDone());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        TaskPBOuterClass.TaskPB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TaskPBOuterClass.TaskPB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
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
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.Timestamp startDate_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startDateBuilder_;
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public boolean hasStartDate() {
        return startDateBuilder_ != null || startDate_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public com.google.protobuf.Timestamp getStartDate() {
        if (startDateBuilder_ == null) {
          return startDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDate_;
        } else {
          return startDateBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public Builder setStartDate(com.google.protobuf.Timestamp value) {
        if (startDateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          startDate_ = value;
          onChanged();
        } else {
          startDateBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public Builder setStartDate(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (startDateBuilder_ == null) {
          startDate_ = builderForValue.build();
          onChanged();
        } else {
          startDateBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public Builder mergeStartDate(com.google.protobuf.Timestamp value) {
        if (startDateBuilder_ == null) {
          if (startDate_ != null) {
            startDate_ =
              com.google.protobuf.Timestamp.newBuilder(startDate_).mergeFrom(value).buildPartial();
          } else {
            startDate_ = value;
          }
          onChanged();
        } else {
          startDateBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public Builder clearStartDate() {
        if (startDateBuilder_ == null) {
          startDate_ = null;
          onChanged();
        } else {
          startDate_ = null;
          startDateBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public com.google.protobuf.Timestamp.Builder getStartDateBuilder() {
        
        onChanged();
        return getStartDateFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder() {
        if (startDateBuilder_ != null) {
          return startDateBuilder_.getMessageOrBuilder();
        } else {
          return startDate_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : startDate_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getStartDateFieldBuilder() {
        if (startDateBuilder_ == null) {
          startDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getStartDate(),
                  getParentForChildren(),
                  isClean());
          startDate_ = null;
        }
        return startDateBuilder_;
      }

      private com.google.protobuf.Timestamp endDate_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endDateBuilder_;
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public boolean hasEndDate() {
        return endDateBuilder_ != null || endDate_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public com.google.protobuf.Timestamp getEndDate() {
        if (endDateBuilder_ == null) {
          return endDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
        } else {
          return endDateBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public Builder setEndDate(com.google.protobuf.Timestamp value) {
        if (endDateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          endDate_ = value;
          onChanged();
        } else {
          endDateBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public Builder setEndDate(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (endDateBuilder_ == null) {
          endDate_ = builderForValue.build();
          onChanged();
        } else {
          endDateBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public Builder mergeEndDate(com.google.protobuf.Timestamp value) {
        if (endDateBuilder_ == null) {
          if (endDate_ != null) {
            endDate_ =
              com.google.protobuf.Timestamp.newBuilder(endDate_).mergeFrom(value).buildPartial();
          } else {
            endDate_ = value;
          }
          onChanged();
        } else {
          endDateBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public Builder clearEndDate() {
        if (endDateBuilder_ == null) {
          endDate_ = null;
          onChanged();
        } else {
          endDate_ = null;
          endDateBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public com.google.protobuf.Timestamp.Builder getEndDateBuilder() {
        
        onChanged();
        return getEndDateFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder() {
        if (endDateBuilder_ != null) {
          return endDateBuilder_.getMessageOrBuilder();
        } else {
          return endDate_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getEndDateFieldBuilder() {
        if (endDateBuilder_ == null) {
          endDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getEndDate(),
                  getParentForChildren(),
                  isClean());
          endDate_ = null;
        }
        return endDateBuilder_;
      }

      private boolean done_ ;
      /**
       * <code>bool done = 4;</code>
       */
      public boolean getDone() {
        return done_;
      }
      /**
       * <code>bool done = 4;</code>
       */
      public Builder setDone(boolean value) {
        
        done_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool done = 4;</code>
       */
      public Builder clearDone() {
        
        done_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TaskPB)
    }

    // @@protoc_insertion_point(class_scope:TaskPB)
    private static final TaskPBOuterClass.TaskPB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TaskPBOuterClass.TaskPB();
    }

    public static TaskPBOuterClass.TaskPB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TaskPB>
        PARSER = new com.google.protobuf.AbstractParser<TaskPB>() {
      @java.lang.Override
      public TaskPB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskPB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TaskPB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TaskPB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public TaskPBOuterClass.TaskPB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskPB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskPB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014taskPB.proto\032\037google/protobuf/timestam" +
      "p.proto\"\200\001\n\006TaskPB\022\014\n\004name\030\001 \001(\t\022-\n\tstar" +
      "tDate\030\002 \001(\0132\032.google.protobuf.Timestamp\022" +
      "+\n\007endDate\030\003 \001(\0132\032.google.protobuf.Times" +
      "tamp\022\014\n\004done\030\004 \001(\010b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_TaskPB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TaskPB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskPB_descriptor,
        new java.lang.String[] { "Name", "StartDate", "EndDate", "Done", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
