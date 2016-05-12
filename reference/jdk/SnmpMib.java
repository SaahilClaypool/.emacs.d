_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    private transient long[] rootOid= null;

    /**
     * The root object identifier of the MIB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected SnmpMibOid root;

    /**
     * The top element in the Mib tree.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    private SnmpRequestTree getGetNextHandlers(SnmpMibRequest req)

    /**
     * This method builds the temporary request-tree that will be used to
     * perform the SNMP GET-NEXT request associated with the given vector
     * of varbinds `list'.
     *
     * @param req The SnmpMibRequest object holding the varbind list
     *             concerning this MIB.
     *
     * @return The request-tree where the original varbind list has been
     *         dispatched to the appropriate nodes, and where the original
     *         OIDs have been replaced with the correct "next" OID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    private SnmpRequestTree getHandlers(SnmpMibRequest req,
                                        boolean createflag, boolean atomic,
                                        int type)

    /**
     * This method builds the temporary request-tree that will be used to
     * perform the SNMP request associated with the given vector of varbinds
     * `list'.
     *
     * @param req The SnmpMibRequest object holding the varbind list
     *             concerning this MIB.
     * @param createflag Indicates whether the operation allow for creation
     *        of new instances (ie: it is a SET).
     * @param atomic Indicates whether the operation is atomic or not.
     * @param type Request type (from SnmpDefinitions).
     *
     * @return The request-tree where the original varbind list has been
     *         dispatched to the appropriate nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    @Override

    /**
     * Gets the root object identifier of the MIB.
     * <P>In order to be accurate, the method should be called once the
     * MIB is fully initialized (that is, after a call to <CODE>init</CODE>
     * or <CODE>preRegister</CODE>).
     *
     * @return The root object identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>getBulk</CODE> operation.
     * The method implements the <CODE>getBulk</CODE> operation by calling
     * appropriately the <CODE>getNext</CODE> method.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>getNext</CODE> operation.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation cannot be performed, the method will raise a
     * <CODE>SnmpStatusException</CODE>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>set</CODE> operation.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>get</CODE> operation.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    public abstract SnmpMibTable getRegisteredTableMeta(String name);

    /**
     * Returns a registered SNMP Table metadata node.
     *
     * <p><b><i>
     * This method is used internally and you should never need to
     * call it directly.
     * </i></b></p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    public abstract void registerTableMeta(String name, SnmpMibTable table);

    /**
     * <p>
     * Register an SNMP Table metadata node in the MIB.
     * </p>
     *
     * <p>
     * <b><i>
     * This method is used internally and you should never need to
     * call it directly.</i></b><br> It is used to establish the link
     * between an SNMP table metadata node and its bean-like counterpart.
     * <br>
     * The group metadata nodes will create and register their
     * underlying table metadata nodes in the MIB using this
     * method. <br>
     * The metadata nodes will be later retrieved from the MIB by the
     * bean-like table objects using the getRegisterTableMeta() method.
     * </p>
     *
     * @param name      The java-ized name of the SNMP table.
     * @param table     The SNMP table metadata node - usually this
     *                  corresponds to a <code>mibgen</code> generated
     *                  object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected void registerGroupNode(String groupName,   String groupOid,
                                     ObjectName groupObjName, SnmpMibNode node,
                                     Object group, MBeanServer server)

    /**
     * <p>
     * Register an SNMP group and its metadata node in the MIB.
     * </p>
     *
     * <p>
     * This method is provided as a hook to plug-in some custom
     * specific behavior. You might want to override this method
     * if you want to set special links between the MBean, its metadata
     * node, its OID or ObjectName etc..
     * </p>
     *
     * <p>
     * If the MIB is not registered in the MBeanServer, the <code>
     * server</code> and <code>groupObjName</code> parameters will be
     * <code>null</code>.<br>
     * If the given group MBean is not <code>null</code>, and if the
     * <code>server</code> and <code>groupObjName</code> parameters are
     * not null, then this method will also automatically register the
     * group MBean with the given MBeanServer <code>server</code>.
     * </p>
     *
     * @param groupName  The java-ized name of the SNMP group.
     * @param groupOid   The OID as returned by getGroupOid() - in dot
     *                   notation.
     * @param groupObjName The ObjectName as returned by getGroupObjectName().
     *                   This parameter may be <code>null</code> if the
     *                   MIB is not registered in the MBeanServer.
     * @param node       The metadata node, as returned by the metadata
     *                   factory method for this group.
     * @param group      The MBean for this group, as returned by the
     *                   MBean factory method for this group.
     * @param server     The MBeanServer in which the groups are to be
     *                   registered. This parameter will be <code>null</code>
     *                   if the MIB is not registered, otherwise it is a
     *                   reference to the MBeanServer in which the MIB is
     *                   registered.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected ObjectName getGroupObjectName(String name, String oid,
                                            String defaultName)

    /**
     * <p>
     * This callback should return the ObjectName associated to the
     * group identified by the given <code>groupName</code>.
     * </p>
     *
     * <p>
     * This method is provided as a hook to plug-in some custom
     * specific behavior. You might want to override this method
     * in order to provide a different object naming scheme than
     * that proposed by default by <code>mibgen</code>.
     * </p>
     *
     * <p>
     * This method is only meaningful if the MIB is registered
     * in the MBeanServer, otherwise, it will not be called.
     * </p>
     *
     * <p>
     * The default implementation of this method is to return an ObjectName
     * built from the given <code>defaultName</code>.
     * </p>
     *
     * @param name  The java-ized name of the SNMP group.
     * @param oid   The OID returned by getGroupOid() - in dot notation.
     * @param defaultName The name by default generated by <code>
     *                    mibgen</code>
     *
     * @return The ObjectName of the group identified by <code>name</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected String getGroupOid(String groupName, String defaultOid) {

    /**
     * <p>
     * This callback should return the OID associated to the group
     * identified by the given <code>groupName</code>.
     * </p>
     *
     * <p>
     * This method is provided as a hook to plug-in some custom
     * specific behavior. Although doing so is discouraged you might
     * want to subclass this method in order to store & provide more metadata
     * information (mapping OID <-> symbolic name) within the agent,
     * or to "change" the root of the MIB OID by prefixing the
     * defaultOid by an application dependant OID string, for instance.
     * </p>
     *
     * <p>
     * The default implementation of this method is to return the given
     * <code>defaultOid</code>
     * </p>
     *
     * @param groupName   The java-ized name of the SNMP group.
     * @param defaultOid  The OID defined in the MIB for that group
     *                    (in dot notation).
     *
     * @return The OID of the group identified by <code>groupName</code>,
     *         in dot-notation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    public SnmpMib() {

    /**
     * Default constructor.
     * Initializes the OID tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
public abstract class SnmpMib extends SnmpMibAgent implements Serializable {

/**
 * Abstract class for representing an SNMP MIB.
 * <P>
 * When compiling a SNMP MIB, among all the classes generated by
 * <CODE>mibgen</CODE>, there is one which extends <CODE>SnmpMib</CODE>
 * for representing a whole MIB.
 * <BR>The class is used by the SNMP protocol adaptor as the entry point in
 * the MIB.
 *
 * <p>This generated class can be subclassed in your code in order to
 * plug in your own specific behaviour.
 * </p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    private transient long[] rootOid= null;

    /**
     * The root object identifier of the MIB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected SnmpMibOid root;

    /**
     * The top element in the Mib tree.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    private SnmpRequestTree getGetNextHandlers(SnmpMibRequest req)

    /**
     * This method builds the temporary request-tree that will be used to
     * perform the SNMP GET-NEXT request associated with the given vector
     * of varbinds `list'.
     *
     * @param req The SnmpMibRequest object holding the varbind list
     *             concerning this MIB.
     *
     * @return The request-tree where the original varbind list has been
     *         dispatched to the appropriate nodes, and where the original
     *         OIDs have been replaced with the correct "next" OID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    private SnmpRequestTree getHandlers(SnmpMibRequest req,
                                        boolean createflag, boolean atomic,
                                        int type)

    /**
     * This method builds the temporary request-tree that will be used to
     * perform the SNMP request associated with the given vector of varbinds
     * `list'.
     *
     * @param req The SnmpMibRequest object holding the varbind list
     *             concerning this MIB.
     * @param createflag Indicates whether the operation allow for creation
     *        of new instances (ie: it is a SET).
     * @param atomic Indicates whether the operation is atomic or not.
     * @param type Request type (from SnmpDefinitions).
     *
     * @return The request-tree where the original varbind list has been
     *         dispatched to the appropriate nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    @Override

    /**
     * Gets the root object identifier of the MIB.
     * <P>In order to be accurate, the method should be called once the
     * MIB is fully initialized (that is, after a call to <CODE>init</CODE>
     * or <CODE>preRegister</CODE>).
     *
     * @return The root object identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>getBulk</CODE> operation.
     * The method implements the <CODE>getBulk</CODE> operation by calling
     * appropriately the <CODE>getNext</CODE> method.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>getNext</CODE> operation.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Checks if a <CODE>set</CODE> operation can be performed.
     * If the operation cannot be performed, the method will raise a
     * <CODE>SnmpStatusException</CODE>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>set</CODE> operation.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    // Implements the method defined in SnmpMibAgent. See SnmpMibAgent

    /**
     * Processes a <CODE>get</CODE> operation.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    public abstract SnmpMibTable getRegisteredTableMeta(String name);

    /**
     * Returns a registered SNMP Table metadata node.
     *
     * <p><b><i>
     * This method is used internally and you should never need to
     * call it directly.
     * </i></b></p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    public abstract void registerTableMeta(String name, SnmpMibTable table);

    /**
     * <p>
     * Register an SNMP Table metadata node in the MIB.
     * </p>
     *
     * <p>
     * <b><i>
     * This method is used internally and you should never need to
     * call it directly.</i></b><br> It is used to establish the link
     * between an SNMP table metadata node and its bean-like counterpart.
     * <br>
     * The group metadata nodes will create and register their
     * underlying table metadata nodes in the MIB using this
     * method. <br>
     * The metadata nodes will be later retrieved from the MIB by the
     * bean-like table objects using the getRegisterTableMeta() method.
     * </p>
     *
     * @param name      The java-ized name of the SNMP table.
     * @param table     The SNMP table metadata node - usually this
     *                  corresponds to a <code>mibgen</code> generated
     *                  object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected void registerGroupNode(String groupName,   String groupOid,
                                     ObjectName groupObjName, SnmpMibNode node,
                                     Object group, MBeanServer server)

    /**
     * <p>
     * Register an SNMP group and its metadata node in the MIB.
     * </p>
     *
     * <p>
     * This method is provided as a hook to plug-in some custom
     * specific behavior. You might want to override this method
     * if you want to set special links between the MBean, its metadata
     * node, its OID or ObjectName etc..
     * </p>
     *
     * <p>
     * If the MIB is not registered in the MBeanServer, the <code>
     * server</code> and <code>groupObjName</code> parameters will be
     * <code>null</code>.<br>
     * If the given group MBean is not <code>null</code>, and if the
     * <code>server</code> and <code>groupObjName</code> parameters are
     * not null, then this method will also automatically register the
     * group MBean with the given MBeanServer <code>server</code>.
     * </p>
     *
     * @param groupName  The java-ized name of the SNMP group.
     * @param groupOid   The OID as returned by getGroupOid() - in dot
     *                   notation.
     * @param groupObjName The ObjectName as returned by getGroupObjectName().
     *                   This parameter may be <code>null</code> if the
     *                   MIB is not registered in the MBeanServer.
     * @param node       The metadata node, as returned by the metadata
     *                   factory method for this group.
     * @param group      The MBean for this group, as returned by the
     *                   MBean factory method for this group.
     * @param server     The MBeanServer in which the groups are to be
     *                   registered. This parameter will be <code>null</code>
     *                   if the MIB is not registered, otherwise it is a
     *                   reference to the MBeanServer in which the MIB is
     *                   registered.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected ObjectName getGroupObjectName(String name, String oid,
                                            String defaultName)

    /**
     * <p>
     * This callback should return the ObjectName associated to the
     * group identified by the given <code>groupName</code>.
     * </p>
     *
     * <p>
     * This method is provided as a hook to plug-in some custom
     * specific behavior. You might want to override this method
     * in order to provide a different object naming scheme than
     * that proposed by default by <code>mibgen</code>.
     * </p>
     *
     * <p>
     * This method is only meaningful if the MIB is registered
     * in the MBeanServer, otherwise, it will not be called.
     * </p>
     *
     * <p>
     * The default implementation of this method is to return an ObjectName
     * built from the given <code>defaultName</code>.
     * </p>
     *
     * @param name  The java-ized name of the SNMP group.
     * @param oid   The OID returned by getGroupOid() - in dot notation.
     * @param defaultName The name by default generated by <code>
     *                    mibgen</code>
     *
     * @return The ObjectName of the group identified by <code>name</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    protected String getGroupOid(String groupName, String defaultOid) {

    /**
     * <p>
     * This callback should return the OID associated to the group
     * identified by the given <code>groupName</code>.
     * </p>
     *
     * <p>
     * This method is provided as a hook to plug-in some custom
     * specific behavior. Although doing so is discouraged you might
     * want to subclass this method in order to store & provide more metadata
     * information (mapping OID <-> symbolic name) within the agent,
     * or to "change" the root of the MIB OID by prefixing the
     * defaultOid by an application dependant OID string, for instance.
     * </p>
     *
     * <p>
     * The default implementation of this method is to return the given
     * <code>defaultOid</code>
     * </p>
     *
     * @param groupName   The java-ized name of the SNMP group.
     * @param defaultOid  The OID defined in the MIB for that group
     *                    (in dot notation).
     *
     * @return The OID of the group identified by <code>groupName</code>,
     *         in dot-notation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
    public SnmpMib() {

    /**
     * Default constructor.
     * Initializes the OID tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMib.java
public abstract class SnmpMib extends SnmpMibAgent implements Serializable {

/**
 * Abstract class for representing an SNMP MIB.
 * <P>
 * When compiling a SNMP MIB, among all the classes generated by
 * <CODE>mibgen</CODE>, there is one which extends <CODE>SnmpMib</CODE>
 * for representing a whole MIB.
 * <BR>The class is used by the SNMP protocol adaptor as the entry point in
 * the MIB.
 *
 * <p>This generated class can be subclassed in your code in order to
 * plug in your own specific behaviour.
 * </p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
