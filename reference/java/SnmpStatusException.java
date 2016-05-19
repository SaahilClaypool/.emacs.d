_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    private int errorIndex= -1;

    /**
     * Index of the error.
     * If different from -1, indicates the index where the error occurs.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    private int errorStatus = 0 ;

    /**
     * Status of the error.
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public int getErrorIndex() {

    /**
     * Returns the index of the error.
     * A value of -1 means that the index is not known/applicable.
     * @return The error index.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public int getStatus() {

    /**
     * Return the error status.
     * @return The error status.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public SnmpStatusException(SnmpStatusException x, int index) {

    /**
     * Constructs a new <CODE>SnmpStatusException</CODE> with an error index.
     * @param x The original <CODE>SnmpStatusException</CODE>.
     * @param index The error index.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public SnmpStatusException(String s) {

    /**
     * Constructs a new <CODE>SnmpStatusException</CODE> with an error message.
     * The error status is set to 0 (noError) and the index to -1.
     * @param s The error message.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public SnmpStatusException(int status, int index) {

    /**
     * Constructs a new <CODE>SnmpStatusException</CODE> with the specified status error and status index.
     * @param status The error status.
     * @param index The error index.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public SnmpStatusException(int status) {

    /**
     * Constructs a new <CODE>SnmpStatusException</CODE> with the specified status error.
     * @param status The error status.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public static final int noSuchObject     = 0xE1;

    /**
     * Error code for reporting a no such object error.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public static final int noSuchInstance     = 0xE0;

    /**
     * Error code for reporting a no such instance error.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public static final int noAccess           = 6 ;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noAccess</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public static final int readOnly           = 4 ;

    /**
     * Error code as defined in RFC 1448 for: <CODE>readOnly</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public static final int badValue           = 3 ;

    /**
     * Error code as defined in RFC 1448 for: <CODE>badValue</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
    public static final int noSuchName         = 2 ;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noSuchName</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStatusException.java
public class SnmpStatusException extends Exception implements SnmpDefinitions {

/**
 * Reports an error which occurred during a get/set operation on a mib node.
 *
 * This exception includes a status error code as defined in the SNMP protocol.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
