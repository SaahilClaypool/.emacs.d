_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NoRouteToHostException.java
    public NoRouteToHostException() {}

    /**
     * Construct a new NoRouteToHostException with no detailed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NoRouteToHostException.java
    public NoRouteToHostException(String msg) {

    /**
     * Constructs a new NoRouteToHostException with the specified detail
     * message as to why the remote host cannot be reached.
     * A detail message is a String that gives a specific
     * description of this error.
     * @param msg the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/NoRouteToHostException.java
public class NoRouteToHostException extends SocketException {

/**
 * Signals that an error occurred while attempting to connect a
 * socket to a remote address and port.  Typically, the remote
 * host cannot be reached because of an intervening firewall, or
 * if an intermediate router is down.
 *
 * @since   JDK1.1
 */
