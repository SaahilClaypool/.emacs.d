_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NameAlreadyBoundException.java
    private static final long serialVersionUID = -8491441000356780586L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NameAlreadyBoundException.java
    public NameAlreadyBoundException() {

    /**
      * Constructs a new instance of NameAlreadyBoundException.
      * All fields are set to null;
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NameAlreadyBoundException.java
public class NameAlreadyBoundException extends NamingException {

/**
  * This exception is thrown by methods to indicate that
  * a binding cannot be added because the name is already bound to
  * another object.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see Context#bind
  * @see Context#rebind
  * @see Context#createSubcontext
  * @see javax.naming.directory.DirContext#bind
  * @see javax.naming.directory.DirContext#rebind
  * @see javax.naming.directory.DirContext#createSubcontext
  * @since 1.3
  */
