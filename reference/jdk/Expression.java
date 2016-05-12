_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public MethodType lookupPrimop(SymbolTable stable, String op,
                                   MethodType ctype) {

    /**
     * Search for a primop in the symbol table that matches the method type
     * <code>ctype</code>. Two methods match if they have the same arity.
     * If a primop is overloaded then the "closest match" is returned. The
     * first entry in the vector of primops that has the right arity is
     * considered to be the default one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void synthesize(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Synthesize a boolean expression, i.e., either push a 0 or 1 onto the
     * operand stack for the next statement to succeed. Returns the handle
     * of the instruction to be backpatched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void startIterator(ClassGenerator classGen,
                                   MethodGenerator methodGen) {

    /**
     * If this expression is of type node-set and it is not a variable
     * reference, then call setStartNode() passing the context node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void translateDesynthesized(ClassGenerator classGen,
                                       MethodGenerator methodGen) {

    /**
     * Redefined by expressions of type boolean that use flow lists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public final InstructionList compile(ClassGenerator classGen,
                                         MethodGenerator methodGen) {

    /**
     * Translate this node into a fresh instruction list.
     * The original instruction list is saved and restored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate this node into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check all the children of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public Object evaluateAtCompileTime() {

    /**
     * Returns an object representing the compile-time evaluation
     * of an expression. We are only using this for function-available
     * and element-available at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    protected FlowList _falseList = new FlowList();

    /**
     * Instruction handles that comprise the false list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    protected FlowList _trueList = new FlowList();

    /**
     * Instruction handles that comprise the true list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
abstract class Expression extends SyntaxTreeNode {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int getColumnNumber()

  /**
   * Return the character position where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the column number
   * in the document entity or external parsed entity where the
   * markup that triggered the event appears.</p>
   *
   * @return The column number, or -1 if none is available.
   * @see #getLineNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int getLineNumber()

  /**
   * Return the line number where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the line number
   * in the document entity or external parsed entity where the
   * markup that triggered the event appears.</p>
   *
   * @return The line number, or -1 if none is available.
   * @see #getColumnNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public String getSystemId()

  /**
   * Return the system identifier for the current document event.
   *
   * <p>The return value is the system identifier of the document
   * entity or of the external parsed entity in which the markup that
   * triggered the event appears.</p>
   *
   * <p>If the system identifier is a URL, the parser must resolve it
   * fully before passing it to the application.</p>
   *
   * @return A string containing the system identifier, or null
   *         if none is available.
   * @see #getPublicId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public String getPublicId()

  /**
   * Return the public identifier for the current document event.
   *
   * <p>The return value is the public identifier of the document
   * entity or of the external parsed entity in which the markup that
   * triggered the event appears.</p>
   *
   * @return A string containing the public identifier, or
   *         null if none is available.
   * @see #getSystemId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int exprGetNumChildren()

  /** Return the number of children the node has. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public ExpressionNode exprGetChild(int i)

  /** This method returns a child node.  The children are numbered
     from zero, left to right. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void exprAddChild(ExpressionNode n, int i)

  /** This method tells the node to add its argument to the node's
    list of children.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void exprSetParent(ExpressionNode n)

  /** This pair of methods are used to inform the node of its
    parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public ExpressionNode getExpressionOwner()

  /**
   * Get the first non-Expression parent of this node.
   * @return null or first ancestor that is not an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void error(XPathContext xctxt, String msg, Object[] args)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param xctxt The XPath runtime context.
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void assertion(boolean b, java.lang.String msg)

  /**
   * Tell the user of an assertion error, and probably throw an
   * exception.
   *
   * @param b  If false, a runtime exception will be thrown.
   * @param msg The assertion message, which should be informative.
   *
   * @throws RuntimeException if the b argument is false.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void warn(XPathContext xctxt, String msg, Object[] args)

  /**
   * Warn the user of an problem.
   *
   * @param xctxt The XPath runtime context.
   * @param msg An error msgkey that corresponds to one of the conststants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  protected final boolean isSameClass(Expression expr)

  /**
   * This is a utility method to tell if the passed in
   * class is the same class as this.  It is to be used by
   * the deepEquals method.  I'm bottlenecking it here
   * because I'm not totally confident that comparing the
   * class objects is the best way to do this.
   * @return true of the passed in class is the exact same
   * class as this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public abstract boolean deepEquals(Expression expr);

  /**
   * Compare this object with another object and see
   * if they are equal, include the sub heararchy.
   *
   * @param expr Another expression object.
   * @return true if this objects class and the expr
   * object's class are the same, and the data contained
   * within both objects are considered equal.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public abstract void fixupVariables(java.util.Vector vars, int globalsSize);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean isStableNumber()

  /**
   * Tell if this expression returns a stable number that will not change during
   * iterations within the expression.  This is used to determine if a proximity
   * position predicate can indicate that no more searching has to occur.
   *
   *
   * @return true if the expression represents a stable number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void executeCharsToContentHandler(
          XPathContext xctxt, ContentHandler handler)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * NEEDSDOC @param handler
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public DTMIterator asIteratorRaw(XPathContext xctxt, int contextNode)

  /**
   * Given an select expression and a context, evaluate the XPath
   * and return the resulting iterator, but do not clone.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   *
   *
   * @return A valid DTMIterator.
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public DTMIterator asIterator(XPathContext xctxt, int contextNode)

  /**
   * Given an select expression and a context, evaluate the XPath
   * and return the resulting iterator.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   *
   *
   * @return A valid DTMIterator.
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int asNode(XPathContext xctxt)

  /**
   * Return the first node out of the nodeset, if this expression is
   * a nodeset expression.
   * @param xctxt The XPath runtime context.
   * @return the first node out of the nodeset, or DTM.NULL.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean isNodesetExpr()

  /**
   * Tell if the expression is a nodeset expression.  In other words, tell
   * if you can execute {@link #asNode(XPathContext) asNode} without an exception.
   * @return true if the expression can be represented as a nodeset.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public XMLString xstr(XPathContext xctxt)

  /**
   * Cast result object to a string.
   *
   *
   * @param xctxt The XPath runtime context.
   * @return The string this wraps or the empty string if null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean bool(XPathContext xctxt)

  /**
   * Evaluate expression to a boolean.
   *
   *
   * @param xctxt The XPath runtime context.
   * @return false
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public double num(XPathContext xctxt)

  /**
   * Evaluate expression to a number.
   *
   *
   * @param xctxt The XPath runtime context.
   * @return The expression evaluated as a double.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public XObject execute(XPathContext xctxt, boolean destructiveOK)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression, but tell that a "safe" object doesn't have
   * to be returned.  The default implementation just calls execute(xctxt).
   *
   *
   * @param xctxt The XPath runtime context.
   * @param destructiveOK true if a "safe" object doesn't need to be returned.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public abstract XObject execute(XPathContext xctxt)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public XObject execute(XPathContext xctxt, int currentNode)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param currentNode The currentNode.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
//  public void setSourceLocator(SourceLocator locator)

//  /**
//   * Set the location where this expression was built from.
//   *
//   *
//   * @param locator the location where this expression was built from, may be
//   *                null.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  private ExpressionNode m_parent;

  /**
   * The location where this expression was built from.  Need for diagnostic
   *  messages. May be null.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
public abstract class Expression implements java.io.Serializable, ExpressionNode, XPathVisitable

/**
 * This abstract class serves as the base for all expression objects.  An
 * Expression can be executed to return a {@link com.sun.org.apache.xpath.internal.objects.XObject},
 * normally has a location within a document or DOM, can send error and warning
 * events, and normally do not hold state and are meant to be immutable once
 * construction has completed.  An exception to the immutibility rule is iterators
 * and walkers, which must be cloned in order to be used -- the original must
 * still be immutable.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public String toString() {

    /**
     * Prints the value of this expression using a Java-style syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public void setValue(Object value) {

    /**
     * Sets the value of this expression to <code>value</code>.
     * This value will be returned by the getValue method
     * without calling the method associated with this
     * expression.
     *
     * @param value The value of this expression.
     *
     * @see #getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public Object getValue() throws Exception {

    /**
     * If the value property of this instance is not already set,
     * this method dynamically finds the method with the specified
     * methodName on this target with these arguments and calls it.
     * The result of the method invocation is first copied
     * into the value property of this expression and then returned
     * as the result of <code>getValue</code>. If the value property
     * was already set, either by a call to <code>setValue</code>
     * or a previous call to <code>getValue</code> then the value
     * property is returned without either looking up or calling the method.
     * <p>
     * The value property of an <code>Expression</code> is set to
     * a unique private (non-<code>null</code>) value by default and
     * this value is used as an internal indication that the method
     * has not yet been called. A return value of <code>null</code>
     * replaces this default value in the same way that any other value
     * would, ensuring that expressions are never evaluated more than once.
     * <p>
     * See the <code>execute</code> method for details on how
     * methods are chosen using the dynamic types of the target
     * and arguments.
     *
     * @see Statement#execute
     * @see #setValue
     *
     * @return The result of applying this method to these arguments.
     * @throws Exception if the method with the specified methodName
     * throws an exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    @Override

    /**
     * {@inheritDoc}
     * <p>
     * If the invoked method completes normally,
     * the value it returns is copied in the {@code value} property.
     * Note that the {@code value} property is set to {@code null},
     * if the return type of the underlying method is {@code void}.
     *
     * @throws NullPointerException if the value of the {@code target} or
     *                              {@code methodName} property is {@code null}
     * @throws NoSuchMethodException if a matching method is not found
     * @throws SecurityException if a security manager exists and
     *                           it denies the method invocation
     * @throws Exception that is thrown by the invoked method
     *
     * @see java.lang.reflect.Method
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public Expression(Object value, Object target, String methodName, Object[] arguments) {

    /**
     * Creates a new {@link Expression} object with the specified value
     * for the specified target object to invoke the  method
     * specified by the name and by the array of arguments.
     * The {@code value} value is used as the value of the {@code value} property,
     * so the {@link #getValue} method will return it
     * without executing this {@code Expression}.
     * <p>
     * The {@code target} and the {@code methodName} values should not be {@code null}.
     * Otherwise an attempt to execute this {@code Expression}
     * will result in a {@code NullPointerException}.
     * If the {@code arguments} value is {@code null},
     * an empty array is used as the value of the {@code arguments} property.
     *
     * @param value  the value of this expression
     * @param target  the target object of this expression
     * @param methodName  the name of the method to invoke on the specified target
     * @param arguments  the array of arguments to invoke the specified method
     *
     * @see #setValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    @ConstructorProperties({"target", "methodName", "arguments"})

    /**
     * Creates a new {@link Expression} object
     * for the specified target object to invoke the method
     * specified by the name and by the array of arguments.
     * <p>
     * The {@code target} and the {@code methodName} values should not be {@code null}.
     * Otherwise an attempt to execute this {@code Expression}
     * will result in a {@code NullPointerException}.
     * If the {@code arguments} value is {@code null},
     * an empty array is used as the value of the {@code arguments} property.
     *
     * @param target  the target object of this expression
     * @param methodName  the name of the method to invoke on the specified target
     * @param arguments  the array of arguments to invoke the specified method
     *
     * @see #getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
public class Expression extends Statement {

/**
 * An <code>Expression</code> object represents a primitive expression
 * in which a single method is applied to a target and a set of
 * arguments to return a result - as in <code>"a.getFoo()"</code>.
 * <p>
 * In addition to the properties of the super class, the
 * <code>Expression</code> object provides a <em>value</em> which
 * is the object returned when this expression is evaluated.
 * The return value is typically not provided by the caller and
 * is instead computed by dynamically finding the method and invoking
 * it when the first call to <code>getValue</code> is made.
 *
 * @see #getValue
 * @see #setValue
 *
 * @since 1.4
 *
 * @author Philip Milne
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public MethodType lookupPrimop(SymbolTable stable, String op,
                                   MethodType ctype) {

    /**
     * Search for a primop in the symbol table that matches the method type
     * <code>ctype</code>. Two methods match if they have the same arity.
     * If a primop is overloaded then the "closest match" is returned. The
     * first entry in the vector of primops that has the right arity is
     * considered to be the default one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void synthesize(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Synthesize a boolean expression, i.e., either push a 0 or 1 onto the
     * operand stack for the next statement to succeed. Returns the handle
     * of the instruction to be backpatched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void startIterator(ClassGenerator classGen,
                                   MethodGenerator methodGen) {

    /**
     * If this expression is of type node-set and it is not a variable
     * reference, then call setStartNode() passing the context node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void translateDesynthesized(ClassGenerator classGen,
                                       MethodGenerator methodGen) {

    /**
     * Redefined by expressions of type boolean that use flow lists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public final InstructionList compile(ClassGenerator classGen,
                                         MethodGenerator methodGen) {

    /**
     * Translate this node into a fresh instruction list.
     * The original instruction list is saved and restored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate this node into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check all the children of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    public Object evaluateAtCompileTime() {

    /**
     * Returns an object representing the compile-time evaluation
     * of an expression. We are only using this for function-available
     * and element-available at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    protected FlowList _falseList = new FlowList();

    /**
     * Instruction handles that comprise the false list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
    protected FlowList _trueList = new FlowList();

    /**
     * Instruction handles that comprise the true list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Expression.java
abstract class Expression extends SyntaxTreeNode {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int getColumnNumber()

  /**
   * Return the character position where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the column number
   * in the document entity or external parsed entity where the
   * markup that triggered the event appears.</p>
   *
   * @return The column number, or -1 if none is available.
   * @see #getLineNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int getLineNumber()

  /**
   * Return the line number where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the line number
   * in the document entity or external parsed entity where the
   * markup that triggered the event appears.</p>
   *
   * @return The line number, or -1 if none is available.
   * @see #getColumnNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public String getSystemId()

  /**
   * Return the system identifier for the current document event.
   *
   * <p>The return value is the system identifier of the document
   * entity or of the external parsed entity in which the markup that
   * triggered the event appears.</p>
   *
   * <p>If the system identifier is a URL, the parser must resolve it
   * fully before passing it to the application.</p>
   *
   * @return A string containing the system identifier, or null
   *         if none is available.
   * @see #getPublicId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public String getPublicId()

  /**
   * Return the public identifier for the current document event.
   *
   * <p>The return value is the public identifier of the document
   * entity or of the external parsed entity in which the markup that
   * triggered the event appears.</p>
   *
   * @return A string containing the public identifier, or
   *         null if none is available.
   * @see #getSystemId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int exprGetNumChildren()

  /** Return the number of children the node has. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public ExpressionNode exprGetChild(int i)

  /** This method returns a child node.  The children are numbered
     from zero, left to right. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void exprAddChild(ExpressionNode n, int i)

  /** This method tells the node to add its argument to the node's
    list of children.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void exprSetParent(ExpressionNode n)

  /** This pair of methods are used to inform the node of its
    parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public ExpressionNode getExpressionOwner()

  /**
   * Get the first non-Expression parent of this node.
   * @return null or first ancestor that is not an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void error(XPathContext xctxt, String msg, Object[] args)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param xctxt The XPath runtime context.
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void assertion(boolean b, java.lang.String msg)

  /**
   * Tell the user of an assertion error, and probably throw an
   * exception.
   *
   * @param b  If false, a runtime exception will be thrown.
   * @param msg The assertion message, which should be informative.
   *
   * @throws RuntimeException if the b argument is false.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void warn(XPathContext xctxt, String msg, Object[] args)

  /**
   * Warn the user of an problem.
   *
   * @param xctxt The XPath runtime context.
   * @param msg An error msgkey that corresponds to one of the conststants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  protected final boolean isSameClass(Expression expr)

  /**
   * This is a utility method to tell if the passed in
   * class is the same class as this.  It is to be used by
   * the deepEquals method.  I'm bottlenecking it here
   * because I'm not totally confident that comparing the
   * class objects is the best way to do this.
   * @return true of the passed in class is the exact same
   * class as this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public abstract boolean deepEquals(Expression expr);

  /**
   * Compare this object with another object and see
   * if they are equal, include the sub heararchy.
   *
   * @param expr Another expression object.
   * @return true if this objects class and the expr
   * object's class are the same, and the data contained
   * within both objects are considered equal.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public abstract void fixupVariables(java.util.Vector vars, int globalsSize);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean isStableNumber()

  /**
   * Tell if this expression returns a stable number that will not change during
   * iterations within the expression.  This is used to determine if a proximity
   * position predicate can indicate that no more searching has to occur.
   *
   *
   * @return true if the expression represents a stable number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public void executeCharsToContentHandler(
          XPathContext xctxt, ContentHandler handler)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * NEEDSDOC @param handler
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public DTMIterator asIteratorRaw(XPathContext xctxt, int contextNode)

  /**
   * Given an select expression and a context, evaluate the XPath
   * and return the resulting iterator, but do not clone.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   *
   *
   * @return A valid DTMIterator.
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public DTMIterator asIterator(XPathContext xctxt, int contextNode)

  /**
   * Given an select expression and a context, evaluate the XPath
   * and return the resulting iterator.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   *
   *
   * @return A valid DTMIterator.
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public int asNode(XPathContext xctxt)

  /**
   * Return the first node out of the nodeset, if this expression is
   * a nodeset expression.
   * @param xctxt The XPath runtime context.
   * @return the first node out of the nodeset, or DTM.NULL.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean isNodesetExpr()

  /**
   * Tell if the expression is a nodeset expression.  In other words, tell
   * if you can execute {@link #asNode(XPathContext) asNode} without an exception.
   * @return true if the expression can be represented as a nodeset.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public XMLString xstr(XPathContext xctxt)

  /**
   * Cast result object to a string.
   *
   *
   * @param xctxt The XPath runtime context.
   * @return The string this wraps or the empty string if null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean bool(XPathContext xctxt)

  /**
   * Evaluate expression to a boolean.
   *
   *
   * @param xctxt The XPath runtime context.
   * @return false
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public double num(XPathContext xctxt)

  /**
   * Evaluate expression to a number.
   *
   *
   * @param xctxt The XPath runtime context.
   * @return The expression evaluated as a double.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public XObject execute(XPathContext xctxt, boolean destructiveOK)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression, but tell that a "safe" object doesn't have
   * to be returned.  The default implementation just calls execute(xctxt).
   *
   *
   * @param xctxt The XPath runtime context.
   * @param destructiveOK true if a "safe" object doesn't need to be returned.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public abstract XObject execute(XPathContext xctxt)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public XObject execute(XPathContext xctxt, int currentNode)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param currentNode The currentNode.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
//  public void setSourceLocator(SourceLocator locator)

//  /**
//   * Set the location where this expression was built from.
//   *
//   *
//   * @param locator the location where this expression was built from, may be
//   *                null.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
  private ExpressionNode m_parent;

  /**
   * The location where this expression was built from.  Need for diagnostic
   *  messages. May be null.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Expression.java
public abstract class Expression implements java.io.Serializable, ExpressionNode, XPathVisitable

/**
 * This abstract class serves as the base for all expression objects.  An
 * Expression can be executed to return a {@link com.sun.org.apache.xpath.internal.objects.XObject},
 * normally has a location within a document or DOM, can send error and warning
 * events, and normally do not hold state and are meant to be immutable once
 * construction has completed.  An exception to the immutibility rule is iterators
 * and walkers, which must be cloned in order to be used -- the original must
 * still be immutable.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public String toString() {

    /**
     * Prints the value of this expression using a Java-style syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public void setValue(Object value) {

    /**
     * Sets the value of this expression to <code>value</code>.
     * This value will be returned by the getValue method
     * without calling the method associated with this
     * expression.
     *
     * @param value The value of this expression.
     *
     * @see #getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public Object getValue() throws Exception {

    /**
     * If the value property of this instance is not already set,
     * this method dynamically finds the method with the specified
     * methodName on this target with these arguments and calls it.
     * The result of the method invocation is first copied
     * into the value property of this expression and then returned
     * as the result of <code>getValue</code>. If the value property
     * was already set, either by a call to <code>setValue</code>
     * or a previous call to <code>getValue</code> then the value
     * property is returned without either looking up or calling the method.
     * <p>
     * The value property of an <code>Expression</code> is set to
     * a unique private (non-<code>null</code>) value by default and
     * this value is used as an internal indication that the method
     * has not yet been called. A return value of <code>null</code>
     * replaces this default value in the same way that any other value
     * would, ensuring that expressions are never evaluated more than once.
     * <p>
     * See the <code>execute</code> method for details on how
     * methods are chosen using the dynamic types of the target
     * and arguments.
     *
     * @see Statement#execute
     * @see #setValue
     *
     * @return The result of applying this method to these arguments.
     * @throws Exception if the method with the specified methodName
     * throws an exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    @Override

    /**
     * {@inheritDoc}
     * <p>
     * If the invoked method completes normally,
     * the value it returns is copied in the {@code value} property.
     * Note that the {@code value} property is set to {@code null},
     * if the return type of the underlying method is {@code void}.
     *
     * @throws NullPointerException if the value of the {@code target} or
     *                              {@code methodName} property is {@code null}
     * @throws NoSuchMethodException if a matching method is not found
     * @throws SecurityException if a security manager exists and
     *                           it denies the method invocation
     * @throws Exception that is thrown by the invoked method
     *
     * @see java.lang.reflect.Method
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    public Expression(Object value, Object target, String methodName, Object[] arguments) {

    /**
     * Creates a new {@link Expression} object with the specified value
     * for the specified target object to invoke the  method
     * specified by the name and by the array of arguments.
     * The {@code value} value is used as the value of the {@code value} property,
     * so the {@link #getValue} method will return it
     * without executing this {@code Expression}.
     * <p>
     * The {@code target} and the {@code methodName} values should not be {@code null}.
     * Otherwise an attempt to execute this {@code Expression}
     * will result in a {@code NullPointerException}.
     * If the {@code arguments} value is {@code null},
     * an empty array is used as the value of the {@code arguments} property.
     *
     * @param value  the value of this expression
     * @param target  the target object of this expression
     * @param methodName  the name of the method to invoke on the specified target
     * @param arguments  the array of arguments to invoke the specified method
     *
     * @see #setValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
    @ConstructorProperties({"target", "methodName", "arguments"})

    /**
     * Creates a new {@link Expression} object
     * for the specified target object to invoke the method
     * specified by the name and by the array of arguments.
     * <p>
     * The {@code target} and the {@code methodName} values should not be {@code null}.
     * Otherwise an attempt to execute this {@code Expression}
     * will result in a {@code NullPointerException}.
     * If the {@code arguments} value is {@code null},
     * an empty array is used as the value of the {@code arguments} property.
     *
     * @param target  the target object of this expression
     * @param methodName  the name of the method to invoke on the specified target
     * @param arguments  the array of arguments to invoke the specified method
     *
     * @see #getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Expression.java
public class Expression extends Statement {

/**
 * An <code>Expression</code> object represents a primitive expression
 * in which a single method is applied to a target and a set of
 * arguments to return a result - as in <code>"a.getFoo()"</code>.
 * <p>
 * In addition to the properties of the super class, the
 * <code>Expression</code> object provides a <em>value</em> which
 * is the object returned when this expression is evaluated.
 * The return value is typically not provided by the caller and
 * is instead computed by dynamically finding the method and invoking
 * it when the first call to <code>getValue</code> is made.
 *
 * @see #getValue
 * @see #setValue
 *
 * @since 1.4
 *
 * @author Philip Milne
 */
