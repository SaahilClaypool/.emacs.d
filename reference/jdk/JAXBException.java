_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public void printStackTrace(PrintWriter s) {

    /**
     * Prints this JAXBException and its stack trace (including the stack trace
     * of the linkedException if it is non-null) to the PrintWriter.
     *
     * @param s PrintWriter to use for output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public void printStackTrace() {

    /**
     * Prints this JAXBException and its stack trace (including the stack trace
     * of the linkedException if it is non-null) to <tt>System.err</tt>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public void printStackTrace( java.io.PrintStream s ) {

    /**
     * Prints this JAXBException and its stack trace (including the stack trace
     * of the linkedException if it is non-null) to the PrintStream.
     *
     * @param s PrintStream to use for output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public String toString() {

    /**
     * Returns a short description of this JAXBException.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public void setLinkedException( Throwable exception ) {

    /**
     * Add a linked Exception.
     *
     * @param exception the linked Exception (A null value is permitted and
     *                  indicates that the linked exception does not exist or
     *                  is unknown).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public Throwable getLinkedException() {

    /**
     * Get the linked exception
     *
     * @return the linked Exception, null if none exists
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public String getErrorCode() {

    /**
     * Get the vendor specific error code
     *
     * @return a string specifying the vendor specific error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public JAXBException(String message, String errorCode, Throwable exception) {

    /**
     * Construct a JAXBException with the specified detail message, vendor
     * specific errorCode, and linkedException.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public JAXBException(String message, Throwable exception) {

    /**
     * Construct a JAXBException with the specified detail message and
     * linkedException.  The errorCode will default to null.
     *
     * @param message a description of the exception
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public JAXBException(Throwable exception) {

    /**
     * Construct a JAXBException with a linkedException.  The detail message and
     * vendor specific errorCode will default to null.
     *
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public JAXBException(String message, String errorCode) {

    /**
     * Construct a JAXBException with the specified detail message and vendor
     * specific errorCode.  The linkedException will default to null.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    public JAXBException(String message) {

    /**
     * Construct a JAXBException with the specified detail message.  The
     * errorCode and linkedException will default to null.
     *
     * @param message a description of the exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    private volatile Throwable linkedException;

    /**
     * Exception reference
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
    private String errorCode;

    /**
     * Vendor specific error code
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/JAXBException.java
public class JAXBException extends Exception {

/**
 * This is the root exception class for all JAXB exceptions.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li></ul>
 * @see JAXBContext
 * @see Marshaller
 * @see Unmarshaller
 * @since JAXB1.0
 */
