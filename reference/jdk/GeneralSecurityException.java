_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/GeneralSecurityException.java
    public GeneralSecurityException(Throwable cause) {

    /**
     * Creates a {@code GeneralSecurityException} with the specified cause
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/GeneralSecurityException.java
    public GeneralSecurityException(String message, Throwable cause) {

    /**
     * Creates a {@code GeneralSecurityException} with the specified
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/GeneralSecurityException.java
    public GeneralSecurityException(String msg) {

    /**
     * Constructs a GeneralSecurityException with the specified detail
     * message.
     * A detail message is a String that describes this particular
     * exception.
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/GeneralSecurityException.java
    public GeneralSecurityException() {

    /**
     * Constructs a GeneralSecurityException with no detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/GeneralSecurityException.java
public class GeneralSecurityException extends Exception {

/**
 * The {@code GeneralSecurityException} class is a generic
 * security exception class that provides type safety for all the
 * security-related exception classes that extend from it.
 *
 * @author Jan Luehe
 */
