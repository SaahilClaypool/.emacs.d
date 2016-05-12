_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAKeyGenParameterSpec.java
    public BigInteger getPublicExponent() {

    /**
     * Returns the public-exponent value.
     *
     * @return the public-exponent value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAKeyGenParameterSpec.java
    public int getKeysize() {

    /**
     * Returns the keysize.
     *
     * @return the keysize.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAKeyGenParameterSpec.java
    public RSAKeyGenParameterSpec(int keysize, BigInteger publicExponent) {

    /**
     * Constructs a new {@code RSAParameterSpec} object from the
     * given keysize and public-exponent value.
     *
     * @param keysize the modulus size (specified in number of bits)
     * @param publicExponent the public exponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAKeyGenParameterSpec.java
    public static final BigInteger F4 = BigInteger.valueOf(65537);

    /**
     * The public exponent-value F4 = 65537.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAKeyGenParameterSpec.java
    public static final BigInteger F0 = BigInteger.valueOf(3);

    /**
     * The public-exponent value F0 = 3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAKeyGenParameterSpec.java
public class RSAKeyGenParameterSpec implements AlgorithmParameterSpec {

/**
 * This class specifies the set of parameters used to generate an RSA
 * key pair.
 *
 * @author Jan Luehe
 *
 * @see java.security.KeyPairGenerator#initialize(java.security.spec.AlgorithmParameterSpec)
 *
 * @since 1.3
 */
