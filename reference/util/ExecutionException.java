_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ExecutionException.java
    public ExecutionException(Throwable cause) {

    /**
     * Constructs an {@code ExecutionException} with the specified cause.
     * The detail message is set to {@code (cause == null ? null :
     * cause.toString())} (which typically contains the class and
     * detail message of {@code cause}).
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ExecutionException.java
    public ExecutionException(String message, Throwable cause) {

    /**
     * Constructs an {@code ExecutionException} with the specified detail
     * message and cause.
     *
     * @param  message the detail message
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ExecutionException.java
    protected ExecutionException(String message) {

    /**
     * Constructs an {@code ExecutionException} with the specified detail
     * message. The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause(Throwable) initCause}.
     *
     * @param message the detail message
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ExecutionException.java
    protected ExecutionException() { }

    /**
     * Constructs an {@code ExecutionException} with no detail message.
     * The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause(Throwable) initCause}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ExecutionException.java
public class ExecutionException extends Exception {

/**
 * Exception thrown when attempting to retrieve the result of a task
 * that aborted by throwing an exception. This exception can be
 * inspected using the {@link #getCause()} method.
 *
 * @see Future
 * @since 1.5
 * @author Doug Lea
 */
