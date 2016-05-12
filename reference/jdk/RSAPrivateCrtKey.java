_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
    public BigInteger getCrtCoefficient();

    /**
     * Returns the crtCoefficient.
     *
     * @return the crtCoefficient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
    public BigInteger getPrimeExponentQ();

    /**
     * Returns the primeExponentQ.
     *
     * @return the primeExponentQ
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
    public BigInteger getPrimeExponentP();

    /**
     * Returns the primeExponentP.
     *
     * @return the primeExponentP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
    public BigInteger getPrimeQ();

    /**
     * Returns the primeQ.
     *
     * @return the primeQ
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
    public BigInteger getPrimeP();

    /**
     * Returns the primeP.

     * @return the primeP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
    public BigInteger getPublicExponent();

    /**
     * Returns the public exponent.
     *
     * @return the public exponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
    static final long serialVersionUID = -5682214253527700368L;

    /**
     * The type fingerprint that is set to indicate
     * serialization compatibility with a previous
     * version of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/interfaces/RSAPrivateCrtKey.java
public interface RSAPrivateCrtKey extends RSAPrivateKey {

/**
 * The interface to an RSA private key, as defined in the PKCS#1 standard,
 * using the <i>Chinese Remainder Theorem</i> (CRT) information values.
 *
 * @author Jan Luehe
 *
 *
 * @see RSAPrivateKey
 */
