_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes the instance from a stream (that is, deserializes it).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public String toString() {

    /**
     * Returns the String representation of the current values of array.
     * @return the String representation of the current values of array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final E accumulateAndGet(int i, E x,
                                    BinaryOperator<E> accumulatorFunction) {

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final E getAndAccumulate(int i, E x,
                                    BinaryOperator<E> accumulatorFunction) {

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final E updateAndGet(int i, UnaryOperator<E> updateFunction) {

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final E getAndUpdate(int i, UnaryOperator<E> updateFunction) {

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final boolean weakCompareAndSet(int i, E expect, E update) {

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final boolean compareAndSet(int i, E expect, E update) {

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    @SuppressWarnings("unchecked")

    /**
     * Atomically sets the element at position {@code i} to the given
     * value and returns the old value.
     *
     * @param i the index
     * @param newValue the new value
     * @return the previous value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final void lazySet(int i, E newValue) {

    /**
     * Eventually sets the element at position {@code i} to the given value.
     *
     * @param i the index
     * @param newValue the new value
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final void set(int i, E newValue) {

    /**
     * Sets the element at position {@code i} to the given value.
     *
     * @param i the index
     * @param newValue the new value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final E get(int i) {

    /**
     * Gets the current value at position {@code i}.
     *
     * @param i the index
     * @return the current value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public final int length() {

    /**
     * Returns the length of the array.
     *
     * @return the length of the array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public AtomicReferenceArray(E[] array) {

    /**
     * Creates a new AtomicReferenceArray with the same length as, and
     * all elements copied from, the given array.
     *
     * @param array the array to copy elements from
     * @throws NullPointerException if array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
    public AtomicReferenceArray(int length) {

    /**
     * Creates a new AtomicReferenceArray of the given length, with all
     * elements initially null.
     *
     * @param length the length of the array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/AtomicReferenceArray.java
public class AtomicReferenceArray<E> implements java.io.Serializable {

/**
 * An array of object references in which elements may be updated
 * atomically.  See the {@link java.util.concurrent.atomic} package
 * specification for description of the properties of atomic
 * variables.
 * @since 1.5
 * @author Doug Lea
 * @param <E> The base class of elements held in this array
 */
