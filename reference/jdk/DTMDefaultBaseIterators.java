_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedSingletonIterator(int nodeType)

    /**
     * Constructor TypedSingletonIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedSingletonIterator extends SingletonIterator

  /**
   * Iterator that returns a given node only if it is of a given type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public SingletonIterator(int node, boolean constant)

    /**
     * Constructor SingletonIterator
     *
     *
     * @param node the node handle to return.
     * @param constant (Not sure what this is yet.  -sb)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public SingletonIterator(int node)

    /**
     * Constructor SingletonIterator
     *
     *
     * @param node The node handle to return.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public SingletonIterator()

    /**
     * Constructor SingletonIterator
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private boolean _isConstant;

    /** (not sure yet what this is.  -sb)  (sc & sb remove final to compile in JDK 1.1.8) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class SingletonIterator extends InternalAxisIteratorBase

  /**
   * Class SingletonIterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NthDescendantIterator(int pos)

    /**
     * Constructor NthDescendantIterator
     *
     *
     * @param pos The nth position being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    int _pos;

    /** The current nth position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class NthDescendantIterator extends DescendantIterator

  /**
   * Iterator that returns the descendants of a given node.
   * I'm not exactly clear about this one... -sb
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedDescendantIterator(int nodeType)

    /**
     * Constructor TypedDescendantIterator
     *
     *
     * @param nodeType Extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedDescendantIterator extends DescendantIterator

  /**
   * Typed iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMAxisIterator reset()

    /**
     * Reset.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected boolean isDescendant(int identity)

    /**
     * Tell if this node identity is a descendant.  Assumes that
     * the node info for the element has already been obtained.
     *
     * This one-sided test works only if the parent has been
     * previously tested and is known to be a descendent. It fails if
     * the parent is the _startNode's next sibling, or indeed any node
     * that follows _startNode in document order.  That may suffice
     * for this iterator, but it's not really an isDescendent() test.
     * %REVIEW% rename?
     *
     * @param identity The index number of the node in question.
     * @return true if the index is a descendant of _startNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class DescendantIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedAncestorIterator(int type)

    /**
     * Constructor TypedAncestorIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedAncestorIterator extends AncestorIterator

  /**
   * Typed iterator that returns the ancestors of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.  The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public final boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int getStartNode()

    /**
     * Get start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @return The root node of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    int m_realStartNode;

    /** The real start node for this axes, since _startNode will be adjusted. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class AncestorIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the ancestors of a given node in document
   * order.  (NOTE!  This was changed from the XSLTC code!)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedFollowingIterator(int type)

    /**
     * Constructor TypedFollowingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedFollowingIterator extends FollowingIterator

  /**
   * Iterator that returns following nodes of a given type for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class FollowingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns following nodes of for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedPrecedingIterator(int type)

    /**
     * Constructor TypedPrecedingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedPrecedingIterator extends PrecedingIterator

  /**
   * Iterator that returns preceding nodes of agiven type for a
   * given node. This includes the node set {root+1, start-1}, but
   * excludes all ancestors.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.   The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int _sp, _oldsp;

    /** (not sure yet... -sb) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int[] _stack = new int[_maxAncestors];

    /**
     * The stack of start node + ancestors up to the root of the tree,
     *  which we must avoid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _maxAncestors = 8;

    /** The max ancestors, but it can grow... */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class PrecedingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding nodes of a given node.
   * This includes the node set {root+1, start-1}, but excludes
   * all ancestors, attributes, and namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedPrecedingSiblingIterator(int type)

    /**
     * Constructor TypedPrecedingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedPrecedingSiblingIterator

  /**
   * Iterator that returns preceding siblings of a given type for
   * a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int _startNodeID;

    /**
     * The node identity of _startNode for this iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class PrecedingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding siblings of a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedAttributeIterator(int nodeType)

    /**
     * Constructor TypedAttributeIterator
     *
     *
     * @param nodeType The extended type ID that is requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedAttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes of a given type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class AttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes (of what nodes?)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedFollowingSiblingIterator(int type)

    /**
     * Constructor TypedFollowingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedFollowingSiblingIterator

  /**
   * Iterator that returns all following siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class FollowingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns all siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NamespaceAttributeIterator(int nsType)

    /**
     * Constructor NamespaceAttributeIterator
     *
     *
     * @param nsType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nsType;

    /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class NamespaceAttributeIterator

  /**
   * Iterator that returns attributes within a given namespace for a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedRootIterator(int nodeType)

    /**
     * Constructor TypedRootIterator
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class TypedRootIterator extends RootIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node, filtered by extended type ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public RootIterator()

    /**
     * Constructor RootIterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class RootIterator

  /**
   * Iterator that returns the the root node as defined by the XPath data model
   * for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedNamespaceIterator(int nodeType)

    /**
     * Constructor TypedNamespaceIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class TypedNamespaceIterator extends NamespaceIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node, filtered by extended type ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NamespaceIterator()

    /**
     * Constructor NamespaceAttributeIterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class NamespaceIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NamespaceChildrenIterator(final int type)

    /**
     * Constructor NamespaceChildrenIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nsType;

    /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class NamespaceChildrenIterator

  /**
   * Iterator that returns children within a given namespace for a
   * given node. The functionality chould be achieved by putting a
   * filter on top of a basic child iterator, but a specialised
   * iterator is used for efficiency (both speed and size of translet).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedChildrenIterator(int nodeType)

    /**
     * Constructor TypedChildrenIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedChildrenIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns children of a given type for a given node.
   * The functionality chould be achieved by putting a filter on top
   * of a basic child iterator, but a specialised iterator is used
   * for efficiency (both speed and size of translet).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration. In this case, we return
     * only the immediate parent, _if_ it matches the requested nodeType.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setNodeType(final int type)

    /**
     * Set the node type of the parent that we're looking for.
     * Note that this does _not_ mean "find the nearest ancestor of
     * this type", but "yield the parent if it is of this type".
     *
     *
     * @param type extended type ID.
     *
     * @return ParentIterator configured with the type filter set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private int _nodeType = -1;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class ParentIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the parent of a given node. Note that
   * this delivers only a single node; if you want all the ancestors,
   * see AncestorIterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END if no more
     * are available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Setting start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * If the iterator is not restartable, this has no effect.
     * %REVIEW% Should it return/throw something in that case,
     * or set current node to END, to indicate request-not-honored?
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class ChildrenIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns all immediate children of a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public void gotoMark()

    /**
     * Restores the current node remembered by setMark().
     *
     * %REVEIW% Should this restore _position too?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public void setMark()

    /**
     * Remembers the current node for the next call to gotoMark().
     *
     * %REVIEW% Should this save _position too?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int _currentNode;

    /**
     * Current iteration location. Usually this is the last location
     * returned (starting point for the next() search); for single-node
     * iterators it may instead be initialized to point to that single node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public abstract class InternalAxisIteratorBase extends DTMAxisIteratorBase

  /**
   * Abstract superclass defining behaviors shared by all DTMDefault's
   * internal implementations of DTMAxisIterator. Subclass this (and
   * override, if necessary) to implement the specifics of an
   * individual axis iterator.
   *
   * Currently there isn't a lot here
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMAxisIterator getAxisIterator(final int axis)

  /**
   * This is a shortcut to the iterators that implement the
   * XPath axes.
   * Returns a bare-bones iterator that must be initialized
   * with a start node (using iterator.setStartNode()).
   *
   * @param axis One of Axes.ANCESTORORSELF, etc.
   *
   * @return A DTMAxisIterator, or null if the given axis isn't supported.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMAxisIterator getTypedAxisIterator(int axis, int type)

  /**
   * Get an iterator that can navigate over an XPath Axis, predicated by
   * the extended type ID.
   * Returns an iterator that must be initialized
   * with a start node (using iterator.setStartNode()).
   *
   * @param axis One of Axes.ANCESTORORSELF, etc.
   * @param type An extended type ID.
   *
   * @return A DTMAxisIterator, or null if the given axis isn't supported.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMDefaultBaseIterators(DTMManager mgr, Source source,
                                 int dtmIdentity,
                                 DTMWSFilter whiteSpaceFilter,
                                 XMLStringFactory xstringfactory,
                                 boolean doIndexing,
                                 int blocksize,
                                 boolean usePrevsib,
                                 boolean newNameTable)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMDefaultBaseIterators(DTMManager mgr, Source source,
                                 int dtmIdentity,
                                 DTMWSFilter whiteSpaceFilter,
                                 XMLStringFactory xstringfactory,
                                 boolean doIndexing)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
public abstract class DTMDefaultBaseIterators extends DTMDefaultBaseTraversers

/**
 * This class implements the traversers for DTMDefaultBase.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedSingletonIterator(int nodeType)

    /**
     * Constructor TypedSingletonIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedSingletonIterator extends SingletonIterator

  /**
   * Iterator that returns a given node only if it is of a given type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public SingletonIterator(int node, boolean constant)

    /**
     * Constructor SingletonIterator
     *
     *
     * @param node the node handle to return.
     * @param constant (Not sure what this is yet.  -sb)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public SingletonIterator(int node)

    /**
     * Constructor SingletonIterator
     *
     *
     * @param node The node handle to return.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public SingletonIterator()

    /**
     * Constructor SingletonIterator
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private boolean _isConstant;

    /** (not sure yet what this is.  -sb)  (sc & sb remove final to compile in JDK 1.1.8) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class SingletonIterator extends InternalAxisIteratorBase

  /**
   * Class SingletonIterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NthDescendantIterator(int pos)

    /**
     * Constructor NthDescendantIterator
     *
     *
     * @param pos The nth position being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    int _pos;

    /** The current nth position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class NthDescendantIterator extends DescendantIterator

  /**
   * Iterator that returns the descendants of a given node.
   * I'm not exactly clear about this one... -sb
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedDescendantIterator(int nodeType)

    /**
     * Constructor TypedDescendantIterator
     *
     *
     * @param nodeType Extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedDescendantIterator extends DescendantIterator

  /**
   * Typed iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMAxisIterator reset()

    /**
     * Reset.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected boolean isDescendant(int identity)

    /**
     * Tell if this node identity is a descendant.  Assumes that
     * the node info for the element has already been obtained.
     *
     * This one-sided test works only if the parent has been
     * previously tested and is known to be a descendent. It fails if
     * the parent is the _startNode's next sibling, or indeed any node
     * that follows _startNode in document order.  That may suffice
     * for this iterator, but it's not really an isDescendent() test.
     * %REVIEW% rename?
     *
     * @param identity The index number of the node in question.
     * @return true if the index is a descendant of _startNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class DescendantIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedAncestorIterator(int type)

    /**
     * Constructor TypedAncestorIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedAncestorIterator extends AncestorIterator

  /**
   * Typed iterator that returns the ancestors of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.  The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public final boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int getStartNode()

    /**
     * Get start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @return The root node of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    int m_realStartNode;

    /** The real start node for this axes, since _startNode will be adjusted. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class AncestorIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the ancestors of a given node in document
   * order.  (NOTE!  This was changed from the XSLTC code!)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedFollowingIterator(int type)

    /**
     * Constructor TypedFollowingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedFollowingIterator extends FollowingIterator

  /**
   * Iterator that returns following nodes of a given type for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class FollowingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns following nodes of for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedPrecedingIterator(int type)

    /**
     * Constructor TypedPrecedingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedPrecedingIterator extends PrecedingIterator

  /**
   * Iterator that returns preceding nodes of agiven type for a
   * given node. This includes the node set {root+1, start-1}, but
   * excludes all ancestors.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.   The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int _sp, _oldsp;

    /** (not sure yet... -sb) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int[] _stack = new int[_maxAncestors];

    /**
     * The stack of start node + ancestors up to the root of the tree,
     *  which we must avoid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _maxAncestors = 8;

    /** The max ancestors, but it can grow... */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class PrecedingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding nodes of a given node.
   * This includes the node set {root+1, start-1}, but excludes
   * all ancestors, attributes, and namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedPrecedingSiblingIterator(int type)

    /**
     * Constructor TypedPrecedingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedPrecedingSiblingIterator

  /**
   * Iterator that returns preceding siblings of a given type for
   * a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int _startNodeID;

    /**
     * The node identity of _startNode for this iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class PrecedingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding siblings of a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedAttributeIterator(int nodeType)

    /**
     * Constructor TypedAttributeIterator
     *
     *
     * @param nodeType The extended type ID that is requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedAttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes of a given type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class AttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes (of what nodes?)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedFollowingSiblingIterator(int type)

    /**
     * Constructor TypedFollowingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedFollowingSiblingIterator

  /**
   * Iterator that returns all following siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class FollowingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns all siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NamespaceAttributeIterator(int nsType)

    /**
     * Constructor NamespaceAttributeIterator
     *
     *
     * @param nsType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nsType;

    /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class NamespaceAttributeIterator

  /**
   * Iterator that returns attributes within a given namespace for a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedRootIterator(int nodeType)

    /**
     * Constructor TypedRootIterator
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class TypedRootIterator extends RootIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node, filtered by extended type ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public RootIterator()

    /**
     * Constructor RootIterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class RootIterator

  /**
   * Iterator that returns the the root node as defined by the XPath data model
   * for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedNamespaceIterator(int nodeType)

    /**
     * Constructor TypedNamespaceIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class TypedNamespaceIterator extends NamespaceIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node, filtered by extended type ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NamespaceIterator()

    /**
     * Constructor NamespaceAttributeIterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public class NamespaceIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public NamespaceChildrenIterator(final int type)

    /**
     * Constructor NamespaceChildrenIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nsType;

    /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class NamespaceChildrenIterator

  /**
   * Iterator that returns children within a given namespace for a
   * given node. The functionality chould be achieved by putting a
   * filter on top of a basic child iterator, but a specialised
   * iterator is used for efficiency (both speed and size of translet).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public TypedChildrenIterator(int nodeType)

    /**
     * Constructor TypedChildrenIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class TypedChildrenIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns children of a given type for a given node.
   * The functionality chould be achieved by putting a filter on top
   * of a basic child iterator, but a specialised iterator is used
   * for efficiency (both speed and size of translet).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration. In this case, we return
     * only the immediate parent, _if_ it matches the requested nodeType.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setNodeType(final int type)

    /**
     * Set the node type of the parent that we're looking for.
     * Note that this does _not_ mean "find the nearest ancestor of
     * this type", but "yield the parent if it is of this type".
     *
     *
     * @param type extended type ID.
     *
     * @return ParentIterator configured with the type filter set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    private int _nodeType = -1;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class ParentIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the parent of a given node. Note that
   * this delivers only a single node; if you want all the ancestors,
   * see AncestorIterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END if no more
     * are available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Setting start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * If the iterator is not restartable, this has no effect.
     * %REVIEW% Should it return/throw something in that case,
     * or set current node to END, to indicate request-not-honored?
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public final class ChildrenIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns all immediate children of a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public void gotoMark()

    /**
     * Restores the current node remembered by setMark().
     *
     * %REVEIW% Should this restore _position too?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    public void setMark()

    /**
     * Remembers the current node for the next call to gotoMark().
     *
     * %REVIEW% Should this save _position too?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
    protected int _currentNode;

    /**
     * Current iteration location. Usually this is the last location
     * returned (starting point for the next() search); for single-node
     * iterators it may instead be initialized to point to that single node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public abstract class InternalAxisIteratorBase extends DTMAxisIteratorBase

  /**
   * Abstract superclass defining behaviors shared by all DTMDefault's
   * internal implementations of DTMAxisIterator. Subclass this (and
   * override, if necessary) to implement the specifics of an
   * individual axis iterator.
   *
   * Currently there isn't a lot here
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMAxisIterator getAxisIterator(final int axis)

  /**
   * This is a shortcut to the iterators that implement the
   * XPath axes.
   * Returns a bare-bones iterator that must be initialized
   * with a start node (using iterator.setStartNode()).
   *
   * @param axis One of Axes.ANCESTORORSELF, etc.
   *
   * @return A DTMAxisIterator, or null if the given axis isn't supported.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMAxisIterator getTypedAxisIterator(int axis, int type)

  /**
   * Get an iterator that can navigate over an XPath Axis, predicated by
   * the extended type ID.
   * Returns an iterator that must be initialized
   * with a start node (using iterator.setStartNode()).
   *
   * @param axis One of Axes.ANCESTORORSELF, etc.
   * @param type An extended type ID.
   *
   * @return A DTMAxisIterator, or null if the given axis isn't supported.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMDefaultBaseIterators(DTMManager mgr, Source source,
                                 int dtmIdentity,
                                 DTMWSFilter whiteSpaceFilter,
                                 XMLStringFactory xstringfactory,
                                 boolean doIndexing,
                                 int blocksize,
                                 boolean usePrevsib,
                                 boolean newNameTable)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
  public DTMDefaultBaseIterators(DTMManager mgr, Source source,
                                 int dtmIdentity,
                                 DTMWSFilter whiteSpaceFilter,
                                 XMLStringFactory xstringfactory,
                                 boolean doIndexing)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseIterators.java
public abstract class DTMDefaultBaseIterators extends DTMDefaultBaseTraversers

/**
 * This class implements the traversers for DTMDefaultBase.
 */
