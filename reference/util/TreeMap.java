_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static class TreeMapSpliterator<K,V> {

    /**
     * Base class for spliterators.  Iteration starts at a given
     * origin and continues up to but not including a given fence (or
     * null for end).  At top-level, for ascending cases, the first
     * split uses the root as left-fence/right-origin. From there,
     * right-hand splits replace the current fence with its left
     * child, also serving as origin for the split-off spliterator.
     * Left-hands are symmetric. Descending versions place the origin
     * at the end and invert ascending split rules.  This base class
     * is non-commital about directionality, or whether the top-level
     * spliterator covers the whole tree. This means that the actual
     * split mechanics are located in subclasses. Some of the subclass
     * trySplit methods are identical (except for return types), but
     * not nicely factorable.
     *
     * Currently, subclass versions exist only for the full map
     * (including descending keys via its descendingMap).  Others are
     * possible but currently not worthwhile because submaps require
     * O(n) computations to determine size, which substantially limits
     * potential speed-ups of using custom Spliterators versus default
     * mechanics.
     *
     * To boostrap initialization, external constructors use
     * negative size estimates: -1 for ascend, -2 for descend.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static <K> Spliterator<K> keySpliteratorFor(NavigableMap<K,?> m) {

    /**
     * Currently, we support Spliterator-based versions only for the
     * full map, in either plain of descending form, otherwise relying
     * on defaults because size estimation for submaps would dominate
     * costs. The type tests needed to check these for key views are
     * not very nice but avoid disrupting existing class
     * structures. Callers must use plain default spliterators if this
     * returns null.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private static int computeRedLevel(int sz) {

    /**
     * Find the level down to which to assign all nodes BLACK.  This is the
     * last `full' level of the complete binary tree produced by
     * buildTree. The remaining nodes are colored RED. (This makes a `nice'
     * set of color assignments wrt future insertions.) This level number is
     * computed by finding the number of splits needed to reach the zeroeth
     * node.  (The answer is ~lg(N), but in any case must be computed by same
     * quick O(lg(N)) loop.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    @SuppressWarnings("unchecked")

    /**
     * Recursive "helper method" that does the real work of the
     * previous method.  Identically named parameters have
     * identical definitions.  Additional parameters are documented below.
     * It is assumed that the comparator and size fields of the TreeMap are
     * already set prior to calling this method.  (It ignores both fields.)
     *
     * @param level the current level of tree. Initial call should be 0.
     * @param lo the first element index of this subtree. Initial should be 0.
     * @param hi the last element index of this subtree.  Initial should be
     *        size-1.
     * @param redLevel the level at which nodes should be red.
     *        Must be equal to computeRedLevel for tree of this size.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void buildFromSorted(int size, Iterator<?> it,
                                 java.io.ObjectInputStream str,
                                 V defaultVal)

    /**
     * Linear time tree building algorithm from sorted data.  Can accept keys
     * and/or values from iterator or stream. This leads to too many
     * parameters, but seems better than alternatives.  The four formats
     * that this method accepts are:
     *
     *    1) An iterator of Map.Entries.  (it != null, defaultVal == null).
     *    2) An iterator of keys.         (it != null, defaultVal != null).
     *    3) A stream of alternating serialized keys and values.
     *                                   (it == null, defaultVal == null).
     *    4) A stream of serialized keys. (it == null, defaultVal != null).
     *
     * It is assumed that the comparator of the TreeMap is already set prior
     * to calling this method.
     *
     * @param size the number of keys (or key-value pairs) to be read from
     *        the iterator or stream
     * @param it If non-null, new entries are created from entries
     *        or keys read from this iterator.
     * @param str If non-null, new entries are created from keys and
     *        possibly values read from this stream in serialized form.
     *        Exactly one of it and str should be non-null.
     * @param defaultVal if non-null, this default value is used for
     *        each value in the map.  If null, each value is read from
     *        iterator or stream, as described above.
     * @throws java.io.IOException propagated from stream reads. This cannot
     *         occur if str is null.
     * @throws ClassNotFoundException propagated from readObject.
     *         This cannot occur if str is null.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    void addAllForTreeSet(SortedSet<? extends K> set, V defaultVal) {

    /** Intended to be called only from TreeSet.addAll */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    void readTreeSet(int size, java.io.ObjectInputStream s, V defaultVal)

    /** Intended to be called only from TreeSet.readObject */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void readObject(final java.io.ObjectInputStream s)

    /**
     * Reconstitute the {@code TreeMap} instance from a stream (i.e.,
     * deserialize it).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Save the state of the {@code TreeMap} instance to a stream (i.e.,
     * serialize it).
     *
     * @serialData The <em>size</em> of the TreeMap (the number of key-value
     *             mappings) is emitted (int), followed by the key (Object)
     *             and value (Object) for each key-value mapping represented
     *             by the TreeMap. The key-value mappings are emitted in
     *             key-order (as determined by the TreeMap's Comparator,
     *             or by the keys' natural ordering if the TreeMap has no
     *             Comparator).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void fixAfterDeletion(Entry<K,V> x) {

    /** From CLR */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void deleteEntry(Entry<K,V> p) {

    /**
     * Delete node p, and then rebalance the tree.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void fixAfterInsertion(Entry<K,V> x) {

    /** From CLR */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void rotateRight(Entry<K,V> p) {

    /** From CLR */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private void rotateLeft(Entry<K,V> p) {

    /** From CLR */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private static <K,V> boolean colorOf(Entry<K,V> p) {

    /**
     * Balancing operations.
     *
     * Implementations of rebalancings during insertion and deletion are
     * slightly different than the CLR version.  Rather than using dummy
     * nilnodes, we use a set of accessors that deal properly with null.  They
     * are used to avoid messiness surrounding nullness checks in the main
     * algorithms.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static <K,V> Entry<K,V> predecessor(Entry<K,V> t) {

    /**
     * Returns the predecessor of the specified Entry, or null if no such.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static <K,V> TreeMap.Entry<K,V> successor(Entry<K,V> t) {

    /**
     * Returns the successor of the specified Entry, or null if no such.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getLastEntry() {

    /**
     * Returns the last Entry in the TreeMap (according to the TreeMap's
     * key-sort function).  Returns null if the TreeMap is empty.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getFirstEntry() {

    /**
     * Returns the first Entry in the TreeMap (according to the TreeMap's
     * key-sort function).  Returns null if the TreeMap is empty.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        public V setValue(V value) {

        /**
         * Replaces the value currently associated with the key with the given
         * value.
         *
         * @return the value associated with the key before this method was
         *         called
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        public V getValue() {

        /**
         * Returns the value associated with the key.
         *
         * @return the value associated with the key
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        public K getKey() {

        /**
         * Returns the key.
         *
         * @return the key
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        Entry(K key, V value, Entry<K,V> parent) {

        /**
         * Make a new cell with given key, value, and parent, and with
         * {@code null} child links, and BLACK color.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static final class Entry<K,V> implements Map.Entry<K,V> {

    /**
     * Node in the Tree.  Doubles as a means to pass key-value pairs back to
     * user (see Map.Entry).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private class SubMap extends AbstractMap<K,V>

    /**
     * This class exists solely for the sake of serialization
     * compatibility with previous releases of TreeMap that did not
     * support NavigableMap.  It translates an old-version SubMap into
     * a new-version AscendingSubMap. This class is never otherwise
     * used.
     *
     * @serial include
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static final class DescendingSubMap<K,V>  extends NavigableSubMap<K,V> {

    /**
     * @serial include
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static final class AscendingSubMap<K,V> extends NavigableSubMap<K,V> {

    /**
     * @serial include
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        abstract class SubMapIterator<T> implements Iterator<T> {

        /**
         * Iterators for SubMaps
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        abstract Iterator<K> descendingKeyIterator();

        /** Returns descending iterator from the perspective of this submap */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        abstract Iterator<K> keyIterator();

        /** Returns ascending iterator from the perspective of this submap */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        final TreeMap.Entry<K,V> absLowFence() {

        /** Return the absolute low fence for descending traversal  */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        final TreeMap.Entry<K,V> absHighFence() {

        /** Returns the absolute high fence for ascending traversal */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        final K lo, hi;

        /**
         * Endpoints are represented as triples (fromStart, lo,
         * loInclusive) and (toEnd, hi, hiInclusive). If fromStart is
         * true, then the low (absolute) bound is the start of the
         * backing map, and the other values are ignored. Otherwise,
         * if loInclusive is true, lo is the inclusive bound, else lo
         * is the exclusive bound. Similarly for the upper bound.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
        final TreeMap<K,V> m;

        /**
         * The backing map.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    abstract static class NavigableSubMap<K,V> extends AbstractMap<K,V>

    /**
     * @serial include
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private static final Object UNBOUNDED = new Object();

    /**
     * Dummy value serving as unmatchable fence key for unbounded
     * SubMapIterators
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static <K> K key(Entry<K,?> e) {

    /**
     * Returns the key corresponding to the specified Entry.
     * @throws NoSuchElementException if the Entry is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static <K,V> K keyOrNull(TreeMap.Entry<K,V> e) {

    /**
     * Return key for entry, or null if null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static <K,V> Map.Entry<K,V> exportEntry(TreeMap.Entry<K,V> e) {

    /**
     * Return SimpleImmutableEntry for entry, or null if null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    static final boolean valEquals(Object o1, Object o2) {

    /**
     * Test two values for equality.  Differs from o1.equals(o2) only in
     * that it copes with {@code null} o1 properly.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    @SuppressWarnings("unchecked")

    /**
     * Compares two keys using the correct comparison method for this TreeMap.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    abstract class PrivateEntryIterator<T> implements Iterator<T> {

    /**
     * Base class for TreeMap Iterators
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public SortedMap<K,V> tailMap(K fromKey) {

    /**
     * @throws ClassCastException       {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public SortedMap<K,V> headMap(K toKey) {

    /**
     * @throws ClassCastException       {@inheritDoc}
     * @throws NullPointerException if {@code toKey} is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public SortedMap<K,V> subMap(K fromKey, K toKey) {

    /**
     * @throws ClassCastException       {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} or {@code toKey} is
     *         null and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public NavigableMap<K,V> tailMap(K fromKey, boolean inclusive) {

    /**
     * @throws ClassCastException       {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @throws IllegalArgumentException {@inheritDoc}
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public NavigableMap<K,V> headMap(K toKey, boolean inclusive) {

    /**
     * @throws ClassCastException       {@inheritDoc}
     * @throws NullPointerException if {@code toKey} is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @throws IllegalArgumentException {@inheritDoc}
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive,
                                    K toKey,   boolean toInclusive) {

    /**
     * @throws ClassCastException       {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} or {@code toKey} is
     *         null and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @throws IllegalArgumentException {@inheritDoc}
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public NavigableMap<K, V> descendingMap() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Set<Map.Entry<K,V>> entrySet() {

    /**
     * Returns a {@link Set} view of the mappings contained in this map.
     *
     * <p>The set's iterator returns the entries in ascending key order. The
     * sets's spliterator is
     * <em><a href="Spliterator.html#binding">late-binding</a></em>,
     * <em>fail-fast</em>, and additionally reports {@link Spliterator#SORTED} and
     * {@link Spliterator#ORDERED} with an encounter order that is ascending key
     * order.
     *
     * <p>The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa.  If the map is modified
     * while an iteration over the set is in progress (except through
     * the iterator's own {@code remove} operation, or through the
     * {@code setValue} operation on a map entry returned by the
     * iterator) the results of the iteration are undefined.  The set
     * supports element removal, which removes the corresponding
     * mapping from the map, via the {@code Iterator.remove},
     * {@code Set.remove}, {@code removeAll}, {@code retainAll} and
     * {@code clear} operations.  It does not support the
     * {@code add} or {@code addAll} operations.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Collection<V> values() {

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     *
     * <p>The collection's iterator returns the values in ascending order
     * of the corresponding keys. The collection's spliterator is
     * <em><a href="Spliterator.html#binding">late-binding</a></em>,
     * <em>fail-fast</em>, and additionally reports {@link Spliterator#ORDERED}
     * with an encounter order that is ascending order of the corresponding
     * keys.
     *
     * <p>The collection is backed by the map, so changes to the map are
     * reflected in the collection, and vice-versa.  If the map is
     * modified while an iteration over the collection is in progress
     * (except through the iterator's own {@code remove} operation),
     * the results of the iteration are undefined.  The collection
     * supports element removal, which removes the corresponding
     * mapping from the map, via the {@code Iterator.remove},
     * {@code Collection.remove}, {@code removeAll},
     * {@code retainAll} and {@code clear} operations.  It does not
     * support the {@code add} or {@code addAll} operations.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public NavigableSet<K> descendingKeySet() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public NavigableSet<K> navigableKeySet() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Set<K> keySet() {

    /**
     * Returns a {@link Set} view of the keys contained in this map.
     *
     * <p>The set's iterator returns the keys in ascending order.
     * The set's spliterator is
     * <em><a href="Spliterator.html#binding">late-binding</a></em>,
     * <em>fail-fast</em>, and additionally reports {@link Spliterator#SORTED}
     * and {@link Spliterator#ORDERED} with an encounter order that is ascending
     * key order.  The spliterator's comparator (see
     * {@link java.util.Spliterator#getComparator()}) is {@code null} if
     * the tree map's comparator (see {@link #comparator()}) is {@code null}.
     * Otherwise, the spliterator's comparator is the same as or imposes the
     * same total ordering as the tree map's comparator.
     *
     * <p>The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa.  If the map is modified
     * while an iteration over the set is in progress (except through
     * the iterator's own {@code remove} operation), the results of
     * the iteration are undefined.  The set supports element removal,
     * which removes the corresponding mapping from the map, via the
     * {@code Iterator.remove}, {@code Set.remove},
     * {@code removeAll}, {@code retainAll}, and {@code clear}
     * operations.  It does not support the {@code add} or {@code addAll}
     * operations.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private transient EntrySet entrySet;

    /**
     * Fields initialized to contain an instance of the entry set view
     * the first time this view is requested.  Views are stateless, so
     * there's no reason to create more than one.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public K higherKey(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> higherEntry(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public K ceilingKey(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> ceilingEntry(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public K floorKey(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> floorEntry(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public K lowerKey(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> lowerEntry(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> pollLastEntry() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> pollFirstEntry() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> lastEntry() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Map.Entry<K,V> firstEntry() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public Object clone() {

    /**
     * Returns a shallow copy of this {@code TreeMap} instance. (The keys and
     * values themselves are not cloned.)
     *
     * @return a shallow copy of this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public void clear() {

    /**
     * Removes all of the mappings from this map.
     * The map will be empty after this call returns.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public V remove(Object key) {

    /**
     * Removes the mapping for this key from this TreeMap if present.
     *
     * @param  key key for which mapping should be removed
     * @return the previous value associated with {@code key}, or
     *         {@code null} if there was no mapping for {@code key}.
     *         (A {@code null} return can also indicate that the map
     *         previously associated {@code null} with {@code key}.)
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public V put(K key, V value) {

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     *
     * @return the previous value associated with {@code key}, or
     *         {@code null} if there was no mapping for {@code key}.
     *         (A {@code null} return can also indicate that the map
     *         previously associated {@code null} with {@code key}.)
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getLowerEntry(K key) {

    /**
     * Returns the entry for the greatest key less than the specified key; if
     * no such entry exists (i.e., the least key in the Tree is greater than
     * the specified key), returns {@code null}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getHigherEntry(K key) {

    /**
     * Gets the entry for the least key greater than the specified
     * key; if no such entry exists, returns the entry for the least
     * key greater than the specified key; if no such entry exists
     * returns {@code null}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getFloorEntry(K key) {

    /**
     * Gets the entry corresponding to the specified key; if no such entry
     * exists, returns the entry for the greatest key less than the specified
     * key; if no such entry exists, returns {@code null}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getCeilingEntry(K key) {

    /**
     * Gets the entry corresponding to the specified key; if no such entry
     * exists, returns the entry for the least key greater than the specified
     * key; if no such entry exists (i.e., the greatest key in the Tree is less
     * than the specified key), returns {@code null}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getEntryUsingComparator(Object key) {

    /**
     * Version of getEntry using comparator. Split off from getEntry
     * for performance. (This is not worth doing for most methods,
     * that are less dependent on comparator performance, but is
     * worthwhile here.)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    final Entry<K,V> getEntry(Object key) {

    /**
     * Returns this map's entry for the given key, or {@code null} if the map
     * does not contain an entry for the key.
     *
     * @return this map's entry for the given key, or {@code null} if the map
     *         does not contain an entry for the key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public void putAll(Map<? extends K, ? extends V> map) {

    /**
     * Copies all of the mappings from the specified map to this map.
     * These mappings replace any mappings that this map had for any
     * of the keys currently in the specified map.
     *
     * @param  map mappings to be stored in this map
     * @throws ClassCastException if the class of a key or value in
     *         the specified map prevents it from being stored in this map
     * @throws NullPointerException if the specified map is null or
     *         the specified map contains a null key and this map does not
     *         permit null keys
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public K lastKey() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public K firstKey() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public V get(Object key) {

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     *
     * <p>More formally, if this map contains a mapping from a key
     * {@code k} to a value {@code v} such that {@code key} compares
     * equal to {@code k} according to the map's ordering, then this
     * method returns {@code v}; otherwise it returns {@code null}.
     * (There can be at most one such mapping.)
     *
     * <p>A return value of {@code null} does not <em>necessarily</em>
     * indicate that the map contains no mapping for the key; it's also
     * possible that the map explicitly maps the key to {@code null}.
     * The {@link #containsKey containsKey} operation may be used to
     * distinguish these two cases.
     *
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public boolean containsValue(Object value) {

    /**
     * Returns {@code true} if this map maps one or more keys to the
     * specified value.  More formally, returns {@code true} if and only if
     * this map contains at least one mapping to a value {@code v} such
     * that {@code (value==null ? v==null : value.equals(v))}.  This
     * operation will probably require time linear in the map size for
     * most implementations.
     *
     * @param value value whose presence in this map is to be tested
     * @return {@code true} if a mapping to {@code value} exists;
     *         {@code false} otherwise
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public boolean containsKey(Object key) {

    /**
     * Returns {@code true} if this map contains a mapping for the specified
     * key.
     *
     * @param key key whose presence in this map is to be tested
     * @return {@code true} if this map contains a mapping for the
     *         specified key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     *         and this map uses natural ordering, or its comparator
     *         does not permit null keys
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public int size() {

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public TreeMap(SortedMap<K, ? extends V> m) {

    /**
     * Constructs a new tree map containing the same mappings and
     * using the same ordering as the specified sorted map.  This
     * method runs in linear time.
     *
     * @param  m the sorted map whose mappings are to be placed in this map,
     *         and whose comparator is to be used to sort this map
     * @throws NullPointerException if the specified map is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public TreeMap(Map<? extends K, ? extends V> m) {

    /**
     * Constructs a new tree map containing the same mappings as the given
     * map, ordered according to the <em>natural ordering</em> of its keys.
     * All keys inserted into the new map must implement the {@link
     * Comparable} interface.  Furthermore, all such keys must be
     * <em>mutually comparable</em>: {@code k1.compareTo(k2)} must not throw
     * a {@code ClassCastException} for any keys {@code k1} and
     * {@code k2} in the map.  This method runs in n*log(n) time.
     *
     * @param  m the map whose mappings are to be placed in this map
     * @throws ClassCastException if the keys in m are not {@link Comparable},
     *         or are not mutually comparable
     * @throws NullPointerException if the specified map is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public TreeMap(Comparator<? super K> comparator) {

    /**
     * Constructs a new, empty tree map, ordered according to the given
     * comparator.  All keys inserted into the map must be <em>mutually
     * comparable</em> by the given comparator: {@code comparator.compare(k1,
     * k2)} must not throw a {@code ClassCastException} for any keys
     * {@code k1} and {@code k2} in the map.  If the user attempts to put
     * a key into the map that violates this constraint, the {@code put(Object
     * key, Object value)} call will throw a
     * {@code ClassCastException}.
     *
     * @param comparator the comparator that will be used to order this map.
     *        If {@code null}, the {@linkplain Comparable natural
     *        ordering} of the keys will be used.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    public TreeMap() {

    /**
     * Constructs a new, empty tree map, using the natural ordering of its
     * keys.  All keys inserted into the map must implement the {@link
     * Comparable} interface.  Furthermore, all such keys must be
     * <em>mutually comparable</em>: {@code k1.compareTo(k2)} must not throw
     * a {@code ClassCastException} for any keys {@code k1} and
     * {@code k2} in the map.  If the user attempts to put a key into the
     * map that violates this constraint (for example, the user attempts to
     * put a string key into a map whose keys are integers), the
     * {@code put(Object key, Object value)} call will throw a
     * {@code ClassCastException}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private transient int modCount = 0;

    /**
     * The number of structural modifications to the tree.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private transient int size = 0;

    /**
     * The number of entries in the tree
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
    private final Comparator<? super K> comparator;

    /**
     * The comparator used to maintain order in this tree map, or
     * null if it uses the natural ordering of its keys.
     *
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//TreeMap.java
public class TreeMap<K,V>

/**
 * A Red-Black tree based {@link NavigableMap} implementation.
 * The map is sorted according to the {@linkplain Comparable natural
 * ordering} of its keys, or by a {@link Comparator} provided at map
 * creation time, depending on which constructor is used.
 *
 * <p>This implementation provides guaranteed log(n) time cost for the
 * {@code containsKey}, {@code get}, {@code put} and {@code remove}
 * operations.  Algorithms are adaptations of those in Cormen, Leiserson, and
 * Rivest's <em>Introduction to Algorithms</em>.
 *
 * <p>Note that the ordering maintained by a tree map, like any sorted map, and
 * whether or not an explicit comparator is provided, must be <em>consistent
 * with {@code equals}</em> if this sorted map is to correctly implement the
 * {@code Map} interface.  (See {@code Comparable} or {@code Comparator} for a
 * precise definition of <em>consistent with equals</em>.)  This is so because
 * the {@code Map} interface is defined in terms of the {@code equals}
 * operation, but a sorted map performs all key comparisons using its {@code
 * compareTo} (or {@code compare}) method, so two keys that are deemed equal by
 * this method are, from the standpoint of the sorted map, equal.  The behavior
 * of a sorted map <em>is</em> well-defined even if its ordering is
 * inconsistent with {@code equals}; it just fails to obey the general contract
 * of the {@code Map} interface.
 *
 * <p><strong>Note that this implementation is not synchronized.</strong>
 * If multiple threads access a map concurrently, and at least one of the
 * threads modifies the map structurally, it <em>must</em> be synchronized
 * externally.  (A structural modification is any operation that adds or
 * deletes one or more mappings; merely changing the value associated
 * with an existing key is not a structural modification.)  This is
 * typically accomplished by synchronizing on some object that naturally
 * encapsulates the map.
 * If no such object exists, the map should be "wrapped" using the
 * {@link Collections#synchronizedSortedMap Collections.synchronizedSortedMap}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access to the map: <pre>
 *   SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));</pre>
 *
 * <p>The iterators returned by the {@code iterator} method of the collections
 * returned by all of this class's "collection view methods" are
 * <em>fail-fast</em>: if the map is structurally modified at any time after
 * the iterator is created, in any way except through the iterator's own
 * {@code remove} method, the iterator will throw a {@link
 * ConcurrentModificationException}.  Thus, in the face of concurrent
 * modification, the iterator fails quickly and cleanly, rather than risking
 * arbitrary, non-deterministic behavior at an undetermined time in the future.
 *
 * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
 * as it is, generally speaking, impossible to make any hard guarantees in the
 * presence of unsynchronized concurrent modification.  Fail-fast iterators
 * throw {@code ConcurrentModificationException} on a best-effort basis.
 * Therefore, it would be wrong to write a program that depended on this
 * exception for its correctness:   <em>the fail-fast behavior of iterators
 * should be used only to detect bugs.</em>
 *
 * <p>All {@code Map.Entry} pairs returned by methods in this class
 * and its views represent snapshots of mappings at the time they were
 * produced. They do <strong>not</strong> support the {@code Entry.setValue}
 * method. (Note however that it is possible to change mappings in the
 * associated map using {@code put}.)
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 *
 * @author  Josh Bloch and Doug Lea
 * @see Map
 * @see HashMap
 * @see Hashtable
 * @see Comparable
 * @see Comparator
 * @see Collection
 * @since 1.2
 */
