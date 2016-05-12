_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalException.java
    public MarshalException(String s, Exception ex) {

    /**
     * Constructs a <code>MarshalException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalException.java
    public MarshalException(String s) {

    /**
     * Constructs a <code>MarshalException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/MarshalException.java
public class MarshalException extends RemoteException {

/**
 * A <code>MarshalException</code> is thrown if a
 * <code>java.io.IOException</code> occurs while marshalling the remote call
 * header, arguments or return value for a remote method call.  A
 * <code>MarshalException</code> is also thrown if the receiver does not
 * support the protocol version of the sender.
 *
 * <p>If a <code>MarshalException</code> occurs during a remote method call,
 * the call may or may not have reached the server.  If the call did reach the
 * server, parameters may have been deserialized.  A call may not be
 * retransmitted after a <code>MarshalException</code> and reliably preserve
 * "at most once" call semantics.
 *
 * @author  Ann Wollrath
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/MarshalException.java
    public MarshalException( String message, String errorCode, Throwable exception ) {

    /**
     * Construct a MarshalException with the specified detail message, vendor
     * specific errorCode, and linkedException.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/MarshalException.java
    public MarshalException( String message, Throwable exception ) {

    /**
     * Construct a MarshalException with the specified detail message and
     * linkedException.  The errorCode will default to null.
     *
     * @param message a description of the exception
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/MarshalException.java
    public MarshalException( Throwable exception ) {

    /**
     * Construct a MarshalException with a linkedException.  The detail message and
     * vendor specific errorCode will default to null.
     *
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/MarshalException.java
    public MarshalException( String message, String errorCode ) {

    /**
     * Construct a MarshalException with the specified detail message and vendor
     * specific errorCode.  The linkedException will default to null.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/MarshalException.java
    public MarshalException( String message ) {

    /**
     * Construct a MarshalException with the specified detail message.  The
     * errorCode and linkedException will default to null.
     *
     * @param message a description of the exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/MarshalException.java
public class MarshalException extends JAXBException {

/**
 * This exception indicates that an error has occurred while performing
 * a marshal operation that the provider is unable to recover from.
 *
 * <p>
 * The <tt>ValidationEventHandler</tt> can cause this exception to be thrown
 * during the marshal operations.  See
 * {@link ValidationEventHandler#handleEvent(ValidationEvent)
 * ValidationEventHandler.handleEvent(ValidationEvent)}.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li></ul>
 * @see JAXBException
 * @see Marshaller
 * @since JAXB1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public void printStackTrace(PrintWriter s) {

    /**
     * Prints this <code>MarshalException</code>, its backtrace and
     * the cause's backtrace to the specified print writer.
     *
     * @param s <code>PrintWriter</code> to use for output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public void printStackTrace(PrintStream s) {

    /**
     * Prints this <code>MarshalException</code>, its backtrace and
     * the cause's backtrace to the specified print stream.
     *
     * @param s <code>PrintStream</code> to use for output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public void printStackTrace() {

    /**
     * Prints this <code>MarshalException</code>, its backtrace and
     * the cause's backtrace to the standard error stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this <code>MarshalException</code> or
     * <code>null</code> if the cause is nonexistent or unknown.  (The
     * cause is the throwable that caused this
     * <code>MarshalException</code> to get thrown.)
     *
     * @return the cause of this <code>MarshalException</code> or
     *         <code>null</code> if the cause is nonexistent or unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public MarshalException(Throwable cause) {

    /**
     * Constructs a new <code>MarshalException</code> with the specified cause
     * and a detail message of <code>(cause==null ? null : cause.toString())
     * </code> (which typically contains the class and detail message of
     * <code>cause</code>).
     *
     * @param cause the cause (A <tt>null</tt> value is permitted, and
     *        indicates that the cause is nonexistent or unknown.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public MarshalException(String message, Throwable cause) {

    /**
     * Constructs a new <code>MarshalException</code> with the
     * specified detail message and cause.
     * <p>Note that the detail message associated with
     * <code>cause</code> is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param message the detail message
     * @param cause the cause (A <tt>null</tt> value is permitted, and
     *        indicates that the cause is nonexistent or unknown.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public MarshalException(String message) {

    /**
     * Constructs a new <code>MarshalException</code> with the specified
     * detail message.
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    public MarshalException() {

    /**
     * Constructs a new <code>MarshalException</code> with
     * <code>null</code> as its detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
    private Throwable cause;

    /**
     * The throwable that caused this exception to get thrown, or null if this
     * exception was not caused by another throwable or if the causative
     * throwable is unknown.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/MarshalException.java
public class MarshalException extends Exception {

/**
 * Indicates an exceptional condition that occurred during the XML
 * marshalling or unmarshalling process.
 *
 * <p>A <code>MarshalException</code> can contain a cause: another
 * throwable that caused this <code>MarshalException</code> to get thrown.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignature#sign(XMLSignContext)
 * @see XMLSignatureFactory#unmarshalXMLSignature(XMLValidateContext)
 */
