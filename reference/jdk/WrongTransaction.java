_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/WrongTransaction.java
    public WrongTransaction(String reason) {

    /**
     * Constructs a WrongTransaction object with the given detail message.
     * @param reason The detail message explaining what caused this exception to be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/WrongTransaction.java
public final class WrongTransaction extends UserException {

/**
 * The CORBA <code>WrongTransaction</code> user-defined exception.
 * This exception is thrown only by the methods
 * <code>Request.get_response</code>
 * and <code>ORB.get_next_response</code> when they are invoked
 * from a transaction scope that is different from the one in
 * which the client originally sent the request.
 * See the OMG Transaction Service Specification for details.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
