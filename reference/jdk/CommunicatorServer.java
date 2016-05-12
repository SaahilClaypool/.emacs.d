_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Do nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Stop the connector.
     *
     * @exception java.langException This exception should be caught by
     *            the <CODE>MBeanServer</CODE> and re-thrown
     *            as an <CODE>MBeanRegistrationException</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     *
     *@param registrationDone Indicates whether or not the MBean has been
     *       successfully registered in the <CODE>MBeanServer</CODE>.
     *       The value false means that the registration phase has failed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Preregister method of connector.
     *
     *@param server The <CODE>MBeanServer</CODE> in which the MBean will
     *       be registered.
     *@param name The object name of the MBean.
     *
     *@return  The name of the MBean registered.
     *
     *@exception java.langException This exception should be caught by
     *           the <CODE>MBeanServer</CODE> and re-thrown
     *           as an <CODE>MBeanRegistrationException</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private static String getStringForState(int s) {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void sendStateChangeNotification(int oldState, int newState) {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Returns an array of MBeanNotificationInfo objects describing
     * the notification types sent by this CommunicatorServer.
     * There is only one type of notifications sent by the CommunicatorServer:
     * it is <tt>{@link javax.management.AttributeChangeNotification}</tt>,
     * sent when the <tt>State</tt> attribute of this CommunicatorServer
     * changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Removes the specified listener from this CommunicatorServer.
     * Note that if the listener has been registered with different
     * handback objects or notification filters, all entries corresponding
     * to the listener will be removed.
     *
     * @param listener The listener object to be removed.
     *
     * @exception ListenerNotFoundException The listener is not registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Adds a listener for the notifications emitted by this
     * CommunicatorServer.
     * There is only one type of notifications sent by the CommunicatorServer:
     * they are <tt>{@link javax.management.AttributeChangeNotification}</tt>,
     * sent when the <tt>State</tt> attribute of this CommunicatorServer
     * changes.
     *
     * @param listener The listener object which will handle the emitted
     *        notifications.
     * @param filter The filter object. If filter is null, no filtering
     *        will be performed before handling notifications.
     * @param handback An object which will be sent back unchanged to the
     *        listener when a notification is emitted.
     *
     * @exception IllegalArgumentException Listener parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void readObject(ObjectInputStream stream)

    /**
     * Controls the way the CommunicatorServer service is deserialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void terminateAllClient() {

    /**
     * Call <CODE>interrupt()</CODE> on each pending client.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void waitClientTermination() {

    /**
     * This method blocks until there is no more active client.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private synchronized void waitIfTooManyClients()

    /**
     * This method blocks if there are too many active clients.
     * Call to <CODE>wait()</CODE> is terminated when a client handler
     * thread calls <CODE>notifyClientHandlerDeleted(this)</CODE> ;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    String makeThreadName() {

    /**
     * Returns the string used to name the connector thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    String makeDebugTag() {

    /**
     * Returns the string used in debug traces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    void changeState(int newState) {

    /**
     * For internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    ObjectName getObjectName() {

    /**
     * For internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public synchronized void setMBeanServer(MBeanServer newMBS)

    /**
     * Set the <code>MBeanServer</code> object to which incoming
     * requests are sent.  This must be either the MBean server in
     * which this connector is registered, or an
     * <code>MBeanServerForwarder</code> leading to that server.  An
     * <code>MBeanServerForwarder</code> <code>mbsf</code> leads to an
     * MBean server <code>mbs</code> if
     * <code>mbsf.getMBeanServer()</code> is either <code>mbs</code>
     * or an <code>MBeanServerForwarder</code> leading to
     * <code>mbs</code>.
     *
     * @exception IllegalArgumentException if <code>newMBS</code> is neither
     * the MBean server in which this connector is registered nor an
     * <code>MBeanServerForwarder</code> leading to that server.
     *
     * @exception IllegalStateException This method has been invoked
     * while the communicator was ONLINE or STARTING.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public synchronized MBeanServer getMBeanServer() {

    /**
     * Get the <code>MBeanServer</code> object to which incoming requests are
     * sent.  This is either the MBean server in which this connector is
     * registered, or an <code>MBeanServerForwarder</code> leading to that
     * server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doUnbind()

    /**
     * <CODE>doUnbind()</CODE> is called whenever the connector goes
     * <CODE>OFFLINE</CODE>, except if <CODE>doBind()</CODE> has thrown an
     * exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doProcess()

    /**
     * <CODE>doProcess()</CODE> is called after <CODE>doReceive()</CODE>:
     * it should process the requests of the incoming client.
     * If it throws an exception, <CODE>doUnbind()</CODE> is called and
     * <CODE>run()</CODE> stops.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doReceive()

    /**
     * <CODE>doReceive()</CODE> should block until a client is available.
     * If this method throws an exception, <CODE>doProcess()</CODE> is not
     * called but <CODE>doUnbind()</CODE> is called then <CODE>run()</CODE>
     * stops.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doBind()

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doError(Exception e) throws CommunicationException;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * For SNMP Runtime internal use only.
     * <p>
     * The <CODE>run</CODE> method executed by this connector's main thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected long getBindSleepTime() {

    /**
     * The delay, in ms, during which the communicator server will sleep before
     * attempting to bind again.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected int getBindTries() {

    /**
     * The number of times the communicator server will attempt
     * to bind before giving up.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    synchronized void notifyClientHandlerDeleted(ClientHandler h) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    void notifyClientHandlerCreated(ClientHandler h) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    void setMaxActiveClientCount(int c)

    /**
     * Sets the maximum number of clients this
     * <CODE>CommunicatorServer</CODE> can process concurrently.
     *
     * @param c The number of clients.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was ONLINE or STARTING.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int getMaxActiveClientCount() {

    /**
     * Gets the maximum number of clients that this
     * <CODE>CommunicatorServer</CODE> can  process concurrently.
     *
     * @return The maximum number of clients that this
     *         <CODE>CommunicatorServer</CODE> can
     *         process concurrently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int getActiveClientCount() {

    /**
     * Gets the number of clients currently being processed by this
     * <CODE>CommunicatorServer</CODE>.
     *
     * @return The number of clients currently being processed by this
     *         <CODE>CommunicatorServer</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int getServedClientCount() {

    /**
     * Gets the number of clients that have been processed by this
     * <CODE>CommunicatorServer</CODE>  since its creation.
     *
     * @return The number of clients handled by this
     *         <CODE>CommunicatorServer</CODE>
     *         since its creation. This counter is not reset by the
     *         <CODE>stop</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the protocol being used by this <CODE>CommunicatorServer</CODE>.
     * @return The protocol as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Sets the port number used by this <CODE>CommunicatorServer</CODE>.
     *
     * @param port The port number used by this
     *             <CODE>CommunicatorServer</CODE>.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was ONLINE or STARTING.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the port number used by this <CODE>CommunicatorServer</CODE>.
     *
     * @return The port number used by this <CODE>CommunicatorServer</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the host name used by this <CODE>CommunicatorServer</CODE>.
     *
     * @return The host name used by this <CODE>CommunicatorServer</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the state of this <CODE>CommunicatorServer</CODE> as a string.
     *
     * @return One of the strings "ONLINE", "OFFLINE", "STARTING" or
     *         "STOPPING".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the state of this <CODE>CommunicatorServer</CODE> as an integer.
     *
     * @return <CODE>ONLINE</CODE>, <CODE>OFFLINE</CODE>,
     *         <CODE>STARTING</CODE> or <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void waitForStart(long timeout)

    /**
     * <p>Waits until the communicator is started or timeout expires.
     *
     * @param timeout Time in ms to wait for the connector to start.
     *        If <code>timeout</code> is positive, wait for at most
     *        the specified time. An infinite timeout can be specified
     *        by passing a <code>timeout</code> value equals
     *        <code>Long.MAX_VALUE</code>. In that case the method
     *        will wait until the connector starts or fails to start.
     *        If timeout is negative or zero, returns as soon as possible
     *        without waiting.
     *
     * @exception CommunicationException if the connectors fails to start.
     * @exception InterruptedException if the thread is interrupted or the
     *            timeout expires.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * <p>Waits until either the State attribute of this MBean equals the
     * specified <VAR>wantedState</VAR> parameter,
     * or the specified  <VAR>timeOut</VAR> has elapsed.
     * The method <CODE>waitState</CODE> returns with a boolean value
     * indicating whether the specified <VAR>wantedState</VAR> parameter
     * equals the value of this MBean's State attribute at the time the method
     * terminates.</p>
     *
     * <p>Two special cases for the <VAR>timeOut</VAR> parameter value are:</p>
     * <UL><LI> if <VAR>timeOut</VAR> is negative then <CODE>waitState</CODE>
     *     returns immediately (i.e. does not wait at all),</LI>
     * <LI> if <VAR>timeOut</VAR> equals zero then <CODE>waitState</CODE>
     *     waits untill the value of this MBean's State attribute
     *     is the same as the <VAR>wantedState</VAR> parameter (i.e. will wait
     *     indefinitely if this condition is never met).</LI></UL>
     *
     * @param wantedState The value of this MBean's State attribute to wait
     *        for. <VAR>wantedState</VAR> can be one of:
     * <ul>
     * <li><CODE>CommunicatorServer.OFFLINE</CODE>,</li>
     * <li><CODE>CommunicatorServer.ONLINE</CODE>,</li>
     * <li><CODE>CommunicatorServer.STARTING</CODE>,</li>
     * <li><CODE>CommunicatorServer.STOPPING</CODE>.</li>
     * </ul>
     * @param timeOut The maximum time to wait for, in milliseconds,
     *        if positive.
     * Infinite time out if 0, or no waiting at all if negative.
     *
     * @return true if the value of this MBean's State attribute is the
     *      same as the <VAR>wantedState</VAR> parameter; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Tests whether the <CODE>CommunicatorServer</CODE> is active.
     *
     * @return True if connector is <CODE>ONLINE</CODE>; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Stops this <CODE>CommunicatorServer</CODE>.
     * <p>
     * Has no effect if this <CODE>CommunicatorServer</CODE> is
     * <CODE>OFFLINE</CODE> or  <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Starts this <CODE>CommunicatorServer</CODE>.
     * <p>
     * Has no effect if this <CODE>CommunicatorServer</CODE> is
     * <CODE>ONLINE</CODE> or <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public void start(long timeout)

    /**
     * Starts this <CODE>CommunicatorServer</CODE>.
     * <p>
     * Has no effect if this <CODE>CommunicatorServer</CODE> is
     * <CODE>ONLINE</CODE> or <CODE>STOPPING</CODE>.
     * @param timeout Time in ms to wait for the connector to start.
     *        If <code>timeout</code> is positive, wait for at most
     *        the specified time. An infinite timeout can be specified
     *        by passing a <code>timeout</code> value equals
     *        <code>Long.MAX_VALUE</code>. In that case the method
     *        will wait until the connector starts or fails to start.
     *        If timeout is negative or zero, returns as soon as possible
     *        without waiting.
     * @exception CommunicationException if the connectors fails to start.
     * @exception InterruptedException if the thread is interrupted or the
     *            timeout expires.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public CommunicatorServer(int connectorType)

    /**
     * Instantiates a <CODE>CommunicatorServer</CODE>.
     *
     * @param connectorType Indicates the connector type. Possible values are:
     * SNMP_TYPE.
     *
     * @exception <CODE>java.lang.IllegalArgumentException</CODE>
     *            This connector type is not correct.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int port = -1 ;

    /**
     * The port number used by this CommunicatorServer.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    String host = null ;

    /**
     * The host name used by this CommunicatorServer.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    transient int servedClientCount = 0 ;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int maxActiveClientCount = 1 ;

    /**
     * The maximum number of clients that the CommunicatorServer can
     * process concurrently.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    transient String dbgTag = null ;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    ObjectName objectName ;

    /**
     * The object name of the connector server.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
     transient volatile int state = OFFLINE ;

    /**
     * The state of the connector server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int HTTPS_TYPE = 5 ;

    /**
     * Indicates that it is an HTTPS connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int SNMP_TYPE = 4 ;

    /**
     * Indicates that it is an SNMP connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int HTML_TYPE = 3 ;

    /**
     * Indicates that it is an HTML connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int HTTP_TYPE = 2 ;

    /**
     * Indicates that it is an HTTP connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int RMI_TYPE = 1 ;

    /**
     * Indicates that it is an RMI connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int STARTING = 3 ;

    /**
     * Represents a <CODE>STARTING</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int STOPPING = 2 ;

    /**
     * Represents a <CODE>STOPPING</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int OFFLINE = 1 ;

    /**
     * Represents an <CODE>OFFLINE</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int ONLINE = 0 ;

    /**
     * Represents an <CODE>ONLINE</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
public abstract class CommunicatorServer

/**
 * Defines generic behavior for the server part of a connector or an adaptor.
 * Most connectors or adaptors extend <CODE>CommunicatorServer</CODE>
 * and inherit this behavior. Connectors or adaptors that do not fit into
 * this model do not extend <CODE>CommunicatorServer</CODE>.
 * <p>
 * A <CODE>CommunicatorServer</CODE> is an active object, it listens for
 * client requests  and processes them in its own thread. When necessary, a
 * <CODE>CommunicatorServer</CODE> creates other threads to process multiple
 * requests concurrently.
 * <p>
 * A <CODE>CommunicatorServer</CODE> object can be stopped by calling the
 * <CODE>stop</CODE> method. When it is stopped, the
 * <CODE>CommunicatorServer</CODE> no longer listens to client requests and
 * no longer holds any thread or communication resources.
 * It can be started again by calling the <CODE>start</CODE> method.
 * <p>
 * A <CODE>CommunicatorServer</CODE> has a <CODE>State</CODE> attribute
 * which reflects its  activity.
 * <p>
 * <TABLE>
 * <TR><TH>CommunicatorServer</TH>      <TH>State</TH></TR>
 * <TR><TD><CODE>stopped</CODE></TD>    <TD><CODE>OFFLINE</CODE></TD></TR>
 * <TR><TD><CODE>starting</CODE></TD>    <TD><CODE>STARTING</CODE></TD></TR>
 * <TR><TD><CODE>running</CODE></TD>     <TD><CODE>ONLINE</CODE></TD></TR>
 * <TR><TD><CODE>stopping</CODE></TD>     <TD><CODE>STOPPING</CODE></TD></TR>
 * </TABLE>
 * <p>
 * The <CODE>STARTING</CODE> state marks the transition
 * from <CODE>OFFLINE</CODE> to <CODE>ONLINE</CODE>.
 * <p>
 * The <CODE>STOPPING</CODE> state marks the transition from
 * <CODE>ONLINE</CODE> to <CODE>OFFLINE</CODE>. This occurs when the
 * <CODE>CommunicatorServer</CODE> is finishing or interrupting active
 * requests.
 * <p>
 * When a <CODE>CommunicatorServer</CODE> is unregistered from the MBeanServer,
 * it is stopped automatically.
 * <p>
 * When the value of the <CODE>State</CODE> attribute changes the
 * <CODE>CommunicatorServer</CODE> sends a
 * <tt>{@link javax.management.AttributeChangeNotification}</tt> to the
 * registered listeners, if any.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Do nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Stop the connector.
     *
     * @exception java.langException This exception should be caught by
     *            the <CODE>MBeanServer</CODE> and re-thrown
     *            as an <CODE>MBeanRegistrationException</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     *
     *@param registrationDone Indicates whether or not the MBean has been
     *       successfully registered in the <CODE>MBeanServer</CODE>.
     *       The value false means that the registration phase has failed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Preregister method of connector.
     *
     *@param server The <CODE>MBeanServer</CODE> in which the MBean will
     *       be registered.
     *@param name The object name of the MBean.
     *
     *@return  The name of the MBean registered.
     *
     *@exception java.langException This exception should be caught by
     *           the <CODE>MBeanServer</CODE> and re-thrown
     *           as an <CODE>MBeanRegistrationException</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private static String getStringForState(int s) {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void sendStateChangeNotification(int oldState, int newState) {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Returns an array of MBeanNotificationInfo objects describing
     * the notification types sent by this CommunicatorServer.
     * There is only one type of notifications sent by the CommunicatorServer:
     * it is <tt>{@link javax.management.AttributeChangeNotification}</tt>,
     * sent when the <tt>State</tt> attribute of this CommunicatorServer
     * changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Removes the specified listener from this CommunicatorServer.
     * Note that if the listener has been registered with different
     * handback objects or notification filters, all entries corresponding
     * to the listener will be removed.
     *
     * @param listener The listener object to be removed.
     *
     * @exception ListenerNotFoundException The listener is not registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Adds a listener for the notifications emitted by this
     * CommunicatorServer.
     * There is only one type of notifications sent by the CommunicatorServer:
     * they are <tt>{@link javax.management.AttributeChangeNotification}</tt>,
     * sent when the <tt>State</tt> attribute of this CommunicatorServer
     * changes.
     *
     * @param listener The listener object which will handle the emitted
     *        notifications.
     * @param filter The filter object. If filter is null, no filtering
     *        will be performed before handling notifications.
     * @param handback An object which will be sent back unchanged to the
     *        listener when a notification is emitted.
     *
     * @exception IllegalArgumentException Listener parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void readObject(ObjectInputStream stream)

    /**
     * Controls the way the CommunicatorServer service is deserialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void terminateAllClient() {

    /**
     * Call <CODE>interrupt()</CODE> on each pending client.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void waitClientTermination() {

    /**
     * This method blocks until there is no more active client.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private synchronized void waitIfTooManyClients()

    /**
     * This method blocks if there are too many active clients.
     * Call to <CODE>wait()</CODE> is terminated when a client handler
     * thread calls <CODE>notifyClientHandlerDeleted(this)</CODE> ;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    String makeThreadName() {

    /**
     * Returns the string used to name the connector thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    String makeDebugTag() {

    /**
     * Returns the string used in debug traces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    void changeState(int newState) {

    /**
     * For internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    ObjectName getObjectName() {

    /**
     * For internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public synchronized void setMBeanServer(MBeanServer newMBS)

    /**
     * Set the <code>MBeanServer</code> object to which incoming
     * requests are sent.  This must be either the MBean server in
     * which this connector is registered, or an
     * <code>MBeanServerForwarder</code> leading to that server.  An
     * <code>MBeanServerForwarder</code> <code>mbsf</code> leads to an
     * MBean server <code>mbs</code> if
     * <code>mbsf.getMBeanServer()</code> is either <code>mbs</code>
     * or an <code>MBeanServerForwarder</code> leading to
     * <code>mbs</code>.
     *
     * @exception IllegalArgumentException if <code>newMBS</code> is neither
     * the MBean server in which this connector is registered nor an
     * <code>MBeanServerForwarder</code> leading to that server.
     *
     * @exception IllegalStateException This method has been invoked
     * while the communicator was ONLINE or STARTING.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public synchronized MBeanServer getMBeanServer() {

    /**
     * Get the <code>MBeanServer</code> object to which incoming requests are
     * sent.  This is either the MBean server in which this connector is
     * registered, or an <code>MBeanServerForwarder</code> leading to that
     * server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doUnbind()

    /**
     * <CODE>doUnbind()</CODE> is called whenever the connector goes
     * <CODE>OFFLINE</CODE>, except if <CODE>doBind()</CODE> has thrown an
     * exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doProcess()

    /**
     * <CODE>doProcess()</CODE> is called after <CODE>doReceive()</CODE>:
     * it should process the requests of the incoming client.
     * If it throws an exception, <CODE>doUnbind()</CODE> is called and
     * <CODE>run()</CODE> stops.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doReceive()

    /**
     * <CODE>doReceive()</CODE> should block until a client is available.
     * If this method throws an exception, <CODE>doProcess()</CODE> is not
     * called but <CODE>doUnbind()</CODE> is called then <CODE>run()</CODE>
     * stops.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doBind()

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected abstract void doError(Exception e) throws CommunicationException;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * For SNMP Runtime internal use only.
     * <p>
     * The <CODE>run</CODE> method executed by this connector's main thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected long getBindSleepTime() {

    /**
     * The delay, in ms, during which the communicator server will sleep before
     * attempting to bind again.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    protected int getBindTries() {

    /**
     * The number of times the communicator server will attempt
     * to bind before giving up.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    synchronized void notifyClientHandlerDeleted(ClientHandler h) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    void notifyClientHandlerCreated(ClientHandler h) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    void setMaxActiveClientCount(int c)

    /**
     * Sets the maximum number of clients this
     * <CODE>CommunicatorServer</CODE> can process concurrently.
     *
     * @param c The number of clients.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was ONLINE or STARTING.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int getMaxActiveClientCount() {

    /**
     * Gets the maximum number of clients that this
     * <CODE>CommunicatorServer</CODE> can  process concurrently.
     *
     * @return The maximum number of clients that this
     *         <CODE>CommunicatorServer</CODE> can
     *         process concurrently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int getActiveClientCount() {

    /**
     * Gets the number of clients currently being processed by this
     * <CODE>CommunicatorServer</CODE>.
     *
     * @return The number of clients currently being processed by this
     *         <CODE>CommunicatorServer</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int getServedClientCount() {

    /**
     * Gets the number of clients that have been processed by this
     * <CODE>CommunicatorServer</CODE>  since its creation.
     *
     * @return The number of clients handled by this
     *         <CODE>CommunicatorServer</CODE>
     *         since its creation. This counter is not reset by the
     *         <CODE>stop</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the protocol being used by this <CODE>CommunicatorServer</CODE>.
     * @return The protocol as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Sets the port number used by this <CODE>CommunicatorServer</CODE>.
     *
     * @param port The port number used by this
     *             <CODE>CommunicatorServer</CODE>.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was ONLINE or STARTING.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the port number used by this <CODE>CommunicatorServer</CODE>.
     *
     * @return The port number used by this <CODE>CommunicatorServer</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the host name used by this <CODE>CommunicatorServer</CODE>.
     *
     * @return The host name used by this <CODE>CommunicatorServer</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the state of this <CODE>CommunicatorServer</CODE> as a string.
     *
     * @return One of the strings "ONLINE", "OFFLINE", "STARTING" or
     *         "STOPPING".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Gets the state of this <CODE>CommunicatorServer</CODE> as an integer.
     *
     * @return <CODE>ONLINE</CODE>, <CODE>OFFLINE</CODE>,
     *         <CODE>STARTING</CODE> or <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    private void waitForStart(long timeout)

    /**
     * <p>Waits until the communicator is started or timeout expires.
     *
     * @param timeout Time in ms to wait for the connector to start.
     *        If <code>timeout</code> is positive, wait for at most
     *        the specified time. An infinite timeout can be specified
     *        by passing a <code>timeout</code> value equals
     *        <code>Long.MAX_VALUE</code>. In that case the method
     *        will wait until the connector starts or fails to start.
     *        If timeout is negative or zero, returns as soon as possible
     *        without waiting.
     *
     * @exception CommunicationException if the connectors fails to start.
     * @exception InterruptedException if the thread is interrupted or the
     *            timeout expires.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * <p>Waits until either the State attribute of this MBean equals the
     * specified <VAR>wantedState</VAR> parameter,
     * or the specified  <VAR>timeOut</VAR> has elapsed.
     * The method <CODE>waitState</CODE> returns with a boolean value
     * indicating whether the specified <VAR>wantedState</VAR> parameter
     * equals the value of this MBean's State attribute at the time the method
     * terminates.</p>
     *
     * <p>Two special cases for the <VAR>timeOut</VAR> parameter value are:</p>
     * <UL><LI> if <VAR>timeOut</VAR> is negative then <CODE>waitState</CODE>
     *     returns immediately (i.e. does not wait at all),</LI>
     * <LI> if <VAR>timeOut</VAR> equals zero then <CODE>waitState</CODE>
     *     waits untill the value of this MBean's State attribute
     *     is the same as the <VAR>wantedState</VAR> parameter (i.e. will wait
     *     indefinitely if this condition is never met).</LI></UL>
     *
     * @param wantedState The value of this MBean's State attribute to wait
     *        for. <VAR>wantedState</VAR> can be one of:
     * <ul>
     * <li><CODE>CommunicatorServer.OFFLINE</CODE>,</li>
     * <li><CODE>CommunicatorServer.ONLINE</CODE>,</li>
     * <li><CODE>CommunicatorServer.STARTING</CODE>,</li>
     * <li><CODE>CommunicatorServer.STOPPING</CODE>.</li>
     * </ul>
     * @param timeOut The maximum time to wait for, in milliseconds,
     *        if positive.
     * Infinite time out if 0, or no waiting at all if negative.
     *
     * @return true if the value of this MBean's State attribute is the
     *      same as the <VAR>wantedState</VAR> parameter; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Tests whether the <CODE>CommunicatorServer</CODE> is active.
     *
     * @return True if connector is <CODE>ONLINE</CODE>; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Stops this <CODE>CommunicatorServer</CODE>.
     * <p>
     * Has no effect if this <CODE>CommunicatorServer</CODE> is
     * <CODE>OFFLINE</CODE> or  <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    @Override

    /**
     * Starts this <CODE>CommunicatorServer</CODE>.
     * <p>
     * Has no effect if this <CODE>CommunicatorServer</CODE> is
     * <CODE>ONLINE</CODE> or <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public void start(long timeout)

    /**
     * Starts this <CODE>CommunicatorServer</CODE>.
     * <p>
     * Has no effect if this <CODE>CommunicatorServer</CODE> is
     * <CODE>ONLINE</CODE> or <CODE>STOPPING</CODE>.
     * @param timeout Time in ms to wait for the connector to start.
     *        If <code>timeout</code> is positive, wait for at most
     *        the specified time. An infinite timeout can be specified
     *        by passing a <code>timeout</code> value equals
     *        <code>Long.MAX_VALUE</code>. In that case the method
     *        will wait until the connector starts or fails to start.
     *        If timeout is negative or zero, returns as soon as possible
     *        without waiting.
     * @exception CommunicationException if the connectors fails to start.
     * @exception InterruptedException if the thread is interrupted or the
     *            timeout expires.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public CommunicatorServer(int connectorType)

    /**
     * Instantiates a <CODE>CommunicatorServer</CODE>.
     *
     * @param connectorType Indicates the connector type. Possible values are:
     * SNMP_TYPE.
     *
     * @exception <CODE>java.lang.IllegalArgumentException</CODE>
     *            This connector type is not correct.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int port = -1 ;

    /**
     * The port number used by this CommunicatorServer.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    String host = null ;

    /**
     * The host name used by this CommunicatorServer.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    transient int servedClientCount = 0 ;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    int maxActiveClientCount = 1 ;

    /**
     * The maximum number of clients that the CommunicatorServer can
     * process concurrently.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    transient String dbgTag = null ;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    ObjectName objectName ;

    /**
     * The object name of the connector server.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
     transient volatile int state = OFFLINE ;

    /**
     * The state of the connector server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int HTTPS_TYPE = 5 ;

    /**
     * Indicates that it is an HTTPS connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int SNMP_TYPE = 4 ;

    /**
     * Indicates that it is an SNMP connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int HTML_TYPE = 3 ;

    /**
     * Indicates that it is an HTML connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int HTTP_TYPE = 2 ;

    /**
     * Indicates that it is an HTTP connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    //public static final int RMI_TYPE = 1 ;

    /**
     * Indicates that it is an RMI connector type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int STARTING = 3 ;

    /**
     * Represents a <CODE>STARTING</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int STOPPING = 2 ;

    /**
     * Represents a <CODE>STOPPING</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int OFFLINE = 1 ;

    /**
     * Represents an <CODE>OFFLINE</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
    public static final int ONLINE = 0 ;

    /**
     * Represents an <CODE>ONLINE</CODE> state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicatorServer.java
public abstract class CommunicatorServer

/**
 * Defines generic behavior for the server part of a connector or an adaptor.
 * Most connectors or adaptors extend <CODE>CommunicatorServer</CODE>
 * and inherit this behavior. Connectors or adaptors that do not fit into
 * this model do not extend <CODE>CommunicatorServer</CODE>.
 * <p>
 * A <CODE>CommunicatorServer</CODE> is an active object, it listens for
 * client requests  and processes them in its own thread. When necessary, a
 * <CODE>CommunicatorServer</CODE> creates other threads to process multiple
 * requests concurrently.
 * <p>
 * A <CODE>CommunicatorServer</CODE> object can be stopped by calling the
 * <CODE>stop</CODE> method. When it is stopped, the
 * <CODE>CommunicatorServer</CODE> no longer listens to client requests and
 * no longer holds any thread or communication resources.
 * It can be started again by calling the <CODE>start</CODE> method.
 * <p>
 * A <CODE>CommunicatorServer</CODE> has a <CODE>State</CODE> attribute
 * which reflects its  activity.
 * <p>
 * <TABLE>
 * <TR><TH>CommunicatorServer</TH>      <TH>State</TH></TR>
 * <TR><TD><CODE>stopped</CODE></TD>    <TD><CODE>OFFLINE</CODE></TD></TR>
 * <TR><TD><CODE>starting</CODE></TD>    <TD><CODE>STARTING</CODE></TD></TR>
 * <TR><TD><CODE>running</CODE></TD>     <TD><CODE>ONLINE</CODE></TD></TR>
 * <TR><TD><CODE>stopping</CODE></TD>     <TD><CODE>STOPPING</CODE></TD></TR>
 * </TABLE>
 * <p>
 * The <CODE>STARTING</CODE> state marks the transition
 * from <CODE>OFFLINE</CODE> to <CODE>ONLINE</CODE>.
 * <p>
 * The <CODE>STOPPING</CODE> state marks the transition from
 * <CODE>ONLINE</CODE> to <CODE>OFFLINE</CODE>. This occurs when the
 * <CODE>CommunicatorServer</CODE> is finishing or interrupting active
 * requests.
 * <p>
 * When a <CODE>CommunicatorServer</CODE> is unregistered from the MBeanServer,
 * it is stopped automatically.
 * <p>
 * When the value of the <CODE>State</CODE> attribute changes the
 * <CODE>CommunicatorServer</CODE> sends a
 * <tt>{@link javax.management.AttributeChangeNotification}</tt> to the
 * registered listeners, if any.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
