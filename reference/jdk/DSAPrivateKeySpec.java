_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPrivateKeySpec.java
    public BigInteger getG() {

    /**
     * Returns the base {@code g}.
     *
     * @return the base {@code g}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPrivateKeySpec.java
    public BigInteger getQ() {

    /**
     * Returns the sub-prime {@code q}.
     *
     * @return the sub-prime {@code q}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPrivateKeySpec.java
    public BigInteger getP() {

    /**
     * Returns the prime {@code p}.
     *
     * @return the prime {@code p}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPrivateKeySpec.java
    public BigInteger getX() {

    /**
     * Returns the private key {@code x}.
     *
     * @return the private key {@code x}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPrivateKeySpec.java
    public DSAPrivateKeySpec(BigInteger x, BigInteger p, BigInteger q,
                             BigInteger g) {

    /**
     * Creates a new DSAPrivateKeySpec with the specified parameter values.
     *
     * @param x the private key.
     *
     * @param p the prime.
     *
     * @param q the sub-prime.
     *
     * @param g the base.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/DSAPrivateKeySpec.java
public class DSAPrivateKeySpec implements KeySpec {

/**
 * This class specifies a DSA private key with its associated parameters.
 *
 * @author Jan Luehe
 *
 *
 * @see java.security.Key
 * @see java.security.KeyFactory
 * @see KeySpec
 * @see DSAPublicKeySpec
 * @see PKCS8EncodedKeySpec
 *
 * @since 1.2
 */
