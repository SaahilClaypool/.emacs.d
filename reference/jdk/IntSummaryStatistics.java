_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public String toString() {

    /**
     * {@inheritDoc}
     *
     * Returns a non-empty string representation of this object suitable for
     * debugging. The exact presentation format is unspecified and may vary
     * between implementations and versions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public final double getAverage() {

    /**
     * Returns the arithmetic mean of values recorded, or zero if no values have been
     * recorded.
     *
     * @return the arithmetic mean of values, or zero if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public final int getMax() {

    /**
     * Returns the maximum value recorded, or {@code Integer.MIN_VALUE} if no
     * values have been recorded.
     *
     * @return the maximum value, or {@code Integer.MIN_VALUE} if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public final int getMin() {

    /**
     * Returns the minimum value recorded, or {@code Integer.MAX_VALUE} if no
     * values have been recorded.
     *
     * @return the minimum value, or {@code Integer.MAX_VALUE} if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public final long getSum() {

    /**
     * Returns the sum of values recorded, or zero if no values have been
     * recorded.
     *
     * @return the sum of values, or zero if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public final long getCount() {

    /**
     * Returns the count of values recorded.
     *
     * @return the count of values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public void combine(IntSummaryStatistics other) {

    /**
     * Combines the state of another {@code IntSummaryStatistics} into this one.
     *
     * @param other another {@code IntSummaryStatistics}
     * @throws NullPointerException if {@code other} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    @Override

    /**
     * Records a new value into the summary information
     *
     * @param value the input value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
    public IntSummaryStatistics() { }

    /**
     * Construct an empty instance with zero count, zero sum,
     * {@code Integer.MAX_VALUE} min, {@code Integer.MIN_VALUE} max and zero
     * average.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/IntSummaryStatistics.java
public class IntSummaryStatistics implements IntConsumer {

/**
 * A state object for collecting statistics such as count, min, max, sum, and
 * average.
 *
 * <p>This class is designed to work with (though does not require)
 * {@linkplain java.util.stream streams}. For example, you can compute
 * summary statistics on a stream of ints with:
 * <pre> {@code
 * IntSummaryStatistics stats = intStream.collect(IntSummaryStatistics::new,
 *                                                IntSummaryStatistics::accept,
 *                                                IntSummaryStatistics::combine);
 * }</pre>
 *
 * <p>{@code IntSummaryStatistics} can be used as a
 * {@linkplain java.util.stream.Stream#collect(Collector) reduction}
 * target for a {@linkplain java.util.stream.Stream stream}. For example:
 *
 * <pre> {@code
 * IntSummaryStatistics stats = people.stream()
 *                                    .collect(Collectors.summarizingInt(Person::getDependents));
 *}</pre>
 *
 * This computes, in a single pass, the count of people, as well as the minimum,
 * maximum, sum, and average of their number of dependents.
 *
 * @implNote This implementation is not thread safe. However, it is safe to use
 * {@link java.util.stream.Collectors#summarizingInt(java.util.function.ToIntFunction)
 * Collectors.toIntStatistics()} on a parallel stream, because the parallel
 * implementation of {@link java.util.stream.Stream#collect Stream.collect()}
 * provides the necessary partitioning, isolation, and merging of results for
 * safe and efficient parallel execution.
 *
 * <p>This implementation does not check for overflow of the sum.
 * @since 1.8
 */
