_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public static void appendToOid(int l, SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpStringFixed</CODE> to another OID.
     * @param l Unused.
     * @param source An OID representing an <CODE>SnmpStringFixed</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public static int nextOid(int l, long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skip the string value and returns the position
     * of the next value.
     * @param l The number of successive array elements to be passed
     * in order to get the position of the next value.
     * These elements are passed starting at the <CODE>start</CODE> position.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no string value
     * available at the start position.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public static SnmpOid toOid(int l, long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the fixed-string from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param l The number of successive array elements to be retreived
     * in order to construct the OID.
     * These elements are retreived starting at the <CODE>start</CODE> position.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the fixed-string value.
     * @exception SnmpStatusException There is no string value
     * available at the start position.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public SnmpStringFixed(int l, String s) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpStringFixed</CODE> from the specified <CODE>String</CODE>
     * with the specified length.
     * @param l The length of the fixed-string.
     * @param s The <CODE>String</CODE> composing the fixed-string value.
     * @exception IllegalArgumentException Either the length or the <CODE>String</CODE> is not valid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public SnmpStringFixed(int l, Byte[] v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpStringFixed</CODE> from the specified <CODE>Bytes</CODE> array
     * with the specified length.
     * @param l The length of the fixed-string.
     * @param v The <CODE>Bytes</CODE> composing the fixed-string value.
     * @exception IllegalArgumentException Either the length or the <CODE>Byte</CODE> array is not valid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public SnmpStringFixed(int l, byte[] v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpStringFixed</CODE> from the specified <CODE>bytes</CODE> array
     * with the specified length.
     * @param l The length of the fixed-string.
     * @param v The <CODE>bytes</CODE> composing the fixed-string value.
     * @exception IllegalArgumentException Either the length or the <CODE>byte</CODE> array is not valid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public SnmpStringFixed(String v) {

    /**
     * Constructs a new <CODE>SnmpStringFixed</CODE> from the specified <CODE>String</CODE> value.
     * @param v The initialization value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public SnmpStringFixed(Byte[] v) {

    /**
     * Constructs a new <CODE>SnmpStringFixed</CODE> with the specified <CODE>Bytes</CODE> array.
     * @param v The <CODE>Bytes</CODE> composing the fixed-string value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
    public SnmpStringFixed(byte[] v) {

    /**
     * Constructs a new <CODE>SnmpStringFixed</CODE> from the specified bytes array.
     * @param v The bytes composing the fixed-string value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpStringFixed.java
public class SnmpStringFixed extends SnmpString {

/**
 * Represents an SNMP String defined with a fixed length.
 * The class is mainly used when dealing with table indexes for which one of the keys
 * is defined as a <CODE>String</CODE>.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
