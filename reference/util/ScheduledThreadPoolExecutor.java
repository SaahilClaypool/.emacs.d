_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private class Itr implements Iterator<Runnable> {

        /**
         * Snapshot iterator that works off copy of underlying q array.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private RunnableScheduledFuture<?> peekExpired() {

        /**
         * Returns first element only if it is expired.
         * Used only by drainTo.  Call only when holding lock.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private RunnableScheduledFuture<?> finishPoll(RunnableScheduledFuture<?> f) {

        /**
         * Performs common bookkeeping for poll and take: Replaces
         * first element with last and sifts it down.  Call only when
         * holding lock.
         * @param f the task to remove and return
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private int indexOf(Object x) {

        /**
         * Finds index of given object, or -1 if absent.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private void grow() {

        /**
         * Resizes the heap array.  Call only when holding lock.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private void siftDown(int k, RunnableScheduledFuture<?> key) {

        /**
         * Sifts element added at top down to its heap-ordered spot.
         * Call only when holding lock.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private void siftUp(int k, RunnableScheduledFuture<?> key) {

        /**
         * Sifts element added at bottom up to its heap-ordered spot.
         * Call only when holding lock.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private void setIndex(RunnableScheduledFuture<?> f, int idx) {

        /**
         * Sets f's heapIndex if it is a ScheduledFutureTask.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private final Condition available = lock.newCondition();

        /**
         * Condition signalled when a newer task becomes available at the
         * head of the queue or a new thread may need to become leader.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private Thread leader = null;

        /**
         * Thread designated to wait for the task at the head of the
         * queue.  This variant of the Leader-Follower pattern
         * (http://www.cs.wustl.edu/~schmidt/POSA/POSA2/) serves to
         * minimize unnecessary timed waiting.  When a thread becomes
         * the leader, it waits only for the next delay to elapse, but
         * other threads await indefinitely.  The leader thread must
         * signal some other thread before returning from take() or
         * poll(...), unless some other thread becomes leader in the
         * interim.  Whenever the head of the queue is replaced with a
         * task with an earlier expiration time, the leader field is
         * invalidated by being reset to null, and some waiting
         * thread, but not necessarily the current leader, is
         * signalled.  So waiting threads must be prepared to acquire
         * and lose leadership while waiting.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    static class DelayedWorkQueue extends AbstractQueue<Runnable>

    /**
     * Specialized delay queue. To mesh with TPE declarations, this
     * class must be declared as a BlockingQueue<Runnable> even though
     * it can only hold RunnableScheduledFutures.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public BlockingQueue<Runnable> getQueue() {

    /**
     * Returns the task queue used by this executor.  Each element of
     * this queue is a {@link ScheduledFuture}, including those
     * tasks submitted using {@code execute} which are for scheduling
     * purposes used as the basis of a zero-delay
     * {@code ScheduledFuture}.  Iteration over this queue is
     * <em>not</em> guaranteed to traverse tasks in the order in
     * which they will execute.
     *
     * @return the task queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public List<Runnable> shutdownNow() {

    /**
     * Attempts to stop all actively executing tasks, halts the
     * processing of waiting tasks, and returns a list of the tasks
     * that were awaiting execution.
     *
     * <p>This method does not wait for actively executing tasks to
     * terminate.  Use {@link #awaitTermination awaitTermination} to
     * do that.
     *
     * <p>There are no guarantees beyond best-effort attempts to stop
     * processing actively executing tasks.  This implementation
     * cancels tasks via {@link Thread#interrupt}, so any task that
     * fails to respond to interrupts may never terminate.
     *
     * @return list of tasks that never commenced execution.
     *         Each element of this list is a {@link ScheduledFuture},
     *         including those tasks submitted using {@code execute},
     *         which are for scheduling purposes used as the basis of a
     *         zero-delay {@code ScheduledFuture}.
     * @throws SecurityException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public void shutdown() {

    /**
     * Initiates an orderly shutdown in which previously submitted
     * tasks are executed, but no new tasks will be accepted.
     * Invocation has no additional effect if already shut down.
     *
     * <p>This method does not wait for previously submitted tasks to
     * complete execution.  Use {@link #awaitTermination awaitTermination}
     * to do that.
     *
     * <p>If the {@code ExecuteExistingDelayedTasksAfterShutdownPolicy}
     * has been set {@code false}, existing delayed tasks whose delays
     * have not yet elapsed are cancelled.  And unless the {@code
     * ContinueExistingPeriodicTasksAfterShutdownPolicy} has been set
     * {@code true}, future executions of existing periodic tasks will
     * be cancelled.
     *
     * @throws SecurityException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public boolean getRemoveOnCancelPolicy() {

    /**
     * Gets the policy on whether cancelled tasks should be immediately
     * removed from the work queue at time of cancellation.  This value is
     * by default {@code false}.
     *
     * @return {@code true} if cancelled tasks are immediately removed
     *         from the queue
     * @see #setRemoveOnCancelPolicy
     * @since 1.7
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public void setRemoveOnCancelPolicy(boolean value) {

    /**
     * Sets the policy on whether cancelled tasks should be immediately
     * removed from the work queue at time of cancellation.  This value is
     * by default {@code false}.
     *
     * @param value if {@code true}, remove on cancellation, else don't
     * @see #getRemoveOnCancelPolicy
     * @since 1.7
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() {

    /**
     * Gets the policy on whether to execute existing delayed
     * tasks even when this executor has been {@code shutdown}.
     * In this case, these tasks will only terminate upon
     * {@code shutdownNow}, or after setting the policy to
     * {@code false} when already shutdown.
     * This value is by default {@code true}.
     *
     * @return {@code true} if will execute after shutdown
     * @see #setExecuteExistingDelayedTasksAfterShutdownPolicy
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) {

    /**
     * Sets the policy on whether to execute existing delayed
     * tasks even when this executor has been {@code shutdown}.
     * In this case, these tasks will only terminate upon
     * {@code shutdownNow}, or after setting the policy to
     * {@code false} when already shutdown.
     * This value is by default {@code true}.
     *
     * @param value if {@code true}, execute after shutdown, else don't
     * @see #getExecuteExistingDelayedTasksAfterShutdownPolicy
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() {

    /**
     * Gets the policy on whether to continue executing existing
     * periodic tasks even when this executor has been {@code shutdown}.
     * In this case, these tasks will only terminate upon
     * {@code shutdownNow} or after setting the policy to
     * {@code false} when already shutdown.
     * This value is by default {@code false}.
     *
     * @return {@code true} if will continue after shutdown
     * @see #setContinueExistingPeriodicTasksAfterShutdownPolicy
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) {

    /**
     * Sets the policy on whether to continue executing existing
     * periodic tasks even when this executor has been {@code shutdown}.
     * In this case, these tasks will only terminate upon
     * {@code shutdownNow} or after setting the policy to
     * {@code false} when already shutdown.
     * This value is by default {@code false}.
     *
     * @param value if {@code true}, continue after shutdown, else don't
     * @see #getContinueExistingPeriodicTasksAfterShutdownPolicy
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public <T> Future<T> submit(Callable<T> task) {

    /**
     * @throws RejectedExecutionException {@inheritDoc}
     * @throws NullPointerException       {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public <T> Future<T> submit(Runnable task, T result) {

    /**
     * @throws RejectedExecutionException {@inheritDoc}
     * @throws NullPointerException       {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public Future<?> submit(Runnable task) {

    /**
     * @throws RejectedExecutionException {@inheritDoc}
     * @throws NullPointerException       {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public void execute(Runnable command) {

    /**
     * Executes {@code command} with zero required delay.
     * This has effect equivalent to
     * {@link #schedule(Runnable,long,TimeUnit) schedule(command, 0, anyUnit)}.
     * Note that inspections of the queue and of the list returned by
     * {@code shutdownNow} will access the zero-delayed
     * {@link ScheduledFuture}, not the {@code command} itself.
     *
     * <p>A consequence of the use of {@code ScheduledFuture} objects is
     * that {@link ThreadPoolExecutor#afterExecute afterExecute} is always
     * called with a null second {@code Throwable} argument, even if the
     * {@code command} terminated abruptly.  Instead, the {@code Throwable}
     * thrown by such a task can be obtained via {@link Future#get}.
     *
     * @throws RejectedExecutionException at discretion of
     *         {@code RejectedExecutionHandler}, if the task
     *         cannot be accepted for execution because the
     *         executor has been shut down
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,
                                                     long initialDelay,
                                                     long delay,
                                                     TimeUnit unit) {

    /**
     * @throws RejectedExecutionException {@inheritDoc}
     * @throws NullPointerException       {@inheritDoc}
     * @throws IllegalArgumentException   {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
                                                  long initialDelay,
                                                  long period,
                                                  TimeUnit unit) {

    /**
     * @throws RejectedExecutionException {@inheritDoc}
     * @throws NullPointerException       {@inheritDoc}
     * @throws IllegalArgumentException   {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public <V> ScheduledFuture<V> schedule(Callable<V> callable,
                                           long delay,
                                           TimeUnit unit) {

    /**
     * @throws RejectedExecutionException {@inheritDoc}
     * @throws NullPointerException       {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public ScheduledFuture<?> schedule(Runnable command,
                                       long delay,
                                       TimeUnit unit) {

    /**
     * @throws RejectedExecutionException {@inheritDoc}
     * @throws NullPointerException       {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    private long overflowFree(long delay) {

    /**
     * Constrains the values of all delays in the queue to be within
     * Long.MAX_VALUE of each other, to avoid overflow in compareTo.
     * This may occur if a task is eligible to be dequeued, but has
     * not yet been, while some other task is added with a delay of
     * Long.MAX_VALUE.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    long triggerTime(long delay) {

    /**
     * Returns the trigger time of a delayed action.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    private long triggerTime(long delay, TimeUnit unit) {

    /**
     * Returns the trigger time of a delayed action.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public ScheduledThreadPoolExecutor(int corePoolSize,
                                       ThreadFactory threadFactory,
                                       RejectedExecutionHandler handler) {

    /**
     * Creates a new ScheduledThreadPoolExecutor with the given
     * initial parameters.
     *
     * @param corePoolSize the number of threads to keep in the pool, even
     *        if they are idle, unless {@code allowCoreThreadTimeOut} is set
     * @param threadFactory the factory to use when the executor
     *        creates a new thread
     * @param handler the handler to use when execution is blocked
     *        because the thread bounds and queue capacities are reached
     * @throws IllegalArgumentException if {@code corePoolSize < 0}
     * @throws NullPointerException if {@code threadFactory} or
     *         {@code handler} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public ScheduledThreadPoolExecutor(int corePoolSize,
                                       RejectedExecutionHandler handler) {

    /**
     * Creates a new ScheduledThreadPoolExecutor with the given
     * initial parameters.
     *
     * @param corePoolSize the number of threads to keep in the pool, even
     *        if they are idle, unless {@code allowCoreThreadTimeOut} is set
     * @param handler the handler to use when execution is blocked
     *        because the thread bounds and queue capacities are reached
     * @throws IllegalArgumentException if {@code corePoolSize < 0}
     * @throws NullPointerException if {@code handler} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public ScheduledThreadPoolExecutor(int corePoolSize,
                                       ThreadFactory threadFactory) {

    /**
     * Creates a new {@code ScheduledThreadPoolExecutor} with the
     * given initial parameters.
     *
     * @param corePoolSize the number of threads to keep in the pool, even
     *        if they are idle, unless {@code allowCoreThreadTimeOut} is set
     * @param threadFactory the factory to use when the executor
     *        creates a new thread
     * @throws IllegalArgumentException if {@code corePoolSize < 0}
     * @throws NullPointerException if {@code threadFactory} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    public ScheduledThreadPoolExecutor(int corePoolSize) {

    /**
     * Creates a new {@code ScheduledThreadPoolExecutor} with the
     * given core pool size.
     *
     * @param corePoolSize the number of threads to keep in the pool, even
     *        if they are idle, unless {@code allowCoreThreadTimeOut} is set
     * @throws IllegalArgumentException if {@code corePoolSize < 0}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    protected <V> RunnableScheduledFuture<V> decorateTask(
        Callable<V> callable, RunnableScheduledFuture<V> task) {

    /**
     * Modifies or replaces the task used to execute a callable.
     * This method can be used to override the concrete
     * class used for managing internal tasks.
     * The default implementation simply returns the given task.
     *
     * @param callable the submitted Callable
     * @param task the task created to execute the callable
     * @param <V> the type of the task's result
     * @return a task that can execute the callable
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    protected <V> RunnableScheduledFuture<V> decorateTask(
        Runnable runnable, RunnableScheduledFuture<V> task) {

    /**
     * Modifies or replaces the task used to execute a runnable.
     * This method can be used to override the concrete
     * class used for managing internal tasks.
     * The default implementation simply returns the given task.
     *
     * @param runnable the submitted Runnable
     * @param task the task created to execute the runnable
     * @param <V> the type of the task's result
     * @return a task that can execute the runnable
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    @Override void onShutdown() {

    /**
     * Cancels and clears the queue of all tasks that should not be run
     * due to shutdown policy.  Invoked within super.shutdown.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    void reExecutePeriodic(RunnableScheduledFuture<?> task) {

    /**
     * Requeues a periodic task unless current run state precludes it.
     * Same idea as delayedExecute except drops task rather than rejecting.
     *
     * @param task the task
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    private void delayedExecute(RunnableScheduledFuture<?> task) {

    /**
     * Main execution method for delayed or periodic tasks.  If pool
     * is shut down, rejects the task. Otherwise adds task to queue
     * and starts a thread, if necessary, to run it.  (We cannot
     * prestart the thread to run the task because the task (probably)
     * shouldn't be run yet.)  If the pool is shut down while the task
     * is being added, cancel and remove it if required by state and
     * run-after-shutdown parameters.
     *
     * @param task the task
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    boolean canRunInCurrentRunState(boolean periodic) {

    /**
     * Returns true if can run a task given current run state
     * and run-after-shutdown parameters.
     *
     * @param periodic true if this task periodic, false if delayed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        public void run() {

        /**
         * Overrides FutureTask version so as to reset/requeue if periodic.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private void setNextRunTime() {

        /**
         * Sets the next time to run for a periodic task.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        public boolean isPeriodic() {

        /**
         * Returns {@code true} if this is a periodic (not a one-shot) action.
         *
         * @return {@code true} if periodic
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        ScheduledFutureTask(Callable<V> callable, long ns) {

        /**
         * Creates a one-shot action with given nanoTime-based trigger time.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        ScheduledFutureTask(Runnable r, V result, long ns, long period) {

        /**
         * Creates a periodic action with given nano time and period.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        ScheduledFutureTask(Runnable r, V result, long ns) {

        /**
         * Creates a one-shot action with given nanoTime-based trigger time.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        int heapIndex;

        /**
         * Index into delay queue, to support faster cancellation.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        RunnableScheduledFuture<V> outerTask = this;

        /** The actual task to be re-enqueued by reExecutePeriodic */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private final long period;

        /**
         * Period in nanoseconds for repeating tasks.  A positive
         * value indicates fixed-rate execution.  A negative value
         * indicates fixed-delay execution.  A value of 0 indicates a
         * non-repeating task.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private long time;

        /** The time the task is enabled to execute in nanoTime units */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
        private final long sequenceNumber;

        /** Sequence number to break ties FIFO */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    final long now() {

    /**
     * Returns current nanosecond time.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    private static final AtomicLong sequencer = new AtomicLong();

    /**
     * Sequence number to break scheduling ties, and in turn to
     * guarantee FIFO order among tied entries.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    private volatile boolean removeOnCancel = false;

    /**
     * True if ScheduledFutureTask.cancel should remove from queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    private volatile boolean executeExistingDelayedTasksAfterShutdown = true;

    /**
     * False if should cancel non-periodic tasks on shutdown.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
    private volatile boolean continueExistingPeriodicTasksAfterShutdown;

    /**
     * False if should cancel/suppress periodic tasks on shutdown.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ScheduledThreadPoolExecutor.java
public class ScheduledThreadPoolExecutor

/**
 * A {@link ThreadPoolExecutor} that can additionally schedule
 * commands to run after a given delay, or to execute
 * periodically. This class is preferable to {@link java.util.Timer}
 * when multiple worker threads are needed, or when the additional
 * flexibility or capabilities of {@link ThreadPoolExecutor} (which
 * this class extends) are required.
 *
 * <p>Delayed tasks execute no sooner than they are enabled, but
 * without any real-time guarantees about when, after they are
 * enabled, they will commence. Tasks scheduled for exactly the same
 * execution time are enabled in first-in-first-out (FIFO) order of
 * submission.
 *
 * <p>When a submitted task is cancelled before it is run, execution
 * is suppressed. By default, such a cancelled task is not
 * automatically removed from the work queue until its delay
 * elapses. While this enables further inspection and monitoring, it
 * may also cause unbounded retention of cancelled tasks. To avoid
 * this, set {@link #setRemoveOnCancelPolicy} to {@code true}, which
 * causes tasks to be immediately removed from the work queue at
 * time of cancellation.
 *
 * <p>Successive executions of a task scheduled via
 * {@code scheduleAtFixedRate} or
 * {@code scheduleWithFixedDelay} do not overlap. While different
 * executions may be performed by different threads, the effects of
 * prior executions <a
 * href="package-summary.html#MemoryVisibility"><i>happen-before</i></a>
 * those of subsequent ones.
 *
 * <p>While this class inherits from {@link ThreadPoolExecutor}, a few
 * of the inherited tuning methods are not useful for it. In
 * particular, because it acts as a fixed-sized pool using
 * {@code corePoolSize} threads and an unbounded queue, adjustments
 * to {@code maximumPoolSize} have no useful effect. Additionally, it
 * is almost never a good idea to set {@code corePoolSize} to zero or
 * use {@code allowCoreThreadTimeOut} because this may leave the pool
 * without threads to handle tasks once they become eligible to run.
 *
 * <p><b>Extension notes:</b> This class overrides the
 * {@link ThreadPoolExecutor#execute(Runnable) execute} and
 * {@link AbstractExecutorService#submit(Runnable) submit}
 * methods to generate internal {@link ScheduledFuture} objects to
 * control per-task delays and scheduling.  To preserve
 * functionality, any further overrides of these methods in
 * subclasses must invoke superclass versions, which effectively
 * disables additional task customization.  However, this class
 * provides alternative protected extension method
 * {@code decorateTask} (one version each for {@code Runnable} and
 * {@code Callable}) that can be used to customize the concrete task
 * types used to execute commands entered via {@code execute},
 * {@code submit}, {@code schedule}, {@code scheduleAtFixedRate},
 * and {@code scheduleWithFixedDelay}.  By default, a
 * {@code ScheduledThreadPoolExecutor} uses a task type extending
 * {@link FutureTask}. However, this may be modified or replaced using
 * subclasses of the form:
 *
 *  <pre> {@code
 * public class CustomScheduledExecutor extends ScheduledThreadPoolExecutor {
 *
 *   static class CustomTask<V> implements RunnableScheduledFuture<V> { ... }
 *
 *   protected <V> RunnableScheduledFuture<V> decorateTask(
 *                Runnable r, RunnableScheduledFuture<V> task) {
 *       return new CustomTask<V>(r, task);
 *   }
 *
 *   protected <V> RunnableScheduledFuture<V> decorateTask(
 *                Callable<V> c, RunnableScheduledFuture<V> task) {
 *       return new CustomTask<V>(c, task);
 *   }
 *   // ... add constructors, etc.
 * }}</pre>
 *
 * @since 1.5
 * @author Doug Lea
 */
