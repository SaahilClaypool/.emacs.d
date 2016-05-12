_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected void cancelLaterNodes() {

    /**
     * Cancels all tasks which succeed this one in the encounter order.  This
     * includes canceling all the current task's right sibling, as well as the
     * later right siblings of all its parents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected boolean taskCanceled() {

    /**
     * Queries whether this task is canceled.  A task is considered canceled if
     * it or any of its parents have been canceled.
     *
     * @return {@code true} if this task or any parent is canceled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected void cancel() {

    /**
     * Mark this task as canceled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    @Override

    /**
     * Retrieves the local result for this task.  If this task is the root,
     * retrieves the shared result instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    @Override

    /**
     * Retrieves the local result for this task
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    @Override

    /**
     * Sets a local result for this task.  If this task is the root, set the
     * shared result instead (if not already set).
     *
     * @param localResult The result to set for this task
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected void shortCircuit(R result) {

    /**
     * Declares that a globally valid result has been found.  If another task has
     * not already found the answer, the result is installed in
     * {@code sharedResult}.  The {@code compute()} method will check
     * {@code sharedResult} before proceeding with computation, so this causes
     * the computation to terminate early.
     *
     * @param result the result found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    @Override

    /**
     * Overrides AbstractTask version to include checks for early
     * exits while splitting or computing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected abstract R getEmptyResult();

    /**
     * Returns the value indicating the computation completed with no task
     * finding a short-circuitable result.  For example, for a "find" operation,
     * this might be null or an empty {@code Optional}.
     *
     * @return the result to return when no task finds a result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected AbstractShortCircuitTask(K parent,
                                       Spliterator<P_IN> spliterator) {

    /**
     * Constructor for non-root nodes.
     *
     * @param parent parent task in the computation tree
     * @param spliterator the {@code Spliterator} for the portion of the
     *                    computation tree described by this task
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected AbstractShortCircuitTask(PipelineHelper<P_OUT> helper,
                                       Spliterator<P_IN> spliterator) {

    /**
     * Constructor for root tasks.
     *
     * @param helper the {@code PipelineHelper} describing the stream pipeline
     *               up to this operation
     * @param spliterator the {@code Spliterator} describing the source for this
     *                    pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected volatile boolean canceled;

    /**
     * Indicates whether this task has been canceled.  Tasks may cancel other
     * tasks in the computation under various conditions, such as in a
     * find-first operation, a task that finds a value will cancel all tasks
     * that are later in the encounter order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
    protected final AtomicReference<R> sharedResult;

    /**
     * The result for this computation; this is shared among all tasks and set
     * exactly once
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/AbstractShortCircuitTask.java
@SuppressWarnings("serial")

/**
 * Abstract class for fork-join tasks used to implement short-circuiting
 * stream ops, which can produce a result without processing all elements of the
 * stream.
 *
 * @param <P_IN> type of input elements to the pipeline
 * @param <P_OUT> type of output elements from the pipeline
 * @param <R> type of intermediate result, may be different from operation
 *        result type
 * @param <K> type of child and sibling tasks
 * @since 1.8
 */
