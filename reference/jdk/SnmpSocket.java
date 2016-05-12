_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpSocket</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Closes the datagram socket and stops the socket thread associated to this SNMP socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    @Override

    /**
     * Dispatcher method for this socket thread. This is the dispatcher method
     * which goes in an endless-loop and waits for receiving datagram packets on the socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized void close() {

    /**
     * Closes the socket and its associated resources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized boolean isValid() {

    /**
     * Checks if the socket is initialised correctly and if it is still active.
     * @return <CODE>true</CODE> if the socket is initialised correctly and if it is still active,
     * <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized void sendPacket(DatagramPacket dgrmpkt) throws IOException {

    /**
     * Sends a datagram packet to a specified device at specified port.
     * @param dgrmpkt The datagram packet.
     * @exception IOException Signals that an I/O exception of some sort has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized void sendPacket(byte[] buff, int length, InetAddress addr, int port) throws IOException {

    /**
     * Sends a datagram packet to a specified device at specified port.
     * @param buff The packet data.
     * @param length The packet length.
     * @param addr The destination address.
     * @param port The destination port number.
     * @exception IOException Signals that an I/O exception of some sort has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public SnmpSocket(SnmpResponseHandler rspHdlr, InetAddress addr, int bufferSize) throws SocketException {

    /**
     * Creates a new <CODE>SnmpSocket</CODE> object.
     * @param rspHdlr A Datagram handler.
     * @param bufferSize The SNMP adaptor buffer size.
     * @exception SocketException A socket could not be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
final class SnmpSocket implements java.lang.Runnable {

/**
 * This class creates an SNMP Datagram Socket. This class has methods helpful
 * to send SNMP inform request packets to an arbitrary port of a specified device.
 * It also runs a thread that is devoted to receiving SNMP inform response on the socket.
 * <BR>
 * A socket imposes an upper limit on size of inform response packet. Any
 * packet which exceeds this limit is truncated. By default, this
 * limit is {@link SnmpAdaptorServer#bufferSize}.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpSocket</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Closes the datagram socket and stops the socket thread associated to this SNMP socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    @Override

    /**
     * Dispatcher method for this socket thread. This is the dispatcher method
     * which goes in an endless-loop and waits for receiving datagram packets on the socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized void close() {

    /**
     * Closes the socket and its associated resources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized boolean isValid() {

    /**
     * Checks if the socket is initialised correctly and if it is still active.
     * @return <CODE>true</CODE> if the socket is initialised correctly and if it is still active,
     * <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized void sendPacket(DatagramPacket dgrmpkt) throws IOException {

    /**
     * Sends a datagram packet to a specified device at specified port.
     * @param dgrmpkt The datagram packet.
     * @exception IOException Signals that an I/O exception of some sort has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public synchronized void sendPacket(byte[] buff, int length, InetAddress addr, int port) throws IOException {

    /**
     * Sends a datagram packet to a specified device at specified port.
     * @param buff The packet data.
     * @param length The packet length.
     * @param addr The destination address.
     * @param port The destination port number.
     * @exception IOException Signals that an I/O exception of some sort has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
    public SnmpSocket(SnmpResponseHandler rspHdlr, InetAddress addr, int bufferSize) throws SocketException {

    /**
     * Creates a new <CODE>SnmpSocket</CODE> object.
     * @param rspHdlr A Datagram handler.
     * @param bufferSize The SNMP adaptor buffer size.
     * @exception SocketException A socket could not be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSocket.java
final class SnmpSocket implements java.lang.Runnable {

/**
 * This class creates an SNMP Datagram Socket. This class has methods helpful
 * to send SNMP inform request packets to an arbitrary port of a specified device.
 * It also runs a thread that is devoted to receiving SNMP inform response on the socket.
 * <BR>
 * A socket imposes an upper limit on size of inform response packet. Any
 * packet which exceeds this limit is truncated. By default, this
 * limit is {@link SnmpAdaptorServer#bufferSize}.
 */
