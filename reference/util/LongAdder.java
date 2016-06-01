_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * @param s the stream
     * @throws java.io.InvalidObjectException always
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    private Object writeReplace() {

    /**
     * Returns a
     * <a href="../../../../serialized-form.html#java.util.concurrent.atomic.LongAdder.SerializationProxy">
     * SerializationProxy</a>
     * representing the state of this instance.
     *
     * @return a {@link SerializationProxy}
     * representing the state of this instance
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
        private Object readResolve() {

        /**
         * Return a {@code LongAdder} object with initial state
         * held by this proxy.
         *
         * @return a {@code LongAdder} object with initial state
         * held by this proxy.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
        private final long value;

        /**
         * The current value returned by sum().
         * @serial
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    private static class SerializationProxy implements Serializable {

    /**
     * Serialization proxy, used to avoid reference to the non-public
     * Striped64 superclass in serialized forms.
     * @serial include
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public double doubleValue() {

    /**
     * Returns the {@link #sum} as a {@code double} after a widening
     * primitive conversion.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public float floatValue() {

    /**
     * Returns the {@link #sum} as a {@code float}
     * after a widening primitive conversion.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public int intValue() {

    /**
     * Returns the {@link #sum} as an {@code int} after a narrowing
     * primitive conversion.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public long longValue() {

    /**
     * Equivalent to {@link #sum}.
     *
     * @return the sum
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public String toString() {

    /**
     * Returns the String representation of the {@link #sum}.
     * @return the String representation of the {@link #sum}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public long sumThenReset() {

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public long sum() {

    /**
     * Returns the current sum.  The returned value is <em>NOT</em> an
     * atomic snapshot; invocation in the absence of concurrent
     * updates returns an accurate result, but concurrent updates that
     * occur while the sum is being calculated might not be
     * incorporated.
     *
     * @return the sum
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public void decrement() {

    /**
     * Equivalent to {@code add(-1)}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public void increment() {

    /**
     * Equivalent to {@code add(1)}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public void add(long x) {

    /**
     * Adds the given value.
     *
     * @param x the value to add
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
    public LongAdder() {

    /**
     * Creates a new adder with initial sum of zero.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/atomic/LongAdder.java
public class LongAdder extends Striped64 implements Serializable {

/**
 * One or more variables that together maintain an initially zero
 * {@code long} sum.  When updates (method {@link #add}) are contended
 * across threads, the set of variables may grow dynamically to reduce
 * contention. Method {@link #sum} (or, equivalently, {@link
 * #longValue}) returns the current total combined across the
 * variables maintaining the sum.
 *
 * <p>This class is usually preferable to {@link AtomicLong} when
 * multiple threads update a common sum that is used for purposes such
 * as collecting statistics, not for fine-grained synchronization
 * control.  Under low update contention, the two classes have similar
 * characteristics. But under high contention, expected throughput of
 * this class is significantly higher, at the expense of higher space
 * consumption.
 *
 * <p>LongAdders can be used with a {@link
 * java.util.concurrent.ConcurrentHashMap} to maintain a scalable
 * frequency map (a form of histogram or multiset). For example, to
 * add a count to a {@code ConcurrentHashMap<String,LongAdder> freqs},
 * initializing if not already present, you can use {@code
 * freqs.computeIfAbsent(k -> new LongAdder()).increment();}
 *
 * <p>This class extends {@link Number}, but does <em>not</em> define
 * methods such as {@code equals}, {@code hashCode} and {@code
 * compareTo} because instances are expected to be mutated, and so are
 * not useful as collection keys.
 *
 * @since 1.8
 * @author Doug Lea
 */
