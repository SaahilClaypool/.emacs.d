_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public int getNodeByPosition(int position) {

        /**
         * Return the node at the given position.
         *
         * @param position The position
         * @return The node at the given position.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public int getLast() {

        /**
         * Returns the number of nodes in this iterator.
         *
         * @return the number of nodes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        protected void init() {

        /**
         * Evaluate the reference to the <code>key</code> or <code>id</code>
         * function with the context specified by {@link #setStartNode(int)}
         * and set up this iterator to iterate over the DTM nodes that are
         * to be returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public DTMAxisIterator reset() {

        /**
         * Resets the iterator to the last start node.
         *
         * @return A DTMAxisIterator, which may or may not be the same as this
         *         iterator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set context node for the iterator.  This will cause the iterator
         * to reset itself, reevaluate arguments to the function, look up
         * nodes in the input and reinitialize its internal heap.
         *
         * @param node the context node
         * @return A {@link DTMAxisIterator} set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        protected IntegerArray lookupNodes(int root, String keyValue) {

        /**
         * Retrieve nodes for a particular key value or a particular id
         * argument value.
         *
         * @param root The root node of the document containing the context node
         * @param keyValue The key value of id string argument value
         * @return an {@link IntegerArray} of the resulting nodes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        KeyIndexIterator(DTMAxisIterator keyValues, boolean isKeyIterator) {

        /**
         * Constructor used when the argument to <code>key</code> or
         * <code>id</code> is a node set.
         *
         * @param keyValues the argument to <code>key</code> or <code>id</code>
         * @param isKeyIterator indicates whether the constructed iterator
         *                represents a reference to <code>key</code> or
         *                <code>id</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        KeyIndexIterator(String keyValue, boolean isKeyIterator) {

        /**
         * Constructor used when the argument to <code>key</code> or
         * <code>id</code> is not a node set.
         *
         * @param keyValue the argument to <code>key</code> or <code>id</code>
         *                 cast to a <code>String</code>
         * @param isKeyIterator indicates whether the constructed iterator
         *                represents a reference to <code>key</code> or
         *                <code>id</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public HeapNode reset() {

            /**
             * Reset the heap node back to its beginning.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public HeapNode setStartNode(int node) {

            /**
             * <p>Sets context with respect to which this heap node is
             * evaluated.</p>
             * <p>This has no real effect on this kind of heap node.  Instead,
             * the {@link KeyIndexIterator#setStartNode(int)} method should
             * create new instances of this class to represent the effect of
             * changing the context.</p>
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public boolean isLessThan(HeapNode heapNode) {

            /**
             * Performs a comparison of the two heap nodes
             *
             * @param heapNode the heap node against which to compare
             * @return <code>true</code> if and only if the current node for
             *         this heap node is before the current node of the
             *         argument heap node in document order.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public void gotoMark() {

            /**
             * Restores the current node remembered by {@link #setMark()}.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public void setMark() {

            /**
             * Remembers the current node for the next call to
             * {@link #gotoMark()}.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public HeapNode cloneHeapNode() {

            /**
             * Creates a deep copy of this {@link HeapNode}.  The clone is not
             * reset from the current position of the original.
             *
             * @return the cloned heap node
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public int step() {

            /**
             * Advance to the next node represented by this {@link HeapNode}
             *
             * @return the next DTM node.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            KeyIndexHeapNode(IntegerArray nodes) {

            /**
             * Create a heap node representing DTM nodes retrieved for one
             * key value in a reference to the <code>key</code> function
             * or string argument to the <code>id</code> function.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            private int _markPosition = -1;

            /**
             * Marked position.  Used by {@link #setMark()} and
             * {@link #gotoMark()}
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            private int _position = 0;

            /**
             * Position in {@link #_nodes} array of next node to return from
             * this heap node.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            private IntegerArray _nodes;

            /**
             * {@link IntegerArray} of DTM nodes retrieved for one key value.
             * Must contain no duplicates and be stored in document order.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        protected class KeyIndexHeapNode

        /**
         * Represents the DTM nodes retrieved for one key value or one string
         * argument to <code>id</code> for use as one heap node in a
         * {@link MultiValuedNodeHeapIterator}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private boolean _isKeyIterator;

        /**
         * Indicates whether this object represents the result of a reference
         * to the <code>key</code> function (<code>true</code>) or the
         * <code>id</code> function (<code>false</code>).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private String _keyValue;

        /**
         * <p>This field contains the iterator representing a non-node-set key
         * value argument to the <code>key</code> function or a non-node-set
         * argument to the <code>id</code> function.</p>
         *
         * <p>Exactly one of this field and {@link #_keyValueIterator} must be
         * <code>null</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private DTMAxisIterator _keyValueIterator;

        /**
         * <p>This field contains the iterator representing a node set key value
         * argument to the <code>key</code> function or a node set argument
         * to the <code>id</code> function.</p>
         *
         * <p>Exactly one of this field and {@link #_keyValue} must be
         * <code>null</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private IntegerArray _nodes;

        /**
         * <p>A reference to the <code>key</code> function that only has one
         * key value or to the <code>id</code> function that has only one string
         * argument can be optimized to ignore the multi-valued heap.  This
         * field will be <code>null</code> otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public class KeyIndexIterator extends MultiValuedNodeHeapIterator {

    /**
     * An iterator representing the result of a reference to either the
     * XSLT <code>key</code> function or the XPath <code>id</code> function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    final private static IntegerArray EMPTY_NODES = new IntegerArray(0);

    /**
     * Used to represent an empty node set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public KeyIndexIterator getKeyIndexIterator(DTMAxisIterator keyValue,
                                                boolean isKeyCall) {

    /**
     * Create a {@link KeyIndexIterator} that iterates over the nodes that
     * result from a reference to the XSLT <code>key</code> function or
     * XPath <code>id</code> function.
     *
     * @param keyValue An iterator representing the key values or id
     *                 references
     * @param isKeyCall A <code>boolean</code> indicating whether the iterator
     *                 is being created for a reference <code>key</code> or
     *                 <code>id</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public KeyIndexIterator getKeyIndexIterator(String keyValue,
                                                boolean isKeyCall) {

    /**
     * Create a {@link KeyIndexIterator} that iterates over the nodes that
     * result from a reference to the XSLT <code>key</code> function or
     * XPath <code>id</code> function.
     *
     * @param keyValue A string representing the key values or id
     *                 references
     * @param isKeyCall A <code>boolean</code> indicating whether the iterator
     *                 is being created for a reference <code>key</code> or
     *                 <code>id</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public KeyIndexIterator getKeyIndexIterator(Object keyValue,
                                                boolean isKeyCall) {

    /**
     * Create a {@link KeyIndexIterator} that iterates over the nodes that
     * result from a reference to the XSLT <code>key</code> function or
     * XPath <code>id</code> function.
     *
     * @param keyValue A string or iterator representing the key values or id
     *                 references
     * @param isKeyCall A <code>boolean</code> indicating whether the iterator
     *                 is being created for a reference <code>key</code> or
     *                 <code>id</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public DTMAxisIterator cloneIterator() {

    /**
     * <p>Returns a deep copy of this iterator.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public boolean isReverse() {

    /**
     * <p>True if this iterator has a reversed axis.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int getStartNode() {

    /**
     * <p>Get start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public DTMAxisIterator setStartNode(int start) {

    /**
     * <p>Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void gotoMark() {

    /**
     * <p>Restores the current node remembered by setMark().</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void setMark() {

    /**
     * <p>Remembers the current node for the next call to gotoMark().</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int getPosition() {

    /**
     * <p>Returns the position of the current node in the set.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int getLast() {

    /**
     * <p>Returns the number of elements in this iterator.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public DTMAxisIterator reset() {

    /**
     * <p>Resets the iterator to the last start node.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int containsKey(int node, Object value) {

    /**
     * <p>Given a context node and the second argument to the XSLT
     * <code>key</code> function, checks whether the context node is in the
     * set of nodes that results from that reference to the <code>key</code>
     * function.  This is used in the implementation of key patterns.</p>
     * <p>This particular {@link KeyIndex} object is the result evaluating the
     * first argument to the <code>key</code> function, so it's not taken into
     * any further account.</p>
     *
     * @param node The context node
     * @param value The second argument to the <code>key</code> function
     * @return <code>1</code> if and only if the context node is in the set of
     *         nodes returned by the reference to the <code>key</code> function;
     *         <code>0</code>, otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int containsID(int node, Object value) {

    /**
     * Given a context node and the argument to the XPath <code>id</code>
     * function, checks whether the context node is in the set of nodes that
     * results from that reference to the <code>id</code> function.  This is
     * used in the implementation of <code>id</code> patterns.
     *
     * @param node The context node
     * @param value The argument to the <code>id</code> function
     * @return <code>1</code> if the context node is in the set of nodes
     *         returned by the reference to the <code>id</code> function;
     *         <code>0</code>, otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int next() {

    /**
     * <p>Callers should not call next() after it returns END.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void lookupKey(Object value) {

    /**
     * <p>This method must be called by the code generated by the key() function
     * prior to returning the node iterator.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public IntegerArray getDOMNodeById(String id) {

    /**
     * Return an IntegerArray for the DOM Node which has the given id.
     *
     * @param id The id
     * @return A IntegerArray representing the Node whose id is the given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void lookupId(Object value) {

    /**
     * This method must be called by the code generated by the id() function
     * prior to returning the node iterator. The lookup code for key() and
     * id() differ in the way the lookup value can be whitespace separated
     * list of tokens for the id() function, but a single string for the
     * key() function.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void merge(KeyIndex other) {

    /**
     * Merge the current value's nodeset set by lookupKey() with _nodes.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void add(String value, int node, int rootNode) {

    /**
     * Adds a node to the node list for a given value. Nodes will
     * always be added in document order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private int _markedPosition = 0;

    /**
     * Store position after call to setMark()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private DOM        _dom;

    /**
     * The XSLTC DOM object if this KeyIndex is being used to implement the
     * id() function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private IntegerArray _nodes = null;

    /**
     * The node set associated to the current value passed
     * to lookupKey();
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private Map<Integer, Map> _rootToIndexMap = new HashMap<>();

    /**
     * A mapping from a document node to the mapping between values and nodesets
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private int _currentDocumentNode = DTM.NULL;

    /**
     * The document node currently being processed.  Used only while building
     * keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private Map<String, IntegerArray> _index;

    /**
     * A mapping between values and nodesets for the current document.  Used
     * only while building keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
public class KeyIndex extends DTMAxisIteratorBase {

/**
 * Stores mappings of key values or IDs to DTM nodes.
 * <em>Use of an instance of this class as a {@link DTMAxisIterator} is
 * <b>deprecated.</b></em>
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public int getNodeByPosition(int position) {

        /**
         * Return the node at the given position.
         *
         * @param position The position
         * @return The node at the given position.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public int getLast() {

        /**
         * Returns the number of nodes in this iterator.
         *
         * @return the number of nodes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        protected void init() {

        /**
         * Evaluate the reference to the <code>key</code> or <code>id</code>
         * function with the context specified by {@link #setStartNode(int)}
         * and set up this iterator to iterate over the DTM nodes that are
         * to be returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public DTMAxisIterator reset() {

        /**
         * Resets the iterator to the last start node.
         *
         * @return A DTMAxisIterator, which may or may not be the same as this
         *         iterator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set context node for the iterator.  This will cause the iterator
         * to reset itself, reevaluate arguments to the function, look up
         * nodes in the input and reinitialize its internal heap.
         *
         * @param node the context node
         * @return A {@link DTMAxisIterator} set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        protected IntegerArray lookupNodes(int root, String keyValue) {

        /**
         * Retrieve nodes for a particular key value or a particular id
         * argument value.
         *
         * @param root The root node of the document containing the context node
         * @param keyValue The key value of id string argument value
         * @return an {@link IntegerArray} of the resulting nodes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        KeyIndexIterator(DTMAxisIterator keyValues, boolean isKeyIterator) {

        /**
         * Constructor used when the argument to <code>key</code> or
         * <code>id</code> is a node set.
         *
         * @param keyValues the argument to <code>key</code> or <code>id</code>
         * @param isKeyIterator indicates whether the constructed iterator
         *                represents a reference to <code>key</code> or
         *                <code>id</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        KeyIndexIterator(String keyValue, boolean isKeyIterator) {

        /**
         * Constructor used when the argument to <code>key</code> or
         * <code>id</code> is not a node set.
         *
         * @param keyValue the argument to <code>key</code> or <code>id</code>
         *                 cast to a <code>String</code>
         * @param isKeyIterator indicates whether the constructed iterator
         *                represents a reference to <code>key</code> or
         *                <code>id</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public HeapNode reset() {

            /**
             * Reset the heap node back to its beginning.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public HeapNode setStartNode(int node) {

            /**
             * <p>Sets context with respect to which this heap node is
             * evaluated.</p>
             * <p>This has no real effect on this kind of heap node.  Instead,
             * the {@link KeyIndexIterator#setStartNode(int)} method should
             * create new instances of this class to represent the effect of
             * changing the context.</p>
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public boolean isLessThan(HeapNode heapNode) {

            /**
             * Performs a comparison of the two heap nodes
             *
             * @param heapNode the heap node against which to compare
             * @return <code>true</code> if and only if the current node for
             *         this heap node is before the current node of the
             *         argument heap node in document order.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public void gotoMark() {

            /**
             * Restores the current node remembered by {@link #setMark()}.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public void setMark() {

            /**
             * Remembers the current node for the next call to
             * {@link #gotoMark()}.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public HeapNode cloneHeapNode() {

            /**
             * Creates a deep copy of this {@link HeapNode}.  The clone is not
             * reset from the current position of the original.
             *
             * @return the cloned heap node
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            public int step() {

            /**
             * Advance to the next node represented by this {@link HeapNode}
             *
             * @return the next DTM node.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            KeyIndexHeapNode(IntegerArray nodes) {

            /**
             * Create a heap node representing DTM nodes retrieved for one
             * key value in a reference to the <code>key</code> function
             * or string argument to the <code>id</code> function.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            private int _markPosition = -1;

            /**
             * Marked position.  Used by {@link #setMark()} and
             * {@link #gotoMark()}
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            private int _position = 0;

            /**
             * Position in {@link #_nodes} array of next node to return from
             * this heap node.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
            private IntegerArray _nodes;

            /**
             * {@link IntegerArray} of DTM nodes retrieved for one key value.
             * Must contain no duplicates and be stored in document order.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        protected class KeyIndexHeapNode

        /**
         * Represents the DTM nodes retrieved for one key value or one string
         * argument to <code>id</code> for use as one heap node in a
         * {@link MultiValuedNodeHeapIterator}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private boolean _isKeyIterator;

        /**
         * Indicates whether this object represents the result of a reference
         * to the <code>key</code> function (<code>true</code>) or the
         * <code>id</code> function (<code>false</code>).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private String _keyValue;

        /**
         * <p>This field contains the iterator representing a non-node-set key
         * value argument to the <code>key</code> function or a non-node-set
         * argument to the <code>id</code> function.</p>
         *
         * <p>Exactly one of this field and {@link #_keyValueIterator} must be
         * <code>null</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private DTMAxisIterator _keyValueIterator;

        /**
         * <p>This field contains the iterator representing a node set key value
         * argument to the <code>key</code> function or a node set argument
         * to the <code>id</code> function.</p>
         *
         * <p>Exactly one of this field and {@link #_keyValue} must be
         * <code>null</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
        private IntegerArray _nodes;

        /**
         * <p>A reference to the <code>key</code> function that only has one
         * key value or to the <code>id</code> function that has only one string
         * argument can be optimized to ignore the multi-valued heap.  This
         * field will be <code>null</code> otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public class KeyIndexIterator extends MultiValuedNodeHeapIterator {

    /**
     * An iterator representing the result of a reference to either the
     * XSLT <code>key</code> function or the XPath <code>id</code> function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    final private static IntegerArray EMPTY_NODES = new IntegerArray(0);

    /**
     * Used to represent an empty node set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public KeyIndexIterator getKeyIndexIterator(DTMAxisIterator keyValue,
                                                boolean isKeyCall) {

    /**
     * Create a {@link KeyIndexIterator} that iterates over the nodes that
     * result from a reference to the XSLT <code>key</code> function or
     * XPath <code>id</code> function.
     *
     * @param keyValue An iterator representing the key values or id
     *                 references
     * @param isKeyCall A <code>boolean</code> indicating whether the iterator
     *                 is being created for a reference <code>key</code> or
     *                 <code>id</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public KeyIndexIterator getKeyIndexIterator(String keyValue,
                                                boolean isKeyCall) {

    /**
     * Create a {@link KeyIndexIterator} that iterates over the nodes that
     * result from a reference to the XSLT <code>key</code> function or
     * XPath <code>id</code> function.
     *
     * @param keyValue A string representing the key values or id
     *                 references
     * @param isKeyCall A <code>boolean</code> indicating whether the iterator
     *                 is being created for a reference <code>key</code> or
     *                 <code>id</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public KeyIndexIterator getKeyIndexIterator(Object keyValue,
                                                boolean isKeyCall) {

    /**
     * Create a {@link KeyIndexIterator} that iterates over the nodes that
     * result from a reference to the XSLT <code>key</code> function or
     * XPath <code>id</code> function.
     *
     * @param keyValue A string or iterator representing the key values or id
     *                 references
     * @param isKeyCall A <code>boolean</code> indicating whether the iterator
     *                 is being created for a reference <code>key</code> or
     *                 <code>id</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public DTMAxisIterator cloneIterator() {

    /**
     * <p>Returns a deep copy of this iterator.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public boolean isReverse() {

    /**
     * <p>True if this iterator has a reversed axis.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int getStartNode() {

    /**
     * <p>Get start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public DTMAxisIterator setStartNode(int start) {

    /**
     * <p>Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void gotoMark() {

    /**
     * <p>Restores the current node remembered by setMark().</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void setMark() {

    /**
     * <p>Remembers the current node for the next call to gotoMark().</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int getPosition() {

    /**
     * <p>Returns the position of the current node in the set.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int getLast() {

    /**
     * <p>Returns the number of elements in this iterator.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public DTMAxisIterator reset() {

    /**
     * <p>Resets the iterator to the last start node.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int containsKey(int node, Object value) {

    /**
     * <p>Given a context node and the second argument to the XSLT
     * <code>key</code> function, checks whether the context node is in the
     * set of nodes that results from that reference to the <code>key</code>
     * function.  This is used in the implementation of key patterns.</p>
     * <p>This particular {@link KeyIndex} object is the result evaluating the
     * first argument to the <code>key</code> function, so it's not taken into
     * any further account.</p>
     *
     * @param node The context node
     * @param value The second argument to the <code>key</code> function
     * @return <code>1</code> if and only if the context node is in the set of
     *         nodes returned by the reference to the <code>key</code> function;
     *         <code>0</code>, otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int containsID(int node, Object value) {

    /**
     * Given a context node and the argument to the XPath <code>id</code>
     * function, checks whether the context node is in the set of nodes that
     * results from that reference to the <code>id</code> function.  This is
     * used in the implementation of <code>id</code> patterns.
     *
     * @param node The context node
     * @param value The argument to the <code>id</code> function
     * @return <code>1</code> if the context node is in the set of nodes
     *         returned by the reference to the <code>id</code> function;
     *         <code>0</code>, otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public int next() {

    /**
     * <p>Callers should not call next() after it returns END.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void lookupKey(Object value) {

    /**
     * <p>This method must be called by the code generated by the key() function
     * prior to returning the node iterator.</p>
     * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is
     * <b>deprecated.</b></em></p>
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public IntegerArray getDOMNodeById(String id) {

    /**
     * Return an IntegerArray for the DOM Node which has the given id.
     *
     * @param id The id
     * @return A IntegerArray representing the Node whose id is the given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void lookupId(Object value) {

    /**
     * This method must be called by the code generated by the id() function
     * prior to returning the node iterator. The lookup code for key() and
     * id() differ in the way the lookup value can be whitespace separated
     * list of tokens for the id() function, but a single string for the
     * key() function.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void merge(KeyIndex other) {

    /**
     * Merge the current value's nodeset set by lookupKey() with _nodes.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    public void add(String value, int node, int rootNode) {

    /**
     * Adds a node to the node list for a given value. Nodes will
     * always be added in document order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private int _markedPosition = 0;

    /**
     * Store position after call to setMark()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private DOM        _dom;

    /**
     * The XSLTC DOM object if this KeyIndex is being used to implement the
     * id() function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private IntegerArray _nodes = null;

    /**
     * The node set associated to the current value passed
     * to lookupKey();
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private Map<Integer, Map> _rootToIndexMap = new HashMap<>();

    /**
     * A mapping from a document node to the mapping between values and nodesets
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private int _currentDocumentNode = DTM.NULL;

    /**
     * The document node currently being processed.  Used only while building
     * keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
    private Map<String, IntegerArray> _index;

    /**
     * A mapping between values and nodesets for the current document.  Used
     * only while building keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex.java
public class KeyIndex extends DTMAxisIteratorBase {

/**
 * Stores mappings of key values or IDs to DTM nodes.
 * <em>Use of an instance of this class as a {@link DTMAxisIterator} is
 * <b>deprecated.</b></em>
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
