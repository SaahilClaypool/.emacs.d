_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/OBJECT_NOT_EXIST.java
    public OBJECT_NOT_EXIST(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>OBJECT_NOT_EXIST</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/OBJECT_NOT_EXIST.java
    public OBJECT_NOT_EXIST(int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>OBJECT_NOT_EXIST</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/OBJECT_NOT_EXIST.java
    public OBJECT_NOT_EXIST(String s) {

    /**
     * Constructs an <code>OBJECT_NOT_EXIST</code> exception with the specified description,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a description message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/OBJECT_NOT_EXIST.java
public final class OBJECT_NOT_EXIST extends SystemException {

/**
 * Exception raised whenever an invocation on a deleted object was
 * performed. It is an authoritative  "hard"  fault report. Anyone
 * receiving it is allowed (even expected) to delete all copies of
 * this object reference and to perform other appropriate  "final
 * recovery"  style procedures. Bridges forward this exception to
 * clients, also destroying any records they may hold (for example,
 * proxy objects used in reference translation). The clients could
 * in turn purge any of their own data structures.
 * <P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 * <P>
 * See the section <A href="../../../../technotes/guides/idl/jidlExceptions.html#minorcodemeanings">Minor
 * Code Meanings</A> to see the minor codes for this exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
