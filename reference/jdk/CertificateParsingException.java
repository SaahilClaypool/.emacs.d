_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateParsingException.java
    public CertificateParsingException(Throwable cause) {

    /**
     * Creates a {@code CertificateParsingException} with the
     * specified cause and a detail message of
     * {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of
     * {@code cause}).
     *
     * @param cause the cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A {@code null} value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateParsingException.java
    public CertificateParsingException(String message, Throwable cause) {

    /**
     * Creates a {@code CertificateParsingException} with the specified
     * detail message and cause.
     *
     * @param message the detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method).
     * @param cause the cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A {@code null} value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateParsingException.java
    public CertificateParsingException(String message) {

    /**
     * Constructs a CertificateParsingException with the specified detail
     * message. A detail message is a String that describes this
     * particular exception.
     *
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateParsingException.java
    public CertificateParsingException() {

    /**
     * Constructs a CertificateParsingException with no detail message. A
     * detail message is a String that describes this particular
     * exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateParsingException.java
public class CertificateParsingException extends CertificateException {

/**
 * Certificate Parsing Exception. This is thrown whenever an
 * invalid DER-encoded certificate is parsed or unsupported DER features
 * are found in the Certificate.
 *
 * @author Hemma Prafullchandra
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/CertificateParsingException.java
    public CertificateParsingException(String message) {

    /**
     * Constructs a CertificateParsingException with the specified detail
     * message. A detail message is a String that describes this
     * particular exception.
     *
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/CertificateParsingException.java
    public CertificateParsingException() {

    /**
     * Constructs a CertificateParsingException with no detail message. A
     * detail message is a String that describes this particular
     * exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/CertificateParsingException.java
public class CertificateParsingException extends CertificateException {

/**
 * Certificate Parsing Exception. This is thrown whenever
 * invalid DER encoded certificate is parsed or unsupported DER features
 * are found in the Certificate.
 *
 * <p><em>Note: The classes in the package {@code javax.security.cert}
 * exist for compatibility with earlier versions of the
 * Java Secure Sockets Extension (JSSE). New applications should instead
 * use the standard Java SE certificate classes located in
 * {@code java.security.cert}.</em></p>
 *
 * @since 1.4
 * @author Hemma Prafullchandra
 */
