_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void peepHoleOptimization(MethodGenerator methodGen) {

    /**
     * Peephole optimization: Remove sequences of [ALOAD, POP].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void compileTransform(ClassGenerator classGen) {

    /**
     * Compile transform() into the output class. This method is used to
     * initialize global variables and global parameters. The current node
     * is set to be the document's root node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String compileBuildKeys(ClassGenerator classGen) {

    /**
     * Compile a buildKeys() method into the output class. Note that keys
     * for the input document are created in topLevel(), not in this method.
     * However, we still need this method to create keys for documents loaded
     * via the XPath document() function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector resolveDependencies(Vector input) {

    /**
     * This method returns a vector with variables/params and keys in the
     * order in which they are to be compiled for initialization. The order
     * is determined by analyzing the dependencies between them. The XSLT 1.0
     * spec does not allow a key to depend on a variable. However, for
     * compatibility with Xalan interpretive, that type of dependency is
     * allowed and, therefore, consider to determine the partial order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String compileTopLevel(ClassGenerator classGen) {

    /**
     * Compile a topLevel() method into the output class. This method is
     * called from transform() to handle all non-template top-level elements.
     * Returns the signature of the topLevel() method.
     *
     * Global variables/params and keys are first sorted to resolve
     * dependencies between them. The XSLT 1.0 spec does not allow a key
     * to depend on a variable. However, for compatibility with Xalan
     * interpretive, that type of dependency is allowed. Note also that
     * the buildKeys() method is still generated as it is used by the
     * LoadDocument class, but it no longer called from transform().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void compileConstructor(ClassGenerator classGen, Output output) {

    /**
     * Compile the translet's constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void compileStaticInitializer(ClassGenerator classGen) {

    /**
     * Compile the namesArray, urisArray and typesArray into
     * the static initializer. They are read-only from the
     * translet. All translet instances can share a single
     * copy of this informtion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public void translate() {

    /**
     * Translate the stylesheet into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void addStaticField(ClassGenerator classGen, String type,
                                String name)

    /**
     * Add a static field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate the stylesheet into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check all the children of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public final void parseOwnChildren(Parser parser) {

    /**
     * Parse all direct children of the <xsl:stylesheet/> element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public void parseContents(Parser parser) {

    /**
     * Parse the version and uri fields of the stylesheet and add an
     * entry to the symbol table mapping the name <tt>__stylesheet_</tt>
     * to an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void extensionURI(String prefixes, SymbolTable stable) {

    /**
     * Store extension URIs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    protected void addPrefixMapping(String prefix, String uri) {

    /**
     * Adds a single prefix mapping to this syntax tree node.
     * @param prefix Namespace prefix.
     * @param uri Namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public boolean hasLocalParams() {

    /**
     * Returns true if at least one template in the stylesheet has params
     * defined. Uses the variable <code>_hasLocalParams</code> to cache the
     * result.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public boolean hasGlobals() {

    /**
     * Returns true if this stylesheet has global vars or params.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public int getMinimumDescendantPrecedence() {

    /**
     * Get the minimum of the precedence of this stylesheet, any stylesheet
     * imported by this stylesheet and any include/import descendant of this
     * stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void checkOutputMethod() {

    /**
     * Check and set the output method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public int getOutputMethod() {

    /**
     * Return the output method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _outputMethod = UNKNOWN_OUTPUT;

    /**
     * Output method for this stylesheet (must be set to one of
     * the constants defined below).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Properties _outputProperties = null;

    /**
     * Output properties for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Output  _lastOutputElement = null;

    /**
     * A reference to the last xsl:output object found in the styleshet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _templateInlining = false;

    /**
     * Set to true to enable template inlining optimization.
     * @see XSLTC#_templateInlining
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _hasIdCall = false;

    /**
     * Flag indicating if id() is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _callsNodeset = false;

    /**
     * Flag indicating if nodset() is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _multiDocument = false;

    /**
     * Flag indicating if multi-document support is needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _simplified = false;

    /**
     * Flag indicating if this is a simplified stylesheets. A template
     * matching on "/" must be added in this case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _numberFormattingUsed = false;

    /**
     * Flag indicating if format-number() is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private SourceLoader _loader = null;

    /**
     * A reference to the SourceLoader set by the user (a URIResolver
     * if the JAXP API is being used).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Map<String, Key> _keys = new HashMap<>();

    /**
     * Mapping between key names and Key objects (needed by Key/IdPattern).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _minimumDescendantPrecedence = -1;

    /**
     * Minimum precendence of any descendant stylesheet by inclusion or
     * importation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _importPrecedence = 1;

    /**
     * Import precendence for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector _includedStylesheets = null;

    /**
     * Array of all the stylesheets imported or included from this one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public Stylesheet _includedFrom = null;

    /**
     * Reference to the stylesheet from which this stylesheet was
     * included (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public Stylesheet _importedFrom = null;

    /**
     * Reference to the stylesheet from which this stylesheet was
     * imported (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private final Map<String, String> _extensions = new HashMap<>();

    /**
     * Mapping between extension URIs and their prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Mode _defaultMode;

    /**
     * A reference to the default Mode object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private final Map<String, Mode> _modes = new HashMap<>();

    /**
     * Mapping between mode names and Mode instances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _nextModeSerial = 1;

    /**
     * Counter to generate unique mode suffixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector _allValidTemplates = null;

    /**
     * Used to cache result of <code>getAllValidTemplates()</code>. Only
     * set in top-level stylesheets that include/import other stylesheets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private final Vector _templates = new Vector();

    /**
      * Contains all templates defined in this stylesheet
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String _className;

    /**
     * The name of the class being generated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Boolean _hasLocalParams = null;

    /**
     * Used to cache the result returned by <code>hasLocalParams()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector _globals = new Vector();

    /**
     * Contains global variables and parameters defined in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Stylesheet _parentStylesheet;

    /**
     * A reference to the parent stylesheet or null if topmost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String _systemId;

    /**
     * A URI that represents the system ID for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private QName _name;

    /**
     * Internal name of this stylesheet used as a key into the symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String _version;

    /**
     * XSLT version defined in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
public final class Stylesheet extends SyntaxTreeNode {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void peepHoleOptimization(MethodGenerator methodGen) {

    /**
     * Peephole optimization: Remove sequences of [ALOAD, POP].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void compileTransform(ClassGenerator classGen) {

    /**
     * Compile transform() into the output class. This method is used to
     * initialize global variables and global parameters. The current node
     * is set to be the document's root node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String compileBuildKeys(ClassGenerator classGen) {

    /**
     * Compile a buildKeys() method into the output class. Note that keys
     * for the input document are created in topLevel(), not in this method.
     * However, we still need this method to create keys for documents loaded
     * via the XPath document() function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector resolveDependencies(Vector input) {

    /**
     * This method returns a vector with variables/params and keys in the
     * order in which they are to be compiled for initialization. The order
     * is determined by analyzing the dependencies between them. The XSLT 1.0
     * spec does not allow a key to depend on a variable. However, for
     * compatibility with Xalan interpretive, that type of dependency is
     * allowed and, therefore, consider to determine the partial order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String compileTopLevel(ClassGenerator classGen) {

    /**
     * Compile a topLevel() method into the output class. This method is
     * called from transform() to handle all non-template top-level elements.
     * Returns the signature of the topLevel() method.
     *
     * Global variables/params and keys are first sorted to resolve
     * dependencies between them. The XSLT 1.0 spec does not allow a key
     * to depend on a variable. However, for compatibility with Xalan
     * interpretive, that type of dependency is allowed. Note also that
     * the buildKeys() method is still generated as it is used by the
     * LoadDocument class, but it no longer called from transform().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void compileConstructor(ClassGenerator classGen, Output output) {

    /**
     * Compile the translet's constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void compileStaticInitializer(ClassGenerator classGen) {

    /**
     * Compile the namesArray, urisArray and typesArray into
     * the static initializer. They are read-only from the
     * translet. All translet instances can share a single
     * copy of this informtion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public void translate() {

    /**
     * Translate the stylesheet into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void addStaticField(ClassGenerator classGen, String type,
                                String name)

    /**
     * Add a static field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate the stylesheet into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check all the children of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public final void parseOwnChildren(Parser parser) {

    /**
     * Parse all direct children of the <xsl:stylesheet/> element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public void parseContents(Parser parser) {

    /**
     * Parse the version and uri fields of the stylesheet and add an
     * entry to the symbol table mapping the name <tt>__stylesheet_</tt>
     * to an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void extensionURI(String prefixes, SymbolTable stable) {

    /**
     * Store extension URIs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    protected void addPrefixMapping(String prefix, String uri) {

    /**
     * Adds a single prefix mapping to this syntax tree node.
     * @param prefix Namespace prefix.
     * @param uri Namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public boolean hasLocalParams() {

    /**
     * Returns true if at least one template in the stylesheet has params
     * defined. Uses the variable <code>_hasLocalParams</code> to cache the
     * result.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public boolean hasGlobals() {

    /**
     * Returns true if this stylesheet has global vars or params.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public int getMinimumDescendantPrecedence() {

    /**
     * Get the minimum of the precedence of this stylesheet, any stylesheet
     * imported by this stylesheet and any include/import descendant of this
     * stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private void checkOutputMethod() {

    /**
     * Check and set the output method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public int getOutputMethod() {

    /**
     * Return the output method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _outputMethod = UNKNOWN_OUTPUT;

    /**
     * Output method for this stylesheet (must be set to one of
     * the constants defined below).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Properties _outputProperties = null;

    /**
     * Output properties for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Output  _lastOutputElement = null;

    /**
     * A reference to the last xsl:output object found in the styleshet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _templateInlining = false;

    /**
     * Set to true to enable template inlining optimization.
     * @see XSLTC#_templateInlining
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _hasIdCall = false;

    /**
     * Flag indicating if id() is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _callsNodeset = false;

    /**
     * Flag indicating if nodset() is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _multiDocument = false;

    /**
     * Flag indicating if multi-document support is needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _simplified = false;

    /**
     * Flag indicating if this is a simplified stylesheets. A template
     * matching on "/" must be added in this case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private boolean _numberFormattingUsed = false;

    /**
     * Flag indicating if format-number() is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private SourceLoader _loader = null;

    /**
     * A reference to the SourceLoader set by the user (a URIResolver
     * if the JAXP API is being used).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Map<String, Key> _keys = new HashMap<>();

    /**
     * Mapping between key names and Key objects (needed by Key/IdPattern).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _minimumDescendantPrecedence = -1;

    /**
     * Minimum precendence of any descendant stylesheet by inclusion or
     * importation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _importPrecedence = 1;

    /**
     * Import precendence for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector _includedStylesheets = null;

    /**
     * Array of all the stylesheets imported or included from this one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public Stylesheet _includedFrom = null;

    /**
     * Reference to the stylesheet from which this stylesheet was
     * included (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    public Stylesheet _importedFrom = null;

    /**
     * Reference to the stylesheet from which this stylesheet was
     * imported (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private final Map<String, String> _extensions = new HashMap<>();

    /**
     * Mapping between extension URIs and their prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Mode _defaultMode;

    /**
     * A reference to the default Mode object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private final Map<String, Mode> _modes = new HashMap<>();

    /**
     * Mapping between mode names and Mode instances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private int _nextModeSerial = 1;

    /**
     * Counter to generate unique mode suffixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector _allValidTemplates = null;

    /**
     * Used to cache result of <code>getAllValidTemplates()</code>. Only
     * set in top-level stylesheets that include/import other stylesheets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private final Vector _templates = new Vector();

    /**
      * Contains all templates defined in this stylesheet
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String _className;

    /**
     * The name of the class being generated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Boolean _hasLocalParams = null;

    /**
     * Used to cache the result returned by <code>hasLocalParams()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Vector _globals = new Vector();

    /**
     * Contains global variables and parameters defined in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private Stylesheet _parentStylesheet;

    /**
     * A reference to the parent stylesheet or null if topmost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String _systemId;

    /**
     * A URI that represents the system ID for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private QName _name;

    /**
     * Internal name of this stylesheet used as a key into the symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
    private String _version;

    /**
     * XSLT version defined in the stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Stylesheet.java
public final class Stylesheet extends SyntaxTreeNode {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    static final int sizeMapDefault[] = { 8, 10, 12, 14, 18, 24, 36 };

    /**
     * The HTML/CSS size model has seven slots
     * that one can assign sizes to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        URL base;

        /** Where the CSS stylesheet lives. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        boolean parsingDeclaration;

        /** True if parsing a declaration, that is the Reader will not
         * contain a selector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        String propertyName;

        /** Name of the current property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void endRule() {

        /**
         * Invoked when the end of a rule is encountered.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void handleValue(String value) {

        /**
         * Invoked when a property value is encountered.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void handleProperty(String property) {

        /**
         * Invoked when a property name is encountered.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void startRule() {

        /**
         * Invoked when the start of a rule is encountered.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void handleSelector(String selector) {

        /**
         * A selector has been encountered.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void handleImport(String importString) {

        /**
         * Invoked when a valid @import is encountered, will call
         * <code>importStyleSheet</code> if a
         * <code>MalformedURLException</code> is not thrown in creating
         * the URL.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void parse(URL base, Reader r, boolean parseDeclaration,
                          boolean isLink) throws IOException {

        /**
         * Parse the given CSS stream
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public AttributeSet parseDeclaration(Reader r) throws IOException {

        /**
         * Parses the passed in CSS declaration into an AttributeSet.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public AttributeSet parseDeclaration(String string) {

        /**
         * Parses the passed in CSS declaration into an AttributeSet.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    class CssParser implements CSSParser.CSSParserCallback {

    /**
     * Default parser for CSS specifications that get loaded into
     * the StyleSheet.<p>
     * This class is NOT thread safe, do not ask it to parse while it is
     * in the middle of parsing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private URL base;

    /** Where the style sheet was found. Used for relative imports. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private Vector<StyleSheet> linkedStyleSheets;

    /** Vector of StyleSheets that the rules are to reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private Hashtable<String, ResolvedStyle> resolvedStyles;

    /** Maps from selector (as a string) to Style that includes all
     * relevant styles. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private SelectorMapping selectorMapping;

    /**
     * An inverted graph of the selectors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        private HashMap<String, SelectorMapping> children;

        /**
         * Any sub selectors. Key will be String, and value will be
         * another SelectorMapping.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        private int specificity;

        /**
         * The specificity for this selector.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        protected int getChildSpecificity(String selector) {

        /**
         * Returns the specificity for the child selector
         * <code>selector</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        protected SelectorMapping createChildSelectorMapping(int specificity) {

        /**
         * Creates a child <code>SelectorMapping</code> with the specified
         * <code>specificity</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public SelectorMapping getChildSelectorMapping(String selector,
                                                       boolean create) {

        /**
         * Returns the child mapping identified by the simple selector
         * <code>selector</code>. If a child mapping does not exist for
         *<code>selector</code>, and <code>create</code> is true, a new
         * one will be created.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public Style getStyle() {

        /**
         * Returns the Style associated with this mapping.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void setStyle(Style style) {

        /**
         * Sets the Style associated with this mapping.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public int getSpecificity() {

        /**
         * Returns the specificity this mapping represents.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    static class SelectorMapping implements Serializable {

    /**
     * SelectorMapping contains a specifitiy, as an integer, and an associated
     * Style. It can also reference children <code>SelectorMapping</code>s,
     * so that it behaves like a tree.
     * <p>
     * This is not thread safe, it is assumed the caller will take the
     * necessary precations if this is to be used in a threaded environment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        String name;

        /** The name of the Style, which is the selector.
         * This will NEVER change!
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        int boundedIndexOf(String string, char search, int start,
                           int end) {

        /**
         * Similar to String.indexOf, but allows an upper bound
         * (this is slower in that it will still check string starting at
         * start.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        boolean matches(String selector, int sCurrent, int sLast,
                       int thisCurrent, int thisLast) {

        /**
         * Returns true if the substring of the receiver, in the range
         * thisCurrent, thisLast matches the substring of selector in
         * the ranme sCurrent to sLast based on CSS selector matching.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        protected boolean matches(String selector) {

        /**
         * Returns true if the receiver matches <code>selector</code>, where
         * a match is defined by the CSS rule matching.
         * Each simple selector must be separated by a single space.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        synchronized void removeExtendedStyleAt(int index) {

        /**
         * Removes the style at <code>index</code> +
         * <code>extendedIndex</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        synchronized void addExtendedStyle(Style attr) {

        /**
         * Adds <code>s</code> as one of the AttributeSets to look up
         * attributes in. It will be the AttributeSet last checked.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        synchronized void insertExtendedStyleAt(Style attr, int index) {

        /**
         * Adds <code>s</code> as one of the Attributesets to look up
         * attributes in.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        synchronized void removeStyle(Style style) {

        /**
         * Removes a previously added style. This will do nothing if
         * <code>style</code> is not referenced by the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        synchronized void insertStyle(Style style, int specificity) {

        /**
         * Inserts a Style into the receiver so that the styles the
         * receiver represents are still ordered by specificity.
         * <code>style</code> will be added before any extended styles, that
         * is before extendedIndex.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    // PENDING(sky): Decide what to do with this. Either make it

    /**
     * A subclass of MuxingAttributeSet that implements Style. Currently
     * the MutableAttributeSet methods are unimplemented, that is they
     * do nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        View host;

        /** View created for. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public AttributeSet getResolveParent() {

        /**
         * If not overriden, the resolving parent defaults to
         * the parent element.
         *
         * @return the attributes from the parent
         * @see AttributeSet#getResolveParent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public Object getAttribute(Object key) {

        /**
         * Gets the value of an attribute.  If the requested
         * attribute is a StyleConstants attribute that has
         * a CSS mapping, the request will be converted.
         *
         * @param key the attribute name
         * @return the attribute value
         * @see AttributeSet#getAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public boolean isDefined(Object key) {

        /**
         * Checks whether a given attribute is defined.
         * This will convert the key over to CSS if the
         * key is a StyleConstants key that has a CSS
         * mapping.
         *
         * @param key the attribute key
         * @return true if the attribute is defined
         * @see AttributeSet#isDefined
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
                                    if (o != null && o instanceof AttributeSet) {

                                /**
                                   In the case of an A tag, the css rules
                                   apply only for tags that have their
                                   href attribute defined and not for
                                   anchors that only have their name attributes
                                   defined, i.e anchors that function as
                                   destinations.  Hence we do not add the
                                   attributes for that latter kind of
                                   anchors.  When CSS2 support is added,
                                   it will be possible to specificity this
                                   kind of conditional behaviour in the
                                   stylesheet.
                                 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    class ViewAttributeSet extends MuxingAttributeSet {

    /**
     * A subclass of MuxingAttributeSet that translates between
     * CSS and HTML and StyleConstants. The AttributeSets used are
     * the CSS rules that match the Views Elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    static class BackgroundImagePainter implements Serializable {

    /**
     * Paints the background image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        String formatRomanDigit(int level, int digit) {

        /**
         * Converts the item number into a roman numeral
         *
         * @param level position
         * @param digit digit to format
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        String formatRomanNumerals(int level, int num) {

        /**
         * Converts the item number into a roman numeral
         *
         * @param num  number to format
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        String formatRomanNumerals(int num) {

        /**
         * Converts the item number into a roman numeral
         *
         * @param num  number to format
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        String formatAlphaNumerals(int itemNum) {

        /**
         * Converts the item number into an alphabetic character
         *
         * @param itemNum number to format
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        String formatItemNum(int itemNum, char type) {

        /**
         * Converts the item number into the ordered list number
         * (i.e.  1 2 3, i ii iii, a b c, etc.
         *
         * @param itemNum number to format
         * @param type    type of ordered list
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        void drawLetter(Graphics g, char letter, int ax, int ay, int aw,
                        int ah, float align, int index) {

        /**
         * Draws the letter or number for an ordered list.
         *
         * @param g     the graphics context
         * @param letter type of ordered list to draw
         * @param ax    x coordinate to place the bullet
         * @param ay    y coordinate to place the bullet
         * @param aw    width of the container the bullet is placed in
         * @param ah    height of the container the bullet is placed in
         * @param index position of the list item in the list
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        void drawShape(Graphics g, CSS.Value type, int ax, int ay, int aw,
                       int ah, float align) {

        /**
         * Draws the graphical bullet item specified by the type argument.
         *
         * @param g     the graphics context
         * @param type  type of bullet to draw (circle, square, disc)
         * @param ax    x coordinate to place the bullet
         * @param ay    y coordinate to place the bullet
         * @param aw    width of the container the bullet is placed in
         * @param ah    height of the container the bullet is placed in
         * @param align preferred alignment factor for the child view
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        void drawIcon(Graphics g, int ax, int ay, int aw, int ah,
                      float align, Component c) {

        /**
         * Draws the bullet icon specified by the list-style-image argument.
         *
         * @param g     the graphics context
         * @param ax    x coordinate to place the bullet
         * @param ay    y coordinate to place the bullet
         * @param aw    width of the container the bullet is placed in
         * @param ah    height of the container the bullet is placed in
         * @param align preferred alignment factor for the child view
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void paint(Graphics g, float x, float y, float w, float h, View v, int item) {

        /**
         * Paints the CSS list decoration according to the
         * attributes given.
         *
         * @param g the rendering surface.
         * @param x the x coordinate of the list item allocation
         * @param y the y coordinate of the list item allocation
         * @param w the width of the list item allocation
         * @param h the height of the list item allocation
         * @param v the allocated area to paint into.
         * @param item which list item is being painted.  This
         *  is a number greater than or equal to 0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        private int getRenderIndex(View parentView, int childIndex) {

        /**
         * Returns an integer that should be used to render the child at
         * <code>childIndex</code> with. The retValue will usually be
         * <code>childIndex</code> + 1, unless <code>parentView</code>
         * has some Views that do not represent LI's, or one of the views
         * has a HTML.Attribute.START specified.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        private void getStart(View parent) {

        /**
         * Obtains the starting index from <code>parent</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        private CSS.Value getChildType(View childView) {

        /**
         * Returns a string that represents the value
         * of the HTML.Attribute.TYPE attribute.
         * If this attributes is not defined, then
         * then the type defaults to "disc" unless
         * the tag is on Ordered list.  In the case
         * of the latter, the default type is "decimal".
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public static class ListPainter implements Serializable {

    /**
     * Class to carry out some of the duties of CSS list
     * formatting.  Implementations of this
     * class enable views to present the CSS formatting
     * while not knowing anything about how the CSS values
     * are being cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        float getOrientationMargin(HorizontalMargin side, float cssMargin,
                                   AttributeSet a, boolean isLeftToRight) {

        /**
         * for <dir>, <menu>, <ul> etc.
         * margins are Left-To-Right/Right-To-Left depended.
         * see 5088268 for more details
         * margin-(left|right)-(ltr|rtl) were introduced to describe it
         * if margin-(left|right) is present we are to use it.
         *
         * @param side The horizontal side to fetch margin for
         *  This can be HorizontalMargin.LEFT or HorizontalMargin.RIGHT
         * @param cssMargin margin from css
         * @param a AttributeSet for the View we getting margin for
         * @param isLeftToRight
         * @return orientation depended margin
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public void paint(Graphics g, float x, float y, float w, float h, View v) {

        /**
         * Paints the CSS box according to the attributes
         * given.  This should paint the border, padding,
         * and background.
         *
         * @param g the rendering surface.
         * @param x the x coordinate of the allocated area to
         *  render into.
         * @param y the y coordinate of the allocated area to
         *  render into.
         * @param w the width of the allocated area to render into.
         * @param h the height of the allocated area to render into.
         * @param v the view making the request.  This is
         *  used to get the AttributeSet, and may be used to
         *  resolve percentage arguments.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public float getInset(int side, View v) {

        /**
         * Fetches the inset needed on a given side to
         * account for the margin, border, and padding.
         *
         * @param side The size of the box to fetch the
         *  inset for.  This can be View.TOP,
         *  View.LEFT, View.BOTTOM, or View.RIGHT.
         * @param v the view making the request.  This is
         *  used to get the AttributeSet, and may be used to
         *  resolve percentage arguments.
         * @exception IllegalArgumentException for an invalid direction
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        Color getBorderColor(AttributeSet a) {

        /**
         * Fetches the color to use for borders.  This will either be
         * the value specified by the border-color attribute (which
         * is not inherited), or it will default to the color attribute
         * (which is inherited).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        Border getBorder(AttributeSet a) {

        /**
         * Fetches a border to render for the given attributes.
         * PENDING(prinz) This is pretty badly hacked at the
         * moment.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public static class BoxPainter implements Serializable {

    /**
     * Class to carry out some of the duties of
     * CSS formatting.  Implementations of this
     * class enable views to present the CSS formatting
     * while not knowing anything about how the CSS values
     * are being cached.
     * <p>
     * As a delegate of Views, this object is responsible for
     * the insets of a View and making sure the background
     * is maintained according to the CSS attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        static void releaseSearchBuffer(SearchBuffer sb) {

        /**
         * Adds <code>sb</code> to the stack of SearchBuffers that can
         * be used.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        static SearchBuffer obtainSearchBuffer() {

        /**
         * Returns an instance of SearchBuffer. Be sure and issue
         * a releaseSearchBuffer when done with it.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private static class SearchBuffer {

    /**
     * A temporary class used to hold a Vector, a StringBuffer and a
     * Hashtable. This is used to avoid allocing a lot of garbage when
     * searching for rules. Use the static method obtainSearchBuffer and
     * releaseSearchBuffer to get a SearchBuffer, and release it when
     * done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private synchronized void refreshResolvedRules(String selectorName,
                                                   String[] selector,
                                                   Style newStyle,
                                                   int specificity) {

    /**
     * Should be invoked when a new rule is added that did not previously
     * exist. Goes through and refreshes the necessary resolved
     * rules.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private Style createResolvedStyle(String selector) {

    /**
     * Creates and returns a Style containing all the rules that match
     *  <code>selector</code>. It is assumed that each simple selector
     * in <code>selector</code> is separated by a space.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private Style createResolvedStyle(String selector, Vector elements,
                                      HTML.Tag t) {

    /**
     * Creates and returns a Style containing all the rules that
     * matches <code>selector</code>.
     *
     * @param elements  a Vector of all the Elements
     *                  the style is being asked for. The
     *                  first Element is the deepest Element, with the last Element
     *                  representing the root.
     * @param t         the Tag to use for
     *                  the first Element in <code>elements</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private synchronized Style createResolvedStyle(String selector,
                                      String[] tags,
                                      String[] ids, String[] classes) {

    /**
     * Creates and returns a Style containing all the rules that match
     *  <code>selector</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private synchronized void getStyles(SelectorMapping parentMapping,
                           Vector<SelectorMapping> styles,
                           String[] tags, String[] ids, String[] classes,
                           int index, int numElements,
                           Hashtable<SelectorMapping, SelectorMapping> alreadyChecked) {

    /**
     * Adds <code>parentMapping</code> to <code>styles</code>, and
     * recursively calls this method if <code>parentMapping</code> has
     * any child mappings for any of the Elements in <code>elements</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private void addSortedStyle(SelectorMapping mapping, Vector<SelectorMapping> elements) {

    /**
     * Adds <code>mapping</code> to <code>elements</code>. It is added
     * such that <code>elements</code> will remain ordered by
     * specificity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private synchronized Style getResolvedStyle(String selector) {

    /**
     * Returns the resolved style for <code>selector</code>. This will
     * create the resolved style, if necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private synchronized Style getResolvedStyle(String selector,
                                                Vector elements,
                                                HTML.Tag t) {

    /**
     * Returns the resolved style for <code>selector</code>. This will
     * create the resolved style, if necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private Style getLinkedStyle(Style localStyle) {

    /**
     * Returns the style that linked attributes should be added to. This
     * will create the style if necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    /*protected*/ static int getSpecificity(String selector) {

    /**
     * Returns the specificity of the passed in String. It assumes the
     * passed in string doesn't contain junk, that is each selector is
     * separated by a space and each selector at most contains one . or one
     * #. A simple selector has a weight of 1, an id selector has a weight
     * of 100, and a class selector has a weight of 10000.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private SelectorMapping getRootSelectorMapping() {

    /**
     * Returns the root selector mapping that all selectors are relative
     * to. This is an inverted graph of the selectors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private String _cleanSelectorString(String selector) {

    /**
     * Returns a new String that contains only one space between non
     * white space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    /*protected*/ String cleanSelectorString(String selector) {

    /**
     * Returns a string that only has one space between simple selectors,
     * which may be the passed in String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    /* protected */

    /**
     * Returns the simple selectors that comprise selector.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private synchronized void unlinkStyleSheet(StyleSheet ss, int index) {

    /**
     * Removes references to the rules in <code>ss</code>.
     * <code>index</code> gives the index the StyleSheet was at, that is
     * how many StyleSheets had been added before it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private synchronized void linkStyleSheetAt(StyleSheet ss, int index) {

    /**
     * Updates the attributes of the rules to reference any related
     * rules in <code>ss</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    void addRule(String[] selector, AttributeSet declaration,
                 boolean isLinked) {

    /**
     * Adds a rule into the StyleSheet.
     *
     * @param selector the selector to use for the rule.
     *  This will be a set of simple selectors, and must
     *  be a length of 1 or greater.
     * @param declaration the set of CSS attributes that
     *  make up the rule.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    ImageIcon getBackgroundImage(AttributeSet attr) {

    /**
     * Returns the ImageIcon to draw in the background for
     * <code>attr</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public Color stringToColor(String string) {

    /**
     * Converts a color string such as "RED" or "#NNNNNN" to a Color.
     * Note: This will only convert the HTML3.2 color strings
     *       or a string of length 7;
     *       otherwise, it will return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public float getPointSize(String size) {

    /**
     *  Given a string such as "+2", "-2", or "2",
     *  returns a point size value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public float getPointSize(int index) {

    /**
     * Returns the point size, given a size index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void setBaseFontSize(String size) {

    /**
     * Sets the base font size from the passed in String. The string
     * can either identify a specific font size, with legal values between
     * 1 and 7, or identify a relative font size such as +1 or -2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void setBaseFontSize(int sz) {

    /**
     * Sets the base font size, with valid values between 1 and 7.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public ListPainter getListPainter(AttributeSet a) {

    /**
     * Fetches the list formatter to use for the given set
     * of CSS attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public BoxPainter getBoxPainter(AttributeSet a) {

    /**
     * Fetches the box formatter to use for the given set
     * of CSS attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public Color getBackground(AttributeSet a) {

    /**
     * Takes a set of attributes and turn it into a background color
     * specification.  This might be used to specify things
     * like brighter, more hue, etc.
     *
     * @param a the set of attributes
     * @return the color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public Color getForeground(AttributeSet a) {

    /**
     * Takes a set of attributes and turn it into a foreground color
     * specification.  This might be used to specify things
     * like brighter, more hue, etc.
     *
     * @param a the set of attributes
     * @return the color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public Font getFont(AttributeSet a) {

    /**
     * Fetches the font to use for the given set of attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public Object getAttribute(Object key) {

        /**
         * Gets the value of an attribute.
         *
         * @param key the attribute name
         * @return the attribute value
         * @see AttributeSet#getAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public boolean isDefined(Object key) {

        /**
         * Checks whether a given attribute is defined.
         *
         * @param key the attribute key
         * @return true if the attribute is defined
         * @see AttributeSet#isDefined
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public SmallConversionSet(AttributeSet attrs) {

        /**
         * Creates a new attribute set based on a supplied set of attributes.
         *
         * @param attrs the set of attributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    class SmallConversionSet extends SmallAttributeSet {

    /**
     * Small set of attributes that does conversion of requests
     * for attributes of type StyleConstants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public Object getAttribute(Object key) {

        /**
         * Gets the value of an attribute.
         *
         * @param key the attribute name
         * @return the attribute value
         * @see AttributeSet#getAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public boolean isDefined(Object key) {

        /**
         * Checks whether a given attribute is defined.
         *
         * @param key the attribute key
         * @return true if the attribute is defined
         * @see AttributeSet#isDefined
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
        public LargeConversionSet(AttributeSet source) {

        /**
         * Creates a new attribute set based on a supplied set of attributes.
         *
         * @param source the set of attributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    class LargeConversionSet extends SimpleAttributeSet {

    /**
     * Large set of attributes that does conversion of requests
     * for attributes of type StyleConstants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    AttributeSet convertAttributeSet(AttributeSet a) {

    /**
     * Converts a set of attributes (if necessary) so that
     * any attributes that were specified as StyleConstants
     * attributes and have a CSS mapping, will be converted
     * to CSS attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    private AttributeSet removeHTMLTags(AttributeSet old, AttributeSet attr) {

    /**
     * For any StyleConstants key in attr that has an associated HTML.Tag,
     * it is removed from old. The resulting AttributeSet is then returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    protected MutableAttributeSet createLargeAttributeSet(AttributeSet a) {

    /**
     * Creates a large set of attributes that should trade off
     * space for time.  This set will not be shared.  This is
     * a hook for subclasses that want to alter the behavior
     * of the larger attribute storage format (which is
     * SimpleAttributeSet by default).   This can be reimplemented
     * to return a MutableAttributeSet that provides some sort of
     * attribute conversion.
     *
     * @param a The set of attributes to be represented in the
     *  the larger form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    protected SmallAttributeSet createSmallAttributeSet(AttributeSet a) {

    /**
     * Creates a compact set of attributes that might be shared.
     * This is a hook for subclasses that want to alter the
     * behavior of SmallAttributeSet.  This can be reimplemented
     * to return an AttributeSet that provides some sort of
     * attribute conversion.
     *
     * @param a The set of attributes to be represented in the
     *  the compact form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet removeAttributes(AttributeSet old, AttributeSet attrs) {

    /**
     * Removes a set of attributes. If any of the attributes
     * is a StyleConstants attribute, the request will be converted to a CSS
     * attribute prior to forwarding to the superclass behavior.
     *
     * @param old the old attribute set
     * @param attrs the attributes
     * @return the updated attribute set
     * @see MutableAttributeSet#removeAttributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet removeAttributes(AttributeSet old, Enumeration<?> names) {

    /**
     * Removes a set of attributes for the element.  If any of the attributes
     * is a StyleConstants attribute, the request will be converted to a CSS
     * attribute prior to forwarding to the superclass behavior.
     *
     * @param old the old attribute set
     * @param names the attribute names
     * @return the updated attribute set
     * @see MutableAttributeSet#removeAttributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet removeAttribute(AttributeSet old, Object key) {

    /**
     * Removes an attribute from the set.  If the attribute is a StyleConstants
     * attribute, the request will be converted to a CSS attribute prior to
     * forwarding to the superclass behavior.
     *
     * @param old the old set of attributes
     * @param key the non-null attribute name
     * @return the updated attribute set
     * @see MutableAttributeSet#removeAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet addAttributes(AttributeSet old, AttributeSet attr) {

    /**
     * Adds a set of attributes to the element.  If any of these attributes
     * are StyleConstants attributes, they will be converted to CSS prior
     * to forwarding to the superclass behavior.
     *
     * @param old the old attribute set
     * @param attr the attributes to add
     * @return the updated attribute set
     * @see MutableAttributeSet#addAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet addAttribute(AttributeSet old, Object key,
                                     Object value) {

    /**
     * Adds an attribute to the given set, and returns
     * the new representative set.  This is reimplemented to
     * convert StyleConstant attributes to CSS prior to forwarding
     * to the superclass behavior.  The StyleConstants attribute
     * has no corresponding CSS entry, the StyleConstants attribute
     * is stored (but will likely be unused).
     *
     * @param old the old attribute set
     * @param key the non-null attribute key
     * @param value the attribute value
     * @return the updated attribute set
     * @see MutableAttributeSet#addAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet translateHTMLToCSS(AttributeSet htmlAttrSet) {

    /**
     * Converts a set of HTML attributes to an equivalent
     * set of CSS attributes.
     *
     * @param htmlAttrSet AttributeSet containing the HTML attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public boolean addCSSAttributeFromHTML(MutableAttributeSet attr,
                                           CSS.Attribute key, String value) {

    /**
     * Adds a CSS attribute to the given set.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void addCSSAttribute(MutableAttributeSet attr, CSS.Attribute key,
                                String value) {

    /**
     * Adds a CSS attribute to the given set.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public URL getBase() {

    /**
     * Returns the base.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void setBase(URL base) {

    /**
     * Sets the base. All import statements that are relative, will be
     * relative to <code>base</code>.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void importStyleSheet(URL url) {

    /**
     * Imports a style sheet from <code>url</code>. The resulting rules
     * are directly added to the receiver. If you do not want the rules
     * to become part of the receiver, create a new StyleSheet and use
     * addStyleSheet to link it in.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public StyleSheet[] getStyleSheets() {

    /**
     * Returns an array of the linked StyleSheets. Will return null
     * if there are no linked StyleSheets.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void removeStyleSheet(StyleSheet ss) {

    /**
     * Removes the StyleSheet <code>ss</code> from those of the receiver.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void addStyleSheet(StyleSheet ss) {

    /**
     * Adds the rules from the StyleSheet <code>ss</code> to those of
     * the receiver. <code>ss's</code> rules will override the rules of
     * any previously added style sheets. An added StyleSheet will never
     * override the rules of the receiving style sheet.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void removeStyle(String nm) {

    /**
     * Removes a named style previously added to the document.
     *
     * @param nm  the name of the style to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet getViewAttributes(View v) {

    /**
     * Fetches a set of attributes to use in the view for
     * displaying.  This is basically a set of attributes that
     * can be used for View.getAttributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void loadRules(Reader in, URL ref) throws IOException {

    /**
     * Loads a set of rules that have been specified in terms of
     * CSS1 grammar.  If there are collisions with existing rules,
     * the newly specified rule will win.
     *
     * @param in the stream to read the CSS grammar from
     * @param ref the reference URL.  This value represents the
     *  location of the stream and may be null.  All relative
     *  URLs specified in the stream will be based upon this
     *  parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public AttributeSet getDeclaration(String decl) {

    /**
     * Translates a CSS declaration to an AttributeSet that represents
     * the CSS declaration.  Typically this would be called as a
     * result of encountering an HTML style attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public void addRule(String rule) {

    /**
     * Adds a set of rules to the sheet.  The rules are expected to
     * be in valid CSS format.  Typically this would be called as
     * a result of parsing a &lt;style&gt; tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public Style getRule(String selector) {

    /**
     * Fetches the rule that best matches the selector given
     * in string form. Where <code>selector</code> is a space separated
     * String of the element names. For example, <code>selector</code>
     * might be 'html body tr td''<p>
     * The attributes of the returned Style will change
     * as rules are added and removed. That is if you to ask for a rule
     * with a selector "table p" and a new rule was added with a selector
     * of "p" the returned Style would include the new attributes from
     * the rule "p".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public Style getRule(HTML.Tag t, Element e) {

    /**
     * Fetches the style to use to render the given type
     * of HTML tag.  The element given is representing
     * the tag and can be used to determine the nesting
     * for situations where the attributes will differ
     * if nesting inside of elements.
     *
     * @param t the type to translate to visual attributes
     * @param e the element representing the tag; the element
     *  can be used to determine the nesting for situations where
     *  the attributes will differ if nested inside of other
     *  elements
     * @return the set of CSS attributes to use to render
     *  the tag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
    public StyleSheet() {

    /**
     * Construct a StyleSheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/StyleSheet.java
public class StyleSheet extends StyleContext {

/**
 * Support for defining the visual characteristics of
 * HTML views being rendered.  The StyleSheet is used to
 * translate the HTML model into visual characteristics.
 * This enables views to be customized by a look-and-feel,
 * multiple views over the same model can be rendered
 * differently, etc.  This can be thought of as a CSS
 * rule repository.  The key for CSS attributes is an
 * object of type CSS.Attribute.  The type of the value
 * is up to the StyleSheet implementation, but the
 * <code>toString</code> method is required
 * to return a string representation of CSS value.
 * <p>
 * The primary entry point for HTML View implementations
 * to get their attributes is the
 * {@link #getViewAttributes getViewAttributes}
 * method.  This should be implemented to establish the
 * desired policy used to associate attributes with the view.
 * Each HTMLEditorKit (i.e. and therefore each associated
 * JEditorPane) can have its own StyleSheet, but by default one
 * sheet will be shared by all of the HTMLEditorKit instances.
 * HTMLDocument instance can also have a StyleSheet, which
 * holds the document-specific CSS specifications.
 * <p>
 * In order for Views to store less state and therefore be
 * more lightweight, the StyleSheet can act as a factory for
 * painters that handle some of the rendering tasks.  This allows
 * implementations to determine what they want to cache
 * and have the sharing potentially at the level that a
 * selector is common to multiple views.  Since the StyleSheet
 * may be used by views over multiple documents and typically
 * the HTML attributes don't effect the selector being used,
 * the potential for sharing is significant.
 * <p>
 * The rules are stored as named styles, and other information
 * is stored to translate the context of an element to a
 * rule quickly.  The following code fragment will display
 * the named styles, and therefore the CSS rules contained.
 * <pre><code>
 * &nbsp;
 * &nbsp; import java.util.*;
 * &nbsp; import javax.swing.text.*;
 * &nbsp; import javax.swing.text.html.*;
 * &nbsp;
 * &nbsp; public class ShowStyles {
 * &nbsp;
 * &nbsp;     public static void main(String[] args) {
 * &nbsp;       HTMLEditorKit kit = new HTMLEditorKit();
 * &nbsp;       HTMLDocument doc = (HTMLDocument) kit.createDefaultDocument();
 * &nbsp;       StyleSheet styles = doc.getStyleSheet();
 * &nbsp;
 * &nbsp;       Enumeration rules = styles.getStyleNames();
 * &nbsp;       while (rules.hasMoreElements()) {
 * &nbsp;           String name = (String) rules.nextElement();
 * &nbsp;           Style rule = styles.getStyle(name);
 * &nbsp;           System.out.println(rule.toString());
 * &nbsp;       }
 * &nbsp;       System.exit(0);
 * &nbsp;     }
 * &nbsp; }
 * &nbsp;
 * </code></pre>
 * <p>
 * The semantics for when a CSS style should overide visual attributes
 * defined by an element are not well defined. For example, the html
 * <code>&lt;body bgcolor=red&gt;</code> makes the body have a red
 * background. But if the html file also contains the CSS rule
 * <code>body { background: blue }</code> it becomes less clear as to
 * what color the background of the body should be. The current
 * implementation gives visual attributes defined in the element the
 * highest precedence, that is they are always checked before any styles.
 * Therefore, in the previous example the background would have a
 * red color as the body element defines the background color to be red.
 * <p>
 * As already mentioned this supports CSS. We don't support the full CSS
 * spec. Refer to the javadoc of the CSS class to see what properties
 * we support. The two major CSS parsing related
 * concepts we do not currently
 * support are pseudo selectors, such as <code>A:link { color: red }</code>,
 * and the <code>important</code> modifier.
 * <p>
 * <font color="red">Note: This implementation is currently
 * incomplete.  It can be replaced with alternative implementations
 * that are complete.  Future versions of this class will provide
 * better CSS support.</font>
 *
 * @author  Timothy Prinzing
 * @author  Sunita Mani
 * @author  Sara Swanson
 * @author  Jill Nakata
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/stylesheets/StyleSheet.java
    public MediaList getMedia();

    /**
     *  The intended destination media for style information. The media is
     * often specified in the <code>ownerNode</code>. If no media has been
     * specified, the <code>MediaList</code> will be empty. See the media
     * attribute definition for the <code>LINK</code> element in HTML 4.0,
     * and the media pseudo-attribute for the XML style sheet processing
     * instruction . Modifying the media list may cause a change to the
     * attribute <code>disabled</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/stylesheets/StyleSheet.java
    public String getTitle();

    /**
     *  The advisory title. The title is often specified in the
     * <code>ownerNode</code>. See the title attribute definition for the
     * <code>LINK</code> element in HTML 4.0, and the title pseudo-attribute
     * for the XML style sheet processing instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/stylesheets/StyleSheet.java
    public String getHref();

    /**
     *  If the style sheet is a linked style sheet, the value of its attribute
     * is its location. For inline style sheets, the value of this attribute
     * is <code>null</code>. See the href attribute definition for the
     * <code>LINK</code> element in HTML 4.0, and the href pseudo-attribute
     * for the XML style sheet processing instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/stylesheets/StyleSheet.java
    public StyleSheet getParentStyleSheet();

    /**
     *  For style sheet languages that support the concept of style sheet
     * inclusion, this attribute represents the including style sheet, if
     * one exists. If the style sheet is a top-level style sheet, or the
     * style sheet language does not support inclusion, the value of this
     * attribute is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/stylesheets/StyleSheet.java
    public Node getOwnerNode();

    /**
     *  The node that associates this style sheet with the document. For HTML,
     * this may be the corresponding <code>LINK</code> or <code>STYLE</code>
     * element. For XML, it may be the linking processing instruction. For
     * style sheets that are included by other style sheets, the value of
     * this attribute is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/stylesheets/StyleSheet.java
    public boolean getDisabled();

    /**
     *  <code>false</code> if the style sheet is applied to the document.
     * <code>true</code> if it is not. Modifying this attribute may cause a
     * new resolution of style for the document. A stylesheet only applies
     * if both an appropriate medium definition is present and the disabled
     * attribute is false. So, if the media doesn't apply to the current
     * user agent, the <code>disabled</code> attribute is ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/stylesheets/StyleSheet.java
public interface StyleSheet {

/**
 *  The <code>StyleSheet</code> interface is the abstract base interface for
 * any type of style sheet. It represents a single style sheet associated
 * with a structured document. In HTML, the StyleSheet interface represents
 * either an external style sheet, included via the HTML  LINK element, or
 * an inline  STYLE element. In XML, this interface represents an external
 * style sheet, included via a style sheet processing instruction.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
