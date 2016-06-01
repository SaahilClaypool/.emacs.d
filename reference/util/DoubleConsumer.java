_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//function/DoubleConsumer.java
    default DoubleConsumer andThen(DoubleConsumer after) {

    /**
     * Returns a composed {@code DoubleConsumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code DoubleConsumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//function/DoubleConsumer.java
    void accept(double value);

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//function/DoubleConsumer.java
@FunctionalInterface

/**
 * Represents an operation that accepts a single {@code double}-valued argument and
 * returns no result.  This is the primitive type specialization of
 * {@link Consumer} for {@code double}.  Unlike most other functional interfaces,
 * {@code DoubleConsumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(double)}.
 *
 * @see Consumer
 * @since 1.8
 */
