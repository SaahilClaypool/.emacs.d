_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/SizeLimitExceededException.java
    private static final long serialVersionUID = 7129289564879168579L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/SizeLimitExceededException.java
    public SizeLimitExceededException(String explanation) {

    /**
     * Constructs a new instance of SizeLimitExceededException using an
     * explanation. All other fields default to null.
     *
     * @param explanation Possibly null detail about this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/SizeLimitExceededException.java
public class SizeLimitExceededException extends LimitExceededException {

/**
  * This exception is thrown when a method
  * produces a result that exceeds a size-related limit.
  * This can happen, for example, if the result contains
  * more objects than the user requested, or when the size
  * of the result exceeds some implementation-specific limit.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @since 1.3
  */
