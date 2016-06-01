_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
//         public String toString() {

//         /** Uncomment for debugging. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        boolean takeIndexWrapped() {

        /**
         * Called whenever takeIndex wraps around to zero.
         *
         * @return true if this iterator should be unlinked from itrs
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        boolean removedAt(int removedIndex) {

        /**
         * Called whenever an interior remove (not at takeIndex) occurred.
         *
         * @return true if this iterator should be unlinked from itrs
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        void shutdown() {

        /**
         * Called to notify the iterator that the queue is empty, or that it
         * has fallen hopelessly behind, so that it should abandon any
         * further iteration, except possibly to return one more element
         * from next(), as promised by returning true from hasNext().
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        public boolean hasNext() {

        /**
         * For performance reasons, we would like not to acquire a lock in
         * hasNext in the common case.  To allow for this, we only access
         * fields (i.e. nextItem) that are not modified by update operations
         * triggered by queue modifications.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private void detach() {

        /**
         * Called when itrs should stop tracking this iterator, either
         * because there are no more indices to update (cursor < 0 &&
         * nextIndex < 0 && lastRet < 0) or as a special exception, when
         * lastRet >= 0, because hasNext() is about to return false for the
         * first time.  Call only from iterating thread.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private void incorporateDequeues() {

        /**
         * Adjusts indices to incorporate all dequeues since the last
         * operation on this iterator.  Call only from iterating thread.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private boolean invalidated(int index, int prevTakeIndex,
                                    long dequeues, int length) {

        /**
         * Returns true if index is invalidated by the given number of
         * dequeues, starting from prevTakeIndex.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private static final int DETACHED = -3;

        /** Special value for prevTakeIndex indicating "detached mode" */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private static final int REMOVED = -2;

        /**
         * Special index value indicating "removed elsewhere", that is,
         * removed by some operation other than a call to this.remove().
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private static final int NONE = -1;

        /** Special index value indicating "not available" or "undefined" */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private int prevCycles;

        /** Previous value of iters.cycles */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private int prevTakeIndex;

        /** Previous value of takeIndex, or DETACHED when detached */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private int lastRet;

        /** Index of lastItem, NONE if none, REMOVED if removed elsewhere */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private E lastItem;

        /** Last element returned; null if none or not detached. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private int nextIndex;

        /** Index of nextItem; NONE if none, REMOVED if removed elsewhere */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private E nextItem;

        /** Element to be returned by next call to next(); null if none */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private int cursor;

        /** Index to look for new nextItem; NONE at end */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    private class Itr implements Iterator<E> {

    /**
     * Iterator for ArrayBlockingQueue.
     *
     * To maintain weak consistency with respect to puts and takes, we
     * read ahead one slot, so as to not report hasNext true but then
     * not have an element to return.
     *
     * We switch into "detached" mode (allowing prompt unlinking from
     * itrs without help from the GC) when all indices are negative, or
     * when hasNext returns false for the first time.  This allows the
     * iterator to track concurrent updates completely accurately,
     * except for the corner case of the user calling Iterator.remove()
     * after hasNext() returned false.  Even in this case, we ensure
     * that we don't remove the wrong element by keeping track of the
     * expected element to remove, in lastItem.  Yes, we may fail to
     * remove lastItem from the queue if it moved due to an interleaved
     * interior remove while in detached mode.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        void elementDequeued() {

        /**
         * Called whenever an element has been dequeued (at takeIndex).
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        void queueIsEmpty() {

        /**
         * Called whenever the queue becomes empty.
         *
         * Notifies all active iterators that the queue is empty,
         * clears all weak refs, and unlinks the itrs datastructure.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        void removedAt(int removedIndex) {

        /**
         * Called whenever an interior remove (not at takeIndex) occurred.
         *
         * Notifies all iterators, and expunges any that are now stale.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        void takeIndexWrapped() {

        /**
         * Called whenever takeIndex wraps around to 0.
         *
         * Notifies all iterators, and expunges any that are now stale.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        void register(Itr itr) {

        /**
         * Adds a new iterator to the linked list of tracked iterators.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        void doSomeSweeping(boolean tryHarder) {

        /**
         * Sweeps itrs, looking for and expunging stale iterators.
         * If at least one was found, tries harder to find more.
         * Called only from iterating thread.
         *
         * @param tryHarder whether to start in try-harder mode, because
         * there is known to be at least one iterator to collect
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private Node sweeper = null;

        /** Used to expunge stale iterators */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private Node head;

        /** Linked list of weak iterator references */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        int cycles = 0;

        /** Incremented whenever takeIndex wraps around to 0 */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
        private class Node extends WeakReference<Itr> {

        /**
         * Node in a linked list of weak iterator references.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    class Itrs {

    /**
     * Shared data between iterators and their queue, allowing queue
     * modifications to update iterators when elements are removed.
     *
     * This adds a lot of complexity for the sake of correctly
     * handling some uncommon operations, but the combination of
     * circular-arrays and supporting interior removes (i.e., those
     * not at head) would cause iterators to sometimes lose their
     * places and/or (re)report elements they shouldn't.  To avoid
     * this, when a queue has one or more iterators, it keeps iterator
     * state consistent by:
     *
     * (1) keeping track of the number of "cycles", that is, the
     *     number of times takeIndex has wrapped around to 0.
     * (2) notifying all iterators via the callback removedAt whenever
     *     an interior element is removed (and thus other elements may
     *     be shifted).
     *
     * These suffice to eliminate iterator inconsistencies, but
     * unfortunately add the secondary responsibility of maintaining
     * the list of iterators.  We track all active iterators in a
     * simple linked list (accessed only when the queue's lock is
     * held) of weak references to Itr.  The list is cleaned up using
     * 3 different mechanisms:
     *
     * (1) Whenever a new iterator is created, do some O(1) checking for
     *     stale list elements.
     *
     * (2) Whenever takeIndex wraps around to 0, check for iterators
     *     that have been unused for more than one wrap-around cycle.
     *
     * (3) Whenever the queue becomes empty, all iterators are notified
     *     and this entire data structure is discarded.
     *
     * So in addition to the removedAt callback that is necessary for
     * correctness, iterators have the shutdown and takeIndexWrapped
     * callbacks that help remove stale iterators from the list.
     *
     * Whenever a list element is examined, it is expunged if either
     * the GC has determined that the iterator is discarded, or if the
     * iterator reports that it is "detached" (does not need any
     * further state updates).  Overhead is maximal when takeIndex
     * never advances, iterators are discarded before they are
     * exhausted, and all removals are interior removes, in which case
     * all stale iterators are discovered by the GC.  But even in this
     * case we don't increase the amortized complexity.
     *
     * Care must be taken to keep list sweeping methods from
     * reentrantly invoking another such method, causing subtle
     * corruption bugs.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public int drainTo(Collection<? super E> c, int maxElements) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public int drainTo(Collection<? super E> c) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public void clear() {

    /**
     * Atomically removes all of the elements from this queue.
     * The queue will be empty after this call returns.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array containing all of the elements in this queue, in
     * proper sequence; the runtime type of the returned array is that of
     * the specified array.  If the queue fits in the specified array, it
     * is returned therein.  Otherwise, a new array is allocated with the
     * runtime type of the specified array and the size of this queue.
     *
     * <p>If this queue fits in the specified array with room to spare
     * (i.e., the array has more elements than this queue), the element in
     * the array immediately following the end of the queue is set to
     * {@code null}.
     *
     * <p>Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * <p>Suppose {@code x} is a queue known to contain only strings.
     * The following code can be used to dump the queue into a newly
     * allocated array of {@code String}:
     *
     *  <pre> {@code String[] y = x.toArray(new String[0]);}</pre>
     *
     * Note that {@code toArray(new Object[0])} is identical in function to
     * {@code toArray()}.
     *
     * @param a the array into which the elements of the queue are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose
     * @return an array containing all of the elements in this queue
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this queue
     * @throws NullPointerException if the specified array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public Object[] toArray() {

    /**
     * Returns an array containing all of the elements in this queue, in
     * proper sequence.
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this queue.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public boolean remove(Object o) {

    /**
     * Removes a single instance of the specified element from this queue,
     * if it is present.  More formally, removes an element {@code e} such
     * that {@code o.equals(e)}, if this queue contains one or more such
     * elements.
     * Returns {@code true} if this queue contained the specified element
     * (or equivalently, if this queue changed as a result of the call).
     *
     * <p>Removal of interior elements in circular array based queues
     * is an intrinsically slow and disruptive operation, so should
     * be undertaken only in exceptional circumstances, ideally
     * only when the queue is known not to be accessible by other
     * threads.
     *
     * @param o element to be removed from this queue, if present
     * @return {@code true} if this queue changed as a result of the call
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public int remainingCapacity() {

    /**
     * Returns the number of additional elements that this queue can ideally
     * (in the absence of memory or resource constraints) accept without
     * blocking. This is always equal to the initial capacity of this queue
     * less the current {@code size} of this queue.
     *
     * <p>Note that you <em>cannot</em> always tell if an attempt to insert
     * an element will succeed by inspecting {@code remainingCapacity}
     * because it may be the case that another thread is about to
     * insert or remove an element.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public int size() {

    /**
     * Returns the number of elements in this queue.
     *
     * @return the number of elements in this queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public boolean offer(E e, long timeout, TimeUnit unit)

    /**
     * Inserts the specified element at the tail of this queue, waiting
     * up to the specified wait time for space to become available if
     * the queue is full.
     *
     * @throws InterruptedException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public void put(E e) throws InterruptedException {

    /**
     * Inserts the specified element at the tail of this queue, waiting
     * for space to become available if the queue is full.
     *
     * @throws InterruptedException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public boolean offer(E e) {

    /**
     * Inserts the specified element at the tail of this queue if it is
     * possible to do so immediately without exceeding the queue's capacity,
     * returning {@code true} upon success and {@code false} if this queue
     * is full.  This method is generally preferable to method {@link #add},
     * which can fail to insert an element only by throwing an exception.
     *
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public boolean add(E e) {

    /**
     * Inserts the specified element at the tail of this queue if it is
     * possible to do so immediately without exceeding the queue's capacity,
     * returning {@code true} upon success and throwing an
     * {@code IllegalStateException} if this queue is full.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws IllegalStateException if this queue is full
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public ArrayBlockingQueue(int capacity, boolean fair,
                              Collection<? extends E> c) {

    /**
     * Creates an {@code ArrayBlockingQueue} with the given (fixed)
     * capacity, the specified access policy and initially containing the
     * elements of the given collection,
     * added in traversal order of the collection's iterator.
     *
     * @param capacity the capacity of this queue
     * @param fair if {@code true} then queue accesses for threads blocked
     *        on insertion or removal, are processed in FIFO order;
     *        if {@code false} the access order is unspecified.
     * @param c the collection of elements to initially contain
     * @throws IllegalArgumentException if {@code capacity} is less than
     *         {@code c.size()}, or less than 1.
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public ArrayBlockingQueue(int capacity, boolean fair) {

    /**
     * Creates an {@code ArrayBlockingQueue} with the given (fixed)
     * capacity and the specified access policy.
     *
     * @param capacity the capacity of this queue
     * @param fair if {@code true} then queue accesses for threads blocked
     *        on insertion or removal, are processed in FIFO order;
     *        if {@code false} the access order is unspecified.
     * @throws IllegalArgumentException if {@code capacity < 1}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    public ArrayBlockingQueue(int capacity) {

    /**
     * Creates an {@code ArrayBlockingQueue} with the given (fixed)
     * capacity and default access policy.
     *
     * @param capacity the capacity of this queue
     * @throws IllegalArgumentException if {@code capacity < 1}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    void removeAt(final int removeIndex) {

    /**
     * Deletes item at array index removeIndex.
     * Utility for remove(Object) and iterator.remove.
     * Call only when holding lock.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    private E dequeue() {

    /**
     * Extracts element at current take position, advances, and signals.
     * Call only when holding lock.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    private void enqueue(E x) {

    /**
     * Inserts element at current put position, advances, and signals.
     * Call only when holding lock.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    private static void checkNotNull(Object v) {

    /**
     * Throws NullPointerException if argument is null.
     *
     * @param v the element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    @SuppressWarnings("unchecked")

    /**
     * Returns item at index i.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    final int dec(int i) {

    /**
     * Circularly decrement i.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    transient Itrs itrs = null;

    /**
     * Shared state for currently active iterators, or null if there
     * are known not to be any.  Allows queue operations to update
     * iterator state.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    private final Condition notFull;

    /** Condition for waiting puts */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    private final Condition notEmpty;

    /** Condition for waiting takes */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    final ReentrantLock lock;

    /** Main lock guarding all access */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    int count;

    /** Number of elements in the queue */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    int putIndex;

    /** items index for next put, offer, or add */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    int takeIndex;

    /** items index for next take, poll, peek or remove */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    final Object[] items;

    /** The queued items */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
    private static final long serialVersionUID = -817911632652898426L;

    /**
     * Serialization ID. This class relies on default serialization
     * even for the items array, which is default-serialized, even if
     * it is empty. Otherwise it could not be declared final, which is
     * necessary here.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ArrayBlockingQueue.java
public class ArrayBlockingQueue<E> extends AbstractQueue<E>

/**
 * A bounded {@linkplain BlockingQueue blocking queue} backed by an
 * array.  This queue orders elements FIFO (first-in-first-out).  The
 * <em>head</em> of the queue is that element that has been on the
 * queue the longest time.  The <em>tail</em> of the queue is that
 * element that has been on the queue the shortest time. New elements
 * are inserted at the tail of the queue, and the queue retrieval
 * operations obtain elements at the head of the queue.
 *
 * <p>This is a classic &quot;bounded buffer&quot;, in which a
 * fixed-sized array holds elements inserted by producers and
 * extracted by consumers.  Once created, the capacity cannot be
 * changed.  Attempts to {@code put} an element into a full queue
 * will result in the operation blocking; attempts to {@code take} an
 * element from an empty queue will similarly block.
 *
 * <p>This class supports an optional fairness policy for ordering
 * waiting producer and consumer threads.  By default, this ordering
 * is not guaranteed. However, a queue constructed with fairness set
 * to {@code true} grants threads access in FIFO order. Fairness
 * generally decreases throughput but reduces variability and avoids
 * starvation.
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
 * @author Doug Lea
 * @param <E> the type of elements held in this collection
 */
