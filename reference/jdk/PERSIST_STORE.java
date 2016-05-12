_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/PERSIST_STORE.java
    public PERSIST_STORE(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>PERSIST_STORE</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/PERSIST_STORE.java
    public PERSIST_STORE(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>PERSIST_STORE</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/PERSIST_STORE.java
    public PERSIST_STORE(String s) {

    /**
     * Constructs a <code>PERSIST_STORE</code> exception with the specified description message,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/PERSIST_STORE.java
public final class PERSIST_STORE extends SystemException {

/**
 * This exception indicates a persistent storage failure, for example,
 * failure to establish a database connection or corruption of a
 * database.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
