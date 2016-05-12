_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidAttributesException.java
    private static final long serialVersionUID = 2607612850539889765L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidAttributesException.java
    public InvalidAttributesException() {

    /**
      * Constructs a new instance of InvalidAttributesException.
      * All fields are set to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidAttributesException.java
public class InvalidAttributesException extends NamingException {

/**
  * This exception is thrown when an attempt is
  * made to add or modify an attribute set that has been specified
  * incompletely or incorrectly. This could happen, for example,
  * when attempting to add or modify a binding, or to create a new
  * subcontext without specifying all the mandatory attributes
  * required for creation of the object.  Another situation in
  * which this exception is thrown is by specification of incompatible
  * attributes within the same attribute set, or attributes in conflict
  * with that specified by the object's schema.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
