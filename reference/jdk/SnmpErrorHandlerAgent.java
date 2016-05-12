_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>getBulk</CODE> operation. It will throw an exception if the request is a V1 one or it will set exceptions within the list for V2 ones.
     *
     * @param inRequest The SnmpMibRequest object holding the list of variable to be retrieved.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>getNext</CODE> operation. It will throw an exception for V1 requests or it will set exceptions within the list for V2 requests..
     *
     * @param inRequest The SnmpMibRequest object holding the list of variables to be retrieved.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>set</CODE> operation. Should never be called (check previously called having failed).
     *
     * @param inRequest The SnmpMibRequest object holding the list of variable to be set.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation can not be performed, the method should emit a
     * <CODE>SnmpStatusException</CODE>.
     *
     * @param inRequest The SnmpMibRequest object holding the list of variables to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException The <CODE>set</CODE> operation
     *    cannot be performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>get</CODE> operation. It will throw an exception for V1 requests or it will set exceptions within the list for V2 requests.
     *
     * @param inRequest The SnmpMibRequest object holding the list of variable to be retrieved.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Gets the root object identifier of the MIB.
     * <P>The root object identifier is the object identifier uniquely
     * identifying the MIB.
     *
     * @return The returned oid is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Initializes the MIB but each single MBean representing the MIB
     * is inserted into the MBean server.
     *
     * @param server The MBean server to register the service with.
     * @param name The object name.
     *
     * @return The passed name parameter.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Initializes the MIB (with no registration of the MBeans into the
     * MBean server). Does nothing.
     *
     * @exception IllegalAccessException The MIB cannot be initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
public class SnmpErrorHandlerAgent extends SnmpMibAgent

/**
 * A simple MIB agent that implements SNMP calls (get, set, getnext and getbulk) in a way that only errors or exceptions are returned. Every call done on this agent fails. Error handling is done according to the manager's SNMP protocol version.
 * <P>It is used by <CODE>SnmpAdaptorServer</CODE> for its default agent behavior. When a received Oid doesn't match, this agent is called to fill the result list with errors.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>getBulk</CODE> operation. It will throw an exception if the request is a V1 one or it will set exceptions within the list for V2 ones.
     *
     * @param inRequest The SnmpMibRequest object holding the list of variable to be retrieved.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>getNext</CODE> operation. It will throw an exception for V1 requests or it will set exceptions within the list for V2 requests..
     *
     * @param inRequest The SnmpMibRequest object holding the list of variables to be retrieved.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>set</CODE> operation. Should never be called (check previously called having failed).
     *
     * @param inRequest The SnmpMibRequest object holding the list of variable to be set.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation can not be performed, the method should emit a
     * <CODE>SnmpStatusException</CODE>.
     *
     * @param inRequest The SnmpMibRequest object holding the list of variables to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException The <CODE>set</CODE> operation
     *    cannot be performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Processes a <CODE>get</CODE> operation. It will throw an exception for V1 requests or it will set exceptions within the list for V2 requests.
     *
     * @param inRequest The SnmpMibRequest object holding the list of variable to be retrieved.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Gets the root object identifier of the MIB.
     * <P>The root object identifier is the object identifier uniquely
     * identifying the MIB.
     *
     * @return The returned oid is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Initializes the MIB but each single MBean representing the MIB
     * is inserted into the MBean server.
     *
     * @param server The MBean server to register the service with.
     * @param name The object name.
     *
     * @return The passed name parameter.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
    @Override

    /**
     * Initializes the MIB (with no registration of the MBeans into the
     * MBean server). Does nothing.
     *
     * @exception IllegalAccessException The MIB cannot be initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpErrorHandlerAgent.java
public class SnmpErrorHandlerAgent extends SnmpMibAgent

/**
 * A simple MIB agent that implements SNMP calls (get, set, getnext and getbulk) in a way that only errors or exceptions are returned. Every call done on this agent fails. Error handling is done according to the manager's SNMP protocol version.
 * <P>It is used by <CODE>SnmpAdaptorServer</CODE> for its default agent behavior. When a received Oid doesn't match, this agent is called to fill the result list with errors.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 *
 */
