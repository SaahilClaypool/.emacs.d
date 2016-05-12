_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public boolean removeMib(SnmpMibAgent mib, String contextName);

     /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     * @param contextName The context name used at registration time.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was a MIB included in the SNMP MIB handler,
     * <CODE>false</CODE> otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public boolean removeMib(SnmpMibAgent mib);

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)} and
     * {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)} and should not be called directly.
     *
     * @param mib The MIB to be removed.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was a MIB included in the SNMP MIB handler,
     * <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, String contextName, SnmpOid[] oids)

    /**
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @param oids The array of oid used to add the mib. Each oid is a root oid for the mib.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, String contextName)

    /**
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, SnmpOid[] oids) throws IllegalArgumentException;

/**
     * Adds a new MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     * @param oids The array of oid used to add the mib. Each oid is a root oid for the mib.
     * @return A reference on the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib) throws IllegalArgumentException;

    /**
     * Adds a new MIB in the SNMP MIB handler.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)} and
     * {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)} and should not be called directly.
     *
     * @param mib The MIB to add.
     *
     * @return A reference on the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
public interface SnmpMibHandler {

/**
 * The logical link between an SNMP MIB and the SNMP communication stack.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public boolean removeMib(SnmpMibAgent mib, String contextName);

     /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     * @param contextName The context name used at registration time.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was a MIB included in the SNMP MIB handler,
     * <CODE>false</CODE> otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public boolean removeMib(SnmpMibAgent mib);

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)} and
     * {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)} and should not be called directly.
     *
     * @param mib The MIB to be removed.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was a MIB included in the SNMP MIB handler,
     * <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, String contextName, SnmpOid[] oids)

    /**
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     * @param oids The array of oid used to add the mib. Each oid is a root oid for the mib.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, String contextName)

    /**
     * Adds a new contextualized MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context name. If null is passed, will be registered in the default context.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, SnmpOid[] oids) throws IllegalArgumentException;

/**
     * Adds a new MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     * @param oids The array of oid used to add the mib. Each oid is a root oid for the mib.
     * @return A reference on the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
    public SnmpMibHandler addMib(SnmpMibAgent mib) throws IllegalArgumentException;

    /**
     * Adds a new MIB in the SNMP MIB handler.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)} and
     * {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)} and should not be called directly.
     *
     * @param mib The MIB to add.
     *
     * @return A reference on the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibHandler.java
public interface SnmpMibHandler {

/**
 * The logical link between an SNMP MIB and the SNMP communication stack.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
