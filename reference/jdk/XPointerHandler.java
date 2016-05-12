_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void setProperty(String propertyId, Object value)

    /**
     * <p>
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * </p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                  In general, components should
     *                                  only throw this exception if
     *                                  it is <strong>really</strong>
     *                                  a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void endElement(QName element, Augmentations augs)

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs    Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void ignorableWhitespace(XMLString text, Augmentations augs)

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text   The ignorable whitespace.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void characters(XMLString text, Augmentations augs)

    /**
     * Character content.
     *
     * @param text   The content.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void emptyElement(QName element, XMLAttributes attributes,
            Augmentations augs) throws XNIException {

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void startElement(QName element, XMLAttributes attributes,
            Augmentations augs) throws XNIException {

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void processingInstruction(String target, XMLString data,
            Augmentations augs) throws XNIException {

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param target The target.
     * @param data   The data or null if none specified.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * If the comment is a child of a matched element, then pass else return.
     *
     * @param text   The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private int scanData(String data, StringBuffer schemeData,
                int endOffset, int currentOffset) {

        /**
         * Scans the SchemeData.
         * [6]    SchemeData   ::=    EscapedData*
         * [7]    EscapedData  ::=    NormalChar | '^(' | '^)' | '^^' | '(' SchemeData ')'
         * [8]    NormalChar   ::=    UnicodeChar - [()^]
         * [9]    UnicodeChar  ::=    [#x0-#x10FFFF]
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private boolean scanExpr(SymbolTable symbolTable, Tokens tokens,
                String data, int currentOffset, int endOffset)

        /**
         * Scans the XPointer Expression
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private Scanner(SymbolTable symbolTable) {

        /**
         * Constructs an XPointer Framework expression scanner.
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private SymbolTable fSymbolTable;

        /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private static final byte CHARTYPE_INVALID = 0, // invalid XML character

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private class Scanner {

    /**
     *
     * The XPointer expression scanner.  Scans the XPointer framework expression.
     *
     * @xerces.internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private String nextTokenAsString() throws XNIException {

        /**
         * Obtains the token at the current position as a String.
         *
         * If there's no current token or if the current token
         * is not a string token, this method throws
         * If there's no such next token, this method throws
         * <tt>new XNIException("XPointerProcessingError");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private int peekToken() throws XNIException {

        /**
         * Obtains the token at the current position, without advancing
         * the current position.
         *
         * If there's no such next token, this method throws
         * <tt>new XNIException("XPointerProcessingError");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private int nextToken() throws XNIException {

        /**
         * Obtains the token at the current position, then advance
         * the current position by one.
         *
         * throws If there's no such next token, this method throws
         * <tt>new XNIException("XPointerProcessingError");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private boolean hasMore() {

        /**
         * Returns true if the {@link #getNextToken()} method
         * returns a valid token.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private void rewind() {

        /**
         * Resets the current position to the head of the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private void addToken(int token) {

        /**
         * Add the specified int token
         *
         * @param token The int specifying the token
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private void addToken(String tokenStr) {

        /**
         * Add the specified string as a token
         *
         * @param token The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private String getTokenString(int token) {

        /**
         * Returns the token String
         * @param token The index of the token
         * @return String The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private Tokens(SymbolTable symbolTable) {

        /**
         * Constructor
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private static final int XPTRTOKEN_OPEN_PAREN = 0,

        /**
         * XPointer Framework tokens
         * [1] Pointer     ::= Shorthand | SchemeBased
         * [2] Shorthand   ::= NCName
         * [3] SchemeBased ::= PointerPart (S? PointerPart)*
         * [4] PointerPart ::= SchemeName '(' SchemeData ')'
         * [5] SchemeName  ::= QName
         * [6] SchemeData  ::= EscapedData*
         * [7] EscapedData ::= NormalChar | '^(' | '^)' | '^^' | '(' SchemeData ')'
         * [8] NormalChar  ::= UnicodeChar - [()^]
         * [9] UnicodeChar ::= [#x0-#x10FFFF]
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private final class Tokens {

    /**
     * List of XPointer Framework tokens.
     *
     * @xerces.internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public Vector getPointerParts() {

    /**
     * Returns a Vector of XPointerPart objects
     *
     * @return A Vector of XPointerPart objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    protected void init() {

    /**
     * Initializes the XPointer Processor;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    protected void initErrorReporter() {

    /**
     * Initializes error handling objects
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private void reportWarning(String key, Object[] arguments)

    /**
     * Reports XPointer Warnings
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private void reportError(String key, Object[] arguments)

    /**
     * Reports XPointer Errors
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public XPointerPart getXPointerPart() {

    /**
     * Returns the pointer part used to resolve the document fragment.
     *
     * @return String - The pointer part used to resolve the document fragment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean isXPointerResolved() throws XNIException {

    /**
     * Returns true if the XPointer successfully found a sub-resource .
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean isChildFragmentResolved() throws XNIException {

    /**
     * Returns true if the XPointer expression resolves to a non-element child
     * of the current resource fragment.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isChildFragmentResolved()
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean isFragmentResolved() throws XNIException {

    /**
     * Returns true if the Node fragment is resolved.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean resolveXPointer(QName element, XMLAttributes attributes,
            Augmentations augs, int event) throws XNIException {

    /**
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#resolveXPointer(com.sun.org.apache.xerces.internal.xni.QName, com.sun.org.apache.xerces.internal.xni.XMLAttributes, com.sun.org.apache.xerces.internal.xni.Augmentations, int event)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void parseXPointer(String xpointer) throws XNIException {

    /**
     * Parses the XPointer framework expression and delegates scheme specific parsing.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#parseXPointer(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public XPointerHandler() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
public final class XPointerHandler extends XIncludeHandler implements

/**
 * <p>
 * This is a pipeline component which extends the XIncludeHandler to perform
 * XPointer specific processing specified in the W3C XPointerFramework and
 * element() Scheme Recommendations.
 * </p>
 *
 * <p>
 * This component analyzes each event in the pipeline, looking for an element
 * that matches a PointerPart in the parent XInclude element's xpointer attribute
 * value.  If the match succeeds, all children are passed by this component.
 * </p>
 *
 * <p>
 * See the <a href="http://www.w3.org/TR/xptr-framework//">XPointer Framework Recommendation</a> for
 * more information on the XPointer Framework and ShortHand Pointers.
 * See the <a href="http://www.w3.org/TR/xptr-element/">XPointer element() Scheme Recommendation</a> for
 * more information on the XPointer element() Scheme.
 * </p>
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void setProperty(String propertyId, Object value)

    /**
     * <p>
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * </p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                  In general, components should
     *                                  only throw this exception if
     *                                  it is <strong>really</strong>
     *                                  a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void endElement(QName element, Augmentations augs)

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs    Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void ignorableWhitespace(XMLString text, Augmentations augs)

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text   The ignorable whitespace.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void characters(XMLString text, Augmentations augs)

    /**
     * Character content.
     *
     * @param text   The content.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void emptyElement(QName element, XMLAttributes attributes,
            Augmentations augs) throws XNIException {

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void startElement(QName element, XMLAttributes attributes,
            Augmentations augs) throws XNIException {

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void processingInstruction(String target, XMLString data,
            Augmentations augs) throws XNIException {

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param target The target.
     * @param data   The data or null if none specified.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * If the comment is a child of a matched element, then pass else return.
     *
     * @param text   The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private int scanData(String data, StringBuffer schemeData,
                int endOffset, int currentOffset) {

        /**
         * Scans the SchemeData.
         * [6]    SchemeData   ::=    EscapedData*
         * [7]    EscapedData  ::=    NormalChar | '^(' | '^)' | '^^' | '(' SchemeData ')'
         * [8]    NormalChar   ::=    UnicodeChar - [()^]
         * [9]    UnicodeChar  ::=    [#x0-#x10FFFF]
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private boolean scanExpr(SymbolTable symbolTable, Tokens tokens,
                String data, int currentOffset, int endOffset)

        /**
         * Scans the XPointer Expression
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private Scanner(SymbolTable symbolTable) {

        /**
         * Constructs an XPointer Framework expression scanner.
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private SymbolTable fSymbolTable;

        /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private static final byte CHARTYPE_INVALID = 0, // invalid XML character

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private class Scanner {

    /**
     *
     * The XPointer expression scanner.  Scans the XPointer framework expression.
     *
     * @xerces.internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private String nextTokenAsString() throws XNIException {

        /**
         * Obtains the token at the current position as a String.
         *
         * If there's no current token or if the current token
         * is not a string token, this method throws
         * If there's no such next token, this method throws
         * <tt>new XNIException("XPointerProcessingError");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private int peekToken() throws XNIException {

        /**
         * Obtains the token at the current position, without advancing
         * the current position.
         *
         * If there's no such next token, this method throws
         * <tt>new XNIException("XPointerProcessingError");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private int nextToken() throws XNIException {

        /**
         * Obtains the token at the current position, then advance
         * the current position by one.
         *
         * throws If there's no such next token, this method throws
         * <tt>new XNIException("XPointerProcessingError");</tt>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private boolean hasMore() {

        /**
         * Returns true if the {@link #getNextToken()} method
         * returns a valid token.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private void rewind() {

        /**
         * Resets the current position to the head of the token list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private void addToken(int token) {

        /**
         * Add the specified int token
         *
         * @param token The int specifying the token
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private void addToken(String tokenStr) {

        /**
         * Add the specified string as a token
         *
         * @param token The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private String getTokenString(int token) {

        /**
         * Returns the token String
         * @param token The index of the token
         * @return String The token string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private Tokens(SymbolTable symbolTable) {

        /**
         * Constructor
         *
         * @param symbolTable SymbolTable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
        private static final int XPTRTOKEN_OPEN_PAREN = 0,

        /**
         * XPointer Framework tokens
         * [1] Pointer     ::= Shorthand | SchemeBased
         * [2] Shorthand   ::= NCName
         * [3] SchemeBased ::= PointerPart (S? PointerPart)*
         * [4] PointerPart ::= SchemeName '(' SchemeData ')'
         * [5] SchemeName  ::= QName
         * [6] SchemeData  ::= EscapedData*
         * [7] EscapedData ::= NormalChar | '^(' | '^)' | '^^' | '(' SchemeData ')'
         * [8] NormalChar  ::= UnicodeChar - [()^]
         * [9] UnicodeChar ::= [#x0-#x10FFFF]
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private final class Tokens {

    /**
     * List of XPointer Framework tokens.
     *
     * @xerces.internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public Vector getPointerParts() {

    /**
     * Returns a Vector of XPointerPart objects
     *
     * @return A Vector of XPointerPart objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    protected void init() {

    /**
     * Initializes the XPointer Processor;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    protected void initErrorReporter() {

    /**
     * Initializes error handling objects
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private void reportWarning(String key, Object[] arguments)

    /**
     * Reports XPointer Warnings
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    private void reportError(String key, Object[] arguments)

    /**
     * Reports XPointer Errors
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public XPointerPart getXPointerPart() {

    /**
     * Returns the pointer part used to resolve the document fragment.
     *
     * @return String - The pointer part used to resolve the document fragment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean isXPointerResolved() throws XNIException {

    /**
     * Returns true if the XPointer successfully found a sub-resource .
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean isChildFragmentResolved() throws XNIException {

    /**
     * Returns true if the XPointer expression resolves to a non-element child
     * of the current resource fragment.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerPart#isChildFragmentResolved()
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean isFragmentResolved() throws XNIException {

    /**
     * Returns true if the Node fragment is resolved.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#isFragmentResolved()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public boolean resolveXPointer(QName element, XMLAttributes attributes,
            Augmentations augs, int event) throws XNIException {

    /**
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#resolveXPointer(com.sun.org.apache.xerces.internal.xni.QName, com.sun.org.apache.xerces.internal.xni.XMLAttributes, com.sun.org.apache.xerces.internal.xni.Augmentations, int event)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public void parseXPointer(String xpointer) throws XNIException {

    /**
     * Parses the XPointer framework expression and delegates scheme specific parsing.
     *
     * @see com.sun.org.apache.xerces.internal.xpointer.XPointerProcessor#parseXPointer(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
    public XPointerHandler() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xpointer/XPointerHandler.java
public final class XPointerHandler extends XIncludeHandler implements

/**
 * <p>
 * This is a pipeline component which extends the XIncludeHandler to perform
 * XPointer specific processing specified in the W3C XPointerFramework and
 * element() Scheme Recommendations.
 * </p>
 *
 * <p>
 * This component analyzes each event in the pipeline, looking for an element
 * that matches a PointerPart in the parent XInclude element's xpointer attribute
 * value.  If the match succeeds, all children are passed by this component.
 * </p>
 *
 * <p>
 * See the <a href="http://www.w3.org/TR/xptr-framework//">XPointer Framework Recommendation</a> for
 * more information on the XPointer Framework and ShortHand Pointers.
 * See the <a href="http://www.w3.org/TR/xptr-element/">XPointer element() Scheme Recommendation</a> for
 * more information on the XPointer element() Scheme.
 * </p>
 *
 * @xerces.internal
 *
 */
