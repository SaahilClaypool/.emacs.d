_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
    INVALID_NAME

    /**
     * The name constraints have been violated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
    PATH_TOO_LONG,

    /**
     * The path length constraint has been violated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
    NOT_CA_CERT,

    /**
     * The certificate is not a CA certificate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
    UNRECOGNIZED_CRIT_EXT,

    /**
     * The certificate contains one or more unrecognized critical
     * extensions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
    NO_TRUST_ANCHOR,

    /**
     * No acceptable trust anchor found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
    INVALID_POLICY,

    /**
     * The policy constraints have been violated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
    INVALID_KEY_USAGE,

    /**
     * The certificate's key usage is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/PKIXReason.java
public enum PKIXReason implements CertPathValidatorException.Reason {

/**
 * The {@code PKIXReason} enumerates the potential PKIX-specific reasons
 * that an X.509 certification path may be invalid according to the PKIX
 * (RFC 3280) standard. These reasons are in addition to those of the
 * {@code CertPathValidatorException.BasicReason} enumeration.
 *
 * @since 1.7
 */
