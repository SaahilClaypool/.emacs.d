_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected void reportWrongNumberArgs() throws WrongNumberArgsException {

  /**
   * Constructs and throws a WrongNumberArgException with the appropriate
   * message for this function object.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  public void checkNumberArgs(int argNum) throws WrongNumberArgsException

  /**
   * Check that the number of arguments passed to this function is correct.
   *
   * @param argNum The number of arguments that is being passed to the function.
   *
   * @throws WrongNumberArgsException if the number of arguments is not 0 or 1.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected double getArg0AsNumber(XPathContext xctxt)

  /**
   * Execute the first argument expression that is expected to return a
   * number.  If the argument is null, then get the number value from the
   * current context node.
   *
   * @param xctxt Runtime XPath context.
   *
   * @return The number value of the first argument, or the number value of the
   *         current context node if the first argument is null.
   *
   * @throws javax.xml.transform.TransformerException if an error occurs while
   *                                   executing the argument expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected XMLString getArg0AsString(XPathContext xctxt)

  /**
   * Execute the first argument expression that is expected to return a
   * string.  If the argument is null, then get the string value from the
   * current context node.
   *
   * @param xctxt Runtime XPath context.
   *
   * @return The string value of the first argument, or the string value of the
   *         current context node if the first argument is null.
   *
   * @throws javax.xml.transform.TransformerException if an error occurs while
   *                                   executing the argument expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  public boolean Arg0IsNodesetExpr()

  /**
   * Tell if the expression is a nodeset expression.
   * @return true if the expression can be represented as a nodeset.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected int getArg0AsNode(XPathContext xctxt)

  /**
   * Execute the first argument expression that is expected to return a
   * nodeset.  If the argument is null, then return the current context node.
   *
   * @param xctxt Runtime XPath context.
   *
   * @return The first node of the executed nodeset, or the current context
   *         node if the first argument is null.
   *
   * @throws javax.xml.transform.TransformerException if an error occurs while
   *                                   executing the argument expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
public class FunctionDef1Arg extends FunctionOneArg

/**
 * Base class for functions that accept one argument that can be defaulted if
 * not specified.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected void reportWrongNumberArgs() throws WrongNumberArgsException {

  /**
   * Constructs and throws a WrongNumberArgException with the appropriate
   * message for this function object.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  public void checkNumberArgs(int argNum) throws WrongNumberArgsException

  /**
   * Check that the number of arguments passed to this function is correct.
   *
   * @param argNum The number of arguments that is being passed to the function.
   *
   * @throws WrongNumberArgsException if the number of arguments is not 0 or 1.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected double getArg0AsNumber(XPathContext xctxt)

  /**
   * Execute the first argument expression that is expected to return a
   * number.  If the argument is null, then get the number value from the
   * current context node.
   *
   * @param xctxt Runtime XPath context.
   *
   * @return The number value of the first argument, or the number value of the
   *         current context node if the first argument is null.
   *
   * @throws javax.xml.transform.TransformerException if an error occurs while
   *                                   executing the argument expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected XMLString getArg0AsString(XPathContext xctxt)

  /**
   * Execute the first argument expression that is expected to return a
   * string.  If the argument is null, then get the string value from the
   * current context node.
   *
   * @param xctxt Runtime XPath context.
   *
   * @return The string value of the first argument, or the string value of the
   *         current context node if the first argument is null.
   *
   * @throws javax.xml.transform.TransformerException if an error occurs while
   *                                   executing the argument expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  public boolean Arg0IsNodesetExpr()

  /**
   * Tell if the expression is a nodeset expression.
   * @return true if the expression can be represented as a nodeset.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
  protected int getArg0AsNode(XPathContext xctxt)

  /**
   * Execute the first argument expression that is expected to return a
   * nodeset.  If the argument is null, then return the current context node.
   *
   * @param xctxt Runtime XPath context.
   *
   * @return The first node of the executed nodeset, or the current context
   *         node if the first argument is null.
   *
   * @throws javax.xml.transform.TransformerException if an error occurs while
   *                                   executing the argument expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/FunctionDef1Arg.java
public class FunctionDef1Arg extends FunctionOneArg

/**
 * Base class for functions that accept one argument that can be defaulted if
 * not specified.
 * @xsl.usage advanced
 */
