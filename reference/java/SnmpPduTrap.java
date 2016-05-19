_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduTrap.java
    public SnmpPduTrap() {

    /**
     * Builds a new trap PDU.
     * <BR><CODE>type</CODE> and <CODE>version</CODE> fields are initialized with
     * {@link com.sun.jmx.snmp.SnmpDefinitions#pduV1TrapPdu pduV1TrapPdu}
     * and {@link com.sun.jmx.snmp.SnmpDefinitions#snmpVersionOne snmpVersionOne}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduTrap.java
    public long            timeStamp ;

    /**
     * Time-stamp.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduTrap.java
    public int            specificTrap ;

    /**
     * Specific trap number.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduTrap.java
    public int            genericTrap ;

    /**
     * Generic trap number.
     * <BR>
     * The possible values are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions#trapColdStart SnmpDefinitions}.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduTrap.java
    public SnmpIpAddress  agentAddr ;

    /**
     * Agent address. If the agent address source was not an IPv4 one (eg : IPv6), this field is null.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduTrap.java
    public SnmpOid        enterprise ;

    /**
     * Enterprise object identifier.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduTrap.java
public class SnmpPduTrap extends SnmpPduPacket {

/**
 * Represents an SNMPv1-trap PDU.
 * <P>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link com.sun.jmx.snmp.SnmpPduFactory SnmpPduFactory} object.
 * <P>
 * The <CODE>SnmpPduTrap</CODE> extends {@link com.sun.jmx.snmp.SnmpPduPacket SnmpPduPacket}
 * and defines attributes specific to an SNMPv1 trap (see RFC1157).
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
