_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException

  /**
   * Test a node to see if it matches any of the patterns in the union.
   *
   * @param xctxt XPath runtime context.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public StepPattern[] getPatterns()

  /**
   * Get the contained step patterns to be tested.
   *
   *
   * @return an array of the contained step patterns to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public void setPatterns(StepPattern[] patterns)

  /**
   * Set the contained step patterns to be tested.
   *
   *
   * @param patterns the contained step patterns to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
   public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * No arguments to process, so this does nothing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  private StepPattern[] m_patterns;

  /** Array of the contained step patterns to be tested.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
public class UnionPattern extends Expression

/**
 * This class represents a union pattern, which can have multiple individual
 * StepPattern patterns.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException

  /**
   * Test a node to see if it matches any of the patterns in the union.
   *
   * @param xctxt XPath runtime context.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public StepPattern[] getPatterns()

  /**
   * Get the contained step patterns to be tested.
   *
   *
   * @return an array of the contained step patterns to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public void setPatterns(StepPattern[] patterns)

  /**
   * Set the contained step patterns to be tested.
   *
   *
   * @param patterns the contained step patterns to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
   public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * No arguments to process, so this does nothing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
  private StepPattern[] m_patterns;

  /** Array of the contained step patterns to be tested.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/UnionPattern.java
public class UnionPattern extends Expression

/**
 * This class represents a union pattern, which can have multiple individual
 * StepPattern patterns.
 * @xsl.usage advanced
 */
