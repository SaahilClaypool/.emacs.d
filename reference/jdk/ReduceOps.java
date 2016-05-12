_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    @SuppressWarnings("serial")

    /**
     * A {@code ForkJoinTask} for performing a parallel reduce operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
        ReduceOp(StreamShape shape) {

        /**
         * Create a {@code ReduceOp} of the specified stream shape which uses
         * the specified {@code Supplier} to create accumulating sinks.
         *
         * @param shape The shape of the stream pipeline
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    private static abstract class ReduceOp<T, R, S extends AccumulatingSink<T, R, S>>

    /**
     * A {@code TerminalOp} that evaluates a stream pipeline and sends the
     * output into an {@code AccumulatingSink}, which performs a reduce
     * operation. The {@code AccumulatingSink} must represent an associative
     * reducing operation.
     *
     * @param <T> the output type of the stream pipeline
     * @param <R> the result type of the reducing operation
     * @param <S> the type of the {@code AccumulatingSink}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    private static abstract class Box<U> {

    /**
     * State box for a single state element, used as a base class for
     * {@code AccumulatingSink} instances
     *
     * @param <U> The type of the state element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    private interface AccumulatingSink<T, R, K extends AccumulatingSink<T, R, K>>

    /**
     * A type of {@code TerminalSink} that implements an associative reducing
     * operation on elements of type {@code T} and producing a result of type
     * {@code R}.
     *
     * @param <T> the type of input element to the combining operation
     * @param <R> the result type
     * @param <K> the type of the {@code AccumulatingSink}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static <R> TerminalOp<Double, R>

    /**
     * Constructs a {@code TerminalOp} that implements a mutable reduce on
     * {@code double} values.
     *
     * @param <R> the type of the result
     * @param supplier a factory to produce a new accumulator of the result type
     * @param accumulator a function to incorporate an int into an
     *        accumulator
     * @param combiner a function to combine an accumulator into another
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static TerminalOp<Double, OptionalDouble>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * {@code double} values, producing an optional double result.
     *
     * @param operator the combining function
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static TerminalOp<Double, Double>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * {@code double} values.
     *
     * @param identity the identity for the combining function
     * @param operator the combining function
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static <R> TerminalOp<Long, R>

    /**
     * Constructs a {@code TerminalOp} that implements a mutable reduce on
     * {@code long} values.
     *
     * @param <R> the type of the result
     * @param supplier a factory to produce a new accumulator of the result type
     * @param accumulator a function to incorporate an int into an
     *        accumulator
     * @param combiner a function to combine an accumulator into another
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static TerminalOp<Long, OptionalLong>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * {@code long} values, producing an optional long result.
     *
     * @param operator the combining function
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static TerminalOp<Long, Long>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * {@code long} values.
     *
     * @param identity the identity for the combining function
     * @param operator the combining function
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static <R> TerminalOp<Integer, R>

    /**
     * Constructs a {@code TerminalOp} that implements a mutable reduce on
     * {@code int} values.
     *
     * @param <R> The type of the result
     * @param supplier a factory to produce a new accumulator of the result type
     * @param accumulator a function to incorporate an int into an
     *        accumulator
     * @param combiner a function to combine an accumulator into another
     * @return A {@code ReduceOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static TerminalOp<Integer, OptionalInt>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * {@code int} values, producing an optional integer result.
     *
     * @param operator the combining function
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static TerminalOp<Integer, Integer>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * {@code int} values.
     *
     * @param identity the identity for the combining function
     * @param operator the combining function
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static <T, R> TerminalOp<T, R>

    /**
     * Constructs a {@code TerminalOp} that implements a mutable reduce on
     * reference values.
     *
     * @param <T> the type of the input elements
     * @param <R> the type of the result
     * @param seedFactory a factory to produce a new base accumulator
     * @param accumulator a function to incorporate an element into an
     *        accumulator
     * @param reducer a function to combine an accumulator into another
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static <T, I> TerminalOp<T, I>

    /**
     * Constructs a {@code TerminalOp} that implements a mutable reduce on
     * reference values.
     *
     * @param <T> the type of the input elements
     * @param <I> the type of the intermediate reduction result
     * @param collector a {@code Collector} defining the reduction
     * @return a {@code ReduceOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static <T> TerminalOp<T, Optional<T>>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * reference values producing an optional reference result.
     *
     * @param <T> The type of the input elements, and the type of the result
     * @param operator The reducing function
     * @return A {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
    public static <T, U> TerminalOp<T, U>

    /**
     * Constructs a {@code TerminalOp} that implements a functional reduce on
     * reference values.
     *
     * @param <T> the type of the input elements
     * @param <U> the type of the result
     * @param seed the identity element for the reduction
     * @param reducer the accumulating function that incorporates an additional
     *        input element into the result
     * @param combiner the combining function that combines two intermediate
     *        results
     * @return a {@code TerminalOp} implementing the reduction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/ReduceOps.java
final class ReduceOps {

/**
 * Factory for creating instances of {@code TerminalOp} that implement
 * reductions.
 *
 * @since 1.8
 */
