_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
        @Override public Enumeration<Permission> elements() {

        /**
         * Returns an enumeration of all the Permission objects in the
         * collection.
         *
         * @return an enumeration of all the Permissions.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
        @Override public boolean implies(Permission permission) {

        /**
         * Checks to see if the specified permission is implied by the
         * collection of Permission objects held in this PermissionCollection.
         *
         * @param permission the Permission object to compare.
         *
         * @return true if "permission" is implied by the permissions in
         * the collection, false if not.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
        @Override public void add(Permission permission) {

        /**
         * Adds a permission object to the current collection of permission
         * objects.
         *
         * @param permission the Permission object to add.
         *
         * @exception SecurityException - if this PermissionCollection object
         *                                has been marked readonly
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
        public UnsupportedEmptyCollection() {

        /**
         * Create a read-only empty PermissionCollection object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    private static class UnsupportedEmptyCollection

    /**
     * This class represents a read-only empty PermissionCollection object that
     * is returned from the {@code getPermissions(CodeSource)} and
     * {@code getPermissions(ProtectionDomain)}
     * methods in the Policy class when those operations are not
     * supported by the Policy implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public static interface Parameters { }

    /**
     * This represents a marker interface for Policy parameters.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    private static class PolicyDelegate extends Policy {

    /**
     * This subclass is returned by the getInstance calls.  All Policy calls
     * are delegated to the underlying PolicySpi.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public void refresh() { }

    /**
     * Refreshes/reloads the policy configuration. The behavior of this method
     * depends on the implementation. For example, calling {@code refresh}
     * on a file-based policy will cause the file to be re-read.
     *
     * <p> The default implementation of this method does nothing.
     * This method should be overridden if a refresh operation is supported
     * by the policy implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public boolean implies(ProtectionDomain domain, Permission permission) {

    /**
     * Evaluates the global policy for the permissions granted to
     * the ProtectionDomain and tests whether the permission is
     * granted.
     *
     * @param domain the ProtectionDomain to test
     * @param permission the Permission object to be tested for implication.
     *
     * @return true if "permission" is a proper subset of a permission
     * granted to this ProtectionDomain.
     *
     * @see java.security.ProtectionDomain
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    private void addStaticPerms(PermissionCollection perms,
                                PermissionCollection statics) {

    /**
     * add static permissions to provided permission collection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public PermissionCollection getPermissions(ProtectionDomain domain) {

    /**
     * Return a PermissionCollection object containing the set of
     * permissions granted to the specified ProtectionDomain.
     *
     * <p> Applications are discouraged from calling this method
     * since this operation may not be supported by all policy implementations.
     * Applications should rely on the {@code implies} method
     * to perform policy checks.
     *
     * <p> The default implementation of this method first retrieves
     * the permissions returned via {@code getPermissions(CodeSource)}
     * (the CodeSource is taken from the specified ProtectionDomain),
     * as well as the permissions located inside the specified ProtectionDomain.
     * All of these permissions are then combined and returned in a new
     * PermissionCollection object.  If {@code getPermissions(CodeSource)}
     * returns Policy.UNSUPPORTED_EMPTY_COLLECTION, then this method
     * returns the permissions contained inside the specified ProtectionDomain
     * in a new PermissionCollection object.
     *
     * <p> This method can be overridden if the policy implementation
     * supports returning a set of permissions granted to a ProtectionDomain.
     *
     * @param domain the ProtectionDomain to which the returned
     *          PermissionCollection has been granted.
     *
     * @return a set of permissions granted to the specified ProtectionDomain.
     *          If this operation is supported, the returned
     *          set of permissions must be a new mutable instance
     *          and it must support heterogeneous Permission types.
     *          If this operation is not supported,
     *          Policy.UNSUPPORTED_EMPTY_COLLECTION is returned.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public PermissionCollection getPermissions(CodeSource codesource) {

    /**
     * Return a PermissionCollection object containing the set of
     * permissions granted to the specified CodeSource.
     *
     * <p> Applications are discouraged from calling this method
     * since this operation may not be supported by all policy implementations.
     * Applications should solely rely on the {@code implies} method
     * to perform policy checks.  If an application absolutely must call
     * a getPermissions method, it should call
     * {@code getPermissions(ProtectionDomain)}.
     *
     * <p> The default implementation of this method returns
     * Policy.UNSUPPORTED_EMPTY_COLLECTION.  This method can be
     * overridden if the policy implementation can return a set of
     * permissions granted to a CodeSource.
     *
     * @param codesource the CodeSource to which the returned
     *          PermissionCollection has been granted.
     *
     * @return a set of permissions granted to the specified CodeSource.
     *          If this operation is supported, the returned
     *          set of permissions must be a new mutable instance
     *          and it must support heterogeneous Permission types.
     *          If this operation is not supported,
     *          Policy.UNSUPPORTED_EMPTY_COLLECTION is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public Policy.Parameters getParameters() {

    /**
     * Return Policy parameters.
     *
     * <p> This Policy instance will only have parameters if it
     * was obtained via a call to {@code Policy.getInstance}.
     * Otherwise this method returns null.
     *
     * @return Policy parameters, or null.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public String getType() {

    /**
     * Return the type of this Policy.
     *
     * <p> This Policy instance will only have a type if it
     * was obtained via a call to {@code Policy.getInstance}.
     * Otherwise this method returns null.
     *
     * @return the type of this Policy, or null.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public Provider getProvider() {

    /**
     * Return the Provider of this Policy.
     *
     * <p> This Policy instance will only have a Provider if it
     * was obtained via a call to {@code Policy.getInstance}.
     * Otherwise this method returns null.
     *
     * @return the Provider of this Policy, or null.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public static Policy getInstance(String type,
                                Policy.Parameters params,
                                Provider provider)

    /**
     * Returns a Policy object of the specified type.
     *
     * <p> A new Policy object encapsulating the
     * PolicySpi implementation from the specified Provider
     * object is returned.  Note that the specified Provider object
     * does not have to be registered in the provider list.
     *
     * @param type the specified Policy type.  See the Policy section in the
     *    <a href=
     *    "{@docRoot}/../technotes/guides/security/StandardNames.html#Policy">
     *    Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     *    for a list of standard Policy types.
     *
     * @param params parameters for the Policy, which may be null.
     *
     * @param provider the Provider.
     *
     * @return the new Policy object.
     *
     * @exception SecurityException if the caller does not have permission
     *          to get a Policy instance for the specified type.
     *
     * @exception NullPointerException if the specified type is null.
     *
     * @exception IllegalArgumentException if the specified Provider is null,
     *          or if the specified parameters are not understood by
     *          the PolicySpi implementation from the specified Provider.
     *
     * @exception NoSuchAlgorithmException if the specified Provider does not
     *          support a PolicySpi implementation for the specified type.
     *
     * @see Provider
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public static Policy getInstance(String type,
                                Policy.Parameters params,
                                String provider)

    /**
     * Returns a Policy object of the specified type.
     *
     * <p> A new Policy object encapsulating the
     * PolicySpi implementation from the specified provider
     * is returned.   The specified provider must be registered
     * in the provider list.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param type the specified Policy type.  See the Policy section in the
     *    <a href=
     *    "{@docRoot}/../technotes/guides/security/StandardNames.html#Policy">
     *    Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     *    for a list of standard Policy types.
     *
     * @param params parameters for the Policy, which may be null.
     *
     * @param provider the provider.
     *
     * @return the new Policy object.
     *
     * @exception SecurityException if the caller does not have permission
     *          to get a Policy instance for the specified type.
     *
     * @exception NullPointerException if the specified type is null.
     *
     * @exception IllegalArgumentException if the specified provider
     *          is null or empty,
     *          or if the specified parameters are not understood by
     *          the PolicySpi implementation from the specified provider.
     *
     * @exception NoSuchProviderException if the specified provider is not
     *          registered in the security provider list.
     *
     * @exception NoSuchAlgorithmException if the specified provider does not
     *          support a PolicySpi implementation for the specified type.
     *
     * @see Provider
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public static Policy getInstance(String type, Policy.Parameters params)

    /**
     * Returns a Policy object of the specified type.
     *
     * <p> This method traverses the list of registered security providers,
     * starting with the most preferred Provider.
     * A new Policy object encapsulating the
     * PolicySpi implementation from the first
     * Provider that supports the specified type is returned.
     *
     * <p> Note that the list of registered providers may be retrieved via
     * the {@link Security#getProviders() Security.getProviders()} method.
     *
     * @param type the specified Policy type.  See the Policy section in the
     *    <a href=
     *    "{@docRoot}/../technotes/guides/security/StandardNames.html#Policy">
     *    Java Cryptography Architecture Standard Algorithm Name Documentation</a>
     *    for a list of standard Policy types.
     *
     * @param params parameters for the Policy, which may be null.
     *
     * @return the new Policy object.
     *
     * @exception SecurityException if the caller does not have permission
     *          to get a Policy instance for the specified type.
     *
     * @exception NullPointerException if the specified type is null.
     *
     * @exception IllegalArgumentException if the specified parameters
     *          are not understood by the PolicySpi implementation
     *          from the selected Provider.
     *
     * @exception NoSuchAlgorithmException if no Provider supports a PolicySpi
     *          implementation for the specified type.
     *
     * @see Provider
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    private static void initPolicy (final Policy p) {

    /**
     * Initialize superclass state such that a legacy provider can
     * handle queries for itself.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public static void setPolicy(Policy p)

    /**
     * Sets the system-wide Policy object. This method first calls
     * {@code SecurityManager.checkPermission} with a
     * {@code SecurityPermission("setPolicy")}
     * permission to ensure it's ok to set the Policy.
     *
     * @param p the new system Policy object.
     *
     * @throws SecurityException
     *        if a security manager exists and its
     *        {@code checkPermission} method doesn't allow
     *        setting the Policy.
     *
     * @see SecurityManager#checkPermission(Permission)
     * @see #getPolicy()
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    static Policy getPolicyNoCheck()

    /**
     * Returns the installed Policy object, skipping the security check.
     * Used by ProtectionDomain and getPolicy.
     *
     * @return the installed Policy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public static Policy getPolicy()

    /**
     * Returns the installed Policy object. This value should not be cached,
     * as it may be changed by a call to {@code setPolicy}.
     * This method first calls
     * {@code SecurityManager.checkPermission} with a
     * {@code SecurityPermission("getPolicy")} permission
     * to ensure it's ok to get the Policy object.
     *
     * @return the installed Policy.
     *
     * @throws SecurityException
     *        if a security manager exists and its
     *        {@code checkPermission} method doesn't allow
     *        getting the Policy object.
     *
     * @see SecurityManager#checkPermission(Permission)
     * @see #setPolicy(java.security.Policy)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    static boolean isSet()

    /** package private for AccessControlContext and ProtectionDomain */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
    public static final PermissionCollection UNSUPPORTED_EMPTY_COLLECTION =

    /**
     * A read-only empty PermissionCollection instance.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Policy.java
public abstract class Policy {

/**
 * A Policy object is responsible for determining whether code executing
 * in the Java runtime environment has permission to perform a
 * security-sensitive operation.
 *
 * <p> There is only one Policy object installed in the runtime at any
 * given time.  A Policy object can be installed by calling the
 * {@code setPolicy} method.  The installed Policy object can be
 * obtained by calling the {@code getPolicy} method.
 *
 * <p> If no Policy object has been installed in the runtime, a call to
 * {@code getPolicy} installs an instance of the default Policy
 * implementation (a default subclass implementation of this abstract class).
 * The default Policy implementation can be changed by setting the value
 * of the {@code policy.provider} security property to the fully qualified
 * name of the desired Policy subclass implementation.
 *
 * <p> Application code can directly subclass Policy to provide a custom
 * implementation.  In addition, an instance of a Policy object can be
 * constructed by invoking one of the {@code getInstance} factory methods
 * with a standard type.  The default policy type is "JavaPolicy".
 *
 * <p> Once a Policy instance has been installed (either by default, or by
 * calling {@code setPolicy}), the Java runtime invokes its
 * {@code implies} method when it needs to
 * determine whether executing code (encapsulated in a ProtectionDomain)
 * can perform SecurityManager-protected operations.  How a Policy object
 * retrieves its policy data is up to the Policy implementation itself.
 * The policy data may be stored, for example, in a flat ASCII file,
 * in a serialized binary file of the Policy class, or in a database.
 *
 * <p> The {@code refresh} method causes the policy object to
 * refresh/reload its data.  This operation is implementation-dependent.
 * For example, if the policy object stores its data in configuration files,
 * calling {@code refresh} will cause it to re-read the configuration
 * policy files.  If a refresh operation is not supported, this method does
 * nothing.  Note that refreshed policy may not have an effect on classes
 * in a particular ProtectionDomain. This is dependent on the Policy
 * provider's implementation of the {@code implies}
 * method and its PermissionCollection caching strategy.
 *
 * @author Roland Schemers
 * @author Gary Ellison
 * @see java.security.Provider
 * @see java.security.ProtectionDomain
 * @see java.security.Permission
 * @see java.security.Security security properties
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
    public abstract void refresh();

    /**
     * Refresh and reload the Policy.
     *
     * <p>This method causes this object to refresh/reload its current
     * Policy. This is implementation-dependent.
     * For example, if the Policy object is stored in
     * a file, calling {@code refresh} will cause the file to be re-read.
     *
     * <p>
     *
     * @exception SecurityException if the caller does not have permission
     *                          to refresh the Policy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
    public abstract java.security.PermissionCollection getPermissions

    /**
     * Retrieve the Permissions granted to the Principals associated with
     * the specified {@code CodeSource}.
     *
     * <p>
     *
     * @param subject the {@code Subject}
     *                  whose associated Principals,
     *                  in conjunction with the provided
     *                  {@code CodeSource}, determines the Permissions
     *                  returned by this method.  This parameter
     *                  may be {@code null}. <p>
     *
     * @param cs the code specified by its {@code CodeSource}
     *                  that determines, in conjunction with the provided
     *                  {@code Subject}, the Permissions
     *                  returned by this method.  This parameter may be
     *                  {@code null}.
     *
     * @return the Collection of Permissions granted to all the
     *                  {@code Subject} and code specified in
     *                  the provided <i>subject</i> and <i>cs</i>
     *                  parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
    static boolean isCustomPolicySet(Debug debug) {

    /**
     * Returns true if a custom (not AUTH_POLICY) system-wide policy object
     * has been set or installed. This method is called by
     * SubjectDomainCombiner to provide backwards compatibility for
     * developers that provide their own javax.security.auth.Policy
     * implementations.
     *
     * @return true if a custom (not AUTH_POLICY) system-wide policy object
     * has been set; false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
    public static void setPolicy(Policy policy) {

    /**
     * Sets the system-wide Policy object. This method first calls
     * {@code SecurityManager.checkPermission} with the
     * {@code AuthPermission("setPolicy")}
     * permission to ensure the caller has permission to set the Policy.
     *
     * <p>
     *
     * @param policy the new system Policy object.
     *
     * @exception java.lang.SecurityException if the current thread does not
     *          have permission to set the Policy.
     *
     * @see #getPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
    static Policy getPolicyNoCheck() {

    /**
     * Returns the installed Policy object, skipping the security check.
     *
     * @return the installed Policy.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
    public static Policy getPolicy() {

    /**
     * Returns the installed Policy object.
     * This method first calls
     * {@code SecurityManager.checkPermission} with the
     * {@code AuthPermission("getPolicy")} permission
     * to ensure the caller has permission to get the Policy object.
     *
     * <p>
     *
     * @return the installed Policy.  The return value cannot be
     *          {@code null}.
     *
     * @exception java.lang.SecurityException if the current thread does not
     *      have permission to get the Policy object.
     *
     * @see #setPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
    protected Policy() { }

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Policy.java
@Deprecated

/**
 * <p> This is an abstract class for representing the system policy for
 * Subject-based authorization.  A subclass implementation
 * of this class provides a means to specify a Subject-based
 * access control {@code Policy}.
 *
 * <p> A {@code Policy} object can be queried for the set of
 * Permissions granted to code running as a
 * {@code Principal} in the following manner:
 *
 * <pre>
 *      policy = Policy.getPolicy();
 *      PermissionCollection perms = policy.getPermissions(subject,
 *                                                      codeSource);
 * </pre>
 *
 * The {@code Policy} object consults the local policy and returns
 * and appropriate {@code Permissions} object with the
 * Permissions granted to the Principals associated with the
 * provided <i>subject</i>, and granted to the code specified
 * by the provided <i>codeSource</i>.
 *
 * <p> A {@code Policy} contains the following information.
 * Note that this example only represents the syntax for the default
 * {@code Policy} implementation. Subclass implementations of this class
 * may implement alternative syntaxes and may retrieve the
 * {@code Policy} from any source such as files, databases,
 * or servers.
 *
 * <p> Each entry in the {@code Policy} is represented as
 * a <b><i>grant</i></b> entry.  Each <b><i>grant</i></b> entry
 * specifies a codebase, code signers, and Principals triplet,
 * as well as the Permissions granted to that triplet.
 *
 * <pre>
 *      grant CodeBase ["URL"], Signedby ["signers"],
 *            Principal [Principal_Class] "Principal_Name" {
 *          Permission Permission_Class ["Target_Name"]
 *                                      [, "Permission_Actions"]
 *                                      [, signedBy "SignerName"];
 *      };
 * </pre>
 *
 * The CodeBase and Signedby components of the triplet name/value pairs
 * are optional.  If they are not present, then any any codebase will match,
 * and any signer (including unsigned code) will match.
 * For Example,
 *
 * <pre>
 *      grant CodeBase "foo.com", Signedby "foo",
 *            Principal com.sun.security.auth.SolarisPrincipal "duke" {
 *          permission java.io.FilePermission "/home/duke", "read, write";
 *      };
 * </pre>
 *
 * This <b><i>grant</i></b> entry specifies that code from "foo.com",
 * signed by "foo', and running as a {@code SolarisPrincipal} with the
 * name, duke, has one {@code Permission}.  This {@code Permission}
 * permits the executing code to read and write files in the directory,
 * "/home/duke".
 *
 * <p> To "run" as a particular {@code Principal},
 * code invokes the {@code Subject.doAs(subject, ...)} method.
 * After invoking that method, the code runs as all the Principals
 * associated with the specified {@code Subject}.
 * Note that this {@code Policy} (and the Permissions
 * granted in this {@code Policy}) only become effective
 * after the call to {@code Subject.doAs} has occurred.
 *
 * <p> Multiple Principals may be listed within one <b><i>grant</i></b> entry.
 * All the Principals in the grant entry must be associated with
 * the {@code Subject} provided to {@code Subject.doAs}
 * for that {@code Subject} to be granted the specified Permissions.
 *
 * <pre>
 *      grant Principal com.sun.security.auth.SolarisPrincipal "duke",
 *            Principal com.sun.security.auth.SolarisNumericUserPrincipal "0" {
 *          permission java.io.FilePermission "/home/duke", "read, write";
 *          permission java.net.SocketPermission "duke.com", "connect";
 *      };
 * </pre>
 *
 * This entry grants any code running as both "duke" and "0"
 * permission to read and write files in duke's home directory,
 * as well as permission to make socket connections to "duke.com".
 *
 * <p> Note that non Principal-based grant entries are not permitted
 * in this {@code Policy}.  Therefore, grant entries such as:
 *
 * <pre>
 *      grant CodeBase "foo.com", Signedby "foo" {
 *          permission java.io.FilePermission "/tmp/scratch", "read, write";
 *      };
 * </pre>
 *
 * are rejected.  Such permission must be listed in the
 * {@code java.security.Policy}.
 *
 * <p> The default {@code Policy} implementation can be changed by
 * setting the value of the {@code auth.policy.provider} security property to
 * the fully qualified name of the desired {@code Policy} implementation class.
 *
 * @deprecated  as of JDK version 1.4 -- Replaced by java.security.Policy.
 *              java.security.Policy has a method:
 * <pre>
 *      public PermissionCollection getPermissions
 *          (java.security.ProtectionDomain pd)
 *
 * </pre>
 * and ProtectionDomain has a constructor:
 * <pre>
 *      public ProtectionDomain
 *          (CodeSource cs,
 *           PermissionCollection permissions,
 *           ClassLoader loader,
 *           Principal[] principals)
 * </pre>
 *
 * These two APIs provide callers the means to query the
 * Policy for Principal-based Permission entries.
 *
 * @see java.security.Security security properties
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Policy.java
public interface Policy extends PolicyOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity

/**
* Interfaces derived from the <tt>Policy</tt> interface allow an
* ORB or CORBA service  access to certain choices that affect
* its operation. This information is accessed in a structured
* manner using interfaces derived from the <tt>Policy</tt>
* interface defined in the CORBA module. A CORBA service does not
* have to use this method of accessing operating options, but
* may choose to do so. The Security Service in particular uses
* this technique for associating Security Policy with objects
* in the system.
* An interface generated by the IDL-to-Java compiler.
* org/omg/CORBA/Policy.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../src/share/classes/org/omg/PortableServer/corba.idl
* Saturday, July 17, 1999 12:26:20 AM PDT
*/
