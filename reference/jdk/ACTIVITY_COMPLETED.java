_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_COMPLETED.java
    public ACTIVITY_COMPLETED(String detailMessage,
                              int minorCode,
                              CompletionStatus completionStatus) {

    /**
     * Constructs an <code>ACTIVITY_COMPLETED</code> exception with the
     * specified message, minor code, and completion status.
     *
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_COMPLETED.java
    public ACTIVITY_COMPLETED(int minorCode,
                              CompletionStatus completionStatus) {

    /**
     * Constructs an <code>ACTIVITY_COMPLETED</code> exception with the
     * specified minor code and completion status.
     *
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_COMPLETED.java
    public ACTIVITY_COMPLETED(String detailMessage) {

    /**
     * Constructs an <code>ACTIVITY_COMPLETED</code> exception with the
     * specified message.
     *
     * @param detailMessage string containing a detailed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_COMPLETED.java
    public ACTIVITY_COMPLETED() {

    /**
     * Constructs an <code>ACTIVITY_COMPLETED</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_COMPLETED.java
public final class ACTIVITY_COMPLETED extends SystemException {

/**
 * The <code>ACTIVITY_COMPLETED</code> system exception may be raised on any
 * method for which Activity context is accessed. It indicates that the
 * Activity context in which the method call was made has been completed due
 * to a timeout of either the Activity itself or a transaction that encompasses
 * the Activity, or that the Activity completed in a manner other than that
 * originally requested.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @since   J2SE 1.5
 */
