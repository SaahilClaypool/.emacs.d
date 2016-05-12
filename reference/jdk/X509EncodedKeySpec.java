_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/X509EncodedKeySpec.java
    public final String getFormat() {

    /**
     * Returns the name of the encoding format associated with this
     * key specification.
     *
     * @return the string {@code "X.509"}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/X509EncodedKeySpec.java
    public byte[] getEncoded() {

    /**
     * Returns the key bytes, encoded according to the X.509 standard.
     *
     * @return the X.509 encoding of the key. Returns a new array
     * each time this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/X509EncodedKeySpec.java
    public X509EncodedKeySpec(byte[] encodedKey) {

    /**
     * Creates a new X509EncodedKeySpec with the given encoded key.
     *
     * @param encodedKey the key, which is assumed to be
     * encoded according to the X.509 standard. The contents of the
     * array are copied to protect against subsequent modification.
     * @exception NullPointerException if {@code encodedKey}
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/X509EncodedKeySpec.java
public class X509EncodedKeySpec extends EncodedKeySpec {

/**
 * This class represents the ASN.1 encoding of a public key,
 * encoded according to the ASN.1 type {@code SubjectPublicKeyInfo}.
 * The {@code SubjectPublicKeyInfo} syntax is defined in the X.509
 * standard as follows:
 *
 * <pre>
 * SubjectPublicKeyInfo ::= SEQUENCE {
 *   algorithm AlgorithmIdentifier,
 *   subjectPublicKey BIT STRING }
 * </pre>
 *
 * @author Jan Luehe
 *
 *
 * @see java.security.Key
 * @see java.security.KeyFactory
 * @see KeySpec
 * @see EncodedKeySpec
 * @see PKCS8EncodedKeySpec
 *
 * @since 1.2
 */
