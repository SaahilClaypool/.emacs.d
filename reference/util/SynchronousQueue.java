_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes this queue from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this queue to a stream (that is, serializes it).
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public int drainTo(Collection<? super E> c, int maxElements) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public int drainTo(Collection<? super E> c) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public <T> T[] toArray(T[] a) {

    /**
     * Sets the zeroeth element of the specified array to {@code null}
     * (if the array has non-zero length) and returns it.
     *
     * @param a the array
     * @return the specified array
     * @throws NullPointerException if the specified array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public Object[] toArray() {

    /**
     * Returns a zero-length array.
     * @return a zero-length array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public Spliterator<E> spliterator() {

    /**
     * Returns an empty spliterator in which calls to
     * {@link java.util.Spliterator#trySplit()} always return {@code null}.
     *
     * @return an empty spliterator
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public Iterator<E> iterator() {

    /**
     * Returns an empty iterator in which {@code hasNext} always returns
     * {@code false}.
     *
     * @return an empty iterator
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public E peek() {

    /**
     * Always returns {@code null}.
     * A {@code SynchronousQueue} does not return elements
     * unless actively waited on.
     *
     * @return {@code null}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean retainAll(Collection<?> c) {

    /**
     * Always returns {@code false}.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @param c the collection
     * @return {@code false}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean removeAll(Collection<?> c) {

    /**
     * Always returns {@code false}.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @param c the collection
     * @return {@code false}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean containsAll(Collection<?> c) {

    /**
     * Returns {@code false} unless the given collection is empty.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @param c the collection
     * @return {@code false} unless given collection is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean remove(Object o) {

    /**
     * Always returns {@code false}.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @param o the element to remove
     * @return {@code false}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean contains(Object o) {

    /**
     * Always returns {@code false}.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @param o the element
     * @return {@code false}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public void clear() {

    /**
     * Does nothing.
     * A {@code SynchronousQueue} has no internal capacity.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public int remainingCapacity() {

    /**
     * Always returns zero.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @return zero
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public int size() {

    /**
     * Always returns zero.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @return zero
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean isEmpty() {

    /**
     * Always returns {@code true}.
     * A {@code SynchronousQueue} has no internal capacity.
     *
     * @return {@code true}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public E poll() {

    /**
     * Retrieves and removes the head of this queue, if another thread
     * is currently making an element available.
     *
     * @return the head of this queue, or {@code null} if no
     *         element is available
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {

    /**
     * Retrieves and removes the head of this queue, waiting
     * if necessary up to the specified wait time, for another thread
     * to insert it.
     *
     * @return the head of this queue, or {@code null} if the
     *         specified waiting time elapses before an element is present
     * @throws InterruptedException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public E take() throws InterruptedException {

    /**
     * Retrieves and removes the head of this queue, waiting if necessary
     * for another thread to insert it.
     *
     * @return the head of this queue
     * @throws InterruptedException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean offer(E e) {

    /**
     * Inserts the specified element into this queue, if another thread is
     * waiting to receive it.
     *
     * @param e the element to add
     * @return {@code true} if the element was added to this queue, else
     *         {@code false}
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public boolean offer(E e, long timeout, TimeUnit unit)

    /**
     * Inserts the specified element into this queue, waiting if necessary
     * up to the specified wait time for another thread to receive it.
     *
     * @return {@code true} if successful, or {@code false} if the
     *         specified waiting time elapses before a consumer appears
     * @throws InterruptedException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public void put(E e) throws InterruptedException {

    /**
     * Adds the specified element to this queue, waiting if necessary for
     * another thread to receive it.
     *
     * @throws InterruptedException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public SynchronousQueue(boolean fair) {

    /**
     * Creates a {@code SynchronousQueue} with the specified fairness policy.
     *
     * @param fair if true, waiting threads contend in FIFO order for
     *        access; otherwise the order is unspecified.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    public SynchronousQueue() {

    /**
     * Creates a {@code SynchronousQueue} with nonfair access policy.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    private transient volatile Transferer<E> transferer;

    /**
     * The transferer. Set only in constructor, but cannot be declared
     * as final without further complicating serialization.  Since
     * this is accessed only at most once per public method, there
     * isn't a noticeable performance penalty for using volatile
     * instead of final here.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        void clean(QNode pred, QNode s) {

        /**
         * Gets rid of cancelled node s with original predecessor pred.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        Object awaitFulfill(QNode s, E e, boolean timed, long nanos) {

        /**
         * Spins/blocks until node s is fulfilled.
         *
         * @param s the waiting node
         * @param e the comparison value for checking match
         * @param timed true if timed wait
         * @param nanos timeout value
         * @return matched item, or s if cancelled
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        @SuppressWarnings("unchecked")

        /**
         * Puts or takes an item.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        boolean casCleanMe(QNode cmp, QNode val) {

        /**
         * Tries to CAS cleanMe slot.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        void advanceTail(QNode t, QNode nt) {

        /**
         * Tries to cas nt as new tail.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        void advanceHead(QNode h, QNode nh) {

        /**
         * Tries to cas nh as new head; if successful, unlink
         * old head's next node to avoid garbage retention.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        transient volatile QNode cleanMe;

        /**
         * Reference to a cancelled node that might not yet have been
         * unlinked from queue because it was the last inserted node
         * when it was cancelled.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        transient volatile QNode tail;

        /** Tail of queue */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        transient volatile QNode head;

        /** Head of queue */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
            boolean isOffList() {

            /**
             * Returns true if this node is known to be off the queue
             * because its next pointer has been forgotten due to
             * an advanceHead operation.
             */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
            void tryCancel(Object cmp) {

            /**
             * Tries to cancel by CAS'ing ref to this as item.
             */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        static final class QNode {

        /** Node class for TransferQueue. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    static final class TransferQueue<E> extends Transferer<E> {

    /** Dual Queue */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        void clean(SNode s) {

        /**
         * Unlinks s from the stack.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        boolean shouldSpin(SNode s) {

        /**
         * Returns true if node s is at head or there is an active
         * fulfiller.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        SNode awaitFulfill(SNode s, boolean timed, long nanos) {

        /**
         * Spins/blocks until node s is matched by a fulfill operation.
         *
         * @param s the waiting node
         * @param timed true if timed wait
         * @param nanos timeout value
         * @return matched node, or s if cancelled
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        @SuppressWarnings("unchecked")

        /**
         * Puts or takes an item.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        static SNode snode(SNode s, Object e, SNode next, int mode) {

        /**
         * Creates or resets fields of a node. Called only from transfer
         * where the node to push on stack is lazily created and
         * reused when possible to help reduce intervals between reads
         * and CASes of head and to avoid surges of garbage when CASes
         * to push nodes fail due to contention.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        volatile SNode head;

        /** The head (top) of the stack */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
            void tryCancel() {

            /**
             * Tries to cancel a wait by matching node to itself.
             */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
            boolean tryMatch(SNode s) {

            /**
             * Tries to match node s to this node, if so, waking up thread.
             * Fulfillers call tryMatch to identify their waiters.
             * Waiters block until they have been matched.
             *
             * @param s the node to match
             * @return true if successfully matched to s
             */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        static final class SNode {

        /** Node class for TransferStacks. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        static boolean isFulfilling(int m) { return (m & FULFILLING) != 0; }

        /** Returns true if m has fulfilling bit set. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        static final int FULFILLING = 2;

        /** Node is fulfilling another unfulfilled DATA or REQUEST */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        static final int DATA       = 1;

        /** Node represents an unfulfilled producer */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        static final int REQUEST    = 0;

        /** Node represents an unfulfilled consumer */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    static final class TransferStack<E> extends Transferer<E> {

    /** Dual stack */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    static final long spinForTimeoutThreshold = 1000L;

    /**
     * The number of nanoseconds for which it is faster to spin
     * rather than to use timed park. A rough estimate suffices.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    static final int maxUntimedSpins = maxTimedSpins * 16;

    /**
     * The number of times to spin before blocking in untimed waits.
     * This is greater than timed value because untimed waits spin
     * faster since they don't need to check times on each spin.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    static final int maxTimedSpins = (NCPUS < 2) ? 0 : 32;

    /**
     * The number of times to spin before blocking in timed waits.
     * The value is empirically derived -- it works well across a
     * variety of processors and OSes. Empirically, the best value
     * seems not to vary with number of CPUs (beyond 2) so is just
     * a constant.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    static final int NCPUS = Runtime.getRuntime().availableProcessors();

    /** The number of CPUs, for spin control */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
        abstract E transfer(E e, boolean timed, long nanos);

        /**
         * Performs a put or take.
         *
         * @param e if non-null, the item to be handed to a consumer;
         *          if null, requests that transfer return an item
         *          offered by producer.
         * @param timed if this operation should timeout
         * @param nanos the timeout, in nanoseconds
         * @return if non-null, the item provided or received; if null,
         *         the operation failed due to timeout or interrupt --
         *         the caller can distinguish which of these occurred
         *         by checking Thread.interrupted.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
    abstract static class Transferer<E> {

    /**
     * Shared internal API for dual stacks and queues.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/SynchronousQueue.java
public class SynchronousQueue<E> extends AbstractQueue<E>

/**
 * A {@linkplain BlockingQueue blocking queue} in which each insert
 * operation must wait for a corresponding remove operation by another
 * thread, and vice versa.  A synchronous queue does not have any
 * internal capacity, not even a capacity of one.  You cannot
 * {@code peek} at a synchronous queue because an element is only
 * present when you try to remove it; you cannot insert an element
 * (using any method) unless another thread is trying to remove it;
 * you cannot iterate as there is nothing to iterate.  The
 * <em>head</em> of the queue is the element that the first queued
 * inserting thread is trying to add to the queue; if there is no such
 * queued thread then no element is available for removal and
 * {@code poll()} will return {@code null}.  For purposes of other
 * {@code Collection} methods (for example {@code contains}), a
 * {@code SynchronousQueue} acts as an empty collection.  This queue
 * does not permit {@code null} elements.
 *
 * <p>Synchronous queues are similar to rendezvous channels used in
 * CSP and Ada. They are well suited for handoff designs, in which an
 * object running in one thread must sync up with an object running
 * in another thread in order to hand it some information, event, or
 * task.
 *
 * <p>This class supports an optional fairness policy for ordering
 * waiting producer and consumer threads.  By default, this ordering
 * is not guaranteed. However, a queue constructed with fairness set
 * to {@code true} grants threads access in FIFO order.
 *
 * <p>This class and its iterator implement all of the
 * <em>optional</em> methods of the {@link Collection} and {@link
 * Iterator} interfaces.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.5
 * @author Doug Lea and Bill Scherer and Michael Scott
 * @param <E> the type of elements held in this collection
 */
