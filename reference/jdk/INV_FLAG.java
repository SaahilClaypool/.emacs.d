_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_FLAG.java
    public INV_FLAG(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INV_FLAG</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code>
     *                  indicating the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_FLAG.java
    public INV_FLAG(int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INV_FLAG</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code>
     *                  indicating the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_FLAG.java
    public INV_FLAG(String s) {

    /**
     * Constructs an <code>INV_FLAG</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_FLAG.java
public final class INV_FLAG extends SystemException {

/**
 * Exception thrown
 * when an invalid flag was passed to an operation (for example, when
 * creating a DII request).<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
