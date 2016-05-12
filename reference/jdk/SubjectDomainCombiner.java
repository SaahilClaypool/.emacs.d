_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/SubjectDomainCombiner.java
    private static class WeakKeyValueMap<K,V> extends

    /**
     * A HashMap that has weak keys and values.
     *
     * Key objects in this map are the "current" ProtectionDomain instances
     * received via the combine method.  Each "current" PD is mapped to a
     * new PD instance that holds both the contents of the "current" PD,
     * as well as the principals from the Subject associated with this combiner.
     *
     * The newly created "principal-based" PD values must be stored as
     * WeakReferences since they contain strong references to the
     * corresponding key object (the "current" non-principal-based PD),
     * which will prevent the key from being GC'd.  Specifically,
     * a "principal-based" PD contains strong references to the CodeSource,
     * signer certs, PermissionCollection and ClassLoader objects
     * in the "current PD".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/SubjectDomainCombiner.java
    private ProtectionDomain[] combineJavaxPolicy(
        ProtectionDomain[] currentDomains,
        ProtectionDomain[] assignedDomains) {

    /**
     * Use the javax.security.auth.Policy implementation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/SubjectDomainCombiner.java
    public ProtectionDomain[] combine(ProtectionDomain[] currentDomains,
                                ProtectionDomain[] assignedDomains) {

    /**
     * Update the relevant ProtectionDomains with the Principals
     * from the {@code Subject} associated with this
     * {@code SubjectDomainCombiner}.
     *
     * <p> A new {@code ProtectionDomain} instance is created
     * for each {@code ProtectionDomain} in the
     * <i>currentDomains</i> array.  Each new {@code ProtectionDomain}
     * instance is created using the {@code CodeSource},
     * {@code Permission}s and {@code ClassLoader}
     * from the corresponding {@code ProtectionDomain} in
     * <i>currentDomains</i>, as well as with the Principals from
     * the {@code Subject} associated with this
     * {@code SubjectDomainCombiner}.
     *
     * <p> All of the newly instantiated ProtectionDomains are
     * combined into a new array.  The ProtectionDomains from the
     * <i>assignedDomains</i> array are appended to this new array,
     * and the result is returned.
     *
     * <p> Note that optimizations such as the removal of duplicate
     * ProtectionDomains may have occurred.
     * In addition, caching of ProtectionDomains may be permitted.
     *
     * <p>
     *
     * @param currentDomains the ProtectionDomains associated with the
     *          current execution Thread, up to the most recent
     *          privileged {@code ProtectionDomain}.
     *          The ProtectionDomains are are listed in order of execution,
     *          with the most recently executing {@code ProtectionDomain}
     *          residing at the beginning of the array. This parameter may
     *          be {@code null} if the current execution Thread
     *          has no associated ProtectionDomains.<p>
     *
     * @param assignedDomains the ProtectionDomains inherited from the
     *          parent Thread, or the ProtectionDomains from the
     *          privileged <i>context</i>, if a call to
     *          AccessController.doPrivileged(..., <i>context</i>)
     *          had occurred  This parameter may be {@code null}
     *          if there were no ProtectionDomains inherited from the
     *          parent Thread, or from the privileged <i>context</i>.
     *
     * @return a new array consisting of the updated ProtectionDomains,
     *          or {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/SubjectDomainCombiner.java
    public Subject getSubject() {

    /**
     * Get the {@code Subject} associated with this
     * {@code SubjectDomainCombiner}.
     *
     * <p>
     *
     * @return the {@code Subject} associated with this
     *          {@code SubjectDomainCombiner}, or {@code null}
     *          if no {@code Subject} is associated with this
     *          {@code SubjectDomainCombiner}.
     *
     * @exception SecurityException if the caller does not have permission
     *          to get the {@code Subject} associated with this
     *          {@code SubjectDomainCombiner}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/SubjectDomainCombiner.java
    public SubjectDomainCombiner(Subject subject) {

    /**
     * Associate the provided {@code Subject} with this
     * {@code SubjectDomainCombiner}.
     *
     * <p>
     *
     * @param subject the {@code Subject} to be associated with
     *          with this {@code SubjectDomainCombiner}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/SubjectDomainCombiner.java
public class SubjectDomainCombiner implements java.security.DomainCombiner {

/**
 * A {@code SubjectDomainCombiner} updates ProtectionDomains
 * with Principals from the {@code Subject} associated with this
 * {@code SubjectDomainCombiner}.
 *
 */
