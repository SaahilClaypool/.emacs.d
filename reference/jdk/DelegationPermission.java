_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    /*

    /**
     * @serialData "permissions" field (a Vector containing the DelegationPermissions).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Vector
     *     A list of DelegationPermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the DelegationPermission objects
     * in the container.
     *
     * @return an enumeration of all the DelegationPermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the DelegationPermissions. The key for
     * the hash is the name.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       DelegationPermission
     *
     * @exception SecurityException - if this PermissionCollection object
     *                                has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    private synchronized void readObject(java.io.ObjectInputStream s)

    /**
     * readObject is called to restore the state of the
     * DelegationPermission from a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    private synchronized void writeObject(java.io.ObjectOutputStream s)

    /**
     * WriteObject is called to save the state of the DelegationPermission
     * to a stream. The actions are serialized, and the superclass
     * takes care of the name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a PermissionCollection object for storing
     * DelegationPermission objects.
     * <br>
     * DelegationPermission objects must be stored in a manner that
     * allows them to be inserted into the collection in any order, but
     * that also enables the PermissionCollection implies method to
     * be implemented in an efficient (and consistent) manner.
     *
     * @return a new PermissionCollection object suitable for storing
     * DelegationPermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two DelegationPermission objects for equality.
     * <P>
     * @param obj the object to test for equality with this object.
     *
     * @return true if <i>obj</i> is a DelegationPermission, and
     *  has the same subordinate and service principal as this.
     *  DelegationPermission object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if this Kerberos delegation permission object "implies" the
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
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    private void init(String target) {

    /**
     * Initialize the DelegationPermission object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public DelegationPermission(String principals, String actions) {

    /**
     * Create a new {@code DelegationPermission}
     * with the specified subordinate and target principals.
     * <p>
     *
     * @param principals the name of the subordinate and target principals
     * <p>
     * @param actions should be null.
     *
     * @throws NullPointerException if {@code principals} is {@code null}.
     * @throws IllegalArgumentException if {@code principals} is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
    public DelegationPermission(String principals) {

    /**
     * Create a new {@code DelegationPermission}
     * with the specified subordinate and target principals.
     *
     * <p>
     *
     * @param principals the name of the subordinate and target principals
     *
     * @throws NullPointerException if {@code principals} is {@code null}.
     * @throws IllegalArgumentException if {@code principals} is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/DelegationPermission.java
public final class DelegationPermission extends BasicPermission

/**
 * This class is used to restrict the usage of the Kerberos
 * delegation model, ie: forwardable and proxiable tickets.
 * <p>
 * The target name of this {@code Permission} specifies a pair of
 * kerberos service principals. The first is the subordinate service principal
 * being entrusted to use the TGT. The second service principal designates
 * the target service the subordinate service principal is to
 * interact with on behalf of the initiating KerberosPrincipal. This
 * latter service principal is specified to restrict the use of a
 * proxiable ticket.
 * <p>
 * For example, to specify the "host" service use of a forwardable TGT the
 * target permission is specified as follows:
 *
 * <pre>
 *  DelegationPermission("\"host/foo.example.com@EXAMPLE.COM\" \"krbtgt/EXAMPLE.COM@EXAMPLE.COM\"");
 * </pre>
 * <p>
 * To give the "backup" service a proxiable nfs service ticket the target permission
 * might be specified:
 *
 * <pre>
 *  DelegationPermission("\"backup/bar.example.com@EXAMPLE.COM\" \"nfs/home.EXAMPLE.COM@EXAMPLE.COM\"");
 * </pre>
 *
 * @since 1.4
 */
