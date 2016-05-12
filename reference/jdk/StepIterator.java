_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
    private int _pos = -1;

    /**
     * Temp variable to store a marked position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
    protected DTMAxisIterator _iterator;

    /**
     * A reference to the "inner" iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
    protected DTMAxisIterator _source;

    /**
     * A reference to the "outer" iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
public class StepIterator extends DTMAxisIteratorBase {

/**
 * A step iterator is used to evaluate expressions like "BOOK/TITLE".
 * A better name for this iterator would have been ParentIterator since
 * both "BOOK" and "TITLE" are steps in XPath lingo. Step iterators are
 * constructed from two other iterators which we are going to refer to
 * as "outer" and "inner". Every node from the outer iterator (the one
 * for BOOK in our example) is used to initialize the inner iterator.
 * After this initialization, every node from the inner iterator is
 * returned (in essence, implementing a "nested loop").
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
    private int _pos = -1;

    /**
     * Temp variable to store a marked position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
    protected DTMAxisIterator _iterator;

    /**
     * A reference to the "inner" iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
    protected DTMAxisIterator _source;

    /**
     * A reference to the "outer" iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/StepIterator.java
public class StepIterator extends DTMAxisIteratorBase {

/**
 * A step iterator is used to evaluate expressions like "BOOK/TITLE".
 * A better name for this iterator would have been ParentIterator since
 * both "BOOK" and "TITLE" are steps in XPath lingo. Step iterators are
 * constructed from two other iterators which we are going to refer to
 * as "outer" and "inner". Every node from the outer iterator (the one
 * for BOOK in our example) is used to initialize the inner iterator.
 * After this initialization, every node from the inner iterator is
 * returned (in essence, implementing a "nested loop").
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author Morten Jorgensen
 */
