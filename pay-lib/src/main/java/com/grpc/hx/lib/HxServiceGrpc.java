package com.grpc.hx.lib;

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
 * <pre>
 *华夏分账service定义
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: hxpay.proto")
public final class HxServiceGrpc {

  private HxServiceGrpc() {}

  public static final String SERVICE_NAME = "HxService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.hx.lib.Hxpay.CreateSonAccountRequest,
      com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse> getCreateSonAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSonAccount",
      requestType = com.grpc.hx.lib.Hxpay.CreateSonAccountRequest.class,
      responseType = com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.hx.lib.Hxpay.CreateSonAccountRequest,
      com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse> getCreateSonAccountMethod() {
    io.grpc.MethodDescriptor<com.grpc.hx.lib.Hxpay.CreateSonAccountRequest, com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse> getCreateSonAccountMethod;
    if ((getCreateSonAccountMethod = HxServiceGrpc.getCreateSonAccountMethod) == null) {
      synchronized (HxServiceGrpc.class) {
        if ((getCreateSonAccountMethod = HxServiceGrpc.getCreateSonAccountMethod) == null) {
          HxServiceGrpc.getCreateSonAccountMethod = getCreateSonAccountMethod = 
              io.grpc.MethodDescriptor.<com.grpc.hx.lib.Hxpay.CreateSonAccountRequest, com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HxService", "CreateSonAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.hx.lib.Hxpay.CreateSonAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HxServiceMethodDescriptorSupplier("CreateSonAccount"))
                  .build();
          }
        }
     }
     return getCreateSonAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.hx.lib.Hxpay.PayAccountRequest,
      com.grpc.hx.lib.Hxpay.PayAccountCpmResponse> getPayAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PayAccount",
      requestType = com.grpc.hx.lib.Hxpay.PayAccountRequest.class,
      responseType = com.grpc.hx.lib.Hxpay.PayAccountCpmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.hx.lib.Hxpay.PayAccountRequest,
      com.grpc.hx.lib.Hxpay.PayAccountCpmResponse> getPayAccountMethod() {
    io.grpc.MethodDescriptor<com.grpc.hx.lib.Hxpay.PayAccountRequest, com.grpc.hx.lib.Hxpay.PayAccountCpmResponse> getPayAccountMethod;
    if ((getPayAccountMethod = HxServiceGrpc.getPayAccountMethod) == null) {
      synchronized (HxServiceGrpc.class) {
        if ((getPayAccountMethod = HxServiceGrpc.getPayAccountMethod) == null) {
          HxServiceGrpc.getPayAccountMethod = getPayAccountMethod = 
              io.grpc.MethodDescriptor.<com.grpc.hx.lib.Hxpay.PayAccountRequest, com.grpc.hx.lib.Hxpay.PayAccountCpmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HxService", "PayAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.hx.lib.Hxpay.PayAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.hx.lib.Hxpay.PayAccountCpmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HxServiceMethodDescriptorSupplier("PayAccount"))
                  .build();
          }
        }
     }
     return getPayAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HxServiceStub newStub(io.grpc.Channel channel) {
    return new HxServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HxServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HxServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HxServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HxServiceFutureStub(channel);
  }

  /**
   * <pre>
   *华夏分账service定义
   * </pre>
   */
  public static abstract class HxServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSonAccount(com.grpc.hx.lib.Hxpay.CreateSonAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSonAccountMethod(), responseObserver);
    }

    /**
     */
    public void payAccount(com.grpc.hx.lib.Hxpay.PayAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.hx.lib.Hxpay.PayAccountCpmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPayAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSonAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.hx.lib.Hxpay.CreateSonAccountRequest,
                com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse>(
                  this, METHODID_CREATE_SON_ACCOUNT)))
          .addMethod(
            getPayAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.hx.lib.Hxpay.PayAccountRequest,
                com.grpc.hx.lib.Hxpay.PayAccountCpmResponse>(
                  this, METHODID_PAY_ACCOUNT)))
          .build();
    }
  }

  /**
   * <pre>
   *华夏分账service定义
   * </pre>
   */
  public static final class HxServiceStub extends io.grpc.stub.AbstractStub<HxServiceStub> {
    private HxServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HxServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HxServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HxServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSonAccount(com.grpc.hx.lib.Hxpay.CreateSonAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSonAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void payAccount(com.grpc.hx.lib.Hxpay.PayAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.hx.lib.Hxpay.PayAccountCpmResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *华夏分账service定义
   * </pre>
   */
  public static final class HxServiceBlockingStub extends io.grpc.stub.AbstractStub<HxServiceBlockingStub> {
    private HxServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HxServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HxServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HxServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse createSonAccount(com.grpc.hx.lib.Hxpay.CreateSonAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSonAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.hx.lib.Hxpay.PayAccountCpmResponse payAccount(com.grpc.hx.lib.Hxpay.PayAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getPayAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *华夏分账service定义
   * </pre>
   */
  public static final class HxServiceFutureStub extends io.grpc.stub.AbstractStub<HxServiceFutureStub> {
    private HxServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HxServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HxServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HxServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse> createSonAccount(
        com.grpc.hx.lib.Hxpay.CreateSonAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSonAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.hx.lib.Hxpay.PayAccountCpmResponse> payAccount(
        com.grpc.hx.lib.Hxpay.PayAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPayAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SON_ACCOUNT = 0;
  private static final int METHODID_PAY_ACCOUNT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HxServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HxServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SON_ACCOUNT:
          serviceImpl.createSonAccount((com.grpc.hx.lib.Hxpay.CreateSonAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.hx.lib.Hxpay.CreateSonAccountCpmB2BResponse>) responseObserver);
          break;
        case METHODID_PAY_ACCOUNT:
          serviceImpl.payAccount((com.grpc.hx.lib.Hxpay.PayAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.hx.lib.Hxpay.PayAccountCpmResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HxServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.hx.lib.Hxpay.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HxService");
    }
  }

  private static final class HxServiceFileDescriptorSupplier
      extends HxServiceBaseDescriptorSupplier {
    HxServiceFileDescriptorSupplier() {}
  }

  private static final class HxServiceMethodDescriptorSupplier
      extends HxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HxServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HxServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HxServiceFileDescriptorSupplier())
              .addMethod(getCreateSonAccountMethod())
              .addMethod(getPayAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
