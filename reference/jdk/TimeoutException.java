_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/TimeoutException.java
    public TimeoutException(String message) {

    /**
     * Constructs a {@code TimeoutException} with the specified detail
     * message.
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/TimeoutException.java
    public TimeoutException() {}

    /**
     * Constructs a {@code TimeoutException} with no specified detail
     * message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/TimeoutException.java
public class TimeoutException extends Exception {

/**
 * Exception thrown when a blocking operation times out.  Blocking
 * operations for which a timeout is specified need a means to
 * indicate that the timeout has occurred. For many such operations it
 * is possible to return a value that indicates timeout; when that is
 * not possible or desirable then {@code TimeoutException} should be
 * declared and thrown.
 *
 * @since 1.5
 * @author Doug Lea
 */
