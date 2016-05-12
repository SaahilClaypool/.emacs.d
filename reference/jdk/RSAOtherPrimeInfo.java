_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAOtherPrimeInfo.java
    public final BigInteger getCrtCoefficient() {

    /**
     * Returns the prime's crtCoefficient.
     *
     * @return the crtCoefficient.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAOtherPrimeInfo.java
    public final BigInteger getExponent() {

    /**
     * Returns the prime's exponent.
     *
     * @return the primeExponent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAOtherPrimeInfo.java
    public final BigInteger getPrime() {

    /**
     * Returns the prime.
     *
     * @return the prime.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAOtherPrimeInfo.java
    public RSAOtherPrimeInfo(BigInteger prime,
                          BigInteger primeExponent,
                          BigInteger crtCoefficient) {

   /**
    * Creates a new {@code RSAOtherPrimeInfo}
    * given the prime, primeExponent, and
    * crtCoefficient as defined in PKCS#1.
    *
    * @param prime the prime factor of n.
    * @param primeExponent the exponent.
    * @param crtCoefficient the Chinese Remainder Theorem
    * coefficient.
    * @exception NullPointerException if any of the parameters, i.e.
    * {@code prime}, {@code primeExponent},
    * {@code crtCoefficient}, is null.
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/spec/RSAOtherPrimeInfo.java
public class RSAOtherPrimeInfo {

/**
 * This class represents the triplet (prime, exponent, and coefficient)
 * inside RSA's OtherPrimeInfo structure, as defined in the PKCS#1 v2.1.
 * The ASN.1 syntax of RSA's OtherPrimeInfo is as follows:
 *
 * <pre>
 * OtherPrimeInfo ::= SEQUENCE {
 *   prime INTEGER,
 *   exponent INTEGER,
 *   coefficient INTEGER
 *   }
 *
 * </pre>
 *
 * @author Valerie Peng
 *
 *
 * @see RSAPrivateCrtKeySpec
 * @see java.security.interfaces.RSAMultiPrimePrivateCrtKey
 *
 * @since 1.4
 */
