_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void removeRange(int fromIndex, int toIndex) {

    /**
     * Deletes the components at the specified range of indexes.
     * The removal is inclusive, so specifying a range of (1,5)
     * removes the component at index 1 and the component at index 5,
     * as well as all components in between.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code>
     * if the index was invalid.
     * Throws an <code>IllegalArgumentException</code> if
     * <code>fromIndex &gt; toIndex</code>.
     *
     * @param      fromIndex the index of the lower end of the range
     * @param      toIndex   the index of the upper end of the range
     * @see        #remove(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void clear() {

    /**
     * Removes all of the elements from this list.  The list will
     * be empty after this call returns (unless it throws an exception).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public E remove(int index) {

    /**
     * Removes the element at the specified position in this list.
     * Returns the element that was removed from the list.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code>
     * if the index is out of range
     * (<code>index &lt; 0 || index &gt;= size()</code>).
     *
     * @param index the index of the element to removed
     * @return the element previously at the specified position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void add(int index, E element) {

    /**
     * Inserts the specified element at the specified position in this list.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code> if the
     * index is out of range
     * (<code>index &lt; 0 || index &gt; size()</code>).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public E set(int index, E element) {

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code>
     * if the index is out of range
     * (<code>index &lt; 0 || index &gt;= size()</code>).
     *
     * @param index index of element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public E get(int index) {

    /**
     * Returns the element at the specified position in this list.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code>
     * if the index is out of range
     * (<code>index &lt; 0 || index &gt;= size()</code>).
     *
     * @param index index of element to return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public Object[] toArray() {

    /**
     * Returns an array containing all of the elements in this list in the
     * correct order.
     *
     * @return an array containing the elements of the list
     * @see Vector#toArray()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
   public String toString() {

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void removeAllElements() {

    /**
     * Removes all components from this list and sets its size to zero.
     * <blockquote>
     * <b>Note:</b> Although this method is not deprecated, the preferred
     *    method to use is <code>clear</code>, which implements the
     *    <code>List</code> interface defined in the 1.2 Collections framework.
     * </blockquote>
     *
     * @see #clear()
     * @see Vector#removeAllElements()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public boolean removeElement(Object obj) {

    /**
     * Removes the first (lowest-indexed) occurrence of the argument
     * from this list.
     *
     * @param   obj   the component to be removed
     * @return  <code>true</code> if the argument was a component of this
     *          list; <code>false</code> otherwise
     * @see Vector#removeElement(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void addElement(E element) {

    /**
     * Adds the specified component to the end of this list.
     *
     * @param   element   the component to be added
     * @see Vector#addElement(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void insertElementAt(E element, int index) {

    /**
     * Inserts the specified element as a component in this list at the
     * specified <code>index</code>.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code> if the index
     * is invalid.
     * <blockquote>
     * <b>Note:</b> Although this method is not deprecated, the preferred
     *    method to use is <code>add(int,Object)</code>, which implements the
     *    <code>List</code> interface defined in the 1.2 Collections framework.
     * </blockquote>
     *
     * @param      element the component to insert
     * @param      index   where to insert the new component
     * @exception  ArrayIndexOutOfBoundsException  if the index was invalid
     * @see #add(int,Object)
     * @see Vector#insertElementAt(Object,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void removeElementAt(int index) {

    /**
     * Deletes the component at the specified index.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code> if the index
     * is invalid.
     * <blockquote>
     * <b>Note:</b> Although this method is not deprecated, the preferred
     *    method to use is <code>remove(int)</code>, which implements the
     *    <code>List</code> interface defined in the 1.2 Collections framework.
     * </blockquote>
     *
     * @param      index   the index of the object to remove
     * @see #remove(int)
     * @see Vector#removeElementAt(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void setElementAt(E element, int index) {

    /**
     * Sets the component at the specified <code>index</code> of this
     * list to be the specified element. The previous component at that
     * position is discarded.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code> if the index
     * is invalid.
     * <blockquote>
     * <b>Note:</b> Although this method is not deprecated, the preferred
     *    method to use is <code>set(int,Object)</code>, which implements the
     *    <code>List</code> interface defined in the 1.2 Collections framework.
     * </blockquote>
     *
     * @param      element what the component is to be set to
     * @param      index   the specified index
     * @see #set(int,Object)
     * @see Vector#setElementAt(Object,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public E lastElement() {

    /**
     * Returns the last component of the list.
     * Throws a <code>NoSuchElementException</code> if this vector
     * has no components.
     *
     * @return  the last component of the list
     * @see Vector#lastElement()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public E firstElement() {

    /**
     * Returns the first component of this list.
     * Throws a <code>NoSuchElementException</code> if this
     * vector has no components.
     * @return     the first component of this list
     * @see Vector#firstElement()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public E elementAt(int index) {

    /**
     * Returns the component at the specified index.
     * Throws an <code>ArrayIndexOutOfBoundsException</code> if the index
     * is negative or not less than the size of the list.
     * <blockquote>
     * <b>Note:</b> Although this method is not deprecated, the preferred
     *    method to use is <code>get(int)</code>, which implements the
     *    <code>List</code> interface defined in the 1.2 Collections framework.
     * </blockquote>
     *
     * @param      index   an index into this list
     * @return     the component at the specified index
     * @see #get(int)
     * @see Vector#elementAt(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public int lastIndexOf(Object elem, int index) {

    /**
     * Searches backwards for <code>elem</code>, starting from the
     * specified index, and returns an index to it.
     *
     * @param  elem    the desired component
     * @param  index   the index to start searching from
     * @return the index of the last occurrence of the <code>elem</code>
     *          in this list at position less than <code>index</code>;
     *          returns <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public int lastIndexOf(Object elem) {

    /**
     * Returns the index of the last occurrence of <code>elem</code>.
     *
     * @param   elem   the desired component
     * @return  the index of the last occurrence of <code>elem</code>
     *          in the list; returns <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
     public int indexOf(Object elem, int index) {

    /**
     * Searches for the first occurrence of <code>elem</code>, beginning
     * the search at <code>index</code>.
     *
     * @param   elem    an desired component
     * @param   index   the index from which to begin searching
     * @return  the index where the first occurrence of <code>elem</code>
     *          is found after <code>index</code>; returns <code>-1</code>
     *          if the <code>elem</code> is not found in the list
     * @see Vector#indexOf(Object,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public int indexOf(Object elem) {

    /**
     * Searches for the first occurrence of <code>elem</code>.
     *
     * @param   elem   an object
     * @return  the index of the first occurrence of the argument in this
     *          list; returns <code>-1</code> if the object is not found
     * @see Vector#indexOf(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public boolean contains(Object elem) {

    /**
     * Tests whether the specified object is a component in this list.
     *
     * @param   elem   an object
     * @return  <code>true</code> if the specified object
     *          is the same as a component in this list
     * @see Vector#contains(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public Enumeration<E> elements() {

    /**
     * Returns an enumeration of the components of this list.
     *
     * @return  an enumeration of the components of this list
     * @see Vector#elements()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public boolean isEmpty() {

    /**
     * Tests whether this list has any components.
     *
     * @return  <code>true</code> if and only if this list has
     *          no components, that is, its size is zero;
     *          <code>false</code> otherwise
     * @see Vector#isEmpty()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public int size() {

    /**
     * Returns the number of components in this list.
     *
     * @return  the number of components in this list
     * @see Vector#size()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public int capacity() {

    /**
     * Returns the current capacity of this list.
     *
     * @return  the current capacity
     * @see Vector#capacity()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void setSize(int newSize) {

    /**
     * Sets the size of this list.
     *
     * @param   newSize   the new size of this list
     * @see Vector#setSize(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void ensureCapacity(int minCapacity) {

    /**
     * Increases the capacity of this list, if necessary, to ensure
     * that it can hold at least the number of components specified by
     * the minimum capacity argument.
     *
     * @param   minCapacity   the desired minimum capacity
     * @see Vector#ensureCapacity(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void trimToSize() {

    /**
     * Trims the capacity of this list to be the list's current size.
     *
     * @see Vector#trimToSize()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public void copyInto(Object anArray[]) {

    /**
     * Copies the components of this list into the specified array.
     * The array must be big enough to hold all the objects in this list,
     * else an <code>IndexOutOfBoundsException</code> is thrown.
     *
     * @param   anArray   the array into which the components get copied
     * @see Vector#copyInto(Object[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public E getElementAt(int index) {

    /**
     * Returns the component at the specified index.
     * <blockquote>
     * <b>Note:</b> Although this method is not deprecated, the preferred
     *    method to use is <code>get(int)</code>, which implements the
     *    <code>List</code> interface defined in the 1.2 Collections framework.
     * </blockquote>
     * @param      index   an index into this list
     * @return     the component at the specified index
     * @exception  ArrayIndexOutOfBoundsException  if the <code>index</code>
     *             is negative or greater than the current size of this
     *             list
     * @see #get(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
    public int getSize() {

    /**
     * Returns the number of components in this list.
     * <p>
     * This method is identical to <code>size</code>, which implements the
     * <code>List</code> interface defined in the 1.2 Collections framework.
     * This method exists in conjunction with <code>setSize</code> so that
     * <code>size</code> is identifiable as a JavaBean property.
     *
     * @return  the number of components in this list
     * @see #size()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultListModel.java
public class DefaultListModel<E> extends AbstractListModel<E>

/**
 * This class loosely implements the <code>java.util.Vector</code>
 * API, in that it implements the 1.1.x version of
 * <code>java.util.Vector</code>, has no collection class support,
 * and notifies the <code>ListDataListener</code>s when changes occur.
 * Presently it delegates to a <code>Vector</code>,
 * in a future release it will be a real Collection implementation.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @param <E> the type of the elements of this model
 *
 * @author Hans Muller
 */
