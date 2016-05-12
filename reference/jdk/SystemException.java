_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SystemException.java
    public String toString() {

    /**
     * Converts this exception to a representative string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SystemException.java
    protected SystemException(String reason, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>SystemException</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param reason the String containing a detail message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SystemException.java
    public CompletionStatus completed;

    /**
     * The status of the operation that threw this exception.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SystemException.java
    public int minor;

    /**
     * The CORBA Exception minor code.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SystemException.java
public abstract class SystemException extends java.lang.RuntimeException {

/**
 * The root class for all CORBA standard exceptions. These exceptions
 * may be thrown as a result of any CORBA operation invocation and may
 * also be returned by many standard CORBA API methods. The standard
 * exceptions contain a minor code, allowing more detailed specification, and a
 * completion status. This class is subclassed to
 * generate each one of the set of standard ORB exceptions.
 * <code>SystemException</code> extends
 * <code>java.lang.RuntimeException</code>; thus none of the
 * <code>SystemException</code> exceptions need to be
 * declared in signatures of the Java methods mapped from operations in
 * IDL interfaces.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
