_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class DoubleSortingSink extends AbstractDoubleSortingSink {

    /**
     * {@link Sink} for implementing sort on double streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class SizedDoubleSortingSink extends AbstractDoubleSortingSink {

    /**
     * {@link Sink} for implementing sort on SIZED double streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static abstract class AbstractDoubleSortingSink extends Sink.ChainedDouble<Double> {

    /**
     * Abstract {@link Sink} for implementing sort on long streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class LongSortingSink extends AbstractLongSortingSink {

    /**
     * {@link Sink} for implementing sort on long streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class SizedLongSortingSink extends AbstractLongSortingSink {

    /**
     * {@link Sink} for implementing sort on SIZED long streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static abstract class AbstractLongSortingSink extends Sink.ChainedLong<Long> {

    /**
     * Abstract {@link Sink} for implementing sort on long streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class IntSortingSink extends AbstractIntSortingSink {

    /**
     * {@link Sink} for implementing sort on int streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class SizedIntSortingSink extends AbstractIntSortingSink {

    /**
     * {@link Sink} for implementing sort on SIZED int streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static abstract class AbstractIntSortingSink extends Sink.ChainedInt<Integer> {

    /**
     * Abstract {@link Sink} for implementing sort on int streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class RefSortingSink<T> extends AbstractRefSortingSink<T> {

    /**
     * {@link Sink} for implementing sort on reference streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class SizedRefSortingSink<T> extends AbstractRefSortingSink<T> {

    /**
     * {@link Sink} for implementing sort on SIZED reference streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
        @Override

        /**
         * Records is cancellation is requested so short-circuiting behaviour
         * can be preserved when the sorted elements are pushed downstream.
         *
         * @return false, as this sink never short-circuits.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static abstract class AbstractRefSortingSink<T> extends Sink.ChainedReference<T, T> {

    /**
     * Abstract {@link Sink} for implementing sort on reference streams.
     *
     * <p>
     * Note: documentation below applies to reference and all primitive sinks.
     * <p>
     * Sorting sinks first accept all elements, buffering then into an array
     * or a re-sizable data structure, if the size of the pipeline is known or
     * unknown respectively.  At the end of the sink protocol those elements are
     * sorted and then pushed downstream.
     * This class records if {@link #cancellationRequested} is called.  If so it
     * can be inferred that the source pushing source elements into the pipeline
     * knows that the pipeline is short-circuiting.  In such cases sub-classes
     * pushing elements downstream will preserve the short-circuiting protocol
     * by calling {@code downstream.cancellationRequested()} and checking the
     * result is {@code false} before an element is pushed.
     * <p>
     * Note that the above behaviour is an optimization for sorting with
     * sequential streams.  It is not an error that more elements, than strictly
     * required to produce a result, may flow through the pipeline.  This can
     * occur, in general (not restricted to just sorting), for short-circuiting
     * parallel pipelines.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class OfDouble extends DoublePipeline.StatefulOp<Double> {

    /**
     * Specialized subtype for sorting double streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class OfLong extends LongPipeline.StatefulOp<Long> {

    /**
     * Specialized subtype for sorting long streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class OfInt extends IntPipeline.StatefulOp<Integer> {

    /**
     * Specialized subtype for sorting int streams.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
        OfRef(AbstractPipeline<?, T, ?> upstream, Comparator<? super T> comparator) {

        /**
         * Sort using the provided comparator.
         *
         * @param comparator The comparator to be used to evaluate ordering.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
        OfRef(AbstractPipeline<?, T, ?> upstream) {

        /**
         * Sort using natural order of {@literal <T>} which must be
         * {@code Comparable}.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
        private final boolean isNaturalSort;

        /**
         * Comparator used for sorting
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    private static final class OfRef<T> extends ReferencePipeline.StatefulOp<T, T> {

    /**
     * Specialized subtype for sorting reference streams
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    static <T> DoubleStream makeDouble(AbstractPipeline<?, Double, ?> upstream) {

    /**
     * Appends a "sorted" operation to the provided stream.
     *
     * @param <T> the type of both input and output elements
     * @param upstream a reference stream with element type T
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    static <T> LongStream makeLong(AbstractPipeline<?, Long, ?> upstream) {

    /**
     * Appends a "sorted" operation to the provided stream.
     *
     * @param <T> the type of both input and output elements
     * @param upstream a reference stream with element type T
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    static <T> IntStream makeInt(AbstractPipeline<?, Integer, ?> upstream) {

    /**
     * Appends a "sorted" operation to the provided stream.
     *
     * @param <T> the type of both input and output elements
     * @param upstream a reference stream with element type T
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    static <T> Stream<T> makeRef(AbstractPipeline<?, T, ?> upstream,
                                Comparator<? super T> comparator) {

    /**
     * Appends a "sorted" operation to the provided stream.
     *
     * @param <T> the type of both input and output elements
     * @param upstream a reference stream with element type T
     * @param comparator the comparator to order elements by
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
    static <T> Stream<T> makeRef(AbstractPipeline<?, T, ?> upstream) {

    /**
     * Appends a "sorted" operation to the provided stream.
     *
     * @param <T> the type of both input and output elements
     * @param upstream a reference stream with element type T
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SortedOps.java
final class SortedOps {

/**
 * Factory methods for transforming streams into sorted streams.
 *
 * @since 1.8
 */
