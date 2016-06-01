_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private Object readResolve() {

    /**
     * Returns the {@link #current() current} thread's {@code ThreadLocalRandom}.
     * @return the {@link #current() current} thread's {@code ThreadLocalRandom}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves the {@code ThreadLocalRandom} to a stream (that is, serializes it).
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField rnd long
     *              seed for random computations
     * @serialField initialized boolean
     *              always true
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final int nextSecondarySeed() {

    /**
     * Returns the pseudo-randomly initialized or updated secondary seed.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final int advanceProbe(int probe) {

    /**
     * Pseudo-randomly advances and records the given probe value for the
     * given thread.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final int getProbe() {

    /**
     * Returns the probe value for the current thread without forcing
     * initialization. Note that invoking ThreadLocalRandom.current()
     * can be used to force initialization on zero return.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final class RandomDoublesSpliterator implements Spliterator.OfDouble {

    /**
     * Spliterator for double streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final class RandomLongsSpliterator implements Spliterator.OfLong {

    /**
     * Spliterator for long streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final class RandomIntsSpliterator implements Spliterator.OfInt {

    /**
     * Spliterator for int streams.  We multiplex the four int
     * versions into one class by treating a bound less than origin as
     * unbounded, and also by treating "infinite" as equivalent to
     * Long.MAX_VALUE. For splits, it uses the standard divide-by-two
     * approach. The long and double versions of this class are
     * identical except for types.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * double} values, each conforming to the given origin (inclusive) and bound
     * (exclusive).
     *
     * @implNote This method is implemented to be equivalent to {@code
     * doubles(Long.MAX_VALUE, randomNumberOrigin, randomNumberBound)}.
     *
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code double} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public DoubleStream doubles(long streamSize, double randomNumberOrigin,
                                double randomNumberBound) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code double} values, each conforming to the given origin
     * (inclusive) and bound (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code double} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     * @throws IllegalArgumentException if {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public DoubleStream doubles() {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * double} values, each between zero (inclusive) and one
     * (exclusive).
     *
     * @implNote This method is implemented to be equivalent to {@code
     * doubles(Long.MAX_VALUE)}.
     *
     * @return a stream of pseudorandom {@code double} values
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public DoubleStream doubles(long streamSize) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code double} values, each between zero
     * (inclusive) and one (exclusive).
     *
     * @param streamSize the number of values to generate
     * @return a stream of {@code double} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public LongStream longs(long randomNumberOrigin, long randomNumberBound) {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * long} values, each conforming to the given origin (inclusive) and bound
     * (exclusive).
     *
     * @implNote This method is implemented to be equivalent to {@code
     * longs(Long.MAX_VALUE, randomNumberOrigin, randomNumberBound)}.
     *
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code long} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public LongStream longs(long streamSize, long randomNumberOrigin,
                            long randomNumberBound) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code long}, each conforming to the given origin
     * (inclusive) and bound (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code long} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero, or {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public LongStream longs() {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code long}
     * values.
     *
     * @implNote This method is implemented to be equivalent to {@code
     * longs(Long.MAX_VALUE)}.
     *
     * @return a stream of pseudorandom {@code long} values
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public LongStream longs(long streamSize) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code long} values.
     *
     * @param streamSize the number of values to generate
     * @return a stream of pseudorandom {@code long} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public IntStream ints(int randomNumberOrigin, int randomNumberBound) {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * int} values, each conforming to the given origin (inclusive) and bound
     * (exclusive).
     *
     * @implNote This method is implemented to be equivalent to {@code
     * ints(Long.MAX_VALUE, randomNumberOrigin, randomNumberBound)}.
     *
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code int} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public IntStream ints(long streamSize, int randomNumberOrigin,
                          int randomNumberBound) {

    /**
     * Returns a stream producing the given {@code streamSize} number
     * of pseudorandom {@code int} values, each conforming to the given
     * origin (inclusive) and bound (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code int} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero, or {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public IntStream ints() {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code int}
     * values.
     *
     * @implNote This method is implemented to be equivalent to {@code
     * ints(Long.MAX_VALUE)}.
     *
     * @return a stream of pseudorandom {@code int} values
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public IntStream ints(long streamSize) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code int} values.
     *
     * @param streamSize the number of values to generate
     * @return a stream of pseudorandom {@code int} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public float nextFloat() {

    /**
     * Returns a pseudorandom {@code float} value between zero
     * (inclusive) and one (exclusive).
     *
     * @return a pseudorandom {@code float} value between zero
     *         (inclusive) and one (exclusive)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public boolean nextBoolean() {

    /**
     * Returns a pseudorandom {@code boolean} value.
     *
     * @return a pseudorandom {@code boolean} value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public double nextDouble(double origin, double bound) {

    /**
     * Returns a pseudorandom {@code double} value between the specified
     * origin (inclusive) and bound (exclusive).
     *
     * @param origin the least value returned
     * @param bound the upper bound (exclusive)
     * @return a pseudorandom {@code double} value between the origin
     *         (inclusive) and the bound (exclusive)
     * @throws IllegalArgumentException if {@code origin} is greater than
     *         or equal to {@code bound}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public double nextDouble(double bound) {

    /**
     * Returns a pseudorandom {@code double} value between 0.0
     * (inclusive) and the specified bound (exclusive).
     *
     * @param bound the upper bound (exclusive).  Must be positive.
     * @return a pseudorandom {@code double} value between zero
     *         (inclusive) and the bound (exclusive)
     * @throws IllegalArgumentException if {@code bound} is not positive
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public double nextDouble() {

    /**
     * Returns a pseudorandom {@code double} value between zero
     * (inclusive) and one (exclusive).
     *
     * @return a pseudorandom {@code double} value between zero
     *         (inclusive) and one (exclusive)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public long nextLong(long origin, long bound) {

    /**
     * Returns a pseudorandom {@code long} value between the specified
     * origin (inclusive) and the specified bound (exclusive).
     *
     * @param origin the least value returned
     * @param bound the upper bound (exclusive)
     * @return a pseudorandom {@code long} value between the origin
     *         (inclusive) and the bound (exclusive)
     * @throws IllegalArgumentException if {@code origin} is greater than
     *         or equal to {@code bound}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public long nextLong(long bound) {

    /**
     * Returns a pseudorandom {@code long} value between zero (inclusive)
     * and the specified bound (exclusive).
     *
     * @param bound the upper bound (exclusive).  Must be positive.
     * @return a pseudorandom {@code long} value between zero
     *         (inclusive) and the bound (exclusive)
     * @throws IllegalArgumentException if {@code bound} is not positive
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public long nextLong() {

    /**
     * Returns a pseudorandom {@code long} value.
     *
     * @return a pseudorandom {@code long} value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public int nextInt(int origin, int bound) {

    /**
     * Returns a pseudorandom {@code int} value between the specified
     * origin (inclusive) and the specified bound (exclusive).
     *
     * @param origin the least value returned
     * @param bound the upper bound (exclusive)
     * @return a pseudorandom {@code int} value between the origin
     *         (inclusive) and the bound (exclusive)
     * @throws IllegalArgumentException if {@code origin} is greater than
     *         or equal to {@code bound}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public int nextInt(int bound) {

    /**
     * Returns a pseudorandom {@code int} value between zero (inclusive)
     * and the specified bound (exclusive).
     *
     * @param bound the upper bound (exclusive).  Must be positive.
     * @return a pseudorandom {@code int} value between zero
     *         (inclusive) and the bound (exclusive)
     * @throws IllegalArgumentException if {@code bound} is not positive
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public int nextInt() {

    /**
     * Returns a pseudorandom {@code int} value.
     *
     * @return a pseudorandom {@code int} value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    final double internalNextDouble(double origin, double bound) {

    /**
     * The form of nextDouble used by DoubleStream Spliterators.
     *
     * @param origin the least value, unless greater than bound
     * @param bound the upper bound (exclusive), must not equal origin
     * @return a pseudorandom value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    final int internalNextInt(int origin, int bound) {

    /**
     * The form of nextInt used by IntStream Spliterators.
     * Exactly the same as long version, except for types.
     *
     * @param origin the least value, unless greater than bound
     * @param bound the upper bound (exclusive), must not equal origin
     * @return a pseudorandom value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    final long internalNextLong(long origin, long bound) {

    /**
     * The form of nextLong used by LongStream Spliterators.  If
     * origin is greater than bound, acts as unbounded form of
     * nextLong, else as bounded form.
     *
     * @param origin the least value, unless greater than bound
     * @param bound the upper bound (exclusive), must not equal origin
     * @return a pseudorandom value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public void setSeed(long seed) {

    /**
     * Throws {@code UnsupportedOperationException}.  Setting seeds in
     * this generator is not supported.
     *
     * @throws UnsupportedOperationException always
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    public static ThreadLocalRandom current() {

    /**
     * Returns the current thread's {@code ThreadLocalRandom}.
     *
     * @return the current thread's {@code ThreadLocalRandom}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final void localInit() {

    /**
     * Initialize Thread fields for the current thread.  Called only
     * when Thread.threadLocalRandomProbe is zero, indicating that a
     * thread local seed value needs to be generated. Note that even
     * though the initialization is purely thread-local, we need to
     * rely on (static) atomic generators to initialize the values.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    static final ThreadLocalRandom instance = new ThreadLocalRandom();

    /** The common ThreadLocalRandom */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private ThreadLocalRandom() {

    /** Constructor used only for static singleton */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    boolean initialized;

    /**
     * Field used only during singleton initialization.
     * True when constructor completes.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private static final ThreadLocal<Double> nextLocalGaussian =

    /** Rarely-used holder for the second of a pair of Gaussians */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private static final long SEEDER_INCREMENT = 0xbb67ae8584caa73bL;

    /**
     * The increment of seeder per new instance
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private static final int PROBE_INCREMENT = 0x9e3779b9;

    /**
     * The increment for generating probe values
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private static final long GAMMA = 0x9e3779b97f4a7c15L;

    /**
     * The seed increment
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private static final AtomicLong seeder = new AtomicLong(initialSeed());

    /**
     * The next seed for default constructors.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
    private static final AtomicInteger probeGenerator =

    /** Generates per-thread initialization/probe field */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ThreadLocalRandom.java
public class ThreadLocalRandom extends Random {

/**
 * A random number generator isolated to the current thread.  Like the
 * global {@link java.util.Random} generator used by the {@link
 * java.lang.Math} class, a {@code ThreadLocalRandom} is initialized
 * with an internally generated seed that may not otherwise be
 * modified. When applicable, use of {@code ThreadLocalRandom} rather
 * than shared {@code Random} objects in concurrent programs will
 * typically encounter much less overhead and contention.  Use of
 * {@code ThreadLocalRandom} is particularly appropriate when multiple
 * tasks (for example, each a {@link ForkJoinTask}) use random numbers
 * in parallel in thread pools.
 *
 * <p>Usages of this class should typically be of the form:
 * {@code ThreadLocalRandom.current().nextX(...)} (where
 * {@code X} is {@code Int}, {@code Long}, etc).
 * When all usages are of this form, it is never possible to
 * accidently share a {@code ThreadLocalRandom} across multiple threads.
 *
 * <p>This class also provides additional commonly used bounded random
 * generation methods.
 *
 * <p>Instances of {@code ThreadLocalRandom} are not cryptographically
 * secure.  Consider instead using {@link java.security.SecureRandom}
 * in security-sensitive applications. Additionally,
 * default-constructed instances do not use a cryptographically random
 * seed unless the {@linkplain System#getProperty system property}
 * {@code java.util.secureRandomSeed} is set to {@code true}.
 *
 * @since 1.7
 * @author Doug Lea
 */
