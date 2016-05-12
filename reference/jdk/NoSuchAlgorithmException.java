_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/NoSuchAlgorithmException.java
    public NoSuchAlgorithmException(Throwable cause) {

    /**
     * Creates a {@code NoSuchAlgorithmException} with the specified cause
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/NoSuchAlgorithmException.java
    public NoSuchAlgorithmException(String message, Throwable cause) {

    /**
     * Creates a {@code NoSuchAlgorithmException} with the specified
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/NoSuchAlgorithmException.java
    public NoSuchAlgorithmException(String msg) {

    /**
     * Constructs a NoSuchAlgorithmException with the specified
     * detail message. A detail message is a String that describes
     * this particular exception, which may, for example, specify which
     * algorithm is not available.
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/NoSuchAlgorithmException.java
    public NoSuchAlgorithmException() {

    /**
     * Constructs a NoSuchAlgorithmException with no detail
     * message. A detail message is a String that describes this
     * particular exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/NoSuchAlgorithmException.java
public class NoSuchAlgorithmException extends GeneralSecurityException {

/**
 * This exception is thrown when a particular cryptographic algorithm is
 * requested but is not available in the environment.
 *
 * @author Benjamin Renaud
 */
