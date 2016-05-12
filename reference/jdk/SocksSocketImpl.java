_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
    @Override

    /**
     * Returns the value of this socket's {@code port} field.
     *
     * @return  the value of this socket's {@code port} field.
     * @see     java.net.SocketImpl#port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
    @Override

    /**
     * Returns the value of this socket's {@code address} field.
     *
     * @return  the value of this socket's {@code address} field.
     * @see     java.net.SocketImpl#address
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
        if (s instanceof SocksSocketImpl) {

        /**
         * This is where we have to do some fancy stuff.
         * The datastream from the socket "accepted" by the proxy will
         * come through the cmdSocket. So we have to swap the socketImpls
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
    protected void acceptFrom(SocketImpl s, InetSocketAddress saddr) throws IOException {

    /**
     * Accepts a connection from a specific host.
     *
     * @param      s   the accepted connection.
     * @param      saddr the socket address of the host we do accept
     *               connection from
     * @exception  IOException  if an I/O error occurs when accepting the
     *               connection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
    protected synchronized void socksBind(InetSocketAddress saddr) throws IOException {

    /**
     * Sends the Bind request to the SOCKS proxy. In the SOCKS protocol, bind
     * means "accept incoming connection from", so the SocketAddress is the
     * the one of the host we do accept connection from.
     *
     * @param      saddr   the Socket address of the remote host.
     * @exception  IOException  if an I/O error occurs when binding this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
    @Override

    /**
     * Connects the Socks Socket to the specified endpoint. It will first
     * connect to the SOCKS proxy and negotiate the access. If the proxy
     * grants the connections, then the connect is successful and all
     * further traffic will go to the "real" endpoint.
     *
     * @param   endpoint        the {@code SocketAddress} to connect to.
     * @param   timeout         the timeout value in milliseconds
     * @throws  IOException     if the connection can't be established.
     * @throws  SecurityException if there is a security manager and it
     *                          doesn't allow the connection
     * @throws  IllegalArgumentException if endpoint is null or a
     *          SocketAddress subclass not supported by this socket
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
//      if (method == GSSAPI) {

        /**
         * GSSAPI authentication mechanism.
         * Unfortunately the RFC seems out of sync with the Reference
         * implementation. I'll leave this in for future completion.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
        if (method == USER_PASSW) {

        /**
         * User/Password authentication. Try, in that order :
         * - The application provided Authenticator, if any
         * - the user.name & no password (backward compatibility behavior).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
    private boolean authenticate(byte method, InputStream in,
                                 BufferedOutputStream out) throws IOException {

    /**
     * Provides the authentication machanism required by the proxy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocksSocketImpl.java
class SocksSocketImpl extends PlainSocketImpl implements SocksConsts {

/**
 * SOCKS (V4 & V5) TCP socket implementation (RFC 1928).
 * This is a subclass of PlainSocketImpl.
 * Note this class should <b>NOT</b> be public.
 */
