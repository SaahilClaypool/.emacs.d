_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private int getLineNumber() {

    /**
     * Get the line number, or zero
     * if there is no _locator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void setDocumentLocator(Locator locator) {

    /**
     * Store the document locator to later retrieve line numbers of all
     * elements from the stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void skippedEntity(String name) { }

    /**
     * IGNORED - we do not have to do anything with skipped entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void ignorableWhitespace(char[] ch, int start, int length) { }

    /**
     * IGNORED - all ignorable whitespace is ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void processingInstruction(String name, String value) {

    /**
     * SAX2: Receive notification of a processing instruction.
     *       These require special handling for stylesheet PIs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void characters(char[] ch, int start, int length) {

    /**
     * SAX2: Receive notification of character data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void endElement(String uri, String localname, String qname) {

    /**
     * SAX2: Receive notification of the end of an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void startElement(String uri, String localname,
                             String qname, Attributes attributes)

    /**
     * SAX2: Receive notification of the beginning of an element.
     *       The parser may re-use the attribute list that we're passed so
     *       we clone the attributes in our own Attributes implementation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void endPrefixMapping(String prefix) { }

    /**
     * SAX2: End the scope of a prefix-URI Namespace mapping.
     *       This has to be passed on to the symbol table!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void startPrefixMapping(String prefix, String uri) {

    /**
     * SAX2: Begin the scope of a prefix-URI Namespace mapping.
     *       This has to be passed on to the symbol table!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void endDocument() { }

    /**
     * SAX2: Receive notification of the end of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void startDocument() {

    /**
     * SAX2: Receive notification of the beginning of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private Stack _parentStack = null;

    /************************ SAX2 ContentHandler INTERFACE *****************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void reportError(final int category, final ErrorMsg error) {

    /**
     * Common error/warning message handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void printWarnings() {

    /**
     * Prints all compile-time warnings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void printErrors() {

    /**
     * Prints all compile-time errors
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    /**

    /************************ ERROR HANDLING SECTION ************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode parseTopLevel(SyntaxTreeNode parent, String text,
                                         String expression) {

    /**
     * Parse an XPath expression or pattern using the generated XPathParser
     * The method will return a Dummy node if the XPath parser fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Pattern parsePattern(SyntaxTreeNode parent,
                                String attr, String def) {

    /**
     * Parse an XPath pattern:
     *  @param parent - XSL element where the pattern occured
     *  @param attr   - name of this element's attribute to get pattern from
     *  @param def    - default pattern (if the attribute was not found)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Pattern parsePattern(SyntaxTreeNode parent, String pattern) {

    /**
     * Parse an XPath pattern:
     *  @param parent  - XSL element where the pattern occured
     *  @param pattern - textual representation of the pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Expression parseExpression(SyntaxTreeNode parent,
                                      String attr, String def) {

    /**
     * Parse an XPath expression:
     *  @param parent - XSL element where the expression occured
     *  @param attr   - name of this element's attribute to get expression from
     *  @param def    - default expression (if the attribute was not found)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Expression parseExpression(SyntaxTreeNode parent, String exp) {

    /**
     * Parse an XPath expression:
     *  @param parent - XSL element where the expression occured
     *  @param exp    - textual representation of the expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private void checkForSuperfluousAttributes(SyntaxTreeNode node,
        Attributes attrs)

    /**
     * checks the list of attributes against a list of allowed attributes
     * for a particular element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private boolean versionIsOne = true;

    /**
     * Creates a new node in the abstract syntax tree. This node can be
     *  o) a supported XSLT 1.0 element
     *  o) an unsupported XSLT element (post 1.0)
     *  o) a supported XSLT extension
     *  o) an unsupported XSLT extension
     *  o) a literal result element (not an XSLT element and not an extension)
     * Unsupported elements do not directly generate an error. We have to wait
     * until we have received all child elements of an unsupported element to
     * see if any <xsl:fallback> elements exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private void initSymbolTable() {

    /**
     * Add primops and base functions to the symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private void initStdClasses() {

    /**
     * Initialize the _instructionClasses map, which maps XSL element
     * names to Java classes in this package.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode loadExternalStylesheet(String location)

    /**
     * For embedded stylesheets: Load an external file with stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode findStylesheet(SyntaxTreeNode root, String href) {

    /**
     * Find a Stylesheet element with a specific ID attribute value.
     * This method is used to find a Stylesheet node that is referred
     * in a <?xml-stylesheet ... ?> processing instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode getStylesheet(SyntaxTreeNode root)

    /**
     * Extracts the DOM for the stylesheet. In the case of an embedded
     * stylesheet, it extracts the DOM subtree corresponding to the
     * embedded stylesheet that has an 'id' attribute whose value is the
     * same as the value declared in the <?xml-stylesheet...?> processing
     * instruction (P.I.). In the xml-stylesheet P.I. the value is labeled
     * as the 'href' data of the P.I. The extracted DOM representing the
     * stylesheet is returned as an Element object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    protected void setPIParameters(String media, String title, String charset) {

    /**
     * Set the parameters to use to locate the correct <?xml-stylesheet ...?>
     * processing instruction in the case where the input document is an
     * XML document with one or more references to a stylesheet.
     * @param media The media attribute to be matched. May be null, in which
     * case the prefered templates will be used (i.e. alternate = no).
     * @param title The value of the title attribute to match. May be null.
     * @param charset The value of the charset attribute to match. May be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public SyntaxTreeNode parse(InputSource input) {

    /**
     * Parses a stylesheet and builds the internal abstract syntax tree
     * @param input A SAX2 InputSource can be passed to a SAX reader
     * @return The root of the abstract syntax tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public SyntaxTreeNode parse(XMLReader reader, InputSource input) {

    /**
     * Parses a stylesheet and builds the internal abstract syntax tree
     * @param reader A SAX2 SAXReader (parser)
     * @param input A SAX2 InputSource can be passed to a SAX reader
     * @return The root of the abstract syntax tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void createAST(Stylesheet stylesheet) {

    /**
     * Instanciates a SAX2 parser and generate the AST from the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Stylesheet makeStylesheet(SyntaxTreeNode element)

    /**
     * Create an instance of the <code>Stylesheet</code> class,
     * and then parse, typecheck and compile the instance.
     * Must be called after <code>parse()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
public class Parser implements Constants, ContentHandler {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private int getLineNumber() {

    /**
     * Get the line number, or zero
     * if there is no _locator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void setDocumentLocator(Locator locator) {

    /**
     * Store the document locator to later retrieve line numbers of all
     * elements from the stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void skippedEntity(String name) { }

    /**
     * IGNORED - we do not have to do anything with skipped entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void ignorableWhitespace(char[] ch, int start, int length) { }

    /**
     * IGNORED - all ignorable whitespace is ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void processingInstruction(String name, String value) {

    /**
     * SAX2: Receive notification of a processing instruction.
     *       These require special handling for stylesheet PIs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void characters(char[] ch, int start, int length) {

    /**
     * SAX2: Receive notification of character data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void endElement(String uri, String localname, String qname) {

    /**
     * SAX2: Receive notification of the end of an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void startElement(String uri, String localname,
                             String qname, Attributes attributes)

    /**
     * SAX2: Receive notification of the beginning of an element.
     *       The parser may re-use the attribute list that we're passed so
     *       we clone the attributes in our own Attributes implementation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void endPrefixMapping(String prefix) { }

    /**
     * SAX2: End the scope of a prefix-URI Namespace mapping.
     *       This has to be passed on to the symbol table!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void startPrefixMapping(String prefix, String uri) {

    /**
     * SAX2: Begin the scope of a prefix-URI Namespace mapping.
     *       This has to be passed on to the symbol table!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void endDocument() { }

    /**
     * SAX2: Receive notification of the end of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void startDocument() {

    /**
     * SAX2: Receive notification of the beginning of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private Stack _parentStack = null;

    /************************ SAX2 ContentHandler INTERFACE *****************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void reportError(final int category, final ErrorMsg error) {

    /**
     * Common error/warning message handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void printWarnings() {

    /**
     * Prints all compile-time warnings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void printErrors() {

    /**
     * Prints all compile-time errors
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    /**

    /************************ ERROR HANDLING SECTION ************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode parseTopLevel(SyntaxTreeNode parent, String text,
                                         String expression) {

    /**
     * Parse an XPath expression or pattern using the generated XPathParser
     * The method will return a Dummy node if the XPath parser fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Pattern parsePattern(SyntaxTreeNode parent,
                                String attr, String def) {

    /**
     * Parse an XPath pattern:
     *  @param parent - XSL element where the pattern occured
     *  @param attr   - name of this element's attribute to get pattern from
     *  @param def    - default pattern (if the attribute was not found)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Pattern parsePattern(SyntaxTreeNode parent, String pattern) {

    /**
     * Parse an XPath pattern:
     *  @param parent  - XSL element where the pattern occured
     *  @param pattern - textual representation of the pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Expression parseExpression(SyntaxTreeNode parent,
                                      String attr, String def) {

    /**
     * Parse an XPath expression:
     *  @param parent - XSL element where the expression occured
     *  @param attr   - name of this element's attribute to get expression from
     *  @param def    - default expression (if the attribute was not found)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Expression parseExpression(SyntaxTreeNode parent, String exp) {

    /**
     * Parse an XPath expression:
     *  @param parent - XSL element where the expression occured
     *  @param exp    - textual representation of the expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private void checkForSuperfluousAttributes(SyntaxTreeNode node,
        Attributes attrs)

    /**
     * checks the list of attributes against a list of allowed attributes
     * for a particular element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private boolean versionIsOne = true;

    /**
     * Creates a new node in the abstract syntax tree. This node can be
     *  o) a supported XSLT 1.0 element
     *  o) an unsupported XSLT element (post 1.0)
     *  o) a supported XSLT extension
     *  o) an unsupported XSLT extension
     *  o) a literal result element (not an XSLT element and not an extension)
     * Unsupported elements do not directly generate an error. We have to wait
     * until we have received all child elements of an unsupported element to
     * see if any <xsl:fallback> elements exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private void initSymbolTable() {

    /**
     * Add primops and base functions to the symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private void initStdClasses() {

    /**
     * Initialize the _instructionClasses map, which maps XSL element
     * names to Java classes in this package.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode loadExternalStylesheet(String location)

    /**
     * For embedded stylesheets: Load an external file with stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode findStylesheet(SyntaxTreeNode root, String href) {

    /**
     * Find a Stylesheet element with a specific ID attribute value.
     * This method is used to find a Stylesheet node that is referred
     * in a <?xml-stylesheet ... ?> processing instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    private SyntaxTreeNode getStylesheet(SyntaxTreeNode root)

    /**
     * Extracts the DOM for the stylesheet. In the case of an embedded
     * stylesheet, it extracts the DOM subtree corresponding to the
     * embedded stylesheet that has an 'id' attribute whose value is the
     * same as the value declared in the <?xml-stylesheet...?> processing
     * instruction (P.I.). In the xml-stylesheet P.I. the value is labeled
     * as the 'href' data of the P.I. The extracted DOM representing the
     * stylesheet is returned as an Element object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    protected void setPIParameters(String media, String title, String charset) {

    /**
     * Set the parameters to use to locate the correct <?xml-stylesheet ...?>
     * processing instruction in the case where the input document is an
     * XML document with one or more references to a stylesheet.
     * @param media The media attribute to be matched. May be null, in which
     * case the prefered templates will be used (i.e. alternate = no).
     * @param title The value of the title attribute to match. May be null.
     * @param charset The value of the charset attribute to match. May be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public SyntaxTreeNode parse(InputSource input) {

    /**
     * Parses a stylesheet and builds the internal abstract syntax tree
     * @param input A SAX2 InputSource can be passed to a SAX reader
     * @return The root of the abstract syntax tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public SyntaxTreeNode parse(XMLReader reader, InputSource input) {

    /**
     * Parses a stylesheet and builds the internal abstract syntax tree
     * @param reader A SAX2 SAXReader (parser)
     * @param input A SAX2 InputSource can be passed to a SAX reader
     * @return The root of the abstract syntax tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public void createAST(Stylesheet stylesheet) {

    /**
     * Instanciates a SAX2 parser and generate the AST from the input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
    public Stylesheet makeStylesheet(SyntaxTreeNode element)

    /**
     * Create an instance of the <code>Stylesheet</code> class,
     * and then parse, typecheck and compile the instance.
     * Must be called after <code>parse()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Parser.java
public class Parser implements Constants, ContentHandler {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    public synchronized void parse(Reader in) throws IOException {

    /**
     * Parse an HTML stream, given a DTD.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    String getEndOfLineString() {

    /**
     * Returns the end of line string. This will return the end of line
     * string that has been encountered the most, one of \r, \n or \r\n.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void parseContent() throws IOException {

    /**
     * Parse Content. [24] 320:1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
        /*

        /** In dealing with forms, we have decided to treat
            them as legal in any context.  Also, even though
            they do have a start and an end tag, we will
            not put this tag on the stack.  This is to deal
            several pages in the web oasis that choose to
            start and end forms in any possible location. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void parseTag() throws IOException {

    /**
     * Parse a start or end tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void parseInvalidTag() throws IOException {

    /**
     * Parse an invalid tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected boolean parseMarkupDeclarations(StringBuffer strBuff) throws IOException {

    /**
     * Parse markup declarations.
     * Currently only handles the Document Type Declaration markup.
     * Returns true if it is a markup declaration false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    public String parseDTDMarkup() throws IOException {

    /**
     * Parses th Document Declaration Type markup declaration.
     * Currently ignores it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void parseAttributeSpecificationList(Element elem) throws IOException {

    /**
     * Parse attribute specification List. [31] 327:17
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    String parseAttributeValue(boolean lower) throws IOException {

    /**
     * Parse attribute value. [33] 331:1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void parseLiteral(boolean replace) throws IOException {

    /**
     * Parse literal content. [46] 343:1 and [47] 344:1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
                if (!strict && (strpos != 0) && (str[strpos - 1] == '-')) {

                  /** Presuming that the start string of a comment "<!--" has
                      already been parsed, the '-' character is valid only as
                      part of a comment termination and further more it must
                      be present in even numbers. Hence if strict is true, we
                      presume the comment has been terminated and return.
                      However if strict is false, then there is no even number
                      requirement and this character can appear anywhere in the
                      comment.  The parser reads on until it sees the following
                      pattern: "-->" or "--!>".
                   **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void parseComment() throws IOException {

    /**
     * Parse a comment. [92] 391:7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    private char[] mapNumericReference(int c) {

    /**
     * Converts numeric character reference to char array.
     *
     * Normally the code in a reference should be always converted
     * to the Unicode character with the same code, but due to
     * wide usage of Cp1252 charset most browsers map numeric references
     * in the range 130-159 (which are control chars in Unicode set)
     * to displayable characters with other codes.
     *
     * @param c the code of numeric character reference.
     * @return a char array corresponding to the reference code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    private char[] parseEntityReference() throws IOException {

    /**
     * Parse an entity reference. [59] 350:17
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    boolean parseIdentifier(boolean lower) throws IOException {

    /**
     * Parse identifier. Uppercase characters are folded
     * to lowercase when lower is true. Returns falsed if
     * no identifier is found. [55] 346:17
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void skipSpace() throws IOException {

    /**
     * Skip space.
     * [5] 297:5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    String getString(int pos) {

    /**
     * Get the string that's been accumulated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void addString(int c) {

    /**
     * Add a char to the string buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void errorContext() throws ChangedCharSetException {

    /**
     * Error context. Something went wrong, make sure we are in
     * the document's body context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void legalTagContext(TagElement tag) throws ChangedCharSetException {

    /**
     * Create a legal context for a tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    boolean legalElementContext(Element elem) throws ChangedCharSetException {

    /**
     * Create a legal content for an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void markFirstTime(Element elem) {

    /**
     * Marks the first time a tag has been seen in a document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void endTag(boolean omitted) {

    /**
     * Handle an end tag. The end tag is popped
     * from the tag stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void startTag(TagElement tag) throws ChangedCharSetException {

    /**
     * Handle a start tag. The new tag is pushed
     * onto the tag stack. The attribute list is
     * checked for required attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void error(String err, String arg1, String arg2,
        String arg3) {

    /**
     * Invoke the error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    void handleText(TagElement tag) {

    /**
     * Output text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void handleError(int ln, String msg) {

    /**
     * An error has occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void handleEndTag(TagElement tag) {

    /**
     * Called when an end tag is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void handleStartTag(TagElement tag) {

    /**
     * Called when a start tag is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void handleEmptyTag(TagElement tag) throws ChangedCharSetException {

    /**
     * Called when an empty tag is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void handleComment(char text[]) {

    /**
     * Called when an HTML comment is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void handleTitle(char text[]) {

    /**
     * Called when an HTML title tag is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected void handleText(char text[]) {

    /**
     * Called when PCDATA is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected TagElement makeTag(Element elem, boolean fictional) {

    /**
     * Makes a TagElement.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    int getBlockStartPosition() {

    /**
     * Returns the start position of the current block. Block is
     * overloaded here, it really means the current start position for
     * the current comment tag, text, block.... This is provided for
     * subclassers that wish to know the start of the current block when
     * called with one of the handleXXX methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected int getCurrentLine() {

    /**
     * @return the line number of the line currently being parsed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    private static final char[] cp1252Map = {

    /**
     * array for mapping numeric references in range
     * 130-159 to displayable Unicode characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    private int currentBlockStartPos;

    /** The start position of the current block. Block is overloaded here,
     * it really means the current start position for the current comment,
     * tag, text. Use getBlockStartPosition to access this. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    private int lfCount;

    /** Number of \n's encountered. A \r\n will not increment this. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    private int crlfCount;

    /** Number of \r\n's encountered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    protected boolean strict = false;

    /**
     * This flag determines whether or not the Parser will be strict
     * in enforcing SGML compatibility.  If false, it will be lenient
     * with certain common classes of erroneous HTML constructs.
     * Strict or not, in either case an error will be recorded.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
    private boolean ignoreSpace;

    /**
     * The html spec does not specify how spaces are coalesced very well.
     * If strict == false, ignoreSpace is used to try and mimic the behavior
     * of the popular browsers.
     * <p>
     * The problematic scenarios are:
     * '&lt;b>blah &lt;i> &lt;strike> foo' which can be treated as:
     * '&lt;b>blah &lt;i>&lt;strike>foo'
     * as well as:
     * '&lt;p>&lt;a href="xx"> &lt;em>Using&lt;/em>&lt;/a>&lt;/p>'
     * which appears to be treated as:
     * '&lt;p>&lt;a href="xx">&lt;em>Using&lt;/em>&lt;/a>&lt;/p>'
     * <p>
     * When a tag that breaks flow, or trailing whitespace is encountered
     * ignoreSpace is set to true. From then on, all whitespace will be
     * ignored.
     * ignoreSpace will be set back to false the first time a
     * non whitespace character is encountered. This appears to give
     * behavior closer to the popular browsers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Parser.java
public

/**
 * A simple DTD-driven HTML parser. The parser reads an
 * HTML file from an InputStream and calls various methods
 * (which should be overridden in a subclass) when tags and
 * data are encountered.
 * <p>
 * Unfortunately there are many badly implemented HTML parsers
 * out there, and as a result there are many badly formatted
 * HTML files. This parser attempts to parse most HTML files.
 * This means that the implementation sometimes deviates from
 * the SGML specification in favor of HTML.
 * <p>
 * The parser treats \r and \r\n as \n. Newlines after starttags
 * and before end tags are ignored just as specified in the SGML/HTML
 * specification.
 * <p>
 * The html spec does not specify how spaces are to be coalesced very well.
 * Specifically, the following scenarios are not discussed (note that a
 * space should be used here, but I am using &amp;nbsp to force the space to
 * be displayed):
 * <p>
 * '&lt;b&gt;blah&nbsp;&lt;i&gt;&nbsp;&lt;strike&gt;&nbsp;foo' which can be treated as:
 * '&lt;b&gt;blah&nbsp;&lt;i&gt;&lt;strike&gt;foo'
 * <p>as well as:
 * '&lt;p&gt;&lt;a href="xx"&gt;&nbsp;&lt;em&gt;Using&lt;/em&gt;&lt;/a&gt;&lt;/p&gt;'
 * which appears to be treated as:
 * '&lt;p&gt;&lt;a href="xx"&gt;&lt;em&gt;Using&lt;/em&gt;&lt;/a&gt;&lt;/p&gt;'
 * <p>
 * If <code>strict</code> is false, when a tag that breaks flow,
 * (<code>TagElement.breaksFlows</code>) or trailing whitespace is
 * encountered, all whitespace will be ignored until a non whitespace
 * character is encountered. This appears to give behavior closer to
 * the popular browsers.
 *
 * @see DTD
 * @see TagElement
 * @see SimpleAttributeSet
 * @author Arthur van Hoff
 * @author Sunita Mani
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
    public abstract void parse (String systemId)

    /**
     * Parse an XML document from a system identifier (URI).
     *
     * <p>This method is a shortcut for the common case of reading a
     * document from a system identifier.  It is the exact
     * equivalent of the following:</p>
     *
     * <pre>
     * parse(new InputSource(systemId));
     * </pre>
     *
     * <p>If the system identifier is a URL, it must be fully resolved
     * by the application before it is passed to the parser.</p>
     *
     * @param systemId The system identifier (URI).
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @exception java.io.IOException An IO exception from the parser,
     *            possibly from a byte stream or character stream
     *            supplied by the application.
     * @see #parse(org.xml.sax.InputSource)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
    public abstract void parse (InputSource source)

    /**
     * Parse an XML document.
     *
     * <p>The application can use this method to instruct the SAX parser
     * to begin parsing an XML document from any valid input
     * source (a character stream, a byte stream, or a URI).</p>
     *
     * <p>Applications may not invoke this method while a parse is in
     * progress (they should create a new Parser instead for each
     * additional XML document).  Once a parse is complete, an
     * application may reuse the same Parser object, possibly with a
     * different input source.</p>
     *
     * @param source The input source for the top-level of the
     *        XML document.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @exception java.io.IOException An IO exception from the parser,
     *            possibly from a byte stream or character stream
     *            supplied by the application.
     * @see org.xml.sax.InputSource
     * @see #parse(java.lang.String)
     * @see #setEntityResolver
     * @see #setDTDHandler
     * @see #setDocumentHandler
     * @see #setErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
    public abstract void setErrorHandler (ErrorHandler handler);

    /**
     * Allow an application to register an error event handler.
     *
     * <p>If the application does not register an error event handler,
     * all error events reported by the SAX parser will be silently
     * ignored, except for fatalError, which will throw a SAXException
     * (this is the default behaviour implemented by HandlerBase).</p>
     *
     * <p>Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.</p>
     *
     * @param handler The error handler.
     * @see ErrorHandler
     * @see SAXException
     * @see HandlerBase
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
    public abstract void setDocumentHandler (DocumentHandler handler);

    /**
     * Allow an application to register a document event handler.
     *
     * <p>If the application does not register a document handler, all
     * document events reported by the SAX parser will be silently
     * ignored (this is the default behaviour implemented by
     * HandlerBase).</p>
     *
     * <p>Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.</p>
     *
     * @param handler The document handler.
     * @see DocumentHandler
     * @see HandlerBase
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
    public abstract void setDTDHandler (DTDHandler handler);

    /**
     * Allow an application to register a DTD event handler.
     *
     * <p>If the application does not register a DTD handler, all DTD
     * events reported by the SAX parser will be silently
     * ignored (this is the default behaviour implemented by
     * HandlerBase).</p>
     *
     * <p>Applications may register a new or different
     * handler in the middle of a parse, and the SAX parser must
     * begin using the new handler immediately.</p>
     *
     * @param handler The DTD handler.
     * @see DTDHandler
     * @see HandlerBase
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
    public abstract void setEntityResolver (EntityResolver resolver);

    /**
     * Allow an application to register a custom entity resolver.
     *
     * <p>If the application does not register an entity resolver, the
     * SAX parser will resolve system identifiers and open connections
     * to entities itself (this is the default behaviour implemented in
     * HandlerBase).</p>
     *
     * <p>Applications may register a new or different entity resolver
     * in the middle of a parse, and the SAX parser must begin using
     * the new resolver immediately.</p>
     *
     * @param resolver The object for resolving entities.
     * @see EntityResolver
     * @see HandlerBase
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
    public abstract void setLocale (Locale locale)

    /**
     * Allow an application to request a locale for errors and warnings.
     *
     * <p>SAX parsers are not required to provide localisation for errors
     * and warnings; if they cannot support the requested locale,
     * however, they must throw a SAX exception.  Applications may
     * not request a locale change in the middle of a parse.</p>
     *
     * @param locale A Java Locale object.
     * @exception org.xml.sax.SAXException Throws an exception
     *            (using the previous or default locale) if the
     *            requested locale is not supported.
     * @see org.xml.sax.SAXException
     * @see org.xml.sax.SAXParseException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/Parser.java
public interface Parser

/**
 * Basic interface for SAX (Simple API for XML) parsers.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This was the main event supplier interface for SAX1; it has
 * been replaced in SAX2 by {@link org.xml.sax.XMLReader XMLReader},
 * which includes Namespace support and sophisticated configurability
 * and extensibility.</p>
 *
 * <p>All SAX1 parsers must implement this basic interface: it allows
 * applications to register handlers for different types of events
 * and to initiate a parse from a URI, or a character stream.</p>
 *
 * <p>All SAX1 parsers must also implement a zero-argument constructor
 * (though other constructors are also allowed).</p>
 *
 * <p>SAX1 parsers are reusable but not re-entrant: the application
 * may reuse a parser object (possibly with a different input source)
 * once the first parse has completed successfully, but it may not
 * invoke the parse() methods recursively within a parse.</p>
 *
 * @deprecated This interface has been replaced by the SAX2
 *             {@link org.xml.sax.XMLReader XMLReader}
 *             interface, which includes Namespace support.
 * @since SAX 1.0
 * @author David Megginson
 * @see org.xml.sax.EntityResolver
 * @see org.xml.sax.DTDHandler
 * @see org.xml.sax.DocumentHandler
 * @see org.xml.sax.ErrorHandler
 * @see org.xml.sax.HandlerBase
 * @see org.xml.sax.InputSource
 */
