_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESPONSE.java
    public NO_RESPONSE(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>NO_RESPONSE</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESPONSE.java
    public NO_RESPONSE(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>NO_RESPONSE</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESPONSE.java
    public NO_RESPONSE(String s) {

    /**
     * Constructs a <code>NO_RESPONSE</code> exception with the specified description message,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a description message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESPONSE.java
public final class NO_RESPONSE extends SystemException {

/**
 * This exception is raised if a client attempts to retrieve the result
 * of a deferred synchronous call, but the response for the request is
 * not yet available.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
