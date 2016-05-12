_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    @Override

    /**
     * Gives a status report of the request.
     * @return The status report of the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setRequestStatus(int reqst) {

    /**
     * Sets the request status to the specified value.
     * @param reqst The new status request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    static String statusDescription(int state) {

    /**
     * Returns the string state corresponding to the specified integer state.
     * @param state The integer state.
     * @return The string state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    long timeRemainingForAction(long currtime) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void initNewRequest() {

    /**
     * Initializes the request id from the request counter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final  void setRequestSentTime(long sendtime) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setPrevPollTime(long prev) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setErrorStatusAndIndex(int stat, int idx) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setVarBindList(SnmpVarBindList newvblst) {

    /**
     * For SNMP Runtime internal use only.
     * You should specify the <CODE>SnmpVarBindList</CODE> at SnmpInformRequest creation time.
     * You cannot modify it during the life-time of the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized SnmpVarBindList getVarBindList() {

    /**
     * For SNMP Runtime internal use only.
     * Gets the active <CODE>SnmpVarBindList</CODE>. The contents of it
     * are not guaranteed to be consistent when the inform request is active.
     * @return The list of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void stopRequest() {

    /**
     * This method cancels an active inform request and removes it from the polling list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final void invokeOnResponse(Object resp) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleInternalError(String msg) {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleError(String msg) {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleTimeout() {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleSuccess() {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized void parsePduPacket(SnmpPduRequestType rpdu) {

    /**
     * Parses the inform response packet. If the agent responds with error set,
     * it does not parse any further.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final void processResponse() {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final void sendPduPacket(byte[] buffer, int length) throws java.io.IOException {

    /**
     * Sends the prepared PDU packet to the manager and updates the data structure
     * to expect a response. It acquires a lock on the socket to prevent a case
     * where a response arrives before this thread could insert the
     * request into the wait queue.
     * @exception IOException Signals that an I/O exception of some sort has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized SnmpPdu constructPduPacket() {

    /**
     * Constructs an inform request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    void action() {

    /**
     * This method determines whether the inform request is to be retried. This is used if the
     * peer did not respond to a previous request. If the request exceeds
     * the maxTries limit, a timeout is signaled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void schedulePoll() {

    /**
     * This method creates a new request ID. The ID is submitted to the poll server for scheduling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private synchronized void startRequest(long starttime) {

    /**
     * This method submits the inform request for polling and marks the request
     * active. It does nothing if the request is already active.
     * The poll will be scheduled to happen immediately.
     * @param starttime The start time for polling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized void start(SnmpVarBindList vblst) throws SnmpStatusException {

    /**
     * For SNMP Runtime internal use only.
     * Starts an inform request in asynchronous mode. The callback interface
     * is used to notify the user upon request completion.
     * @param vblst The list of <CODE>SnmpVarBind</CODE> to be used.
     * @exception SnmpStatusException This inform request is already in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    public static String snmpErrorToString(int errcode) {

    /**
     * Returns the <CODE>String</CODE> representation of an error code.
     * @param errcode The error code as an integer.
     * @return The error code as a <CODE>String</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpInformRequest</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Sets all the references to this SNMP inform request object to <CODE>null</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized void notifyClient() {

    /**
     * Notifies the registered client about the completion of an operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public void cancelRequest() {

    /**
     * Cancels the active inform request and removes itself from the polling list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public boolean waitForCompletion(long time) {

    /**
     * Used in synchronous mode only.
     * Provides a hook that enables a synchronous operation on a previously sent inform request.
     * Only one inform request can be in synchronous mode on a given thread.
     * The blocked thread is notified when the inform request state reaches completion.
     * If the inform request is not active, the method returns immediately.
     * The user must get the error status of the inform request to determine the
     * exact status of the request.
     *
     * @param time The amount of time to wait. Zero means block until complete.
     * @return <CODE>true</CODE> if the inform request has completed, <CODE>false</CODE> if it is still active.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    public final synchronized SnmpVarBindList getResponseVarBindList() {

    /**
     * Gets the <CODE>SnmpVarBindList</CODE> of the inform response.
     * It returns a null value if the inform request is in progress.
     * This ensures accidental manipulation does not occur when a request is in progress.
     * In case of an error, <CODE>SnmpVarBindList</CODE> is the copy
     * of the original <CODE>SnmpVarBindList</CODE> at the time of making the inform request.
     * @return The list of <CODE>SnmpVarBind</CODE> objects returned by the manager or the null value if the request
     * is in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized long getAbsMaxTimeToWait() {

    /**
     * Gets absolute time in milliseconds (based on epoch time) before which an inform
     * response is expected from a manager.
     * @return The absolute time within which an inform response is expected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized long getAbsNextPollTime () {

    /**
     * Gets absolute time in milliseconds (based on epoch time) when the next
     * polling activity will begin.
     * @return The absolute time when polling will begin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setTimeout(int value) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getNumTries() {

    /**
     * Gets the number of tries performed for the current inform request.
     * @return The number of tries performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public int getMaxTries() {

    /**
     * Gets the maximum number of tries before declaring that the manager is not responding.
     * @return The maximum number of times an inform request should be tried.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getErrorIndex() {

    /**
     * Gets the index.
     * <P>NOTE: this value is equal to the <CODE>errorIndex</CODE> field minus 1.
     * @return The error index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getErrorStatus() {

    /**
     * Gets the status associated with the <CODE>SnmpVarBindList</CODE>.
     * @return The error status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized boolean isResultAvailable() {

    /**
     * Indicates whether or not the inform request result is available.
     * @return <CODE>true</CODE> if the inform request result is available, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized boolean inProgress() {

    /**
     * Indicates whether or not the inform request is in progress.
     * @return <CODE>true</CODE> if the inform request is in progress, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized boolean isAborted() {

    /**
     * Indicates whether or not the inform request was aborted.
     * @return <CODE>true</CODE> if the inform request was aborted, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getRequestStatus() {

    /**
     * Gets the current status of the inform request.
     * @return The current status of the inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized InetAddress getAddress() {

    /**
     * Gets the destination address of the current inform request.
     * @return The destination address.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getRequestId () {

    /**
     * Gets the request id (invoke identifier) of the current inform request.
     * @return The request id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    SnmpInformRequest(SnmpSession session,
                      SnmpAdaptorServer adp,
                      InetAddress addr,
                      String cs,
                      int p,
                      SnmpInformHandler requestCB)

    /**
     * For SNMP Runtime internal use only.
     * Constructor for creating new inform request. This object can be created only by an SNMP adaptor object.
     * @param session <CODE>SnmpSession</CODE> object for this inform request.
     * @param adp <CODE>SnmpAdaptorServer</CODE> object for this inform request.
     * @param addr The <CODE>InetAddress</CODE> destination for this inform request.
     * @param cs The community string to be used for the inform request.
     * @param requestCB Callback interface for the inform request.
     * @exception SnmpStatusException SNMP adaptor is not ONLINE or session is dead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int requestId = 0;

    /**
     * The request ID for an active inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int reqState = stNeverUsed;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int timeout = 3 * 1000; // 3 seconds.

    /**
     * Timeout.
     * The default amount of time is 3000 millisec.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int numTries = 0;

    /**
     * Number of tries performed for the current polling operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stNeverUsed                 = (stBase << 8);

    /**
     * Status of an inform request: request never used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stResultsAvailable  = (stBase << 7);

    /**
     * Status of an inform request: result available for the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stInternalError     = (stBase << 6);

    /**
     * Status of an inform request: internal error occured.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stTimeout                   = (stBase << 5);

    /**
     * Status of an inform request: timeout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stAborted                   = (stBase << 4);

    /**
     * Status of an inform request: request aborted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stReceivedReply     = (stBase << 3) | stInProgress;

    /**
     * Status of an inform request: reply received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stWaitingForReply   = (stBase << 2) | stInProgress;

    /**
     * Status of an inform request: waiting for reply.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stWaitingToSend     = (stBase << 1) | stInProgress;

    /**
     * Status of an inform request: waiting to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stInProgress                = stBase;

    /**
     * Status of an inform request: in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static private int stBase             = 1;

    /**
     * Base status of an inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    //private SnmpPduRequest responsePdu;

    /**
     * The inform response PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    //private SnmpPduPacket requestPdu;

    /**
     * The inform request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private SnmpInformHandler callback = null;

    /**
     * The user implementation of the callback interface for this request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private transient SnmpSession informSession;

    /**
     * The session object associated with this inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private transient SnmpAdaptorServer adaptor;

    /**
     * The SNMP adaptor associated with this inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    int errorIndex = 0;

    /**
     * The index in <CODE>SnmpVarBindList</CODE> that caused the exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    int errorStatus = 0;

    /**
     * The error status associated with the inform response packet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private SnmpVarBindList varBindList = null;

    /**
     * This contains a list of <CODE>SnmpVarBind</CODE> objects for making the SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private static SnmpRequestCounter requestCounter = new SnmpRequestCounter();

    /**
     * This object maintains a global counter for the inform request ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
public class SnmpInformRequest implements SnmpDefinitions {

/**
 * This class is used by the {@link com.sun.jmx.snmp.daemon.SnmpAdaptorServer SNMP adaptor server} to send inform requests
 * to an SNMP manager and receive inform responses.
 * <P>
 * This class provides basic functions that enable you to fire inform requests,
 * handle retries, timeouts, and process responses from the manager.
 * <BR>
 * The SNMP adaptor server specifies the destination of the inform request and controls
 * the size of a single inform request/response to fit into its <CODE>bufferSize</CODE>.
 * It specifies the maximum number of tries and the timeout to be used for the inform requests.
 * It also provides resources such as the authentication mechanism (using its PDU factory),
 * controlling all inform requests created by it, and finally the inform response to the user.
 * <P>
 * Each inform request, when ready to be sent, is assigned a unique identifier which helps
 * in identifying the inform request with matching inform responses to the protocol engine
 * lying transparently underneath. The engine does the job of retrying the inform requests
 * when the timer expires and calls the SNMP adaptor server when a timeout occurs after exhausting
 * the maximum number of tries.
 * <P>
 * The inform request object provides the method, {@link #waitForCompletion waitForCompletion(long time)},
 * which enables a user to operate in a synchronous mode with an inform request.
 * This is done by blocking the user thread for the desired time interval.
 * The user thread gets notified whenever a request reaches completion, independently of the status of the response.
 * <P>
 * If an {@link com.sun.jmx.snmp.daemon.SnmpInformHandler inform callback} is provided when sending the inform request,
 * the user operates in an asynchronous mode with the inform request. The user thread is not blocked
 * and the specific inform callback implementation provided by the user is invoked when the inform response is received.
 *
 * <P>
 * <B>Note:</B>
 * <BR>From RFC 1905, the SNMP inform request is defined as a request generated and transmitted
 * by an SNMPv2 entity acting in a manager role to another SNMPv2 entity also acting in a manager role.
 * The mechanisms to implement this behaviour are defined in the SNMP manager API.
 * <BR>
 * Nevertheless, this feature has derived and in some documentations, the inform request appears
 * like an SNMPv2 trap that gets responded.
 * <BR>The <CODE>SnmpInformRequest</CODE> class is used to fullfill this latter case.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    @Override

    /**
     * Gives a status report of the request.
     * @return The status report of the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setRequestStatus(int reqst) {

    /**
     * Sets the request status to the specified value.
     * @param reqst The new status request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    static String statusDescription(int state) {

    /**
     * Returns the string state corresponding to the specified integer state.
     * @param state The integer state.
     * @return The string state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    long timeRemainingForAction(long currtime) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void initNewRequest() {

    /**
     * Initializes the request id from the request counter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final  void setRequestSentTime(long sendtime) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setPrevPollTime(long prev) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setErrorStatusAndIndex(int stat, int idx) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setVarBindList(SnmpVarBindList newvblst) {

    /**
     * For SNMP Runtime internal use only.
     * You should specify the <CODE>SnmpVarBindList</CODE> at SnmpInformRequest creation time.
     * You cannot modify it during the life-time of the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized SnmpVarBindList getVarBindList() {

    /**
     * For SNMP Runtime internal use only.
     * Gets the active <CODE>SnmpVarBindList</CODE>. The contents of it
     * are not guaranteed to be consistent when the inform request is active.
     * @return The list of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void stopRequest() {

    /**
     * This method cancels an active inform request and removes it from the polling list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final void invokeOnResponse(Object resp) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleInternalError(String msg) {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleError(String msg) {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleTimeout() {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void handleSuccess() {

    /**
     * Calls the user implementation of the <CODE>SnmpInformHandler</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized void parsePduPacket(SnmpPduRequestType rpdu) {

    /**
     * Parses the inform response packet. If the agent responds with error set,
     * it does not parse any further.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final void processResponse() {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final void sendPduPacket(byte[] buffer, int length) throws java.io.IOException {

    /**
     * Sends the prepared PDU packet to the manager and updates the data structure
     * to expect a response. It acquires a lock on the socket to prevent a case
     * where a response arrives before this thread could insert the
     * request into the wait queue.
     * @exception IOException Signals that an I/O exception of some sort has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized SnmpPdu constructPduPacket() {

    /**
     * Constructs an inform request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    void action() {

    /**
     * This method determines whether the inform request is to be retried. This is used if the
     * peer did not respond to a previous request. If the request exceeds
     * the maxTries limit, a timeout is signaled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private void schedulePoll() {

    /**
     * This method creates a new request ID. The ID is submitted to the poll server for scheduling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private synchronized void startRequest(long starttime) {

    /**
     * This method submits the inform request for polling and marks the request
     * active. It does nothing if the request is already active.
     * The poll will be scheduled to happen immediately.
     * @param starttime The start time for polling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized void start(SnmpVarBindList vblst) throws SnmpStatusException {

    /**
     * For SNMP Runtime internal use only.
     * Starts an inform request in asynchronous mode. The callback interface
     * is used to notify the user upon request completion.
     * @param vblst The list of <CODE>SnmpVarBind</CODE> to be used.
     * @exception SnmpStatusException This inform request is already in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    public static String snmpErrorToString(int errcode) {

    /**
     * Returns the <CODE>String</CODE> representation of an error code.
     * @param errcode The error code as an integer.
     * @return The error code as a <CODE>String</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpInformRequest</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Sets all the references to this SNMP inform request object to <CODE>null</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized void notifyClient() {

    /**
     * Notifies the registered client about the completion of an operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public void cancelRequest() {

    /**
     * Cancels the active inform request and removes itself from the polling list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public boolean waitForCompletion(long time) {

    /**
     * Used in synchronous mode only.
     * Provides a hook that enables a synchronous operation on a previously sent inform request.
     * Only one inform request can be in synchronous mode on a given thread.
     * The blocked thread is notified when the inform request state reaches completion.
     * If the inform request is not active, the method returns immediately.
     * The user must get the error status of the inform request to determine the
     * exact status of the request.
     *
     * @param time The amount of time to wait. Zero means block until complete.
     * @return <CODE>true</CODE> if the inform request has completed, <CODE>false</CODE> if it is still active.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    public final synchronized SnmpVarBindList getResponseVarBindList() {

    /**
     * Gets the <CODE>SnmpVarBindList</CODE> of the inform response.
     * It returns a null value if the inform request is in progress.
     * This ensures accidental manipulation does not occur when a request is in progress.
     * In case of an error, <CODE>SnmpVarBindList</CODE> is the copy
     * of the original <CODE>SnmpVarBindList</CODE> at the time of making the inform request.
     * @return The list of <CODE>SnmpVarBind</CODE> objects returned by the manager or the null value if the request
     * is in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized long getAbsMaxTimeToWait() {

    /**
     * Gets absolute time in milliseconds (based on epoch time) before which an inform
     * response is expected from a manager.
     * @return The absolute time within which an inform response is expected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized long getAbsNextPollTime () {

    /**
     * Gets absolute time in milliseconds (based on epoch time) when the next
     * polling activity will begin.
     * @return The absolute time when polling will begin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final synchronized void setTimeout(int value) {

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getNumTries() {

    /**
     * Gets the number of tries performed for the current inform request.
     * @return The number of tries performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public int getMaxTries() {

    /**
     * Gets the maximum number of tries before declaring that the manager is not responding.
     * @return The maximum number of times an inform request should be tried.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getErrorIndex() {

    /**
     * Gets the index.
     * <P>NOTE: this value is equal to the <CODE>errorIndex</CODE> field minus 1.
     * @return The error index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getErrorStatus() {

    /**
     * Gets the status associated with the <CODE>SnmpVarBindList</CODE>.
     * @return The error status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized boolean isResultAvailable() {

    /**
     * Indicates whether or not the inform request result is available.
     * @return <CODE>true</CODE> if the inform request result is available, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized boolean inProgress() {

    /**
     * Indicates whether or not the inform request is in progress.
     * @return <CODE>true</CODE> if the inform request is in progress, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized boolean isAborted() {

    /**
     * Indicates whether or not the inform request was aborted.
     * @return <CODE>true</CODE> if the inform request was aborted, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getRequestStatus() {

    /**
     * Gets the current status of the inform request.
     * @return The current status of the inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    synchronized InetAddress getAddress() {

    /**
     * Gets the destination address of the current inform request.
     * @return The destination address.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final public synchronized int getRequestId () {

    /**
     * Gets the request id (invoke identifier) of the current inform request.
     * @return The request id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    SnmpInformRequest(SnmpSession session,
                      SnmpAdaptorServer adp,
                      InetAddress addr,
                      String cs,
                      int p,
                      SnmpInformHandler requestCB)

    /**
     * For SNMP Runtime internal use only.
     * Constructor for creating new inform request. This object can be created only by an SNMP adaptor object.
     * @param session <CODE>SnmpSession</CODE> object for this inform request.
     * @param adp <CODE>SnmpAdaptorServer</CODE> object for this inform request.
     * @param addr The <CODE>InetAddress</CODE> destination for this inform request.
     * @param cs The community string to be used for the inform request.
     * @param requestCB Callback interface for the inform request.
     * @exception SnmpStatusException SNMP adaptor is not ONLINE or session is dead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int requestId = 0;

    /**
     * The request ID for an active inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int reqState = stNeverUsed;

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int timeout = 3 * 1000; // 3 seconds.

    /**
     * Timeout.
     * The default amount of time is 3000 millisec.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private int numTries = 0;

    /**
     * Number of tries performed for the current polling operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stNeverUsed                 = (stBase << 8);

    /**
     * Status of an inform request: request never used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stResultsAvailable  = (stBase << 7);

    /**
     * Status of an inform request: result available for the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stInternalError     = (stBase << 6);

    /**
     * Status of an inform request: internal error occured.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stTimeout                   = (stBase << 5);

    /**
     * Status of an inform request: timeout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stAborted                   = (stBase << 4);

    /**
     * Status of an inform request: request aborted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stReceivedReply     = (stBase << 3) | stInProgress;

    /**
     * Status of an inform request: reply received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stWaitingForReply   = (stBase << 2) | stInProgress;

    /**
     * Status of an inform request: waiting for reply.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stWaitingToSend     = (stBase << 1) | stInProgress;

    /**
     * Status of an inform request: waiting to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static public int stInProgress                = stBase;

    /**
     * Status of an inform request: in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    final static private int stBase             = 1;

    /**
     * Base status of an inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    //private SnmpPduRequest responsePdu;

    /**
     * The inform response PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    //private SnmpPduPacket requestPdu;

    /**
     * The inform request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private SnmpInformHandler callback = null;

    /**
     * The user implementation of the callback interface for this request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private transient SnmpSession informSession;

    /**
     * The session object associated with this inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private transient SnmpAdaptorServer adaptor;

    /**
     * The SNMP adaptor associated with this inform request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    int errorIndex = 0;

    /**
     * The index in <CODE>SnmpVarBindList</CODE> that caused the exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    int errorStatus = 0;

    /**
     * The error status associated with the inform response packet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private SnmpVarBindList varBindList = null;

    /**
     * This contains a list of <CODE>SnmpVarBind</CODE> objects for making the SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
    private static SnmpRequestCounter requestCounter = new SnmpRequestCounter();

    /**
     * This object maintains a global counter for the inform request ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpInformRequest.java
public class SnmpInformRequest implements SnmpDefinitions {

/**
 * This class is used by the {@link com.sun.jmx.snmp.daemon.SnmpAdaptorServer SNMP adaptor server} to send inform requests
 * to an SNMP manager and receive inform responses.
 * <P>
 * This class provides basic functions that enable you to fire inform requests,
 * handle retries, timeouts, and process responses from the manager.
 * <BR>
 * The SNMP adaptor server specifies the destination of the inform request and controls
 * the size of a single inform request/response to fit into its <CODE>bufferSize</CODE>.
 * It specifies the maximum number of tries and the timeout to be used for the inform requests.
 * It also provides resources such as the authentication mechanism (using its PDU factory),
 * controlling all inform requests created by it, and finally the inform response to the user.
 * <P>
 * Each inform request, when ready to be sent, is assigned a unique identifier which helps
 * in identifying the inform request with matching inform responses to the protocol engine
 * lying transparently underneath. The engine does the job of retrying the inform requests
 * when the timer expires and calls the SNMP adaptor server when a timeout occurs after exhausting
 * the maximum number of tries.
 * <P>
 * The inform request object provides the method, {@link #waitForCompletion waitForCompletion(long time)},
 * which enables a user to operate in a synchronous mode with an inform request.
 * This is done by blocking the user thread for the desired time interval.
 * The user thread gets notified whenever a request reaches completion, independently of the status of the response.
 * <P>
 * If an {@link com.sun.jmx.snmp.daemon.SnmpInformHandler inform callback} is provided when sending the inform request,
 * the user operates in an asynchronous mode with the inform request. The user thread is not blocked
 * and the specific inform callback implementation provided by the user is invoked when the inform response is received.
 *
 * <P>
 * <B>Note:</B>
 * <BR>From RFC 1905, the SNMP inform request is defined as a request generated and transmitted
 * by an SNMPv2 entity acting in a manager role to another SNMPv2 entity also acting in a manager role.
 * The mechanisms to implement this behaviour are defined in the SNMP manager API.
 * <BR>
 * Nevertheless, this feature has derived and in some documentations, the inform request appears
 * like an SNMPv2 trap that gets responded.
 * <BR>The <CODE>SnmpInformRequest</CODE> class is used to fullfill this latter case.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
