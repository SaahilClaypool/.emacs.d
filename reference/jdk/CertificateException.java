_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateException.java
    public CertificateException(Throwable cause) {

    /**
     * Creates a {@code CertificateException} with the specified cause
     * and a detail message of {@code (cause==null ? null : cause.toString())}
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateException.java
    public CertificateException(String message, Throwable cause) {

    /**
     * Creates a {@code CertificateException} with the specified
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateException.java
    public CertificateException(String msg) {

    /**
     * Constructs a certificate exception with the given detail
     * message. A detail message is a String that describes this
     * particular exception.
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateException.java
    public CertificateException() {

    /**
     * Constructs a certificate exception with no detail message. A detail
     * message is a String that describes this particular exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertificateException.java
public class CertificateException extends GeneralSecurityException {

/**
 * This exception indicates one of a variety of certificate problems.
 *
 * @author Hemma Prafullchandra
 * @see Certificate
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/CertificateException.java
    public CertificateException(String msg) {

    /**
     * Constructs a certificate exception with the given detail
     * message. A detail message is a String that describes this
     * particular exception.
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/CertificateException.java
    public CertificateException() {

    /**
     * Constructs a certificate exception with no detail message. A detail
     * message is a String that describes this particular exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/cert/CertificateException.java
public class CertificateException extends Exception {

/**
 * This exception indicates one of a variety of certificate problems.
 *
 * <p><em>Note: The classes in the package {@code javax.security.cert}
 * exist for compatibility with earlier versions of the
 * Java Secure Sockets Extension (JSSE). New applications should instead
 * use the standard Java SE certificate classes located in
 * {@code java.security.cert}.</em></p>
 *
 * @author Hemma Prafullchandra
 * @since 1.4
 * @see Certificate
 */
