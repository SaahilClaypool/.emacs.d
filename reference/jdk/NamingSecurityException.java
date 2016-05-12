_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NamingSecurityException.java
    private static final long serialVersionUID = 5855287647294685775L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NamingSecurityException.java
    public NamingSecurityException() {

    /**
      * Constructs a new instance of NamingSecurityException.
      * All fields are initialized to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NamingSecurityException.java
public abstract class NamingSecurityException extends NamingException {

/**
  * This is the superclass of security-related exceptions
  * thrown by operations in the Context and DirContext interfaces.
  * The nature of the failure is described by the name of the subclass.
  *<p>
  * If the program wants to handle this exception in particular, it
  * should catch NamingSecurityException explicitly before attempting to
  * catch NamingException. A program might want to do this, for example,
  * if it wants to treat security-related exceptions specially from
  * other sorts of naming exception.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
