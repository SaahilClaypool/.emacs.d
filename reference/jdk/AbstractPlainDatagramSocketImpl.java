_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
     public void setOption(int optID, Object o) throws SocketException {

    /**
     * set a value - since we only support (setting) binary options
     * here, o must be a Boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected void close() {

    /**
     * Close the socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected void leaveGroup(SocketAddress mcastaddr, NetworkInterface netIf)

    /**
     * Leave the multicast group.
     * @param mcastaddr  multicast address to leave.
     * @param netIf specified the local interface to leave the group at
     * @throws  IllegalArgumentException if mcastaddr is null or is a
     *          SocketAddress subclass not supported by this socket
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected void joinGroup(SocketAddress mcastaddr, NetworkInterface netIf)

    /**
     * Join the multicast group.
     * @param mcastaddr multicast address to join.
     * @param netIf specifies the local interface to receive multicast
     *        datagram packets
     * @throws  IllegalArgumentException if mcastaddr is null or is a
     *          SocketAddress subclass not supported by this socket
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected void leave(InetAddress inetaddr) throws IOException {

    /**
     * Leave the multicast group.
     * @param inetaddr multicast address to leave.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected void join(InetAddress inetaddr) throws IOException {

    /**
     * Join the multicast group.
     * @param inetaddr multicast address to join.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    @Deprecated

    /**
     * Get the TTL (time-to-live) option.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    @Deprecated

    /**
     * Set the TTL (time-to-live) option.
     * @param ttl TTL to be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected abstract int getTimeToLive() throws IOException;

    /**
     * Get the TTL (time-to-live) option.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected abstract void setTimeToLive(int ttl) throws IOException;

    /**
     * Set the TTL (time-to-live) option.
     * @param ttl TTL to be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected synchronized void receive(DatagramPacket p)

    /**
     * Receive the datagram packet.
     * @param p the packet to receive into
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected abstract int peek(InetAddress i) throws IOException;

    /**
     * Peek at the packet to see who it is from.
     * @param i the address to populate with the sender address
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected void disconnect() {

    /**
     * Disconnects a previously connected socket. Does nothing if the socket was
     * not connected already.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected void connect(InetAddress address, int port) throws SocketException {

    /**
     * Connects a datagram socket to a remote destination. This associates the remote
     * address with the local socket so that datagrams may only be sent to this destination
     * and received from this destination.
     * @param address the remote InetAddress to connect to
     * @param port the remote port number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected abstract void send(DatagramPacket p) throws IOException;

    /**
     * Sends a datagram packet. The packet contains the data and the
     * destination address to send the packet to.
     * @param p the packet to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected synchronized void bind(int lport, InetAddress laddr)

    /**
     * Binds a datagram socket to a local port.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    protected synchronized void create() throws SocketException {

    /**
     * Creates a datagram socket
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    static {

    /**
     * Load net library into runtime.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
    private final static boolean connectDisabled = os.contains("OS X");

    /**
     * flag set if the native connect() call not to be used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/AbstractPlainDatagramSocketImpl.java
abstract class AbstractPlainDatagramSocketImpl extends DatagramSocketImpl

/**
 * Abstract datagram and multicast socket implementation base class.
 * Note: This is not a public class, so that applets cannot call
 * into the implementation directly and hence cannot bypass the
 * security checks present in the DatagramSocket and MulticastSocket
 * classes.
 *
 * @author Pavani Diwanji
 */
