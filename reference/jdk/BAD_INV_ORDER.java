_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_INV_ORDER.java
    public BAD_INV_ORDER(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_INV_ORDER.java
    public BAD_INV_ORDER(int minor, CompletionStatus completed) {

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exceptionBAD_INV_ORDER with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code> indicating
     *                  the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_INV_ORDER.java
    public BAD_INV_ORDER(String s) {

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     *
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_INV_ORDER.java
    public BAD_INV_ORDER() {

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exception with a default
     * minor code of 0 and a completion state of COMPLETED_NO.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BAD_INV_ORDER.java
public final class BAD_INV_ORDER extends SystemException {

/**
 * This exception indicates that the caller has invoked operations in
 * the wrong order. For example, it can be raised by an ORB if an
 * application makes an ORB-related call without having correctly
 * initialized the ORB first.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
