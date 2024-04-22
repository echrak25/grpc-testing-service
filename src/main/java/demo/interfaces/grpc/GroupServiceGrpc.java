package demo.interfaces.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: group.proto")
public final class GroupServiceGrpc {

  public GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "GroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group,
      demo.interfaces.grpc.GroupOuterClass.Group> getGetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGroup",
      requestType = demo.interfaces.grpc.GroupOuterClass.Group.class,
      responseType = demo.interfaces.grpc.GroupOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group,
      demo.interfaces.grpc.GroupOuterClass.Group> getGetGroupMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group, demo.interfaces.grpc.GroupOuterClass.Group> getGetGroupMethod;
    if ((getGetGroupMethod = GroupServiceGrpc.getGetGroupMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getGetGroupMethod = GroupServiceGrpc.getGetGroupMethod) == null) {
          GroupServiceGrpc.getGetGroupMethod = getGetGroupMethod = 
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.GroupOuterClass.Group, demo.interfaces.grpc.GroupOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GroupService", "getGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.Group.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("getGroup"))
                  .build();
          }
        }
     }
     return getGetGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Empty,
      demo.interfaces.grpc.GroupOuterClass.Group> getListGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listGroups",
      requestType = demo.interfaces.grpc.GroupOuterClass.Empty.class,
      responseType = demo.interfaces.grpc.GroupOuterClass.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Empty,
      demo.interfaces.grpc.GroupOuterClass.Group> getListGroupsMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Empty, demo.interfaces.grpc.GroupOuterClass.Group> getListGroupsMethod;
    if ((getListGroupsMethod = GroupServiceGrpc.getListGroupsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getListGroupsMethod = GroupServiceGrpc.getListGroupsMethod) == null) {
          GroupServiceGrpc.getListGroupsMethod = getListGroupsMethod = 
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.GroupOuterClass.Empty, demo.interfaces.grpc.GroupOuterClass.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GroupService", "listGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.Group.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("listGroups"))
                  .build();
          }
        }
     }
     return getListGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group,
      demo.interfaces.grpc.GroupOuterClass.APIResponse> getBatchCreateGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batchCreateGroups",
      requestType = demo.interfaces.grpc.GroupOuterClass.Group.class,
      responseType = demo.interfaces.grpc.GroupOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group,
      demo.interfaces.grpc.GroupOuterClass.APIResponse> getBatchCreateGroupsMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group, demo.interfaces.grpc.GroupOuterClass.APIResponse> getBatchCreateGroupsMethod;
    if ((getBatchCreateGroupsMethod = GroupServiceGrpc.getBatchCreateGroupsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getBatchCreateGroupsMethod = GroupServiceGrpc.getBatchCreateGroupsMethod) == null) {
          GroupServiceGrpc.getBatchCreateGroupsMethod = getBatchCreateGroupsMethod = 
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.GroupOuterClass.Group, demo.interfaces.grpc.GroupOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GroupService", "batchCreateGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("batchCreateGroups"))
                  .build();
          }
        }
     }
     return getBatchCreateGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group,
      demo.interfaces.grpc.GroupOuterClass.APIResponse> getBidiUpdateGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidiUpdateGroups",
      requestType = demo.interfaces.grpc.GroupOuterClass.Group.class,
      responseType = demo.interfaces.grpc.GroupOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group,
      demo.interfaces.grpc.GroupOuterClass.APIResponse> getBidiUpdateGroupsMethod() {
    io.grpc.MethodDescriptor<demo.interfaces.grpc.GroupOuterClass.Group, demo.interfaces.grpc.GroupOuterClass.APIResponse> getBidiUpdateGroupsMethod;
    if ((getBidiUpdateGroupsMethod = GroupServiceGrpc.getBidiUpdateGroupsMethod) == null) {
      synchronized (GroupServiceGrpc.class) {
        if ((getBidiUpdateGroupsMethod = GroupServiceGrpc.getBidiUpdateGroupsMethod) == null) {
          GroupServiceGrpc.getBidiUpdateGroupsMethod = getBidiUpdateGroupsMethod = 
              io.grpc.MethodDescriptor.<demo.interfaces.grpc.GroupOuterClass.Group, demo.interfaces.grpc.GroupOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GroupService", "bidiUpdateGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  demo.interfaces.grpc.GroupOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GroupServiceMethodDescriptorSupplier("bidiUpdateGroups"))
                  .build();
          }
        }
     }
     return getBidiUpdateGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    return new GroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void getGroup(demo.interfaces.grpc.GroupOuterClass.Group request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC
     * </pre>
     */
    public void listGroups(demo.interfaces.grpc.GroupOuterClass.Empty request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> responseObserver) {
      asyncUnimplementedUnaryCall(getListGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> batchCreateGroups(
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.APIResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBatchCreateGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> bidiUpdateGroups(
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.APIResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidiUpdateGroupsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                demo.interfaces.grpc.GroupOuterClass.Group,
                demo.interfaces.grpc.GroupOuterClass.Group>(
                  this, METHODID_GET_GROUP)))
          .addMethod(
            getListGroupsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                demo.interfaces.grpc.GroupOuterClass.Empty,
                demo.interfaces.grpc.GroupOuterClass.Group>(
                  this, METHODID_LIST_GROUPS)))
          .addMethod(
            getBatchCreateGroupsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                demo.interfaces.grpc.GroupOuterClass.Group,
                demo.interfaces.grpc.GroupOuterClass.APIResponse>(
                  this, METHODID_BATCH_CREATE_GROUPS)))
          .addMethod(
            getBidiUpdateGroupsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                demo.interfaces.grpc.GroupOuterClass.Group,
                demo.interfaces.grpc.GroupOuterClass.APIResponse>(
                  this, METHODID_BIDI_UPDATE_GROUPS)))
          .build();
    }
  }

  /**
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractStub<GroupServiceStub> {
    private GroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void getGroup(demo.interfaces.grpc.GroupOuterClass.Group request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC
     * </pre>
     */
    public void listGroups(demo.interfaces.grpc.GroupOuterClass.Empty request,
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> batchCreateGroups(
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.APIResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBatchCreateGroupsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group> bidiUpdateGroups(
        io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.APIResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidiUpdateGroupsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public demo.interfaces.grpc.GroupOuterClass.Group getGroup(demo.interfaces.grpc.GroupOuterClass.Group request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server streaming RPC
     * </pre>
     */
    public java.util.Iterator<demo.interfaces.grpc.GroupOuterClass.Group> listGroups(
        demo.interfaces.grpc.GroupOuterClass.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.interfaces.grpc.GroupOuterClass.Group> getGroup(
        demo.interfaces.grpc.GroupOuterClass.Group request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GROUP = 0;
  private static final int METHODID_LIST_GROUPS = 1;
  private static final int METHODID_BATCH_CREATE_GROUPS = 2;
  private static final int METHODID_BIDI_UPDATE_GROUPS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GROUP:
          serviceImpl.getGroup((demo.interfaces.grpc.GroupOuterClass.Group) request,
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group>) responseObserver);
          break;
        case METHODID_LIST_GROUPS:
          serviceImpl.listGroups((demo.interfaces.grpc.GroupOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.Group>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATCH_CREATE_GROUPS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchCreateGroups(
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.APIResponse>) responseObserver);
        case METHODID_BIDI_UPDATE_GROUPS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiUpdateGroups(
              (io.grpc.stub.StreamObserver<demo.interfaces.grpc.GroupOuterClass.APIResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return demo.interfaces.grpc.GroupOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GroupService");
    }
  }

  private static final class GroupServiceFileDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier {
    GroupServiceFileDescriptorSupplier() {}
  }

  private static final class GroupServiceMethodDescriptorSupplier
      extends GroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GroupServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupServiceFileDescriptorSupplier())
              .addMethod(getGetGroupMethod())
              .addMethod(getListGroupsMethod())
              .addMethod(getBatchCreateGroupsMethod())
              .addMethod(getBidiUpdateGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
