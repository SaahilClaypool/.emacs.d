_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    abstract static class CSLMSpliterator<K,V> {

    /**
     * Base class providing common structure for Spliterators.
     * (Although not all that much common functionality; as usual for
     * view classes, details annoyingly vary in key, value, and entry
     * subclasses in ways that are not worth abstracting out for
     * internal classes.)
     *
     * The basic split strategy is to recursively descend from top
     * level, row by row, descending to next row when either split
     * off, or the end of row is encountered. Control of the number of
     * splits relies on some statistical estimation: The expected
     * remaining number of elements of a skip list when advancing
     * either across or down decreases by about 25%. To make this
     * observation useful, we need to know initial size, which we
     * don't. But we can just use Integer.MAX_VALUE so that we
     * don't prematurely zero out while splitting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
            Node<K,V> next;

            /** the next node to return from next(); */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        abstract class SubMapIter<T> implements Iterator<T>, Spliterator<T> {

        /**
         * Variant of main Iter class to traverse through submaps.
         * Also serves as back-up Spliterator for views
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        SubMap<K,V> newSubMap(K fromKey, boolean fromInclusive,
                              K toKey, boolean toInclusive) {

        /**
         * Utility to create submaps, where given bounds override
         * unbounded(null) ones and/or are checked against bounded ones.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        Map.Entry<K,V> getNearEntry(K key, int rel) {

        /**
         * Submap version of ConcurrentSkipListMap.getNearEntry
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        K highestKey() {

        /**
         * Returns highest absolute key (ignoring directonality).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        K lowestKey() {

        /**
         * Returns lowest absolute key (ignoring directonality).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        ConcurrentSkipListMap.Node<K,V> hiNode(Comparator<? super K> cmp) {

        /**
         * Returns highest node. This node might not be in range, so
         * most usages need to check bounds.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        ConcurrentSkipListMap.Node<K,V> loNode(Comparator<? super K> cmp) {

        /**
         * Returns lowest node. This node might not be in range, so
         * most usages need to check bounds.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        boolean isBeforeEnd(ConcurrentSkipListMap.Node<K,V> n,
                            Comparator<? super K> cmp) {

        /**
         * Returns true if node key is less than upper bound of range.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        SubMap(ConcurrentSkipListMap<K,V> map,
               K fromKey, boolean fromInclusive,
               K toKey, boolean toInclusive,
               boolean isDescending) {

        /**
         * Creates a new submap, initializing all fields.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        private final boolean hiInclusive;

        /** inclusion flag for hi */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        private final K hi;

        /** upper bound key, or null if to end */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        private final ConcurrentSkipListMap<K,V> m;

        /** Underlying map */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    static final class SubMap<K,V> extends AbstractMap<K,V>

    /**
     * Submaps returned by {@link ConcurrentSkipListMap} submap operations
     * represent a subrange of mappings of their underlying
     * maps. Instances of this class support all methods of their
     * underlying maps, differing in that mappings outside their range are
     * ignored, and attempts to add mappings outside their ranges result
     * in {@link IllegalArgumentException}.  Instances of this class are
     * constructed only using the {@code subMap}, {@code headMap}, and
     * {@code tailMap} methods of their underlying maps.
     *
     * @serial include
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        final void advance() {

        /** Advances next to higher entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        Iter() {

        /** Initializes ascending iterator for entire range. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        Node<K,V> next;

        /** the next node to return from next(); */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    abstract class Iter<T> implements Iterator<T> {

    /**
     * Base of iterator classes:
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> pollLastEntry() {

    /**
     * Removes and returns a key-value mapping associated with
     * the greatest key in this map, or {@code null} if the map is empty.
     * The returned entry does <em>not</em> support
     * the {@code Entry.setValue} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> pollFirstEntry() {

    /**
     * Removes and returns a key-value mapping associated with
     * the least key in this map, or {@code null} if the map is empty.
     * The returned entry does <em>not</em> support
     * the {@code Entry.setValue} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> lastEntry() {

    /**
     * Returns a key-value mapping associated with the greatest
     * key in this map, or {@code null} if the map is empty.
     * The returned entry does <em>not</em> support
     * the {@code Entry.setValue} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> firstEntry() {

    /**
     * Returns a key-value mapping associated with the least
     * key in this map, or {@code null} if the map is empty.
     * The returned entry does <em>not</em> support
     * the {@code Entry.setValue} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public K higherKey(K key) {

    /**
     * @param key the key
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> higherEntry(K key) {

    /**
     * Returns a key-value mapping associated with the least key
     * strictly greater than the given key, or {@code null} if there
     * is no such key. The returned entry does <em>not</em> support
     * the {@code Entry.setValue} method.
     *
     * @param key the key
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public K ceilingKey(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> ceilingEntry(K key) {

    /**
     * Returns a key-value mapping associated with the least key
     * greater than or equal to the given key, or {@code null} if
     * there is no such entry. The returned entry does <em>not</em>
     * support the {@code Entry.setValue} method.
     *
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public K floorKey(K key) {

    /**
     * @param key the key
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> floorEntry(K key) {

    /**
     * Returns a key-value mapping associated with the greatest key
     * less than or equal to the given key, or {@code null} if there
     * is no such key. The returned entry does <em>not</em> support
     * the {@code Entry.setValue} method.
     *
     * @param key the key
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public K lowerKey(K key) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Map.Entry<K,V> lowerEntry(K key) {

    /**
     * Returns a key-value mapping associated with the greatest key
     * strictly less than the given key, or {@code null} if there is
     * no such key. The returned entry does <em>not</em> support the
     * {@code Entry.setValue} method.
     *
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentNavigableMap<K,V> tailMap(K fromKey) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} is null
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentNavigableMap<K,V> headMap(K toKey) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if {@code toKey} is null
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentNavigableMap<K,V> subMap(K fromKey, K toKey) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} or {@code toKey} is null
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentNavigableMap<K,V> tailMap(K fromKey,
                                               boolean inclusive) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} is null
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentNavigableMap<K,V> headMap(K toKey,
                                               boolean inclusive) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if {@code toKey} is null
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentNavigableMap<K,V> subMap(K fromKey,
                                              boolean fromInclusive,
                                              K toKey,
                                              boolean toInclusive) {

    /**
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if {@code fromKey} or {@code toKey} is null
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public K lastKey() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public K firstKey() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V replace(K key, V value) {

    /**
     * {@inheritDoc}
     *
     * @return the previous value associated with the specified key,
     *         or {@code null} if there was no mapping for the key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key or value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public boolean replace(K key, V oldValue, V newValue) {

    /**
     * {@inheritDoc}
     *
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if any of the arguments are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public boolean remove(Object key, Object value) {

    /**
     * {@inheritDoc}
     *
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V putIfAbsent(K key, V value) {

    /**
     * {@inheritDoc}
     *
     * @return the previous value associated with the specified key,
     *         or {@code null} if there was no mapping for the key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key or value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public boolean equals(Object o) {

    /**
     * Compares the specified object with this map for equality.
     * Returns {@code true} if the given object is also a map and the
     * two maps represent the same mappings.  More formally, two maps
     * {@code m1} and {@code m2} represent the same mappings if
     * {@code m1.entrySet().equals(m2.entrySet())}.  This
     * operation may return misleading results if either map is
     * concurrently modified during execution of this method.
     *
     * @param o object to be compared for equality with this map
     * @return {@code true} if the specified object is equal to this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Set<Map.Entry<K,V>> entrySet() {

    /**
     * Returns a {@link Set} view of the mappings contained in this map.
     *
     * <p>The set's iterator returns the entries in ascending key order.  The
     * set's spliterator additionally reports {@link Spliterator#CONCURRENT},
     * {@link Spliterator#NONNULL}, {@link Spliterator#SORTED} and
     * {@link Spliterator#ORDERED}, with an encounter order that is ascending
     * key order.
     *
     * <p>The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa.  The set supports element
     * removal, which removes the corresponding mapping from the map,
     * via the {@code Iterator.remove}, {@code Set.remove},
     * {@code removeAll}, {@code retainAll} and {@code clear}
     * operations.  It does not support the {@code add} or
     * {@code addAll} operations.
     *
     * <p>The view's iterators and spliterators are
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * <p>The {@code Map.Entry} elements traversed by the {@code iterator}
     * or {@code spliterator} do <em>not</em> support the {@code setValue}
     * operation.
     *
     * @return a set view of the mappings contained in this map,
     *         sorted in ascending key order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public Collection<V> values() {

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     * <p>The collection's iterator returns the values in ascending order
     * of the corresponding keys. The collections's spliterator additionally
     * reports {@link Spliterator#CONCURRENT}, {@link Spliterator#NONNULL} and
     * {@link Spliterator#ORDERED}, with an encounter order that is ascending
     * order of the corresponding keys.
     *
     * <p>The collection is backed by the map, so changes to the map are
     * reflected in the collection, and vice-versa.  The collection
     * supports element removal, which removes the corresponding
     * mapping from the map, via the {@code Iterator.remove},
     * {@code Collection.remove}, {@code removeAll},
     * {@code retainAll} and {@code clear} operations.  It does not
     * support the {@code add} or {@code addAll} operations.
     *
     * <p>The view's iterators and spliterators are
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public NavigableSet<K> keySet() {

    /**
     * Returns a {@link NavigableSet} view of the keys contained in this map.
     *
     * <p>The set's iterator returns the keys in ascending order.
     * The set's spliterator additionally reports {@link Spliterator#CONCURRENT},
     * {@link Spliterator#NONNULL}, {@link Spliterator#SORTED} and
     * {@link Spliterator#ORDERED}, with an encounter order that is ascending
     * key order.  The spliterator's comparator (see
     * {@link java.util.Spliterator#getComparator()}) is {@code null} if
     * the map's comparator (see {@link #comparator()}) is {@code null}.
     * Otherwise, the spliterator's comparator is the same as or imposes the
     * same total ordering as the map's comparator.
     *
     * <p>The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa.  The set supports element
     * removal, which removes the corresponding mapping from the map,
     * via the {@code Iterator.remove}, {@code Set.remove},
     * {@code removeAll}, {@code retainAll}, and {@code clear}
     * operations.  It does not support the {@code add} or {@code addAll}
     * operations.
     *
     * <p>The view's iterators and spliterators are
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * <p>This method is equivalent to method {@code navigableKeySet}.
     *
     * @return a navigable set view of the keys in this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V merge(K key, V value,
                   BiFunction<? super V, ? super V, ? extends V> remappingFunction) {

    /**
     * If the specified key is not already associated with a value,
     * associates it with the given value.  Otherwise, replaces the
     * value with the results of the given remapping function, or
     * removes if {@code null}. The function is <em>NOT</em>
     * guaranteed to be applied once atomically.
     *
     * @param key key with which the specified value is to be associated
     * @param value the value to use if absent
     * @param remappingFunction the function to recompute a value if present
     * @return the new value associated with the specified key, or null if none
     * @throws NullPointerException if the specified key or value is null
     *         or the remappingFunction is null
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V compute(K key,
                     BiFunction<? super K, ? super V, ? extends V> remappingFunction) {

    /**
     * Attempts to compute a mapping for the specified key and its
     * current mapped value (or {@code null} if there is no current
     * mapping). The function is <em>NOT</em> guaranteed to be applied
     * once atomically.
     *
     * @param key key with which the specified value is to be associated
     * @param remappingFunction the function to compute a value
     * @return the new value associated with the specified key, or null if none
     * @throws NullPointerException if the specified key is null
     *         or the remappingFunction is null
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V computeIfPresent(K key,
                              BiFunction<? super K, ? super V, ? extends V> remappingFunction) {

    /**
     * If the value for the specified key is present, attempts to
     * compute a new mapping given the key and its current mapped
     * value. The function is <em>NOT</em> guaranteed to be applied
     * once atomically.
     *
     * @param key key with which a value may be associated
     * @param remappingFunction the function to compute a value
     * @return the new value associated with the specified key, or null if none
     * @throws NullPointerException if the specified key is null
     *         or the remappingFunction is null
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V computeIfAbsent(K key,
                             Function<? super K, ? extends V> mappingFunction) {

    /**
     * If the specified key is not already associated with a value,
     * attempts to compute its value using the given mapping function
     * and enters it into this map unless {@code null}.  The function
     * is <em>NOT</em> guaranteed to be applied once atomically only
     * if the value is not present.
     *
     * @param key key with which the specified value is to be associated
     * @param mappingFunction the function to compute a value
     * @return the current (existing or computed) value associated with
     *         the specified key, or null if the computed value is null
     * @throws NullPointerException if the specified key is null
     *         or the mappingFunction is null
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public void clear() {

    /**
     * Removes all of the mappings from this map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public boolean isEmpty() {

    /**
     * Returns {@code true} if this map contains no key-value mappings.
     * @return {@code true} if this map contains no key-value mappings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public int size() {

    /**
     * Returns the number of key-value mappings in this map.  If this map
     * contains more than {@code Integer.MAX_VALUE} elements, it
     * returns {@code Integer.MAX_VALUE}.
     *
     * <p>Beware that, unlike in most collections, this method is
     * <em>NOT</em> a constant-time operation. Because of the
     * asynchronous nature of these maps, determining the current
     * number of elements requires traversing them all to count them.
     * Additionally, it is possible for the size to change during
     * execution of this method, in which case the returned result
     * will be inaccurate. Thus, this method is typically not very
     * useful in concurrent applications.
     *
     * @return the number of elements in this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public boolean containsValue(Object value) {

    /**
     * Returns {@code true} if this map maps one or more keys to the
     * specified value.  This operation requires time linear in the
     * map size. Additionally, it is possible for the map to change
     * during execution of this method, in which case the returned
     * result may be inaccurate.
     *
     * @param value value whose presence in this map is to be tested
     * @return {@code true} if a mapping to {@code value} exists;
     *         {@code false} otherwise
     * @throws NullPointerException if the specified value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V remove(Object key) {

    /**
     * Removes the mapping for the specified key from this map if present.
     *
     * @param  key key for which mapping should be removed
     * @return the previous value associated with the specified key, or
     *         {@code null} if there was no mapping for the key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V put(K key, V value) {

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with the specified key, or
     *         {@code null} if there was no mapping for the key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key or value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public V getOrDefault(Object key, V defaultValue) {

    /**
     * Returns the value to which the specified key is mapped,
     * or the given defaultValue if this map contains no mapping for the key.
     *
     * @param key the key
     * @param defaultValue the value to return if this map contains
     * no mapping for the given key
     * @return the mapping for the key, if present; else the defaultValue
     * @throws NullPointerException if the specified key is null
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
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
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public boolean containsKey(Object key) {

    /**
     * Returns {@code true} if this map contains a mapping for the specified
     * key.
     *
     * @param key key whose presence in this map is to be tested
     * @return {@code true} if this map contains a mapping for the specified key
     * @throws ClassCastException if the specified key cannot be compared
     *         with the keys currently in the map
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    @SuppressWarnings("unchecked")

    /**
     * Reconstitutes this map from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this map to a stream (that is, serializes it).
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData The key (Object) and value (Object) for each
     * key-value mapping represented by the map, followed by
     * {@code null}. The key-value mappings are emitted in key-order
     * (as determined by the Comparator, or by the keys' natural
     * ordering if no Comparator).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private void buildFromSorted(SortedMap<K, ? extends V> map) {

    /**
     * Streamlined bulk insertion to initialize from elements of
     * given sorted map.  Call only from constructor or clone
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentSkipListMap<K,V> clone() {

    /**
     * Returns a shallow copy of this {@code ConcurrentSkipListMap}
     * instance. (The keys and values themselves are not cloned.)
     *
     * @return a shallow copy of this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentSkipListMap(SortedMap<K, ? extends V> m) {

    /**
     * Constructs a new map containing the same mappings and using the
     * same ordering as the specified sorted map.
     *
     * @param m the sorted map whose mappings are to be placed in this
     *        map, and whose comparator is to be used to sort this map
     * @throws NullPointerException if the specified sorted map or any of
     *         its keys or values are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentSkipListMap(Map<? extends K, ? extends V> m) {

    /**
     * Constructs a new map containing the same mappings as the given map,
     * sorted according to the {@linkplain Comparable natural ordering} of
     * the keys.
     *
     * @param  m the map whose mappings are to be placed in this map
     * @throws ClassCastException if the keys in {@code m} are not
     *         {@link Comparable}, or are not mutually comparable
     * @throws NullPointerException if the specified map or any of its keys
     *         or values are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentSkipListMap(Comparator<? super K> comparator) {

    /**
     * Constructs a new, empty map, sorted according to the specified
     * comparator.
     *
     * @param comparator the comparator that will be used to order this map.
     *        If {@code null}, the {@linkplain Comparable natural
     *        ordering} of the keys will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    public ConcurrentSkipListMap() {

    /**
     * Constructs a new, empty map, sorted according to the
     * {@linkplain Comparable natural ordering} of the keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    final AbstractMap.SimpleImmutableEntry<K,V> getNear(K key, int rel) {

    /**
     * Returns SimpleImmutableEntry for results of findNear.
     * @param key the key
     * @param rel the relation -- OR'ed combination of EQ, LT, GT
     * @return Entry fitting relation, or null if no such
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    final Node<K,V> findNear(K key, int rel, Comparator<? super K> cmp) {

    /**
     * Utility for ceiling, floor, lower, higher methods.
     * @param key the key
     * @param rel the relation -- OR'ed combination of EQ, LT, GT
     * @return nearest node fitting relation, or null if no such
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private Node<K,V> findPredecessorOfLast() {

    /**
     * Specialized variant of findPredecessor to get predecessor of last
     * valid node.  Needed when removing the last entry.  It is possible
     * that all successors of returned node will have been deleted upon
     * return, in which case this method can be retried.
     * @return likely predecessor of last node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    final Node<K,V> findLast() {

    /**
     * Specialized version of find to get last valid node.
     * @return last node or null if empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private Map.Entry<K,V> doRemoveLastEntry() {

    /**
     * Removes last entry; returns its snapshot.
     * Specialized variant of doRemove.
     * @return null if empty, else snapshot of last entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private void clearIndexToFirst() {

    /**
     * Clears out index nodes associated with deleted first entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private Map.Entry<K,V> doRemoveFirstEntry() {

    /**
     * Removes first entry; returns its snapshot.
     * @return null if empty, else snapshot of first entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    final Node<K,V> findFirst() {

    /**
     * Specialized variant of findNode to get first valid node.
     * @return first node or null if empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private void tryReduceLevel() {

    /**
     * Possibly reduce head level if it has no nodes.  This method can
     * (rarely) make mistakes, in which case levels can disappear even
     * though they are about to contain index nodes. This impacts
     * performance, not correctness.  To minimize mistakes as well as
     * to reduce hysteresis, the level is reduced by one only if the
     * topmost three levels look empty. Also, if the removed level
     * looks non-empty after CAS, we try to change it back quick
     * before anyone notices our mistake! (This trick works pretty
     * well because this method will practically never make mistakes
     * unless current thread stalls immediately before first CAS, in
     * which case it is very unlikely to stall again immediately
     * afterwards, so will recover.)
     *
     * We put up with all this rather than just let levels grow
     * because otherwise, even a small map that has undergone a large
     * number of insertions and removals will have a lot of levels,
     * slowing down access more than would an occasional unwanted
     * reduction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    final V doRemove(Object key, Object value) {

    /**
     * Main deletion method. Locates node, nulls value, appends a
     * deletion marker, unlinks predecessor, removes associated index
     * nodes, and possibly reduces head index level.
     *
     * Index nodes are cleared out simply by calling findPredecessor.
     * which unlinks indexes to deleted nodes found along path to key,
     * which will include the indexes to this node.  This is done
     * unconditionally. We can't check beforehand whether there are
     * index nodes because it might be the case that some or all
     * indexes hadn't been inserted yet for this node during initial
     * search for it, and we'd like to ensure lack of garbage
     * retention, so must call to be sure.
     *
     * @param key the key
     * @param value if non-null, the value that must be
     * associated with key
     * @return the node, or null if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private V doPut(K key, V value, boolean onlyIfAbsent) {

    /**
     * Main insertion method.  Adds element if not present, or
     * replaces value if present and onlyIfAbsent is false.
     * @param key the key
     * @param value the value that must be associated with key
     * @param onlyIfAbsent if should not insert if already present
     * @return the old value, or null if newly inserted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private V doGet(Object key) {

    /**
     * Gets value for key. Almost the same as findNode, but returns
     * the found value (to avoid retries during re-reads)
     *
     * @param key the key
     * @return the value, or null if absent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private Node<K,V> findNode(Object key) {

    /**
     * Returns node holding key or null if no such, clearing out any
     * deleted nodes seen along the way.  Repeatedly traverses at
     * base-level looking for key starting at predecessor returned
     * from findPredecessor, processing base-level deletions as
     * encountered. Some callers rely on this side-effect of clearing
     * deleted nodes.
     *
     * Restarts occur, at traversal step centered on node n, if:
     *
     *   (1) After reading n's next field, n is no longer assumed
     *       predecessor b's current successor, which means that
     *       we don't have a consistent 3-node snapshot and so cannot
     *       unlink any subsequent deleted nodes encountered.
     *
     *   (2) n's value field is null, indicating n is deleted, in
     *       which case we help out an ongoing structural deletion
     *       before retrying.  Even though there are cases where such
     *       unlinking doesn't require restart, they aren't sorted out
     *       here because doing so would not usually outweigh cost of
     *       restarting.
     *
     *   (3) n is a marker or n's predecessor's value field is null,
     *       indicating (among other possibilities) that
     *       findPredecessor returned a deleted node. We can't unlink
     *       the node because we don't know its predecessor, so rely
     *       on another call to findPredecessor to notice and return
     *       some earlier predecessor, which it will do. This check is
     *       only strictly needed at beginning of loop, (and the
     *       b.value check isn't strictly needed at all) but is done
     *       each iteration to help avoid contention with other
     *       threads by callers that will fail to be able to change
     *       links, and so will retry anyway.
     *
     * The traversal loops in doPut, doRemove, and findNear all
     * include the same three kinds of checks. And specialized
     * versions appear in findFirst, and findLast and their
     * variants. They can't easily share code because each uses the
     * reads of fields held in locals occurring in the orders they
     * were performed.
     *
     * @param key the key
     * @return node holding key, or null if no such
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private Node<K,V> findPredecessor(Object key, Comparator<? super K> cmp) {

    /**
     * Returns a base-level node with key strictly less than given key,
     * or the base-level header if there is no such node.  Also
     * unlinks indexes to deleted nodes found along the way.  Callers
     * rely on this side-effect of clearing indices to deleted nodes.
     * @param key the key
     * @return a predecessor of key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    @SuppressWarnings({"unchecked", "rawtypes"})

    /**
     * Compares using comparator or natural ordering if null.
     * Called only by methods that have performed required type checks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    static final class HeadIndex<K,V> extends Index<K,V> {

    /**
     * Nodes heading each level keep track of their level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        final boolean unlink(Index<K,V> succ) {

        /**
         * Tries to CAS right field to skip over apparent successor
         * succ.  Fails (forcing a retraversal by caller) if this node
         * is known to be deleted.
         * @param succ the expected current successor
         * @return true if successful
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        final boolean link(Index<K,V> succ, Index<K,V> newSucc) {

        /**
         * Tries to CAS newSucc as successor.  To minimize races with
         * unlink that may lose this index node, if the node being
         * indexed is known to be deleted, it doesn't try to link in.
         * @param succ the expected current successor
         * @param newSucc the new successor
         * @return true if successful
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        final boolean indexesDeletedNode() {

        /**
         * Returns true if the node this indexes has been deleted.
         * @return true if indexed node is known to be deleted
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        final boolean casRight(Index<K,V> cmp, Index<K,V> val) {

        /**
         * compareAndSet right field
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        Index(Node<K,V> node, Index<K,V> down, Index<K,V> right) {

        /**
         * Creates index node with given values.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    static class Index<K,V> {

    /**
     * Index nodes represent the levels of the skip list.  Note that
     * even though both Nodes and Indexes have forward-pointing
     * fields, they have different types and are handled in different
     * ways, that can't nicely be captured by placing field in a
     * shared abstract class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        AbstractMap.SimpleImmutableEntry<K,V> createSnapshot() {

        /**
         * Creates and returns a new SimpleImmutableEntry holding current
         * mapping if this node holds a valid value, else null.
         * @return new entry or null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        V getValidValue() {

        /**
         * Returns value if this node contains a valid key-value pair,
         * else null.
         * @return this node's value if it isn't a marker or header or
         * is deleted, else null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        void helpDelete(Node<K,V> b, Node<K,V> f) {

        /**
         * Helps out a deletion by appending marker or unlinking from
         * predecessor. This is called during traversals when value
         * field seen to be null.
         * @param b predecessor
         * @param f successor
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        boolean appendMarker(Node<K,V> f) {

        /**
         * Tries to append a deletion marker to this node.
         * @param f the assumed current successor of this node
         * @return true if successful
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        boolean isBaseHeader() {

        /**
         * Returns true if this node is the header of base-level list.
         * @return true if this node is header node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        boolean isMarker() {

        /**
         * Returns true if this node is a marker. This method isn't
         * actually called in any current code checking for markers
         * because callers will have already read value field and need
         * to use that read (not another done here) and so directly
         * test if value points to node.
         *
         * @return true if this node is a marker node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        boolean casNext(Node<K,V> cmp, Node<K,V> val) {

        /**
         * compareAndSet next field
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        boolean casValue(Object cmp, Object val) {

        /**
         * compareAndSet value field
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        Node(Node<K,V> next) {

        /**
         * Creates a new marker node. A marker is distinguished by
         * having its value field point to itself.  Marker nodes also
         * have null keys, a fact that is exploited in a few places,
         * but this doesn't distinguish markers from the base-level
         * header node (head.node), which also has a null key.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
        Node(K key, Object value, Node<K,V> next) {

        /**
         * Creates a new regular node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    static final class Node<K,V> {

    /**
     * Nodes hold keys and values, and are singly linked in sorted
     * order, possibly with some intervening marker nodes. The list is
     * headed by a dummy node accessible as head.node. The value field
     * is declared only as Object because it takes special non-V
     * values for marker and header nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private boolean casHead(HeadIndex<K,V> cmp, HeadIndex<K,V> val) {

    /**
     * compareAndSet head node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private void initialize() {

    /**
     * Initializes or resets state. Needed by constructors, clone,
     * clear, readObject. and ConcurrentSkipListSet.clone.
     * (Note that comparator must be separately initialized.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private transient Values<V> values;

    /** Lazily initialized values collection */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private transient KeySet<K> keySet;

    /** Lazily initialized key set */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    final Comparator<? super K> comparator;

    /**
     * The comparator used to maintain order in this map, or null if
     * using natural ordering.  (Non-private to simplify access in
     * nested classes.)
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private transient volatile HeadIndex<K,V> head;

    /**
     * The topmost head index of the skiplist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
    private static final Object BASE_HEADER = new Object();

    /**
     * Special value used to identify base-level header
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentSkipListMap.java
public class ConcurrentSkipListMap<K,V> extends AbstractMap<K,V>

/**
 * A scalable concurrent {@link ConcurrentNavigableMap} implementation.
 * The map is sorted according to the {@linkplain Comparable natural
 * ordering} of its keys, or by a {@link Comparator} provided at map
 * creation time, depending on which constructor is used.
 *
 * <p>This class implements a concurrent variant of <a
 * href="http://en.wikipedia.org/wiki/Skip_list" target="_top">SkipLists</a>
 * providing expected average <i>log(n)</i> time cost for the
 * {@code containsKey}, {@code get}, {@code put} and
 * {@code remove} operations and their variants.  Insertion, removal,
 * update, and access operations safely execute concurrently by
 * multiple threads.
 *
 * <p>Iterators and spliterators are
 * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
 *
 * <p>Ascending key ordered views and their iterators are faster than
 * descending ones.
 *
 * <p>All {@code Map.Entry} pairs returned by methods in this class
 * and its views represent snapshots of mappings at the time they were
 * produced. They do <em>not</em> support the {@code Entry.setValue}
 * method. (Note however that it is possible to change mappings in the
 * associated map using {@code put}, {@code putIfAbsent}, or
 * {@code replace}, depending on exactly which effect you need.)
 *
 * <p>Beware that, unlike in most collections, the {@code size}
 * method is <em>not</em> a constant-time operation. Because of the
 * asynchronous nature of these maps, determining the current number
 * of elements requires a traversal of the elements, and so may report
 * inaccurate results if this collection is modified during traversal.
 * Additionally, the bulk operations {@code putAll}, {@code equals},
 * {@code toArray}, {@code containsValue}, and {@code clear} are
 * <em>not</em> guaranteed to be performed atomically. For example, an
 * iterator operating concurrently with a {@code putAll} operation
 * might view only some of the added elements.
 *
 * <p>This class and its views and iterators implement all of the
 * <em>optional</em> methods of the {@link Map} and {@link Iterator}
 * interfaces. Like most other concurrent collections, this class does
 * <em>not</em> permit the use of {@code null} keys or values because some
 * null return values cannot be reliably distinguished from the absence of
 * elements.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @author Doug Lea
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 * @since 1.6
 */
