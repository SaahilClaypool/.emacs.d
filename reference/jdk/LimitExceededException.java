_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LimitExceededException.java
    private static final long serialVersionUID = -776898738660207856L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LimitExceededException.java
    public LimitExceededException(String explanation) {

    /**
     * Constructs a new instance of LimitExceededException using an
     * explanation. All other fields default to null.
     * @param explanation Possibly null detail about this exception.
     * @see java.lang.Throwable#getMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LimitExceededException.java
public class LimitExceededException extends NamingException {

/**
  * This exception is thrown when a method
  * terminates abnormally due to a user or system specified limit.
  * This is different from a InsufficientResourceException in that
  * LimitExceededException is due to a user/system specified limit.
  * For example, running out of memory to complete the request would
  * be an insufficient resource. The client asking for 10 answers and
  * getting back 11 is a size limit exception.
  *<p>
  * Examples of these limits include client and server configuration
  * limits such as size, time, number of hops, etc.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
