_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        default StreamShape getShape() {

        /**
         * {@inheritDoc}
         *
         * @implSpec The default in {@code Node.OfDouble} returns
         * {@code StreamShape.DOUBLE_VALUE}
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec the default implementation invokes {@link #asPrimitiveArray()}
         * to obtain a double[] array then and copies the elements from that
         * double[] array into the boxed Double[] array.  This is not efficient
         * and it is recommended to invoke {@link #copyInto(Object, int)}.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @param consumer A {@code Consumer} that is to be invoked with each
         *        element in this {@code Node}.  If this is an
         *        {@code DoubleConsumer}, it is cast to {@code DoubleConsumer}
         *        so the elements may be processed without boxing.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    interface OfDouble extends OfPrimitive<Double, DoubleConsumer, double[], Spliterator.OfDouble, OfDouble> {

    /**
     * Specialized {@code Node} for double elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        default StreamShape getShape() {

        /**
         * {@inheritDoc}
         * @implSpec The default in {@code Node.OfLong} returns
         * {@code StreamShape.LONG_VALUE}
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec the default implementation invokes {@link #asPrimitiveArray()}
         * to obtain a long[] array then and copies the elements from that
         * long[] array into the boxed Long[] array.  This is not efficient and
         * it is recommended to invoke {@link #copyInto(Object, int)}.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @param consumer A {@code Consumer} that is to be invoked with each
         *        element in this {@code Node}.  If this is an
         *        {@code LongConsumer}, it is cast to {@code LongConsumer} so
         *        the elements may be processed without boxing.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    interface OfLong extends OfPrimitive<Long, LongConsumer, long[], Spliterator.OfLong, OfLong> {

    /**
     * Specialized {@code Node} for long elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        default StreamShape getShape() {

        /**
         * {@inheritDoc}
         * @implSpec The default in {@code Node.OfInt} returns
         * {@code StreamShape.INT_VALUE}
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec the default implementation invokes {@link #asPrimitiveArray()} to
         * obtain an int[] array then and copies the elements from that int[]
         * array into the boxed Integer[] array.  This is not efficient and it
         * is recommended to invoke {@link #copyInto(Object, int)}.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @param consumer a {@code Consumer} that is to be invoked with each
         *        element in this {@code Node}.  If this is an
         *        {@code IntConsumer}, it is cast to {@code IntConsumer} so the
         *        elements may be processed without boxing.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    interface OfInt extends OfPrimitive<Integer, IntConsumer, int[], Spliterator.OfInt, OfInt> {

    /**
     * Specialized {@code Node} for int elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        void copyInto(T_ARR array, int offset);

        /**
         * Copies the content of this {@code Node} into a primitive array,
         * starting at a given offset into the array.  It is the caller's
         * responsibility to ensure there is sufficient room in the array.
         *
         * @param array the array into which to copy the contents of this
         *              {@code Node}
         * @param offset the starting offset within the array
         * @throws IndexOutOfBoundsException if copying would cause access of
         *         data outside array bounds
         * @throws NullPointerException if {@code array} is {@code null}
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        T_ARR newArray(int count);

        /**
         * Creates a new primitive array.
         *
         * @param count the length of the primitive array.
         * @return the new primitive array.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        T_ARR asPrimitiveArray();

        /**
         * Views this node as a primitive array.
         *
         * <p>Depending on the underlying implementation this may return a
         * reference to an internal array rather than a copy.  It is the callers
         * responsibility to decide if either this node or the array is utilized
         * as the primary reference for the data.</p>
         *
         * @return an array containing the contents of this {@code Node}
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @implSpec the default implementation invokes the generator to create
         * an instance of a boxed primitive array with a length of
         * {@link #count()} and then invokes {@link #copyInto(T[], int)} with
         * that array at an offset of 0.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @SuppressWarnings("overloads")

        /**
         * Traverses the elements of this node, and invoke the provided
         * {@code action} with each element.
         *
         * @param action a consumer that is to be invoked with each
         *        element in this {@code Node.OfPrimitive}
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        @Override

        /**
         * {@inheritDoc}
         *
         * @return a {@link Spliterator.OfPrimitive} describing the elements of
         *         this node
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        interface OfDouble extends Node.Builder<Double>, Sink.OfDouble {

        /**
         * Specialized @{code Node.Builder} for double elements
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        interface OfLong extends Node.Builder<Long>, Sink.OfLong {

        /**
         * Specialized @{code Node.Builder} for long elements
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        interface OfInt extends Node.Builder<Integer>, Sink.OfInt {

        /**
         * Specialized @{code Node.Builder} for int elements
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
        Node<T> build();

        /**
         * Builds the node.  Should be called after all elements have been
         * pushed and signalled with an invocation of {@link Sink#end()}.
         *
         * @return the resulting {@code Node}
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    interface Builder<T> extends Sink<T> {

    /**
     * A mutable builder for a {@code Node} that implements {@link Sink}, which
     * builds a flat node containing the elements that have been pushed to it.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    long count();

    /**
     * Returns the number of elements contained in this node.
     *
     * @return the number of elements contained in this node
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    default StreamShape getShape() {

    /**
     * Gets the {@code StreamShape} associated with this {@code Node}.
     *
     * @implSpec The default in {@code Node} returns
     * {@code StreamShape.REFERENCE}
     *
     * @return the stream shape associated with this node
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    void copyInto(T[] array, int offset);

    /**
     * Copies the content of this {@code Node} into an array, starting at a
     * given offset into the array.  It is the caller's responsibility to ensure
     * there is sufficient room in the array, otherwise unspecified behaviour
     * will occur if the array length is less than the number of elements
     * contained in this node.
     *
     * @param array the array into which to copy the contents of this
     *       {@code Node}
     * @param offset the starting offset within the array
     * @throws IndexOutOfBoundsException if copying would cause access of data
     *         outside array bounds
     * @throws NullPointerException if {@code array} is {@code null}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    T[] asArray(IntFunction<T[]> generator);

    /**
     * Provides an array view of the contents of this node.
     *
     * <p>Depending on the underlying implementation, this may return a
     * reference to an internal array rather than a copy.  Since the returned
     * array may be shared, the returned array should not be modified.  The
     * {@code generator} function may be consulted to create the array if a new
     * array needs to be created.
     *
     * @param generator a factory function which takes an integer parameter and
     *        returns a new, empty array of that size and of the appropriate
     *        array type
     * @return an array containing the contents of this {@code Node}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    default Node<T> truncate(long from, long to, IntFunction<T[]> generator) {

    /**
     * Return a node describing a subsequence of the elements of this node,
     * starting at the given inclusive start offset and ending at the given
     * exclusive end offset.
     *
     * @param from The (inclusive) starting offset of elements to include, must
     *             be in range 0..count().
     * @param to The (exclusive) end offset of elements to include, must be
     *           in range 0..count().
     * @param generator A function to be used to create a new array, if needed,
     *                  for reference nodes.
     * @return the truncated node
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    default Node<T> getChild(int i) {

    /**
     * Retrieves the child {@code Node} at a given index.
     *
     * @implSpec The default implementation always throws
     * {@code IndexOutOfBoundsException}.
     *
     * @param i the index to the child node
     * @return the child node
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater
     *         than or equal to the number of child nodes
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    default int getChildCount() {

    /**
     * Returns the number of child nodes of this node.
     *
     * @implSpec The default implementation returns zero.
     *
     * @return the number of child nodes
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    void forEach(Consumer<? super T> consumer);

    /**
     * Traverses the elements of this node, and invoke the provided
     * {@code Consumer} with each element.  Elements are provided in encounter
     * order if the source for the {@code Node} has a defined encounter order.
     *
     * @param consumer a {@code Consumer} that is to be invoked with each
     *        element in this {@code Node}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
    Spliterator<T> spliterator();

    /**
     * Returns a {@link Spliterator} describing the elements contained in this
     * {@code Node}.
     *
     * @return a {@code Spliterator} describing the elements contained in this
     *         {@code Node}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Node.java
interface Node<T> {

/**
 * An immutable container for describing an ordered sequence of elements of some
 * type {@code T}.
 *
 * <p>A {@code Node} contains a fixed number of elements, which can be accessed
 * via the {@link #count}, {@link #spliterator}, {@link #forEach},
 * {@link #asArray}, or {@link #copyInto} methods.  A {@code Node} may have zero
 * or more child {@code Node}s; if it has no children (accessed via
 * {@link #getChildCount} and {@link #getChild(int)}, it is considered <em>flat
 * </em> or a <em>leaf</em>; if it has children, it is considered an
 * <em>internal</em> node.  The size of an internal node is the sum of sizes of
 * its children.
 *
 * @apiNote
 * <p>A {@code Node} typically does not store the elements directly, but instead
 * mediates access to one or more existing (effectively immutable) data
 * structures such as a {@code Collection}, array, or a set of other
 * {@code Node}s.  Commonly {@code Node}s are formed into a tree whose shape
 * corresponds to the computation tree that produced the elements that are
 * contained in the leaf nodes.  The use of {@code Node} within the stream
 * framework is largely to avoid copying data unnecessarily during parallel
 * operations.
 *
 * @param <T> the type of elements.
 * @since 1.8
 */
