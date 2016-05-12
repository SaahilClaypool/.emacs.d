_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    static final long serialVersionUID = 8956237235607885096L;

    /**
     * Ensure serialization compatibility with version 4.1 FCS
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    private static SnmpOidTable meta= null;

    /**
     * Reference to a mib table. If no mib table is available,
     * the class will not be able to resolve names contained in the Object Identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    final static String  name = "Object Identifier";

    /**
     * The name of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    protected int componentCount = 0 ;

    /**
     * The length of the components' array.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    protected long components[] = null ;

    /**
     * The components' array.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    private void enlargeIfNeeded(int n) {

    /**
     * Checks if there is enough space in the components
     * array to insert n new subids. If not, it increases the size of
     * the array.
     * In fact it reallocates a new array and copy the old one into the new one.
     * @param n The number of subids to insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    private byte[] tobyte() {

    /**
     * convert the components array into a byte array
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String toOctetString() {

    /**
     * Converts an OID index converted string back to a DisplayString
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static void setSnmpOidTable(SnmpOidTable db) {

    /**
     * Sets the MIB table to use for resolving MIB variable names.
     * If no mib table is available, the class will not be able to resolve
     * names contained in the Object Identifier.
     * @param db The MIB table to use.
     * @throws SecurityException if the security manager is present and
     *         denies the access.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static SnmpOidTable getSnmpOidTable() {

    /**
     * Returns the MIB table used for resolving MIB variable names.
     * @return The MIB table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String resolveVarName(String s) throws SnmpStatusException {

    /**
     * Resolves a MIB variable <CODE>String</CODE> with the MIB database.
     * @param s The variable name to resolve.
     * @exception SnmpStatusException If the variable is not found in the MIB database.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public int compareTo(SnmpOid other) {

   /**
     * Compares two OIDs lexicographically.
     * @param other The OID to be compared.
     * @return
     * The value 0 if the parameter <CODE>other</CODE> is equal to this <CODE>SnmpOid</CODE>.
     * A value smaller than 0 if this <CODE>SnmpOid</CODE> is lexicographically smaller than <CODE>other</CODE>.
     * A value larger than 0 if this <CODE>SnmpOid</CODE> is lexicographically larger than <CODE>other</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public int hashCode() {

     /**
     * The hashCode is computed from the OID components.
     * @return a hashCode for this SnmpOid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public boolean equals(Object o) {

    /**
     * Checks whether the specified <CODE>Object</CODE> is equal to this <CODE>SnmpOid</CODE>.
     * @param o The <CODE>Object</CODE> to be compared.
     * @return <CODE>true</CODE> if <CODE>o</CODE> is an <CODE>SnmpOid</CODE> instance and equal to this, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public boolean isValid() {

    /**
     * Checks the validity of the OID.
     * @return <CODE>true</CODE> if the OID is valid, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void addToOid(long []oid) throws SnmpStatusException {

    /**
     * Adds the specified array of longs to the end of this <CODE>SnmpOid</CODE>.
     * @param oid An array of longs.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void addToOid(String s) throws SnmpStatusException {

    /**
     * Adds the specified dot-formatted OID <CODE>String</CODE> to the end of this <CODE>SnmpOid</CODE>.
     * The subidentifiers can be expressed as a dot-formatted <CODE>String</CODE> or a
     * MIB variable name.
     * @param s Variable name of the form .1.2.3 or  1.2.3 or
     * <CODE>ifInOctets</CODE>.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void append(long id) {

    /**
     * Appends the specified long to the end of this <CODE>SnmpOid</CODE>.
     * @param id The long to append.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void append(SnmpOid oid) {

    /**
     * Appends the specified <CODE>SnmpOid</CODE> to the end of this <CODE>SnmpOid</CODE>.
     * @param oid The OID to append.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void insert(int id) {

    /**
     * Inserts a subid at the beginning of this <CODE>SnmpOid</CODE>.
     * @param id The integer subid to insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void insert(long id) {

    /**
     * Inserts a subid at the beginning of this <CODE>SnmpOid</CODE>.
     * @param id The long subid to insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Object clone() {

    /**
     * Clones the <CODE>SnmpOid</CODE> object, making a copy of its data.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    final synchronized public SnmpValue duplicate() {

    /**
     * Performs a clone action. This provides a workaround for the
     * <CODE>SnmpValue</CODE> interface.
     * @return The SnmpValue clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static void appendToOid(SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpOid</CODE> to another OID.
     * @param source An OID representing an <CODE>SnmpOid</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static int nextOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skips the OID value and returns the position
     * of the next value.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no OID value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static SnmpOid toOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the OID from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the OID value.
     * @exception SnmpStatusException There is no OID value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid toOid() {

    /**
     * Converts the OID value to its <CODE>SnmpOid</CODE> form.
     * @return The OID representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Byte[] toByte() {

    /**
     * Converts the OID value to its array of <CODE>Bytes</CODE> form.
     * @return The array of <CODE>Bytes</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Boolean toBoolean() {

    /**
     * Converts the OID value to its <CODE>Boolean</CODE> form.
     * @return The <CODE>Boolean</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String toString() {

    /**
     * Converts the OID value to its <CODE>String</CODE> form.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Integer toInteger() {

    /**
     * Converts the OID value to its <CODE>Integer</CODE> form.
     * @return The <CODE>Integer</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Long toLong() {

    /**
     * Converts the OID value to its <CODE>Long</CODE> form.
     * @return The <CODE>Long</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public final long getOidArc(int pos) throws SnmpStatusException {

    /**
     * Returns the value of the OID arc found at the requested position
     * in the <CODE>components</CODE> array. The first element is at
     * position <code>0</code>.
     *
     * @param  pos The position at which the OID arc should be peeked.
     *
     * @return The OID arc found at the requested position.
     *
     * @exception SnmpStatusException No OID arc was found at the requested
     *            position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public final long[] longValue(boolean duplicate) {

    /**
     * Returns the components array of this <CODE>SnmpOid</CODE>.
     * If <code>duplicate</code> is true, a copy is returned.
     * Otherwise, a reference to the internal array is returned,
     * in which case the caller <b>shall not</b> modify this array.
     * This method is provided to optimize processing in those cases
     * where the caller needs only to read the components array.
     *
     * @param duplicate Indicates whether a copy or a reference must
     *        be returned:
     *        <li><code>true</code> if a copy must be returned,</li>
     *        <li><code>false</code> if a reference on the internal data
     *            can be returned.</li>
     * @return A copy of (or a reference on) the components array.
     * @Deprecated use {@link #longValue()}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public long[] longValue() {

    /**
     * Returns a copy of the components array of this <CODE>SnmpOid</CODE>.
     * @return The copy of the components array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public int getLength() {

    /**
     * Gets the number of components in this OID.
     * @return The number of components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(String s) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> from a dot-formatted <CODE>String</CODE> or a MIB variable
     * name. It generates an exception if the variable name cannot be resolved, or
     * if the dot-formatted <CODE>String</CODE> has an invalid subidentifier.
     * This constructor helps build an OID object with a <CODE>String</CODE> like .1.2.3.4 or 1.2.3.4
     * or <CODE>ifInOctets</CODE> or <CODE>ifInOctets</CODE>.0.
     * @param s <CODE>String</CODE> or MIB variable of the form .1.2.3 or 1.2.3 or <CODE>ifInOctets</CODE>.
     * @exception IllegalArgumentException The subidentifier is neither a numeric <CODE>String</CODE>
     * nor a <CODE>String</CODE> of the MIB database.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(long id1, long id2, long id3, long id4) {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> containing four components
     * with the specified values.
     * @param id1 The first component value.
     * @param id2 The second component values.
     * @param id3 The third component values.
     * @param id4 The fourth component values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(long id) {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> containing one component with the
     * specified value.
     * @param id The initialization component value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(long[] oidComponents) {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> from the specified component array.
     * @param oidComponents The initialization component array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid() {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> with no components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
public class SnmpOid extends SnmpValue {

/**
 * Represents an SNMP Object Identifier (OID).
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    static final long serialVersionUID = 8956237235607885096L;

    /**
     * Ensure serialization compatibility with version 4.1 FCS
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    private static SnmpOidTable meta= null;

    /**
     * Reference to a mib table. If no mib table is available,
     * the class will not be able to resolve names contained in the Object Identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    final static String  name = "Object Identifier";

    /**
     * The name of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    protected int componentCount = 0 ;

    /**
     * The length of the components' array.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    protected long components[] = null ;

    /**
     * The components' array.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    private void enlargeIfNeeded(int n) {

    /**
     * Checks if there is enough space in the components
     * array to insert n new subids. If not, it increases the size of
     * the array.
     * In fact it reallocates a new array and copy the old one into the new one.
     * @param n The number of subids to insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    private byte[] tobyte() {

    /**
     * convert the components array into a byte array
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String toOctetString() {

    /**
     * Converts an OID index converted string back to a DisplayString
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static void setSnmpOidTable(SnmpOidTable db) {

    /**
     * Sets the MIB table to use for resolving MIB variable names.
     * If no mib table is available, the class will not be able to resolve
     * names contained in the Object Identifier.
     * @param db The MIB table to use.
     * @throws SecurityException if the security manager is present and
     *         denies the access.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static SnmpOidTable getSnmpOidTable() {

    /**
     * Returns the MIB table used for resolving MIB variable names.
     * @return The MIB table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String resolveVarName(String s) throws SnmpStatusException {

    /**
     * Resolves a MIB variable <CODE>String</CODE> with the MIB database.
     * @param s The variable name to resolve.
     * @exception SnmpStatusException If the variable is not found in the MIB database.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public int compareTo(SnmpOid other) {

   /**
     * Compares two OIDs lexicographically.
     * @param other The OID to be compared.
     * @return
     * The value 0 if the parameter <CODE>other</CODE> is equal to this <CODE>SnmpOid</CODE>.
     * A value smaller than 0 if this <CODE>SnmpOid</CODE> is lexicographically smaller than <CODE>other</CODE>.
     * A value larger than 0 if this <CODE>SnmpOid</CODE> is lexicographically larger than <CODE>other</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public int hashCode() {

     /**
     * The hashCode is computed from the OID components.
     * @return a hashCode for this SnmpOid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public boolean equals(Object o) {

    /**
     * Checks whether the specified <CODE>Object</CODE> is equal to this <CODE>SnmpOid</CODE>.
     * @param o The <CODE>Object</CODE> to be compared.
     * @return <CODE>true</CODE> if <CODE>o</CODE> is an <CODE>SnmpOid</CODE> instance and equal to this, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public boolean isValid() {

    /**
     * Checks the validity of the OID.
     * @return <CODE>true</CODE> if the OID is valid, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void addToOid(long []oid) throws SnmpStatusException {

    /**
     * Adds the specified array of longs to the end of this <CODE>SnmpOid</CODE>.
     * @param oid An array of longs.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void addToOid(String s) throws SnmpStatusException {

    /**
     * Adds the specified dot-formatted OID <CODE>String</CODE> to the end of this <CODE>SnmpOid</CODE>.
     * The subidentifiers can be expressed as a dot-formatted <CODE>String</CODE> or a
     * MIB variable name.
     * @param s Variable name of the form .1.2.3 or  1.2.3 or
     * <CODE>ifInOctets</CODE>.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void append(long id) {

    /**
     * Appends the specified long to the end of this <CODE>SnmpOid</CODE>.
     * @param id The long to append.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void append(SnmpOid oid) {

    /**
     * Appends the specified <CODE>SnmpOid</CODE> to the end of this <CODE>SnmpOid</CODE>.
     * @param oid The OID to append.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void insert(int id) {

    /**
     * Inserts a subid at the beginning of this <CODE>SnmpOid</CODE>.
     * @param id The integer subid to insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public void insert(long id) {

    /**
     * Inserts a subid at the beginning of this <CODE>SnmpOid</CODE>.
     * @param id The long subid to insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Object clone() {

    /**
     * Clones the <CODE>SnmpOid</CODE> object, making a copy of its data.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    final synchronized public SnmpValue duplicate() {

    /**
     * Performs a clone action. This provides a workaround for the
     * <CODE>SnmpValue</CODE> interface.
     * @return The SnmpValue clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static void appendToOid(SnmpOid source, SnmpOid dest) {

    /**
     * Appends an <CODE>SnmpOid</CODE> representing an <CODE>SnmpOid</CODE> to another OID.
     * @param source An OID representing an <CODE>SnmpOid</CODE> value.
     * @param dest Where source should be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static int nextOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Scans an index OID, skips the OID value and returns the position
     * of the next value.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The position of the next value.
     * @exception SnmpStatusException There is no OID value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public static SnmpOid toOid(long[] index, int start) throws SnmpStatusException {

    /**
     * Extracts the OID from an index OID and returns its
     * value converted as an <CODE>SnmpOid</CODE>.
     * @param index The index array.
     * @param start The position in the index array.
     * @return The OID representing the OID value.
     * @exception SnmpStatusException There is no OID value
     * available at the start position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid toOid() {

    /**
     * Converts the OID value to its <CODE>SnmpOid</CODE> form.
     * @return The OID representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Byte[] toByte() {

    /**
     * Converts the OID value to its array of <CODE>Bytes</CODE> form.
     * @return The array of <CODE>Bytes</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Boolean toBoolean() {

    /**
     * Converts the OID value to its <CODE>Boolean</CODE> form.
     * @return The <CODE>Boolean</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public String toString() {

    /**
     * Converts the OID value to its <CODE>String</CODE> form.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Integer toInteger() {

    /**
     * Converts the OID value to its <CODE>Integer</CODE> form.
     * @return The <CODE>Integer</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public Long toLong() {

    /**
     * Converts the OID value to its <CODE>Long</CODE> form.
     * @return The <CODE>Long</CODE> representation of the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public final long getOidArc(int pos) throws SnmpStatusException {

    /**
     * Returns the value of the OID arc found at the requested position
     * in the <CODE>components</CODE> array. The first element is at
     * position <code>0</code>.
     *
     * @param  pos The position at which the OID arc should be peeked.
     *
     * @return The OID arc found at the requested position.
     *
     * @exception SnmpStatusException No OID arc was found at the requested
     *            position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public final long[] longValue(boolean duplicate) {

    /**
     * Returns the components array of this <CODE>SnmpOid</CODE>.
     * If <code>duplicate</code> is true, a copy is returned.
     * Otherwise, a reference to the internal array is returned,
     * in which case the caller <b>shall not</b> modify this array.
     * This method is provided to optimize processing in those cases
     * where the caller needs only to read the components array.
     *
     * @param duplicate Indicates whether a copy or a reference must
     *        be returned:
     *        <li><code>true</code> if a copy must be returned,</li>
     *        <li><code>false</code> if a reference on the internal data
     *            can be returned.</li>
     * @return A copy of (or a reference on) the components array.
     * @Deprecated use {@link #longValue()}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public long[] longValue() {

    /**
     * Returns a copy of the components array of this <CODE>SnmpOid</CODE>.
     * @return The copy of the components array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public int getLength() {

    /**
     * Gets the number of components in this OID.
     * @return The number of components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(String s) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> from a dot-formatted <CODE>String</CODE> or a MIB variable
     * name. It generates an exception if the variable name cannot be resolved, or
     * if the dot-formatted <CODE>String</CODE> has an invalid subidentifier.
     * This constructor helps build an OID object with a <CODE>String</CODE> like .1.2.3.4 or 1.2.3.4
     * or <CODE>ifInOctets</CODE> or <CODE>ifInOctets</CODE>.0.
     * @param s <CODE>String</CODE> or MIB variable of the form .1.2.3 or 1.2.3 or <CODE>ifInOctets</CODE>.
     * @exception IllegalArgumentException The subidentifier is neither a numeric <CODE>String</CODE>
     * nor a <CODE>String</CODE> of the MIB database.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(long id1, long id2, long id3, long id4) {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> containing four components
     * with the specified values.
     * @param id1 The first component value.
     * @param id2 The second component values.
     * @param id3 The third component values.
     * @param id4 The fourth component values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(long id) {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> containing one component with the
     * specified value.
     * @param id The initialization component value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid(long[] oidComponents) {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> from the specified component array.
     * @param oidComponents The initialization component array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
    public SnmpOid() {

    /**
     * Constructs a new <CODE>SnmpOid</CODE> with no components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpOid.java
public class SnmpOid extends SnmpValue {

/**
 * Represents an SNMP Object Identifier (OID).
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
