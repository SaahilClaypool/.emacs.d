_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected final NodeIterator resetPosition() {

    /**
     * Reset the position in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected final int returnNode(final int node) {

    /**
     * Utility method that increments position and returns its
     * argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public NodeIterator cloneIterator() {

    /**
     * Clones and resets this iterator. Note that the cloned iterator is
     * not restartable. This is because cloning is needed for variable
     * references, and the context node of the original variable
     * declaration must be preserved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public boolean isReverse() {

    /**
     * Indicates if position in this iterator is computed in reverse
     * document order. Note that nodes are always returned in document
     * order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public int getPosition() {

    /**
     * Returns the position() in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public int getLast() {

    /**
     * Default implementation of getLast(). Stores current position
     * and current node, resets the iterator, counts all nodes and
     * restores iterator to original state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public NodeIterator includeSelf() {

    /**
     * Setter for _includeSelf flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public NodeIterator reset() {

    /**
     * Reset this iterator using state from last call to
     * setStartNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    abstract public NodeIterator setStartNode(int node);

    /**
     * Initialize iterator using a node. If iterator is not
     * restartable, then do nothing. If node is equal to END then
     * subsequent calls to next() must return END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public void setRestartable(boolean isRestartable) {

    /**
     * Setter for _isRestartable flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected boolean _isRestartable = true;

    /**
     * Flag indicating if iterator can be restarted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected boolean _includeSelf = false;

    /**
     * Flag indicating if "self" should be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _startNode = NodeIterator.END;

    /**
     * Store node in call to setStartNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _markedNode;

    /**
     * Store node in call to setMark().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _position = 0;

    /**
     * Value of position() in this iterator. Incremented in
     * returnNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _last = -1;

    /**
     * Cached computed value of last().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
public abstract class NodeIteratorBase implements NodeIterator {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected final NodeIterator resetPosition() {

    /**
     * Reset the position in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected final int returnNode(final int node) {

    /**
     * Utility method that increments position and returns its
     * argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public NodeIterator cloneIterator() {

    /**
     * Clones and resets this iterator. Note that the cloned iterator is
     * not restartable. This is because cloning is needed for variable
     * references, and the context node of the original variable
     * declaration must be preserved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public boolean isReverse() {

    /**
     * Indicates if position in this iterator is computed in reverse
     * document order. Note that nodes are always returned in document
     * order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public int getPosition() {

    /**
     * Returns the position() in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public int getLast() {

    /**
     * Default implementation of getLast(). Stores current position
     * and current node, resets the iterator, counts all nodes and
     * restores iterator to original state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public NodeIterator includeSelf() {

    /**
     * Setter for _includeSelf flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public NodeIterator reset() {

    /**
     * Reset this iterator using state from last call to
     * setStartNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    abstract public NodeIterator setStartNode(int node);

    /**
     * Initialize iterator using a node. If iterator is not
     * restartable, then do nothing. If node is equal to END then
     * subsequent calls to next() must return END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    public void setRestartable(boolean isRestartable) {

    /**
     * Setter for _isRestartable flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected boolean _isRestartable = true;

    /**
     * Flag indicating if iterator can be restarted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected boolean _includeSelf = false;

    /**
     * Flag indicating if "self" should be returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _startNode = NodeIterator.END;

    /**
     * Store node in call to setStartNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _markedNode;

    /**
     * Store node in call to setMark().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _position = 0;

    /**
     * Value of position() in this iterator. Incremented in
     * returnNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
    protected int _last = -1;

    /**
     * Cached computed value of last().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeIteratorBase.java
public abstract class NodeIteratorBase implements NodeIterator {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
