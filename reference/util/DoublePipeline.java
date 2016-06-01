_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
        StatefulOp(AbstractPipeline<?, E_IN, ?> upstream,
                   StreamShape inputShape,
                   int opFlags) {

        /**
         * Construct a new DoubleStream by appending a stateful intermediate
         * operation to an existing stream.
         *
         * @param upstream the upstream pipeline stage
         * @param inputShape the stream shape for the upstream pipeline stage
         * @param opFlags operation flags for the new stage
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    abstract static class StatefulOp<E_IN> extends DoublePipeline<E_IN> {

    /**
     * Base class for a stateful intermediate stage of a DoubleStream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
        StatelessOp(AbstractPipeline<?, E_IN, ?> upstream,
                    StreamShape inputShape,
                    int opFlags) {

        /**
         * Construct a new DoubleStream by appending a stateless intermediate
         * operation to an existing stream.
         *
         * @param upstream the upstream pipeline stage
         * @param inputShape the stream shape for the upstream pipeline stage
         * @param opFlags operation flags for the new stage
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    abstract static class StatelessOp<E_IN> extends DoublePipeline<E_IN> {

    /**
     * Base class for a stateless intermediate stage of a DoubleStream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
        Head(Spliterator<Double> source,
             int sourceFlags, boolean parallel) {

        /**
         * Constructor for the source stage of a DoubleStream.
         *
         * @param source {@code Spliterator} describing the stream source
         * @param sourceFlags the source flags for the stream source, described
         *                    in {@link StreamOpFlag}
         * @param parallel {@code true} if the pipeline is parallel
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
        Head(Supplier<? extends Spliterator<Double>> source,
             int sourceFlags, boolean parallel) {

        /**
         * Constructor for the source stage of a DoubleStream.
         *
         * @param source {@code Supplier<Spliterator>} describing the stream
         *               source
         * @param sourceFlags the source flags for the stream source, described
         *                    in {@link StreamOpFlag}
         * @param parallel {@code true} if the pipeline is parallel
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    static class Head<E_IN> extends DoublePipeline<E_IN> {

    /**
     * Source stage of a DoubleStream
     *
     * @param <E_IN> type of elements in the upstream source
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    @Override

    /**
     * {@inheritDoc}
     *
     * @implNote The {@code double} format can represent all
     * consecutive integers in the range -2<sup>53</sup> to
     * 2<sup>53</sup>. If the pipeline has more than 2<sup>53</sup>
     * values, the divisor in the average computation will saturate at
     * 2<sup>53</sup>, leading to additional numerical errors.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    private static Spliterator.OfDouble adapt(Spliterator<Double> s) {

    /**
     * Adapt a {@code Spliterator<Double>} to a {@code Spliterator.OfDouble}.
     *
     * @implNote
     * The implementation attempts to cast to a Spliterator.OfDouble, and throws
     * an exception if this cast is not possible.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    private static DoubleConsumer adapt(Sink<Double> sink) {

    /**
     * Adapt a {@code Sink<Double> to a {@code DoubleConsumer}, ideally simply
     * by casting.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    DoublePipeline(AbstractPipeline<?, E_IN, ?> upstream, int opFlags) {

    /**
     * Constructor for appending an intermediate operation onto an existing
     * pipeline.
     *
     * @param upstream the upstream element source.
     * @param opFlags the operation flags
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    DoublePipeline(Spliterator<Double> source,
                   int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Spliterator} describing the stream source
     * @param sourceFlags the source flags for the stream source, described in
     * {@link StreamOpFlag}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
    DoublePipeline(Supplier<? extends Spliterator<Double>> source,
                   int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Supplier<Spliterator>} describing the stream source
     * @param sourceFlags the source flags for the stream source, described in
     * {@link StreamOpFlag}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/DoublePipeline.java
abstract class DoublePipeline<E_IN>

/**
 * Abstract base class for an intermediate pipeline stage or pipeline source
 * stage implementing whose elements are of type {@code double}.
 *
 * @param <E_IN> type of elements in the upstream source
 *
 * @since 1.8
 */
