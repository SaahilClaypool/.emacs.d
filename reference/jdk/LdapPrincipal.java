_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public String toString() {

    /**
     * Creates a string representation of this principal's name in the format
     * defined by <a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253</a>.
     * If the name has zero components an empty string is returned.
     *
     * @return The principal's string name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public String getName() {

    /**
     * Returns the name originally used to create this principal.
     *
     * @return The principal's string name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public int hashCode() {

    /**
     * Computes the hash code for this principal.
     *
     * @return The principal's hash code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public boolean equals(Object object) {

    /**
     * Compares this principal to the specified object.
     *
     * @param object The object to compare this principal against.
     * @return true if they are equal; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public LdapPrincipal(String name) throws InvalidNameException {

    /**
     * Creates an LDAP principal.
     *
     * @param name The principal's string distinguished name.
     * @throws InvalidNameException If a syntax violation is detected.
     * @exception NullPointerException If the <code>name</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    private final LdapName name;

    /**
     * The principal's name
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    private final String nameString;

    /**
     * The principal's string name
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
@jdk.Exported

/**
 * A principal identified by a distinguished name as specified by
 * <a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253</a>.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public String toString() {

    /**
     * Creates a string representation of this principal's name in the format
     * defined by <a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253</a>.
     * If the name has zero components an empty string is returned.
     *
     * @return The principal's string name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public String getName() {

    /**
     * Returns the name originally used to create this principal.
     *
     * @return The principal's string name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public int hashCode() {

    /**
     * Computes the hash code for this principal.
     *
     * @return The principal's hash code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public boolean equals(Object object) {

    /**
     * Compares this principal to the specified object.
     *
     * @param object The object to compare this principal against.
     * @return true if they are equal; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    public LdapPrincipal(String name) throws InvalidNameException {

    /**
     * Creates an LDAP principal.
     *
     * @param name The principal's string distinguished name.
     * @throws InvalidNameException If a syntax violation is detected.
     * @exception NullPointerException If the <code>name</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    private final LdapName name;

    /**
     * The principal's name
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
    private final String nameString;

    /**
     * The principal's string name
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/LdapPrincipal.java
@jdk.Exported

/**
 * A principal identified by a distinguished name as specified by
 * <a href="http://www.ietf.org/rfc/rfc2253.txt">RFC 2253</a>.
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
