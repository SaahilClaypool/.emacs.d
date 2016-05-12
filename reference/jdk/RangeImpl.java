_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node getSelectedNode( Node container, int offset )

    /**
     * Utility method to retrieve a child node by index.  This method
     * assumes the caller is trying to find out which node is
     * selected by the given index.  Note that if the index is
     * greater than the number of children, this implies that the
     * first node selected is the parent node itself.
     *
     * @param container A container node
     *
     * @param offset    An offset within the container for which a selected node should
     *                  be computed.  If the offset is less than zero, or if the offset
     *                  is greater than the number of children, the container is returned.
     *
     * @return Returns either a child node of the container or the
     *         container itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    int indexOf(Node child, Node parent) {

    /** what is the index of the child in the parent */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    boolean isAncestorOf(Node a, Node b) {

    /** is a an ancestor of b ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private boolean isLegalContainedNode( Node node )

        /**
         * Returns true IFF the given node can be contained by
         * a range.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private boolean hasLegalRootContainer( Node node )

        /**
         * Finds the root container for the given node and determines
         * if that root container is legal with respect to the
         * DOM 2 specification.  At present, that means the root
         * container must be either an attribute, a document,
         * or a document fragment.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private boolean isLegalContainer( Node node )

        /**
         * Returns true IFF the given node can serve as a container
         * for a range's boundary points.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private Node getRootContainer( Node node )

        /**
         * Given a node, calculate what the Range's root container
         * for that node would be.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseTextNode( Node n, boolean isLeft, int how )

    /**
     * Utility method for traversing a text node that we know
     * a-priori to be on a left or right boundary of the range.
     * This method does not properly handle text nodes that contain
     * both the start and end points of the range.
     *
     * @param n      The node to be traversed.
     *
     * @param isLeft Is true if we are traversing the node as part of navigating
     *               the "left boundary" of the range.  If this value is false,
     *               it implies we are navigating the "right boundary" of the
     *               range.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traversePartiallySelected( Node n, int how )

    /**
     * Utility method for traversing a single node when
     * we know a-priori that the node if partially
     * selected and is not a text node.
     *
     * @param n      The node to be traversed.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseFullySelected( Node n, int how )

    /**
     * Utility method for traversing a single node when
     * we know a-priori that the node if fully
     * selected.
     *
     * @param n      The node to be traversed.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseNode( Node n, boolean isFullySelected, boolean isLeft, int how )

    /**
     * Utility method for traversing a single node.
     * Does not properly handle a text node containing both the
     * start and end offsets.  Such nodes should
     * have been previously detected and been routed to traverseTextNode.
     *
     * @param n      The node to be traversed.
     *
     * @param isFullySelected
     *               Set to true if the node is fully selected.  Should be
     *               false otherwise.
     *               Note that although the DOM 2 specification says that a
     *               text node that is boththe start and end container is not
     *               selected, we treat it here as if it were partially
     *               selected.
     *
     * @param isLeft Is true if we are traversing the node as part of navigating
     *               the "left boundary" of the range.  If this value is false,
     *               it implies we are navigating the "right boundary" of the
     *               range.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseLeftBoundary( Node root, int how )

    /**
     * Traverses the "left boundary" of this range and
     * operates on each "boundary node" according to the
     * <code>how</code> parameter.  It is a-priori assumed
     * by this method that the left boundary does
     * not contain the range's end container.
     * <p>
     * A "left boundary" is best visualized by thinking
     * of a sample tree:<pre>
     *
     *                 A
     *                /|\
     *               / | \
     *              /  |  \
     *             B   C   D
     *            /|\     /|\
     *           E F G   H I J
     * </pre>
     * Imagine first a range that begins between the
     * "E" and "F" nodes and ends between the
     * "I" and "J" nodes.  The start container is
     * "B" and the end container is "D".  Given this setup,
     * the following applies:
     * <p>
     * Partially Selected Nodes: B, D<br>
     * Fully Selected Nodes: F, G, C, H, I
     * <p>
     * The "left boundary" is the highest subtree node
     * that contains the starting container.  The root of
     * this subtree is always partially selected.
     * <p>
     * In this example, the nodes that are traversed
     * as "left boundary" nodes are: F, G, and B.
     *
     * @param root   The node that is the root of the "left boundary" subtree.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a node containing the boundaries content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               produced cloned content.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes within the boundary.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting nodes.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseRightBoundary( Node root, int how )

    /**
     * Traverses the "right boundary" of this range and
     * operates on each "boundary node" according to the
     * <code>how</code> parameter.  It is a-priori assumed
     * by this method that the right boundary does
     * not contain the range's start container.
     * <p>
     * A "right boundary" is best visualized by thinking
     * of a sample tree:<pre>
     *                 A
     *                /|\
     *               / | \
     *              /  |  \
     *             B   C   D
     *            /|\     /|\
     *           E F G   H I J
     * </pre>
     * Imagine first a range that begins between the
     * "E" and "F" nodes and ends between the
     * "I" and "J" nodes.  The start container is
     * "B" and the end container is "D".  Given this setup,
     * the following applies:
     * <p>
     * Partially Selected Nodes: B, D<br>
     * Fully Selected Nodes: F, G, C, H, I
     * <p>
     * The "right boundary" is the highest subtree node
     * that contains the ending container.  The root of
     * this subtree is always partially selected.
     * <p>
     * In this example, the nodes that are traversed
     * as "right boundary" nodes are: H, I, and D.
     *
     * @param root   The node that is the root of the "right boundary" subtree.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a node containing the boundaries content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               produced cloned content.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes within the boundary.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting nodes.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are not
     * the same, and we also know that neither the start
     * nor end container is an ancestor of the other.
     * This method is invoked by
     * the generic <code>traverse</code> method.
     *
     * @param startAncestor
     *               Given a common ancestor of the start and end containers,
     *               this parameter is the ancestor (or self) of the start
     *               container that is a direct child of the common ancestor.
     *
     * @param endAncestor
     *               Given a common ancestor of the start and end containers,
     *               this parameter is the ancestor (or self) of the end
     *               container that is a direct child of the common ancestor.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are not the
     * same, but the end container is an ancestor of the
     * start container. This method is invoked by the generic
     * <code>traverse</code> method.
     *
     * @param startAncestor
     *               The ancestor of the start container that is a direct
     *               child of the end container.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are not the
     * same, but the start container is an ancestor of the
     * end container. This method is invoked by the generic
     * <code>traverse</code> method.
     *
     * @param endAncestor
     *               The ancestor of the end container that is a direct child
     *               of the start container.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment traverseSameContainer( int how )

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are the same.
     * This method is invoked by the generic <code>traverse</code>
     * method.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment traverseContents( int how )

    /**
     * This is the master routine invoked to visit the nodes
     * selected by this range.  For each such node, different
     * actions are taken depending on the value of the
     * <code>how</code> argument.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void removeNode(Node node) {

    /** This function must be called by the DOM _BEFORE_
     *  a node is deleted, because at that time it is
     *  connected in the DOM tree, which we depend on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    Node fRemoveChild = null;

    /** This function is called within Range
     *  instead of Node.removeChild,
     *  so that the range can remember that it is actively
     *  removing this child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    public void insertedNodeFromDOM(Node node) {

    /** This function is called from the DOM.
     *  This node has already been inserted into the DOM.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveReplacedText(Node node) {

    /** This function is called from DOM.
     *  The  text has already beeen replaced.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveInsertedText(Node node, int index, int len) {

    /** This function is called from DOM.
     *  The  text has already beeen inserted.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void insertData(CharacterData node, int index, String insert) {

    /** This function inserts text into a Node and invokes
     *  a method to fix-up all other Ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveDeletedText(Node node, int offset, int count) {

    /** This function is called from DOM.
     *  The  text has already beeen inserted.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void deleteData(CharacterData node, int offset, int count) {

    /** This function inserts text into a Node and invokes
     *  a method to fix-up all other Ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveSplitData(Node node, Node newNode, int offset) {

    /** Fix up this Range if another Range has split a Text Node
     *  into 2 Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void signalSplitData(Node node, Node newNode, int offset) {

    /** Signal other Ranges to update their start/end
     *  containers/offsets. The data has already been split
     *  into the two Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    public RangeImpl(DocumentImpl document) {

    /** The constructor. Clients must use DocumentRange.createRange(),
     *  because it registers the Range with the document, so it can
     *  be fixed-up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
public class RangeImpl  implements Range {

/** The RangeImpl class implements the org.w3c.dom.range.Range interface.
 *  <p> Please see the API documentation for the interface classes
 *  and use the interfaces in your client programs.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node getSelectedNode( Node container, int offset )

    /**
     * Utility method to retrieve a child node by index.  This method
     * assumes the caller is trying to find out which node is
     * selected by the given index.  Note that if the index is
     * greater than the number of children, this implies that the
     * first node selected is the parent node itself.
     *
     * @param container A container node
     *
     * @param offset    An offset within the container for which a selected node should
     *                  be computed.  If the offset is less than zero, or if the offset
     *                  is greater than the number of children, the container is returned.
     *
     * @return Returns either a child node of the container or the
     *         container itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    int indexOf(Node child, Node parent) {

    /** what is the index of the child in the parent */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    boolean isAncestorOf(Node a, Node b) {

    /** is a an ancestor of b ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private boolean isLegalContainedNode( Node node )

        /**
         * Returns true IFF the given node can be contained by
         * a range.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private boolean hasLegalRootContainer( Node node )

        /**
         * Finds the root container for the given node and determines
         * if that root container is legal with respect to the
         * DOM 2 specification.  At present, that means the root
         * container must be either an attribute, a document,
         * or a document fragment.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private boolean isLegalContainer( Node node )

        /**
         * Returns true IFF the given node can serve as a container
         * for a range's boundary points.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
        private Node getRootContainer( Node node )

        /**
         * Given a node, calculate what the Range's root container
         * for that node would be.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseTextNode( Node n, boolean isLeft, int how )

    /**
     * Utility method for traversing a text node that we know
     * a-priori to be on a left or right boundary of the range.
     * This method does not properly handle text nodes that contain
     * both the start and end points of the range.
     *
     * @param n      The node to be traversed.
     *
     * @param isLeft Is true if we are traversing the node as part of navigating
     *               the "left boundary" of the range.  If this value is false,
     *               it implies we are navigating the "right boundary" of the
     *               range.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traversePartiallySelected( Node n, int how )

    /**
     * Utility method for traversing a single node when
     * we know a-priori that the node if partially
     * selected and is not a text node.
     *
     * @param n      The node to be traversed.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseFullySelected( Node n, int how )

    /**
     * Utility method for traversing a single node when
     * we know a-priori that the node if fully
     * selected.
     *
     * @param n      The node to be traversed.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseNode( Node n, boolean isFullySelected, boolean isLeft, int how )

    /**
     * Utility method for traversing a single node.
     * Does not properly handle a text node containing both the
     * start and end offsets.  Such nodes should
     * have been previously detected and been routed to traverseTextNode.
     *
     * @param n      The node to be traversed.
     *
     * @param isFullySelected
     *               Set to true if the node is fully selected.  Should be
     *               false otherwise.
     *               Note that although the DOM 2 specification says that a
     *               text node that is boththe start and end container is not
     *               selected, we treat it here as if it were partially
     *               selected.
     *
     * @param isLeft Is true if we are traversing the node as part of navigating
     *               the "left boundary" of the range.  If this value is false,
     *               it implies we are navigating the "right boundary" of the
     *               range.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will simply
     *               return the original node.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               return a cloned node.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete the
     *               node from it's parent, but will return null.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting the node.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseLeftBoundary( Node root, int how )

    /**
     * Traverses the "left boundary" of this range and
     * operates on each "boundary node" according to the
     * <code>how</code> parameter.  It is a-priori assumed
     * by this method that the left boundary does
     * not contain the range's end container.
     * <p>
     * A "left boundary" is best visualized by thinking
     * of a sample tree:<pre>
     *
     *                 A
     *                /|\
     *               / | \
     *              /  |  \
     *             B   C   D
     *            /|\     /|\
     *           E F G   H I J
     * </pre>
     * Imagine first a range that begins between the
     * "E" and "F" nodes and ends between the
     * "I" and "J" nodes.  The start container is
     * "B" and the end container is "D".  Given this setup,
     * the following applies:
     * <p>
     * Partially Selected Nodes: B, D<br>
     * Fully Selected Nodes: F, G, C, H, I
     * <p>
     * The "left boundary" is the highest subtree node
     * that contains the starting container.  The root of
     * this subtree is always partially selected.
     * <p>
     * In this example, the nodes that are traversed
     * as "left boundary" nodes are: F, G, and B.
     *
     * @param root   The node that is the root of the "left boundary" subtree.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a node containing the boundaries content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               produced cloned content.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes within the boundary.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting nodes.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private Node traverseRightBoundary( Node root, int how )

    /**
     * Traverses the "right boundary" of this range and
     * operates on each "boundary node" according to the
     * <code>how</code> parameter.  It is a-priori assumed
     * by this method that the right boundary does
     * not contain the range's start container.
     * <p>
     * A "right boundary" is best visualized by thinking
     * of a sample tree:<pre>
     *                 A
     *                /|\
     *               / | \
     *              /  |  \
     *             B   C   D
     *            /|\     /|\
     *           E F G   H I J
     * </pre>
     * Imagine first a range that begins between the
     * "E" and "F" nodes and ends between the
     * "I" and "J" nodes.  The start container is
     * "B" and the end container is "D".  Given this setup,
     * the following applies:
     * <p>
     * Partially Selected Nodes: B, D<br>
     * Fully Selected Nodes: F, G, C, H, I
     * <p>
     * The "right boundary" is the highest subtree node
     * that contains the ending container.  The root of
     * this subtree is always partially selected.
     * <p>
     * In this example, the nodes that are traversed
     * as "right boundary" nodes are: H, I, and D.
     *
     * @param root   The node that is the root of the "right boundary" subtree.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a node containing the boundaries content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but will
     *               produced cloned content.
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes within the boundary.
     *               </ol>
     *
     * @return Returns a node that is the result of visiting nodes.
     *         If the traversal operation is
     *         <code>DELETE_CONTENTS</code> the return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are not
     * the same, and we also know that neither the start
     * nor end container is an ancestor of the other.
     * This method is invoked by
     * the generic <code>traverse</code> method.
     *
     * @param startAncestor
     *               Given a common ancestor of the start and end containers,
     *               this parameter is the ancestor (or self) of the start
     *               container that is a direct child of the common ancestor.
     *
     * @param endAncestor
     *               Given a common ancestor of the start and end containers,
     *               this parameter is the ancestor (or self) of the end
     *               container that is a direct child of the common ancestor.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are not the
     * same, but the end container is an ancestor of the
     * start container. This method is invoked by the generic
     * <code>traverse</code> method.
     *
     * @param startAncestor
     *               The ancestor of the start container that is a direct
     *               child of the end container.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are not the
     * same, but the start container is an ancestor of the
     * end container. This method is invoked by the generic
     * <code>traverse</code> method.
     *
     * @param endAncestor
     *               The ancestor of the end container that is a direct child
     *               of the start container.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment traverseSameContainer( int how )

    /**
     * Visits the nodes selected by this range when we know
     * a-priori that the start and end containers are the same.
     * This method is invoked by the generic <code>traverse</code>
     * method.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    private DocumentFragment traverseContents( int how )

    /**
     * This is the master routine invoked to visit the nodes
     * selected by this range.  For each such node, different
     * actions are taken depending on the value of the
     * <code>how</code> argument.
     *
     * @param how    Specifies what type of traversal is being
     *               requested (extract, clone, or delete).
     *               Legal values for this argument are:
     *
     *               <ol>
     *               <li><code>EXTRACT_CONTENTS</code> - will produce
     *               a document fragment containing the range's content.
     *               Partially selected nodes are copied, but fully
     *               selected nodes are moved.
     *
     *               <li><code>CLONE_CONTENTS</code> - will leave the
     *               context tree of the range undisturbed, but sill
     *               produced cloned content in a document fragment
     *
     *               <li><code>DELETE_CONTENTS</code> - will delete from
     *               the context tree of the range, all fully selected
     *               nodes.
     *               </ol>
     *
     * @return Returns a document fragment containing any
     *         copied or extracted nodes.  If the <code>how</code>
     *         parameter was <code>DELETE_CONTENTS</code>, the
     *         return value is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void removeNode(Node node) {

    /** This function must be called by the DOM _BEFORE_
     *  a node is deleted, because at that time it is
     *  connected in the DOM tree, which we depend on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    Node fRemoveChild = null;

    /** This function is called within Range
     *  instead of Node.removeChild,
     *  so that the range can remember that it is actively
     *  removing this child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    public void insertedNodeFromDOM(Node node) {

    /** This function is called from the DOM.
     *  This node has already been inserted into the DOM.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveReplacedText(Node node) {

    /** This function is called from DOM.
     *  The  text has already beeen replaced.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveInsertedText(Node node, int index, int len) {

    /** This function is called from DOM.
     *  The  text has already beeen inserted.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void insertData(CharacterData node, int index, String insert) {

    /** This function inserts text into a Node and invokes
     *  a method to fix-up all other Ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveDeletedText(Node node, int offset, int count) {

    /** This function is called from DOM.
     *  The  text has already beeen inserted.
     *  Fix-up any offsets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void deleteData(CharacterData node, int offset, int count) {

    /** This function inserts text into a Node and invokes
     *  a method to fix-up all other Ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void receiveSplitData(Node node, Node newNode, int offset) {

    /** Fix up this Range if another Range has split a Text Node
     *  into 2 Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    void signalSplitData(Node node, Node newNode, int offset) {

    /** Signal other Ranges to update their start/end
     *  containers/offsets. The data has already been split
     *  into the two Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
    public RangeImpl(DocumentImpl document) {

    /** The constructor. Clients must use DocumentRange.createRange(),
     *  because it registers the Range with the document, so it can
     *  be fixed-up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/RangeImpl.java
public class RangeImpl  implements Range {

/** The RangeImpl class implements the org.w3c.dom.range.Range interface.
 *  <p> Please see the API documentation for the interface classes
 *  and use the interfaces in your client programs.
 *
 * @xerces.internal
 *
 */
