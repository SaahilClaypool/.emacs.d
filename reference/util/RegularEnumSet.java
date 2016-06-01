_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean equals(Object o) {

    /**
     * Compares the specified object with this set for equality.  Returns
     * <tt>true</tt> if the given object is also a set, the two sets have
     * the same size, and every member of the given set is contained in
     * this set.
     *
     * @param o object to be compared for equality with this set
     * @return <tt>true</tt> if the specified object is equal to this set
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public void clear() {

    /**
     * Removes all of the elements from this set.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean retainAll(Collection<?> c) {

    /**
     * Retains only the elements in this set that are contained in the
     * specified collection.
     *
     * @param c elements to be retained in this set
     * @return <tt>true</tt> if this set changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean removeAll(Collection<?> c) {

    /**
     * Removes from this set all of its elements that are contained in
     * the specified collection.
     *
     * @param c elements to be removed from this set
     * @return <tt>true</tt> if this set changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean addAll(Collection<? extends E> c) {

    /**
     * Adds all of the elements in the specified collection to this set.
     *
     * @param c collection whose elements are to be added to this set
     * @return <tt>true</tt> if this set changed as a result of the call
     * @throws NullPointerException if the specified collection or any
     *     of its elements are null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean containsAll(Collection<?> c) {

    /**
     * Returns <tt>true</tt> if this set contains all of the elements
     * in the specified collection.
     *
     * @param c collection to be checked for containment in this set
     * @return <tt>true</tt> if this set contains all of the elements
     *        in the specified collection
     * @throws NullPointerException if the specified collection is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean remove(Object e) {

    /**
     * Removes the specified element from this set if it is present.
     *
     * @param e element to be removed from this set, if present
     * @return <tt>true</tt> if the set contained the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean add(E e) {

    /**
     * Adds the specified element to this set if it is not already present.
     *
     * @param e element to be added to this set
     * @return <tt>true</tt> if the set changed as a result of the call
     *
     * @throws NullPointerException if <tt>e</tt> is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean contains(Object e) {

    /**
     * Returns <tt>true</tt> if this set contains the specified element.
     *
     * @param e element to be checked for containment in this collection
     * @return <tt>true</tt> if this set contains the specified element
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public boolean isEmpty() {

    /**
     * Returns <tt>true</tt> if this set contains no elements.
     *
     * @return <tt>true</tt> if this set contains no elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public int size() {

    /**
     * Returns the number of elements in this set.
     *
     * @return the number of elements in this set
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
        long lastReturned = 0;

        /**
         * The bit representing the last element returned by this iterator
         * but not removed, or zero if no such element exists.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
        long unseen;

        /**
         * A bit vector representing the elements in the set not yet
         * returned by this iterator.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    public Iterator<E> iterator() {

    /**
     * Returns an iterator over the elements contained in this set.  The
     * iterator traverses the elements in their <i>natural order</i> (which is
     * the order in which the enum constants are declared). The returned
     * Iterator is a "snapshot" iterator that will never throw {@link
     * ConcurrentModificationException}; the elements are traversed as they
     * existed when this call was invoked.
     *
     * @return an iterator over the elements contained in this set
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
    private long elements = 0L;

    /**
     * Bit vector representation of this set.  The 2^k bit indicates the
     * presence of universe[k] in this set.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//RegularEnumSet.java
class RegularEnumSet<E extends Enum<E>> extends EnumSet<E> {

/**
 * Private implementation class for EnumSet, for "regular sized" enum types
 * (i.e., those with 64 or fewer enum constants).
 *
 * @author Josh Bloch
 * @since 1.5
 * @serial exclude
 */
