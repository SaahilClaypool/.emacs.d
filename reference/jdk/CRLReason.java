_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    AA_COMPROMISE

    /**
     * This reason indicates that it is known or suspected that the
     * certificate subject's private key has been compromised. It applies
     * to authority attribute (AA) certificates only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    PRIVILEGE_WITHDRAWN,

    /**
     * This reason indicates that the privileges granted to the subject of
     * the certificate have been withdrawn.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    REMOVE_FROM_CRL,

    /**
     * This reason indicates that the certificate was previously on hold
     * and should be removed from the CRL. It is for use with delta CRLs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    UNUSED,

    /**
     * Unused reason.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    CERTIFICATE_HOLD,

    /**
     * This reason indicates that the certificate has been put on hold.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    CESSATION_OF_OPERATION,

    /**
     * This reason indicates that the certificate is no longer needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    SUPERSEDED,

    /**
     * This reason indicates that the certificate has been superseded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    AFFILIATION_CHANGED,

    /**
     * This reason indicates that the subject's name or other information
     * has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    CA_COMPROMISE,

    /**
     * This reason indicates that it is known or suspected that the
     * certificate subject's private key has been compromised. It applies
     * to certificate authority (CA) certificates only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
    KEY_COMPROMISE,

    /**
     * This reason indicates that it is known or suspected that the
     * certificate subject's private key has been compromised. It applies
     * to end-entity certificates only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CRLReason.java
public enum CRLReason {

/**
 * The CRLReason enumeration specifies the reason that a certificate
 * is revoked, as defined in <a href="http://www.ietf.org/rfc/rfc3280.txt">
 * RFC 3280: Internet X.509 Public Key Infrastructure Certificate and CRL
 * Profile</a>.
 *
 * @author Sean Mullan
 * @since 1.7
 * @see X509CRLEntry#getRevocationReason
 * @see CertificateRevokedException#getRevocationReason
 */
