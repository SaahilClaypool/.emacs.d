_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SignatureException.java
    public SignatureException(Throwable cause) {

    /**
     * Creates a {@code SignatureException} with the specified cause
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/SignatureException.java
    public SignatureException(String message, Throwable cause) {

    /**
     * Creates a {@code SignatureException} with the specified
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/SignatureException.java
    public SignatureException(String msg) {

    /**
     * Constructs a SignatureException with the specified detail
     * message.  A detail message is a String that describes this
     * particular exception.
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SignatureException.java
    public SignatureException() {

    /**
     * Constructs a SignatureException with no detail message. A
     * detail message is a String that describes this particular
     * exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/SignatureException.java
public class SignatureException extends GeneralSecurityException {

/**
 * This is the generic Signature exception.
 *
 * @author Benjamin Renaud
 */
