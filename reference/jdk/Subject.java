_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    private class ClassSet<T> extends AbstractSet<T> {

    /**
     * This class implements a {@code Set} which returns only
     * members that are an instance of a specified Class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
        private void writeObject(java.io.ObjectOutputStream oos)

        /**
         * Writes this object out to a stream (i.e., serializes it).
         *
         * <p>
         *
         * @serialData If this is a private credential set,
         *      a security check is performed to ensure that
         *      the caller has permission to access each credential
         *      in the set.  If the security check passes,
         *      the set is serialized.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
        private int which;

        /**
         * @serial An integer identifying the type of objects contained
         *      in this set.  If {@code which == 1},
         *      this is a Principal set and all the elements are
         *      of type {@code java.security.Principal}.
         *      If {@code which == 2}, this is a public credential
         *      set and all the elements are of type {@code Object}.
         *      If {@code which == 3}, this is a private credential
         *      set and all the elements are of type {@code Object}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
        private static final ObjectStreamField[] serialPersistentFields = {

        /**
         * @serialField this$0 Subject The outer Subject instance.
         * @serialField elements LinkedList The elements in this set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    private static class SecureSet<E>

    /**
     * Prevent modifications unless caller has permission.
     *
     * @serial include
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    @SuppressWarnings("unchecked")

    /**
     * Reads this object from a stream (i.e., deserializes it)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    private void writeObject(java.io.ObjectOutputStream oos)

    /**
     * Writes this object out to a stream (i.e., serializes it).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    private int getCredHashCode(Object o) {

    /**
     * get a credential's hashcode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
        int hashCode = 0;

        /**
         * The hashcode is derived exclusive or-ing the
         * hashcodes of this Subject's Principals and credentials.
         *
         * If a particular credential was destroyed
         * ({@code credential.hashCode()} throws an
         * {@code IllegalStateException}),
         * the hashcode for that credential is derived via:
         * {@code credential.getClass().toString().hashCode()}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public int hashCode() {

    /**
     * Returns a hashcode for this {@code Subject}.
     *
     * <p>
     *
     * @return a hashcode for this {@code Subject}.
     *
     * @exception SecurityException if the caller does not have permission
     *          to access this Subject's private credentials.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    String toString(boolean includePrivateCredentials) {

    /**
     * package private convenience method to print out the Subject
     * without firing off a security check when trying to access
     * the Private Credentials
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public String toString() {

    /**
     * Return the String representation of this {@code Subject}.
     *
     * <p>
     *
     * @return the String representation of this {@code Subject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this {@code Subject}
     * for equality.  Returns true if the given object is also a Subject
     * and the two {@code Subject} instances are equivalent.
     * More formally, two {@code Subject} instances are
     * equal if their {@code Principal} and {@code Credential}
     * Sets are equal.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          {@code Subject}.
     *
     * @return true if the specified Object is equal to this
     *          {@code Subject}.
     *
     * @exception SecurityException if the caller does not have permission
     *          to access the private credentials for this {@code Subject},
     *          or if the caller does not have permission to access the
     *          private credentials for the provided {@code Subject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public <T> Set<T> getPrivateCredentials(Class<T> c) {

    /**
     * Return a {@code Set} of private credentials associated with this
     * {@code Subject} that are instances or subclasses of the specified
     * {@code Class}.
     *
     * <p> The caller must have permission to access all of the
     * requested Credentials, or a {@code SecurityException}
     * will be thrown.
     *
     * <p> The returned {@code Set} is not backed by this Subject's
     * internal private Credential {@code Set}.  A new
     * {@code Set} is created and returned for each method invocation.
     * Modifications to the returned {@code Set}
     * will not affect the internal private Credential {@code Set}.
     *
     * <p>
     *
     * @param <T> the type of the class modeled by {@code c}
     *
     * @param c the returned {@code Set} of private credentials will all be
     *          instances of this class.
     *
     * @return a {@code Set} of private credentials that are instances
     *          of the  specified {@code Class}.
     *
     * @exception NullPointerException if the specified {@code Class}
     *          is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public <T> Set<T> getPublicCredentials(Class<T> c) {

    /**
     * Return a {@code Set} of public credentials associated with this
     * {@code Subject} that are instances or subclasses of the specified
     * {@code Class}.
     *
     * <p> The returned {@code Set} is not backed by this Subject's
     * internal public Credential {@code Set}.  A new
     * {@code Set} is created and returned for each method invocation.
     * Modifications to the returned {@code Set}
     * will not affect the internal public Credential {@code Set}.
     *
     * <p>
     *
     * @param <T> the type of the class modeled by {@code c}
     *
     * @param c the returned {@code Set} of public credentials will all be
     *          instances of this class.
     *
     * @return a {@code Set} of public credentials that are instances
     *          of the  specified {@code Class}.
     *
     * @exception NullPointerException if the specified {@code Class}
     *          is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public Set<Object> getPrivateCredentials() {

    /**
     * Return the {@code Set} of private credentials held by this
     * {@code Subject}.
     *
     * <p> The returned {@code Set} is backed by this Subject's
     * internal private Credential {@code Set}.  Any modification
     * to the returned {@code Set} affects the internal private
     * Credential {@code Set} as well.
     *
     * <p> A caller requires permissions to access the Credentials
     * in the returned {@code Set}, or to modify the
     * {@code Set} itself.  A {@code SecurityException}
     * is thrown if the caller does not have the proper permissions.
     *
     * <p> While iterating through the {@code Set},
     * a {@code SecurityException} is thrown
     * if the caller does not have permission to access a
     * particular Credential.  The {@code Iterator}
     * is nevertheless advanced to next element in the {@code Set}.
     *
     * <p>
     *
     * @return  A {@code Set} of private credentials held by this
     *          {@code Subject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public Set<Object> getPublicCredentials() {

    /**
     * Return the {@code Set} of public credentials held by this
     * {@code Subject}.
     *
     * <p> The returned {@code Set} is backed by this Subject's
     * internal public Credential {@code Set}.  Any modification
     * to the returned {@code Set} affects the internal public
     * Credential {@code Set} as well.
     *
     * <p>
     *
     * @return  A {@code Set} of public credentials held by this
     *          {@code Subject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public <T extends Principal> Set<T> getPrincipals(Class<T> c) {

    /**
     * Return a {@code Set} of Principals associated with this
     * {@code Subject} that are instances or subclasses of the specified
     * {@code Class}.
     *
     * <p> The returned {@code Set} is not backed by this Subject's
     * internal {@code Principal} {@code Set}.  A new
     * {@code Set} is created and returned for each method invocation.
     * Modifications to the returned {@code Set}
     * will not affect the internal {@code Principal} {@code Set}.
     *
     * <p>
     *
     * @param <T> the type of the class modeled by {@code c}
     *
     * @param c the returned {@code Set} of Principals will all be
     *          instances of this class.
     *
     * @return a {@code Set} of Principals that are instances of the
     *          specified {@code Class}.
     *
     * @exception NullPointerException if the specified {@code Class}
     *                  is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public Set<Principal> getPrincipals() {

    /**
     * Return the {@code Set} of Principals associated with this
     * {@code Subject}.  Each {@code Principal} represents
     * an identity for this {@code Subject}.
     *
     * <p> The returned {@code Set} is backed by this Subject's
     * internal {@code Principal} {@code Set}.  Any modification
     * to the returned {@code Set} affects the internal
     * {@code Principal} {@code Set} as well.
     *
     * <p>
     *
     * @return  The {@code Set} of Principals associated with this
     *          {@code Subject}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public static <T> T doAsPrivileged(final Subject subject,
                        final java.security.PrivilegedExceptionAction<T> action,
                        final java.security.AccessControlContext acc)

    /**
     * Perform privileged work as a particular {@code Subject}.
     *
     * <p> This method behaves exactly as {@code Subject.doAs},
     * except that instead of retrieving the current Thread's
     * {@code AccessControlContext}, it uses the provided
     * {@code AccessControlContext}.  If the provided
     * {@code AccessControlContext} is {@code null},
     * this method instantiates a new {@code AccessControlContext}
     * with an empty collection of ProtectionDomains.
     *
     * <p>
     *
     * @param subject the {@code Subject} that the specified
     *                  {@code action} will run as.  This parameter
     *                  may be {@code null}. <p>
     *
     * @param <T> the type of the value returned by the
     *                  PrivilegedExceptionAction's {@code run} method.
     *
     * @param action the code to be run as the specified
     *                  {@code Subject}. <p>
     *
     * @param acc the {@code AccessControlContext} to be tied to the
     *                  specified <i>subject</i> and <i>action</i>. <p>
     *
     * @return the value returned by the
     *                  PrivilegedExceptionAction's {@code run} method.
     *
     * @exception PrivilegedActionException if the
     *                  {@code PrivilegedExceptionAction.run}
     *                  method throws a checked exception. <p>
     *
     * @exception NullPointerException if the specified
     *                  {@code PrivilegedExceptionAction} is
     *                  {@code null}. <p>
     *
     * @exception SecurityException if the caller does not have permission
     *                  to invoke this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public static <T> T doAsPrivileged(final Subject subject,
                        final java.security.PrivilegedAction<T> action,
                        final java.security.AccessControlContext acc) {

    /**
     * Perform privileged work as a particular {@code Subject}.
     *
     * <p> This method behaves exactly as {@code Subject.doAs},
     * except that instead of retrieving the current Thread's
     * {@code AccessControlContext}, it uses the provided
     * {@code AccessControlContext}.  If the provided
     * {@code AccessControlContext} is {@code null},
     * this method instantiates a new {@code AccessControlContext}
     * with an empty collection of ProtectionDomains.
     *
     * <p>
     *
     * @param subject the {@code Subject} that the specified
     *                  {@code action} will run as.  This parameter
     *                  may be {@code null}. <p>
     *
     * @param <T> the type of the value returned by the PrivilegedAction's
     *                  {@code run} method.
     *
     * @param action the code to be run as the specified
     *                  {@code Subject}. <p>
     *
     * @param acc the {@code AccessControlContext} to be tied to the
     *                  specified <i>subject</i> and <i>action</i>. <p>
     *
     * @return the value returned by the PrivilegedAction's
     *                  {@code run} method.
     *
     * @exception NullPointerException if the {@code PrivilegedAction}
     *                  is {@code null}. <p>
     *
     * @exception SecurityException if the caller does not have permission
     *                  to invoke this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public static <T> T doAs(final Subject subject,
                        final java.security.PrivilegedExceptionAction<T> action)

    /**
     * Perform work as a particular {@code Subject}.
     *
     * <p> This method first retrieves the current Thread's
     * {@code AccessControlContext} via
     * {@code AccessController.getContext},
     * and then instantiates a new {@code AccessControlContext}
     * using the retrieved context along with a new
     * {@code SubjectDomainCombiner} (constructed using
     * the provided {@code Subject}).
     * Finally, this method invokes {@code AccessController.doPrivileged},
     * passing it the provided {@code PrivilegedExceptionAction},
     * as well as the newly constructed {@code AccessControlContext}.
     *
     * <p>
     *
     * @param subject the {@code Subject} that the specified
     *                  {@code action} will run as.  This parameter
     *                  may be {@code null}. <p>
     *
     * @param <T> the type of the value returned by the
     *                  PrivilegedExceptionAction's {@code run} method.
     *
     * @param action the code to be run as the specified
     *                  {@code Subject}. <p>
     *
     * @return the value returned by the
     *                  PrivilegedExceptionAction's {@code run} method.
     *
     * @exception PrivilegedActionException if the
     *                  {@code PrivilegedExceptionAction.run}
     *                  method throws a checked exception. <p>
     *
     * @exception NullPointerException if the specified
     *                  {@code PrivilegedExceptionAction} is
     *                  {@code null}. <p>
     *
     * @exception SecurityException if the caller does not have permission
     *                  to invoke this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public static <T> T doAs(final Subject subject,
                        final java.security.PrivilegedAction<T> action) {

    /**
     * Perform work as a particular {@code Subject}.
     *
     * <p> This method first retrieves the current Thread's
     * {@code AccessControlContext} via
     * {@code AccessController.getContext},
     * and then instantiates a new {@code AccessControlContext}
     * using the retrieved context along with a new
     * {@code SubjectDomainCombiner} (constructed using
     * the provided {@code Subject}).
     * Finally, this method invokes {@code AccessController.doPrivileged},
     * passing it the provided {@code PrivilegedAction},
     * as well as the newly constructed {@code AccessControlContext}.
     *
     * <p>
     *
     * @param subject the {@code Subject} that the specified
     *                  {@code action} will run as.  This parameter
     *                  may be {@code null}. <p>
     *
     * @param <T> the type of the value returned by the PrivilegedAction's
     *                  {@code run} method.
     *
     * @param action the code to be run as the specified
     *                  {@code Subject}. <p>
     *
     * @return the value returned by the PrivilegedAction's
     *                  {@code run} method.
     *
     * @exception NullPointerException if the {@code PrivilegedAction}
     *                  is {@code null}. <p>
     *
     * @exception SecurityException if the caller does not have permission
     *                  to invoke this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public static Subject getSubject(final AccessControlContext acc) {

    /**
     * Get the {@code Subject} associated with the provided
     * {@code AccessControlContext}.
     *
     * <p> The {@code AccessControlContext} may contain many
     * Subjects (from nested {@code doAs} calls).
     * In this situation, the most recent {@code Subject} associated
     * with the {@code AccessControlContext} is returned.
     *
     * <p>
     *
     * @param  acc the {@code AccessControlContext} from which to retrieve
     *          the {@code Subject}.
     *
     * @return  the {@code Subject} associated with the provided
     *          {@code AccessControlContext}, or {@code null}
     *          if no {@code Subject} is associated
     *          with the provided {@code AccessControlContext}.
     *
     * @exception SecurityException if the caller does not have permission
     *          to get the {@code Subject}. <p>
     *
     * @exception NullPointerException if the provided
     *          {@code AccessControlContext} is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public boolean isReadOnly() {

    /**
     * Query whether this {@code Subject} is read-only.
     *
     * <p>
     *
     * @return true if this {@code Subject} is read-only, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public void setReadOnly() {

    /**
     * Set this {@code Subject} to be read-only.
     *
     * <p> Modifications (additions and removals) to this Subject's
     * {@code Principal} {@code Set} and
     * credential Sets will be disallowed.
     * The {@code destroy} operation on this Subject's credentials will
     * still be permitted.
     *
     * <p> Subsequent attempts to modify the Subject's {@code Principal}
     * and credential Sets will result in an
     * {@code IllegalStateException} being thrown.
     * Also, once a {@code Subject} is read-only,
     * it can not be reset to being writable again.
     *
     * <p>
     *
     * @exception SecurityException if the caller does not have permission
     *          to set this {@code Subject} to be read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public Subject(boolean readOnly, Set<? extends Principal> principals,
                   Set<?> pubCredentials, Set<?> privCredentials)

    /**
     * Create an instance of a {@code Subject} with
     * Principals and credentials.
     *
     * <p> The Principals and credentials from the specified Sets
     * are copied into newly constructed Sets.
     * These newly created Sets check whether this {@code Subject}
     * has been set read-only before permitting subsequent modifications.
     * The newly created Sets also prevent illegal modifications
     * by ensuring that callers have sufficient permissions.
     *
     * <p> To modify the Principals Set, the caller must have
     * {@code AuthPermission("modifyPrincipals")}.
     * To modify the public credential Set, the caller must have
     * {@code AuthPermission("modifyPublicCredentials")}.
     * To modify the private credential Set, the caller must have
     * {@code AuthPermission("modifyPrivateCredentials")}.
     * <p>
     *
     * @param readOnly true if the {@code Subject} is to be read-only,
     *          and false otherwise. <p>
     *
     * @param principals the {@code Set} of Principals
     *          to be associated with this {@code Subject}. <p>
     *
     * @param pubCredentials the {@code Set} of public credentials
     *          to be associated with this {@code Subject}. <p>
     *
     * @param privCredentials the {@code Set} of private credentials
     *          to be associated with this {@code Subject}.
     *
     * @exception NullPointerException if the specified
     *          {@code principals}, {@code pubCredentials},
     *          or {@code privCredentials} are {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    public Subject() {

    /**
     * Create an instance of a {@code Subject}
     * with an empty {@code Set} of Principals and empty
     * Sets of public and private credentials.
     *
     * <p> The newly constructed Sets check whether this {@code Subject}
     * has been set read-only before permitting subsequent modifications.
     * The newly created Sets also prevent illegal modifications
     * by ensuring that callers have sufficient permissions.
     *
     * <p> To modify the Principals Set, the caller must have
     * {@code AuthPermission("modifyPrincipals")}.
     * To modify the public credential Set, the caller must have
     * {@code AuthPermission("modifyPublicCredentials")}.
     * To modify the private credential Set, the caller must have
     * {@code AuthPermission("modifyPrivateCredentials")}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    private volatile boolean readOnly = false;

    /**
     * Whether this Subject is read-only
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    transient Set<Object> pubCredentials;

    /**
     * Sets that provide a view of all of this
     * Subject's Credentials
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
    Set<Principal> principals;

    /**
     * A {@code Set} that provides a view of all of this
     * Subject's Principals
     *
     * <p>
     *
     * @serial Each element in this set is a
     *          {@code java.security.Principal}.
     *          The set is a {@code Subject.SecureSet}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/Subject.java
public final class Subject implements java.io.Serializable {

/**
 * <p> A {@code Subject} represents a grouping of related information
 * for a single entity, such as a person.
 * Such information includes the Subject's identities as well as
 * its security-related attributes
 * (passwords and cryptographic keys, for example).
 *
 * <p> Subjects may potentially have multiple identities.
 * Each identity is represented as a {@code Principal}
 * within the {@code Subject}.  Principals simply bind names to a
 * {@code Subject}.  For example, a {@code Subject} that happens
 * to be a person, Alice, might have two Principals:
 * one which binds "Alice Bar", the name on her driver license,
 * to the {@code Subject}, and another which binds,
 * "999-99-9999", the number on her student identification card,
 * to the {@code Subject}.  Both Principals refer to the same
 * {@code Subject} even though each has a different name.
 *
 * <p> A {@code Subject} may also own security-related attributes,
 * which are referred to as credentials.
 * Sensitive credentials that require special protection, such as
 * private cryptographic keys, are stored within a private credential
 * {@code Set}.  Credentials intended to be shared, such as
 * public key certificates or Kerberos server tickets are stored
 * within a public credential {@code Set}.  Different permissions
 * are required to access and modify the different credential Sets.
 *
 * <p> To retrieve all the Principals associated with a {@code Subject},
 * invoke the {@code getPrincipals} method.  To retrieve
 * all the public or private credentials belonging to a {@code Subject},
 * invoke the {@code getPublicCredentials} method or
 * {@code getPrivateCredentials} method, respectively.
 * To modify the returned {@code Set} of Principals and credentials,
 * use the methods defined in the {@code Set} class.
 * For example:
 * <pre>
 *      Subject subject;
 *      Principal principal;
 *      Object credential;
 *
 *      // add a Principal and credential to the Subject
 *      subject.getPrincipals().add(principal);
 *      subject.getPublicCredentials().add(credential);
 * </pre>
 *
 * <p> This {@code Subject} class implements {@code Serializable}.
 * While the Principals associated with the {@code Subject} are serialized,
 * the credentials associated with the {@code Subject} are not.
 * Note that the {@code java.security.Principal} class
 * does not implement {@code Serializable}.  Therefore all concrete
 * {@code Principal} implementations associated with Subjects
 * must implement {@code Serializable}.
 *
 * @see java.security.Principal
 * @see java.security.DomainCombiner
 */
