_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
        StatefulOp(AbstractPipeline<?, E_IN, ?> upstream,
                   StreamShape inputShape,
                   int opFlags) {

        /**
         * Construct a new LongStream by appending a stateful intermediate
         * operation to an existing stream.
         * @param upstream The upstream pipeline stage
         * @param inputShape The stream shape for the upstream pipeline stage
         * @param opFlags Operation flags for the new stage
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    abstract static class StatefulOp<E_IN> extends LongPipeline<E_IN> {

    /**
     * Base class for a stateful intermediate stage of a LongStream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
        StatelessOp(AbstractPipeline<?, E_IN, ?> upstream,
                    StreamShape inputShape,
                    int opFlags) {

        /**
         * Construct a new LongStream by appending a stateless intermediate
         * operation to an existing stream.
         * @param upstream The upstream pipeline stage
         * @param inputShape The stream shape for the upstream pipeline stage
         * @param opFlags Operation flags for the new stage
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    abstract static class StatelessOp<E_IN> extends LongPipeline<E_IN> {

    /** Base class for a stateless intermediate stage of a LongStream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
        Head(Spliterator<Long> source,
             int sourceFlags, boolean parallel) {

        /**
         * Constructor for the source stage of a LongStream.
         *
         * @param source {@code Spliterator} describing the stream source
         * @param sourceFlags the source flags for the stream source, described
         *                    in {@link StreamOpFlag}
         * @param parallel {@code true} if the pipeline is parallel
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
        Head(Supplier<? extends Spliterator<Long>> source,
             int sourceFlags, boolean parallel) {

        /**
         * Constructor for the source stage of a LongStream.
         *
         * @param source {@code Supplier<Spliterator>} describing the stream
         *               source
         * @param sourceFlags the source flags for the stream source, described
         *                    in {@link StreamOpFlag}
         * @param parallel {@code true} if the pipeline is parallel
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    static class Head<E_IN> extends LongPipeline<E_IN> {

    /**
     * Source stage of a LongPipeline.
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    private static Spliterator.OfLong adapt(Spliterator<Long> s) {

    /**
     * Adapt a {@code Spliterator<Long>} to a {@code Spliterator.OfLong}.
     *
     * @implNote
     * The implementation attempts to cast to a Spliterator.OfLong, and throws
     * an exception if this cast is not possible.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    private static LongConsumer adapt(Sink<Long> sink) {

    /**
     * Adapt a {@code Sink<Long> to an {@code LongConsumer}, ideally simply
     * by casting.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    LongPipeline(AbstractPipeline<?, E_IN, ?> upstream, int opFlags) {

    /**
     * Constructor for appending an intermediate operation onto an existing pipeline.
     *
     * @param upstream the upstream element source.
     * @param opFlags the operation flags
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    LongPipeline(Spliterator<Long> source,
                 int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Spliterator} describing the stream source
     * @param sourceFlags the source flags for the stream source, described in
     *        {@link StreamOpFlag}
     * @param parallel {@code true} if the pipeline is parallel
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
    LongPipeline(Supplier<? extends Spliterator<Long>> source,
                 int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Supplier<Spliterator>} describing the stream source
     * @param sourceFlags the source flags for the stream source, described in
     *        {@link StreamOpFlag}
     * @param parallel {@code true} if the pipeline is parallel
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/LongPipeline.java
abstract class LongPipeline<E_IN>

/**
 * Abstract base class for an intermediate pipeline stage or pipeline source
 * stage implementing whose elements are of type {@code long}.
 *
 * @param <E_IN> type of elements in the upstream source
 * @since 1.8
 */
