_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    private transient SnmpMibHandler adaptor;

    /**
     * The reference to the SNMP stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    private ObjectName adaptorName;

    /**
     * The object name of the SNMP protocol adaptor.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    protected MBeanServer server;

    /**
     * The reference to the MBean server.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    protected String mibName;

    /**
     * The object name of the MIB.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    private Vector<SnmpVarBind> splitFrom(Vector<SnmpVarBind> original, int limit) {

    /**
     * This method creates a new Vector which does not contain the first
     * element up to the specified limit.
     *
     * @param original The original vector.
     * @param limit The limit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    void getBulkWithGetNext(SnmpMibRequest req, int nonRepeat, int maxRepeat)

    /**
     * Processes a <CODE>getBulk</CODE> operation using call to
     * <CODE>getNext</CODE>.
     * The method implements the <CODE>getBulk</CODE> operation by calling
     * appropriately the <CODE>getNext</CODE> method.
     *
     * @param req The SnmpMibRequest containing the variable list to be
     *        retrieved.
     *
     * @param nonRepeat The number of variables, starting with the first
     *    variable in the variable-bindings, for which a single lexicographic
     *    successor is requested.
     *
     * @param maxRepeat The number of lexicographic successors
     *    requested for each of the last R variables. R is the number of
     *    variables following the first nonRepeat variables for which
     *    multiple lexicographic successors are requested.
     *
     * @return The variable list containing returned values.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public static SnmpMibRequest newMibRequest(SnmpEngine engine,
                                               SnmpPdu reqPdu,
                                               Vector<SnmpVarBind> vblist,
                                               int version,
                                               Object userData,
                                               String principal,
                                               int securityLevel,
                                               int securityModel,
                                               byte[] contextName,
                                               byte[] accessContextName) {

    /**
     * This is a factory method for creating new SnmpMibRequest objects.
     * @param engine The local engine.
     * @param reqPdu The received pdu.
     * @param vblist The vector of SnmpVarBind objects in which the
     *        MIB concerned by this request is involved.
     * @param version The protocol version of the SNMP request.
     * @param userData User allocated contextual data.
     *
     * @return A new SnmpMibRequest object.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public static SnmpMibRequest newMibRequest(SnmpPdu reqPdu,
                                               Vector<SnmpVarBind> vblist,
                                               int version,
                                               Object userData)

    /**
     * This is a factory method for creating new SnmpMibRequest objects.
     * @param reqPdu The received PDU.
     * @param vblist   The vector of SnmpVarBind objects in which the
     *        MIB concerned by this request is involved.
     * @param version  The protocol version of the SNMP request.
     * @param userData User allocated contextual data.
     *
     * @return A new SnmpMibRequest object.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the MIB name.
     *
     * @return The MIB name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Indicates whether or not the MIB module is bound to a SNMP protocol
     * adaptor.
     * As a reminder, only bound MIBs can be accessed through SNMP protocol
     * adaptor.
     *
     * @return <CODE>true</CODE> if the MIB module is bound,
     *         <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @param oids The set of OIDs this agent implements.
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     * This method is to be called to set a specific agent to a specific OID. This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the OID nearer agent will be used on SNMP operations.
     * @param name The name of the SNMP protocol adaptor.
     * @param oids The set of OIDs this agent implements.
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     *
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the object name of the SNMP protocol adaptor to which the MIB
     * is bound.
     *
     * @return The name of the SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and adds this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @param oids The set of OIDs this agent implements.
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and adds this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

     /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     * This method is to be called to set a specific agent to a specific OID. This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the OID nearest the agent will be used on SNMP operations.
     * @param stack The SNMP MIB handler.
     * @param oids The set of OIDs this agent implements.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the reference to the SNMP protocol adaptor to which the MIB is
     * bound.
     *
     * @return The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the reference to the MBean server in which the SNMP MIB is
     * registered.
     *
     * @return The MBean server or null if the MIB is not registered in any
     *     MBean server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public abstract long[] getRootOid();

    /**
     * Gets the root object identifier of the MIB.
     * <P>The root object identifier is the object identifier uniquely
     * identifying the MIB.
     *
     * @return The root object identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation can not be performed, the method should throw an
     * <CODE>SnmpStatusException</CODE>.
     * This method is called during the first phase of the SET two-phase
     * commit.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException The <CODE>set</CODE> operation
     *    cannot be performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>set</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     * This method is called during the second phase of the SET two-phase
     * commit.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     *            Throwing an exception in this method will break the
     *            atomicity of the SET operation. Care must be taken so that
     *            the exception is thrown in the {@link #check(SnmpMibRequest)}
     *            method instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>getBulk</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @param nonRepeat The number of variables, starting with the first
     *    variable in the variable-bindings, for which a single
     *    lexicographic successor is requested.
     *
     * @param maxRepeat The number of lexicographic successors requested
     *    for each of the last R variables. R is the number of variables
     *    following the first <CODE>nonRepeat</CODE> variables for which
     *    multiple lexicographic successors are requested.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>getNext</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     *
     * @param req The SnmpMibRequest object holding the list of
     *            OIDs from which the next variables should be retrieved.
     *            This list is composed of <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>get</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Initializes the MIB but each single MBean representing the MIB
     * is inserted into the MBean server.
     *
     * @param server The MBean server to register the service with.
     * @param name The object name.
     *
     * @return The name of the SNMP MIB registered.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public abstract void init() throws IllegalAccessException;

    /**
     * Initializes the MIB (with no registration of the MBeans into the
     * MBean server).
     *
     * @exception IllegalAccessException The MIB can not be initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public SnmpMibAgent() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
public abstract class SnmpMibAgent

/**
 * Abstract class for representing an SNMP agent.
 *
 * The class is used by the SNMP protocol adaptor as the entry point in
 * the SNMP agent to query.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    private transient SnmpMibHandler adaptor;

    /**
     * The reference to the SNMP stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    private ObjectName adaptorName;

    /**
     * The object name of the SNMP protocol adaptor.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    protected MBeanServer server;

    /**
     * The reference to the MBean server.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    protected String mibName;

    /**
     * The object name of the MIB.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    private Vector<SnmpVarBind> splitFrom(Vector<SnmpVarBind> original, int limit) {

    /**
     * This method creates a new Vector which does not contain the first
     * element up to the specified limit.
     *
     * @param original The original vector.
     * @param limit The limit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    void getBulkWithGetNext(SnmpMibRequest req, int nonRepeat, int maxRepeat)

    /**
     * Processes a <CODE>getBulk</CODE> operation using call to
     * <CODE>getNext</CODE>.
     * The method implements the <CODE>getBulk</CODE> operation by calling
     * appropriately the <CODE>getNext</CODE> method.
     *
     * @param req The SnmpMibRequest containing the variable list to be
     *        retrieved.
     *
     * @param nonRepeat The number of variables, starting with the first
     *    variable in the variable-bindings, for which a single lexicographic
     *    successor is requested.
     *
     * @param maxRepeat The number of lexicographic successors
     *    requested for each of the last R variables. R is the number of
     *    variables following the first nonRepeat variables for which
     *    multiple lexicographic successors are requested.
     *
     * @return The variable list containing returned values.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public static SnmpMibRequest newMibRequest(SnmpEngine engine,
                                               SnmpPdu reqPdu,
                                               Vector<SnmpVarBind> vblist,
                                               int version,
                                               Object userData,
                                               String principal,
                                               int securityLevel,
                                               int securityModel,
                                               byte[] contextName,
                                               byte[] accessContextName) {

    /**
     * This is a factory method for creating new SnmpMibRequest objects.
     * @param engine The local engine.
     * @param reqPdu The received pdu.
     * @param vblist The vector of SnmpVarBind objects in which the
     *        MIB concerned by this request is involved.
     * @param version The protocol version of the SNMP request.
     * @param userData User allocated contextual data.
     *
     * @return A new SnmpMibRequest object.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public static SnmpMibRequest newMibRequest(SnmpPdu reqPdu,
                                               Vector<SnmpVarBind> vblist,
                                               int version,
                                               Object userData)

    /**
     * This is a factory method for creating new SnmpMibRequest objects.
     * @param reqPdu The received PDU.
     * @param vblist   The vector of SnmpVarBind objects in which the
     *        MIB concerned by this request is involved.
     * @param version  The protocol version of the SNMP request.
     * @param userData User allocated contextual data.
     *
     * @return A new SnmpMibRequest object.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the MIB name.
     *
     * @return The MIB name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Indicates whether or not the MIB module is bound to a SNMP protocol
     * adaptor.
     * As a reminder, only bound MIBs can be accessed through SNMP protocol
     * adaptor.
     *
     * @return <CODE>true</CODE> if the MIB module is bound,
     *         <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @param oids The set of OIDs this agent implements.
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     * This method is to be called to set a specific agent to a specific OID. This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the OID nearer agent will be used on SNMP operations.
     * @param name The name of the SNMP protocol adaptor.
     * @param oids The set of OIDs this agent implements.
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     *
     * @exception InstanceNotFoundException The SNMP protocol adaptor does
     *     not exist in the MBean server.
     *
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *     in the MBean server or the requested service is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the object name of the SNMP protocol adaptor to which the MIB
     * is bound.
     *
     * @return The name of the SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and adds this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @param oids The set of OIDs this agent implements.
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and adds this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

     /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     * This method is to be called to set a specific agent to a specific OID. This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the OID nearest the agent will be used on SNMP operations.
     * @param stack The SNMP MIB handler.
     * @param oids The set of OIDs this agent implements.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the reference to the SNMP protocol adaptor to which the MIB is
     * bound.
     *
     * @return The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Gets the reference to the MBean server in which the SNMP MIB is
     * registered.
     *
     * @return The MBean server or null if the MIB is not registered in any
     *     MBean server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public abstract long[] getRootOid();

    /**
     * Gets the root object identifier of the MIB.
     * <P>The root object identifier is the object identifier uniquely
     * identifying the MIB.
     *
     * @return The root object identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation can not be performed, the method should throw an
     * <CODE>SnmpStatusException</CODE>.
     * This method is called during the first phase of the SET two-phase
     * commit.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException The <CODE>set</CODE> operation
     *    cannot be performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>set</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     * This method is called during the second phase of the SET two-phase
     * commit.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     *            Throwing an exception in this method will break the
     *            atomicity of the SET operation. Care must be taken so that
     *            the exception is thrown in the {@link #check(SnmpMibRequest)}
     *            method instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>getBulk</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @param nonRepeat The number of variables, starting with the first
     *    variable in the variable-bindings, for which a single
     *    lexicographic successor is requested.
     *
     * @param maxRepeat The number of lexicographic successors requested
     *    for each of the last R variables. R is the number of variables
     *    following the first <CODE>nonRepeat</CODE> variables for which
     *    multiple lexicographic successors are requested.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>getNext</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     *
     * @param req The SnmpMibRequest object holding the list of
     *            OIDs from which the next variables should be retrieved.
     *            This list is composed of <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Processes a <CODE>get</CODE> operation.
     * This method must update the SnmpVarBinds contained in the
     * <var>{@link SnmpMibRequest} req</var> parameter.
     *
     * @param req The SnmpMibRequest object holding the list of variable to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    @Override

    /**
     * Initializes the MIB but each single MBean representing the MIB
     * is inserted into the MBean server.
     *
     * @param server The MBean server to register the service with.
     * @param name The object name.
     *
     * @return The name of the SNMP MIB registered.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public abstract void init() throws IllegalAccessException;

    /**
     * Initializes the MIB (with no registration of the MBeans into the
     * MBean server).
     *
     * @exception IllegalAccessException The MIB can not be initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
    public SnmpMibAgent() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgent.java
public abstract class SnmpMibAgent

/**
 * Abstract class for representing an SNMP agent.
 *
 * The class is used by the SNMP protocol adaptor as the entry point in
 * the SNMP agent to query.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
