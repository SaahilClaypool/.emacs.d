_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    @Override

    /**
     * {@inheritDoc}
     *
     * Returns a non-empty string representation of this object suitable for
     * debugging. The exact presentation format is unspecified and may vary
     * between implementations and versions.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    public final double getAverage() {

    /**
     * Returns the arithmetic mean of values recorded, or zero if no
     * values have been recorded.
     *
     * If any recorded value is a NaN or the sum is at any point a NaN
     * then the average will be code NaN.
     *
     * <p>The average returned can vary depending upon the order in
     * which values are recorded.
     *
     * This method may be implemented using compensated summation or
     * other technique to reduce the error bound in the {@link #getSum
     * numerical sum} used to compute the average.
     *
     * @apiNote Values sorted by increasing absolute magnitude tend to yield
     * more accurate results.
     *
     * @return the arithmetic mean of values, or zero if none
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    public final double getMax() {

    /**
     * Returns the maximum recorded value, {@code Double.NaN} if any recorded
     * value was NaN or {@code Double.NEGATIVE_INFINITY} if no values were
     * recorded. Unlike the numerical comparison operators, this method
     * considers negative zero to be strictly smaller than positive zero.
     *
     * @return the maximum recorded value, {@code Double.NaN} if any recorded
     * value was NaN or {@code Double.NEGATIVE_INFINITY} if no values were
     * recorded
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    public final double getMin() {

    /**
     * Returns the minimum recorded value, {@code Double.NaN} if any recorded
     * value was NaN or {@code Double.POSITIVE_INFINITY} if no values were
     * recorded. Unlike the numerical comparison operators, this method
     * considers negative zero to be strictly smaller than positive zero.
     *
     * @return the minimum recorded value, {@code Double.NaN} if any recorded
     * value was NaN or {@code Double.POSITIVE_INFINITY} if no values were
     * recorded
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    public final double getSum() {

    /**
     * Returns the sum of values recorded, or zero if no values have been
     * recorded.
     *
     * If any recorded value is a NaN or the sum is at any point a NaN
     * then the sum will be NaN.
     *
     * <p> The value of a floating-point sum is a function both of the
     * input values as well as the order of addition operations. The
     * order of addition operations of this method is intentionally
     * not defined to allow for implementation flexibility to improve
     * the speed and accuracy of the computed result.
     *
     * In particular, this method may be implemented using compensated
     * summation or other technique to reduce the error bound in the
     * numerical sum compared to a simple summation of {@code double}
     * values.
     *
     * @apiNote Values sorted by increasing absolute magnitude tend to yield
     * more accurate results.
     *
     * @return the sum of values, or zero if none
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    public final long getCount() {

    /**
     * Return the count of values recorded.
     *
     * @return the count of values
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    private void sumWithCompensation(double value) {

    /**
     * Incorporate a new double value using Kahan summation /
     * compensated summation.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    public void combine(DoubleSummaryStatistics other) {

    /**
     * Combines the state of another {@code DoubleSummaryStatistics} into this
     * one.
     *
     * @param other another {@code DoubleSummaryStatistics}
     * @throws NullPointerException if {@code other} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    @Override

    /**
     * Records another value into the summary information.
     *
     * @param value the input value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
    public DoubleSummaryStatistics() { }

    /**
     * Construct an empty instance with zero count, zero sum,
     * {@code Double.POSITIVE_INFINITY} min, {@code Double.NEGATIVE_INFINITY}
     * max and zero average.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//DoubleSummaryStatistics.java
public class DoubleSummaryStatistics implements DoubleConsumer {

/**
 * A state object for collecting statistics such as count, min, max, sum, and
 * average.
 *
 * <p>This class is designed to work with (though does not require)
 * {@linkplain java.util.stream streams}. For example, you can compute
 * summary statistics on a stream of doubles with:
 * <pre> {@code
 * DoubleSummaryStatistics stats = doubleStream.collect(DoubleSummaryStatistics::new,
 *                                                      DoubleSummaryStatistics::accept,
 *                                                      DoubleSummaryStatistics::combine);
 * }</pre>
 *
 * <p>{@code DoubleSummaryStatistics} can be used as a
 * {@linkplain java.util.stream.Stream#collect(Collector) reduction}
 * target for a {@linkplain java.util.stream.Stream stream}. For example:
 *
 * <pre> {@code
 * DoubleSummaryStatistics stats = people.stream()
 *     .collect(Collectors.summarizingDouble(Person::getWeight));
 *}</pre>
 *
 * This computes, in a single pass, the count of people, as well as the minimum,
 * maximum, sum, and average of their weights.
 *
 * @implNote This implementation is not thread safe. However, it is safe to use
 * {@link java.util.stream.Collectors#summarizingDouble(java.util.function.ToDoubleFunction)
 * Collectors.toDoubleStatistics()} on a parallel stream, because the parallel
 * implementation of {@link java.util.stream.Stream#collect Stream.collect()}
 * provides the necessary partitioning, isolation, and merging of results for
 * safe and efficient parallel execution.
 * @since 1.8
 */
