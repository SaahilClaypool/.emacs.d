_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    final static String name = "IpAddress" ;

    /**
     * Name of the type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    private void buildFromByteArray(byte[] bytes) {

    /**
     * Build Ip address from byte array.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    final public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public static void appendToOid(SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpIpAddress</CODE> to another OID.
     * @param source An OID representing an <CODE>SnmpIpAddress</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public static int nextOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skips the address value and returns the position
     * of the next value.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no address value
     * available at the start position.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public static SnmpOid toOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the ip address from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the ip address value.
     * @exception SnmpStatusException There is no ip address value
     * available at the start position.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public String stringValue() {

    /**
     * Converts the address to its <CODE>String</CODE> form.
     * Same as <CODE>toString()</CODE>. Exists only to follow a naming scheme.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public byte[] byteValue() {

    /**
     * Converts the address value to its byte array form.
     * @return The byte array representation of the value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public SnmpIpAddress(long b1, long b2, long b3, long b4) {

    /**
     * Constructs a new <CODE>SnmpIpAddress</CODE> from four long values.
     * @param b1 Byte 1.
     * @param b2 Byte 2.
     * @param b3 Byte 3.
     * @param b4 Byte 4.
     * @exception IllegalArgumentException A value is outside of [0-255].
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public SnmpIpAddress(String dotAddress) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpIpAddress</CODE> from a dot-formatted <CODE>String</CODE>.
     * The dot-formatted <CODE>String</CODE> is formulated x.x.x.x .
     * @param dotAddress The initialization value.
     * @exception IllegalArgumentException The string does not correspond to an ip address.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public SnmpIpAddress(long addr) {

    /**
     * Constructs a new <CODE>SnmpIpAddress</CODE> from the specified long value.
     * @param addr The initialization value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
    public SnmpIpAddress(byte[] bytes) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpIpAddress</CODE> from the specified bytes array.
     * @param bytes The four bytes composing the address.
     * @exception IllegalArgumentException The length of the array is not equal to four.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpIpAddress.java
public class SnmpIpAddress extends SnmpOid {

/**
 * Represents an SNMP IpAddress.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
