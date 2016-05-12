_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ARG_IN.java
    int value = 1;

    /**
     * The value indicating an input argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ARG_IN.java
public interface ARG_IN {

/**
 * Signifies an "input" argument to an invocation,
 * meaning that the argument is being passed from the client to
 * the server.
 * <code>ARG_IN.value</code> is one of the possible values used to
 * indicate the direction in
 * which a parameter is being passed during an invocation performed
 * using the Dynamic Invocation Interface (DII).
 * <P>
 * The code fragment below shows a typical usage:
 * <PRE>
 *    ORB orb = ORB.init(args, null);
 *    org.omg.CORBA.NamedValue nv = orb.create_named_value(
 *         "IDLArgumentIdentifier", myAny, org.omg.CORBA.ARG_IN.value);
 * </PRE>
 *
 * @see     org.omg.CORBA.NamedValue
 * @since   JDK1.2
 */
