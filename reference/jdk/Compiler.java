_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private FunctionTable m_functionTable;

  /**
   * The FunctionTable for all xpath build-in functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  SourceLocator m_locator;

  /** The source locator for the expression being compiled.  May be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  ErrorListener m_errorHandler;

  /** The error listener where errors will be sent.  If this is null, errors
   *  and warnings will be sent to System.err.  May be null.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void setNamespaceContext(PrefixResolver pr)

  /**
   * Set the current namespace context for the xpath.
   *
   * @param pr The resolver for prefixes in the XPath expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public PrefixResolver getNamespaceContext()

  /**
   * Get the current namespace context for the xpath.
   *
   * @return The current prefix resolver, *may* be null, though hopefully not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private PrefixResolver m_currentPrefixResolver = null;

  /**
   * The current prefixResolver for the execution context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void error(String msg, Object[] args) throws TransformerException

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void assertion(boolean b, java.lang.String msg)

  /**
   * Tell the user of an assertion error, and probably throw an
   * exception.
   *
   * @param b  If false, a runtime exception will be thrown.
   * @param msg The assertion message, which should be informative.
   *
   * @throws RuntimeException if the b argument is false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void warn(String msg, Object[] args) throws TransformerException

  /**
   * Warn the user of an problem.
   *
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private Expression compileExtension(int opPos)

  /**
   * Compile an extension function.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.functions.FuncExtFunction} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  synchronized private long getNextMethodId()

  /**
   * Get the next available method id
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
      if (func instanceof FuncExtFunctionAvailable)

      /**
       * It is a trick for function-available. Since the function table is an
       * instance field, insert this table at compilation time for later usage
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  Expression compileFunction(int opPos) throws TransformerException

  /**
   * Compile a built-in XPath function.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.functions.Function} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private void compilePredicates(int opPos, Expression[] predicates)

  /**
   * Compiles predicates in the step.
   *
   * @param opPos The position of the first predicate the m_opMap array.
   * @param predicates An empty pre-determined array of
   *            {@link com.sun.org.apache.xpath.internal.Expression}s, that will be filled in.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public int countPredicates(int opPos) throws TransformerException

  /**
   * Count the number of predicates in the step.
   *
   * @param opPos The position of the first predicate the m_opMap array.
   *
   * @return The number of predicates for this step.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression[] getCompiledPredicates(int opPos)

  /**
   * Compile a zero or more predicates for a given match pattern.
   *
   * @param opPos The position of the first predicate the m_opMap array.
   *
   * @return reference to array of {@link com.sun.org.apache.xpath.internal.Expression} instances.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected StepPattern stepPattern(
          int opPos, int stepCount, StepPattern ancestorPattern)

  /**
   * Compile a step pattern unit expression, used for both location paths
   * and match patterns.
   *
   * @param opPos The current position in the m_opMap array.
   * @param stepCount The number of steps to expect.
   * @param ancestorPattern The owning StepPattern, which may be null.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.patterns.StepPattern} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public int getWhatToShow(int opPos)

  /**
   * Get a {@link org.w3c.dom.traversal.NodeFilter} bit set that tells what
   * to show for a given node test.
   *
   * @param opPos the op map position for the location step.
   *
   * @return {@link org.w3c.dom.traversal.NodeFilter} bit set that tells what
   *         to show for a given node test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression locationPathPattern(int opPos)

  /**
   * Compile a location match pattern unit expression.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.patterns.StepPattern} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression matchPattern(int opPos) throws TransformerException

  /**
   * Compile an entire match pattern expression.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.patterns.UnionPattern} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression predicate(int opPos) throws TransformerException

  /**
   * Compile a location step predicate expression.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return the contained predicate expression.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression locationPath(int opPos) throws TransformerException

  /**
   * Compile a location path.  The LocPathIterator itself may create
   * {@link com.sun.org.apache.xpath.internal.axes.AxesWalker} children.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.axes.LocPathIterator} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  FunctionTable getFunctionTable()

  /**
   * Get the function table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public int getLocationPathDepth()

  /**
   * Get the level of the location path or union being constructed.
   * @return 0 if it is a top-level path.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression union(int opPos) throws TransformerException

  /**
   * Compile a location path union. The UnionPathIterator itself may create
   * {@link com.sun.org.apache.xpath.internal.axes.LocPathIterator} children.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.axes.LocPathIterator} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression arg(int opPos) throws TransformerException

  /**
   * Compile a function argument.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to the argument expression.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression group(int opPos) throws TransformerException

  /**
   * Compile an expression group.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to the contained expression.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression variable(int opPos) throws TransformerException

  /**
   * Compile a variable reference.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Variable} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression numberlit(int opPos)

  /**
   * Compile a literal number value.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.objects.XNumber} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression literal(int opPos)

  /**
   * Compile a literal string value.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.objects.XString} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression number(int opPos) throws TransformerException

  /**
   * Compile a 'number(...)' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Number} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression bool(int opPos) throws TransformerException

  /**
   * Compile a 'boolean(...)' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Bool} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression string(int opPos) throws TransformerException

  /**
   * Compile a 'string(...)' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.String} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression neg(int opPos) throws TransformerException

  /**
   * Compile a unary '-' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Neg} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression mod(int opPos) throws TransformerException

  /**
   * Compile a 'mod' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Mod} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression div(int opPos) throws TransformerException

  /**
   * Compile a 'div' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Div} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression mult(int opPos) throws TransformerException

  /**
   * Compile a '*' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Mult} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression minus(int opPos) throws TransformerException

  /**
   * Compile a '-' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Minus} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression plus(int opPos) throws TransformerException

  /**
   * Compile a '+' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Plus} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression gt(int opPos) throws TransformerException

  /**
   * Compile a '>' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Gt} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression gte(int opPos) throws TransformerException

  /**
   * Compile a '>=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Gte} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression lt(int opPos) throws TransformerException

  /**
   * Compile a '<' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Lt} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression lte(int opPos) throws TransformerException

  /**
   * Compile a '<=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Lte} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression equals(int opPos) throws TransformerException

  /**
   * Compile a '=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Equals} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression notequals(int opPos) throws TransformerException

  /**
   * Compile a '!=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.NotEquals} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression and(int opPos) throws TransformerException

  /**
   * Compile an 'and' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.And} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression or(int opPos) throws TransformerException

  /**
   * Compile an 'or' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Or} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private Expression compileUnary(UnaryOperation unary, int opPos)

  /**
   * Bottle-neck compilation of a unary operation.
   *
   * @param unary The parent unary operation.
   * @param opPos The position in the op map of the parent operation.
   *
   * @return The unary argument.
   *
   * @throws TransformerException if syntax or other error occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private Expression compileOperation(Operation operation, int opPos)

  /**
   * Bottle-neck compilation of an operation with left and right operands.
   *
   * @param operation non-null reference to parent operation.
   * @param opPos The op map position of the parent operation.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Operation} instance.
   *
   * @throws TransformerException if there is a syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression compile(int opPos) throws TransformerException

  /**
   * Execute the XPath object from a given opcode position.
   * @param opPos The current position in the xpath.m_opMap array.
   * @return The result of the XPath.
   *
   * @throws TransformerException if there is a syntax or other error.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Compiler()

  /**
   * Construct a Compiler instance that has a null error listener and a
   * null source locator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Compiler(ErrorListener errorHandler, SourceLocator locator,
            FunctionTable fTable)

  /**
   * Construct a Compiler object with a specific ErrorListener and
   * SourceLocator where the expression is located.
   *
   * @param errorHandler Error listener where messages will be sent, or null
   *                     if messages should be sent to System err.
   * @param locator The location object where the expression lives, which
   *                may be null, but which, if not null, must be valid over
   *                the long haul, in other words, it will not be cloned.
   * @param fTable  The FunctionTable object where the xpath build-in
   *                functions are stored.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
public class Compiler extends OpMap

/**
 * An instance of this class compiles an XPath string expression into
 * a Expression object.  This class compiles the string into a sequence
 * of operation codes (op map) and then builds from that into an Expression
 * tree.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native void disable();

    /**
     * Cause the Compiler to cease operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native void enable();

    /**
     * Cause the Compiler to resume operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native Object command(Object any);

    /**
     * Examines the argument type and its fields and perform some documented
     * operation.  No specific operations are required.
     *
     * @param  any
     *         An argument
     *
     * @return  A compiler-specific value, or {@code null} if no compiler is
     *          available
     *
     * @throws  NullPointerException
     *          If {@code any} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native boolean compileClasses(String string);

    /**
     * Compiles all classes whose name matches the specified string.
     *
     * @param  string
     *         The name of the classes to compile
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code string} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native boolean compileClass(Class<?> clazz);

    /**
     * Compiles the specified class.
     *
     * @param  clazz
     *         A class
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code clazz} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
public final class Compiler  {

/**
 * The {@code Compiler} class is provided to support Java-to-native-code
 * compilers and related services. By design, the {@code Compiler} class does
 * nothing; it serves as a placeholder for a JIT compiler implementation.
 *
 * <p> When the Java Virtual Machine first starts, it determines if the system
 * property {@code java.compiler} exists. (System properties are accessible
 * through {@link System#getProperty(String)} and {@link
 * System#getProperty(String, String)}.  If so, it is assumed to be the name of
 * a library (with a platform-dependent exact location and type); {@link
 * System#loadLibrary} is called to load that library. If this loading
 * succeeds, the function named {@code java_lang_Compiler_start()} in that
 * library is called.
 *
 * <p> If no compiler is available, these methods do nothing.
 *
 * @author  Frank Yellin
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private FunctionTable m_functionTable;

  /**
   * The FunctionTable for all xpath build-in functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  SourceLocator m_locator;

  /** The source locator for the expression being compiled.  May be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  ErrorListener m_errorHandler;

  /** The error listener where errors will be sent.  If this is null, errors
   *  and warnings will be sent to System.err.  May be null.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void setNamespaceContext(PrefixResolver pr)

  /**
   * Set the current namespace context for the xpath.
   *
   * @param pr The resolver for prefixes in the XPath expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public PrefixResolver getNamespaceContext()

  /**
   * Get the current namespace context for the xpath.
   *
   * @return The current prefix resolver, *may* be null, though hopefully not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private PrefixResolver m_currentPrefixResolver = null;

  /**
   * The current prefixResolver for the execution context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void error(String msg, Object[] args) throws TransformerException

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void assertion(boolean b, java.lang.String msg)

  /**
   * Tell the user of an assertion error, and probably throw an
   * exception.
   *
   * @param b  If false, a runtime exception will be thrown.
   * @param msg The assertion message, which should be informative.
   *
   * @throws RuntimeException if the b argument is false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public void warn(String msg, Object[] args) throws TransformerException

  /**
   * Warn the user of an problem.
   *
   * @param msg An error msgkey that corresponds to one of the constants found
   *            in {@link com.sun.org.apache.xpath.internal.res.XPATHErrorResources}, which is
   *            a key for a format string.
   * @param args An array of arguments represented in the format string, which
   *             may be null.
   *
   * @throws TransformerException if the current ErrorListoner determines to
   *                              throw an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private Expression compileExtension(int opPos)

  /**
   * Compile an extension function.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.functions.FuncExtFunction} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  synchronized private long getNextMethodId()

  /**
   * Get the next available method id
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
      if (func instanceof FuncExtFunctionAvailable)

      /**
       * It is a trick for function-available. Since the function table is an
       * instance field, insert this table at compilation time for later usage
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  Expression compileFunction(int opPos) throws TransformerException

  /**
   * Compile a built-in XPath function.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.functions.Function} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private void compilePredicates(int opPos, Expression[] predicates)

  /**
   * Compiles predicates in the step.
   *
   * @param opPos The position of the first predicate the m_opMap array.
   * @param predicates An empty pre-determined array of
   *            {@link com.sun.org.apache.xpath.internal.Expression}s, that will be filled in.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public int countPredicates(int opPos) throws TransformerException

  /**
   * Count the number of predicates in the step.
   *
   * @param opPos The position of the first predicate the m_opMap array.
   *
   * @return The number of predicates for this step.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression[] getCompiledPredicates(int opPos)

  /**
   * Compile a zero or more predicates for a given match pattern.
   *
   * @param opPos The position of the first predicate the m_opMap array.
   *
   * @return reference to array of {@link com.sun.org.apache.xpath.internal.Expression} instances.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected StepPattern stepPattern(
          int opPos, int stepCount, StepPattern ancestorPattern)

  /**
   * Compile a step pattern unit expression, used for both location paths
   * and match patterns.
   *
   * @param opPos The current position in the m_opMap array.
   * @param stepCount The number of steps to expect.
   * @param ancestorPattern The owning StepPattern, which may be null.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.patterns.StepPattern} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public int getWhatToShow(int opPos)

  /**
   * Get a {@link org.w3c.dom.traversal.NodeFilter} bit set that tells what
   * to show for a given node test.
   *
   * @param opPos the op map position for the location step.
   *
   * @return {@link org.w3c.dom.traversal.NodeFilter} bit set that tells what
   *         to show for a given node test.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression locationPathPattern(int opPos)

  /**
   * Compile a location match pattern unit expression.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.patterns.StepPattern} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression matchPattern(int opPos) throws TransformerException

  /**
   * Compile an entire match pattern expression.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.patterns.UnionPattern} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression predicate(int opPos) throws TransformerException

  /**
   * Compile a location step predicate expression.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return the contained predicate expression.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression locationPath(int opPos) throws TransformerException

  /**
   * Compile a location path.  The LocPathIterator itself may create
   * {@link com.sun.org.apache.xpath.internal.axes.AxesWalker} children.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.axes.LocPathIterator} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  FunctionTable getFunctionTable()

  /**
   * Get the function table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public int getLocationPathDepth()

  /**
   * Get the level of the location path or union being constructed.
   * @return 0 if it is a top-level path.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression union(int opPos) throws TransformerException

  /**
   * Compile a location path union. The UnionPathIterator itself may create
   * {@link com.sun.org.apache.xpath.internal.axes.LocPathIterator} children.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.axes.LocPathIterator} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression arg(int opPos) throws TransformerException

  /**
   * Compile a function argument.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to the argument expression.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression group(int opPos) throws TransformerException

  /**
   * Compile an expression group.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to the contained expression.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression variable(int opPos) throws TransformerException

  /**
   * Compile a variable reference.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Variable} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression numberlit(int opPos)

  /**
   * Compile a literal number value.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.objects.XNumber} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression literal(int opPos)

  /**
   * Compile a literal string value.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.objects.XString} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression number(int opPos) throws TransformerException

  /**
   * Compile a 'number(...)' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Number} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression bool(int opPos) throws TransformerException

  /**
   * Compile a 'boolean(...)' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Bool} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression string(int opPos) throws TransformerException

  /**
   * Compile a 'string(...)' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.String} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression neg(int opPos) throws TransformerException

  /**
   * Compile a unary '-' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Neg} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression mod(int opPos) throws TransformerException

  /**
   * Compile a 'mod' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Mod} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression div(int opPos) throws TransformerException

  /**
   * Compile a 'div' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Div} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression mult(int opPos) throws TransformerException

  /**
   * Compile a '*' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Mult} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression minus(int opPos) throws TransformerException

  /**
   * Compile a '-' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Minus} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression plus(int opPos) throws TransformerException

  /**
   * Compile a '+' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Plus} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression gt(int opPos) throws TransformerException

  /**
   * Compile a '>' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Gt} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression gte(int opPos) throws TransformerException

  /**
   * Compile a '>=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Gte} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression lt(int opPos) throws TransformerException

  /**
   * Compile a '<' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Lt} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression lte(int opPos) throws TransformerException

  /**
   * Compile a '<=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Lte} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression equals(int opPos) throws TransformerException

  /**
   * Compile a '=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Equals} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression notequals(int opPos) throws TransformerException

  /**
   * Compile a '!=' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.NotEquals} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression and(int opPos) throws TransformerException

  /**
   * Compile an 'and' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.And} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  protected Expression or(int opPos) throws TransformerException

  /**
   * Compile an 'or' operation.
   *
   * @param opPos The current position in the m_opMap array.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Or} instance.
   *
   * @throws TransformerException if a error occurs creating the Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private Expression compileUnary(UnaryOperation unary, int opPos)

  /**
   * Bottle-neck compilation of a unary operation.
   *
   * @param unary The parent unary operation.
   * @param opPos The position in the op map of the parent operation.
   *
   * @return The unary argument.
   *
   * @throws TransformerException if syntax or other error occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  private Expression compileOperation(Operation operation, int opPos)

  /**
   * Bottle-neck compilation of an operation with left and right operands.
   *
   * @param operation non-null reference to parent operation.
   * @param opPos The op map position of the parent operation.
   *
   * @return reference to {@link com.sun.org.apache.xpath.internal.operations.Operation} instance.
   *
   * @throws TransformerException if there is a syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Expression compile(int opPos) throws TransformerException

  /**
   * Execute the XPath object from a given opcode position.
   * @param opPos The current position in the xpath.m_opMap array.
   * @return The result of the XPath.
   *
   * @throws TransformerException if there is a syntax or other error.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Compiler()

  /**
   * Construct a Compiler instance that has a null error listener and a
   * null source locator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
  public Compiler(ErrorListener errorHandler, SourceLocator locator,
            FunctionTable fTable)

  /**
   * Construct a Compiler object with a specific ErrorListener and
   * SourceLocator where the expression is located.
   *
   * @param errorHandler Error listener where messages will be sent, or null
   *                     if messages should be sent to System err.
   * @param locator The location object where the expression lives, which
   *                may be null, but which, if not null, must be valid over
   *                the long haul, in other words, it will not be cloned.
   * @param fTable  The FunctionTable object where the xpath build-in
   *                functions are stored.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/Compiler.java
public class Compiler extends OpMap

/**
 * An instance of this class compiles an XPath string expression into
 * a Expression object.  This class compiles the string into a sequence
 * of operation codes (op map) and then builds from that into an Expression
 * tree.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native void disable();

    /**
     * Cause the Compiler to cease operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native void enable();

    /**
     * Cause the Compiler to resume operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native Object command(Object any);

    /**
     * Examines the argument type and its fields and perform some documented
     * operation.  No specific operations are required.
     *
     * @param  any
     *         An argument
     *
     * @return  A compiler-specific value, or {@code null} if no compiler is
     *          available
     *
     * @throws  NullPointerException
     *          If {@code any} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native boolean compileClasses(String string);

    /**
     * Compiles all classes whose name matches the specified string.
     *
     * @param  string
     *         The name of the classes to compile
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code string} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
    public static native boolean compileClass(Class<?> clazz);

    /**
     * Compiles the specified class.
     *
     * @param  clazz
     *         A class
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code clazz} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Compiler.java
public final class Compiler  {

/**
 * The {@code Compiler} class is provided to support Java-to-native-code
 * compilers and related services. By design, the {@code Compiler} class does
 * nothing; it serves as a placeholder for a JIT compiler implementation.
 *
 * <p> When the Java Virtual Machine first starts, it determines if the system
 * property {@code java.compiler} exists. (System properties are accessible
 * through {@link System#getProperty(String)} and {@link
 * System#getProperty(String, String)}.  If so, it is assumed to be the name of
 * a library (with a platform-dependent exact location and type); {@link
 * System#loadLibrary} is called to load that library. If this loading
 * succeeds, the function named {@code java_lang_Compiler_start()} in that
 * library is called.
 *
 * <p> If no compiler is available, these methods do nothing.
 *
 * @author  Frank Yellin
 * @since   JDK1.0
 */
