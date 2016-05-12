_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TIMEOUT.java
    public TIMEOUT(String detailMessage,
                   int minorCode,
                   CompletionStatus completionStatus) {

    /**
     * Constructs an <code>TIMEOUT</code> exception with the
     * specified message, minor code, and completion status.
     *
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TIMEOUT.java
    public TIMEOUT(int minorCode,
                   CompletionStatus completionStatus) {

    /**
     * Constructs an <code>TIMEOUT</code> exception with the
     * specified minor code and completion status.
     *
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TIMEOUT.java
    public TIMEOUT(String detailMessage) {

    /**
     * Constructs an <code>TIMEOUT</code> exception with the
     * specified message.
     *
     * @param detailMessage string containing a detailed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TIMEOUT.java
    public TIMEOUT() {

    /**
     * Constructs an <code>TIMEOUT</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TIMEOUT.java
public final class TIMEOUT extends SystemException {

/**
 * <code>TIMEOUT</code> is raised when no delivery has been made and the
 * specified time-to-live period has been exceeded. It is a standard system
 * exception because time-to-live QoS can be applied to any invocation.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @since   J2SE 1.5
 */
