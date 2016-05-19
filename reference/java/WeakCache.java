_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheKey<K> extends WeakReference<K> {

    /**
     * CacheKey containing a weakly referenced {@code key}. It registers
     * itself with the {@code refQueue} so that it can be used to expunge
     * the entry when the {@link WeakReference} is cleared.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheValue<V>

    /**
     * A {@link Value} that weakly references the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class LookupValue<V> implements Value<V> {

    /**
     * An optimized {@link Value} used to look-up the value in
     * {@link WeakCache#containsValue} method so that we are not
     * constructing the whole {@link CacheValue} just to look-up the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private interface Value<V> extends Supplier<V> {}

    /**
     * Common type of value suppliers that are holding a referent.
     * The {@link #equals} and {@link #hashCode} of implementations is defined
     * to compare the referent by identity.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private final class Factory implements Supplier<V> {

    /**
     * A factory {@link Supplier} that implements the lazy synchronized
     * construction of the value and installment of it into the cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public int size() {

    /**
     * Returns the current number of cached entries that
     * can decrease over time when keys/values are GC-ed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public boolean containsValue(V value) {

    /**
     * Checks whether the specified non-null value is already present in this
     * {@code WeakCache}. The check is made using identity comparison regardless
     * of whether value's class overrides {@link Object#equals} or not.
     *
     * @param value the non-null value to check
     * @return true if given {@code value} is already cached
     * @throws NullPointerException if value is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public V get(K key, P parameter) {

    /**
     * Look-up the value through the cache. This always evaluates the
     * {@code subKeyFactory} function and optionally evaluates
     * {@code valueFactory} function if there is no entry in the cache for given
     * pair of (key, subKey) or the entry has already been cleared.
     *
     * @param key       possibly null key
     * @param parameter parameter used together with key to create sub-key and
     *                  value (should not be null)
     * @return the cached value (never null)
     * @throws NullPointerException if {@code parameter} passed in or
     *                              {@code sub-key} calculated by
     *                              {@code subKeyFactory} or {@code value}
     *                              calculated by {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public WeakCache(BiFunction<K, P, ?> subKeyFactory,
                     BiFunction<K, P, V> valueFactory) {

    /**
     * Construct an instance of {@code WeakCache}
     *
     * @param subKeyFactory a function mapping a pair of
     *                      {@code (key, parameter) -> sub-key}
     * @param valueFactory  a function mapping a pair of
     *                      {@code (key, parameter) -> value}
     * @throws NullPointerException if {@code subKeyFactory} or
     *                              {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
final class WeakCache<K, P, V> {

/**
 * Cache mapping pairs of {@code (key, sub-key) -> value}. Keys and values are
 * weakly but sub-keys are strongly referenced.  Keys are passed directly to
 * {@link #get} method which also takes a {@code parameter}. Sub-keys are
 * calculated from keys and parameters using the {@code subKeyFactory} function
 * passed to the constructor. Values are calculated from keys and parameters
 * using the {@code valueFactory} function passed to the constructor.
 * Keys can be {@code null} and are compared by identity while sub-keys returned by
 * {@code subKeyFactory} or values returned by {@code valueFactory}
 * can not be null. Sub-keys are compared using their {@link #equals} method.
 * Entries are expunged from cache lazily on each invocation to {@link #get},
 * {@link #containsValue} or {@link #size} methods when the WeakReferences to
 * keys are cleared. Cleared WeakReferences to individual values don't cause
 * expunging, but such entries are logically treated as non-existent and
 * trigger re-evaluation of {@code valueFactory} on request for their
 * key/subKey.
 *
 * @author Peter Levart
 * @param <K> type of keys
 * @param <P> type of parameters
 * @param <V> type of values
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheKey<K> extends WeakReference<K> {

    /**
     * CacheKey containing a weakly referenced {@code key}. It registers
     * itself with the {@code refQueue} so that it can be used to expunge
     * the entry when the {@link WeakReference} is cleared.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheValue<V>

    /**
     * A {@link Value} that weakly references the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class LookupValue<V> implements Value<V> {

    /**
     * An optimized {@link Value} used to look-up the value in
     * {@link WeakCache#containsValue} method so that we are not
     * constructing the whole {@link CacheValue} just to look-up the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private interface Value<V> extends Supplier<V> {}

    /**
     * Common type of value suppliers that are holding a referent.
     * The {@link #equals} and {@link #hashCode} of implementations is defined
     * to compare the referent by identity.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private final class Factory implements Supplier<V> {

    /**
     * A factory {@link Supplier} that implements the lazy synchronized
     * construction of the value and installment of it into the cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public int size() {

    /**
     * Returns the current number of cached entries that
     * can decrease over time when keys/values are GC-ed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public boolean containsValue(V value) {

    /**
     * Checks whether the specified non-null value is already present in this
     * {@code WeakCache}. The check is made using identity comparison regardless
     * of whether value's class overrides {@link Object#equals} or not.
     *
     * @param value the non-null value to check
     * @return true if given {@code value} is already cached
     * @throws NullPointerException if value is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public V get(K key, P parameter) {

    /**
     * Look-up the value through the cache. This always evaluates the
     * {@code subKeyFactory} function and optionally evaluates
     * {@code valueFactory} function if there is no entry in the cache for given
     * pair of (key, subKey) or the entry has already been cleared.
     *
     * @param key       possibly null key
     * @param parameter parameter used together with key to create sub-key and
     *                  value (should not be null)
     * @return the cached value (never null)
     * @throws NullPointerException if {@code parameter} passed in or
     *                              {@code sub-key} calculated by
     *                              {@code subKeyFactory} or {@code value}
     *                              calculated by {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public WeakCache(BiFunction<K, P, ?> subKeyFactory,
                     BiFunction<K, P, V> valueFactory) {

    /**
     * Construct an instance of {@code WeakCache}
     *
     * @param subKeyFactory a function mapping a pair of
     *                      {@code (key, parameter) -> sub-key}
     * @param valueFactory  a function mapping a pair of
     *                      {@code (key, parameter) -> value}
     * @throws NullPointerException if {@code subKeyFactory} or
     *                              {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
final class WeakCache<K, P, V> {

/**
 * Cache mapping pairs of {@code (key, sub-key) -> value}. Keys and values are
 * weakly but sub-keys are strongly referenced.  Keys are passed directly to
 * {@link #get} method which also takes a {@code parameter}. Sub-keys are
 * calculated from keys and parameters using the {@code subKeyFactory} function
 * passed to the constructor. Values are calculated from keys and parameters
 * using the {@code valueFactory} function passed to the constructor.
 * Keys can be {@code null} and are compared by identity while sub-keys returned by
 * {@code subKeyFactory} or values returned by {@code valueFactory}
 * can not be null. Sub-keys are compared using their {@link #equals} method.
 * Entries are expunged from cache lazily on each invocation to {@link #get},
 * {@link #containsValue} or {@link #size} methods when the WeakReferences to
 * keys are cleared. Cleared WeakReferences to individual values don't cause
 * expunging, but such entries are logically treated as non-existent and
 * trigger re-evaluation of {@code valueFactory} on request for their
 * key/subKey.
 *
 * @author Peter Levart
 * @param <K> type of keys
 * @param <P> type of parameters
 * @param <V> type of values
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheKey<K> extends WeakReference<K> {

    /**
     * CacheKey containing a weakly referenced {@code key}. It registers
     * itself with the {@code refQueue} so that it can be used to expunge
     * the entry when the {@link WeakReference} is cleared.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheValue<V>

    /**
     * A {@link Value} that weakly references the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class LookupValue<V> implements Value<V> {

    /**
     * An optimized {@link Value} used to look-up the value in
     * {@link WeakCache#containsValue} method so that we are not
     * constructing the whole {@link CacheValue} just to look-up the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private interface Value<V> extends Supplier<V> {}

    /**
     * Common type of value suppliers that are holding a referent.
     * The {@link #equals} and {@link #hashCode} of implementations is defined
     * to compare the referent by identity.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private final class Factory implements Supplier<V> {

    /**
     * A factory {@link Supplier} that implements the lazy synchronized
     * construction of the value and installment of it into the cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public int size() {

    /**
     * Returns the current number of cached entries that
     * can decrease over time when keys/values are GC-ed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public boolean containsValue(V value) {

    /**
     * Checks whether the specified non-null value is already present in this
     * {@code WeakCache}. The check is made using identity comparison regardless
     * of whether value's class overrides {@link Object#equals} or not.
     *
     * @param value the non-null value to check
     * @return true if given {@code value} is already cached
     * @throws NullPointerException if value is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public V get(K key, P parameter) {

    /**
     * Look-up the value through the cache. This always evaluates the
     * {@code subKeyFactory} function and optionally evaluates
     * {@code valueFactory} function if there is no entry in the cache for given
     * pair of (key, subKey) or the entry has already been cleared.
     *
     * @param key       possibly null key
     * @param parameter parameter used together with key to create sub-key and
     *                  value (should not be null)
     * @return the cached value (never null)
     * @throws NullPointerException if {@code parameter} passed in or
     *                              {@code sub-key} calculated by
     *                              {@code subKeyFactory} or {@code value}
     *                              calculated by {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public WeakCache(BiFunction<K, P, ?> subKeyFactory,
                     BiFunction<K, P, V> valueFactory) {

    /**
     * Construct an instance of {@code WeakCache}
     *
     * @param subKeyFactory a function mapping a pair of
     *                      {@code (key, parameter) -> sub-key}
     * @param valueFactory  a function mapping a pair of
     *                      {@code (key, parameter) -> value}
     * @throws NullPointerException if {@code subKeyFactory} or
     *                              {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
final class WeakCache<K, P, V> {

/**
 * Cache mapping pairs of {@code (key, sub-key) -> value}. Keys and values are
 * weakly but sub-keys are strongly referenced.  Keys are passed directly to
 * {@link #get} method which also takes a {@code parameter}. Sub-keys are
 * calculated from keys and parameters using the {@code subKeyFactory} function
 * passed to the constructor. Values are calculated from keys and parameters
 * using the {@code valueFactory} function passed to the constructor.
 * Keys can be {@code null} and are compared by identity while sub-keys returned by
 * {@code subKeyFactory} or values returned by {@code valueFactory}
 * can not be null. Sub-keys are compared using their {@link #equals} method.
 * Entries are expunged from cache lazily on each invocation to {@link #get},
 * {@link #containsValue} or {@link #size} methods when the WeakReferences to
 * keys are cleared. Cleared WeakReferences to individual values don't cause
 * expunging, but such entries are logically treated as non-existent and
 * trigger re-evaluation of {@code valueFactory} on request for their
 * key/subKey.
 *
 * @author Peter Levart
 * @param <K> type of keys
 * @param <P> type of parameters
 * @param <V> type of values
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheKey<K> extends WeakReference<K> {

    /**
     * CacheKey containing a weakly referenced {@code key}. It registers
     * itself with the {@code refQueue} so that it can be used to expunge
     * the entry when the {@link WeakReference} is cleared.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheValue<V>

    /**
     * A {@link Value} that weakly references the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class LookupValue<V> implements Value<V> {

    /**
     * An optimized {@link Value} used to look-up the value in
     * {@link WeakCache#containsValue} method so that we are not
     * constructing the whole {@link CacheValue} just to look-up the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private interface Value<V> extends Supplier<V> {}

    /**
     * Common type of value suppliers that are holding a referent.
     * The {@link #equals} and {@link #hashCode} of implementations is defined
     * to compare the referent by identity.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private final class Factory implements Supplier<V> {

    /**
     * A factory {@link Supplier} that implements the lazy synchronized
     * construction of the value and installment of it into the cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public int size() {

    /**
     * Returns the current number of cached entries that
     * can decrease over time when keys/values are GC-ed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public boolean containsValue(V value) {

    /**
     * Checks whether the specified non-null value is already present in this
     * {@code WeakCache}. The check is made using identity comparison regardless
     * of whether value's class overrides {@link Object#equals} or not.
     *
     * @param value the non-null value to check
     * @return true if given {@code value} is already cached
     * @throws NullPointerException if value is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public V get(K key, P parameter) {

    /**
     * Look-up the value through the cache. This always evaluates the
     * {@code subKeyFactory} function and optionally evaluates
     * {@code valueFactory} function if there is no entry in the cache for given
     * pair of (key, subKey) or the entry has already been cleared.
     *
     * @param key       possibly null key
     * @param parameter parameter used together with key to create sub-key and
     *                  value (should not be null)
     * @return the cached value (never null)
     * @throws NullPointerException if {@code parameter} passed in or
     *                              {@code sub-key} calculated by
     *                              {@code subKeyFactory} or {@code value}
     *                              calculated by {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public WeakCache(BiFunction<K, P, ?> subKeyFactory,
                     BiFunction<K, P, V> valueFactory) {

    /**
     * Construct an instance of {@code WeakCache}
     *
     * @param subKeyFactory a function mapping a pair of
     *                      {@code (key, parameter) -> sub-key}
     * @param valueFactory  a function mapping a pair of
     *                      {@code (key, parameter) -> value}
     * @throws NullPointerException if {@code subKeyFactory} or
     *                              {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
final class WeakCache<K, P, V> {

/**
 * Cache mapping pairs of {@code (key, sub-key) -> value}. Keys and values are
 * weakly but sub-keys are strongly referenced.  Keys are passed directly to
 * {@link #get} method which also takes a {@code parameter}. Sub-keys are
 * calculated from keys and parameters using the {@code subKeyFactory} function
 * passed to the constructor. Values are calculated from keys and parameters
 * using the {@code valueFactory} function passed to the constructor.
 * Keys can be {@code null} and are compared by identity while sub-keys returned by
 * {@code subKeyFactory} or values returned by {@code valueFactory}
 * can not be null. Sub-keys are compared using their {@link #equals} method.
 * Entries are expunged from cache lazily on each invocation to {@link #get},
 * {@link #containsValue} or {@link #size} methods when the WeakReferences to
 * keys are cleared. Cleared WeakReferences to individual values don't cause
 * expunging, but such entries are logically treated as non-existent and
 * trigger re-evaluation of {@code valueFactory} on request for their
 * key/subKey.
 *
 * @author Peter Levart
 * @param <K> type of keys
 * @param <P> type of parameters
 * @param <V> type of values
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheKey<K> extends WeakReference<K> {

    /**
     * CacheKey containing a weakly referenced {@code key}. It registers
     * itself with the {@code refQueue} so that it can be used to expunge
     * the entry when the {@link WeakReference} is cleared.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class CacheValue<V>

    /**
     * A {@link Value} that weakly references the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private static final class LookupValue<V> implements Value<V> {

    /**
     * An optimized {@link Value} used to look-up the value in
     * {@link WeakCache#containsValue} method so that we are not
     * constructing the whole {@link CacheValue} just to look-up the referent.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private interface Value<V> extends Supplier<V> {}

    /**
     * Common type of value suppliers that are holding a referent.
     * The {@link #equals} and {@link #hashCode} of implementations is defined
     * to compare the referent by identity.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    private final class Factory implements Supplier<V> {

    /**
     * A factory {@link Supplier} that implements the lazy synchronized
     * construction of the value and installment of it into the cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public int size() {

    /**
     * Returns the current number of cached entries that
     * can decrease over time when keys/values are GC-ed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public boolean containsValue(V value) {

    /**
     * Checks whether the specified non-null value is already present in this
     * {@code WeakCache}. The check is made using identity comparison regardless
     * of whether value's class overrides {@link Object#equals} or not.
     *
     * @param value the non-null value to check
     * @return true if given {@code value} is already cached
     * @throws NullPointerException if value is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public V get(K key, P parameter) {

    /**
     * Look-up the value through the cache. This always evaluates the
     * {@code subKeyFactory} function and optionally evaluates
     * {@code valueFactory} function if there is no entry in the cache for given
     * pair of (key, subKey) or the entry has already been cleared.
     *
     * @param key       possibly null key
     * @param parameter parameter used together with key to create sub-key and
     *                  value (should not be null)
     * @return the cached value (never null)
     * @throws NullPointerException if {@code parameter} passed in or
     *                              {@code sub-key} calculated by
     *                              {@code subKeyFactory} or {@code value}
     *                              calculated by {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
    public WeakCache(BiFunction<K, P, ?> subKeyFactory,
                     BiFunction<K, P, V> valueFactory) {

    /**
     * Construct an instance of {@code WeakCache}
     *
     * @param subKeyFactory a function mapping a pair of
     *                      {@code (key, parameter) -> sub-key}
     * @param valueFactory  a function mapping a pair of
     *                      {@code (key, parameter) -> value}
     * @throws NullPointerException if {@code subKeyFactory} or
     *                              {@code valueFactory} is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/WeakCache.java
final class WeakCache<K, P, V> {

/**
 * Cache mapping pairs of {@code (key, sub-key) -> value}. Keys and values are
 * weakly but sub-keys are strongly referenced.  Keys are passed directly to
 * {@link #get} method which also takes a {@code parameter}. Sub-keys are
 * calculated from keys and parameters using the {@code subKeyFactory} function
 * passed to the constructor. Values are calculated from keys and parameters
 * using the {@code valueFactory} function passed to the constructor.
 * Keys can be {@code null} and are compared by identity while sub-keys returned by
 * {@code subKeyFactory} or values returned by {@code valueFactory}
 * can not be null. Sub-keys are compared using their {@link #equals} method.
 * Entries are expunged from cache lazily on each invocation to {@link #get},
 * {@link #containsValue} or {@link #size} methods when the WeakReferences to
 * keys are cleared. Cleared WeakReferences to individual values don't cause
 * expunging, but such entries are logically treated as non-existent and
 * trigger re-evaluation of {@code valueFactory} on request for their
 * key/subKey.
 *
 * @author Peter Levart
 * @param <K> type of keys
 * @param <P> type of parameters
 * @param <V> type of values
 */
