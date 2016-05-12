_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public Expression getOperand(){

  /** @return the operand of unary operation, as an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public abstract XObject operate(XObject right)

  /**
   * Apply the operation to two operands, and return the result.
   *
   *
   * @param right non-null reference to the evaluated right operand.
   *
   * @return non-null reference to the XObject that represents the result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException

  /**
   * Execute the operand and apply the unary operation to the result.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return An XObject that represents the result of applying the unary
   *         operation to the evaluated operand.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public void setRight(Expression r)

  /**
   * Set the expression operand for the operation.
   *
   *
   * @param r The expression operand to which the unary operation will be
   *          applied.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  protected Expression m_right;

  /** The operand for the operation.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
public abstract class UnaryOperation extends Expression implements ExpressionOwner

/**
 * The unary operation base class.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public Expression getOperand(){

  /** @return the operand of unary operation, as an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public abstract XObject operate(XObject right)

  /**
   * Apply the operation to two operands, and return the result.
   *
   *
   * @param right non-null reference to the evaluated right operand.
   *
   * @return non-null reference to the XObject that represents the result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException

  /**
   * Execute the operand and apply the unary operation to the result.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return An XObject that represents the result of applying the unary
   *         operation to the evaluated operand.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public void setRight(Expression r)

  /**
   * Set the expression operand for the operation.
   *
   *
   * @param r The expression operand to which the unary operation will be
   *          applied.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
  protected Expression m_right;

  /** The operand for the operation.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/UnaryOperation.java
public abstract class UnaryOperation extends Expression implements ExpressionOwner

/**
 * The unary operation base class.
 */
