_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_IDENT.java
    public INV_IDENT(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INV_IDENT</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed a <code>CompletionStatus</code> object indicating
     *                  the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_IDENT.java
    public INV_IDENT(int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>INV_IDENT</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed a <code>CompletionStatus</code> object indicating
     *                  the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_IDENT.java
    public INV_IDENT(String s) {

    /**
     * Constructs an <code>INV_IDENT</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/INV_IDENT.java
public final class INV_IDENT extends SystemException {

/**
 * This exception indicates that an IDL identifier is syntactically
 * invalid. It may be raised if, for example, an identifier passed
 * to the interface repository does not conform to IDL identifier
 * syntax, or if an illegal operation name is used with the DII.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */
