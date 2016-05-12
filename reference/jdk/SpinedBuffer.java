_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    static class OfDouble

    /**
     * An ordered collection of {@code double} values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    static class OfLong extends SpinedBuffer.OfPrimitive<Long, long[], LongConsumer>

    /**
     * An ordered collection of {@code long} values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    static class OfInt extends SpinedBuffer.OfPrimitive<Integer, int[], IntConsumer>

    /**
     * An ordered collection of {@code int} values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
        protected abstract void arrayForEach(T_ARR array, int from, int to,
                                             T_CONS consumer);

        /** Iterate an array with the provided consumer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
        protected abstract int arrayLength(T_ARR array);

        /** Get the length of an array */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
        public abstract T_ARR newArray(int size);

        /** Create a new array of the proper type and size */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
        protected abstract T_ARR[] newArrayArray(int size);

        /** Create a new array-of-array of the proper type and size */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
        OfPrimitive() {

        /**
         * Constructs an empty list with an initial capacity of sixteen.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
        OfPrimitive(int initialCapacity) {

        /**
         * Constructs an empty list with the specified initial capacity.
         *
         * @param  initialCapacity  the initial capacity of the list
         * @throws IllegalArgumentException if the specified initial capacity
         *         is negative
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    abstract static class OfPrimitive<E, T_ARR, T_CONS>

    /**
     * An ordered collection of primitive values.  Elements can be added, but
     * not removed. Goes through a building phase, during which elements can be
     * added, and a traversal phase, during which elements can be traversed in
     * order but no further modifications are possible.
     *
     * <p> One or more arrays are used to store elements. The use of a multiple
     * arrays has better performance characteristics than a single array used by
     * {@link ArrayList}, as when the capacity of the list needs to be increased
     * no copying of elements is required.  This is usually beneficial in the case
     * where the results will be traversed a small number of times.
     *
     * @param <E> the wrapper type for this primitive type
     * @param <T_ARR> the array type for this primitive type
     * @param <T_CONS> the Consumer type for this primitive type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    public Spliterator<E> spliterator() {

    /**
     * Return a {@link Spliterator} describing the contents of the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    public E[] asArray(IntFunction<E[]> arrayFactory) {

    /**
     * Create a new array using the specified array factory, and copy the
     * elements into it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    public void copyInto(E[] array, int offset) {

    /**
     * Copy the elements, starting at the specified offset, into the specified
     * array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    public E get(long index) {

    /**
     * Retrieve the element at the specified index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    protected void increaseCapacity() {

    /**
     * Force the buffer to increase its capacity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    @SuppressWarnings("unchecked")

    /**
     * Ensure that the buffer has at least capacity to hold the target size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    protected long capacity() {

    /**
     * Returns the current capacity of the buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    @SuppressWarnings("unchecked")

    /**
     * Constructs an empty list with an initial capacity of sixteen.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    @SuppressWarnings("unchecked")

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param  initialCapacity  the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity
     *         is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    protected E[][] spine;

    /**
     * All chunks, or null if there is only one chunk.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
    protected E[] curChunk;

    /**
     * Chunk that we're currently writing into; may or may not be aliased with
     * the first element of the spine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/SpinedBuffer.java
class SpinedBuffer<E>

/**
 * An ordered collection of elements.  Elements can be added, but not removed.
 * Goes through a building phase, during which elements can be added, and a
 * traversal phase, during which elements can be traversed in order but no
 * further modifications are possible.
 *
 * <p> One or more arrays are used to store elements. The use of a multiple
 * arrays has better performance characteristics than a single array used by
 * {@link ArrayList}, as when the capacity of the list needs to be increased
 * no copying of elements is required.  This is usually beneficial in the case
 * where the results will be traversed a small number of times.
 *
 * @param <E> the type of elements in this list
 * @since 1.8
 */
