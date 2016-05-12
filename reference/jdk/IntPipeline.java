_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    abstract static class StatefulOp<E_IN> extends IntPipeline<E_IN> {

    /**
     * Base class for a stateful intermediate stage of an IntStream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    abstract static class StatelessOp<E_IN> extends IntPipeline<E_IN> {

    /**
     * Base class for a stateless intermediate stage of an IntStream
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
        Head(Spliterator<Integer> source,
             int sourceFlags, boolean parallel) {

        /**
         * Constructor for the source stage of an IntStream.
         *
         * @param source {@code Spliterator} describing the stream source
         * @param sourceFlags the source flags for the stream source, described
         *                    in {@link StreamOpFlag}
         * @param parallel {@code true} if the pipeline is parallel
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    static class Head<E_IN> extends IntPipeline<E_IN> {

    /**
     * Source stage of an IntStream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    private static Spliterator.OfInt adapt(Spliterator<Integer> s) {

    /**
     * Adapt a {@code Spliterator<Integer>} to a {@code Spliterator.OfInt}.
     *
     * @implNote
     * The implementation attempts to cast to a Spliterator.OfInt, and throws an
     * exception if this cast is not possible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    private static IntConsumer adapt(Sink<Integer> sink) {

    /**
     * Adapt a {@code Sink<Integer> to an {@code IntConsumer}, ideally simply
     * by casting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    IntPipeline(AbstractPipeline<?, E_IN, ?> upstream, int opFlags) {

    /**
     * Constructor for appending an intermediate operation onto an existing
     * pipeline.
     *
     * @param upstream the upstream element source
     * @param opFlags the operation flags for the new operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    IntPipeline(Spliterator<Integer> source,
                int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Spliterator} describing the stream source
     * @param sourceFlags The source flags for the stream source, described in
     *        {@link StreamOpFlag}
     * @param parallel {@code true} if the pipeline is parallel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
    IntPipeline(Supplier<? extends Spliterator<Integer>> source,
                int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Supplier<Spliterator>} describing the stream source
     * @param sourceFlags The source flags for the stream source, described in
     *        {@link StreamOpFlag}
     * @param parallel {@code true} if the pipeline is parallel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/IntPipeline.java
abstract class IntPipeline<E_IN>

/**
 * Abstract base class for an intermediate pipeline stage or pipeline source
 * stage implementing whose elements are of type {@code int}.
 *
 * @param <E_IN> type of elements in the upstream source
 * @since 1.8
 */
