_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UnknownUserException.java
    public UnknownUserException(Any a) {

    /**
     * Constructs an <code>UnknownUserException</code> object that contains the given
     * <code>Any</code> object.
     *
     * @param a an <code>Any</code> object that contains a user exception returned
     *         by the server
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UnknownUserException.java
    public UnknownUserException() {

    /**
     * Constructs an <code>UnknownUserException</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UnknownUserException.java
    public Any except;

    /** The <code>Any</code> instance that contains the actual user exception thrown
     *  by the server.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UnknownUserException.java
public final class UnknownUserException extends UserException {

/**
 * A class that contains user exceptions returned by the server.
 * When the client uses the DII to make an invocation, any user exception
 * returned from the server is enclosed in an <code>Any</code> object contained in the
 * <code>UnknownUserException</code> object. This is available from the
 * <code>Environment</code> object returned by the method <code>Request.env</code>.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @see Request
 */
