_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MatchingIterator.java
    private final int _match;

    /**
     * The node to match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MatchingIterator.java
    private DTMAxisIterator _source;

    /**
     * A reference to a source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MatchingIterator.java
public final class MatchingIterator extends DTMAxisIteratorBase {

/**
 * This is a special kind of iterator that takes a source iterator and a
 * node N. If initialized with a node M (the parent of N) it computes the
 * position of N amongst the children of M. This position can be obtained
 * by calling getPosition().
 * It is an iterator even though next() will never be called. It is used to
 * match patterns with a single predicate like:
 *
 *    BOOK[position() = last()]
 *
 * In this example, the source iterator will return elements of type BOOK,
 * a call to position() will return the position of N. Notice that because
 * of the way the pattern matching is implemented, N will always be a node
 * in the source since (i) it is a BOOK or the test sequence would not be
 * considered and (ii) the source iterator is initialized with M which is
 * the parent of N. Also, and still in this example, a call to last() will
 * return the number of elements in the source (i.e. the number of BOOKs).
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MatchingIterator.java
    private final int _match;

    /**
     * The node to match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MatchingIterator.java
    private DTMAxisIterator _source;

    /**
     * A reference to a source iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/MatchingIterator.java
public final class MatchingIterator extends DTMAxisIteratorBase {

/**
 * This is a special kind of iterator that takes a source iterator and a
 * node N. If initialized with a node M (the parent of N) it computes the
 * position of N amongst the children of M. This position can be obtained
 * by calling getPosition().
 * It is an iterator even though next() will never be called. It is used to
 * match patterns with a single predicate like:
 *
 *    BOOK[position() = last()]
 *
 * In this example, the source iterator will return elements of type BOOK,
 * a call to position() will return the position of N. Notice that because
 * of the way the pattern matching is implemented, N will always be a node
 * in the source since (i) it is a BOOK or the test sequence would not be
 * considered and (ii) the source iterator is initialized with M which is
 * the parent of N. Also, and still in this example, a call to last() will
 * return the number of elements in the source (i.e. the number of BOOKs).
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
