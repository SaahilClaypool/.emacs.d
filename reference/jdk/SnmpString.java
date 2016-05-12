_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    protected byte[] value = null ;

    /**
     * This is the bytes array of the string value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    final static String name = "String" ;

    /**
     * Name of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    synchronized public Object clone() {

    /**
     * Clones the <CODE>SnmpString</CODE> object, making a copy of its data.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    final synchronized public SnmpValue duplicate() {

    /**
     * Performs a clone action. This provides a workaround for the
     * <CODE>SnmpValue</CODE> interface.
     * @return The SnmpValue clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static void appendToOid(SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpString</CODE> to another OID.
     * @param source An OID representing an <CODE>SnmpString</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static int nextOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skips the string value and returns the position
     * of the next value.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no string value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static SnmpOid toOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the string from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the string value.
     * @exception SnmpStatusException There is no string value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpOid toOid() {

    /**
     * Converts the string value to its <CODE>SnmpOid</CODE> form.
     * @return The OID representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public String toString() {

    /**
     * Converts the string value to its <CODE>String</CODE> form.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public Byte[] toByte() {

    /**
     * Converts the string value to its array of <CODE>Bytes</CODE> form.
     * @return The array of <CODE>Bytes</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public byte[] byteValue() {

    /**
     * Returns the bytes array of this <CODE>SnmpString</CODE>.
     * @return The value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static String HexToChar(String hex) {

    /**
     * Converts the specified hexadecimal string into a character string.
     * @param hex The hexadecimal string value to convert.
     * @return The character string representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static String BinToChar(String bin) {

    /**
     * Converts the specified binary string into a character string.
     * @param bin The binary string value to convert.
     * @return The character string representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public InetAddress inetAddressValue() throws UnknownHostException {

    /**
     * Converts the string value to its <CODE> InetAddress </CODE> form.
     * @return an {@link InetAddress} defined by the string value.
     * @exception UnknownHostException If string value is not a legal address format.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(InetAddress address) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified <CODE> InetAddress </Code>.
     * @param address The <CODE>InetAddress </CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(String v) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified <CODE>String</CODE> value.
     * @param v The initialization value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(Byte[] v) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified <CODE>Bytes</CODE> array.
     * @param v The <CODE>Bytes</CODE> composing the string value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(byte[] v) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified bytes array.
     * @param v The bytes composing the string value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString() {

    /**
     * Constructs a new empty <CODE>SnmpString</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
public class SnmpString extends SnmpValue {

/**
 * Represents an SNMP string.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    protected byte[] value = null ;

    /**
     * This is the bytes array of the string value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    final static String name = "String" ;

    /**
     * Name of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    synchronized public Object clone() {

    /**
     * Clones the <CODE>SnmpString</CODE> object, making a copy of its data.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    final synchronized public SnmpValue duplicate() {

    /**
     * Performs a clone action. This provides a workaround for the
     * <CODE>SnmpValue</CODE> interface.
     * @return The SnmpValue clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static void appendToOid(SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpString</CODE> to another OID.
     * @param source An OID representing an <CODE>SnmpString</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static int nextOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skips the string value and returns the position
     * of the next value.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no string value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static SnmpOid toOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the string from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the string value.
     * @exception SnmpStatusException There is no string value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpOid toOid() {

    /**
     * Converts the string value to its <CODE>SnmpOid</CODE> form.
     * @return The OID representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public String toString() {

    /**
     * Converts the string value to its <CODE>String</CODE> form.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public Byte[] toByte() {

    /**
     * Converts the string value to its array of <CODE>Bytes</CODE> form.
     * @return The array of <CODE>Bytes</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public byte[] byteValue() {

    /**
     * Returns the bytes array of this <CODE>SnmpString</CODE>.
     * @return The value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static String HexToChar(String hex) {

    /**
     * Converts the specified hexadecimal string into a character string.
     * @param hex The hexadecimal string value to convert.
     * @return The character string representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public static String BinToChar(String bin) {

    /**
     * Converts the specified binary string into a character string.
     * @param bin The binary string value to convert.
     * @return The character string representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public InetAddress inetAddressValue() throws UnknownHostException {

    /**
     * Converts the string value to its <CODE> InetAddress </CODE> form.
     * @return an {@link InetAddress} defined by the string value.
     * @exception UnknownHostException If string value is not a legal address format.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(InetAddress address) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified <CODE> InetAddress </Code>.
     * @param address The <CODE>InetAddress </CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(String v) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified <CODE>String</CODE> value.
     * @param v The initialization value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(Byte[] v) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified <CODE>Bytes</CODE> array.
     * @param v The <CODE>Bytes</CODE> composing the string value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString(byte[] v) {

    /**
     * Constructs a new <CODE>SnmpString</CODE> from the specified bytes array.
     * @param v The bytes composing the string value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
    public SnmpString() {

    /**
     * Constructs a new empty <CODE>SnmpString</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpString.java
public class SnmpString extends SnmpValue {

/**
 * Represents an SNMP string.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
