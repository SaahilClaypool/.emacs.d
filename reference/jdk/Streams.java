_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
    static Runnable composedClose(BaseStream<?, ?> a, BaseStream<?, ?> b) {

    /**
     * Given two streams, return a Runnable that
     * executes both of their {@link BaseStream#close} methods in sequence,
     * even if the first throws an exception, and if both throw exceptions, add
     * any exceptions thrown by the second as suppressed exceptions of the first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
    static Runnable composeWithExceptions(Runnable a, Runnable b) {

    /**
     * Given two Runnables, return a Runnable that executes both in sequence,
     * even if the first throws an exception, and if both throw exceptions, add
     * any exceptions thrown by the second as suppressed exceptions of the first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        DoubleStreamBuilderImpl(double t) {

        /**
         * Constructor for a singleton stream.
         *
         * @param t the single element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        DoubleStreamBuilderImpl() { }

        /**
         * Constructor for building a stream of 0 or more elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        LongStreamBuilderImpl(long t) {

        /**
         * Constructor for a singleton stream.
         *
         * @param t the single element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        LongStreamBuilderImpl() { }

        /**
         * Constructor for building a stream of 0 or more elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        IntStreamBuilderImpl(int t) {

        /**
         * Constructor for a singleton stream.
         *
         * @param t the single element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        IntStreamBuilderImpl() { }

        /**
         * Constructor for building a stream of 0 or more elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        StreamBuilderImpl(T t) {

        /**
         * Constructor for a singleton stream.
         *
         * @param t the single element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        StreamBuilderImpl() { }

        /**
         * Constructor for building a stream of 0 or more elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        private static final long RIGHT_BALANCED_SPLIT_RATIO = 1 << 3;

        /**
         * The split ratio of the left and right split when the spliterator
         * size is above BALANCED_SPLIT_THRESHOLD.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        private static final long BALANCED_SPLIT_THRESHOLD = 1 << 24;

        /**
         * The spliterator size below which the spliterator will be split
         * at the mid-point to produce balanced splits. Above this size the
         * spliterator will be split at a ratio of
         * 1:(RIGHT_BALANCED_SPLIT_RATIO - 1)
         * to produce right-balanced splits.
         *
         * <p>Such splitting ensures that for very large ranges that the left
         * side of the range will more likely be processed at a lower-depth
         * than a balanced tree at the expense of a higher-depth for the right
         * side of the range.
         *
         * <p>This is optimized for cases such as LongStream.longs() that is
         * implemented as range of 0 to Long.MAX_VALUE but is likely to be
         * augmented with a limit operation that limits the number of elements
         * to a count lower than this threshold.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
    static final class RangeLongSpliterator implements Spliterator.OfLong {

    /**
     * A {@code long} range spliterator.
     *
     * This implementation cannot be used for ranges whose size is greater
     * than Long.MAX_VALUE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        private static final int RIGHT_BALANCED_SPLIT_RATIO = 1 << 3;

        /**
         * The split ratio of the left and right split when the spliterator
         * size is above BALANCED_SPLIT_THRESHOLD.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
        private static final int BALANCED_SPLIT_THRESHOLD = 1 << 24;

        /**
         * The spliterator size below which the spliterator will be split
         * at the mid-point to produce balanced splits. Above this size the
         * spliterator will be split at a ratio of
         * 1:(RIGHT_BALANCED_SPLIT_RATIO - 1)
         * to produce right-balanced splits.
         *
         * <p>Such splitting ensures that for very large ranges that the left
         * side of the range will more likely be processed at a lower-depth
         * than a balanced tree at the expense of a higher-depth for the right
         * side of the range.
         *
         * <p>This is optimized for cases such as IntStream.ints() that is
         * implemented as range of 0 to Integer.MAX_VALUE but is likely to be
         * augmented with a limit operation that limits the number of elements
         * to a count lower than this threshold.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
    static final class RangeIntSpliterator implements Spliterator.OfInt {

    /**
     * An {@code int} range spliterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
    static final Object NONE = new Object();

    /**
     * An object instance representing no value, that cannot be an actual
     * data element of a stream.  Used when processing streams that can contain
     * {@code null} elements to distinguish between a {@code null} value and no
     * value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Streams.java
final class Streams {

/**
 * Utility methods for operating on and creating streams.
 *
 * <p>Unless otherwise stated, streams are created as sequential streams.  A
 * sequential stream can be transformed into a parallel stream by calling the
 * {@code parallel()} method on the created stream.
 *
 * @since 1.8
 */
