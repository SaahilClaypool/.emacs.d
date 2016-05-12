_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    public int hashCode() {

    /**
     * Returns the hash code value for this context. The hash code
     * is computed by exclusive or-ing the hash code of all the protection
     * domains in the context together.
     *
     * @return a hash code value for this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    public boolean equals(Object obj) {

    /**
     * Checks two AccessControlContext objects for equality.
     * Checks that <i>obj</i> is
     * an AccessControlContext and has the same set of ProtectionDomains
     * as this context.
     * <P>
     * @param obj the object we are testing for equality with this object.
     * @return true if <i>obj</i> is an AccessControlContext, and has the
     * same set of ProtectionDomains as this context, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    AccessControlContext optimize() {

    /**
     * Take the stack-based context (this) and combine it with the
     * privileged or inherited context, if need be. Any limited
     * privilege scope is flagged regardless of whether the assigned
     * context comes from an immediately enclosing limited doPrivileged().
     * The limited privilege scope can indirectly flow from the inherited
     * parent thread or an assigned context previously captured by getContext().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    public void checkPermission(Permission perm)

    /**
     * Determines whether the access request indicated by the
     * specified permission should be allowed or denied, based on
     * the security policy currently in effect, and the context in
     * this object. The request is allowed only if every ProtectionDomain
     * in the context implies the permission. Otherwise the request is
     * denied.
     *
     * <p>
     * This method quietly returns if the access request
     * is permitted, or throws a suitable AccessControlException otherwise.
     *
     * @param perm the requested permission.
     *
     * @exception AccessControlException if the specified permission
     * is not permitted, based on the current security policy and the
     * context encapsulated by this object.
     * @exception NullPointerException if the permission to check for is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    DomainCombiner getCombiner() {

    /**
     * package private for AccessController
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    public DomainCombiner getDomainCombiner() {

    /**
     * Get the {@code DomainCombiner} associated with this
     * {@code AccessControlContext}.
     *
     * <p>
     *
     * @return the {@code DomainCombiner} associated with this
     *          {@code AccessControlContext}, or {@code null}
     *          if there is none.
     *
     * @exception SecurityException if a security manager is installed and
     *          the caller does not have the "getDomainCombiner"
     *          {@link SecurityPermission}
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    DomainCombiner getAssignedCombiner() {

    /**
     * get the assigned combiner from the privileged or inherited context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    boolean isPrivileged()

    /**
     * Returns true if this context is privileged.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    ProtectionDomain[] getContext() {

    /**
     * Returns this context's context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    AccessControlContext(ProtectionDomain[] context,
                         AccessControlContext privilegedContext)

    /**
     * Constructor for JavaSecurityAccess.doIntersectionPrivilege()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    AccessControlContext(ProtectionDomain context[],
                         boolean isPrivileged)

    /**
     * package private constructor for AccessController.getContext()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    AccessControlContext(ProtectionDomain caller, DomainCombiner combiner,
        AccessControlContext parent, AccessControlContext context,
        Permission[] perms)

    /**
     * package private for AccessController
     *
     * This "argument wrapper" context will be passed as the actual context
     * parameter on an internal doPrivileged() call used in the implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    AccessControlContext(AccessControlContext acc,
                        DomainCombiner combiner,
                        boolean preauthorized) {

    /**
     * package private to allow calls from ProtectionDomain without performing
     * the security check for {@linkplain SecurityConstants.CREATE_ACC_PERMISSION}
     * permission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    public AccessControlContext(AccessControlContext acc,
                                DomainCombiner combiner) {

    /**
     * Create a new {@code AccessControlContext} with the given
     * {@code AccessControlContext} and {@code DomainCombiner}.
     * This constructor associates the provided
     * {@code DomainCombiner} with the provided
     * {@code AccessControlContext}.
     *
     * <p>
     *
     * @param acc the {@code AccessControlContext} associated
     *          with the provided {@code DomainCombiner}.
     *
     * @param combiner the {@code DomainCombiner} to be associated
     *          with the provided {@code AccessControlContext}.
     *
     * @exception NullPointerException if the provided
     *          {@code context} is {@code null}.
     *
     * @exception SecurityException if a security manager is installed and the
     *          caller does not have the "createAccessControlContext"
     *          {@link SecurityPermission}
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
    public AccessControlContext(ProtectionDomain context[])

    /**
     * Create an AccessControlContext with the given array of ProtectionDomains.
     * Context must not be null. Duplicate domains will be removed from the
     * context.
     *
     * @param context the ProtectionDomains associated with this context.
     * The non-duplicate domains are copied from the array. Subsequent
     * changes to the array will not affect this AccessControlContext.
     * @throws NullPointerException if {@code context} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlContext.java
public final class AccessControlContext {

/**
 * An AccessControlContext is used to make system resource access decisions
 * based on the context it encapsulates.
 *
 * <p>More specifically, it encapsulates a context and
 * has a single method, {@code checkPermission},
 * that is equivalent to the {@code checkPermission} method
 * in the AccessController class, with one difference: The AccessControlContext
 * {@code checkPermission} method makes access decisions based on the
 * context it encapsulates,
 * rather than that of the current execution thread.
 *
 * <p>Thus, the purpose of AccessControlContext is for those situations where
 * a security check that should be made within a given context
 * actually needs to be done from within a
 * <i>different</i> context (for example, from within a worker thread).
 *
 * <p> An AccessControlContext is created by calling the
 * {@code AccessController.getContext} method.
 * The {@code getContext} method takes a "snapshot"
 * of the current calling context, and places
 * it in an AccessControlContext object, which it returns. A sample call is
 * the following:
 *
 * <pre>
 *   AccessControlContext acc = AccessController.getContext()
 * </pre>
 *
 * <p>
 * Code within a different context can subsequently call the
 * {@code checkPermission} method on the
 * previously-saved AccessControlContext object. A sample call is the
 * following:
 *
 * <pre>
 *   acc.checkPermission(permission)
 * </pre>
 *
 * @see AccessController
 *
 * @author Roland Schemers
 */
