_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        final Node<K,V> advance() {

        /**
         * Same as Traverser version
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    @SuppressWarnings("serial")

    /**
     * Base class for bulk tasks. Repeats some fields and code from
     * class Traverser, because we need to subclass CountedCompleter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public Iterator<Map.Entry<K,V>> iterator() {

        /**
         * @return an iterator over the entries of the backing map
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class EntrySetView<K,V> extends CollectionView<K,V,Map.Entry<K,V>>

    /**
     * A view of a ConcurrentHashMap as a {@link Set} of (key, value)
     * entries.  This class cannot be directly instantiated. See
     * {@link #entrySet()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class ValuesView<K,V> extends CollectionView<K,V,V>

    /**
     * A view of a ConcurrentHashMap as a {@link Collection} of
     * values, in which additions are disabled. This class cannot be
     * directly instantiated. See {@link #values()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public boolean addAll(Collection<? extends K> c) {

        /**
         * Adds all of the elements in the specified collection to this set,
         * as if by calling {@link #add} on each one.
         *
         * @param c the elements to be inserted into this set
         * @return {@code true} if this set changed as a result of the call
         * @throws NullPointerException if the collection or any of its
         * elements are {@code null}
         * @throws UnsupportedOperationException if no default mapped value
         * for additions was provided
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public boolean add(K e) {

        /**
         * Adds the specified key to this set view by mapping the key to
         * the default mapped value in the backing map, if defined.
         *
         * @param e key to be added
         * @return {@code true} if this set changed as a result of the call
         * @throws NullPointerException if the specified key is null
         * @throws UnsupportedOperationException if no default mapped value
         * for additions was provided
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public Iterator<K> iterator() {

        /**
         * @return an iterator over the keys of the backing map
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public boolean remove(Object o) { return map.remove(o) != null; }

        /**
         * Removes the key from this map view, by removing the key (and its
         * corresponding value) from the backing map.  This method does
         * nothing if the key is not in the map.
         *
         * @param  o the key to be removed from the backing map
         * @return {@code true} if the backing map contained the specified key
         * @throws NullPointerException if the specified key is null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public boolean contains(Object o) { return map.containsKey(o); }

        /**
         * {@inheritDoc}
         * @throws NullPointerException if the specified key is null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public V getMappedValue() { return value; }

        /**
         * Returns the default mapped value for additions,
         * or {@code null} if additions are not supported.
         *
         * @return the default mapped value for additions, or {@code null}
         * if not supported
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public static class KeySetView<K,V> extends CollectionView<K,V,K>

    /**
     * A view of a ConcurrentHashMap as a {@link Set} of keys, in
     * which additions may optionally be enabled by mapping to a
     * common value.  This class cannot be directly instantiated.
     * See {@link #keySet() keySet()},
     * {@link #keySet(Object) keySet(V)},
     * {@link #newKeySet() newKeySet()},
     * {@link #newKeySet(int) newKeySet(int)}.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public final String toString() {

        /**
         * Returns a string representation of this collection.
         * The string representation consists of the string representations
         * of the collection's elements in the order they are returned by
         * its iterator, enclosed in square brackets ({@code "[]"}).
         * Adjacent elements are separated by the characters {@code ", "}
         * (comma and space).  Elements are converted to strings as by
         * {@link String#valueOf(Object)}.
         *
         * @return a string representation of this collection
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public abstract Iterator<E> iterator();

        /**
         * Returns an iterator over the elements in this collection.
         *
         * <p>The returned iterator is
         * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
         *
         * @return an iterator over the elements in this collection
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public final void clear()      { map.clear(); }

        /**
         * Removes all of the elements from this view, by removing all
         * the mappings from the map backing this view.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public ConcurrentHashMap<K,V> getMap() { return map; }

        /**
         * Returns the map backing this view.
         *
         * @return the map backing this view
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    abstract static class CollectionView<K,V,E>

    /**
     * Base class for views.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public int reduceEntriesToInt(long parallelismThreshold,
                                  ToIntFunction<Map.Entry<K,V>> transformer,
                                  int basis,
                                  IntBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all entries using the given reducer to combine values,
     * and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all entries
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public long reduceEntriesToLong(long parallelismThreshold,
                                    ToLongFunction<Map.Entry<K,V>> transformer,
                                    long basis,
                                    LongBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all entries using the given reducer to combine values,
     * and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all entries
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public double reduceEntriesToDouble(long parallelismThreshold,
                                        ToDoubleFunction<Map.Entry<K,V>> transformer,
                                        double basis,
                                        DoubleBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all entries using the given reducer to combine values,
     * and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all entries
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U reduceEntries(long parallelismThreshold,
                               Function<Map.Entry<K,V>, ? extends U> transformer,
                               BiFunction<? super U, ? super U, ? extends U> reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all entries using the given reducer to combine values,
     * or null if none.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case it is not combined)
     * @param reducer a commutative associative combining function
     * @param <U> the return type of the transformer
     * @return the result of accumulating the given transformation
     * of all entries
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public Map.Entry<K,V> reduceEntries(long parallelismThreshold,
                                        BiFunction<Map.Entry<K,V>, Map.Entry<K,V>, ? extends Map.Entry<K,V>> reducer) {

    /**
     * Returns the result of accumulating all entries using the
     * given reducer to combine values, or null if none.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param reducer a commutative associative combining function
     * @return the result of accumulating all entries
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U searchEntries(long parallelismThreshold,
                               Function<Map.Entry<K,V>, ? extends U> searchFunction) {

    /**
     * Returns a non-null result from applying the given search
     * function on each entry, or null if none.  Upon success,
     * further element processing is suppressed and the results of
     * any other parallel invocations of the search function are
     * ignored.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param searchFunction a function returning a non-null
     * result on success, else null
     * @param <U> the return type of the search function
     * @return a non-null result from applying the given search
     * function on each entry, or null if none
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> void forEachEntry(long parallelismThreshold,
                                 Function<Map.Entry<K,V>, ? extends U> transformer,
                                 Consumer<? super U> action) {

    /**
     * Performs the given action for each non-null transformation
     * of each entry.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case the action is not applied)
     * @param action the action
     * @param <U> the return type of the transformer
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public void forEachEntry(long parallelismThreshold,
                             Consumer<? super Map.Entry<K,V>> action) {

    /**
     * Performs the given action for each entry.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param action the action
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public int reduceValuesToInt(long parallelismThreshold,
                                 ToIntFunction<? super V> transformer,
                                 int basis,
                                 IntBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all values using the given reducer to combine values,
     * and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all values
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public long reduceValuesToLong(long parallelismThreshold,
                                   ToLongFunction<? super V> transformer,
                                   long basis,
                                   LongBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all values using the given reducer to combine values,
     * and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all values
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public double reduceValuesToDouble(long parallelismThreshold,
                                       ToDoubleFunction<? super V> transformer,
                                       double basis,
                                       DoubleBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all values using the given reducer to combine values,
     * and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all values
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U reduceValues(long parallelismThreshold,
                              Function<? super V, ? extends U> transformer,
                              BiFunction<? super U, ? super U, ? extends U> reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all values using the given reducer to combine values, or
     * null if none.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case it is not combined)
     * @param reducer a commutative associative combining function
     * @param <U> the return type of the transformer
     * @return the result of accumulating the given transformation
     * of all values
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V reduceValues(long parallelismThreshold,
                          BiFunction<? super V, ? super V, ? extends V> reducer) {

    /**
     * Returns the result of accumulating all values using the
     * given reducer to combine values, or null if none.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param reducer a commutative associative combining function
     * @return the result of accumulating all values
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U searchValues(long parallelismThreshold,
                              Function<? super V, ? extends U> searchFunction) {

    /**
     * Returns a non-null result from applying the given search
     * function on each value, or null if none.  Upon success,
     * further element processing is suppressed and the results of
     * any other parallel invocations of the search function are
     * ignored.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param searchFunction a function returning a non-null
     * result on success, else null
     * @param <U> the return type of the search function
     * @return a non-null result from applying the given search
     * function on each value, or null if none
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> void forEachValue(long parallelismThreshold,
                                 Function<? super V, ? extends U> transformer,
                                 Consumer<? super U> action) {

    /**
     * Performs the given action for each non-null transformation
     * of each value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case the action is not applied)
     * @param action the action
     * @param <U> the return type of the transformer
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public void forEachValue(long parallelismThreshold,
                             Consumer<? super V> action) {

    /**
     * Performs the given action for each value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param action the action
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public int reduceKeysToInt(long parallelismThreshold,
                               ToIntFunction<? super K> transformer,
                               int basis,
                               IntBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all keys using the given reducer to combine values, and
     * the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all keys
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public long reduceKeysToLong(long parallelismThreshold,
                                 ToLongFunction<? super K> transformer,
                                 long basis,
                                 LongBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all keys using the given reducer to combine values, and
     * the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all keys
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public double reduceKeysToDouble(long parallelismThreshold,
                                     ToDoubleFunction<? super K> transformer,
                                     double basis,
                                     DoubleBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all keys using the given reducer to combine values, and
     * the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all keys
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U reduceKeys(long parallelismThreshold,
                            Function<? super K, ? extends U> transformer,
         BiFunction<? super U, ? super U, ? extends U> reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all keys using the given reducer to combine values, or
     * null if none.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case it is not combined)
     * @param reducer a commutative associative combining function
     * @param <U> the return type of the transformer
     * @return the result of accumulating the given transformation
     * of all keys
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public K reduceKeys(long parallelismThreshold,
                        BiFunction<? super K, ? super K, ? extends K> reducer) {

    /**
     * Returns the result of accumulating all keys using the given
     * reducer to combine values, or null if none.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param reducer a commutative associative combining function
     * @return the result of accumulating all keys using the given
     * reducer to combine values, or null if none
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U searchKeys(long parallelismThreshold,
                            Function<? super K, ? extends U> searchFunction) {

    /**
     * Returns a non-null result from applying the given search
     * function on each key, or null if none. Upon success,
     * further element processing is suppressed and the results of
     * any other parallel invocations of the search function are
     * ignored.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param searchFunction a function returning a non-null
     * result on success, else null
     * @param <U> the return type of the search function
     * @return a non-null result from applying the given search
     * function on each key, or null if none
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> void forEachKey(long parallelismThreshold,
                               Function<? super K, ? extends U> transformer,
                               Consumer<? super U> action) {

    /**
     * Performs the given action for each non-null transformation
     * of each key.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case the action is not applied)
     * @param action the action
     * @param <U> the return type of the transformer
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public void forEachKey(long parallelismThreshold,
                           Consumer<? super K> action) {

    /**
     * Performs the given action for each key.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param action the action
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public int reduceToInt(long parallelismThreshold,
                           ToIntBiFunction<? super K, ? super V> transformer,
                           int basis,
                           IntBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all (key, value) pairs using the given reducer to
     * combine values, and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all (key, value) pairs
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public long reduceToLong(long parallelismThreshold,
                             ToLongBiFunction<? super K, ? super V> transformer,
                             long basis,
                             LongBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all (key, value) pairs using the given reducer to
     * combine values, and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all (key, value) pairs
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public double reduceToDouble(long parallelismThreshold,
                                 ToDoubleBiFunction<? super K, ? super V> transformer,
                                 double basis,
                                 DoubleBinaryOperator reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all (key, value) pairs using the given reducer to
     * combine values, and the given basis as an identity value.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element
     * @param basis the identity (initial default value) for the reduction
     * @param reducer a commutative associative combining function
     * @return the result of accumulating the given transformation
     * of all (key, value) pairs
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U reduce(long parallelismThreshold,
                        BiFunction<? super K, ? super V, ? extends U> transformer,
                        BiFunction<? super U, ? super U, ? extends U> reducer) {

    /**
     * Returns the result of accumulating the given transformation
     * of all (key, value) pairs using the given reducer to
     * combine values, or null if none.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case it is not combined)
     * @param reducer a commutative associative combining function
     * @param <U> the return type of the transformer
     * @return the result of accumulating the given transformation
     * of all (key, value) pairs
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> U search(long parallelismThreshold,
                        BiFunction<? super K, ? super V, ? extends U> searchFunction) {

    /**
     * Returns a non-null result from applying the given search
     * function on each (key, value), or null if none.  Upon
     * success, further element processing is suppressed and the
     * results of any other parallel invocations of the search
     * function are ignored.
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param searchFunction a function returning a non-null
     * result on success, else null
     * @param <U> the return type of the search function
     * @return a non-null result from applying the given search
     * function on each (key, value), or null if none
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public <U> void forEach(long parallelismThreshold,
                            BiFunction<? super K, ? super V, ? extends U> transformer,
                            Consumer<? super U> action) {

    /**
     * Performs the given action for each non-null transformation
     * of each (key, value).
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param transformer a function returning the transformation
     * for an element, or null if there is no transformation (in
     * which case the action is not applied)
     * @param action the action
     * @param <U> the return type of the transformer
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public void forEach(long parallelismThreshold,
                        BiConsumer<? super K,? super V> action) {

    /**
     * Performs the given action for each (key, value).
     *
     * @param parallelismThreshold the (estimated) number of elements
     * needed for this operation to be executed in parallel
     * @param action the action
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    final int batchFor(long b) {

    /**
     * Computes initial batch value for bulk tasks. The returned value
     * is approximately exp2 of the number of times (minus one) to
     * split task by two before executing leaf action. This value is
     * faster to compute and more convenient to use as a guide to
     * splitting than is the depth, since it is used while dividing by
     * two anyway.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        public V setValue(V value) {

        /**
         * Sets our entry's value and writes through to the map. The
         * value to return is somewhat arbitrary here. Since we do not
         * necessarily track asynchronous changes, the most recent
         * "previous" value could be different from what we return (or
         * could even have been removed, in which case the put will
         * re-establish). We do not and cannot guarantee more.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class MapEntry<K,V> implements Map.Entry<K,V> {

    /**
     * Exported Entry for EntryIterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static class BaseIterator<K,V> extends Traverser<K,V> {

    /**
     * Base of key, value, and entry Iterators. Adds fields to
     * Traverser to support iterator.remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        private void recoverState(int n) {

        /**
         * Possibly pops traversal state.
         *
         * @param n length of current table
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        private void pushState(Node<K,V>[] t, int i, int n) {

        /**
         * Saves traversal state upon encountering a forwarding node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        final Node<K,V> advance() {

        /**
         * Advances if possible, returning next valid node, or null if none.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static class Traverser<K,V> {

    /**
     * Encapsulates traversal for methods such as containsValue; also
     * serves as a base class for other iterators and spliterators.
     *
     * Method advance visits once each still-valid node that was
     * reachable upon iterator construction. It might miss some that
     * were added to a bin after the bin was visited, which is OK wrt
     * consistency guarantees. Maintaining this property in the face
     * of possible ongoing resizes requires a fair amount of
     * bookkeeping state that is difficult to optimize away amidst
     * volatile accesses.  Even so, traversal maintains reasonable
     * throughput.
     *
     * Normally, iteration proceeds bin-by-bin traversing lists.
     * However, if the table has been resized, then all future steps
     * must traverse both the bin at the current index as well as at
     * (index + baseSize); and so on for further resizings. To
     * paranoically cope with potential sharing by users of iterators
     * across threads, iteration terminates if a bounds checks fails
     * for a table read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class TableStack<K,V> {

    /**
     * Records the table, its length, and current traversal index for a
     * traverser that must process a region of a forwarded table before
     * proceeding with current table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        static <K,V> boolean checkInvariants(TreeNode<K,V> t) {

        /**
         * Recursive invariant check
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        final boolean removeTreeNode(TreeNode<K,V> p) {

        /**
         * Removes the given node, that must be present before this
         * call.  This is messier than typical red-black deletion code
         * because we cannot swap the contents of an interior node
         * with a leaf successor that is pinned by "next" pointers
         * that are accessible independently of lock. So instead we
         * swap the tree linkages.
         *
         * @return true if now too small, so should be untreeified
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        final TreeNode<K,V> putTreeVal(int h, K k, V v) {

        /**
         * Finds or adds a node.
         * @return null if added
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        final Node<K,V> find(int h, Object k) {

        /**
         * Returns matching node or null if none. Tries to search
         * using tree comparisons from root, but continues linear
         * search when lock not available.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        private final void contendedLock() {

        /**
         * Possibly blocks awaiting root lock.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        private final void unlockRoot() {

        /**
         * Releases write lock for tree restructuring.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        private final void lockRoot() {

        /**
         * Acquires write lock for tree restructuring.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        TreeBin(TreeNode<K,V> b) {

        /**
         * Creates bin with initial set of nodes headed by b.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        static int tieBreakOrder(Object a, Object b) {

        /**
         * Tie-breaking utility for ordering insertions when equal
         * hashCodes and non-comparable. We don't require a total
         * order, just a consistent insertion rule to maintain
         * equivalence across rebalancings. Tie-breaking further than
         * necessary simplifies testing a bit.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class TreeBin<K,V> extends Node<K,V> {

    /**
     * TreeNodes used at the heads of bins. TreeBins do not hold user
     * keys or values, but instead point to list of TreeNodes and
     * their root. They also maintain a parasitic read-write lock
     * forcing writers (who hold bin lock) to wait for readers (who do
     * not) to complete before tree restructuring operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        final TreeNode<K,V> findTreeNode(int h, Object k, Class<?> kc) {

        /**
         * Returns the TreeNode (or null if not found) for the given key
         * starting at given root.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class TreeNode<K,V> extends Node<K,V> {

    /**
     * Nodes for use in TreeBins
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static <K,V> Node<K,V> untreeify(Node<K,V> b) {

    /**
     * Returns a list on non-TreeNodes replacing those in given list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private final void treeifyBin(Node<K,V>[] tab, int index) {

    /**
     * Replaces all linked nodes in bin at given index unless table is
     * too small, in which case resizes instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    @sun.misc.Contended static final class CounterCell {

    /**
     * A padded cell for distributing counts.  Adapted from LongAdder
     * and Striped64.  See their internal docs for explanation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private final void transfer(Node<K,V>[] tab, Node<K,V>[] nextTab) {

    /**
     * Moves and/or copies the nodes in each bin to new table. See
     * above for explanation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private final void tryPresize(int size) {

    /**
     * Tries to presize table to accommodate the given number of elements.
     *
     * @param size number of elements (doesn't need to be perfectly accurate)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    final Node<K,V>[] helpTransfer(Node<K,V>[] tab, Node<K,V> f) {

    /**
     * Helps transfer if a resize is in progress.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private final void addCount(long x, int check) {

    /**
     * Adds to count, and if table is too small and not already
     * resizing, initiates transfer. If already resizing, helps
     * perform transfer if work is available.  Rechecks occupancy
     * after a transfer to see if another resize is already needed
     * because resizings are lagging additions.
     *
     * @param x the count to add
     * @param check if <0, don't check resize, if <= 1 only check if uncontended
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private final Node<K,V>[] initTable() {

    /**
     * Initializes table, using the size recorded in sizeCtl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final int resizeStamp(int n) {

    /**
     * Returns the stamp bits for resizing a table of size n.
     * Must be negative when shifted left by RESIZE_STAMP_SHIFT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class ReservationNode<K,V> extends Node<K,V> {

    /**
     * A place-holder node used in computeIfAbsent and compute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final class ForwardingNode<K,V> extends Node<K,V> {

    /**
     * A node inserted at head of bins during transfer operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public KeySetView<K,V> keySet(V mappedValue) {

    /**
     * Returns a {@link Set} view of the keys in this map, using the
     * given common mapped value for any additions (i.e., {@link
     * Collection#add} and {@link Collection#addAll(Collection)}).
     * This is of course only appropriate if it is acceptable to use
     * the same value for all additions from this view.
     *
     * @param mappedValue the mapped value to use for any additions
     * @return the set view
     * @throws NullPointerException if the mappedValue is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public static <K> KeySetView<K,Boolean> newKeySet(int initialCapacity) {

    /**
     * Creates a new {@link Set} backed by a ConcurrentHashMap
     * from the given type to {@code Boolean.TRUE}.
     *
     * @param initialCapacity The implementation performs internal
     * sizing to accommodate this many elements.
     * @param <K> the element type of the returned set
     * @return the new set
     * @throws IllegalArgumentException if the initial capacity of
     * elements is negative
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public static <K> KeySetView<K,Boolean> newKeySet() {

    /**
     * Creates a new {@link Set} backed by a ConcurrentHashMap
     * from the given type to {@code Boolean.TRUE}.
     *
     * @param <K> the element type of the returned set
     * @return the new set
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public long mappingCount() {

    /**
     * Returns the number of mappings. This method should be used
     * instead of {@link #size} because a ConcurrentHashMap may
     * contain more mappings than can be represented as an int. The
     * value returned is an estimate; the actual count may differ if
     * there are concurrent insertions or removals.
     *
     * @return the number of mappings
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public Enumeration<V> elements() {

    /**
     * Returns an enumeration of the values in this table.
     *
     * @return an enumeration of the values in this table
     * @see #values()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public Enumeration<K> keys() {

    /**
     * Returns an enumeration of the keys in this table.
     *
     * @return an enumeration of the keys in this table
     * @see #keySet()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public boolean contains(Object value) {

    /**
     * Legacy method testing if some key maps into the specified value
     * in this table.  This method is identical in functionality to
     * {@link #containsValue(Object)}, and exists solely to ensure
     * full compatibility with class {@link java.util.Hashtable},
     * which supported this method prior to introduction of the
     * Java Collections framework.
     *
     * @param  value a value to search for
     * @return {@code true} if and only if some key maps to the
     *         {@code value} argument in this table as
     *         determined by the {@code equals} method;
     *         {@code false} otherwise
     * @throws NullPointerException if the specified value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {

    /**
     * If the specified key is not already associated with a
     * (non-null) value, associates it with the given value.
     * Otherwise, replaces the value with the results of the given
     * remapping function, or removes if {@code null}. The entire
     * method invocation is performed atomically.  Some attempted
     * update operations on this map by other threads may be blocked
     * while computation is in progress, so the computation should be
     * short and simple, and must not attempt to update any other
     * mappings of this Map.
     *
     * @param key key with which the specified value is to be associated
     * @param value the value to use if absent
     * @param remappingFunction the function to recompute a value if present
     * @return the new value associated with the specified key, or null if none
     * @throws NullPointerException if the specified key or the
     *         remappingFunction is null
     * @throws RuntimeException or Error if the remappingFunction does so,
     *         in which case the mapping is unchanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V compute(K key,
                     BiFunction<? super K, ? super V, ? extends V> remappingFunction) {

    /**
     * Attempts to compute a mapping for the specified key and its
     * current mapped value (or {@code null} if there is no current
     * mapping). The entire method invocation is performed atomically.
     * Some attempted update operations on this map by other threads
     * may be blocked while computation is in progress, so the
     * computation should be short and simple, and must not attempt to
     * update any other mappings of this Map.
     *
     * @param key key with which the specified value is to be associated
     * @param remappingFunction the function to compute a value
     * @return the new value associated with the specified key, or null if none
     * @throws NullPointerException if the specified key or remappingFunction
     *         is null
     * @throws IllegalStateException if the computation detectably
     *         attempts a recursive update to this map that would
     *         otherwise never complete
     * @throws RuntimeException or Error if the remappingFunction does so,
     *         in which case the mapping is unchanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {

    /**
     * If the value for the specified key is present, attempts to
     * compute a new mapping given the key and its current mapped
     * value.  The entire method invocation is performed atomically.
     * Some attempted update operations on this map by other threads
     * may be blocked while computation is in progress, so the
     * computation should be short and simple, and must not attempt to
     * update any other mappings of this map.
     *
     * @param key key with which a value may be associated
     * @param remappingFunction the function to compute a value
     * @return the new value associated with the specified key, or null if none
     * @throws NullPointerException if the specified key or remappingFunction
     *         is null
     * @throws IllegalStateException if the computation detectably
     *         attempts a recursive update to this map that would
     *         otherwise never complete
     * @throws RuntimeException or Error if the remappingFunction does so,
     *         in which case the mapping is unchanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {

    /**
     * If the specified key is not already associated with a value,
     * attempts to compute its value using the given mapping function
     * and enters it into this map unless {@code null}.  The entire
     * method invocation is performed atomically, so the function is
     * applied at most once per key.  Some attempted update operations
     * on this map by other threads may be blocked while computation
     * is in progress, so the computation should be short and simple,
     * and must not attempt to update any other mappings of this map.
     *
     * @param key key with which the specified value is to be associated
     * @param mappingFunction the function to compute a value
     * @return the current (existing or computed) value associated with
     *         the specified key, or null if the computed value is null
     * @throws NullPointerException if the specified key or mappingFunction
     *         is null
     * @throws IllegalStateException if the computation detectably
     *         attempts a recursive update to this map that would
     *         otherwise never complete
     * @throws RuntimeException or Error if the mappingFunction does so,
     *         in which case the mapping is left unestablished
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V getOrDefault(Object key, V defaultValue) {

    /**
     * Returns the value to which the specified key is mapped, or the
     * given default value if this map contains no mapping for the
     * key.
     *
     * @param key the key whose associated value is to be returned
     * @param defaultValue the value to return if this map contains
     * no mapping for the given key
     * @return the mapping for the key, if present; else the default value
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V replace(K key, V value) {

    /**
     * {@inheritDoc}
     *
     * @return the previous value associated with the specified key,
     *         or {@code null} if there was no mapping for the key
     * @throws NullPointerException if the specified key or value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public boolean replace(K key, V oldValue, V newValue) {

    /**
     * {@inheritDoc}
     *
     * @throws NullPointerException if any of the arguments are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public boolean remove(Object key, Object value) {

    /**
     * {@inheritDoc}
     *
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V putIfAbsent(K key, V value) {

    /**
     * {@inheritDoc}
     *
     * @return the previous value associated with the specified key,
     *         or {@code null} if there was no mapping for the key
     * @throws NullPointerException if the specified key or value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes the instance from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves the state of the {@code ConcurrentHashMap} instance to a
     * stream (i.e., serializes it).
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData
     * the key (Object) and value (Object)
     * for each key-value mapping, followed by a null pair.
     * The key-value mappings are emitted in no particular order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static class Segment<K,V> extends ReentrantLock implements Serializable {

    /**
     * Stripped-down version of helper class used in previous version,
     * declared for the sake of serialization compatibility
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public boolean equals(Object o) {

    /**
     * Compares the specified object with this map for equality.
     * Returns {@code true} if the given object is a map with the same
     * mappings as this map.  This operation may return misleading
     * results if either map is concurrently modified during execution
     * of this method.
     *
     * @param o object to be compared for equality with this map
     * @return {@code true} if the specified object is equal to this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public String toString() {

    /**
     * Returns a string representation of this map.  The string
     * representation consists of a list of key-value mappings (in no
     * particular order) enclosed in braces ("{@code {}}").  Adjacent
     * mappings are separated by the characters {@code ", "} (comma
     * and space).  Each key-value mapping is rendered as the key
     * followed by an equals sign ("{@code =}") followed by the
     * associated value.
     *
     * @return a string representation of this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public int hashCode() {

    /**
     * Returns the hash code value for this {@link Map}, i.e.,
     * the sum of, for each key-value pair in the map,
     * {@code key.hashCode() ^ value.hashCode()}.
     *
     * @return the hash code value for this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public Set<Map.Entry<K,V>> entrySet() {

    /**
     * Returns a {@link Set} view of the mappings contained in this map.
     * The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa.  The set supports element
     * removal, which removes the corresponding mapping from the map,
     * via the {@code Iterator.remove}, {@code Set.remove},
     * {@code removeAll}, {@code retainAll}, and {@code clear}
     * operations.
     *
     * <p>The view's iterators and spliterators are
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * <p>The view's {@code spliterator} reports {@link Spliterator#CONCURRENT},
     * {@link Spliterator#DISTINCT}, and {@link Spliterator#NONNULL}.
     *
     * @return the set view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public Collection<V> values() {

    /**
     * Returns a {@link Collection} view of the values contained in this map.
     * The collection is backed by the map, so changes to the map are
     * reflected in the collection, and vice-versa.  The collection
     * supports element removal, which removes the corresponding
     * mapping from this map, via the {@code Iterator.remove},
     * {@code Collection.remove}, {@code removeAll},
     * {@code retainAll}, and {@code clear} operations.  It does not
     * support the {@code add} or {@code addAll} operations.
     *
     * <p>The view's iterators and spliterators are
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * <p>The view's {@code spliterator} reports {@link Spliterator#CONCURRENT}
     * and {@link Spliterator#NONNULL}.
     *
     * @return the collection view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public KeySetView<K,V> keySet() {

    /**
     * Returns a {@link Set} view of the keys contained in this map.
     * The set is backed by the map, so changes to the map are
     * reflected in the set, and vice-versa. The set supports element
     * removal, which removes the corresponding mapping from this map,
     * via the {@code Iterator.remove}, {@code Set.remove},
     * {@code removeAll}, {@code retainAll}, and {@code clear}
     * operations.  It does not support the {@code add} or
     * {@code addAll} operations.
     *
     * <p>The view's iterators and spliterators are
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * <p>The view's {@code spliterator} reports {@link Spliterator#CONCURRENT},
     * {@link Spliterator#DISTINCT}, and {@link Spliterator#NONNULL}.
     *
     * @return the set view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public void clear() {

    /**
     * Removes all of the mappings from this map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    final V replaceNode(Object key, V value, Object cv) {

    /**
     * Implementation for the four public remove/replace methods:
     * Replaces node value with v, conditional upon match of cv if
     * non-null.  If resulting value is null, delete.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V remove(Object key) {

    /**
     * Removes the key (and its corresponding value) from this map.
     * This method does nothing if the key is not in the map.
     *
     * @param  key the key that needs to be removed
     * @return the previous value associated with {@code key}, or
     *         {@code null} if there was no mapping for {@code key}
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public void putAll(Map<? extends K, ? extends V> m) {

    /**
     * Copies all of the mappings from the specified map to this one.
     * These mappings replace any mappings that this map had for any of the
     * keys currently in the specified map.
     *
     * @param m mappings to be stored in this map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    final V putVal(K key, V value, boolean onlyIfAbsent) {

    /** Implementation for put and putIfAbsent */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V put(K key, V value) {

    /**
     * Maps the specified key to the specified value in this table.
     * Neither the key nor the value can be null.
     *
     * <p>The value can be retrieved by calling the {@code get} method
     * with a key that is equal to the original key.
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with {@code key}, or
     *         {@code null} if there was no mapping for {@code key}
     * @throws NullPointerException if the specified key or value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public boolean containsValue(Object value) {

    /**
     * Returns {@code true} if this map maps one or more keys to the
     * specified value. Note: This method may require a full traversal
     * of the map, and is much slower than method {@code containsKey}.
     *
     * @param value value whose presence in this map is to be tested
     * @return {@code true} if this map maps one or more keys to the
     *         specified value
     * @throws NullPointerException if the specified value is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public boolean containsKey(Object key) {

    /**
     * Tests if the specified object is a key in this table.
     *
     * @param  key possible key
     * @return {@code true} if and only if the specified object
     *         is a key in this table, as determined by the
     *         {@code equals} method; {@code false} otherwise
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public V get(Object key) {

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     *
     * <p>More formally, if this map contains a mapping from a key
     * {@code k} to a value {@code v} such that {@code key.equals(k)},
     * then this method returns {@code v}; otherwise it returns
     * {@code null}.  (There can be at most one such mapping.)
     *
     * @throws NullPointerException if the specified key is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public boolean isEmpty() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public int size() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public ConcurrentHashMap(int initialCapacity,
                             float loadFactor, int concurrencyLevel) {

    /**
     * Creates a new, empty map with an initial table size based on
     * the given number of elements ({@code initialCapacity}), table
     * density ({@code loadFactor}), and number of concurrently
     * updating threads ({@code concurrencyLevel}).
     *
     * @param initialCapacity the initial capacity. The implementation
     * performs internal sizing to accommodate this many elements,
     * given the specified load factor.
     * @param loadFactor the load factor (table density) for
     * establishing the initial table size
     * @param concurrencyLevel the estimated number of concurrently
     * updating threads. The implementation may use this value as
     * a sizing hint.
     * @throws IllegalArgumentException if the initial capacity is
     * negative or the load factor or concurrencyLevel are
     * nonpositive
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public ConcurrentHashMap(int initialCapacity, float loadFactor) {

    /**
     * Creates a new, empty map with an initial table size based on
     * the given number of elements ({@code initialCapacity}) and
     * initial table density ({@code loadFactor}).
     *
     * @param initialCapacity the initial capacity. The implementation
     * performs internal sizing to accommodate this many elements,
     * given the specified load factor.
     * @param loadFactor the load factor (table density) for
     * establishing the initial table size
     * @throws IllegalArgumentException if the initial capacity of
     * elements is negative or the load factor is nonpositive
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public ConcurrentHashMap(Map<? extends K, ? extends V> m) {

    /**
     * Creates a new map with the same mappings as the given map.
     *
     * @param m the map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public ConcurrentHashMap(int initialCapacity) {

    /**
     * Creates a new, empty map with an initial table size
     * accommodating the specified number of elements without the need
     * to dynamically resize.
     *
     * @param initialCapacity The implementation performs internal
     * sizing to accommodate this many elements.
     * @throws IllegalArgumentException if the initial capacity of
     * elements is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    public ConcurrentHashMap() {

    /**
     * Creates a new, empty map with the default initial table size (16).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private transient volatile CounterCell[] counterCells;

    /**
     * Table of counter cells. When non-null, size is a power of 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private transient volatile int cellsBusy;

    /**
     * Spinlock (locked via CAS) used when resizing and/or creating CounterCells.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private transient volatile int transferIndex;

    /**
     * The next table index (plus one) to split while resizing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private transient volatile int sizeCtl;

    /**
     * Table initialization and resizing control.  When negative, the
     * table is being initialized or resized: -1 for initialization,
     * else -(1 + the number of active resizing threads).  Otherwise,
     * when table is null, holds the initial table size to use upon
     * creation, or 0 for default. After initialization, holds the
     * next element count value upon which to resize the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private transient volatile long baseCount;

    /**
     * Base counter value, used mainly when there is no contention,
     * but also as a fallback during table initialization
     * races. Updated via CAS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private transient volatile Node<K,V>[] nextTable;

    /**
     * The next table to use; non-null only while resizing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    transient volatile Node<K,V>[] table;

    /**
     * The array of bins. Lazily initialized upon first insertion.
     * Size is always a power of two. Accessed directly by iterators.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    @SuppressWarnings({"rawtypes","unchecked"}) // for cast to Comparable

    /**
     * Returns k.compareTo(x) if x matches kc (k's screened comparable
     * class), else 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static Class<?> comparableClassFor(Object x) {

    /**
     * Returns x's Class if it is of the form "class C implements
     * Comparable<C>", else null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final int tableSizeFor(int c) {

    /**
     * Returns a power of two table size for the given desired capacity.
     * See Hackers Delight, sec 3.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final int spread(int h) {

    /**
     * Spreads (XORs) higher bits of hash to lower and also forces top
     * bit to 0. Because the table uses power-of-two masking, sets of
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
        Node<K,V> find(int h, Object k) {

        /**
         * Virtualized support for map.get(); overridden in subclasses.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static class Node<K,V> implements Map.Entry<K,V> {

    /**
     * Key-value entry.  This class is never exported out as a
     * user-mutable Map.Entry (i.e., one supporting setValue; see
     * MapEntry below), but can be used for read-only traversals used
     * in bulk tasks.  Subclasses of Node with a negative hash field
     * are special, and contain null keys and values (but are never
     * exported).  Otherwise, keys and vals are never null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /** For serialization compatibility. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /** Number of CPUS, to place bounds on some sizings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final int RESIZE_STAMP_SHIFT = 32 - RESIZE_STAMP_BITS;

    /**
     * The bit shift for recording size stamp in sizeCtl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final int MAX_RESIZERS = (1 << (32 - RESIZE_STAMP_BITS)) - 1;

    /**
     * The maximum number of threads that can help resize.
     * Must fit in 32 - RESIZE_STAMP_BITS bits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static int RESIZE_STAMP_BITS = 16;

    /**
     * The number of bits used for generation stamp in sizeCtl.
     * Must be at least 6 for 32bit arrays.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final int MIN_TRANSFER_STRIDE = 16;

    /**
     * Minimum number of rebinnings per transfer step. Ranges are
     * subdivided to allow multiple resizer threads.  This value
     * serves as a lower bound to avoid resizers encountering
     * excessive memory contention.  The value should be at least
     * DEFAULT_CAPACITY.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final int MIN_TREEIFY_CAPACITY = 64;

    /**
     * The smallest table capacity for which bins may be treeified.
     * (Otherwise the table is resized if too many nodes in a bin.)
     * The value should be at least 4 * TREEIFY_THRESHOLD to avoid
     * conflicts between resizing and treeification thresholds.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final int UNTREEIFY_THRESHOLD = 6;

    /**
     * The bin count threshold for untreeifying a (split) bin during a
     * resize operation. Should be less than TREEIFY_THRESHOLD, and at
     * most 6 to mesh with shrinkage detection under removal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final int TREEIFY_THRESHOLD = 8;

    /**
     * The bin count threshold for using a tree rather than list for a
     * bin.  Bins are converted to trees when adding an element to a
     * bin with at least this many nodes. The value must be greater
     * than 2, and should be at least 8 to mesh with assumptions in
     * tree removal about conversion back to plain bins upon
     * shrinkage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final float LOAD_FACTOR = 0.75f;

    /**
     * The load factor for this table. Overrides of this value in
     * constructors affect only the initial table capacity.  The
     * actual floating point value isn't normally used -- it is
     * simpler to use expressions such as {@code n - (n >>> 2)} for
     * the associated resizing threshold.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final int DEFAULT_CONCURRENCY_LEVEL = 16;

    /**
     * The default concurrency level for this table. Unused but
     * defined for compatibility with previous versions of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * The largest possible (non-power of two) array size.
     * Needed by toArray and related methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final int DEFAULT_CAPACITY = 16;

    /**
     * The default initial table capacity.  Must be a power of 2
     * (i.e., at least 1) and at most MAXIMUM_CAPACITY.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * The largest possible table capacity.  This value must be
     * exactly 1<<30 to stay within Java array allocation and indexing
     * bounds for power of two table sizes, and is further required
     * because the top two bits of 32bit hash fields are used for
     * control purposes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ConcurrentHashMap.java
public class ConcurrentHashMap<K,V> extends AbstractMap<K,V>

/**
 * A hash table supporting full concurrency of retrievals and
 * high expected concurrency for updates. This class obeys the
 * same functional specification as {@link java.util.Hashtable}, and
 * includes versions of methods corresponding to each method of
 * {@code Hashtable}. However, even though all operations are
 * thread-safe, retrieval operations do <em>not</em> entail locking,
 * and there is <em>not</em> any support for locking the entire table
 * in a way that prevents all access.  This class is fully
 * interoperable with {@code Hashtable} in programs that rely on its
 * thread safety but not on its synchronization details.
 *
 * <p>Retrieval operations (including {@code get}) generally do not
 * block, so may overlap with update operations (including {@code put}
 * and {@code remove}). Retrievals reflect the results of the most
 * recently <em>completed</em> update operations holding upon their
 * onset. (More formally, an update operation for a given key bears a
 * <em>happens-before</em> relation with any (non-null) retrieval for
 * that key reporting the updated value.)  For aggregate operations
 * such as {@code putAll} and {@code clear}, concurrent retrievals may
 * reflect insertion or removal of only some entries.  Similarly,
 * Iterators, Spliterators and Enumerations return elements reflecting the
 * state of the hash table at some point at or since the creation of the
 * iterator/enumeration.  They do <em>not</em> throw {@link
 * java.util.ConcurrentModificationException ConcurrentModificationException}.
 * However, iterators are designed to be used by only one thread at a time.
 * Bear in mind that the results of aggregate status methods including
 * {@code size}, {@code isEmpty}, and {@code containsValue} are typically
 * useful only when a map is not undergoing concurrent updates in other threads.
 * Otherwise the results of these methods reflect transient states
 * that may be adequate for monitoring or estimation purposes, but not
 * for program control.
 *
 * <p>The table is dynamically expanded when there are too many
 * collisions (i.e., keys that have distinct hash codes but fall into
 * the same slot modulo the table size), with the expected average
 * effect of maintaining roughly two bins per mapping (corresponding
 * to a 0.75 load factor threshold for resizing). There may be much
 * variance around this average as mappings are added and removed, but
 * overall, this maintains a commonly accepted time/space tradeoff for
 * hash tables.  However, resizing this or any other kind of hash
 * table may be a relatively slow operation. When possible, it is a
 * good idea to provide a size estimate as an optional {@code
 * initialCapacity} constructor argument. An additional optional
 * {@code loadFactor} constructor argument provides a further means of
 * customizing initial table capacity by specifying the table density
 * to be used in calculating the amount of space to allocate for the
 * given number of elements.  Also, for compatibility with previous
 * versions of this class, constructors may optionally specify an
 * expected {@code concurrencyLevel} as an additional hint for
 * internal sizing.  Note that using many keys with exactly the same
 * {@code hashCode()} is a sure way to slow down performance of any
 * hash table. To ameliorate impact, when keys are {@link Comparable},
 * this class may use comparison order among keys to help break ties.
 *
 * <p>A {@link Set} projection of a ConcurrentHashMap may be created
 * (using {@link #newKeySet()} or {@link #newKeySet(int)}), or viewed
 * (using {@link #keySet(Object)} when only keys are of interest, and the
 * mapped values are (perhaps transiently) not used or all take the
 * same mapping value.
 *
 * <p>A ConcurrentHashMap can be used as scalable frequency map (a
 * form of histogram or multiset) by using {@link
 * java.util.concurrent.atomic.LongAdder} values and initializing via
 * {@link #computeIfAbsent computeIfAbsent}. For example, to add a count
 * to a {@code ConcurrentHashMap<String,LongAdder> freqs}, you can use
 * {@code freqs.computeIfAbsent(k -> new LongAdder()).increment();}
 *
 * <p>This class and its views and iterators implement all of the
 * <em>optional</em> methods of the {@link Map} and {@link Iterator}
 * interfaces.
 *
 * <p>Like {@link Hashtable} but unlike {@link HashMap}, this class
 * does <em>not</em> allow {@code null} to be used as a key or value.
 *
 * <p>ConcurrentHashMaps support a set of sequential and parallel bulk
 * operations that, unlike most {@link Stream} methods, are designed
 * to be safely, and often sensibly, applied even with maps that are
 * being concurrently updated by other threads; for example, when
 * computing a snapshot summary of the values in a shared registry.
 * There are three kinds of operation, each with four forms, accepting
 * functions with Keys, Values, Entries, and (Key, Value) arguments
 * and/or return values. Because the elements of a ConcurrentHashMap
 * are not ordered in any particular way, and may be processed in
 * different orders in different parallel executions, the correctness
 * of supplied functions should not depend on any ordering, or on any
 * other objects or values that may transiently change while
 * computation is in progress; and except for forEach actions, should
 * ideally be side-effect-free. Bulk operations on {@link java.util.Map.Entry}
 * objects do not support method {@code setValue}.
 *
 * <ul>
 * <li> forEach: Perform a given action on each element.
 * A variant form applies a given transformation on each element
 * before performing the action.</li>
 *
 * <li> search: Return the first available non-null result of
 * applying a given function on each element; skipping further
 * search when a result is found.</li>
 *
 * <li> reduce: Accumulate each element.  The supplied reduction
 * function cannot rely on ordering (more formally, it should be
 * both associative and commutative).  There are five variants:
 *
 * <ul>
 *
 * <li> Plain reductions. (There is not a form of this method for
 * (key, value) function arguments since there is no corresponding
 * return type.)</li>
 *
 * <li> Mapped reductions that accumulate the results of a given
 * function applied to each element.</li>
 *
 * <li> Reductions to scalar doubles, longs, and ints, using a
 * given basis value.</li>
 *
 * </ul>
 * </li>
 * </ul>
 *
 * <p>These bulk operations accept a {@code parallelismThreshold}
 * argument. Methods proceed sequentially if the current map size is
 * estimated to be less than the given threshold. Using a value of
 * {@code Long.MAX_VALUE} suppresses all parallelism.  Using a value
 * of {@code 1} results in maximal parallelism by partitioning into
 * enough subtasks to fully utilize the {@link
 * ForkJoinPool#commonPool()} that is used for all parallel
 * computations. Normally, you would initially choose one of these
 * extreme values, and then measure performance of using in-between
 * values that trade off overhead versus throughput.
 *
 * <p>The concurrency properties of bulk operations follow
 * from those of ConcurrentHashMap: Any non-null result returned
 * from {@code get(key)} and related access methods bears a
 * happens-before relation with the associated insertion or
 * update.  The result of any bulk operation reflects the
 * composition of these per-element relations (but is not
 * necessarily atomic with respect to the map as a whole unless it
 * is somehow known to be quiescent).  Conversely, because keys
 * and values in the map are never null, null serves as a reliable
 * atomic indicator of the current lack of any result.  To
 * maintain this property, null serves as an implicit basis for
 * all non-scalar reduction operations. For the double, long, and
 * int versions, the basis should be one that, when combined with
 * any other value, returns that other value (more formally, it
 * should be the identity element for the reduction). Most common
 * reductions have these properties; for example, computing a sum
 * with basis 0 or a minimum with basis MAX_VALUE.
 *
 * <p>Search and transformation functions provided as arguments
 * should similarly return null to indicate the lack of any result
 * (in which case it is not used). In the case of mapped
 * reductions, this also enables transformations to serve as
 * filters, returning null (or, in the case of primitive
 * specializations, the identity basis) if the element should not
 * be combined. You can create compound transformations and
 * filterings by composing them yourself under this "null means
 * there is nothing there now" rule before using them in search or
 * reduce operations.
 *
 * <p>Methods accepting and/or returning Entry arguments maintain
 * key-value associations. They may be useful for example when
 * finding the key for the greatest value. Note that "plain" Entry
 * arguments can be supplied using {@code new
 * AbstractMap.SimpleEntry(k,v)}.
 *
 * <p>Bulk operations may complete abruptly, throwing an
 * exception encountered in the application of a supplied
 * function. Bear in mind when handling such exceptions that other
 * concurrently executing functions could also have thrown
 * exceptions, or would have done so if the first exception had
 * not occurred.
 *
 * <p>Speedups for parallel compared to sequential forms are common
 * but not guaranteed.  Parallel operations involving brief functions
 * on small maps may execute more slowly than sequential forms if the
 * underlying work to parallelize the computation is more expensive
 * than the computation itself.  Similarly, parallelization may not
 * lead to much actual parallelism if all processors are busy
 * performing unrelated tasks.
 *
 * <p>All arguments to all task methods must be non-null.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
