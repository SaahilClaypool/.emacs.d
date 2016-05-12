_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerPermission.java
    private MBeanServerPermission collectionPermission;

    /** @serial Null if no permissions in collection, otherwise a
        single permission that is the union of all permissions that
        have been added.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerPermission.java
/*

/**
 * Class returned by {@link MBeanServerPermission#newPermissionCollection()}.
 *
 * @serial include
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerPermission.java
    public boolean equals(Object obj) {

    /**
     * Checks two MBeanServerPermission objects for equality. Checks that
     * <i>obj</i> is an MBeanServerPermission, and represents the same
     * list of allowable actions as this object.
     * <P>
     * @param obj the object we are testing for equality with this object.
     * @return true if the objects are equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerPermission.java
    public boolean implies(Permission p) {

    /**
     * <p>Checks if this MBeanServerPermission object "implies" the specified
     * permission.</p>
     *
     * <p>More specifically, this method returns true if:</p>
     *
     * <ul>
     * <li> <i>p</i> is an instance of MBeanServerPermission,</li>
     * <li> <i>p</i>'s target names are a subset of this object's target
     * names</li>
     * </ul>
     *
     * <p>The <code>createMBeanServer</code> permission implies the
     * <code>newMBeanServer</code> permission.</p>
     *
     * @param p the permission to check against.
     * @return true if the specified permission is implied by this object,
     * false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerPermission.java
    public MBeanServerPermission(String name, String actions) {

    /** <p>Create a new MBeanServerPermission with the given name.</p>
        @param name the name of the granted permission.  It must
        respect the constraints spelt out in the description of the
        {@link MBeanServerPermission} class.
        @param actions the associated actions.  This parameter is not
        currently used and must be null or the empty string.
        @exception NullPointerException if the name is null.
        @exception IllegalArgumentException if the name is not
        <code>*</code> or one of the allowed names or a comma-separated
        list of the allowed names, or if <code>actions</code> is a non-null
        non-empty string.
     *
     * @throws NullPointerException if <code>name</code> is <code>null</code>.
     * @throws IllegalArgumentException if <code>name</code> is empty or
     * if arguments are invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerPermission.java
    public MBeanServerPermission(String name) {

    /** <p>Create a new MBeanServerPermission with the given name.</p>
        <p>This constructor is equivalent to
        <code>MBeanServerPermission(name,null)</code>.</p>
        @param name the name of the granted permission.  It must
        respect the constraints spelt out in the description of the
        {@link MBeanServerPermission} class.
        @exception NullPointerException if the name is null.
        @exception IllegalArgumentException if the name is not
        <code>*</code> or one of the allowed names or a comma-separated
        list of the allowed names.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerPermission.java
public class MBeanServerPermission extends BasicPermission {

/** A Permission to perform actions related to MBeanServers.
    The <em>name</em> of the permission specifies the operation requested
    or granted by the permission.  For a granted permission, it can be
    <code>*</code> to allow all of the MBeanServer operations specified below.
    Otherwise, for a granted or requested permission, it must be one of the
    following:
    <dl>
    <dt>createMBeanServer</dt>
    <dd>Create a new MBeanServer object using the method
    {@link MBeanServerFactory#createMBeanServer()} or
    {@link MBeanServerFactory#createMBeanServer(java.lang.String)}.
    <dt>findMBeanServer</dt>
    <dd>Find an MBeanServer with a given name, or all MBeanServers in this
    JVM, using the method {@link MBeanServerFactory#findMBeanServer}.
    <dt>newMBeanServer</dt>
    <dd>Create a new MBeanServer object without keeping a reference to it,
    using the method {@link MBeanServerFactory#newMBeanServer()} or
    {@link MBeanServerFactory#newMBeanServer(java.lang.String)}.
    <dt>releaseMBeanServer</dt>
    <dd>Remove the MBeanServerFactory's reference to an MBeanServer,
    using the method {@link MBeanServerFactory#releaseMBeanServer}.
    </dl>
    The <em>name</em> of the permission can also denote a list of one or more
    comma-separated operations.  Spaces are allowed at the beginning and
    end of the <em>name</em> and before and after commas.
    <p>
    <code>MBeanServerPermission("createMBeanServer")</code> implies
    <code>MBeanServerPermission("newMBeanServer")</code>.
 *
 * @since 1.5
 */
