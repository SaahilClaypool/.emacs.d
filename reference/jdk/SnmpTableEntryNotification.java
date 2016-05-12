_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    private final ObjectName name;

    /**
     * The entry name.
     * @serial
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    private final Object entry;

    /**
     * The entry object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public static final String SNMP_ENTRY_REMOVED =

    /**
     * Notification type denoting that an entry has been removed from the
     * SNMP table.
     * <BR>The value of this notification type is
     * <CODE>jmx.snmp.table.entry.removed</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public static final String SNMP_ENTRY_ADDED =

    /**
     * Notification type denoting that a new entry has been added to the
     * SNMP table.
     * <BR>The value of this notification type is
     * <CODE>jmx.snmp.table.entry.added</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public ObjectName getEntryName() {

    /**
     * Gets the ObjectName of the entry.
     * May be null if the entry is not registered in the MBeanServer.
     *
     * @return The ObjectName of the entry.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public Object getEntry() {

    /**
     * Gets the entry object.
     * May be null if the entry is registered in the MBeanServer, and the
     * MIB is using the generic MetaData (see mibgen).
     *
     * @return The entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    SnmpTableEntryNotification(String type, Object source,
                               long sequenceNumber, long timeStamp,
                               Object entry, ObjectName entryName) {

    /**
     * Creates and initializes a table entry notification object.
     *
     * @param type The notification type.
     * @param source The notification producer.
     * @param sequenceNumber The notification sequence number within the
     *                  source object.
     * @param timeStamp The notification emission date.
     * @param entry     The entry object (may be null if the entry is
     *                  registered in the MBeanServer).
     * @param entryName The ObjectName entry object (may be null if the
     *                  entry is not registered in the MBeanServer).
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
public class SnmpTableEntryNotification extends Notification {

/**
 * Represents a notification emitted when an
 * entry is added or deleted from an SNMP table.
 * <P>
 * The <CODE>SnmpTableEntryNotification</CODE> object contains
 * the reference to the entry added or removed from the table.
 * <P>
 * The list of notifications fired by the <CODE>SnmpMibTable</CODE> is
 * the following:
 * <UL>
 * <LI>A new entry has been added to the SNMP table.
 * <LI>An existing entry has been removed from the SNMP table.
  </UL>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    private final ObjectName name;

    /**
     * The entry name.
     * @serial
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    private final Object entry;

    /**
     * The entry object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public static final String SNMP_ENTRY_REMOVED =

    /**
     * Notification type denoting that an entry has been removed from the
     * SNMP table.
     * <BR>The value of this notification type is
     * <CODE>jmx.snmp.table.entry.removed</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public static final String SNMP_ENTRY_ADDED =

    /**
     * Notification type denoting that a new entry has been added to the
     * SNMP table.
     * <BR>The value of this notification type is
     * <CODE>jmx.snmp.table.entry.added</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public ObjectName getEntryName() {

    /**
     * Gets the ObjectName of the entry.
     * May be null if the entry is not registered in the MBeanServer.
     *
     * @return The ObjectName of the entry.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    public Object getEntry() {

    /**
     * Gets the entry object.
     * May be null if the entry is registered in the MBeanServer, and the
     * MIB is using the generic MetaData (see mibgen).
     *
     * @return The entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
    SnmpTableEntryNotification(String type, Object source,
                               long sequenceNumber, long timeStamp,
                               Object entry, ObjectName entryName) {

    /**
     * Creates and initializes a table entry notification object.
     *
     * @param type The notification type.
     * @param source The notification producer.
     * @param sequenceNumber The notification sequence number within the
     *                  source object.
     * @param timeStamp The notification emission date.
     * @param entry     The entry object (may be null if the entry is
     *                  registered in the MBeanServer).
     * @param entryName The ObjectName entry object (may be null if the
     *                  entry is not registered in the MBeanServer).
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpTableEntryNotification.java
public class SnmpTableEntryNotification extends Notification {

/**
 * Represents a notification emitted when an
 * entry is added or deleted from an SNMP table.
 * <P>
 * The <CODE>SnmpTableEntryNotification</CODE> object contains
 * the reference to the entry added or removed from the table.
 * <P>
 * The list of notifications fired by the <CODE>SnmpMibTable</CODE> is
 * the following:
 * <UL>
 * <LI>A new entry has been added to the SNMP table.
 * <LI>An existing entry has been removed from the SNMP table.
  </UL>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
