// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorboard/src/types.proto

package org.tensorflow.framework;

public final class TypesProtos {
  private TypesProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033tensorboard/src/types.proto\022\013tensorboa" +
      "rd*\302\005\n\010DataType\022\016\n\nDT_INVALID\020\000\022\014\n\010DT_FL" +
      "OAT\020\001\022\r\n\tDT_DOUBLE\020\002\022\014\n\010DT_INT32\020\003\022\014\n\010DT" +
      "_UINT8\020\004\022\014\n\010DT_INT16\020\005\022\013\n\007DT_INT8\020\006\022\r\n\tD" +
      "T_STRING\020\007\022\020\n\014DT_COMPLEX64\020\010\022\014\n\010DT_INT64" +
      "\020\t\022\013\n\007DT_BOOL\020\n\022\014\n\010DT_QINT8\020\013\022\r\n\tDT_QUIN" +
      "T8\020\014\022\r\n\tDT_QINT32\020\r\022\017\n\013DT_BFLOAT16\020\016\022\r\n\t" +
      "DT_QINT16\020\017\022\016\n\nDT_QUINT16\020\020\022\r\n\tDT_UINT16" +
      "\020\021\022\021\n\rDT_COMPLEX128\020\022\022\013\n\007DT_HALF\020\023\022\017\n\013DT" +
      "_RESOURCE\020\024\022\020\n\014DT_FLOAT_REF\020e\022\021\n\rDT_DOUB",
      "LE_REF\020f\022\020\n\014DT_INT32_REF\020g\022\020\n\014DT_UINT8_R" +
      "EF\020h\022\020\n\014DT_INT16_REF\020i\022\017\n\013DT_INT8_REF\020j\022" +
      "\021\n\rDT_STRING_REF\020k\022\024\n\020DT_COMPLEX64_REF\020l" +
      "\022\020\n\014DT_INT64_REF\020m\022\017\n\013DT_BOOL_REF\020n\022\020\n\014D" +
      "T_QINT8_REF\020o\022\021\n\rDT_QUINT8_REF\020p\022\021\n\rDT_Q" +
      "INT32_REF\020q\022\023\n\017DT_BFLOAT16_REF\020r\022\021\n\rDT_Q" +
      "INT16_REF\020s\022\022\n\016DT_QUINT16_REF\020t\022\021\n\rDT_UI" +
      "NT16_REF\020u\022\025\n\021DT_COMPLEX128_REF\020v\022\017\n\013DT_" +
      "HALF_REF\020w\022\023\n\017DT_RESOURCE_REF\020xB,\n\030org.t" +
      "ensorflow.frameworkB\013TypesProtosP\001\370\001\001b\006p",
      "roto3"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
