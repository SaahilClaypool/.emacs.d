_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/PKCS8EncodedKeySpec.java
    public final String getFormat() {

    /**
     * Returns the name of the encoding format associated with this
     * key specification.
     *
     * @return the string {@code "PKCS#8"}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/PKCS8EncodedKeySpec.java
    public byte[] getEncoded() {

    /**
     * Returns the key bytes, encoded according to the PKCS #8 standard.
     *
     * @return the PKCS #8 encoding of the key. Returns a new array
     * each time this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/PKCS8EncodedKeySpec.java
    public PKCS8EncodedKeySpec(byte[] encodedKey) {

    /**
     * Creates a new PKCS8EncodedKeySpec with the given encoded key.
     *
     * @param encodedKey the key, which is assumed to be
     * encoded according to the PKCS #8 standard. The contents of
     * the array are copied to protect against subsequent modification.
     * @exception NullPointerException if {@code encodedKey}
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/PKCS8EncodedKeySpec.java
public class PKCS8EncodedKeySpec extends EncodedKeySpec {

/**
 * This class represents the ASN.1 encoding of a private key,
 * encoded according to the ASN.1 type {@code PrivateKeyInfo}.
 * The {@code PrivateKeyInfo} syntax is defined in the PKCS#8 standard
 * as follows:
 *
 * <pre>
 * PrivateKeyInfo ::= SEQUENCE {
 *   version Version,
 *   privateKeyAlgorithm PrivateKeyAlgorithmIdentifier,
 *   privateKey PrivateKey,
 *   attributes [0] IMPLICIT Attributes OPTIONAL }
 *
 * Version ::= INTEGER
 *
 * PrivateKeyAlgorithmIdentifier ::= AlgorithmIdentifier
 *
 * PrivateKey ::= OCTET STRING
 *
 * Attributes ::= SET OF Attribute
 * </pre>
 *
 * @author Jan Luehe
 *
 *
 * @see java.security.Key
 * @see java.security.KeyFactory
 * @see KeySpec
 * @see EncodedKeySpec
 * @see X509EncodedKeySpec
 *
 * @since 1.2
 */
