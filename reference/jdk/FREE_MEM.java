_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FREE_MEM.java
    public FREE_MEM(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>FREE_MEM</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FREE_MEM.java
    public FREE_MEM(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>FREE_MEM</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FREE_MEM.java
    public FREE_MEM(String s) {

    /**
     * Constructs a <code>FREE_MEM</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     *
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FREE_MEM.java
public final class FREE_MEM extends SystemException {

/**
 * Exception thrown
 * when the ORB failed in an attempt to free dynamic memory, for example
 * because of heap corruption or memory segments being locked.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
