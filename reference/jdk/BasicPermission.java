_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    private void readObject(java.io.ObjectInputStream in)

    /**
     * readObject is called to restore the state of the
     * BasicPermissionCollection from a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    /*

    /**
     * @serialData Default fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Hashtable
     *    The BasicPermissions in this BasicPermissionCollection.
     *    All BasicPermissions in the collection must belong to the same class.
     *    The Hashtable is indexed by the BasicPermission name; the value
     *    of the Hashtable entry is the permission.
     * @serialField all_allowed boolean
     *   This is set to {@code true} if this BasicPermissionCollection
     *   contains a BasicPermission with '*' as its permission name.
     * @serialField permClass java.lang.Class
     *   The class to which all BasicPermissions in this
     *   BasicPermissionCollection belongs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the BasicPermission objects in the
     * container.
     *
     * @return an enumeration of all the BasicPermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public boolean implies(Permission permission) {

    /**
     * Check and see if this set of permissions implies the permissions
     * expressed in "permission".
     *
     * @param permission the Permission object to compare
     *
     * @return true if "permission" is a proper subset of a permission in
     * the set, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the BasicPermissions. The key for the hash is
     * permission.path.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       BasicPermission, or if
     *                                       the permission is not of the
     *                                       same Class as the other
     *                                       permissions in this collection.
     *
     * @exception SecurityException - if this BasicPermissionCollection object
     *                                has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public BasicPermissionCollection(Class<?> clazz) {

    /**
     * Create an empty BasicPermissionCollection object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    private Class<?> permClass;

    /**
     * The class to which all BasicPermissions in this
     * BasicPermissionCollection belongs.
     *
     * @see #serialPersistentFields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    private boolean all_allowed;

    /**
     * This is set to {@code true} if this BasicPermissionCollection
     * contains a BasicPermission with '*' as its permission name.
     *
     * @see #serialPersistentFields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    private transient Map<String, Permission> perms;

    /**
      * Key is name, value is permission. All permission objects in
      * collection must be of the same type.
      * Not serialized; see serialization section at end of class.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
final class BasicPermissionCollection

/**
 * A BasicPermissionCollection stores a collection
 * of BasicPermission permissions. BasicPermission objects
 * must be stored in a manner that allows them to be inserted in any
 * order, but enable the implies function to evaluate the implies
 * method in an efficient (and consistent) manner.
 *
 * A BasicPermissionCollection handles comparing a permission like "a.b.c.d.e"
 * with a Permission such as "a.b.*", or "*".
 *
 * @see java.security.Permission
 * @see java.security.Permissions
 *
 *
 * @author Roland Schemers
 *
 * @serial include
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    final String getCanonicalName() {

    /**
     * Returns the canonical name of this BasicPermission.
     * All internal invocations of getName should invoke this method, so
     * that the pre-JDK 1.6 "exitVM" and current "exitVM.*" permission are
     * equivalent in equals/hashCode methods.
     *
     * @return the canonical name of this BasicPermission.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    private void readObject(ObjectInputStream s)

    /**
     * readObject is called to restore the state of the BasicPermission from
     * a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a new PermissionCollection object for storing BasicPermission
     * objects.
     *
     * <p>BasicPermission objects must be stored in a manner that allows them
     * to be inserted in any order, but that also enables the
     * PermissionCollection {@code implies} method
     * to be implemented in an efficient (and consistent) manner.
     *
     * @return a new PermissionCollection object suitable for
     * storing BasicPermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public String getActions() {

    /**
     * Returns the canonical string representation of the actions,
     * which currently is the empty string "", since there are no actions for
     * a BasicPermission.
     *
     * @return the empty string "".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     * The hash code used is the hash code of the name, that is,
     * {@code getName().hashCode()}, where {@code getName} is
     * from the Permission superclass.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two BasicPermission objects for equality.
     * Checks that <i>obj</i>'s class is the same as this object's class
     * and has the same name as this object.
     * <P>
     * @param obj the object we are testing for equality with this object.
     * @return true if <i>obj</i>'s class is the same as this object's class
     *  and has the same name as this BasicPermission object, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if the specified permission is "implied" by
     * this object.
     * <P>
     * More specifically, this method returns true if:
     * <ul>
     * <li> <i>p</i>'s class is the same as this object's class, and
     * <li> <i>p</i>'s name equals or (in the case of wildcards)
     *      is implied by this object's
     *      name. For example, "a.b.*" implies "a.b.c".
     * </ul>
     *
     * @param p the permission to check against.
     *
     * @return true if the passed permission is equal to or
     * implied by this permission, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public BasicPermission(String name, String actions) {

    /**
     * Creates a new BasicPermission object with the specified name.
     * The name is the symbolic name of the BasicPermission, and the
     * actions String is currently unused.
     *
     * @param name the name of the BasicPermission.
     * @param actions ignored.
     *
     * @throws NullPointerException if {@code name} is {@code null}.
     * @throws IllegalArgumentException if {@code name} is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    public BasicPermission(String name) {

    /**
     * Creates a new BasicPermission with the specified name.
     * Name is the symbolic name of the permission, such as
     * "setFactory",
     * "print.queueJob", or "topLevelWindow", etc.
     *
     * @param name the name of the BasicPermission.
     *
     * @throws NullPointerException if {@code name} is {@code null}.
     * @throws IllegalArgumentException if {@code name} is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
    private void init(String name) {

    /**
     * initialize a BasicPermission object. Common to all constructors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/BasicPermission.java
public abstract class BasicPermission extends Permission

/**
 * The BasicPermission class extends the Permission class, and
 * can be used as the base class for permissions that want to
 * follow the same naming convention as BasicPermission.
 * <P>
 * The name for a BasicPermission is the name of the given permission
 * (for example, "exit",
 * "setFactory", "print.queueJob", etc). The naming
 * convention follows the  hierarchical property naming convention.
 * An asterisk may appear by itself, or if immediately preceded by a "."
 * may appear at the end of the name, to signify a wildcard match.
 * For example, "*" and "java.*" signify a wildcard match, while "*java", "a*b",
 * and "java*" do not.
 * <P>
 * The action string (inherited from Permission) is unused.
 * Thus, BasicPermission is commonly used as the base class for
 * "named" permissions
 * (ones that contain a name but no actions list; you either have the
 * named permission or you don't.)
 * Subclasses may implement actions on top of BasicPermission,
 * if desired.
 * <p>
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 * @see java.lang.SecurityManager
 *
 * @author Marianne Mueller
 * @author Roland Schemers
 */
