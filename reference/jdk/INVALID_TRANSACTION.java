_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INVALID_TRANSACTION.java
    public INVALID_TRANSACTION(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INVALID_TRANSACTION</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INVALID_TRANSACTION.java
    public INVALID_TRANSACTION(int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INVALID_TRANSACTION</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INVALID_TRANSACTION.java
    public INVALID_TRANSACTION(String s) {

    /**
     * Constructs an <code>INVALID_TRANSACTION</code> exception
     * with the specified detail message.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INVALID_TRANSACTION.java
public final class INVALID_TRANSACTION extends SystemException {

/**
 * Exception  thrown
 * when the request carried an invalid transaction context.
 * For example, this exception could be raised if an error
 * occurred when trying to register a resource.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since   JDK1.2
 *
 */
