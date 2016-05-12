_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>NTSid</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>NTSid</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>NTSid</code>
     * for equality.  Returns true if the given object is also a
     * <code>NTSid</code> and the two NTSids have the same String
     * representation.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>NTSid</code>.
     *
     * @return true if the specified Object is equal to this
     *          <code>NTSid</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public String toString() {

    /**
     * Return a string representation of this <code>NTSid</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>NTSid</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public String getName() {

    /**
     * Return a string version of this <code>NTSid</code>.
     *
     * <p>
     *
     * @return a string version of this <code>NTSid</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public NTSid (String stringSid) {

    /**
     * Create an <code>NTSid</code> with a Windows NT SID.
     *
     * <p>
     *
     * @param stringSid the Windows NT SID. <p>
     *
     * @exception NullPointerException if the <code>String</code>
     *                  is <code>null</code>.
     *
     * @exception IllegalArgumentException if the <code>String</code>
     *                  has zero length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    private String sid;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
@jdk.Exported

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents information about a Windows NT user, group or realm.
 *
 * <p> Windows NT chooses to represent users, groups and realms (or domains)
 * with not only common names, but also relatively unique numbers.  These
 * numbers are called Security IDentifiers, or SIDs.  Windows NT
 * also provides services that render these SIDs into string forms.
 * This class represents these string forms.
 *
 * <p> Principals such as this <code>NTSid</code>
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public int hashCode() {

    /**
     * Return a hash code for this <code>NTSid</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>NTSid</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public boolean equals(Object o) {

    /**
     * Compares the specified Object with this <code>NTSid</code>
     * for equality.  Returns true if the given object is also a
     * <code>NTSid</code> and the two NTSids have the same String
     * representation.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *          <code>NTSid</code>.
     *
     * @return true if the specified Object is equal to this
     *          <code>NTSid</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public String toString() {

    /**
     * Return a string representation of this <code>NTSid</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>NTSid</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public String getName() {

    /**
     * Return a string version of this <code>NTSid</code>.
     *
     * <p>
     *
     * @return a string version of this <code>NTSid</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    public NTSid (String stringSid) {

    /**
     * Create an <code>NTSid</code> with a Windows NT SID.
     *
     * <p>
     *
     * @param stringSid the Windows NT SID. <p>
     *
     * @exception NullPointerException if the <code>String</code>
     *                  is <code>null</code>.
     *
     * @exception IllegalArgumentException if the <code>String</code>
     *                  has zero length.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
    private String sid;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/security/auth/NTSid.java
@jdk.Exported

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents information about a Windows NT user, group or realm.
 *
 * <p> Windows NT chooses to represent users, groups and realms (or domains)
 * with not only common names, but also relatively unique numbers.  These
 * numbers are called Security IDentifiers, or SIDs.  Windows NT
 * also provides services that render these SIDs into string forms.
 * This class represents these string forms.
 *
 * <p> Principals such as this <code>NTSid</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
