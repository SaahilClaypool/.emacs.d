_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_MEMORY.java
    public NO_MEMORY(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>NO_MEMORY</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_MEMORY.java
    public NO_MEMORY(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>NO_MEMORY</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_MEMORY.java
    public NO_MEMORY(String s) {

    /**
     * Constructs a <code>NO_MEMORY</code> exception with the specified description message,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a description message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_MEMORY.java
public final class NO_MEMORY extends SystemException {

/**
 * Exception  thrown when the ORB run time has run out of memory.
 * <P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
