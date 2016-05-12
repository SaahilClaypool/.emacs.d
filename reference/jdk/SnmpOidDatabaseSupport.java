_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public void removeAll(){

    /**
     * Removes all <CODE>SnmpOidTable</CODE> objects from this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public Vector<?> getAllEntries() {

    /**
     * Returns a list that can be used to traverse all the entries of the <CODE>SnmpOidTable</CODE> objects
     * of this <CODE>SnmpOidDatabase</CODE>.
     * @return A vector of <CODE>SnmpOidTable</CODE> objects containing all the elements of this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidRecord resolveVarOid(String oid) throws SnmpStatusException {

    /**
     * Searches for a MIB variable given its OID and returns an <CODE>SnmpOidRecord</CODE> object containing
     * information on the variable.
     * @param oid The OID of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     * @exception SnmpStatusException The specified oid does not exist in this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidRecord resolveVarName(String name) throws SnmpStatusException {

    /**
     * Searches for a MIB variable given its logical name and returns an <CODE>SnmpOidRecord</CODE>
     * object containing information on the variable.
     * @param name The name of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     *
     * @exception SnmpStatusException The specified name does not exist in this <CODE>SnmpOidDatabase</CODE>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public void remove(SnmpOidTable table) throws SnmpStatusException {

    /**
     * Removes a <CODE>SnmpOidTable</CODE> object from this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to be removed.
     * @exception SnmpStatusException The specified <CODE>SnmpOidTable</CODE> does not exist in this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public void add(SnmpOidTable table) {

    /**
     * Adds a <CODE>SnmpOidTable</CODE> object in this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidDatabaseSupport(SnmpOidTable table){

    /**
     * Creates an <CODE>SnmpOidDatabaseSupport</CODE> containing the specified <CODE>SnmpOidTable</CODE> object.
     * @param table The <CODE>SnmpOidTable</CODE> object used to initialize this <CODE>SnmpOidDatabaseSupport</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidDatabaseSupport(){

    /**
     * Creates an empty <CODE>SnmpOidDatabaseSupport</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
public class SnmpOidDatabaseSupport implements SnmpOidDatabase {

/**
 * Defines a set of <CODE>SnmpOidTable</CODE> objects containing metadata definitions for MIB variables.
 * Each <CODE>SnmpOidTable</CODE> should contain information on variables of one MIB.
 * It provides resolution of all MIB variables contained in the <CODE>SnmpOidTable</CODE> objects.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public void removeAll(){

    /**
     * Removes all <CODE>SnmpOidTable</CODE> objects from this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public Vector<?> getAllEntries() {

    /**
     * Returns a list that can be used to traverse all the entries of the <CODE>SnmpOidTable</CODE> objects
     * of this <CODE>SnmpOidDatabase</CODE>.
     * @return A vector of <CODE>SnmpOidTable</CODE> objects containing all the elements of this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidRecord resolveVarOid(String oid) throws SnmpStatusException {

    /**
     * Searches for a MIB variable given its OID and returns an <CODE>SnmpOidRecord</CODE> object containing
     * information on the variable.
     * @param oid The OID of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     * @exception SnmpStatusException The specified oid does not exist in this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidRecord resolveVarName(String name) throws SnmpStatusException {

    /**
     * Searches for a MIB variable given its logical name and returns an <CODE>SnmpOidRecord</CODE>
     * object containing information on the variable.
     * @param name The name of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     *
     * @exception SnmpStatusException The specified name does not exist in this <CODE>SnmpOidDatabase</CODE>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public void remove(SnmpOidTable table) throws SnmpStatusException {

    /**
     * Removes a <CODE>SnmpOidTable</CODE> object from this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to be removed.
     * @exception SnmpStatusException The specified <CODE>SnmpOidTable</CODE> does not exist in this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public void add(SnmpOidTable table) {

    /**
     * Adds a <CODE>SnmpOidTable</CODE> object in this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidDatabaseSupport(SnmpOidTable table){

    /**
     * Creates an <CODE>SnmpOidDatabaseSupport</CODE> containing the specified <CODE>SnmpOidTable</CODE> object.
     * @param table The <CODE>SnmpOidTable</CODE> object used to initialize this <CODE>SnmpOidDatabaseSupport</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
    public SnmpOidDatabaseSupport(){

    /**
     * Creates an empty <CODE>SnmpOidDatabaseSupport</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabaseSupport.java
public class SnmpOidDatabaseSupport implements SnmpOidDatabase {

/**
 * Defines a set of <CODE>SnmpOidTable</CODE> objects containing metadata definitions for MIB variables.
 * Each <CODE>SnmpOidTable</CODE> should contain information on variables of one MIB.
 * It provides resolution of all MIB variables contained in the <CODE>SnmpOidTable</CODE> objects.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
