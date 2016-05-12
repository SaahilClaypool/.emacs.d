_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationException.java
    public ValidationException(String message, String errorCode, Throwable exception) {

    /**
     * Construct an ValidationException with the specified detail message, vendor
     * specific errorCode, and linkedException.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationException.java
    public ValidationException(String message, Throwable exception) {

    /**
     * Construct an ValidationException with the specified detail message and
     * linkedException.  The errorCode will default to null.
     *
     * @param message a description of the exception
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationException.java
    public ValidationException(Throwable exception) {

    /**
     * Construct an ValidationException with a linkedException.  The detail message and
     * vendor specific errorCode will default to null.
     *
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationException.java
    public ValidationException(String message, String errorCode) {

    /**
     * Construct an ValidationException with the specified detail message and vendor
     * specific errorCode.  The linkedException will default to null.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationException.java
    public ValidationException(String message) {

    /**
     * Construct an ValidationException with the specified detail message.  The
     * errorCode and linkedException will default to null.
     *
     * @param message a description of the exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ValidationException.java
public class ValidationException extends JAXBException {

/**
 * This exception indicates that an error has occurred while performing
 * a validate operation.
 *
 * <p>
 * The <tt>ValidationEventHandler</tt> can cause this exception to be thrown
 * during the validate operations.  See
 * {@link ValidationEventHandler#handleEvent(ValidationEvent)
 * ValidationEventHandler.handleEvent(ValidationEvent)}.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li></ul>
 * @see JAXBException
 * @see Validator
 * @since JAXB1.0
 */
