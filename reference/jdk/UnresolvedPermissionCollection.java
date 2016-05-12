_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    /*

    /**
     * @serialData Default field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Hashtable
     *     A table of the UnresolvedPermissions keyed on type, value is Vector
     *     of permissions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the UnresolvedPermission lists in the
     * container.
     *
     * @return an enumeration of all the UnresolvedPermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    public boolean implies(Permission permission)

    /**
     * always returns false for unresolved permissions
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    List<UnresolvedPermission> getUnresolvedPermissions(Permission p) {

    /**
     * get any unresolved permissions of the same type as p,
     * and return the List containing them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    public void add(Permission permission)

    /**
     * Adds a permission to this UnresolvedPermissionCollection.
     * The key for the hash is the unresolved permission's type (class) name.
     *
     * @param permission the Permission object to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    public UnresolvedPermissionCollection() {

    /**
     * Create an empty UnresolvedPermissionCollection object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
    private transient Map<String, List<UnresolvedPermission>> perms;

    /**
     * Key is permission type, value is a list of the UnresolvedPermissions
     * of the same type.
     * Not serialized; see serialization section at end of class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/UnresolvedPermissionCollection.java
final class UnresolvedPermissionCollection

/**
 * A UnresolvedPermissionCollection stores a collection
 * of UnresolvedPermission permissions.
 *
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.UnresolvedPermission
 *
 *
 * @author Roland Schemers
 *
 * @serial include
 */
