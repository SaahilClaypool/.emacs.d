_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public void setRestartable(boolean isRestartable);

    /**
     * Prevents or allows iterator restarts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public NodeIterator cloneIterator();

    /**
     * Returns a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public boolean isReverse();

    /**
     * True if this iterator has a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public NodeIterator setStartNode(int node);

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public void gotoMark();

    /**
     * Restores the current node remembered by setMark().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public void setMark();

    /**
     * Remembers the current node for the next call to gotoMark().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public int getPosition();

    /**
     * Returns the position of the current node in the set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public int getLast();

    /**
     * Returns the number of elements in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public NodeIterator reset();

    /**
     * Resets the iterator to the last start node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public int next();

    /**
     * Callers should not call next() after it returns END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
public interface NodeIterator extends Cloneable {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public void setRestartable(boolean isRestartable);

    /**
     * Prevents or allows iterator restarts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public NodeIterator cloneIterator();

    /**
     * Returns a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public boolean isReverse();

    /**
     * True if this iterator has a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public NodeIterator setStartNode(int node);

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public void gotoMark();

    /**
     * Restores the current node remembered by setMark().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public void setMark();

    /**
     * Remembers the current node for the next call to gotoMark().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public int getPosition();

    /**
     * Returns the position of the current node in the set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public int getLast();

    /**
     * Returns the number of elements in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public NodeIterator reset();

    /**
     * Resets the iterator to the last start node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
    public int next();

    /**
     * Callers should not call next() after it returns END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/NodeIterator.java
public interface NodeIterator extends Cloneable {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeIterator.java
    public void detach();

    /**
     * Detaches the <code>NodeIterator</code> from the set which it iterated
     * over, releasing any computational resources and placing the
     * <code>NodeIterator</code> in the INVALID state. After
     * <code>detach</code> has been invoked, calls to <code>nextNode</code>
     * or <code>previousNode</code> will raise the exception
     * INVALID_STATE_ERR.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeIterator.java
    public Node previousNode()

    /**
     * Returns the previous node in the set and moves the position of the
     * <code>NodeIterator</code> backwards in the set.
     * @return The previous <code>Node</code> in the set being iterated over,
     *   or <code>null</code> if there are no more members in that set.
     * @exception DOMException
     *   INVALID_STATE_ERR: Raised if this method is called after the
     *   <code>detach</code> method was invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeIterator.java
    public Node nextNode()

    /**
     * Returns the next node in the set and advances the position of the
     * <code>NodeIterator</code> in the set. After a
     * <code>NodeIterator</code> is created, the first call to
     * <code>nextNode()</code> returns the first node in the set.
     * @return The next <code>Node</code> in the set being iterated over, or
     *   <code>null</code> if there are no more members in that set.
     * @exception DOMException
     *   INVALID_STATE_ERR: Raised if this method is called after the
     *   <code>detach</code> method was invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeIterator.java
    public boolean getExpandEntityReferences();

    /**
     *  The value of this flag determines whether the children of entity
     * reference nodes are visible to the <code>NodeIterator</code>. If
     * false, these children  and their descendants will be rejected. Note
     * that this rejection takes precedence over <code>whatToShow</code> and
     * the filter. Also note that this is currently the only situation where
     * <code>NodeIterators</code> may reject a complete subtree rather than
     * skipping individual nodes.
     * <br>
     * <br> To produce a view of the document that has entity references
     * expanded and does not expose the entity reference node itself, use
     * the <code>whatToShow</code> flags to hide the entity reference node
     * and set <code>expandEntityReferences</code> to true when creating the
     * <code>NodeIterator</code>. To produce a view of the document that has
     * entity reference nodes but no entity expansion, use the
     * <code>whatToShow</code> flags to show the entity reference node and
     * set <code>expandEntityReferences</code> to false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeIterator.java
    public NodeFilter getFilter();

    /**
     * The <code>NodeFilter</code> used to screen nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeIterator.java
    public int getWhatToShow();

    /**
     * This attribute determines which node types are presented via the
     * <code>NodeIterator</code>. The available set of constants is defined
     * in the <code>NodeFilter</code> interface.  Nodes not accepted by
     * <code>whatToShow</code> will be skipped, but their children may still
     * be considered. Note that this skip takes precedence over the filter,
     * if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeIterator.java
public interface NodeIterator {

/**
 * <code>NodeIterators</code> are used to step through a set of nodes, e.g.
 * the set of nodes in a <code>NodeList</code>, the document subtree
 * governed by a particular <code>Node</code>, the results of a query, or
 * any other set of nodes. The set of nodes to be iterated is determined by
 * the implementation of the <code>NodeIterator</code>. DOM Level 2
 * specifies a single <code>NodeIterator</code> implementation for
 * document-order traversal of a document subtree. Instances of these
 * <code>NodeIterators</code> are created by calling
 * <code>DocumentTraversal</code><code>.createNodeIterator()</code>.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113'>Document Object Model (DOM) Level 2 Traversal and Range Specification</a>.
 * @since DOM Level 2
 */
