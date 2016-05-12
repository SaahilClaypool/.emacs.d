_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  protected int getNextNode()

  /**
   * Get the next node via getNextXXX.  Bottlenecked for derived class override.
   * @return The next node on the axis, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  public ChildTestIterator(DTMAxisTraverser traverser)

  /**
   * Create a ChildTestIterator object.
   *
   * @param traverser Traverser that tells how the KeyIterator is to be handled.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  ChildTestIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a ChildTestIterator object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
//  protected int m_extendedTypeID;

  /** The extended type ID, not set until setRoot. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  transient protected DTMAxisTraverser m_traverser;

  /** The traverser to use to navigate over the descendants. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
public class ChildTestIterator extends BasicTestIterator

/**
 * This class implements an optimized iterator for
 * children patterns that have a node test, and possibly a predicate.
 * @see com.sun.org.apache.xpath.internal.axes.BasicTestIterator
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  protected int getNextNode()

  /**
   * Get the next node via getNextXXX.  Bottlenecked for derived class override.
   * @return The next node on the axis, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  public ChildTestIterator(DTMAxisTraverser traverser)

  /**
   * Create a ChildTestIterator object.
   *
   * @param traverser Traverser that tells how the KeyIterator is to be handled.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  ChildTestIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a ChildTestIterator object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
//  protected int m_extendedTypeID;

  /** The extended type ID, not set until setRoot. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
  transient protected DTMAxisTraverser m_traverser;

  /** The traverser to use to navigate over the descendants. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ChildTestIterator.java
public class ChildTestIterator extends BasicTestIterator

/**
 * This class implements an optimized iterator for
 * children patterns that have a node test, and possibly a predicate.
 * @see com.sun.org.apache.xpath.internal.axes.BasicTestIterator
 * @xsl.usage advanced
 */
