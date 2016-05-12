_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_OPERATION.java
    public BAD_OPERATION(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>BAD_OPERATION</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code> indicating
     *                  the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_OPERATION.java
    public BAD_OPERATION(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>BAD_OPERATION</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code> indicating
     *                  the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_OPERATION.java
    public BAD_OPERATION(String s) {

    /**
     * Constructs a <code>BAD_OPERATION</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_OPERATION.java
    public BAD_OPERATION() {

    /**
     * Constructs a <code>BAD_OPERATION</code> exception with a default
     * minor code of 0 and a completion state of COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_OPERATION.java
public final class BAD_OPERATION extends SystemException {

/**
 * Exception thrown when an object reference denotes an existing object,
 * but that the object does not support the operation that was invoked.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
