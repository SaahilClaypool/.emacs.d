_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIJRMPServerImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIJRMPServerImpl.java
    protected RMIConnection makeClient(String connectionId, Subject subject)

    /**
     * <p>Creates a new client connection as an RMI object exported
     * through JRMP. The port and socket factories for the new
     * {@link RMIConnection} object are the ones supplied
     * to the <code>RMIJRMPServerImpl</code> constructor.</p>
     *
     * @param connectionId the ID of the new connection. Every
     * connection opened by this connector server will have a
     * different id.  The behavior is unspecified if this parameter is
     * null.
     *
     * @param subject the authenticated subject.  Can be null.
     *
     * @return the newly-created <code>RMIConnection</code>.
     *
     * @exception IOException if the new {@link RMIConnection}
     * object cannot be created or exported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIJRMPServerImpl.java
    public Remote toStub() throws IOException {

    /**
     * <p>Returns a serializable stub for this {@link RMIServer} object.</p>
     *
     * @return a serializable stub.
     *
     * @exception IOException if the stub cannot be obtained - e.g the
     *            RMIJRMPServerImpl has not been exported yet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIJRMPServerImpl.java
public class RMIJRMPServerImpl extends RMIServerImpl {

/**
 * <p>An {@link RMIServer} object that is exported through JRMP and that
 * creates client connections as RMI objects exported through JRMP.
 * User code does not usually reference this class directly.</p>
 *
 * @see RMIServerImpl
 *
 * @since 1.5
 */
