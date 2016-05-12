_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    static final class RandomDoublesSpliterator implements Spliterator.OfDouble {

    /**
     * Spliterator for double streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    static final class RandomLongsSpliterator implements Spliterator.OfLong {

    /**
     * Spliterator for long streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * double} values from this generator and/or one split from it; each value
     * conforms to the given origin (inclusive) and bound (exclusive).
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
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public DoubleStream doubles(long streamSize, double randomNumberOrigin,
                                double randomNumberBound) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code double} values from this generator and/or one split
     * from it; each value conforms to the given origin (inclusive) and bound
     * (exclusive).
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
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public DoubleStream doubles() {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * double} values from this generator and/or one split from it; each value
     * is between zero (inclusive) and one (exclusive).
     *
     * @implNote This method is implemented to be equivalent to {@code
     * doubles(Long.MAX_VALUE)}.
     *
     * @return a stream of pseudorandom {@code double} values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public DoubleStream doubles(long streamSize) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code double} values from this generator and/or one split
     * from it; each value is between zero (inclusive) and one (exclusive).
     *
     * @param streamSize the number of values to generate
     * @return a stream of {@code double} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public LongStream longs(long randomNumberOrigin, long randomNumberBound) {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * long} values from this generator and/or one split from it; each value
     * conforms to the given origin (inclusive) and bound (exclusive).
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
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public LongStream longs(long streamSize, long randomNumberOrigin,
                            long randomNumberBound) {

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code long} values from this generator and/or one split
     * from it; each value conforms to the given origin (inclusive) and bound
     * (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code long} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero, or {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public LongStream longs() {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * long} values from this generator and/or one split from it.
     *
     * @implNote This method is implemented to be equivalent to {@code
     * longs(Long.MAX_VALUE)}.
     *
     * @return a stream of pseudorandom {@code long} values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public LongStream longs(long streamSize) {

    /**
     * Returns a stream producing the given {@code streamSize} number
     * of pseudorandom {@code long} values from this generator and/or
     * one split from it.
     *
     * @param streamSize the number of values to generate
     * @return a stream of pseudorandom {@code long} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public IntStream ints(int randomNumberOrigin, int randomNumberBound) {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code
     * int} values from this generator and/or one split from it; each value
     * conforms to the given origin (inclusive) and bound (exclusive).
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
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public IntStream ints(long streamSize, int randomNumberOrigin,
                          int randomNumberBound) {

    /**
     * Returns a stream producing the given {@code streamSize} number
     * of pseudorandom {@code int} values from this generator and/or one split
     * from it; each value conforms to the given origin (inclusive) and bound
     * (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin the origin (inclusive) of each random value
     * @param randomNumberBound the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code int} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero, or {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public IntStream ints() {

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code int}
     * values from this generator and/or one split from it.
     *
     * @implNote This method is implemented to be equivalent to {@code
     * ints(Long.MAX_VALUE)}.
     *
     * @return a stream of pseudorandom {@code int} values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public IntStream ints(long streamSize) {

    /**
     * Returns a stream producing the given {@code streamSize} number
     * of pseudorandom {@code int} values from this generator and/or
     * one split from it.
     *
     * @param streamSize the number of values to generate
     * @return a stream of pseudorandom {@code int} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public boolean nextBoolean() {

    /**
     * Returns a pseudorandom {@code boolean} value.
     *
     * @return a pseudorandom {@code boolean} value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public double nextDouble() {

    /**
     * Returns a pseudorandom {@code double} value between zero
     * (inclusive) and one (exclusive).
     *
     * @return a pseudorandom {@code double} value between zero
     *         (inclusive) and one (exclusive)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public long nextLong() {

    /**
     * Returns a pseudorandom {@code long} value.
     *
     * @return a pseudorandom {@code long} value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public int nextInt() {

    /**
     * Returns a pseudorandom {@code int} value.
     *
     * @return a pseudorandom {@code int} value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public SplittableRandom split() {

    /**
     * Constructs and returns a new SplittableRandom instance that
     * shares no mutable state with this instance. However, with very
     * high probability, the set of values collectively generated by
     * the two objects has the same statistical properties as if the
     * same quantity of values were generated by a single thread using
     * a single SplittableRandom object.  Either or both of the two
     * objects may be further split using the {@code split()} method,
     * and the same expected statistical properties apply to the
     * entire set of generators constructed by such recursive
     * splitting.
     *
     * @return the new SplittableRandom instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public SplittableRandom() { // emulate defaultGen.split()

    /**
     * Creates a new SplittableRandom instance that is likely to
     * generate sequences of values that are statistically independent
     * of those of any other instances in the current program; and
     * may, and typically does, vary across program invocations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    public SplittableRandom(long seed) {

    /**
     * Creates a new SplittableRandom instance using the specified
     * initial seed. SplittableRandom instances created with the same
     * seed in the same program generate identical sequences of values.
     *
     * @param seed the initial seed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    final double internalNextDouble(double origin, double bound) {

    /**
     * The form of nextDouble used by DoubleStream Spliterators.
     *
     * @param origin the least value, unless greater than bound
     * @param bound the upper bound (exclusive), must not equal origin
     * @return a pseudorandom value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private static final AtomicLong defaultGen = new AtomicLong(initialSeed());

    /**
     * The seed generator for default constructors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private long nextSeed() {

    /**
     * Adds gamma to seed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private static long mixGamma(long z) {

    /**
     * Returns the gamma value to use for a new split instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private static int mix32(long z) {

    /**
     * Returns the 32 high bits of Stafford variant 4 mix64 function as int.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private static long mix64(long z) {

    /**
     * Computes Stafford variant 13 of 64bit mix function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private SplittableRandom(long seed, long gamma) {

    /**
     * Internal constructor used by all others except default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private final long gamma;

    /**
     * The step value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private long seed;

    /**
     * The seed. Updated only via method nextSeed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private static final double DOUBLE_UNIT = 0x1.0p-53; // 1.0 / (1L << 53);

    /**
     * The least non-zero value returned by nextDouble(). This value
     * is scaled by a random value of 53 bits to produce a result.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
    private static final long GOLDEN_GAMMA = 0x9e3779b97f4a7c15L;

    /**
     * The golden ratio scaled to 64bits, used as the initial gamma
     * value for (unsplit) SplittableRandoms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/SplittableRandom.java
public final class SplittableRandom {

/**
 * A generator of uniform pseudorandom values applicable for use in
 * (among other contexts) isolated parallel computations that may
 * generate subtasks. Class {@code SplittableRandom} supports methods for
 * producing pseudorandom numbers of type {@code int}, {@code long},
 * and {@code double} with similar usages as for class
 * {@link java.util.Random} but differs in the following ways:
 *
 * <ul>
 *
 * <li>Series of generated values pass the DieHarder suite testing
 * independence and uniformity properties of random number generators.
 * (Most recently validated with <a
 * href="http://www.phy.duke.edu/~rgb/General/dieharder.php"> version
 * 3.31.1</a>.) These tests validate only the methods for certain
 * types and ranges, but similar properties are expected to hold, at
 * least approximately, for others as well. The <em>period</em>
 * (length of any series of generated values before it repeats) is at
 * least 2<sup>64</sup>. </li>
 *
 * <li> Method {@link #split} constructs and returns a new
 * SplittableRandom instance that shares no mutable state with the
 * current instance. However, with very high probability, the
 * values collectively generated by the two objects have the same
 * statistical properties as if the same quantity of values were
 * generated by a single thread using a single {@code
 * SplittableRandom} object.  </li>
 *
 * <li>Instances of SplittableRandom are <em>not</em> thread-safe.
 * They are designed to be split, not shared, across threads. For
 * example, a {@link java.util.concurrent.ForkJoinTask
 * fork/join-style} computation using random numbers might include a
 * construction of the form {@code new
 * Subtask(aSplittableRandom.split()).fork()}.
 *
 * <li>This class provides additional methods for generating random
 * streams, that employ the above techniques when used in {@code
 * stream.parallel()} mode.</li>
 *
 * </ul>
 *
 * <p>Instances of {@code SplittableRandom} are not cryptographically
 * secure.  Consider instead using {@link java.security.SecureRandom}
 * in security-sensitive applications. Additionally,
 * default-constructed instances do not use a cryptographically random
 * seed unless the {@linkplain System#getProperty system property}
 * {@code java.util.secureRandomSeed} is set to {@code true}.
 *
 * @author  Guy Steele
 * @author  Doug Lea
 * @since   1.8
 */
