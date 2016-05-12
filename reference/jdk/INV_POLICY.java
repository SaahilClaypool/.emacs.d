_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_POLICY.java
    public INV_POLICY(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>INV_POLICY</code> exception with the
     * specified description message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_POLICY.java
    public INV_POLICY(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>INV_POLICY</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_POLICY.java
    public INV_POLICY(String s) {

    /**
     * Constructs a <code>INV_POLICY</code> exception with the
     * specified description message,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_POLICY.java
public final class INV_POLICY extends SystemException {

/**
 * Standard exception  thrown
 * when an invocation cannot be made because of an incompatibility between
 * <tt>Policy</tt> overrides that apply to the particular invocation.
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
