_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  protected int m_extendedTypeID;

  /** The extended type ID, not set until setRoot. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  protected int m_axis;

  /** The axis that we are traversing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  transient protected DTMAxisTraverser m_traverser;

  /** The traverser to use to navigate over the descendants. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public int asNode(XPathContext xctxt)

  /**
   * Return the first node out of the nodeset, if this expression is
   * a nodeset expression.  This is the default implementation for
   * nodesets.
   * <p>WARNING: Do not mutate this class from this function!</p>
   * @param xctxt The XPath runtime context.
   * @return the first node out of the nodeset, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   *
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   *
   * @throws DOMException
   *    INVALID_STATE_ERR: Raised if this method is called after the
   *   <code>detach</code> method was invoked.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public DescendantIterator()

  /**
   * Create a DescendantIterator object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  DescendantIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a DescendantIterator object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
public class DescendantIterator extends LocPathIterator

/**
 * This class implements an optimized iterator for
 * descendant, descendant-or-self, or "//foo" patterns.
 * @see com.sun.org.apache.xpath.internal.axes.LocPathIterator
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  protected int m_extendedTypeID;

  /** The extended type ID, not set until setRoot. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  protected int m_axis;

  /** The axis that we are traversing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  transient protected DTMAxisTraverser m_traverser;

  /** The traverser to use to navigate over the descendants. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public int asNode(XPathContext xctxt)

  /**
   * Return the first node out of the nodeset, if this expression is
   * a nodeset expression.  This is the default implementation for
   * nodesets.
   * <p>WARNING: Do not mutate this class from this function!</p>
   * @param xctxt The XPath runtime context.
   * @return the first node out of the nodeset, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   *
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   *
   * @throws DOMException
   *    INVALID_STATE_ERR: Raised if this method is called after the
   *   <code>detach</code> method was invoked.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  public DescendantIterator()

  /**
   * Create a DescendantIterator object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
  DescendantIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a DescendantIterator object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/DescendantIterator.java
public class DescendantIterator extends LocPathIterator

/**
 * This class implements an optimized iterator for
 * descendant, descendant-or-self, or "//foo" patterns.
 * @see com.sun.org.apache.xpath.internal.axes.LocPathIterator
 * @xsl.usage advanced
 */
