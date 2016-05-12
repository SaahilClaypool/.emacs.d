_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        private static final AccessControlContext innocuousAcc;

        /**
         * An ACC to restrict permissions for the factory itself.
         * The constructed workers have no permissions set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static final class InnocuousForkJoinWorkerThreadFactory

    /**
     * Factory for innocuous worker threads
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static ForkJoinPool makeCommonPool() {

    /**
     * Creates and returns the common pool, respecting user settings
     * specified via system properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public static void managedBlock(ManagedBlocker blocker)

    /**
     * Runs the given possibly blocking task.  When {@linkplain
     * ForkJoinTask#inForkJoinPool() running in a ForkJoinPool}, this
     * method possibly arranges for a spare thread to be activated if
     * necessary to ensure sufficient parallelism while the current
     * thread is blocked in {@link ManagedBlocker#block blocker.block()}.
     *
     * <p>This method repeatedly calls {@code blocker.isReleasable()} and
     * {@code blocker.block()} until either method returns {@code true}.
     * Every call to {@code blocker.block()} is preceded by a call to
     * {@code blocker.isReleasable()} that returned {@code false}.
     *
     * <p>If not running in a ForkJoinPool, this method is
     * behaviorally equivalent to
     *  <pre> {@code
     * while (!blocker.isReleasable())
     *   if (blocker.block())
     *     break;}</pre>
     *
     * If running in a ForkJoinPool, the pool may first be expanded to
     * ensure sufficient parallelism available during the call to
     * {@code blocker.block()}.
     *
     * @param blocker the blocker task
     * @throws InterruptedException if {@code blocker.block()} did so
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        boolean isReleasable();

        /**
         * Returns {@code true} if blocking is unnecessary.
         * @return {@code true} if blocking is unnecessary
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public static interface ManagedBlocker {

    /**
     * Interface for extending managed parallelism for tasks running
     * in {@link ForkJoinPool}s.
     *
     * <p>A {@code ManagedBlocker} provides two methods.  Method
     * {@link #isReleasable} must return {@code true} if blocking is
     * not necessary. Method {@link #block} blocks the current thread
     * if necessary (perhaps internally invoking {@code isReleasable}
     * before actually blocking). These actions are performed by any
     * thread invoking {@link ForkJoinPool#managedBlock(ManagedBlocker)}.
     * The unusual methods in this API accommodate synchronizers that
     * may, but don't usually, block for long periods. Similarly, they
     * allow more efficient internal handling of cases in which
     * additional workers may be, but usually are not, needed to
     * ensure sufficient parallelism.  Toward this end,
     * implementations of method {@code isReleasable} must be amenable
     * to repeated invocation.
     *
     * <p>For example, here is a ManagedBlocker based on a
     * ReentrantLock:
     *  <pre> {@code
     * class ManagedLocker implements ManagedBlocker {
     *   final ReentrantLock lock;
     *   boolean hasLock = false;
     *   ManagedLocker(ReentrantLock lock) { this.lock = lock; }
     *   public boolean block() {
     *     if (!hasLock)
     *       lock.lock();
     *     return true;
     *   }
     *   public boolean isReleasable() {
     *     return hasLock || (hasLock = lock.tryLock());
     *   }
     * }}</pre>
     *
     * <p>Here is a class that possibly blocks waiting for an
     * item on a given queue:
     *  <pre> {@code
     * class QueueTaker<E> implements ManagedBlocker {
     *   final BlockingQueue<E> queue;
     *   volatile E item = null;
     *   QueueTaker(BlockingQueue<E> q) { this.queue = q; }
     *   public boolean block() throws InterruptedException {
     *     if (item == null)
     *       item = queue.take();
     *     return true;
     *   }
     *   public boolean isReleasable() {
     *     return item != null || (item = queue.poll()) != null;
     *   }
     *   public E getItem() { // call after pool.managedBlock completes
     *     return item;
     *   }
     * }}</pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static void quiesceCommonPool() {

    /**
     * Waits and/or attempts to assist performing tasks indefinitely
     * until the {@link #commonPool()} {@link #isQuiescent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean awaitQuiescence(long timeout, TimeUnit unit) {

    /**
     * If called by a ForkJoinTask operating in this pool, equivalent
     * in effect to {@link ForkJoinTask#helpQuiesce}. Otherwise,
     * waits and/or attempts to assist performing tasks until this
     * pool {@link #isQuiescent} or the indicated timeout elapses.
     *
     * @param timeout the maximum time to wait
     * @param unit the time unit of the timeout argument
     * @return {@code true} if quiescent; {@code false} if the
     * timeout elapsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean awaitTermination(long timeout, TimeUnit unit)

    /**
     * Blocks until all tasks have completed execution after a
     * shutdown request, or the timeout occurs, or the current thread
     * is interrupted, whichever happens first. Because the {@link
     * #commonPool()} never terminates until program shutdown, when
     * applied to the common pool, this method is equivalent to {@link
     * #awaitQuiescence(long, TimeUnit)} but always returns {@code false}.
     *
     * @param timeout the maximum time to wait
     * @param unit the time unit of the timeout argument
     * @return {@code true} if this executor terminated and
     *         {@code false} if the timeout elapsed before termination
     * @throws InterruptedException if interrupted while waiting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean isShutdown() {

    /**
     * Returns {@code true} if this pool has been shut down.
     *
     * @return {@code true} if this pool has been shut down
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean isTerminating() {

    /**
     * Returns {@code true} if the process of termination has
     * commenced but not yet completed.  This method may be useful for
     * debugging. A return of {@code true} reported a sufficient
     * period after shutdown may indicate that submitted tasks have
     * ignored or suppressed interruption, or are waiting for I/O,
     * causing this executor not to properly terminate. (See the
     * advisory notes for class {@link ForkJoinTask} stating that
     * tasks should not normally entail blocking operations.  But if
     * they do, they must abort them on interrupt.)
     *
     * @return {@code true} if terminating but not yet terminated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean isTerminated() {

    /**
     * Returns {@code true} if all tasks have completed following shut down.
     *
     * @return {@code true} if all tasks have completed following shut down
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public List<Runnable> shutdownNow() {

    /**
     * Possibly attempts to cancel and/or stop all tasks, and reject
     * all subsequently submitted tasks.  Invocation has no effect on
     * execution state if this is the {@link #commonPool()}, and no
     * additional effect if already shut down. Otherwise, tasks that
     * are in the process of being submitted or executed concurrently
     * during the course of this method may or may not be
     * rejected. This method cancels both existing and unexecuted
     * tasks, in order to permit termination in the presence of task
     * dependencies. So the method always returns an empty list
     * (unlike the case for some other Executors).
     *
     * @return an empty list
     * @throws SecurityException if a security manager exists and
     *         the caller is not permitted to modify threads
     *         because it does not hold {@link
     *         java.lang.RuntimePermission}{@code ("modifyThread")}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public void shutdown() {

    /**
     * Possibly initiates an orderly shutdown in which previously
     * submitted tasks are executed, but no new tasks will be
     * accepted. Invocation has no effect on execution state if this
     * is the {@link #commonPool()}, and no additional effect if
     * already shut down.  Tasks that are in the process of being
     * submitted concurrently during the course of this method may or
     * may not be rejected.
     *
     * @throws SecurityException if a security manager exists and
     *         the caller is not permitted to modify threads
     *         because it does not hold {@link
     *         java.lang.RuntimePermission}{@code ("modifyThread")}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public String toString() {

    /**
     * Returns a string identifying this pool, as well as its state,
     * including indications of run state, parallelism level, and
     * worker and task counts.
     *
     * @return a string identifying this pool, as well as its state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    protected int drainTasksTo(Collection<? super ForkJoinTask<?>> c) {

    /**
     * Removes all available unexecuted submitted and forked tasks
     * from scheduling queues and adds them to the given collection,
     * without altering their execution status. These may include
     * artificially generated or wrapped tasks. This method is
     * designed to be invoked only when the pool is known to be
     * quiescent. Invocations at other times may not remove all
     * tasks. A failure encountered while attempting to add elements
     * to collection {@code c} may result in elements being in
     * neither, either or both collections when the associated
     * exception is thrown.  The behavior of this operation is
     * undefined if the specified collection is modified while the
     * operation is in progress.
     *
     * @param c the collection to transfer elements into
     * @return the number of elements transferred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    protected ForkJoinTask<?> pollSubmission() {

    /**
     * Removes and returns the next unexecuted submission if one is
     * available.  This method may be useful in extensions to this
     * class that re-assign work in systems with multiple pools.
     *
     * @return the next submission, or {@code null} if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean hasQueuedSubmissions() {

    /**
     * Returns {@code true} if there are any tasks submitted to this
     * pool that have not yet begun executing.
     *
     * @return {@code true} if there are any queued submissions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public int getQueuedSubmissionCount() {

    /**
     * Returns an estimate of the number of tasks submitted to this
     * pool that have not yet begun executing.  This method may take
     * time proportional to the number of submissions.
     *
     * @return the number of queued submissions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public long getQueuedTaskCount() {

    /**
     * Returns an estimate of the total number of tasks currently held
     * in queues by worker threads (but not including tasks submitted
     * to the pool that have not begun executing). This value is only
     * an approximation, obtained by iterating across all threads in
     * the pool. This method may be useful for tuning task
     * granularities.
     *
     * @return the number of queued tasks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public long getStealCount() {

    /**
     * Returns an estimate of the total number of tasks stolen from
     * one thread's work queue by another. The reported value
     * underestimates the actual total number of steals when the pool
     * is not quiescent. This value may be useful for monitoring and
     * tuning fork/join programs: in general, steal counts should be
     * high enough to keep threads busy, but low enough to avoid
     * overhead and contention across threads.
     *
     * @return the number of steals
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean isQuiescent() {

    /**
     * Returns {@code true} if all worker threads are currently idle.
     * An idle worker is one that cannot obtain a task to execute
     * because none are available to steal from other threads, and
     * there are no pending submissions to the pool. This method is
     * conservative; it might not return {@code true} immediately upon
     * idleness of all threads, but will eventually become true if
     * threads remain inactive.
     *
     * @return {@code true} if all threads are currently idle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public int getActiveThreadCount() {

    /**
     * Returns an estimate of the number of threads that are currently
     * stealing or executing tasks. This method may overestimate the
     * number of active threads.
     *
     * @return the number of active threads
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public int getRunningThreadCount() {

    /**
     * Returns an estimate of the number of worker threads that are
     * not blocked waiting to join tasks or for other managed
     * synchronization. This method may overestimate the
     * number of running threads.
     *
     * @return the number of worker threads
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public boolean getAsyncMode() {

    /**
     * Returns {@code true} if this pool uses local first-in-first-out
     * scheduling mode for forked tasks that are never joined.
     *
     * @return {@code true} if this pool uses async mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public int getPoolSize() {

    /**
     * Returns the number of worker threads that have started but not
     * yet terminated.  The result returned by this method may differ
     * from {@link #getParallelism} when threads are created to
     * maintain parallelism when others are cooperatively blocked.
     *
     * @return the number of worker threads
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public static int getCommonPoolParallelism() {

    /**
     * Returns the targeted parallelism level of the common pool.
     *
     * @return the targeted parallelism level of the common pool
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public int getParallelism() {

    /**
     * Returns the targeted parallelism level of this pool.
     *
     * @return the targeted parallelism level of this pool
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {

    /**
     * Returns the handler for internal worker threads that terminate
     * due to unrecoverable errors encountered while executing tasks.
     *
     * @return the handler, or {@code null} if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public ForkJoinWorkerThreadFactory getFactory() {

    /**
     * Returns the factory used for constructing new workers.
     *
     * @return the factory used for constructing new workers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) {

    /**
     * @throws NullPointerException       {@inheritDoc}
     * @throws RejectedExecutionException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public ForkJoinTask<?> submit(Runnable task) {

    /**
     * @throws NullPointerException if the task is null
     * @throws RejectedExecutionException if the task cannot be
     *         scheduled for execution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public <T> ForkJoinTask<T> submit(Runnable task, T result) {

    /**
     * @throws NullPointerException if the task is null
     * @throws RejectedExecutionException if the task cannot be
     *         scheduled for execution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public <T> ForkJoinTask<T> submit(Callable<T> task) {

    /**
     * @throws NullPointerException if the task is null
     * @throws RejectedExecutionException if the task cannot be
     *         scheduled for execution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public <T> ForkJoinTask<T> submit(ForkJoinTask<T> task) {

    /**
     * Submits a ForkJoinTask for execution.
     *
     * @param task the task to submit
     * @param <T> the type of the task's result
     * @return the task
     * @throws NullPointerException if the task is null
     * @throws RejectedExecutionException if the task cannot be
     *         scheduled for execution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public void execute(Runnable task) {

    /**
     * @throws NullPointerException if the task is null
     * @throws RejectedExecutionException if the task cannot be
     *         scheduled for execution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public void execute(ForkJoinTask<?> task) {

    /**
     * Arranges for (asynchronous) execution of the given task.
     *
     * @param task the task
     * @throws NullPointerException if the task is null
     * @throws RejectedExecutionException if the task cannot be
     *         scheduled for execution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public <T> T invoke(ForkJoinTask<T> task) {

    /**
     * Performs the given task, returning its result upon completion.
     * If the computation encounters an unchecked Exception or Error,
     * it is rethrown as the outcome of this invocation.  Rethrown
     * exceptions behave in the same way as regular exceptions, but,
     * when possible, contain stack traces (as displayed for example
     * using {@code ex.printStackTrace()}) of both the current thread
     * as well as the thread actually encountering the exception;
     * minimally only the latter.
     *
     * @param task the task
     * @param <T> the type of the task's result
     * @return the task's result
     * @throws NullPointerException if the task is null
     * @throws RejectedExecutionException if the task cannot be
     *         scheduled for execution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public static ForkJoinPool commonPool() {

    /**
     * Returns the common pool instance. This pool is statically
     * constructed; its run state is unaffected by attempts to {@link
     * #shutdown} or {@link #shutdownNow}. However this pool and any
     * ongoing processing are automatically terminated upon program
     * {@link System#exit}.  Any program that relies on asynchronous
     * task processing to complete before program termination should
     * invoke {@code commonPool().}{@link #awaitQuiescence awaitQuiescence},
     * before exit.
     *
     * @return the common pool instance
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private ForkJoinPool(int parallelism,
                         ForkJoinWorkerThreadFactory factory,
                         UncaughtExceptionHandler handler,
                         int mode,
                         String workerNamePrefix) {

    /**
     * Creates a {@code ForkJoinPool} with the given parameters, without
     * any security checks or parameter validation.  Invoked directly by
     * makeCommonPool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public ForkJoinPool(int parallelism,
                        ForkJoinWorkerThreadFactory factory,
                        UncaughtExceptionHandler handler,
                        boolean asyncMode) {

    /**
     * Creates a {@code ForkJoinPool} with the given parameters.
     *
     * @param parallelism the parallelism level. For default value,
     * use {@link java.lang.Runtime#availableProcessors}.
     * @param factory the factory for creating new threads. For default value,
     * use {@link #defaultForkJoinWorkerThreadFactory}.
     * @param handler the handler for internal worker threads that
     * terminate due to unrecoverable errors encountered while executing
     * tasks. For default value, use {@code null}.
     * @param asyncMode if true,
     * establishes local first-in-first-out scheduling mode for forked
     * tasks that are never joined. This mode may be more appropriate
     * than default locally stack-based mode in applications in which
     * worker threads only process event-style asynchronous tasks.
     * For default value, use {@code false}.
     * @throws IllegalArgumentException if parallelism less than or
     *         equal to zero, or greater than implementation limit
     * @throws NullPointerException if the factory is null
     * @throws SecurityException if a security manager exists and
     *         the caller is not permitted to modify threads
     *         because it does not hold {@link
     *         java.lang.RuntimePermission}{@code ("modifyThread")}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public ForkJoinPool(int parallelism) {

    /**
     * Creates a {@code ForkJoinPool} with the indicated parallelism
     * level, the {@linkplain
     * #defaultForkJoinWorkerThreadFactory default thread factory},
     * no UncaughtExceptionHandler, and non-async LIFO processing mode.
     *
     * @param parallelism the parallelism level
     * @throws IllegalArgumentException if parallelism less than or
     *         equal to zero, or greater than implementation limit
     * @throws SecurityException if a security manager exists and
     *         the caller is not permitted to modify threads
     *         because it does not hold {@link
     *         java.lang.RuntimePermission}{@code ("modifyThread")}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public ForkJoinPool() {

    /**
     * Creates a {@code ForkJoinPool} with parallelism equal to {@link
     * java.lang.Runtime#availableProcessors}, using the {@linkplain
     * #defaultForkJoinWorkerThreadFactory default thread factory},
     * no UncaughtExceptionHandler, and non-async LIFO processing mode.
     *
     * @throws SecurityException if a security manager exists and
     *         the caller is not permitted to modify threads
     *         because it does not hold {@link
     *         java.lang.RuntimePermission}{@code ("modifyThread")}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final int externalHelpComplete(CountedCompleter<?> task, int maxTasks) {

    /**
     * Performs helpComplete for an external submitter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final boolean tryExternalUnpush(ForkJoinTask<?> task) {

    /**
     * Performs tryUnpush for an external submitter: Finds queue,
     * locks if apparently non-empty, validates upon locking, and
     * adjusts top. Each check can fail but rarely does.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static WorkQueue commonSubmitterQueue() {

    /**
     * Returns common pool queue for an external thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final void externalPush(ForkJoinTask<?> task) {

    /**
     * Tries to add the given task to a submission queue at
     * submitter's current queue. Only the (vastly) most common path
     * is directly handled in this method, while screening for need
     * for externalSubmit.
     *
     * @param task the task. Caller must ensure non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private void externalSubmit(ForkJoinTask<?> task) {

    /**
     * Full version of externalPush, handling uncommon cases, as well
     * as performing secondary initialization upon the first
     * submission of the first task to the pool.  It also detects
     * first submission by an external thread and creates a new shared
     * queue if the one at index if empty or contended.
     *
     * @param task the task. Caller must ensure non-null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private boolean tryTerminate(boolean now, boolean enable) {

    /**
     * Possibly initiates and/or completes termination.
     *
     * @param now if true, unconditionally terminate, else only
     * if no work and no active workers
     * @param enable if true, enable shutdown when next possible
     * @return true if now terminating or terminated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static int getSurplusQueuedTaskCount() {

    /**
     * Returns a cheap heuristic guide for task partitioning when
     * programmers, frameworks, tools, or languages have little or no
     * idea about task granularity.  In essence, by offering this
     * method, we ask users only about tradeoffs in overhead vs
     * expected throughput and its variance, rather than how finely to
     * partition tasks.
     *
     * In a steady state strict (tree-structured) computation, each
     * thread makes available for stealing enough tasks for other
     * threads to remain active. Inductively, if all threads play by
     * the same rules, each thread should make available only a
     * constant number of tasks.
     *
     * The minimum useful constant is just 1. But using a value of 1
     * would require immediate replenishment upon each steal to
     * maintain enough tasks, which is infeasible.  Further,
     * partitionings/granularities of offered tasks should minimize
     * steal rates, which in general means that threads nearer the top
     * of computation tree should generate more than those nearer the
     * bottom. In perfect steady state, each thread is at
     * approximately the same level of computation tree. However,
     * producing extra tasks amortizes the uncertainty of progress and
     * diffusion assumptions.
     *
     * So, users will want to use values larger (but not much larger)
     * than 1 to both smooth over transient shortages and hedge
     * against uneven progress; as traded off against the cost of
     * extra task overhead. We leave the user to pick a threshold
     * value to compare with the results of this call to guide
     * decisions, but recommend values such as 3.
     *
     * When all threads are active, it is on average OK to estimate
     * surplus strictly locally. In steady-state, if one thread is
     * maintaining say 2 surplus tasks, then so are others. So we can
     * just use estimated queue length.  However, this strategy alone
     * leads to serious mis-estimates in some non-steady-state
     * conditions (ramp-up, ramp-down, other stalls). We can detect
     * many of these by further considering the number of "idle"
     * threads, that are known to have zero queued tasks, so
     * compensate by a factor of (#idle/#active) threads.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final ForkJoinTask<?> nextTaskFor(WorkQueue w) {

    /**
     * Gets and removes a local or stolen task for the given worker.
     *
     * @return a task, if available
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final void helpQuiescePool(WorkQueue w) {

    /**
     * Runs tasks until {@code isQuiescent()}. We piggyback on
     * active count ctl maintenance, but rather than blocking
     * when tasks cannot be found, we rescan until all others cannot
     * find tasks either.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private WorkQueue findNonEmptyStealQueue() {

    /**
     * Returns a (probably) non-empty steal queue, if one is found
     * during a scan, else null.  This method must be retried by
     * caller if, by the time it tries to use the queue, it is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final int awaitJoin(WorkQueue w, ForkJoinTask<?> task, long deadline) {

    /**
     * Helps and/or blocks until the given task is done or timeout.
     *
     * @param w caller
     * @param task the task
     * @param deadline for timed waits, if nonzero
     * @return task status on exit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private boolean tryCompensate(WorkQueue w) {

    /**
     * Tries to decrement active count (sometimes implicitly) and
     * possibly release or create a compensating worker in preparation
     * for blocking. Returns false (retryable by caller), on
     * contention, detected staleness, instability, or termination.
     *
     * @param w caller
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private void helpStealer(WorkQueue w, ForkJoinTask<?> task) {

    /**
     * Tries to locate and execute tasks for a stealer of the given
     * task, or in turn one of its stealers, Traces currentSteal ->
     * currentJoin links looking for a thread working on a descendant
     * of the given task and with a non-empty queue to steal back and
     * execute tasks from. The first call to this method upon a
     * waiting join will often entail scanning/search, (which is OK
     * because the joiner has nothing better to do), but this method
     * leaves hints in workers to speed up subsequent calls.
     *
     * @param w caller
     * @param task the task to join
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final int helpComplete(WorkQueue w, CountedCompleter<?> task,
                           int maxTasks) {

    /**
     * Tries to steal and run tasks within the target's computation.
     * Uses a variant of the top-level algorithm, restricted to tasks
     * with the given task as ancestor: It prefers taking and running
     * eligible tasks popped from the worker's own queue (via
     * popCC). Otherwise it scans others, randomly moving on
     * contention or execution, deciding to give up based on a
     * checksum (via return codes frob pollAndExecCC). The maxTasks
     * argument supports external usages; internal calls use zero,
     * allowing unbounded steps (external calls trap non-positive
     * values).
     *
     * @param w caller
     * @param maxTasks if non-zero, the maximum number of other tasks to run
     * @return task status on exit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private boolean awaitWork(WorkQueue w, int r) {

    /**
     * Possibly blocks worker w waiting for a task to steal, or
     * returns false if the worker should terminate.  If inactivating
     * w has caused the pool to become quiescent, checks for pool
     * termination, and, so long as this is not the only worker, waits
     * for up to a given duration.  On timeout, if ctl has not
     * changed, terminates the worker, which will in turn wake up
     * another worker to possibly repeat this process.
     *
     * @param w the calling worker
     * @param r a random seed (for spins)
     * @return false if the worker should terminate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private ForkJoinTask<?> scan(WorkQueue w, int r) {

    /**
     * Scans for and tries to steal a top-level task. Scans start at a
     * random location, randomly moving on apparent contention,
     * otherwise continuing linearly until reaching two consecutive
     * empty passes over all queues with the same checksum (summing
     * each base index of each queue, that moves on each steal), at
     * which point the worker tries to inactivate and then re-scans,
     * attempting to re-activate (itself or some other worker) if
     * finding a task; otherwise returning null to await work.  Scans
     * otherwise touch as little memory as possible, to reduce
     * disruption on other scanning threads.
     *
     * @param w the worker (via its WorkQueue)
     * @param r a random seed
     * @return a task, or null if none found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final void runWorker(WorkQueue w) {

    /**
     * Top-level runloop for workers, called by ForkJoinWorkerThread.run.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private boolean tryRelease(long c, WorkQueue v, long inc) {

    /**
     * Signals and releases worker v if it is top of idle worker
     * stack.  This performs a one-shot version of signalWork only if
     * there is (apparently) at least one idle worker.
     *
     * @param c incoming ctl value
     * @param v if non-null, a worker
     * @param inc the increment to active count (zero when compensating)
     * @return true if successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final void signalWork(WorkQueue[] ws, WorkQueue q) {

    /**
     * Tries to create or activate a worker if too few are active.
     *
     * @param ws the worker array to use to find signallees
     * @param q a WorkQueue --if non-null, don't retry if now empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final void deregisterWorker(ForkJoinWorkerThread wt, Throwable ex) {

    /**
     * Final callback from terminating worker, as well as upon failure
     * to construct or start a worker.  Removes record of worker from
     * array, and adjusts counts. If pool is shutting down, tries to
     * complete termination.
     *
     * @param wt the worker thread, or null if construction failed
     * @param ex the exception causing failure, or null if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    final WorkQueue registerWorker(ForkJoinWorkerThread wt) {

    /**
     * Callback from ForkJoinWorkerThread constructor to establish and
     * record its WorkQueue.
     *
     * @param wt the worker thread
     * @return the worker's queue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private void tryAddWorker(long c) {

    /**
     * Tries to add one worker, incrementing ctl counts before doing
     * so, relying on createWorker to back out on failure.
     *
     * @param c incoming ctl value, with total count negative and no
     * idle workers.  On CAS failure, c is refreshed and retried if
     * this holds (otherwise, a new worker is not needed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private boolean createWorker() {

    /**
     * Tries to construct and start one worker. Assumes that total
     * count has already been incremented as a reservation.  Invokes
     * deregisterWorker on any failure.
     *
     * @return true if successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private void unlockRunState(int oldRunState, int newRunState) {

    /**
     * Unlocks and sets runState to newRunState.
     *
     * @param oldRunState a value returned from lockRunState
     * @param newRunState the next value (must have lock bit clear).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private int awaitRunStateLock() {

    /**
     * Spins and/or blocks until runstate lock is available.  See
     * above for explanation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private int lockRunState() {

    /**
     * Acquires the runState lock; returns current (locked) runState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static final int SEED_INCREMENT = 0x9e3779b9;

    /**
     * Increment for seed generators. See class ThreadLocal for
     * explanation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static final int SPINS  = 0;

    /**
     * Number of times to spin-wait before blocking. The spins (in
     * awaitRunStateLock and awaitWork) currently use randomized
     * spins. Currently set to zero to reduce CPU usage.
     *
     * If greater than zero the value of SPINS must be a power
     * of two, at least 4.  A value of 2048 causes spinning for a
     * small fraction of typical context-switch times.
     *
     * If/when MWAIT-like intrinsics becomes available, they
     * may allow quieter spinning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static final int DEFAULT_COMMON_MAX_SPARES = 256;

    /**
     * The initial value for commonMaxSpares during static
     * initialization. The value is far in excess of normal
     * requirements, but also far short of MAX_CAP and typical
     * OS thread limits, so allows JVMs to catch misuse/abuse
     * before running out of resources needed to do so.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static final long TIMEOUT_SLOP = 20L * 1000L * 1000L;  // 20ms

    /**
     * Tolerance for idle timeouts, to cope with timer undershoots
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static final long IDLE_TIMEOUT = 2000L * 1000L * 1000L; // 2sec

    /**
     * Initial timeout value (in nanoseconds) for the thread
     * triggering quiescence to park waiting for new work. On timeout,
     * the thread will instead try to shrink the number of
     * workers. The value should be large enough to avoid overly
     * aggressive shrinkage during most transient stalls (long GCs
     * etc).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static final synchronized int nextPoolId() {

    /**
     * Returns the next sequence number. We don't expect this to
     * ever contend, so use simple builtin sync.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static int poolNumberSequence;

    /**
     * Sequence number for creating workerNamePrefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static int commonMaxSpares;

    /**
     * Limit on spare thread construction in tryCompensate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static final int commonParallelism;

    /**
     * Common pool parallelism. To allow simpler use and management
     * when common pool threads are disabled, we allow the underlying
     * common.parallelism field to be zero, but in that case still report
     * parallelism as 1 to reflect resulting caller-runs mechanics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static final ForkJoinPool common;

    /**
     * Common (static) pool. Non-null for public use unless a static
     * construction exception, but internal usages null-check on use
     * to paranoically avoid potential initialization circularities
     * as well as to simplify generated code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static final RuntimePermission modifyThreadPermission;

    /**
     * Permission required for callers of methods that may start or
     * kill threads.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public static final ForkJoinWorkerThreadFactory

    /**
     * Creates a new ForkJoinWorkerThread. This factory is used unless
     * overridden in ForkJoinPool constructors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final boolean isApparentlyUnblocked() {

        /**
         * Returns true if owned and not known to be blocked.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final int pollAndExecCC(CountedCompleter<?> task) {

        /**
         * Steals and runs a task in the same CC computation as the
         * given task if one exists and can be taken without
         * contention. Otherwise returns a checksum/control value for
         * use by method helpComplete.
         *
         * @return 1 if successful, 2 if retryable (lost to another
         * stealer), -1 if non-empty but no matching task found, else
         * the base index, forced negative.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final CountedCompleter<?> popCC(CountedCompleter<?> task, int mode) {

        /**
         * Pops task if in the same CC computation as the given task,
         * in either shared or owned mode. Used only by helpComplete.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final boolean tryRemoveAndExec(ForkJoinTask<?> task) {

        /**
         * If present, removes from queue and executes the given task,
         * or any other cancelled task. Used only by awaitJoin.
         *
         * @return true if queue empty and task not known to be done
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final void transferStealCount(ForkJoinPool p) {

        /**
         * Adds steal count to pool stealCounter if it exists, and resets.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final void runTask(ForkJoinTask<?> task) {

        /**
         * Executes the given task and any remaining local tasks.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final void execLocalTasks() {

        /**
         * Removes and executes all local tasks. If LIFO, invokes
         * pollAndExecAll. Otherwise implements a specialized pop loop
         * to exec until empty.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final void pollAndExecAll() {

        /**
         * Polls and runs tasks until empty.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final void cancelAll() {

        /**
         * Removes and cancels all known tasks, ignoring any exceptions.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final boolean tryUnpush(ForkJoinTask<?> t) {

        /**
         * Pops the given task only if it is at the current top.
         * (A shared version is available only via FJP.tryExternalUnpush)
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final ForkJoinTask<?> peek() {

        /**
         * Returns next task, if one exists, in order specified by mode.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final ForkJoinTask<?> nextLocalTask() {

        /**
         * Takes next task, if one exists, in order specified by mode.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final ForkJoinTask<?> poll() {

        /**
         * Takes next task, if one exists, in FIFO order.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final ForkJoinTask<?> pollAt(int b) {

        /**
         * Takes a task in FIFO order if b is base of queue and a task
         * can be claimed without contention. Specialized versions
         * appear in ForkJoinPool methods scan and helpStealer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final ForkJoinTask<?> pop() {

        /**
         * Takes next task, if one exists, in LIFO order.  Call only
         * by owner in unshared queues.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final ForkJoinTask<?>[] growArray() {

        /**
         * Initializes or doubles the capacity of array. Call either
         * by owner or with lock held -- it is OK for base, but not
         * top, to move while resizings are in progress.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final void push(ForkJoinTask<?> task) {

        /**
         * Pushes a task. Call only by owner in unshared queues.  (The
         * shared-queue version is embedded in method externalPush.)
         *
         * @param task the task. Caller must ensure non-null.
         * @throws RejectedExecutionException if array cannot be resized
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final boolean isEmpty() {

        /**
         * Provides a more accurate estimate of whether this queue has
         * any tasks than does queueSize, by checking whether a
         * near-empty queue has at least one unclaimed task.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final int queueSize() {

        /**
         * Returns the approximate number of tasks in the queue.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        final int getPoolIndex() {

        /**
         * Returns an exportable index (used by ForkJoinWorkerThread).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        static final int MAXIMUM_QUEUE_CAPACITY = 1 << 26; // 64M

        /**
         * Maximum size for queue arrays. Must be a power of two less
         * than or equal to 1 << (31 - width of array entry) to ensure
         * lack of wraparound of index calculations, but defined to a
         * value a bit less than this to help users trap runaway
         * programs before saturating systems.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
        static final int INITIAL_QUEUE_CAPACITY = 1 << 13;

        /**
         * Capacity of work-stealing queue array upon initialization.
         * Must be a power of two; at least 4, but should be larger to
         * reduce or eliminate cacheline sharing among queues.
         * Currently, it is much larger, as a partial workaround for
         * the fact that JVMs often place arrays in locations that
         * share GC bookkeeping (especially cardmarks) such that
         * per-write accesses encounter serious memory contention.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    @sun.misc.Contended

    /**
     * Queues supporting work-stealing as well as external task
     * submission. See above for descriptions and algorithms.
     * Performance on most platforms is very sensitive to placement of
     * instances of both WorkQueues and their arrays -- we absolutely
     * do not want multiple WorkQueue instances or multiple queue
     * arrays sharing cache lines. The @Contended annotation alerts
     * JVMs to try to keep instances apart.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static final class EmptyTask extends ForkJoinTask<Void> {

    /**
     * Class for artificial tasks that are used to replace the target
     * of local joins if they are removed from an interior queue slot
     * in WorkQueue.tryRemoveAndExec. We don't need the proxy to
     * actually do anything beyond having a unique identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    static final class DefaultForkJoinWorkerThreadFactory

    /**
     * Default ForkJoinWorkerThreadFactory implementation; creates a
     * new ForkJoinWorkerThread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    public static interface ForkJoinWorkerThreadFactory {

    /**
     * Factory for creating new {@link ForkJoinWorkerThread}s.
     * A {@code ForkJoinWorkerThreadFactory} must be defined and used
     * for {@code ForkJoinWorkerThread} subclasses that extend base
     * functionality or initialize threads with different contexts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
    private static void checkPermission() {

    /**
     * If there is a security manager, makes sure caller has
     * permission to modify threads.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/ForkJoinPool.java
@sun.misc.Contended

/**
 * An {@link ExecutorService} for running {@link ForkJoinTask}s.
 * A {@code ForkJoinPool} provides the entry point for submissions
 * from non-{@code ForkJoinTask} clients, as well as management and
 * monitoring operations.
 *
 * <p>A {@code ForkJoinPool} differs from other kinds of {@link
 * ExecutorService} mainly by virtue of employing
 * <em>work-stealing</em>: all threads in the pool attempt to find and
 * execute tasks submitted to the pool and/or created by other active
 * tasks (eventually blocking waiting for work if none exist). This
 * enables efficient processing when most tasks spawn other subtasks
 * (as do most {@code ForkJoinTask}s), as well as when many small
 * tasks are submitted to the pool from external clients.  Especially
 * when setting <em>asyncMode</em> to true in constructors, {@code
 * ForkJoinPool}s may also be appropriate for use with event-style
 * tasks that are never joined.
 *
 * <p>A static {@link #commonPool()} is available and appropriate for
 * most applications. The common pool is used by any ForkJoinTask that
 * is not explicitly submitted to a specified pool. Using the common
 * pool normally reduces resource usage (its threads are slowly
 * reclaimed during periods of non-use, and reinstated upon subsequent
 * use).
 *
 * <p>For applications that require separate or custom pools, a {@code
 * ForkJoinPool} may be constructed with a given target parallelism
 * level; by default, equal to the number of available processors.
 * The pool attempts to maintain enough active (or available) threads
 * by dynamically adding, suspending, or resuming internal worker
 * threads, even if some tasks are stalled waiting to join others.
 * However, no such adjustments are guaranteed in the face of blocked
 * I/O or other unmanaged synchronization. The nested {@link
 * ManagedBlocker} interface enables extension of the kinds of
 * synchronization accommodated.
 *
 * <p>In addition to execution and lifecycle control methods, this
 * class provides status check methods (for example
 * {@link #getStealCount}) that are intended to aid in developing,
 * tuning, and monitoring fork/join applications. Also, method
 * {@link #toString} returns indications of pool state in a
 * convenient form for informal monitoring.
 *
 * <p>As is the case with other ExecutorServices, there are three
 * main task execution methods summarized in the following table.
 * These are designed to be used primarily by clients not already
 * engaged in fork/join computations in the current pool.  The main
 * forms of these methods accept instances of {@code ForkJoinTask},
 * but overloaded forms also allow mixed execution of plain {@code
 * Runnable}- or {@code Callable}- based activities as well.  However,
 * tasks that are already executing in a pool should normally instead
 * use the within-computation forms listed in the table unless using
 * async event-style tasks that are not usually joined, in which case
 * there is little difference among choice of methods.
 *
 * <table BORDER CELLPADDING=3 CELLSPACING=1>
 * <caption>Summary of task execution methods</caption>
 *  <tr>
 *    <td></td>
 *    <td ALIGN=CENTER> <b>Call from non-fork/join clients</b></td>
 *    <td ALIGN=CENTER> <b>Call from within fork/join computations</b></td>
 *  </tr>
 *  <tr>
 *    <td> <b>Arrange async execution</b></td>
 *    <td> {@link #execute(ForkJoinTask)}</td>
 *    <td> {@link ForkJoinTask#fork}</td>
 *  </tr>
 *  <tr>
 *    <td> <b>Await and obtain result</b></td>
 *    <td> {@link #invoke(ForkJoinTask)}</td>
 *    <td> {@link ForkJoinTask#invoke}</td>
 *  </tr>
 *  <tr>
 *    <td> <b>Arrange exec and obtain Future</b></td>
 *    <td> {@link #submit(ForkJoinTask)}</td>
 *    <td> {@link ForkJoinTask#fork} (ForkJoinTasks <em>are</em> Futures)</td>
 *  </tr>
 * </table>
 *
 * <p>The common pool is by default constructed with default
 * parameters, but these may be controlled by setting three
 * {@linkplain System#getProperty system properties}:
 * <ul>
 * <li>{@code java.util.concurrent.ForkJoinPool.common.parallelism}
 * - the parallelism level, a non-negative integer
 * <li>{@code java.util.concurrent.ForkJoinPool.common.threadFactory}
 * - the class name of a {@link ForkJoinWorkerThreadFactory}
 * <li>{@code java.util.concurrent.ForkJoinPool.common.exceptionHandler}
 * - the class name of a {@link UncaughtExceptionHandler}
 * </ul>
 * If a {@link SecurityManager} is present and no factory is
 * specified, then the default pool uses a factory supplying
 * threads that have no {@link Permissions} enabled.
 * The system class loader is used to load these classes.
 * Upon any error in establishing these settings, default parameters
 * are used. It is possible to disable or limit the use of threads in
 * the common pool by setting the parallelism property to zero, and/or
 * using a factory that may return {@code null}. However doing so may
 * cause unjoined tasks to never be executed.
 *
 * <p><b>Implementation notes</b>: This implementation restricts the
 * maximum number of running threads to 32767. Attempts to create
 * pools with greater than the maximum number result in
 * {@code IllegalArgumentException}.
 *
 * <p>This implementation rejects submitted tasks (that is, by throwing
 * {@link RejectedExecutionException}) only when the pool is shut down
 * or internal resources have been exhausted.
 *
 * @since 1.7
 * @author Doug Lea
 */
