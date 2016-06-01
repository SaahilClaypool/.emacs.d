_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//function/ObjDoubleConsumer.java
    void accept(T t, double value);

    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param value the second input argument
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//function/ObjDoubleConsumer.java
@FunctionalInterface

/**
 * Represents an operation that accepts an object-valued and a
 * {@code double}-valued argument, and returns no result.  This is the
 * {@code (reference, double)} specialization of {@link BiConsumer}.
 * Unlike most other functional interfaces, {@code ObjDoubleConsumer} is
 * expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, double)}.
 *
 * @param <T> the type of the object argument to the operation
 *
 * @see BiConsumer
 * @since 1.8
 */