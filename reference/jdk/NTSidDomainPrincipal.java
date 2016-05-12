_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>NTSidDomainPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>NTSidDomainPrincipal</code> and the two NTSidDomainPrincipals
     * have the same SID.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>NTSidDomainPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>NTSidDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this <code>NTSidDomainPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this
     *          <code>NTSidDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
    public NTSidDomainPrincipal(String name) {

    /**
     * Create an <code>NTSidDomainPrincipal</code> with a Windows NT SID.
     *
     * <p>
     *
     * @param name a string version of the Windows NT SID for this
     *                  user's domain.<p>
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
@jdk.Exported

/**
 * <p> This class extends <code>NTSid</code>
 * and represents a Windows NT user's domain SID.
 *
 * <p> An NT user only has a domain SID if in fact they are logged
 * into an NT domain.  If the user is logged into a workgroup or
 * just a standalone configuration, they will NOT have a domain SID.
 *
 * <p> Principals such as this <code>NTSidDomainPrincipal</code>
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>NTSidDomainPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>NTSidDomainPrincipal</code> and the two NTSidDomainPrincipals
     * have the same SID.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>NTSidDomainPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *          <code>NTSidDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
    public String toString() {

    /**
     * Return a string representation of this <code>NTSidDomainPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this
     *          <code>NTSidDomainPrincipal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
    public NTSidDomainPrincipal(String name) {

    /**
     * Create an <code>NTSidDomainPrincipal</code> with a Windows NT SID.
     *
     * <p>
     *
     * @param name a string version of the Windows NT SID for this
     *                  user's domain.<p>
     *
     * @exception NullPointerException if the <code>name</code>
     *                  is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSidDomainPrincipal.java
@jdk.Exported

/**
 * <p> This class extends <code>NTSid</code>
 * and represents a Windows NT user's domain SID.
 *
 * <p> An NT user only has a domain SID if in fact they are logged
 * into an NT domain.  If the user is logged into a workgroup or
 * just a standalone configuration, they will NOT have a domain SID.
 *
 * <p> Principals such as this <code>NTSidDomainPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
