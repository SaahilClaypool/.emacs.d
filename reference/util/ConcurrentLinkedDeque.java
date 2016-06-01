_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes this deque from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this deque to a stream (that is, serializes it).
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData All of the elements (each an {@code E}) in
     * the proper order, followed by a null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    static final class CLDSpliterator<E> implements Spliterator<E> {

    /** A customized variant of Spliterators.IteratorSpliterator */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private class DescendingItr extends AbstractItr {

    /** Descending iterator */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private class Itr extends AbstractItr {

    /** Forward iterator */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
        private void advance() {

        /**
         * Sets nextNode and nextItem to next valid node, or to null
         * if no such.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
        private Node<E> lastRet;

        /**
         * Node returned by most recent call to next. Needed by remove.
         * Reset to null if this element is deleted by a call to remove.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
        private E nextItem;

        /**
         * nextItem holds on to item fields because once we claim
         * that an element exists in hasNext(), we must return it in
         * the following next() call even if it was in the process of
         * being removed when hasNext() was called.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
        private Node<E> nextNode;

        /**
         * Next node to return item for.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public <T> T[] toArray(T[] a) {

    /**
     * Returns an array containing all of the elements in this deque,
     * in proper sequence (from first to last element); the runtime
     * type of the returned array is that of the specified array.  If
     * the deque fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of
     * the specified array and the size of this deque.
     *
     * <p>If this deque fits in the specified array with room to spare
     * (i.e., the array has more elements than this deque), the element in
     * the array immediately following the end of the deque is set to
     * {@code null}.
     *
     * <p>Like the {@link #toArray()} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further,
     * this method allows precise control over the runtime type of the
     * output array, and may, under certain circumstances, be used to
     * save allocation costs.
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public Object[] toArray() {

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
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public void clear() {

    /**
     * Removes all of the elements from this deque.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean addAll(Collection<? extends E> c) {

    /**
     * Appends all of the elements in the specified collection to the end of
     * this deque, in the order that they are returned by the specified
     * collection's iterator.  Attempts to {@code addAll} of a deque to
     * itself result in {@code IllegalArgumentException}.
     *
     * @param c the elements to be inserted into this deque
     * @return {@code true} if this deque changed as a result of the call
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     * @throws IllegalArgumentException if the collection is this deque
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean remove(Object o) {

    /**
     * Removes the first element {@code e} such that
     * {@code o.equals(e)}, if such an element exists in this deque.
     * If the deque does not contain the element, it is unchanged.
     *
     * @param o element to be removed from this deque, if present
     * @return {@code true} if the deque contained the specified element
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public int size() {

    /**
     * Returns the number of elements in this deque.  If this deque
     * contains more than {@code Integer.MAX_VALUE} elements, it
     * returns {@code Integer.MAX_VALUE}.
     *
     * <p>Beware that, unlike in most collections, this method is
     * <em>NOT</em> a constant-time operation. Because of the
     * asynchronous nature of these deques, determining the current
     * number of elements requires traversing them all to count them.
     * Additionally, it is possible for the size to change during
     * execution of this method, in which case the returned result
     * will be inaccurate. Thus, this method is typically not very
     * useful in concurrent applications.
     *
     * @return the number of elements in this deque
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean isEmpty() {

    /**
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean contains(Object o) {

    /**
     * Returns {@code true} if this deque contains at least one
     * element {@code e} such that {@code o.equals(e)}.
     *
     * @param o element whose presence in this deque is to be tested
     * @return {@code true} if this deque contains the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean removeLastOccurrence(Object o) {

    /**
     * Removes the last element {@code e} such that
     * {@code o.equals(e)}, if such an element exists in this deque.
     * If the deque does not contain the element, it is unchanged.
     *
     * @param o element to be removed from this deque, if present
     * @return {@code true} if the deque contained the specified element
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean removeFirstOccurrence(Object o) {

    /**
     * Removes the first element {@code e} such that
     * {@code o.equals(e)}, if such an element exists in this deque.
     * If the deque does not contain the element, it is unchanged.
     *
     * @param o element to be removed from this deque, if present
     * @return {@code true} if the deque contained the specified element
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public void push(E e)     { addFirst(e); }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public E element()        { return getFirst(); }

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public E pop()            { return removeFirst(); }

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public E remove()         { return removeFirst(); }

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean add(E e) {

    /**
     * Inserts the specified element at the tail of this deque.
     * As the deque is unbounded, this method will never throw
     * {@link IllegalStateException} or return {@code false}.
     *
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean offer(E e) {

    /**
     * Inserts the specified element at the tail of this deque.
     * As the deque is unbounded, this method will never return {@code false}.
     *
     * @return {@code true} (as specified by {@link Queue#offer})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public E removeLast() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public E removeFirst() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public E getLast() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public E getFirst() {

    /**
     * @throws NoSuchElementException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean offerLast(E e) {

    /**
     * Inserts the specified element at the end of this deque.
     * As the deque is unbounded, this method will never return {@code false}.
     *
     * <p>This method is equivalent to {@link #add}.
     *
     * @return {@code true} (as specified by {@link Deque#offerLast})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public boolean offerFirst(E e) {

    /**
     * Inserts the specified element at the front of this deque.
     * As the deque is unbounded, this method will never return {@code false}.
     *
     * @return {@code true} (as specified by {@link Deque#offerFirst})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public void addLast(E e) {

    /**
     * Inserts the specified element at the end of this deque.
     * As the deque is unbounded, this method will never throw
     * {@link IllegalStateException}.
     *
     * <p>This method is equivalent to {@link #add}.
     *
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public void addFirst(E e) {

    /**
     * Inserts the specified element at the front of this deque.
     * As the deque is unbounded, this method will never throw
     * {@link IllegalStateException}.
     *
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private void initHeadTail(Node<E> h, Node<E> t) {

    /**
     * Initializes head and tail, ensuring invariants hold.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public ConcurrentLinkedDeque(Collection<? extends E> c) {

    /**
     * Constructs a deque initially containing the elements of
     * the given collection, added in traversal order of the
     * collection's iterator.
     *
     * @param c the collection of elements to initially contain
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    public ConcurrentLinkedDeque() {

    /**
     * Constructs an empty deque.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private ArrayList<E> toArrayList() {

    /**
     * Creates an array list and fills it with elements of this list.
     * Used by toArray.
     *
     * @return the array list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private E screenNullResult(E v) {

    /**
     * Returns element unless it is null, in which case throws
     * NoSuchElementException.
     *
     * @param v the element
     * @return the element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private static void checkNotNull(Object v) {

    /**
     * Throws NullPointerException if argument is null.
     *
     * @param v the element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    Node<E> last() {

    /**
     * Returns the last node, the unique node p for which:
     *     p.next == null && p.prev != p
     * The returned node may or may not be logically deleted.
     * Guarantees that tail is set to the returned node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    Node<E> first() {

    /**
     * Returns the first node, the unique node p for which:
     *     p.prev == null && p.next != p
     * The returned node may or may not be logically deleted.
     * Guarantees that head is set to the returned node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    final Node<E> pred(Node<E> p) {

    /**
     * Returns the predecessor of p, or the last node if p.prev has been
     * linked to self, which will only be true if traversing with a
     * stale pointer that is now off the list.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    final Node<E> succ(Node<E> p) {

    /**
     * Returns the successor of p, or the first node if p.next has been
     * linked to self, which will only be true if traversing with a
     * stale pointer that is now off the list.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private final void updateTail() {

    /**
     * Guarantees that any node which was unlinked before a call to
     * this method will be unreachable from tail after it returns.
     * Does not guarantee to eliminate slack, only that tail will
     * point to a node that was active while this method was running.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private final void updateHead() {

    /**
     * Guarantees that any node which was unlinked before a call to
     * this method will be unreachable from head after it returns.
     * Does not guarantee to eliminate slack, only that head will
     * point to a node that was active while this method was running.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private void unlinkLast(Node<E> last, Node<E> prev) {

    /**
     * Unlinks non-null last node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private void unlinkFirst(Node<E> first, Node<E> next) {

    /**
     * Unlinks non-null first node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    void unlink(Node<E> x) {

    /**
     * Unlinks non-null node x.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private void linkLast(E e) {

    /**
     * Links e as last element.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private void linkFirst(E e) {

    /**
     * Links e as first element.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
        Node(E item) {

        /**
         * Constructs a new node.  Uses relaxed write because item can
         * only be seen after publication via casNext or casPrev.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private transient volatile Node<E> tail;

    /**
     * A node from which the last node on list (that is, the unique node p
     * with p.next == null && p.prev != p) can be reached in O(1) time.
     * Invariants:
     * - the last node is always O(1) reachable from tail via next links
     * - all live nodes are reachable from the last node via pred()
     * - tail != null
     * - tail is never gc-unlinked (but may be unlinked)
     * Non-invariants:
     * - tail.item may or may not be null
     * - tail may not be reachable from the first or last node, or from head
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
    private transient volatile Node<E> head;

    /**
     * A node from which the first node on list (that is, the unique node p
     * with p.prev == null && p.next != p) can be reached in O(1) time.
     * Invariants:
     * - the first node is always O(1) reachable from head via prev links
     * - all live nodes are reachable from the first node via succ()
     * - head != null
     * - (tmp = head).next != tmp || tmp != head
     * - head is never gc-unlinked (but may be unlinked)
     * Non-invariants:
     * - head.item may or may not be null
     * - head may not be reachable from the first or last node, or from tail
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/ConcurrentLinkedDeque.java
public class ConcurrentLinkedDeque<E>

/**
 * An unbounded concurrent {@linkplain Deque deque} based on linked nodes.
 * Concurrent insertion, removal, and access operations execute safely
 * across multiple threads.
 * A {@code ConcurrentLinkedDeque} is an appropriate choice when
 * many threads will share access to a common collection.
 * Like most other concurrent collection implementations, this class
 * does not permit the use of {@code null} elements.
 *
 * <p>Iterators and spliterators are
 * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
 *
 * <p>Beware that, unlike in most collections, the {@code size} method
 * is <em>NOT</em> a constant-time operation. Because of the
 * asynchronous nature of these deques, determining the current number
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
 * methods of the {@link Deque} and {@link Iterator} interfaces.
 *
 * <p>Memory consistency effects: As with other concurrent collections,
 * actions in a thread prior to placing an object into a
 * {@code ConcurrentLinkedDeque}
 * <a href="package-summary.html#MemoryVisibility"><i>happen-before</i></a>
 * actions subsequent to the access or removal of that element from
 * the {@code ConcurrentLinkedDeque} in another thread.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.7
 * @author Doug Lea
 * @author Martin Buchholz
 * @param <E> the type of elements held in this collection
 */
