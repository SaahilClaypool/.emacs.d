_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void startElement (QName element, XMLAttributes attributes, Augmentations augs) {

    /**
     * The start of an element. If the document specifies the start element
     * by using an empty tag, then the startElement method will immediately
     * be followed by the endElement method, with no intervening methods.
     * Overriding the parent to handle DOM_NAMESPACE_DECLARATIONS=false.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void abort () {

    /**
     * @see org.w3c.dom.ls.DOMParser#abort()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public boolean getBusy () {

    /**
     * @see org.w3c.dom.ls.LSParser#getBusy()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public boolean getAsync () {

    /**
     * @see org.w3c.dom.ls.LSParser#getAsync()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    XMLInputSource dom2xmlInputSource (LSInput is) {

    /**
     * NON-DOM: convert LSInput to XNIInputSource
     *
     * @param is
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Node parseWithContext (LSInput is, Node cnode,
    short action) throws DOMException, LSException {

    /**
     *  Parse an XML document or fragment from a resource identified by an
     * <code>LSInput</code> and insert the content into an existing
     * document at the position epcified with the <code>contextNode</code>
     * and <code>action</code> arguments. When parsing the input stream the
     * context node is used for resolving unbound namespace prefixes.
     *
     * @param is  The <code>LSInput</code> from which the source
     *   document is to be read.
     * @param cnode  The <code>Node</code> that is used as the context for
     *   the data that is being parsed.
     * @param action This parameter describes which action should be taken
     *   between the new set of node being inserted and the existing
     *   children of the context node. The set of possible actions is
     *   defined above.
     * @exception DOMException
     *   HIERARCHY_REQUEST_ERR: Thrown if this action results in an invalid
     *   hierarchy (i.e. a Document with more than one document element).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Document parse (LSInput is) throws LSException {

    /**
     * Parse an XML document from a resource identified by an
     * <code>LSInput</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Document parseURI (String uri) throws LSException {

    /**
     * Parse an XML document from a location identified by an URI reference.
     * If the URI contains a fragment identifier (see section 4.1 in ), the
     * behavior is not defined by this specification.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMStringList getParameterNames () {

    /**
     *  DOM Level 3 CR - Experimental.
     *
     *  The list of the parameters supported by this
     * <code>DOMConfiguration</code> object and for which at least one value
     * can be set by the application. Note that this list can also contain
     * parameter names defined outside this specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Object getParameter (String name) throws DOMException {

    /**
     * Look up the value of a feature or a property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void setParameter (String name, Object value) throws DOMException {

    /**
     * Set parameters and properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void setFilter (LSParserFilter filter) {

    /**
     *  When the application provides a filter, the parser will call out to
     * the filter at the completion of the construction of each
     * <code>Element</code> node. The filter implementation can choose to
     * remove the element from the document being constructed (unless the
     * element is the document element) or to terminate the parse early. If
     * the document is being validated when it's loaded the validation
     * happens before the filter is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public LSParserFilter getFilter () {

    /**
     *  When the application provides a filter, the parser will call out to
     * the filter at the completion of the construction of each
     * <code>Element</code> node. The filter implementation can choose to
     * remove the element from the document being constructed (unless the
     * element is the document element) or to terminate the parse early. If
     * the document is being validated when it's loaded the validation
     * happens before the filter is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void reset () {

    /**
     * Resets the parser state.
     *
     * @throws SAXException Thrown on initialization error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (SymbolTable symbolTable, XMLGrammarPool grammarPool) {

    /**
     * Constructs a DOM Builder using the specified symbol table and
     * grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (SymbolTable symbolTable) {

    /**
     * Constructs a DOM Builder using the specified symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (XMLParserConfiguration config) {

    /**
     * Constructs a DOM Builder using the specified parser configuration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (XMLParserConfiguration config, String schemaType) {

    /**
     * Constructs a DOM Builder using the standard parser configuration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected boolean fNamespaceDeclarations = true;

    /** Include namespace declaration attributes in the document. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String DISALLOW_DOCTYPE_DECL_FEATURE =

    /** Feature identifier: disallow docType Decls. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String NORMALIZE_DATA =

    /** Feature identifier: expose schema normalized value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String DYNAMIC_VALIDATION =

    /** Dynamic validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String XMLSCHEMA_FULL_CHECKING =

    /** XML Schema full checking */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String XMLSCHEMA =

    /** XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String VALIDATION_FEATURE =

    /** Feature id: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
public class DOMParserImpl

/**
 * This is Xerces DOM Builder class. It uses the abstract DOM
 * parser with a document scanner, a dtd scanner, and a validator, as
 * well as a grammar pool.
 *
 * @author Pavani Mukthipudi, Sun Microsystems Inc.
 * @author Elena Litani, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @version $Id: DOMParserImpl.java,v 1.8 2010-11-01 04:40:09 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void startElement (QName element, XMLAttributes attributes, Augmentations augs) {

    /**
     * The start of an element. If the document specifies the start element
     * by using an empty tag, then the startElement method will immediately
     * be followed by the endElement method, with no intervening methods.
     * Overriding the parent to handle DOM_NAMESPACE_DECLARATIONS=false.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void abort () {

    /**
     * @see org.w3c.dom.ls.DOMParser#abort()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public boolean getBusy () {

    /**
     * @see org.w3c.dom.ls.LSParser#getBusy()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public boolean getAsync () {

    /**
     * @see org.w3c.dom.ls.LSParser#getAsync()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    XMLInputSource dom2xmlInputSource (LSInput is) {

    /**
     * NON-DOM: convert LSInput to XNIInputSource
     *
     * @param is
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Node parseWithContext (LSInput is, Node cnode,
    short action) throws DOMException, LSException {

    /**
     *  Parse an XML document or fragment from a resource identified by an
     * <code>LSInput</code> and insert the content into an existing
     * document at the position epcified with the <code>contextNode</code>
     * and <code>action</code> arguments. When parsing the input stream the
     * context node is used for resolving unbound namespace prefixes.
     *
     * @param is  The <code>LSInput</code> from which the source
     *   document is to be read.
     * @param cnode  The <code>Node</code> that is used as the context for
     *   the data that is being parsed.
     * @param action This parameter describes which action should be taken
     *   between the new set of node being inserted and the existing
     *   children of the context node. The set of possible actions is
     *   defined above.
     * @exception DOMException
     *   HIERARCHY_REQUEST_ERR: Thrown if this action results in an invalid
     *   hierarchy (i.e. a Document with more than one document element).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Document parse (LSInput is) throws LSException {

    /**
     * Parse an XML document from a resource identified by an
     * <code>LSInput</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Document parseURI (String uri) throws LSException {

    /**
     * Parse an XML document from a location identified by an URI reference.
     * If the URI contains a fragment identifier (see section 4.1 in ), the
     * behavior is not defined by this specification.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMStringList getParameterNames () {

    /**
     *  DOM Level 3 CR - Experimental.
     *
     *  The list of the parameters supported by this
     * <code>DOMConfiguration</code> object and for which at least one value
     * can be set by the application. Note that this list can also contain
     * parameter names defined outside this specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public Object getParameter (String name) throws DOMException {

    /**
     * Look up the value of a feature or a property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void setParameter (String name, Object value) throws DOMException {

    /**
     * Set parameters and properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void setFilter (LSParserFilter filter) {

    /**
     *  When the application provides a filter, the parser will call out to
     * the filter at the completion of the construction of each
     * <code>Element</code> node. The filter implementation can choose to
     * remove the element from the document being constructed (unless the
     * element is the document element) or to terminate the parse early. If
     * the document is being validated when it's loaded the validation
     * happens before the filter is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public LSParserFilter getFilter () {

    /**
     *  When the application provides a filter, the parser will call out to
     * the filter at the completion of the construction of each
     * <code>Element</code> node. The filter implementation can choose to
     * remove the element from the document being constructed (unless the
     * element is the document element) or to terminate the parse early. If
     * the document is being validated when it's loaded the validation
     * happens before the filter is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public void reset () {

    /**
     * Resets the parser state.
     *
     * @throws SAXException Thrown on initialization error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (SymbolTable symbolTable, XMLGrammarPool grammarPool) {

    /**
     * Constructs a DOM Builder using the specified symbol table and
     * grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (SymbolTable symbolTable) {

    /**
     * Constructs a DOM Builder using the specified symbol table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (XMLParserConfiguration config) {

    /**
     * Constructs a DOM Builder using the specified parser configuration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    public DOMParserImpl (XMLParserConfiguration config, String schemaType) {

    /**
     * Constructs a DOM Builder using the standard parser configuration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected boolean fNamespaceDeclarations = true;

    /** Include namespace declaration attributes in the document. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String DISALLOW_DOCTYPE_DECL_FEATURE =

    /** Feature identifier: disallow docType Decls. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String NORMALIZE_DATA =

    /** Feature identifier: expose schema normalized value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String DYNAMIC_VALIDATION =

    /** Dynamic validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String XMLSCHEMA_FULL_CHECKING =

    /** XML Schema full checking */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String XMLSCHEMA =

    /** XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String VALIDATION_FEATURE =

    /** Feature id: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DOMParserImpl.java
public class DOMParserImpl

/**
 * This is Xerces DOM Builder class. It uses the abstract DOM
 * parser with a document scanner, a dtd scanner, and a validator, as
 * well as a grammar pool.
 *
 * @author Pavani Mukthipudi, Sun Microsystems Inc.
 * @author Elena Litani, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @version $Id: DOMParserImpl.java,v 1.8 2010-11-01 04:40:09 joehw Exp $
 */
