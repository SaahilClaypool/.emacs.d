_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link TabularDataSupport} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    private List<?> checkValueAndIndex(CompositeData value) {

    /**
     * Checks if the specified value can be put (ie added) in this <tt>TabularData</tt> instance
     * (ie value is not null, its composite type is equal to row type, and its index is not already used),
     * and returns the index calculated for this value.
     *
     * The index is a List, and not an array, so that an index.equals(otherIndex) call will actually compare contents,
     * not just the objects references as is done for an array object.
     *
     * @throws  NullPointerException
     * @throws  InvalidOpenTypeException
     * @throws  KeyAlreadyExistsException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    private void checkValueType(CompositeData value) {

    /**
     * Checks the specified value's type is valid for this <tt>TabularData</tt> instance
     * (ie value is not null, and its composite type is equal to row type).
     *
     * @throws  NullPointerException
     * @throws  InvalidOpenTypeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    private void checkKeyType(Object[] key) {

    /**
     * Checks if the specified key is valid for this <tt>TabularData</tt> instance.
     *
     * @throws  NullPointerException
     * @throws  InvalidOpenTypeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    private List<?> internalCalculateIndex(CompositeData value) {

    /**
     * Returns the index for value, assuming value is valid for this <tt>TabularData</tt> instance
     * (ie value is not null, and its composite type is equal to row type).
     *
     * The index is a List, and not an array, so that an index.equals(otherIndex) call will actually compare contents,
     * not just the objects references as is done for an array object.
     *
     * The returned List is unmodifiable so that once a row has been put into the dataMap, its index cannot be modified,
     * for example by a user that would attempt to modify an index contained in the Set returned by keySet().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public String toString() {

    /**
     * Returns a string representation of this <code>TabularDataSupport</code> instance.
     * <p>
     * The string representation consists of the name of this class (ie <code>javax.management.openmbean.TabularDataSupport</code>),
     * the string representation of the tabular type of this instance, and the string representation of the contents
     * (ie list the key=value mappings as returned by a call to
     * <tt>dataMap.</tt>{@link java.util.HashMap#toString() toString()}).
     *
     * @return  a string representation of this <code>TabularDataSupport</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
   public int hashCode() {

    /**
     * Returns the hash code value for this <code>TabularDataSupport</code> instance.
     * <p>
     * The hash code of a <code>TabularDataSupport</code> instance is the sum of the hash codes
     * of all elements of information used in <code>equals</code> comparisons
     * (ie: its <i>tabular type</i> and its content, where the content is defined as all the CompositeData values).
     * <p>
     * This ensures that <code> t1.equals(t2) </code> implies that <code> t1.hashCode()==t2.hashCode() </code>
     * for any two <code>TabularDataSupport</code> instances <code>t1</code> and <code>t2</code>,
     * as required by the general contract of the method
     * {@link Object#hashCode() Object.hashCode()}.
     * <p>
     * However, note that another instance of a class implementing the <code>TabularData</code> interface
     * may be equal to this <code>TabularDataSupport</code> instance as defined by {@link #equals},
     * but may have a different hash code if it is calculated differently.
     *
     * @return  the hash code value for this <code>TabularDataSupport</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public boolean equals(Object obj) {

    /**
     * Compares the specified <var>obj</var> parameter with this <code>TabularDataSupport</code> instance for equality.
     * <p>
     * Returns <tt>true</tt> if and only if all of the following statements are true:
     * <ul>
     * <li><var>obj</var> is non null,</li>
     * <li><var>obj</var> also implements the <code>TabularData</code> interface,</li>
     * <li>their tabular types are equal</li>
     * <li>their contents (ie all CompositeData values) are equal.</li>
     * </ul>
     * This ensures that this <tt>equals</tt> method works properly for <var>obj</var> parameters which are
     * different implementations of the <code>TabularData</code> interface.
     * <br>&nbsp;
     * @param  obj  the object to be compared for equality with this <code>TabularDataSupport</code> instance;
     *
     * @return  <code>true</code> if the specified object is equal to this <code>TabularDataSupport</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    /* We cannot use covariance here and return TabularDataSupport

    /**
     * Returns a clone of this <code>TabularDataSupport</code> instance:
     * the clone is obtained by calling <tt>super.clone()</tt>, and then cloning the underlying map.
     * Only a shallow clone of the underlying map is made, i.e. no cloning of the indexes and row values is made as they are immutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    @SuppressWarnings("unchecked")  // historical confusion about the return type

    /**
     * Returns a collection view of the index to row mappings
     * contained in this {@code TabularDataSupport} instance.
     * Each element in the returned collection is
     * a {@code Map.Entry<List<?>,CompositeData>} but
     * is declared as a {@code Map.Entry<Object,Object>}
     * for compatibility reasons. Each of the map entry
     * keys is an unmodifiable {@code List<?>}.
     * The collection is backed by the underlying map of this
     * {@code TabularDataSupport} instance, so changes to the
     * {@code TabularDataSupport} instance are reflected in
     * the collection, and vice-versa.
     * The collection supports element removal, which removes
     * the corresponding mapping from the map, via the
     * {@link Iterator#remove}, {@link Collection#remove},
     * {@link Collection#removeAll}, {@link Collection#retainAll},
     * and {@link Collection#clear} operations. It does not support
     * the {@link Collection#add} or {@link Collection#addAll}
     * operations.
     * <p>
     * <b>IMPORTANT NOTICE</b>: Do not use the {@code setValue} method of the
     * {@code Map.Entry} elements contained in the returned collection view.
     * Doing so would corrupt the index to row mappings contained in this
     * {@code TabularDataSupport} instance.
     *
     * @return a collection view ({@code Set<Map.Entry<List<?>,CompositeData>>})
     * of the mappings contained in this map.
     * @see java.util.Map.Entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    @SuppressWarnings("unchecked")  // historical confusion about the return type

    /**
     * Returns a collection view of the rows contained in this
     * {@code TabularDataSupport} instance. The returned {@code Collection}
     * is a {@code Collection<CompositeData>} but is declared as a
     * {@code Collection<Object>} for compatibility reasons.
     * The returned collection can be used to iterate over the values.
     * The collection is backed by the underlying map, so changes to the
     * {@code TabularDataSupport} instance are reflected in the collection,
     * and vice-versa.
     *
     * The collection supports element removal, which removes the corresponding
     * index to row mapping from this {@code TabularDataSupport} instance, via
     * the {@link Iterator#remove}, {@link Collection#remove},
     * {@link Collection#removeAll}, {@link Collection#retainAll},
     * and {@link Collection#clear} operations. It does not support
     * the {@link Collection#add} or {@link Collection#addAll} operations.
     *
     * @return a collection view ({@code Collection<CompositeData>}) of
     * the values contained in this {@code TabularDataSupport} instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public Set<Object> keySet() {

    /**
     * Returns a set view of the keys contained in the underlying map of this
     * {@code TabularDataSupport} instance used to index the rows.
     * Each key contained in this {@code Set} is an unmodifiable {@code List<?>}
     * so the returned set view is a {@code Set<List<?>>} but is declared as a
     * {@code Set<Object>} for compatibility reasons.
     * The set is backed by the underlying map of this
     * {@code TabularDataSupport} instance, so changes to the
     * {@code TabularDataSupport} instance are reflected in the
     * set, and vice-versa.
     *
     * The set supports element removal, which removes the corresponding
     * row from this {@code TabularDataSupport} instance, via the
     * {@link Iterator#remove}, {@link Set#remove}, {@link Set#removeAll},
     * {@link Set#retainAll}, and {@link Set#clear} operations. It does
     *  not support the {@link Set#add} or {@link Set#addAll} operations.
     *
     * @return a set view ({@code Set<List<?>>}) of the keys used to index
     * the rows of this {@code TabularDataSupport} instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public boolean isEmpty() {

    /**
     * Returns <tt>true</tt> if this <code>TabularDataSupport</code> instance contains no rows.
     *
     * @return <tt>true</tt> if this <code>TabularDataSupport</code> instance contains no rows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public int size() {

    /**
     * Returns the number of rows in this <code>TabularDataSupport</code> instance.
     *
     * @return the number of rows in this <code>TabularDataSupport</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public void clear() {

    /**
     * Removes all rows from this <code>TabularDataSupport</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public void putAll(CompositeData[] values) {

    /**
     * Add all the elements in <var>values</var> to this
     * <tt>TabularData</tt> instance.  If any element in
     * <var>values</var> does not satisfy the constraints defined in
     * {@link #put(CompositeData) <tt>put</tt>}, or if any two
     * elements in <var>values</var> have the same index calculated
     * according to this <tt>TabularData</tt> instance's
     * <tt>TabularType</tt> definition, then an exception describing
     * the failure is thrown and no element of <var>values</var> is
     * added, thus leaving this <tt>TabularData</tt> instance
     * unchanged.
     *
     * @param values the array of composite data values to be added as
     * new rows to this <tt>TabularData</tt> instance; if
     * <var>values</var> is <tt>null</tt> or empty, this method
     * returns without doing anything.
     *
     * @throws NullPointerException if an element of <var>values</var>
     * is <tt>null</tt>
     * @throws InvalidOpenTypeException if an element of
     * <var>values</var> does not conform to this
     * <tt>TabularData</tt> instance's row type definition (ie its
     * <tt>TabularType</tt> definition)
     * @throws KeyAlreadyExistsException if the index for an element
     * of <var>values</var>, calculated according to this
     * <tt>TabularData</tt> instance's <tt>TabularType</tt> definition
     * already maps to an existing value in this instance, or two
     * elements of <var>values</var> have the same index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public void putAll(Map<?,?> t) {

    /**
     * Add all the values contained in the specified map <var>t</var>
     * to this <tt>TabularData</tt> instance.  This method converts
     * the collection of values contained in this map into an array of
     * <tt>CompositeData</tt> values, if possible, and then call the
     * method <tt>putAll(CompositeData[])</tt>. Note that the keys
     * used in the specified map <var>t</var> are ignored. This method
     * allows, for example to add the content of another
     * <tt>TabularData</tt> instance with the same row type (but
     * possibly different index names) into this instance.
     *
     * @param t the map whose values are to be added as new rows to
     * this <tt>TabularData</tt> instance; if <var>t</var> is
     * <tt>null</tt> or empty, this method returns without doing
     * anything.
     *
     * @throws NullPointerException if a value in <var>t</var> is
     * <tt>null</tt>.
     * @throws ClassCastException if a value in <var>t</var> is not an
     * instance of <tt>CompositeData</tt>.
     * @throws InvalidOpenTypeException if a value in <var>t</var>
     * does not conform to this <tt>TabularData</tt> instance's row
     * type definition.
     * @throws KeyAlreadyExistsException if the index for a value in
     * <var>t</var>, calculated according to this
     * <tt>TabularData</tt> instance's <tt>TabularType</tt> definition
     * already maps to an existing value in this instance, or two
     * values in <var>t</var> have the same index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public CompositeData remove(Object[] key) {

    /**
     * Removes the <tt>CompositeData</tt> value whose index is <var>key</var> from this <tt>TabularData</tt> instance,
     * and returns the removed value, or returns <tt>null</tt> if there is no value whose index is <var>key</var>.
     *
     * @param  key  the index of the value to get in this <tt>TabularData</tt> instance;
     *              must be valid with this <tt>TabularData</tt> instance's row type definition;
     *              must not be null.
     *
     * @return previous value associated with specified key, or <tt>null</tt>
     *         if there was no mapping for key.
     *
     * @throws NullPointerException  if the <var>key</var> is <tt>null</tt>
     * @throws InvalidKeyException   if the <var>key</var> does not conform to this <tt>TabularData</tt> instance's
     *                               <tt>TabularType</tt> definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public Object remove(Object key) {

    /**
     * This method simply calls <tt>remove((Object[]) key)</tt>.
     *
     * @param key an <tt>Object[]</tt> representing the key to remove.
     *
     * @return previous value associated with specified key, or <tt>null</tt>
     *         if there was no mapping for key.
     *
     * @throws NullPointerException  if the <var>key</var> is <tt>null</tt>
     * @throws ClassCastException    if the <var>key</var> is not of the type <tt>Object[]</tt>
     * @throws InvalidKeyException   if the <var>key</var> does not conform to this <tt>TabularData</tt> instance's
     *                               <tt>TabularType</tt> definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public Object put(Object key, Object value) {

    /**
     * This method simply calls <tt>put((CompositeData) value)</tt> and
     * therefore ignores its <var>key</var> parameter which can be <tt>null</tt>.
     *
     * @param key an ignored parameter.
     * @param value the {@link CompositeData} to put.
     *
     * @return the value which is put
     *
     * @throws NullPointerException  if the <var>value</var> is <tt>null</tt>
     * @throws ClassCastException if the <var>value</var> is not of
     * the type <tt>CompositeData</tt>
     * @throws InvalidOpenTypeException if the <var>value</var> does
     * not conform to this <tt>TabularData</tt> instance's
     * <tt>TabularType</tt> definition
     * @throws KeyAlreadyExistsException if the key for the
     * <var>value</var> parameter, calculated according to this
     * <tt>TabularData</tt> instance's <tt>TabularType</tt> definition
     * already maps to an existing value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public CompositeData get(Object[] key) {

    /**
     * Returns the <tt>CompositeData</tt> value whose index is
     * <var>key</var>, or <tt>null</tt> if there is no value mapping
     * to <var>key</var>, in this <tt>TabularData</tt> instance.
     *
     * @param key the index of the value to get in this
     * <tt>TabularData</tt> instance; * must be valid with this
     * <tt>TabularData</tt> instance's row type definition; * must not
     * be null.
     *
     * @return the value corresponding to <var>key</var>.
     *
     * @throws NullPointerException  if the <var>key</var> is <tt>null</tt>
     * @throws InvalidKeyException   if the <var>key</var> does not conform to this <tt>TabularData</tt> instance's
     *                               <tt>TabularType</tt> type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public Object get(Object key) {

    /**
     * This method simply calls <tt>get((Object[]) key)</tt>.
     *
     * @throws NullPointerException  if the <var>key</var> is <tt>null</tt>
     * @throws ClassCastException    if the <var>key</var> is not of the type <tt>Object[]</tt>
     * @throws InvalidKeyException   if the <var>key</var> does not conform to this <tt>TabularData</tt> instance's
     *                               <tt>TabularType</tt> definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public boolean containsValue(Object value) {

    /**
     * Returns <tt>true</tt> if and only if this <tt>TabularData</tt> instance contains the specified
     * value.
     *
     * @param  value  the row value whose presence in this <tt>TabularData</tt> instance is to be tested.
     *
     * @return  <tt>true</tt> if this <tt>TabularData</tt> instance contains the specified row value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public boolean containsValue(CompositeData value) {

    /**
     * Returns <tt>true</tt> if and only if this <tt>TabularData</tt> instance contains the specified
     * <tt>CompositeData</tt> value. If <var>value</var> is <tt>null</tt> or does not conform to
     * this <tt>TabularData</tt> instance's row type definition, this method simply returns <tt>false</tt>.
     *
     * @param  value  the row value whose presence in this <tt>TabularData</tt> instance is to be tested.
     *
     * @return  <tt>true</tt> if this <tt>TabularData</tt> instance contains the specified row value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public boolean containsKey(Object[] key) {

    /**
     * Returns <tt>true</tt> if and only if this <tt>TabularData</tt> instance contains a <tt>CompositeData</tt> value
     * (ie a row) whose index is the specified <var>key</var>. If <var>key</var> is <tt>null</tt> or does not conform to
     * this <tt>TabularData</tt> instance's <tt>TabularType</tt> definition, this method simply returns <tt>false</tt>.
     *
     * @param  key  the index value whose presence in this <tt>TabularData</tt> instance is to be tested.
     *
     * @return  <tt>true</tt> if this <tt>TabularData</tt> indexes a row value with the specified key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public boolean containsKey(Object key) {

    /**
     * Returns <tt>true</tt> if and only if this <tt>TabularData</tt> instance contains a <tt>CompositeData</tt> value
     * (ie a row) whose index is the specified <var>key</var>. If <var>key</var> cannot be cast to a one dimension array
     * of Object instances, this method simply returns <tt>false</tt>; otherwise it returns the the result of the call to
     * <tt>this.containsKey((Object[]) key)</tt>.
     *
     * @param  key  the index value whose presence in this <tt>TabularData</tt> instance is to be tested.
     *
     * @return  <tt>true</tt> if this <tt>TabularData</tt> indexes a row value with the specified key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public Object[] calculateIndex(CompositeData value) {

    /**
     * Calculates the index that would be used in this <tt>TabularData</tt> instance to refer to the specified
     * composite data <var>value</var> parameter if it were added to this instance.
     * This method checks for the type validity of the specified <var>value</var>,
     * but does not check if the calculated index is already used to refer to a value in this <tt>TabularData</tt> instance.
     *
     * @param  value                      the composite data value whose index in this
     *                                    <tt>TabularData</tt> instance is to be calculated;
     *                                    must be of the same composite type as this instance's row type;
     *                                    must not be null.
     *
     * @return the index that the specified <var>value</var> would have in this <tt>TabularData</tt> instance.
     *
     * @throws NullPointerException       if <var>value</var> is <tt>null</tt>.
     *
     * @throws InvalidOpenTypeException   if <var>value</var> does not conform to this <tt>TabularData</tt> instance's
     *                                    row type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public TabularType getTabularType() {

    /**
     * Returns the <i>tabular type</i> describing this <tt>TabularData</tt> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public TabularDataSupport(TabularType tabularType, int initialCapacity, float loadFactor) {

    /**
     * Creates an empty <tt>TabularDataSupport</tt> instance whose open-type is <var>tabularType</var>,
     * and whose underlying <tt>HashMap</tt> has the specified initial capacity and load factor.
     *
     * @param  tabularType               the <i>tabular type</i> describing this <tt>TabularData</tt> instance;
     *                           cannot be null.
     *
     * @param  initialCapacity   the initial capacity of the HashMap.
     *
     * @param  loadFactor        the load factor of the HashMap
     *
     * @throws IllegalArgumentException  if the initial capacity is less than zero,
     *                                   or the load factor is nonpositive,
     *                                   or the tabular type is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    public TabularDataSupport(TabularType tabularType) {

    /**
     * Creates an empty <tt>TabularDataSupport</tt> instance whose open-type is <var>tabularType</var>,
     * and whose underlying <tt>HashMap</tt> has a default initial capacity (101) and default load factor (0.75).
     * <p>
     * This constructor simply calls <tt>this(tabularType, 101, 0.75f);</tt>
     *
     * @param  tabularType               the <i>tabular type</i> describing this <tt>TabularData</tt> instance;
     *                                   cannot be null.
     *
     * @throws IllegalArgumentException  if the tabular type is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    private transient String[] indexNamesArray;

    /**
     * The array of item names that define the index used for rows (convenience field)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    private final TabularType tabularType;

    /**
     * @serial This tabular data instance's tabular type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
    // field cannot be final because of clone method

    /**
     * @serial This tabular data instance's contents: a {@link HashMap}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/TabularDataSupport.java
/* It would make much more sense to implement

/**
 * The <tt>TabularDataSupport</tt> class is the <i>open data</i> class which implements the <tt>TabularData</tt>
 * and the <tt>Map</tt> interfaces, and which is internally based on a hash map data structure.
 *
 * @since 1.5
 */
