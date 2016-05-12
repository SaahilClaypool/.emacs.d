_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    /*

    /**
     * @serialData "permissions" field (a Vector containing the ServicePermissions).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Vector
     *     A list of ServicePermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the ServicePermission objects
     * in the container.
     *
     * @return an enumeration of all the ServicePermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the ServicePermissions. The key for
     * the hash is the name.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       ServicePermission
     *
     * @exception SecurityException - if this PermissionCollection object
     *                                has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public boolean implies(Permission permission) {

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
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * readObject is called to restore the state of the
     * ServicePermission from a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * WriteObject is called to save the state of the ServicePermission
     * to a stream. The actions are serialized, and the superclass
     * takes care of the name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private static int getMask(String action) {

    /**
     * Convert an action string to an integer actions mask.
     *
     * Note: if action is "-", action will be NONE, which means any
     * action implies it.
     *
     * @param action the action string.
     * @return the action mask
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    int getMask() {

    /**
     * Return the current action mask.
     *
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a PermissionCollection object for storing
     * ServicePermission objects.
     * <br>
     * ServicePermission objects must be stored in a manner that
     * allows them to be inserted into the collection in any order, but
     * that also enables the PermissionCollection implies method to
     * be implemented in an efficient (and consistent) manner.
     *
     * @return a new PermissionCollection object suitable for storing
     * ServicePermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public String getActions() {

    /**
     * Returns the canonical string representation of the actions.
     * Always returns present actions in the following order:
     * initiate, accept.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private static String getActions(int mask)

    /**
     * Returns the "canonical string representation" of the actions in the
     * specified mask.
     * Always returns present actions in the following order:
     * initiate, accept.
     *
     * @param mask a specific integer action mask to translate into a string
     * @return the canonical string representation of the actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two ServicePermission objects for equality.
     * <P>
     * @param obj the object to test for equality with this object.
     *
     * @return true if <i>obj</i> is a ServicePermission, and has the
     *  same service principal, and actions as this
     * ServicePermission object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if this Kerberos service permission object "implies" the
     * specified permission.
     * <P>
     * If none of the above are true, {@code implies} returns false.
     * @param p the permission to check against.
     *
     * @return true if the specified permission is implied by this object,
     * false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private void init(String servicePrincipal, int mask) {

    /**
     * Initialize the ServicePermission object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    public ServicePermission(String servicePrincipal, String action) {

    /**
     * Create a new {@code ServicePermission}
     * with the specified {@code servicePrincipal}
     * and {@code action}.
     *
     * @param servicePrincipal the name of the service principal.
     * An asterisk may appear by itself, to signify any service principal.
     * <p>
     * @param action the action string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private String actions; // Left null as long as possible, then

    /**
     * the actions string.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private final static int NONE    = 0x0;

    /**
     * No actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private final static int ALL        = INITIATE|ACCEPT;

    /**
     * All actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private final static int ACCEPT     = 0x2;

    /**
     * Accept a security context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
    private final static int INITIATE   = 0x1;

    /**
     * Initiate a security context to the specified service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/ServicePermission.java
public final class ServicePermission extends Permission

/**
 * This class is used to protect Kerberos services and the
 * credentials necessary to access those services. There is a one to
 * one mapping of a service principal and the credentials necessary
 * to access the service. Therefore granting access to a service
 * principal implicitly grants access to the credential necessary to
 * establish a security context with the service principal. This
 * applies regardless of whether the credentials are in a cache
 * or acquired via an exchange with the KDC. The credential can
 * be either a ticket granting ticket, a service ticket or a secret
 * key from a key table.
 * <p>
 * A ServicePermission contains a service principal name and
 * a list of actions which specify the context the credential can be
 * used within.
 * <p>
 * The service principal name is the canonical name of the
 * {@code KerberosPrincipal} supplying the service, that is
 * the KerberosPrincipal represents a Kerberos service
 * principal. This name is treated in a case sensitive manner.
 * An asterisk may appear by itself, to signify any service principal.
 * <p>
 * Granting this permission implies that the caller can use a cached
 * credential (TGT, service ticket or secret key) within the context
 * designated by the action. In the case of the TGT, granting this
 * permission also implies that the TGT can be obtained by an
 * Authentication Service exchange.
 * <p>
 * The possible actions are:
 *
 * <pre>
 *    initiate -              allow the caller to use the credential to
 *                            initiate a security context with a service
 *                            principal.
 *
 *    accept -                allow the caller to use the credential to
 *                            accept security context as a particular
 *                            principal.
 * </pre>
 *
 * For example, to specify the permission to access to the TGT to
 * initiate a security context the permission is constructed as follows:
 *
 * <pre>
 *     ServicePermission("krbtgt/EXAMPLE.COM@EXAMPLE.COM", "initiate");
 * </pre>
 * <p>
 * To obtain a service ticket to initiate a context with the "host"
 * service the permission is constructed as follows:
 * <pre>
 *     ServicePermission("host/foo.example.com@EXAMPLE.COM", "initiate");
 * </pre>
 * <p>
 * For a Kerberized server the action is "accept". For example, the permission
 * necessary to access and use the secret key of the  Kerberized "host"
 * service (telnet and the likes)  would be constructed as follows:
 *
 * <pre>
 *     ServicePermission("host/foo.example.com@EXAMPLE.COM", "accept");
 * </pre>
 *
 * @since 1.4
 */
