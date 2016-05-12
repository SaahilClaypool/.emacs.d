_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private void splitBulkRequest(SnmpPduBulk req,
                                  int nonRepeaters,
                                  int maxRepetitions,
                                  int R) {

    /**
     * The method takes the incoming get bulk requests and split it into
     * subrequests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private void splitRequest(SnmpPduRequest req) {

    /**
     * The method takes the incoming requests and split it into subrequests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduRequest newErrorResponsePdu(SnmpPduPacket req,int s,int i) {

    /**
     * Make a response pdu with the specified error status and index.
     * NOTE: the response pdu share its varBindList with the request pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduRequest newValidResponsePdu(SnmpPduPacket reqPdu,
                                               SnmpVarBind[] varBindList) {

    /**
     * Make a response pdu with the specified error status and index.
     * NOTE: the response pdu share its varBindList with the request pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket checkAcl(SnmpPduPacket pdu) {

    /**
     * Check if the specified pdu is conform to the ACL.
     * This method returns null if the pdu is ok. If not, it returns
     * the response pdu to be replied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private boolean checkPduType(SnmpPduPacket pdu) {

    /**
     * Check the type of the pdu: only the get/set/bulk request
     * are accepted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket makeGetBulkResponsePdu(SnmpPduBulk req,
                                                 Object userData) {

    /**
     * Here we make the response pdu for a bulk request.
     * At this level, the result is never null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket turboProcessingGetSet(SnmpPduRequest req,
                                                Object userData) {

    /**
     * Optimize when there is only one sub request
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket executeSubRequest(SnmpPduPacket req,
                                            Object userData) {

    /**
     * The method runs all the sub-requests associated to the current
     * instance of SnmpRequestHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket makeGetSetResponsePdu(SnmpPduRequest req,
                                                Object userData) {

    /**
     * Here we make the response pdu from a get/set request pdu.
     * At this level, the result is never null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket makeResponsePdu(SnmpPduPacket reqPdu,
                                          Object userData) {

    /**
     * Here we make a response pdu from a request pdu.
     * We return null if there is no pdu to reply.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpMessage makeResponseMessage(SnmpMessage reqMsg) {

    /**
     * Here we make a response message from a request message.
     * We return null if there is no message to reply.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private DatagramPacket makeResponsePacket(DatagramPacket reqPacket) {

    /**
     * Here we make a response packet from a request packet.
     * We return null if there no response packet to sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    @Override

    /**
     * Treat the request available in 'packet' and send the result
     * back to the client.
     * Note: we overwrite 'packet' with the response bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    public SnmpRequestHandler(SnmpAdaptorServer server, int id,
                              DatagramSocket s, DatagramPacket p,
                              SnmpMibTree tree, Vector<SnmpMibAgent> m,
                              InetAddressAcl a,
                              SnmpPduFactory factory,
                              SnmpUserDataFactory dataFactory,
                              MBeanServer f, ObjectName n)

    /**
     * Full constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private transient SnmpMibTree root;

    /**
     * Reference on the MIBS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private transient Hashtable<SnmpMibAgent, SnmpSubRequestHandler> subs = null;

    /**
     * Contains the list of sub-requests associated to the current request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private void splitBulkRequest(SnmpPduBulk req,
                                  int nonRepeaters,
                                  int maxRepetitions,
                                  int R) {

    /**
     * The method takes the incoming get bulk requests and split it into
     * subrequests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private void splitRequest(SnmpPduRequest req) {

    /**
     * The method takes the incoming requests and split it into subrequests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduRequest newErrorResponsePdu(SnmpPduPacket req,int s,int i) {

    /**
     * Make a response pdu with the specified error status and index.
     * NOTE: the response pdu share its varBindList with the request pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduRequest newValidResponsePdu(SnmpPduPacket reqPdu,
                                               SnmpVarBind[] varBindList) {

    /**
     * Make a response pdu with the specified error status and index.
     * NOTE: the response pdu share its varBindList with the request pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket checkAcl(SnmpPduPacket pdu) {

    /**
     * Check if the specified pdu is conform to the ACL.
     * This method returns null if the pdu is ok. If not, it returns
     * the response pdu to be replied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private boolean checkPduType(SnmpPduPacket pdu) {

    /**
     * Check the type of the pdu: only the get/set/bulk request
     * are accepted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket makeGetBulkResponsePdu(SnmpPduBulk req,
                                                 Object userData) {

    /**
     * Here we make the response pdu for a bulk request.
     * At this level, the result is never null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket turboProcessingGetSet(SnmpPduRequest req,
                                                Object userData) {

    /**
     * Optimize when there is only one sub request
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket executeSubRequest(SnmpPduPacket req,
                                            Object userData) {

    /**
     * The method runs all the sub-requests associated to the current
     * instance of SnmpRequestHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket makeGetSetResponsePdu(SnmpPduRequest req,
                                                Object userData) {

    /**
     * Here we make the response pdu from a get/set request pdu.
     * At this level, the result is never null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpPduPacket makeResponsePdu(SnmpPduPacket reqPdu,
                                          Object userData) {

    /**
     * Here we make a response pdu from a request pdu.
     * We return null if there is no pdu to reply.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private SnmpMessage makeResponseMessage(SnmpMessage reqMsg) {

    /**
     * Here we make a response message from a request message.
     * We return null if there is no message to reply.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private DatagramPacket makeResponsePacket(DatagramPacket reqPacket) {

    /**
     * Here we make a response packet from a request packet.
     * We return null if there no response packet to sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    @Override

    /**
     * Treat the request available in 'packet' and send the result
     * back to the client.
     * Note: we overwrite 'packet' with the response bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    public SnmpRequestHandler(SnmpAdaptorServer server, int id,
                              DatagramSocket s, DatagramPacket p,
                              SnmpMibTree tree, Vector<SnmpMibAgent> m,
                              InetAddressAcl a,
                              SnmpPduFactory factory,
                              SnmpUserDataFactory dataFactory,
                              MBeanServer f, ObjectName n)

    /**
     * Full constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private transient SnmpMibTree root;

    /**
     * Reference on the MIBS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpRequestHandler.java
    private transient Hashtable<SnmpMibAgent, SnmpSubRequestHandler> subs = null;

    /**
     * Contains the list of sub-requests associated to the current request.
     */
