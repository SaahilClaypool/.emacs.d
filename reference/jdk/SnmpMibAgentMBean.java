_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public String getMibName();

    /**
     * Gets the MIB name.
     *
     * @return The MIB name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public boolean getBindingState();

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name,
                                   String contextName,
                                   SnmpOid[] oids)

     /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be
     *        registered in the default context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name, String contextName)

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be
     *     registered in the default context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name, SnmpOid[] oids)

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     * This method is to be called to set a specific agent to a specific OID.
     * This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the
     * OID nearer agent will be used on SNMP operations.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name)

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The object name of the SNMP MIB handler.
     *
     * @exception InstanceNotFoundException The MBean does not exist in the
     *        MBean server.
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *        in the MBean server or the requested service is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public ObjectName getSnmpAdaptorName();

    /**
     * Gets the object name of the SNMP protocol adaptor to which the MIB is
     * bound.
     *
     * @return The name of the SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack,
                               String contextName,
                               SnmpOid[] oids);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and adds this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be
     *        registered in the default context.
     * @param oids The set of OIDs this agent implements.
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack, String contextName);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be
     *        registered in the default context.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack, SnmpOid[] oids);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     * This method is to be called to set a specific agent to a specific OID.
     * This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the
     * OID nearer agent will be used on SNMP operations.
     * @param stack The SNMP MIB handler.
     * @param oids The set of OIDs this agent implements.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the
     * MIB will be SNMP accessible and add this new MIB in the SNMP MIB
     * handler.
     * <BR>This method is used for setting the SNMP MIB handler property of
     * the SNMP MIB agent in case of a standalone agent.
     *
     * @param stack The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public SnmpMibHandler getSnmpAdaptor();

    /**
     * Gets the reference to the SNMP protocol adaptor to which the MIB is
     * bound.
     * <BR>This method is used for accessing the SNMP MIB handler property
     * of the SNMP MIB agent in case of a standalone agent.
     *
     * @return The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public MBeanServer getMBeanServer();

    /**
     * Gets the reference to the MBean server in which the SNMP MIB is
     * registered.
     *
     * @return The MBean server or null if the MIB is not registered in any
     *         MBean server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void check(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation cannot be performed, the method should emit a
     * <CODE>SnmpStatusException</CODE>.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException The <CODE>set</CODE> operation
     *    cannot be performed.
     * @see SnmpMibAgent#check(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void set(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Processes a <CODE>set</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     * @see SnmpMibAgent#set(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void getBulk(SnmpMibRequest req, int nonRepeat, int maxRepeat)

    /**
     * Processes a <CODE>getBulk</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
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
     * @see SnmpMibAgent#getBulk(SnmpMibRequest,int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void getNext(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Processes a <CODE>getNext</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     * @see SnmpMibAgent#getNext(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void get(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Processes a <CODE>get</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     * @see SnmpMibAgent#get(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
public interface SnmpMibAgentMBean {

/**
 * Exposes the remote management interface of the <CODE>SnmpMibAgent</CODE> MBean.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public String getMibName();

    /**
     * Gets the MIB name.
     *
     * @return The MIB name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public boolean getBindingState();

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name,
                                   String contextName,
                                   SnmpOid[] oids)

     /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be
     *        registered in the default context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name, String contextName)

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The name of the SNMP protocol adaptor.
     * @param contextName The MIB context name. If null is passed, will be
     *     registered in the default context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name, SnmpOid[] oids)

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     * This method is to be called to set a specific agent to a specific OID.
     * This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the
     * OID nearer agent will be used on SNMP operations.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptorName(ObjectName name)

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler
     * associated to the specified <CODE>name</CODE>.
     *
     * @param name The object name of the SNMP MIB handler.
     *
     * @exception InstanceNotFoundException The MBean does not exist in the
     *        MBean server.
     * @exception ServiceNotFoundException This SNMP MIB is not registered
     *        in the MBean server or the requested service is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public ObjectName getSnmpAdaptorName();

    /**
     * Gets the object name of the SNMP protocol adaptor to which the MIB is
     * bound.
     *
     * @return The name of the SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack,
                               String contextName,
                               SnmpOid[] oids);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and adds this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be
     *        registered in the default context.
     * @param oids The set of OIDs this agent implements.
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack, String contextName);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param stack The SNMP MIB handler.
     * @param contextName The MIB context name. If null is passed, will be
     *        registered in the default context.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack, SnmpOid[] oids);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the MIB
     * will be SNMP accessible and add this new MIB in the SNMP MIB handler.
     * This method is to be called to set a specific agent to a specific OID.
     * This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case, the
     * OID nearer agent will be used on SNMP operations.
     * @param stack The SNMP MIB handler.
     * @param oids The set of OIDs this agent implements.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void setSnmpAdaptor(SnmpMibHandler stack);

    /**
     * Sets the reference to the SNMP protocol adaptor through which the
     * MIB will be SNMP accessible and add this new MIB in the SNMP MIB
     * handler.
     * <BR>This method is used for setting the SNMP MIB handler property of
     * the SNMP MIB agent in case of a standalone agent.
     *
     * @param stack The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public SnmpMibHandler getSnmpAdaptor();

    /**
     * Gets the reference to the SNMP protocol adaptor to which the MIB is
     * bound.
     * <BR>This method is used for accessing the SNMP MIB handler property
     * of the SNMP MIB agent in case of a standalone agent.
     *
     * @return The SNMP MIB handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public MBeanServer getMBeanServer();

    /**
     * Gets the reference to the MBean server in which the SNMP MIB is
     * registered.
     *
     * @return The MBean server or null if the MIB is not registered in any
     *         MBean server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void check(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation cannot be performed, the method should emit a
     * <CODE>SnmpStatusException</CODE>.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException The <CODE>set</CODE> operation
     *    cannot be performed.
     * @see SnmpMibAgent#check(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void set(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Processes a <CODE>set</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be set. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     * @see SnmpMibAgent#set(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void getBulk(SnmpMibRequest req, int nonRepeat, int maxRepeat)

    /**
     * Processes a <CODE>getBulk</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
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
     * @see SnmpMibAgent#getBulk(SnmpMibRequest,int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void getNext(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Processes a <CODE>getNext</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     * @see SnmpMibAgent#getNext(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
    public void get(SnmpMibRequest req) throws SnmpStatusException;

    /**
     * Processes a <CODE>get</CODE> operation.
     * This method must not be called from remote.
     *
     * @param req The SnmpMibRequest object holding the list of variables to
     *            be retrieved. This list is composed of
     *            <CODE>SnmpVarBind</CODE> objects.
     *
     * @exception SnmpStatusException An error occurred during the operation.
     * @see SnmpMibAgent#get(SnmpMibRequest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibAgentMBean.java
public interface SnmpMibAgentMBean {

/**
 * Exposes the remote management interface of the <CODE>SnmpMibAgent</CODE> MBean.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
