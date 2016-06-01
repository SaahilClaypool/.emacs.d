_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    @SuppressWarnings("unchecked")

    /**
     * Reconstitute the <tt>EnumMap</tt> instance from a stream (i.e.,
     * deserialize it).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Save the state of the <tt>EnumMap</tt> instance to a stream (i.e.,
     * serialize it).
     *
     * @serialData The <i>size</i> of the enum map (the number of key-value
     *             mappings) is emitted (int), followed by the key (Object)
     *             and value (Object) for each key-value mapping represented
     *             by the enum map.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private static <K extends Enum<K>> K[] getKeyUniverse(Class<K> keyType) {

    /**
     * Returns all of the values comprising K.
     * The result is uncloned, cached, and shared by all callers.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private void typeCheck(K key) {

    /**
     * Throws an exception if e is not of the correct type for this enum set.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a shallow copy of this enum map.  (The values themselves
     * are not cloned.
     *
     * @return a shallow copy of this enum map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public int hashCode() {

    /**
     * Returns the hash code value for this map.  The hash code of a map is
     * defined to be the sum of the hash codes of each entry in the map.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public boolean equals(Object o) {

    /**
     * Compares the specified object with this map for equality.  Returns
     * <tt>true</tt> if the given object is also a map and the two maps
     * represent the same mappings, as specified in the {@link
     * Map#equals(Object)} contract.
     *
     * @param o the object to be compared for equality with this map
     * @return <tt>true</tt> if the specified object is equal to this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public Set<Map.Entry<K,V>> entrySet() {

    /**
     * Returns a {@link Set} view of the mappings contained in this map.
     * The returned set obeys the general contract outlined in
     * {@link Map#keySet()}.  The set's iterator will return the
     * mappings in the order their keys appear in map, which is their
     * natural order (the order in which the enum constants are declared).
     *
     * @return a set view of the mappings contained in this enum map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public Collection<V> values() {

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     * The returned collection obeys the general contract outlined in
     * {@link Map#values()}.  The collection's iterator will return the
     * values in the order their corresponding keys appear in map,
     * which is their natural order (the order in which the enum constants
     * are declared).
     *
     * @return a collection view of the values contained in this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public Set<K> keySet() {

    /**
     * Returns a {@link Set} view of the keys contained in this map.
     * The returned set obeys the general contract outlined in
     * {@link Map#keySet()}.  The set's iterator will return the keys
     * in their natural order (the order in which the enum constants
     * are declared).
     *
     * @return a set view of the keys contained in this enum map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private transient Set<Map.Entry<K,V>> entrySet;

    /**
     * This field is initialized to contain an instance of the entry set
     * view the first time this view is requested.  The view is stateless,
     * so there's no reason to create more than one.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public void clear() {

    /**
     * Removes all mappings from this map.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public void putAll(Map<? extends K, ? extends V> m) {

    /**
     * Copies all of the mappings from the specified map to this map.
     * These mappings will replace any mappings that this map had for
     * any of the keys currently in the specified map.
     *
     * @param m the mappings to be stored in this map
     * @throws NullPointerException the specified map is null, or if
     *     one or more keys in the specified map are null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private boolean isValidKey(Object key) {

    /**
     * Returns true if key is of the proper type to be a key in this
     * enum map.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public V remove(Object key) {

    /**
     * Removes the mapping for this key from this map if present.
     *
     * @param key the key whose mapping is to be removed from the map
     * @return the previous value associated with specified key, or
     *     <tt>null</tt> if there was no entry for key.  (A <tt>null</tt>
     *     return can also indicate that the map previously associated
     *     <tt>null</tt> with the specified key.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public V put(K key, V value) {

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for this key, the old
     * value is replaced.
     *
     * @param key the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     *
     * @return the previous value associated with specified key, or
     *     <tt>null</tt> if there was no mapping for key.  (A <tt>null</tt>
     *     return can also indicate that the map previously associated
     *     <tt>null</tt> with the specified key.)
     * @throws NullPointerException if the specified key is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public V get(Object key) {

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     *
     * <p>More formally, if this map contains a mapping from a key
     * {@code k} to a value {@code v} such that {@code (key == k)},
     * then this method returns {@code v}; otherwise it returns
     * {@code null}.  (There can be at most one such mapping.)
     *
     * <p>A return value of {@code null} does not <i>necessarily</i>
     * indicate that the map contains no mapping for the key; it's also
     * possible that the map explicitly maps the key to {@code null}.
     * The {@link #containsKey containsKey} operation may be used to
     * distinguish these two cases.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public boolean containsKey(Object key) {

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the specified
     * key.
     *
     * @param key the key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the specified
     *            key
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public boolean containsValue(Object value) {

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.
     *
     * @param value the value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to this value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public int size() {

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public EnumMap(Map<K, ? extends V> m) {

    /**
     * Creates an enum map initialized from the specified map.  If the
     * specified map is an <tt>EnumMap</tt> instance, this constructor behaves
     * identically to {@link #EnumMap(EnumMap)}.  Otherwise, the specified map
     * must contain at least one mapping (in order to determine the new
     * enum map's key type).
     *
     * @param m the map from which to initialize this enum map
     * @throws IllegalArgumentException if <tt>m</tt> is not an
     *     <tt>EnumMap</tt> instance and contains no mappings
     * @throws NullPointerException if <tt>m</tt> is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public EnumMap(EnumMap<K, ? extends V> m) {

    /**
     * Creates an enum map with the same key type as the specified enum
     * map, initially containing the same mappings (if any).
     *
     * @param m the enum map from which to initialize this enum map
     * @throws NullPointerException if <tt>m</tt> is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    public EnumMap(Class<K> keyType) {

    /**
     * Creates an empty enum map with the specified key type.
     *
     * @param keyType the class object of the key type for this enum map
     * @throws NullPointerException if <tt>keyType</tt> is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private static final Object NULL = new Object() {

    /**
     * Distinguished non-null value for representing null values.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private transient int size = 0;

    /**
     * The number of mappings in this map.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private transient Object[] vals;

    /**
     * Array representation of this map.  The ith element is the value
     * to which universe[i] is currently mapped, or null if it isn't
     * mapped to anything, or NULL if it's mapped to null.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private transient K[] keyUniverse;

    /**
     * All of the values comprising K.  (Cached for performance.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
    private final Class<K> keyType;

    /**
     * The <tt>Class</tt> object for the enum type of all the keys of this map.
     *
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//EnumMap.java
public class EnumMap<K extends Enum<K>, V> extends AbstractMap<K, V>

/**
 * A specialized {@link Map} implementation for use with enum type keys.  All
 * of the keys in an enum map must come from a single enum type that is
 * specified, explicitly or implicitly, when the map is created.  Enum maps
 * are represented internally as arrays.  This representation is extremely
 * compact and efficient.
 *
 * <p>Enum maps are maintained in the <i>natural order</i> of their keys
 * (the order in which the enum constants are declared).  This is reflected
 * in the iterators returned by the collections views ({@link #keySet()},
 * {@link #entrySet()}, and {@link #values()}).
 *
 * <p>Iterators returned by the collection views are <i>weakly consistent</i>:
 * they will never throw {@link ConcurrentModificationException} and they may
 * or may not show the effects of any modifications to the map that occur while
 * the iteration is in progress.
 *
 * <p>Null keys are not permitted.  Attempts to insert a null key will
 * throw {@link NullPointerException}.  Attempts to test for the
 * presence of a null key or to remove one will, however, function properly.
 * Null values are permitted.

 * <P>Like most collection implementations <tt>EnumMap</tt> is not
 * synchronized. If multiple threads access an enum map concurrently, and at
 * least one of the threads modifies the map, it should be synchronized
 * externally.  This is typically accomplished by synchronizing on some
 * object that naturally encapsulates the enum map.  If no such object exists,
 * the map should be "wrapped" using the {@link Collections#synchronizedMap}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access:
 *
 * <pre>
 *     Map&lt;EnumKey, V&gt; m
 *         = Collections.synchronizedMap(new EnumMap&lt;EnumKey, V&gt;(...));
 * </pre>
 *
 * <p>Implementation note: All basic operations execute in constant time.
 * They are likely (though not guaranteed) to be faster than their
 * {@link HashMap} counterparts.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @author Josh Bloch
 * @see EnumSet
 * @since 1.5
 */
