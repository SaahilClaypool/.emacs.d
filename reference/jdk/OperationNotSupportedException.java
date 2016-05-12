_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/OperationNotSupportedException.java
    private static final long serialVersionUID = 5493232822427682064L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/OperationNotSupportedException.java
    public OperationNotSupportedException(String explanation) {

    /**
      * Constructs a new instance of OperationNotSupportedException using an
      * explanation. All other fields default to null.
      *
      * @param  explanation     Possibly null additional detail about this exception
      * @see java.lang.Throwable#getMessage
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/OperationNotSupportedException.java
public class OperationNotSupportedException extends NamingException {

/**
  * This exception is thrown when a context implementation does not support
  * the operation being invoked.
  * For example, if a server does not support the Context.bind() method
  * it would throw OperationNotSupportedException when the bind() method
  * is invoked on it.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
