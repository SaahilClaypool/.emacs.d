_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * @param s the stream
     * @throws java.io.InvalidObjectException always
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    private Object writeReplace() {

    /**
     * Returns a
     * <a href="../../../../serialized-form.html#java.util.concurrent.atomic.DoubleAdder.SerializationProxy">
     * SerializationProxy</a>
     * representing the state of this instance.
     *
     * @return a {@link SerializationProxy}
     * representing the state of this instance
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
        private Object readResolve() {

        /**
         * Returns a {@code DoubleAdder} object with initial state
         * held by this proxy.
         *
         * @return a {@code DoubleAdder} object with initial state
         * held by this proxy.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
        private final double value;

        /**
         * The current value returned by sum().
         * @serial
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    private static class SerializationProxy implements Serializable {

    /**
     * Serialization proxy, used to avoid reference to the non-public
     * Striped64 superclass in serialized forms.
     * @serial include
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public float floatValue() {

    /**
     * Returns the {@link #sum} as a {@code float}
     * after a narrowing primitive conversion.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public int intValue() {

    /**
     * Returns the {@link #sum} as an {@code int} after a
     * narrowing primitive conversion.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public long longValue() {

    /**
     * Returns the {@link #sum} as a {@code long} after a
     * narrowing primitive conversion.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public double doubleValue() {

    /**
     * Equivalent to {@link #sum}.
     *
     * @return the sum
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public String toString() {

    /**
     * Returns the String representation of the {@link #sum}.
     * @return the String representation of the {@link #sum}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public double sumThenReset() {

    /**
     * Equivalent in effect to {@link #sum} followed by {@link
     * #reset}. This method may apply for example during quiescent
     * points between multithreaded computations.  If there are
     * updates concurrent with this method, the returned value is
     * <em>not</em> guaranteed to be the final value occurring before
     * the reset.
     *
     * @return the sum
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public void reset() {

    /**
     * Resets variables maintaining the sum to zero.  This method may
     * be a useful alternative to creating a new adder, but is only
     * effective if there are no concurrent updates.  Because this
     * method is intrinsically racy, it should only be used when it is
     * known that no threads are concurrently updating.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public double sum() {

    /**
     * Returns the current sum.  The returned value is <em>NOT</em> an
     * atomic snapshot; invocation in the absence of concurrent
     * updates returns an accurate result, but concurrent updates that
     * occur while the sum is being calculated might not be
     * incorporated.  Also, because floating-point arithmetic is not
     * strictly associative, the returned result need not be identical
     * to the value that would be obtained in a sequential series of
     * updates to a single variable.
     *
     * @return the sum
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public void add(double x) {

    /**
     * Adds the given value.
     *
     * @param x the value to add
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
    public DoubleAdder() {

    /**
     * Creates a new adder with initial sum of zero.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/DoubleAdder.java
public class DoubleAdder extends Striped64 implements Serializable {

/**
 * One or more variables that together maintain an initially zero
 * {@code double} sum.  When updates (method {@link #add}) are
 * contended across threads, the set of variables may grow dynamically
 * to reduce contention.  Method {@link #sum} (or, equivalently {@link
 * #doubleValue}) returns the current total combined across the
 * variables maintaining the sum. The order of accumulation within or
 * across threads is not guaranteed. Thus, this class may not be
 * applicable if numerical stability is required, especially when
 * combining values of substantially different orders of magnitude.
 *
 * <p>This class is usually preferable to alternatives when multiple
 * threads update a common value that is used for purposes such as
 * summary statistics that are frequently updated but less frequently
 * read.
 *
 * <p>This class extends {@link Number}, but does <em>not</em> define
 * methods such as {@code equals}, {@code hashCode} and {@code
 * compareTo} because instances are expected to be mutated, and so are
 * not useful as collection keys.
 *
 * @since 1.8
 * @author Doug Lea
 */
