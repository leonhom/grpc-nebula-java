// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface SocketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.Socket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The identifier for the Socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.SocketRef ref = 1;</code>
   */
  boolean hasRef();
  /**
   * <pre>
   * The identifier for the Socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.SocketRef ref = 1;</code>
   */
  io.grpc.channelz.v1.SocketRef getRef();
  /**
   * <pre>
   * The identifier for the Socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.SocketRef ref = 1;</code>
   */
  io.grpc.channelz.v1.SocketRefOrBuilder getRefOrBuilder();

  /**
   * <pre>
   * Data specific to this Socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.SocketData data = 2;</code>
   */
  boolean hasData();
  /**
   * <pre>
   * Data specific to this Socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.SocketData data = 2;</code>
   */
  io.grpc.channelz.v1.SocketData getData();
  /**
   * <pre>
   * Data specific to this Socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.SocketData data = 2;</code>
   */
  io.grpc.channelz.v1.SocketDataOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * The locally bound address.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Address local = 3;</code>
   */
  boolean hasLocal();
  /**
   * <pre>
   * The locally bound address.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Address local = 3;</code>
   */
  io.grpc.channelz.v1.Address getLocal();
  /**
   * <pre>
   * The locally bound address.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Address local = 3;</code>
   */
  io.grpc.channelz.v1.AddressOrBuilder getLocalOrBuilder();

  /**
   * <pre>
   * The remote bound address.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Address remote = 4;</code>
   */
  boolean hasRemote();
  /**
   * <pre>
   * The remote bound address.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Address remote = 4;</code>
   */
  io.grpc.channelz.v1.Address getRemote();
  /**
   * <pre>
   * The remote bound address.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Address remote = 4;</code>
   */
  io.grpc.channelz.v1.AddressOrBuilder getRemoteOrBuilder();

  /**
   * <pre>
   * Security details for this socket.  May be absent if not available, or
   * there is no security on the socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Security security = 5;</code>
   */
  boolean hasSecurity();
  /**
   * <pre>
   * Security details for this socket.  May be absent if not available, or
   * there is no security on the socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Security security = 5;</code>
   */
  io.grpc.channelz.v1.Security getSecurity();
  /**
   * <pre>
   * Security details for this socket.  May be absent if not available, or
   * there is no security on the socket.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Security security = 5;</code>
   */
  io.grpc.channelz.v1.SecurityOrBuilder getSecurityOrBuilder();

  /**
   * <pre>
   * Optional, represents the name of the remote endpoint, if different than
   * the original target name.
   * </pre>
   *
   * <code>string remote_name = 6;</code>
   */
  java.lang.String getRemoteName();
  /**
   * <pre>
   * Optional, represents the name of the remote endpoint, if different than
   * the original target name.
   * </pre>
   *
   * <code>string remote_name = 6;</code>
   */
  com.google.protobuf.ByteString
      getRemoteNameBytes();
}
