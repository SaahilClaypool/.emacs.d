_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request context name used by Access Control Model in order to allow or deny the access to OIDs. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The checked context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request context name. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The context name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request security model. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise -1 is returned.
     * @return The security model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request security level. This level is defined in {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise -1 is returned.
     * @return The security level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request principal. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The request principal.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Returns the local engine. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return the local engine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    public SnmpMibRequestImpl(SnmpEngine engine,
                              SnmpPdu reqPdu,
                              Vector<SnmpVarBind> vblist,
                              int protocolVersion,
                              Object userData,
                              String principal,
                              int securityLevel,
                              int securityModel,
                              byte[] contextName,
                              byte[] accessContextName) {

    /**
     * @param engine The local engine.
     * @param reqPdu The received pdu.
     * @param vblist The vector of SnmpVarBind objects in which the
     *        MIB concerned by this request is involved.
     * @param protocolVersion  The protocol version of the SNMP request.
     * @param userData     User allocated contextual data. This object must
     *        be allocated on a per SNMP request basis through the
     *        SnmpUserDataFactory registered with the SnmpAdaptorServer,
     *        and is handed back to the user through SnmpMibRequest objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
final class SnmpMibRequestImpl implements SnmpMibRequest {

/**
 * This class implements the SnmpMibRequest interface.
 * It represents the part of a SNMP request that involves a specific
 * MIB. One instance of this class will be created for every MIB
 * involved in a SNMP request, and will be passed to the SnmpMibAgent
 * in charge of handling that MIB.
 *
 * Instances of this class are allocated by the SNMP engine. You will
 * never need to use this class directly. You will only access
 * instances of this class through their SnmpMibRequest interface.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request context name used by Access Control Model in order to allow or deny the access to OIDs. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The checked context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request context name. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The context name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request security model. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise -1 is returned.
     * @return The security model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request security level. This level is defined in {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise -1 is returned.
     * @return The security level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Gets the incoming request principal. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The request principal.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    @Override

    /**
     * Returns the local engine. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return the local engine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
    public SnmpMibRequestImpl(SnmpEngine engine,
                              SnmpPdu reqPdu,
                              Vector<SnmpVarBind> vblist,
                              int protocolVersion,
                              Object userData,
                              String principal,
                              int securityLevel,
                              int securityModel,
                              byte[] contextName,
                              byte[] accessContextName) {

    /**
     * @param engine The local engine.
     * @param reqPdu The received pdu.
     * @param vblist The vector of SnmpVarBind objects in which the
     *        MIB concerned by this request is involved.
     * @param protocolVersion  The protocol version of the SNMP request.
     * @param userData     User allocated contextual data. This object must
     *        be allocated on a per SNMP request basis through the
     *        SnmpUserDataFactory registered with the SnmpAdaptorServer,
     *        and is handed back to the user through SnmpMibRequest objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequestImpl.java
final class SnmpMibRequestImpl implements SnmpMibRequest {

/**
 * This class implements the SnmpMibRequest interface.
 * It represents the part of a SNMP request that involves a specific
 * MIB. One instance of this class will be created for every MIB
 * involved in a SNMP request, and will be passed to the SnmpMibAgent
 * in charge of handling that MIB.
 *
 * Instances of this class are allocated by the SNMP engine. You will
 * never need to use this class directly. You will only access
 * instances of this class through their SnmpMibRequest interface.
 *
 */
