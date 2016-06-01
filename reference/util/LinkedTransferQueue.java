_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this queue to a stream (that is, serializes it).
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData All of the elements (each an {@code E}) in
     * the proper order, followed by a null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public int remainingCapacity() {

    /**
     * Always returns {@code Integer.MAX_VALUE} because a
     * {@code LinkedTransferQueue} is not capacity constrained.
     *
     * @return {@code Integer.MAX_VALUE} (as specified by
     *         {@link java.util.concurrent.BlockingQueue#remainingCapacity()
     *         BlockingQueue.remainingCapacity})
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean contains(Object o) {

    /**
     * Returns {@code true} if this queue contains the specified element.
     * More formally, returns {@code true} if and only if this queue contains
     * at least one element {@code e} such that {@code o.equals(e)}.
     *
     * @param o object to be checked for containment in this queue
     * @return {@code true} if this queue contains the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean remove(Object o) {

    /**
     * Removes a single instance of the specified element from this queue,
     * if it is present.  More formally, removes an element {@code e} such
     * that {@code o.equals(e)}, if this queue contains one or more such
     * elements.
     * Returns {@code true} if this queue contained the specified element
     * (or equivalently, if this queue changed as a result of the call).
     *
     * @param o element to be removed from this queue, if present
     * @return {@code true} if this queue changed as a result of the call
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public int size() {

    /**
     * Returns the number of elements in this queue.  If this queue
     * contains more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * <p>Beware that, unlike in most collections, this method is
     * <em>NOT</em> a constant-time operation. Because of the
     * asynchronous nature of these queues, determining the current
     * number of elements requires an O(n) traversal.
     *
     * @return the number of elements in this queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean isEmpty() {

    /**
     * Returns {@code true} if this queue contains no elements.
     *
     * @return {@code true} if this queue contains no elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public Iterator<E> iterator() {

    /**
     * Returns an iterator over the elements in this queue in proper sequence.
     * The elements will be returned in order from first (head) to last (tail).
     *
     * <p>The returned iterator is
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * @return an iterator over the elements in this queue in proper sequence
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public int drainTo(Collection<? super E> c, int maxElements) {

    /**
     * @throws NullPointerException     {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public int drainTo(Collection<? super E> c) {

    /**
     * @throws NullPointerException     {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean tryTransfer(E e, long timeout, TimeUnit unit)

    /**
     * Transfers the element to a consumer if it is possible to do so
     * before the timeout elapses.
     *
     * <p>More precisely, transfers the specified element immediately
     * if there exists a consumer already waiting to receive it (in
     * {@link #take} or timed {@link #poll(long,TimeUnit) poll}),
     * else inserts the specified element at the tail of this queue
     * and waits until the element is received by a consumer,
     * returning {@code false} if the specified wait time elapses
     * before the element can be transferred.
     *
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public void transfer(E e) throws InterruptedException {

    /**
     * Transfers the element to a consumer, waiting if necessary to do so.
     *
     * <p>More precisely, transfers the specified element immediately
     * if there exists a consumer already waiting to receive it (in
     * {@link #take} or timed {@link #poll(long,TimeUnit) poll}),
     * else inserts the specified element at the tail of this queue
     * and waits until the element is received by a consumer.
     *
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean tryTransfer(E e) {

    /**
     * Transfers the element to a waiting consumer immediately, if possible.
     *
     * <p>More precisely, transfers the specified element immediately
     * if there exists a consumer already waiting to receive it (in
     * {@link #take} or timed {@link #poll(long,TimeUnit) poll}),
     * otherwise returning {@code false} without enqueuing the element.
     *
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean add(E e) {

    /**
     * Inserts the specified element at the tail of this queue.
     * As the queue is unbounded, this method will never throw
     * {@link IllegalStateException} or return {@code false}.
     *
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean offer(E e) {

    /**
     * Inserts the specified element at the tail of this queue.
     * As the queue is unbounded, this method will never return {@code false}.
     *
     * @return {@code true} (as specified by {@link Queue#offer})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public boolean offer(E e, long timeout, TimeUnit unit) {

    /**
     * Inserts the specified element at the tail of this queue.
     * As the queue is unbounded, this method will never block or
     * return {@code false}.
     *
     * @return {@code true} (as specified by
     *  {@link java.util.concurrent.BlockingQueue#offer(Object,long,TimeUnit)
     *  BlockingQueue.offer})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public void put(E e) {

    /**
     * Inserts the specified element at the tail of this queue.
     * As the queue is unbounded, this method will never block.
     *
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public LinkedTransferQueue(Collection<? extends E> c) {

    /**
     * Creates a {@code LinkedTransferQueue}
     * initially containing the elements of the given collection,
     * added in traversal order of the collection's iterator.
     *
     * @param c the collection of elements to initially contain
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public LinkedTransferQueue() {

    /**
     * Creates an initially empty {@code LinkedTransferQueue}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private boolean findAndRemove(Object e) {

    /**
     * Main implementation of remove(Object)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private void sweep() {

    /**
     * Unlinks matched (typically cancelled) nodes encountered in a
     * traversal from head.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    final void unsplice(Node pred, Node s) {

    /**
     * Unsplices (now or later) the given deleted/cancelled node with
     * the given predecessor.
     *
     * @param pred a node that was at one time known to be the
     * predecessor of s, or null or s itself if s is/was at head
     * @param s the node to be unspliced
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    public Spliterator<E> spliterator() {

    /**
     * Returns a {@link Spliterator} over the elements in this queue.
     *
     * <p>The returned spliterator is
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * <p>The {@code Spliterator} reports {@link Spliterator#CONCURRENT},
     * {@link Spliterator#ORDERED}, and {@link Spliterator#NONNULL}.
     *
     * @implNote
     * The {@code Spliterator} implements {@code trySplit} to permit limited
     * parallelism.
     *
     * @return a {@code Spliterator} over the elements in this queue
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    static final class LTQSpliterator<E> implements Spliterator<E> {

    /** A customized variant of Spliterators.IteratorSpliterator */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        private void advance(Node prev) {

        /**
         * Moves to next node after prev, or first node if prev null.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private int countOfMode(boolean data) {

    /**
     * Traverses and counts unmatched nodes of the given mode.
     * Used by methods size and getWaitingConsumerCount.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private E firstDataItem() {

    /**
     * Returns the item in the first unmatched node with isData; or
     * null if none.  Used by peek.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    final Node firstDataNode() {

    /**
     * Version of firstOfMode used by Spliterator. Callers must
     * recheck if the returned node's item field is null or
     * self-linked before using.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private Node firstOfMode(boolean isData) {

    /**
     * Returns the first unmatched node of the given mode, or null if
     * none.  Used by methods isEmpty, hasWaitingConsumer.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    final Node succ(Node p) {

    /**
     * Returns the successor of p, or the head node if p.next has been
     * linked to self, which will only be true if traversing with a
     * stale pointer that is now off the list.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private static int spinsFor(Node pred, boolean haveData) {

    /**
     * Returns spin/yield value for a node with given predecessor and
     * data mode. See above for explanation.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private E awaitMatch(Node s, Node pred, E e, boolean timed, long nanos) {

    /**
     * Spins/yields/blocks until node s is matched or caller gives up.
     *
     * @param s the waiting node
     * @param pred the predecessor of s, or s itself if it has no
     * predecessor, or null if unknown (the null case does not occur
     * in any current calls but may in possible future extensions)
     * @param e the comparison value for checking match
     * @param timed if true, wait only until timeout elapses
     * @param nanos timeout in nanosecs, used only if timed is true
     * @return matched item, or e if unmatched on interrupt or timeout
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private Node tryAppend(Node s, boolean haveData) {

    /**
     * Tries to append node s as tail.
     *
     * @param s the node to append
     * @param haveData true if appending in data mode
     * @return null on failure due to losing race with append in
     * different mode, else s's predecessor, or s itself if no
     * predecessor
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private E xfer(E e, boolean haveData, int how, long nanos) {

    /**
     * Implements all queuing methods. See above for explanation.
     *
     * @param e the item or null for take
     * @param haveData true if this is a put, else a take
     * @param how NOW, ASYNC, SYNC, or TIMED
     * @param nanos timeout in nanosecs, used only if mode is TIMED
     * @return an item if matched, else e
     * @throws NullPointerException if haveData mode but e is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private transient volatile int sweepVotes;

    /** The number of apparent failures to unsplice removed nodes */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private transient volatile Node tail;

    /** tail of the queue; null until first append */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    transient volatile Node head;

    /** head of the queue; null until first enqueue */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        final boolean tryMatchData() {

        /**
         * Tries to artificially match a data node -- used by remove.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        final boolean cannotPrecede(boolean haveData) {

        /**
         * Returns true if a node with the given mode cannot be
         * appended to this node because this node is unmatched and
         * has opposite data mode.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        final boolean isUnmatchedRequest() {

        /**
         * Returns true if this is an unmatched request node.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        final boolean isMatched() {

        /**
         * Returns true if this node has been matched, including the
         * case of artificial matches due to cancellation.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        final void forgetContents() {

        /**
         * Sets item to self and waiter to null, to avoid garbage
         * retention after matching or cancelling. Uses relaxed writes
         * because order is already constrained in the only calling
         * contexts: item is forgotten only after volatile/atomic
         * mechanics that extract items.  Similarly, clearing waiter
         * follows either CAS or return from park (if ever parked;
         * else we don't care).
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        final void forgetNext() {

        /**
         * Links node to itself to avoid garbage retention.  Called
         * only after CASing head field, so uses relaxed write.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
        Node(Object item, boolean isData) {

        /**
         * Constructs a new node.  Uses relaxed write because item can
         * only be seen after publication via casNext.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    static final class Node {

    /**
     * Queue nodes. Uses Object, not E, for items to allow forgetting
     * them after use.  Relies heavily on Unsafe mechanics to minimize
     * unnecessary ordering constraints: Writes that are intrinsically
     * ordered wrt other accesses or CASes use simple relaxed forms.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    static final int SWEEP_THRESHOLD = 32;

    /**
     * The maximum number of estimated removal failures (sweepVotes)
     * to tolerate before sweeping through the queue unlinking
     * cancelled nodes that were not unlinked upon initial
     * removal. See above for explanation. The value must be at least
     * two to avoid useless sweeps when removing trailing nodes.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private static final int CHAINED_SPINS = FRONT_SPINS >>> 1;

    /**
     * The number of times to spin before blocking when a node is
     * preceded by another node that is apparently spinning.  Also
     * serves as an increment to FRONT_SPINS on phase changes, and as
     * base average frequency for yielding during spins. Must be a
     * power of two.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private static final int FRONT_SPINS   = 1 << 7;

    /**
     * The number of times to spin (with randomly interspersed calls
     * to Thread.yield) on multiprocessor before blocking when a node
     * is apparently the first waiter in the queue.  See above for
     * explanation. Must be a power of two. The value is empirically
     * derived -- it works pretty well across a variety of processors,
     * numbers of CPUs, and OSes.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
    private static final boolean MP =

    /** True if on multiprocessor */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/LinkedTransferQueue.java
public class LinkedTransferQueue<E> extends AbstractQueue<E>

/**
 * An unbounded {@link TransferQueue} based on linked nodes.
 * This queue orders elements FIFO (first-in-first-out) with respect
 * to any given producer.  The <em>head</em> of the queue is that
 * element that has been on the queue the longest time for some
 * producer.  The <em>tail</em> of the queue is that element that has
 * been on the queue the shortest time for some producer.
 *
 * <p>Beware that, unlike in most collections, the {@code size} method
 * is <em>NOT</em> a constant-time operation. Because of the
 * asynchronous nature of these queues, determining the current number
 * of elements requires a traversal of the elements, and so may report
 * inaccurate results if this collection is modified during traversal.
 * Additionally, the bulk operations {@code addAll},
 * {@code removeAll}, {@code retainAll}, {@code containsAll},
 * {@code equals}, and {@code toArray} are <em>not</em> guaranteed
 * to be performed atomically. For example, an iterator operating
 * concurrently with an {@code addAll} operation might view only some
 * of the added elements.
 *
 * <p>This class and its iterator implement all of the
 * <em>optional</em> methods of the {@link Collection} and {@link
 * Iterator} interfaces.
 *
 * <p>Memory consistency effects: As with other concurrent
 * collections, actions in a thread prior to placing an object into a
 * {@code LinkedTransferQueue}
 * <a href="package-summary.html#MemoryVisibility"><i>happen-before</i></a>
 * actions subsequent to the access or removal of that element from
 * the {@code LinkedTransferQueue} in another thread.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.7
 * @author Doug Lea
 * @param <E> the type of elements held in this collection
 */
