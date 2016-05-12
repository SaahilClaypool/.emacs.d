_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public void callArgVisitors(XPathVisitor visitor)

    /**
     * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  protected void reportWrongNumberArgs() throws WrongNumberArgsException {

  /**
   * Constructs and throws a WrongNumberArgException with the appropriate
   * message for this function object.  This class supports an arbitrary
   * number of arguments, so this method must never be called.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public void checkNumberArgs(int argNum) throws WrongNumberArgsException{}

  /**
   * Check that the number of arguments passed to this function is correct.
   *
   *
   * @param argNum The number of arguments that is being passed to the function.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public void setArg(Expression arg, int argNum)

  /**
   * Set an argument expression for a function.  This method is called by the
   * XPath compiler.
   *
   * @param arg non-null expression that represents the argument.
   * @param argNum The argument number index.
   *
   * @throws WrongNumberArgsException If a derived class determines that the
   * number of arguments is incorrect.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public Expression[] getArgs()

  /**
   * Return an expression array containing arguments at index 3 or greater.
   *
   * @return An array that contains the arguments at index 3 or greater.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  Expression[] m_args;

  /** Argument expressions that are at index 3 or greater.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
public class FunctionMultiArgs extends Function3Args

/**
 * Base class for functions that accept an undetermined number of multiple
 * arguments.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public void callArgVisitors(XPathVisitor visitor)

    /**
     * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  protected void reportWrongNumberArgs() throws WrongNumberArgsException {

  /**
   * Constructs and throws a WrongNumberArgException with the appropriate
   * message for this function object.  This class supports an arbitrary
   * number of arguments, so this method must never be called.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public void checkNumberArgs(int argNum) throws WrongNumberArgsException{}

  /**
   * Check that the number of arguments passed to this function is correct.
   *
   *
   * @param argNum The number of arguments that is being passed to the function.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public void setArg(Expression arg, int argNum)

  /**
   * Set an argument expression for a function.  This method is called by the
   * XPath compiler.
   *
   * @param arg non-null expression that represents the argument.
   * @param argNum The argument number index.
   *
   * @throws WrongNumberArgsException If a derived class determines that the
   * number of arguments is incorrect.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  public Expression[] getArgs()

  /**
   * Return an expression array containing arguments at index 3 or greater.
   *
   * @return An array that contains the arguments at index 3 or greater.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
  Expression[] m_args;

  /** Argument expressions that are at index 3 or greater.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionMultiArgs.java
public class FunctionMultiArgs extends Function3Args

/**
 * Base class for functions that accept an undetermined number of multiple
 * arguments.
 * @xsl.usage advanced
 */
