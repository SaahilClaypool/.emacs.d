_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * @param s the stream
     * @throws java.io.InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    private Object writeReplace() {

    /**
     * Returns a
     * <a href="../../../../serialized-form.html#java.util.concurrent.atomic.LongAccumulator.SerializationProxy">
     * SerializationProxy</a>
     * representing the state of this instance.
     *
     * @return a {@link SerializationProxy}
     * representing the state of this instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
        private Object readResolve() {

        /**
         * Returns a {@code LongAccumulator} object with initial state
         * held by this proxy.
         *
         * @return a {@code LongAccumulator} object with initial state
         * held by this proxy.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
        private final long identity;

        /**
         * The identity value
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
        private final long value;

        /**
         * The current value returned by get().
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    private static class SerializationProxy implements Serializable {

    /**
     * Serialization proxy, used to avoid reference to the non-public
     * Striped64 superclass in serialized forms.
     * @serial include
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public double doubleValue() {

    /**
     * Returns the {@linkplain #get current value} as a {@code double}
     * after a widening primitive conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public float floatValue() {

    /**
     * Returns the {@linkplain #get current value} as a {@code float}
     * after a widening primitive conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public int intValue() {

    /**
     * Returns the {@linkplain #get current value} as an {@code int}
     * after a narrowing primitive conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public long longValue() {

    /**
     * Equivalent to {@link #get}.
     *
     * @return the current value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public String toString() {

    /**
     * Returns the String representation of the current value.
     * @return the String representation of the current value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public long getThenReset() {

    /**
     * Equivalent in effect to {@link #get} followed by {@link
     * #reset}. This method may apply for example during quiescent
     * points between multithreaded computations.  If there are
     * updates concurrent with this method, the returned value is
     * <em>not</em> guaranteed to be the final value occurring before
     * the reset.
     *
     * @return the value before reset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public void reset() {

    /**
     * Resets variables maintaining updates to the identity value.
     * This method may be a useful alternative to creating a new
     * updater, but is only effective if there are no concurrent
     * updates.  Because this method is intrinsically racy, it should
     * only be used when it is known that no threads are concurrently
     * updating.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public long get() {

    /**
     * Returns the current value.  The returned value is <em>NOT</em>
     * an atomic snapshot; invocation in the absence of concurrent
     * updates returns an accurate result, but concurrent updates that
     * occur while the value is being calculated might not be
     * incorporated.
     *
     * @return the current value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public void accumulate(long x) {

    /**
     * Updates with the given value.
     *
     * @param x the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
    public LongAccumulator(LongBinaryOperator accumulatorFunction,
                           long identity) {

    /**
     * Creates a new instance using the given accumulator function
     * and identity element.
     * @param accumulatorFunction a side-effect-free function of two arguments
     * @param identity identity (initial value) for the accumulator function
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/LongAccumulator.java
public class LongAccumulator extends Striped64 implements Serializable {

/**
 * One or more variables that together maintain a running {@code long}
 * value updated using a supplied function.  When updates (method
 * {@link #accumulate}) are contended across threads, the set of variables
 * may grow dynamically to reduce contention.  Method {@link #get}
 * (or, equivalently, {@link #longValue}) returns the current value
 * across the variables maintaining updates.
 *
 * <p>This class is usually preferable to {@link AtomicLong} when
 * multiple threads update a common value that is used for purposes such
 * as collecting statistics, not for fine-grained synchronization
 * control.  Under low update contention, the two classes have similar
 * characteristics. But under high contention, expected throughput of
 * this class is significantly higher, at the expense of higher space
 * consumption.
 *
 * <p>The order of accumulation within or across threads is not
 * guaranteed and cannot be depended upon, so this class is only
 * applicable to functions for which the order of accumulation does
 * not matter. The supplied accumulator function should be
 * side-effect-free, since it may be re-applied when attempted updates
 * fail due to contention among threads. The function is applied with
 * the current value as its first argument, and the given update as
 * the second argument.  For example, to maintain a running maximum
 * value, you could supply {@code Long::max} along with {@code
 * Long.MIN_VALUE} as the identity.
 *
 * <p>Class {@link LongAdder} provides analogs of the functionality of
 * this class for the common special case of maintaining counts and
 * sums.  The call {@code new LongAdder()} is equivalent to {@code new
 * LongAccumulator((x, y) -> x + y, 0L}.
 *
 * <p>This class extends {@link Number}, but does <em>not</em> define
 * methods such as {@code equals}, {@code hashCode} and {@code
 * compareTo} because instances are expected to be mutated, and so are
 * not useful as collection keys.
 *
 * @since 1.8
 * @author Doug Lea
 */
