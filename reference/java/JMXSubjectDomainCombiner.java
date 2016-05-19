_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXSubjectDomainCombiner.java
    public static AccessControlContext

    /**
     * Get the AccessControlContext of the domain combiner created with
     * the supplied subject, i.e. an AccessControlContext with the domain
     * combiner created with the supplied subject and where the caller's
     * context has been removed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXSubjectDomainCombiner.java
    public static AccessControlContext getContext(Subject subject) {

    /**
     * Get the current AccessControlContext combined with the supplied subject.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXSubjectDomainCombiner.java
    private static final ProtectionDomain pdNoPerms =

    /**
     * A ProtectionDomain with a null CodeSource and an empty permission set.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXSubjectDomainCombiner.java
    private static final CodeSource nullCodeSource =

    /**
     * A null CodeSource.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/JMXSubjectDomainCombiner.java
public class JMXSubjectDomainCombiner extends SubjectDomainCombiner {

/**
 * <p>This class represents an extension to the {@link SubjectDomainCombiner}
 * and is used to add a new {@link ProtectionDomain}, comprised of a null
 * codesource/signers and an empty permission set, to the access control
 * context with which this combiner is combined.</p>
 *
 * <p>When the {@link #combine} method is called the {@link ProtectionDomain}
 * is augmented with the permissions granted to the set of principals present
 * in the supplied {@link Subject}.</p>
 */
