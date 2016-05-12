_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>SolarisNumericUserPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>SolarisNumericUserPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this
     * <code>SolarisNumericUserPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>SolarisNumericUserPrincipal</code> and the two
     * SolarisNumericUserPrincipals
     * have the same user identification number (UID).
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>SolarisNumericUserPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>SolarisNumericUserPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this
     * <code>SolarisNumericUserPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this
     *          <code>SolarisNumericUserPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public long longValue() {

    /**
     * Return the user identification number (UID) for this
     * <code>SolarisNumericUserPrincipal</code> as a long.
     *
     * <p>
     *
     * @return the user identification number (UID) for this
     *          <code>SolarisNumericUserPrincipal</code> as a long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public String getName() {

    /**
     * Return the user identification number (UID) for this
     * <code>SolarisNumericUserPrincipal</code>.
     *
     * <p>
     *
     * @return the user identification number (UID) for this
     *          <code>SolarisNumericUserPrincipal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public SolarisNumericUserPrincipal(long name) {

    /**
     * Create a <code>SolarisNumericUserPrincipal</code> using a
     * long representation of the user's identification number (UID).
     *
     * <p>
     *
     * @param name the user identification number (UID) for this user
     *                  represented as a long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public SolarisNumericUserPrincipal(String name) {

    /**
     * Create a <code>SolarisNumericUserPrincipal</code> using a
     * <code>String</code> representation of the
     * user's identification number (UID).
     *
     * <p>
     *
     * @param name the user identification number (UID) for this user.
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
@jdk.Exported(false)

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents a user's Solaris identification number (UID).
 *
 * <p> Principals such as this <code>SolarisNumericUserPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 * @deprecated As of JDK&nbsp;1.4, replaced by
 *             {@link UnixNumericUserPrincipal}.
 *             This class is entirely deprecated.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>SolarisNumericUserPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>SolarisNumericUserPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this
     * <code>SolarisNumericUserPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>SolarisNumericUserPrincipal</code> and the two
     * SolarisNumericUserPrincipals
     * have the same user identification number (UID).
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>SolarisNumericUserPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>SolarisNumericUserPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this
     * <code>SolarisNumericUserPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this
     *          <code>SolarisNumericUserPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public long longValue() {

    /**
     * Return the user identification number (UID) for this
     * <code>SolarisNumericUserPrincipal</code> as a long.
     *
     * <p>
     *
     * @return the user identification number (UID) for this
     *          <code>SolarisNumericUserPrincipal</code> as a long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public String getName() {

    /**
     * Return the user identification number (UID) for this
     * <code>SolarisNumericUserPrincipal</code>.
     *
     * <p>
     *
     * @return the user identification number (UID) for this
     *          <code>SolarisNumericUserPrincipal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public SolarisNumericUserPrincipal(long name) {

    /**
     * Create a <code>SolarisNumericUserPrincipal</code> using a
     * long representation of the user's identification number (UID).
     *
     * <p>
     *
     * @param name the user identification number (UID) for this user
     *                  represented as a long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    public SolarisNumericUserPrincipal(String name) {

    /**
     * Create a <code>SolarisNumericUserPrincipal</code> using a
     * <code>String</code> representation of the
     * user's identification number (UID).
     *
     * <p>
     *
     * @param name the user identification number (UID) for this user.
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericUserPrincipal.java
@jdk.Exported(false)

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents a user's Solaris identification number (UID).
 *
 * <p> Principals such as this <code>SolarisNumericUserPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 * @deprecated As of JDK&nbsp;1.4, replaced by
 *             {@link UnixNumericUserPrincipal}.
 *             This class is entirely deprecated.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
