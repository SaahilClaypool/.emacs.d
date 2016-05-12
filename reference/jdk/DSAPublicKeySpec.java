_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPublicKeySpec.java
    public BigInteger getG() {

    /**
     * Returns the base {@code g}.
     *
     * @return the base {@code g}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPublicKeySpec.java
    public BigInteger getQ() {

    /**
     * Returns the sub-prime {@code q}.
     *
     * @return the sub-prime {@code q}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPublicKeySpec.java
    public BigInteger getP() {

    /**
     * Returns the prime {@code p}.
     *
     * @return the prime {@code p}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPublicKeySpec.java
    public BigInteger getY() {

    /**
     * Returns the public key {@code y}.
     *
     * @return the public key {@code y}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPublicKeySpec.java
    public DSAPublicKeySpec(BigInteger y, BigInteger p, BigInteger q,
                            BigInteger g) {

    /**
     * Creates a new DSAPublicKeySpec with the specified parameter values.
     *
     * @param y the public key.
     *
     * @param p the prime.
     *
     * @param q the sub-prime.
     *
     * @param g the base.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPublicKeySpec.java
public class DSAPublicKeySpec implements KeySpec {

/**
 * This class specifies a DSA public key with its associated parameters.
 *
 * @author Jan Luehe
 *
 *
 * @see java.security.Key
 * @see java.security.KeyFactory
 * @see KeySpec
 * @see DSAPrivateKeySpec
 * @see X509EncodedKeySpec
 *
 * @since 1.2
 */
