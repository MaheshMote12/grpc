package org.exampledriven.grpc.services;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: BookService.proto")
public class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "org.exampledriven.grpc.services.BookService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.exampledriven.grpc.services.BookList,
      org.exampledriven.grpc.services.BookList> METHOD_CREATE_BOOKS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.exampledriven.grpc.services.BookService", "createBooks"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.exampledriven.grpc.services.BookList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.exampledriven.grpc.services.BookList.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    return new BookServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc findBookByISBN(ISBN) returns (Book);
     * </pre>
     */
    public void createBooks(org.exampledriven.grpc.services.BookList request,
        io.grpc.stub.StreamObserver<org.exampledriven.grpc.services.BookList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BOOKS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_BOOKS,
            asyncUnaryCall(
              new MethodHandlers<
                org.exampledriven.grpc.services.BookList,
                org.exampledriven.grpc.services.BookList>(
                  this, METHODID_CREATE_BOOKS)))
          .build();
    }
  }

  /**
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractStub<BookServiceStub> {
    private BookServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc findBookByISBN(ISBN) returns (Book);
     * </pre>
     */
    public void createBooks(org.exampledriven.grpc.services.BookList request,
        io.grpc.stub.StreamObserver<org.exampledriven.grpc.services.BookList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BOOKS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc findBookByISBN(ISBN) returns (Book);
     * </pre>
     */
    public org.exampledriven.grpc.services.BookList createBooks(org.exampledriven.grpc.services.BookList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BOOKS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractStub<BookServiceFutureStub> {
    private BookServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc findBookByISBN(ISBN) returns (Book);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.exampledriven.grpc.services.BookList> createBooks(
        org.exampledriven.grpc.services.BookList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BOOKS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOOKS = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BOOKS:
          serviceImpl.createBooks((org.exampledriven.grpc.services.BookList) request,
              (io.grpc.stub.StreamObserver<org.exampledriven.grpc.services.BookList>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_BOOKS);
  }

}
