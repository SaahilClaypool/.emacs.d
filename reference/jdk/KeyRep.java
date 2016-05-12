_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
    protected Object readResolve() throws ObjectStreamException {

    /**
     * Resolve the Key object.
     *
     * <p> This method supports three Type/format combinations:
     * <ul>
     * <li> Type.SECRET/"RAW" - returns a SecretKeySpec object
     * constructed using encoded key bytes and algorithm
     * <li> Type.PUBLIC/"X.509" - gets a KeyFactory instance for
     * the key algorithm, constructs an X509EncodedKeySpec with the
     * encoded key bytes, and generates a public key from the spec
     * <li> Type.PRIVATE/"PKCS#8" - gets a KeyFactory instance for
     * the key algorithm, constructs a PKCS8EncodedKeySpec with the
     * encoded key bytes, and generates a private key from the spec
     * </ul>
     *
     * <p>
     *
     * @return the resolved Key object
     *
     * @exception ObjectStreamException if the Type/format
     *  combination is unrecognized, if the algorithm, key format, or
     *  encoded key bytes are unrecognized/invalid, of if the
     *  resolution of the key fails for any reason
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
    public KeyRep(Type type, String algorithm,
                String format, byte[] encoded) {

    /**
     * Construct the alternate Key class.
     *
     * <p>
     *
     * @param type either one of Type.SECRET, Type.PUBLIC, or Type.PRIVATE
     * @param algorithm the algorithm returned from
     *          {@code Key.getAlgorithm()}
     * @param format the encoding format returned from
     *          {@code Key.getFormat()}
     * @param encoded the encoded bytes returned from
     *          {@code Key.getEncoded()}
     *
     * @exception NullPointerException
     *          if type is {@code null},
     *          if algorithm is {@code null},
     *          if format is {@code null},
     *          or if encoded is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
    private byte[] encoded;

    /**
     * The encoded Key bytes
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
    private String format;

    /**
     * The Key encoding format
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
    private String algorithm;

    /**
     * The Key algorithm
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
    private Type type;

    /**
     * Either one of Type.SECRET, Type.PUBLIC, or Type.PRIVATE
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
        PRIVATE,

        /** Type for private keys. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
        PUBLIC,

        /** Type for public keys. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
        SECRET,

        /** Type for secret keys. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
    public static enum Type {

    /**
     * Key type.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyRep.java
public class KeyRep implements Serializable {

/**
 * Standardized representation for serialized Key objects.
 *
 * <p>
 *
 * Note that a serialized Key may contain sensitive information
 * which should not be exposed in untrusted environments.  See the
 * <a href="../../../platform/serialization/spec/security.html">
 * Security Appendix</a>
 * of the Serialization Specification for more information.
 *
 * @see Key
 * @see KeyFactory
 * @see javax.crypto.spec.SecretKeySpec
 * @see java.security.spec.X509EncodedKeySpec
 * @see java.security.spec.PKCS8EncodedKeySpec
 *
 * @since 1.5
 */
