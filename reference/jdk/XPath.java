_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static void main(String[] argv) throws Exception {

    /** Main program entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected void addToken(XPath.Tokens tokens, int token)

        /**
         * This method adds the specified token to the token list. By
         * default, this method allows all tokens. However, subclasses
         * of the XPathExprScanner can override this method in order
         * to disallow certain tokens from being used in the scanned
         * XPath expression. This is a convenient way of allowing only
         * a subset of XPath.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                    }

                        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                        throw new RuntimeException("find a solution!");

                        /***
                        part = tokens.addSymbol(data, start, currentOffset - start, encoding);
                        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                    ch = data.charAt(currentOffset);

                    /** int start = currentOffset; **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                    {

                    /*** // REVISIT: Make sure this is a negation. ***
                    if ((XMLCharacterProperties.fgCharFlags[ch] &
                         XMLCharacterProperties.E_NameCharFlag) == 0)
                    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                {

                /*** // REVISIT: Make sure this is a negation. ***
                if ((XMLCharacterProperties.fgCharFlags[ch] &
                     XMLCharacterProperties.E_InitialNameCharFlag) == 0)
                /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public boolean scanExpr(SymbolTable symbolTable,
                                XPath.Tokens tokens, String data,
                                int currentOffset, int endOffset)

        /**
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Scanner(SymbolTable symbolTable) {

        /** Constructs an XPath expression scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private SymbolTable fSymbolTable;

        /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        //

        /**
         * Symbol literals
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private static final byte

        /**
         * 7-bit ASCII subset
         *
         *  0   1   2   3   4   5   6   7   8   9   A   B   C   D   E   F
         *  0,  0,  0,  0,  0,  0,  0,  0,  0, HT, LF,  0,  0, CR,  0,  0,  // 0
         *  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  // 1
         * SP,  !,  ",  #,  $,  %,  &,  ',  (,  ),  *,  +,  ,,  -,  .,  /,  // 2
         *  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  :,  ;,  <,  =,  >,  ?,  // 3
         *  @,  A,  B,  C,  D,  E,  F,  G,  H,  I,  J,  K,  L,  M,  N,  O,  // 4
         *  P,  Q,  R,  S,  T,  U,  V,  W,  X,  Y,  Z,  [,  \,  ],  ^,  _,  // 5
         *  `,  a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  // 6
         *  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  {,  |,  },  ~, DEL  // 7
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private static class Scanner {

    /**
     * @xerces.internal
     *
     * @author Glenn Marcy, IBM
     * @author Andy Clark, IBM
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String nextTokenAsString() throws XPathException {

        /**
         * Obtains the token at the current position as a String.
         *
         * If there's no current token or if the current token
         * is not a string token, this method throws
         * <tt>new XPathException("c-general-xpath");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public int peekToken() throws XPathException {

        /**
         * Obtains the token at the current position, without advancing
         * the current position.
         *
         * If there's no such next token, this method throws
         * <tt>new XPathException("c-general-xpath");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public int nextToken() throws XPathException {

        /**
         * Obtains the token at the current position, then advance
         * the current position by one.
         *
         * If there's no such next token, this method throws
         * <tt>new XPathException("c-general-xpath");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public boolean hasMore() {

        /**
         * Returns true if the {@link #getNextToken()} method
         * returns a valid token.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public void rewind() {

        /**
         * Resets the current position to the head of the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private int fCurrentTokenIndex;

        /**
         * Current position in the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private static final int INITIAL_TOKEN_COUNT = 1 << 8;

        /**
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final int

        /**
         * [28] ExprToken ::= '(' | ')' | '[' | ']' | '.' | '..' | '@' | ',' | '::'
         *                  | NameTest | NodeType | Operator | FunctionName
         *                  | AxisName | Literal | Number | VariableReference
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private static final class Tokens {

    /**
     * List of tokens.
     *
     * @xerces.internal
     *
     * @author Glenn Marcy, IBM
     * @author Andy Clark, IBM
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(NodeTest nodeTest) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(String prefix, String uri) {

        /** Constructs a node test of type Namespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(QName name) {

        /** Constructs a node test of type QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(short type) {

        /** Constructs a node test of type WILDCARD or NODE. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public final QName name = new QName();

        /** Node qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public short type;

        /** Node test type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short NAMESPACE= 4;

        /** Type: namespace */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short NODE = 3;

        /** Type: node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short WILDCARD = 2;

        /** Type: wildcard. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short QNAME = 1;

        /** Type: qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class NodeTest

    /**
     * Node test.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected Axis(Axis axis) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Axis(short type) {

        /** Constructs an axis with the specified type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public short type;

        /** Axis type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short DESCENDANT = 4;

        /** Type: descendant. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short SELF = 3;

        /** Type: self. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short ATTRIBUTE = 2;

        /** Type: attribute. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short CHILD = 1;

        /** Type: child. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class Axis

    /**
     * Axis.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected Step(Step step) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Step(Axis axis, NodeTest nodeTest) {

        /** Constructs a step from an axis and node test. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest nodeTest;

        /** Node test. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Axis axis;

        /** Axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class Step

    /**
     * A location path step comprised of an axis and node test.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected LocationPath(LocationPath path) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public LocationPath(Step[] steps) {

        /** Creates a location path from a series of steps. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Step[] steps;

        /** List of steps. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class LocationPath

    /**
     * A location path representation for an XPath expression.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private NodeTest parseNodeTest( int typeToken, Tokens xtokens, NamespaceContext context )

    /**
     * Used by {@link #parseExpression} to parse a node test
     * from the token list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private void parseExpression(final NamespaceContext context)

    /**
     * This method is implemented by using the XPathExprScanner and
     * examining the list of tokens that it returns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private LocationPath buildLocationPath( Vector stepsVector ) throws XPathException {

    /**
     * Used by the {@link #parseExpression(NamespaceContext)} method
     * to build a {@link LocationPath} object from the accumulated
     * {@link Step}s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private static void check( boolean b ) throws XPathException {

    /**
     * Used by the {@link #parseExpression(NamespaceContext)} method
     * to verify the assumption.
     *
     * If <tt>b</tt> is false, this method throws XPathException
     * to report the error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public LocationPath getLocationPath() {

    /** Returns a representation of the first location path for this XPath. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public LocationPath[] getLocationPaths() {

    /**
     * Returns a representation of all location paths for this XPath.
     * XPath = locationPath ( '|' locationPath)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public XPath(String xpath, SymbolTable symbolTable,
                 NamespaceContext context)

    /** Constructs an XPath object from the specified expression. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    protected LocationPath[] fLocationPaths;

    /** Location paths. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    protected String fExpression;

    /** Expression. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
public class XPath {

/**
 * Bare minimum XPath parser.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 * @author Sunitha Reddy, Sun Microsystems
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_OTHER = 0.5;

  /**
   * The match score if the pattern consists of something
   * other than just a NodeTest or just a qname.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_NODETEST = -0.5;

  /**
   * The match score if the pattern consists of just a NodeTest.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_NSWILD = -0.25;

  /**
   * The match score if the pattern pattern has the form NCName:*.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_QNAME = 0.0;

  /**
   * The match score if the pattern has the form
   * of a QName optionally preceded by an @ character.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_NONE = Double.NEGATIVE_INFINITY;

  /**
   * The match score if no match is made.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * This will traverse the heararchy, calling the visitor for
   * each member.  If the called visitor method returns
   * false, the subtree should not be called.
   *
   * @param owner The owner of the visitor, where that path may be
   *              rewritten if needed.
   * @param visitor The visitor whose appropriate method will be called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void error(
          XPathContext xctxt, int sourceNode, String msg, Object[] args)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param xctxt The XPath runtime context.
   * @param sourceNode Not used.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void assertion(boolean b, String msg)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void warn(
          XPathContext xctxt, int sourceNode, String msg, Object[] args)

  /**
   * Warn the user of an problem.
   *
   * @param xctxt The XPath runtime context.
   * @param sourceNode Not used.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public double getMatchScore(XPathContext xctxt, int context)

  /**
   * Get the match score of the given node.
   *
   * @param xctxt XPath runtime context.
   * @param context The current source tree context node.
   *
   * @return score, one of {@link #MATCH_SCORE_NODETEST},
   * {@link #MATCH_SCORE_NONE}, {@link #MATCH_SCORE_OTHER},
   * or {@link #MATCH_SCORE_QNAME}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private static final boolean DEBUG_MATCHES = false;

  /** Set to true to get diagnostic messages about the result of
   *  match pattern testing.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public boolean bool(
          XPathContext xctxt, int contextNode, PrefixResolver namespaceContext)

  /**
   * Given an expression and a context, evaluate the XPath
   * and return the result.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @param namespaceContext The context in which namespaces in the
   * XPath are supposed to be expanded.
   *
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XObject execute(
          XPathContext xctxt, int contextNode, PrefixResolver namespaceContext)

  /**
   * Given an expression and a context, evaluate the XPath
   * and return the result.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @param namespaceContext The context in which namespaces in the
   * XPath are supposed to be expanded.
   *
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XObject execute(
          XPathContext xctxt, org.w3c.dom.Node contextNode,
          PrefixResolver namespaceContext)

  /**
   * Given an expression and a context, evaluate the XPath
   * and return the result.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @param namespaceContext The context in which namespaces in the
   * XPath are supposed to be expanded.
   *
   * @return The result of the XPath or null if callbacks are used.
   * @throws TransformerException thrown if
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(Expression expr)

  /**
   * Construct an XPath object.
   *
   * @param expr The Expression object.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(
          String exprString, SourceLocator locator, PrefixResolver prefixResolver, int type)

  /**
   * Construct an XPath object.
   *
   * (Needs review -sc) This method initializes an XPathParser/
   * Compiler and compiles the expression.
   * @param exprString The XPath expression.
   * @param locator The location of the expression, may be null.
   * @param prefixResolver A prefix resolver to use to resolve prefixes to
   *                       namespace URIs.
   * @param type one of {@link #SELECT} or {@link #MATCH}.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(
          String exprString, SourceLocator locator,
          PrefixResolver prefixResolver, int type,
          ErrorListener errorListener, FunctionTable aTable)

  /**
   * Construct an XPath object.
   *
   * (Needs review -sc) This method initializes an XPathParser/
   * Compiler and compiles the expression.
   * @param exprString The XPath expression.
   * @param locator The location of the expression, may be null.
   * @param prefixResolver A prefix resolver to use to resolve prefixes to
   *                       namespace URIs.
   * @param type one of {@link #SELECT} or {@link #MATCH}.
   * @param errorListener The error listener, or null if default should be used.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(
          String exprString, SourceLocator locator, PrefixResolver prefixResolver, int type,
          ErrorListener errorListener)

  /**
   * Construct an XPath object.
   *
   * (Needs review -sc) This method initializes an XPathParser/
   * Compiler and compiles the expression.
   * @param exprString The XPath expression.
   * @param locator The location of the expression, may be null.
   * @param prefixResolver A prefix resolver to use to resolve prefixes to
   *                       namespace URIs.
   * @param type one of {@link #SELECT} or {@link #MATCH}.
   * @param errorListener The error listener, or null if default should be used.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final int MATCH = 1;

  /** Represents a match type expression.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final int SELECT = 0;

  /** Represents a select type expression. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public String getPatternString()

  /**
   * Return the XPath string associated with this object.
   *
   *
   * @return the XPath string associated with this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  String m_patternString;

  /** The pattern string, mainly kept around for diagnostic purposes.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
//  public void setLocator(SourceLocator l)

//  /**
//   * Set the SourceLocator on the expression object.
//   *
//   *
//   * @param l the SourceLocator on the expression object, which may be null.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public SourceLocator getLocator()

  /**
   * Get the SourceLocator on the expression object.
   *
   *
   * @return the SourceLocator on the expression object, which may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void setExpression(Expression exp)

  /**
   * Set the raw expression object for this object.
   *
   *
   * @param exp the raw Expression object, which should not normally be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public Expression getExpression()

  /**
   * Get the raw Expression object that this class wraps.
   *
   *
   * @return the raw Expression object, which should not normally be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private void initFunctionTable(){

  /**
   * initial the function table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private transient FunctionTable m_funcTable = null;

  /**
   * The function table for xpath build-in functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private Expression m_mainExp;

  /** The top of the expression tree.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
public class XPath implements Serializable, ExpressionOwner

/**
 * The XPath class wraps an expression object and provides general services
 * for execution of that expression.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static void main(String[] argv) throws Exception {

    /** Main program entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected void addToken(XPath.Tokens tokens, int token)

        /**
         * This method adds the specified token to the token list. By
         * default, this method allows all tokens. However, subclasses
         * of the XPathExprScanner can override this method in order
         * to disallow certain tokens from being used in the scanned
         * XPath expression. This is a convenient way of allowing only
         * a subset of XPath.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                    }

                        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                        throw new RuntimeException("find a solution!");

                        /***
                        part = tokens.addSymbol(data, start, currentOffset - start, encoding);
                        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                    ch = data.charAt(currentOffset);

                    /** int start = currentOffset; **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                    {

                    /*** // REVISIT: Make sure this is a negation. ***
                    if ((XMLCharacterProperties.fgCharFlags[ch] &
                         XMLCharacterProperties.E_NameCharFlag) == 0)
                    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
                {

                /*** // REVISIT: Make sure this is a negation. ***
                if ((XMLCharacterProperties.fgCharFlags[ch] &
                     XMLCharacterProperties.E_InitialNameCharFlag) == 0)
                /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public boolean scanExpr(SymbolTable symbolTable,
                                XPath.Tokens tokens, String data,
                                int currentOffset, int endOffset)

        /**
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Scanner(SymbolTable symbolTable) {

        /** Constructs an XPath expression scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private SymbolTable fSymbolTable;

        /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        //

        /**
         * Symbol literals
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private static final byte

        /**
         * 7-bit ASCII subset
         *
         *  0   1   2   3   4   5   6   7   8   9   A   B   C   D   E   F
         *  0,  0,  0,  0,  0,  0,  0,  0,  0, HT, LF,  0,  0, CR,  0,  0,  // 0
         *  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  // 1
         * SP,  !,  ",  #,  $,  %,  &,  ',  (,  ),  *,  +,  ,,  -,  .,  /,  // 2
         *  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  :,  ;,  <,  =,  >,  ?,  // 3
         *  @,  A,  B,  C,  D,  E,  F,  G,  H,  I,  J,  K,  L,  M,  N,  O,  // 4
         *  P,  Q,  R,  S,  T,  U,  V,  W,  X,  Y,  Z,  [,  \,  ],  ^,  _,  // 5
         *  `,  a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  // 6
         *  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  {,  |,  },  ~, DEL  // 7
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private static class Scanner {

    /**
     * @xerces.internal
     *
     * @author Glenn Marcy, IBM
     * @author Andy Clark, IBM
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String nextTokenAsString() throws XPathException {

        /**
         * Obtains the token at the current position as a String.
         *
         * If there's no current token or if the current token
         * is not a string token, this method throws
         * <tt>new XPathException("c-general-xpath");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public int peekToken() throws XPathException {

        /**
         * Obtains the token at the current position, without advancing
         * the current position.
         *
         * If there's no such next token, this method throws
         * <tt>new XPathException("c-general-xpath");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public int nextToken() throws XPathException {

        /**
         * Obtains the token at the current position, then advance
         * the current position by one.
         *
         * If there's no such next token, this method throws
         * <tt>new XPathException("c-general-xpath");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public boolean hasMore() {

        /**
         * Returns true if the {@link #getNextToken()} method
         * returns a valid token.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public void rewind() {

        /**
         * Resets the current position to the head of the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private int fCurrentTokenIndex;

        /**
         * Current position in the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        private static final int INITIAL_TOKEN_COUNT = 1 << 8;

        /**
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final int

        /**
         * [28] ExprToken ::= '(' | ')' | '[' | ']' | '.' | '..' | '@' | ',' | '::'
         *                  | NameTest | NodeType | Operator | FunctionName
         *                  | AxisName | Literal | Number | VariableReference
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private static final class Tokens {

    /**
     * List of tokens.
     *
     * @xerces.internal
     *
     * @author Glenn Marcy, IBM
     * @author Andy Clark, IBM
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(NodeTest nodeTest) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(String prefix, String uri) {

        /** Constructs a node test of type Namespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(QName name) {

        /** Constructs a node test of type QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest(short type) {

        /** Constructs a node test of type WILDCARD or NODE. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public final QName name = new QName();

        /** Node qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public short type;

        /** Node test type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short NAMESPACE= 4;

        /** Type: namespace */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short NODE = 3;

        /** Type: node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short WILDCARD = 2;

        /** Type: wildcard. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short QNAME = 1;

        /** Type: qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class NodeTest

    /**
     * Node test.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected Axis(Axis axis) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Axis(short type) {

        /** Constructs an axis with the specified type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public short type;

        /** Axis type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short DESCENDANT = 4;

        /** Type: descendant. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short SELF = 3;

        /** Type: self. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short ATTRIBUTE = 2;

        /** Type: attribute. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public static final short CHILD = 1;

        /** Type: child. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class Axis

    /**
     * Axis.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected Step(Step step) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Step(Axis axis, NodeTest nodeTest) {

        /** Constructs a step from an axis and node test. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public NodeTest nodeTest;

        /** Node test. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Axis axis;

        /** Axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class Step

    /**
     * A location path step comprised of an axis and node test.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Object clone() {

        /** Returns a clone of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public String toString() {

        /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        protected LocationPath(LocationPath path) {

        /** Copy constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public LocationPath(Step[] steps) {

        /** Creates a location path from a series of steps. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
        public Step[] steps;

        /** List of steps. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public static class LocationPath

    /**
     * A location path representation for an XPath expression.
     *
     * @xerces.internal
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private NodeTest parseNodeTest( int typeToken, Tokens xtokens, NamespaceContext context )

    /**
     * Used by {@link #parseExpression} to parse a node test
     * from the token list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private void parseExpression(final NamespaceContext context)

    /**
     * This method is implemented by using the XPathExprScanner and
     * examining the list of tokens that it returns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private LocationPath buildLocationPath( Vector stepsVector ) throws XPathException {

    /**
     * Used by the {@link #parseExpression(NamespaceContext)} method
     * to build a {@link LocationPath} object from the accumulated
     * {@link Step}s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    private static void check( boolean b ) throws XPathException {

    /**
     * Used by the {@link #parseExpression(NamespaceContext)} method
     * to verify the assumption.
     *
     * If <tt>b</tt> is false, this method throws XPathException
     * to report the error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public String toString() {

    /** Returns a string representation of this object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public LocationPath getLocationPath() {

    /** Returns a representation of the first location path for this XPath. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public LocationPath[] getLocationPaths() {

    /**
     * Returns a representation of all location paths for this XPath.
     * XPath = locationPath ( '|' locationPath)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    public XPath(String xpath, SymbolTable symbolTable,
                 NamespaceContext context)

    /** Constructs an XPath object from the specified expression. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    protected LocationPath[] fLocationPaths;

    /** Location paths. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
    protected String fExpression;

    /** Expression. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPath.java
public class XPath {

/**
 * Bare minimum XPath parser.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 * @author Sunitha Reddy, Sun Microsystems
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_OTHER = 0.5;

  /**
   * The match score if the pattern consists of something
   * other than just a NodeTest or just a qname.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_NODETEST = -0.5;

  /**
   * The match score if the pattern consists of just a NodeTest.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_NSWILD = -0.25;

  /**
   * The match score if the pattern pattern has the form NCName:*.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_QNAME = 0.0;

  /**
   * The match score if the pattern has the form
   * of a QName optionally preceded by an @ character.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final double MATCH_SCORE_NONE = Double.NEGATIVE_INFINITY;

  /**
   * The match score if no match is made.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * This will traverse the heararchy, calling the visitor for
   * each member.  If the called visitor method returns
   * false, the subtree should not be called.
   *
   * @param owner The owner of the visitor, where that path may be
   *              rewritten if needed.
   * @param visitor The visitor whose appropriate method will be called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void error(
          XPathContext xctxt, int sourceNode, String msg, Object[] args)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param xctxt The XPath runtime context.
   * @param sourceNode Not used.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void assertion(boolean b, String msg)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void warn(
          XPathContext xctxt, int sourceNode, String msg, Object[] args)

  /**
   * Warn the user of an problem.
   *
   * @param xctxt The XPath runtime context.
   * @param sourceNode Not used.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public double getMatchScore(XPathContext xctxt, int context)

  /**
   * Get the match score of the given node.
   *
   * @param xctxt XPath runtime context.
   * @param context The current source tree context node.
   *
   * @return score, one of {@link #MATCH_SCORE_NODETEST},
   * {@link #MATCH_SCORE_NONE}, {@link #MATCH_SCORE_OTHER},
   * or {@link #MATCH_SCORE_QNAME}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private static final boolean DEBUG_MATCHES = false;

  /** Set to true to get diagnostic messages about the result of
   *  match pattern testing.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public boolean bool(
          XPathContext xctxt, int contextNode, PrefixResolver namespaceContext)

  /**
   * Given an expression and a context, evaluate the XPath
   * and return the result.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @param namespaceContext The context in which namespaces in the
   * XPath are supposed to be expanded.
   *
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XObject execute(
          XPathContext xctxt, int contextNode, PrefixResolver namespaceContext)

  /**
   * Given an expression and a context, evaluate the XPath
   * and return the result.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @param namespaceContext The context in which namespaces in the
   * XPath are supposed to be expanded.
   *
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XObject execute(
          XPathContext xctxt, org.w3c.dom.Node contextNode,
          PrefixResolver namespaceContext)

  /**
   * Given an expression and a context, evaluate the XPath
   * and return the result.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @param namespaceContext The context in which namespaces in the
   * XPath are supposed to be expanded.
   *
   * @return The result of the XPath or null if callbacks are used.
   * @throws TransformerException thrown if
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(Expression expr)

  /**
   * Construct an XPath object.
   *
   * @param expr The Expression object.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(
          String exprString, SourceLocator locator, PrefixResolver prefixResolver, int type)

  /**
   * Construct an XPath object.
   *
   * (Needs review -sc) This method initializes an XPathParser/
   * Compiler and compiles the expression.
   * @param exprString The XPath expression.
   * @param locator The location of the expression, may be null.
   * @param prefixResolver A prefix resolver to use to resolve prefixes to
   *                       namespace URIs.
   * @param type one of {@link #SELECT} or {@link #MATCH}.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(
          String exprString, SourceLocator locator,
          PrefixResolver prefixResolver, int type,
          ErrorListener errorListener, FunctionTable aTable)

  /**
   * Construct an XPath object.
   *
   * (Needs review -sc) This method initializes an XPathParser/
   * Compiler and compiles the expression.
   * @param exprString The XPath expression.
   * @param locator The location of the expression, may be null.
   * @param prefixResolver A prefix resolver to use to resolve prefixes to
   *                       namespace URIs.
   * @param type one of {@link #SELECT} or {@link #MATCH}.
   * @param errorListener The error listener, or null if default should be used.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public XPath(
          String exprString, SourceLocator locator, PrefixResolver prefixResolver, int type,
          ErrorListener errorListener)

  /**
   * Construct an XPath object.
   *
   * (Needs review -sc) This method initializes an XPathParser/
   * Compiler and compiles the expression.
   * @param exprString The XPath expression.
   * @param locator The location of the expression, may be null.
   * @param prefixResolver A prefix resolver to use to resolve prefixes to
   *                       namespace URIs.
   * @param type one of {@link #SELECT} or {@link #MATCH}.
   * @param errorListener The error listener, or null if default should be used.
   *
   * @throws javax.xml.transform.TransformerException if syntax or other error.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final int MATCH = 1;

  /** Represents a match type expression.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public static final int SELECT = 0;

  /** Represents a select type expression. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public String getPatternString()

  /**
   * Return the XPath string associated with this object.
   *
   *
   * @return the XPath string associated with this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  String m_patternString;

  /** The pattern string, mainly kept around for diagnostic purposes.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
//  public void setLocator(SourceLocator l)

//  /**
//   * Set the SourceLocator on the expression object.
//   *
//   *
//   * @param l the SourceLocator on the expression object, which may be null.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public SourceLocator getLocator()

  /**
   * Get the SourceLocator on the expression object.
   *
   *
   * @return the SourceLocator on the expression object, which may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public void setExpression(Expression exp)

  /**
   * Set the raw expression object for this object.
   *
   *
   * @param exp the raw Expression object, which should not normally be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  public Expression getExpression()

  /**
   * Get the raw Expression object that this class wraps.
   *
   *
   * @return the raw Expression object, which should not normally be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private void initFunctionTable(){

  /**
   * initial the function table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private transient FunctionTable m_funcTable = null;

  /**
   * The function table for xpath build-in functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
  private Expression m_mainExp;

  /** The top of the expression tree.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPath.java
public class XPath implements Serializable, ExpressionOwner

/**
 * The XPath class wraps an expression object and provides general services
 * for execution of that expression.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public String evaluate(String expression, InputSource source)

    /**
     * <p>Evaluate an XPath expression in the context of the specified <code>InputSource</code>
     * and return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(String expression, InputSource source, QName returnType)} with a
     * <code>returnType</code> of {@link XPathConstants#STRING}.</p>
     *
     * <p>See <a href="#XPath-evaluation">Evaluation of XPath Expressions</a> for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>expression</code> or <code>source</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param source The <code>InputSource</code> of the document to evaluate over.
     *
     * @return The <code>String</code> that is the result of evaluating the expression and
     *   converting the result to a <code>String</code>.
     *
     * @throws XPathExpressionException If expression cannot be evaluated.
     * @throws NullPointerException If <code>expression</code> or <code>source</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public Object evaluate(
        String expression,
        InputSource source,
        QName returnType)

    /**
     * <p>Evaluate an XPath expression in the context of the specified <code>InputSource</code>
     * and return the result as the specified type.</p>
     *
     * <p>This method builds a data model for the {@link InputSource} and calls
     * {@link #evaluate(String expression, Object item, QName returnType)} on the resulting document object.</p>
     *
     * <p>See <a href="#XPath-evaluation">Evaluation of XPath Expressions</a> for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants},
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If <code>expression</code>, <code>source</code> or <code>returnType</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param source The input source of the document to evaluate over.
     * @param returnType The desired return type.
     *
     * @return The <code>Object</code> that encapsulates the result of evaluating the expression.
     *
     * @throws XPathExpressionException If expression cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If <code>expression</code>, <code>source</code> or <code>returnType</code>
     *   is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public String evaluate(String expression, Object item)

    /**
     * <p>Evaluate an XPath expression in the specified context and return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(String expression, Object item, QName returnType)} with a <code>returnType</code> of
     * {@link XPathConstants#STRING}.</p>
     *
     * <p>See <a href="#XPath-evaluation">Evaluation of XPath Expressions</a> for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>expression</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param item The starting context (a node, for example).
     *
     * @return The <code>String</code> that is the result of evaluating the expression and
     *   converting the result to a <code>String</code>.
     *
     * @throws XPathExpressionException If <code>expression</code> cannot be evaluated.
     * @throws NullPointerException If <code>expression</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public Object evaluate(String expression, Object item, QName returnType)

    /**
     * <p>Evaluate an <code>XPath</code> expression in the specified context and return the result as the specified type.</p>
     *
     * <p>See <a href="#XPath-evaluation">Evaluation of XPath Expressions</a> for context item evaluation,
     * variable, function and <code>QName</code> resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants} (
     * {@link XPathConstants#NUMBER NUMBER},
     * {@link XPathConstants#STRING STRING},
     * {@link XPathConstants#BOOLEAN BOOLEAN},
     * {@link XPathConstants#NODE NODE} or
     * {@link XPathConstants#NODESET NODESET})
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>expression</code> or <code>returnType</code> is <code>null</code>, then a
     * <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param item The starting context (a node, for example).
     * @param returnType The desired return type.
     *
     * @return Result of evaluating an XPath expression as an <code>Object</code> of <code>returnType</code>.
     *
     * @throws XPathExpressionException If <code>expression</code> cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If <code>expression</code> or <code>returnType</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public XPathExpression compile(String expression)

    /**
       * <p>Compile an XPath expression for later evaluation.</p>
       *
       * <p>If <code>expression</code> contains any {@link XPathFunction}s,
       * they must be available via the {@link XPathFunctionResolver}.
       * An {@link XPathExpressionException} will be thrown if the
       * <code>XPathFunction</code>
       * cannot be resovled with the <code>XPathFunctionResolver</code>.</p>
       *
       * <p>If <code>expression</code> contains any variables, the
       * {@link XPathVariableResolver} in effect
       * <strong>at compile time</strong> will be used to resolve them.</p>
       *
       * <p>If <code>expression</code> is <code>null</code>, a <code>NullPointerException</code> is thrown.</p>
       *
       * @param expression The XPath expression.
       *
       * @return Compiled XPath expression.

       * @throws XPathExpressionException If <code>expression</code> cannot be compiled.
       * @throws NullPointerException If <code>expression</code> is <code>null</code>.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public NamespaceContext getNamespaceContext();

    /**
       * <p>Return the current namespace context.</p>
       *
       * <p><code>null</code> is returned in no namespace context is in effect.</p>
       *
       * @return Current Namespace context.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public void setNamespaceContext(NamespaceContext nsContext);

    /**
       * <p>Establish a namespace context.</p>
       *
       * <p>A <code>NullPointerException</code> is thrown if <code>nsContext</code> is <code>null</code>.</p>
       *
       * @param nsContext Namespace context to use.
       *
       * @throws NullPointerException If <code>nsContext</code> is <code>null</code>.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public XPathFunctionResolver getXPathFunctionResolver();

    /**
       * <p>Return the current function resolver.</p>
       *
       * <p><code>null</code> is returned in no function resolver is in effect.</p>
       *
       * @return Current function resolver.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public void setXPathFunctionResolver(XPathFunctionResolver resolver);

    /**
       * <p>Establish a function resolver.</p>
       *
       * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code> is <code>null</code>.</p>
       *
       * @param resolver XPath function resolver.
       *
       * @throws NullPointerException If <code>resolver</code> is <code>null</code>.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public XPathVariableResolver getXPathVariableResolver();

    /**
       * <p>Return the current variable resolver.</p>
       *
       * <p><code>null</code> is returned in no variable resolver is in effect.</p>
       *
       * @return Current variable resolver.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
    public void setXPathVariableResolver(XPathVariableResolver resolver);

    /**
     * <p>Establish a variable resolver.</p>
     *
     * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code> is <code>null</code>.</p>
     *
     * @param resolver Variable resolver.
     *
     *  @throws NullPointerException If <code>resolver</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
        public void reset();

        /**
         * <p>Reset this <code>XPath</code> to its original configuration.</p>
         *
         * <p><code>XPath</code> is reset to the same state as when it was created with
         * {@link XPathFactory#newXPath()}.
         * <code>reset()</code> is designed to allow the reuse of existing <code>XPath</code>s
         * thus saving resources associated with the creation of new <code>XPath</code>s.</p>
         *
         * <p>The reset <code>XPath</code> is not guaranteed to have the same {@link XPathFunctionResolver}, {@link XPathVariableResolver}
         * or {@link NamespaceContext} <code>Object</code>s, e.g. {@link Object#equals(Object obj)}.
         * It is guaranteed to have a functionally equal <code>XPathFunctionResolver</code>, <code>XPathVariableResolver</code>
         * and <code>NamespaceContext</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPath.java
public interface XPath {

/**
 * <p><code>XPath</code> provides access to the XPath evaluation environment and expressions.</p>
 *
 * <a name="XPath-evaluation"/>
 * <table border="1" cellpadding="2">
 *   <thead>
 *     <tr>
 *       <th colspan="2">Evaluation of XPath Expressions.</th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *     <tr>
 *       <td>context</td>
 *       <td>
 *         If a request is made to evaluate the expression in the absence
 * of a context item, an empty document node will be used for the context.
 * For the purposes of evaluating XPath expressions, a DocumentFragment
 * is treated like a Document node.
 *      </td>
 *    </tr>
 *    <tr>
 *      <td>variables</td>
 *      <td>
 *        If the expression contains a variable reference, its value will be found through the {@link XPathVariableResolver}
 *        set with {@link #setXPathVariableResolver(XPathVariableResolver resolver)}.
 *        An {@link XPathExpressionException} is raised if the variable resolver is undefined or
 *        the resolver returns <code>null</code> for the variable.
 *        The value of a variable must be immutable through the course of any single evaluation.</p>
 *      </td>
 *    </tr>
 *    <tr>
 *      <td>functions</td>
 *      <td>
 *        If the expression contains a function reference, the function will be found through the {@link XPathFunctionResolver}
 *        set with {@link #setXPathFunctionResolver(XPathFunctionResolver resolver)}.
 *        An {@link XPathExpressionException} is raised if the function resolver is undefined or
 *        the function resolver returns <code>null</code> for the function.</p>
 *      </td>
 *    </tr>
 *    <tr>
 *      <td>QNames</td>
 *      <td>
 *        QNames in the expression are resolved against the XPath namespace context
 *        set with {@link #setNamespaceContext(NamespaceContext nsContext)}.
 *      </td>
 *    </tr>
 *    <tr>
 *      <td>result</td>
 *      <td>
 *        This result of evaluating an expression is converted to an instance of the desired return type.
 *        Valid return types are defined in {@link XPathConstants}.
 *        Conversion to the return type follows XPath conversion rules.</p>
 *      </td>
 *    </tr>
 * </table>
 *
 * <p>An XPath object is not thread-safe and not reentrant.
 * In other words, it is the application's responsibility to make
 * sure that one {@link XPath} object is not used from
 * more than one thread at any given time, and while the <code>evaluate</code>
 * method is invoked, applications may not recursively call
 * the <code>evaluate</code> method.
 * <p>
 *
 * @author  <a href="Norman.Walsh@Sun.com">Norman Walsh</a>
 * @author  <a href="Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @see <a href="http://www.w3.org/TR/xpath">XML Path Language (XPath) Version 1.0</a>
 * @since 1.5
 */
