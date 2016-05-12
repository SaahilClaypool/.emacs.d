_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    /*

    /**
     * @serialData Default fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField permissions java.util.Hashtable
     *     A table of the PropertyPermissions.
     * @serialField all_allowed boolean
     *     boolean saying if "*" is in the collection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
            return (Enumeration)Collections.enumeration(perms.values());

            /**
             * Casting to rawtype since Enumeration<PropertyPermission>
             * cannot be directly cast to Enumeration<Permission>
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an enumeration of all the PropertyPermission objects in the
     * container.
     *
     * @return an enumeration of all the PropertyPermission objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public void add(Permission permission) {

    /**
     * Adds a permission to the PropertyPermissions. The key for the hash is
     * the name.
     *
     * @param permission the Permission object to add.
     *
     * @exception IllegalArgumentException - if the permission is not a
     *                                       PropertyPermission
     *
     * @exception SecurityException - if this PropertyPermissionCollection
     *                                object has been marked readonly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public PropertyPermissionCollection() {

    /**
     * Create an empty PropertyPermissionCollection object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    // No sync access; OK for this to be stale.

    /**
     * Boolean saying if "*" is in the collection.
     *
     * @see #serialPersistentFields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private transient Map<String, PropertyPermission> perms;

    /**
     * Key is property name; value is PropertyPermission.
     * Not serialized; see serialization section at end of class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
final class PropertyPermissionCollection extends PermissionCollection

/**
 * A PropertyPermissionCollection stores a set of PropertyPermission
 * permissions.
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
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private synchronized void readObject(java.io.ObjectInputStream s)

    /**
     * readObject is called to restore the state of the PropertyPermission from
     * a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private synchronized void writeObject(java.io.ObjectOutputStream s)

    /**
     * WriteObject is called to save the state of the PropertyPermission
     * to a stream. The actions are serialized, and the superclass
     * takes care of the name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public PermissionCollection newPermissionCollection() {

    /**
     * Returns a new PermissionCollection object for storing
     * PropertyPermission objects.
     * <p>
     *
     * @return a new PermissionCollection object suitable for storing
     * PropertyPermissions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    int getMask() {

    /**
     * Return the current action mask.
     * Used by the PropertyPermissionCollection
     *
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public String getActions() {

    /**
     * Returns the "canonical string representation" of the actions.
     * That is, this method always returns present actions in the following order:
     * read, write. For example, if this PropertyPermission object
     * allows both write and read actions, a call to <code>getActions</code>
     * will return the string "read,write".
     *
     * @return the canonical string representation of the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    static String getActions(int mask) {

    /**
     * Return the canonical string representation of the actions.
     * Always returns present actions in the following order:
     * read, write.
     *
     * @return the canonical string representation of the actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private static int getMask(String actions) {

    /**
     * Converts an actions String to an actions mask.
     *
     * @param actions the action string.
     * @return the actions mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public int hashCode() {

    /**
     * Returns the hash code value for this object.
     * The hash code used is the hash code of this permissions name, that is,
     * <code>getName().hashCode()</code>, where <code>getName</code> is
     * from the Permission superclass.
     *
     * @return a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two PropertyPermission objects for equality. Checks that <i>obj</i> is
     * a PropertyPermission, and has the same name and actions as this object.
     * <P>
     * @param obj the object we are testing for equality with this object.
     * @return true if obj is a PropertyPermission, and has the same name and
     * actions as this PropertyPermission object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public boolean implies(Permission p) {

    /**
     * Checks if this PropertyPermission object "implies" the specified
     * permission.
     * <P>
     * More specifically, this method returns true if:
     * <ul>
     * <li> <i>p</i> is an instanceof PropertyPermission,
     * <li> <i>p</i>'s actions are a subset of this
     * object's actions, and
     * <li> <i>p</i>'s name is implied by this object's
     *      name. For example, "java.*" implies "java.home".
     * </ul>
     * @param p the permission to check against.
     *
     * @return true if the specified permission is implied by this object,
     * false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    public PropertyPermission(String name, String actions) {

    /**
     * Creates a new PropertyPermission object with the specified name.
     * The name is the name of the system property, and
     * <i>actions</i> contains a comma-separated list of the
     * desired actions granted on the property. Possible actions are
     * "read" and "write".
     *
     * @param name the name of the PropertyPermission.
     * @param actions the actions string.
     *
     * @throws NullPointerException if <code>name</code> is <code>null</code>.
     * @throws IllegalArgumentException if <code>name</code> is empty or if
     * <code>actions</code> is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private void init(int mask) {

    /**
     * initialize a PropertyPermission object. Common to all constructors.
     * Also called during de-serialization.
     *
     * @param mask the actions mask to use.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private String actions; // Left null as long as possible, then

    /**
     * The actions string.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private transient int mask;

    /**
     * The actions mask.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private final static int NONE    = 0x0;

    /**
     * No actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private final static int WRITE   = 0x2;

    /**
     * Write action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
    private final static int READ    = 0x1;

    /**
     * Read action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/PropertyPermission.java
public final class PropertyPermission extends BasicPermission {

/**
 * This class is for property permissions.
 *
 * <P>
 * The name is the name of the property ("java.home",
 * "os.name", etc). The naming
 * convention follows the  hierarchical property naming convention.
 * Also, an asterisk
 * may appear at the end of the name, following a ".", or by itself, to
 * signify a wildcard match. For example: "java.*" and "*" signify a wildcard
 * match, while "*java" and "a*b" do not.
 * <P>
 * The actions to be granted are passed to the constructor in a string containing
 * a list of one or more comma-separated keywords. The possible keywords are
 * "read" and "write". Their meaning is defined as follows:
 *
 * <DL>
 *    <DT> read
 *    <DD> read permission. Allows <code>System.getProperty</code> to
 *         be called.
 *    <DT> write
 *    <DD> write permission. Allows <code>System.setProperty</code> to
 *         be called.
 * </DL>
 * <P>
 * The actions string is converted to lowercase before processing.
 * <P>
 * Care should be taken before granting code permission to access
 * certain system properties.  For example, granting permission to
 * access the "java.home" system property gives potentially malevolent
 * code sensitive information about the system environment (the Java
 * installation directory).  Also, granting permission to access
 * the "user.name" and "user.home" system properties gives potentially
 * malevolent code sensitive information about the user environment
 * (the user's account name and home directory).
 *
 * @see java.security.BasicPermission
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 * @see java.lang.SecurityManager
 *
 *
 * @author Roland Schemers
 * @since 1.2
 *
 * @serial exclude
 */
