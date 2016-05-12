_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
    public boolean isDestroyed() {

    /**
     * Determines if the references to the X.509 certificate and private key
     * in this object have been cleared.
     * <p>
     * @return true if X509Certificate and the PrivateKey are null

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
    public void destroy() {

    /**
     * Clears the references to the X.509 certificate, private key and the
     * KeyStore alias in this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
    public String getAlias() {

    /**
     * Returns the KeyStore alias.
     * <p>
     * @return the KeyStore alias
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
    public PrivateKey getPrivateKey() {

    /**
     * Returns the PrivateKey.
     * <p>
     * @return the PrivateKey
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
    public X509Certificate getCertificate() {

    /**
     * Returns the X.509 certificate.
     * <p>
     * @return the X509Certificate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
    public X500PrivateCredential(X509Certificate cert, PrivateKey key,
                                 String alias) {

    /**
     * Creates an X500PrivateCredential that associates an X.509 certificate,
     * a private key and the KeyStore alias.
     * <p>
     * @param cert X509Certificate
     * @param key  PrivateKey for the certificate
     * @param alias KeyStore alias
     * @exception IllegalArgumentException if either {@code cert},
     * {@code key} or {@code alias} is null
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
    public X500PrivateCredential(X509Certificate cert, PrivateKey key) {

    /**
     * Creates an X500PrivateCredential that associates an X.509 certificate,
     * a private key and the KeyStore alias.
     * <p>
     * @param cert X509Certificate
     * @param key  PrivateKey for the certificate
     * @exception IllegalArgumentException if either {@code cert} or
     * {@code key} is null
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/x500/X500PrivateCredential.java
public final class X500PrivateCredential implements Destroyable {

/**
 * <p> This class represents an {@code X500PrivateCredential}.
 * It associates an X.509 certificate, corresponding private key and the
 * KeyStore alias used to reference that exact key pair in the KeyStore.
 * This enables looking up the private credentials for an X.500 principal
 * in a subject.
 *
 */
