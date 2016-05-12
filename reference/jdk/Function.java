_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void postCompileStep(Compiler compiler)

  /**
   * This function is currently only being used by Position()
   * and Last(). See respective functions for more detail.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void callArgVisitors(XPathVisitor visitor)

  /**
   * Call the visitors for the function arguments.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException

  /**
   * Execute an XPath function object.  The function must return
   * a valid object.
   * @param xctxt The execution current context.
   * @return A valid XObject.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  protected void reportWrongNumberArgs() throws WrongNumberArgsException {

  /**
   * Constructs and throws a WrongNumberArgException with the appropriate
   * message for this function object.  This method is meant to be overloaded
   * by derived classes so that the message will be as specific as possible.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void checkNumberArgs(int argNum) throws WrongNumberArgsException

  /**
   * Check that the number of arguments passed to this function is correct.
   * This method is meant to be overloaded by derived classes, to check for
   * the number of arguments for a specific function type.  This method is
   * called by the compiler for static number of arguments checking.
   *
   * @param argNum The number of arguments that is being passed to the function.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
public abstract class Function extends Expression

/**
 * This is a superclass of all XPath functions.  This allows two
 * ways for the class to be called. One method is that the
 * super class processes the arguments and hands the results to
 * the derived class, the other method is that the derived
 * class may process it's own arguments, which is faster since
 * the arguments don't have to be added to an array, but causes
 * a larger code footprint.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void postCompileStep(Compiler compiler)

  /**
   * This function is currently only being used by Position()
   * and Last(). See respective functions for more detail.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void callArgVisitors(XPathVisitor visitor)

  /**
   * Call the visitors for the function arguments.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException

  /**
   * Execute an XPath function object.  The function must return
   * a valid object.
   * @param xctxt The execution current context.
   * @return A valid XObject.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  protected void reportWrongNumberArgs() throws WrongNumberArgsException {

  /**
   * Constructs and throws a WrongNumberArgException with the appropriate
   * message for this function object.  This method is meant to be overloaded
   * by derived classes so that the message will be as specific as possible.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
  public void checkNumberArgs(int argNum) throws WrongNumberArgsException

  /**
   * Check that the number of arguments passed to this function is correct.
   * This method is meant to be overloaded by derived classes, to check for
   * the number of arguments for a specific function type.  This method is
   * called by the compiler for static number of arguments checking.
   *
   * @param argNum The number of arguments that is being passed to the function.
   *
   * @throws WrongNumberArgsException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/functions/Function.java
public abstract class Function extends Expression

/**
 * This is a superclass of all XPath functions.  This allows two
 * ways for the class to be called. One method is that the
 * super class processes the arguments and hands the results to
 * the derived class, the other method is that the derived
 * class may process it's own arguments, which is faster since
 * the arguments don't have to be added to an array, but causes
 * a larger code footprint.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Function.java
    static <T> Function<T, T> identity() {

    /**
     * Returns a function that always returns its input argument.
     *
     * @param <T> the type of the input and output objects to the function
     * @return a function that always returns its input argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Function.java
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {

    /**
     * Returns a composed function that first applies this function to
     * its input, and then applies the {@code after} function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V> the type of output of the {@code after} function, and of the
     *           composed function
     * @param after the function to apply after this function is applied
     * @return a composed function that first applies this function and then
     * applies the {@code after} function
     * @throws NullPointerException if after is null
     *
     * @see #compose(Function)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Function.java
    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {

    /**
     * Returns a composed function that first applies the {@code before}
     * function to its input, and then applies this function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V> the type of input to the {@code before} function, and to the
     *           composed function
     * @param before the function to apply before this function is applied
     * @return a composed function that first applies the {@code before}
     * function and then applies this function
     * @throws NullPointerException if before is null
     *
     * @see #andThen(Function)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Function.java
    R apply(T t);

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Function.java
@FunctionalInterface

/**
 * Represents a function that accepts one argument and produces a result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object)}.
 *
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 *
 * @since 1.8
 */
