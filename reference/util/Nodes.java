_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    private static final class SpinedNodeBuilder<T>

    /**
     * Variable-sized builder class for reference nodes
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    private static final class FixedNodeBuilder<T>

    /**
     * Fixed-sized builder class for reference nodes
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
        @SuppressWarnings("unchecked")

        /**
         * Depth first search, in left-to-right order, of the node tree, using
         * an explicit stack, to find the next non-empty leaf node.
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
        @SuppressWarnings("unchecked")

        /**
         * Initiate a stack containing, in left-to-right order, the child nodes
         * covered by this spliterator
         */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    private static abstract class InternalNodeSpliterator<T,

    /** Abstract class for spliterator for all internal node classes */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    private static abstract class AbstractConcNode<T, T_NODE extends Node<T>> implements Node<T> {

    /**
     * Node class for an internal node with two or more children
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    private static final class CollectionNode<T> implements Node<T> {

    /** Node class for a Collection */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    private static class ArrayNode<T> implements Node<T> {

    /** Node class for a reference array */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static Node.OfDouble flattenDouble(Node.OfDouble node) {

    /**
     * Flatten, in parallel, a {@link Node.OfDouble}.  A flattened node is one that
     * has no children.  If the node is already flat, it is simply returned.
     *
     * @implSpec
     * If a new node is to be created, a new double[] array is created whose length
     * is {@link Node#count()}.  Then the node tree is traversed and leaf node
     * elements are placed in the array concurrently by leaf tasks at the
     * correct offsets.
     *
     * @param node the node to flatten
     * @return a flat {@code Node.OfDouble}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static Node.OfLong flattenLong(Node.OfLong node) {

    /**
     * Flatten, in parallel, a {@link Node.OfLong}.  A flattened node is one that
     * has no children.  If the node is already flat, it is simply returned.
     *
     * @implSpec
     * If a new node is to be created, a new long[] array is created whose length
     * is {@link Node#count()}.  Then the node tree is traversed and leaf node
     * elements are placed in the array concurrently by leaf tasks at the
     * correct offsets.
     *
     * @param node the node to flatten
     * @return a flat {@code Node.OfLong}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static Node.OfInt flattenInt(Node.OfInt node) {

    /**
     * Flatten, in parallel, a {@link Node.OfInt}.  A flattened node is one that
     * has no children.  If the node is already flat, it is simply returned.
     *
     * @implSpec
     * If a new node is to be created, a new int[] array is created whose length
     * is {@link Node#count()}.  Then the node tree is traversed and leaf node
     * elements are placed in the array concurrently by leaf tasks at the
     * correct offsets.
     *
     * @param node the node to flatten
     * @return a flat {@code Node.OfInt}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static <T> Node<T> flatten(Node<T> node, IntFunction<T[]> generator) {

    /**
     * Flatten, in parallel, a {@link Node}.  A flattened node is one that has
     * no children.  If the node is already flat, it is simply returned.
     *
     * @implSpec
     * If a new node is to be created, the generator is used to create an array
     * whose length is {@link Node#count()}.  Then the node tree is traversed
     * and leaf node elements are placed in the array concurrently by leaf tasks
     * at the correct offsets.
     *
     * @param <T> type of elements contained by the node
     * @param node the node to flatten
     * @param generator the array factory used to create array instances
     * @return a flat {@code Node}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static <P_IN> Node.OfDouble collectDouble(PipelineHelper<Double> helper,
                                                     Spliterator<P_IN> spliterator,
                                                     boolean flattenTree) {

    /**
     * Collect, in parallel, elements output from n double-valued pipeline and
     * describe those elements with a {@link Node.OfDouble}.
     *
     * @implSpec
     * If the exact size of the output from the pipeline is known and the source
     * {@link Spliterator} has the {@link Spliterator#SUBSIZED} characteristic,
     * then a flat {@link Node} will be returned whose content is an array,
     * since the size is known the array can be constructed in advance and
     * output elements can be placed into the array concurrently by leaf
     * tasks at the correct offsets.  If the exact size is not known, output
     * elements are collected into a conc-node whose shape mirrors that
     * of the computation. This conc-node can then be flattened in
     * parallel to produce a flat {@code Node.OfDouble} if desired.
     *
     * @param <P_IN> the type of elements from the source Spliterator
     * @param helper the pipeline helper describing the pipeline
     * @param flattenTree whether a conc node should be flattened into a node
     *                    describing an array before returning
     * @return a {@link Node.OfDouble} describing the output elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static <P_IN> Node.OfLong collectLong(PipelineHelper<Long> helper,
                                                 Spliterator<P_IN> spliterator,
                                                 boolean flattenTree) {

    /**
     * Collect, in parallel, elements output from a long-valued pipeline and
     * describe those elements with a {@link Node.OfLong}.
     *
     * @implSpec
     * If the exact size of the output from the pipeline is known and the source
     * {@link Spliterator} has the {@link Spliterator#SUBSIZED} characteristic,
     * then a flat {@link Node} will be returned whose content is an array,
     * since the size is known the array can be constructed in advance and
     * output elements can be placed into the array concurrently by leaf
     * tasks at the correct offsets.  If the exact size is not known, output
     * elements are collected into a conc-node whose shape mirrors that
     * of the computation. This conc-node can then be flattened in
     * parallel to produce a flat {@code Node.OfLong} if desired.
     *
     * @param <P_IN> the type of elements from the source Spliterator
     * @param helper the pipeline helper describing the pipeline
     * @param flattenTree whether a conc node should be flattened into a node
     *                    describing an array before returning
     * @return a {@link Node.OfLong} describing the output elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static <P_IN> Node.OfInt collectInt(PipelineHelper<Integer> helper,
                                               Spliterator<P_IN> spliterator,
                                               boolean flattenTree) {

    /**
     * Collect, in parallel, elements output from an int-valued pipeline and
     * describe those elements with a {@link Node.OfInt}.
     *
     * @implSpec
     * If the exact size of the output from the pipeline is known and the source
     * {@link Spliterator} has the {@link Spliterator#SUBSIZED} characteristic,
     * then a flat {@link Node} will be returned whose content is an array,
     * since the size is known the array can be constructed in advance and
     * output elements can be placed into the array concurrently by leaf
     * tasks at the correct offsets.  If the exact size is not known, output
     * elements are collected into a conc-node whose shape mirrors that
     * of the computation. This conc-node can then be flattened in
     * parallel to produce a flat {@code Node.OfInt} if desired.
     *
     * @param <P_IN> the type of elements from the source Spliterator
     * @param helper the pipeline helper describing the pipeline
     * @param flattenTree whether a conc node should be flattened into a node
     *                    describing an array before returning
     * @return a {@link Node.OfInt} describing the output elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    public static <P_IN, P_OUT> Node<P_OUT> collect(PipelineHelper<P_OUT> helper,
                                                    Spliterator<P_IN> spliterator,
                                                    boolean flattenTree,
                                                    IntFunction<P_OUT[]> generator) {

    /**
     * Collect, in parallel, elements output from a pipeline and describe those
     * elements with a {@link Node}.
     *
     * @implSpec
     * If the exact size of the output from the pipeline is known and the source
     * {@link Spliterator} has the {@link Spliterator#SUBSIZED} characteristic,
     * then a flat {@link Node} will be returned whose content is an array,
     * since the size is known the array can be constructed in advance and
     * output elements can be placed into the array concurrently by leaf
     * tasks at the correct offsets.  If the exact size is not known, output
     * elements are collected into a conc-node whose shape mirrors that
     * of the computation. This conc-node can then be flattened in
     * parallel to produce a flat {@code Node} if desired.
     *
     * @param helper the pipeline helper describing the pipeline
     * @param flattenTree whether a conc node should be flattened into a node
     *                    describing an array before returning
     * @param generator the array generator
     * @return a {@link Node} describing the output elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.Builder.OfDouble doubleBuilder() {

    /**
     * Produces a variable size @{link Node.Builder.OfDouble}.
     *
     * @return a {@code Node.Builder.OfDouble}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.Builder.OfDouble doubleBuilder(long exactSizeIfKnown) {

    /**
     * Produces a {@link Node.Builder.OfDouble}.
     *
     * @param exactSizeIfKnown -1 if a variable size builder is requested,
     * otherwise the exact capacity desired.  A fixed capacity builder will
     * fail if the wrong number of elements are added to the builder.
     * @return a {@code Node.Builder.OfDouble}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.OfDouble node(final double[] array) {

    /**
     * Produces a {@link Node.OfDouble} describing a double[] array.
     *
     * <p>The node will hold a reference to the array and will not make a copy.
     *
     * @param array the array
     * @return a node holding an array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.Builder.OfLong longBuilder() {

    /**
     * Produces a variable size @{link Node.Builder.OfLong}.
     *
     * @return a {@code Node.Builder.OfLong}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.Builder.OfLong longBuilder(long exactSizeIfKnown) {

    /**
     * Produces a {@link Node.Builder.OfLong}.
     *
     * @param exactSizeIfKnown -1 if a variable size builder is requested,
     * otherwise the exact capacity desired.  A fixed capacity builder will
     * fail if the wrong number of elements are added to the builder.
     * @return a {@code Node.Builder.OfLong}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.OfLong node(final long[] array) {

    /**
     * Produces a {@link Node.OfLong} describing a long[] array.
     * <p>
     * The node will hold a reference to the array and will not make a copy.
     *
     * @param array the array
     * @return a node holding an array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.Builder.OfInt intBuilder() {

    /**
     * Produces a variable size @{link Node.Builder.OfInt}.
     *
     * @return a {@code Node.Builder.OfInt}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.Builder.OfInt intBuilder(long exactSizeIfKnown) {

    /**
     * Produces a {@link Node.Builder.OfInt}.
     *
     * @param exactSizeIfKnown -1 if a variable size builder is requested,
     * otherwise the exact capacity desired.  A fixed capacity builder will
     * fail if the wrong number of elements are added to the builder.
     * @return a {@code Node.Builder.OfInt}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static Node.OfInt node(int[] array) {

    /**
     * Produces a {@link Node.OfInt} describing an int[] array.
     *
     * <p>The node will hold a reference to the array and will not make a copy.
     *
     * @param array the array
     * @return a node holding an array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static <T> Node.Builder<T> builder() {

    /**
     * Produces a variable size @{link Node.Builder}.
     *
     * @param <T> the type of elements of the node builder
     * @return a {@code Node.Builder}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static <T> Node.Builder<T> builder(long exactSizeIfKnown, IntFunction<T[]> generator) {

    /**
     * Produces a {@link Node.Builder}.
     *
     * @param exactSizeIfKnown -1 if a variable size builder is requested,
     * otherwise the exact capacity desired.  A fixed capacity builder will
     * fail if the wrong number of elements are added to the builder.
     * @param generator the array factory
     * @param <T> the type of elements of the node builder
     * @return a {@code Node.Builder}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static <T> Node<T> node(Collection<T> c) {

    /**
     * Produces a {@link Node} describing a {@link Collection}.
     * <p>
     * The node will hold a reference to the collection and will not make a copy.
     *
     * @param <T> the type of elements held by the node
     * @param c the collection
     * @return a node holding a collection
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static <T> Node<T> node(T[] array) {

    /**
     * Produces a {@link Node} describing an array.
     *
     * <p>The node will hold a reference to the array and will not make a copy.
     *
     * @param <T> the type of elements held by the node
     * @param array the array
     * @return a node holding an array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    @SuppressWarnings("unchecked")

    /**
     * Produces a concatenated {@link Node} that has two or more children.
     * <p>The count of the concatenated node is equal to the sum of the count
     * of each child. Traversal of the concatenated node traverses the content
     * of each child in encounter order of the list of children. Splitting a
     * spliterator obtained from the concatenated node preserves the encounter
     * order of the list of children.
     *
     * <p>The result may be a concatenated node, the input sole node if the size
     * of the list is 1, or an empty node.
     *
     * @param <T> the type of elements of the concatenated node
     * @param shape the shape of the concatenated node to be created
     * @param left the left input node
     * @param right the right input node
     * @return a {@code Node} covering the elements of the input nodes
     * @throws IllegalStateException if all {@link Node} elements of the list
     * are an not instance of type supported by this factory.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    @SuppressWarnings("unchecked")

    /**
     * Produces an empty node whose count is zero, has no children and no content.
     *
     * @param <T> the type of elements of the created node
     * @param shape the shape of the node to be created
     * @return an empty node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
    static final long MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * The maximum size of an array that can be allocated.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/Nodes.java
final class Nodes {

/**
 * Factory methods for constructing implementations of {@link Node} and
 * {@link Node.Builder} and their primitive specializations.  Fork/Join tasks
 * for collecting output from a {@link PipelineHelper} to a {@link Node} and
 * flattening {@link Node}s.
 *
 * @since 1.8
 */
