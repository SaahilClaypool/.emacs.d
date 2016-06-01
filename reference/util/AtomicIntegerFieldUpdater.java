_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
        private static boolean isAncestor(ClassLoader first, ClassLoader second) {

        /**
         * Returns true if the second classloader can be found in the first
         * classloader's delegation chain.
         * Equivalent to the inaccessible: first.isAncestor(second).
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    private static class AtomicIntegerFieldUpdaterImpl<T>

    /**
     * Standard hotspot implementation using intrinsics
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public final int accumulateAndGet(T obj, int x,
                                      IntBinaryOperator accumulatorFunction) {

    /**
     * Atomically updates the field of the given object managed by this
     * updater with the results of applying the given function to the
     * current and given values, returning the updated value. The
     * function should be side-effect-free, since it may be re-applied
     * when attempted updates fail due to contention among threads.  The
     * function is applied with the current value as its first argument,
     * and the given update as the second argument.
     *
     * @param obj An object whose field to get and set
     * @param x the update value
     * @param accumulatorFunction a side-effect-free function of two arguments
     * @return the updated value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public final int getAndAccumulate(T obj, int x,
                                      IntBinaryOperator accumulatorFunction) {

    /**
     * Atomically updates the field of the given object managed by this
     * updater with the results of applying the given function to the
     * current and given values, returning the previous value. The
     * function should be side-effect-free, since it may be re-applied
     * when attempted updates fail due to contention among threads.  The
     * function is applied with the current value as its first argument,
     * and the given update as the second argument.
     *
     * @param obj An object whose field to get and set
     * @param x the update value
     * @param accumulatorFunction a side-effect-free function of two arguments
     * @return the previous value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public final int updateAndGet(T obj, IntUnaryOperator updateFunction) {

    /**
     * Atomically updates the field of the given object managed by this updater
     * with the results of applying the given function, returning the updated
     * value. The function should be side-effect-free, since it may be
     * re-applied when attempted updates fail due to contention among threads.
     *
     * @param obj An object whose field to get and set
     * @param updateFunction a side-effect-free function
     * @return the updated value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public final int getAndUpdate(T obj, IntUnaryOperator updateFunction) {

    /**
     * Atomically updates the field of the given object managed by this updater
     * with the results of applying the given function, returning the previous
     * value. The function should be side-effect-free, since it may be
     * re-applied when attempted updates fail due to contention among threads.
     *
     * @param obj An object whose field to get and set
     * @param updateFunction a side-effect-free function
     * @return the previous value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public int addAndGet(T obj, int delta) {

    /**
     * Atomically adds the given value to the current value of the field of
     * the given object managed by this updater.
     *
     * @param obj An object whose field to get and set
     * @param delta the value to add
     * @return the updated value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public int decrementAndGet(T obj) {

    /**
     * Atomically decrements by one the current value of the field of the
     * given object managed by this updater.
     *
     * @param obj An object whose field to get and set
     * @return the updated value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public int incrementAndGet(T obj) {

    /**
     * Atomically increments by one the current value of the field of the
     * given object managed by this updater.
     *
     * @param obj An object whose field to get and set
     * @return the updated value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public int getAndAdd(T obj, int delta) {

    /**
     * Atomically adds the given value to the current value of the field of
     * the given object managed by this updater.
     *
     * @param obj An object whose field to get and set
     * @param delta the value to add
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public int getAndDecrement(T obj) {

    /**
     * Atomically decrements by one the current value of the field of the
     * given object managed by this updater.
     *
     * @param obj An object whose field to get and set
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public int getAndIncrement(T obj) {

    /**
     * Atomically increments by one the current value of the field of the
     * given object managed by this updater.
     *
     * @param obj An object whose field to get and set
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public int getAndSet(T obj, int newValue) {

    /**
     * Atomically sets the field of the given object managed by this updater
     * to the given value and returns the old value.
     *
     * @param obj An object whose field to get and set
     * @param newValue the new value
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public abstract int get(T obj);

    /**
     * Gets the current value held in the field of the given object managed
     * by this updater.
     *
     * @param obj An object whose field to get
     * @return the current value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public abstract void lazySet(T obj, int newValue);

    /**
     * Eventually sets the field of the given object managed by this
     * updater to the given updated value.
     *
     * @param obj An object whose field to set
     * @param newValue the new value
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public abstract void set(T obj, int newValue);

    /**
     * Sets the field of the given object managed by this updater to the
     * given updated value. This operation is guaranteed to act as a volatile
     * store with respect to subsequent invocations of {@code compareAndSet}.
     *
     * @param obj An object whose field to set
     * @param newValue the new value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public abstract boolean weakCompareAndSet(T obj, int expect, int update);

    /**
     * Atomically sets the field of the given object managed by this updater
     * to the given updated value if the current value {@code ==} the
     * expected value. This method is guaranteed to be atomic with respect to
     * other calls to {@code compareAndSet} and {@code set}, but not
     * necessarily with respect to other changes in the field.
     *
     * <p><a href="package-summary.html#weakCompareAndSet">May fail
     * spuriously and does not provide ordering guarantees</a>, so is
     * only rarely an appropriate alternative to {@code compareAndSet}.
     *
     * @param obj An object whose field to conditionally set
     * @param expect the expected value
     * @param update the new value
     * @return {@code true} if successful
     * @throws ClassCastException if {@code obj} is not an instance
     * of the class possessing the field established in the constructor
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    public abstract boolean compareAndSet(T obj, int expect, int update);

    /**
     * Atomically sets the field of the given object managed by this updater
     * to the given updated value if the current value {@code ==} the
     * expected value. This method is guaranteed to be atomic with respect to
     * other calls to {@code compareAndSet} and {@code set}, but not
     * necessarily with respect to other changes in the field.
     *
     * @param obj An object whose field to conditionally set
     * @param expect the expected value
     * @param update the new value
     * @return {@code true} if successful
     * @throws ClassCastException if {@code obj} is not an instance
     * of the class possessing the field established in the constructor
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    protected AtomicIntegerFieldUpdater() {

    /**
     * Protected do-nothing constructor for use by subclasses.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
    @CallerSensitive

    /**
     * Creates and returns an updater for objects with the given field.
     * The Class argument is needed to check that reflective types and
     * generic types match.
     *
     * @param tclass the class of the objects holding the field
     * @param fieldName the name of the field to be updated
     * @param <U> the type of instances of tclass
     * @return the updater
     * @throws IllegalArgumentException if the field is not a
     * volatile integer type
     * @throws RuntimeException with a nested reflection-based
     * exception if the class does not hold field or is the wrong type,
     * or the field is inaccessible to the caller according to Java language
     * access control
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicIntegerFieldUpdater.java
public abstract class AtomicIntegerFieldUpdater<T> {

/**
 * A reflection-based utility that enables atomic updates to
 * designated {@code volatile int} fields of designated classes.
 * This class is designed for use in atomic data structures in which
 * several fields of the same node are independently subject to atomic
 * updates.
 *
 * <p>Note that the guarantees of the {@code compareAndSet}
 * method in this class are weaker than in other atomic classes.
 * Because this class cannot ensure that all uses of the field
 * are appropriate for purposes of atomic access, it can
 * guarantee atomicity only with respect to other invocations of
 * {@code compareAndSet} and {@code set} on the same updater.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <T> The type of the object holding the updatable field
 */
