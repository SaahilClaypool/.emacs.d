_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRL.java
    public abstract boolean isRevoked(Certificate cert);

    /**
     * Checks whether the given certificate is on this CRL.
     *
     * @param cert the certificate to check for.
     * @return true if the given certificate is on this CRL,
     * false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRL.java
    public abstract String toString();

    /**
     * Returns a string representation of this CRL.
     *
     * @return a string representation of this CRL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRL.java
    public final String getType() {

    /**
     * Returns the type of this CRL.
     *
     * @return the type of this CRL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRL.java
    protected CRL(String type) {

    /**
     * Creates a CRL of the specified type.
     *
     * @param type the standard name of the CRL type.
     * See Appendix A in the <a href=
     * "../../../../technotes/guides/security/crypto/CryptoSpec.html#AppA">
     * Java Cryptography Architecture API Specification &amp; Reference </a>
     * for information about standard CRL types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRL.java
public abstract class CRL {

/**
 * This class is an abstraction of certificate revocation lists (CRLs) that
 * have different formats but important common uses. For example, all CRLs
 * share the functionality of listing revoked certificates, and can be queried
 * on whether or not they list a given certificate.
 * <p>
 * Specialized CRL types can be defined by subclassing off of this abstract
 * class.
 *
 * @author Hemma Prafullchandra
 *
 *
 * @see X509CRL
 * @see CertificateFactory
 *
 * @since 1.2
 */
