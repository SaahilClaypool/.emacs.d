_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private static class COWSubList<E>

    /**
     * Sublist for CopyOnWriteArrayList.
     * This class extends AbstractList merely for convenience, to
     * avoid having to define addAll, etc. This doesn't hurt, but
     * is wasteful.  This class does not need or use modCount
     * mechanics in AbstractList, but does need to check for
     * concurrent modification using similar mechanics.  On each
     * operation, the array that we expect the backing list to use
     * is checked and updated.  Since we do this for all of the
     * base operations invoked by those defined in AbstractList,
     * all is well.  While inefficient, this is not worth
     * improving.  The kinds of list operations inherited from
     * AbstractList are already so slow on COW sublists that
     * adding a bit more space/time doesn't seem even noticeable.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public List<E> subList(int fromIndex, int toIndex) {

    /**
     * Returns a view of the portion of this list between
     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
     * The returned list is backed by this list, so changes in the
     * returned list are reflected in this list.
     *
     * <p>The semantics of the list returned by this method become
     * undefined if the backing list (i.e., this list) is modified in
     * any way other than via the returned list.
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
        public void add(E e) {

        /**
         * Not supported. Always throws UnsupportedOperationException.
         * @throws UnsupportedOperationException always; {@code add}
         *         is not supported by this iterator.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
        public void set(E e) {

        /**
         * Not supported. Always throws UnsupportedOperationException.
         * @throws UnsupportedOperationException always; {@code set}
         *         is not supported by this iterator.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
        public void remove() {

        /**
         * Not supported. Always throws UnsupportedOperationException.
         * @throws UnsupportedOperationException always; {@code remove}
         *         is not supported by this iterator.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
        private int cursor;

        /** Index of element to be returned by subsequent call to next.  */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
        private final Object[] snapshot;

        /** Snapshot of the array */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public Spliterator<E> spliterator() {

    /**
     * Returns a {@link Spliterator} over the elements in this list.
     *
     * <p>The {@code Spliterator} reports {@link Spliterator#IMMUTABLE},
     * {@link Spliterator#ORDERED}, {@link Spliterator#SIZED}, and
     * {@link Spliterator#SUBSIZED}.
     *
     * <p>The spliterator provides a snapshot of the state of the list
     * when the spliterator was constructed. No synchronization is needed while
     * operating on the spliterator.
     *
     * @return a {@code Spliterator} over the elements in this list
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public ListIterator<E> listIterator(int index) {

    /**
     * {@inheritDoc}
     *
     * <p>The returned iterator provides a snapshot of the state of the list
     * when the iterator was constructed. No synchronization is needed while
     * traversing the iterator. The iterator does <em>NOT</em> support the
     * {@code remove}, {@code set} or {@code add} methods.
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public ListIterator<E> listIterator() {

    /**
     * {@inheritDoc}
     *
     * <p>The returned iterator provides a snapshot of the state of the list
     * when the iterator was constructed. No synchronization is needed while
     * traversing the iterator. The iterator does <em>NOT</em> support the
     * {@code remove}, {@code set} or {@code add} methods.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public Iterator<E> iterator() {

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * <p>The returned iterator provides a snapshot of the state of the list
     * when the iterator was constructed. No synchronization is needed while
     * traversing the iterator. The iterator does <em>NOT</em> support the
     * {@code remove} method.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public int hashCode() {

    /**
     * Returns the hash code value for this list.
     *
     * <p>This implementation uses the definition in {@link List#hashCode}.
     *
     * @return the hash code value for this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean equals(Object o) {

    /**
     * Compares the specified object with this list for equality.
     * Returns {@code true} if the specified object is the same object
     * as this object, or if it is also a {@link List} and the sequence
     * of elements returned by an {@linkplain List#iterator() iterator}
     * over the specified list is the same as the sequence returned by
     * an iterator over this list.  The two sequences are considered to
     * be the same if they have the same length and corresponding
     * elements at the same position in the sequence are <em>equal</em>.
     * Two elements {@code e1} and {@code e2} are considered
     * <em>equal</em> if {@code (e1==null ? e2==null : e1.equals(e2))}.
     *
     * @param o the object to be compared for equality with this list
     * @return {@code true} if the specified object is equal to this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public String toString() {

    /**
     * Returns a string representation of this list.  The string
     * representation consists of the string representations of the list's
     * elements in the order they are returned by its iterator, enclosed in
     * square brackets ({@code "[]"}).  Adjacent elements are separated by
     * the characters {@code ", "} (comma and space).  Elements are
     * converted to strings as by {@link String#valueOf(Object)}.
     *
     * @return a string representation of this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Reconstitutes this list from a stream (that is, deserializes it).
     * @param s the stream
     * @throws ClassNotFoundException if the class of a serialized object
     *         could not be found
     * @throws java.io.IOException if an I/O error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Saves this list to a stream (that is, serializes it).
     *
     * @param s the stream
     * @throws java.io.IOException if an I/O error occurs
     * @serialData The length of the array backing the list is emitted
     *               (int), followed by all of its elements (each an Object)
     *               in the proper order.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean addAll(int index, Collection<? extends E> c) {

    /**
     * Inserts all of the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right (increases their indices).  The new elements will appear
     * in this list in the order that they are returned by the
     * specified collection's iterator.
     *
     * @param index index at which to insert the first element
     *        from the specified collection
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @throws NullPointerException if the specified collection is null
     * @see #add(int,Object)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean addAll(Collection<? extends E> c) {

    /**
     * Appends all of the elements in the specified collection to the end
     * of this list, in the order that they are returned by the specified
     * collection's iterator.
     *
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     * @see #add(Object)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public void clear() {

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public int addAllAbsent(Collection<? extends E> c) {

    /**
     * Appends all of the elements in the specified collection that
     * are not already contained in this list, to the end of
     * this list, in the order that they are returned by the
     * specified collection's iterator.
     *
     * @param c collection containing elements to be added to this list
     * @return the number of elements added
     * @throws NullPointerException if the specified collection is null
     * @see #addIfAbsent(Object)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean retainAll(Collection<?> c) {

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection.  In other words, removes from this list all of
     * its elements that are not contained in the specified collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return {@code true} if this list changed as a result of the call
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     *         (<a href="../Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="../Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean removeAll(Collection<?> c) {

    /**
     * Removes from this list all of its elements that are contained in
     * the specified collection. This is a particularly expensive operation
     * in this class because of the need for an internal temporary array.
     *
     * @param c collection containing elements to be removed from this list
     * @return {@code true} if this list changed as a result of the call
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     *         (<a href="../Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="../Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean containsAll(Collection<?> c) {

    /**
     * Returns {@code true} if this list contains all of the elements of the
     * specified collection.
     *
     * @param c collection to be checked for containment in this list
     * @return {@code true} if this list contains all of the elements of the
     *         specified collection
     * @throws NullPointerException if the specified collection is null
     * @see #contains(Object)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private boolean addIfAbsent(E e, Object[] snapshot) {

    /**
     * A version of addIfAbsent using the strong hint that given
     * recent snapshot does not contain e.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean addIfAbsent(E e) {

    /**
     * Appends the element, if not present.
     *
     * @param e element to be added to this list, if absent
     * @return {@code true} if the element was added
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    void removeRange(int fromIndex, int toIndex) {

    /**
     * Removes from this list all of the elements whose index is between
     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
     * Shifts any succeeding elements to the left (reduces their index).
     * This call shortens the list by {@code (toIndex - fromIndex)} elements.
     * (If {@code toIndex==fromIndex}, this operation has no effect.)
     *
     * @param fromIndex index of first element to be removed
     * @param toIndex index after last element to be removed
     * @throws IndexOutOfBoundsException if fromIndex or toIndex out of range
     *         ({@code fromIndex < 0 || toIndex > size() || toIndex < fromIndex})
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private boolean remove(Object o, Object[] snapshot, int index) {

    /**
     * A version of remove(Object) using the strong hint that given
     * recent snapshot contains o at the given index.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public E remove(int index) {

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).  Returns the element that was removed from the list.
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public void add(int index, E element) {

    /**
     * Inserts the specified element at the specified position in this
     * list. Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (adds one to their indices).
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean add(E e) {

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public E set(int index, E element) {

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public E get(int index) {

    /**
     * {@inheritDoc}
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array containing all of the elements in this list in
     * proper sequence (from first to last element); the runtime type of
     * the returned array is that of the specified array.  If the list fits
     * in the specified array, it is returned therein.  Otherwise, a new
     * array is allocated with the runtime type of the specified array and
     * the size of this list.
     *
     * <p>If this list fits in the specified array with room to spare
     * (i.e., the array has more elements than this list), the element in
     * the array immediately following the end of the list is set to
     * {@code null}.  (This is useful in determining the length of this
     * list <i>only</i> if the caller knows that this list does not contain
     * any null elements.)
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
     *  <pre> {@code String[] y = x.toArray(new String[0]);}</pre>
     *
     * Note that {@code toArray(new Object[0])} is identical in function to
     * {@code toArray()}.
     *
     * @param a the array into which the elements of the list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing all the elements in this list
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this list
     * @throws NullPointerException if the specified array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
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
     * @return an array containing all the elements in this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public Object clone() {

    /**
     * Returns a shallow copy of this list.  (The elements themselves
     * are not copied.)
     *
     * @return a clone of this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public int lastIndexOf(E e, int index) {

    /**
     * Returns the index of the last occurrence of the specified element in
     * this list, searching backwards from {@code index}, or returns -1 if
     * the element is not found.
     * More formally, returns the highest index {@code i} such that
     * <tt>(i&nbsp;&lt;=&nbsp;index&nbsp;&amp;&amp;&nbsp;(e==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;e.equals(get(i))))</tt>,
     * or -1 if there is no such index.
     *
     * @param e element to search for
     * @param index index to start searching backwards from
     * @return the index of the last occurrence of the element at position
     *         less than or equal to {@code index} in this list;
     *         -1 if the element is not found.
     * @throws IndexOutOfBoundsException if the specified index is greater
     *         than or equal to the current size of this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public int lastIndexOf(Object o) {

    /**
     * {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public int indexOf(E e, int index) {

    /**
     * Returns the index of the first occurrence of the specified element in
     * this list, searching forwards from {@code index}, or returns -1 if
     * the element is not found.
     * More formally, returns the lowest index {@code i} such that
     * <tt>(i&nbsp;&gt;=&nbsp;index&nbsp;&amp;&amp;&nbsp;(e==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;e.equals(get(i))))</tt>,
     * or -1 if there is no such index.
     *
     * @param e element to search for
     * @param index index to start searching from
     * @return the index of the first occurrence of the element in
     *         this list at position {@code index} or later in the list;
     *         {@code -1} if the element is not found.
     * @throws IndexOutOfBoundsException if the specified index is negative
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public int indexOf(Object o) {

    /**
     * {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private static int lastIndexOf(Object o, Object[] elements, int index) {

    /**
     * static version of lastIndexOf.
     * @param o element to search for
     * @param elements the array
     * @param index first index to search
     * @return index of element, or -1 if absent
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private static int indexOf(Object o, Object[] elements,
                               int index, int fence) {

    /**
     * static version of indexOf, to allow repeated calls without
     * needing to re-acquire array each time.
     * @param o element to search for
     * @param elements the array
     * @param index first index to search
     * @param fence one past last index to search
     * @return index of element, or -1 if absent
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private static boolean eq(Object o1, Object o2) {

    /**
     * Tests for equality, coping with nulls.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public boolean isEmpty() {

    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public int size() {

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public CopyOnWriteArrayList(E[] toCopyIn) {

    /**
     * Creates a list holding a copy of the given array.
     *
     * @param toCopyIn the array (a copy of this array is used as the
     *        internal array)
     * @throws NullPointerException if the specified array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public CopyOnWriteArrayList(Collection<? extends E> c) {

    /**
     * Creates a list containing the elements of the specified
     * collection, in the order they are returned by the collection's
     * iterator.
     *
     * @param c the collection of initially held elements
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    public CopyOnWriteArrayList() {

    /**
     * Creates an empty list.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    final void setArray(Object[] a) {

    /**
     * Sets the array.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    final Object[] getArray() {

    /**
     * Gets the array.  Non-private so as to also be accessible
     * from CopyOnWriteArraySet class.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    private transient volatile Object[] array;

    /** The array, accessed only via getArray/setArray. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
    final transient ReentrantLock lock = new ReentrantLock();

    /** The lock protecting all mutators */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/CopyOnWriteArrayList.java
public class CopyOnWriteArrayList<E>

/**
 * A thread-safe variant of {@link java.util.ArrayList} in which all mutative
 * operations ({@code add}, {@code set}, and so on) are implemented by
 * making a fresh copy of the underlying array.
 *
 * <p>This is ordinarily too costly, but may be <em>more</em> efficient
 * than alternatives when traversal operations vastly outnumber
 * mutations, and is useful when you cannot or don't want to
 * synchronize traversals, yet need to preclude interference among
 * concurrent threads.  The "snapshot" style iterator method uses a
 * reference to the state of the array at the point that the iterator
 * was created. This array never changes during the lifetime of the
 * iterator, so interference is impossible and the iterator is
 * guaranteed not to throw {@code ConcurrentModificationException}.
 * The iterator will not reflect additions, removals, or changes to
 * the list since the iterator was created.  Element-changing
 * operations on iterators themselves ({@code remove}, {@code set}, and
 * {@code add}) are not supported. These methods throw
 * {@code UnsupportedOperationException}.
 *
 * <p>All elements are permitted, including {@code null}.
 *
 * <p>Memory consistency effects: As with other concurrent
 * collections, actions in a thread prior to placing an object into a
 * {@code CopyOnWriteArrayList}
 * <a href="package-summary.html#MemoryVisibility"><i>happen-before</i></a>
 * actions subsequent to the access or removal of that element from
 * the {@code CopyOnWriteArrayList} in another thread.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <E> the type of elements held in this collection
 */
