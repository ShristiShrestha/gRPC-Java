package com.grpc.iplocation;

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
    comments = "Source: ipToLocation.proto")
public final class ipToLocationGrpc {

  private ipToLocationGrpc() {}

  public static final String SERVICE_NAME = "ipToLocation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.iplocation.IpToLocation.IpLocationRequest,
      com.grpc.iplocation.IpToLocation.IpLocationResponse> getGetMyLocationFromIpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMyLocationFromIp",
      requestType = com.grpc.iplocation.IpToLocation.IpLocationRequest.class,
      responseType = com.grpc.iplocation.IpToLocation.IpLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.iplocation.IpToLocation.IpLocationRequest,
      com.grpc.iplocation.IpToLocation.IpLocationResponse> getGetMyLocationFromIpMethod() {
    io.grpc.MethodDescriptor<com.grpc.iplocation.IpToLocation.IpLocationRequest, com.grpc.iplocation.IpToLocation.IpLocationResponse> getGetMyLocationFromIpMethod;
    if ((getGetMyLocationFromIpMethod = ipToLocationGrpc.getGetMyLocationFromIpMethod) == null) {
      synchronized (ipToLocationGrpc.class) {
        if ((getGetMyLocationFromIpMethod = ipToLocationGrpc.getGetMyLocationFromIpMethod) == null) {
          ipToLocationGrpc.getGetMyLocationFromIpMethod = getGetMyLocationFromIpMethod = 
              io.grpc.MethodDescriptor.<com.grpc.iplocation.IpToLocation.IpLocationRequest, com.grpc.iplocation.IpToLocation.IpLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ipToLocation", "getMyLocationFromIp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.iplocation.IpToLocation.IpLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.iplocation.IpToLocation.IpLocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ipToLocationMethodDescriptorSupplier("getMyLocationFromIp"))
                  .build();
          }
        }
     }
     return getGetMyLocationFromIpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ipToLocationStub newStub(io.grpc.Channel channel) {
    return new ipToLocationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ipToLocationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ipToLocationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ipToLocationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ipToLocationFutureStub(channel);
  }

  /**
   */
  public static abstract class ipToLocationImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMyLocationFromIp(com.grpc.iplocation.IpToLocation.IpLocationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.iplocation.IpToLocation.IpLocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMyLocationFromIpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMyLocationFromIpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.iplocation.IpToLocation.IpLocationRequest,
                com.grpc.iplocation.IpToLocation.IpLocationResponse>(
                  this, METHODID_GET_MY_LOCATION_FROM_IP)))
          .build();
    }
  }

  /**
   */
  public static final class ipToLocationStub extends io.grpc.stub.AbstractStub<ipToLocationStub> {
    private ipToLocationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ipToLocationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ipToLocationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ipToLocationStub(channel, callOptions);
    }

    /**
     */
    public void getMyLocationFromIp(com.grpc.iplocation.IpToLocation.IpLocationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.iplocation.IpToLocation.IpLocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMyLocationFromIpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ipToLocationBlockingStub extends io.grpc.stub.AbstractStub<ipToLocationBlockingStub> {
    private ipToLocationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ipToLocationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ipToLocationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ipToLocationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.iplocation.IpToLocation.IpLocationResponse getMyLocationFromIp(com.grpc.iplocation.IpToLocation.IpLocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMyLocationFromIpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ipToLocationFutureStub extends io.grpc.stub.AbstractStub<ipToLocationFutureStub> {
    private ipToLocationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ipToLocationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ipToLocationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ipToLocationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.iplocation.IpToLocation.IpLocationResponse> getMyLocationFromIp(
        com.grpc.iplocation.IpToLocation.IpLocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMyLocationFromIpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MY_LOCATION_FROM_IP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ipToLocationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ipToLocationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MY_LOCATION_FROM_IP:
          serviceImpl.getMyLocationFromIp((com.grpc.iplocation.IpToLocation.IpLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.iplocation.IpToLocation.IpLocationResponse>) responseObserver);
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

  private static abstract class ipToLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ipToLocationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.iplocation.IpToLocation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ipToLocation");
    }
  }

  private static final class ipToLocationFileDescriptorSupplier
      extends ipToLocationBaseDescriptorSupplier {
    ipToLocationFileDescriptorSupplier() {}
  }

  private static final class ipToLocationMethodDescriptorSupplier
      extends ipToLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ipToLocationMethodDescriptorSupplier(String methodName) {
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
      synchronized (ipToLocationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ipToLocationFileDescriptorSupplier())
              .addMethod(getGetMyLocationFromIpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
