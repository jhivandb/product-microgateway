// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/subscription/application.proto

package org.wso2.gateway.discovery.subscription;

public final class ApplicationProto {
  private ApplicationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_Application_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_Application_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_Application_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_Application_AttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-wso2/discovery/subscription/applicatio" +
      "n.proto\022\033wso2.discovery.subscription\"\306\002\n" +
      "\013Application\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\014" +
      "\n\004name\030\003 \001(\t\022\r\n\005subId\030\004 \001(\005\022\017\n\007subName\030\005" +
      " \001(\t\022\016\n\006policy\030\006 \001(\t\022\021\n\ttokenType\030\007 \001(\t\022" +
      "\020\n\010groupIds\030\010 \003(\t\022L\n\nattributes\030\t \003(\01328." +
      "wso2.discovery.subscription.Application." +
      "AttributesEntry\022\020\n\010tenantId\030\n \001(\005\022\024\n\014ten" +
      "antDomain\030\013 \001(\t\022\021\n\ttimestamp\030\014 \001(\003\0321\n\017At" +
      "tributesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\001B\216\001\n\'org.wso2.gateway.discovery.sub" +
      "scriptionB\020ApplicationProtoP\001ZOgithub.co" +
      "m/envoyproxy/go-control-plane/wso2/disco" +
      "very/subscription;subscriptionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_subscription_Application_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_subscription_Application_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_Application_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "SubId", "SubName", "Policy", "TokenType", "GroupIds", "Attributes", "TenantId", "TenantDomain", "Timestamp", });
    internal_static_wso2_discovery_subscription_Application_AttributesEntry_descriptor =
      internal_static_wso2_discovery_subscription_Application_descriptor.getNestedTypes().get(0);
    internal_static_wso2_discovery_subscription_Application_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_Application_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
