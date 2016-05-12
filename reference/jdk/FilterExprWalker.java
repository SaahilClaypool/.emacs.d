_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
    public Expression getExpression()

      /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void setInnerExpression(Expression expr)

  /**
   * Set the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public Expression getInnerExpression()

  /**
   * Get the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  transient private XNodeSet m_exprObj;

  /** The result of executing m_expr.  Needs to be deep cloned on clone op.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  private Expression m_expr;

  /** The contained expression. Should be non-null.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the index of the last node that can be itterated to.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getNextNode()

  /**
   *  Moves the <code>TreeWalker</code> to the next visible node in document
   * order relative to the current node, and returns the new node. If the
   * current node has no next node,  or if the search for nextNode attempts
   * to step upward from the TreeWalker's root node, returns
   * <code>null</code> , and retains the current node.
   * @return  The new node, or <code>null</code> if the current node has no
   *   next node  in the TreeWalker's logical view.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public short acceptNode(int n)

  /**
   * This method needs to override AxesWalker.acceptNode because FilterExprWalkers
   * don't need to, and shouldn't, do a node test.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned FilterExprWalker.
   *
   * @return A new FilterExprWalker that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void setRoot(int root)

  /**
   *  Set the root node of the TreeWalker.
   *
   * @param root non-null reference to the root, or starting point of
   *        the query.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void init(Compiler compiler, int opPos, int stepType)

  /**
   * Init a FilterExprWalker.
   *
   * @param compiler non-null reference to the Compiler that is constructing.
   * @param opPos positive opcode position for this step.
   * @param stepType The type of step.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public FilterExprWalker(WalkingIterator locPathIterator)

  /**
   * Construct a FilterExprWalker using a LocPathIterator.
   *
   * @param locPathIterator non-null reference to the parent iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
public class FilterExprWalker extends AxesWalker

/**
 * Walker for the OP_VARIABLE, or OP_EXTFUNCTION, or OP_FUNCTION, or OP_GROUP,
 * op codes.
 * @see <a href="http://www.w3.org/TR/xpath#NT-FilterExpr">XPath FilterExpr descriptions</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
    public Expression getExpression()

      /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void setInnerExpression(Expression expr)

  /**
   * Set the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public Expression getInnerExpression()

  /**
   * Get the inner contained expression of this filter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  transient private XNodeSet m_exprObj;

  /** The result of executing m_expr.  Needs to be deep cloned on clone op.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  private Expression m_expr;

  /** The contained expression. Should be non-null.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the index of the last node that can be itterated to.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public int getNextNode()

  /**
   *  Moves the <code>TreeWalker</code> to the next visible node in document
   * order relative to the current node, and returns the new node. If the
   * current node has no next node,  or if the search for nextNode attempts
   * to step upward from the TreeWalker's root node, returns
   * <code>null</code> , and retains the current node.
   * @return  The new node, or <code>null</code> if the current node has no
   *   next node  in the TreeWalker's logical view.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public short acceptNode(int n)

  /**
   * This method needs to override AxesWalker.acceptNode because FilterExprWalkers
   * don't need to, and shouldn't, do a node test.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned FilterExprWalker.
   *
   * @return A new FilterExprWalker that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void setRoot(int root)

  /**
   *  Set the root node of the TreeWalker.
   *
   * @param root non-null reference to the root, or starting point of
   *        the query.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public void init(Compiler compiler, int opPos, int stepType)

  /**
   * Init a FilterExprWalker.
   *
   * @param compiler non-null reference to the Compiler that is constructing.
   * @param opPos positive opcode position for this step.
   * @param stepType The type of step.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
  public FilterExprWalker(WalkingIterator locPathIterator)

  /**
   * Construct a FilterExprWalker using a LocPathIterator.
   *
   * @param locPathIterator non-null reference to the parent iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/FilterExprWalker.java
public class FilterExprWalker extends AxesWalker

/**
 * Walker for the OP_VARIABLE, or OP_EXTFUNCTION, or OP_FUNCTION, or OP_GROUP,
 * op codes.
 * @see <a href="http://www.w3.org/TR/xpath#NT-FilterExpr">XPath FilterExpr descriptions</a>
 */
