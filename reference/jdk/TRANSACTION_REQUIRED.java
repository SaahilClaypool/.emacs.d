_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_REQUIRED.java
    public TRANSACTION_REQUIRED(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSACTION_REQUIRED</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_REQUIRED.java
    public TRANSACTION_REQUIRED(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSACTION_REQUIRED</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_REQUIRED.java
    public TRANSACTION_REQUIRED(String s) {

    /**
     * Constructs a <code>TRANSACTION_REQUIRED</code> exception with the specified
     * description message, a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_REQUIRED.java
public final class TRANSACTION_REQUIRED extends SystemException {

/**
 * Exception  indicates that the request carried a null transaction context,
 * but an active transaction is required.<P>
 * It contains a minor code, which gives information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 * The OMG Transaction Service specfication has details.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
