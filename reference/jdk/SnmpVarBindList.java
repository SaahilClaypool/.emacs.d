_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpVarBindList</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Removes all the elements from this <CODE>SnmpVarBindList</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized String varBindListToString() {

    /**
     * Constructs a <CODE>String</CODE> containing details of each <CODE>SnmpVarBindList</CODE> (oid+value).
     * This is typically used in debugging.
     * @return A detailed <CODE>String</CODE> of all in the <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public String oidListToString() {

    /**
     * Returns a <CODE>String</CODE> containing the ASCII representation of all OIDs in the list.
     * @return An ASCII list of all OIDs in this list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized Vector<SnmpVarBind> toVector(boolean copy) {

    /**
     * Copies the <CODE>SnmpVarBindList</CODE> into a plain vector of <CODE>SnmpVarBind</CODE> objects.
     * If the <code>copy</code> flag is false, does a shallow copy of the list. Otherwise,
     * individual elements will be cloned.
     * @param copy The flag indicating whether each object in the list should be cloned.
     * @return A new vector of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    @Override

    /**
     * Clones the <CODE>SnmpVarBindList</CODE>. A new copy of the <CODE>SnmpVarBindList</CODE> is created.
     * It is a real deep copy.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized SnmpVarBindList cloneWithoutValue() {

    /**
     * Clones the <CODE>SnmpVarBindList</CODE>. It does not clone the value part of the variable.
     * It is a deep copy (except for the value portion).
     * @return The <CODE>SnmpVarBindList</CODE> clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized SnmpVarBindList cloneWithValue() {

    /**
     * Clones the <CODE>SnmpVarBindList</CODE>. A new copy of the <CODE>SnmpVarBindList</CODE> is created.
     * It is a real deep copy.
     * @return The <CODE>SnmpVarBindList</CODE> clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int indexOfOid(SnmpOid oid) {

    /**
     * Gives the index of an OID in the <CODE>SnmpVarBindList</CODE>.
     * @param oid The <CODE>SnmpOid</CODE> object with the requested OID.
     * @return The index of the OID in <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int indexOfOid(SnmpVarBind var) {

    /**
     * Gives the index of an OID in the <CODE>SnmpVarBindList</CODE>.
     * @param var The <CODE>SnmpVarBind</CODE> object with the requested OID.
     * @return The index of the OID in <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int indexOfOid(SnmpVarBind var, int min, int max) {

    /**
     * Gives the index of an OID in the <CODE>SnmpVarBindList</CODE>.
     * The index returned must be greater than or equal to the <CODE>start</CODE> parameter
     * and smaller than the <CODE>end</CODE> parameter. Otherwise the method returns -1.
     * @param var The <CODE>SnmpVarBind</CODE> object with the requested OID.
     * @param min The min index in <CODE>SnmpVarBindList</CODE>.
     * @param max The max index in <CODE>SnmpVarBindList</CODE>.
     * @return The index of the OID in <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized SnmpVarBindList splitAt(int pos) {

    /**
     * Splits the <CODE>SnmpVarBindList</CODE>.
     * @param pos The position at which to split the <CODE>SnmpVarBindList</CODE>
     * @return The <CODE>SnmpVarBindList</CODE> list from the beginning up to the split position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean checkForUnspecifiedValue() {

    /**
     * Returns <CODE>true</CODE> if there is a value that is not specified.
     * @return <CODE>true</CODE> if there is a value that is not specified, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean checkForValidValues() {

    /**
     * Returns <CODE>false</CODE> if any of the variables does not contain a valid value.
     * Typically used for <CODE>SnmpSet</CODE> operations.
     * @return <CODE>false</CODE> if any of the variables does not contain a valid value, <CODE>true</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    final public synchronized void concat(Vector<SnmpVarBind> list) {

    /**
     * Adds elements in the specified <CODE>SnmpVarBindList</CODE> to this list.
     * The elements are not cloned.
     * @param list A vector of <CODE>SnmpVarBind</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addInstance(String inst) throws SnmpStatusException {

    /**
     * Adds the string as an instance part to all OIDs in this list.
     * This method should be used with caution because it affects all OIDs in the list.
     * @param inst The <CODE>String</CODE> to add as an instance part.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(SnmpVarBind var) {

    /**
     * Removes the given <CODE>SnmpVarBind</CODE> object from the existing <CODE>SnmpVarBindList</CODE>.
     * @param var The <CODE>SnmpVarBind</CODE> object to be removed.
     * @return <CODE>true</CODE> if the <CODE>SnmpVarBind</CODE> object was a component of this
     * <CODE>SnmpVarBindList</CODE>, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBind(SnmpVarBind var) {

    /**
     * Appends the given <CODE>SnmpVarBind</CODE> object to the existing <CODE>SnmpVarBindList</CODE>.
     * It creates a new <CODE>SnmpVarBindList</CODE> if one did not exist.
     * @param var The <CODE>SnmpVarBind</CODE> object to be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(String name) throws SnmpStatusException {

    /**
     * Removes the <CODE>SnmpVarBind</CODE> object corresponding to the given MIB variable from the existing
     * <CODE>SnmpVarBindList</CODE>.
     * @param name A MIB variable name.
     * @return <CODE>true</CODE> if the SNMP MIB variable was a component of this <CODE>SnmpVarBindList</CODE>,
     * <CODE>false</CODE> otherwise.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBind(String name) throws SnmpStatusException {

    /**
     * Creates an <CODE>SnmpVarBind</CODE> object from the given MIB variable and appends it to the existing
     * <CODE>SnmpVarBindList</CODE>.
     * It creates a new <CODE>SnmpVarBindList</CODE> if one did not exist.
     * @param name A MIB variable name.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(String list[]) throws SnmpStatusException {

    /**
     * Removes the array of SNMP MIB variables from the existing <CODE>SnmpVarBindList</CODE>.
     * @param list Array of strings containing MIB variable names.
     * @return <CODE>true</CODE> if all the SNMP MIB variables were components of this <CODE>SnmpVarBindList</CODE>,
     * <CODE>false</CODE> otherwise.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBind(String list[]) throws SnmpStatusException {

    /**
     * Adds an array of MIB variable names to the list. For example:
     * <P>
     * <CODE>
     * String mylist[] = {"sysUpTime.0", "ifInOctets.0"}
     * <BR>
     * vb.addVarBind(mylist) ;
     * </BR>
     * </CODE>
     * @param list The array of MIB variable names.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(String list[], String inst) throws SnmpStatusException {

    /**
     * Removes the array of SNMP MIB variables and instances from the existing <CODE>SnmpVarBindList</CODE>.
     * @param list An array of <CODE>String</CODE> containing MIB variable names.
     * @param inst A common instance for each of the MIB variables in <CODE>vlist</CODE>.
     * @return <CODE>true</CODE> if all the SNMP MIB variables were components of this <CODE>SnmpVarBindList</CODE>,
     * <CODE>false</CODE> otherwise.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void addVarBind(String list[], String inst) throws SnmpStatusException {

    /**
     * Prepares a vector of <CODE>SnmpVarBindList</CODE> from an array of SNMP MIB variables and instances.
     * @param list An array of <CODE>String</CODE> containing MIB variable names.
     * @param inst A common instance for each of the MIB variables in <CODE>vlist</CODE>.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void replaceVarBind(SnmpVarBind var, int pos) {

    /**
     * Replaces an element at a specified location with the new element.
     * @param var The replacement variable.
     * @param pos The location in the <CODE>SnmpVarBindList</CODE>.
     * @exception java.lang.ArrayIndexOutOfBoundsException If the specified <CODE>pos</CODE> is beyond range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBindList(SnmpVarBindList list) {

    /**
     * Removes all the <CODE>SnmpVarBind</CODE> objects of the given <CODE>SnmpVarBindList</CODE> from the existing
     * <CODE>SnmpVarBindList</CODE>.
     * @param list The <CODE>SnmpVarBindList</CODE> to be removed.
     * @return <CODE>true</CODE> if all the <CODE>SnmpVarBind</CODE> objects were components of this
     * <CODE>SnmpVarBindList</CODE>, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBindList(SnmpVarBindList list) {

    /**
     * Appends an <CODE>SnmpVarBindList</CODE> at the end of the current <CODE>SnmpVarBindList</CODE> object.
     * @param list The <CODE>SnmpVarBindList</CODE> to append.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void setVarBindList(Vector<SnmpVarBind> list, boolean copy) {

    /**
     * Replaces the current variable binding list of <CODE>SnmpVarBind</CODE> objects with the new variable binding
     * list of <CODE>SnmpVarBind</CODE> objects.
     * If <CODE>copy</CODE> is <CODE>true</CODE>, it will clone each <CODE>SnmpVarBind</CODE> object
     * contained in the list.
     * @param list A vector of <CODE>SnmpVarBind</CODE> objects.
     * @param copy The flag indicating whether each object in the list should be cloned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void setVarBindList(Vector<SnmpVarBind> list) {

    /**
     * Replaces the current variable binding list of <CODE>SnmpVarBind</CODE> with the new specified variable binding
     * list of <CODE>SnmpVarBind</CODE> objects.
     * This method only clones the vector. It does not clone the <CODE>SnmpVarBind</CODE> objects
     * contained in the list.
     * @param list A vector of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized Enumeration<SnmpVarBind> getVarBindList() {

    /**
     * This is a convenience function that returns an enumeration. This can be used to traverse the list.
     * This is advantageous as it hides the implementation of the class of the list which keeps the variables.
     * @return An enumeration object of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int getVarBindCount() {

    /**
     * Gets the number of elements in this list.
     * @return The number of elements in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized SnmpVarBind getVarBindAt(int pos) {

    /**
     * Gets an <CODE>SnmpVarBind</CODE> object.
     * @param pos The position in the list.
     * @return The <CODE>SnmpVarBind</CODE> object at the specified position.
     * @exception java.lang.ArrayIndexOutOfBoundsException If the specified <CODE>pos</CODE> is beyond range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public void setTimestamp(Timestamp tstamp) {

    /**
     * Records the <CODE>sysUpTime</CODE> and the actual time when this <CODE>SnmpVarBindList</CODE>
     * was changed or created.
     * This needs to be set explicitly.
     * @param tstamp The <CODE>SnmpTimestamp</CODE> of the device for which the values hold <CODE>true</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public Timestamp getTimestamp() {

    /**
     * Gets the <CODE>timestamp</CODE> associated with this <CODE>SnmpVarBindList</CODE>.
     * @return The <CODE>timestamp</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(String name, Vector<SnmpVarBind> list) {

    /**
     * Creates a new <CODE>SnmpVarBindList</CODE> object from a plain vector of <CODE>SnmpVarBind</CODE> objects.
     * Objects in the specified vector can be <CODE>SnmpVarBind</CODE> objects or derivatives.
     * @param name The name of the newly created <CODE>SnmpVarBindList</CODE>.
     * @param list The vector of <CODE>SnmpVarBind</CODE> objects to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(Vector<SnmpVarBind> list) {

    /**
     * Creates a new <CODE>SnmpVarBindList</CODE> object from a plain vector of <CODE>SnmpVarBind</CODE> objects.
     * Objects in the specified vector can be <CODE>SnmpVarBind</CODE> objects or derivatives.
     * @param list The vector of <CODE>SnmpVarBind</CODE> objects to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(SnmpVarBindList list) {

    /**
     * Similar to the copy constructor. Does a shallow copy of the elements.
     * Individual elements are not cloned.
     * @param list The <CODE>SnmpVarBindList</CODE> to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(String name) {

    /**
     * Prepares an empty list with a <CODE>String</CODE> to print while debugging.
     * @param name The name of the newly created <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(int initialCapacity) {

    /**
     * Prepares an empty list.
     * @param initialCapacity The initial capacity of the <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList() {

    /**
     * Prepares an empty list.
     * The initial capacity and the capacity increment are initialized to 5.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    Timestamp timestamp ;

    /**
     * Timestamp when this <CODE>SnmpVarBindList</CODE> was updated.
     * Valid only for <CODE>SnmpGet</CODE> and <CODE>SnmpGetNext</CODE> operations.
     * <CODE>SnmpTimestamp</CODE> is null by default.
     * Also, when the list is cloned without value the timestamp is not copied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public String identity = "VarBindList " ;   // name identifying this list.

    /**
     * A name given to the <CODE>SnmpVarBindList</CODE>. Useful for debugging.
     * The default name is "VarBindList".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
public class SnmpVarBindList extends Vector<SnmpVarBind> {

/**
 * Contains a list of <CODE>SnmpVarBind</CODE> objects.
 * This class helps to create an <CODE>SnmpVarBindList</CODE> from a list of MIB variable names.
 * In addition, it contains different forms of methods which can copy or clone the list.
 * This list is required by any SNMP entity which specifies a list of variables to query.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    @Override

    /**
     * Finalizer of the <CODE>SnmpVarBindList</CODE> objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more references to the object.
     * <P>Removes all the elements from this <CODE>SnmpVarBindList</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized String varBindListToString() {

    /**
     * Constructs a <CODE>String</CODE> containing details of each <CODE>SnmpVarBindList</CODE> (oid+value).
     * This is typically used in debugging.
     * @return A detailed <CODE>String</CODE> of all in the <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public String oidListToString() {

    /**
     * Returns a <CODE>String</CODE> containing the ASCII representation of all OIDs in the list.
     * @return An ASCII list of all OIDs in this list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized Vector<SnmpVarBind> toVector(boolean copy) {

    /**
     * Copies the <CODE>SnmpVarBindList</CODE> into a plain vector of <CODE>SnmpVarBind</CODE> objects.
     * If the <code>copy</code> flag is false, does a shallow copy of the list. Otherwise,
     * individual elements will be cloned.
     * @param copy The flag indicating whether each object in the list should be cloned.
     * @return A new vector of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    @Override

    /**
     * Clones the <CODE>SnmpVarBindList</CODE>. A new copy of the <CODE>SnmpVarBindList</CODE> is created.
     * It is a real deep copy.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized SnmpVarBindList cloneWithoutValue() {

    /**
     * Clones the <CODE>SnmpVarBindList</CODE>. It does not clone the value part of the variable.
     * It is a deep copy (except for the value portion).
     * @return The <CODE>SnmpVarBindList</CODE> clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized SnmpVarBindList cloneWithValue() {

    /**
     * Clones the <CODE>SnmpVarBindList</CODE>. A new copy of the <CODE>SnmpVarBindList</CODE> is created.
     * It is a real deep copy.
     * @return The <CODE>SnmpVarBindList</CODE> clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int indexOfOid(SnmpOid oid) {

    /**
     * Gives the index of an OID in the <CODE>SnmpVarBindList</CODE>.
     * @param oid The <CODE>SnmpOid</CODE> object with the requested OID.
     * @return The index of the OID in <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int indexOfOid(SnmpVarBind var) {

    /**
     * Gives the index of an OID in the <CODE>SnmpVarBindList</CODE>.
     * @param var The <CODE>SnmpVarBind</CODE> object with the requested OID.
     * @return The index of the OID in <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int indexOfOid(SnmpVarBind var, int min, int max) {

    /**
     * Gives the index of an OID in the <CODE>SnmpVarBindList</CODE>.
     * The index returned must be greater than or equal to the <CODE>start</CODE> parameter
     * and smaller than the <CODE>end</CODE> parameter. Otherwise the method returns -1.
     * @param var The <CODE>SnmpVarBind</CODE> object with the requested OID.
     * @param min The min index in <CODE>SnmpVarBindList</CODE>.
     * @param max The max index in <CODE>SnmpVarBindList</CODE>.
     * @return The index of the OID in <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized SnmpVarBindList splitAt(int pos) {

    /**
     * Splits the <CODE>SnmpVarBindList</CODE>.
     * @param pos The position at which to split the <CODE>SnmpVarBindList</CODE>
     * @return The <CODE>SnmpVarBindList</CODE> list from the beginning up to the split position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean checkForUnspecifiedValue() {

    /**
     * Returns <CODE>true</CODE> if there is a value that is not specified.
     * @return <CODE>true</CODE> if there is a value that is not specified, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean checkForValidValues() {

    /**
     * Returns <CODE>false</CODE> if any of the variables does not contain a valid value.
     * Typically used for <CODE>SnmpSet</CODE> operations.
     * @return <CODE>false</CODE> if any of the variables does not contain a valid value, <CODE>true</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    final public synchronized void concat(Vector<SnmpVarBind> list) {

    /**
     * Adds elements in the specified <CODE>SnmpVarBindList</CODE> to this list.
     * The elements are not cloned.
     * @param list A vector of <CODE>SnmpVarBind</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addInstance(String inst) throws SnmpStatusException {

    /**
     * Adds the string as an instance part to all OIDs in this list.
     * This method should be used with caution because it affects all OIDs in the list.
     * @param inst The <CODE>String</CODE> to add as an instance part.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(SnmpVarBind var) {

    /**
     * Removes the given <CODE>SnmpVarBind</CODE> object from the existing <CODE>SnmpVarBindList</CODE>.
     * @param var The <CODE>SnmpVarBind</CODE> object to be removed.
     * @return <CODE>true</CODE> if the <CODE>SnmpVarBind</CODE> object was a component of this
     * <CODE>SnmpVarBindList</CODE>, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBind(SnmpVarBind var) {

    /**
     * Appends the given <CODE>SnmpVarBind</CODE> object to the existing <CODE>SnmpVarBindList</CODE>.
     * It creates a new <CODE>SnmpVarBindList</CODE> if one did not exist.
     * @param var The <CODE>SnmpVarBind</CODE> object to be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(String name) throws SnmpStatusException {

    /**
     * Removes the <CODE>SnmpVarBind</CODE> object corresponding to the given MIB variable from the existing
     * <CODE>SnmpVarBindList</CODE>.
     * @param name A MIB variable name.
     * @return <CODE>true</CODE> if the SNMP MIB variable was a component of this <CODE>SnmpVarBindList</CODE>,
     * <CODE>false</CODE> otherwise.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBind(String name) throws SnmpStatusException {

    /**
     * Creates an <CODE>SnmpVarBind</CODE> object from the given MIB variable and appends it to the existing
     * <CODE>SnmpVarBindList</CODE>.
     * It creates a new <CODE>SnmpVarBindList</CODE> if one did not exist.
     * @param name A MIB variable name.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(String list[]) throws SnmpStatusException {

    /**
     * Removes the array of SNMP MIB variables from the existing <CODE>SnmpVarBindList</CODE>.
     * @param list Array of strings containing MIB variable names.
     * @return <CODE>true</CODE> if all the SNMP MIB variables were components of this <CODE>SnmpVarBindList</CODE>,
     * <CODE>false</CODE> otherwise.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBind(String list[]) throws SnmpStatusException {

    /**
     * Adds an array of MIB variable names to the list. For example:
     * <P>
     * <CODE>
     * String mylist[] = {"sysUpTime.0", "ifInOctets.0"}
     * <BR>
     * vb.addVarBind(mylist) ;
     * </BR>
     * </CODE>
     * @param list The array of MIB variable names.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBind(String list[], String inst) throws SnmpStatusException {

    /**
     * Removes the array of SNMP MIB variables and instances from the existing <CODE>SnmpVarBindList</CODE>.
     * @param list An array of <CODE>String</CODE> containing MIB variable names.
     * @param inst A common instance for each of the MIB variables in <CODE>vlist</CODE>.
     * @return <CODE>true</CODE> if all the SNMP MIB variables were components of this <CODE>SnmpVarBindList</CODE>,
     * <CODE>false</CODE> otherwise.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void addVarBind(String list[], String inst) throws SnmpStatusException {

    /**
     * Prepares a vector of <CODE>SnmpVarBindList</CODE> from an array of SNMP MIB variables and instances.
     * @param list An array of <CODE>String</CODE> containing MIB variable names.
     * @param inst A common instance for each of the MIB variables in <CODE>vlist</CODE>.
     * @exception SnmpStatusException An error occurred while accessing a MIB node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void replaceVarBind(SnmpVarBind var, int pos) {

    /**
     * Replaces an element at a specified location with the new element.
     * @param var The replacement variable.
     * @param pos The location in the <CODE>SnmpVarBindList</CODE>.
     * @exception java.lang.ArrayIndexOutOfBoundsException If the specified <CODE>pos</CODE> is beyond range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized boolean removeVarBindList(SnmpVarBindList list) {

    /**
     * Removes all the <CODE>SnmpVarBind</CODE> objects of the given <CODE>SnmpVarBindList</CODE> from the existing
     * <CODE>SnmpVarBindList</CODE>.
     * @param list The <CODE>SnmpVarBindList</CODE> to be removed.
     * @return <CODE>true</CODE> if all the <CODE>SnmpVarBind</CODE> objects were components of this
     * <CODE>SnmpVarBindList</CODE>, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized void addVarBindList(SnmpVarBindList list) {

    /**
     * Appends an <CODE>SnmpVarBindList</CODE> at the end of the current <CODE>SnmpVarBindList</CODE> object.
     * @param list The <CODE>SnmpVarBindList</CODE> to append.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void setVarBindList(Vector<SnmpVarBind> list, boolean copy) {

    /**
     * Replaces the current variable binding list of <CODE>SnmpVarBind</CODE> objects with the new variable binding
     * list of <CODE>SnmpVarBind</CODE> objects.
     * If <CODE>copy</CODE> is <CODE>true</CODE>, it will clone each <CODE>SnmpVarBind</CODE> object
     * contained in the list.
     * @param list A vector of <CODE>SnmpVarBind</CODE> objects.
     * @param copy The flag indicating whether each object in the list should be cloned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized void setVarBindList(Vector<SnmpVarBind> list) {

    /**
     * Replaces the current variable binding list of <CODE>SnmpVarBind</CODE> with the new specified variable binding
     * list of <CODE>SnmpVarBind</CODE> objects.
     * This method only clones the vector. It does not clone the <CODE>SnmpVarBind</CODE> objects
     * contained in the list.
     * @param list A vector of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized Enumeration<SnmpVarBind> getVarBindList() {

    /**
     * This is a convenience function that returns an enumeration. This can be used to traverse the list.
     * This is advantageous as it hides the implementation of the class of the list which keeps the variables.
     * @return An enumeration object of <CODE>SnmpVarBind</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public synchronized int getVarBindCount() {

    /**
     * Gets the number of elements in this list.
     * @return The number of elements in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public final synchronized SnmpVarBind getVarBindAt(int pos) {

    /**
     * Gets an <CODE>SnmpVarBind</CODE> object.
     * @param pos The position in the list.
     * @return The <CODE>SnmpVarBind</CODE> object at the specified position.
     * @exception java.lang.ArrayIndexOutOfBoundsException If the specified <CODE>pos</CODE> is beyond range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public void setTimestamp(Timestamp tstamp) {

    /**
     * Records the <CODE>sysUpTime</CODE> and the actual time when this <CODE>SnmpVarBindList</CODE>
     * was changed or created.
     * This needs to be set explicitly.
     * @param tstamp The <CODE>SnmpTimestamp</CODE> of the device for which the values hold <CODE>true</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public Timestamp getTimestamp() {

    /**
     * Gets the <CODE>timestamp</CODE> associated with this <CODE>SnmpVarBindList</CODE>.
     * @return The <CODE>timestamp</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(String name, Vector<SnmpVarBind> list) {

    /**
     * Creates a new <CODE>SnmpVarBindList</CODE> object from a plain vector of <CODE>SnmpVarBind</CODE> objects.
     * Objects in the specified vector can be <CODE>SnmpVarBind</CODE> objects or derivatives.
     * @param name The name of the newly created <CODE>SnmpVarBindList</CODE>.
     * @param list The vector of <CODE>SnmpVarBind</CODE> objects to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(Vector<SnmpVarBind> list) {

    /**
     * Creates a new <CODE>SnmpVarBindList</CODE> object from a plain vector of <CODE>SnmpVarBind</CODE> objects.
     * Objects in the specified vector can be <CODE>SnmpVarBind</CODE> objects or derivatives.
     * @param list The vector of <CODE>SnmpVarBind</CODE> objects to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(SnmpVarBindList list) {

    /**
     * Similar to the copy constructor. Does a shallow copy of the elements.
     * Individual elements are not cloned.
     * @param list The <CODE>SnmpVarBindList</CODE> to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(String name) {

    /**
     * Prepares an empty list with a <CODE>String</CODE> to print while debugging.
     * @param name The name of the newly created <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList(int initialCapacity) {

    /**
     * Prepares an empty list.
     * @param initialCapacity The initial capacity of the <CODE>SnmpVarBindList</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public SnmpVarBindList() {

    /**
     * Prepares an empty list.
     * The initial capacity and the capacity increment are initialized to 5.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    Timestamp timestamp ;

    /**
     * Timestamp when this <CODE>SnmpVarBindList</CODE> was updated.
     * Valid only for <CODE>SnmpGet</CODE> and <CODE>SnmpGetNext</CODE> operations.
     * <CODE>SnmpTimestamp</CODE> is null by default.
     * Also, when the list is cloned without value the timestamp is not copied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
    public String identity = "VarBindList " ;   // name identifying this list.

    /**
     * A name given to the <CODE>SnmpVarBindList</CODE>. Useful for debugging.
     * The default name is "VarBindList".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpVarBindList.java
public class SnmpVarBindList extends Vector<SnmpVarBind> {

/**
 * Contains a list of <CODE>SnmpVarBind</CODE> objects.
 * This class helps to create an <CODE>SnmpVarBindList</CODE> from a list of MIB variable names.
 * In addition, it contains different forms of methods which can copy or clone the list.
 * This list is required by any SNMP entity which specifies a list of variables to query.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
