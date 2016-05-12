_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private static volatile WeakReference<Object> orb = null;

    /**
     * A static WeakReference to an {@link org.omg.CORBA.ORB ORB} to
     * connect unconnected stubs.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private final JMXServiceURL jmxServiceURL;

    /**
     * @serial The JMXServiceURL of the RMI JMX Connector server to
     * which this client connector will be connected. This field can
     * be null when <var>rmiServer</var> is not null. If both
     * <var>rmiServer</var> and <var>jmxServiceURL</var> are null then
     * serialization will fail.
     *
     * @see #RMIConnector(JMXServiceURL,Map)
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private final RMIServer rmiServer;

    /**
     * @serial The RMIServer stub of the RMI JMX Connector server to
     * which this client connector is (or will be) connected. This
     * field can be null when <var>jmxServiceURL</var> is not
     * null. This includes the case where <var>jmxServiceURL</var>
     * contains a serialized RMIServer stub. If both
     * <var>rmiServer</var> and <var>jmxServiceURL</var> are null then
     * serialization will fail.
     *
     * @see #RMIConnector(RMIServer,Map)
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private static final byte base64ToInt[] = {

    /**
     * This array is a lookup table that translates unicode characters
     * drawn from the "Base64 Alphabet" (as specified in Table 1 of RFC 2045)
     * into their 6-bit positive integer equivalents.  Characters that
     * are not in the Base64 alphabet but fall within the bounds of the
     * array are translated to -1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private static int base64toInt(char c) {

    /**
     * Translates the specified character, which is assumed to be in the
     * "Base 64 Alphabet" into its equivalent 6-bit positive integer.
     *
     * @throws IllegalArgumentException if
     *        c is not in the Base64 Alphabet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private RMIServer findRMIServerJNDI(String jndiURL, Map<String, ?> env,
            boolean isIiop)

    /**
     * Lookup the RMIServer stub in a directory.
     * @param jndiURL A JNDI URL indicating the location of the Stub
     *                (see {@link javax.management.remote.rmi}), e.g.:
     *   <ul><li><tt>rmi://registry-host:port/rmi-stub-name</tt></li>
     *       <li>or <tt>iiop://cosnaming-host:port/iiop-stub-name</tt></li>
     *       <li>or <tt>ldap://ldap-host:port/java-container-dn</tt></li>
     *   </ul>
     * @param env the environment Map passed to the connector.
     * @param isIiop true if the stub is expected to be an IIOP stub.
     * @return The retrieved RMIServer stub.
     * @exception NamingException if the stub couldn't be found.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Writes the RMIConnector fields to an {@link java.io.ObjectOutputStream
     * ObjectOutputStream}.
     * <p>Connects the underlying RMIServer stub to an ORB, if needed,
     * before serializing it. This is done using the environment
     * map that was provided to the constructor, if any, and as documented
     * in {@link javax.management.remote.rmi}.</p>
     * <p>This method then calls <code>s.defaultWriteObject()</code>.
     * Usually, <var>rmiServer</var> is null if this object
     * was constructed with a JMXServiceURL, and <var>jmxServiceURL</var>
     * is null if this object is constructed with a RMIServer stub.
     * <p>Note that the environment Map is not serialized, since the objects
     * it contains are assumed to be contextual and relevant only
     * with respect to the local environment (class loader, ORB, etc...).</p>
     * <p>After an RMIConnector is deserialized, it is assumed that the
     * user will call {@link #connect(Map)}, providing a new Map that
     * can contain values which are contextually relevant to the new
     * local environment.</p>
     * <p>Since connection to the ORB is needed prior to serializing, and
     * since the ORB to connect to is one of those contextual parameters,
     * it is not recommended to re-serialize a just de-serialized object -
     * as the de-serialized object has no map. Thus, when an RMIConnector
     * object is needed for serialization or transmission to a remote
     * application, it is recommended to obtain a new RMIConnector stub
     * by calling {@link RMIConnectorServer#toJMXConnector(Map)}.</p>
     * @param s The ObjectOutputStream to write to.
     * @exception InvalidObjectException if none of <var>rmiServer</var> stub
     *    or <var>jmxServiceURL</var> are set.
     * @see #RMIConnector(JMXServiceURL,Map)
     * @see #RMIConnector(RMIServer,Map)
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Read RMIConnector fields from an {@link java.io.ObjectInputStream
     * ObjectInputStream}.
     * Calls <code>s.defaultReadObject()</code> and then initializes
     * all transient variables that need initializing.
     * @param s The ObjectInputStream to read from.
     * @exception InvalidObjectException if none of <var>rmiServer</var> stub
     *    or <var>jmxServiceURL</var> are set.
     * @see #RMIConnector(JMXServiceURL,Map)
     * @see #RMIConnector(RMIServer,Map)
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    static Object resolveOrb(Map<String, ?> environment)

    /**
     * Get the ORB specified by <var>environment</var>, or create a
     * new one.
     * <p>This method looks in the provided <var>environment</var> for
     * the "java.naming.corba.orb" property. If it is found, the
     * referenced object (an {@link org.omg.CORBA.ORB ORB}) is
     * returned. Otherwise, a new org.omg.CORBA.ORB is created
     * by calling {@link
     * org.omg.CORBA.ORB#init(String[], java.util.Properties)
     * org.omg.CORBA.ORB.init((String[])null,(Properties)null)}
     * <p>The new created ORB is kept in a static
     * {@link WeakReference} and can be reused for connecting other
     * stubs. However, no reference is ever kept on the ORB provided
     * in the <var>environment</var> map, if any.
     * @param environment An environment map, possibly containing an ORB.
     * @return An ORB.
     * @exception IllegalArgumentException if the
     *      <tt>java.naming.corba.orb</tt> property is specified and
     *      does not point to an {@link org.omg.CORBA.ORB ORB}.
     * @exception IOException if the ORB initialization failed.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    static RMIServer connectStub(RMIServer rmiServer,
                                 Map<String, ?> environment)

    /**
     * <p>In order to be usable, an IIOP stub must be connected to an ORB.
     * The stub is automatically connected to the ORB if:
     * <ul>
     *     <li> It was returned by the COS naming</li>
     *     <li> Its server counterpart has been registered in COS naming
     *          through JNDI.</li>
     * </ul>
     * Otherwise, it is not connected. A stub which is deserialized
     * from Jini is not connected. A stub which is obtained from a
     * non registered RMIIIOPServerImpl is not a connected.<br>
     * A stub which is not connected can't be serialized, and thus
     * can't be registered in Jini. A stub which is not connected can't
     * be used to invoke methods on the server.
     * <p>
     * In order to palliate this, this method will connect the
     * given stub if it is not yet connected. If the given
     * <var>RMIServer</var> is not an instance of
     * {@link javax.rmi.CORBA.Stub javax.rmi.CORBA.Stub}, then the
     * method do nothing and simply returns that stub. Otherwise,
     * this method will attempt to connect the stub to an ORB as
     * follows:
     * <ul>
     * <li>This method looks in the provided <var>environment</var> for
     * the "java.naming.corba.orb" property. If it is found, the
     * referenced object (an {@link org.omg.CORBA.ORB ORB}) is used to
     * connect the stub. Otherwise, a new org.omg.CORBA.ORB is created
     * by calling {@link
     * org.omg.CORBA.ORB#init(String[], Properties)
     * org.omg.CORBA.ORB.init((String[])null,(Properties)null)}</li>
     * <li>The new created ORB is kept in a static
     * {@link WeakReference} and can be reused for connecting other
     * stubs. However, no reference is ever kept on the ORB provided
     * in the <var>environment</var> map, if any.</li>
     * </ul>
     * @param rmiServer A RMI Server Stub.
     * @param environment An environment map, possibly containing an ORB.
     * @return the given stub.
     * @exception IllegalArgumentException if the
     *      <tt>java.naming.corba.orb</tt> property is specified and
     *      does not point to an {@link org.omg.CORBA.ORB ORB}.
     * @exception IOException if the connection to the ORB failed.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    public synchronized void connect(Map<String,?> environment)

    /**
     * @throws IOException if the connection could not be made because of a
     *   communication problem, or in the case of the {@code iiop} protocol,
     *   that RMI/IIOP is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    public void connect() throws IOException {

    /**
     * @throws IOException if the connection could not be made because of a
     *   communication problem, or in the case of the {@code iiop} protocol,
     *   that RMI/IIOP is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    public JMXServiceURL getAddress() {

    /**
     * <p>The address of this connector.</p>
     *
     * @return the address of this connector, or null if it
     * does not have one.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    @Override

    /**
     * <p>Returns a string representation of this object.  In general,
     * the <code>toString</code> method returns a string that
     * "textually represents" this object. The result should be a
     * concise but informative representation that is easy for a
     * person to read.</p>
     *
     * @return a String representation of this object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    public RMIConnector(RMIServer rmiServer, Map<String,?> environment) {

    /**
     * <p>Constructs an <code>RMIConnector</code> using the given RMI stub.
     *
     * @param rmiServer an RMI stub representing the RMI connector server.
     * @param environment additional attributes specifying how to make
     * the connection.  This parameter can be null, which is
     * equivalent to an empty Map.
     *
     * @exception IllegalArgumentException if <code>rmiServer</code>
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
    public RMIConnector(JMXServiceURL url, Map<String,?> environment) {

    /**
     * <p>Constructs an <code>RMIConnector</code> that will connect
     * the RMI connector server with the given address.</p>
     *
     * <p>The address can refer directly to the connector server,
     * using one of the following syntaxes:</p>
     *
     * <pre>
     * service:jmx:rmi://<em>[host[:port]]</em>/stub/<em>encoded-stub</em>
     * service:jmx:iiop://<em>[host[:port]]</em>/ior/<em>encoded-IOR</em>
     * </pre>
     *
     * <p>(Here, the square brackets <code>[]</code> are not part of the
     * address but indicate that the host and port are optional.)</p>
     *
     * <p>The address can instead indicate where to find an RMI stub
     * through JNDI, using one of the following syntaxes:</p>
     *
     * <pre>
     * service:jmx:rmi://<em>[host[:port]]</em>/jndi/<em>jndi-name</em>
     * service:jmx:iiop://<em>[host[:port]]</em>/jndi/<em>jndi-name</em>
     * </pre>
     *
     * <p>An implementation may also recognize additional address
     * syntaxes, for example:</p>
     *
     * <pre>
     * service:jmx:iiop://<em>[host[:port]]</em>/stub/<em>encoded-stub</em>
     * </pre>
     *
     * @param url the address of the RMI connector server.
     *
     * @param environment additional attributes specifying how to make
     * the connection.  For JNDI-based addresses, these attributes can
     * usefully include JNDI attributes recognized by {@link
     * InitialContext#InitialContext(Hashtable) InitialContext}.  This
     * parameter can be null, which is equivalent to an empty Map.
     *
     * @exception IllegalArgumentException if <code>url</code>
     * is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnector.java
public class RMIConnector implements JMXConnector, Serializable, JMXAddressable {

/**
 * <p>A connection to a remote RMI connector.  Usually, such
 * connections are made using {@link
 * javax.management.remote.JMXConnectorFactory JMXConnectorFactory}.
 * However, specialized applications can use this class directly, for
 * example with an {@link RMIServer} stub obtained without going
 * through JNDI.</p>
 *
 * @since 1.5
 */
