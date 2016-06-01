_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    private static void checkNotNull(Object v) {

    /**
     * Throws NullPointerException if argument is null.
     *
     * @param v the element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    static final class CLQSpliterator<E> implements Spliterator<E> {

    /** A customized variant of Spliterators.IteratorSpliterator */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
        private E advance() {

        /**
         * Moves to next valid node and returns item to return for
         * next(), or null if no such.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
        private Node<E> lastRet;

        /**
         * Node of the last returned item, to support remove.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
        private E nextItem;

        /**
         * nextItem holds on to item fields because once we claim
         * that an element exists in hasNext(), we must return it in
         * the following next() call even if it was in the process of
         * being removed when hasNext() was called.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
        private Node<E> nextNode;

        /**
         * Next node to return item for.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    public boolean addAll(Collection<? extends E> c) {

    /**
     * Appends all of the elements in the specified collection to the end of
     * this queue, in the order that they are returned by the specified
     * collection's iterator.  Attempts to {@code addAll} of a queue to
     * itself result in {@code IllegalArgumentException}.
     *
     * @param c the elements to be inserted into this queue
     * @return {@code true} if this queue changed as a result of the call
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     * @throws IllegalArgumentException if the collection is this queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
     * Additionally, if elements are added or removed during execution
     * of this method, the returned result may be inaccurate.  Thus,
     * this method is typically not very useful in concurrent
     * applications.
     *
     * @return the number of elements in this queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    public boolean isEmpty() {

    /**
     * Returns {@code true} if this queue contains no elements.
     *
     * @return {@code true} if this queue contains no elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    Node<E> first() {

    /**
     * Returns the first live (non-deleted) node on list, or null if none.
     * This is yet another variant of poll/peek; here returning the
     * first node, not element.  We could make peek() a wrapper around
     * first(), but that would cost an extra volatile read of item,
     * and the need to add a retry loop to deal with the possibility
     * of losing a race to a concurrent poll().
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    final Node<E> succ(Node<E> p) {

    /**
     * Returns the successor of p, or the head node if p.next has been
     * linked to self, which will only be true if traversing with a
     * stale pointer that is now off the list.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    final void updateHead(Node<E> h, Node<E> p) {

    /**
     * Tries to CAS head to p. If successful, repoint old head to itself
     * as sentinel for succ(), below.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    public ConcurrentLinkedQueue(Collection<? extends E> c) {

    /**
     * Creates a {@code ConcurrentLinkedQueue}
     * initially containing the elements of the given collection,
     * added in traversal order of the collection's iterator.
     *
     * @param c the collection of elements to initially contain
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    public ConcurrentLinkedQueue() {

    /**
     * Creates a {@code ConcurrentLinkedQueue} that is initially empty.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    private transient volatile Node<E> tail;

    /**
     * A node from which the last node on list (that is, the unique
     * node with node.next == null) can be reached in O(1) time.
     * Invariants:
     * - the last node is always reachable from tail via succ()
     * - tail != null
     * Non-invariants:
     * - tail.item may or may not be null.
     * - it is permitted for tail to lag behind head, that is, for tail
     *   to not be reachable from head!
     * - tail.next may or may not be self-pointing to tail.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
    private transient volatile Node<E> head;

    /**
     * A node from which the first live (non-deleted) node (if any)
     * can be reached in O(1) time.
     * Invariants:
     * - all live nodes are reachable from head via succ()
     * - head != null
     * - (tmp = head).next != tmp || tmp != head
     * Non-invariants:
     * - head.item may or may not be null.
     * - it is permitted for tail to lag behind head, that is, for tail
     *   to not be reachable from head!
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
        Node(E item) {

        /**
         * Constructs a new node.  Uses relaxed write because item can
         * only be seen after publication via casNext.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedQueue.java
public class ConcurrentLinkedQueue<E> extends AbstractQueue<E>

/**
 * An unbounded thread-safe {@linkplain Queue queue} based on linked nodes.
 * This queue orders elements FIFO (first-in-first-out).
 * The <em>head</em> of the queue is that element that has been on the
 * queue the longest time.
 * The <em>tail</em> of the queue is that element that has been on the
 * queue the shortest time. New elements
 * are inserted at the tail of the queue, and the queue retrieval
 * operations obtain elements at the head of the queue.
 * A {@code ConcurrentLinkedQueue} is an appropriate choice when
 * many threads will share access to a common collection.
 * Like most other concurrent collection implementations, this class
 * does not permit the use of {@code null} elements.
 *
 * <p>This implementation employs an efficient <em>non-blocking</em>
 * algorithm based on one described in <a
 * href="http://www.cs.rochester.edu/u/michael/PODC96.html"> Simple,
 * Fast, and Practical Non-Blocking and Blocking Concurrent Queue
 * Algorithms</a> by Maged M. Michael and Michael L. Scott.
 *
 * <p>Iterators are <i>weakly consistent</i>, returning elements
 * reflecting the state of the queue at some point at or since the
 * creation of the iterator.  They do <em>not</em> throw {@link
 * java.util.ConcurrentModificationException}, and may proceed concurrently
 * with other operations.  Elements contained in the queue since the creation
 * of the iterator will be returned exactly once.
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
 * <p>This class and its iterator implement all of the <em>optional</em>
 * methods of the {@link Queue} and {@link Iterator} interfaces.
 *
 * <p>Memory consistency effects: As with other concurrent
 * collections, actions in a thread prior to placing an object into a
 * {@code ConcurrentLinkedQueue}
 * <a href="package-summary.html#MemoryVisibility"><i>happen-before</i></a>
 * actions subsequent to the access or removal of that element from
 * the {@code ConcurrentLinkedQueue} in another thread.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <E> the type of elements held in this collection
 */
