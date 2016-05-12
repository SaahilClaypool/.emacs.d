_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/DateTimeException.java
    public DateTimeException(String message, Throwable cause) {

    /**
     * Constructs a new date-time exception with the specified message and cause.
     *
     * @param message  the message to use for this exception, may be null
     * @param cause  the cause of the exception, may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/DateTimeException.java
    public DateTimeException(String message) {

    /**
     * Constructs a new date-time exception with the specified message.
     *
     * @param message  the message to use for this exception, may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/DateTimeException.java
    private static final long serialVersionUID = -1632418723876261839L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/DateTimeException.java
public class DateTimeException extends RuntimeException {

/**
 * Exception used to indicate a problem while calculating a date-time.
 * <p>
 * This exception is used to indicate problems with creating, querying
 * and manipulating date-time objects.
 *
 * @implSpec
 * This class is intended for use in a single thread.
 *
 * @since 1.8
 */
