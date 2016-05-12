_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>SolarisNumericGroupPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>SolarisNumericGroupPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this
     * <code>SolarisNumericGroupPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>SolarisNumericGroupPrincipal</code> and the two
     * SolarisNumericGroupPrincipals
     * have the same group identification number (GID).
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>SolarisNumericGroupPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>SolarisNumericGroupPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this
     * <code>SolarisNumericGroupPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this
     *          <code>SolarisNumericGroupPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public boolean isPrimaryGroup() {

    /**
     * Return whether this group identification number (GID) represents
     * the primary group to which this user belongs.
     *
     * <p>
     *
     * @return true if this group identification number (GID) represents
     *          the primary group to which this user belongs,
     *          or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public long longValue() {

    /**
     * Return the user's group identification number (GID) for this
     * <code>SolarisNumericGroupPrincipal</code> as a long.
     *
     * <p>
     *
     * @return the user's group identification number (GID) for this
     *          <code>SolarisNumericGroupPrincipal</code> as a long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public String getName() {

    /**
     * Return the user's group identification number (GID) for this
     * <code>SolarisNumericGroupPrincipal</code>.
     *
     * <p>
     *
     * @return the user's group identification number (GID) for this
     *          <code>SolarisNumericGroupPrincipal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public SolarisNumericGroupPrincipal(long name, boolean primaryGroup) {

    /**
     * Create a <code>SolarisNumericGroupPrincipal</code> using a
     * long representation of the user's group identification number (GID).
     *
     * <p>
     *
     * @param name the user's group identification number (GID) for this user
     *                  represented as a long. <p>
     *
     * @param primaryGroup true if the specified GID represents the
     *                  primary group to which this user belongs.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public SolarisNumericGroupPrincipal(String name, boolean primaryGroup) {

    /**
     * Create a <code>SolarisNumericGroupPrincipal</code> using a
     * <code>String</code> representation of the user's
     * group identification number (GID).
     *
     * <p>
     *
     * @param name the user's group identification number (GID)
     *                  for this user. <p>
     *
     * @param primaryGroup true if the specified GID represents the
     *                  primary group to which this user belongs.
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    private boolean primaryGroup;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
@jdk.Exported(false)

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents a user's Solaris group identification number (GID).
 *
 * <p> Principals such as this <code>SolarisNumericGroupPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.

 * @deprecated As of JDK&nbsp;1.4, replaced by
 *             {@link UnixNumericGroupPrincipal}.
 *             This class is entirely deprecated.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>SolarisNumericGroupPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>SolarisNumericGroupPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this
     * <code>SolarisNumericGroupPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>SolarisNumericGroupPrincipal</code> and the two
     * SolarisNumericGroupPrincipals
     * have the same group identification number (GID).
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>SolarisNumericGroupPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>SolarisNumericGroupPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this
     * <code>SolarisNumericGroupPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this
     *          <code>SolarisNumericGroupPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public boolean isPrimaryGroup() {

    /**
     * Return whether this group identification number (GID) represents
     * the primary group to which this user belongs.
     *
     * <p>
     *
     * @return true if this group identification number (GID) represents
     *          the primary group to which this user belongs,
     *          or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public long longValue() {

    /**
     * Return the user's group identification number (GID) for this
     * <code>SolarisNumericGroupPrincipal</code> as a long.
     *
     * <p>
     *
     * @return the user's group identification number (GID) for this
     *          <code>SolarisNumericGroupPrincipal</code> as a long.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public String getName() {

    /**
     * Return the user's group identification number (GID) for this
     * <code>SolarisNumericGroupPrincipal</code>.
     *
     * <p>
     *
     * @return the user's group identification number (GID) for this
     *          <code>SolarisNumericGroupPrincipal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public SolarisNumericGroupPrincipal(long name, boolean primaryGroup) {

    /**
     * Create a <code>SolarisNumericGroupPrincipal</code> using a
     * long representation of the user's group identification number (GID).
     *
     * <p>
     *
     * @param name the user's group identification number (GID) for this user
     *                  represented as a long. <p>
     *
     * @param primaryGroup true if the specified GID represents the
     *                  primary group to which this user belongs.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    public SolarisNumericGroupPrincipal(String name, boolean primaryGroup) {

    /**
     * Create a <code>SolarisNumericGroupPrincipal</code> using a
     * <code>String</code> representation of the user's
     * group identification number (GID).
     *
     * <p>
     *
     * @param name the user's group identification number (GID)
     *                  for this user. <p>
     *
     * @param primaryGroup true if the specified GID represents the
     *                  primary group to which this user belongs.
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    private boolean primaryGroup;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/SolarisNumericGroupPrincipal.java
@jdk.Exported(false)

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents a user's Solaris group identification number (GID).
 *
 * <p> Principals such as this <code>SolarisNumericGroupPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.

 * @deprecated As of JDK&nbsp;1.4, replaced by
 *             {@link UnixNumericGroupPrincipal}.
 *             This class is entirely deprecated.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
