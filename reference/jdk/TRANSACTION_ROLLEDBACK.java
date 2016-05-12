_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_ROLLEDBACK.java
    public TRANSACTION_ROLLEDBACK(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSACTION_ROLLEDBACK</code> exception with the
     * specified description message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_ROLLEDBACK.java
    public TRANSACTION_ROLLEDBACK(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSACTION_ROLLEDBACK</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_ROLLEDBACK.java
    public TRANSACTION_ROLLEDBACK(String s) {

    /**
     * Constructs a <code>TRANSACTION_ROLLEDBACK</code> exception with the
     * specified description message,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_ROLLEDBACK.java
public final class TRANSACTION_ROLLEDBACK extends SystemException {

/**
 * Exception  thrown when the transaction associated with the request has
 * already been rolled back or marked to roll back. Thus, the requested
 * operation either could not be performed or was not performed because
 * further computation on behalf of the transaction would be fruitless.<P>
 * See the OMG Transaction
 * Service specification for details.
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
