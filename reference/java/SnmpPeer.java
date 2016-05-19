_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public long getAvgRtt() {

    /**
     * Gets the average round trip time for a packet with the peer.
     * @return The average round trip time for a packet with the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public long getMaxRtt() {

    /**
     * Gets the maximum round trip time for a packet with the peer.
     * @return The maximum round trip time for a packet with the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public long getMinRtt() {

    /**
     * Gets the minimum round trip time for a packet with the peer.
     * @return The minimum round trip time for a packet with the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpPeer</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Sets all the references to this SNMP peer object to <CODE>null</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void setMaxSnmpPktSize(int newsize) {

    /**
     * Configures the maximum packet size that can be used when generating an SNMP request.
     * @param newsize The desired packet size.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public int getMaxSnmpPktSize() {

    /**
     * Gets the maximum request packet size that is currently used.
     * @return The maximum request packet size.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public SnmpParams getParams() {

    /**
     * Gets the <CODE>SnmpParams</CODE> object associated with the peer.
     * @return The associated parameters.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public void setParams(SnmpParams params) {

    /**
     * Sets the <CODE>SnmpParams</CODE> object associated with the peer.
     * @param params The desired parameters.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void setVarBindLimit(int limit) {

    /**
     * Configures the maximum number of variable bindings that can be sent to a peer.
     * @param limit The desired limit.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized int getVarBindLimit() {

    /**
     * Gets the maximum number of variable bindings that can be sent to a peer.
     * @return The maximum variable bindings that can be encoded into a request packet.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    @Override

    /**
     * Returns the <CODE>String</CODE> representation for this <CODE>SnmpPeer</CODE>.
     * @return The <CODE>String</CODE> representation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public String getDevName() {

    /**
     * Gets the name specified in the constructor while creating this object.
     * @return The name of the host as specified while creating this object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void setMaxTries(int newMaxTries) {

    /**
     * Changes the maximun number of times to try before giving up.
     * @param newMaxTries The maximun number of tries.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public int getMaxTries() {

    /**
     * Gets the number of times to try before giving up.
     * @return The maximun number of tries.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void setTimeout(int newTimeout) {

    /**
     * Changes the timeout to wait for a response from the peer.
     * @param newTimeout The timeout (in milliseconds).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public int getTimeout() {

    /**
     * Gets the timeout to wait for a response from the peer.
     * @return The value of the timeout property.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void setDestPort(int newPort) {

    /**
     * Changes the port address of the destination for the request.
     * @param newPort The destination port.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public int getDestPort() {

    /**
     * Gets the destination port number of the peer to which SNMP requests are to be sent.
     * @return The destination port number.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public InetAddress getDestAddr() {

    /**
     * Gets the <CODE>InetAddress</CODE> object for this peer.
     * @return The <CODE>InetAddress</CODE> of the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public InetAddress[] getDestAddrList() {

    /**
     * Gets the list of alternate <CODE>InetAddress</CODE> configured for this peer.
     * @return The <CODE>InetAddress</CODE> of the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public boolean allowSnmpSets() {

    /**
     * Determines whether an SNMP <CODE>set</CODE> operation is allowed with this
     * peer object. For now it just makes sure a parameter is configured for a write operation.
     * @return <CODE>true</CODE> if SNMP <CODE>set</CODE> is allowed and the parameter is configured,
     * <CODE>false</CODE> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void useNextAddress() {

    /**
     * Causes all subsequent requests to go to the new address
     * obtained from the specified list of alternate addresses.
     * If it reaches the end of list, it starts again at the first address.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void useAddressList(InetAddress adrList[]) {

    /**
     * Specifies the list of addresses to be used.  When a host is not responding
     * the user can switch to the next address by calling <CODE>useNextAddress</CODE>.
     * @param adrList The list of <CODE>InetAddresses</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized String ipAddressInUse() {

    /**
     * Returns the dot-formatted IP address string (for example 171.69.220.224).
     * Useful when you want to know which IP address is used
     * when the address was resolved using a DNS name.
     * @return The dot-formatted IP address being used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    final public synchronized void useIPAddress(String ipaddr) throws UnknownHostException {

    /**
     * Sets a specific IP address to which the peer will communicate.
     * Typically used to set an alternate IP address or a specific address which is known to respond to requests.
     * The IP address <CODE>String</CODE> can either be a machine name, such as <CODE>ibiza</CODE>,
     * or a <CODE>String</CODE> representing its IP address, such as "206.26.48.100".
     * @param ipaddr Dot formatted IP address or logical host name.
     * @exception UnknownHostException If the host name cannot be resolved.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public SnmpPeer(String host, int port) throws UnknownHostException {

    /**
     * Creates an SNMP peer object for a device with the specified port.
     * @param host The peer name.
     * @param port The port number.
     * @exception UnknownHostException If the host name cannot be resolved.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public SnmpPeer(InetAddress netaddr) {

    /**
     * Creates an SNMP peer object for a device. The default port is 161.
     * @param netaddr The peer <CODE>InetAddress</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public SnmpPeer(InetAddress netaddr, int port) {

    /**
     * Creates an SNMP peer object for a device. The default port is 161.
     * @param netaddr The peer <CODE>InetAddress</CODE>.
     * @param port The port number.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public SnmpPeer(String host) throws UnknownHostException {

    /**
     * Creates an SNMP peer object for a device. The default port is 161.
     * @param host The peer name.
     * @exception UnknownHostException If the host name cannot be resolved.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    int _addrIndex = 0 ;

    /**
     * The index of address currently being used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    InetAddress _devAddrList[] = null ;

    /**
     * List of alternate addresses.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private int maxSnmpPacketSize = defaultSnmpRequestPktSize ;

    /**
     * Maximum packet size of the request PDU.  This can be set by the user.
     * If the request crosses this limit while encoding, the request is automatically split
     * into multiple small request. Each of these requests will again be within this limit.
     * The default value is (2 * 1024).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private InetAddress _devAddr = null ;

    /**
     * Internet address of the peer to be used when communicating with the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private SnmpParams _snmpParameter = new SnmpParameters() ;

    /**
     * SNMP parameters for this peer are valid for all requests using this peer.
     * @see com.sun.jmx.snmp.SnmpParameters
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private long _avgrtt ;

    /**
     * The average round trip time for a packet with the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private long _minrtt ;

    /**
     * The minimum round trip time for a packet with the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private long _maxrtt ;

    /**
     * The maximum round trip time for a packet with the peer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private SnmpPduFactory pduFactory = new SnmpPduFactoryBER() ;

    /**
     * The PDU factory. The default factory is an instance of <CODE>SnmpPduFactoryBER</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private int timeout = 3000;

    /**
     * The amount of time to wait for a response from the peer.
     * The default amount of time is 3000 millisec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private int maxTries = 3 ;

    /**
     * Number of times to try before giving up.
     * The default number is 3.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private int portNum = 161 ;

    /**
     * Port number of the destination host.
     * The default port is 161.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    private int maxVarBindLimit = 25 ;

    /**
     * The maximum number of variable bindings that can be packed into a request.
     * The default value is 25.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public static final int defaultSnmpResponsePktSize = 8 * 1024 ;

    /**
     * The default SNMP packet size of an SNMP response (8 * 1024).
     * <BR>This will be the default size that the session socket uses when receiving a packet.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
    public static final int defaultSnmpRequestPktSize = 2 * 1024 ;

    /**
     * The default SNMP packet size of an SNMP request (2 * 1024).
     * <BR>The maximum size is initially set to Ethernet maximum transfer unit (MTU).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPeer.java
public class SnmpPeer implements Serializable {

/**
 * Holds information about an SNMP agent. This information is used to communicate with the agent.
 * These are the IP address, port number, SNMP parameters, and peer channel parameters
 * (such as the maximum request packet size, maximum number of variable bindings in a packet, retries, and timeouts).
 * Changing these would affect all active requests.
 * <P>
 * The class contains the following properties:
 * <UL>
 * <LI><B>destPort</B>: port number of the destination host.
 * <BR>The default port is <B>161</B>.
 *
 * <LI><B>maxVarBindLimit</B>: maximum number of OIDs which can be encoded in a single request packet.
 * This is set by the user.
 * <BR>A request which contains more than this limit will be automatically split into multiple requests.
 * Typically used when multiplexing requests.
 * <BR>The default value is 25.
 *
 * <LI><B>maxSnmpPacketSize</B>: maximum packet size of the request PDU.
 * This can be set by the user.
 * <BR> If the request crosses this limit while encoding, the request is automatically split into
 * multiple small requests. Each of these requests will again be within this limit.
 * <BR>The default value is (2 * 1024).
 *
 * <LI><B>maxTries</B>: number of times to try before giving up.
 * <BR>The default number is <B>3</B>.
 *
 * <LI><B>timeout</B>: amount of time to wait for a response from the
 * peer.  If this amount of time passes without a response, and if the
 * <B>maxTries</B> value has not been exceeded, the request will be
 * resent.  <BR>The default amount of time is <B>3000
 * milliseconds</B>.
 *
 * <LI><B>snmpParameters</B>: SNMP parameters to be used when communicating with the agent.
 * The parameters contain the protocol version and security information (the parameters can be shared amongst several peers).
 *
 *</UL>
 * JavaBean compliant getters and setters allow the properties listed above to be modified.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.SnmpParameters
 */
