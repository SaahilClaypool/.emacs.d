_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private AbstractTranslet _translet;

    /**
     * A reference to the translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private final int _currentNode;

    /**
     * The current node in the stylesheet at the time of evaluation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private int _currentIndex;

    /**
     * Index in _nodes of the next node to filter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private IntegerArray _nodes = new IntegerArray();

    /**
     * An integer array to store nodes from source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private final CurrentNodeListFilter _filter;

    /**
     * A reference to a filter object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private DTMAxisIterator _source;

    /**
     * The source for this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
public final class CurrentNodeListIterator extends DTMAxisIteratorBase {

/**
 * Iterators of this kind use a CurrentNodeListFilter to filter a subset of
 * nodes from a source iterator. For each node from the source, the boolean
 * method CurrentNodeListFilter.test() is called.
 *
 * All nodes from the source are read into an array upon calling setStartNode()
 * (this is needed to determine the value of last, a parameter to
 * CurrentNodeListFilter.test()). The method getLast() returns the last element
 * after applying the filter.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private AbstractTranslet _translet;

    /**
     * A reference to the translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private final int _currentNode;

    /**
     * The current node in the stylesheet at the time of evaluation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private int _currentIndex;

    /**
     * Index in _nodes of the next node to filter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private IntegerArray _nodes = new IntegerArray();

    /**
     * An integer array to store nodes from source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private final CurrentNodeListFilter _filter;

    /**
     * A reference to a filter object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
    private DTMAxisIterator _source;

    /**
     * The source for this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator.java
public final class CurrentNodeListIterator extends DTMAxisIteratorBase {

/**
 * Iterators of this kind use a CurrentNodeListFilter to filter a subset of
 * nodes from a source iterator. For each node from the source, the boolean
 * method CurrentNodeListFilter.test() is called.
 *
 * All nodes from the source are read into an array upon calling setStartNode()
 * (this is needed to determine the value of last, a parameter to
 * CurrentNodeListFilter.test()). The method getLast() returns the last element
 * after applying the filter.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
