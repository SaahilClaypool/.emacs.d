_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public String toString()

  /**
   * Return the name of the extesion function in string format
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public void exprSetParent(ExpressionNode n)

  /**
   * Set the parent node.
   * For an extension function, we also need to set the parent
   * node for all argument expressions.
   *
   * @param n The parent node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public void callArgVisitors(XPathVisitor visitor)

  /**
   * Call the visitors for the function arguments.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public void setArg(Expression arg, int argNum)

  /**
   * Set an argument expression for a function.  This method is called by the
   * XPath compiler.
   *
   * @param arg non-null expression that represents the argument.
   * @param argNum The argument number index.
   *
   * @throws WrongNumberArgsException If the argNum parameter is beyond what
   * is specified for this function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute the function.  The function must return
   * a valid object.
   * @param xctxt The current execution context.
   * @return A valid XObject.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public FuncExtFunction(java.lang.String namespace,
                         java.lang.String extensionName, Object methodKey)

  /**
   * Create a new FuncExtFunction based on the qualified name of the extension,
   * and a unique method key.
   *
   * @param namespace The namespace for the extension function, which should
   *                  not normally be null or empty.
   * @param extensionName The local name of the extension.
   * @param methodKey Unique method key, which is passed to
   *                  ExtensionsTable#extFunction in order to allow caching
   *                  of the method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public int getArgCount() {

  /**
   * Return the number of arguments that were passed
   * into this extension function.
   *
   * @return The number of arguments.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public Expression getArg(int n) {

  /**
   * Return the nth argument passed to the extension function.
   *
   * @param n The argument number index.
   * @return The Expression object at the given index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public Object getMethodKey()

  /**
   * Return the method key of the extension function.
   *
   * @return The method key of the extension function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public String getFunctionName()

  /**
   * Return the name of the extension function.
   *
   * @return The name of the extension function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public String getNamespace()

  /**
   * Return the namespace of the extension function.
   *
   * @return The namespace of the extension function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
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
   * NEEDSDOC @param globalsSize
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  Vector m_argVec = new Vector();

  /**
   * Array of static expressions which represent the parameters to the
   *  function.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  Object m_methodKey;

  /**
   * Unique method key, which is passed to ExtensionsTable#extFunction in
   *  order to allow caching of the method.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  String m_extensionName;

  /**
   * The local name of the extension.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  String m_namespace;

  /**
   * The namespace for the extension function, which should not normally
   *  be null or empty.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
public class FuncExtFunction extends Function

/**
 * An object of this class represents an extension call expression.  When
 * the expression executes, it calls ExtensionsTable#extFunction, and then
 * converts the result to the appropriate XObject.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public String toString()

  /**
   * Return the name of the extesion function in string format
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public void exprSetParent(ExpressionNode n)

  /**
   * Set the parent node.
   * For an extension function, we also need to set the parent
   * node for all argument expressions.
   *
   * @param n The parent node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public void callArgVisitors(XPathVisitor visitor)

  /**
   * Call the visitors for the function arguments.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public void setArg(Expression arg, int argNum)

  /**
   * Set an argument expression for a function.  This method is called by the
   * XPath compiler.
   *
   * @param arg non-null expression that represents the argument.
   * @param argNum The argument number index.
   *
   * @throws WrongNumberArgsException If the argNum parameter is beyond what
   * is specified for this function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute the function.  The function must return
   * a valid object.
   * @param xctxt The current execution context.
   * @return A valid XObject.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public FuncExtFunction(java.lang.String namespace,
                         java.lang.String extensionName, Object methodKey)

  /**
   * Create a new FuncExtFunction based on the qualified name of the extension,
   * and a unique method key.
   *
   * @param namespace The namespace for the extension function, which should
   *                  not normally be null or empty.
   * @param extensionName The local name of the extension.
   * @param methodKey Unique method key, which is passed to
   *                  ExtensionsTable#extFunction in order to allow caching
   *                  of the method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public int getArgCount() {

  /**
   * Return the number of arguments that were passed
   * into this extension function.
   *
   * @return The number of arguments.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public Expression getArg(int n) {

  /**
   * Return the nth argument passed to the extension function.
   *
   * @param n The argument number index.
   * @return The Expression object at the given index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public Object getMethodKey()

  /**
   * Return the method key of the extension function.
   *
   * @return The method key of the extension function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public String getFunctionName()

  /**
   * Return the name of the extension function.
   *
   * @return The name of the extension function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  public String getNamespace()

  /**
   * Return the namespace of the extension function.
   *
   * @return The namespace of the extension function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
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
   * NEEDSDOC @param globalsSize
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  Vector m_argVec = new Vector();

  /**
   * Array of static expressions which represent the parameters to the
   *  function.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  Object m_methodKey;

  /**
   * Unique method key, which is passed to ExtensionsTable#extFunction in
   *  order to allow caching of the method.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  String m_extensionName;

  /**
   * The local name of the extension.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
  String m_namespace;

  /**
   * The namespace for the extension function, which should not normally
   *  be null or empty.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FuncExtFunction.java
public class FuncExtFunction extends Function

/**
 * An object of this class represents an extension call expression.  When
 * the expression executes, it calls ExtensionsTable#extFunction, and then
 * converts the result to the appropriate XObject.
 * @xsl.usage advanced
 */
