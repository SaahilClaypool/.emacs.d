_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
    @SuppressWarnings("serial")

    /**
     * {@code ForkJoinTask} implementing parallel short-circuiting search
     * @param <P_IN> Input element type to the stream pipeline
     * @param <P_OUT> Output element type from the stream pipeline
     * @param <O> Result type from the find operation
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
        static final class OfDouble extends FindSink<Double, OptionalDouble>

        /** Specialization of {@code FindSink} for double streams */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
        static final class OfLong extends FindSink<Long, OptionalLong>

        /** Specialization of {@code FindSink} for long streams */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
        static final class OfInt extends FindSink<Integer, OptionalInt>

        /** Specialization of {@code FindSink} for int streams */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
        static final class OfRef<T> extends FindSink<T, Optional<T>> {

        /** Specialization of {@code FindSink} for reference streams */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
    private static abstract class FindSink<T, O> implements TerminalSink<T, O> {

    /**
     * Implementation of @{code TerminalSink} that implements the find
     * functionality, requesting cancellation when something has been found
     *
     * @param <T> The type of input element
     * @param <O> The result type, typically an optional type
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
        FindOp(boolean mustFindFirst,
                       StreamShape shape,
                       O emptyValue,
                       Predicate<O> presentPredicate,
                       Supplier<TerminalSink<T, O>> sinkSupplier) {

        /**
         * Constructs a {@code FindOp}.
         *
         * @param mustFindFirst if true, must find the first element in
         *        encounter order, otherwise can find any element
         * @param shape stream shape of elements to search
         * @param emptyValue result value corresponding to "found nothing"
         * @param presentPredicate {@code Predicate} on result value
         *        corresponding to "found something"
         * @param sinkSupplier supplier for a {@code TerminalSink} implementing
         *        the matching functionality
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
    private static final class FindOp<T, O> implements TerminalOp<T, O> {

    /**
     * A short-circuiting {@code TerminalOp} that searches for an element in a
     * stream pipeline, and terminates when it finds one.  Implements both
     * find-first (find the first element in the encounter order) and find-any
     * (find any element, may not be the first in encounter order.)
     *
     * @param <T> the output type of the stream pipeline
     * @param <O> the result type of the find operation, typically an optional
     *        type
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
    public static TerminalOp<Double, OptionalDouble> makeDouble(boolean mustFindFirst) {

    /**
     * Constructs a {@code FindOp} for streams of doubles.
     *
     * @param mustFindFirst whether the {@code TerminalOp} must produce the
     *        first element in the encounter order
     * @return a {@code TerminalOp} implementing the find operation
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
    public static TerminalOp<Long, OptionalLong> makeLong(boolean mustFindFirst) {

    /**
     * Constructs a {@code TerminalOp} for streams of longs.
     *
     * @param mustFindFirst whether the {@code TerminalOp} must produce the
     *        first element in the encounter order
     * @return a {@code TerminalOp} implementing the find operation
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
    public static TerminalOp<Integer, OptionalInt> makeInt(boolean mustFindFirst) {

    /**
     * Constructs a {@code TerminalOp} for streams of ints.
     *
     * @param mustFindFirst whether the {@code TerminalOp} must produce the
     *        first element in the encounter order
     * @return a {@code TerminalOp} implementing the find operation
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
    public static <T> TerminalOp<T, Optional<T>> makeRef(boolean mustFindFirst) {

    /**
     * Constructs a {@code TerminalOp} for streams of objects.
     *
     * @param <T> the type of elements of the stream
     * @param mustFindFirst whether the {@code TerminalOp} must produce the
     *        first element in the encounter order
     * @return a {@code TerminalOp} implementing the find operation
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/FindOps.java
final class FindOps {

/**
 * Factory for instances of a short-circuiting {@code TerminalOp} that searches
 * for an element in a stream pipeline, and terminates when it finds one.
 * Supported variants include find-first (find the first element in the
 * encounter order) and find-any (find any element, may not be the first in
 * encounter order.)
 *
 * @since 1.8
 */
