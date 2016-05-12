_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    private long value = 0 ;

    /**
     * This is where the value is stored. This long is positive.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final static String name = "Counter64" ;

    /**
     * Name of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final synchronized public Object clone() {

    /**
     * Clones the <CODE>SnmpCounter64</CODE> object, making a copy of its data.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final synchronized public SnmpValue duplicate() {

    /**
     * Performs a clone action. This provides a workaround for the
     * <CODE>SnmpValue</CODE> interface.
     * @return The SnmpValue clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public static void appendToOid(SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpCounter64</CODE> to another OID.
     * @param source An OID representing an <CODE>SnmpCounter64</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public static int nextOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skips the counter value and returns the position
     * of the next value.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no counter value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public static SnmpOid toOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the counter from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the counter value.
     * @exception SnmpStatusException There is no counter value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public SnmpOid toOid() {

    /**
     * Converts the counter value to its <CODE>SnmpOid</CODE> form.
     * @return The OID representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public String toString() {

    /**
     * Converts the counter value to its <CODE>String</CODE> form.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public Integer toInteger() {

    /**
     * Converts the counter value to its <CODE>Integer</CODE> form.
     * @return The <CODE>Integer</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public int intValue() {

    /**
     * Converts the counter value to its integer form.
     * @return The integer representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public Long toLong() {

    /**
     * Converts the counter value to its <CODE>Long</CODE> form.
     * @return The <CODE>Long</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public long longValue() {

    /**
     * Returns the counter value of this <CODE>SnmpCounter64</CODE>.
     * @return The value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public SnmpCounter64(Long v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpCounter64</CODE> from the specified <CODE>Long</CODE> value.
     * @param v The initialization value.
     * @exception IllegalArgumentException The specified value is negative
     * or larger than <CODE>Long.MAX_VALUE</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public SnmpCounter64(long v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpCounter64</CODE> from the specified long value.
     * @param v The initialization value.
     * @exception IllegalArgumentException The specified value is negative
     * or larger than <CODE>Long.MAX_VALUE</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
public class SnmpCounter64 extends SnmpValue {

/**
 * Represents an SNMP 64bits counter.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    private long value = 0 ;

    /**
     * This is where the value is stored. This long is positive.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final static String name = "Counter64" ;

    /**
     * Name of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final synchronized public Object clone() {

    /**
     * Clones the <CODE>SnmpCounter64</CODE> object, making a copy of its data.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    final synchronized public SnmpValue duplicate() {

    /**
     * Performs a clone action. This provides a workaround for the
     * <CODE>SnmpValue</CODE> interface.
     * @return The SnmpValue clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public static void appendToOid(SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpCounter64</CODE> to another OID.
     * @param source An OID representing an <CODE>SnmpCounter64</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public static int nextOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skips the counter value and returns the position
     * of the next value.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no counter value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public static SnmpOid toOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the counter from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the counter value.
     * @exception SnmpStatusException There is no counter value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public SnmpOid toOid() {

    /**
     * Converts the counter value to its <CODE>SnmpOid</CODE> form.
     * @return The OID representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public String toString() {

    /**
     * Converts the counter value to its <CODE>String</CODE> form.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public Integer toInteger() {

    /**
     * Converts the counter value to its <CODE>Integer</CODE> form.
     * @return The <CODE>Integer</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public int intValue() {

    /**
     * Converts the counter value to its integer form.
     * @return The integer representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public Long toLong() {

    /**
     * Converts the counter value to its <CODE>Long</CODE> form.
     * @return The <CODE>Long</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public long longValue() {

    /**
     * Returns the counter value of this <CODE>SnmpCounter64</CODE>.
     * @return The value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public SnmpCounter64(Long v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpCounter64</CODE> from the specified <CODE>Long</CODE> value.
     * @param v The initialization value.
     * @exception IllegalArgumentException The specified value is negative
     * or larger than <CODE>Long.MAX_VALUE</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
    public SnmpCounter64(long v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpCounter64</CODE> from the specified long value.
     * @param v The initialization value.
     * @exception IllegalArgumentException The specified value is negative
     * or larger than <CODE>Long.MAX_VALUE</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpCounter64.java
public class SnmpCounter64 extends SnmpValue {

/**
 * Represents an SNMP 64bits counter.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
