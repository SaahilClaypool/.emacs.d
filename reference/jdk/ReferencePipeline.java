_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
        StatefulOp(AbstractPipeline<?, E_IN, ?> upstream,
                   StreamShape inputShape,
                   int opFlags) {

        /**
         * Construct a new Stream by appending a stateful intermediate operation
         * to an existing stream.
         * @param upstream The upstream pipeline stage
         * @param inputShape The stream shape for the upstream pipeline stage
         * @param opFlags Operation flags for the new stage
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
    abstract static class StatefulOp<E_IN, E_OUT>

    /**
     * Base class for a stateful intermediate stage of a Stream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @param <E_OUT> type of elements in produced by this stage
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
        StatelessOp(AbstractPipeline<?, E_IN, ?> upstream,
                    StreamShape inputShape,
                    int opFlags) {

        /**
         * Construct a new Stream by appending a stateless intermediate
         * operation to an existing stream.
         *
         * @param upstream The upstream pipeline stage
         * @param inputShape The stream shape for the upstream pipeline stage
         * @param opFlags Operation flags for the new stage
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
    abstract static class StatelessOp<E_IN, E_OUT>

    /**
     * Base class for a stateless intermediate stage of a Stream.
     *
     * @param <E_IN> type of elements in the upstream source
     * @param <E_OUT> type of elements in produced by this stage
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
        Head(Spliterator<?> source,
             int sourceFlags, boolean parallel) {

        /**
         * Constructor for the source stage of a Stream.
         *
         * @param source {@code Spliterator} describing the stream source
         * @param sourceFlags the source flags for the stream source, described
         *                    in {@link StreamOpFlag}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
    static class Head<E_IN, E_OUT> extends ReferencePipeline<E_IN, E_OUT> {

    /**
     * Source stage of a ReferencePipeline.
     *
     * @param <E_IN> type of elements in the upstream source
     * @param <E_OUT> type of elements in produced by this stage
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
    ReferencePipeline(AbstractPipeline<?, P_IN, ?> upstream, int opFlags) {

    /**
     * Constructor for appending an intermediate operation onto an existing
     * pipeline.
     *
     * @param upstream the upstream element source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
    ReferencePipeline(Spliterator<?> source,
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
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
    ReferencePipeline(Supplier<? extends Spliterator<?>> source,
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReferencePipeline.java
abstract class ReferencePipeline<P_IN, P_OUT>

/**
 * Abstract base class for an intermediate pipeline stage or pipeline source
 * stage implementing whose elements are of type {@code U}.
 *
 * @param <P_IN> type of elements in the upstream source
 * @param <P_OUT> type of elements in produced by this stage
 *
 * @since 1.8
 */
