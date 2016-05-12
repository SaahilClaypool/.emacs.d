_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    /*

    /**
     * @serialData Default fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField perms java.util.Hashtable
     *     A table of the Permissions (both key and value are same).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the Permission objects in the container.
     *
     * @return an enumeration of all the Permissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the PermissionsHash.
     *
     * @param permission the Permission object to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    PermissionsHash() {

    /**
     * Create an empty PermissionsHash object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    private transient Map<Permission, Permission> permsMap;

    /**
     * Key and value are (same) permissions objects.
     * Not serialized; see serialization section at end of class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
final class PermissionsHash extends PermissionCollection

/**
 * A PermissionsHash stores a homogeneous set of permissions in a hashtable.
 *
 * @see Permission
 * @see Permissions
 *
 *
 * @author Roland Schemers
 *
 * @serial include
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    /*

    /**
     * @serialData Default fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField perms java.util.Hashtable
     *     A table of the Permission classes and PermissionCollections.
     * @serialField allPermission java.security.PermissionCollection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    private PermissionCollection getUnresolvedPermissions(Permission p)

    /**
     * Resolves any unresolved permissions of type p.
     *
     * @param p the type of unresolved permission to resolve
     *
     * @return PermissionCollection containing the unresolved permissions,
     *  or null if there were no unresolved permissions of type p.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    private PermissionCollection getPermissionCollection(Permission p,
        boolean createEmpty) {

    /**
     * Gets the PermissionCollection in this Permissions object for
     * permissions whose type is the same as that of <i>p</i>.
     * For example, if <i>p</i> is a FilePermission,
     * the FilePermissionCollection
     * stored in this Permissions object will be returned.
     *
     * If createEmpty is true,
     * this method creates a new PermissionCollection object for the specified
     * type of permission objects if one does not yet exist.
     * To do so, it first calls the {@code newPermissionCollection} method
     * on <i>p</i>.  Subclasses of class Permission
     * override that method if they need to store their permissions in a
     * particular PermissionCollection object in order to provide the
     * correct semantics when the {@code PermissionCollection.implies}
     * method is called.
     * If the call returns a PermissionCollection, that collection is stored
     * in this Permissions object. If the call returns null and createEmpty
     * is true, then
     * this method instantiates and stores a default PermissionCollection
     * that uses a hashtable to store its permission objects.
     *
     * createEmpty is ignored when creating empty PermissionCollection
     * for unresolved permissions because of the overhead of determining the
     * PermissionCollection to use.
     *
     * createEmpty should be set to false when this method is invoked from
     * implies() because it incurs the additional overhead of creating and
     * adding an empty PermissionCollection that will just return false.
     * It should be set to true when invoked from add().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the Permission objects in all the
     * PermissionCollections in this Permissions object.
     *
     * @return an enumeration of all the Permissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    public boolean implies(Permission permission) {

    /**
     * Checks to see if this object's PermissionCollection for permissions of
     * the specified permission's class implies the permissions
     * expressed in the <i>permission</i> object. Returns true if the
     * combination of permissions in the appropriate PermissionCollection
     * (e.g., a FilePermissionCollection for a FilePermission) together
     * imply the specified permission.
     *
     * <p>For example, suppose there is a FilePermissionCollection in this
     * Permissions object, and it contains one FilePermission that specifies
     * "read" access for  all files in all subdirectories of the "/tmp"
     * directory, and another FilePermission that specifies "write" access
     * for all files in the "/tmp/scratch/foo" directory.
     * Then if the {@code implies} method
     * is called with a permission specifying both "read" and "write" access
     * to files in the "/tmp/scratch/foo" directory, {@code true} is
     * returned.
     *
     * <p>Additionally, if this PermissionCollection contains the
     * AllPermission, this method will always return true.
     * <p>
     * @param permission the Permission object to check.
     *
     * @return true if "permission" is implied by the permissions in the
     * PermissionCollection it
     * belongs to, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    public void add(Permission permission) {

    /**
     * Adds a permission object to the PermissionCollection for the class the
     * permission belongs to. For example, if <i>permission</i> is a
     * FilePermission, it is added to the FilePermissionCollection stored
     * in this Permissions object.
     *
     * This method creates
     * a new PermissionCollection object (and adds the permission to it)
     * if an appropriate collection does not yet exist. <p>
     *
     * @param permission the Permission object to add.
     *
     * @exception SecurityException if this Permissions object is
     * marked as readonly.
     *
     * @see PermissionCollection#isReadOnly()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    public Permissions() {

    /**
     * Creates a new Permissions object containing no PermissionCollections.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
    private transient Map<Class<?>, PermissionCollection> permsMap;

    /**
     * Key is permissions Class, value is PermissionCollection for that class.
     * Not serialized; see serialization section at end of class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Permissions.java
public final class Permissions extends PermissionCollection

/**
 * This class represents a heterogeneous collection of Permissions. That is,
 * it contains different types of Permission objects, organized into
 * PermissionCollections. For example, if any
 * {@code java.io.FilePermission} objects are added to an instance of
 * this class, they are all stored in a single
 * PermissionCollection. It is the PermissionCollection returned by a call to
 * the {@code newPermissionCollection} method in the FilePermission class.
 * Similarly, any {@code java.lang.RuntimePermission} objects are
 * stored in the PermissionCollection returned by a call to the
 * {@code newPermissionCollection} method in the
 * RuntimePermission class. Thus, this class represents a collection of
 * PermissionCollections.
 *
 * <p>When the {@code add} method is called to add a Permission, the
 * Permission is stored in the appropriate PermissionCollection. If no such
 * collection exists yet, the Permission object's class is determined and the
 * {@code newPermissionCollection} method is called on that class to create
 * the PermissionCollection and add it to the Permissions object. If
 * {@code newPermissionCollection} returns null, then a default
 * PermissionCollection that uses a hashtable will be created and used. Each
 * hashtable entry stores a Permission object as both the key and the value.
 *
 * <p> Enumerations returned via the {@code elements} method are
 * not <em>fail-fast</em>.  Modifications to a collection should not be
 * performed while enumerating over that collection.
 *
 * @see Permission
 * @see PermissionCollection
 * @see AllPermission
 *
 *
 * @author Marianne Mueller
 * @author Roland Schemers
 *
 * @serial exclude
 */
