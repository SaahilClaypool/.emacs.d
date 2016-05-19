_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
    public String getName() {

    /**
     * Returns the name identifying this <CODE>SnmpOidTableSupport</CODE> object.
     * @return The OID table name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
    @Override

    /**
     * Checks if the specified <CODE>Object</CODE> is equal to this <CODE>SnmpOidTableSupport</CODE>.
     * @param object The <CODE>Object</CODE> to be compared.
     * @return <CODE>true</CODE> if <CODE>object</CODE> is an <CODE>SnmpOidTableSupport</CODE> instance and equals to this,
     * <CODE>false</CODE> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
    public synchronized void loadMib(SnmpOidRecord[] mibs) {

    /**
     * Loads a list of variables into the storage area,
     * which is kept in memory. If you have new MIB variables,
     * this method can be called to load them.
     * @param mibs The list of variables to load.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
    @Override

    /**
     * Returns a list that can be used to traverse all the entries in this <CODE>SnmpOidTable</CODE>.
     * @return A vector of {@link com.sun.jmx.snmp.SnmpOidRecord} objects.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
    @Override

    /**
     * Searches for a MIB variable given its OID and returns an {@link com.sun.jmx.snmp.SnmpOidRecord} object
     * containing information on the variable.
     *
     * @param oid The OID of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     * @exception SnmpStatusException If the variable is not found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
    @Override

    /**
     * Searches for a MIB variable given its logical name and returns an {@link com.sun.jmx.snmp.SnmpOidRecord} object
     * containing information on the variable.
     *
     * @param name The name of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     * @exception SnmpStatusException If the variable is not found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
    public SnmpOidTableSupport(String name) {

    /**
     * Creates an <CODE>SnmpOidTableSupport</CODE> with the specified name.
     * This name identifies the MIB to which belong  the MIB variables contained
     * in this <CODE>SnmpOidTableSupport</CODE> object.
     * @param name The OID table name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpOidTableSupport.java
public class SnmpOidTableSupport implements SnmpOidTable {

/**
 * Contains metadata definitions for MIB variables.
 * A name can be resolved against a table of MIB variables.
 * Each entry in the table is an <CODE>SnmpOidRecord</CODE> object that contains a name, a dot-separated OID string,
 * and the corresponding SMI type of the variable.
 * <P>
 * If you need to load a specific <CODE>SnmpOidTable</CODE>, just call the static method
 * {@link com.sun.jmx.snmp.SnmpOid#setSnmpOidTable <CODE>SnmpOid.setSnmpOidTable(<I>myOidTable</I>)</CODE>}.
 * <P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.SnmpOidRecord
 *
 */
