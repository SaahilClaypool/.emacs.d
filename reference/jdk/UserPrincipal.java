_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public String toString() {

    /**
     * Returns a string representation of this principal.
     *
     * @return The principal's name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public String getName() {

    /**
     * Returns the name of this principal.
     *
     * @return The principal's name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public int hashCode() {

    /**
     * Returns a hash code for this principal.
     *
     * @return The principal's hash code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public boolean equals(Object object) {

    /**
     * Compares this principal to the specified object.
     *
     * @param object The object to compare this principal against.
     * @return true if they are equal; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public UserPrincipal(String name) {

    /**
     * Creates a principal.
     *
     * @param name The principal's string name.
     * @exception NullPointerException If the <code>name</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    private final String name;

    /**
     * The principal's name
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
@jdk.Exported

/**
 * A user principal identified by a username or account name.
 *
 * <p>
 * After successful authentication, a user {@link java.security.Principal}
 * can be associated with a particular {@link javax.security.auth.Subject}
 * to augment that <code>Subject</code> with an additional identity.
 * Authorization decisions can then be based upon the
 * <code>Principal</code>s that are associated with a <code>Subject</code>.
 *
 * <p>
 * This class is immutable.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public String toString() {

    /**
     * Returns a string representation of this principal.
     *
     * @return The principal's name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public String getName() {

    /**
     * Returns the name of this principal.
     *
     * @return The principal's name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public int hashCode() {

    /**
     * Returns a hash code for this principal.
     *
     * @return The principal's hash code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public boolean equals(Object object) {

    /**
     * Compares this principal to the specified object.
     *
     * @param object The object to compare this principal against.
     * @return true if they are equal; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    public UserPrincipal(String name) {

    /**
     * Creates a principal.
     *
     * @param name The principal's string name.
     * @exception NullPointerException If the <code>name</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
    private final String name;

    /**
     * The principal's name
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/UserPrincipal.java
@jdk.Exported

/**
 * A user principal identified by a username or account name.
 *
 * <p>
 * After successful authentication, a user {@link java.security.Principal}
 * can be associated with a particular {@link javax.security.auth.Subject}
 * to augment that <code>Subject</code> with an additional identity.
 * Authorization decisions can then be based upon the
 * <code>Principal</code>s that are associated with a <code>Subject</code>.
 *
 * <p>
 * This class is immutable.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/UserPrincipal.java
public interface UserPrincipal extends Principal { }

/**
 * A {@code Principal} representing an identity used to determine access rights
 * to objects in a file system.
 *
 * <p> On many platforms and file systems an entity requires appropriate access
 * rights or permissions in order to access objects in a file system. The
 * access rights are generally performed by checking the identity of the entity.
 * For example, on implementations that use Access Control Lists (ACLs) to
 * enforce privilege separation then a file in the file system may have an
 * associated ACL that determines the access rights of identities specified in
 * the ACL.
 *
 * <p> A {@code UserPrincipal} object is an abstract representation of an
 * identity. It has a {@link #getName() name} that is typically the username or
 * account name that it represents. User principal objects may be obtained using
 * a {@link UserPrincipalLookupService}, or returned by {@link
 * FileAttributeView} implementations that provide access to identity related
 * attributes. For example, the {@link AclFileAttributeView} and {@link
 * PosixFileAttributeView} provide access to a file's {@link
 * PosixFileAttributes#owner owner}.
 *
 * @since 1.7
 */
