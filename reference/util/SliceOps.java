_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
        private long completedSize(long target) {

        /**
         * Compute the number of completed elements in this node.
         * <p>
         * Computation terminates if all nodes have been processed or the
         * number of completed elements is greater than or equal to the target
         * size.
         *
         * @param target the target size
         * @return return the number of completed elements
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
        private boolean isLeftCompleted(long target) {

        /**
         * Determine if the number of completed elements in this node and nodes
         * to the left of this node is greater than or equal to the target size.
         *
         * @param target the target size
         * @return true if the number of elements is greater than or equal to
         *         the target size, otherwise false.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    @SuppressWarnings("serial")

    /**
     * {@code ForkJoinTask} implementing slice computation.
     *
     * @param <P_IN> Input element type to the stream pipeline
     * @param <P_OUT> Output element type from the stream pipeline
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    public static DoubleStream makeDouble(AbstractPipeline<?, Double, ?> upstream,
                                          long skip, long limit) {

    /**
     * Appends a "slice" operation to the provided DoubleStream.  The slice
     * operation may be may be skip-only, limit-only, or skip-and-limit.
     *
     * @param upstream A DoubleStream
     * @param skip The number of elements to skip.  Must be >= 0.
     * @param limit The maximum size of the resulting stream, or -1 if no limit
     *        is to be imposed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    public static LongStream makeLong(AbstractPipeline<?, Long, ?> upstream,
                                      long skip, long limit) {

    /**
     * Appends a "slice" operation to the provided LongStream.  The slice
     * operation may be may be skip-only, limit-only, or skip-and-limit.
     *
     * @param upstream A LongStream
     * @param skip The number of elements to skip.  Must be >= 0.
     * @param limit The maximum size of the resulting stream, or -1 if no limit
     *        is to be imposed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    public static IntStream makeInt(AbstractPipeline<?, Integer, ?> upstream,
                                    long skip, long limit) {

    /**
     * Appends a "slice" operation to the provided IntStream.  The slice
     * operation may be may be skip-only, limit-only, or skip-and-limit.
     *
     * @param upstream An IntStream
     * @param skip The number of elements to skip.  Must be >= 0.
     * @param limit The maximum size of the resulting stream, or -1 if no limit
     *        is to be imposed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    public static <T> Stream<T> makeRef(AbstractPipeline<?, T, ?> upstream,
                                        long skip, long limit) {

    /**
     * Appends a "slice" operation to the provided stream.  The slice operation
     * may be may be skip-only, limit-only, or skip-and-limit.
     *
     * @param <T> the type of both input and output elements
     * @param upstream a reference stream with element type T
     * @param skip the number of elements to skip.  Must be >= 0.
     * @param limit the maximum size of the resulting stream, or -1 if no limit
     *        is to be imposed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    @SuppressWarnings("unchecked")

    /**
     * Creates a slice spliterator given a stream shape governing the
     * spliterator type.  Requires that the underlying Spliterator
     * be SUBSIZED.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    private static long calcSliceFence(long skip, long limit) {

    /**
     * Calculates the slice fence, which is one past the index of the slice
     * range
     * @param skip the number of elements to skip, assumed to be >= 0
     * @param limit the number of elements to limit, assumed to be >= 0, with
     *        a value of {@code Long.MAX_VALUE} if there is no limit
     * @return the slice fence.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
    private static long calcSize(long size, long skip, long limit) {

    /**
     * Calculates the sliced size given the current size, number of elements
     * skip, and the number of elements to limit.
     *
     * @param size the current size
     * @param skip the number of elements to skip, assumed to be >= 0
     * @param limit the number of elements to limit, assumed to be >= 0, with
     *        a value of {@code Long.MAX_VALUE} if there is no limit
     * @return the sliced size
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/SliceOps.java
final class SliceOps {

/**
 * Factory for instances of a short-circuiting stateful intermediate operations
 * that produce subsequences of their input stream.
 *
 * @since 1.8
 */
