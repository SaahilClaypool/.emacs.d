_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int PROBE_LIMIT      =  6;       // 1..

        /** Maximum number of probes to attempt. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int CACHE_LOAD_LIMIT = 67;  // 0..100

        /** Percent loading of cache before resize. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> Entry<T> overwrittenEntry(Entry<T> e2) {

        /** Note an entry that is about to be overwritten.
         *  If it is not live, quietly replace it by null.
         *  If it is an actual null, increment cacheLoad,
         *  because the caller is going to store something
         *  in its place.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> placeInCache(Entry<?>[] cache, int pos, Entry<?> e, boolean gently) {

        /** Store the given entry.  Update cacheLoad, and return any live victim.
         *  'Gently' means return self rather than dislocating a live victim.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(ClassValue<T> classValue, Entry<T> e) {

        /** Add the given entry to the cache, in its home location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(Entry<T> e) {

        /** Add the given entry to the cache, in its home location, unless it is out of date. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries() {

        /** Remove all stale entries, everywhere. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(ClassValue<?> classValue) {

        /** Remove stale entries in the range near classValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> findReplacement(Entry<?>[] cache, int home1) {

        /** Clearing a cache slot risks disconnecting following entries
         *  from the head of a non-null run, which would allow them
         *  to be found via reprobes.  Find an entry after cache[begin]
         *  to plug into the hole, or return null if none is needed.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(Entry<?>[] cache, int begin, int count) {

        /** Remove stale entries in the given range.
         *  Should be executed under a Map lock.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void checkCacheLoad() {

        /** Make sure the cache load stays below its limit, if possible. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void sizeCache(int length) {

        /// --------
        /// Below this line all functions are private, and assume synchronized access.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static int entryDislocation(Entry<?>[] cache, int pos, Entry<?> e) {

        /** How far out of place is e? */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeBackupLocations(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Given that first probe was a collision, retry at nearby locations. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeHomeLocation(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Look in the cache, at the home location for the given ClassValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static Entry<?> loadFromCache(Entry<?>[] cache, int i) {

        /** Load the cache entry at the given (hashed) location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        // Statics do not need synchronization.

        /// --------
        /// Cache management.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Change the value for an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Remove an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Finish a query.  Overwrite a matching placeholder.  Drop stale incoming values. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Initiate a query.  Store a promise (placeholder) if there is no value yet. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        ClassValueMap(Class<?> type) {

        /** Build a backing map for ClassValues, relative the given type.
         *  Also, create an empty cache array and install it on the class.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int INITIAL_ENTRIES = 32;

        /** Number of entries initially allocated to each type when first used with any ClassValue.
         *  It would be pointless to make this much smaller than the Class and ClassValueMap objects themselves.
         *  Must be a power of 2.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class ClassValueMap extends WeakHashMap<ClassValue.Identity, Entry<?>> {

    /** A backing map for all ClassValues, relative a single given type.
     *  Gives a fully serialized "true state" for each pair (ClassValue cv, Class type).
     *  Also manages an unserialized fast-path cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static ClassValueMap getMap(Class<?> type) {

    /** Return the backing map associated with this type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        @SuppressWarnings("unchecked")  // if !isPromise, type is T

        /** Fetch the value.  This entry must not be a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        Entry(Version<T> version) {

        /** For creating a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Entry<T> extends WeakReference<Version<T>> {

    /** One binding of a value to a class via a ClassValue.
     *  States are:<ul>
     *  <li> promise if value == Entry.this
     *  <li> else dead if version == null
     *  <li> else stale if version != classValue.version
     *  <li> else live </ul>
     *  Promises are never put into the cache; they only live in the
     *  backing map while a computeValue call is in flight.
     *  Once an entry goes stale, it can be reset at any time
     *  into the dead state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private volatile Version<T> version = new Version<>(this);

    /**
     * Current version for retrieving this class value from the cache.
     * Any number of computeValue calls can be cached in association with one version.
     * But the version changes when a remove (on any type) is executed.
     * A version change invalidates all cache entries for the affected ClassValue,
     * by marking them as stale.  Stale cache entries do not force another call
     * to computeValue, but they do require a synchronized visit to a backing map.
     * <p>
     * All user-visible state changes on the ClassValue take place under
     * a lock inside the synchronized methods of ClassValueMap.
     * Readers (of ClassValue.get) are notified of such state changes
     * when this.version is bumped to a new token.
     * This variable must be volatile so that an unsynchronized reader
     * will receive the notification without delay.
     * <p>
     * If version were not volatile, one thread T1 could persistently hold onto
     * a stale value this.value == V1, while while another thread T2 advances
     * (under a lock) to this.value == V2.  This will typically be harmless,
     * but if T1 and T2 interact causally via some other channel, such that
     * T1's further actions are constrained (in the JMM) to happen after
     * the V2 event, then T1's observation of V1 will be an error.
     * <p>
     * The practical effect of making this.version be volatile is that it cannot
     * be hoisted out of a loop (by an optimizing JIT) or otherwise cached.
     * Some machines may also require a barrier instruction to execute
     * before this.version.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final Identity identity = new Identity();

    /**
     * This ClassValue's identity, expressed as an opaque object.
     * The main object {@code ClassValue.this} is incorrect since
     * subclasses may override {@code ClassValue.equals}, which
     * could confuse keys in the ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Identity {

    /**
     * Private key for retrieval of this object from ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static final int HASH_MASK = (-1 >>> 2);

    /** Mask a hash code to be positive but not too large, to prevent wraparound. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final int HASH_INCREMENT = 0x61c88647;

    /** Good for power-of-two tables.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final AtomicInteger nextHashCode = new AtomicInteger();

    /** Value stream for hashCodeForCache.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final int hashCodeForCache = nextHashCode.getAndAdd(HASH_INCREMENT) & HASH_MASK;

    /** Internal hash code for accessing Class.classValueMap.cacheArray. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    boolean match(Entry<?> e) {

    /** Check that e is non-null, matches this ClassValue, and is live. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromHashMap(Class<?> type) {

    /** Called when the fast path of get fails, and cache reprobe also fails.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromBackup(Entry<?>[] cache, Class<?> type) {

    /**
     * Slow tail of ClassValue.get to retry at nearby locations in the cache,
     * or take a slow lock and check the hash table.
     * Called only if the first probe was empty or a collision.
     * This is a separate method, so compilers can process it independently.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final Entry<?>[] EMPTY_CACHE = { null };

    /** Initial, one-element, empty cache used by all Class instances.  Must never be filled. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    /** Return the cache, if it exists, else a dummy empty cache. */

    /// --------
    /// Implementation...
    /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public void remove(Class<?> type) {

    /**
     * Removes the associated value for the given class.
     * If this value is subsequently {@linkplain #get read} for the same class,
     * its value will be reinitialized by invoking its {@link #computeValue computeValue} method.
     * This may result in an additional invocation of the
     * {@code computeValue} method for the given class.
     * <p>
     * In order to explain the interaction between {@code get} and {@code remove} calls,
     * we must model the state transitions of a class value to take into account
     * the alternation between uninitialized and initialized states.
     * To do this, number these states sequentially from zero, and note that
     * uninitialized (or removed) states are numbered with even numbers,
     * while initialized (or re-initialized) states have odd numbers.
     * <p>
     * When a thread {@code T} removes a class value in state {@code 2N},
     * nothing happens, since the class value is already uninitialized.
     * Otherwise, the state is advanced atomically to {@code 2N+1}.
     * <p>
     * When a thread {@code T} queries a class value in state {@code 2N},
     * the thread first attempts to initialize the class value to state {@code 2N+1}
     * by invoking {@code computeValue} and installing the resulting value.
     * <p>
     * When {@code T} attempts to install the newly computed value,
     * if the state is still at {@code 2N}, the class value will be initialized
     * with the computed value, advancing it to state {@code 2N+1}.
     * <p>
     * Otherwise, whether the new state is even or odd,
     * {@code T} will discard the newly computed value
     * and retry the {@code get} operation.
     * <p>
     * Discarding and retrying is an important proviso,
     * since otherwise {@code T} could potentially install
     * a disastrously stale value.  For example:
     * <ul>
     * <li>{@code T} calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T} quickly computes a time-dependent value {@code V0} and gets ready to install it
     * <li>{@code T} is hit by an unlucky paging or scheduling event, and goes to sleep for a long time
     * <li>...meanwhile, {@code T2} also calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T2} quickly computes a similar time-dependent value {@code V1} and installs it on {@code CV.get(C)}
     * <li>{@code T2} (or a third thread) then calls {@code CV.remove(C)}, undoing {@code T2}'s work
     * <li> the previous actions of {@code T2} are repeated several times
     * <li> also, the relevant computed values change over time: {@code V1}, {@code V2}, ...
     * <li>...meanwhile, {@code T} wakes up and attempts to install {@code V0}; <em>this must fail</em>
     * </ul>
     * We can assume in the above scenario that {@code CV.computeValue} uses locks to properly
     * observe the time-dependent states as it computes {@code V1}, etc.
     * This does not remove the threat of a stale value, since there is a window of time
     * between the return of {@code computeValue} in {@code T} and the installation
     * of the the new value.  No user synchronization is possible during this time.
     *
     * @param type the type whose class value must be removed
     * @throws NullPointerException if the argument is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public T get(Class<?> type) {

    /**
     * Returns the value for the given class.
     * If no value has yet been computed, it is obtained by
     * an invocation of the {@link #computeValue computeValue} method.
     * <p>
     * The actual installation of the value on the class
     * is performed atomically.
     * At that point, if several racing threads have
     * computed values, one is chosen, and returned to
     * all the racing threads.
     * <p>
     * The {@code type} parameter is typically a class, but it may be any type,
     * such as an interface, a primitive type (like {@code int.class}), or {@code void.class}.
     * <p>
     * In the absence of {@code remove} calls, a class value has a simple
     * state diagram:  uninitialized and initialized.
     * When {@code remove} calls are made,
     * the rules for value observation are more complex.
     * See the documentation for {@link #remove remove} for more information.
     *
     * @param type the type whose class value must be computed or retrieved
     * @return the current value associated with this {@code ClassValue}, for the given class or interface
     * @throws NullPointerException if the argument is null
     * @see #remove
     * @see #computeValue
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected abstract T computeValue(Class<?> type);

    /**
     * Computes the given class's derived value for this {@code ClassValue}.
     * <p>
     * This method will be invoked within the first thread that accesses
     * the value with the {@link #get get} method.
     * <p>
     * Normally, this method is invoked at most once per class,
     * but it may be invoked again if there has been a call to
     * {@link #remove remove}.
     * <p>
     * If this method throws an exception, the corresponding call to {@code get}
     * will terminate abnormally with that exception, and no class value will be recorded.
     *
     * @param type the type whose class value must be computed
     * @return the newly computed value associated with this {@code ClassValue}, for the given class or interface
     * @see #get
     * @see #remove
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected ClassValue() {

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
public abstract class ClassValue<T> {

/**
 * Lazily associate a computed value with (potentially) every type.
 * For example, if a dynamic language needs to construct a message dispatch
 * table for each class encountered at a message send call site,
 * it can use a {@code ClassValue} to cache information needed to
 * perform the message send quickly, for each class encountered.
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int PROBE_LIMIT      =  6;       // 1..

        /** Maximum number of probes to attempt. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int CACHE_LOAD_LIMIT = 67;  // 0..100

        /** Percent loading of cache before resize. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> Entry<T> overwrittenEntry(Entry<T> e2) {

        /** Note an entry that is about to be overwritten.
         *  If it is not live, quietly replace it by null.
         *  If it is an actual null, increment cacheLoad,
         *  because the caller is going to store something
         *  in its place.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> placeInCache(Entry<?>[] cache, int pos, Entry<?> e, boolean gently) {

        /** Store the given entry.  Update cacheLoad, and return any live victim.
         *  'Gently' means return self rather than dislocating a live victim.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(ClassValue<T> classValue, Entry<T> e) {

        /** Add the given entry to the cache, in its home location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(Entry<T> e) {

        /** Add the given entry to the cache, in its home location, unless it is out of date. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries() {

        /** Remove all stale entries, everywhere. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(ClassValue<?> classValue) {

        /** Remove stale entries in the range near classValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> findReplacement(Entry<?>[] cache, int home1) {

        /** Clearing a cache slot risks disconnecting following entries
         *  from the head of a non-null run, which would allow them
         *  to be found via reprobes.  Find an entry after cache[begin]
         *  to plug into the hole, or return null if none is needed.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(Entry<?>[] cache, int begin, int count) {

        /** Remove stale entries in the given range.
         *  Should be executed under a Map lock.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void checkCacheLoad() {

        /** Make sure the cache load stays below its limit, if possible. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void sizeCache(int length) {

        /// --------
        /// Below this line all functions are private, and assume synchronized access.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static int entryDislocation(Entry<?>[] cache, int pos, Entry<?> e) {

        /** How far out of place is e? */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeBackupLocations(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Given that first probe was a collision, retry at nearby locations. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeHomeLocation(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Look in the cache, at the home location for the given ClassValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static Entry<?> loadFromCache(Entry<?>[] cache, int i) {

        /** Load the cache entry at the given (hashed) location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        // Statics do not need synchronization.

        /// --------
        /// Cache management.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Change the value for an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Remove an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Finish a query.  Overwrite a matching placeholder.  Drop stale incoming values. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Initiate a query.  Store a promise (placeholder) if there is no value yet. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        ClassValueMap(Class<?> type) {

        /** Build a backing map for ClassValues, relative the given type.
         *  Also, create an empty cache array and install it on the class.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int INITIAL_ENTRIES = 32;

        /** Number of entries initially allocated to each type when first used with any ClassValue.
         *  It would be pointless to make this much smaller than the Class and ClassValueMap objects themselves.
         *  Must be a power of 2.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class ClassValueMap extends WeakHashMap<ClassValue.Identity, Entry<?>> {

    /** A backing map for all ClassValues, relative a single given type.
     *  Gives a fully serialized "true state" for each pair (ClassValue cv, Class type).
     *  Also manages an unserialized fast-path cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static ClassValueMap getMap(Class<?> type) {

    /** Return the backing map associated with this type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        @SuppressWarnings("unchecked")  // if !isPromise, type is T

        /** Fetch the value.  This entry must not be a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        Entry(Version<T> version) {

        /** For creating a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Entry<T> extends WeakReference<Version<T>> {

    /** One binding of a value to a class via a ClassValue.
     *  States are:<ul>
     *  <li> promise if value == Entry.this
     *  <li> else dead if version == null
     *  <li> else stale if version != classValue.version
     *  <li> else live </ul>
     *  Promises are never put into the cache; they only live in the
     *  backing map while a computeValue call is in flight.
     *  Once an entry goes stale, it can be reset at any time
     *  into the dead state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private volatile Version<T> version = new Version<>(this);

    /**
     * Current version for retrieving this class value from the cache.
     * Any number of computeValue calls can be cached in association with one version.
     * But the version changes when a remove (on any type) is executed.
     * A version change invalidates all cache entries for the affected ClassValue,
     * by marking them as stale.  Stale cache entries do not force another call
     * to computeValue, but they do require a synchronized visit to a backing map.
     * <p>
     * All user-visible state changes on the ClassValue take place under
     * a lock inside the synchronized methods of ClassValueMap.
     * Readers (of ClassValue.get) are notified of such state changes
     * when this.version is bumped to a new token.
     * This variable must be volatile so that an unsynchronized reader
     * will receive the notification without delay.
     * <p>
     * If version were not volatile, one thread T1 could persistently hold onto
     * a stale value this.value == V1, while while another thread T2 advances
     * (under a lock) to this.value == V2.  This will typically be harmless,
     * but if T1 and T2 interact causally via some other channel, such that
     * T1's further actions are constrained (in the JMM) to happen after
     * the V2 event, then T1's observation of V1 will be an error.
     * <p>
     * The practical effect of making this.version be volatile is that it cannot
     * be hoisted out of a loop (by an optimizing JIT) or otherwise cached.
     * Some machines may also require a barrier instruction to execute
     * before this.version.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final Identity identity = new Identity();

    /**
     * This ClassValue's identity, expressed as an opaque object.
     * The main object {@code ClassValue.this} is incorrect since
     * subclasses may override {@code ClassValue.equals}, which
     * could confuse keys in the ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Identity {

    /**
     * Private key for retrieval of this object from ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static final int HASH_MASK = (-1 >>> 2);

    /** Mask a hash code to be positive but not too large, to prevent wraparound. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final int HASH_INCREMENT = 0x61c88647;

    /** Good for power-of-two tables.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final AtomicInteger nextHashCode = new AtomicInteger();

    /** Value stream for hashCodeForCache.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final int hashCodeForCache = nextHashCode.getAndAdd(HASH_INCREMENT) & HASH_MASK;

    /** Internal hash code for accessing Class.classValueMap.cacheArray. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    boolean match(Entry<?> e) {

    /** Check that e is non-null, matches this ClassValue, and is live. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromHashMap(Class<?> type) {

    /** Called when the fast path of get fails, and cache reprobe also fails.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromBackup(Entry<?>[] cache, Class<?> type) {

    /**
     * Slow tail of ClassValue.get to retry at nearby locations in the cache,
     * or take a slow lock and check the hash table.
     * Called only if the first probe was empty or a collision.
     * This is a separate method, so compilers can process it independently.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final Entry<?>[] EMPTY_CACHE = { null };

    /** Initial, one-element, empty cache used by all Class instances.  Must never be filled. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    /** Return the cache, if it exists, else a dummy empty cache. */

    /// --------
    /// Implementation...
    /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public void remove(Class<?> type) {

    /**
     * Removes the associated value for the given class.
     * If this value is subsequently {@linkplain #get read} for the same class,
     * its value will be reinitialized by invoking its {@link #computeValue computeValue} method.
     * This may result in an additional invocation of the
     * {@code computeValue} method for the given class.
     * <p>
     * In order to explain the interaction between {@code get} and {@code remove} calls,
     * we must model the state transitions of a class value to take into account
     * the alternation between uninitialized and initialized states.
     * To do this, number these states sequentially from zero, and note that
     * uninitialized (or removed) states are numbered with even numbers,
     * while initialized (or re-initialized) states have odd numbers.
     * <p>
     * When a thread {@code T} removes a class value in state {@code 2N},
     * nothing happens, since the class value is already uninitialized.
     * Otherwise, the state is advanced atomically to {@code 2N+1}.
     * <p>
     * When a thread {@code T} queries a class value in state {@code 2N},
     * the thread first attempts to initialize the class value to state {@code 2N+1}
     * by invoking {@code computeValue} and installing the resulting value.
     * <p>
     * When {@code T} attempts to install the newly computed value,
     * if the state is still at {@code 2N}, the class value will be initialized
     * with the computed value, advancing it to state {@code 2N+1}.
     * <p>
     * Otherwise, whether the new state is even or odd,
     * {@code T} will discard the newly computed value
     * and retry the {@code get} operation.
     * <p>
     * Discarding and retrying is an important proviso,
     * since otherwise {@code T} could potentially install
     * a disastrously stale value.  For example:
     * <ul>
     * <li>{@code T} calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T} quickly computes a time-dependent value {@code V0} and gets ready to install it
     * <li>{@code T} is hit by an unlucky paging or scheduling event, and goes to sleep for a long time
     * <li>...meanwhile, {@code T2} also calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T2} quickly computes a similar time-dependent value {@code V1} and installs it on {@code CV.get(C)}
     * <li>{@code T2} (or a third thread) then calls {@code CV.remove(C)}, undoing {@code T2}'s work
     * <li> the previous actions of {@code T2} are repeated several times
     * <li> also, the relevant computed values change over time: {@code V1}, {@code V2}, ...
     * <li>...meanwhile, {@code T} wakes up and attempts to install {@code V0}; <em>this must fail</em>
     * </ul>
     * We can assume in the above scenario that {@code CV.computeValue} uses locks to properly
     * observe the time-dependent states as it computes {@code V1}, etc.
     * This does not remove the threat of a stale value, since there is a window of time
     * between the return of {@code computeValue} in {@code T} and the installation
     * of the the new value.  No user synchronization is possible during this time.
     *
     * @param type the type whose class value must be removed
     * @throws NullPointerException if the argument is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public T get(Class<?> type) {

    /**
     * Returns the value for the given class.
     * If no value has yet been computed, it is obtained by
     * an invocation of the {@link #computeValue computeValue} method.
     * <p>
     * The actual installation of the value on the class
     * is performed atomically.
     * At that point, if several racing threads have
     * computed values, one is chosen, and returned to
     * all the racing threads.
     * <p>
     * The {@code type} parameter is typically a class, but it may be any type,
     * such as an interface, a primitive type (like {@code int.class}), or {@code void.class}.
     * <p>
     * In the absence of {@code remove} calls, a class value has a simple
     * state diagram:  uninitialized and initialized.
     * When {@code remove} calls are made,
     * the rules for value observation are more complex.
     * See the documentation for {@link #remove remove} for more information.
     *
     * @param type the type whose class value must be computed or retrieved
     * @return the current value associated with this {@code ClassValue}, for the given class or interface
     * @throws NullPointerException if the argument is null
     * @see #remove
     * @see #computeValue
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected abstract T computeValue(Class<?> type);

    /**
     * Computes the given class's derived value for this {@code ClassValue}.
     * <p>
     * This method will be invoked within the first thread that accesses
     * the value with the {@link #get get} method.
     * <p>
     * Normally, this method is invoked at most once per class,
     * but it may be invoked again if there has been a call to
     * {@link #remove remove}.
     * <p>
     * If this method throws an exception, the corresponding call to {@code get}
     * will terminate abnormally with that exception, and no class value will be recorded.
     *
     * @param type the type whose class value must be computed
     * @return the newly computed value associated with this {@code ClassValue}, for the given class or interface
     * @see #get
     * @see #remove
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected ClassValue() {

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
public abstract class ClassValue<T> {

/**
 * Lazily associate a computed value with (potentially) every type.
 * For example, if a dynamic language needs to construct a message dispatch
 * table for each class encountered at a message send call site,
 * it can use a {@code ClassValue} to cache information needed to
 * perform the message send quickly, for each class encountered.
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int PROBE_LIMIT      =  6;       // 1..

        /** Maximum number of probes to attempt. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int CACHE_LOAD_LIMIT = 67;  // 0..100

        /** Percent loading of cache before resize. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> Entry<T> overwrittenEntry(Entry<T> e2) {

        /** Note an entry that is about to be overwritten.
         *  If it is not live, quietly replace it by null.
         *  If it is an actual null, increment cacheLoad,
         *  because the caller is going to store something
         *  in its place.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> placeInCache(Entry<?>[] cache, int pos, Entry<?> e, boolean gently) {

        /** Store the given entry.  Update cacheLoad, and return any live victim.
         *  'Gently' means return self rather than dislocating a live victim.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(ClassValue<T> classValue, Entry<T> e) {

        /** Add the given entry to the cache, in its home location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(Entry<T> e) {

        /** Add the given entry to the cache, in its home location, unless it is out of date. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries() {

        /** Remove all stale entries, everywhere. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(ClassValue<?> classValue) {

        /** Remove stale entries in the range near classValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> findReplacement(Entry<?>[] cache, int home1) {

        /** Clearing a cache slot risks disconnecting following entries
         *  from the head of a non-null run, which would allow them
         *  to be found via reprobes.  Find an entry after cache[begin]
         *  to plug into the hole, or return null if none is needed.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(Entry<?>[] cache, int begin, int count) {

        /** Remove stale entries in the given range.
         *  Should be executed under a Map lock.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void checkCacheLoad() {

        /** Make sure the cache load stays below its limit, if possible. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void sizeCache(int length) {

        /// --------
        /// Below this line all functions are private, and assume synchronized access.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static int entryDislocation(Entry<?>[] cache, int pos, Entry<?> e) {

        /** How far out of place is e? */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeBackupLocations(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Given that first probe was a collision, retry at nearby locations. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeHomeLocation(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Look in the cache, at the home location for the given ClassValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static Entry<?> loadFromCache(Entry<?>[] cache, int i) {

        /** Load the cache entry at the given (hashed) location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        // Statics do not need synchronization.

        /// --------
        /// Cache management.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Change the value for an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Remove an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Finish a query.  Overwrite a matching placeholder.  Drop stale incoming values. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Initiate a query.  Store a promise (placeholder) if there is no value yet. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        ClassValueMap(Class<?> type) {

        /** Build a backing map for ClassValues, relative the given type.
         *  Also, create an empty cache array and install it on the class.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int INITIAL_ENTRIES = 32;

        /** Number of entries initially allocated to each type when first used with any ClassValue.
         *  It would be pointless to make this much smaller than the Class and ClassValueMap objects themselves.
         *  Must be a power of 2.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class ClassValueMap extends WeakHashMap<ClassValue.Identity, Entry<?>> {

    /** A backing map for all ClassValues, relative a single given type.
     *  Gives a fully serialized "true state" for each pair (ClassValue cv, Class type).
     *  Also manages an unserialized fast-path cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static ClassValueMap getMap(Class<?> type) {

    /** Return the backing map associated with this type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        @SuppressWarnings("unchecked")  // if !isPromise, type is T

        /** Fetch the value.  This entry must not be a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        Entry(Version<T> version) {

        /** For creating a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Entry<T> extends WeakReference<Version<T>> {

    /** One binding of a value to a class via a ClassValue.
     *  States are:<ul>
     *  <li> promise if value == Entry.this
     *  <li> else dead if version == null
     *  <li> else stale if version != classValue.version
     *  <li> else live </ul>
     *  Promises are never put into the cache; they only live in the
     *  backing map while a computeValue call is in flight.
     *  Once an entry goes stale, it can be reset at any time
     *  into the dead state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private volatile Version<T> version = new Version<>(this);

    /**
     * Current version for retrieving this class value from the cache.
     * Any number of computeValue calls can be cached in association with one version.
     * But the version changes when a remove (on any type) is executed.
     * A version change invalidates all cache entries for the affected ClassValue,
     * by marking them as stale.  Stale cache entries do not force another call
     * to computeValue, but they do require a synchronized visit to a backing map.
     * <p>
     * All user-visible state changes on the ClassValue take place under
     * a lock inside the synchronized methods of ClassValueMap.
     * Readers (of ClassValue.get) are notified of such state changes
     * when this.version is bumped to a new token.
     * This variable must be volatile so that an unsynchronized reader
     * will receive the notification without delay.
     * <p>
     * If version were not volatile, one thread T1 could persistently hold onto
     * a stale value this.value == V1, while while another thread T2 advances
     * (under a lock) to this.value == V2.  This will typically be harmless,
     * but if T1 and T2 interact causally via some other channel, such that
     * T1's further actions are constrained (in the JMM) to happen after
     * the V2 event, then T1's observation of V1 will be an error.
     * <p>
     * The practical effect of making this.version be volatile is that it cannot
     * be hoisted out of a loop (by an optimizing JIT) or otherwise cached.
     * Some machines may also require a barrier instruction to execute
     * before this.version.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final Identity identity = new Identity();

    /**
     * This ClassValue's identity, expressed as an opaque object.
     * The main object {@code ClassValue.this} is incorrect since
     * subclasses may override {@code ClassValue.equals}, which
     * could confuse keys in the ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Identity {

    /**
     * Private key for retrieval of this object from ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static final int HASH_MASK = (-1 >>> 2);

    /** Mask a hash code to be positive but not too large, to prevent wraparound. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final int HASH_INCREMENT = 0x61c88647;

    /** Good for power-of-two tables.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final AtomicInteger nextHashCode = new AtomicInteger();

    /** Value stream for hashCodeForCache.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final int hashCodeForCache = nextHashCode.getAndAdd(HASH_INCREMENT) & HASH_MASK;

    /** Internal hash code for accessing Class.classValueMap.cacheArray. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    boolean match(Entry<?> e) {

    /** Check that e is non-null, matches this ClassValue, and is live. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromHashMap(Class<?> type) {

    /** Called when the fast path of get fails, and cache reprobe also fails.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromBackup(Entry<?>[] cache, Class<?> type) {

    /**
     * Slow tail of ClassValue.get to retry at nearby locations in the cache,
     * or take a slow lock and check the hash table.
     * Called only if the first probe was empty or a collision.
     * This is a separate method, so compilers can process it independently.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final Entry<?>[] EMPTY_CACHE = { null };

    /** Initial, one-element, empty cache used by all Class instances.  Must never be filled. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    /** Return the cache, if it exists, else a dummy empty cache. */

    /// --------
    /// Implementation...
    /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public void remove(Class<?> type) {

    /**
     * Removes the associated value for the given class.
     * If this value is subsequently {@linkplain #get read} for the same class,
     * its value will be reinitialized by invoking its {@link #computeValue computeValue} method.
     * This may result in an additional invocation of the
     * {@code computeValue} method for the given class.
     * <p>
     * In order to explain the interaction between {@code get} and {@code remove} calls,
     * we must model the state transitions of a class value to take into account
     * the alternation between uninitialized and initialized states.
     * To do this, number these states sequentially from zero, and note that
     * uninitialized (or removed) states are numbered with even numbers,
     * while initialized (or re-initialized) states have odd numbers.
     * <p>
     * When a thread {@code T} removes a class value in state {@code 2N},
     * nothing happens, since the class value is already uninitialized.
     * Otherwise, the state is advanced atomically to {@code 2N+1}.
     * <p>
     * When a thread {@code T} queries a class value in state {@code 2N},
     * the thread first attempts to initialize the class value to state {@code 2N+1}
     * by invoking {@code computeValue} and installing the resulting value.
     * <p>
     * When {@code T} attempts to install the newly computed value,
     * if the state is still at {@code 2N}, the class value will be initialized
     * with the computed value, advancing it to state {@code 2N+1}.
     * <p>
     * Otherwise, whether the new state is even or odd,
     * {@code T} will discard the newly computed value
     * and retry the {@code get} operation.
     * <p>
     * Discarding and retrying is an important proviso,
     * since otherwise {@code T} could potentially install
     * a disastrously stale value.  For example:
     * <ul>
     * <li>{@code T} calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T} quickly computes a time-dependent value {@code V0} and gets ready to install it
     * <li>{@code T} is hit by an unlucky paging or scheduling event, and goes to sleep for a long time
     * <li>...meanwhile, {@code T2} also calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T2} quickly computes a similar time-dependent value {@code V1} and installs it on {@code CV.get(C)}
     * <li>{@code T2} (or a third thread) then calls {@code CV.remove(C)}, undoing {@code T2}'s work
     * <li> the previous actions of {@code T2} are repeated several times
     * <li> also, the relevant computed values change over time: {@code V1}, {@code V2}, ...
     * <li>...meanwhile, {@code T} wakes up and attempts to install {@code V0}; <em>this must fail</em>
     * </ul>
     * We can assume in the above scenario that {@code CV.computeValue} uses locks to properly
     * observe the time-dependent states as it computes {@code V1}, etc.
     * This does not remove the threat of a stale value, since there is a window of time
     * between the return of {@code computeValue} in {@code T} and the installation
     * of the the new value.  No user synchronization is possible during this time.
     *
     * @param type the type whose class value must be removed
     * @throws NullPointerException if the argument is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public T get(Class<?> type) {

    /**
     * Returns the value for the given class.
     * If no value has yet been computed, it is obtained by
     * an invocation of the {@link #computeValue computeValue} method.
     * <p>
     * The actual installation of the value on the class
     * is performed atomically.
     * At that point, if several racing threads have
     * computed values, one is chosen, and returned to
     * all the racing threads.
     * <p>
     * The {@code type} parameter is typically a class, but it may be any type,
     * such as an interface, a primitive type (like {@code int.class}), or {@code void.class}.
     * <p>
     * In the absence of {@code remove} calls, a class value has a simple
     * state diagram:  uninitialized and initialized.
     * When {@code remove} calls are made,
     * the rules for value observation are more complex.
     * See the documentation for {@link #remove remove} for more information.
     *
     * @param type the type whose class value must be computed or retrieved
     * @return the current value associated with this {@code ClassValue}, for the given class or interface
     * @throws NullPointerException if the argument is null
     * @see #remove
     * @see #computeValue
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected abstract T computeValue(Class<?> type);

    /**
     * Computes the given class's derived value for this {@code ClassValue}.
     * <p>
     * This method will be invoked within the first thread that accesses
     * the value with the {@link #get get} method.
     * <p>
     * Normally, this method is invoked at most once per class,
     * but it may be invoked again if there has been a call to
     * {@link #remove remove}.
     * <p>
     * If this method throws an exception, the corresponding call to {@code get}
     * will terminate abnormally with that exception, and no class value will be recorded.
     *
     * @param type the type whose class value must be computed
     * @return the newly computed value associated with this {@code ClassValue}, for the given class or interface
     * @see #get
     * @see #remove
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected ClassValue() {

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
public abstract class ClassValue<T> {

/**
 * Lazily associate a computed value with (potentially) every type.
 * For example, if a dynamic language needs to construct a message dispatch
 * table for each class encountered at a message send call site,
 * it can use a {@code ClassValue} to cache information needed to
 * perform the message send quickly, for each class encountered.
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int PROBE_LIMIT      =  6;       // 1..

        /** Maximum number of probes to attempt. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int CACHE_LOAD_LIMIT = 67;  // 0..100

        /** Percent loading of cache before resize. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> Entry<T> overwrittenEntry(Entry<T> e2) {

        /** Note an entry that is about to be overwritten.
         *  If it is not live, quietly replace it by null.
         *  If it is an actual null, increment cacheLoad,
         *  because the caller is going to store something
         *  in its place.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> placeInCache(Entry<?>[] cache, int pos, Entry<?> e, boolean gently) {

        /** Store the given entry.  Update cacheLoad, and return any live victim.
         *  'Gently' means return self rather than dislocating a live victim.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(ClassValue<T> classValue, Entry<T> e) {

        /** Add the given entry to the cache, in its home location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(Entry<T> e) {

        /** Add the given entry to the cache, in its home location, unless it is out of date. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries() {

        /** Remove all stale entries, everywhere. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(ClassValue<?> classValue) {

        /** Remove stale entries in the range near classValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> findReplacement(Entry<?>[] cache, int home1) {

        /** Clearing a cache slot risks disconnecting following entries
         *  from the head of a non-null run, which would allow them
         *  to be found via reprobes.  Find an entry after cache[begin]
         *  to plug into the hole, or return null if none is needed.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(Entry<?>[] cache, int begin, int count) {

        /** Remove stale entries in the given range.
         *  Should be executed under a Map lock.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void checkCacheLoad() {

        /** Make sure the cache load stays below its limit, if possible. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void sizeCache(int length) {

        /// --------
        /// Below this line all functions are private, and assume synchronized access.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static int entryDislocation(Entry<?>[] cache, int pos, Entry<?> e) {

        /** How far out of place is e? */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeBackupLocations(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Given that first probe was a collision, retry at nearby locations. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeHomeLocation(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Look in the cache, at the home location for the given ClassValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static Entry<?> loadFromCache(Entry<?>[] cache, int i) {

        /** Load the cache entry at the given (hashed) location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        // Statics do not need synchronization.

        /// --------
        /// Cache management.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Change the value for an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Remove an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Finish a query.  Overwrite a matching placeholder.  Drop stale incoming values. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Initiate a query.  Store a promise (placeholder) if there is no value yet. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        ClassValueMap(Class<?> type) {

        /** Build a backing map for ClassValues, relative the given type.
         *  Also, create an empty cache array and install it on the class.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int INITIAL_ENTRIES = 32;

        /** Number of entries initially allocated to each type when first used with any ClassValue.
         *  It would be pointless to make this much smaller than the Class and ClassValueMap objects themselves.
         *  Must be a power of 2.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class ClassValueMap extends WeakHashMap<ClassValue.Identity, Entry<?>> {

    /** A backing map for all ClassValues, relative a single given type.
     *  Gives a fully serialized "true state" for each pair (ClassValue cv, Class type).
     *  Also manages an unserialized fast-path cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static ClassValueMap getMap(Class<?> type) {

    /** Return the backing map associated with this type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        @SuppressWarnings("unchecked")  // if !isPromise, type is T

        /** Fetch the value.  This entry must not be a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        Entry(Version<T> version) {

        /** For creating a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Entry<T> extends WeakReference<Version<T>> {

    /** One binding of a value to a class via a ClassValue.
     *  States are:<ul>
     *  <li> promise if value == Entry.this
     *  <li> else dead if version == null
     *  <li> else stale if version != classValue.version
     *  <li> else live </ul>
     *  Promises are never put into the cache; they only live in the
     *  backing map while a computeValue call is in flight.
     *  Once an entry goes stale, it can be reset at any time
     *  into the dead state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private volatile Version<T> version = new Version<>(this);

    /**
     * Current version for retrieving this class value from the cache.
     * Any number of computeValue calls can be cached in association with one version.
     * But the version changes when a remove (on any type) is executed.
     * A version change invalidates all cache entries for the affected ClassValue,
     * by marking them as stale.  Stale cache entries do not force another call
     * to computeValue, but they do require a synchronized visit to a backing map.
     * <p>
     * All user-visible state changes on the ClassValue take place under
     * a lock inside the synchronized methods of ClassValueMap.
     * Readers (of ClassValue.get) are notified of such state changes
     * when this.version is bumped to a new token.
     * This variable must be volatile so that an unsynchronized reader
     * will receive the notification without delay.
     * <p>
     * If version were not volatile, one thread T1 could persistently hold onto
     * a stale value this.value == V1, while while another thread T2 advances
     * (under a lock) to this.value == V2.  This will typically be harmless,
     * but if T1 and T2 interact causally via some other channel, such that
     * T1's further actions are constrained (in the JMM) to happen after
     * the V2 event, then T1's observation of V1 will be an error.
     * <p>
     * The practical effect of making this.version be volatile is that it cannot
     * be hoisted out of a loop (by an optimizing JIT) or otherwise cached.
     * Some machines may also require a barrier instruction to execute
     * before this.version.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final Identity identity = new Identity();

    /**
     * This ClassValue's identity, expressed as an opaque object.
     * The main object {@code ClassValue.this} is incorrect since
     * subclasses may override {@code ClassValue.equals}, which
     * could confuse keys in the ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Identity {

    /**
     * Private key for retrieval of this object from ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static final int HASH_MASK = (-1 >>> 2);

    /** Mask a hash code to be positive but not too large, to prevent wraparound. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final int HASH_INCREMENT = 0x61c88647;

    /** Good for power-of-two tables.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final AtomicInteger nextHashCode = new AtomicInteger();

    /** Value stream for hashCodeForCache.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final int hashCodeForCache = nextHashCode.getAndAdd(HASH_INCREMENT) & HASH_MASK;

    /** Internal hash code for accessing Class.classValueMap.cacheArray. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    boolean match(Entry<?> e) {

    /** Check that e is non-null, matches this ClassValue, and is live. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromHashMap(Class<?> type) {

    /** Called when the fast path of get fails, and cache reprobe also fails.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromBackup(Entry<?>[] cache, Class<?> type) {

    /**
     * Slow tail of ClassValue.get to retry at nearby locations in the cache,
     * or take a slow lock and check the hash table.
     * Called only if the first probe was empty or a collision.
     * This is a separate method, so compilers can process it independently.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final Entry<?>[] EMPTY_CACHE = { null };

    /** Initial, one-element, empty cache used by all Class instances.  Must never be filled. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    /** Return the cache, if it exists, else a dummy empty cache. */

    /// --------
    /// Implementation...
    /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public void remove(Class<?> type) {

    /**
     * Removes the associated value for the given class.
     * If this value is subsequently {@linkplain #get read} for the same class,
     * its value will be reinitialized by invoking its {@link #computeValue computeValue} method.
     * This may result in an additional invocation of the
     * {@code computeValue} method for the given class.
     * <p>
     * In order to explain the interaction between {@code get} and {@code remove} calls,
     * we must model the state transitions of a class value to take into account
     * the alternation between uninitialized and initialized states.
     * To do this, number these states sequentially from zero, and note that
     * uninitialized (or removed) states are numbered with even numbers,
     * while initialized (or re-initialized) states have odd numbers.
     * <p>
     * When a thread {@code T} removes a class value in state {@code 2N},
     * nothing happens, since the class value is already uninitialized.
     * Otherwise, the state is advanced atomically to {@code 2N+1}.
     * <p>
     * When a thread {@code T} queries a class value in state {@code 2N},
     * the thread first attempts to initialize the class value to state {@code 2N+1}
     * by invoking {@code computeValue} and installing the resulting value.
     * <p>
     * When {@code T} attempts to install the newly computed value,
     * if the state is still at {@code 2N}, the class value will be initialized
     * with the computed value, advancing it to state {@code 2N+1}.
     * <p>
     * Otherwise, whether the new state is even or odd,
     * {@code T} will discard the newly computed value
     * and retry the {@code get} operation.
     * <p>
     * Discarding and retrying is an important proviso,
     * since otherwise {@code T} could potentially install
     * a disastrously stale value.  For example:
     * <ul>
     * <li>{@code T} calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T} quickly computes a time-dependent value {@code V0} and gets ready to install it
     * <li>{@code T} is hit by an unlucky paging or scheduling event, and goes to sleep for a long time
     * <li>...meanwhile, {@code T2} also calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T2} quickly computes a similar time-dependent value {@code V1} and installs it on {@code CV.get(C)}
     * <li>{@code T2} (or a third thread) then calls {@code CV.remove(C)}, undoing {@code T2}'s work
     * <li> the previous actions of {@code T2} are repeated several times
     * <li> also, the relevant computed values change over time: {@code V1}, {@code V2}, ...
     * <li>...meanwhile, {@code T} wakes up and attempts to install {@code V0}; <em>this must fail</em>
     * </ul>
     * We can assume in the above scenario that {@code CV.computeValue} uses locks to properly
     * observe the time-dependent states as it computes {@code V1}, etc.
     * This does not remove the threat of a stale value, since there is a window of time
     * between the return of {@code computeValue} in {@code T} and the installation
     * of the the new value.  No user synchronization is possible during this time.
     *
     * @param type the type whose class value must be removed
     * @throws NullPointerException if the argument is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public T get(Class<?> type) {

    /**
     * Returns the value for the given class.
     * If no value has yet been computed, it is obtained by
     * an invocation of the {@link #computeValue computeValue} method.
     * <p>
     * The actual installation of the value on the class
     * is performed atomically.
     * At that point, if several racing threads have
     * computed values, one is chosen, and returned to
     * all the racing threads.
     * <p>
     * The {@code type} parameter is typically a class, but it may be any type,
     * such as an interface, a primitive type (like {@code int.class}), or {@code void.class}.
     * <p>
     * In the absence of {@code remove} calls, a class value has a simple
     * state diagram:  uninitialized and initialized.
     * When {@code remove} calls are made,
     * the rules for value observation are more complex.
     * See the documentation for {@link #remove remove} for more information.
     *
     * @param type the type whose class value must be computed or retrieved
     * @return the current value associated with this {@code ClassValue}, for the given class or interface
     * @throws NullPointerException if the argument is null
     * @see #remove
     * @see #computeValue
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected abstract T computeValue(Class<?> type);

    /**
     * Computes the given class's derived value for this {@code ClassValue}.
     * <p>
     * This method will be invoked within the first thread that accesses
     * the value with the {@link #get get} method.
     * <p>
     * Normally, this method is invoked at most once per class,
     * but it may be invoked again if there has been a call to
     * {@link #remove remove}.
     * <p>
     * If this method throws an exception, the corresponding call to {@code get}
     * will terminate abnormally with that exception, and no class value will be recorded.
     *
     * @param type the type whose class value must be computed
     * @return the newly computed value associated with this {@code ClassValue}, for the given class or interface
     * @see #get
     * @see #remove
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected ClassValue() {

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
public abstract class ClassValue<T> {

/**
 * Lazily associate a computed value with (potentially) every type.
 * For example, if a dynamic language needs to construct a message dispatch
 * table for each class encountered at a message send call site,
 * it can use a {@code ClassValue} to cache information needed to
 * perform the message send quickly, for each class encountered.
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int PROBE_LIMIT      =  6;       // 1..

        /** Maximum number of probes to attempt. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int CACHE_LOAD_LIMIT = 67;  // 0..100

        /** Percent loading of cache before resize. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> Entry<T> overwrittenEntry(Entry<T> e2) {

        /** Note an entry that is about to be overwritten.
         *  If it is not live, quietly replace it by null.
         *  If it is an actual null, increment cacheLoad,
         *  because the caller is going to store something
         *  in its place.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> placeInCache(Entry<?>[] cache, int pos, Entry<?> e, boolean gently) {

        /** Store the given entry.  Update cacheLoad, and return any live victim.
         *  'Gently' means return self rather than dislocating a live victim.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(ClassValue<T> classValue, Entry<T> e) {

        /** Add the given entry to the cache, in its home location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private <T> void addToCache(Entry<T> e) {

        /** Add the given entry to the cache, in its home location, unless it is out of date. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries() {

        /** Remove all stale entries, everywhere. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(ClassValue<?> classValue) {

        /** Remove stale entries in the range near classValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private Entry<?> findReplacement(Entry<?>[] cache, int home1) {

        /** Clearing a cache slot risks disconnecting following entries
         *  from the head of a non-null run, which would allow them
         *  to be found via reprobes.  Find an entry after cache[begin]
         *  to plug into the hole, or return null if none is needed.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void removeStaleEntries(Entry<?>[] cache, int begin, int count) {

        /** Remove stale entries in the given range.
         *  Should be executed under a Map lock.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void checkCacheLoad() {

        /** Make sure the cache load stays below its limit, if possible. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private void sizeCache(int length) {

        /// --------
        /// Below this line all functions are private, and assume synchronized access.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static int entryDislocation(Entry<?>[] cache, int pos, Entry<?> e) {

        /** How far out of place is e? */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeBackupLocations(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Given that first probe was a collision, retry at nearby locations. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static <T> Entry<T> probeHomeLocation(Entry<?>[] cache, ClassValue<T> classValue) {

        /** Look in the cache, at the home location for the given ClassValue. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        static Entry<?> loadFromCache(Entry<?>[] cache, int i) {

        /** Load the cache entry at the given (hashed) location. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        // Statics do not need synchronization.

        /// --------
        /// Cache management.
        /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Change the value for an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Remove an entry. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Finish a query.  Overwrite a matching placeholder.  Drop stale incoming values. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        synchronized

        /** Initiate a query.  Store a promise (placeholder) if there is no value yet. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        ClassValueMap(Class<?> type) {

        /** Build a backing map for ClassValues, relative the given type.
         *  Also, create an empty cache array and install it on the class.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        private static final int INITIAL_ENTRIES = 32;

        /** Number of entries initially allocated to each type when first used with any ClassValue.
         *  It would be pointless to make this much smaller than the Class and ClassValueMap objects themselves.
         *  Must be a power of 2.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class ClassValueMap extends WeakHashMap<ClassValue.Identity, Entry<?>> {

    /** A backing map for all ClassValues, relative a single given type.
     *  Gives a fully serialized "true state" for each pair (ClassValue cv, Class type).
     *  Also manages an unserialized fast-path cache.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static ClassValueMap getMap(Class<?> type) {

    /** Return the backing map associated with this type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        @SuppressWarnings("unchecked")  // if !isPromise, type is T

        /** Fetch the value.  This entry must not be a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
        Entry(Version<T> version) {

        /** For creating a promise. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Entry<T> extends WeakReference<Version<T>> {

    /** One binding of a value to a class via a ClassValue.
     *  States are:<ul>
     *  <li> promise if value == Entry.this
     *  <li> else dead if version == null
     *  <li> else stale if version != classValue.version
     *  <li> else live </ul>
     *  Promises are never put into the cache; they only live in the
     *  backing map while a computeValue call is in flight.
     *  Once an entry goes stale, it can be reset at any time
     *  into the dead state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private volatile Version<T> version = new Version<>(this);

    /**
     * Current version for retrieving this class value from the cache.
     * Any number of computeValue calls can be cached in association with one version.
     * But the version changes when a remove (on any type) is executed.
     * A version change invalidates all cache entries for the affected ClassValue,
     * by marking them as stale.  Stale cache entries do not force another call
     * to computeValue, but they do require a synchronized visit to a backing map.
     * <p>
     * All user-visible state changes on the ClassValue take place under
     * a lock inside the synchronized methods of ClassValueMap.
     * Readers (of ClassValue.get) are notified of such state changes
     * when this.version is bumped to a new token.
     * This variable must be volatile so that an unsynchronized reader
     * will receive the notification without delay.
     * <p>
     * If version were not volatile, one thread T1 could persistently hold onto
     * a stale value this.value == V1, while while another thread T2 advances
     * (under a lock) to this.value == V2.  This will typically be harmless,
     * but if T1 and T2 interact causally via some other channel, such that
     * T1's further actions are constrained (in the JMM) to happen after
     * the V2 event, then T1's observation of V1 will be an error.
     * <p>
     * The practical effect of making this.version be volatile is that it cannot
     * be hoisted out of a loop (by an optimizing JIT) or otherwise cached.
     * Some machines may also require a barrier instruction to execute
     * before this.version.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final Identity identity = new Identity();

    /**
     * This ClassValue's identity, expressed as an opaque object.
     * The main object {@code ClassValue.this} is incorrect since
     * subclasses may override {@code ClassValue.equals}, which
     * could confuse keys in the ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static class Identity {

    /**
     * Private key for retrieval of this object from ClassValueMap.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    static final int HASH_MASK = (-1 >>> 2);

    /** Mask a hash code to be positive but not too large, to prevent wraparound. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final int HASH_INCREMENT = 0x61c88647;

    /** Good for power-of-two tables.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final AtomicInteger nextHashCode = new AtomicInteger();

    /** Value stream for hashCodeForCache.  See similar structure in ThreadLocal. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    final int hashCodeForCache = nextHashCode.getAndAdd(HASH_INCREMENT) & HASH_MASK;

    /** Internal hash code for accessing Class.classValueMap.cacheArray. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    boolean match(Entry<?> e) {

    /** Check that e is non-null, matches this ClassValue, and is live. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromHashMap(Class<?> type) {

    /** Called when the fast path of get fails, and cache reprobe also fails.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private T getFromBackup(Entry<?>[] cache, Class<?> type) {

    /**
     * Slow tail of ClassValue.get to retry at nearby locations in the cache,
     * or take a slow lock and check the hash table.
     * Called only if the first probe was empty or a collision.
     * This is a separate method, so compilers can process it independently.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    private static final Entry<?>[] EMPTY_CACHE = { null };

    /** Initial, one-element, empty cache used by all Class instances.  Must never be filled. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    /** Return the cache, if it exists, else a dummy empty cache. */

    /// --------
    /// Implementation...
    /// --------
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public void remove(Class<?> type) {

    /**
     * Removes the associated value for the given class.
     * If this value is subsequently {@linkplain #get read} for the same class,
     * its value will be reinitialized by invoking its {@link #computeValue computeValue} method.
     * This may result in an additional invocation of the
     * {@code computeValue} method for the given class.
     * <p>
     * In order to explain the interaction between {@code get} and {@code remove} calls,
     * we must model the state transitions of a class value to take into account
     * the alternation between uninitialized and initialized states.
     * To do this, number these states sequentially from zero, and note that
     * uninitialized (or removed) states are numbered with even numbers,
     * while initialized (or re-initialized) states have odd numbers.
     * <p>
     * When a thread {@code T} removes a class value in state {@code 2N},
     * nothing happens, since the class value is already uninitialized.
     * Otherwise, the state is advanced atomically to {@code 2N+1}.
     * <p>
     * When a thread {@code T} queries a class value in state {@code 2N},
     * the thread first attempts to initialize the class value to state {@code 2N+1}
     * by invoking {@code computeValue} and installing the resulting value.
     * <p>
     * When {@code T} attempts to install the newly computed value,
     * if the state is still at {@code 2N}, the class value will be initialized
     * with the computed value, advancing it to state {@code 2N+1}.
     * <p>
     * Otherwise, whether the new state is even or odd,
     * {@code T} will discard the newly computed value
     * and retry the {@code get} operation.
     * <p>
     * Discarding and retrying is an important proviso,
     * since otherwise {@code T} could potentially install
     * a disastrously stale value.  For example:
     * <ul>
     * <li>{@code T} calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T} quickly computes a time-dependent value {@code V0} and gets ready to install it
     * <li>{@code T} is hit by an unlucky paging or scheduling event, and goes to sleep for a long time
     * <li>...meanwhile, {@code T2} also calls {@code CV.get(C)} and sees state {@code 2N}
     * <li>{@code T2} quickly computes a similar time-dependent value {@code V1} and installs it on {@code CV.get(C)}
     * <li>{@code T2} (or a third thread) then calls {@code CV.remove(C)}, undoing {@code T2}'s work
     * <li> the previous actions of {@code T2} are repeated several times
     * <li> also, the relevant computed values change over time: {@code V1}, {@code V2}, ...
     * <li>...meanwhile, {@code T} wakes up and attempts to install {@code V0}; <em>this must fail</em>
     * </ul>
     * We can assume in the above scenario that {@code CV.computeValue} uses locks to properly
     * observe the time-dependent states as it computes {@code V1}, etc.
     * This does not remove the threat of a stale value, since there is a window of time
     * between the return of {@code computeValue} in {@code T} and the installation
     * of the the new value.  No user synchronization is possible during this time.
     *
     * @param type the type whose class value must be removed
     * @throws NullPointerException if the argument is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    public T get(Class<?> type) {

    /**
     * Returns the value for the given class.
     * If no value has yet been computed, it is obtained by
     * an invocation of the {@link #computeValue computeValue} method.
     * <p>
     * The actual installation of the value on the class
     * is performed atomically.
     * At that point, if several racing threads have
     * computed values, one is chosen, and returned to
     * all the racing threads.
     * <p>
     * The {@code type} parameter is typically a class, but it may be any type,
     * such as an interface, a primitive type (like {@code int.class}), or {@code void.class}.
     * <p>
     * In the absence of {@code remove} calls, a class value has a simple
     * state diagram:  uninitialized and initialized.
     * When {@code remove} calls are made,
     * the rules for value observation are more complex.
     * See the documentation for {@link #remove remove} for more information.
     *
     * @param type the type whose class value must be computed or retrieved
     * @return the current value associated with this {@code ClassValue}, for the given class or interface
     * @throws NullPointerException if the argument is null
     * @see #remove
     * @see #computeValue
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected abstract T computeValue(Class<?> type);

    /**
     * Computes the given class's derived value for this {@code ClassValue}.
     * <p>
     * This method will be invoked within the first thread that accesses
     * the value with the {@link #get get} method.
     * <p>
     * Normally, this method is invoked at most once per class,
     * but it may be invoked again if there has been a call to
     * {@link #remove remove}.
     * <p>
     * If this method throws an exception, the corresponding call to {@code get}
     * will terminate abnormally with that exception, and no class value will be recorded.
     *
     * @param type the type whose class value must be computed
     * @return the newly computed value associated with this {@code ClassValue}, for the given class or interface
     * @see #get
     * @see #remove
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
    protected ClassValue() {

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//ClassValue.java
public abstract class ClassValue<T> {

/**
 * Lazily associate a computed value with (potentially) every type.
 * For example, if a dynamic language needs to construct a message dispatch
 * table for each class encountered at a message send call site,
 * it can use a {@code ClassValue} to cache information needed to
 * perform the message send quickly, for each class encountered.
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
