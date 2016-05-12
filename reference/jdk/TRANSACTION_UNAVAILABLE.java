_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_UNAVAILABLE.java
    public TRANSACTION_UNAVAILABLE(String s, int minor,
                                   CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSACTION_UNAVAILABLE</code> exception with the
     * specified description message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_UNAVAILABLE.java
    public TRANSACTION_UNAVAILABLE(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>TRANSACTION_UNAVAILABLE</code> exception with the
     * specified minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_UNAVAILABLE.java
    public TRANSACTION_UNAVAILABLE(String s) {

    /**
     * Constructs a <code>TRANSACTION_UNAVAILABLE</code> exception with the
     * specifieddescription message, a minor code of 0, and a completion state
     * of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TRANSACTION_UNAVAILABLE.java
public final class TRANSACTION_UNAVAILABLE extends SystemException {

/**
 * The CORBA <code>TRANSACTION_UNAVAILABLE</code> exception is thrown
 * by the ORB when it cannot process a transaction service context because
 * its connection to the Transaction Service has been abnormally terminated.
 *
 * It contains a minor code, which gives information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 * The OMG CORBA core 2.4 specification has details.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
