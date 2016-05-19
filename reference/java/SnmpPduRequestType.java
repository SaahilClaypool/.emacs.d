_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequestType.java
    public int getErrorStatus();

    /**
     * Error status getter. Statuses are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * @return Error status.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequestType.java
    public int getErrorIndex();

    /**
     * Error index getter. Remember that SNMP indices start from 1.
     * Thus the corresponding <CODE>SnmpVarBind</CODE> is
     * <CODE>varBindList[errorIndex-1]</CODE>.
     * @return Error index.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequestType.java
    public void setErrorStatus(int i);

    /**
     * Error status setter. Statuses are defined in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * @param i Error status.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequestType.java
    public void setErrorIndex(int i);

    /**
     * Error index setter. Remember that SNMP indices start from 1.
     * Thus the corresponding <CODE>SnmpVarBind</CODE> is
     * <CODE>varBindList[errorIndex-1]</CODE>.
     * @param i Error index.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduRequestType.java
public interface SnmpPduRequestType extends SnmpAckPdu {

/**
 * Interface implemented by classes modelizing request pdu.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
