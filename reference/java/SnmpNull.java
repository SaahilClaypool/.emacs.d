_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    private int tag = 5 ;

    /**
     * This is the tag of the NULL value. By default, it is the universal tag value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    final static String name = "Null" ;

    /**
     * Name of the type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public boolean isEndOfMibViewValue() {

    /**
     * Checks if this <CODE>SnmpNull</CODE> object corresponds to an <CODE>endOfMibView</CODE> value.
     * @return <CODE>true</CODE> if the tag equals {@link com.sun.jmx.snmp.SnmpDataTypeEnums#errEndOfMibViewTag},
     * <CODE>false</CODE> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public boolean isNoSuchInstanceValue() {

    /**
     * Checks if this <CODE>SnmpNull</CODE> object corresponds to a <CODE>noSuchInstance</CODE> value.
     * @return <CODE>true</CODE> if the tag equals {@link com.sun.jmx.snmp.SnmpDataTypeEnums#errNoSuchInstanceTag},
     * <CODE>false</CODE> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public boolean isNoSuchObjectValue() {

    /**
     * Checks if this <CODE>SnmpNull</CODE> object corresponds to a <CODE>noSuchObject</CODE> value.
     * @return <CODE>true</CODE> if the tag equals {@link com.sun.jmx.snmp.SnmpDataTypeEnums#errNoSuchObjectTag},
     * <CODE>false</CODE> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    final public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    final synchronized public Object clone() {

    /**
     * Clones the <CODE>SnmpNull</CODE> object, making a copy of its data.
     * @return The object clone.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    final synchronized public SnmpValue duplicate() {

    /**
     * Performs a clone action. This provides a workaround for the
     * <CODE>SnmpValue</CODE> interface.
     * @return The SnmpValue clone.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public SnmpOid toOid() {

    /**
     * Converts the <CODE>NULL</CODE> value to its <CODE>SnmpOid</CODE> form.
     * Normally, a <CODE>NULL</CODE> value cannot be used as an index value,
     * this method triggers an exception.
     * @return The OID representation of the value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public String toString() {

    /**
     * Converts the <CODE>NULL</CODE> value to its ASN.1 <CODE>String</CODE> form.
     * When the tag is not the universal one, it is preprended
     * to the <CODE>String</CODE> form.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public int getTag() {

    /**
     * Returns the tag value of this <CODE>SnmpNull</CODE>.
     * @return The value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public SnmpNull(int t) {

    /**
     * Constructs a new <CODE>SnmpNull</CODE> from the specified tag value.
     * @param t The initialization value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public SnmpNull(String dummy) {

    /**
     * Constructs a new <CODE>SnmpNull</CODE>.
     * <BR>For mibgen private use only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
    public SnmpNull() {

    /**
     * Constructs a new <CODE>SnmpNull</CODE>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpNull.java
public class SnmpNull extends SnmpValue {

/**
 * Represents an SNMP null value.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
