_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathChecker.java
    void check(Certificate cert) throws CertPathValidatorException;

    /**
     * Performs the check(s) on the specified certificate using its internal
     * state. The certificates are presented in the order specified by the
     * {@code init} method.
     *
     * @param cert the {@code Certificate} to be checked
     * @throws CertPathValidatorException if the specified certificate does
     *         not pass the check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathChecker.java
    boolean isForwardCheckingSupported();

    /**
     * Indicates if forward checking is supported. Forward checking refers
     * to the ability of the {@code CertPathChecker} to perform its checks
     * when certificates are presented to the {@code check} method in the
     * forward direction (from target to trust anchor).
     *
     * @return {@code true} if forward checking is supported, {@code false}
     *         otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathChecker.java
    void init(boolean forward) throws CertPathValidatorException;

    /**
     * Initializes the internal state of this {@code CertPathChecker}.
     *
     * <p>The {@code forward} flag specifies the order that certificates will
     * be passed to the {@link #check check} method (forward or reverse).
     *
     * @param forward the order that certificates are presented to the
     *        {@code check} method. If {@code true}, certificates are
     *        presented from target to trust anchor (forward); if
     *        {@code false}, from trust anchor to target (reverse).
     * @throws CertPathValidatorException if this {@code CertPathChecker} is
     *         unable to check certificates in the specified order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathChecker.java
public interface CertPathChecker {

/**
 * <p>Performs one or more checks on each {@code Certificate} of a
 * {@code CertPath}.
 *
 * <p>A {@code CertPathChecker} implementation is typically created to extend
 * a certification path validation algorithm. For example, an implementation
 * may check for and process a critical private extension of each certificate
 * in a certification path.
 *
 * @since 1.8
 */
