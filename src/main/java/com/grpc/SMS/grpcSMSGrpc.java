package com.grpc.SMS;

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
    comments = "Source: sendSMS.proto")
public final class grpcSMSGrpc {

  private grpcSMSGrpc() {}

  public static final String SERVICE_NAME = "grpcSMS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.SMS.SendSMS.SmsRequest,
      com.grpc.SMS.SendSMS.SmsResponse> getSendSMSMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendSMS",
      requestType = com.grpc.SMS.SendSMS.SmsRequest.class,
      responseType = com.grpc.SMS.SendSMS.SmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.SMS.SendSMS.SmsRequest,
      com.grpc.SMS.SendSMS.SmsResponse> getSendSMSMethod() {
    io.grpc.MethodDescriptor<com.grpc.SMS.SendSMS.SmsRequest, com.grpc.SMS.SendSMS.SmsResponse> getSendSMSMethod;
    if ((getSendSMSMethod = grpcSMSGrpc.getSendSMSMethod) == null) {
      synchronized (grpcSMSGrpc.class) {
        if ((getSendSMSMethod = grpcSMSGrpc.getSendSMSMethod) == null) {
          grpcSMSGrpc.getSendSMSMethod = getSendSMSMethod = 
              io.grpc.MethodDescriptor.<com.grpc.SMS.SendSMS.SmsRequest, com.grpc.SMS.SendSMS.SmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSMS", "sendSMS"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.SMS.SendSMS.SmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.SMS.SendSMS.SmsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new grpcSMSMethodDescriptorSupplier("sendSMS"))
                  .build();
          }
        }
     }
     return getSendSMSMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static grpcSMSStub newStub(io.grpc.Channel channel) {
    return new grpcSMSStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static grpcSMSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new grpcSMSBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static grpcSMSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new grpcSMSFutureStub(channel);
  }

  /**
   */
  public static abstract class grpcSMSImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendSMS(com.grpc.SMS.SendSMS.SmsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.SMS.SendSMS.SmsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendSMSMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSMSMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.SMS.SendSMS.SmsRequest,
                com.grpc.SMS.SendSMS.SmsResponse>(
                  this, METHODID_SEND_SMS)))
          .build();
    }
  }

  /**
   */
  public static final class grpcSMSStub extends io.grpc.stub.AbstractStub<grpcSMSStub> {
    private grpcSMSStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcSMSStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcSMSStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcSMSStub(channel, callOptions);
    }

    /**
     */
    public void sendSMS(com.grpc.SMS.SendSMS.SmsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.SMS.SendSMS.SmsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendSMSMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class grpcSMSBlockingStub extends io.grpc.stub.AbstractStub<grpcSMSBlockingStub> {
    private grpcSMSBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcSMSBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcSMSBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcSMSBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.SMS.SendSMS.SmsResponse sendSMS(com.grpc.SMS.SendSMS.SmsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendSMSMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class grpcSMSFutureStub extends io.grpc.stub.AbstractStub<grpcSMSFutureStub> {
    private grpcSMSFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcSMSFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcSMSFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcSMSFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.SMS.SendSMS.SmsResponse> sendSMS(
        com.grpc.SMS.SendSMS.SmsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendSMSMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_SMS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final grpcSMSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(grpcSMSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_SMS:
          serviceImpl.sendSMS((com.grpc.SMS.SendSMS.SmsRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.SMS.SendSMS.SmsResponse>) responseObserver);
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

  private static abstract class grpcSMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    grpcSMSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.SMS.SendSMS.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("grpcSMS");
    }
  }

  private static final class grpcSMSFileDescriptorSupplier
      extends grpcSMSBaseDescriptorSupplier {
    grpcSMSFileDescriptorSupplier() {}
  }

  private static final class grpcSMSMethodDescriptorSupplier
      extends grpcSMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    grpcSMSMethodDescriptorSupplier(String methodName) {
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
      synchronized (grpcSMSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new grpcSMSFileDescriptorSupplier())
              .addMethod(getSendSMSMethod())
              .build();
        }
      }
    }
    return result;
  }
}
