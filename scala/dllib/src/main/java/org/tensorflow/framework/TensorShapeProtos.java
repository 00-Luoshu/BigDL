// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorboard/src/tensor_shape.proto

package org.tensorflow.framework;

public final class TensorShapeProtos {
  private TensorShapeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorboard_TensorShapeProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorboard_TensorShapeProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorboard_TensorShapeProto_Dim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorboard_TensorShapeProto_Dim_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"tensorboard/src/tensor_shape.proto\022\013te" +
      "nsorboard\"{\n\020TensorShapeProto\022.\n\003dim\030\002 \003" +
      "(\0132!.tensorboard.TensorShapeProto.Dim\022\024\n" +
      "\014unknown_rank\030\003 \001(\010\032!\n\003Dim\022\014\n\004size\030\001 \001(\003" +
      "\022\014\n\004name\030\002 \001(\tB2\n\030org.org.org.tensorflow.framewo" +
      "rkB\021TensorShapeProtosP\001\370\001\001b\006proto3"
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
    internal_static_tensorboard_TensorShapeProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorboard_TensorShapeProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorboard_TensorShapeProto_descriptor,
        new java.lang.String[] { "Dim", "UnknownRank", });
    internal_static_tensorboard_TensorShapeProto_Dim_descriptor =
      internal_static_tensorboard_TensorShapeProto_descriptor.getNestedTypes().get(0);
    internal_static_tensorboard_TensorShapeProto_Dim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorboard_TensorShapeProto_Dim_descriptor,
        new java.lang.String[] { "Size", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
