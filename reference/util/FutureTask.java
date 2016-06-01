_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private void removeWaiter(WaitNode node) {

    /**
     * Tries to unlink a timed-out or interrupted wait node to avoid
     * accumulating garbage.  Internal nodes are simply unspliced
     * without CAS since it is harmless if they are traversed anyway
     * by releasers.  To avoid effects of unsplicing from already
     * removed nodes, the list is retraversed in case of an apparent
     * race.  This is slow when there are a lot of nodes, but we don't
     * expect lists to be long enough to outweigh higher-overhead
     * schemes.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private int awaitDone(boolean timed, long nanos)

    /**
     * Awaits completion or aborts on interrupt or timeout.
     *
     * @param timed true if use timed waits
     * @param nanos time to wait, if timed
     * @return state upon completion
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private void finishCompletion() {

    /**
     * Removes and signals all waiting threads, invokes done(), and
     * nulls out callable.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    static final class WaitNode {

    /**
     * Simple linked list nodes to record waiting threads in a Treiber
     * stack.  See other classes such as Phaser and SynchronousQueue
     * for more detailed explanation.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private void handlePossibleCancellationInterrupt(int s) {

    /**
     * Ensures that any interrupt from a possible cancel(true) is only
     * delivered to a task while in run or runAndReset.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    protected boolean runAndReset() {

    /**
     * Executes the computation without setting its result, and then
     * resets this future to initial state, failing to do so if the
     * computation encounters an exception or is cancelled.  This is
     * designed for use with tasks that intrinsically execute more
     * than once.
     *
     * @return {@code true} if successfully run and reset
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    protected void setException(Throwable t) {

    /**
     * Causes this future to report an {@link ExecutionException}
     * with the given throwable as its cause, unless this future has
     * already been set or has been cancelled.
     *
     * <p>This method is invoked internally by the {@link #run} method
     * upon failure of the computation.
     *
     * @param t the cause of failure
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    protected void set(V v) {

    /**
     * Sets the result of this future to the given value unless
     * this future has already been set or has been cancelled.
     *
     * <p>This method is invoked internally by the {@link #run} method
     * upon successful completion of the computation.
     *
     * @param v the value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    protected void done() { }

    /**
     * Protected method invoked when this task transitions to state
     * {@code isDone} (whether normally or via cancellation). The
     * default implementation does nothing.  Subclasses may override
     * this method to invoke completion callbacks or perform
     * bookkeeping. Note that you can query status inside the
     * implementation of this method to determine whether this task
     * has been cancelled.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    public V get(long timeout, TimeUnit unit)

    /**
     * @throws CancellationException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    public V get() throws InterruptedException, ExecutionException {

    /**
     * @throws CancellationException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    public FutureTask(Runnable runnable, V result) {

    /**
     * Creates a {@code FutureTask} that will, upon running, execute the
     * given {@code Runnable}, and arrange that {@code get} will return the
     * given result on successful completion.
     *
     * @param runnable the runnable task
     * @param result the result to return on successful completion. If
     * you don't need a particular result, consider using
     * constructions of the form:
     * {@code Future<?> f = new FutureTask<Void>(runnable, null)}
     * @throws NullPointerException if the runnable is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    public FutureTask(Callable<V> callable) {

    /**
     * Creates a {@code FutureTask} that will, upon running, execute the
     * given {@code Callable}.
     *
     * @param  callable the callable task
     * @throws NullPointerException if the callable is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    @SuppressWarnings("unchecked")

    /**
     * Returns result or throws exception for completed task.
     *
     * @param s completed state value
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private volatile WaitNode waiters;

    /** Treiber stack of waiting threads */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private volatile Thread runner;

    /** The thread running the callable; CASed during run() */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private Object outcome; // non-volatile, protected by state reads/writes

    /** The result to return or exception to throw from get() */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private Callable<V> callable;

    /** The underlying callable; nulled out after running */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
    private volatile int state;

    /**
     * The run state of this task, initially NEW.  The run state
     * transitions to a terminal state only in methods set,
     * setException, and cancel.  During completion, state may take on
     * transient values of COMPLETING (while outcome is being set) or
     * INTERRUPTING (only while interrupting the runner to satisfy a
     * cancel(true)). Transitions from these intermediate to final
     * states use cheaper ordered/lazy writes because values are unique
     * and cannot be further modified.
     *
     * Possible state transitions:
     * NEW -> COMPLETING -> NORMAL
     * NEW -> COMPLETING -> EXCEPTIONAL
     * NEW -> CANCELLED
     * NEW -> INTERRUPTING -> INTERRUPTED
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/FutureTask.java
public class FutureTask<V> implements RunnableFuture<V> {

/**
 * A cancellable asynchronous computation.  This class provides a base
 * implementation of {@link Future}, with methods to start and cancel
 * a computation, query to see if the computation is complete, and
 * retrieve the result of the computation.  The result can only be
 * retrieved when the computation has completed; the {@code get}
 * methods will block if the computation has not yet completed.  Once
 * the computation has completed, the computation cannot be restarted
 * or cancelled (unless the computation is invoked using
 * {@link #runAndReset}).
 *
 * <p>A {@code FutureTask} can be used to wrap a {@link Callable} or
 * {@link Runnable} object.  Because {@code FutureTask} implements
 * {@code Runnable}, a {@code FutureTask} can be submitted to an
 * {@link Executor} for execution.
 *
 * <p>In addition to serving as a standalone class, this class provides
 * {@code protected} functionality that may be useful when creating
 * customized task classes.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <V> The result type returned by this FutureTask's {@code get} methods
 */
