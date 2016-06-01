_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/RunnableScheduledFuture.java
    boolean isPeriodic();

    /**
     * Returns {@code true} if this task is periodic. A periodic task may
     * re-run according to some schedule. A non-periodic task can be
     * run only once.
     *
     * @return {@code true} if this task is periodic
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/RunnableScheduledFuture.java
public interface RunnableScheduledFuture<V> extends RunnableFuture<V>, ScheduledFuture<V> {

/**
 * A {@link ScheduledFuture} that is {@link Runnable}. Successful
 * execution of the {@code run} method causes completion of the
 * {@code Future} and allows access to its results.
 * @see FutureTask
 * @see Executor
 * @since 1.6
 * @author Doug Lea
 * @param <V> The result type returned by this Future's {@code get} method
 */
