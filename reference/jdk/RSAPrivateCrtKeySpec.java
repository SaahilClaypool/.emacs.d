_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
    public BigInteger getCrtCoefficient() {

    /**
     * Returns the crtCoefficient.
     *
     * @return the crtCoefficient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
    public BigInteger getPrimeExponentQ() {

    /**
     * Returns the primeExponentQ.
     *
     * @return the primeExponentQ
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
    public BigInteger getPrimeExponentP() {

    /**
     * Returns the primeExponentP.
     *
     * @return the primeExponentP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
    public BigInteger getPrimeQ() {

    /**
     * Returns the primeQ.
     *
     * @return the primeQ
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
    public BigInteger getPrimeP() {

    /**
     * Returns the primeP.

     * @return the primeP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
    public BigInteger getPublicExponent() {

    /**
     * Returns the public exponent.
     *
     * @return the public exponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
    public RSAPrivateCrtKeySpec(BigInteger modulus,
                                BigInteger publicExponent,
                                BigInteger privateExponent,
                                BigInteger primeP,
                                BigInteger primeQ,
                                BigInteger primeExponentP,
                                BigInteger primeExponentQ,
                                BigInteger crtCoefficient) {

   /**
    * Creates a new {@code RSAPrivateCrtKeySpec}
    * given the modulus, publicExponent, privateExponent,
    * primeP, primeQ, primeExponentP, primeExponentQ, and
    * crtCoefficient as defined in PKCS#1.
    *
    * @param modulus the modulus n
    * @param publicExponent the public exponent e
    * @param privateExponent the private exponent d
    * @param primeP the prime factor p of n
    * @param primeQ the prime factor q of n
    * @param primeExponentP this is d mod (p-1)
    * @param primeExponentQ this is d mod (q-1)
    * @param crtCoefficient the Chinese Remainder Theorem
    * coefficient q-1 mod p
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAPrivateCrtKeySpec.java
public class RSAPrivateCrtKeySpec extends RSAPrivateKeySpec {

/**
 * This class specifies an RSA private key, as defined in the PKCS#1
 * standard, using the Chinese Remainder Theorem (CRT) information values for
 * efficiency.
 *
 * @author Jan Luehe
 *
 *
 * @see java.security.Key
 * @see java.security.KeyFactory
 * @see KeySpec
 * @see PKCS8EncodedKeySpec
 * @see RSAPrivateKeySpec
 * @see RSAPublicKeySpec
 */
