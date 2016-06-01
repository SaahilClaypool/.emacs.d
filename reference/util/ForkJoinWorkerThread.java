_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
        private static ThreadGroup createThreadGroup() {

        /**
         * Returns a new group with the system ThreadGroup (the
         * topmost, parent-less group) as parent.  Uses Unsafe to
         * traverse Thread.group and ThreadGroup.parent fields.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
        private static final AccessControlContext INNOCUOUS_ACC =

        /** An AccessControlContext supporting no privileges */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
        private static final ThreadGroup innocuousThreadGroup =

        /** The ThreadGroup for all InnocuousForkJoinWorkerThreads */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    static final class InnocuousForkJoinWorkerThread extends ForkJoinWorkerThread {

    /**
     * A worker thread that has no permissions, is not a member of any
     * user-defined ThreadGroup, and erases all ThreadLocals after
     * running each top-level task.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    void afterTopLevelExec() {

    /**
     * Non-public hook method for InnocuousForkJoinWorkerThread
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    final void eraseThreadLocals() {

    /**
     * Erases ThreadLocals by nulling out Thread maps.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    public void run() {

    /**
     * This method is required to be public, but should never be
     * called explicitly. It performs the main run loop to execute
     * {@link ForkJoinTask}s.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    protected void onTermination(Throwable exception) {

    /**
     * Performs cleanup associated with termination of this worker
     * thread.  If you override this method, you must invoke
     * {@code super.onTermination} at the end of the overridden method.
     *
     * @param exception the exception causing this thread to abort due
     * to an unrecoverable error, or {@code null} if completed normally
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    protected void onStart() {

    /**
     * Initializes internal state after construction but before
     * processing any tasks. If you override this method, you must
     * invoke {@code super.onStart()} at the beginning of the method.
     * Initialization requires care: Most fields must have legal
     * default values, to ensure that attempted accesses from other
     * threads work correctly even before this thread starts
     * processing tasks.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    public int getPoolIndex() {

    /**
     * Returns the unique index number of this thread in its pool.
     * The returned value ranges from zero to the maximum number of
     * threads (minus one) that may exist in the pool, and does not
     * change during the lifetime of the thread.  This method may be
     * useful for applications that track status or collect results
     * per-worker-thread rather than per-task.
     *
     * @return the index number
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    public ForkJoinPool getPool() {

    /**
     * Returns the pool hosting this thread.
     *
     * @return the pool
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    ForkJoinWorkerThread(ForkJoinPool pool, ThreadGroup threadGroup,
                         AccessControlContext acc) {

    /**
     * Version for InnocuousForkJoinWorkerThread
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
    protected ForkJoinWorkerThread(ForkJoinPool pool) {

    /**
     * Creates a ForkJoinWorkerThread operating in the given pool.
     *
     * @param pool the pool this thread works in
     * @throws NullPointerException if pool is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ForkJoinWorkerThread.java
public class ForkJoinWorkerThread extends Thread {

/**
 * A thread managed by a {@link ForkJoinPool}, which executes
 * {@link ForkJoinTask}s.
 * This class is subclassable solely for the sake of adding
 * functionality -- there are no overridable methods dealing with
 * scheduling or execution.  However, you can override initialization
 * and termination methods surrounding the main task processing loop.
 * If you do create such a subclass, you will also need to supply a
 * custom {@link ForkJoinPool.ForkJoinWorkerThreadFactory} to
 * {@linkplain ForkJoinPool#ForkJoinPool use it} in a {@code ForkJoinPool}.
 *
 * @since 1.7
 * @author Doug Lea
 */
