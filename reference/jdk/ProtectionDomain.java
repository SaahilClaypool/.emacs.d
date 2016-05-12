_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    final class Key {}

    /**
     * Used for storing ProtectionDomains as keys in a Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    private static boolean seeAllp() {

    /**
     * Return true (merge policy permissions) in the following cases:
     *
     * . SecurityManager is null
     *
     * . SecurityManager is not null,
     *          debug is not null,
     *          SecurityManager impelmentation is in bootclasspath,
     *          Policy implementation is in bootclasspath
     *          (the bootclasspath restrictions avoid recursion)
     *
     * . SecurityManager is not null,
     *          debug is null,
     *          caller has Policy.getPolicy permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    @Override public String toString() {

    /**
     * Convert a ProtectionDomain to a String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    public boolean implies(Permission permission) {

    /**
     * Check and see if this ProtectionDomain implies the permissions
     * expressed in the Permission object.
     * <p>
     * The set of permissions evaluated is a function of whether the
     * ProtectionDomain was constructed with a static set of permissions
     * or it was bound to a dynamically mapped set of permissions.
     * <p>
     * If the ProtectionDomain was constructed to a
     * {@link #ProtectionDomain(CodeSource, PermissionCollection)
     * statically bound} PermissionCollection then the permission will
     * only be checked against the PermissionCollection supplied at
     * construction.
     * <p>
     * However, if the ProtectionDomain was constructed with
     * the constructor variant which supports
     * {@link #ProtectionDomain(CodeSource, PermissionCollection,
     * ClassLoader, java.security.Principal[]) dynamically binding}
     * permissions, then the permission will be checked against the
     * combination of the PermissionCollection supplied at construction and
     * the current Policy binding.
     * <p>
     *
     * @param permission the Permission object to check.
     *
     * @return true if "permission" is implicit to this ProtectionDomain.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    public final PermissionCollection getPermissions() {

    /**
     * Returns the static permissions granted to this domain.
     *
     * @return the static set of permissions for this domain which may be null.
     * @see Policy#refresh
     * @see Policy#getPermissions(ProtectionDomain)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    public final Principal[] getPrincipals() {

    /**
     * Returns an array of principals for this domain.
     * @return a non-null array of principals for this domain.
     * Returns a new array each time this method is called.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    public final ClassLoader getClassLoader() {

    /**
     * Returns the ClassLoader of this domain.
     * @return the ClassLoader of this domain which may be null.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    public final CodeSource getCodeSource() {

    /**
     * Returns the CodeSource of this domain.
     * @return the CodeSource of this domain which may be null.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    public ProtectionDomain(CodeSource codesource,
                            PermissionCollection permissions,
                            ClassLoader classloader,
                            Principal[] principals) {

    /**
     * Creates a new ProtectionDomain qualified by the given CodeSource,
     * Permissions, ClassLoader and array of Principals. If the
     * permissions object is not null, then {@code setReadOnly()}
     * will be called on the passed in Permissions object.
     * The permissions granted to this domain are dynamic; they include
     * both the static permissions passed to this constructor, and any
     * permissions granted to this domain by the current Policy at the
     * time a permission is checked.
     * <p>
     * This constructor is typically used by
     * {@link SecureClassLoader ClassLoaders}
     * and {@link DomainCombiner DomainCombiners} which delegate to
     * {@code Policy} to actively associate the permissions granted to
     * this domain. This constructor affords the
     * Policy provider the opportunity to augment the supplied
     * PermissionCollection to reflect policy changes.
     * <p>
     *
     * @param codesource the CodeSource associated with this domain
     * @param permissions the permissions granted to this domain
     * @param classloader the ClassLoader associated with this domain
     * @param principals the array of Principals associated with this
     * domain. The contents of the array are copied to protect against
     * subsequent modification.
     * @see Policy#refresh
     * @see Policy#getPermissions(ProtectionDomain)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
    public ProtectionDomain(CodeSource codesource,
                            PermissionCollection permissions) {

    /**
     * Creates a new ProtectionDomain with the given CodeSource and
     * Permissions. If the permissions object is not null, then
     *  {@code setReadOnly())} will be called on the passed in
     * Permissions object. The only permissions granted to this domain
     * are the ones specified; the current Policy will not be consulted.
     *
     * @param codesource the codesource associated with this domain
     * @param permissions the permissions granted to this domain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/ProtectionDomain.java
public class ProtectionDomain {

/**
 *
 *<p>
 * This ProtectionDomain class encapsulates the characteristics of a domain,
 * which encloses a set of classes whose instances are granted a set
 * of permissions when being executed on behalf of a given set of Principals.
 * <p>
 * A static set of permissions can be bound to a ProtectionDomain when it is
 * constructed; such permissions are granted to the domain regardless of the
 * Policy in force. However, to support dynamic security policies, a
 * ProtectionDomain can also be constructed such that it is dynamically
 * mapped to a set of permissions by the current Policy whenever a permission
 * is checked.
 * <p>
 *
 * @author Li Gong
 * @author Roland Schemers
 * @author Gary Ellison
 */
