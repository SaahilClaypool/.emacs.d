_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  protected void callSubtreeVisitors(XPathVisitor visitor)

  /**
   * Call the visitor for the function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public XObject execute(XPathContext xctxt)

  /**
   * Test a node to see if it matches the given node test.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public XObject execute(XPathContext xctxt, int context,
                         DTM dtm, int expType)

  /**
   * Test a node to see if it matches the given node test.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public XObject execute(XPathContext xctxt, int context)

  /**
   * Test a node to see if it matches the given node test.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to fixup variables from QNames to stack frame
   * indexes at stylesheet build time.
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  Expression m_functionExpr;

  /**
   * Should be a {@link com.sun.org.apache.xpath.internal.functions.Function expression}.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public final void calcScore()

  /**
   * Static calc of match score.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public FunctionPattern(Expression expr, int axis, int predaxis)

  /**
   * Construct a FunctionPattern from a
   * {@link com.sun.org.apache.xpath.internal.functions.Function expression}.
   *
   * NEEDSDOC @param expr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
public class FunctionPattern extends StepPattern

/**
 * Match pattern step that contains a function.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  protected void callSubtreeVisitors(XPathVisitor visitor)

  /**
   * Call the visitor for the function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public XObject execute(XPathContext xctxt)

  /**
   * Test a node to see if it matches the given node test.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public XObject execute(XPathContext xctxt, int context,
                         DTM dtm, int expType)

  /**
   * Test a node to see if it matches the given node test.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public XObject execute(XPathContext xctxt, int context)

  /**
   * Test a node to see if it matches the given node test.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to fixup variables from QNames to stack frame
   * indexes at stylesheet build time.
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  Expression m_functionExpr;

  /**
   * Should be a {@link com.sun.org.apache.xpath.internal.functions.Function expression}.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public final void calcScore()

  /**
   * Static calc of match score.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
  public FunctionPattern(Expression expr, int axis, int predaxis)

  /**
   * Construct a FunctionPattern from a
   * {@link com.sun.org.apache.xpath.internal.functions.Function expression}.
   *
   * NEEDSDOC @param expr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/FunctionPattern.java
public class FunctionPattern extends StepPattern

/**
 * Match pattern step that contains a function.
 * @xsl.usage advanced
 */
