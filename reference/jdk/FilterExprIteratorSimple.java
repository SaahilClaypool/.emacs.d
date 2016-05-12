_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public void callPredicateVisitors(XPathVisitor visitor)

  /**
   * This will traverse the heararchy, calling the visitor for
   * each member.  If the called visitor method returns
   * false, the subtree should not be called.
   *
   * @param visitor The visitor whose appropriate method will be called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
    public Expression getExpression()

    /**
    * @see ExpressionOwner#getExpression()
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   * Warning: This can only be called after setRoot has been called!
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public void setInnerExpression(Expression expr)

  /**
   * Set the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public Expression getInnerExpression()

  /**
   * Get the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   *
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public static XNodeSet executeFilterExpr(int context, XPathContext xctxt,
                                                                                                PrefixResolver prefixResolver,
                                                                                                boolean isTopLevel,
                                                                                                int stackFrame,
                                                                                                Expression expr )

  /**
   * Execute the expression.  Meant for reuse by other FilterExpr iterators
   * that are not derived from this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public FilterExprIteratorSimple(Expression expr)

  /**
   * Create a FilterExprIteratorSimple object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public FilterExprIteratorSimple()

  /**
   * Create a FilterExprIteratorSimple object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  transient private XNodeSet m_exprObj;

  /** The result of executing m_expr.  Needs to be deep cloned on clone op.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  private Expression m_expr;

  /** The contained expression. Should be non-null.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
public class FilterExprIteratorSimple extends LocPathIterator

/**
 * Class to use for one-step iteration that doesn't have a predicate, and
 * doesn't need to set the context.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public void callPredicateVisitors(XPathVisitor visitor)

  /**
   * This will traverse the heararchy, calling the visitor for
   * each member.  If the called visitor method returns
   * false, the subtree should not be called.
   *
   * @param visitor The visitor whose appropriate method will be called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
    public Expression getExpression()

    /**
    * @see ExpressionOwner#getExpression()
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   * Warning: This can only be called after setRoot has been called!
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public void setInnerExpression(Expression expr)

  /**
   * Set the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public Expression getInnerExpression()

  /**
   * Get the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   *
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public static XNodeSet executeFilterExpr(int context, XPathContext xctxt,
                                                                                                PrefixResolver prefixResolver,
                                                                                                boolean isTopLevel,
                                                                                                int stackFrame,
                                                                                                Expression expr )

  /**
   * Execute the expression.  Meant for reuse by other FilterExpr iterators
   * that are not derived from this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public FilterExprIteratorSimple(Expression expr)

  /**
   * Create a FilterExprIteratorSimple object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  public FilterExprIteratorSimple()

  /**
   * Create a FilterExprIteratorSimple object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  transient private XNodeSet m_exprObj;

  /** The result of executing m_expr.  Needs to be deep cloned on clone op.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
  private Expression m_expr;

  /** The contained expression. Should be non-null.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprIteratorSimple.java
public class FilterExprIteratorSimple extends LocPathIterator

/**
 * Class to use for one-step iteration that doesn't have a predicate, and
 * doesn't need to set the context.
 */
