_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected FileDescriptor getFileDescriptor() {

    /**
     * Gets the datagram socket file descriptor.
     * @return a {@code FileDescriptor} object representing the datagram socket
     * file descriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected int getLocalPort() {

    /**
     * Gets the local port.
     * @return an {@code int} representing the local port value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void close();

    /**
     * Close the socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void leaveGroup(SocketAddress mcastaddr,
                                       NetworkInterface netIf)

    /**
     * Leave the multicast group.
     * @param mcastaddr address to leave.
     * @param netIf specified the local interface to leave the group at
     * @throws IOException if an I/O exception occurs while leaving
     * the multicast group
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void joinGroup(SocketAddress mcastaddr,
                                      NetworkInterface netIf)

    /**
     * Join the multicast group.
     * @param mcastaddr address to join.
     * @param netIf specifies the local interface to receive multicast
     *        datagram packets
     * @throws IOException if an I/O exception occurs while joining
     * the multicast group
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void leave(InetAddress inetaddr) throws IOException;

    /**
     * Leave the multicast group.
     * @param inetaddr multicast address to leave.
     * @exception IOException if an I/O exception occurs
     * while leaving the multicast group.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void join(InetAddress inetaddr) throws IOException;

    /**
     * Join the multicast group.
     * @param inetaddr multicast address to join.
     * @exception IOException if an I/O exception occurs
     * while joining the multicast group.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract int getTimeToLive() throws IOException;

    /**
     * Retrieve the TTL (time-to-live) option.
     * @exception IOException if an I/O exception occurs
     * while retrieving the time-to-live option
     * @return an {@code int} representing the time-to-live value
     * @see #setTimeToLive(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void setTimeToLive(int ttl) throws IOException;

    /**
     * Set the TTL (time-to-live) option.
     * @param ttl an {@code int} specifying the time-to-live value
     * @exception IOException if an I/O exception occurs
     * while setting the time-to-live option.
     * @see #getTimeToLive()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    @Deprecated

    /**
     * Retrieve the TTL (time-to-live) option.
     *
     * @exception IOException if an I/O exception occurs
     * while retrieving the time-to-live option
     * @deprecated use getTimeToLive instead.
     * @return a byte representing the TTL value
     * @see #setTTL(byte)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    @Deprecated

    /**
     * Set the TTL (time-to-live) option.
     * @param ttl a byte specifying the TTL value
     *
     * @deprecated use setTimeToLive instead.
     * @exception IOException if an I/O exception occurs while setting
     * the time-to-live option.
     * @see #getTTL()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract int peekData(DatagramPacket p) throws IOException;

    /**
     * Peek at the packet to see who it is from. The data is copied into the specified
     * {@code DatagramPacket}. The data is returned,
     * but not consumed, so that a subsequent peekData/receive operation
     * will see the same data.
     * @param p the Packet Received.
     * @return the port number which the packet came from.
     * @exception IOException if an I/O exception occurs
     * @exception  PortUnreachableException may be thrown if the socket is connected
     *       to a currently unreachable destination. Note, there is no guarantee that the
     *       exception will be thrown.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract int peek(InetAddress i) throws IOException;

    /**
     * Peek at the packet to see who it is from. Updates the specified {@code InetAddress}
     * to the address which the packet came from.
     * @param i an InetAddress object
     * @return the port number which the packet came from.
     * @exception IOException if an I/O exception occurs
     * @exception  PortUnreachableException may be thrown if the socket is connected
     *       to a currently unreachable destination. Note, there is no guarantee that the
     *       exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected void disconnect() {}

    /**
     * Disconnects a datagram socket from its remote destination.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected void connect(InetAddress address, int port) throws SocketException {}

    /**
     * Connects a datagram socket to a remote destination. This associates the remote
     * address with the local socket so that datagrams may only be sent to this destination
     * and received from this destination. This may be overridden to call a native
     * system connect.
     *
     * <p>If the remote destination to which the socket is connected does not
     * exist, or is otherwise unreachable, and if an ICMP destination unreachable
     * packet has been received for that address, then a subsequent call to
     * send or receive may throw a PortUnreachableException.
     * Note, there is no guarantee that the exception will be thrown.
     * @param address the remote InetAddress to connect to
     * @param port the remote port number
     * @exception   SocketException may be thrown if the socket cannot be
     * connected to the remote destination
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void send(DatagramPacket p) throws IOException;

    /**
     * Sends a datagram packet. The packet contains the data and the
     * destination address to send the packet to.
     * @param p the packet to be sent.
     * @exception IOException if an I/O exception occurs while sending the
     * datagram packet.
     * @exception  PortUnreachableException may be thrown if the socket is connected
     * to a currently unreachable destination. Note, there is no guarantee that
     * the exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void bind(int lport, InetAddress laddr) throws SocketException;

    /**
     * Binds a datagram socket to a local port and address.
     * @param lport the local port
     * @param laddr the local address
     * @exception SocketException if there is an error in the
     * underlying protocol, such as a TCP error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected abstract void create() throws SocketException;

    /**
     * Creates a datagram socket.
     * @exception SocketException if there is an error in the
     * underlying protocol, such as a TCP error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    DatagramSocket socket;

    /**
     * The DatagramSocket or MulticastSocket
     * that owns this impl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected FileDescriptor fd;

    /**
     * The file descriptor object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
    protected int localPort;

    /**
     * The local port number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/DatagramSocketImpl.java
public abstract class DatagramSocketImpl implements SocketOptions {

/**
 * Abstract datagram and multicast socket implementation base class.
 * @author Pavani Diwanji
 * @since  JDK1.1
 */
