_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IMP_LIMIT.java
    public IMP_LIMIT(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>IMP_LIMIT</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IMP_LIMIT.java
    public IMP_LIMIT(int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>IMP_LIMIT</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IMP_LIMIT.java
    public IMP_LIMIT(String s) {

    /**
     * Constructs an <code>IMP_LIMIT</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     *
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/IMP_LIMIT.java
public final class IMP_LIMIT extends SystemException {

/**
 * This exception indicates that an implementation limit was
 * exceeded in the ORB run time. For example, an ORB may reach
 * the maximum number of references it can hold simultaneously
 * in an address space, the size of a parameter may have
 * exceeded the allowed maximum, or an ORB may impose a maximum
 * on the number of clients or servers that can run simultaneously.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
