_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public SnmpPdu getResponsePdu() {

    /**
     * Implements the <CODE>SnmpAckPdu</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public int getMaxRepetitions() { return maxRepetitions; }

    /**
     * Implements the <CODE>SnmpPduBulkType</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public void setNonRepeaters(int i) {

    /**
     * Implements the <CODE>SnmpPduBulkType</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public void setMaxRepetitions(int i) {

    /**
     * Implements the <CODE>SnmpPduBulkType</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public SnmpPduBulk() {

    /**
     * Builds a new <CODE>get-bulk</CODE> PDU.
     * <BR><CODE>type</CODE> and <CODE>version</CODE> fields are initialized with
     * {@link com.sun.jmx.snmp.SnmpDefinitions#pduGetBulkRequestPdu pduGetBulkRequestPdu}
     * and {@link com.sun.jmx.snmp.SnmpDefinitions#snmpVersionTwo snmpVersionTwo}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public int            maxRepetitions ;

    /**
     * The <CODE>max-repetitions</CODE> value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public int            nonRepeaters ;

    /**
     * The <CODE>non-repeaters</CODE> value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
public class SnmpPduBulk extends SnmpPduPacket

/**
 * Represents a <CODE>get-bulk</CODE> PDU as defined in RFC 1448.
 * <P>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link com.sun.jmx.snmp.SnmpPduFactory SnmpPduFactory} object.
 * <P>
 * The <CODE>SnmpPduBulk</CODE> extends {@link com.sun.jmx.snmp.SnmpPduPacket SnmpPduPacket}
 * and defines attributes specific to the <CODE>get-bulk</CODE> PDU (see RFC 1448).
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public SnmpPdu getResponsePdu() {

    /**
     * Implements the <CODE>SnmpAckPdu</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public int getMaxRepetitions() { return maxRepetitions; }

    /**
     * Implements the <CODE>SnmpPduBulkType</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public void setNonRepeaters(int i) {

    /**
     * Implements the <CODE>SnmpPduBulkType</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public void setMaxRepetitions(int i) {

    /**
     * Implements the <CODE>SnmpPduBulkType</CODE> interface.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public SnmpPduBulk() {

    /**
     * Builds a new <CODE>get-bulk</CODE> PDU.
     * <BR><CODE>type</CODE> and <CODE>version</CODE> fields are initialized with
     * {@link com.sun.jmx.snmp.SnmpDefinitions#pduGetBulkRequestPdu pduGetBulkRequestPdu}
     * and {@link com.sun.jmx.snmp.SnmpDefinitions#snmpVersionTwo snmpVersionTwo}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public int            maxRepetitions ;

    /**
     * The <CODE>max-repetitions</CODE> value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
    public int            nonRepeaters ;

    /**
     * The <CODE>non-repeaters</CODE> value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpPduBulk.java
public class SnmpPduBulk extends SnmpPduPacket

/**
 * Represents a <CODE>get-bulk</CODE> PDU as defined in RFC 1448.
 * <P>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link com.sun.jmx.snmp.SnmpPduFactory SnmpPduFactory} object.
 * <P>
 * The <CODE>SnmpPduBulk</CODE> extends {@link com.sun.jmx.snmp.SnmpPduPacket SnmpPduPacket}
 * and defines attributes specific to the <CODE>get-bulk</CODE> PDU (see RFC 1448).
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
