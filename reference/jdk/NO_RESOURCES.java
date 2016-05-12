_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESOURCES.java
    public NO_RESOURCES(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>NO_RESOURCES</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESOURCES.java
    public NO_RESOURCES(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>NO_RESOURCES</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESOURCES.java
    public NO_RESOURCES(String s) {

    /**
     * Constructs a <code>NO_RESOURCES</code> exception with the specified description,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a description message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/NO_RESOURCES.java
public final class NO_RESOURCES extends SystemException {

/**
 * Exception thrown when the ORB has encountered some general resource
 * limitation. For example, the run time may have reached the maximum
 * permissible number of open connections.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
