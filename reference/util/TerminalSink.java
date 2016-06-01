_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/TerminalSink.java
interface TerminalSink<T, R> extends Sink<T>, Supplier<R> { }

/**
 * A {@link Sink} which accumulates state as elements are accepted, and allows
 * a result to be retrieved after the computation is finished.
 *
 * @param <T> the type of elements to be accepted
 * @param <R> the type of the result
 *
 * @since 1.8
 */
