_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/StepPattern.java
class StepPattern extends RelativePathPattern {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected void callSubtreeVisitors(XPathVisitor visitor)

  /**
   * Call the visitors on the subtree.  Factored out from callVisitors
   * so it may be called by derived classes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public int getAxis()

  /**
   * Get the axis that this step follows.
   *
   *
   * @return The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setAxis(int axis)

  /**
   * Set the axis that this step should follow.
   *
   *
   * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public double getMatchScore(XPathContext xctxt, int context)

  /**
   * Get the match score of the given node.
   *
   * @param xctxt The XPath runtime context.
   * @param context The node to be tested.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  private static final boolean DEBUG_MATCHES = false;

  /** Set to true to send diagnostics about pattern matches to the consol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public String toString()

  /**
   * Get the string represenentation of this step for diagnostic purposes.
   *
   *
   * @return A string representation of this step, built by reverse-engineering
   * the contained info.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected final boolean executePredicates(
          XPathContext xctxt, DTM dtm, int currentNode)

  /**
   * Execute the predicates on this step to determine if the current node
   * should be filtered or accepted.
   *
   * @param xctxt The XPath runtime context.
   * @param dtm The DTM of the current node.
   * @param currentNode The current node context.
   *
   * @return true if the node should be accepted, false otherwise.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected final XObject executeRelativePathPattern(
          XPathContext xctxt, DTM dtm, int currentNode)

  /**
   * Execute the match pattern step relative to another step.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param dtm The DTM of the current node.
   * @param currentNode The current node context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the count of the nodes that match the test, which is the proximity
   * position of the last node that can pass this test in the sub context
   * selection.  In XSLT 1-based indexing, this count is the index of the last
   * node.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the count of the nodes that match the test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public int getProximityPosition(XPathContext xctxt)

  /**
   * Get the proximity position index of the current node based on this
   * node test.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the proximity position index of the current node based on the
   *         node test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  private final int getProximityPosition(XPathContext xctxt, int predPos,
                    boolean findLast)

  /**
   * Get the proximity position index of the current node based on this
   * node test.
   *
   *
   * @param xctxt XPath runtime context.
   * @param predPos Which predicate we're evaluating of foo[1][2][3].
   * @param findLast If true, don't terminate when the context node is found.
   *
   * @return the proximity position index of the current node based on the
   *         node test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  private final boolean checkProximityPosition(XPathContext xctxt,
          int predPos, DTM dtm, int context, int pos)

  /**
   * New Method to check whether the current node satisfies a position predicate
   *
   * @param xctxt The XPath runtime context.
   * @param predPos Which predicate we're evaluating of foo[1][2][3].
   * @param dtm The DTM of the current node.
   * @param context The currentNode.
   * @param pos The position being requested, i.e. the value returned by
   *            m_predicates[predPos].execute(xctxt).
   *
   * @return true of the position of the context matches pos, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public XObject execute(
          XPathContext xctxt, int currentNode, DTM dtm, int expType)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param currentNode The currentNode.
   * @param dtm The DTM of the current node.
   * @param expType The expanded type ID of the current node.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute this pattern step, including predicates.
   *
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public XObject execute(XPathContext xctxt, int currentNode)

  /**
   * Execute this pattern step, including predicates.
   *
   *
   * @param xctxt XPath runtime context.
   * @param currentNode The current node context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void calcScore()

  /**
   * Static calc of match score.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setPredicates(Expression[] predicates)

  /**
   * Set the predicates for this match pattern step.
   *
   *
   * @param predicates An array of expressions that define predicates
   *                   for this step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public final int getPredicateCount()

  /**
   * Get the number of predicates for this match pattern step.
   *
   *
   * @return the number of predicates for this match pattern step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public Expression getPredicate(int i)

  /**
   * Get a predicate expression.
   *
   *
   * @param i The index of the predicate.
   *
   * @return A predicate expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * NOTE: Ancestors tests with predicates are problematic, and will require
   * special treatment.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  Expression[] m_predicates;

  /**
   * The list of predicate expressions for this pattern step.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public Expression[] getPredicates()

  /**
   * Set the list of predicate expressions for this pattern step.
   * @return List of expression objects.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  //  public void setPredicates(Expression[] predicates)

  //  /**
  //   * Set the list of predicate expressions for this pattern step.
  //   * @param predicates List of expression objects.
  //   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public StepPattern getRelativePathPattern()

  /**
   * Get the reference to nodetest and predicate for
   * parent or ancestor.
   *
   *
   * @return The relative pattern expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setRelativePathPattern(StepPattern expr)

  /**
   * Set the reference to nodetest and predicate for
   * parent or ancestor.
   *
   *
   * @param expr The relative pattern expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
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
   * @param globalsSize The number of variables in the global variable area.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  StepPattern m_relativePathPattern;

  /**
   * Reference to nodetest and predicate for
   * parent or ancestor.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public String getTargetString()

  /**
   * Get the local name or psuedo name of the node that this pattern will test,
   * for hash table lookup optimization.
   *
   *
   * @return local name or psuedo name of the node.
   * @see com.sun.org.apache.xpath.internal.compiler.PsuedoNames
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void calcTargetString()

  /**
   * Calculate the local name or psuedo name of the node that this pattern will test,
   * for hash table lookup optimization.
   *
   * @see com.sun.org.apache.xpath.internal.compiler.PsuedoNames
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  String m_targetString;  // only calculate on head

  /**
   * The target local name or psuedo name, for hash table lookup optimization.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public StepPattern(int whatToShow, int axis, int axisForPredicate)

  /**
   * Construct a StepPattern that doesn't test for node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   * @param axisForPredicate No longer used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public StepPattern(int whatToShow, String namespace, String name, int axis,
                     int axisForPredicate)

  /**
   * Construct a StepPattern that tests for namespaces and node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param namespace The namespace to be tested.
   * @param name The local name to be tested.
   * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   * @param axisForPredicate No longer used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected int m_axis;

  /** The axis for this test. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
public class StepPattern extends NodeTest implements SubContextList, ExpressionOwner

/**
 * This class represents a single pattern match step.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/StepPattern.java
class StepPattern extends RelativePathPattern {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected void callSubtreeVisitors(XPathVisitor visitor)

  /**
   * Call the visitors on the subtree.  Factored out from callVisitors
   * so it may be called by derived classes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public int getAxis()

  /**
   * Get the axis that this step follows.
   *
   *
   * @return The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setAxis(int axis)

  /**
   * Set the axis that this step should follow.
   *
   *
   * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public double getMatchScore(XPathContext xctxt, int context)

  /**
   * Get the match score of the given node.
   *
   * @param xctxt The XPath runtime context.
   * @param context The node to be tested.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  private static final boolean DEBUG_MATCHES = false;

  /** Set to true to send diagnostics about pattern matches to the consol. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public String toString()

  /**
   * Get the string represenentation of this step for diagnostic purposes.
   *
   *
   * @return A string representation of this step, built by reverse-engineering
   * the contained info.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected final boolean executePredicates(
          XPathContext xctxt, DTM dtm, int currentNode)

  /**
   * Execute the predicates on this step to determine if the current node
   * should be filtered or accepted.
   *
   * @param xctxt The XPath runtime context.
   * @param dtm The DTM of the current node.
   * @param currentNode The current node context.
   *
   * @return true if the node should be accepted, false otherwise.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected final XObject executeRelativePathPattern(
          XPathContext xctxt, DTM dtm, int currentNode)

  /**
   * Execute the match pattern step relative to another step.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param dtm The DTM of the current node.
   * @param currentNode The current node context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the count of the nodes that match the test, which is the proximity
   * position of the last node that can pass this test in the sub context
   * selection.  In XSLT 1-based indexing, this count is the index of the last
   * node.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the count of the nodes that match the test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public int getProximityPosition(XPathContext xctxt)

  /**
   * Get the proximity position index of the current node based on this
   * node test.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the proximity position index of the current node based on the
   *         node test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  private final int getProximityPosition(XPathContext xctxt, int predPos,
                    boolean findLast)

  /**
   * Get the proximity position index of the current node based on this
   * node test.
   *
   *
   * @param xctxt XPath runtime context.
   * @param predPos Which predicate we're evaluating of foo[1][2][3].
   * @param findLast If true, don't terminate when the context node is found.
   *
   * @return the proximity position index of the current node based on the
   *         node test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  private final boolean checkProximityPosition(XPathContext xctxt,
          int predPos, DTM dtm, int context, int pos)

  /**
   * New Method to check whether the current node satisfies a position predicate
   *
   * @param xctxt The XPath runtime context.
   * @param predPos Which predicate we're evaluating of foo[1][2][3].
   * @param dtm The DTM of the current node.
   * @param context The currentNode.
   * @param pos The position being requested, i.e. the value returned by
   *            m_predicates[predPos].execute(xctxt).
   *
   * @return true of the position of the context matches pos, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public XObject execute(
          XPathContext xctxt, int currentNode, DTM dtm, int expType)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param currentNode The currentNode.
   * @param dtm The DTM of the current node.
   * @param expType The expanded type ID of the current node.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute this pattern step, including predicates.
   *
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public XObject execute(XPathContext xctxt, int currentNode)

  /**
   * Execute this pattern step, including predicates.
   *
   *
   * @param xctxt XPath runtime context.
   * @param currentNode The current node context.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void calcScore()

  /**
   * Static calc of match score.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setPredicates(Expression[] predicates)

  /**
   * Set the predicates for this match pattern step.
   *
   *
   * @param predicates An array of expressions that define predicates
   *                   for this step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public final int getPredicateCount()

  /**
   * Get the number of predicates for this match pattern step.
   *
   *
   * @return the number of predicates for this match pattern step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public Expression getPredicate(int i)

  /**
   * Get a predicate expression.
   *
   *
   * @param i The index of the predicate.
   *
   * @return A predicate expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * NOTE: Ancestors tests with predicates are problematic, and will require
   * special treatment.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  Expression[] m_predicates;

  /**
   * The list of predicate expressions for this pattern step.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public Expression[] getPredicates()

  /**
   * Set the list of predicate expressions for this pattern step.
   * @return List of expression objects.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  //  public void setPredicates(Expression[] predicates)

  //  /**
  //   * Set the list of predicate expressions for this pattern step.
  //   * @param predicates List of expression objects.
  //   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public StepPattern getRelativePathPattern()

  /**
   * Get the reference to nodetest and predicate for
   * parent or ancestor.
   *
   *
   * @return The relative pattern expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void setRelativePathPattern(StepPattern expr)

  /**
   * Set the reference to nodetest and predicate for
   * parent or ancestor.
   *
   *
   * @param expr The relative pattern expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
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
   * @param globalsSize The number of variables in the global variable area.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  StepPattern m_relativePathPattern;

  /**
   * Reference to nodetest and predicate for
   * parent or ancestor.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public String getTargetString()

  /**
   * Get the local name or psuedo name of the node that this pattern will test,
   * for hash table lookup optimization.
   *
   *
   * @return local name or psuedo name of the node.
   * @see com.sun.org.apache.xpath.internal.compiler.PsuedoNames
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public void calcTargetString()

  /**
   * Calculate the local name or psuedo name of the node that this pattern will test,
   * for hash table lookup optimization.
   *
   * @see com.sun.org.apache.xpath.internal.compiler.PsuedoNames
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  String m_targetString;  // only calculate on head

  /**
   * The target local name or psuedo name, for hash table lookup optimization.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public StepPattern(int whatToShow, int axis, int axisForPredicate)

  /**
   * Construct a StepPattern that doesn't test for node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   * @param axisForPredicate No longer used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  public StepPattern(int whatToShow, String namespace, String name, int axis,
                     int axisForPredicate)

  /**
   * Construct a StepPattern that tests for namespaces and node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param namespace The namespace to be tested.
   * @param name The local name to be tested.
   * @param axis The Axis for this test, one of of Axes.ANCESTORORSELF, etc.
   * @param axisForPredicate No longer used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
  protected int m_axis;

  /** The axis for this test. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/StepPattern.java
public class StepPattern extends NodeTest implements SubContextList, ExpressionOwner

/**
 * This class represents a single pattern match step.
 * @xsl.usage advanced
 */
