_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    private   SnmpPdu reqPdu = null;

    /**
     * The SnmpPdu that will be passed to the request.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    private   SnmpMibRequest mibRequest = null;

    /**
     * The SnmpMibRequest that will be passed to the agent.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected Object data;

    /**
     * Contextual object allocated by the SnmpUserDataFactory.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int[] translation;

    /**
     * The array giving the index translation between the content of
     * <VAR>varBind</VAR> and the varbind list as specified in the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected Vector<SnmpVarBind> varBind;

    /**
     * The varbind list specific to the current sub request.
     * The vector must contain object of type SnmpVarBind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int errorIndex= -1;

    /**
     * Index of error.
     * A value of -1 means no error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int errorStatus= snmpRspNoError;

    /**
     * Error status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpMibAgent agent;

    /**
     * Agent directly handled by the sub-request handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int type= 0;

    /**
     * Store the operation type. Remember if the type is Walk, it means
     * that we have to invoke the check method ...
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int version= snmpVersionOne;

    /**
     * Store the protocol version to handle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected void updateResult(SnmpVarBind[] result) {

    /**
     * The method updates a given var bind list with the result of a
     * previsouly invoked operation.
     * Prior to calling the method, one must make sure that the operation was
     * successful. As such the method getErrorIndex or getErrorStatus should be
     * called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected  void updateRequest(SnmpVarBind var, int pos) {

    /**
     * The method updates the varbind list of the subrequest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int getErrorIndex() {

    /**
     * The method returns the error index as a position in the var bind list.
     * The value returned by the method corresponds to the index in the original
     * var bind list as received by the SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int getErrorStatus() {

    /**
     * The method returns the error status of the operation.
     * The method takes into account the protocol version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    @SuppressWarnings("unchecked")  // cast to NonSyncVector<SnmpVarBind>

    /**
     * SNMP V1/V2 The constructor initialize the subrequest with the whole varbind list contained
     * in the original request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpSubRequestHandler(SnmpMibAgent agent, SnmpPdu req) {

    /**
     * SNMP V1/V2 . To be called with updateRequest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpSubRequestHandler(SnmpEngine engine,
                                    SnmpIncomingRequest incRequest,
                                    SnmpMibAgent agent,
                                    SnmpPdu req,
                                    boolean nouse) {

    /**
     * V3 enabled Adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpSubRequestHandler(SnmpEngine engine,
                                    SnmpIncomingRequest incRequest,
                                    SnmpMibAgent agent,
                                    SnmpPdu req) {

    /**
     * V3 enabled Adaptor. Each Oid is added using updateRequest method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    private   SnmpPdu reqPdu = null;

    /**
     * The SnmpPdu that will be passed to the request.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    private   SnmpMibRequest mibRequest = null;

    /**
     * The SnmpMibRequest that will be passed to the agent.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected Object data;

    /**
     * Contextual object allocated by the SnmpUserDataFactory.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int[] translation;

    /**
     * The array giving the index translation between the content of
     * <VAR>varBind</VAR> and the varbind list as specified in the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected Vector<SnmpVarBind> varBind;

    /**
     * The varbind list specific to the current sub request.
     * The vector must contain object of type SnmpVarBind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int errorIndex= -1;

    /**
     * Index of error.
     * A value of -1 means no error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int errorStatus= snmpRspNoError;

    /**
     * Error status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpMibAgent agent;

    /**
     * Agent directly handled by the sub-request handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int type= 0;

    /**
     * Store the operation type. Remember if the type is Walk, it means
     * that we have to invoke the check method ...
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int version= snmpVersionOne;

    /**
     * Store the protocol version to handle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected void updateResult(SnmpVarBind[] result) {

    /**
     * The method updates a given var bind list with the result of a
     * previsouly invoked operation.
     * Prior to calling the method, one must make sure that the operation was
     * successful. As such the method getErrorIndex or getErrorStatus should be
     * called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected  void updateRequest(SnmpVarBind var, int pos) {

    /**
     * The method updates the varbind list of the subrequest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int getErrorIndex() {

    /**
     * The method returns the error index as a position in the var bind list.
     * The value returned by the method corresponds to the index in the original
     * var bind list as received by the SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected int getErrorStatus() {

    /**
     * The method returns the error status of the operation.
     * The method takes into account the protocol version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    @SuppressWarnings("unchecked")  // cast to NonSyncVector<SnmpVarBind>

    /**
     * SNMP V1/V2 The constructor initialize the subrequest with the whole varbind list contained
     * in the original request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpSubRequestHandler(SnmpMibAgent agent, SnmpPdu req) {

    /**
     * SNMP V1/V2 . To be called with updateRequest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpSubRequestHandler(SnmpEngine engine,
                                    SnmpIncomingRequest incRequest,
                                    SnmpMibAgent agent,
                                    SnmpPdu req,
                                    boolean nouse) {

    /**
     * V3 enabled Adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpSubRequestHandler.java
    protected SnmpSubRequestHandler(SnmpEngine engine,
                                    SnmpIncomingRequest incRequest,
                                    SnmpMibAgent agent,
                                    SnmpPdu req) {

    /**
     * V3 enabled Adaptor. Each Oid is added using updateRequest method.
     */
