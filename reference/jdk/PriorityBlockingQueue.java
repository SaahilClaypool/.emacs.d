_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public Spliterator<E> spliterator() {

    /**
     * Returns a {@link Spliterator} over the elements in this queue.
     *
     * <p>The returned spliterator is
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * <p>The {@code Spliterator} reports {@link Spliterator#SIZED} and
     * {@link Spliterator#NONNULL}.
     *
     * @implNote
     * The {@code Spliterator} additionally reports {@link Spliterator#SUBSIZED}.
     *
     * @return a {@code Spliterator} over the elements in this queue
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes this queue from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this queue to a stream (that is, serializes it).
     *
     * For compatibility with previous version of this class, elements
     * are first copied to a java.util.PriorityQueue, which is then
     * serialized.
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    final class Itr implements Iterator<E> {

    /**
     * Snapshot iterator that works off copy of underlying q array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public Iterator<E> iterator() {

    /**
     * Returns an iterator over the elements in this queue. The
     * iterator does not return the elements in any particular order.
     *
     * <p>The returned iterator is
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * @return an iterator over the elements in this queue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public <T> T[] toArray(T[] a) {

    /**
     * Returns an array containing all of the elements in this queue; the
     * runtime type of the returned array is that of the specified array.
     * The returned array elements are in no particular order.
     * If the queue fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this queue.
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public void clear() {

    /**
     * Atomically removes all of the elements from this queue.
     * The queue will be empty after this call returns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public int drainTo(Collection<? super E> c, int maxElements) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public int drainTo(Collection<? super E> c) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public Object[] toArray() {

    /**
     * Returns an array containing all of the elements in this queue.
     * The returned array elements are in no particular order.
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    void removeEQ(Object o) {

    /**
     * Identity-based version for use in Itr.remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public boolean remove(Object o) {

    /**
     * Removes a single instance of the specified element from this queue,
     * if it is present.  More formally, removes an element {@code e} such
     * that {@code o.equals(e)}, if this queue contains one or more such
     * elements.  Returns {@code true} if and only if this queue contained
     * the specified element (or equivalently, if this queue changed as a
     * result of the call).
     *
     * @param o element to be removed from this queue, if present
     * @return {@code true} if this queue changed as a result of the call
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private void removeAt(int i) {

    /**
     * Removes the ith element from queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public int remainingCapacity() {

    /**
     * Always returns {@code Integer.MAX_VALUE} because
     * a {@code PriorityBlockingQueue} is not capacity constrained.
     * @return {@code Integer.MAX_VALUE} always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public Comparator<? super E> comparator() {

    /**
     * Returns the comparator used to order the elements in this queue,
     * or {@code null} if this queue uses the {@linkplain Comparable
     * natural ordering} of its elements.
     *
     * @return the comparator used to order the elements in this queue,
     *         or {@code null} if this queue uses the natural
     *         ordering of its elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public boolean offer(E e, long timeout, TimeUnit unit) {

    /**
     * Inserts the specified element into this priority queue.
     * As the queue is unbounded, this method will never block or
     * return {@code false}.
     *
     * @param e the element to add
     * @param timeout This parameter is ignored as the method never blocks
     * @param unit This parameter is ignored as the method never blocks
     * @return {@code true} (as specified by
     *  {@link BlockingQueue#offer(Object,long,TimeUnit) BlockingQueue.offer})
     * @throws ClassCastException if the specified element cannot be compared
     *         with elements currently in the priority queue according to the
     *         priority queue's ordering
     * @throws NullPointerException if the specified element is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public void put(E e) {

    /**
     * Inserts the specified element into this priority queue.
     * As the queue is unbounded, this method will never block.
     *
     * @param e the element to add
     * @throws ClassCastException if the specified element cannot be compared
     *         with elements currently in the priority queue according to the
     *         priority queue's ordering
     * @throws NullPointerException if the specified element is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public boolean offer(E e) {

    /**
     * Inserts the specified element into this priority queue.
     * As the queue is unbounded, this method will never return {@code false}.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Queue#offer})
     * @throws ClassCastException if the specified element cannot be compared
     *         with elements currently in the priority queue according to the
     *         priority queue's ordering
     * @throws NullPointerException if the specified element is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public boolean add(E e) {

    /**
     * Inserts the specified element into this priority queue.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws ClassCastException if the specified element cannot be compared
     *         with elements currently in the priority queue according to the
     *         priority queue's ordering
     * @throws NullPointerException if the specified element is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private void heapify() {

    /**
     * Establishes the heap invariant (described above) in the entire tree,
     * assuming nothing about the order of the elements prior to the call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private static <T> void siftDownComparable(int k, T x, Object[] array,
                                               int n) {

    /**
     * Inserts item x at position k, maintaining heap invariant by
     * demoting x down the tree repeatedly until it is less than or
     * equal to its children or is a leaf.
     *
     * @param k the position to fill
     * @param x the item to insert
     * @param array the heap array
     * @param n heap size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private static <T> void siftUpComparable(int k, T x, Object[] array) {

    /**
     * Inserts item x at position k, maintaining heap invariant by
     * promoting x up the tree until it is greater than or equal to
     * its parent, or is the root.
     *
     * To simplify and speed up coercions and comparisons. the
     * Comparable and Comparator versions are separated into different
     * methods that are otherwise identical. (Similarly for siftDown.)
     * These methods are static, with heap state as arguments, to
     * simplify use in light of possible comparator exceptions.
     *
     * @param k the position to fill
     * @param x the item to insert
     * @param array the heap array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private E dequeue() {

    /**
     * Mechanics for poll().  Call only while holding lock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private void tryGrow(Object[] array, int oldCap) {

    /**
     * Tries to grow array to accommodate at least one more element
     * (but normally expand by about 50%), giving up (allowing retry)
     * on contention (which we expect to be rare). Call only while
     * holding lock.
     *
     * @param array the heap array
     * @param oldCap the length of the array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public PriorityBlockingQueue(Collection<? extends E> c) {

    /**
     * Creates a {@code PriorityBlockingQueue} containing the elements
     * in the specified collection.  If the specified collection is a
     * {@link SortedSet} or a {@link PriorityQueue}, this
     * priority queue will be ordered according to the same ordering.
     * Otherwise, this priority queue will be ordered according to the
     * {@linkplain Comparable natural ordering} of its elements.
     *
     * @param  c the collection whose elements are to be placed
     *         into this priority queue
     * @throws ClassCastException if elements of the specified collection
     *         cannot be compared to one another according to the priority
     *         queue's ordering
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public PriorityBlockingQueue(int initialCapacity,
                                 Comparator<? super E> comparator) {

    /**
     * Creates a {@code PriorityBlockingQueue} with the specified initial
     * capacity that orders its elements according to the specified
     * comparator.
     *
     * @param initialCapacity the initial capacity for this priority queue
     * @param  comparator the comparator that will be used to order this
     *         priority queue.  If {@code null}, the {@linkplain Comparable
     *         natural ordering} of the elements will be used.
     * @throws IllegalArgumentException if {@code initialCapacity} is less
     *         than 1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public PriorityBlockingQueue(int initialCapacity) {

    /**
     * Creates a {@code PriorityBlockingQueue} with the specified
     * initial capacity that orders its elements according to their
     * {@linkplain Comparable natural ordering}.
     *
     * @param initialCapacity the initial capacity for this priority queue
     * @throws IllegalArgumentException if {@code initialCapacity} is less
     *         than 1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    public PriorityBlockingQueue() {

    /**
     * Creates a {@code PriorityBlockingQueue} with the default
     * initial capacity (11) that orders its elements according to
     * their {@linkplain Comparable natural ordering}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private PriorityQueue<E> q;

    /**
     * A plain PriorityQueue used only for serialization,
     * to maintain compatibility with previous versions
     * of this class. Non-null only during serialization/deserialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private transient volatile int allocationSpinLock;

    /**
     * Spinlock for allocation, acquired via CAS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private final Condition notEmpty;

    /**
     * Condition for blocking when empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private final ReentrantLock lock;

    /**
     * Lock used for all public operations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private transient Comparator<? super E> comparator;

    /**
     * The comparator, or null if priority queue uses elements'
     * natural ordering.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private transient int size;

    /**
     * The number of elements in the priority queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private transient Object[] queue;

    /**
     * Priority queue represented as a balanced binary heap: the two
     * children of queue[n] are queue[2*n+1] and queue[2*(n+1)].  The
     * priority queue is ordered by comparator, or by the elements'
     * natural ordering, if comparator is null: For each node n in the
     * heap and each descendant d of n, n <= d.  The element with the
     * lowest value is in queue[0], assuming the queue is nonempty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * The maximum size of array to allocate.
     * Some VMs reserve some header words in an array.
     * Attempts to allocate larger arrays may result in
     * OutOfMemoryError: Requested array size exceeds VM limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
    private static final int DEFAULT_INITIAL_CAPACITY = 11;

    /**
     * Default array capacity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/PriorityBlockingQueue.java
@SuppressWarnings("unchecked")

/**
 * An unbounded {@linkplain BlockingQueue blocking queue} that uses
 * the same ordering rules as class {@link PriorityQueue} and supplies
 * blocking retrieval operations.  While this queue is logically
 * unbounded, attempted additions may fail due to resource exhaustion
 * (causing {@code OutOfMemoryError}). This class does not permit
 * {@code null} elements.  A priority queue relying on {@linkplain
 * Comparable natural ordering} also does not permit insertion of
 * non-comparable objects (doing so results in
 * {@code ClassCastException}).
 *
 * <p>This class and its iterator implement all of the
 * <em>optional</em> methods of the {@link Collection} and {@link
 * Iterator} interfaces.  The Iterator provided in method {@link
 * #iterator()} is <em>not</em> guaranteed to traverse the elements of
 * the PriorityBlockingQueue in any particular order. If you need
 * ordered traversal, consider using
 * {@code Arrays.sort(pq.toArray())}.  Also, method {@code drainTo}
 * can be used to <em>remove</em> some or all elements in priority
 * order and place them in another collection.
 *
 * <p>Operations on this class make no guarantees about the ordering
 * of elements with equal priority. If you need to enforce an
 * ordering, you can define custom classes or comparators that use a
 * secondary key to break ties in primary priority values.  For
 * example, here is a class that applies first-in-first-out
 * tie-breaking to comparable elements. To use it, you would insert a
 * {@code new FIFOEntry(anEntry)} instead of a plain entry object.
 *
 *  <pre> {@code
 * class FIFOEntry<E extends Comparable<? super E>>
 *     implements Comparable<FIFOEntry<E>> {
 *   static final AtomicLong seq = new AtomicLong(0);
 *   final long seqNum;
 *   final E entry;
 *   public FIFOEntry(E entry) {
 *     seqNum = seq.getAndIncrement();
 *     this.entry = entry;
 *   }
 *   public E getEntry() { return entry; }
 *   public int compareTo(FIFOEntry<E> other) {
 *     int res = entry.compareTo(other.entry);
 *     if (res == 0 && other.entry != this.entry)
 *       res = (seqNum < other.seqNum ? -1 : 1);
 *     return res;
 *   }
 * }}</pre>
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <E> the type of elements held in this collection
 */
