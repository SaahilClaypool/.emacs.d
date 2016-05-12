_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public Vector<?> getAllEntries() ;

    /**
     * Returns a list that can be used to traverse all the entries of the <CODE>SnmpOidTable</CODE> objects
     * of this <CODE>SnmpOidDatabase</CODE>.
     * @return A vector of <CODE>SnmpOidTable</CODE> objects containing all the elements of this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public SnmpOidRecord resolveVarOid(String oid) throws SnmpStatusException;

    /**
     * Searches for a MIB variable given its OID and returns an <CODE>SnmpOidRecord</CODE> object containing
     * information on the variable.
     * @param oid The OID of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public SnmpOidRecord resolveVarName(String name) throws SnmpStatusException ;

    /**
     * Searches for a MIB variable given its logical name and returns an <CODE>SnmpOidRecord</CODE>
     * object containing information on the variable.
     * @param name The name of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public void removeAll();

    /**
     * Removes all the <CODE>SnmpOidTable</CODE> objects from this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public void remove(SnmpOidTable table) throws SnmpStatusException;

    /**
     * Removes an <CODE>SnmpOidTable</CODE> object from this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public void add(SnmpOidTable table);

    /**
     * Adds an <CODE>SnmpOidTable</CODE> object in this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
public interface SnmpOidDatabase extends SnmpOidTable {

/**
 * Defines the minimal functionality that should be provided by
 * a class containing a set of <CODE>SnmpOidTable</CODE> objects containing metadata definitions for MIB variables.
 * Each <CODE>SnmpOidTable</CODE> should contain information on variables of one MIB.
 * The <CODE>SnmpOidDatabase</CODE> is a "repository" of <CODE>SnmpOidTable</CODE>.
 * It extends the <CODE>SnmpOidTable</CODE> interface in order to provide resolution of the MIB variables.
 * <P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.SnmpOidTable
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public Vector<?> getAllEntries() ;

    /**
     * Returns a list that can be used to traverse all the entries of the <CODE>SnmpOidTable</CODE> objects
     * of this <CODE>SnmpOidDatabase</CODE>.
     * @return A vector of <CODE>SnmpOidTable</CODE> objects containing all the elements of this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public SnmpOidRecord resolveVarOid(String oid) throws SnmpStatusException;

    /**
     * Searches for a MIB variable given its OID and returns an <CODE>SnmpOidRecord</CODE> object containing
     * information on the variable.
     * @param oid The OID of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public SnmpOidRecord resolveVarName(String name) throws SnmpStatusException ;

    /**
     * Searches for a MIB variable given its logical name and returns an <CODE>SnmpOidRecord</CODE>
     * object containing information on the variable.
     * @param name The name of the MIB variable.
     * @return The <CODE>SnmpOidRecord</CODE> object containing information on the variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public void removeAll();

    /**
     * Removes all the <CODE>SnmpOidTable</CODE> objects from this <CODE>SnmpOidDatabase</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public void remove(SnmpOidTable table) throws SnmpStatusException;

    /**
     * Removes an <CODE>SnmpOidTable</CODE> object from this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
    public void add(SnmpOidTable table);

    /**
     * Adds an <CODE>SnmpOidTable</CODE> object in this <CODE>SnmpOidDatabase</CODE>.
     * @param table The table to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOidDatabase.java
public interface SnmpOidDatabase extends SnmpOidTable {

/**
 * Defines the minimal functionality that should be provided by
 * a class containing a set of <CODE>SnmpOidTable</CODE> objects containing metadata definitions for MIB variables.
 * Each <CODE>SnmpOidTable</CODE> should contain information on variables of one MIB.
 * The <CODE>SnmpOidDatabase</CODE> is a "repository" of <CODE>SnmpOidTable</CODE>.
 * It extends the <CODE>SnmpOidTable</CODE> interface in order to provide resolution of the MIB variables.
 * <P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.SnmpOidTable
 */
