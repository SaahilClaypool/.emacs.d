_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyManagementException.java
    public KeyManagementException(Throwable cause) {

    /**
     * Creates a {@code KeyManagementException} with the specified cause
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyManagementException.java
    public KeyManagementException(String message, Throwable cause) {

    /**
     * Creates a {@code KeyManagementException} with the specified
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
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyManagementException.java
   public KeyManagementException(String msg) {

     /**
     * Constructs a KeyManagementException with the specified detail
     * message. A detail message is a String that describes this
     * particular exception.
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyManagementException.java
    public KeyManagementException() {

    /**
     * Constructs a KeyManagementException with no detail message. A
     * detail message is a String that describes this particular
     * exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/KeyManagementException.java
public class KeyManagementException extends KeyException {

/**
 * This is the general key management exception for all operations
 * dealing with key management. Examples of subclasses of
 * KeyManagementException that developers might create for
 * giving more detailed information could include:
 *
 * <ul>
 * <li>KeyIDConflictException
 * <li>KeyAuthorizationFailureException
 * <li>ExpiredKeyException
 * </ul>
 *
 * @author Benjamin Renaud
 *
 * @see Key
 * @see KeyException
 */
