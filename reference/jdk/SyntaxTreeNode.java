_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected  void reportWarning(SyntaxTreeNode element, Parser parser,
                                  String errorCode, String message) {

    /**
     * Report a recoverable error to the parser.
     * @param element The element in which the error occured (normally 'this'
     * but it could also be an expression/pattern/etc.)
     * @param parser The XSLT parser to report the error to.
     * @param error The error code (from util/ErrorMsg).
     * @param message Any additional error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void reportError(SyntaxTreeNode element, Parser parser,
                               String errorCode, String message) {

    /**
     * Report an error to the parser.
     * @param element The element in which the error occured (normally 'this'
     * but it could also be an expression/pattern/etc.)
     * @param parser The XSLT parser to report the error to.
     * @param error The error code (from util/ErrorMsg).
     * @param message Any additional error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void indent(int indent) {

    /**
     * Set the indentation level for debug output.
     * @param indent Indentation level for syntax tree levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void displayContents(int indent) {

    /**
     * Displays the contents of this syntax tree node (to stdout).
     * This method is intended for debugging _only_ !!!
     * @param indent Indentation level for syntax tree levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public void display(int indent) {

    /**
     * Displays the contents of this syntax tree node (to stdout).
     * This method is intended for debugging _only_, and should be overridden
     * by all syntax tree node implementations.
     * @param indent Indentation level for syntax tree levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final SyntaxTreeNode lastChild() {

    /**
     * Returns this element's last child
     * @return The child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final Object elementAt(int pos) {

    /**
     * Returns a child node at a given position.
     * @param pos The child node's position.
     * @return The child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final Iterator<SyntaxTreeNode> elements() {

    /**
     * Returns an Iterator of all child nodes of this node.
     * @return An Iterator of all child nodes of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final int elementCount() {

    /**
     * Returns the number of children this node has.
     * @return Number of child nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final boolean hasContents() {

    /**
     * Tells you if this node has any child nodes.
     * @return 'true' if this node has any children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final List<SyntaxTreeNode> getContents() {

    /**
     * Returns a List containing all the child nodes of this node.
     * @return A List containing all the child nodes of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void removeElement(SyntaxTreeNode element) {

    /**
     * Removed a child node of this syntax tree node.
     * @param element is the child node to remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void setFirstElement(SyntaxTreeNode element) {

    /**
     * Inserts the first child node of this syntax tree node. The existing
     * children are shifted back one position.
     * @param element is the new child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void addElement(SyntaxTreeNode element) {

    /**
     * Adds a child node to this syntax tree node.
     * @param element is the new child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected boolean dependentContents() {

    /**
     * Return true if any of the expressions/instructions in the contents of
     * this node is context dependent.
     * @return 'true' if the contents of this node is context dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected boolean contextDependent() {

    /**
     * Returns true if this expression/instruction depends on the context. By
     * default, every expression/instruction depends on the context unless it
     * overrides this method. Currently used to determine if result trees are
     * compiled using procedures or little DOMs (result tree fragments).
     * @return 'true' if this node depends on the context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void compileResultTree(ClassGenerator classGen,
                                     MethodGenerator methodGen)

    /**
     * Utility method used by parameters and variables to store result trees
     * @param classGen BCEL Java class generator
     * @param methodGen BCEL Java method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    private boolean isTextElement(SyntaxTreeNode node, boolean doExtendedCheck) {

    /**
     * Return true if the node only produces Text content.
     *
     * A node is a Text element if it is Text, xsl:value-of, xsl:number,
     * or a combination of these nested in a control instruction (xsl:if or
     * xsl:choose).
     *
     * If the doExtendedCheck flag is true, xsl:call-template and xsl:apply-templates
     * are also considered as Text elements.
     *
     * @param node A node
     * @param doExtendedCheck If this flag is true, <xsl:call-template> and
     * <xsl:apply-templates> are also considered as Text elements.
     *
     * @return true if the node of Text type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    private boolean isAdaptiveRTF(SyntaxTreeNode node) {

     /**
     * Return true if the node represents an adaptive RTF.
     *
     * A node is an adaptive RTF if each children is a Text element
     * or it is <xsl:call-template> or <xsl:apply-templates>.
     *
     * @param node A node
     * @return true if the node content can be considered as an adaptive RTF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    private boolean isSimpleRTF(SyntaxTreeNode node) {

    /**
     * Return true if the node represents a simple RTF.
     *
     * A node is a simple RTF if all children only produce Text value.
     *
     * @param node A node
     * @return true if the node content can be considered as a simple RTF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void translateContents(ClassGenerator classGen,
                                     MethodGenerator methodGen) {

    /**
     * Call translate() on all child syntax tree nodes.
     * @param classGen BCEL Java class generator
     * @param methodGen BCEL Java method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public abstract void translate(ClassGenerator classGen,
                                   MethodGenerator methodGen);

    /**
     * Translate this abstract syntax tree node into JVM bytecodes.
     * @param classGen BCEL Java class generator
     * @param methodGen BCEL Java method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Type typeCheckContents(SymbolTable stable) throws TypeCheckError {

    /**
     * Call typeCheck() on all child syntax tree nodes.
     * @param stable The compiler/parser's symbol table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public abstract Type typeCheck(SymbolTable stable) throws TypeCheckError;

    /**
     * Type check the children of this node. The type check phase may add
     * coercions (CastExpr) to the AST.
     * @param stable The compiler/parser's symbol table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected QName updateScope(Parser parser, SyntaxTreeNode node) {

    /**
     * Add a node to the current scope and return name of a variable or
     * parameter if the node represents a variable or a parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void parseChildren(Parser parser) {

    /**
     * Parse all children of this syntax tree node. This method is normally
     * called by the parseContents() method.
     * @param parser reference to the XSLT parser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of this syntax tree nodes (child nodes, XPath
     * expressions, patterns and functions). The default behaviour is to parser
     * the syntax tree node's children (since there are no common expressions,
     * patterns, etc. that can be handled in this base class.
     * @param parser reference to the XSLT parser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final SymbolTable getSymbolTable() {

    /**
     * Returns the XSLT parser's symbol table.
     * @return Symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final XSLTC getXSLTC() {

    /**
     * Returns a reference to the XSLTC (XSLT compiler) in use.
     * @return XSLTC - XSLT compiler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Template getTemplate() {

    /**
     * Get the Template node that represents the <xsl:template/> element
     * that this node occured under. Note that this method will return 'null'
     * for nodes that represent top-level elements.
     * @return The Template ancestor node of this node or 'null'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public Stylesheet getStylesheet() {

    /**
     * Get the Stylesheet node that represents the <xsl:stylesheet/> element
     * that this node occured under.
     * @return The Stylesheet ancestor node of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected int getImportPrecedence() {

    /**
     * Get the import precedence of this element. The import precedence equals
     * the import precedence of the stylesheet in which this element occured.
     * @return The import precedence of this syntax tree node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final boolean isDummy() {

    /**
     * Returns 'true' if this syntax tree node is the Sentinal node.
     * @return 'true' if this syntax tree node is the Sentinal node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final SyntaxTreeNode getParent() {

    /**
     * Returns this syntax tree node's parent node.
     * @return The parent syntax tree node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setParent(SyntaxTreeNode parent) {

    /**
     * Set this syntax tree node's parent node, if unset. For
     * re-parenting just use <code>node._parent = newparent</code>.
     *
     * @param parent The parent node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public final Parser getParser() {

    /**
     * Returns this node's XSLT parser.
     * @return The XSLT parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setParser(Parser parser) {

    /**
     * Set this node's parser. The parser (the XSLT parser) gives this
     * syntax tree node access to the symbol table and XPath parser.
     * @param parser The XSLT parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected String lookupPrefix(String uri) {

    /**
     * Returns any namespace prefix that is mapped to a prefix in the current
     * scope. This method checks namespace mappings for this element, and if
     * necessary for ancestor elements as well (ie. if the URI is declared
     * within the current scope then you'll definately get the prefix from
     * this method). Note that this is a very slow method and consequentially
     * it should only be used strictly when needed.
     * @param uri Namespace URI.
     * @return Namespace prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected String lookupNamespace(String prefix) {

    /**
     * Returns any namespace URI that is in scope for a given prefix. This
     * method checks namespace mappings for this element, and if necessary
     * for ancestor elements as well (ie. if the prefix maps to an URI in this
     * scope then you'll definately get the URI from this method).
     * @param prefix Namespace prefix.
     * @return Namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void addPrefixMapping(String prefix, String uri) {

    /**
     * Adds a single prefix mapping to this syntax tree node.
     * @param prefix Namespace prefix.
     * @param uri Namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Map<String, String> getPrefixMapping() {

    /**
     * Returns a Map containing the prefix mappings that were declared
     * for this element. This does not include all prefix mappings in scope,
     * so one may have to check ancestor elements to get all mappings that are
     * in in scope.
     * @return Prefix mappings (for this element only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setPrefixMapping(Map<String, String> mapping) {

    /**
     * Sets the prefix mapping for the namespaces that were declared in this
     * element. This does not include all prefix mappings in scope, so one
     * may have to check ancestor elements to get all mappings that are in
     * in scope. The prefixes must be passed in as a Map that maps
     * namespace prefixes (String objects) to namespace URIs (also String).
     * @param mapping The Map containing the mappings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Attributes getAttributes() {

    /**
     * Returns a list of all attributes declared for the element represented by
     * this syntax tree node.
     * @return Attributes for this syntax tree node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected String getAttribute(String qname) {

    /**
     * Returns a value for an attribute from the source element.
     * @param qname The QName of the attribute to return.
     * @return The value of the attribute of name 'qname'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setAttributes(AttributesImpl attributes) {

    /**
     * Set the attributes for this SyntaxTreeNode.
     * @param attributes Attributes for the element. Must be passed in as an
     *                   implementation of org.xml.sax.Attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected QName getQName() {

    /**
     * Set the QName for the SyntaxTreeNode
     * @param qname The QName for the syntax tree node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setQName(String uri, String prefix, String localname) {

    /**
     * Set the QName for the SyntaxTreeNode
     * @param uri The element's namespace URI
     * @param prefix The element's namespace prefix
     * @param local The element's local name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setQName(QName qname) {

    /**
     * Set the QName for the syntax tree node.
     * @param qname The QName for the syntax tree node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public final int getLineNumber() {

    /**
     * Get the source file line number for this element. If unavailable, lookup
     * in ancestors.
     *
     * @return The source file line number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void setLineNumber(int line) {

    /**
     * Set the source file line number for this element
     * @param line The source file line number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public SyntaxTreeNode(String uri, String prefix, String local) {

    /**
     * Creates a new SyntaxTreeNode with no source file line number reference.
     * @param uri The element's namespace URI
     * @param prefix The element's namespace prefix
     * @param local The element's local name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public SyntaxTreeNode(int line) {

    /**
     * Creates a new SyntaxTreeNode with a 'null' QName.
     * @param line Source file line number reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public SyntaxTreeNode() {

    /**
     * Creates a new SyntaxTreeNode with a 'null' QName and no source file
     * line number reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
public abstract class SyntaxTreeNode implements Constants {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author John Howard <JohnH@schemasoft.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected  void reportWarning(SyntaxTreeNode element, Parser parser,
                                  String errorCode, String message) {

    /**
     * Report a recoverable error to the parser.
     * @param element The element in which the error occured (normally 'this'
     * but it could also be an expression/pattern/etc.)
     * @param parser The XSLT parser to report the error to.
     * @param error The error code (from util/ErrorMsg).
     * @param message Any additional error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void reportError(SyntaxTreeNode element, Parser parser,
                               String errorCode, String message) {

    /**
     * Report an error to the parser.
     * @param element The element in which the error occured (normally 'this'
     * but it could also be an expression/pattern/etc.)
     * @param parser The XSLT parser to report the error to.
     * @param error The error code (from util/ErrorMsg).
     * @param message Any additional error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void indent(int indent) {

    /**
     * Set the indentation level for debug output.
     * @param indent Indentation level for syntax tree levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void displayContents(int indent) {

    /**
     * Displays the contents of this syntax tree node (to stdout).
     * This method is intended for debugging _only_ !!!
     * @param indent Indentation level for syntax tree levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public void display(int indent) {

    /**
     * Displays the contents of this syntax tree node (to stdout).
     * This method is intended for debugging _only_, and should be overridden
     * by all syntax tree node implementations.
     * @param indent Indentation level for syntax tree levels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final SyntaxTreeNode lastChild() {

    /**
     * Returns this element's last child
     * @return The child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final Object elementAt(int pos) {

    /**
     * Returns a child node at a given position.
     * @param pos The child node's position.
     * @return The child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final Iterator<SyntaxTreeNode> elements() {

    /**
     * Returns an Iterator of all child nodes of this node.
     * @return An Iterator of all child nodes of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final int elementCount() {

    /**
     * Returns the number of children this node has.
     * @return Number of child nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final boolean hasContents() {

    /**
     * Tells you if this node has any child nodes.
     * @return 'true' if this node has any children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final List<SyntaxTreeNode> getContents() {

    /**
     * Returns a List containing all the child nodes of this node.
     * @return A List containing all the child nodes of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void removeElement(SyntaxTreeNode element) {

    /**
     * Removed a child node of this syntax tree node.
     * @param element is the child node to remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void setFirstElement(SyntaxTreeNode element) {

    /**
     * Inserts the first child node of this syntax tree node. The existing
     * children are shifted back one position.
     * @param element is the new child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void addElement(SyntaxTreeNode element) {

    /**
     * Adds a child node to this syntax tree node.
     * @param element is the new child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected boolean dependentContents() {

    /**
     * Return true if any of the expressions/instructions in the contents of
     * this node is context dependent.
     * @return 'true' if the contents of this node is context dependent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected boolean contextDependent() {

    /**
     * Returns true if this expression/instruction depends on the context. By
     * default, every expression/instruction depends on the context unless it
     * overrides this method. Currently used to determine if result trees are
     * compiled using procedures or little DOMs (result tree fragments).
     * @return 'true' if this node depends on the context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void compileResultTree(ClassGenerator classGen,
                                     MethodGenerator methodGen)

    /**
     * Utility method used by parameters and variables to store result trees
     * @param classGen BCEL Java class generator
     * @param methodGen BCEL Java method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    private boolean isTextElement(SyntaxTreeNode node, boolean doExtendedCheck) {

    /**
     * Return true if the node only produces Text content.
     *
     * A node is a Text element if it is Text, xsl:value-of, xsl:number,
     * or a combination of these nested in a control instruction (xsl:if or
     * xsl:choose).
     *
     * If the doExtendedCheck flag is true, xsl:call-template and xsl:apply-templates
     * are also considered as Text elements.
     *
     * @param node A node
     * @param doExtendedCheck If this flag is true, <xsl:call-template> and
     * <xsl:apply-templates> are also considered as Text elements.
     *
     * @return true if the node of Text type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    private boolean isAdaptiveRTF(SyntaxTreeNode node) {

     /**
     * Return true if the node represents an adaptive RTF.
     *
     * A node is an adaptive RTF if each children is a Text element
     * or it is <xsl:call-template> or <xsl:apply-templates>.
     *
     * @param node A node
     * @return true if the node content can be considered as an adaptive RTF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    private boolean isSimpleRTF(SyntaxTreeNode node) {

    /**
     * Return true if the node represents a simple RTF.
     *
     * A node is a simple RTF if all children only produce Text value.
     *
     * @param node A node
     * @return true if the node content can be considered as a simple RTF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void translateContents(ClassGenerator classGen,
                                     MethodGenerator methodGen) {

    /**
     * Call translate() on all child syntax tree nodes.
     * @param classGen BCEL Java class generator
     * @param methodGen BCEL Java method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public abstract void translate(ClassGenerator classGen,
                                   MethodGenerator methodGen);

    /**
     * Translate this abstract syntax tree node into JVM bytecodes.
     * @param classGen BCEL Java class generator
     * @param methodGen BCEL Java method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Type typeCheckContents(SymbolTable stable) throws TypeCheckError {

    /**
     * Call typeCheck() on all child syntax tree nodes.
     * @param stable The compiler/parser's symbol table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public abstract Type typeCheck(SymbolTable stable) throws TypeCheckError;

    /**
     * Type check the children of this node. The type check phase may add
     * coercions (CastExpr) to the AST.
     * @param stable The compiler/parser's symbol table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected QName updateScope(Parser parser, SyntaxTreeNode node) {

    /**
     * Add a node to the current scope and return name of a variable or
     * parameter if the node represents a variable or a parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void parseChildren(Parser parser) {

    /**
     * Parse all children of this syntax tree node. This method is normally
     * called by the parseContents() method.
     * @param parser reference to the XSLT parser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of this syntax tree nodes (child nodes, XPath
     * expressions, patterns and functions). The default behaviour is to parser
     * the syntax tree node's children (since there are no common expressions,
     * patterns, etc. that can be handled in this base class.
     * @param parser reference to the XSLT parser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final SymbolTable getSymbolTable() {

    /**
     * Returns the XSLT parser's symbol table.
     * @return Symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final XSLTC getXSLTC() {

    /**
     * Returns a reference to the XSLTC (XSLT compiler) in use.
     * @return XSLTC - XSLT compiler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Template getTemplate() {

    /**
     * Get the Template node that represents the <xsl:template/> element
     * that this node occured under. Note that this method will return 'null'
     * for nodes that represent top-level elements.
     * @return The Template ancestor node of this node or 'null'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public Stylesheet getStylesheet() {

    /**
     * Get the Stylesheet node that represents the <xsl:stylesheet/> element
     * that this node occured under.
     * @return The Stylesheet ancestor node of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected int getImportPrecedence() {

    /**
     * Get the import precedence of this element. The import precedence equals
     * the import precedence of the stylesheet in which this element occured.
     * @return The import precedence of this syntax tree node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final boolean isDummy() {

    /**
     * Returns 'true' if this syntax tree node is the Sentinal node.
     * @return 'true' if this syntax tree node is the Sentinal node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final SyntaxTreeNode getParent() {

    /**
     * Returns this syntax tree node's parent node.
     * @return The parent syntax tree node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setParent(SyntaxTreeNode parent) {

    /**
     * Set this syntax tree node's parent node, if unset. For
     * re-parenting just use <code>node._parent = newparent</code>.
     *
     * @param parent The parent node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public final Parser getParser() {

    /**
     * Returns this node's XSLT parser.
     * @return The XSLT parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setParser(Parser parser) {

    /**
     * Set this node's parser. The parser (the XSLT parser) gives this
     * syntax tree node access to the symbol table and XPath parser.
     * @param parser The XSLT parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected String lookupPrefix(String uri) {

    /**
     * Returns any namespace prefix that is mapped to a prefix in the current
     * scope. This method checks namespace mappings for this element, and if
     * necessary for ancestor elements as well (ie. if the URI is declared
     * within the current scope then you'll definately get the prefix from
     * this method). Note that this is a very slow method and consequentially
     * it should only be used strictly when needed.
     * @param uri Namespace URI.
     * @return Namespace prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected String lookupNamespace(String prefix) {

    /**
     * Returns any namespace URI that is in scope for a given prefix. This
     * method checks namespace mappings for this element, and if necessary
     * for ancestor elements as well (ie. if the prefix maps to an URI in this
     * scope then you'll definately get the URI from this method).
     * @param prefix Namespace prefix.
     * @return Namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void addPrefixMapping(String prefix, String uri) {

    /**
     * Adds a single prefix mapping to this syntax tree node.
     * @param prefix Namespace prefix.
     * @param uri Namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Map<String, String> getPrefixMapping() {

    /**
     * Returns a Map containing the prefix mappings that were declared
     * for this element. This does not include all prefix mappings in scope,
     * so one may have to check ancestor elements to get all mappings that are
     * in in scope.
     * @return Prefix mappings (for this element only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setPrefixMapping(Map<String, String> mapping) {

    /**
     * Sets the prefix mapping for the namespaces that were declared in this
     * element. This does not include all prefix mappings in scope, so one
     * may have to check ancestor elements to get all mappings that are in
     * in scope. The prefixes must be passed in as a Map that maps
     * namespace prefixes (String objects) to namespace URIs (also String).
     * @param mapping The Map containing the mappings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected Attributes getAttributes() {

    /**
     * Returns a list of all attributes declared for the element represented by
     * this syntax tree node.
     * @return Attributes for this syntax tree node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected String getAttribute(String qname) {

    /**
     * Returns a value for an attribute from the source element.
     * @param qname The QName of the attribute to return.
     * @return The value of the attribute of name 'qname'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setAttributes(AttributesImpl attributes) {

    /**
     * Set the attributes for this SyntaxTreeNode.
     * @param attributes Attributes for the element. Must be passed in as an
     *                   implementation of org.xml.sax.Attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected QName getQName() {

    /**
     * Set the QName for the SyntaxTreeNode
     * @param qname The QName for the syntax tree node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setQName(String uri, String prefix, String localname) {

    /**
     * Set the QName for the SyntaxTreeNode
     * @param uri The element's namespace URI
     * @param prefix The element's namespace prefix
     * @param local The element's local name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected void setQName(QName qname) {

    /**
     * Set the QName for the syntax tree node.
     * @param qname The QName for the syntax tree node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public final int getLineNumber() {

    /**
     * Get the source file line number for this element. If unavailable, lookup
     * in ancestors.
     *
     * @return The source file line number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    protected final void setLineNumber(int line) {

    /**
     * Set the source file line number for this element
     * @param line The source file line number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public SyntaxTreeNode(String uri, String prefix, String local) {

    /**
     * Creates a new SyntaxTreeNode with no source file line number reference.
     * @param uri The element's namespace URI
     * @param prefix The element's namespace prefix
     * @param local The element's local name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public SyntaxTreeNode(int line) {

    /**
     * Creates a new SyntaxTreeNode with a 'null' QName.
     * @param line Source file line number reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
    public SyntaxTreeNode() {

    /**
     * Creates a new SyntaxTreeNode with a 'null' QName and no source file
     * line number reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/SyntaxTreeNode.java
public abstract class SyntaxTreeNode implements Constants {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author John Howard <JohnH@schemasoft.com>
 */
