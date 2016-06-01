_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    static final class LLSpliterator<E> implements Spliterator<E> {

    /** A customized variant of Spliterators.IteratorSpliterator */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    @Override

    /**
     * Creates a <em><a href="Spliterator.html#binding">late-binding</a></em>
     * and <em>fail-fast</em> {@link Spliterator} over the elements in this
     * list.
     *
     * <p>The {@code Spliterator} reports {@link Spliterator#SIZED} and
     * {@link Spliterator#ORDERED}.  Overriding implementations should document
     * the reporting of additional characteristic values.
     *
     * @implNote
     * The {@code Spliterator} additionally reports {@link Spliterator#SUBSIZED}
     * and implements {@code trySplit} to permit limited parallelism..
     *
     * @return a {@code Spliterator} over the elements in this list
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    @SuppressWarnings("unchecked")

    /**
     * Reconstitutes this {@code LinkedList} instance from a stream
     * (that is, deserializes it).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves the state of this {@code LinkedList} instance to a stream
     * (that is, serializes it).
     *
     * @serialData The size of the list (the number of elements it
     *             contains) is emitted (int), followed by all of its
     *             elements (each an Object) in the proper order.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array containing all of the elements in this list in
     * proper sequence (from first to last element); the runtime type of
     * the returned array is that of the specified array.  If the list fits
     * in the specified array, it is returned therein.  Otherwise, a new
     * array is allocated with the runtime type of the specified array and
     * the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the element in the array
     * immediately following the end of the list is set to {@code null}.
     * (This is useful in determining the length of the list <i>only</i> if
     * the caller knows that the list does not contain any null elements.)
     *
     * <p>Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * <p>Suppose {@code x} is a list known to contain only strings.
     * The following code can be used to dump the list into a newly
     * allocated array of {@code String}:
     *
     * <pre>
     *     String[] y = x.toArray(new String[0]);</pre>
     *
     * Note that {@code toArray(new Object[0])} is identical in function to
     * {@code toArray()}.
     *
     * @param a the array into which the elements of the list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of the list
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this list
     * @throws NullPointerException if the specified array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public Object[] toArray() {

    /**
     * Returns an array containing all of the elements in this list
     * in proper sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list
     *         in proper sequence
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public Object clone() {

    /**
     * Returns a shallow copy of this {@code LinkedList}. (The elements
     * themselves are not cloned.)
     *
     * @return a shallow copy of this {@code LinkedList} instance
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private class DescendingIterator implements Iterator<E> {

    /**
     * Adapter to provide descending iterators via ListItr.previous
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public Iterator<E> descendingIterator() {

    /**
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public ListIterator<E> listIterator(int index) {

    /**
     * Returns a list-iterator of the elements in this list (in proper
     * sequence), starting at the specified position in the list.
     * Obeys the general contract of {@code List.listIterator(int)}.<p>
     *
     * The list-iterator is <i>fail-fast</i>: if the list is structurally
     * modified at any time after the Iterator is created, in any way except
     * through the list-iterator's own {@code remove} or {@code add}
     * methods, the list-iterator will throw a
     * {@code ConcurrentModificationException}.  Thus, in the face of
     * concurrent modification, the iterator fails quickly and cleanly, rather
     * than risking arbitrary, non-deterministic behavior at an undetermined
     * time in the future.
     *
     * @param index index of the first element to be returned from the
     *              list-iterator (by a call to {@code next})
     * @return a ListIterator of the elements in this list (in proper
     *         sequence), starting at the specified position in the list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @see List#listIterator(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean removeLastOccurrence(Object o) {

    /**
     * Removes the last occurrence of the specified element in this
     * list (when traversing the list from head to tail).  If the list
     * does not contain the element, it is unchanged.
     *
     * @param o element to be removed from this list, if present
     * @return {@code true} if the list contained the specified element
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean removeFirstOccurrence(Object o) {

    /**
     * Removes the first occurrence of the specified element in this
     * list (when traversing the list from head to tail).  If the list
     * does not contain the element, it is unchanged.
     *
     * @param o element to be removed from this list, if present
     * @return {@code true} if the list contained the specified element
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E pop() {

    /**
     * Pops an element from the stack represented by this list.  In other
     * words, removes and returns the first element of this list.
     *
     * <p>This method is equivalent to {@link #removeFirst()}.
     *
     * @return the element at the front of this list (which is the top
     *         of the stack represented by this list)
     * @throws NoSuchElementException if this list is empty
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public void push(E e) {

    /**
     * Pushes an element onto the stack represented by this list.  In other
     * words, inserts the element at the front of this list.
     *
     * <p>This method is equivalent to {@link #addFirst}.
     *
     * @param e the element to push
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E pollLast() {

    /**
     * Retrieves and removes the last element of this list,
     * or returns {@code null} if this list is empty.
     *
     * @return the last element of this list, or {@code null} if
     *     this list is empty
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E pollFirst() {

    /**
     * Retrieves and removes the first element of this list,
     * or returns {@code null} if this list is empty.
     *
     * @return the first element of this list, or {@code null} if
     *     this list is empty
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E peekLast() {

    /**
     * Retrieves, but does not remove, the last element of this list,
     * or returns {@code null} if this list is empty.
     *
     * @return the last element of this list, or {@code null}
     *         if this list is empty
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E peekFirst() {

    /**
     * Retrieves, but does not remove, the first element of this list,
     * or returns {@code null} if this list is empty.
     *
     * @return the first element of this list, or {@code null}
     *         if this list is empty
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean offerLast(E e) {

    /**
     * Inserts the specified element at the end of this list.
     *
     * @param e the element to insert
     * @return {@code true} (as specified by {@link Deque#offerLast})
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean offerFirst(E e) {

    /**
     * Inserts the specified element at the front of this list.
     *
     * @param e the element to insert
     * @return {@code true} (as specified by {@link Deque#offerFirst})
     * @since 1.6
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean offer(E e) {

    /**
     * Adds the specified element as the tail (last element) of this list.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Queue#offer})
     * @since 1.5
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E remove() {

    /**
     * Retrieves and removes the head (first element) of this list.
     *
     * @return the head of this list
     * @throws NoSuchElementException if this list is empty
     * @since 1.5
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E poll() {

    /**
     * Retrieves and removes the head (first element) of this list.
     *
     * @return the head of this list, or {@code null} if this list is empty
     * @since 1.5
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E element() {

    /**
     * Retrieves, but does not remove, the head (first element) of this list.
     *
     * @return the head of this list
     * @throws NoSuchElementException if this list is empty
     * @since 1.5
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E peek() {

    /**
     * Retrieves, but does not remove, the head (first element) of this list.
     *
     * @return the head of this list, or {@code null} if this list is empty
     * @since 1.5
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public int lastIndexOf(Object o) {

    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the highest index {@code i} such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public int indexOf(Object o) {

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index {@code i} such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    Node<E> node(int index) {

    /**
     * Returns the (non-null) Node at the specified element index.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private String outOfBoundsMsg(int index) {

    /**
     * Constructs an IndexOutOfBoundsException detail message.
     * Of the many possible refactorings of the error handling code,
     * this "outlining" performs best with both server and client VMs.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private boolean isPositionIndex(int index) {

    /**
     * Tells if the argument is the index of a valid position for an
     * iterator or an add operation.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private boolean isElementIndex(int index) {

    /**
     * Tells if the argument is the index of an existing element.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E remove(int index) {

    /**
     * Removes the element at the specified position in this list.  Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public void add(int index, E element) {

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E set(int index, E element) {

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E get(int index) {

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public void clear() {

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean addAll(int index, Collection<? extends E> c) {

    /**
     * Inserts all of the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right (increases their indices).  The new elements will appear
     * in the list in the order that they are returned by the
     * specified collection's iterator.
     *
     * @param index index at which to insert the first element
     *              from the specified collection
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean addAll(Collection<? extends E> c) {

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator.  The behavior of this operation is undefined if
     * the specified collection is modified while the operation is in
     * progress.  (Note that this will occur if the specified collection is
     * this list, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean remove(Object o) {

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain the element, it is
     * unchanged.  More formally, removes the element with the lowest index
     * {@code i} such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
     * (if such an element exists).  Returns {@code true} if this list
     * contained the specified element (or equivalently, if this list
     * changed as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return {@code true} if this list contained the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean add(E e) {

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param e element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public int size() {

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public boolean contains(Object o) {

    /**
     * Returns {@code true} if this list contains the specified element.
     * More formally, returns {@code true} if and only if this list contains
     * at least one element {@code e} such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public void addLast(E e) {

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #add}.
     *
     * @param e the element to add
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public void addFirst(E e) {

    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param e the element to add
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E removeLast() {

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     * @throws NoSuchElementException if this list is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E removeFirst() {

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws NoSuchElementException if this list is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E getLast() {

    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list
     * @throws NoSuchElementException if this list is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public E getFirst() {

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    E unlink(Node<E> x) {

    /**
     * Unlinks non-null node x.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private E unlinkLast(Node<E> l) {

    /**
     * Unlinks non-null last node l.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private E unlinkFirst(Node<E> f) {

    /**
     * Unlinks non-null first node f.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    void linkBefore(E e, Node<E> succ) {

    /**
     * Inserts element e before non-null Node succ.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    void linkLast(E e) {

    /**
     * Links e as last element.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    private void linkFirst(E e) {

    /**
     * Links e as first element.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public LinkedList(Collection<? extends E> c) {

    /**
     * Constructs a list containing the elements of the specified
     * collection, in the order they are returned by the collection's
     * iterator.
     *
     * @param  c the collection whose elements are to be placed into this list
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    public LinkedList() {

    /**
     * Constructs an empty list.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    transient Node<E> last;

    /**
     * Pointer to last node.
     * Invariant: (first == null && last == null) ||
     *            (last.next == null && last.item != null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
    transient Node<E> first;

    /**
     * Pointer to first node.
     * Invariant: (first == null && last == null) ||
     *            (first.prev == null && first.item != null)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//LinkedList.java
public class LinkedList<E>

/**
 * Doubly-linked list implementation of the {@code List} and {@code Deque}
 * interfaces.  Implements all optional list operations, and permits all
 * elements (including {@code null}).
 *
 * <p>All of the operations perform as could be expected for a doubly-linked
 * list.  Operations that index into the list will traverse the list from
 * the beginning or the end, whichever is closer to the specified index.
 *
 * <p><strong>Note that this implementation is not synchronized.</strong>
 * If multiple threads access a linked list concurrently, and at least
 * one of the threads modifies the list structurally, it <i>must</i> be
 * synchronized externally.  (A structural modification is any operation
 * that adds or deletes one or more elements; merely setting the value of
 * an element is not a structural modification.)  This is typically
 * accomplished by synchronizing on some object that naturally
 * encapsulates the list.
 *
 * If no such object exists, the list should be "wrapped" using the
 * {@link Collections#synchronizedList Collections.synchronizedList}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access to the list:<pre>
 *   List list = Collections.synchronizedList(new LinkedList(...));</pre>
 *
 * <p>The iterators returned by this class's {@code iterator} and
 * {@code listIterator} methods are <i>fail-fast</i>: if the list is
 * structurally modified at any time after the iterator is created, in
 * any way except through the Iterator's own {@code remove} or
 * {@code add} methods, the iterator will throw a {@link
 * ConcurrentModificationException}.  Thus, in the face of concurrent
 * modification, the iterator fails quickly and cleanly, rather than
 * risking arbitrary, non-deterministic behavior at an undetermined
 * time in the future.
 *
 * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
 * as it is, generally speaking, impossible to make any hard guarantees in the
 * presence of unsynchronized concurrent modification.  Fail-fast iterators
 * throw {@code ConcurrentModificationException} on a best-effort basis.
 * Therefore, it would be wrong to write a program that depended on this
 * exception for its correctness:   <i>the fail-fast behavior of iterators
 * should be used only to detect bugs.</i>
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @author  Josh Bloch
 * @see     List
 * @see     ArrayList
 * @since 1.2
 * @param <E> the type of elements held in this collection
 */
