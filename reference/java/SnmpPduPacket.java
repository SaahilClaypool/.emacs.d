_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduPacket.java
    public byte[] community ;

    /**
     * The pdu community string.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduPacket.java
public abstract class SnmpPduPacket extends SnmpPdu implements Serializable {

/**
 * Is the fully decoded representation of an SNMP packet.
 * <P>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link com.sun.jmx.snmp.SnmpPduFactory SnmpPduFactory} object.
 * <P>
 * Classes are derived from <CODE>SnmpPduPacket</CODE> to
 * represent the different forms of SNMP packets
 * ({@link com.sun.jmx.snmp.SnmpPduRequest SnmpPduRequest},
 * {@link com.sun.jmx.snmp.SnmpPduTrap SnmpPduTrap},
 * {@link com.sun.jmx.snmp.SnmpPduBulk SnmpPduBulk}).
 * <BR>The <CODE>SnmpPduPacket</CODE> class defines the attributes
 * common to every form of SNMP packets.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see SnmpMessage
 * @see SnmpPduFactory
 *
 */
