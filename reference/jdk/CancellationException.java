_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CancellationException.java
    public CancellationException(String message) {

    /**
     * Constructs a {@code CancellationException} with the specified detail
     * message.
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CancellationException.java
    public CancellationException() {}

    /**
     * Constructs a {@code CancellationException} with no detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CancellationException.java
public class CancellationException extends IllegalStateException {

/**
 * Exception indicating that the result of a value-producing task,
 * such as a {@link FutureTask}, cannot be retrieved because the task
 * was cancelled.
 *
 * @since 1.5
 * @author Doug Lea
 */
