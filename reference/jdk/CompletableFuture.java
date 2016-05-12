_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public String toString() {

    /**
     * Returns a string identifying this CompletableFuture, as well as
     * its completion state.  The state, in brackets, contains the
     * String {@code "Completed Normally"} or the String {@code
     * "Completed Exceptionally"}, or the String {@code "Not
     * completed"} followed by the number of CompletableFutures
     * dependent upon its completion, if any.
     *
     * @return a string identifying this CompletableFuture, as well as its state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public int getNumberOfDependents() {

    /**
     * Returns the estimated number of CompletableFutures whose
     * completions are awaiting completion of this CompletableFuture.
     * This method is designed for use in monitoring system state, not
     * for synchronization control.
     *
     * @return the number of dependent CompletableFutures
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public void obtrudeException(Throwable ex) {

    /**
     * Forcibly causes subsequent invocations of method {@link #get()}
     * and related methods to throw the given exception, whether or
     * not already completed. This method is designed for use only in
     * error recovery actions, and even in such situations may result
     * in ongoing dependent completions using established versus
     * overwritten outcomes.
     *
     * @param ex the exception
     * @throws NullPointerException if the exception is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public void obtrudeValue(T value) {

    /**
     * Forcibly sets or resets the value subsequently returned by
     * method {@link #get()} and related methods, whether or not
     * already completed. This method is designed for use only in
     * error recovery actions, and even in such situations may result
     * in ongoing dependent completions using established versus
     * overwritten outcomes.
     *
     * @param value the completion value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public boolean isCompletedExceptionally() {

    /**
     * Returns {@code true} if this CompletableFuture completed
     * exceptionally, in any way. Possible causes include
     * cancellation, explicit invocation of {@code
     * completeExceptionally}, and abrupt termination of a
     * CompletionStage action.
     *
     * @return {@code true} if this CompletableFuture completed
     * exceptionally
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public boolean isCancelled() {

    /**
     * Returns {@code true} if this CompletableFuture was cancelled
     * before it completed normally.
     *
     * @return {@code true} if this CompletableFuture was cancelled
     * before it completed normally
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public boolean cancel(boolean mayInterruptIfRunning) {

    /**
     * If not already completed, completes this CompletableFuture with
     * a {@link CancellationException}. Dependent CompletableFutures
     * that have not already completed will also complete
     * exceptionally, with a {@link CompletionException} caused by
     * this {@code CancellationException}.
     *
     * @param mayInterruptIfRunning this value has no effect in this
     * implementation because interrupts are not used to control
     * processing.
     *
     * @return {@code true} if this task is now cancelled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static CompletableFuture<Object> anyOf(CompletableFuture<?>... cfs) {

    /**
     * Returns a new CompletableFuture that is completed when any of
     * the given CompletableFutures complete, with the same result.
     * Otherwise, if it completed exceptionally, the returned
     * CompletableFuture also does so, with a CompletionException
     * holding this exception as its cause.  If no CompletableFutures
     * are provided, returns an incomplete CompletableFuture.
     *
     * @param cfs the CompletableFutures
     * @return a new CompletableFuture that is completed with the
     * result or exception of any of the given CompletableFutures when
     * one completes
     * @throws NullPointerException if the array or any of its elements are
     * {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static CompletableFuture<Void> allOf(CompletableFuture<?>... cfs) {

    /**
     * Returns a new CompletableFuture that is completed when all of
     * the given CompletableFutures complete.  If any of the given
     * CompletableFutures complete exceptionally, then the returned
     * CompletableFuture also does so, with a CompletionException
     * holding this exception as its cause.  Otherwise, the results,
     * if any, of the given CompletableFutures are not reflected in
     * the returned CompletableFuture, but may be obtained by
     * inspecting them individually. If no CompletableFutures are
     * provided, returns a CompletableFuture completed with the value
     * {@code null}.
     *
     * <p>Among the applications of this method is to await completion
     * of a set of independent CompletableFutures before continuing a
     * program, as in: {@code CompletableFuture.allOf(c1, c2,
     * c3).join();}.
     *
     * @param cfs the CompletableFutures
     * @return a new CompletableFuture that is completed when all of the
     * given CompletableFutures complete
     * @throws NullPointerException if the array or any of its elements are
     * {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public CompletableFuture<T> exceptionally(
        Function<Throwable, ? extends T> fn) {

    /**
     * Returns a new CompletableFuture that is completed when this
     * CompletableFuture completes, with the result of the given
     * function of the exception triggering this CompletableFuture's
     * completion when it completes exceptionally; otherwise, if this
     * CompletableFuture completes normally, then the returned
     * CompletableFuture also completes normally with the same value.
     * Note: More flexible versions of this functionality are
     * available using methods {@code whenComplete} and {@code handle}.
     *
     * @param fn the function to use to compute the value of the
     * returned CompletableFuture if this CompletableFuture completed
     * exceptionally
     * @return the new CompletableFuture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public CompletableFuture<T> toCompletableFuture() {

    /**
     * Returns this CompletableFuture.
     *
     * @return this CompletableFuture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public boolean completeExceptionally(Throwable ex) {

    /**
     * If not already completed, causes invocations of {@link #get()}
     * and related methods to throw the given exception.
     *
     * @param ex the exception
     * @return {@code true} if this invocation caused this CompletableFuture
     * to transition to a completed state, else {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public boolean complete(T value) {

    /**
     * If not already completed, sets the value returned by {@link
     * #get()} and related methods to the given value.
     *
     * @param value the result value
     * @return {@code true} if this invocation caused this CompletableFuture
     * to transition to a completed state, else {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public T getNow(T valueIfAbsent) {

    /**
     * Returns the result value (or throws any encountered exception)
     * if completed, else returns the given valueIfAbsent.
     *
     * @param valueIfAbsent the value to return if not completed
     * @return the result value, if completed, else the given valueIfAbsent
     * @throws CancellationException if the computation was cancelled
     * @throws CompletionException if this future completed
     * exceptionally or a completion computation threw an exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public T join() {

    /**
     * Returns the result value when complete, or throws an
     * (unchecked) exception if completed exceptionally. To better
     * conform with the use of common functional forms, if a
     * computation involved in the completion of this
     * CompletableFuture threw an exception, this method throws an
     * (unchecked) {@link CompletionException} with the underlying
     * exception as its cause.
     *
     * @return the result value
     * @throws CancellationException if the computation was cancelled
     * @throws CompletionException if this future completed
     * exceptionally or a completion computation threw an exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public T get(long timeout, TimeUnit unit)

    /**
     * Waits if necessary for at most the given time for this future
     * to complete, and then returns its result, if available.
     *
     * @param timeout the maximum time to wait
     * @param unit the time unit of the timeout argument
     * @return the result value
     * @throws CancellationException if this future was cancelled
     * @throws ExecutionException if this future completed exceptionally
     * @throws InterruptedException if the current thread was interrupted
     * while waiting
     * @throws TimeoutException if the wait timed out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public T get() throws InterruptedException, ExecutionException {

    /**
     * Waits if necessary for this future to complete, and then
     * returns its result.
     *
     * @return the result value
     * @throws CancellationException if this future was cancelled
     * @throws ExecutionException if this future completed exceptionally
     * @throws InterruptedException if the current thread was interrupted
     * while waiting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public boolean isDone() {

    /**
     * Returns {@code true} if completed in any fashion: normally,
     * exceptionally, or via cancellation.
     *
     * @return {@code true} if completed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static <U> CompletableFuture<U> completedFuture(U value) {

    /**
     * Returns a new CompletableFuture that is already completed with
     * the given value.
     *
     * @param value the value
     * @param <U> the type of the value
     * @return the completed CompletableFuture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static CompletableFuture<Void> runAsync(Runnable runnable,
                                                   Executor executor) {

    /**
     * Returns a new CompletableFuture that is asynchronously completed
     * by a task running in the given executor after it runs the given
     * action.
     *
     * @param runnable the action to run before completing the
     * returned CompletableFuture
     * @param executor the executor to use for asynchronous execution
     * @return the new CompletableFuture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static CompletableFuture<Void> runAsync(Runnable runnable) {

    /**
     * Returns a new CompletableFuture that is asynchronously completed
     * by a task running in the {@link ForkJoinPool#commonPool()} after
     * it runs the given action.
     *
     * @param runnable the action to run before completing the
     * returned CompletableFuture
     * @return the new CompletableFuture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier,
                                                       Executor executor) {

    /**
     * Returns a new CompletableFuture that is asynchronously completed
     * by a task running in the given executor with the value obtained
     * by calling the given Supplier.
     *
     * @param supplier a function returning the value to be used
     * to complete the returned CompletableFuture
     * @param executor the executor to use for asynchronous execution
     * @param <U> the function's return type
     * @return the new CompletableFuture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier) {

    /**
     * Returns a new CompletableFuture that is asynchronously completed
     * by a task running in the {@link ForkJoinPool#commonPool()} with
     * the value obtained by calling the given Supplier.
     *
     * @param supplier a function returning the value to be used
     * to complete the returned CompletableFuture
     * @param <U> the function's return type
     * @return the new CompletableFuture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    private CompletableFuture(Object r) {

    /**
     * Creates a new complete CompletableFuture with given encoded result.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public CompletableFuture() {

    /**
     * Creates a new incomplete CompletableFuture.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    private Object timedGet(long nanos) throws TimeoutException {

    /**
     * Returns raw result after waiting, or null if interrupted, or
     * throws TimeoutException on timeout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    private Object waitingGet(boolean interruptible) {

    /**
     * Returns raw result after waiting, or null if interruptible and
     * interrupted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    @SuppressWarnings("serial")

    /**
     * Completion for recording and releasing a waiting thread.  This
     * class implements ManagedBlocker to avoid starvation when
     * blocking actions pile up in ForkJoinPools.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static CompletableFuture<Object> orTree(CompletableFuture<?>[] cfs,
                                            int lo, int hi) {

    /** Recursively constructs a tree of completions. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final void orpush(CompletableFuture<?> b, BiCompletion<?,?,?> c) {

    /** Pushes completion to this and b unless either done. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static CompletableFuture<Void> andTree(CompletableFuture<?>[] cfs,
                                           int lo, int hi) {

    /** Recursively constructs a tree of completions. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final CompletableFuture<T> postFire(CompletableFuture<?> a,
                                        CompletableFuture<?> b, int mode) {

    /** Post-processing after successful BiCompletion tryFire. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final void bipush(CompletableFuture<?> b, BiCompletion<?,?,?> c) {

    /** Pushes completion to this and b unless both done. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    @SuppressWarnings("serial")

    /** A Completion delegating to a BiCompletion */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    @SuppressWarnings("serial")

    /** A Completion for an action with two sources */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final CompletableFuture<T> postFire(CompletableFuture<?> a, int mode) {

    /**
     * Post-processing by dependent after successful UniCompletion
     * tryFire.  Tries to clean stack of source a, and then either runs
     * postComplete or returns this to caller, depending on mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final void push(UniCompletion<?,?> c) {

    /** Pushes the given completion (if it exists) unless done. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
        final boolean claim() {

        /**
         * Returns true if action can be run. Call only when known to
         * be triggerable. Uses FJ tag bit to ensure that only one
         * thread claims ownership.  If async, starts as task -- a
         * later call to tryFire will run action.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    @SuppressWarnings("serial")

    /** A Completion with a source, dependent, and executor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final void cleanStack() {

    /** Traverses stack and unlinks dead Completions. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final void postComplete() {

    /**
     * Pops and tries to trigger all reachable dependents.  Call only
     * when known to be done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
        abstract boolean isLive();

        /** Returns true if possibly still triggerable. Used by cleanStack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
        abstract CompletableFuture<?> tryFire(int mode);

        /**
         * Performs completion action if triggered, returning a
         * dependent that may need propagation, if one exists.
         *
         * @param mode SYNC, ASYNC, or NESTED
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static Executor screenExecutor(Executor e) {

    /**
     * Null-checks user executor argument, and translates uses of
     * commonPool to asyncPool in case parallelism disabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static final class ThreadPerTaskExecutor implements Executor {

    /** Fallback if ForkJoinPool.commonPool() cannot support parallelism */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    private static final Executor asyncPool = useCommonPool ?

    /**
     * Default executor -- ForkJoinPool.commonPool() unless it cannot
     * support parallelism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    public static interface AsynchronousCompletionTask {

    /**
     * A marker interface identifying asynchronous tasks produced by
     * {@code async} methods. This may be useful for monitoring,
     * debugging, and tracking asynchronous activities.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    private static <T> T reportJoin(Object r) {

    /**
     * Decodes outcome to return result or throw unchecked exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    private static <T> T reportGet(Object r)

    /**
     * Reports result using Future.get conventions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final boolean completeRelay(Object r) {

    /**
     * Completes with r or a copy of r, unless already completed.
     * If exceptional, r is first coerced to a CompletionException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static Object encodeRelay(Object r) {

    /**
     * Returns the encoding of a copied outcome; if exceptional,
     * rewraps as a CompletionException, else returns argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    Object encodeOutcome(T t, Throwable x) {

    /**
     * Returns the encoding of the given arguments: if the exception
     * is non-null, encodes as AltResult.  Otherwise uses the given
     * value, boxed as NIL if null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final boolean completeThrowable(Throwable x, Object r) {

    /**
     * Completes with the given (non-null) exceptional result as a
     * wrapped CompletionException unless it is one already, unless
     * already completed.  May complete with the given Object r
     * (which must have been the result of a source future) if it is
     * equivalent, i.e. if this is a simple propagation of an
     * existing CompletionException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static Object encodeThrowable(Throwable x, Object r) {

    /**
     * Returns the encoding of the given (non-null) exception as a
     * wrapped CompletionException unless it is one already.  May
     * return the given Object r (which must have been the result of a
     * source future) if it is equivalent, i.e. if this is a simple
     * relay of an existing CompletionException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final boolean completeThrowable(Throwable x) {

    /** Completes with an exceptional result, unless already completed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static AltResult encodeThrowable(Throwable x) {

    /**
     * Returns the encoding of the given (non-null) exception as a
     * wrapped CompletionException unless it is one already.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final boolean completeValue(T t) {

    /** Completes with a non-exceptional result, unless already completed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final Object encodeValue(T t) {

    /** Returns the encoding of the given non-exceptional value. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final boolean completeNull() {

    /** Completes with the null value, unless already completed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    static final AltResult NIL = new AltResult(null);

    /** The encoding of the null value. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final void pushStack(Completion c) {

    /** Unconditionally pushes c onto stack, retrying if necessary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
    final boolean tryPushStack(Completion c) {

    /** Returns true if successfully pushed c onto stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/CompletableFuture.java
public class CompletableFuture<T> implements Future<T>, CompletionStage<T> {

/**
 * A {@link Future} that may be explicitly completed (setting its
 * value and status), and may be used as a {@link CompletionStage},
 * supporting dependent functions and actions that trigger upon its
 * completion.
 *
 * <p>When two or more threads attempt to
 * {@link #complete complete},
 * {@link #completeExceptionally completeExceptionally}, or
 * {@link #cancel cancel}
 * a CompletableFuture, only one of them succeeds.
 *
 * <p>In addition to these and related methods for directly
 * manipulating status and results, CompletableFuture implements
 * interface {@link CompletionStage} with the following policies: <ul>
 *
 * <li>Actions supplied for dependent completions of
 * <em>non-async</em> methods may be performed by the thread that
 * completes the current CompletableFuture, or by any other caller of
 * a completion method.</li>
 *
 * <li>All <em>async</em> methods without an explicit Executor
 * argument are performed using the {@link ForkJoinPool#commonPool()}
 * (unless it does not support a parallelism level of at least two, in
 * which case, a new Thread is created to run each task).  To simplify
 * monitoring, debugging, and tracking, all generated asynchronous
 * tasks are instances of the marker interface {@link
 * AsynchronousCompletionTask}. </li>
 *
 * <li>All CompletionStage methods are implemented independently of
 * other public methods, so the behavior of one method is not impacted
 * by overrides of others in subclasses.  </li> </ul>
 *
 * <p>CompletableFuture also implements {@link Future} with the following
 * policies: <ul>
 *
 * <li>Since (unlike {@link FutureTask}) this class has no direct
 * control over the computation that causes it to be completed,
 * cancellation is treated as just another form of exceptional
 * completion.  Method {@link #cancel cancel} has the same effect as
 * {@code completeExceptionally(new CancellationException())}. Method
 * {@link #isCompletedExceptionally} can be used to determine if a
 * CompletableFuture completed in any exceptional fashion.</li>
 *
 * <li>In case of exceptional completion with a CompletionException,
 * methods {@link #get()} and {@link #get(long, TimeUnit)} throw an
 * {@link ExecutionException} with the same cause as held in the
 * corresponding CompletionException.  To simplify usage in most
 * contexts, this class also defines methods {@link #join()} and
 * {@link #getNow} that instead throw the CompletionException directly
 * in these cases.</li> </ul>
 *
 * @author Doug Lea
 * @since 1.8
 */
