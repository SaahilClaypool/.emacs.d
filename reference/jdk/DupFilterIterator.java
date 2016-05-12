_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    public DTMAxisIterator setStartNode(int node) {

    /**
     * Set the start node for this iterator
     * @param node The start node
     * @return A reference to this node iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _markedLastNext = END;

    /**
     * Temporary variable to store _lastNext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _lastNext = END;

    /**
     * Last value returned by next().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _nodesSize = 0;

    /**
     * Cardinality of _nodes array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _current = 0;

    /**
     * Index in _nodes array to current node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private IntegerArray _nodes = new IntegerArray();

    /**
     * Array to cache all nodes from source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private DTMAxisIterator _source;

    /**
     * Reference to source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
public final class DupFilterIterator extends DTMAxisIteratorBase {

/**
 * Removes duplicates and sorts a source iterator. The nodes from the
 * source are collected in an array upon calling setStartNode(). This
 * array is later sorted and duplicates are ignored in next().
 * @author G. Todd Miller
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    public DTMAxisIterator setStartNode(int node) {

    /**
     * Set the start node for this iterator
     * @param node The start node
     * @return A reference to this node iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _markedLastNext = END;

    /**
     * Temporary variable to store _lastNext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _lastNext = END;

    /**
     * Last value returned by next().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _nodesSize = 0;

    /**
     * Cardinality of _nodes array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private int _current = 0;

    /**
     * Index in _nodes array to current node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private IntegerArray _nodes = new IntegerArray();

    /**
     * Array to cache all nodes from source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
    private DTMAxisIterator _source;

    /**
     * Reference to source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DupFilterIterator.java
public final class DupFilterIterator extends DTMAxisIteratorBase {

/**
 * Removes duplicates and sorts a source iterator. The nodes from the
 * source are collected in an array upon calling setStartNode(). This
 * array is later sorted and duplicates are ignored in next().
 * @author G. Todd Miller
 */
