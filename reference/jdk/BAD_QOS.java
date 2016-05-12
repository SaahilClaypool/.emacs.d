_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_QOS.java
    public BAD_QOS(String detailMessage,
                   int minorCode,
                   CompletionStatus completionStatus) {

    /**
     * Constructs an <code>BAD_QOS</code> exception with the
     * specified message, minor code, and completion status.
     *
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_QOS.java
    public BAD_QOS(int minorCode,
                   CompletionStatus completionStatus) {

    /**
     * Constructs an <code>BAD_QOS</code> exception with the
     * specified minor code and completion status.
     *
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_QOS.java
    public BAD_QOS(String detailMessage) {

    /**
     * Constructs an <code>BAD_QOS</code> exception with the
     * specified message.
     *
     * @param detailMessage string containing a detailed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_QOS.java
    public BAD_QOS() {

    /**
     * Constructs an <code>BAD_QOS</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_QOS.java
public final class BAD_QOS extends SystemException {

/**
 * The <code>BAD_QOS</code> exception is raised whenever an object cannot
 * support the quality of service required by an invocation parameter that
 * has a quality of service semantics associated with it.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @since   J2SE 1.5
 */
