_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_REQUIRED.java
    public ACTIVITY_REQUIRED(String detailMessage,
                             int minorCode,
                             CompletionStatus completionStatus) {

    /**
     * Constructs an <code>ACTIVITY_REQUIRED</code> exception with the
     * specified message, minor code, and completion status.
     *
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_REQUIRED.java
    public ACTIVITY_REQUIRED(int minorCode,
                             CompletionStatus completionStatus) {

    /**
     * Constructs an <code>ACTIVITY_REQUIRED</code> exception with the
     * specified minor code and completion status.
     *
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_REQUIRED.java
    public ACTIVITY_REQUIRED(String detailMessage) {

    /**
     * Constructs an <code>ACTIVITY_REQUIRED</code> exception with the
     * specified message.
     *
     * @param detailMessage string containing a detailed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_REQUIRED.java
    public ACTIVITY_REQUIRED() {

    /**
     * Constructs an <code>ACTIVITY_REQUIRED</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ACTIVITY_REQUIRED.java
public final class ACTIVITY_REQUIRED extends SystemException {

/**
 * The <code>ACTIVITY_REQUIRED</code> system exception may be raised on any
 * method for which an Activity context is required. It indicates that an
 * Activity context was necessary to perform the invoked operation, but one
 * was not found associated with the calling thread.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @since   J2SE 1.5
 */
