_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
    public SnmpSecurityException(String msg) {

    /**
     * Constructor.
     * @param msg The exception msg to display.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
    public byte flags = (byte) SnmpDefinitions.noAuthNoPriv;

     /**
     * The current flags.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
    public byte[] contextName = null;

     /**
     * The current context name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
    public byte[] contextEngineId = null;

    /**
     * The current context engine Id.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
    public SnmpSecurityParameters params = null;

    /**
     * The current security model related security parameters.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
    public int status = SnmpDefinitions.snmpReqUnknownError;

    /**
     * The status of the exception. See {@link com.sun.jmx.snmp.SnmpDefinitions} for possible values.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
    public SnmpVarBind[] list = null;

    /**
     * The current request varbind list.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpSecurityException.java
public class SnmpSecurityException extends Exception {

/**
 * This exception is thrown when an error occurs in an <CODE> SnmpSecurityModel </CODE>.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
