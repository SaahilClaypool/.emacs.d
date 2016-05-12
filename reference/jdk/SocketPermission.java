_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    /*

    /**
     * @serialData "permissions" field (a Vector containing the SocketPermissions).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Vector
     *     A list of the SocketPermissions for this set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an enumeration of all the SocketPermission objects in the
     * container.
     *
     * @return an enumeration of all the SocketPermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public boolean implies(Permission permission)

    /**
     * Check and see if this collection of permissions implies the permissions
     * expressed in "permission".
     *
     * @param permission the Permission object to compare
     *
     * @return true if "permission" is a proper subset of a permission in
     * the collection, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the SocketPermissions. The key for the hash is
     * the name in the case of wildcards, or all the IP addresses.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       SocketPermission
     *
     * @exception SecurityException - if this SocketPermissionCollection object
     *                                has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public SocketPermissionCollection() {

    /**
     * Create an empty SocketPermissions object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
final class SocketPermissionCollection extends PermissionCollection

/**

if (init'd with IP, key is IP as string)
if wildcard, its the wild card
else its the cname?

 *
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 *
 *
 * @author Roland Schemers
 *
 * @serial include
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private static boolean inRange(
        int policyLow, int policyHigh, int targetLow, int targetHigh
    )

    /**
     * Check if the target range is within the policy range
     * together with the ephemeral range for this platform
     * (if policy includes ephemeral range)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private static int initEphemeralPorts(String suffix, int defval) {

    /**
     * Check the system/security property for the ephemeral port range
     * for this system. The suffix is either "high" or "low"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private synchronized void readObject(java.io.ObjectInputStream s)

    /**
     * readObject is called to restore the state of the SocketPermission from
     * a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private synchronized void writeObject(java.io.ObjectOutputStream s)

    /**
     * WriteObject is called to save the state of the SocketPermission
     * to a stream. The actions are serialized, and the superclass
     * takes care of the name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a new PermissionCollection object for storing SocketPermission
     * objects.
     * <p>
     * SocketPermission objects must be stored in a manner that allows them
     * to be inserted into the collection in any order, but that also enables the
     * PermissionCollection {@code implies}
     * method to be implemented in an efficient (and consistent) manner.
     *
     * @return a new PermissionCollection object suitable for storing SocketPermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public String getActions()

    /**
     * Returns the canonical string representation of the actions.
     * Always returns present actions in the following order:
     * connect, listen, accept, resolve.
     *
     * @return the canonical string representation of the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private static String getActions(int mask)

    /**
     * Returns the "canonical string representation" of the actions in the
     * specified mask.
     * Always returns present actions in the following order:
     * connect, listen, accept, resolve.
     *
     * @param mask a specific integer action mask to translate into a string
     * @return the canonical string representation of the actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    int getMask() {

    /**
     * Return the current action mask.
     *
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two SocketPermission objects for equality.
     * <P>
     * @param obj the object to test for equality with this object.
     *
     * @return true if <i>obj</i> is a SocketPermission, and has the
     *  same hostname, port range, and actions as this
     *  SocketPermission object. However, port range will be ignored
     *  in the comparison if <i>obj</i> only contains the action, 'resolve'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    boolean impliesIgnoreMask(SocketPermission that) {

    /**
     * Checks if the incoming Permission's action are a proper subset of
     * the this object's actions.
     * <P>
     * Check, in the following order:
     * <ul>
     * <li> Checks that "p" is an instanceof a SocketPermission
     * <li> Checks that "p"'s actions are a proper subset of the
     * current object's actions.
     * <li> Checks that "p"'s port range is included in this port range
     * <li> If this object was initialized with an IP address, checks that
     *      one of "p"'s IP addresses is equal to this object's IP address.
     * <li> If either object is a wildcard domain (i.e., "*.sun.com"),
     *      attempt to match based on the wildcard.
     * <li> If this object was not initialized with an IP address, attempt
     *      to find a match based on the IP addresses in both objects.
     * <li> Attempt to match on the canonical hostnames of both objects.
     * </ul>
     * @param that the incoming permission request
     *
     * @return true if "permission" is a proper subset of the current object,
     * false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if this socket permission object "implies" the
     * specified permission.
     * <P>
     * More specifically, this method first ensures that all of the following
     * are true (and returns false if any of them are not):
     * <ul>
     * <li> <i>p</i> is an instanceof SocketPermission,
     * <li> <i>p</i>'s actions are a proper subset of this
     * object's actions, and
     * <li> <i>p</i>'s port range is included in this port range. Note:
     * port range is ignored when p only contains the action, 'resolve'.
     * </ul>
     *
     * Then {@code implies} checks each of the following, in order,
     * and for each returns true if the stated condition is true:
     * <ul>
     * <li> If this object was initialized with a single IP address and one of <i>p</i>'s
     * IP addresses is equal to this object's IP address.
     * <li>If this object is a wildcard domain (such as *.sun.com), and
     * <i>p</i>'s canonical name (the name without any preceding *)
     * ends with this object's canonical host name. For example, *.sun.com
     * implies *.eng.sun.com.
     * <li>If this object was not initialized with a single IP address, and one of this
     * object's IP addresses equals one of <i>p</i>'s IP addresses.
     * <li>If this canonical name equals <i>p</i>'s canonical name.
     * </ul>
     *
     * If none of the above are true, {@code implies} returns false.
     * @param p the permission to check against.
     *
     * @return true if the specified permission is implied by this object,
     * false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    void getIP()

    /**
     * get IP addresses. Sets invalid to true if we can't get them.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    void getCanonName()

    /**
     * attempt to get the fully qualified domain name
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private static int getMask(String action) {

    /**
     * Convert an action string to an integer actions mask.
     *
     * @param action the action string
     * @return the action mask
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private void init(String host, int mask) {

    /**
     * Initialize the SocketPermission object. We don't do any DNS lookups
     * as this point, instead we hold off until the implies method is
     * called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private boolean includesEphemerals() {

    /**
     * Returns true if the permission has specified zero
     * as its value (or lower bound) signifying the ephemeral range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    public SocketPermission(String host, String action) {

    /**
     * Creates a new SocketPermission object with the specified actions.
     * The host is expressed as a DNS name, or as a numerical IP address.
     * Optionally, a port or a portrange may be supplied (separated
     * from the DNS name or IP address by a colon).
     * <p>
     * To specify the local machine, use "localhost" as the <i>host</i>.
     * Also note: An empty <i>host</i> String ("") is equivalent to "localhost".
     * <p>
     * The <i>actions</i> parameter contains a comma-separated list of the
     * actions granted for the specified host (and port(s)). Possible actions are
     * "connect", "listen", "accept", "resolve", or
     * any combination of those. "resolve" is automatically added
     * when any of the other three are specified.
     * <p>
     * Examples of SocketPermission instantiation are the following:
     * <pre>
     *    nr = new SocketPermission("www.catalog.com", "connect");
     *    nr = new SocketPermission("www.sun.com:80", "connect");
     *    nr = new SocketPermission("*.sun.com", "connect");
     *    nr = new SocketPermission("*.edu", "resolve");
     *    nr = new SocketPermission("204.160.241.0", "connect");
     *    nr = new SocketPermission("localhost:1024-65535", "listen");
     *    nr = new SocketPermission("204.160.241.0:1024-65535", "connect");
     * </pre>
     *
     * @param host the hostname or IPaddress of the computer, optionally
     * including a colon followed by a port or port range.
     * @param action the action string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private String actions; // Left null as long as possible, then

    /**
     * the actions string.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private final static int ALL        = CONNECT|LISTEN|ACCEPT|RESOLVE;

    /**
     * All actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private final static int NONE               = 0x0;

    /**
     * No actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private final static int RESOLVE    = 0x8;

    /**
     * Resolve DNS queries
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private final static int ACCEPT     = 0x4;

    /**
     * Accept a connection from host:port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private final static int LISTEN     = 0x2;

    /**
     * Listen on host:port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
    private final static int CONNECT    = 0x1;

    /**
     * Connect to host:port
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/SocketPermission.java
public final class SocketPermission extends Permission

/**
 * This class represents access to a network via sockets.
 * A SocketPermission consists of a
 * host specification and a set of "actions" specifying ways to
 * connect to that host. The host is specified as
 * <pre>
 *    host = (hostname | IPv4address | iPv6reference) [:portrange]
 *    portrange = portnumber | -portnumber | portnumber-[portnumber]
 * </pre>
 * The host is expressed as a DNS name, as a numerical IP address,
 * or as "localhost" (for the local machine).
 * The wildcard "*" may be included once in a DNS name host
 * specification. If it is included, it must be in the leftmost
 * position, as in "*.sun.com".
 * <p>
 * The format of the IPv6reference should follow that specified in <a
 * href="http://www.ietf.org/rfc/rfc2732.txt"><i>RFC&nbsp;2732: Format
 * for Literal IPv6 Addresses in URLs</i></a>:
 * <pre>
 *    ipv6reference = "[" IPv6address "]"
 *</pre>
 * For example, you can construct a SocketPermission instance
 * as the following:
 * <pre>
 *    String hostAddress = inetaddress.getHostAddress();
 *    if (inetaddress instanceof Inet6Address) {
 *        sp = new SocketPermission("[" + hostAddress + "]:" + port, action);
 *    } else {
 *        sp = new SocketPermission(hostAddress + ":" + port, action);
 *    }
 * </pre>
 * or
 * <pre>
 *    String host = url.getHost();
 *    sp = new SocketPermission(host + ":" + port, action);
 * </pre>
 * <p>
 * The <A HREF="Inet6Address.html#lform">full uncompressed form</A> of
 * an IPv6 literal address is also valid.
 * <p>
 * The port or portrange is optional. A port specification of the
 * form "N-", where <i>N</i> is a port number, signifies all ports
 * numbered <i>N</i> and above, while a specification of the
 * form "-N" indicates all ports numbered <i>N</i> and below.
 * The special port value {@code 0} refers to the entire <i>ephemeral</i>
 * port range. This is a fixed range of ports a system may use to
 * allocate dynamic ports from. The actual range may be system dependent.
 * <p>
 * The possible ways to connect to the host are
 * <pre>
 * accept
 * connect
 * listen
 * resolve
 * </pre>
 * The "listen" action is only meaningful when used with "localhost" and
 * means the ability to bind to a specified port.
 * The "resolve" action is implied when any of the other actions are present.
 * The action "resolve" refers to host/ip name service lookups.
 * <P>
 * The actions string is converted to lowercase before processing.
 * <p>As an example of the creation and meaning of SocketPermissions,
 * note that if the following permission:
 *
 * <pre>
 *   p1 = new SocketPermission("puffin.eng.sun.com:7777", "connect,accept");
 * </pre>
 *
 * is granted to some code, it allows that code to connect to port 7777 on
 * {@code puffin.eng.sun.com}, and to accept connections on that port.
 *
 * <p>Similarly, if the following permission:
 *
 * <pre>
 *   p2 = new SocketPermission("localhost:1024-", "accept,connect,listen");
 * </pre>
 *
 * is granted to some code, it allows that code to
 * accept connections on, connect to, or listen on any port between
 * 1024 and 65535 on the local host.
 *
 * <p>Note: Granting code permission to accept or make connections to remote
 * hosts may be dangerous because malevolent code can then more easily
 * transfer and share confidential data among parties who may not
 * otherwise have access to the data.
 *
 * @see java.security.Permissions
 * @see SocketPermission
 *
 *
 * @author Marianne Mueller
 * @author Roland Schemers
 *
 * @serial exclude
 */
