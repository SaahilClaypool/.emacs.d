_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * @param s the stream
     * @throws java.io.InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    private Object writeReplace() {

    /**
     * Returns a
     * <a href="../../../../serialized-form.html#java.util.concurrent.atomic.DoubleAccumulator.SerializationProxy">
     * SerializationProxy</a>
     * representing the state of this instance.
     *
     * @return a {@link SerializationProxy}
     * representing the state of this instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
        private Object readResolve() {

        /**
         * Returns a {@code DoubleAccumulator} object with initial state
         * held by this proxy.
         *
         * @return a {@code DoubleAccumulator} object with initial state
         * held by this proxy.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
        private final long identity;

        /**
         * The identity value
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
        private final double value;

        /**
         * The current value returned by get().
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    private static class SerializationProxy implements Serializable {

    /**
     * Serialization proxy, used to avoid reference to the non-public
     * Striped64 superclass in serialized forms.
     * @serial include
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public float floatValue() {

    /**
     * Returns the {@linkplain #get current value} as a {@code float}
     * after a narrowing primitive conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public int intValue() {

    /**
     * Returns the {@linkplain #get current value} as an {@code int}
     * after a narrowing primitive conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public long longValue() {

    /**
     * Returns the {@linkplain #get current value} as a {@code long}
     * after a narrowing primitive conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public double doubleValue() {

    /**
     * Equivalent to {@link #get}.
     *
     * @return the current value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public String toString() {

    /**
     * Returns the String representation of the current value.
     * @return the String representation of the current value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public double getThenReset() {

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
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public double get() {

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
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public void accumulate(double x) {

    /**
     * Updates with the given value.
     *
     * @param x the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
    public DoubleAccumulator(DoubleBinaryOperator accumulatorFunction,
                             double identity) {

    /**
     * Creates a new instance using the given accumulator function
     * and identity element.
     * @param accumulatorFunction a side-effect-free function of two arguments
     * @param identity identity (initial value) for the accumulator function
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/DoubleAccumulator.java
public class DoubleAccumulator extends Striped64 implements Serializable {

/**
 * One or more variables that together maintain a running {@code double}
 * value updated using a supplied function.  When updates (method
 * {@link #accumulate}) are contended across threads, the set of variables
 * may grow dynamically to reduce contention.  Method {@link #get}
 * (or, equivalently, {@link #doubleValue}) returns the current value
 * across the variables maintaining updates.
 *
 * <p>This class is usually preferable to alternatives when multiple
 * threads update a common value that is used for purposes such as
 * summary statistics that are frequently updated but less frequently
 * read.
 *
 * <p>The supplied accumulator function should be side-effect-free,
 * since it may be re-applied when attempted updates fail due to
 * contention among threads. The function is applied with the current
 * value as its first argument, and the given update as the second
 * argument.  For example, to maintain a running maximum value, you
 * could supply {@code Double::max} along with {@code
 * Double.NEGATIVE_INFINITY} as the identity. The order of
 * accumulation within or across threads is not guaranteed. Thus, this
 * class may not be applicable if numerical stability is required,
 * especially when combining values of substantially different orders
 * of magnitude.
 *
 * <p>Class {@link DoubleAdder} provides analogs of the functionality
 * of this class for the common special case of maintaining sums.  The
 * call {@code new DoubleAdder()} is equivalent to {@code new
 * DoubleAccumulator((x, y) -> x + y, 0.0)}.
 *
 * <p>This class extends {@link Number}, but does <em>not</em> define
 * methods such as {@code equals}, {@code hashCode} and {@code
 * compareTo} because instances are expected to be mutated, and so are
 * not useful as collection keys.
 *
 * @since 1.8
 * @author Doug Lea
 */
