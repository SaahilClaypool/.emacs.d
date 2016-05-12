_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/TimeLimitExceededException.java
    private static final long serialVersionUID = -3597009011385034696L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/TimeLimitExceededException.java
    public TimeLimitExceededException(String explanation) {

    /**
     * Constructs a new instance of TimeLimitExceededException
     * using the argument supplied.
     * @param explanation possibly null detail about this exception.
     * @see java.lang.Throwable#getMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/TimeLimitExceededException.java
public class TimeLimitExceededException extends LimitExceededException {

/**
 * This exception is thrown when a method
 * does not terminate within the specified time limit.
 * This can happen, for example, if the user specifies that
 * the method should take no longer than 10 seconds, and the
 * method fails to complete with 10 seconds.
 *
 * <p> Synchronization and serialization issues that apply to NamingException
 * apply directly here.
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 *
 * @since 1.3
 */
