_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected DTMAxisIterator m_iterator;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   * Warning: This can only be called after setRoot has been called!
   *
   * @return false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the number of nodes in this node list.  The function is probably ill
   * named?
   *
   *
   * @param xctxt The XPath runtime context.
   *
   * @return the number of nodes in this node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected void countProximityPosition(int i)

  /**
   * Count backwards one proximity position.
   *
   * @param i The predicate index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected int getProximityPosition(int predicateIndex)

  /**
   * Get the current sub-context position.  In order to do the
   * reverse axes count, for the moment this re-searches the axes
   * up to the predicate.  An optimization on this is to cache
   * the nodes searched, but, for the moment, this case is probably
   * rare enough that the added complexity isn't worth it.
   *
   * @param predicateIndex The predicate index of the proximity position.
   *
   * @return The pridicate index, or -1.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
//  public void setRoot(int root)

//  /**
//   *  Set the root node of the TreeWalker.
//   *
//   * @param root The context node of this step.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public boolean isReverseAxes()

  /**
   * Tells if this is a reverse axes.  Overrides AxesWalker#isReverseAxes.
   *
   * @return true for this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected int getNextNode()

  /**
   * Get the next node in document order on the axes.
   *
   * @return the next node in document order on the axes, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public void setRoot(int root)

  /**
   * Set the root node of the TreeWalker.
   * (Not part of the DOM2 TreeWalker interface).
   *
   * @param root The context node of this step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  ReverseAxesWalker(LocPathIterator locPathIterator, int axis)

  /**
   * Construct an AxesWalker using a LocPathIterator.
   *
   * @param locPathIterator The location path iterator that 'owns' this walker.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
public class ReverseAxesWalker extends AxesWalker

/**
 * Walker for a reverse axes.
 * @see <a href="http://www.w3.org/TR/xpath#predicates">XPath 2.4 Predicates</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected DTMAxisIterator m_iterator;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   * Warning: This can only be called after setRoot has been called!
   *
   * @return false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the number of nodes in this node list.  The function is probably ill
   * named?
   *
   *
   * @param xctxt The XPath runtime context.
   *
   * @return the number of nodes in this node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected void countProximityPosition(int i)

  /**
   * Count backwards one proximity position.
   *
   * @param i The predicate index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected int getProximityPosition(int predicateIndex)

  /**
   * Get the current sub-context position.  In order to do the
   * reverse axes count, for the moment this re-searches the axes
   * up to the predicate.  An optimization on this is to cache
   * the nodes searched, but, for the moment, this case is probably
   * rare enough that the added complexity isn't worth it.
   *
   * @param predicateIndex The predicate index of the proximity position.
   *
   * @return The pridicate index, or -1.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
//  public void setRoot(int root)

//  /**
//   *  Set the root node of the TreeWalker.
//   *
//   * @param root The context node of this step.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public boolean isReverseAxes()

  /**
   * Tells if this is a reverse axes.  Overrides AxesWalker#isReverseAxes.
   *
   * @return true for this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  protected int getNextNode()

  /**
   * Get the next node in document order on the axes.
   *
   * @return the next node in document order on the axes, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  public void setRoot(int root)

  /**
   * Set the root node of the TreeWalker.
   * (Not part of the DOM2 TreeWalker interface).
   *
   * @param root The context node of this step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
  ReverseAxesWalker(LocPathIterator locPathIterator, int axis)

  /**
   * Construct an AxesWalker using a LocPathIterator.
   *
   * @param locPathIterator The location path iterator that 'owns' this walker.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ReverseAxesWalker.java
public class ReverseAxesWalker extends AxesWalker

/**
 * Walker for a reverse axes.
 * @see <a href="http://www.w3.org/TR/xpath#predicates">XPath 2.4 Predicates</a>
 */
