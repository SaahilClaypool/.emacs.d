_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    private static IOException newIOException(String message,
                                              Throwable cause) {

    /**
     * Construct a new IOException with a nested exception.
     * The nested exception is set only if JDK {@literal >= 1.4}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    private static final char intToAlpha[] = {

    /**
     * This array is a lookup table that translates 6-bit positive integer
     * index values into their "Base64 Alphabet" equivalents as specified
     * in Table 1 of RFC 2045.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    private static RMIServer objectToBind(
            RMIServerImpl rmiServer, Map<String, ?> env)

    /**
     * Object that we will bind to the registry.
     * This object is a stub connected to our RMIServerImpl.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    static String encodeStub(
            RMIServer rmiServer, Map<String, ?> env) throws IOException {

    /**
     * Returns the IOR of the given rmiServer.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    private void encodeStubInAddress(
            RMIServer rmiServer, Map<String, ?> attributes)

    /**
     * Encode a stub into the JMXServiceURL.
     * @param rmiServer The stub object to encode in the URL
     * @param attributes A Map containing environment parameters,
     *        built from the Map specified at this object creation.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    RMIServerImpl newServer() throws IOException {

    /**
     * Creates a new RMIServerImpl.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    void bind(String jndiUrl, Hashtable<?, ?> attributes,
              RMIServer rmiServer, boolean rebind)

    /**
     * Bind a stub to a registry.
     * @param jndiUrl URL of the stub in the registry, extracted
     *        from the <code>JMXServiceURL</code>.
     * @param attributes A Hashtable containing environment parameters,
     *        built from the Map specified at this object creation.
     * @param rmiServer The object to bind in the registry
     * @param rebind true if the object must be rebound.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public void stop() throws IOException {

    /**
     * <p>Deactivates the connector server, that is, stops listening for
     * client connections.  Calling this method will also close all
     * client connections that were made by this server.  After this
     * method returns, whether normally or with an exception, the
     * connector server will not create any new client
     * connections.</p>
     *
     * <p>Once a connector server has been stopped, it cannot be started
     * again.</p>
     *
     * <p>Calling this method when the connector server has already
     * been stopped has no effect.  Calling this method when the
     * connector server has not yet been started will disable the
     * connector server object permanently.</p>
     *
     * <p>If closing a client connection produces an exception, that
     * exception is not thrown from this method.  A {@link
     * JMXConnectionNotification} is emitted from this MBean with the
     * connection ID of the connection that could not be closed.</p>
     *
     * <p>Closing a connector server is a potentially slow operation.
     * For example, if a client machine with an open connection has
     * crashed, the close operation might have to wait for a network
     * protocol timeout.  Callers that do not want to block in a close
     * operation should do it in a separate thread.</p>
     *
     * <p>This method calls the method {@link RMIServerImpl#close()
     * close} on the connector server's <code>RMIServerImpl</code>
     * object.</p>
     *
     * <p>If the <code>RMIServerImpl</code> was bound to a JNDI
     * directory by the {@link #start() start} method, it is unbound
     * from the directory by this method.</p>
     *
     * @exception IOException if the server cannot be closed cleanly,
     * or if the <code>RMIServerImpl</code> cannot be unbound from the
     * directory.  When this exception is thrown, the server has
     * already attempted to close all client connections, if
     * appropriate; to call {@link RMIServerImpl#close()}; and to
     * unbind the <code>RMIServerImpl</code> from its directory, if
     * appropriate.  All client connections are closed except possibly
     * those that generated exceptions when the server attempted to
     * close them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public synchronized void start() throws IOException {

    /**
     * <p>Activates the connector server, that is starts listening for
     * client connections.  Calling this method when the connector
     * server is already active has no effect.  Calling this method
     * when the connector server has been stopped will generate an
     * <code>IOException</code>.</p>
     *
     * <p>The behavior of this method when called for the first time
     * depends on the parameters that were supplied at construction,
     * as described below.</p>
     *
     * <p>First, an object of a subclass of {@link RMIServerImpl} is
     * required, to export the connector server through RMI:</p>
     *
     * <ul>
     *
     * <li>If an <code>RMIServerImpl</code> was supplied to the
     * constructor, it is used.
     *
     * <li>Otherwise, if the protocol part of the
     * <code>JMXServiceURL</code> supplied to the constructor was
     * <code>iiop</code>, an object of type {@link RMIIIOPServerImpl}
     * is created.
     *
     * <li>Otherwise, if the <code>JMXServiceURL</code>
     * was null, or its protocol part was <code>rmi</code>, an object
     * of type {@link RMIJRMPServerImpl} is created.
     *
     * <li>Otherwise, the implementation can create an
     * implementation-specific {@link RMIServerImpl} or it can throw
     * {@link MalformedURLException}.
     *
     * </ul>
     *
     * <p>If the given address includes a JNDI directory URL as
     * specified in the package documentation for {@link
     * javax.management.remote.rmi}, then this
     * <code>RMIConnectorServer</code> will bootstrap by binding the
     * <code>RMIServerImpl</code> to the given address.</p>
     *
     * <p>If the URL path part of the <code>JMXServiceURL</code> was
     * empty or a single slash (<code>/</code>), then the RMI object
     * will not be bound to a directory.  Instead, a reference to it
     * will be encoded in the URL path of the RMIConnectorServer
     * address (returned by {@link #getAddress()}).  The encodings for
     * <code>rmi</code> and <code>iiop</code> are described in the
     * package documentation for {@link
     * javax.management.remote.rmi}.</p>
     *
     * <p>The behavior when the URL path is neither empty nor a JNDI
     * directory URL, or when the protocol is neither <code>rmi</code>
     * nor <code>iiop</code>, is implementation defined, and may
     * include throwing {@link MalformedURLException} when the
     * connector server is created or when it is started.</p>
     *
     * @exception IllegalStateException if the connector server has
     * not been attached to an MBean server.
     * @exception IOException if the connector server cannot be
     * started, or in the case of the {@code iiop} protocol, that
     * RMI/IIOP is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public JMXConnector toJMXConnector(Map<String,?> env) throws IOException {

    /**
     * <p>Returns a client stub for this connector server.  A client
     * stub is a serializable object whose {@link
     * JMXConnector#connect(Map) connect} method can be used to make
     * one new connection to this connector server.</p>
     *
     * @param env client connection parameters of the same sort that
     * could be provided to {@link JMXConnector#connect(Map)
     * JMXConnector.connect(Map)}.  Can be null, which is equivalent
     * to an empty map.
     *
     * @return a client stub that can be used to make a new connection
     * to this connector server.
     *
     * @exception UnsupportedOperationException if this connector
     * server does not support the generation of client stubs.
     *
     * @exception IllegalStateException if the JMXConnectorServer is
     * not started (see {@link #isActive()}).
     *
     * @exception IOException if a communications problem means that a
     * stub cannot be created.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public RMIConnectorServer(JMXServiceURL url, Map<String,?> environment,
                              RMIServerImpl rmiServerImpl,
                              MBeanServer mbeanServer)

    /**
     * <p>Makes an <code>RMIConnectorServer</code> for the given MBean
     * server.</p>
     *
     * @param url the URL defining how to create the connector server.
     * Cannot be null.
     *
     * @param environment attributes governing the creation and
     * storing of the RMI object.  Can be null, which is equivalent to
     * an empty Map.
     *
     * @param rmiServerImpl An implementation of the RMIServer interface,
     *  consistent with the protocol type specified in <var>url</var>.
     *  If this parameter is non null, the protocol type specified by
     *  <var>url</var> is not constrained, and is assumed to be valid.
     *  Otherwise, only "rmi" and "iiop" will be recognized.
     *
     * @param mbeanServer the MBean server to which the new connector
     * server is attached, or null if it will be attached by being
     * registered as an MBean in the MBean server.
     *
     * @exception IllegalArgumentException if <code>url</code> is null.
     *
     * @exception MalformedURLException if <code>url</code> does not
     * conform to the syntax for an RMI connector, or if its protocol
     * is not recognized by this implementation. Only "rmi" and "iiop"
     * are recognized when <var>rmiServerImpl</var> is null.
     *
     * @exception IOException if the connector server cannot be created
     * for some reason or if it is inevitable that its {@link #start()
     * start} method will fail.
     *
     * @see #start
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public RMIConnectorServer(JMXServiceURL url, Map<String,?> environment,
                              MBeanServer mbeanServer)

    /**
     * <p>Makes an <code>RMIConnectorServer</code> for the given MBean
     * server.
     * This is equivalent to calling {@link #RMIConnectorServer(
     * JMXServiceURL,Map,RMIServerImpl,MBeanServer)
     * RMIConnectorServer(directoryURL,environment,null,mbeanServer)}</p>
     *
     * @param url the URL defining how to create the connector server.
     * Cannot be null.
     *
     * @param environment attributes governing the creation and
     * storing of the RMI object.  Can be null, which is equivalent to
     * an empty Map.
     *
     * @param mbeanServer the MBean server to which the new connector
     * server is attached, or null if it will be attached by being
     * registered as an MBean in the MBean server.
     *
     * @exception IllegalArgumentException if <code>url</code> is null.
     *
     * @exception MalformedURLException if <code>url</code> does not
     * conform to the syntax for an RMI connector, or if its protocol
     * is not recognized by this implementation. Only "rmi" and "iiop"
     * are valid when this constructor is used.
     *
     * @exception IOException if the connector server cannot be created
     * for some reason or if it is inevitable that its {@link #start()
     * start} method will fail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public RMIConnectorServer(JMXServiceURL url, Map<String,?> environment)

    /**
     * <p>Makes an <code>RMIConnectorServer</code>.
     * This is equivalent to calling {@link #RMIConnectorServer(
     * JMXServiceURL,Map,RMIServerImpl,MBeanServer)
     * RMIConnectorServer(directoryURL,environment,null,null)}</p>
     *
     * @param url the URL defining how to create the connector server.
     * Cannot be null.
     *
     * @param environment attributes governing the creation and
     * storing of the RMI object.  Can be null, which is equivalent to
     * an empty Map.
     *
     * @exception IllegalArgumentException if <code>url</code> is null.
     *
     * @exception MalformedURLException if <code>url</code> does not
     * conform to the syntax for an RMI connector, or if its protocol
     * is not recognized by this implementation. Only "rmi" and "iiop"
     * are valid when this constructor is used.
     *
     * @exception IOException if the connector server cannot be created
     * for some reason or if it is inevitable that its {@link #start()
     * start} method will fail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public static final String RMI_SERVER_SOCKET_FACTORY_ATTRIBUTE =

    /**
     * <p>Name of the attribute that specifies the {@link
     * RMIServerSocketFactory} for the RMI objects created in
     * conjunction with this connector. The value associated with this
     * attribute must be of type <code>RMIServerSocketFactory</code> and can
     * only be specified in the <code>Map</code> argument supplied when
     * creating a connector server.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
    public static final String RMI_CLIENT_SOCKET_FACTORY_ATTRIBUTE =

    /**
     * <p>Name of the attribute that specifies the {@link
     * RMIClientSocketFactory} for the RMI objects created in
     * conjunction with this connector. The value associated with this
     * attribute must be of type <code>RMIClientSocketFactory</code> and can
     * only be specified in the <code>Map</code> argument supplied when
     * creating a connector server.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectorServer.java
public class RMIConnectorServer extends JMXConnectorServer {

/**
 * <p>A JMX API connector server that creates RMI-based connections
 * from remote clients.  Usually, such connector servers are made
 * using {@link javax.management.remote.JMXConnectorServerFactory
 * JMXConnectorServerFactory}.  However, specialized applications can
 * use this class directly, for example with an {@link RMIServerImpl}
 * object.</p>
 *
 * @since 1.5
 */
