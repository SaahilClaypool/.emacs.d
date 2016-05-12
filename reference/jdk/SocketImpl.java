_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected void setPerformancePreferences(int connectionTime,
                                          int latency,
                                          int bandwidth)

    /**
     * Sets performance preferences for this socket.
     *
     * <p> Sockets use the TCP/IP protocol by default.  Some implementations
     * may offer alternative protocols which have different performance
     * characteristics than TCP/IP.  This method allows the application to
     * express its own preferences as to how these tradeoffs should be made
     * when the implementation chooses from the available protocols.
     *
     * <p> Performance preferences are described by three integers
     * whose values indicate the relative importance of short connection time,
     * low latency, and high bandwidth.  The absolute values of the integers
     * are irrelevant; in order to choose a protocol the values are simply
     * compared, with larger values indicating stronger preferences. Negative
     * values represent a lower priority than positive values. If the
     * application prefers short connection time over both low latency and high
     * bandwidth, for example, then it could invoke this method with the values
     * {@code (1, 0, 0)}.  If the application prefers high bandwidth above low
     * latency, and low latency above short connection time, then it could
     * invoke this method with the values {@code (0, 1, 2)}.
     *
     * By default, this method does nothing, unless it is overridden in a
     * a sub-class.
     *
     * @param  connectionTime
     *         An {@code int} expressing the relative importance of a short
     *         connection time
     *
     * @param  latency
     *         An {@code int} expressing the relative importance of low
     *         latency
     *
     * @param  bandwidth
     *         An {@code int} expressing the relative importance of high
     *         bandwidth
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    public String toString() {

    /**
     * Returns the address and port of this socket as a {@code String}.
     *
     * @return  a string representation of this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected int getLocalPort() {

    /**
     * Returns the value of this socket's {@code localport} field.
     *
     * @return  the value of this socket's {@code localport} field.
     * @see     java.net.SocketImpl#localport
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void sendUrgentData (int data) throws IOException;

    /**
     * Send one byte of urgent data on the socket.
     * The byte to be sent is the low eight bits of the parameter
     * @param data The byte of data to send
     * @exception IOException if there is an error
     *  sending the data.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected boolean supportsUrgentData () {

    /**
     * Returns whether or not this SocketImpl supports sending
     * urgent data. By default, false is returned
     * unless the method is overridden in a sub-class
     *
     * @return  true if urgent data supported
     * @see     java.net.SocketImpl#address
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected int getPort() {

    /**
     * Returns the value of this socket's {@code port} field.
     *
     * @return  the value of this socket's {@code port} field.
     * @see     java.net.SocketImpl#port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected InetAddress getInetAddress() {

    /**
     * Returns the value of this socket's {@code address} field.
     *
     * @return  the value of this socket's {@code address} field.
     * @see     java.net.SocketImpl#address
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected FileDescriptor getFileDescriptor() {

    /**
     * Returns the value of this socket's {@code fd} field.
     *
     * @return  the value of this socket's {@code fd} field.
     * @see     java.net.SocketImpl#fd
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected void shutdownOutput() throws IOException {

    /**
     * Disables the output stream for this socket.
     * For a TCP socket, any previously written data will be sent
     * followed by TCP's normal connection termination sequence.
     *
     * If you write to a socket output stream after invoking
     * shutdownOutput() on the socket, the stream will throw
     * an IOException.
     *
     * @exception IOException if an I/O error occurs when shutting down this
     * socket.
     * @see java.net.Socket#shutdownInput()
     * @see java.net.Socket#close()
     * @see java.net.Socket#setSoLinger(boolean, int)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected void shutdownInput() throws IOException {

    /**
     * Places the input stream for this socket at "end of stream".
     * Any data sent to this socket is acknowledged and then
     * silently discarded.
     *
     * If you read from a socket input stream after invoking this method on the
     * socket, the stream's {@code available} method will return 0, and its
     * {@code read} methods will return {@code -1} (end of stream).
     *
     * @exception IOException if an I/O error occurs when shutting down this
     * socket.
     * @see java.net.Socket#shutdownOutput()
     * @see java.net.Socket#close()
     * @see java.net.Socket#setSoLinger(boolean, int)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void close() throws IOException;

    /**
     * Closes this socket.
     *
     * @exception  IOException  if an I/O error occurs when closing this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract int available() throws IOException;

    /**
     * Returns the number of bytes that can be read from this socket
     * without blocking.
     *
     * @return     the number of bytes that can be read from this socket
     *             without blocking.
     * @exception  IOException  if an I/O error occurs when determining the
     *               number of bytes available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract OutputStream getOutputStream() throws IOException;

    /**
     * Returns an output stream for this socket.
     *
     * @return     an output stream for writing to this socket.
     * @exception  IOException  if an I/O error occurs when creating the
     *               output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract InputStream getInputStream() throws IOException;

    /**
     * Returns an input stream for this socket.
     *
     * @return     a stream for reading from this socket.
     * @exception  IOException  if an I/O error occurs when creating the
     *               input stream.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void accept(SocketImpl s) throws IOException;

    /**
     * Accepts a connection.
     *
     * @param      s   the accepted connection.
     * @exception  IOException  if an I/O error occurs when accepting the
     *               connection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void listen(int backlog) throws IOException;

    /**
     * Sets the maximum queue length for incoming connection indications
     * (a request to connect) to the {@code count} argument. If a
     * connection indication arrives when the queue is full, the
     * connection is refused.
     *
     * @param      backlog   the maximum length of the queue.
     * @exception  IOException  if an I/O error occurs when creating the queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void bind(InetAddress host, int port) throws IOException;

    /**
     * Binds this socket to the specified local IP address and port number.
     *
     * @param      host   an IP address that belongs to a local interface.
     * @param      port   the port number.
     * @exception  IOException  if an I/O error occurs when binding this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void connect(SocketAddress address, int timeout) throws IOException;

    /**
     * Connects this socket to the specified port number on the specified host.
     * A timeout of zero is interpreted as an infinite timeout. The connection
     * will then block until established or an error occurs.
     *
     * @param      address   the Socket address of the remote host.
     * @param     timeout  the timeout value, in milliseconds, or zero for no timeout.
     * @exception  IOException  if an I/O error occurs when attempting a
     *               connection.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void connect(InetAddress address, int port) throws IOException;

    /**
     * Connects this socket to the specified port number on the specified host.
     *
     * @param      address   the IP address of the remote host.
     * @param      port      the port number.
     * @exception  IOException  if an I/O error occurs when attempting a
     *               connection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void connect(String host, int port) throws IOException;

    /**
     * Connects this socket to the specified port on the named host.
     *
     * @param      host   the name of the remote host.
     * @param      port   the port number.
     * @exception  IOException  if an I/O error occurs when connecting to the
     *               remote host.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected abstract void create(boolean stream) throws IOException;

    /**
     * Creates either a stream or a datagram socket.
     *
     * @param      stream   if {@code true}, create a stream socket;
     *                      otherwise, create a datagram socket.
     * @exception  IOException  if an I/O error occurs while creating the
     *               socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected int localport;

    /**
     * The local port number to which this socket is connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected int port;

    /**
     * The port number on the remote host to which this socket is connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected InetAddress address;

    /**
     * The IP address of the remote end of this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
    protected FileDescriptor fd;

    /**
     * The file descriptor object for this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketImpl.java
public abstract class SocketImpl implements SocketOptions {

/**
 * The abstract class {@code SocketImpl} is a common superclass
 * of all classes that actually implement sockets. It is used to
 * create both client and server sockets.
 * <p>
 * A "plain" socket implements these methods exactly as
 * described, without attempting to go through a firewall or proxy.
 *
 * @author  unascribed
 * @since   JDK1.0
 */
