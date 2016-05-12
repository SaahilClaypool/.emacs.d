_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidSearchControlsException.java
    private static final long serialVersionUID = -5124108943352665777L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidSearchControlsException.java
    public InvalidSearchControlsException(String msg) {

    /**
     * Constructs a new instance of InvalidSearchControlsException
     * with an explanation. All other fields set to null.
     * @param msg Detail about this exception. Can be null.
     * @see java.lang.Throwable#getMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidSearchControlsException.java
public class InvalidSearchControlsException extends NamingException {

/**
  * This exception is thrown when the specification of
  * the SearchControls for a search operation is invalid. For example, if the scope is
  * set to a value other than OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE,
  * this exception is thrown.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
