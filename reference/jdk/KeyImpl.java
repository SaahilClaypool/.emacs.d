_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KeyImpl.java
    private void writeObject(ObjectOutputStream ois)

    /**
     * @serialData this {@code KeyImpl} is serialized by
     * writing out the ASN1 Encoded bytes of the encryption key.
     * The ASN1 encoding is defined in RFC4120 and as  follows:
     * EncryptionKey   ::= SEQUENCE {
     *          keytype    [0] Int32 -- actually encryption type --,
     *          keyvalue   [1] OCTET STRING
     * }
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KeyImpl.java
    public final int getKeyType() {

    /**
     * Returns the keyType for this key as defined in the Kerberos Spec.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KeyImpl.java
    public KeyImpl(KerberosPrincipal principal,
                   char[] password,
                   String algorithm) {

    /**
     * Constructs a KeyImpl from a password.
     *
     * @param principal the principal from which to derive the salt
     * @param password the password that should be used to compute the
     * key.
     * @param algorithm the name for the algorithm that this key wil be
     * used for. This parameter may be null in which case "DES" will be
     * assumed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KeyImpl.java
    public KeyImpl(byte[] keyBytes,
                       int keyType) {

    /**
     * Constructs a KeyImpl from the given bytes.
     *
     * @param keyBytes the raw bytes for the secret key
     * @param keyType the key type for the secret key as defined by the
     * Kerberos protocol specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/kerberos/KeyImpl.java
class KeyImpl implements SecretKey, Destroyable, Serializable {

/**
 * This class encapsulates a Kerberos encryption key. It is not associated
 * with a principal and may represent an ephemeral session key.
 *
 * @author Mayank Upadhyay
 * @since 1.4
 *
 * @serial include
 */
