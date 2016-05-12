_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/HttpConnectSocketImpl.java
/*package*/ class HttpConnectSocketImpl extends PlainSocketImpl {

/**
 * Basic SocketImpl that relies on the internal HTTP protocol handler
 * implementation to perform the HTTP tunneling and authentication. The
 * sockets impl is swapped out and replaced with the socket from the HTTP
 * handler after the tunnel is successfully setup.
 *
 * @since 1.8
 */
