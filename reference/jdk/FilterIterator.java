_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
    private final boolean _isReverse;

    /**
     * A flag indicating if position is reversed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
    private final DTMFilter _filter;

    /**
     * Reference to a filter object that to be applied to each node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
    private DTMAxisIterator _source;

    /**
     * Reference to source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
public final class FilterIterator extends DTMAxisIteratorBase {

/**
 * Similar to a CurrentNodeListIterator except that the filter has a
 * simpler interface (only needs the node, no position, last, etc.)
 * It takes a source iterator and a Filter object and returns nodes
 * from the source after filtering them by calling filter.test(node).
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
    private final boolean _isReverse;

    /**
     * A flag indicating if position is reversed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
    private final DTMFilter _filter;

    /**
     * Reference to a filter object that to be applied to each node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
    private DTMAxisIterator _source;

    /**
     * Reference to source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/FilterIterator.java
public final class FilterIterator extends DTMAxisIteratorBase {

/**
 * Similar to a CurrentNodeListIterator except that the filter has a
 * simpler interface (only needs the node, no position, last, etc.)
 * It takes a source iterator and a Filter object and returns nodes
 * from the source after filtering them by calling filter.test(node).
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
