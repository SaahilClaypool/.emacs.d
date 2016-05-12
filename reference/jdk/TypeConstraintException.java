_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public void printStackTrace() {

    /**
     * Prints this TypeConstraintException and its stack trace (including the stack trace
     * of the linkedException if it is non-null) to <tt>System.err</tt>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public void printStackTrace( java.io.PrintStream s ) {

    /**
     * Prints this TypeConstraintException and its stack trace (including the stack trace
     * of the linkedException if it is non-null) to the PrintStream.
     *
     * @param s PrintStream to use for output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public String toString() {

    /**
     * Returns a short description of this TypeConstraintException.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public Throwable getLinkedException() {

    /**
     * Get the linked exception
     *
     * @return the linked Exception, null if none exists
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public String getErrorCode() {

    /**
     * Get the vendor specific error code
     *
     * @return a string specifying the vendor specific error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public TypeConstraintException(String message, String errorCode, Throwable exception) {

    /**
     * Construct a TypeConstraintException with the specified detail message,
     * vendor specific errorCode, and linkedException.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public TypeConstraintException(String message, Throwable exception) {

    /**
     * Construct a TypeConstraintException with the specified detail message and
     * linkedException.  The errorCode will default to null.
     *
     * @param message a description of the exception
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public TypeConstraintException(Throwable exception) {

    /**
     * Construct a TypeConstraintException with a linkedException.  The detail message and
     * vendor specific errorCode will default to null.
     *
     * @param exception the linked exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public TypeConstraintException(String message, String errorCode) {

    /**
     * Construct a TypeConstraintException with the specified detail message and vendor
     * specific errorCode.  The linkedException will default to null.
     *
     * @param message a description of the exception
     * @param errorCode a string specifying the vendor specific error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    public TypeConstraintException(String message) {

    /**
     * Construct a TypeConstraintException with the specified detail message.  The
     * errorCode and linkedException will default to null.
     *
     * @param message a description of the exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    private volatile Throwable linkedException;

    /**
     * Exception reference
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
    private String errorCode;

    /**
     * Vendor specific error code
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/TypeConstraintException.java
public class TypeConstraintException extends java.lang.RuntimeException {

/**
 * This exception indicates that a violation of a dynamically checked type
 * constraint was detected.
 *
 * <p>
 * This exception can be thrown by the generated setter methods of the schema
 * derived Java content classes.  However, since fail-fast validation is
 * an optional feature for JAXB Providers to support, not all setter methods
 * will throw this exception when a type constraint is violated.
 *
 * <p>
 * If this exception is throw while invoking a fail-fast setter, the value of
 * the property is guaranteed to remain unchanged, as if the setter were never
 * called.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li><li>Joe Fialli, Sun Microsystems, Inc.</li></ul>
 * @see ValidationEvent
 * @since JAXB1.0
 */
