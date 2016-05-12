_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes this deque from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this deque to a stream (that is, serializes it).
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData The capacity (int), followed by elements (each an
     * {@code Object}) in the proper order, followed by a null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public Spliterator<E> spliterator() {

    /**
     * Returns a {@link Spliterator} over the elements in this deque.
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
     * @return a {@code Spliterator} over the elements in this deque
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    static final class LBDSpliterator<E> implements Spliterator<E> {

    /** A customized variant of Spliterators.IteratorSpliterator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private class DescendingItr extends AbstractItr {

    /** Descending iterator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private class Itr extends AbstractItr {

    /** Forward iterator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
        void advance() {

        /**
         * Advances next.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
        private Node<E> succ(Node<E> n) {

        /**
         * Returns the successor node of the given non-null, but
         * possibly previously deleted, node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
        private Node<E> lastRet;

        /**
         * Node returned by most recent call to next. Needed by remove.
         * Reset to null if this element is deleted by a call to remove.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
        E nextItem;

        /**
         * nextItem holds on to item fields because once we claim that
         * an element exists in hasNext(), we must return item read
         * under lock (in advance()) even if it was in the process of
         * being removed when hasNext() was called.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private abstract class AbstractItr implements Iterator<E> {

    /**
     * Base class for Iterators for LinkedBlockingDeque
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public Iterator<E> descendingIterator() {

    /**
     * Returns an iterator over the elements in this deque in reverse
     * sequential order.  The elements will be returned in order from
     * last (tail) to first (head).
     *
     * <p>The returned iterator is
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * @return an iterator over the elements in this deque in reverse order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public Iterator<E> iterator() {

    /**
     * Returns an iterator over the elements in this deque in proper sequence.
     * The elements will be returned in order from first (head) to last (tail).
     *
     * <p>The returned iterator is
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * @return an iterator over the elements in this deque in proper sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public void clear() {

    /**
     * Atomically removes all of the elements from this deque.
     * The deque will be empty after this call returns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array containing all of the elements in this deque, in
     * proper sequence; the runtime type of the returned array is that of
     * the specified array.  If the deque fits in the specified array, it
     * is returned therein.  Otherwise, a new array is allocated with the
     * runtime type of the specified array and the size of this deque.
     *
     * <p>If this deque fits in the specified array with room to spare
     * (i.e., the array has more elements than this deque), the element in
     * the array immediately following the end of the deque is set to
     * {@code null}.
     *
     * <p>Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * <p>Suppose {@code x} is a deque known to contain only strings.
     * The following code can be used to dump the deque into a newly
     * allocated array of {@code String}:
     *
     *  <pre> {@code String[] y = x.toArray(new String[0]);}</pre>
     *
     * Note that {@code toArray(new Object[0])} is identical in function to
     * {@code toArray()}.
     *
     * @param a the array into which the elements of the deque are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose
     * @return an array containing all of the elements in this deque
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this deque
     * @throws NullPointerException if the specified array is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array containing all of the elements in this deque, in
     * proper sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this deque.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this deque
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
//     public boolean addAll(Collection<? extends E> c) {

//     /**
//      * Adds all of the elements in the specified collection to this
//      * queue.  Attempts to addAll of a queue to itself result in
//      * {@code IllegalArgumentException}. Further, the behavior of
//      * this operation is undefined if the specified collection is
//      * modified while the operation is in progress.
//      *
//      * @param c collection containing elements to be added to this queue
//      * @return {@code true} if this queue changed as a result of the call
//      * @throws ClassCastException            {@inheritDoc}
//      * @throws NullPointerException          {@inheritDoc}
//      * @throws IllegalArgumentException      {@inheritDoc}
//      * @throws IllegalStateException if this deque is full
//      * @see #add(Object)
//      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean contains(Object o) {

    /**
     * Returns {@code true} if this deque contains the specified element.
     * More formally, returns {@code true} if and only if this deque contains
     * at least one element {@code e} such that {@code o.equals(e)}.
     *
     * @param o object to be checked for containment in this deque
     * @return {@code true} if this deque contains the specified element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public int size() {

    /**
     * Returns the number of elements in this deque.
     *
     * @return the number of elements in this deque
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean remove(Object o) {

    /**
     * Removes the first occurrence of the specified element from this deque.
     * If the deque does not contain the element, it is unchanged.
     * More formally, removes the first element {@code e} such that
     * {@code o.equals(e)} (if such an element exists).
     * Returns {@code true} if this deque contained the specified element
     * (or equivalently, if this deque changed as a result of the call).
     *
     * <p>This method is equivalent to
     * {@link #removeFirstOccurrence(Object) removeFirstOccurrence}.
     *
     * @param o element to be removed from this deque, if present
     * @return {@code true} if this deque changed as a result of the call
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public E pop() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public void push(E e) {

    /**
     * @throws IllegalStateException if this deque is full
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public int drainTo(Collection<? super E> c, int maxElements) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public int drainTo(Collection<? super E> c) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public int remainingCapacity() {

    /**
     * Returns the number of additional elements that this deque can ideally
     * (in the absence of memory or resource constraints) accept without
     * blocking. This is always equal to the initial capacity of this deque
     * less the current {@code size} of this deque.
     *
     * <p>Note that you <em>cannot</em> always tell if an attempt to insert
     * an element will succeed by inspecting {@code remainingCapacity}
     * because it may be the case that another thread is about to
     * insert or remove an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public E element() {

    /**
     * Retrieves, but does not remove, the head of the queue represented by
     * this deque.  This method differs from {@link #peek peek} only in that
     * it throws an exception if this deque is empty.
     *
     * <p>This method is equivalent to {@link #getFirst() getFirst}.
     *
     * @return the head of the queue represented by this deque
     * @throws NoSuchElementException if this deque is empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public E remove() {

    /**
     * Retrieves and removes the head of the queue represented by this deque.
     * This method differs from {@link #poll poll} only in that it throws an
     * exception if this deque is empty.
     *
     * <p>This method is equivalent to {@link #removeFirst() removeFirst}.
     *
     * @return the head of the queue represented by this deque
     * @throws NoSuchElementException if this deque is empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean offer(E e, long timeout, TimeUnit unit)

    /**
     * @throws NullPointerException {@inheritDoc}
     * @throws InterruptedException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public void put(E e) throws InterruptedException {

    /**
     * @throws NullPointerException {@inheritDoc}
     * @throws InterruptedException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean offer(E e) {

    /**
     * @throws NullPointerException if the specified element is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean add(E e) {

    /**
     * Inserts the specified element at the end of this deque unless it would
     * violate capacity restrictions.  When using a capacity-restricted deque,
     * it is generally preferable to use method {@link #offer(Object) offer}.
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @throws IllegalStateException if this deque is full
     * @throws NullPointerException if the specified element is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public E getLast() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public E getFirst() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public E removeLast() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public E removeFirst() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean offerLast(E e, long timeout, TimeUnit unit)

    /**
     * @throws NullPointerException {@inheritDoc}
     * @throws InterruptedException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean offerFirst(E e, long timeout, TimeUnit unit)

    /**
     * @throws NullPointerException {@inheritDoc}
     * @throws InterruptedException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public void putLast(E e) throws InterruptedException {

    /**
     * @throws NullPointerException {@inheritDoc}
     * @throws InterruptedException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public void putFirst(E e) throws InterruptedException {

    /**
     * @throws NullPointerException {@inheritDoc}
     * @throws InterruptedException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean offerLast(E e) {

    /**
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public boolean offerFirst(E e) {

    /**
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public void addLast(E e) {

    /**
     * @throws IllegalStateException if this deque is full
     * @throws NullPointerException  {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public void addFirst(E e) {

    /**
     * @throws IllegalStateException if this deque is full
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    void unlink(Node<E> x) {

    /**
     * Unlinks x.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private E unlinkLast() {

    /**
     * Removes and returns last element, or null if empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private E unlinkFirst() {

    /**
     * Removes and returns first element, or null if empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private boolean linkLast(Node<E> node) {

    /**
     * Links node as last element, or returns false if full.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private boolean linkFirst(Node<E> node) {

    /**
     * Links node as first element, or returns false if full.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public LinkedBlockingDeque(Collection<? extends E> c) {

    /**
     * Creates a {@code LinkedBlockingDeque} with a capacity of
     * {@link Integer#MAX_VALUE}, initially containing the elements of
     * the given collection, added in traversal order of the
     * collection's iterator.
     *
     * @param c the collection of elements to initially contain
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public LinkedBlockingDeque(int capacity) {

    /**
     * Creates a {@code LinkedBlockingDeque} with the given (fixed) capacity.
     *
     * @param capacity the capacity of this deque
     * @throws IllegalArgumentException if {@code capacity} is less than 1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    public LinkedBlockingDeque() {

    /**
     * Creates a {@code LinkedBlockingDeque} with a capacity of
     * {@link Integer#MAX_VALUE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private final Condition notFull = lock.newCondition();

    /** Condition for waiting puts */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private final Condition notEmpty = lock.newCondition();

    /** Condition for waiting takes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    final ReentrantLock lock = new ReentrantLock();

    /** Main lock guarding all access */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private final int capacity;

    /** Maximum number of items in the deque */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    private transient int count;

    /** Number of items in the deque */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    transient Node<E> last;

    /**
     * Pointer to last node.
     * Invariant: (first == null && last == null) ||
     *            (last.next == null && last.item != null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    transient Node<E> first;

    /**
     * Pointer to first node.
     * Invariant: (first == null && last == null) ||
     *            (first.prev == null && first.item != null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
        Node<E> next;

        /**
         * One of:
         * - the real successor Node
         * - this Node, meaning the successor is head
         * - null, meaning there is no successor
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
        Node<E> prev;

        /**
         * One of:
         * - the real predecessor Node
         * - this Node, meaning the predecessor is tail
         * - null, meaning there is no predecessor
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
    static final class Node<E> {

    /** Doubly-linked list node class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/LinkedBlockingDeque.java
public class LinkedBlockingDeque<E>

/**
 * An optionally-bounded {@linkplain BlockingDeque blocking deque} based on
 * linked nodes.
 *
 * <p>The optional capacity bound constructor argument serves as a
 * way to prevent excessive expansion. The capacity, if unspecified,
 * is equal to {@link Integer#MAX_VALUE}.  Linked nodes are
 * dynamically created upon each insertion unless this would bring the
 * deque above capacity.
 *
 * <p>Most operations run in constant time (ignoring time spent
 * blocking).  Exceptions include {@link #remove(Object) remove},
 * {@link #removeFirstOccurrence removeFirstOccurrence}, {@link
 * #removeLastOccurrence removeLastOccurrence}, {@link #contains
 * contains}, {@link #iterator iterator.remove()}, and the bulk
 * operations, all of which run in linear time.
 *
 * <p>This class and its iterator implement all of the
 * <em>optional</em> methods of the {@link Collection} and {@link
 * Iterator} interfaces.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.6
 * @author  Doug Lea
 * @param <E> the type of elements held in this collection
 */
