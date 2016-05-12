_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIServer.java
    public RMIConnection newClient(Object credentials) throws IOException;

    /**
     * <p>Makes a new connection through this RMI connector.  Each
     * remote client calls this method to obtain a new RMI object
     * representing its connection.</p>
     *
     * @param credentials this object specifies the user-defined credentials
     * to be passed in to the server in order to authenticate the user before
     * creating the <code>RMIConnection</code>.  Can be null.
     *
     * @return the newly-created connection object.
     *
     * @exception IOException if the new client object cannot be
     * created or exported, or if there is a communication exception
     * during the remote method call.
     *
     * @exception SecurityException if the given credentials do not
     * allow the server to authenticate the caller successfully.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIServer.java
public interface RMIServer extends Remote {

/**
 * <p>RMI object used to establish connections to an RMI connector.
 * There is one Remote object implementing this interface for each RMI
 * connector.</p>
 *
 * <p>User code does not usually refer to this interface.  It is
 * specified as part of the public API so that different
 * implementations of that API will interoperate.</p>
 *
 * @since 1.5
 */
