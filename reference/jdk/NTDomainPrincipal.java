_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>NTDomainPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>NTDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>NTDomainPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>NTDomainPrincipal</code> and the two NTDomainPrincipals
     * have the same name.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>NTDomainPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>NTDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this <code>NTDomainPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>NTDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public String getName() {

    /**
     * Return the Windows NT domain name for this
     * <code>NTDomainPrincipal</code>.
     *
     * <p>
     *
     * @return the Windows NT domain name for this
     *                  <code>NTDomainPrincipal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public NTDomainPrincipal(String name) {

    /**
     * Create an <code>NTDomainPrincipal</code> with a Windows NT domain name.
     *
     * <p>
     *
     * @param name the Windows NT domain name for this user. <p>
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
@jdk.Exported

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents the name of the Windows NT domain into which the
 * user authenticated.  This will be a domain name if the user logged
 * into a Windows NT domain, a workgroup name if the user logged into
 * a workgroup, or a machine name if the user logged into a standalone
 * configuration.
 *
 * <p> Principals such as this <code>NTDomainPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>NTDomainPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>NTDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>NTDomainPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>NTDomainPrincipal</code> and the two NTDomainPrincipals
     * have the same name.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>NTDomainPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>NTDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this <code>NTDomainPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>NTDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public String getName() {

    /**
     * Return the Windows NT domain name for this
     * <code>NTDomainPrincipal</code>.
     *
     * <p>
     *
     * @return the Windows NT domain name for this
     *                  <code>NTDomainPrincipal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    public NTDomainPrincipal(String name) {

    /**
     * Create an <code>NTDomainPrincipal</code> with a Windows NT domain name.
     *
     * <p>
     *
     * @param name the Windows NT domain name for this user. <p>
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
    private String name;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTDomainPrincipal.java
@jdk.Exported

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents the name of the Windows NT domain into which the
 * user authenticated.  This will be a domain name if the user logged
 * into a Windows NT domain, a workgroup name if the user logged into
 * a workgroup, or a machine name if the user logged into a standalone
 * configuration.
 *
 * <p> Principals such as this <code>NTDomainPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
