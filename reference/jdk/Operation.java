_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/Operation.java
public interface Operation{

/** A generic class representing a function that takes a value and returns
 * a value.  This is a building block for property parsing.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public Expression getRightOperand(){

  /** @return the right operand of binary operation, as an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public Expression getLeftOperand(){

  /** @return the left operand of binary operation, as an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public XObject operate(XObject left, XObject right)

  /**
   * Apply the operation to two operands, and return the result.
   *
   *
   * @param left non-null reference to the evaluated left operand.
   * @param right non-null reference to the evaluated right operand.
   *
   * @return non-null reference to the XObject that represents the result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute a binary operation by calling execute on each of the operands,
   * and then calling the operate method on the derived class.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return The XObject result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public void setLeftRight(Expression l, Expression r)

  /**
   * Set the left and right operand expressions for this operation.
   *
   *
   * @param l The left expression operand.
   * @param r The right expression operand.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  protected Expression m_right;

  /** The right operand expression.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  protected Expression m_left;

  /** The left operand expression.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
public class Operation extends Expression implements ExpressionOwner

/**
 * The baseclass for a binary operation.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/Operation.java
public interface Operation{

/** A generic class representing a function that takes a value and returns
 * a value.  This is a building block for property parsing.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public Expression getRightOperand(){

  /** @return the right operand of binary operation, as an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public Expression getLeftOperand(){

  /** @return the left operand of binary operation, as an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public XObject operate(XObject left, XObject right)

  /**
   * Apply the operation to two operands, and return the result.
   *
   *
   * @param left non-null reference to the evaluated left operand.
   * @param right non-null reference to the evaluated right operand.
   *
   * @return non-null reference to the XObject that represents the result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute a binary operation by calling execute on each of the operands,
   * and then calling the operate method on the derived class.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return The XObject result of the operation.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public void setLeftRight(Expression l, Expression r)

  /**
   * Set the left and right operand expressions for this operation.
   *
   *
   * @param l The left expression operand.
   * @param r The right expression operand.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  protected Expression m_right;

  /** The right operand expression.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
  protected Expression m_left;

  /** The left operand expression.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Operation.java
public class Operation extends Expression implements ExpressionOwner

/**
 * The baseclass for a binary operation.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/Operation.java
    @Deprecated

    /**
     * Returns the string representation of the operation.
     * @deprecated no replacement
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/Operation.java
    @Deprecated

    /**
     * Returns the name of the method.
     * @return method name
     * @deprecated no replacement
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/Operation.java
    @Deprecated

    /**
     * Creates a new Operation object.
     * @param op method name
     * @deprecated no replacement
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/Operation.java
@Deprecated

/**
 * An <code>Operation</code> contains a description of a Java method.
 * <code>Operation</code> objects were used in JDK1.1 version stubs and
 * skeletons. The <code>Operation</code> class is not needed for 1.2 style
 * stubs (stubs generated with <code>rmic -v1.2</code>); hence, this class
 * is deprecated.
 *
 * @since JDK1.1
 * @deprecated no replacement
 */
