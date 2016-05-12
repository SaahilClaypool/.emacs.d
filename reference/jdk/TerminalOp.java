_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/TerminalOp.java
    <P_IN> R evaluateSequential(PipelineHelper<E_IN> helper,
                                Spliterator<P_IN> spliterator);

    /**
     * Performs a sequential evaluation of the operation using the specified
     * {@code PipelineHelper}, which describes the upstream intermediate
     * operations.
     *
     * @param helper the pipeline helper
     * @param spliterator the source spliterator
     * @return the result of the evaluation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/TerminalOp.java
    default <P_IN> R evaluateParallel(PipelineHelper<E_IN> helper,
                                      Spliterator<P_IN> spliterator) {

    /**
     * Performs a parallel evaluation of the operation using the specified
     * {@code PipelineHelper}, which describes the upstream intermediate
     * operations.
     *
     * @implSpec The default performs a sequential evaluation of the operation
     * using the specified {@code PipelineHelper}.
     *
     * @param helper the pipeline helper
     * @param spliterator the source spliterator
     * @return the result of the evaluation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/TerminalOp.java
    default int getOpFlags() { return 0; }

    /**
     * Gets the stream flags of the operation.  Terminal operations may set a
     * limited subset of the stream flags defined in {@link StreamOpFlag}, and
     * these flags are combined with the previously combined stream and
     * intermediate operation flags for the pipeline.
     *
     * @implSpec The default implementation returns zero.
     *
     * @return the stream flags for this operation
     * @see StreamOpFlag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/TerminalOp.java
interface TerminalOp<E_IN, R> {

/**
 * An operation in a stream pipeline that takes a stream as input and produces
 * a result or side-effect.  A {@code TerminalOp} has an input type and stream
 * shape, and a result type.  A {@code TerminalOp} also has a set of
 * <em>operation flags</em> that describes how the operation processes elements
 * of the stream (such as short-circuiting or respecting encounter order; see
 * {@link StreamOpFlag}).
 *
 * <p>A {@code TerminalOp} must provide a sequential and parallel implementation
 * of the operation relative to a given stream source and set of intermediate
 * operations.
 *
 * @param <E_IN> the type of input elements
 * @param <R>    the type of the result
 * @since 1.8
 */
