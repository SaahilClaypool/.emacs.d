_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
        MatchTask(MatchTask<P_IN, P_OUT> parent, Spliterator<P_IN> spliterator) {

        /**
         * Constructor for non-root node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
        MatchTask(MatchOp<P_OUT> op, PipelineHelper<P_OUT> helper,
                  Spliterator<P_IN> spliterator) {

        /**
         * Constructor for root node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    @SuppressWarnings("serial")

    /**
     * ForkJoinTask implementation to implement a parallel short-circuiting
     * quantified match
     *
     * @param <P_IN> the type of source elements for the pipeline
     * @param <P_OUT> the type of output elements for the pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    private static abstract class BooleanTerminalSink<T> implements Sink<T> {

    /**
     * Boolean specific terminal sink to avoid the boxing costs when returning
     * results.  Subclasses implement the shape-specific functionality.
     *
     * @param <T> The output type of the stream pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
        MatchOp(StreamShape shape,
                MatchKind matchKind,
                Supplier<BooleanTerminalSink<T>> sinkSupplier) {

        /**
         * Constructs a {@code MatchOp}.
         *
         * @param shape the output shape of the stream pipeline
         * @param matchKind the kind of quantified match (all, any, none)
         * @param sinkSupplier {@code Supplier} for a {@code Sink} of the
         *        appropriate shape which implements the matching operation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    private static final class MatchOp<T> implements TerminalOp<T, Boolean> {

    /**
     * A short-circuiting {@code TerminalOp} that evaluates a predicate on the
     * elements of a stream and determines whether all, any or none of those
     * elements match the predicate.
     *
     * @param <T> the output type of the stream pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    public static TerminalOp<Double, Boolean> makeDouble(DoublePredicate predicate,
                                                         MatchKind matchKind) {

    /**
     * Constructs a quantified predicate matcher for a {@code DoubleStream}.
     *
     * @param predicate the {@code Predicate} to apply to stream elements
     * @param matchKind the kind of quantified match (all, any, none)
     * @return a {@code TerminalOp} implementing the desired quantified match
     *         criteria
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    public static TerminalOp<Long, Boolean> makeLong(LongPredicate predicate,
                                                     MatchKind matchKind) {

    /**
     * Constructs a quantified predicate matcher for a {@code LongStream}.
     *
     * @param predicate the {@code Predicate} to apply to stream elements
     * @param matchKind the kind of quantified match (all, any, none)
     * @return a {@code TerminalOp} implementing the desired quantified match
     *         criteria
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    public static TerminalOp<Integer, Boolean> makeInt(IntPredicate predicate,
                                                       MatchKind matchKind) {

    /**
     * Constructs a quantified predicate matcher for an {@code IntStream}.
     *
     * @param predicate the {@code Predicate} to apply to stream elements
     * @param matchKind the kind of quantified match (all, any, none)
     * @return a {@code TerminalOp} implementing the desired quantified match
     *         criteria
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    public static <T> TerminalOp<T, Boolean> makeRef(Predicate<? super T> predicate,
            MatchKind matchKind) {

    /**
     * Constructs a quantified predicate matcher for a Stream.
     *
     * @param <T> the type of stream elements
     * @param predicate the {@code Predicate} to apply to stream elements
     * @param matchKind the kind of quantified match (all, any, none)
     * @return a {@code TerminalOp} implementing the desired quantified match
     *         criteria
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
        NONE(true, false);

        /** Do no elements match the predicate? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
        ALL(false, false),

        /** Do any elements match the predicate? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
    enum MatchKind {

    /**
     * Enum describing quantified match options -- all match, any match, none
     * match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/MatchOps.java
final class MatchOps {

/**
 * Factory for instances of a short-circuiting {@code TerminalOp} that implement
 * quantified predicate matching on the elements of a stream. Supported variants
 * include match-all, match-any, and match-none.
 *
 * @since 1.8
 */
