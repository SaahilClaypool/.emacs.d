_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    public RSAOtherPrimeInfo[] getOtherPrimeInfo();

    /**
     * Returns the otherPrimeInfo or null if there are only
     * two prime factors (p and q).
     *
     * @return the otherPrimeInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    public BigInteger getCrtCoefficient();

    /**
     * Returns the crtCoefficient.
     *
     * @return the crtCoefficient.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    public BigInteger getPrimeExponentQ();

    /**
     * Returns the primeExponentQ.
     *
     * @return the primeExponentQ.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    public BigInteger getPrimeExponentP();

    /**
     * Returns the primeExponentP.
     *
     * @return the primeExponentP.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    public BigInteger getPrimeQ();

    /**
     * Returns the primeQ.
     *
     * @return the primeQ.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    public BigInteger getPrimeP();

    /**
     * Returns the primeP.
     *
     * @return the primeP.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    public BigInteger getPublicExponent();

    /**
     * Returns the public exponent.
     *
     * @return the public exponent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
    static final long serialVersionUID = 618058533534628008L;

    /**
     * The type fingerprint that is set to indicate
     * serialization compatibility with a previous
     * version of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAMultiPrimePrivateCrtKey.java
public interface RSAMultiPrimePrivateCrtKey extends RSAPrivateKey {

/**
 * The interface to an RSA multi-prime private key, as defined in the
 * PKCS#1 v2.1, using the <i>Chinese Remainder Theorem</i>
 * (CRT) information values.
 *
 * @author Valerie Peng
 *
 *
 * @see java.security.spec.RSAPrivateKeySpec
 * @see java.security.spec.RSAMultiPrimePrivateCrtKeySpec
 * @see RSAPrivateKey
 * @see RSAPrivateCrtKey
 *
 * @since 1.4
 */
