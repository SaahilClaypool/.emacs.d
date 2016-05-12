_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  protected int getNextNode()

  /**
   * Get the next node via getFirstAttribute && getNextAttribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
//  public int asNode(XPathContext xctxt)

//  /**
//   * Return the first node out of the nodeset, if this expression is
//   * a nodeset expression.  This is the default implementation for
//   * nodesets.
//   * <p>WARNING: Do not mutate this class from this function!</p>
//   * @param xctxt The XPath runtime context.
//   * @return the first node out of the nodeset, or DTM.NULL.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  public OneStepIteratorForward(int axis)

  /**
   * Create a OneStepIterator object that will just traverse the self axes.
   *
   * @param axis One of the com.sun.org.apache.xml.internal.dtm.Axis integers.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  OneStepIteratorForward(Compiler compiler, int opPos, int analysis)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  protected int m_axis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
public class OneStepIteratorForward extends ChildTestIterator

/**
 * This class implements a general iterator for
 * those LocationSteps with only one step, and perhaps a predicate,
 * that only go forward (i.e. it can not be used with ancestors,
 * preceding, etc.)
 * @see com.sun.org.apache.xpath.internal.axes#ChildTestIterator
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  protected int getNextNode()

  /**
   * Get the next node via getFirstAttribute && getNextAttribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
//  public int asNode(XPathContext xctxt)

//  /**
//   * Return the first node out of the nodeset, if this expression is
//   * a nodeset expression.  This is the default implementation for
//   * nodesets.
//   * <p>WARNING: Do not mutate this class from this function!</p>
//   * @param xctxt The XPath runtime context.
//   * @return the first node out of the nodeset, or DTM.NULL.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  public OneStepIteratorForward(int axis)

  /**
   * Create a OneStepIterator object that will just traverse the self axes.
   *
   * @param axis One of the com.sun.org.apache.xml.internal.dtm.Axis integers.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  OneStepIteratorForward(Compiler compiler, int opPos, int analysis)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
  protected int m_axis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/OneStepIteratorForward.java
public class OneStepIteratorForward extends ChildTestIterator

/**
 * This class implements a general iterator for
 * those LocationSteps with only one step, and perhaps a predicate,
 * that only go forward (i.e. it can not be used with ancestors,
 * preceding, etc.)
 * @see com.sun.org.apache.xpath.internal.axes#ChildTestIterator
 * @xsl.usage advanced
 */
