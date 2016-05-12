_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/UnmarshalException.java
    public UnmarshalException(String s, Exception ex) {

    /**
     * Constructs an <code>UnmarshalException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/UnmarshalException.java
    public UnmarshalException(String s) {

    /**
     * Constructs an <code>UnmarshalException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/UnmarshalException.java
public class UnmarshalException extends RemoteException {

/**
 * An <code>UnmarshalException</code> can be thrown while unmarshalling the
 * parameters or results of a remote method call if any of the following
 * conditions occur:
 * <ul>
 * <li> if an exception occurs while unmarshalling the call header
 * <li> if the protocol for the return value is invalid
 * <li> if a <code>java.io.IOException</code> occurs unmarshalling
 * parameters (on the server side) or the return value (on the client side).
 * <li> if a <code>java.lang.ClassNotFoundException</code> occurs during
 * unmarshalling parameters or return values
 * <li> if no skeleton can be loaded on the server-side; note that skeletons
 * are required in the 1.1 stub protocol, but not in the 1.2 stub protocol.
 * <li> if the method hash is invalid (i.e., missing method).
 * <li> if there is a failure to create a remote reference object for
 * a remote object's stub when it is unmarshalled.
 * </ul>
 *
 * @author  Ann Wollrath
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/UnmarshalException.java
    public UnmarshalException( String message, String errorCode, Throwable exception ) {

    /**
     * Construct an UnmarshalException with the specified detail message, vendor
     * specific errorCode, and linkedException.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/UnmarshalException.java
    public UnmarshalException( String message, Throwable exception ) {

    /**
     * Construct an UnmarshalException with the specified detail message and
     * linkedException.  The errorCode will default to null.
     *
     * @param message a description of the exception
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/UnmarshalException.java
    public UnmarshalException( Throwable exception ) {

    /**
     * Construct an UnmarshalException with a linkedException.  The detail message and
     * vendor specific errorCode will default to null.
     *
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/UnmarshalException.java
    public UnmarshalException( String message, String errorCode ) {

    /**
     * Construct an UnmarshalException with the specified detail message and vendor
     * specific errorCode.  The linkedException will default to null.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/UnmarshalException.java
    public UnmarshalException( String message ) {

    /**
     * Construct an UnmarshalException with the specified detail message.  The
     * errorCode and linkedException will default to null.
     *
     * @param message a description of the exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/UnmarshalException.java
public class UnmarshalException extends JAXBException {

/**
 * This exception indicates that an error has occurred while performing
 * an unmarshal operation that prevents the JAXB Provider from completing
 * the operation.
 *
 * <p>
 * The <tt>ValidationEventHandler</tt> can cause this exception to be thrown
 * during the unmarshal operations.  See
 * {@link ValidationEventHandler#handleEvent(ValidationEvent)
 * ValidationEventHandler.handleEvent(ValidationEvent)}.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li></ul>
 * @see JAXBException
 * @see Unmarshaller
 * @see ValidationEventHandler
 * @since JAXB1.0
 */
