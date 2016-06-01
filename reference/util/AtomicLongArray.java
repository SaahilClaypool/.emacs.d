_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public String toString() {

    /**
     * Returns the String representation of the current values of array.
     * @return the String representation of the current values of array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long accumulateAndGet(int i, long x,
                                      LongBinaryOperator accumulatorFunction) {

    /**
     * Atomically updates the element at index {@code i} with the
     * results of applying the given function to the current and
     * given values, returning the updated value. The function should
     * be side-effect-free, since it may be re-applied when attempted
     * updates fail due to contention among threads.  The function is
     * applied with the current value at index {@code i} as its first
     * argument, and the given update as the second argument.
     *
     * @param i the index
     * @param x the update value
     * @param accumulatorFunction a side-effect-free function of two arguments
     * @return the updated value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long getAndAccumulate(int i, long x,
                                      LongBinaryOperator accumulatorFunction) {

    /**
     * Atomically updates the element at index {@code i} with the
     * results of applying the given function to the current and
     * given values, returning the previous value. The function should
     * be side-effect-free, since it may be re-applied when attempted
     * updates fail due to contention among threads.  The function is
     * applied with the current value at index {@code i} as its first
     * argument, and the given update as the second argument.
     *
     * @param i the index
     * @param x the update value
     * @param accumulatorFunction a side-effect-free function of two arguments
     * @return the previous value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long updateAndGet(int i, LongUnaryOperator updateFunction) {

    /**
     * Atomically updates the element at index {@code i} with the results
     * of applying the given function, returning the updated value. The
     * function should be side-effect-free, since it may be re-applied
     * when attempted updates fail due to contention among threads.
     *
     * @param i the index
     * @param updateFunction a side-effect-free function
     * @return the updated value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long getAndUpdate(int i, LongUnaryOperator updateFunction) {

    /**
     * Atomically updates the element at index {@code i} with the results
     * of applying the given function, returning the previous value. The
     * function should be side-effect-free, since it may be re-applied
     * when attempted updates fail due to contention among threads.
     *
     * @param i the index
     * @param updateFunction a side-effect-free function
     * @return the previous value
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public long addAndGet(int i, long delta) {

    /**
     * Atomically adds the given value to the element at index {@code i}.
     *
     * @param i the index
     * @param delta the value to add
     * @return the updated value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long decrementAndGet(int i) {

    /**
     * Atomically decrements by one the element at index {@code i}.
     *
     * @param i the index
     * @return the updated value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long incrementAndGet(int i) {

    /**
     * Atomically increments by one the element at index {@code i}.
     *
     * @param i the index
     * @return the updated value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long getAndAdd(int i, long delta) {

    /**
     * Atomically adds the given value to the element at index {@code i}.
     *
     * @param i the index
     * @param delta the value to add
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long getAndDecrement(int i) {

    /**
     * Atomically decrements by one the element at index {@code i}.
     *
     * @param i the index
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long getAndIncrement(int i) {

    /**
     * Atomically increments by one the element at index {@code i}.
     *
     * @param i the index
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final boolean weakCompareAndSet(int i, long expect, long update) {

    /**
     * Atomically sets the element at position {@code i} to the given
     * updated value if the current value {@code ==} the expected value.
     *
     * <p><a href="package-summary.html#weakCompareAndSet">May fail
     * spuriously and does not provide ordering guarantees</a>, so is
     * only rarely an appropriate alternative to {@code compareAndSet}.
     *
     * @param i the index
     * @param expect the expected value
     * @param update the new value
     * @return {@code true} if successful
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final boolean compareAndSet(int i, long expect, long update) {

    /**
     * Atomically sets the element at position {@code i} to the given
     * updated value if the current value {@code ==} the expected value.
     *
     * @param i the index
     * @param expect the expected value
     * @param update the new value
     * @return {@code true} if successful. False return indicates that
     * the actual value was not equal to the expected value.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long getAndSet(int i, long newValue) {

    /**
     * Atomically sets the element at position {@code i} to the given value
     * and returns the old value.
     *
     * @param i the index
     * @param newValue the new value
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final void lazySet(int i, long newValue) {

    /**
     * Eventually sets the element at position {@code i} to the given value.
     *
     * @param i the index
     * @param newValue the new value
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final void set(int i, long newValue) {

    /**
     * Sets the element at position {@code i} to the given value.
     *
     * @param i the index
     * @param newValue the new value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final long get(int i) {

    /**
     * Gets the current value at position {@code i}.
     *
     * @param i the index
     * @return the current value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public final int length() {

    /**
     * Returns the length of the array.
     *
     * @return the length of the array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public AtomicLongArray(long[] array) {

    /**
     * Creates a new AtomicLongArray with the same length as, and
     * all elements copied from, the given array.
     *
     * @param array the array to copy elements from
     * @throws NullPointerException if array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
    public AtomicLongArray(int length) {

    /**
     * Creates a new AtomicLongArray of the given length, with all
     * elements initially zero.
     *
     * @param length the length of the array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicLongArray.java
public class AtomicLongArray implements java.io.Serializable {

/**
 * A {@code long} array in which elements may be updated atomically.
 * See the {@link java.util.concurrent.atomic} package specification
 * for description of the properties of atomic variables.
 * @since 1.5
 * @author Doug Lea
 */
