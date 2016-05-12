_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
    static abstract class InfiniteSupplyingSpliterator<T> implements Spliterator<T> {

    /**
     * A Spliterator that infinitely supplies elements in no particular order.
     *
     * <p>Splitting divides the estimated size in two and stops when the
     * estimate size is 0.
     *
     * <p>The {@code forEachRemaining} method if invoked will never terminate.
     * The {@code tryAdvance} method always returns true.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
    static final class DistinctSpliterator<T> implements Spliterator<T>, Consumer<T> {

    /**
     * A wrapping spliterator that only reports distinct elements of the
     * underlying spliterator. Does not preserve size and encounter order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        static abstract class OfPrimitive<

        /**
         * Concrete sub-types must also be an instance of type {@code T_CONS}.
         *
         * @param <T_BUFF> the type of the spined buffer. Must also be a type of
         *        {@code T_CONS}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        protected final PermitStatus permitStatus() {

        /** Call to check if permits might be available before acquiring data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        protected final long acquirePermits(long numElements) {

        /**
         * Acquire permission to skip or process elements.  The caller must
         * first acquire the elements, then consult this method for guidance
         * as to what to do with the data.
         *
         * <p>We use an {@code AtomicLong} to atomically maintain a counter,
         * which is initialized as skip+limit if we are limiting, or skip only
         * if we are not limiting.  The user should consult the method
         * {@code checkPermits()} before acquiring data elements.
         *
         * @param numElements the number of elements the caller has in hand
         * @return the number of elements that should be processed; any
         * remaining elements should be discarded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
    static abstract class UnorderedSliceSpliterator<T, T_SPLITR extends Spliterator<T>> {

    /**
     * A slice Spliterator that does not preserve order, if any, of a source
     * Spliterator.
     *
     * Note: The source spliterator may report {@code ORDERED} since that
     * spliterator be the result of a previous pipeline stage that was
     * collected to a {@code Node}. It is the order of the pipeline stage
     * that governs whether the this slice spliterator is to be used or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
    static abstract class SliceSpliterator<T, T_SPLITR extends Spliterator<T>> {

    /**
     * A slice Spliterator from a source Spliterator that reports
     * {@code SUBSIZED}.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
    static class DelegatingSpliterator<T, T_SPLITR extends Spliterator<T>>

    /**
     * Spliterator implementation that delegates to an underlying spliterator,
     * acquiring the spliterator from a {@code Supplier<Spliterator>} on the
     * first call to any spliterator method.
     * @param <T>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        private boolean fillBuffer() {

        /**
         * If the buffer is empty, push elements into the sink chain until
         * the source is empty or cancellation is requested.
         * @return whether there are elements to consume from the buffer
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        abstract void initPartialTraversalState();

        /**
         * Initializes buffer, sink chain, and pusher for a shape-specific
         * implementation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        abstract AbstractWrappingSpliterator<P_IN, P_OUT, ?> wrap(Spliterator<P_IN> s);

        /**
         * Invokes the shape-specific constructor with the provided arguments
         * and returns the result.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        final boolean doAdvance() {

        /**
         * Get an element from the source, pushing it into the sink chain,
         * setting up the buffer if needed
         * @return whether there are elements to consume from the buffer
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        final void init() {

        /**
         * Called before advancing to set up spliterator, if needed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        AbstractWrappingSpliterator(PipelineHelper<P_OUT> ph,
                                    Spliterator<P_IN> spliterator,
                                    boolean parallel) {

        /**
         * Construct an AbstractWrappingSpliterator from a
         * {@code Spliterator}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        AbstractWrappingSpliterator(PipelineHelper<P_OUT> ph,
                                    Supplier<Spliterator<P_IN>> spliteratorSupplier,
                                    boolean parallel) {

        /**
         * Construct an AbstractWrappingSpliterator from a
         * {@code Supplier<Spliterator>}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        boolean finished;

        /**
         * True if full traversal has occurred (with possible cancelation).
         * If doing a partial traversal, there may be still elements in buffer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        T_BUFFER buffer;

        /** Buffer into which elements are pushed.  Used during partial traversal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        long nextToConsume;

        /** Next element to consume from the buffer, used during partial traversal */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        BooleanSupplier pusher;

        /**
         * A function that advances one element of the spliterator, pushing
         * it to bufferSink.  Returns whether any elements were processed.
         * Used during partial traversal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        Sink<P_IN> bufferSink;

        /**
         * Sink chain for the downstream stages of the pipeline, ultimately
         * leading to the buffer. Used during partial traversal.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        Spliterator<P_IN> spliterator;

        /**
         * Source spliterator.  Either provided from client or obtained from
         * supplier.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        private Supplier<Spliterator<P_IN>> spliteratorSupplier;

        /**
         * Supplier for the source spliterator.  Client provides either a
         * spliterator or a supplier.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
        final boolean isParallel;

        /**
         * True if this spliterator supports splitting
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
    private static abstract class AbstractWrappingSpliterator<P_IN, P_OUT,

    /**
     * Abstract wrapping spliterator that binds to the spliterator of a
     * pipeline helper on first operation.
     *
     * <p>This spliterator is not late-binding and will bind to the source
     * spliterator when first operated on.
     *
     * <p>A wrapping spliterator produced from a sequential stream
     * cannot be split if there are stateful operations present.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamSpliterators.java
class StreamSpliterators {

/**
 * Spliterator implementations for wrapping and delegating spliterators, used
 * in the implementation of the {@link Stream#spliterator()} method.
 *
 * @since 1.8
 */
