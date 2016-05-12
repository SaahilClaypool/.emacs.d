_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public Enumeration<Permission> elements() {

    /**
     * Returns an enumeration of all the AllPermission objects in the
     * container.
     *
     * @return an enumeration of all the AllPermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public boolean implies(Permission permission) {

    /**
     * Check and see if this set of permissions implies the permissions
     * expressed in "permission".
     *
     * @param permission the Permission object to compare
     *
     * @return always returns true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the AllPermissions. The key for the hash is
     * permission.path.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       AllPermission
     *
     * @exception SecurityException - if this AllPermissionCollection object
     *                                has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public AllPermissionCollection() {

    /**
     * Create an empty AllPermissions object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
final class AllPermissionCollection

/**
 * A AllPermissionCollection stores a collection
 * of AllPermission permissions. AllPermission objects
 * must be stored in a manner that allows them to be inserted in any
 * order, but enable the implies function to evaluate the implies
 * method in an efficient (and consistent) manner.
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a new PermissionCollection object for storing AllPermission
     * objects.
     * <p>
     *
     * @return a new PermissionCollection object suitable for
     * storing AllPermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public String getActions() {

    /**
     * Returns the canonical string representation of the actions.
     *
     * @return the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two AllPermission objects for equality. Two AllPermission
     * objects are always equal.
     *
     * @param obj the object we are testing for equality with this object.
     * @return true if <i>obj</i> is an AllPermission, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if the specified permission is "implied" by
     * this object. This method always returns true.
     *
     * @param p the permission to check against.
     *
     * @return return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public AllPermission(String name, String actions) {

    /**
     * Creates a new AllPermission object. This
     * constructor exists for use by the {@code Policy} object
     * to instantiate new Permission objects.
     *
     * @param name ignored
     * @param actions ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
    public AllPermission() {

    /**
     * Creates a new AllPermission object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AllPermission.java
public final class AllPermission extends Permission {

/**
 * The AllPermission is a permission that implies all other permissions.
 * <p>
 * <b>Note:</b> Granting AllPermission should be done with extreme care,
 * as it implies all other permissions. Thus, it grants code the ability
 * to run with security
 * disabled.  Extreme caution should be taken before granting such
 * a permission to code.  This permission should be used only during testing,
 * or in extremely rare cases where an application or applet is
 * completely trusted and adding the necessary permissions to the policy
 * is prohibitively cumbersome.
 *
 * @see java.security.Permission
 * @see java.security.AccessController
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 * @see java.lang.SecurityManager
 *
 *
 * @author Roland Schemers
 *
 * @serial exclude
 */
