_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INTERNAL.java
    public INTERNAL(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INTERNAL</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code>
     *                  that indicates the completion status of the method
     *                  that threw this exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INTERNAL.java
    public INTERNAL(int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INTERNAL</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code>
     *                  that indicates the completion status of the method
     *                  that threw this exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INTERNAL.java
    public INTERNAL(String s) {

    /**
     * Constructs an <code>INTERNAL</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INTERNAL.java
public final class INTERNAL extends SystemException {

/**
 * This exception indicates an internal failure in an ORB, for
 * example, if an ORB has detected corruption of its internal
 * data structures.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 * <P>
 * See the section <A href="../../../../technotes/guides/idl/jidlExceptions.html#minorcodemeanings">meaning
 * of minor codes</A> to see the minor codes for this exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
