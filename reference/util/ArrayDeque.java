_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
        DeqSpliterator(ArrayDeque<E> deq, int origin, int fence) {

        /** Creates new spliterator covering the given array and range */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public Spliterator<E> spliterator() {

    /**
     * Creates a <em><a href="Spliterator.html#binding">late-binding</a></em>
     * and <em>fail-fast</em> {@link Spliterator} over the elements in this
     * deque.
     *
     * <p>The {@code Spliterator} reports {@link Spliterator#SIZED},
     * {@link Spliterator#SUBSIZED}, {@link Spliterator#ORDERED}, and
     * {@link Spliterator#NONNULL}.  Overriding implementations should document
     * the reporting of additional characteristic values.
     *
     * @return a {@code Spliterator} over the elements in this deque
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes this deque from a stream (that is, deserializes it).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this deque to a stream (that is, serializes it).
     *
     * @serialData The current size ({@code int}) of the deque,
     * followed by all of its elements (each an object reference) in
     * first-to-last order.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public ArrayDeque<E> clone() {

    /**
     * Returns a copy of this deque.
     *
     * @return a copy of this deque
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array containing all of the elements in this deque in
     * proper sequence (from first to last element); the runtime type of the
     * returned array is that of the specified array.  If the deque fits in
     * the specified array, it is returned therein.  Otherwise, a new array
     * is allocated with the runtime type of the specified array and the
     * size of this deque.
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public Object[] toArray() {

    /**
     * Returns an array containing all of the elements in this deque
     * in proper sequence (from first to last element).
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public void clear() {

    /**
     * Removes all of the elements from this deque.
     * The deque will be empty after this call returns.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean remove(Object o) {

    /**
     * Removes a single instance of the specified element from this deque.
     * If the deque does not contain the element, it is unchanged.
     * More formally, removes the first element {@code e} such that
     * {@code o.equals(e)} (if such an element exists).
     * Returns {@code true} if this deque contained the specified element
     * (or equivalently, if this deque changed as a result of the call).
     *
     * <p>This method is equivalent to {@link #removeFirstOccurrence(Object)}.
     *
     * @param o element to be removed from this deque, if present
     * @return {@code true} if this deque contained the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
        private int lastRet = -1;

        /**
         * Index of element returned by most recent call to next.
         * Reset to -1 if element is deleted by a call to remove.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
        private int fence = tail;

        /**
         * Tail recorded at construction (also in remove), to stop
         * iterator and also to check for comodification.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
        private int cursor = head;

        /**
         * Index of element to be returned by subsequent call to next.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public Iterator<E> iterator() {

    /**
     * Returns an iterator over the elements in this deque.  The elements
     * will be ordered from first (head) to last (tail).  This is the same
     * order that elements would be dequeued (via successive calls to
     * {@link #remove} or popped (via successive calls to {@link #pop}).
     *
     * @return an iterator over the elements in this deque
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean isEmpty() {

    /**
     * Returns {@code true} if this deque contains no elements.
     *
     * @return {@code true} if this deque contains no elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public int size() {

    /**
     * Returns the number of elements in this deque.
     *
     * @return the number of elements in this deque
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    private boolean delete(int i) {

    /**
     * Removes the element at the specified position in the elements array,
     * adjusting head and tail as necessary.  This can result in motion of
     * elements backwards or forwards in the array.
     *
     * <p>This method is called delete rather than remove to emphasize
     * that its semantics differ from those of {@link List#remove(int)}.
     *
     * @return true if elements moved backwards
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E pop() {

    /**
     * Pops an element from the stack represented by this deque.  In other
     * words, removes and returns the first element of this deque.
     *
     * <p>This method is equivalent to {@link #removeFirst()}.
     *
     * @return the element at the front of this deque (which is the top
     *         of the stack represented by this deque)
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public void push(E e) {

    /**
     * Pushes an element onto the stack represented by this deque.  In other
     * words, inserts the element at the front of this deque.
     *
     * <p>This method is equivalent to {@link #addFirst}.
     *
     * @param e the element to push
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E peek() {

    /**
     * Retrieves, but does not remove, the head of the queue represented by
     * this deque, or returns {@code null} if this deque is empty.
     *
     * <p>This method is equivalent to {@link #peekFirst}.
     *
     * @return the head of the queue represented by this deque, or
     *         {@code null} if this deque is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E element() {

    /**
     * Retrieves, but does not remove, the head of the queue represented by
     * this deque.  This method differs from {@link #peek peek} only in
     * that it throws an exception if this deque is empty.
     *
     * <p>This method is equivalent to {@link #getFirst}.
     *
     * @return the head of the queue represented by this deque
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E poll() {

    /**
     * Retrieves and removes the head of the queue represented by this deque
     * (in other words, the first element of this deque), or returns
     * {@code null} if this deque is empty.
     *
     * <p>This method is equivalent to {@link #pollFirst}.
     *
     * @return the head of the queue represented by this deque, or
     *         {@code null} if this deque is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E remove() {

    /**
     * Retrieves and removes the head of the queue represented by this deque.
     *
     * This method differs from {@link #poll poll} only in that it throws an
     * exception if this deque is empty.
     *
     * <p>This method is equivalent to {@link #removeFirst}.
     *
     * @return the head of the queue represented by this deque
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean offer(E e) {

    /**
     * Inserts the specified element at the end of this deque.
     *
     * <p>This method is equivalent to {@link #offerLast}.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Queue#offer})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean add(E e) {

    /**
     * Inserts the specified element at the end of this deque.
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean removeLastOccurrence(Object o) {

    /**
     * Removes the last occurrence of the specified element in this
     * deque (when traversing the deque from head to tail).
     * If the deque does not contain the element, it is unchanged.
     * More formally, removes the last element {@code e} such that
     * {@code o.equals(e)} (if such an element exists).
     * Returns {@code true} if this deque contained the specified element
     * (or equivalently, if this deque changed as a result of the call).
     *
     * @param o element to be removed from this deque, if present
     * @return {@code true} if the deque contained the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean removeFirstOccurrence(Object o) {

    /**
     * Removes the first occurrence of the specified element in this
     * deque (when traversing the deque from head to tail).
     * If the deque does not contain the element, it is unchanged.
     * More formally, removes the first element {@code e} such that
     * {@code o.equals(e)} (if such an element exists).
     * Returns {@code true} if this deque contained the specified element
     * (or equivalently, if this deque changed as a result of the call).
     *
     * @param o element to be removed from this deque, if present
     * @return {@code true} if the deque contained the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E getLast() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E getFirst() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E removeLast() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public E removeFirst() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean offerLast(E e) {

    /**
     * Inserts the specified element at the end of this deque.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Deque#offerLast})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public boolean offerFirst(E e) {

    /**
     * Inserts the specified element at the front of this deque.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Deque#offerFirst})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public void addLast(E e) {

    /**
     * Inserts the specified element at the end of this deque.
     *
     * <p>This method is equivalent to {@link #add}.
     *
     * @param e the element to add
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public void addFirst(E e) {

    /**
     * Inserts the specified element at the front of this deque.
     *
     * @param e the element to add
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public ArrayDeque(Collection<? extends E> c) {

    /**
     * Constructs a deque containing the elements of the specified
     * collection, in the order they are returned by the collection's
     * iterator.  (The first element returned by the collection's
     * iterator becomes the first element, or <i>front</i> of the
     * deque.)
     *
     * @param c the collection whose elements are to be placed into the deque
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public ArrayDeque(int numElements) {

    /**
     * Constructs an empty array deque with an initial capacity
     * sufficient to hold the specified number of elements.
     *
     * @param numElements  lower bound on initial capacity of the deque
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    public ArrayDeque() {

    /**
     * Constructs an empty array deque with an initial capacity
     * sufficient to hold 16 elements.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    private <T> T[] copyElements(T[] a) {

    /**
     * Copies the elements from our element array into the specified array,
     * in order (from first to last element in the deque).  It is assumed
     * that the array is large enough to hold all elements in the deque.
     *
     * @return its argument
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    private void doubleCapacity() {

    /**
     * Doubles the capacity of this deque.  Call only when full, i.e.,
     * when head and tail have wrapped around to become equal.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    private void allocateElements(int numElements) {

    /**
     * Allocates empty array to hold the given number of elements.
     *
     * @param numElements  the number of elements to hold
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    private static final int MIN_INITIAL_CAPACITY = 8;

    /**
     * The minimum capacity that we'll use for a newly created deque.
     * Must be a power of 2.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    transient int tail;

    /**
     * The index at which the next element would be added to the tail
     * of the deque (via addLast(E), add(E), or push(E)).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    transient int head;

    /**
     * The index of the element at the head of the deque (which is the
     * element that would be removed by remove() or pop()); or an
     * arbitrary number equal to tail if the deque is empty.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
    transient Object[] elements; // non-private to simplify nested class access

    /**
     * The array in which the elements of the deque are stored.
     * The capacity of the deque is the length of this array, which is
     * always a power of two. The array is never allowed to become
     * full, except transiently within an addX method where it is
     * resized (see doubleCapacity) immediately upon becoming full,
     * thus avoiding head and tail wrapping around to equal each
     * other.  We also guarantee that all array cells not holding
     * deque elements are always null.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArrayDeque.java
public class ArrayDeque<E> extends AbstractCollection<E>

/**
 * Resizable-array implementation of the {@link Deque} interface.  Array
 * deques have no capacity restrictions; they grow as necessary to support
 * usage.  They are not thread-safe; in the absence of external
 * synchronization, they do not support concurrent access by multiple threads.
 * Null elements are prohibited.  This class is likely to be faster than
 * {@link Stack} when used as a stack, and faster than {@link LinkedList}
 * when used as a queue.
 *
 * <p>Most {@code ArrayDeque} operations run in amortized constant time.
 * Exceptions include {@link #remove(Object) remove}, {@link
 * #removeFirstOccurrence removeFirstOccurrence}, {@link #removeLastOccurrence
 * removeLastOccurrence}, {@link #contains contains}, {@link #iterator
 * iterator.remove()}, and the bulk operations, all of which run in linear
 * time.
 *
 * <p>The iterators returned by this class's {@code iterator} method are
 * <i>fail-fast</i>: If the deque is modified at any time after the iterator
 * is created, in any way except through the iterator's own {@code remove}
 * method, the iterator will generally throw a {@link
 * ConcurrentModificationException}.  Thus, in the face of concurrent
 * modification, the iterator fails quickly and cleanly, rather than risking
 * arbitrary, non-deterministic behavior at an undetermined time in the
 * future.
 *
 * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
 * as it is, generally speaking, impossible to make any hard guarantees in the
 * presence of unsynchronized concurrent modification.  Fail-fast iterators
 * throw {@code ConcurrentModificationException} on a best-effort basis.
 * Therefore, it would be wrong to write a program that depended on this
 * exception for its correctness: <i>the fail-fast behavior of iterators
 * should be used only to detect bugs.</i>
 *
 * <p>This class and its iterator implement all of the
 * <em>optional</em> methods of the {@link Collection} and {@link
 * Iterator} interfaces.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @author  Josh Bloch and Doug Lea
 * @since   1.6
 * @param <E> the type of elements held in this collection
 */
