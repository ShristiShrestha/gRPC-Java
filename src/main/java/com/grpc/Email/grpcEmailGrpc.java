package com.grpc.Email;

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
    comments = "Source: sendEmail.proto")
public final class grpcEmailGrpc {

  private grpcEmailGrpc() {}

  public static final String SERVICE_NAME = "grpcEmail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.Email.SendEmail.EmailRequest,
      com.grpc.Email.SendEmail.EmailResponse> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEmail",
      requestType = com.grpc.Email.SendEmail.EmailRequest.class,
      responseType = com.grpc.Email.SendEmail.EmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.Email.SendEmail.EmailRequest,
      com.grpc.Email.SendEmail.EmailResponse> getSendEmailMethod() {
    io.grpc.MethodDescriptor<com.grpc.Email.SendEmail.EmailRequest, com.grpc.Email.SendEmail.EmailResponse> getSendEmailMethod;
    if ((getSendEmailMethod = grpcEmailGrpc.getSendEmailMethod) == null) {
      synchronized (grpcEmailGrpc.class) {
        if ((getSendEmailMethod = grpcEmailGrpc.getSendEmailMethod) == null) {
          grpcEmailGrpc.getSendEmailMethod = getSendEmailMethod = 
              io.grpc.MethodDescriptor.<com.grpc.Email.SendEmail.EmailRequest, com.grpc.Email.SendEmail.EmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcEmail", "sendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.Email.SendEmail.EmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.Email.SendEmail.EmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new grpcEmailMethodDescriptorSupplier("sendEmail"))
                  .build();
          }
        }
     }
     return getSendEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static grpcEmailStub newStub(io.grpc.Channel channel) {
    return new grpcEmailStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static grpcEmailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new grpcEmailBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static grpcEmailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new grpcEmailFutureStub(channel);
  }

  /**
   */
  public static abstract class grpcEmailImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendEmail(com.grpc.Email.SendEmail.EmailRequest request,
        io.grpc.stub.StreamObserver<com.grpc.Email.SendEmail.EmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.Email.SendEmail.EmailRequest,
                com.grpc.Email.SendEmail.EmailResponse>(
                  this, METHODID_SEND_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class grpcEmailStub extends io.grpc.stub.AbstractStub<grpcEmailStub> {
    private grpcEmailStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcEmailStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcEmailStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcEmailStub(channel, callOptions);
    }

    /**
     */
    public void sendEmail(com.grpc.Email.SendEmail.EmailRequest request,
        io.grpc.stub.StreamObserver<com.grpc.Email.SendEmail.EmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class grpcEmailBlockingStub extends io.grpc.stub.AbstractStub<grpcEmailBlockingStub> {
    private grpcEmailBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcEmailBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcEmailBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcEmailBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.Email.SendEmail.EmailResponse sendEmail(com.grpc.Email.SendEmail.EmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class grpcEmailFutureStub extends io.grpc.stub.AbstractStub<grpcEmailFutureStub> {
    private grpcEmailFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcEmailFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcEmailFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcEmailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.Email.SendEmail.EmailResponse> sendEmail(
        com.grpc.Email.SendEmail.EmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final grpcEmailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(grpcEmailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((com.grpc.Email.SendEmail.EmailRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.Email.SendEmail.EmailResponse>) responseObserver);
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

  private static abstract class grpcEmailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    grpcEmailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.Email.SendEmail.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("grpcEmail");
    }
  }

  private static final class grpcEmailFileDescriptorSupplier
      extends grpcEmailBaseDescriptorSupplier {
    grpcEmailFileDescriptorSupplier() {}
  }

  private static final class grpcEmailMethodDescriptorSupplier
      extends grpcEmailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    grpcEmailMethodDescriptorSupplier(String methodName) {
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
      synchronized (grpcEmailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new grpcEmailFileDescriptorSupplier())
              .addMethod(getSendEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
