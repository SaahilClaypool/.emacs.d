_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a {@code Spliterator} describing a parallel evaluation of the
     * operation, using the specified {@code PipelineHelper} which describes the
     * upstream intermediate operations.  Only called on stateful operations.
     * It is not necessary (though acceptable) to do a full computation of the
     * result here; it is preferable, if possible, to describe the result via a
     * lazily evaluated spliterator.
     *
     * @implSpec The default implementation behaves as if:
     * <pre>{@code
     *     return evaluateParallel(helper, i -> (E_OUT[]) new
     * Object[i]).spliterator();
     * }</pre>
     * and is suitable for implementations that cannot do better than a full
     * synchronous evaluation.
     *
     * @param helper the pipeline helper
     * @param spliterator the source {@code Spliterator}
     * @return a {@code Spliterator} describing the result of the evaluation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    <P_IN> Node<E_OUT> opEvaluateParallel(PipelineHelper<E_OUT> helper,
                                          Spliterator<P_IN> spliterator,
                                          IntFunction<E_OUT[]> generator) {

    /**
     * Performs a parallel evaluation of the operation using the specified
     * {@code PipelineHelper} which describes the upstream intermediate
     * operations.  Only called on stateful operations.  If {@link
     * #opIsStateful()} returns true then implementations must override the
     * default implementation.
     *
     * @implSpec The default implementation always throw
     * {@code UnsupportedOperationException}.
     *
     * @param helper the pipeline helper describing the pipeline stages
     * @param spliterator the source {@code Spliterator}
     * @param generator the array generator
     * @return a {@code Node} describing the result of the evaluation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    abstract Sink<E_IN> opWrapSink(int flags, Sink<E_OUT> sink);

    /**
     * Accepts a {@code Sink} which will receive the results of this operation,
     * and return a {@code Sink} which accepts elements of the input type of
     * this operation and which performs the operation, passing the results to
     * the provided {@code Sink}.
     *
     * @apiNote
     * The implementation may use the {@code flags} parameter to optimize the
     * sink wrapping.  For example, if the input is already {@code DISTINCT},
     * the implementation for the {@code Stream#distinct()} method could just
     * return the sink it was passed.
     *
     * @param flags The combined stream and operation flags up to, but not
     *        including, this operation
     * @param sink sink to which elements should be sent after processing
     * @return a sink which accepts elements, perform the operation upon
     *         each element, and passes the results (if any) to the provided
     *         {@code Sink}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    abstract boolean opIsStateful();

    /**
     * Returns whether this operation is stateful or not.  If it is stateful,
     * then the method
     * {@link #opEvaluateParallel(PipelineHelper, java.util.Spliterator, java.util.function.IntFunction)}
     * must be overridden.
     *
     * @return {@code true} if this operation is stateful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @Override

    /**
     * Make a node builder compatible with this stream shape.
     *
     * @param exactSizeIfKnown if {@literal >=0}, then a node builder will be
     * created that has a fixed capacity of at most sizeIfKnown elements. If
     * {@literal < 0}, then the node builder has an unfixed capacity. A fixed
     * capacity node builder will throw exceptions if an element is added after
     * builder has reached capacity, or is built before the builder has reached
     * capacity.
     *
     * @param generator the array generator to be used to create instances of a
     * T[] array. For implementations supporting primitive nodes, this parameter
     * may be ignored.
     * @return a node builder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    abstract void forEachWithCancel(Spliterator<E_OUT> spliterator, Sink<E_OUT> sink);

    /**
     * Traverse the elements of a spliterator compatible with this stream shape,
     * pushing those elements into a sink.   If the sink requests cancellation,
     * no further elements will be pulled or pushed.
     *
     * @param spliterator the spliterator to pull elements from
     * @param sink the sink to push elements to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    abstract Spliterator<E_OUT> lazySpliterator(Supplier<? extends Spliterator<E_OUT>> supplier);

    /**
     * Create a lazy spliterator that wraps and obtains the supplied the
     * spliterator when a method is invoked on the lazy spliterator.
     * @param supplier the supplier of a spliterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    abstract <P_IN> Spliterator<E_OUT> wrap(PipelineHelper<E_OUT> ph,
                                            Supplier<Spliterator<P_IN>> supplier,
                                            boolean isParallel);

    /**
     * Create a spliterator that wraps a source spliterator, compatible with
     * this stream shape, and operations associated with a {@link
     * PipelineHelper}.
     *
     * @param ph the pipeline helper describing the pipeline stages
     * @param supplier the supplier of a spliterator
     * @return a wrapping spliterator compatible with this shape
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    abstract <P_IN> Node<E_OUT> evaluateToNode(PipelineHelper<E_OUT> helper,
                                               Spliterator<P_IN> spliterator,
                                               boolean flattenTree,
                                               IntFunction<E_OUT[]> generator);

    /**
     * Collect elements output from a pipeline into a Node that holds elements
     * of this shape.
     *
     * @param helper the pipeline helper describing the pipeline stages
     * @param spliterator the source spliterator
     * @param flattenTree true if the returned node should be flattened
     * @param generator the array generator
     * @return a Node holding the output of the pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    abstract StreamShape getOutputShape();

    /**
     * Get the output shape of the pipeline.  If the pipeline is the head,
     * then it's output shape corresponds to the shape of the source.
     * Otherwise, it's output shape corresponds to the output shape of the
     * associated operation.
     *
     * @return the output shape
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @SuppressWarnings("unchecked")

    /**
     * Get the source spliterator for this pipeline stage.  For a sequential or
     * stateless parallel pipeline, this is the source spliterator.  For a
     * stateful parallel pipeline, this is a spliterator describing the results
     * of all computations up to and including the most recent stateful
     * operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    final int getStreamFlags() {

    /**
     * Returns the composition of stream flags of the stream source and all
     * intermediate operations.
     *
     * @return the composition of stream flags of the stream source and all
     *         intermediate operations
     * @see StreamOpFlag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @SuppressWarnings("unchecked")

    /**
     * Gets the source stage spliterator if this pipeline stage is the source
     * stage.  The pipeline is consumed after this method is called and
     * returns successfully.
     *
     * @return the source stage spliterator
     * @throws IllegalStateException if this pipeline stage is not the source
     *         stage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @SuppressWarnings("unchecked")

    /**
     * Collect the elements output from the pipeline stage.
     *
     * @param generator the array generator to be used to create array instances
     * @return a flat array-backed Node that holds the collected output elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    final <R> R evaluate(TerminalOp<E_OUT, R> terminalOp) {

    /**
     * Evaluate the pipeline with a terminal operation to produce a result.
     *
     * @param <R> the type of result
     * @param terminalOp the terminal operation to be applied to the pipeline.
     * @return the result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    AbstractPipeline(AbstractPipeline<?, E_IN, ?> previousStage, int opFlags) {

    /**
     * Constructor for appending an intermediate operation stage onto an
     * existing pipeline.
     *
     * @param previousStage the upstream pipeline stage
     * @param opFlags the operation flags for the new stage, described in
     * {@link StreamOpFlag}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    AbstractPipeline(Spliterator<?> source,
                     int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Spliterator} describing the stream source
     * @param sourceFlags the source flags for the stream source, described in
     * {@link StreamOpFlag}
     * @param parallel {@code true} if the pipeline is parallel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    AbstractPipeline(Supplier<? extends Spliterator<?>> source,
                     int sourceFlags, boolean parallel) {

    /**
     * Constructor for the head of a stream pipeline.
     *
     * @param source {@code Supplier<Spliterator>} describing the stream source
     * @param sourceFlags The source flags for the stream source, described in
     * {@link StreamOpFlag}
     * @param parallel True if the pipeline is parallel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    private boolean parallel;

    /**
     * True if pipeline is parallel, otherwise the pipeline is sequential; only
     * valid for the source stage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    private boolean sourceAnyStateful;

    /**
     * True if there are any stateful ops in the pipeline; only valid for the
     * source stage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    private boolean linkedOrConsumed;

    /**
     * True if this pipeline has been linked or consumed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    private Supplier<? extends Spliterator<?>> sourceSupplier;

    /**
     * The source supplier. Only valid for the head pipeline. Before the
     * pipeline is consumed if non-null then {@code sourceSpliterator} must be
     * null. After the pipeline is consumed if non-null then is set to null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    private Spliterator<?> sourceSpliterator;

    /**
     * The source spliterator. Only valid for the head pipeline.
     * Before the pipeline is consumed if non-null then {@code sourceSupplier}
     * must be null. After the pipeline is consumed if non-null then is set to
     * null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    private int combinedFlags;

    /**
     * The combined source and operation flags for the source and all operations
     * up to and including the operation represented by this pipeline object.
     * Valid at the point of pipeline preparation for evaluation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    private int depth;

    /**
     * The number of intermediate operations between this pipeline object
     * and the stream source if sequential, or the previous stateful if parallel.
     * Valid at the point of pipeline preparation for evaluation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @SuppressWarnings("rawtypes")

    /**
     * The next stage in the pipeline, or null if this is the last stage.
     * Effectively final at the point of linking to the next pipeline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    protected final int sourceOrOpFlags;

    /**
     * The operation flags for the intermediate operation represented by this
     * pipeline object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @SuppressWarnings("rawtypes")

    /**
     * The "upstream" pipeline, or null if this is the source stage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
    @SuppressWarnings("rawtypes")

    /**
     * Backlink to the head of the pipeline chain (self if this is the source
     * stage).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractPipeline.java
abstract class AbstractPipeline<E_IN, E_OUT, S extends BaseStream<E_OUT, S>>

/**
 * Abstract base class for "pipeline" classes, which are the core
 * implementations of the Stream interface and its primitive specializations.
 * Manages construction and evaluation of stream pipelines.
 *
 * <p>An {@code AbstractPipeline} represents an initial portion of a stream
 * pipeline, encapsulating a stream source and zero or more intermediate
 * operations.  The individual {@code AbstractPipeline} objects are often
 * referred to as <em>stages</em>, where each stage describes either the stream
 * source or an intermediate operation.
 *
 * <p>A concrete intermediate stage is generally built from an
 * {@code AbstractPipeline}, a shape-specific pipeline class which extends it
 * (e.g., {@code IntPipeline}) which is also abstract, and an operation-specific
 * concrete class which extends that.  {@code AbstractPipeline} contains most of
 * the mechanics of evaluating the pipeline, and implements methods that will be
 * used by the operation; the shape-specific classes add helper methods for
 * dealing with collection of results into the appropriate shape-specific
 * containers.
 *
 * <p>After chaining a new intermediate operation, or executing a terminal
 * operation, the stream is considered to be consumed, and no more intermediate
 * or terminal operations are permitted on this stream instance.
 *
 * @implNote
 * <p>For sequential streams, and parallel streams without
 * <a href="package-summary.html#StreamOps">stateful intermediate
 * operations</a>, parallel streams, pipeline evaluation is done in a single
 * pass that "jams" all the operations together.  For parallel streams with
 * stateful operations, execution is divided into segments, where each
 * stateful operations marks the end of a segment, and each segment is
 * evaluated separately and the result used as the input to the next
 * segment.  In all cases, the source data is not consumed until a terminal
 * operation begins.
 *
 * @param <E_IN>  type of input elements
 * @param <E_OUT> type of output elements
 * @param <S> type of the subclass implementing {@code BaseStream}
 * @since 1.8
 */
