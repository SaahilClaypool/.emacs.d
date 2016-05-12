_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    static NetworkInterface getDefault() {

    /**
     * Returns the default network interface of this system
     *
     * @return the default interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public boolean equals(Object obj) {

    /**
     * Compares this object against the specified object.
     * The result is {@code true} if and only if the argument is
     * not {@code null} and it represents the same NetworkInterface
     * as this object.
     * <p>
     * Two instances of {@code NetworkInterface} represent the same
     * NetworkInterface if both name and addrs are the same for both.
     *
     * @param   obj   the object to compare against.
     * @return  {@code true} if the objects are the same;
     *          {@code false} otherwise.
     * @see     java.net.InetAddress#getAddress()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public boolean isVirtual() {

    /**
     * Returns whether this interface is a virtual interface (also called
     * subinterface).
     * Virtual interfaces are, on some systems, interfaces created as a child
     * of a physical interface and given different settings (like address or
     * MTU). Usually the name of the interface will the name of the parent
     * followed by a colon (:) and a number identifying the child since there
     * can be several virtual interfaces attached to a single physical
     * interface.
     *
     * @return {@code true} if this interface is a virtual interface.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public int getMTU() throws SocketException {

    /**
     * Returns the Maximum Transmission Unit (MTU) of this interface.
     *
     * @return the value of the MTU for that interface.
     * @exception       SocketException if an I/O error occurs.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public byte[] getHardwareAddress() throws SocketException {

    /**
     * Returns the hardware address (usually MAC) of the interface if it
     * has one and if it can be accessed given the current privileges.
     * If a security manager is set, then the caller must have
     * the permission {@link NetPermission}("getNetworkInformation").
     *
     * @return  a byte array containing the address, or {@code null} if
     *          the address doesn't exist, is not accessible or a security
     *          manager is set and the caller does not have the permission
     *          NetPermission("getNetworkInformation")
     *
     * @exception       SocketException if an I/O error occurs.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public boolean supportsMulticast() throws SocketException {

    /**
     * Returns whether a network interface supports multicasting or not.
     *
     * @return  {@code true} if the interface supports Multicasting.
     * @exception       SocketException if an I/O error occurs.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public boolean isPointToPoint() throws SocketException {

    /**
     * Returns whether a network interface is a point to point interface.
     * A typical point to point interface would be a PPP connection through
     * a modem.
     *
     * @return  {@code true} if the interface is a point to point
     *          interface.
     * @exception       SocketException if an I/O error occurs.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public boolean isLoopback() throws SocketException {

    /**
     * Returns whether a network interface is a loopback interface.
     *
     * @return  {@code true} if the interface is a loopback interface.
     * @exception       SocketException if an I/O error occurs.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public boolean isUp() throws SocketException {

    /**
     * Returns whether a network interface is up and running.
     *
     * @return  {@code true} if the interface is up and running.
     * @exception       SocketException if an I/O error occurs.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public static Enumeration<NetworkInterface> getNetworkInterfaces()

    /**
     * Returns all the interfaces on this machine. The {@code Enumeration}
     * contains at least one element, possibly representing a loopback
     * interface that only supports communication between entities on
     * this machine.
     *
     * NOTE: can use getNetworkInterfaces()+getInetAddresses()
     *       to obtain all IP addresses for this node
     *
     * @return an Enumeration of NetworkInterfaces found on this machine
     * @exception  SocketException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public static NetworkInterface getByInetAddress(InetAddress addr) throws SocketException {

    /**
     * Convenience method to search for a network interface that
     * has the specified Internet Protocol (IP) address bound to
     * it.
     * <p>
     * If the specified IP address is bound to multiple network
     * interfaces it is not defined which network interface is
     * returned.
     *
     * @param   addr
     *          The {@code InetAddress} to search with.
     *
     * @return  A {@code NetworkInterface}
     *          or {@code null} if there is no network interface
     *          with the specified IP address.
     *
     * @throws  SocketException
     *          If an I/O error occurs.
     *
     * @throws  NullPointerException
     *          If the specified address is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public static NetworkInterface getByIndex(int index) throws SocketException {

    /**
     * Get a network interface given its index.
     *
     * @param index an integer, the index of the interface
     * @return the NetworkInterface obtained from its index, or {@code null} if
     *         there is no interface with such an index on the system
     * @throws  SocketException  if an I/O error occurs.
     * @throws  IllegalArgumentException if index has a negative value
     * @see #getIndex()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public static NetworkInterface getByName(String name) throws SocketException {

    /**
     * Searches for the network interface with the specified name.
     *
     * @param   name
     *          The name of the network interface.
     *
     * @return  A {@code NetworkInterface} with the specified name,
     *          or {@code null} if there is no network interface
     *          with the specified name.
     *
     * @throws  SocketException
     *          If an I/O error occurs.
     *
     * @throws  NullPointerException
     *          If the specified name is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public String getDisplayName() {

    /**
     * Get the display name of this network interface.
     * A display name is a human readable String describing the network
     * device.
     *
     * @return a non-empty string representing the display name of this network
     *         interface, or null if no display name is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public int getIndex() {

    /**
     * Returns the index of this network interface. The index is an integer greater
     * or equal to zero, or {@code -1} for unknown. This is a system specific value
     * and interfaces with the same name can have different indexes on different
     * machines.
     *
     * @return the index of this network interface or {@code -1} if the index is
     *         unknown
     * @see #getByIndex(int)
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public NetworkInterface getParent() {

    /**
     * Returns the parent NetworkInterface of this interface if this is
     * a subinterface, or {@code null} if it is a physical
     * (non virtual) interface or has no parent.
     *
     * @return The {@code NetworkInterface} this interface is attached to.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public Enumeration<NetworkInterface> getSubInterfaces() {

    /**
     * Get an Enumeration with all the subinterfaces (also known as virtual
     * interfaces) attached to this network interface.
     * <p>
     * For instance eth0:1 will be a subinterface to eth0.
     *
     * @return an Enumeration object with all of the subinterfaces
     * of this network interface
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public java.util.List<InterfaceAddress> getInterfaceAddresses() {

    /**
     * Get a List of all or a subset of the {@code InterfaceAddresses}
     * of this network interface.
     * <p>
     * If there is a security manager, its {@code checkConnect}
     * method is called with the InetAddress for each InterfaceAddress.
     * Only InterfaceAddresses where the {@code checkConnect} doesn't throw
     * a SecurityException will be returned in the List.
     *
     * @return a {@code List} object with all or a subset of the
     *         InterfaceAddresss of this network interface
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public Enumeration<InetAddress> getInetAddresses() {

    /**
     * Convenience method to return an Enumeration with all or a
     * subset of the InetAddresses bound to this network interface.
     * <p>
     * If there is a security manager, its {@code checkConnect}
     * method is called for each InetAddress. Only InetAddresses where
     * the {@code checkConnect} doesn't throw a SecurityException
     * will be returned in the Enumeration. However, if the caller has the
     * {@link NetPermission}("getNetworkInformation") permission, then all
     * InetAddresses are returned.
     * @return an Enumeration object with all or a subset of the InetAddresses
     * bound to this network interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    public String getName() {

    /**
     * Get the name of this network interface.
     *
     * @return the name of this network interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
    NetworkInterface() {

    /**
     * Returns an NetworkInterface object with index set to 0 and name to null.
     * Setting such an interface on a MulticastSocket will cause the
     * kernel to choose one interface for sending multicast packets.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NetworkInterface.java
public final class NetworkInterface {

/**
 * This class represents a Network Interface made up of a name,
 * and a list of IP addresses assigned to this interface.
 * It is used to identify the local interface on which a multicast group
 * is joined.
 *
 * Interfaces are normally known by names such as "le0".
 *
 * @since 1.4
 */
