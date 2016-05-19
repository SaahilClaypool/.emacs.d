_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public byte[] toArray() {

    /**
     * Returns an array containing all of the elements in this ByteBuffer
     * in the correct order.
     *
     * @since 1.2
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public boolean isEmpty() {

    /**
     * Tests if this ByteBuffer has no components.
     *
     * @return  <code>true</code> if and only if this ByteBuffer has
     *          no components, that is, its size is zero;
     *          <code>false</code> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public int size() {

    /**
     * Returns the number of components in this ByteBuffer.
     *
     * @return  the number of components in this ByteBuffer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public int capacity() {

    /**
     * Returns the current capacity of this ByteBuffer.
     *
     * @return  the current capacity (the length of its internal
     *          data arary, kept in the field <tt>elementData</tt>
     *          of this ByteBuffer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    private void ensureCapacityHelper(int minCapacity) {

    /**
     * This implements the unsynchronized semantics of ensureCapacity.
     * Synchronized methods in this class can internally call this
     * method for ensuring capacity without incurring the cost of an
     * extra synchronization.
     *
     * @see java.util.ByteBuffer#ensureCapacity(int)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public void trimToSize() {

    /**
     * Trims the capacity of this ByteBuffer to be the ByteBuffer's current
     * size. If the capacity of this cector is larger than its current
     * size, then the capacity is changed to equal the size by replacing
     * its internal data array, kept in the field <tt>elementData</tt>,
     * with a smaller one. An application can use this operation to
     * minimize the storage of a ByteBuffer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public ByteBuffer() {

    /**
     * Constructs an empty ByteBuffer so that its internal data array
     * has size <tt>10</tt> and its standard capacity increment is
     * zero.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public ByteBuffer(int initialCapacity) {

    /**
     * Constructs an empty ByteBuffer with the specified initial capacity and
     * with its capacity increment equal to zero.
     *
     * @param   initialCapacity   the initial capacity of the ByteBuffer.
     * @exception IllegalArgumentException if the specified initial capacity
     *               is negative
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    public ByteBuffer(int initialCapacity, int capacityIncrement) {

    /**
     * Constructs an empty ByteBuffer with the specified initial capacity and
     * capacity increment.
     *
     * @param   initialCapacity     the initial capacity of the ByteBuffer.
     * @param   capacityIncrement   the amount by which the capacity is
     *                              increased when the ByteBuffer overflows.
     * @exception IllegalArgumentException if the specified initial capacity
     *               is negative
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    protected int capacityIncrement;

    /**
     * The amount by which the capacity of the ByteBuffer is automatically
     * incremented when its size becomes greater than its capacity.  If
     * the capacity increment is less than or equal to zero, the capacity
     * of the ByteBuffer is doubled each time it needs to grow.
     *
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    protected int elementCount;

    /**
     * The number of valid components in this <tt>ByteBuffer</tt> object.
     * Components <tt>elementData[0]</tt> through
     * <tt>elementData[elementCount-1]</tt> are the actual items.
     *
     * @serial
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ByteBuffer.java
    protected byte elementData[];

    /**
     * The array buffer into which the components of the ByteBuffer are
     * stored. The capacity of the ByteBuffer is the length of this array buffer,
     * and is at least large enough to contain all the ByteBuffer's elements.<p>
     *
     * Any array elements following the last element in the ByteBuffer are 0.
     */
