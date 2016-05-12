_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public void reset()

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected void countProximityPosition(int i)

  /**
   * Count backwards one proximity position.
   *
   * @param i The predicate index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public int getLength()

  /**
   *  The number of nodes in the list. The range of valid child node indices
   * is 0 to <code>length-1</code> inclusive.
   *
   * @return The number of nodes in the list, always greater or equal to zero.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public boolean isReverseAxes()

  /**
   * Tells if this is a reverse axes.  Overrides AxesWalker#isReverseAxes.
   *
   * @return true for this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   *  Get a cloned Iterator that is reset to the beginning
   *  of the query.
   *
   *  @return A cloned NodeIterator set of the start of the query.
   *
   *  @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned iterator.
   *
   * @return A new iterator that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected int getNextNode()

  /**
   * Get the next node via getFirstAttribute && getNextAttribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public void detach()

  /**
   *  Detaches the iterator from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state. After<code>detach</code> has been invoked, calls to
   * <code>nextNode</code> or<code>previousNode</code> will raise the
   * exception INVALID_STATE_ERR.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public void setRoot(int context, Object environment)

  /**
   * Initialize the context values for this expression
   * after it is cloned.
   *
   * @param context The XPath runtime context for this
   * transformation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public OneStepIterator(DTMAxisIterator iterator, int axis)

  /**
   * Create a OneStepIterator object.
   *
   * @param iterator The DTM iterator which this iterator will use.
   * @param axis One of Axis.Child, etc., or -1 if the axis is unknown.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  OneStepIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a OneStepIterator object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected DTMAxisIterator m_iterator;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected int m_axis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
public class OneStepIterator extends ChildTestIterator

/**
 * This class implements a general iterator for
 * those LocationSteps with only one step, and perhaps a predicate.
 * @see com.sun.org.apache.xpath.internal.axes#LocPathIterator
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public void reset()

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected void countProximityPosition(int i)

  /**
   * Count backwards one proximity position.
   *
   * @param i The predicate index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public int getLength()

  /**
   *  The number of nodes in the list. The range of valid child node indices
   * is 0 to <code>length-1</code> inclusive.
   *
   * @return The number of nodes in the list, always greater or equal to zero.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public boolean isReverseAxes()

  /**
   * Tells if this is a reverse axes.  Overrides AxesWalker#isReverseAxes.
   *
   * @return true for this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   *  Get a cloned Iterator that is reset to the beginning
   *  of the query.
   *
   *  @return A cloned NodeIterator set of the start of the query.
   *
   *  @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned iterator.
   *
   * @return A new iterator that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected int getNextNode()

  /**
   * Get the next node via getFirstAttribute && getNextAttribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public void detach()

  /**
   *  Detaches the iterator from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state. After<code>detach</code> has been invoked, calls to
   * <code>nextNode</code> or<code>previousNode</code> will raise the
   * exception INVALID_STATE_ERR.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public void setRoot(int context, Object environment)

  /**
   * Initialize the context values for this expression
   * after it is cloned.
   *
   * @param context The XPath runtime context for this
   * transformation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  public OneStepIterator(DTMAxisIterator iterator, int axis)

  /**
   * Create a OneStepIterator object.
   *
   * @param iterator The DTM iterator which this iterator will use.
   * @param axis One of Axis.Child, etc., or -1 if the axis is unknown.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  OneStepIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a OneStepIterator object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected DTMAxisIterator m_iterator;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
  protected int m_axis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIterator.java
public class OneStepIterator extends ChildTestIterator

/**
 * This class implements a general iterator for
 * those LocationSteps with only one step, and perhaps a predicate.
 * @see com.sun.org.apache.xpath.internal.axes#LocPathIterator
 * @xsl.usage advanced
 */
