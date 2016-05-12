_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ContextNotEmptyException.java
    private static final long serialVersionUID = 1090963683348219877L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ContextNotEmptyException.java
    public ContextNotEmptyException() {

    /**
      * Constructs a new instance of ContextNotEmptyException with
      * all name resolution fields and explanation initialized to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ContextNotEmptyException.java
public class ContextNotEmptyException extends NamingException {

/**
  * This exception is thrown when attempting to destroy a context that
  * is not empty.
  *<p>
  * If the program wants to handle this exception in particular, it
  * should catch ContextNotEmptyException explicitly before attempting to
  * catch NamingException. For example, after catching ContextNotEmptyException,
  * the program might try to remove the contents of the context before
  * reattempting the destroy.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see Context#destroySubcontext
  * @since 1.3
  */
