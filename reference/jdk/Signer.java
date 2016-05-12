_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
    public String toString() {

    /**
     * Returns a string of information about the signer.
     *
     * @return a string of information about the signer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
    public final void setKeyPair(KeyPair pair)

   /**
     * Sets the key pair (public key and private key) for this signer.
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "setSignerKeyPair"}
     * as its argument to see if it's ok to set the key pair.
     *
     * @param pair an initialized key pair.
     *
     * @exception InvalidParameterException if the key pair is not
     * properly initialized.
     * @exception KeyException if the key pair cannot be set for any
     * other reason.
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * setting the key pair.
     *
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
    public PrivateKey getPrivateKey() {

    /**
     * Returns this signer's private key.
     *
     * <p>First, if there is a security manager, its {@code checkSecurityAccess}
     * method is called with {@code "getSignerPrivateKey"}
     * as its argument to see if it's ok to return the private key.
     *
     * @return this signer's private key, or null if the private key has
     * not yet been set.
     *
     * @exception  SecurityException  if a security manager exists and its
     * {@code checkSecurityAccess} method doesn't allow
     * returning the private key.
     *
     * @see SecurityManager#checkSecurityAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
    public Signer(String name, IdentityScope scope)

    /**
     * Creates a signer with the specified identity name and scope.
     *
     * @param name the identity name.
     *
     * @param scope the scope of the identity.
     *
     * @exception KeyManagementException if there is already an identity
     * with the same name in the scope.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
    public Signer(String name) {

    /**
     * Creates a signer with the specified identity name.
     *
     * @param name the identity name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
    protected Signer() {

    /**
     * Creates a signer. This constructor should only be used for
     * serialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
    private PrivateKey privateKey;

    /**
     * The signer's private key.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Signer.java
@Deprecated

/**
 * This class is used to represent an Identity that can also digitally
 * sign data.
 *
 * <p>The management of a signer's private keys is an important and
 * sensitive issue that should be handled by subclasses as appropriate
 * to their intended use.
 *
 * @see Identity
 *
 * @author Benjamin Renaud
 *
 * @deprecated This class is no longer used. Its functionality has been
 * replaced by {@code java.security.KeyStore}, the
 * {@code java.security.cert} package, and
 * {@code java.security.Principal}.
 */
