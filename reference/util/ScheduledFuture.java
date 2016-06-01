_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledFuture.java
public interface ScheduledFuture<V> extends Delayed, Future<V> {

/**
 * A delayed result-bearing action that can be cancelled.
 * Usually a scheduled future is the result of scheduling
 * a task with a {@link ScheduledExecutorService}.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <V> The result type returned by this Future
 */
