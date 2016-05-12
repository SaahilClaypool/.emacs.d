_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletionException.java
    public CompletionException(Throwable cause) {

    /**
     * Constructs a {@code CompletionException} with the specified cause.
     * The detail message is set to {@code (cause == null ? null :
     * cause.toString())} (which typically contains the class and
     * detail message of {@code cause}).
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletionException.java
    public CompletionException(String message, Throwable cause) {

    /**
     * Constructs a {@code CompletionException} with the specified detail
     * message and cause.
     *
     * @param  message the detail message
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletionException.java
    protected CompletionException(String message) {

    /**
     * Constructs a {@code CompletionException} with the specified detail
     * message. The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause(Throwable) initCause}.
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletionException.java
    protected CompletionException() { }

    /**
     * Constructs a {@code CompletionException} with no detail message.
     * The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause(Throwable) initCause}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletionException.java
public class CompletionException extends RuntimeException {

/**
 * Exception thrown when an error or other exception is encountered
 * in the course of completing a result or task.
 *
 * @since 1.8
 * @author Doug Lea
 */
