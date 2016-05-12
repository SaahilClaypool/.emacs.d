_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public int hashCode() {

    /**
     * Returns a hashcode for this identity.
     *
     * @return a hashcode for this identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public String toString(boolean detailed) {

    /**
     * Returns a string representation of this identity, with
     * optionally more details than that provided by the
     * {@code toString} method without any arguments.
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "printIdentity"}
     * as its argument to see if it's ok to return the string.
     *
     * @param detailed whether or not to provide detailed information.
     *
     * @return information about this identity. If {@code detailed}
     * is true, then this method returns more information than that
     * provided by the {@code toString} method without any arguments.
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * returning a string describing this identity.
     *
     * @see #toString
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public String toString() {

    /**
     * Returns a short string describing this identity, telling its
     * name and its scope (if any).
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "printIdentity"}
     * as its argument to see if it's ok to return the string.
     *
     * @return information about this identity, such as its name and the
     * name of its scope (if any).
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * returning a string describing this identity.
     *
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    String fullName() {

    /**
     * Returns a parsable name for identity: identityName.scopeName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    protected boolean identityEquals(Identity identity) {

    /**
     * Tests for equality between the specified identity and this identity.
     * This method should be overriden by subclasses to test for equality.
     * The default behavior is to return true if the names and public keys
     * are equal.
     *
     * @param identity the identity to test for equality with this identity.
     *
     * @return true if the identities are considered equal, false
     * otherwise.
     *
     * @see #equals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public final boolean equals(Object identity) {

    /**
     * Tests for equality between the specified object and this identity.
     * This first tests to see if the entities actually refer to the same
     * object, in which case it returns true. Next, it checks to see if
     * the entities have the same name and the same scope. If they do,
     * the method returns true. Otherwise, it calls
     * {@link #identityEquals(Identity) identityEquals}, which subclasses should
     * override.
     *
     * @param identity the object to test for equality with this identity.
     *
     * @return true if the objects are considered equal, false otherwise.
     *
     * @see #identityEquals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public Certificate[] certificates() {

    /**
     * Returns a copy of all the certificates for this identity.
     *
     * @return a copy of all the certificates for this identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public void removeCertificate(Certificate certificate)

    /**
     * Removes a certificate from this identity.
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "removeIdentityCertificate"}
     * as its argument to see if it's ok to remove a certificate.
     *
     * @param certificate the certificate to be removed.
     *
     * @exception KeyManagementException if the certificate is
     * missing, or if another exception occurs.
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * removing a certificate.
     *
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public void addCertificate(Certificate certificate)

    /**
     * Adds a certificate for this identity. If the identity has a public
     * key, the public key in the certificate must be the same, and if
     * the identity does not have a public key, the identity's
     * public key is set to be that specified in the certificate.
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "addIdentityCertificate"}
     * as its argument to see if it's ok to add a certificate.
     *
     * @param certificate the certificate to be added.
     *
     * @exception KeyManagementException if the certificate is not valid,
     * if the public key in the certificate being added conflicts with
     * this identity's public key, or if another exception occurs.
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * adding a certificate.
     *
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public String getInfo() {

    /**
     * Returns general information previously specified for this identity.
     *
     * @return general information about this identity.
     *
     * @see #setInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public void setInfo(String info) {

    /**
     * Specifies a general information string for this identity.
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "setIdentityInfo"}
     * as its argument to see if it's ok to specify the information string.
     *
     * @param info the information string.
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * setting the information string.
     *
     * @see #getInfo
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    /* Should we throw an exception if this is already set? */

    /**
     * Sets this identity's public key. The old key and all of this
     * identity's certificates are removed by this operation.
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "setIdentityPublicKey"}
     * as its argument to see if it's ok to set the public key.
     *
     * @param key the public key for this identity.
     *
     * @exception KeyManagementException if another identity in the
     * identity's scope has the same public key, or if another exception occurs.
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * setting the public key.
     *
     * @see #getPublicKey
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public PublicKey getPublicKey() {

    /**
     * Returns this identity's public key.
     *
     * @return the public key for this identity.
     *
     * @see #setPublicKey
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public final IdentityScope getScope() {

    /**
     * Returns this identity's scope.
     *
     * @return the scope of this identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public final String getName() {

    /**
     * Returns this identity's name.
     *
     * @return the name of this identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public Identity(String name) {

    /**
     * Constructs an identity with the specified name and no scope.
     *
     * @param name the identity name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    public Identity(String name, IdentityScope scope) throws

    /**
     * Constructs an identity with the specified name and scope.
     *
     * @param name the identity name.
     * @param scope the scope of the identity.
     *
     * @exception KeyManagementException if there is already an identity
     * with the same name in the scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    protected Identity() {

    /**
     * Constructor for serialization only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    Vector<Certificate> certificates;

    /**
     * The certificates for this identity.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    IdentityScope scope;

    /**
     * The scope of the identity.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    String info = "No further information available.";

    /**
     * Generic, descriptive information about the identity.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    private PublicKey publicKey;

    /**
     * The public key for this identity.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    private String name;

    /**
     * The name for this identity.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
    private static final long serialVersionUID = 3609922007826600659L;

    /** use serialVersionUID from JDK 1.1.x for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Identity.java
@Deprecated

/**
 * <p>This class represents identities: real-world objects such as people,
 * companies or organizations whose identities can be authenticated using
 * their public keys. Identities may also be more abstract (or concrete)
 * constructs, such as daemon threads or smart cards.
 *
 * <p>All Identity objects have a name and a public key. Names are
 * immutable. Identities may also be scoped. That is, if an Identity is
 * specified to have a particular scope, then the name and public
 * key of the Identity are unique within that scope.
 *
 * <p>An Identity also has a set of certificates (all certifying its own
 * public key). The Principal names specified in these certificates need
 * not be the same, only the key.
 *
 * <p>An Identity can be subclassed, to include postal and email addresses,
 * telephone numbers, images of faces and logos, and so on.
 *
 * @see IdentityScope
 * @see Signer
 * @see Principal
 *
 * @author Benjamin Renaud
 * @deprecated This class is no longer used. Its functionality has been
 * replaced by {@code java.security.KeyStore}, the
 * {@code java.security.cert} package, and
 * {@code java.security.Principal}.
 */
