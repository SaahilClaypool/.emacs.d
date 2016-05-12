_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getNodeByPosition(int position)

  /**
   * Return the node at the given position.
   *
   * @param position The position
   * @return The node at the given position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected final DTMAxisIterator resetPosition()

  /**
   * Reset the position to zero. NOTE that this does not change the iteration
   * state, only the position number associated with that state.
   *
   * %REVIEW% Document when this would be used?
   *
   * @return This instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected final int returnNode(final int node)

  /**
   * Do any final cleanup that is required before returning the node that was
   * passed in, and then return it. The intended use is
   * <br />
   * <code>return returnNode(node);</code>
   *
   * %REVIEW% If we're calling it purely for side effects, should we really
   * be bothering with a return value? Something like
   * <br />
   * <code> accept(node); return node; </code>
   * <br />
   * would probably optimize just about as well and avoid questions
   * about whether what's returned could ever be different from what's
   * passed in.
   *
   * @param node Node handle which iteration is about to yield.
   *
   * @return The node handle passed in.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public DTMAxisIterator cloneIterator()

  /**
   * Returns a deep copy of this iterator. Cloned iterators may not be
   * restartable. The iterator being cloned may or may not become
   * non-restartable as a side effect of this operation.
   *
   * @return a deep copy of this iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public boolean isReverse()

  /**
   * @return true if this iterator has a reversed axis, else false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getPosition()

  /**
   * @return The position of the current node within the set, as defined by
   * XPath. Note that this is one-based, not zero-based.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getLast()

  /** Returns the position of the last node within the iteration, as
   * defined by XPath.  In a forward iterator, I believe this equals the number of nodes which this
   * iterator will yield. In a reverse iterator, I believe it should return
   * 1 (since the "last" is the first produced.)
   *
   * This may be an expensive operation when called the first time, since
   * it may have to iterate through a large part of the document to produce
   * its answer.
   *
   * @return The number of nodes in this iterator (forward) or 1 (reverse).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public DTMAxisIterator includeSelf()

  /**
   * Set the flag to include the start node in the iteration.
   *
   *
   * @return This default method returns just returns this DTMAxisIterator,
   * after setting the flag.
   * (Returning "this" permits C++-style chaining of
   * method calls into a single expression.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public DTMAxisIterator reset()

  /**
   * @return A DTMAxisIterator which has been reset to the start node,
   * which may or may not be the same as this iterator.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getStartNode()

  /**
   * Get start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @return The root node of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected boolean _isRestartable = true;

  /** True if this iteration can be restarted. False otherwise (eg, if
   * we are iterating over a stream that can not be re-scanned, or if
   * the iterator was produced by cloning another iterator.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected boolean _includeSelf = false;

  /** True if the start node should be considered part of the iteration.
   * False will cause it to be skipped.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _startNode = DTMAxisIterator.END;

  /** The handle to the start, or root, of the iteration.
   * Set this to END to construct an empty iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _markedNode;

  /** The position of the marked node within the iteration;
   * a saved itaration state that we may want to come back to.
   * Note that only one mark is maintained; there is no stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _position = 0;

  /** The position of the current node within the iteration, as defined by XPath.
   * Note that this is _not_ the node's handle within the DTM!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _last = -1;

  /** The position of the last node within the iteration, as defined by XPath.
   * Note that this is _not_ the node's handle within the DTM. Also, don't
   * confuse it with the current (most recently returned) position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
public abstract class DTMAxisIteratorBase implements DTMAxisIterator

/**
 * This class serves as a default base for implementations of mutable
 * DTMAxisIterators.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getNodeByPosition(int position)

  /**
   * Return the node at the given position.
   *
   * @param position The position
   * @return The node at the given position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected final DTMAxisIterator resetPosition()

  /**
   * Reset the position to zero. NOTE that this does not change the iteration
   * state, only the position number associated with that state.
   *
   * %REVIEW% Document when this would be used?
   *
   * @return This instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected final int returnNode(final int node)

  /**
   * Do any final cleanup that is required before returning the node that was
   * passed in, and then return it. The intended use is
   * <br />
   * <code>return returnNode(node);</code>
   *
   * %REVIEW% If we're calling it purely for side effects, should we really
   * be bothering with a return value? Something like
   * <br />
   * <code> accept(node); return node; </code>
   * <br />
   * would probably optimize just about as well and avoid questions
   * about whether what's returned could ever be different from what's
   * passed in.
   *
   * @param node Node handle which iteration is about to yield.
   *
   * @return The node handle passed in.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public DTMAxisIterator cloneIterator()

  /**
   * Returns a deep copy of this iterator. Cloned iterators may not be
   * restartable. The iterator being cloned may or may not become
   * non-restartable as a side effect of this operation.
   *
   * @return a deep copy of this iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public boolean isReverse()

  /**
   * @return true if this iterator has a reversed axis, else false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getPosition()

  /**
   * @return The position of the current node within the set, as defined by
   * XPath. Note that this is one-based, not zero-based.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getLast()

  /** Returns the position of the last node within the iteration, as
   * defined by XPath.  In a forward iterator, I believe this equals the number of nodes which this
   * iterator will yield. In a reverse iterator, I believe it should return
   * 1 (since the "last" is the first produced.)
   *
   * This may be an expensive operation when called the first time, since
   * it may have to iterate through a large part of the document to produce
   * its answer.
   *
   * @return The number of nodes in this iterator (forward) or 1 (reverse).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public DTMAxisIterator includeSelf()

  /**
   * Set the flag to include the start node in the iteration.
   *
   *
   * @return This default method returns just returns this DTMAxisIterator,
   * after setting the flag.
   * (Returning "this" permits C++-style chaining of
   * method calls into a single expression.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public DTMAxisIterator reset()

  /**
   * @return A DTMAxisIterator which has been reset to the start node,
   * which may or may not be the same as this iterator.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  public int getStartNode()

  /**
   * Get start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @return The root node of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected boolean _isRestartable = true;

  /** True if this iteration can be restarted. False otherwise (eg, if
   * we are iterating over a stream that can not be re-scanned, or if
   * the iterator was produced by cloning another iterator.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected boolean _includeSelf = false;

  /** True if the start node should be considered part of the iteration.
   * False will cause it to be skipped.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _startNode = DTMAxisIterator.END;

  /** The handle to the start, or root, of the iteration.
   * Set this to END to construct an empty iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _markedNode;

  /** The position of the marked node within the iteration;
   * a saved itaration state that we may want to come back to.
   * Note that only one mark is maintained; there is no stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _position = 0;

  /** The position of the current node within the iteration, as defined by XPath.
   * Note that this is _not_ the node's handle within the DTM!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
  protected int _last = -1;

  /** The position of the last node within the iteration, as defined by XPath.
   * Note that this is _not_ the node's handle within the DTM. Also, don't
   * confuse it with the current (most recently returned) position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMAxisIteratorBase.java
public abstract class DTMAxisIteratorBase implements DTMAxisIterator

/**
 * This class serves as a default base for implementations of mutable
 * DTMAxisIterators.
 */
