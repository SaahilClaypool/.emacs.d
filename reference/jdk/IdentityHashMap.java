_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    static class IdentityHashMapSpliterator<K,V> {

    /**
     * Similar form as array-based Spliterators, but skips blank elements,
     * and guestimates size as decreasing by half per split.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private void putForCreate(K key, V value)

    /**
     * The put method for readObject.  It does not resize the table,
     * update modCount, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes the <tt>IdentityHashMap</tt> instance from a stream (i.e.,
     * deserializes it).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves the state of the <tt>IdentityHashMap</tt> instance to a stream
     * (i.e., serializes it).
     *
     * @serialData The <i>size</i> of the HashMap (the number of key-value
     *          mappings) (<tt>int</tt>), followed by the key (Object) and
     *          value (Object) for each key-value mapping represented by the
     *          IdentityHashMap.  The key-value mappings are emitted in no
     *          particular order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public Set<Map.Entry<K,V>> entrySet() {

    /**
     * Returns a {@link Set} view of the mappings contained in this map.
     * Each element in the returned set is a reference-equality-based
     * <tt>Map.Entry</tt>.  The set is backed by the map, so changes
     * to the map are reflected in the set, and vice-versa.  If the
     * map is modified while an iteration over the set is in progress,
     * the results of the iteration are undefined.  The set supports
     * element removal, which removes the corresponding mapping from
     * the map, via the <tt>Iterator.remove</tt>, <tt>Set.remove</tt>,
     * <tt>removeAll</tt>, <tt>retainAll</tt> and <tt>clear</tt>
     * methods.  It does not support the <tt>add</tt> or
     * <tt>addAll</tt> methods.
     *
     * <p>Like the backing map, the <tt>Map.Entry</tt> objects in the set
     * returned by this method define key and value equality as
     * reference-equality rather than object-equality.  This affects the
     * behavior of the <tt>equals</tt> and <tt>hashCode</tt> methods of these
     * <tt>Map.Entry</tt> objects.  A reference-equality based <tt>Map.Entry
     * e</tt> is equal to an object <tt>o</tt> if and only if <tt>o</tt> is a
     * <tt>Map.Entry</tt> and <tt>e.getKey()==o.getKey() &amp;&amp;
     * e.getValue()==o.getValue()</tt>.  To accommodate these equals
     * semantics, the <tt>hashCode</tt> method returns
     * <tt>System.identityHashCode(e.getKey()) ^
     * System.identityHashCode(e.getValue())</tt>.
     *
     * <p><b>Owing to the reference-equality-based semantics of the
     * <tt>Map.Entry</tt> instances in the set returned by this method,
     * it is possible that the symmetry and transitivity requirements of
     * the {@link Object#equals(Object)} contract may be violated if any of
     * the entries in the set is compared to a normal map entry, or if
     * the set returned by this method is compared to a set of normal map
     * entries (such as would be returned by a call to this method on a normal
     * map).  However, the <tt>Object.equals</tt> contract is guaranteed to
     * hold among identity-based map entries, and among sets of such entries.
     * </b>
     *
     * @return a set view of the identity-mappings contained in this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public Collection<V> values() {

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     * The collection is backed by the map, so changes to the map are
     * reflected in the collection, and vice-versa.  If the map is
     * modified while an iteration over the collection is in progress,
     * the results of the iteration are undefined.  The collection
     * supports element removal, which removes the corresponding
     * mapping from the map, via the <tt>Iterator.remove</tt>,
     * <tt>Collection.remove</tt>, <tt>removeAll</tt>,
     * <tt>retainAll</tt> and <tt>clear</tt> methods.  It does not
     * support the <tt>add</tt> or <tt>addAll</tt> methods.
     *
     * <p><b>While the object returned by this method implements the
     * <tt>Collection</tt> interface, it does <i>not</i> obey
     * <tt>Collection's</tt> general contract.  Like its backing map,
     * the collection returned by this method defines element equality as
     * reference-equality rather than object-equality.  This affects the
     * behavior of its <tt>contains</tt>, <tt>remove</tt> and
     * <tt>containsAll</tt> methods.</b>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public Set<K> keySet() {

    /**
     * Returns an identity-based set view of the keys contained in this map.
     * The set is backed by the map, so changes to the map are reflected in
     * the set, and vice-versa.  If the map is modified while an iteration
     * over the set is in progress, the results of the iteration are
     * undefined.  The set supports element removal, which removes the
     * corresponding mapping from the map, via the <tt>Iterator.remove</tt>,
     * <tt>Set.remove</tt>, <tt>removeAll</tt>, <tt>retainAll</tt>, and
     * <tt>clear</tt> methods.  It does not support the <tt>add</tt> or
     * <tt>addAll</tt> methods.
     *
     * <p><b>While the object returned by this method implements the
     * <tt>Set</tt> interface, it does <i>not</i> obey <tt>Set's</tt> general
     * contract.  Like its backing map, the set returned by this method
     * defines element equality as reference-equality rather than
     * object-equality.  This affects the behavior of its <tt>contains</tt>,
     * <tt>remove</tt>, <tt>containsAll</tt>, <tt>equals</tt>, and
     * <tt>hashCode</tt> methods.</b>
     *
     * <p><b>The <tt>equals</tt> method of the returned set returns <tt>true</tt>
     * only if the specified object is a set containing exactly the same
     * object references as the returned set.  The symmetry and transitivity
     * requirements of the <tt>Object.equals</tt> contract may be violated if
     * the set returned by this method is compared to a normal set.  However,
     * the <tt>Object.equals</tt> contract is guaranteed to hold among sets
     * returned by this method.</b>
     *
     * <p>The <tt>hashCode</tt> method of the returned set returns the sum of
     * the <i>identity hashcodes</i> of the elements in the set, rather than
     * the sum of their hashcodes.  This is mandated by the change in the
     * semantics of the <tt>equals</tt> method, in order to enforce the
     * general contract of the <tt>Object.hashCode</tt> method among sets
     * returned by this method.
     *
     * @return an identity-based set view of the keys contained in this map
     * @see Object#equals(Object)
     * @see System#identityHashCode(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private transient Set<Map.Entry<K,V>> entrySet;

    /**
     * This field is initialized to contain an instance of the entry set
     * view the first time this view is requested.  The view is stateless,
     * so there's no reason to create more than one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public Object clone() {

    /**
     * Returns a shallow copy of this identity hash map: the keys and values
     * themselves are not cloned.
     *
     * @return a shallow copy of this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public int hashCode() {

    /**
     * Returns the hash code value for this map.  The hash code of a map is
     * defined to be the sum of the hash codes of each entry in the map's
     * <tt>entrySet()</tt> view.  This ensures that <tt>m1.equals(m2)</tt>
     * implies that <tt>m1.hashCode()==m2.hashCode()</tt> for any two
     * <tt>IdentityHashMap</tt> instances <tt>m1</tt> and <tt>m2</tt>, as
     * required by the general contract of {@link Object#hashCode}.
     *
     * <p><b>Owing to the reference-equality-based semantics of the
     * <tt>Map.Entry</tt> instances in the set returned by this map's
     * <tt>entrySet</tt> method, it is possible that the contractual
     * requirement of <tt>Object.hashCode</tt> mentioned in the previous
     * paragraph will be violated if one of the two objects being compared is
     * an <tt>IdentityHashMap</tt> instance and the other is a normal map.</b>
     *
     * @return the hash code value for this map
     * @see Object#equals(Object)
     * @see #equals(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public boolean equals(Object o) {

    /**
     * Compares the specified object with this map for equality.  Returns
     * <tt>true</tt> if the given object is also a map and the two maps
     * represent identical object-reference mappings.  More formally, this
     * map is equal to another map <tt>m</tt> if and only if
     * <tt>this.entrySet().equals(m.entrySet())</tt>.
     *
     * <p><b>Owing to the reference-equality-based semantics of this map it is
     * possible that the symmetry and transitivity requirements of the
     * <tt>Object.equals</tt> contract may be violated if this map is compared
     * to a normal map.  However, the <tt>Object.equals</tt> contract is
     * guaranteed to hold among <tt>IdentityHashMap</tt> instances.</b>
     *
     * @param  o object to be compared for equality with this map
     * @return <tt>true</tt> if the specified object is equal to this map
     * @see Object#equals(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public void clear() {

    /**
     * Removes all of the mappings from this map.
     * The map will be empty after this call returns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private void closeDeletion(int d) {

    /**
     * Rehash all possibly-colliding entries following a
     * deletion. This preserves the linear-probe
     * collision properties required by get, put, etc.
     *
     * @param d the index of a newly empty deleted slot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private boolean removeMapping(Object key, Object value) {

    /**
     * Removes the specified key-value mapping from the map if it is present.
     *
     * @param   key   possible key
     * @param   value possible value
     * @return  <code>true</code> if and only if the specified key-value
     *          mapping was in the map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public V remove(Object key) {

    /**
     * Removes the mapping for this key from this map if present.
     *
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     *         (A <tt>null</tt> return can also indicate that the map
     *         previously associated <tt>null</tt> with <tt>key</tt>.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public void putAll(Map<? extends K, ? extends V> m) {

    /**
     * Copies all of the mappings from the specified map to this map.
     * These mappings will replace any mappings that this map had for
     * any of the keys currently in the specified map.
     *
     * @param m mappings to be stored in this map
     * @throws NullPointerException if the specified map is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private boolean resize(int newCapacity) {

    /**
     * Resizes the table if necessary to hold given capacity.
     *
     * @param newCapacity the new capacity, must be a power of two.
     * @return whether a resize did in fact take place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public V put(K key, V value) {

    /**
     * Associates the specified value with the specified key in this identity
     * hash map.  If the map previously contained a mapping for the key, the
     * old value is replaced.
     *
     * @param key the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     *         (A <tt>null</tt> return can also indicate that the map
     *         previously associated <tt>null</tt> with <tt>key</tt>.)
     * @see     Object#equals(Object)
     * @see     #get(Object)
     * @see     #containsKey(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private boolean containsMapping(Object key, Object value) {

    /**
     * Tests if the specified key-value mapping is in the map.
     *
     * @param   key   possible key
     * @param   value possible value
     * @return  <code>true</code> if and only if the specified key-value
     *          mapping is in the map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public boolean containsValue(Object value) {

    /**
     * Tests whether the specified object reference is a value in this identity
     * hash map.
     *
     * @param value value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified object reference
     * @see     #containsKey(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public boolean containsKey(Object key) {

    /**
     * Tests whether the specified object reference is a key in this identity
     * hash map.
     *
     * @param   key   possible key
     * @return  <code>true</code> if the specified object reference is a key
     *          in this map
     * @see     #containsValue(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    @SuppressWarnings("unchecked")

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
     *
     * @see #put(Object, Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private static int nextKeyIndex(int i, int len) {

    /**
     * Circularly traverses table of size len.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private static int hash(Object x, int length) {

    /**
     * Returns index for Object x.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public boolean isEmpty() {

    /**
     * Returns <tt>true</tt> if this identity hash map contains no key-value
     * mappings.
     *
     * @return <tt>true</tt> if this identity hash map contains no key-value
     *         mappings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public int size() {

    /**
     * Returns the number of key-value mappings in this identity hash map.
     *
     * @return the number of key-value mappings in this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public IdentityHashMap(Map<? extends K, ? extends V> m) {

    /**
     * Constructs a new identity hash map containing the keys-value mappings
     * in the specified map.
     *
     * @param m the map whose mappings are to be placed into this map
     * @throws NullPointerException if the specified map is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private void init(int initCapacity) {

    /**
     * Initializes object to be an empty map with the specified initial
     * capacity, which is assumed to be a power of two between
     * MINIMUM_CAPACITY and MAXIMUM_CAPACITY inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private static int capacity(int expectedMaxSize) {

    /**
     * Returns the appropriate capacity for the given expected maximum size.
     * Returns the smallest power of two between MINIMUM_CAPACITY and
     * MAXIMUM_CAPACITY, inclusive, that is greater than (3 *
     * expectedMaxSize)/2, if such a number exists.  Otherwise returns
     * MAXIMUM_CAPACITY.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public IdentityHashMap(int expectedMaxSize) {

    /**
     * Constructs a new, empty map with the specified expected maximum size.
     * Putting more than the expected number of key-value mappings into
     * the map may cause the internal data structure to grow, which may be
     * somewhat time-consuming.
     *
     * @param expectedMaxSize the expected maximum size of the map
     * @throws IllegalArgumentException if <tt>expectedMaxSize</tt> is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    public IdentityHashMap() {

    /**
     * Constructs a new, empty identity hash map with a default expected
     * maximum size (21).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    static final Object unmaskNull(Object key) {

    /**
     * Returns internal representation of null key back to caller as null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private static Object maskNull(Object key) {

    /**
     * Use NULL_KEY for key if it is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    static final Object NULL_KEY = new Object();

    /**
     * Value representing null keys inside tables.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    transient int modCount;

    /**
     * The number of modifications, to support fast-fail iterators
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    int size;

    /**
     * The number of key-value mappings contained in this identity hash map.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    transient Object[] table; // non-private to simplify nested class access

    /**
     * The table, resized as necessary. Length MUST always be a power of two.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private static final int MAXIMUM_CAPACITY = 1 << 29;

    /**
     * The maximum capacity, used if a higher value is implicitly specified
     * by either of the constructors with arguments.
     * MUST be a power of two <= 1<<29.
     *
     * In fact, the map can hold no more than MAXIMUM_CAPACITY-1 items
     * because it has to have at least one slot with the key == null
     * in order to avoid infinite loops in get(), put(), remove()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private static final int MINIMUM_CAPACITY = 4;

    /**
     * The minimum capacity, used if a lower value is implicitly specified
     * by either of the constructors with arguments.  The value 4 corresponds
     * to an expected maximum size of 2, given a load factor of 2/3.
     * MUST be a power of two.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
    private static final int DEFAULT_CAPACITY = 32;

    /**
     * The initial capacity used by the no-args constructor.
     * MUST be a power of two.  The value 32 corresponds to the
     * (specified) expected maximum size of 21, given a load factor
     * of 2/3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IdentityHashMap.java
public class IdentityHashMap<K,V>

/**
 * This class implements the <tt>Map</tt> interface with a hash table, using
 * reference-equality in place of object-equality when comparing keys (and
 * values).  In other words, in an <tt>IdentityHashMap</tt>, two keys
 * <tt>k1</tt> and <tt>k2</tt> are considered equal if and only if
 * <tt>(k1==k2)</tt>.  (In normal <tt>Map</tt> implementations (like
 * <tt>HashMap</tt>) two keys <tt>k1</tt> and <tt>k2</tt> are considered equal
 * if and only if <tt>(k1==null ? k2==null : k1.equals(k2))</tt>.)
 *
 * <p><b>This class is <i>not</i> a general-purpose <tt>Map</tt>
 * implementation!  While this class implements the <tt>Map</tt> interface, it
 * intentionally violates <tt>Map's</tt> general contract, which mandates the
 * use of the <tt>equals</tt> method when comparing objects.  This class is
 * designed for use only in the rare cases wherein reference-equality
 * semantics are required.</b>
 *
 * <p>A typical use of this class is <i>topology-preserving object graph
 * transformations</i>, such as serialization or deep-copying.  To perform such
 * a transformation, a program must maintain a "node table" that keeps track
 * of all the object references that have already been processed.  The node
 * table must not equate distinct objects even if they happen to be equal.
 * Another typical use of this class is to maintain <i>proxy objects</i>.  For
 * example, a debugging facility might wish to maintain a proxy object for
 * each object in the program being debugged.
 *
 * <p>This class provides all of the optional map operations, and permits
 * <tt>null</tt> values and the <tt>null</tt> key.  This class makes no
 * guarantees as to the order of the map; in particular, it does not guarantee
 * that the order will remain constant over time.
 *
 * <p>This class provides constant-time performance for the basic
 * operations (<tt>get</tt> and <tt>put</tt>), assuming the system
 * identity hash function ({@link System#identityHashCode(Object)})
 * disperses elements properly among the buckets.
 *
 * <p>This class has one tuning parameter (which affects performance but not
 * semantics): <i>expected maximum size</i>.  This parameter is the maximum
 * number of key-value mappings that the map is expected to hold.  Internally,
 * this parameter is used to determine the number of buckets initially
 * comprising the hash table.  The precise relationship between the expected
 * maximum size and the number of buckets is unspecified.
 *
 * <p>If the size of the map (the number of key-value mappings) sufficiently
 * exceeds the expected maximum size, the number of buckets is increased.
 * Increasing the number of buckets ("rehashing") may be fairly expensive, so
 * it pays to create identity hash maps with a sufficiently large expected
 * maximum size.  On the other hand, iteration over collection views requires
 * time proportional to the number of buckets in the hash table, so it
 * pays not to set the expected maximum size too high if you are especially
 * concerned with iteration performance or memory usage.
 *
 * <p><strong>Note that this implementation is not synchronized.</strong>
 * If multiple threads access an identity hash map concurrently, and at
 * least one of the threads modifies the map structurally, it <i>must</i>
 * be synchronized externally.  (A structural modification is any operation
 * that adds or deletes one or more mappings; merely changing the value
 * associated with a key that an instance already contains is not a
 * structural modification.)  This is typically accomplished by
 * synchronizing on some object that naturally encapsulates the map.
 *
 * If no such object exists, the map should be "wrapped" using the
 * {@link Collections#synchronizedMap Collections.synchronizedMap}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access to the map:<pre>
 *   Map m = Collections.synchronizedMap(new IdentityHashMap(...));</pre>
 *
 * <p>The iterators returned by the <tt>iterator</tt> method of the
 * collections returned by all of this class's "collection view
 * methods" are <i>fail-fast</i>: if the map is structurally modified
 * at any time after the iterator is created, in any way except
 * through the iterator's own <tt>remove</tt> method, the iterator
 * will throw a {@link ConcurrentModificationException}.  Thus, in the
 * face of concurrent modification, the iterator fails quickly and
 * cleanly, rather than risking arbitrary, non-deterministic behavior
 * at an undetermined time in the future.
 *
 * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
 * as it is, generally speaking, impossible to make any hard guarantees in the
 * presence of unsynchronized concurrent modification.  Fail-fast iterators
 * throw <tt>ConcurrentModificationException</tt> on a best-effort basis.
 * Therefore, it would be wrong to write a program that depended on this
 * exception for its correctness: <i>fail-fast iterators should be used only
 * to detect bugs.</i>
 *
 * <p>Implementation note: This is a simple <i>linear-probe</i> hash table,
 * as described for example in texts by Sedgewick and Knuth.  The array
 * alternates holding keys and values.  (This has better locality for large
 * tables than does using separate arrays.)  For many JRE implementations
 * and operation mixes, this class will yield better performance than
 * {@link HashMap} (which uses <i>chaining</i> rather than linear-probing).
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @see     System#identityHashCode(Object)
 * @see     Object#hashCode()
 * @see     Collection
 * @see     Map
 * @see     HashMap
 * @see     TreeMap
 * @author  Doug Lea and Josh Bloch
 * @since   1.4
 */
