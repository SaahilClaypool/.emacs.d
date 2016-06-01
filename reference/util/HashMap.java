_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        static <K,V> boolean checkInvariants(TreeNode<K,V> t) {

        /**
         * Recursive invariant check
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final void split(HashMap<K,V> map, Node<K,V>[] tab, int index, int bit) {

        /**
         * Splits nodes in a tree bin into lower and upper tree bins,
         * or untreeifies if now too small. Called only from resize;
         * see above discussion about split bits and indices.
         *
         * @param map the map
         * @param tab the table for recording bin heads
         * @param index the index of the table being split
         * @param bit the bit of hash to split on
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final void removeTreeNode(HashMap<K,V> map, Node<K,V>[] tab,
                                  boolean movable) {

        /**
         * Removes the given node, that must be present before this call.
         * This is messier than typical red-black deletion code because we
         * cannot swap the contents of an interior node with a leaf
         * successor that is pinned by "next" pointers that are accessible
         * independently during traversal. So instead we swap the tree
         * linkages. If the current tree appears to have too few nodes,
         * the bin is converted back to a plain bin. (The test triggers
         * somewhere between 2 and 6 nodes, depending on tree structure).
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final TreeNode<K,V> putTreeVal(HashMap<K,V> map, Node<K,V>[] tab,
                                       int h, K k, V v) {

        /**
         * Tree version of putVal.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final Node<K,V> untreeify(HashMap<K,V> map) {

        /**
         * Returns a list of non-TreeNodes replacing those linked from
         * this node.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final void treeify(Node<K,V>[] tab) {

        /**
         * Forms tree of the nodes linked from this node.
         * @return root of tree
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        static int tieBreakOrder(Object a, Object b) {

        /**
         * Tie-breaking utility for ordering insertions when equal
         * hashCodes and non-comparable. We don't require a total
         * order, just a consistent insertion rule to maintain
         * equivalence across rebalancings. Tie-breaking further than
         * necessary simplifies testing a bit.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final TreeNode<K,V> getTreeNode(int h, Object k) {

        /**
         * Calls find for root node.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final TreeNode<K,V> find(int h, Object k, Class<?> kc) {

        /**
         * Finds the node starting at root p with the given hash and key.
         * The kc argument caches comparableClassFor(key) upon first use
         * comparing keys.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        static <K,V> void moveRootToFront(Node<K,V>[] tab, TreeNode<K,V> root) {

        /**
         * Ensures that the given root is the first node of its bin.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
        final TreeNode<K,V> root() {

        /**
         * Returns root of tree containing this node.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final class TreeNode<K,V> extends LinkedHashMap.Entry<K,V> {

    /**
     * Entry for Tree bins. Extends LinkedHashMap.Entry (which in turn
     * extends Node) so can be used as extension of either regular or
     * linked node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    void reinitialize() {

    /**
     * Reset to initial default state.  Called by clone and readObject.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitute the {@code HashMap} instance from a stream (i.e.,
     * deserialize it).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Save the state of the <tt>HashMap</tt> instance to a stream (i.e.,
     * serialize it).
     *
     * @serialData The <i>capacity</i> of the HashMap (the length of the
     *             bucket array) is emitted (int), followed by the
     *             <i>size</i> (an int, the number of key-value
     *             mappings), followed by the key (Object) and value (Object)
     *             for each key-value mapping.  The key-value mappings are
     *             emitted in no particular order.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a shallow copy of this <tt>HashMap</tt> instance: the keys and
     * values themselves are not cloned.
     *
     * @return a shallow copy of this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public Set<Map.Entry<K,V>> entrySet() {

    /**
     * Returns a {@link Set} view of the mappings contained in this map.
     * The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa.  If the map is modified
     * while an iteration over the set is in progress (except through
     * the iterator's own <tt>remove</tt> operation, or through the
     * <tt>setValue</tt> operation on a map entry returned by the
     * iterator) the results of the iteration are undefined.  The set
     * supports element removal, which removes the corresponding
     * mapping from the map, via the <tt>Iterator.remove</tt>,
     * <tt>Set.remove</tt>, <tt>removeAll</tt>, <tt>retainAll</tt> and
     * <tt>clear</tt> operations.  It does not support the
     * <tt>add</tt> or <tt>addAll</tt> operations.
     *
     * @return a set view of the mappings contained in this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public Collection<V> values() {

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     * The collection is backed by the map, so changes to the map are
     * reflected in the collection, and vice-versa.  If the map is
     * modified while an iteration over the collection is in progress
     * (except through the iterator's own <tt>remove</tt> operation),
     * the results of the iteration are undefined.  The collection
     * supports element removal, which removes the corresponding
     * mapping from the map, via the <tt>Iterator.remove</tt>,
     * <tt>Collection.remove</tt>, <tt>removeAll</tt>,
     * <tt>retainAll</tt> and <tt>clear</tt> operations.  It does not
     * support the <tt>add</tt> or <tt>addAll</tt> operations.
     *
     * @return a view of the values contained in this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public Set<K> keySet() {

    /**
     * Returns a {@link Set} view of the keys contained in this map.
     * The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa.  If the map is modified
     * while an iteration over the set is in progress (except through
     * the iterator's own <tt>remove</tt> operation), the results of
     * the iteration are undefined.  The set supports element removal,
     * which removes the corresponding mapping from the map, via the
     * <tt>Iterator.remove</tt>, <tt>Set.remove</tt>,
     * <tt>removeAll</tt>, <tt>retainAll</tt>, and <tt>clear</tt>
     * operations.  It does not support the <tt>add</tt> or <tt>addAll</tt>
     * operations.
     *
     * @return a set view of the keys contained in this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public boolean containsValue(Object value) {

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.
     *
     * @param value value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public void clear() {

    /**
     * Removes all of the mappings from this map.
     * The map will be empty after this call returns.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    final Node<K,V> removeNode(int hash, Object key, Object value,
                               boolean matchValue, boolean movable) {

    /**
     * Implements Map.remove and related methods
     *
     * @param hash hash for key
     * @param key the key
     * @param value the value to match if matchValue, else ignored
     * @param matchValue if true only remove if value is equal
     * @param movable if false do not move other nodes while removing
     * @return the node, or null if none
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public V remove(Object key) {

    /**
     * Removes the mapping for the specified key from this map if present.
     *
     * @param  key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     *         (A <tt>null</tt> return can also indicate that the map
     *         previously associated <tt>null</tt> with <tt>key</tt>.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    final void treeifyBin(Node<K,V>[] tab, int hash) {

    /**
     * Replaces all linked nodes in bin at index for given hash unless
     * table is too small, in which case resizes instead.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    final Node<K,V>[] resize() {

    /**
     * Initializes or doubles table size.  If null, allocates in
     * accord with initial capacity target held in field threshold.
     * Otherwise, because we are using power-of-two expansion, the
     * elements from each bin must either stay at same index, or move
     * with a power of two offset in the new table.
     *
     * @return the table
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {

    /**
     * Implements Map.put and related methods
     *
     * @param hash hash for key
     * @param key the key
     * @param value the value to put
     * @param onlyIfAbsent if true, don't change existing value
     * @param evict if false, the table is in creation mode.
     * @return previous value, or null if none
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public V put(K key, V value) {

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     *         (A <tt>null</tt> return can also indicate that the map
     *         previously associated <tt>null</tt> with <tt>key</tt>.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public boolean containsKey(Object key) {

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the
     * specified key.
     *
     * @param   key   The key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the specified
     * key.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    final Node<K,V> getNode(int hash, Object key) {

    /**
     * Implements Map.get and related methods
     *
     * @param hash hash for key
     * @param key the key
     * @return the node, or null if none
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public V get(Object key) {

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     *
     * <p>More formally, if this map contains a mapping from a key
     * {@code k} to a value {@code v} such that {@code (key==null ? k==null :
     * key.equals(k))}, then this method returns {@code v}; otherwise
     * it returns {@code null}.  (There can be at most one such mapping.)
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public boolean isEmpty() {

    /**
     * Returns <tt>true</tt> if this map contains no key-value mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value mappings
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public int size() {

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    final void putMapEntries(Map<? extends K, ? extends V> m, boolean evict) {

    /**
     * Implements Map.putAll and Map constructor
     *
     * @param m the map
     * @param evict false when initially constructing this map, else
     * true (relayed to method afterNodeInsertion).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public HashMap(Map<? extends K, ? extends V> m) {

    /**
     * Constructs a new <tt>HashMap</tt> with the same mappings as the
     * specified <tt>Map</tt>.  The <tt>HashMap</tt> is created with
     * default load factor (0.75) and an initial capacity sufficient to
     * hold the mappings in the specified <tt>Map</tt>.
     *
     * @param   m the map whose mappings are to be placed in this map
     * @throws  NullPointerException if the specified map is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public HashMap() {

    /**
     * Constructs an empty <tt>HashMap</tt> with the default initial capacity
     * (16) and the default load factor (0.75).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public HashMap(int initialCapacity) {

    /**
     * Constructs an empty <tt>HashMap</tt> with the specified initial
     * capacity and the default load factor (0.75).
     *
     * @param  initialCapacity the initial capacity.
     * @throws IllegalArgumentException if the initial capacity is negative.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    public HashMap(int initialCapacity, float loadFactor) {

    /**
     * Constructs an empty <tt>HashMap</tt> with the specified initial
     * capacity and load factor.
     *
     * @param  initialCapacity the initial capacity
     * @param  loadFactor      the load factor
     * @throws IllegalArgumentException if the initial capacity is negative
     *         or the load factor is nonpositive
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    final float loadFactor;

    /**
     * The load factor for the hash table.
     *
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    // (The javadoc description is true upon serialization.
    // Additionally, if the table array has not been allocated, this
    // field holds the initial array capacity, or zero signifying
    // DEFAULT_INITIAL_CAPACITY.)

    /**
     * The next size value at which to resize (capacity * load factor).
     *
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    transient int modCount;

    /**
     * The number of times this HashMap has been structurally modified
     * Structural modifications are those that change the number of mappings in
     * the HashMap or otherwise modify its internal structure (e.g.,
     * rehash).  This field is used to make iterators on Collection-views of
     * the HashMap fail-fast.  (See ConcurrentModificationException).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    transient int size;

    /**
     * The number of key-value mappings contained in this map.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    transient Set<Map.Entry<K,V>> entrySet;

    /**
     * Holds cached entrySet(). Note that AbstractMap fields are used
     * for keySet() and values().
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    transient Node<K,V>[] table;

    /**
     * The table, initialized on first use, and resized as
     * necessary. When allocated, length is always a power of two.
     * (We also tolerate length zero in some operations to allow
     * bootstrapping mechanics that are currently not needed.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final int tableSizeFor(int cap) {

    /**
     * Returns a power of two size for the given target capacity.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    @SuppressWarnings({"rawtypes","unchecked"}) // for cast to Comparable

    /**
     * Returns k.compareTo(x) if x matches kc (k's screened comparable
     * class), else 0.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static Class<?> comparableClassFor(Object x) {

    /**
     * Returns x's Class if it is of the form "class C implements
     * Comparable<C>", else null.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final int hash(Object key) {

    /**
     * Computes key.hashCode() and spreads (XORs) higher bits of hash
     * to lower.  Because the table uses power-of-two masking, sets of
     * hashes that vary only in bits above the current mask will
     * always collide. (Among known examples are sets of Float keys
     * holding consecutive whole numbers in small tables.)  So we
     * apply a transform that spreads the impact of higher bits
     * downward. There is a tradeoff between speed, utility, and
     * quality of bit-spreading. Because many common sets of hashes
     * are already reasonably distributed (so don't benefit from
     * spreading), and because we use trees to handle large sets of
     * collisions in bins, we just XOR some shifted bits in the
     * cheapest possible way to reduce systematic lossage, as well as
     * to incorporate impact of the highest bits that would otherwise
     * never be used in index calculations because of table bounds.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static class Node<K,V> implements Map.Entry<K,V> {

    /**
     * Basic hash bin node, used for most entries.  (See below for
     * TreeNode subclass, and in LinkedHashMap for its Entry subclass.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final int MIN_TREEIFY_CAPACITY = 64;

    /**
     * The smallest table capacity for which bins may be treeified.
     * (Otherwise the table is resized if too many nodes in a bin.)
     * Should be at least 4 * TREEIFY_THRESHOLD to avoid conflicts
     * between resizing and treeification thresholds.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final int UNTREEIFY_THRESHOLD = 6;

    /**
     * The bin count threshold for untreeifying a (split) bin during a
     * resize operation. Should be less than TREEIFY_THRESHOLD, and at
     * most 6 to mesh with shrinkage detection under removal.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final int TREEIFY_THRESHOLD = 8;

    /**
     * The bin count threshold for using a tree rather than list for a
     * bin.  Bins are converted to trees when adding an element to a
     * bin with at least this many nodes. The value must be greater
     * than 2 and should be at least 8 to mesh with assumptions in
     * tree removal about conversion back to plain bins upon
     * shrinkage.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    /**
     * The load factor used when none specified in constructor.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * The maximum capacity, used if a higher value is implicitly specified
     * by either of the constructors with arguments.
     * MUST be a power of two <= 1<<30.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16

    /**
     * The default initial capacity - MUST be a power of two.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//HashMap.java
public class HashMap<K,V> extends AbstractMap<K,V>

/**
 * Hash table based implementation of the <tt>Map</tt> interface.  This
 * implementation provides all of the optional map operations, and permits
 * <tt>null</tt> values and the <tt>null</tt> key.  (The <tt>HashMap</tt>
 * class is roughly equivalent to <tt>Hashtable</tt>, except that it is
 * unsynchronized and permits nulls.)  This class makes no guarantees as to
 * the order of the map; in particular, it does not guarantee that the order
 * will remain constant over time.
 *
 * <p>This implementation provides constant-time performance for the basic
 * operations (<tt>get</tt> and <tt>put</tt>), assuming the hash function
 * disperses the elements properly among the buckets.  Iteration over
 * collection views requires time proportional to the "capacity" of the
 * <tt>HashMap</tt> instance (the number of buckets) plus its size (the number
 * of key-value mappings).  Thus, it's very important not to set the initial
 * capacity too high (or the load factor too low) if iteration performance is
 * important.
 *
 * <p>An instance of <tt>HashMap</tt> has two parameters that affect its
 * performance: <i>initial capacity</i> and <i>load factor</i>.  The
 * <i>capacity</i> is the number of buckets in the hash table, and the initial
 * capacity is simply the capacity at the time the hash table is created.  The
 * <i>load factor</i> is a measure of how full the hash table is allowed to
 * get before its capacity is automatically increased.  When the number of
 * entries in the hash table exceeds the product of the load factor and the
 * current capacity, the hash table is <i>rehashed</i> (that is, internal data
 * structures are rebuilt) so that the hash table has approximately twice the
 * number of buckets.
 *
 * <p>As a general rule, the default load factor (.75) offers a good
 * tradeoff between time and space costs.  Higher values decrease the
 * space overhead but increase the lookup cost (reflected in most of
 * the operations of the <tt>HashMap</tt> class, including
 * <tt>get</tt> and <tt>put</tt>).  The expected number of entries in
 * the map and its load factor should be taken into account when
 * setting its initial capacity, so as to minimize the number of
 * rehash operations.  If the initial capacity is greater than the
 * maximum number of entries divided by the load factor, no rehash
 * operations will ever occur.
 *
 * <p>If many mappings are to be stored in a <tt>HashMap</tt>
 * instance, creating it with a sufficiently large capacity will allow
 * the mappings to be stored more efficiently than letting it perform
 * automatic rehashing as needed to grow the table.  Note that using
 * many keys with the same {@code hashCode()} is a sure way to slow
 * down performance of any hash table. To ameliorate impact, when keys
 * are {@link Comparable}, this class may use comparison order among
 * keys to help break ties.
 *
 * <p><strong>Note that this implementation is not synchronized.</strong>
 * If multiple threads access a hash map concurrently, and at least one of
 * the threads modifies the map structurally, it <i>must</i> be
 * synchronized externally.  (A structural modification is any operation
 * that adds or deletes one or more mappings; merely changing the value
 * associated with a key that an instance already contains is not a
 * structural modification.)  This is typically accomplished by
 * synchronizing on some object that naturally encapsulates the map.
 *
 * If no such object exists, the map should be "wrapped" using the
 * {@link Collections#synchronizedMap Collections.synchronizedMap}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access to the map:<pre>
 *   Map m = Collections.synchronizedMap(new HashMap(...));</pre>
 *
 * <p>The iterators returned by all of this class's "collection view methods"
 * are <i>fail-fast</i>: if the map is structurally modified at any time after
 * the iterator is created, in any way except through the iterator's own
 * <tt>remove</tt> method, the iterator will throw a
 * {@link ConcurrentModificationException}.  Thus, in the face of concurrent
 * modification, the iterator fails quickly and cleanly, rather than risking
 * arbitrary, non-deterministic behavior at an undetermined time in the
 * future.
 *
 * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
 * as it is, generally speaking, impossible to make any hard guarantees in the
 * presence of unsynchronized concurrent modification.  Fail-fast iterators
 * throw <tt>ConcurrentModificationException</tt> on a best-effort basis.
 * Therefore, it would be wrong to write a program that depended on this
 * exception for its correctness: <i>the fail-fast behavior of iterators
 * should be used only to detect bugs.</i>
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 *
 * @author  Doug Lea
 * @author  Josh Bloch
 * @author  Arthur van Hoff
 * @author  Neal Gafter
 * @see     Object#hashCode()
 * @see     Collection
 * @see     Map
 * @see     TreeMap
 * @see     Hashtable
 * @since   1.2
 */
