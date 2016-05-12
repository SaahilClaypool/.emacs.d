_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InvalidAttributeValueException.java
    public InvalidAttributeValueException(String message) {

    /**
     * Constructor that allows a specific error message to be specified.
     *
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InvalidAttributeValueException.java
    public InvalidAttributeValueException() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InvalidAttributeValueException.java
public class InvalidAttributeValueException extends OperationsException   {

/**
 * The value specified is not valid for the attribute.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidAttributeValueException.java
    private static final long serialVersionUID = 8720050295499275011L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidAttributeValueException.java
    public InvalidAttributeValueException() {

    /**
      * Constructs a new instance of InvalidAttributeValueException.
      * All fields are set to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InvalidAttributeValueException.java
public class InvalidAttributeValueException extends NamingException {

/**
  * This class is thrown when an attempt is
  * made to add to an attribute a value that conflicts with the attribute's
  * schema definition.  This could happen, for example, if attempting
  * to add an attribute with no value when the attribute is required
  * to have at least one value, or if attempting to add more than
  * one value to a single valued-attribute, or if attempting to
  * add a value that conflicts with the syntax of the attribute.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
