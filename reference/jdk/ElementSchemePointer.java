_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        protected void addToken(Tokens tokens, int token) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int scanNCName(String data, int endOffset, int currentOffset) {

        /**
         * Scans a NCName.
         * From Namespaces in XML
         * [5] NCName ::= (Letter | '_') (NCNameChar)*
         * [6] NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender
         *
         * @param data A String containing the XPointer expression
         * @param endOffset The int XPointer expression length
         * @param currentOffset An int representing the current position of the XPointer expression pointer
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private boolean scanExpr(SymbolTable symbolTable, Tokens tokens,
                String data, int currentOffset, int endOffset)

        /**
         * Scans the XPointer Expression
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private Scanner(SymbolTable symbolTable) {

        /**
         * Constructs an XPath expression scanner.
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private SymbolTable fSymbolTable;

        /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        //

        /**
         * Symbol literals
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private static final byte CHARTYPE_INVALID = 0, // invalid XML characters, control characters and 7F

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    private class Scanner {

    /**
     *
     * The XPointer expression scanner.  Scans the XPointer framework expression.
     *
     * @xerces.internal
     *
     * @version $Id: ElementSchemePointer.java,v 1.4 2009/06/11 23:51:50 joehw Exp $
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int getTokenCount() {

        /**
         * Returns the number of tokens.
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private String nextTokenAsString() throws XNIException {

        /**
         * Obtains the token at the current position as a String.
         *
         * If there's no current token or if the current token
         * is not a string token, this method throws
         * If there's no such next token, this method throws
         * <tt>new XNIException("InvalidXPointerExpression");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int peekToken() throws XNIException {

        /**
         * Obtains the token at the current position, without advancing
         * the current position.
         *
         * If there's no such next token, this method throws
         * <tt>new XNIException("InvalidXPointerExpression");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int nextToken() throws XNIException {

        /**
         * Obtains the token at the current position, then advance
         * the current position by one.
         *
         * If there's no such next token, this method throws
         * <tt>new XNIException("InvalidXPointerExpression");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private boolean hasMore() {

        /**
         * Returns true if the {@link #getNextToken()} method
         * returns a valid token.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private void rewind() {

        /**
         * Resets the current position to the head of the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private void addToken(int token) {

        /**
         * Add the specified int token
         *
         * @param token The int specifying the token
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private void addToken(String tokenStr) {

        /**
         * Add the specified string as a token
         *
         * @param token The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private Integer getToken(int token) {

        /**
         * Returns the token String
         * @param token The index of the token
         * @return String The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private Tokens(SymbolTable symbolTable) {

        /**
         * Constructor
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private static final int XPTRTOKEN_ELEM_NCNAME = 0;

        /**
         * XPointer element() scheme
         * [1]    ElementSchemeData    ::=    (NCName ChildSequence?) | ChildSequence
         * [2]    ChildSequence    ::=    ('/' [1-9] [0-9]*)+
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    private final class Tokens {

    /**
     * List of XPointer Framework tokens.
     *
     * @xerces.internal
     *
     * @author Neil Delima, IBM
     * @version $Id: ElementSchemePointer.java,v 1.4 2009/06/11 23:51:50 joehw Exp $
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected void init() {

    /**
     * Initializes the element scheme processor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected void initErrorReporter() {

    /**
     * Initializes error handling objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected void reportError(String key, Object[] arguments)

    /**
         * Reports an XPointer error
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public boolean isChildFragmentResolved() {

    /**
     * Returns true if the XPointer expression resolves to a non-element child
     * of the current resource fragment.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isChildFragmentResolved()
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public boolean isFragmentResolved() throws XNIException {

    /**
     * Returns true if the node matches or is a child of a matching element()
     * scheme XPointer.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected boolean checkMatch() {

    /**
     * Matches the current position of the element being visited by checking
     * its position and previous elements against the element XPointer expression.
     * If a match is found it return true else false.
     *
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected boolean matchChildSequence(QName element, int event)

    /**
     * Matches the current element position in the document tree with the
     * element position specified in the element XPointer scheme.
     *
     * @param event
     * @return boolean - true if the current element position in the document
     * tree matches theelement position specified in the element XPointer
     * scheme.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public boolean resolveXPointer(QName element, XMLAttributes attributes,
            Augmentations augs, int event) throws XNIException {

    /**
     * Responsible for resolving the element() scheme XPointer.  If a ShortHand
     * Pointer is present and it is successfully resolved and if a child
     * sequence is present, the child sequence is resolved relative to it.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#resolveXPointer(com.sun.org.apache.xerces.internal.xni.QName, com.sun.org.apache.xerces.internal.xni.XMLAttributes, com.sun.org.apache.xerces.internal.xni.Augmentations, int event)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public void setSchemeData(String schemeData) {

    /**
     * Sets the scheme data
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeData(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public void setSchemeName(String schemeName) {

    /**
     * Sets the scheme name
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeName(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public String getSchemeData() {

    /**
     * Returns the scheme data
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeData()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public String getSchemeName() {

    /**
     * Returns the scheme name i.e element
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public void parseXPointer(String xpointer) throws XNIException {

    /**
     * Parses the XPointer expression and tokenizes it into Strings
     * delimited by whitespace.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#parseXPointer(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
class ElementSchemePointer implements XPointerPart {

/**
 * <p>
 * Implements the XPointerPart interface for element() scheme specific processing.
 * </p>
 *
 * @xerces.internal
 *
 * @version $Id: ElementSchemePointer.java,v 1.4 2009/06/11 23:51:50 joehw Exp $
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        protected void addToken(Tokens tokens, int token) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int scanNCName(String data, int endOffset, int currentOffset) {

        /**
         * Scans a NCName.
         * From Namespaces in XML
         * [5] NCName ::= (Letter | '_') (NCNameChar)*
         * [6] NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender
         *
         * @param data A String containing the XPointer expression
         * @param endOffset The int XPointer expression length
         * @param currentOffset An int representing the current position of the XPointer expression pointer
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private boolean scanExpr(SymbolTable symbolTable, Tokens tokens,
                String data, int currentOffset, int endOffset)

        /**
         * Scans the XPointer Expression
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private Scanner(SymbolTable symbolTable) {

        /**
         * Constructs an XPath expression scanner.
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private SymbolTable fSymbolTable;

        /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        //

        /**
         * Symbol literals
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private static final byte CHARTYPE_INVALID = 0, // invalid XML characters, control characters and 7F

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    private class Scanner {

    /**
     *
     * The XPointer expression scanner.  Scans the XPointer framework expression.
     *
     * @xerces.internal
     *
     * @version $Id: ElementSchemePointer.java,v 1.4 2009/06/11 23:51:50 joehw Exp $
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int getTokenCount() {

        /**
         * Returns the number of tokens.
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private String nextTokenAsString() throws XNIException {

        /**
         * Obtains the token at the current position as a String.
         *
         * If there's no current token or if the current token
         * is not a string token, this method throws
         * If there's no such next token, this method throws
         * <tt>new XNIException("InvalidXPointerExpression");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int peekToken() throws XNIException {

        /**
         * Obtains the token at the current position, without advancing
         * the current position.
         *
         * If there's no such next token, this method throws
         * <tt>new XNIException("InvalidXPointerExpression");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private int nextToken() throws XNIException {

        /**
         * Obtains the token at the current position, then advance
         * the current position by one.
         *
         * If there's no such next token, this method throws
         * <tt>new XNIException("InvalidXPointerExpression");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private boolean hasMore() {

        /**
         * Returns true if the {@link #getNextToken()} method
         * returns a valid token.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private void rewind() {

        /**
         * Resets the current position to the head of the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private void addToken(int token) {

        /**
         * Add the specified int token
         *
         * @param token The int specifying the token
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private void addToken(String tokenStr) {

        /**
         * Add the specified string as a token
         *
         * @param token The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private Integer getToken(int token) {

        /**
         * Returns the token String
         * @param token The index of the token
         * @return String The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private Tokens(SymbolTable symbolTable) {

        /**
         * Constructor
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
        private static final int XPTRTOKEN_ELEM_NCNAME = 0;

        /**
         * XPointer element() scheme
         * [1]    ElementSchemeData    ::=    (NCName ChildSequence?) | ChildSequence
         * [2]    ChildSequence    ::=    ('/' [1-9] [0-9]*)+
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    private final class Tokens {

    /**
     * List of XPointer Framework tokens.
     *
     * @xerces.internal
     *
     * @author Neil Delima, IBM
     * @version $Id: ElementSchemePointer.java,v 1.4 2009/06/11 23:51:50 joehw Exp $
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected void init() {

    /**
     * Initializes the element scheme processor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected void initErrorReporter() {

    /**
     * Initializes error handling objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected void reportError(String key, Object[] arguments)

    /**
         * Reports an XPointer error
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public boolean isChildFragmentResolved() {

    /**
     * Returns true if the XPointer expression resolves to a non-element child
     * of the current resource fragment.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isChildFragmentResolved()
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public boolean isFragmentResolved() throws XNIException {

    /**
     * Returns true if the node matches or is a child of a matching element()
     * scheme XPointer.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected boolean checkMatch() {

    /**
     * Matches the current position of the element being visited by checking
     * its position and previous elements against the element XPointer expression.
     * If a match is found it return true else false.
     *
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    protected boolean matchChildSequence(QName element, int event)

    /**
     * Matches the current element position in the document tree with the
     * element position specified in the element XPointer scheme.
     *
     * @param event
     * @return boolean - true if the current element position in the document
     * tree matches theelement position specified in the element XPointer
     * scheme.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public boolean resolveXPointer(QName element, XMLAttributes attributes,
            Augmentations augs, int event) throws XNIException {

    /**
     * Responsible for resolving the element() scheme XPointer.  If a ShortHand
     * Pointer is present and it is successfully resolved and if a child
     * sequence is present, the child sequence is resolved relative to it.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#resolveXPointer(com.sun.org.apache.xerces.internal.xni.QName, com.sun.org.apache.xerces.internal.xni.XMLAttributes, com.sun.org.apache.xerces.internal.xni.Augmentations, int event)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public void setSchemeData(String schemeData) {

    /**
     * Sets the scheme data
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeData(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public void setSchemeName(String schemeName) {

    /**
     * Sets the scheme name
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#setSchemeName(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public String getSchemeData() {

    /**
     * Returns the scheme data
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeData()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public String getSchemeName() {

    /**
     * Returns the scheme name i.e element
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#getSchemeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
    public void parseXPointer(String xpointer) throws XNIException {

    /**
     * Parses the XPointer expression and tokenizes it into Strings
     * delimited by whitespace.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#parseXPointer(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/ElementSchemePointer.java
class ElementSchemePointer implements XPointerPart {

/**
 * <p>
 * Implements the XPointerPart interface for element() scheme specific processing.
 * </p>
 *
 * @xerces.internal
 *
 * @version $Id: ElementSchemePointer.java,v 1.4 2009/06/11 23:51:50 joehw Exp $
 *
 */
