_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public RSAOtherPrimeInfo[] getOtherPrimeInfo() {

    /**
     * Returns a copy of the otherPrimeInfo or null if there are
     * only two prime factors (p and q).
     *
     * @return the otherPrimeInfo. Returns a new array each
     * time this method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public BigInteger getCrtCoefficient() {

    /**
     * Returns the crtCoefficient.
     *
     * @return the crtCoefficient.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public BigInteger getPrimeExponentQ() {

    /**
     * Returns the primeExponentQ.
     *
     * @return the primeExponentQ.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public BigInteger getPrimeExponentP() {

    /**
     * Returns the primeExponentP.
     *
     * @return the primeExponentP.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public BigInteger getPrimeQ() {

    /**
     * Returns the primeQ.
     *
     * @return the primeQ.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public BigInteger getPrimeP() {

    /**
     * Returns the primeP.
     *
     * @return the primeP.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public BigInteger getPublicExponent() {

    /**
     * Returns the public exponent.
     *
     * @return the public exponent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
    public RSAMultiPrimePrivateCrtKeySpec(BigInteger modulus,
                                BigInteger publicExponent,
                                BigInteger privateExponent,
                                BigInteger primeP,
                                BigInteger primeQ,
                                BigInteger primeExponentP,
                                BigInteger primeExponentQ,
                                BigInteger crtCoefficient,
                                RSAOtherPrimeInfo[] otherPrimeInfo) {

   /**
    * Creates a new {@code RSAMultiPrimePrivateCrtKeySpec}
    * given the modulus, publicExponent, privateExponent,
    * primeP, primeQ, primeExponentP, primeExponentQ,
    * crtCoefficient, and otherPrimeInfo as defined in PKCS#1 v2.1.
    *
    * <p>Note that the contents of {@code otherPrimeInfo}
    * are copied to protect against subsequent modification when
    * constructing this object.
    *
    * @param modulus the modulus n.
    * @param publicExponent the public exponent e.
    * @param privateExponent the private exponent d.
    * @param primeP the prime factor p of n.
    * @param primeQ the prime factor q of n.
    * @param primeExponentP this is d mod (p-1).
    * @param primeExponentQ this is d mod (q-1).
    * @param crtCoefficient the Chinese Remainder Theorem
    * coefficient q-1 mod p.
    * @param otherPrimeInfo triplets of the rest of primes, null can be
    * specified if there are only two prime factors (p and q).
    * @exception NullPointerException if any of the parameters, i.e.
    * {@code modulus},
    * {@code publicExponent}, {@code privateExponent},
    * {@code primeP}, {@code primeQ},
    * {@code primeExponentP}, {@code primeExponentQ},
    * {@code crtCoefficient}, is null.
    * @exception IllegalArgumentException if an empty, i.e. 0-length,
    * {@code otherPrimeInfo} is specified.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAMultiPrimePrivateCrtKeySpec.java
public class RSAMultiPrimePrivateCrtKeySpec extends RSAPrivateKeySpec {

/**
 * This class specifies an RSA multi-prime private key, as defined in the
 * PKCS#1 v2.1, using the Chinese Remainder Theorem (CRT) information
 * values for efficiency.
 *
 * @author Valerie Peng
 *
 *
 * @see java.security.Key
 * @see java.security.KeyFactory
 * @see KeySpec
 * @see PKCS8EncodedKeySpec
 * @see RSAPrivateKeySpec
 * @see RSAPublicKeySpec
 * @see RSAOtherPrimeInfo
 *
 * @since 1.4
 */
