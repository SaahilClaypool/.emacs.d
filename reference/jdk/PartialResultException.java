_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/PartialResultException.java
    private static final long serialVersionUID = 2572144970049426786L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/PartialResultException.java
    public PartialResultException() {

    /**
      * Constructs a new instance of PartialResultException.
      * All fields default to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/PartialResultException.java
public class PartialResultException extends NamingException {

/**
  * This exception is thrown to indicate that the result being returned
  * or returned so far is partial, and that the operation cannot
  * be completed.  For example, when listing a context, this exception
  * indicates that returned results only represents some of the bindings
  * in the context.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
