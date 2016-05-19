_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
    public SnmpPdu getResponsePdu() {

    /**
     * Implements <CODE>SnmpAckPdu</CODE> interface.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
    public int getErrorStatus() { return errorStatus; }

    /**
     * Implements <CODE>SnmpPduRequestType</CODE> interface.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
    public int getErrorIndex() { return errorIndex; }

    /**
     * Implements <CODE>SnmpPduRequestType</CODE> interface.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
    public void setErrorStatus(int i) {

    /**
     * Implements <CODE>SnmpPduRequestType</CODE> interface.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
    public void setErrorIndex(int i) {

    /**
     * Implements <CODE>SnmpPduRequestType</CODE> interface.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
    public int errorIndex=0 ;

    /**
     * Error index. Remember that SNMP indices start from 1.
     * Thus the corresponding <CODE>SnmpVarBind</CODE> is
     * <CODE>varBindList[errorIndex-1]</CODE>.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
    public int errorStatus=0 ;

    /**
     * Error status. Statuses are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequest.java
public class SnmpPduRequest extends SnmpPduPacket

/**
 * Is used to represent <CODE>get</CODE>, <CODE>get-next</CODE>, <CODE>set</CODE>, <CODE>response</CODE> and <CODE>SNMPv2-trap</CODE> PDUs.
 * <P>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link com.sun.jmx.snmp.SnmpPduFactory SnmpPduFactory} object.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
