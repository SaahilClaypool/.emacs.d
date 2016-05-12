_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public final com.sun.java_cup.internal.runtime.Symbol CUP$XPathParser$do_action(
    int                        CUP$XPathParser$act_num,
    com.sun.java_cup.internal.runtime.lr_parser CUP$XPathParser$parser,
    java.util.Stack            CUP$XPathParser$stack,
    int                        CUP$XPathParser$top)

  /** Method with the actual generated action code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  CUP$XPathParser$actions(XPathParser parser) {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
class CUP$XPathParser$actions {

/** Cup generated class to encapsulate user supplied action code.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public boolean isElementAxis(int axis) {

    /**
     * Returns true if the axis applies to elements only. The axes
     * child, attribute, namespace, descendant result in non-empty
     * nodesets only if the context node is of type element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    final SyntaxTreeNode lookupName(QName name) {

    /**
     * Lookup a variable or parameter in the symbol table given its name.
     *
     * @param name Name of the symbol being looked up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public Symbol parse(String expression, int lineNumber) throws Exception {

    /**
     * Parse the expression passed to the current scanner. If this
     * expression contains references to local variables and it will be
     * compiled in an external module (not in the main class) request
     * the current template to create a new variable stack frame.
     *
     * @param lineNumber Line where the current expression is defined.
     * @param external   Set to <tt>true</tt> if this expression is
     *                   compiled in a separate module.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public StepPattern createStepPattern(int axis, Object test, Vector predicates) {

    /**
     * This method is similar to findNodeType(int, Object) except that it
     * creates a StepPattern instead of just returning a node type. It also
     * differs in the way it handles "{uri}:*" and "{uri}:@*". The last two
     * patterns are expanded as "*[namespace-uri() = 'uri']" and
     * "@*[namespace-uri() = 'uri']", respectively. This expansion considerably
     * simplifies the grouping of patterns in the Mode class. For this
     * expansion to be correct, the priority of the pattern/template must be
     * set to -0.25 (when no other predicates are present).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public SymbolTable _symbolTable;

    /**
     * Reference to the symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    private int _lineNumber = 0;

    /**
     * Line number where this expression/pattern was declared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    private String _expression;

    /**
     * String representation of the expression being parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    private Parser _parser;

    /**
     * Reference to the Parser class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    static public final VariableRef DummyVarRef = null;

    /**
     * Reference to non-existing variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    static public final Vector EmptyArgs = new Vector(0);

    /**
     * Used by function calls with no args.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public int error_sym() {return 1;}

  /** <code>error</code> Symbol index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public int EOF_sym() {return 0;}

  /** <code>EOF</code> Symbol index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public int start_state() {return 0;}

  /** Indicates start state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public com.sun.java_cup.internal.runtime.Symbol do_action(
    int                        act_num,
    com.sun.java_cup.internal.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)

  /** Invoke a user supplied parse action. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected void init_actions()

  /** Action encapsulation object initializer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected CUP$XPathParser$actions action_obj;

  /** Instance of action encapsulation class. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public short[][] reduce_table() {return _reduce_table;}

  /** Access to <code>reduce_goto</code> table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected static final short[][] _reduce_table =

  /** <code>reduce_goto</code> table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public short[][] action_table() {return _action_table;}

  /** Access to parse-action table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected static final short[][] _action_table =

  /** Parse-action table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public short[][] production_table() {return _production_table;}

  /** Access to production table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected static final short _production_table[][] =

  /** Production table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public XPathParser(com.sun.java_cup.internal.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public XPathParser() {super();}

  /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
public class XPathParser extends com.sun.java_cup.internal.runtime.lr_parser {

/** CUP v0.10j generated parser.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean AbbreviatedNodeTestStep(boolean isLeadingSlashPermitted)

  /**
   *
   * AbbreviatedNodeTestStep    ::=    '@'? NodeTest Predicate
   *
   * @param isLeadingSlashPermitted a boolean indicating whether a slash can
   *        appear at the start of this step
   *
   * @return boolean indicating whether a slash following the step was consumed
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean StepPattern(boolean isLeadingSlashPermitted)

  /**
   *
   * StepPattern  ::=  AbbreviatedNodeTestStep
   *
   * @param isLeadingSlashPermitted a boolean indicating whether a slash can
   *        appear at the start of this step
   *
   * @return boolean indicating whether a slash following the step was consumed
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
      trailingSlashConsumed = StepPattern(!trailingSlashConsumed);

      // that happened, so it doesn't match ill-formed patterns like "a///b".
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void RelativePathPattern()

  /**
   *
   * RelativePathPattern  ::=  StepPattern
   * | RelativePathPattern '/' StepPattern
   * | RelativePathPattern '//' StepPattern
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void IdKeyPattern() throws javax.xml.transform.TransformerException

  /**
   *
   * IdKeyPattern  ::=  'id' '(' Literal ')'
   * | 'key' '(' Literal ',' Literal ')'
   * (Also handle doc())
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void LocationPathPattern() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * LocationPathPattern  ::=  '/' RelativePathPattern?
   * | IdKeyPattern (('/' | '//') RelativePathPattern)?
   * | '//'? RelativePathPattern
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Pattern() throws javax.xml.transform.TransformerException

  /**
   *
   * Pattern  ::=  LocationPathPattern
   * | Pattern '|' LocationPathPattern
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Number() throws javax.xml.transform.TransformerException

  /**
   *
   * Number ::= [0-9]+('.'[0-9]+)? | '.'[0-9]+
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Literal() throws javax.xml.transform.TransformerException

  /**
   * The value of the Literal is the sequence of characters inside
   * the " or ' characters>.
   *
   * Literal  ::=  '"' [^"]* '"'
   * | "'" [^']* "'"
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void NCName()

  /**
   * NCName ::=  (Letter | '_') (NCNameChar)
   * NCNameChar ::=  Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void QName() throws javax.xml.transform.TransformerException

  /**
   * QName ::=  (Prefix ':')? LocalPart
   * Prefix ::=  NCName
   * LocalPart ::=  NCName
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void PredicateExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * PredicateExpr ::= Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Predicate() throws javax.xml.transform.TransformerException

  /**
   *
   * Predicate ::= '[' PredicateExpr ']'
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void NodeTest(int axesType) throws javax.xml.transform.TransformerException

  /**
   *
   * NodeTest    ::=    WildcardName
   * | NodeType '(' ')'
   * | 'processing-instruction' '(' Literal ')'
   *
   * @param axesType FROM_XXX axes type, found in {@link com.sun.org.apache.xpath.internal.compiler.Keywords}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int AxisName() throws javax.xml.transform.TransformerException

  /**
   *
   * Basis    ::=    AxisName '::' NodeTest
   * | AbbreviatedBasis
   *
   * @return FROM_XXX axes type, found in {@link com.sun.org.apache.xpath.internal.compiler.Keywords}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Basis() throws javax.xml.transform.TransformerException

  /**
   *
   * Basis    ::=    AxisName '::' NodeTest
   * | AbbreviatedBasis
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean Step() throws javax.xml.transform.TransformerException

  /**
   *
   * Step    ::=    Basis Predicate
   * | AbbreviatedStep
   *
   * @returns false if step was empty (or only a '/'); true, otherwise
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean RelativeLocationPath()

  /**
   *
   * RelativeLocationPath ::= Step
   * | RelativeLocationPath '/' Step
   * | AbbreviatedRelativeLocationPath
   *
   * @returns true if, and only if, a RelativeLocationPath was matched
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void LocationPath() throws javax.xml.transform.TransformerException

  /**
   *
   * LocationPath ::= RelativeLocationPath
   * | AbsoluteLocationPath
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean FunctionCall() throws javax.xml.transform.TransformerException

  /**
   *
   * FunctionCall    ::=    FunctionName '(' ( Argument ( ',' Argument)*)? ')'
   *
   * @return true if, and only if, a FunctionCall was matched
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Argument() throws javax.xml.transform.TransformerException

  /**
   *
   * Argument    ::=    Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean PrimaryExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * PrimaryExpr  ::=  VariableReference
   * | '(' Expr ')'
   * | Literal
   * | Number
   * | FunctionCall
   *
   * @return true if this method successfully matched a PrimaryExpr
   *
   * @throws javax.xml.transform.TransformerException
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int FilterExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * FilterExpr  ::=  PrimaryExpr
   * | FilterExpr Predicate
   *
   * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide
   * the error condition is severe enough to halt processing.
   *
   * @return  FILTER_MATCH_PREDICATES, if this method successfully matched a
   *          FilterExpr with one or more Predicates;
   *          FILTER_MATCH_PRIMARY, if this method successfully matched a
   *          FilterExpr that was just a PrimaryExpr; or
   *          FILTER_MATCH_FAILED, if this method did not match a FilterExpr
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void PathExpr() throws javax.xml.transform.TransformerException

  /**
   * PathExpr  ::=  LocationPath
   * | FilterExpr
   * | FilterExpr '/' RelativeLocationPath
   * | FilterExpr '//' RelativeLocationPath
   *
   * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void UnionExpr() throws javax.xml.transform.TransformerException

  /**
   * The context of the right hand side expressions is the context of the
   * left hand side expression. The results of the right hand side expressions
   * are node sets. The result of the left hand side UnionExpr is the union
   * of the results of the right hand side expressions.
   *
   *
   * UnionExpr    ::=    PathExpr
   * | UnionExpr '|' PathExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void NumberExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * NumberExpr  ::=  Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void BooleanExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * StringExpr  ::=  Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void StringExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * StringExpr  ::=  Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void UnaryExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * UnaryExpr  ::=  UnionExpr
   * | '-' UnaryExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int MultiplicativeExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   * This has to handle construction of the operations so that they are evaluated
   * in pre-fix order.  So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be
   * evaluated as |-|+|9|7|6|.
   *
   * MultiplicativeExpr  ::=  UnaryExpr
   * | MultiplicativeExpr MultiplyOperator UnaryExpr
   * | MultiplicativeExpr 'div' UnaryExpr
   * | MultiplicativeExpr 'mod' UnaryExpr
   * | MultiplicativeExpr 'quo' UnaryExpr
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the equality expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int AdditiveExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   * This has to handle construction of the operations so that they are evaluated
   * in pre-fix order.  So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be
   * evaluated as |-|+|9|7|6|.
   *
   * AdditiveExpr  ::=  MultiplicativeExpr
   * | AdditiveExpr '+' MultiplicativeExpr
   * | AdditiveExpr '-' MultiplicativeExpr
   *
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the equality expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int RelationalExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   * .
   * @returns an Object which is either a String, a Number, a Boolean, or a vector
   * of nodes.
   *
   * RelationalExpr  ::=  AdditiveExpr
   * | RelationalExpr '<' AdditiveExpr
   * | RelationalExpr '>' AdditiveExpr
   * | RelationalExpr '<=' AdditiveExpr
   * | RelationalExpr '>=' AdditiveExpr
   *
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the relational expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int EqualityExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   *
   * @returns an Object which is either a String, a Number, a Boolean, or a vector
   * of nodes.
   *
   * EqualityExpr  ::=  RelationalExpr
   * | EqualityExpr '=' RelationalExpr
   *
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the equality expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void AndExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * AndExpr  ::=  EqualityExpr
   * | AndExpr 'and' EqualityExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void OrExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * OrExpr  ::=  AndExpr
   * | OrExpr 'or' AndExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Expr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * Expr  ::=  OrExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void appendOp(int length, int op)

  /**
   * Insert room for operation.  This WILL set
   * the length value of the operation, and will update
   * the length value for the total expression.
   *
   * @param length The length of the operation.
   * @param op The op code to the inserted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void insertOp(int pos, int length, int op)

  /**
   * Insert room for operation.  This will NOT set
   * the length value of the operation, but will update
   * the length value for the total expression.
   *
   * @param pos The position where the op is to be inserted.
   * @param length The length of the operation space in the op map.
   * @param op The op code to the inserted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final int getFunctionToken(String key)

  /**
   * Given a string, return the corresponding function token.
   *
   * @param key A local name of a function.
   *
   * @return   The function ID, which may correspond to one of the FUNC_XXX
   *    values found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *    be a value installed by an external module.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected String dumpRemainingTokenQueue()

  /**
   * Dump the remaining token queue.
   * Thanks to Craig for this.
   *
   * @return A dump of the remaining token queue, which may be appended to
   *         an error message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void errorForDOM3(String msg, Object[] args) throws TransformerException

  /**
   * This method is added to support DOM 3 XPath API.
   * <p>
   * This method is exactly like error(String, Object[]); except that
   * the underlying TransformerException is
   * XpathStylesheetDOM3Exception (which extends TransformerException).
   * <p>
   * So older XPath code in Xalan is not affected by this. To older XPath code
   * the behavior of whether error() or errorForDOM3() is called because it is
   * always catching TransformerException objects and is oblivious to
   * the new subclass of XPathStylesheetDOM3Exception. Older XPath code
   * runs as before.
   * <p>
   * However, newer DOM3 XPath code upon catching a TransformerException can
   * can check if the exception is an instance of XPathStylesheetDOM3Exception
   * and take appropriate action.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void error(String msg, Object[] args) throws TransformerException

  /**
   * Notify the user of an error, and probably throw an
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private void assertion(boolean b, String msg)

  /**
   * Notify the user of an assertion error, and probably throw an
   * exception.
   *
   * @param b  If false, a runtime exception will be thrown.
   * @param msg The assertion message, which should be informative.
   *
   * @throws RuntimeException if the b argument is false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void warn(String msg, Object[] args) throws TransformerException

  /**
   * Warn the user of a problem.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void consumeExpected(char expected)

  /**
   * Consume an expected token, throwing an exception if it
   * isn't there.
   *
   * @param expected the character to be expected.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void consumeExpected(String expected)

  /**
   * Consume an expected token, throwing an exception if it
   * isn't there.
   *
   * @param expected The string to be expected.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void prevToken()

  /**
   * Retrieve the previous token from the command and
   * store it in m_token string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final String getTokenRelative(int i)

  /**
   * Retrieve a token relative to the current token.
   *
   * @param i Position relative to current token.
   *
   * @return The string at the given index, or null if the index is out
   *         of range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void nextToken()

  /**
   * Retrieve the next token from the command and
   * store it in m_token string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final boolean lookahead(String s, int n)

  /**
   * Look ahead of the current token in order to
   * make a branching decision.
   *
   * @param s the string to compare it to.
   * @param n number of tokens to lookahead.  Must be
   * greater than 1.
   *
   * @return true if the token behind the current token matches the string
   *         argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final boolean lookbehindHasToken(int n)

  /**
   * look behind the current token in order to
   * see if there is a useable token.
   *
   * @param n number of tokens to look behind.  Must be
   * greater than 1.  Note that the look behind terminates
   * at either the beginning of the string or on a '|'
   * character.  Because of this, this method should only
   * be used for pattern matching.
   *
   * @return true if look behind has a token, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final boolean lookbehind(char c, int n)

  /**
   * Look behind the first character of the current token in order to
   * make a branching decision.
   *
   * @param c the character to compare it to.
   * @param n number of tokens to look behind.  Must be
   * greater than 1.  Note that the look behind terminates
   * at either the beginning of the string or on a '|'
   * character.  Because of this, this method should only
   * be used for pattern matching.
   *
   * @return true if the token behind the current token matches the character
   *         argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final boolean lookahead(char c, int n)

  /**
   * Look ahead of the current token in order to
   * make a branching decision.
   *
   * @param c the character to be tested for.
   * @param n number of tokens to look ahead.  Must be
   * greater than 1.
   *
   * @return true if the next token matches the character argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final boolean tokenIs(char c)

  /**
   * Check whether m_tokenChar==c.
   *
   * @param c A character to be tested.
   *
   * @return If m_token is null, returns false, or return true if c matches
   *         the current token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final boolean tokenIs(String s)

  /**
   * Check whether m_token matches the target string.
   *
   * @param s A string reference or null.
   *
   * @return If m_token is null, returns false (or true if s is also null), or
   * return true if the current token matches the string, else false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public ErrorListener getErrorListener()

  /**
   * Return the current error listener.
   *
   * @return The error listener, which should not normally be null, but may be.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public void setErrorHandler(ErrorListener handler)

  /**
   * Allow an application to register an error event handler, where syntax
   * errors will be sent.  If the error listener is not set, syntax errors
   * will be sent to System.err.
   *
   * @param handler Reference to error listener where syntax errors will be
   *                sent.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private FunctionTable m_functionTable;

  /** The table contains build-in functions and customized functions */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  javax.xml.transform.SourceLocator m_sourceLocator;

  /** The source location of the XPath. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private ErrorListener m_errorListener;

  /** The error listener where syntax errors are to be sent.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public void initMatchPattern(
          Compiler compiler, String expression, PrefixResolver namespaceContext)

  /**
   * Given an string, init an XPath object for pattern matches,
   * in order that a parse doesn't
   * have to be done each time the expression is evaluated.
   * @param compiler The XPath object to be initialized.
   * @param expression A String representing the XPath.
   * @param namespaceContext An object that is able to resolve prefixes in
   * the XPath to namespaces.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public void initXPath(
          Compiler compiler, String expression, PrefixResolver namespaceContext)

  /**
   * Given an string, init an XPath object for selections,
   * in order that a parse doesn't
   * have to be done each time the expression is evaluated.
   *
   * @param compiler The compiler object.
   * @param expression A string conforming to the XPath grammar.
   * @param namespaceContext An object that is able to resolve prefixes in
   * the XPath to namespaces.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  PrefixResolver m_namespaceContext;

  /**
   * The prefix resolver to map prefixes to namespaces in the OpMap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public XPathParser(ErrorListener errorListener, javax.xml.transform.SourceLocator sourceLocator)

  /**
   * The parser constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected final static int FILTER_MATCH_FAILED     = 0;

  /**
   * Results from checking FilterExpr syntax
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  int m_queueMark = 0;

  /**
   * The position in the token queue is tracked by m_queueMark.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  transient char m_tokenChar = 0;

  /**
   * The first char in m_token, the theory being that this
   * is an optimization because we won't have to do charAt(0) as
   * often.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  transient String m_token;

  /**
   * The next token in the pattern.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private OpMap m_ops;

  /**
   * The XPath to be processed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
public class XPathParser

/**
 * Tokenizes and parses XPath expressions. This should really be named
 * XPathParserImpl, and may be renamed in the future.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public final com.sun.java_cup.internal.runtime.Symbol CUP$XPathParser$do_action(
    int                        CUP$XPathParser$act_num,
    com.sun.java_cup.internal.runtime.lr_parser CUP$XPathParser$parser,
    java.util.Stack            CUP$XPathParser$stack,
    int                        CUP$XPathParser$top)

  /** Method with the actual generated action code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  CUP$XPathParser$actions(XPathParser parser) {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
class CUP$XPathParser$actions {

/** Cup generated class to encapsulate user supplied action code.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public boolean isElementAxis(int axis) {

    /**
     * Returns true if the axis applies to elements only. The axes
     * child, attribute, namespace, descendant result in non-empty
     * nodesets only if the context node is of type element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    final SyntaxTreeNode lookupName(QName name) {

    /**
     * Lookup a variable or parameter in the symbol table given its name.
     *
     * @param name Name of the symbol being looked up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public Symbol parse(String expression, int lineNumber) throws Exception {

    /**
     * Parse the expression passed to the current scanner. If this
     * expression contains references to local variables and it will be
     * compiled in an external module (not in the main class) request
     * the current template to create a new variable stack frame.
     *
     * @param lineNumber Line where the current expression is defined.
     * @param external   Set to <tt>true</tt> if this expression is
     *                   compiled in a separate module.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public StepPattern createStepPattern(int axis, Object test, Vector predicates) {

    /**
     * This method is similar to findNodeType(int, Object) except that it
     * creates a StepPattern instead of just returning a node type. It also
     * differs in the way it handles "{uri}:*" and "{uri}:@*". The last two
     * patterns are expanded as "*[namespace-uri() = 'uri']" and
     * "@*[namespace-uri() = 'uri']", respectively. This expansion considerably
     * simplifies the grouping of patterns in the Mode class. For this
     * expansion to be correct, the priority of the pattern/template must be
     * set to -0.25 (when no other predicates are present).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    public SymbolTable _symbolTable;

    /**
     * Reference to the symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    private int _lineNumber = 0;

    /**
     * Line number where this expression/pattern was declared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    private String _expression;

    /**
     * String representation of the expression being parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    private Parser _parser;

    /**
     * Reference to the Parser class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    static public final VariableRef DummyVarRef = null;

    /**
     * Reference to non-existing variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
    static public final Vector EmptyArgs = new Vector(0);

    /**
     * Used by function calls with no args.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public int error_sym() {return 1;}

  /** <code>error</code> Symbol index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public int EOF_sym() {return 0;}

  /** <code>EOF</code> Symbol index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public int start_state() {return 0;}

  /** Indicates start state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public com.sun.java_cup.internal.runtime.Symbol do_action(
    int                        act_num,
    com.sun.java_cup.internal.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)

  /** Invoke a user supplied parse action. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected void init_actions()

  /** Action encapsulation object initializer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected CUP$XPathParser$actions action_obj;

  /** Instance of action encapsulation class. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public short[][] reduce_table() {return _reduce_table;}

  /** Access to <code>reduce_goto</code> table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected static final short[][] _reduce_table =

  /** <code>reduce_goto</code> table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public short[][] action_table() {return _action_table;}

  /** Access to parse-action table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected static final short[][] _action_table =

  /** Parse-action table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public short[][] production_table() {return _production_table;}

  /** Access to production table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  protected static final short _production_table[][] =

  /** Production table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public XPathParser(com.sun.java_cup.internal.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
  public XPathParser() {super();}

  /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathParser.java
public class XPathParser extends com.sun.java_cup.internal.runtime.lr_parser {

/** CUP v0.10j generated parser.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean AbbreviatedNodeTestStep(boolean isLeadingSlashPermitted)

  /**
   *
   * AbbreviatedNodeTestStep    ::=    '@'? NodeTest Predicate
   *
   * @param isLeadingSlashPermitted a boolean indicating whether a slash can
   *        appear at the start of this step
   *
   * @return boolean indicating whether a slash following the step was consumed
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean StepPattern(boolean isLeadingSlashPermitted)

  /**
   *
   * StepPattern  ::=  AbbreviatedNodeTestStep
   *
   * @param isLeadingSlashPermitted a boolean indicating whether a slash can
   *        appear at the start of this step
   *
   * @return boolean indicating whether a slash following the step was consumed
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
      trailingSlashConsumed = StepPattern(!trailingSlashConsumed);

      // that happened, so it doesn't match ill-formed patterns like "a///b".
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void RelativePathPattern()

  /**
   *
   * RelativePathPattern  ::=  StepPattern
   * | RelativePathPattern '/' StepPattern
   * | RelativePathPattern '//' StepPattern
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void IdKeyPattern() throws javax.xml.transform.TransformerException

  /**
   *
   * IdKeyPattern  ::=  'id' '(' Literal ')'
   * | 'key' '(' Literal ',' Literal ')'
   * (Also handle doc())
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void LocationPathPattern() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * LocationPathPattern  ::=  '/' RelativePathPattern?
   * | IdKeyPattern (('/' | '//') RelativePathPattern)?
   * | '//'? RelativePathPattern
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Pattern() throws javax.xml.transform.TransformerException

  /**
   *
   * Pattern  ::=  LocationPathPattern
   * | Pattern '|' LocationPathPattern
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Number() throws javax.xml.transform.TransformerException

  /**
   *
   * Number ::= [0-9]+('.'[0-9]+)? | '.'[0-9]+
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Literal() throws javax.xml.transform.TransformerException

  /**
   * The value of the Literal is the sequence of characters inside
   * the " or ' characters>.
   *
   * Literal  ::=  '"' [^"]* '"'
   * | "'" [^']* "'"
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void NCName()

  /**
   * NCName ::=  (Letter | '_') (NCNameChar)
   * NCNameChar ::=  Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void QName() throws javax.xml.transform.TransformerException

  /**
   * QName ::=  (Prefix ':')? LocalPart
   * Prefix ::=  NCName
   * LocalPart ::=  NCName
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void PredicateExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * PredicateExpr ::= Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Predicate() throws javax.xml.transform.TransformerException

  /**
   *
   * Predicate ::= '[' PredicateExpr ']'
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void NodeTest(int axesType) throws javax.xml.transform.TransformerException

  /**
   *
   * NodeTest    ::=    WildcardName
   * | NodeType '(' ')'
   * | 'processing-instruction' '(' Literal ')'
   *
   * @param axesType FROM_XXX axes type, found in {@link com.sun.org.apache.xpath.internal.compiler.Keywords}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int AxisName() throws javax.xml.transform.TransformerException

  /**
   *
   * Basis    ::=    AxisName '::' NodeTest
   * | AbbreviatedBasis
   *
   * @return FROM_XXX axes type, found in {@link com.sun.org.apache.xpath.internal.compiler.Keywords}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Basis() throws javax.xml.transform.TransformerException

  /**
   *
   * Basis    ::=    AxisName '::' NodeTest
   * | AbbreviatedBasis
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean Step() throws javax.xml.transform.TransformerException

  /**
   *
   * Step    ::=    Basis Predicate
   * | AbbreviatedStep
   *
   * @returns false if step was empty (or only a '/'); true, otherwise
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean RelativeLocationPath()

  /**
   *
   * RelativeLocationPath ::= Step
   * | RelativeLocationPath '/' Step
   * | AbbreviatedRelativeLocationPath
   *
   * @returns true if, and only if, a RelativeLocationPath was matched
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void LocationPath() throws javax.xml.transform.TransformerException

  /**
   *
   * LocationPath ::= RelativeLocationPath
   * | AbsoluteLocationPath
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean FunctionCall() throws javax.xml.transform.TransformerException

  /**
   *
   * FunctionCall    ::=    FunctionName '(' ( Argument ( ',' Argument)*)? ')'
   *
   * @return true if, and only if, a FunctionCall was matched
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Argument() throws javax.xml.transform.TransformerException

  /**
   *
   * Argument    ::=    Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected boolean PrimaryExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * PrimaryExpr  ::=  VariableReference
   * | '(' Expr ')'
   * | Literal
   * | Number
   * | FunctionCall
   *
   * @return true if this method successfully matched a PrimaryExpr
   *
   * @throws javax.xml.transform.TransformerException
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int FilterExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * FilterExpr  ::=  PrimaryExpr
   * | FilterExpr Predicate
   *
   * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide
   * the error condition is severe enough to halt processing.
   *
   * @return  FILTER_MATCH_PREDICATES, if this method successfully matched a
   *          FilterExpr with one or more Predicates;
   *          FILTER_MATCH_PRIMARY, if this method successfully matched a
   *          FilterExpr that was just a PrimaryExpr; or
   *          FILTER_MATCH_FAILED, if this method did not match a FilterExpr
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void PathExpr() throws javax.xml.transform.TransformerException

  /**
   * PathExpr  ::=  LocationPath
   * | FilterExpr
   * | FilterExpr '/' RelativeLocationPath
   * | FilterExpr '//' RelativeLocationPath
   *
   * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void UnionExpr() throws javax.xml.transform.TransformerException

  /**
   * The context of the right hand side expressions is the context of the
   * left hand side expression. The results of the right hand side expressions
   * are node sets. The result of the left hand side UnionExpr is the union
   * of the results of the right hand side expressions.
   *
   *
   * UnionExpr    ::=    PathExpr
   * | UnionExpr '|' PathExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void NumberExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * NumberExpr  ::=  Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void BooleanExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * StringExpr  ::=  Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void StringExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * StringExpr  ::=  Expr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void UnaryExpr() throws javax.xml.transform.TransformerException

  /**
   *
   * UnaryExpr  ::=  UnionExpr
   * | '-' UnaryExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int MultiplicativeExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   * This has to handle construction of the operations so that they are evaluated
   * in pre-fix order.  So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be
   * evaluated as |-|+|9|7|6|.
   *
   * MultiplicativeExpr  ::=  UnaryExpr
   * | MultiplicativeExpr MultiplyOperator UnaryExpr
   * | MultiplicativeExpr 'div' UnaryExpr
   * | MultiplicativeExpr 'mod' UnaryExpr
   * | MultiplicativeExpr 'quo' UnaryExpr
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the equality expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int AdditiveExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   * This has to handle construction of the operations so that they are evaluated
   * in pre-fix order.  So, for 9+7-6, instead of |+|9|-|7|6|, this needs to be
   * evaluated as |-|+|9|7|6|.
   *
   * AdditiveExpr  ::=  MultiplicativeExpr
   * | AdditiveExpr '+' MultiplicativeExpr
   * | AdditiveExpr '-' MultiplicativeExpr
   *
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the equality expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int RelationalExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   * .
   * @returns an Object which is either a String, a Number, a Boolean, or a vector
   * of nodes.
   *
   * RelationalExpr  ::=  AdditiveExpr
   * | RelationalExpr '<' AdditiveExpr
   * | RelationalExpr '>' AdditiveExpr
   * | RelationalExpr '<=' AdditiveExpr
   * | RelationalExpr '>=' AdditiveExpr
   *
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the relational expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected int EqualityExpr(int addPos) throws javax.xml.transform.TransformerException

  /**
   *
   * @returns an Object which is either a String, a Number, a Boolean, or a vector
   * of nodes.
   *
   * EqualityExpr  ::=  RelationalExpr
   * | EqualityExpr '=' RelationalExpr
   *
   *
   * @param addPos Position where expression is to be added, or -1 for append.
   *
   * @return the position at the end of the equality expression.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void AndExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * AndExpr  ::=  EqualityExpr
   * | AndExpr 'and' EqualityExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void OrExpr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * OrExpr  ::=  AndExpr
   * | OrExpr 'or' AndExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected void Expr() throws javax.xml.transform.TransformerException

  /**
   *
   *
   * Expr  ::=  OrExpr
   *
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void appendOp(int length, int op)

  /**
   * Insert room for operation.  This WILL set
   * the length value of the operation, and will update
   * the length value for the total expression.
   *
   * @param length The length of the operation.
   * @param op The op code to the inserted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void insertOp(int pos, int length, int op)

  /**
   * Insert room for operation.  This will NOT set
   * the length value of the operation, but will update
   * the length value for the total expression.
   *
   * @param pos The position where the op is to be inserted.
   * @param length The length of the operation space in the op map.
   * @param op The op code to the inserted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final int getFunctionToken(String key)

  /**
   * Given a string, return the corresponding function token.
   *
   * @param key A local name of a function.
   *
   * @return   The function ID, which may correspond to one of the FUNC_XXX
   *    values found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *    be a value installed by an external module.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected String dumpRemainingTokenQueue()

  /**
   * Dump the remaining token queue.
   * Thanks to Craig for this.
   *
   * @return A dump of the remaining token queue, which may be appended to
   *         an error message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void errorForDOM3(String msg, Object[] args) throws TransformerException

  /**
   * This method is added to support DOM 3 XPath API.
   * <p>
   * This method is exactly like error(String, Object[]); except that
   * the underlying TransformerException is
   * XpathStylesheetDOM3Exception (which extends TransformerException).
   * <p>
   * So older XPath code in Xalan is not affected by this. To older XPath code
   * the behavior of whether error() or errorForDOM3() is called because it is
   * always catching TransformerException objects and is oblivious to
   * the new subclass of XPathStylesheetDOM3Exception. Older XPath code
   * runs as before.
   * <p>
   * However, newer DOM3 XPath code upon catching a TransformerException can
   * can check if the exception is an instance of XPathStylesheetDOM3Exception
   * and take appropriate action.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void error(String msg, Object[] args) throws TransformerException

  /**
   * Notify the user of an error, and probably throw an
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private void assertion(boolean b, String msg)

  /**
   * Notify the user of an assertion error, and probably throw an
   * exception.
   *
   * @param b  If false, a runtime exception will be thrown.
   * @param msg The assertion message, which should be informative.
   *
   * @throws RuntimeException if the b argument is false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  void warn(String msg, Object[] args) throws TransformerException

  /**
   * Warn the user of a problem.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void consumeExpected(char expected)

  /**
   * Consume an expected token, throwing an exception if it
   * isn't there.
   *
   * @param expected the character to be expected.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void consumeExpected(String expected)

  /**
   * Consume an expected token, throwing an exception if it
   * isn't there.
   *
   * @param expected The string to be expected.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void prevToken()

  /**
   * Retrieve the previous token from the command and
   * store it in m_token string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final String getTokenRelative(int i)

  /**
   * Retrieve a token relative to the current token.
   *
   * @param i Position relative to current token.
   *
   * @return The string at the given index, or null if the index is out
   *         of range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final void nextToken()

  /**
   * Retrieve the next token from the command and
   * store it in m_token string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final boolean lookahead(String s, int n)

  /**
   * Look ahead of the current token in order to
   * make a branching decision.
   *
   * @param s the string to compare it to.
   * @param n number of tokens to lookahead.  Must be
   * greater than 1.
   *
   * @return true if the token behind the current token matches the string
   *         argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final boolean lookbehindHasToken(int n)

  /**
   * look behind the current token in order to
   * see if there is a useable token.
   *
   * @param n number of tokens to look behind.  Must be
   * greater than 1.  Note that the look behind terminates
   * at either the beginning of the string or on a '|'
   * character.  Because of this, this method should only
   * be used for pattern matching.
   *
   * @return true if look behind has a token, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private final boolean lookbehind(char c, int n)

  /**
   * Look behind the first character of the current token in order to
   * make a branching decision.
   *
   * @param c the character to compare it to.
   * @param n number of tokens to look behind.  Must be
   * greater than 1.  Note that the look behind terminates
   * at either the beginning of the string or on a '|'
   * character.  Because of this, this method should only
   * be used for pattern matching.
   *
   * @return true if the token behind the current token matches the character
   *         argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final boolean lookahead(char c, int n)

  /**
   * Look ahead of the current token in order to
   * make a branching decision.
   *
   * @param c the character to be tested for.
   * @param n number of tokens to look ahead.  Must be
   * greater than 1.
   *
   * @return true if the next token matches the character argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final boolean tokenIs(char c)

  /**
   * Check whether m_tokenChar==c.
   *
   * @param c A character to be tested.
   *
   * @return If m_token is null, returns false, or return true if c matches
   *         the current token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  final boolean tokenIs(String s)

  /**
   * Check whether m_token matches the target string.
   *
   * @param s A string reference or null.
   *
   * @return If m_token is null, returns false (or true if s is also null), or
   * return true if the current token matches the string, else false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public ErrorListener getErrorListener()

  /**
   * Return the current error listener.
   *
   * @return The error listener, which should not normally be null, but may be.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public void setErrorHandler(ErrorListener handler)

  /**
   * Allow an application to register an error event handler, where syntax
   * errors will be sent.  If the error listener is not set, syntax errors
   * will be sent to System.err.
   *
   * @param handler Reference to error listener where syntax errors will be
   *                sent.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private FunctionTable m_functionTable;

  /** The table contains build-in functions and customized functions */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  javax.xml.transform.SourceLocator m_sourceLocator;

  /** The source location of the XPath. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private ErrorListener m_errorListener;

  /** The error listener where syntax errors are to be sent.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public void initMatchPattern(
          Compiler compiler, String expression, PrefixResolver namespaceContext)

  /**
   * Given an string, init an XPath object for pattern matches,
   * in order that a parse doesn't
   * have to be done each time the expression is evaluated.
   * @param compiler The XPath object to be initialized.
   * @param expression A String representing the XPath.
   * @param namespaceContext An object that is able to resolve prefixes in
   * the XPath to namespaces.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public void initXPath(
          Compiler compiler, String expression, PrefixResolver namespaceContext)

  /**
   * Given an string, init an XPath object for selections,
   * in order that a parse doesn't
   * have to be done each time the expression is evaluated.
   *
   * @param compiler The compiler object.
   * @param expression A string conforming to the XPath grammar.
   * @param namespaceContext An object that is able to resolve prefixes in
   * the XPath to namespaces.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  PrefixResolver m_namespaceContext;

  /**
   * The prefix resolver to map prefixes to namespaces in the OpMap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  public XPathParser(ErrorListener errorListener, javax.xml.transform.SourceLocator sourceLocator)

  /**
   * The parser constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  protected final static int FILTER_MATCH_FAILED     = 0;

  /**
   * Results from checking FilterExpr syntax
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  int m_queueMark = 0;

  /**
   * The position in the token queue is tracked by m_queueMark.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  transient char m_tokenChar = 0;

  /**
   * The first char in m_token, the theory being that this
   * is an optimization because we won't have to do charAt(0) as
   * often.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  transient String m_token;

  /**
   * The next token in the pattern.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
  private OpMap m_ops;

  /**
   * The XPath to be processed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/XPathParser.java
public class XPathParser

/**
 * Tokenizes and parses XPath expressions. This should really be named
 * XPathParserImpl, and may be renamed in the future.
 * @xsl.usage general
 */
