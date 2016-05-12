_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getSize();

    /**
     * Returns the number of elements (varbinds) in this request sublist.
     *
     * @return The number of elements in the sublist.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public void addVarBind(SnmpVarBind varbind);

    /**
     * Adds a varbind to this request sublist. This method is used for
     * internal purposes and you should never need to call it directly.
     *
     * @param varbind The varbind to be added in the sublist.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getVarIndex(SnmpVarBind varbind);

    /**
     * Returns the varbind index that should be embedded in an
     * SnmpStatusException for this particular varbind.
     * This does not necessarily correspond to the "real"
     * index value that will be returned in the result PDU.
     *
     * @param varbind The varbind for which the index value is
     *        querried. Note that this varbind <b>must</b> have
     *        been obtained from the enumeration returned by
     *        <CODE>getElements()</CODE>, or from the vector
     *        returned by <CODE>getSublist()</CODE>.
     *
     * @return The varbind index that should be embedded in an
     *         SnmpStatusException for this particular varbind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public Object getUserData();

    /**
     * Returns a handle on a user allocated contextual object.
     * This contextual object is allocated through the SnmpUserDataFactory
     * on a per SNMP request basis, and is handed back to the user via
     * SnmpMibRequest (and derivative) objects. It is never accessed by
     * the system, but might be handed back in multiple threads. It is thus
     * the user responsibility to make sure he handles this object in a
     * thread safe manner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public byte[] getContextName();

    /**
     * Gets the incoming request context name. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The context name.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getSecurityLevel();

    /**
     * Gets the incoming request security level. This level is defined in {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise -1 is returned.
     * @return The security level.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public SnmpEngine getEngine();

    /**
     * Returns the local engine. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return the local engine.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getRequestPduVersion();

    /**
     * Returns the SNMP protocol version of the original request. No translation is done on the version. The actual received request SNMP version is returned.
     *
     * @return The SNMP protocol version of the original request.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getVersion();

    /**
     * Returns the SNMP protocol version of the original request. If SNMP V1 request are received, the version is upgraded to SNMP V2.
     *
     * @return The SNMP protocol version of the original request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public Vector<SnmpVarBind> getSubList();

    /**
     * Returns the vector of varbind to be handled by the SNMP mib node.
     * The caller shall not modify this vector.
     *
     * @return The element of the vector are instances of
     *         {@link com.sun.jmx.snmp.SnmpVarBind}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
public interface SnmpMibRequest {

/**
 * This interface models the part of a SNMP request that involves
 * a specific MIB. One object implementing this interface will be created
 * for every MIB involved in a SNMP request, and that object will be passed
 * to the SnmpMibAgent in charge of handling that MIB.
 *
 * Objects implementing this interface will be allocated by the SNMP engine.
 * You will never need to implement this interface. You will only use it.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getSize();

    /**
     * Returns the number of elements (varbinds) in this request sublist.
     *
     * @return The number of elements in the sublist.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public void addVarBind(SnmpVarBind varbind);

    /**
     * Adds a varbind to this request sublist. This method is used for
     * internal purposes and you should never need to call it directly.
     *
     * @param varbind The varbind to be added in the sublist.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getVarIndex(SnmpVarBind varbind);

    /**
     * Returns the varbind index that should be embedded in an
     * SnmpStatusException for this particular varbind.
     * This does not necessarily correspond to the "real"
     * index value that will be returned in the result PDU.
     *
     * @param varbind The varbind for which the index value is
     *        querried. Note that this varbind <b>must</b> have
     *        been obtained from the enumeration returned by
     *        <CODE>getElements()</CODE>, or from the vector
     *        returned by <CODE>getSublist()</CODE>.
     *
     * @return The varbind index that should be embedded in an
     *         SnmpStatusException for this particular varbind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public Object getUserData();

    /**
     * Returns a handle on a user allocated contextual object.
     * This contextual object is allocated through the SnmpUserDataFactory
     * on a per SNMP request basis, and is handed back to the user via
     * SnmpMibRequest (and derivative) objects. It is never accessed by
     * the system, but might be handed back in multiple threads. It is thus
     * the user responsibility to make sure he handles this object in a
     * thread safe manner.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public byte[] getContextName();

    /**
     * Gets the incoming request context name. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return The context name.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getSecurityLevel();

    /**
     * Gets the incoming request security level. This level is defined in {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise -1 is returned.
     * @return The security level.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public SnmpEngine getEngine();

    /**
     * Returns the local engine. This parameter is returned only if <CODE> SnmpV3AdaptorServer </CODE> is the adaptor receiving this request. Otherwise null is returned.
     * @return the local engine.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getRequestPduVersion();

    /**
     * Returns the SNMP protocol version of the original request. No translation is done on the version. The actual received request SNMP version is returned.
     *
     * @return The SNMP protocol version of the original request.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public int getVersion();

    /**
     * Returns the SNMP protocol version of the original request. If SNMP V1 request are received, the version is upgraded to SNMP V2.
     *
     * @return The SNMP protocol version of the original request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
    public Vector<SnmpVarBind> getSubList();

    /**
     * Returns the vector of varbind to be handled by the SNMP mib node.
     * The caller shall not modify this vector.
     *
     * @return The element of the vector are instances of
     *         {@link com.sun.jmx.snmp.SnmpVarBind}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibRequest.java
public interface SnmpMibRequest {

/**
 * This interface models the part of a SNMP request that involves
 * a specific MIB. One object implementing this interface will be created
 * for every MIB involved in a SNMP request, and that object will be passed
 * to the SnmpMibAgent in charge of handling that MIB.
 *
 * Objects implementing this interface will be allocated by the SNMP engine.
 * You will never need to implement this interface. You will only use it.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
