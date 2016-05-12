_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public boolean equals(Object other) {

    /**
     * Compares the specified Object with this KerberosKey for equality.
     * Returns true if the given object is also a
     * {@code KerberosKey} and the two
     * {@code KerberosKey} instances are equivalent.
     *
     * @param other the Object to compare to
     * @return true if the specified object is equal to this KerberosKey,
     * false otherwise. NOTE: Returns false if either of the KerberosKey
     * objects has been destroyed.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public int hashCode() {

    /**
     * Returns a hashcode for this KerberosKey.
     *
     * @return a hashCode() for the {@code KerberosKey}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public boolean isDestroyed() {

    /** Determines if this key has been destroyed.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public void destroy() throws DestroyFailedException {

    /**
     * Destroys this key. A call to any of its other methods after this
     * will cause an  IllegalStateException to be thrown.
     *
     * @throws DestroyFailedException if some error occurs while destorying
     * this key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public final byte[] getEncoded() {

    /**
     * Returns the key material of this secret key.
     *
     * @return the key material
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public final String getFormat() {

    /**
     * Returns the name of the encoding format for this secret key.
     *
     * @return the String "RAW"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public final String getAlgorithm() {

    /**
     * Returns the standard algorithm name for this key. For
     * example, "DES" would indicate that this key is a DES key.
     * See Appendix A in the <a href=
     * "../../../../../technotes/guides/security/crypto/CryptoSpec.html#AppA">
     * Java Cryptography Architecture API Specification &amp; Reference
     * </a>
     * for information about standard algorithm names.
     *
     * @return the name of the algorithm associated with this key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public final int getKeyType() {

    /**
     * Returns the key type for this long-term key.
     *
     * @return the key type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public final int getVersionNumber() {

    /**
     * Returns the key version number.
     *
     * @return the key version number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public final KerberosPrincipal getPrincipal() {

    /**
     * Returns the principal that this key belongs to.
     *
     * @return the principal this key belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public KerberosKey(KerberosPrincipal principal,
                       char[] password,
                       String algorithm) {

    /**
     * Constructs a KerberosKey from a principal's password.
     *
     * @param principal the principal that this password belongs to
     * @param password the password that should be used to compute the key
     * @param algorithm the name for the algorithm that this key will be
     * used for. This parameter may be null in which case the default
     * algorithm "DES" will be assumed.
     * @throws IllegalArgumentException if the name of the
     * algorithm passed is unsupported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    public KerberosKey(KerberosPrincipal principal,
                       byte[] keyBytes,
                       int keyType,
                       int versionNum) {

    /**
     * Constructs a KerberosKey from the given bytes when the key type and
     * key version number are known. This can be used when reading the secret
     * key information from a Kerberos "keytab".
     *
     * @param principal the principal that this secret key belongs to
     * @param keyBytes the raw bytes for the secret key
     * @param keyType the key type for the secret key as defined by the
     * Kerberos protocol specification.
     * @param versionNum the version number of this secret key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    private KeyImpl key;

   /**
    * {@code KeyImpl} is serialized by writing out the ASN1 Encoded bytes
    * of the encryption key.
    * The ASN1 encoding is defined in RFC4120 and as  follows:
    * <pre>
    * EncryptionKey   ::= SEQUENCE {
    *           keytype   [0] Int32 -- actually encryption type --,
    *           keyvalue  [1] OCTET STRING
    * }
    * </pre>
    *
    * @serial
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    private int versionNum;

   /**
     * the version number of this secret key
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
    private KerberosPrincipal principal;

   /**
     * The principal that this secret key belongs to.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KerberosKey.java
public class KerberosKey implements SecretKey, Destroyable {

/**
 * This class encapsulates a long term secret key for a Kerberos
 * principal.<p>
 *
 * All Kerberos JAAS login modules that obtain a principal's password and
 * generate the secret key from it should use this class.
 * Sometimes, such as when authenticating a server in
 * the absence of user-to-user authentication, the login module will store
 * an instance of this class in the private credential set of a
 * {@link javax.security.auth.Subject Subject} during the commit phase of the
 * authentication process.<p>
 *
 * A Kerberos service using a keytab to read secret keys should use
 * the {@link KeyTab} class, where latest keys can be read when needed.<p>
 *
 * It might be necessary for the application to be granted a
 * {@link javax.security.auth.PrivateCredentialPermission
 * PrivateCredentialPermission} if it needs to access the KerberosKey
 * instance from a Subject. This permission is not needed when the
 * application depends on the default JGSS Kerberos mechanism to access the
 * KerberosKey. In that case, however, the application will need an
 * appropriate
 * {@link javax.security.auth.kerberos.ServicePermission ServicePermission}.
 *
 * @author Mayank Upadhyay
 * @since 1.4
 */
