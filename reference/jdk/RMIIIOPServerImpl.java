_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIIIOPServerImpl.java
    protected void closeServer() throws IOException {

    /**
     * <p>Called by {@link #close()} to close the connector server by
     * unexporting this object.  After returning from this method, the
     * connector server must not accept any new connections.</p>
     *
     * @exception IOException if the attempt to close the connector
     * server failed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIIIOPServerImpl.java
    protected RMIConnection makeClient(String connectionId, Subject subject)

    /**
     * <p>Creates a new client connection as an RMI object exported
     * through IIOP.
     *
     * @param connectionId the ID of the new connection.  Every
     * connection opened by this connector server will have a
     * different ID.  The behavior is unspecified if this parameter is
     * null.
     *
     * @param subject the authenticated subject.  Can be null.
     *
     * @return the newly-created <code>RMIConnection</code>.
     *
     * @exception IOException if the new client object cannot be
     * created or exported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIIIOPServerImpl.java
    public Remote toStub() throws IOException {

    /**
     * <p>Returns an IIOP stub.</p>
     * The stub might not yet be connected to the ORB. The stub will
     * be serializable only if it is connected to the ORB.
     * @return an IIOP stub.
     * @exception IOException if the stub cannot be created - e.g the
     *            RMIIIOPServerImpl has not been exported yet.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIIIOPServerImpl.java
public class RMIIIOPServerImpl extends RMIServerImpl {

/**
 * <p>An {@link RMIServerImpl} that is exported through IIOP and that
 * creates client connections as RMI objects exported through IIOP.
 * User code does not usually reference this class directly.</p>
 *
 * @see RMIServerImpl
 *
 * @since 1.5
 */
