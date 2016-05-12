_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void finalize() throws IOException {

    /**
     * Cleans up if the user forgets to close it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void shutdownOutput() throws IOException {

    /**
     * Shutdown write-half of the socket connection;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void shutdownInput() throws IOException {

    /**
     * Shutdown read-half of the socket connection;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void close() throws IOException {

    /**
     * Closes the socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected synchronized int available() throws IOException {

    /**
     * Returns the number of bytes that can be read without blocking.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected synchronized OutputStream getOutputStream() throws IOException {

    /**
     * Gets an OutputStream for this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected synchronized InputStream getInputStream() throws IOException {

    /**
     * Gets an InputStream for this socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void accept(SocketImpl s) throws IOException {

    /**
     * Accepts connections.
     * @param s the connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected synchronized void listen(int count) throws IOException {

    /**
     * Listens, for a specified amount of time, for connections.
     * @param count the amount of time to listen for connections
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected synchronized void bind(InetAddress address, int lport)

    /**
     * Binds the socket to the specified address of the specified local port.
     * @param address the address
     * @param lport the port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    synchronized void doConnect(InetAddress address, int port, int timeout) throws IOException {

    /**
     * The workhorse of the connection operation.  Tries several times to
     * establish a connection to the given <host, port>.  If unsuccessful,
     * throws an IOException indicating what went wrong.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void connect(SocketAddress address, int timeout)

    /**
     * Creates a socket and connects it to the specified address on
     * the specified port.
     * @param address the address
     * @param timeout the timeout value in milliseconds, or zero for no timeout.
     * @throws IOException if connection fails
     * @throws  IllegalArgumentException if address is null or is a
     *          SocketAddress subclass not supported by this socket
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void connect(InetAddress address, int port) throws IOException {

    /**
     * Creates a socket and connects it to the specified address on
     * the specified port.
     * @param address the address
     * @param port the specified port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected void connect(String host, int port)

    /**
     * Creates a socket and connects it to the specified port on
     * the specified host.
     * @param host the specified host
     * @param port the specified port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    protected synchronized void create(boolean stream) throws IOException {

    /**
     * Creates a socket with a boolean that specifies whether this
     * is a stream socket (true) or an unconnected UDP socket (false).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
    static {

    /**
     * Load net library into runtime.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainSocketImpl.java
abstract class AbstractPlainSocketImpl extends SocketImpl

/**
 * Default Socket Implementation. This implementation does
 * not implement any security checks.
 * Note this class should <b>NOT</b> be public.
 *
 * @author  Steven B. Byrne
 */
