_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/RejectedExecutionException.java
    public RejectedExecutionException(Throwable cause) {

    /**
     * Constructs a {@code RejectedExecutionException} with the
     * specified cause.  The detail message is set to {@code (cause ==
     * null ? null : cause.toString())} (which typically contains
     * the class and detail message of {@code cause}).
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/RejectedExecutionException.java
    public RejectedExecutionException(String message, Throwable cause) {

    /**
     * Constructs a {@code RejectedExecutionException} with the
     * specified detail message and cause.
     *
     * @param  message the detail message
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/RejectedExecutionException.java
    public RejectedExecutionException(String message) {

    /**
     * Constructs a {@code RejectedExecutionException} with the
     * specified detail message. The cause is not initialized, and may
     * subsequently be initialized by a call to {@link
     * #initCause(Throwable) initCause}.
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/RejectedExecutionException.java
    public RejectedExecutionException() { }

    /**
     * Constructs a {@code RejectedExecutionException} with no detail message.
     * The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause(Throwable) initCause}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/RejectedExecutionException.java
public class RejectedExecutionException extends RuntimeException {

/**
 * Exception thrown by an {@link Executor} when a task cannot be
 * accepted for execution.
 *
 * @since 1.5
 * @author Doug Lea
 */
