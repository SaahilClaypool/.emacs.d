_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/SubjectDelegator.java
    private static Collection<Principal> getSubjectPrincipals(Subject subject) {

    /**
     * Retrieves the {@linkplain Subject} principals
     * @param subject The subject
     * @return If the {@code Subject} is immutable it will return the principals directly.
     *         If the {@code Subject} is mutable it will create an unmodifiable copy.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/SubjectDelegator.java
    public static synchronized boolean

    /**
     * Check if the connector server creator can assume the identity of each
     * principal in the authenticated subject, i.e. check if the connector
     * server creator codebase contains a subject delegation permission for
     * each principal present in the authenticated subject.
     *
     * @return {@code true} if the connector server creator can delegate to all
     * the authenticated principals in the subject. Otherwise, {@code false}.
     */
