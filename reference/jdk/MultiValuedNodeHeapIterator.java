_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract HeapNode reset();

        /**
         * Reset the heap node back to its beginning.
         *
         * @return a {@link HeapNode} which may or may not be the same as
         *         this <code>HeapNode</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract HeapNode setStartNode(int node);

        /**
         * Sets context with respect to which this heap node is evaluated.
         *
         * @param node The new context node
         * @return a {@link HeapNode} which may or may not be the same as
         *         this <code>HeapNode</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract boolean isLessThan(HeapNode heapNode);

        /**
         * Performs a comparison of the two heap nodes
         *
         * @param heapNode the heap node against which to compare
         * @return <code>true</code> if and only if the current node for this
         *         heap node is before the current node of the argument heap
         *         node in document order.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public void gotoMark() {

        /**
         * Restores the current node remembered by {@link #setMark()}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public void setMark() {

        /**
         * Remembers the current node for the next call to {@link #gotoMark()}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public HeapNode cloneHeapNode() {

        /**
         * Creates a deep copy of this {@link HeapNode}.  The clone is not
         * reset from the current position of the original.
         *
         * @return the cloned heap node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract int step();

        /**
         * Advance to the next node represented by this {@link HeapNode}
         *
         * @return the next DTM node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
    public abstract class HeapNode implements Cloneable {

    /**
     * An abstract representation of a set of nodes that will be retrieved in
     * document order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
public abstract class MultiValuedNodeHeapIterator extends DTMAxisIteratorBase {

/**
 * <p><code>MultiValuedNodeHeapIterator</code> takes a set of multi-valued
 * heap nodes and produces a merged NodeSet in document order with duplicates
 * removed.</p>
 * <p>Each multi-valued heap node (which might be a
 * {@link org.apache.xml.dtm.DTMAxisIterator}, but that's  not necessary)
 * generates DTM node handles in document order.  The class
 * maintains the multi-valued heap nodes in a heap, not surprisingly, sorted by
 * the next DTM node handle available form the heap node.</p>
 * <p>After a DTM node is pulled from the heap node that's at the top of the
 * heap, the heap node is advanced to the next DTM node handle it makes
 * available, and the heap nature of the heap is restored to ensure the next
 * DTM node handle pulled is next in document order overall.
 *
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract HeapNode reset();

        /**
         * Reset the heap node back to its beginning.
         *
         * @return a {@link HeapNode} which may or may not be the same as
         *         this <code>HeapNode</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract HeapNode setStartNode(int node);

        /**
         * Sets context with respect to which this heap node is evaluated.
         *
         * @param node The new context node
         * @return a {@link HeapNode} which may or may not be the same as
         *         this <code>HeapNode</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract boolean isLessThan(HeapNode heapNode);

        /**
         * Performs a comparison of the two heap nodes
         *
         * @param heapNode the heap node against which to compare
         * @return <code>true</code> if and only if the current node for this
         *         heap node is before the current node of the argument heap
         *         node in document order.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public void gotoMark() {

        /**
         * Restores the current node remembered by {@link #setMark()}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public void setMark() {

        /**
         * Remembers the current node for the next call to {@link #gotoMark()}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public HeapNode cloneHeapNode() {

        /**
         * Creates a deep copy of this {@link HeapNode}.  The clone is not
         * reset from the current position of the original.
         *
         * @return the cloned heap node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
        public abstract int step();

        /**
         * Advance to the next node represented by this {@link HeapNode}
         *
         * @return the next DTM node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
    public abstract class HeapNode implements Cloneable {

    /**
     * An abstract representation of a set of nodes that will be retrieved in
     * document order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MultiValuedNodeHeapIterator.java
public abstract class MultiValuedNodeHeapIterator extends DTMAxisIteratorBase {

/**
 * <p><code>MultiValuedNodeHeapIterator</code> takes a set of multi-valued
 * heap nodes and produces a merged NodeSet in document order with duplicates
 * removed.</p>
 * <p>Each multi-valued heap node (which might be a
 * {@link org.apache.xml.dtm.DTMAxisIterator}, but that's  not necessary)
 * generates DTM node handles in document order.  The class
 * maintains the multi-valued heap nodes in a heap, not surprisingly, sorted by
 * the next DTM node handle available form the heap node.</p>
 * <p>After a DTM node is pulled from the heap node that's at the top of the
 * heap, the heap node is advanced to the next DTM node handle it makes
 * available, and the heap nature of the heap is restored to ensure the next
 * DTM node handle pulled is next in document order overall.
 *
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
