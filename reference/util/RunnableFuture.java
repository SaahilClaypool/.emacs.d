_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/RunnableFuture.java
    void run();

    /**
     * Sets this Future to the result of its computation
     * unless it has been cancelled.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/RunnableFuture.java
public interface RunnableFuture<V> extends Runnable, Future<V> {

/**
 * A {@link Future} that is {@link Runnable}. Successful execution of
 * the {@code run} method causes completion of the {@code Future}
 * and allows access to its results.
 * @see FutureTask
 * @see Executor
 * @since 1.6
 * @author Doug Lea
 * @param <V> The result type returned by this Future's {@code get} method
 */
