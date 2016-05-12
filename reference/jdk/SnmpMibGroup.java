_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Register a child node of this node in the OID tree.
     * This method is used internally. You shouldn't ever call it directly.
     *
     * @param oid The oid of the node being registered.
     * @param cursor The position reached in the oid.
     * @param node The node being registered.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    protected void registerObject(long arc)

    /**
     * Register an OID arc that identifies a scalar object or a table.
     * This method is used internally. You shouldn't ever call it directly.
     *
     * @param arc An OID arc.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    void registerNestedArc(long arc) {

    /**
     * Register an OID arc that identifies a sub-tree
     * leading to a nested SNMP sub-group. This method is used internally.
     * You shouldn't ever call it directly.
     *
     * @param arc An OID arc.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Generic handling of the <CODE>check</CODE> operation.
     *
     * <p>The actual implementation of this method will be generated
     * by mibgen. Usually, this implementation only delegates the
     * job to some other provided runtime class, which knows how to
     * access the MBean. The current toolkit thus provides two
     * implementations:
     * <ul><li>The standard implementation will directly access the
     *         MBean through a java reference,</li>
     *     <li>The generic implementation will access the MBean through
     *         the MBean server.</li>
     * </ul>
     * <p>Both implementations rely upon specific - and distinct, set of
     * mibgen generated methods.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Generic handling of the <CODE>set</CODE> operation.
     * <p>The actual implementation of this method will be generated
     * by mibgen. Usually, this implementation only delegates the
     * job to some other provided runtime class, which knows how to
     * access the MBean. The current toolkit thus provides two
     * implementations:
     * <ul><li>The standard implementation will directly access the
     *         MBean through a java reference,</li>
     *     <li>The generic implementation will access the MBean through
     *         the MBean server.</li>
     * </ul>
     * <p>Both implementations rely upon specific - and distinct, set of
     * mibgen generated methods.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Generic handling of the <CODE>get</CODE> operation.
     * <p>The actual implementation of this method will be generated
     * by mibgen. Usually, this implementation only delegates the
     * job to some other provided runtime class, which knows how to
     * access the MBean. The current toolkit thus provides two
     * implementations:
     * <ul><li>The standard implementation will directly access the
     *         MBean through a java reference,</li>
     *     <li>The generic implementation will access the MBean through
     *         the MBean server.</li>
     * </ul>
     * <p>Both implementations rely upon specific - and distinct, set of
     * mibgen generated methods.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public boolean isNestedArc(long arc) {

    /**
     * Tell whether the given OID arc identifies a sub-tree
     * leading to a nested SNMP sub-group. This method is used internally.
     * You shouldn't need to call it directly.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if the given OID arc identifies a subtree
     * leading to a nested SNMP sub-group.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public void validateVarId(long arc, Object userData)

    /**
     * Checks whether the given OID arc identifies a variable (scalar
     * object).
     *
     * @exception If the given `arc' does not identify any variable in this
     *    group, throws an SnmpStatusException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract SnmpMibTable getTable(long arc);

    /**
     * Gets the table identified by the given `arc'.
     *
     * @param arc An OID arc.
     *
     * @return The <CODE>SnmpMibTable</CODE> identified by `arc', or
     *    <CODE>null</CODE> if `arc' does not identify any table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract boolean      isReadable(long arc);

    /**
     * Tells whether the given arc identifies a readable scalar object in
     * this group.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a readable variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract boolean      isVariable(long arc);

    /**
     * Tells whether the given arc identifies a variable (scalar object) in
     * this group.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract boolean      isTable(long arc);

    /**
     * Tells whether the given arc identifies a table in this group.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
public abstract class SnmpMibGroup extends SnmpMibOid

/**
 * Represents a node in an SNMP MIB which corresponds to a group.
 * This class allows subnodes to be registered below a group, providing
 * support for nested groups. The subnodes are registered at run time
 * when registering the nested groups in the global MIB OID tree.
 * <P>
 * This class is used by the class generated by <CODE>mibgen</CODE>.
 * You should not need to use this class directly.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Register a child node of this node in the OID tree.
     * This method is used internally. You shouldn't ever call it directly.
     *
     * @param oid The oid of the node being registered.
     * @param cursor The position reached in the oid.
     * @param node The node being registered.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    protected void registerObject(long arc)

    /**
     * Register an OID arc that identifies a scalar object or a table.
     * This method is used internally. You shouldn't ever call it directly.
     *
     * @param arc An OID arc.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    void registerNestedArc(long arc) {

    /**
     * Register an OID arc that identifies a sub-tree
     * leading to a nested SNMP sub-group. This method is used internally.
     * You shouldn't ever call it directly.
     *
     * @param arc An OID arc.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Generic handling of the <CODE>check</CODE> operation.
     *
     * <p>The actual implementation of this method will be generated
     * by mibgen. Usually, this implementation only delegates the
     * job to some other provided runtime class, which knows how to
     * access the MBean. The current toolkit thus provides two
     * implementations:
     * <ul><li>The standard implementation will directly access the
     *         MBean through a java reference,</li>
     *     <li>The generic implementation will access the MBean through
     *         the MBean server.</li>
     * </ul>
     * <p>Both implementations rely upon specific - and distinct, set of
     * mibgen generated methods.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Generic handling of the <CODE>set</CODE> operation.
     * <p>The actual implementation of this method will be generated
     * by mibgen. Usually, this implementation only delegates the
     * job to some other provided runtime class, which knows how to
     * access the MBean. The current toolkit thus provides two
     * implementations:
     * <ul><li>The standard implementation will directly access the
     *         MBean through a java reference,</li>
     *     <li>The generic implementation will access the MBean through
     *         the MBean server.</li>
     * </ul>
     * <p>Both implementations rely upon specific - and distinct, set of
     * mibgen generated methods.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    @Override

    /**
     * Generic handling of the <CODE>get</CODE> operation.
     * <p>The actual implementation of this method will be generated
     * by mibgen. Usually, this implementation only delegates the
     * job to some other provided runtime class, which knows how to
     * access the MBean. The current toolkit thus provides two
     * implementations:
     * <ul><li>The standard implementation will directly access the
     *         MBean through a java reference,</li>
     *     <li>The generic implementation will access the MBean through
     *         the MBean server.</li>
     * </ul>
     * <p>Both implementations rely upon specific - and distinct, set of
     * mibgen generated methods.
     * <p> You can override this method if you need to implement some
     * specific policies for minimizing the accesses made to some remote
     * underlying resources.
     * <p>
     *
     * @param req   The sub-request that must be handled by this node.
     *
     * @param depth The depth reached in the OID tree.
     *
     * @exception SnmpStatusException An error occurred while accessing
     *  the MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public boolean isNestedArc(long arc) {

    /**
     * Tell whether the given OID arc identifies a sub-tree
     * leading to a nested SNMP sub-group. This method is used internally.
     * You shouldn't need to call it directly.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if the given OID arc identifies a subtree
     * leading to a nested SNMP sub-group.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public void validateVarId(long arc, Object userData)

    /**
     * Checks whether the given OID arc identifies a variable (scalar
     * object).
     *
     * @exception If the given `arc' does not identify any variable in this
     *    group, throws an SnmpStatusException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract SnmpMibTable getTable(long arc);

    /**
     * Gets the table identified by the given `arc'.
     *
     * @param arc An OID arc.
     *
     * @return The <CODE>SnmpMibTable</CODE> identified by `arc', or
     *    <CODE>null</CODE> if `arc' does not identify any table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract boolean      isReadable(long arc);

    /**
     * Tells whether the given arc identifies a readable scalar object in
     * this group.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a readable variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract boolean      isVariable(long arc);

    /**
     * Tells whether the given arc identifies a variable (scalar object) in
     * this group.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
    public abstract boolean      isTable(long arc);

    /**
     * Tells whether the given arc identifies a table in this group.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibGroup.java
public abstract class SnmpMibGroup extends SnmpMibOid

/**
 * Represents a node in an SNMP MIB which corresponds to a group.
 * This class allows subnodes to be registered below a group, providing
 * support for nested groups. The subnodes are registered at run time
 * when registering the nested groups in the global MIB OID tree.
 * <P>
 * This class is used by the class generated by <CODE>mibgen</CODE>.
 * You should not need to use this class directly.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
