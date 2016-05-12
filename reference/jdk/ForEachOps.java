_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
    @SuppressWarnings("serial")

    /**
     * A {@code ForkJoinTask} for performing a parallel for-each operation
     * which visits the elements in encounter order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
    @SuppressWarnings("serial")

    /** A {@code ForkJoinTask} for performing a parallel for-each operation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
        static final class OfDouble extends ForEachOp<Double>

        /** Implementation class for {@code DoubleStream} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
        static final class OfLong extends ForEachOp<Long>

        /** Implementation class for {@code LongStream} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
        static final class OfInt extends ForEachOp<Integer>

        /** Implementation class for {@code IntStream} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
        static final class OfRef<T> extends ForEachOp<T> {

        /** Implementation class for reference streams */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
    static abstract class ForEachOp<T>

    /**
     * A {@code TerminalOp} that evaluates a stream pipeline and sends the
     * output to itself as a {@code TerminalSink}.  Elements will be sent in
     * whatever thread they become available.  If the traversal is unordered,
     * they will be sent independent of the stream's encounter order.
     *
     * <p>This terminal operation is stateless.  For parallel evaluation, each
     * leaf instance of a {@code ForEachTask} will send elements to the same
     * {@code TerminalSink} reference that is an instance of this class.
     *
     * @param <T> the output type of the stream pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
    public static TerminalOp<Double, Void> makeDouble(DoubleConsumer action,
                                                      boolean ordered) {

    /**
     * Constructs a {@code TerminalOp} that perform an action for every element
     * of a {@code DoubleStream}.
     *
     * @param action the {@code DoubleConsumer} that receives all elements of
     *        a stream
     * @param ordered whether an ordered traversal is requested
     * @return the {@code TerminalOp} instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
    public static TerminalOp<Long, Void> makeLong(LongConsumer action,
                                                  boolean ordered) {

    /**
     * Constructs a {@code TerminalOp} that perform an action for every element
     * of a {@code LongStream}.
     *
     * @param action the {@code LongConsumer} that receives all elements of a
     *        stream
     * @param ordered whether an ordered traversal is requested
     * @return the {@code TerminalOp} instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
    public static TerminalOp<Integer, Void> makeInt(IntConsumer action,
                                                    boolean ordered) {

    /**
     * Constructs a {@code TerminalOp} that perform an action for every element
     * of an {@code IntStream}.
     *
     * @param action the {@code IntConsumer} that receives all elements of a
     *        stream
     * @param ordered whether an ordered traversal is requested
     * @return the {@code TerminalOp} instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
    public static <T> TerminalOp<T, Void> makeRef(Consumer<? super T> action,
                                                  boolean ordered) {

    /**
     * Constructs a {@code TerminalOp} that perform an action for every element
     * of a stream.
     *
     * @param action the {@code Consumer} that receives all elements of a
     *        stream
     * @param ordered whether an ordered traversal is requested
     * @param <T> the type of the stream elements
     * @return the {@code TerminalOp} instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ForEachOps.java
final class ForEachOps {

/**
 * Factory for creating instances of {@code TerminalOp} that perform an
 * action for every element of a stream.  Supported variants include unordered
 * traversal (elements are provided to the {@code Consumer} as soon as they are
 * available), and ordered traversal (elements are provided to the
 * {@code Consumer} in encounter order.)
 *
 * <p>Elements are provided to the {@code Consumer} on whatever thread and
 * whatever order they become available.  For ordered traversals, it is
 * guaranteed that processing an element <em>happens-before</em> processing
 * subsequent elements in the encounter order.
 *
 * <p>Exceptions occurring as a result of sending an element to the
 * {@code Consumer} will be relayed to the caller and traversal will be
 * prematurely terminated.
 *
 * @since 1.8
 */
