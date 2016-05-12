_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkLoopException.java
    private static final long serialVersionUID = -3119189944325198009L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkLoopException.java
    public LinkLoopException() {

    /**
      * Constructs a new instance of LinkLoopException.
      * All the non-link-related and link-related fields are initialized to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkLoopException.java
public class LinkLoopException extends LinkException {

/**
  * This exception is thrown when
  * a loop was detected will attempting to resolve a link, or an implementation
  * specific limit on link counts has been reached.
  * <p>
  * Synchronization and serialization issues that apply to LinkException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see LinkRef
  * @since 1.3
  */
