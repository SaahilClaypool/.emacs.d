_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpUserDataFactory.java
    public void releaseUserData(Object userData, SnmpPdu responsePdu)

    /**
     * Called by the <CODE>SnmpAdaptorServer</CODE> adaptor.
     * Release a previously allocated contextual object containing user-data.
     * This method is called just before the responsePdu is sent back to the
     * manager. It gives the user a chance to alter the responsePdu packet
     * before it is encoded, and to free any resources that might have
     * been allocated when creating the contextual object.
     *
     * @param userData The contextual object being released.
     * @param responsePdu The SnmpPduPacket that will be sent back to the
     *        SNMP manager.
     *        <b>This parameter is owned by the SNMP framework and must be
     *        considered as transient.</b> If you wish to keep some of its
     *        content after this method returns you should clone that
     *        information.
     *
     * @exception SnmpStatusException If an SnmpStatusException is thrown,
     *            the responsePdu is dropped and nothing is returned to
     *            to the manager.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpUserDataFactory.java
public interface SnmpUserDataFactory {

/**
 * This interface is provided to enable fine customization of the SNMP
 * agent behaviour.
 *
 * <p>You will not need to implement this interface except if your agent
 * needs extra customization requiring some contextual information.</p>
 *
 * <p>If an SnmpUserDataFactory is set on the SnmpAdaptorServer, then a new
 * object containing user-data will be allocated through this factory
 * for each incoming request. This object will be passed along to
 * the SnmpMibAgent within SnmpMibRequest objects. By default, no
 * SnmpUserDataFactory is set on the SnmpAdaptorServer, and the contextual
 * object passed to SnmpMibAgent is null.</p>
 *
 * <p>You can use this feature to obtain on contextual information
 * (such as community string etc...) or to implement a caching
 * mechanism, or for whatever purpose might be required by your specific
 * agent implementation.</p>
 *
 * <p>The sequence <code>allocateUserData() / releaseUserData()</code> can
 * also be used to implement a caching mechanism:
 * <ul>
 * <li><code>allocateUserData()</code> could be used to allocate
 *         some cache space,</li>
 * <li>and <code>releaseUserData()</code> could be used to flush it.</li>
 * </ul></p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.agent.SnmpMibRequest
 * @see com.sun.jmx.snmp.agent.SnmpMibAgent
 * @see com.sun.jmx.snmp.daemon.SnmpAdaptorServer
 *
 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpUserDataFactory.java
    public void releaseUserData(Object userData, SnmpPdu responsePdu)

    /**
     * Called by the <CODE>SnmpAdaptorServer</CODE> adaptor.
     * Release a previously allocated contextual object containing user-data.
     * This method is called just before the responsePdu is sent back to the
     * manager. It gives the user a chance to alter the responsePdu packet
     * before it is encoded, and to free any resources that might have
     * been allocated when creating the contextual object.
     *
     * @param userData The contextual object being released.
     * @param responsePdu The SnmpPduPacket that will be sent back to the
     *        SNMP manager.
     *        <b>This parameter is owned by the SNMP framework and must be
     *        considered as transient.</b> If you wish to keep some of its
     *        content after this method returns you should clone that
     *        information.
     *
     * @exception SnmpStatusException If an SnmpStatusException is thrown,
     *            the responsePdu is dropped and nothing is returned to
     *            to the manager.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpUserDataFactory.java
public interface SnmpUserDataFactory {

/**
 * This interface is provided to enable fine customization of the SNMP
 * agent behaviour.
 *
 * <p>You will not need to implement this interface except if your agent
 * needs extra customization requiring some contextual information.</p>
 *
 * <p>If an SnmpUserDataFactory is set on the SnmpAdaptorServer, then a new
 * object containing user-data will be allocated through this factory
 * for each incoming request. This object will be passed along to
 * the SnmpMibAgent within SnmpMibRequest objects. By default, no
 * SnmpUserDataFactory is set on the SnmpAdaptorServer, and the contextual
 * object passed to SnmpMibAgent is null.</p>
 *
 * <p>You can use this feature to obtain on contextual information
 * (such as community string etc...) or to implement a caching
 * mechanism, or for whatever purpose might be required by your specific
 * agent implementation.</p>
 *
 * <p>The sequence <code>allocateUserData() / releaseUserData()</code> can
 * also be used to implement a caching mechanism:
 * <ul>
 * <li><code>allocateUserData()</code> could be used to allocate
 *         some cache space,</li>
 * <li>and <code>releaseUserData()</code> could be used to flush it.</li>
 * </ul></p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.agent.SnmpMibRequest
 * @see com.sun.jmx.snmp.agent.SnmpMibAgent
 * @see com.sun.jmx.snmp.daemon.SnmpAdaptorServer
 *
 **/
