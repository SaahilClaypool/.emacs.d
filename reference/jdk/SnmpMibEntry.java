_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    abstract public void check(SnmpMibSubRequest req, int depth)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    abstract public void set(SnmpMibSubRequest req, int depth)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    abstract public void get(SnmpMibSubRequest req, int depth)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public void validateVarId(long arc, Object userData)

    /**
     * Checks whether the given OID arc identifies a variable (columnar
     * object).
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception If the given `arc' does not identify any variable in this
     *    group, throws an SnmpStatusException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public long getNextVarId(long id, Object userData)

    /**
     * Get the next OID arc corresponding to a readable scalar variable.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public abstract boolean isReadable(long arc);

    /**
     * Tells whether the given arc identifies a readable scalar object in
     * this entry.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a readable variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public abstract boolean isVariable(long arc);

    /**
     * Tells whether the given arc identifies a variable (scalar object) in
     * this entry.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
public abstract class SnmpMibEntry extends SnmpMibNode

/**
 * Represents a node in an SNMP MIB which corresponds to a table entry
 * meta node.
 * <P>
 * This class is used by the class generated by <CODE>mibgen</CODE>.
 * You should not need to use this class directly.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    abstract public void check(SnmpMibSubRequest req, int depth)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    abstract public void set(SnmpMibSubRequest req, int depth)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    abstract public void get(SnmpMibSubRequest req, int depth)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public void validateVarId(long arc, Object userData)

    /**
     * Checks whether the given OID arc identifies a variable (columnar
     * object).
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception If the given `arc' does not identify any variable in this
     *    group, throws an SnmpStatusException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public long getNextVarId(long id, Object userData)

    /**
     * Get the next OID arc corresponding to a readable scalar variable.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public abstract boolean isReadable(long arc);

    /**
     * Tells whether the given arc identifies a readable scalar object in
     * this entry.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a readable variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
    public abstract boolean isVariable(long arc);

    /**
     * Tells whether the given arc identifies a variable (scalar object) in
     * this entry.
     *
     * @param arc An OID arc.
     *
     * @return <CODE>true</CODE> if `arc' leads to a variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibEntry.java
public abstract class SnmpMibEntry extends SnmpMibNode

/**
 * Represents a node in an SNMP MIB which corresponds to a table entry
 * meta node.
 * <P>
 * This class is used by the class generated by <CODE>mibgen</CODE>.
 * You should not need to use this class directly.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
