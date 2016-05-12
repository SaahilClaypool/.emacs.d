_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    protected DOMImplementation _domImplementation = null;

    /************************************************************************
     * DOMImplementation caching for basis library
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setAllowedProtocols(String protocols) {

    /**
     * Set allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public String getAllowedProtocols() {

    /**
     * Return allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    protected void transferOutputSettings(SerializationHandler handler) {

    /**
     * Transfer the output settings to the output post-processor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void addCdataElement(String name) {

    /**
     * Add's a name of an element whose text contents should be output as CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void characters(final String string,
                                 SerializationHandler handler)

    /**
     * Used by some compiled code as a shortcut for passing strings to the
     * output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void transform(DOM document, SerializationHandler handler)

    /**
     * Calls transform() with a given output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    /**

    /************************************************************************
     * Native API transformation methods - _NOT_ JAXP/TrAX
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public SerializationHandler openOutputHandler(String filename, boolean append)

    /************************************************************************
     * Multiple output document extension.
     * See compiler/TransletOutput for actual implementation.
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public DOMCache getDOMCache() {

    /**
     * Returns the DOM cache used for this translet. Used by the LoadDocument
     * class (if present) when the document() function is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setDOMCache(DOMCache cache) {

    /**
     * Sets the DOM cache used for additional documents loaded using the
     * document() function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Hold the DOM cache (if any) used with this translet

    /************************************************************************
     * DOM cache handling
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setKeyIndexDom(String name, DOM document) {

    /**
     * This method builds key indexes - it is overridden in the compiled
     * translet in cases where the <xsl:key> element is used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void buildKeys(DOM document, DTMAxisIterator iterator,
                          SerializationHandler handler,
                          int root) throws TransletException {

    /**
     * This method builds key indexes - it is overridden in the compiled
     * translet in cases where the <xsl:key> element is used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public KeyIndex getKeyIndex(String name) {

    /**
     * Returns the index for a given key (or id).
     * The index implements our internal iterator interface
     * @param name the name of the index (the key or ##id)
     * @return a KeyIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    private KeyIndex buildKeyIndexHelper(String name) {

    /**
     * Return KeyIndex for the buildKeyIndex methods. Note the difference from the
     * public getKeyIndex method, this method creates a new Map if keyIndexes does
     * not exist.
     *
     * @param name the name of the index (the key or ##id)
     * @return a KeyIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void buildKeyIndex(String name, DOM dom) {

    /**
     * Create an empty KeyIndex in the DOM case
     *   @param name is the name of the index (the key or ##id)
     *   @param dom is the DOM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void buildKeyIndex(String name, int node, String value) {

    /**
     * Adds a value to a key/id index
     *   @param name is the name of the index (the key or ##id)
     *   @param node is the node handle of the node to insert
     *   @param value is the value that will look up the node in the given index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public KeyIndex createKeyIndex() {

    /**
     * Creates a KeyIndex object of the desired size - don't want to resize!!!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setIndexSize(int size) {

    /**
     * This method is used to pass the largest DOM size to the translet.
     * Needed to make sure that the translet can index the whole DOM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Container for all indexes for xsl:key elements

    /************************************************************************
     * Index(es) for <xsl:key> / key() / id()
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void postInitialization() {

    /**
     * After constructing the translet object, this method must be called to
     * perform any version-specific post-initialization that's required.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    private final void buildIDIndex(DOM document) {

    /**
     * Leverages the Key Class to implement the XSLT id() function.
     * buildIdIndex creates the index (##id) that Key Class uses.
     * The index contains the element node index (int) and Id value (String).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void prepassDocument(DOM document) {

    /**
     * Give the translet an opportunity to perform a prepass on the document
     * to extract any information that it can store in an optimized form.
     *
     * Currently, it only extracts information about attributes of type ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final DecimalFormat getDecimalFormat(String name) {

    /**
     * Retrieves a named DecimalFormat object from the _formatSymbols map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void addDecimalFormat(String name, DecimalFormatSymbols symbols) {

    /**
     * Adds a DecimalFormat object to the _formatSymbols map.
     * The entry is created with the input DecimalFormatSymbols.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Contains decimal number formatting symbols used by FormatNumberCall

    /************************************************************************
     * Decimal number format symbol handling
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void displayMessage(String msg) {

    /**
     * Pass a message to the message handler - used by Message class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void setMessageHandler(MessageHandler handler) {

    /**
     * Set the translet's message handler - must implement MessageHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Holds the translet's message handler - used for <xsl:message>.

    /************************************************************************
     * Message handling - implementation of <xsl:message>
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final Object getParameter(String name) {

    /**
     * Get the value of a parameter from the current frame or
     * <tt>null</tt> if undefined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void clearParameters() {

    /**
     * Clears the parameter stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final Object addParameter(String name, Object value,
        boolean isDefault)

    /**
     * Add a new global or local parameter if not already in the current frame.
     * The 'isDefault' parameter is set to true if the value passed is the
     * default value from the <xsl:parameter> element's select attribute or
     * element body.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final Object addParameter(String name, Object value) {

    /**
     * Add a new global parameter if not already in the current frame.
     * To setParameters of the form {http://foo.bar}xyz
     * This needs to get mapped to an instance variable in the class
     * The mapping  created so that
     * the global variables in the generated class become
     * http$colon$$flash$$flash$foo$dot$bar$colon$xyz
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void popParamFrame() {

    /**
     * Pop the topmost parameter frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void pushParamFrame() {

    /**
     * Push a new parameter frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Parameter's stack: <tt>pbase</tt> and <tt>pframe</tt> are used

    /************************************************************************
     * Parameter handling
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final DOMAdapter makeDOMAdapter(DOM dom)

    /**
     * Wrap the initial input DOM in a dom adapter. This adapter is wrapped in
     * a DOM multiplexer if the document() function is used (handled by compiled
     * code in the translet - see compiler/Stylesheet.compileTransform()).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void printInternalState() {

    /************************************************************************
     * Debugging
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    private String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Document() function, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
public abstract class AbstractTranslet implements Translet {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author G. Todd Miller
 * @author John Howard, JohnH@schemasoft.com
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    protected DOMImplementation _domImplementation = null;

    /************************************************************************
     * DOMImplementation caching for basis library
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setAllowedProtocols(String protocols) {

    /**
     * Set allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public String getAllowedProtocols() {

    /**
     * Return allowed protocols for accessing external stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    protected void transferOutputSettings(SerializationHandler handler) {

    /**
     * Transfer the output settings to the output post-processor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void addCdataElement(String name) {

    /**
     * Add's a name of an element whose text contents should be output as CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void characters(final String string,
                                 SerializationHandler handler)

    /**
     * Used by some compiled code as a shortcut for passing strings to the
     * output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void transform(DOM document, SerializationHandler handler)

    /**
     * Calls transform() with a given output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    /**

    /************************************************************************
     * Native API transformation methods - _NOT_ JAXP/TrAX
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public SerializationHandler openOutputHandler(String filename, boolean append)

    /************************************************************************
     * Multiple output document extension.
     * See compiler/TransletOutput for actual implementation.
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public DOMCache getDOMCache() {

    /**
     * Returns the DOM cache used for this translet. Used by the LoadDocument
     * class (if present) when the document() function is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setDOMCache(DOMCache cache) {

    /**
     * Sets the DOM cache used for additional documents loaded using the
     * document() function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Hold the DOM cache (if any) used with this translet

    /************************************************************************
     * DOM cache handling
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setKeyIndexDom(String name, DOM document) {

    /**
     * This method builds key indexes - it is overridden in the compiled
     * translet in cases where the <xsl:key> element is used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void buildKeys(DOM document, DTMAxisIterator iterator,
                          SerializationHandler handler,
                          int root) throws TransletException {

    /**
     * This method builds key indexes - it is overridden in the compiled
     * translet in cases where the <xsl:key> element is used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public KeyIndex getKeyIndex(String name) {

    /**
     * Returns the index for a given key (or id).
     * The index implements our internal iterator interface
     * @param name the name of the index (the key or ##id)
     * @return a KeyIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    private KeyIndex buildKeyIndexHelper(String name) {

    /**
     * Return KeyIndex for the buildKeyIndex methods. Note the difference from the
     * public getKeyIndex method, this method creates a new Map if keyIndexes does
     * not exist.
     *
     * @param name the name of the index (the key or ##id)
     * @return a KeyIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void buildKeyIndex(String name, DOM dom) {

    /**
     * Create an empty KeyIndex in the DOM case
     *   @param name is the name of the index (the key or ##id)
     *   @param dom is the DOM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void buildKeyIndex(String name, int node, String value) {

    /**
     * Adds a value to a key/id index
     *   @param name is the name of the index (the key or ##id)
     *   @param node is the node handle of the node to insert
     *   @param value is the value that will look up the node in the given index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public KeyIndex createKeyIndex() {

    /**
     * Creates a KeyIndex object of the desired size - don't want to resize!!!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void setIndexSize(int size) {

    /**
     * This method is used to pass the largest DOM size to the translet.
     * Needed to make sure that the translet can index the whole DOM.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Container for all indexes for xsl:key elements

    /************************************************************************
     * Index(es) for <xsl:key> / key() / id()
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void postInitialization() {

    /**
     * After constructing the translet object, this method must be called to
     * perform any version-specific post-initialization that's required.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    private final void buildIDIndex(DOM document) {

    /**
     * Leverages the Key Class to implement the XSLT id() function.
     * buildIdIndex creates the index (##id) that Key Class uses.
     * The index contains the element node index (int) and Id value (String).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void prepassDocument(DOM document) {

    /**
     * Give the translet an opportunity to perform a prepass on the document
     * to extract any information that it can store in an optimized form.
     *
     * Currently, it only extracts information about attributes of type ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final DecimalFormat getDecimalFormat(String name) {

    /**
     * Retrieves a named DecimalFormat object from the _formatSymbols map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void addDecimalFormat(String name, DecimalFormatSymbols symbols) {

    /**
     * Adds a DecimalFormat object to the _formatSymbols map.
     * The entry is created with the input DecimalFormatSymbols.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Contains decimal number formatting symbols used by FormatNumberCall

    /************************************************************************
     * Decimal number format symbol handling
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void displayMessage(String msg) {

    /**
     * Pass a message to the message handler - used by Message class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void setMessageHandler(MessageHandler handler) {

    /**
     * Set the translet's message handler - must implement MessageHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Holds the translet's message handler - used for <xsl:message>.

    /************************************************************************
     * Message handling - implementation of <xsl:message>
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final Object getParameter(String name) {

    /**
     * Get the value of a parameter from the current frame or
     * <tt>null</tt> if undefined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void clearParameters() {

    /**
     * Clears the parameter stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final Object addParameter(String name, Object value,
        boolean isDefault)

    /**
     * Add a new global or local parameter if not already in the current frame.
     * The 'isDefault' parameter is set to true if the value passed is the
     * default value from the <xsl:parameter> element's select attribute or
     * element body.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final Object addParameter(String name, Object value) {

    /**
     * Add a new global parameter if not already in the current frame.
     * To setParameters of the form {http://foo.bar}xyz
     * This needs to get mapped to an instance variable in the class
     * The mapping  created so that
     * the global variables in the generated class become
     * http$colon$$flash$$flash$foo$dot$bar$colon$xyz
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void popParamFrame() {

    /**
     * Pop the topmost parameter frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final void pushParamFrame() {

    /**
     * Push a new parameter frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    // Parameter's stack: <tt>pbase</tt> and <tt>pframe</tt> are used

    /************************************************************************
     * Parameter handling
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public final DOMAdapter makeDOMAdapter(DOM dom)

    /**
     * Wrap the initial input DOM in a dom adapter. This adapter is wrapped in
     * a DOM multiplexer if the document() function is used (handled by compiled
     * code in the translet - see compiler/Stylesheet.compileTransform()).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    public void printInternalState() {

    /************************************************************************
     * Debugging
     ************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
    private String _accessExternalStylesheet = XalanConstants.EXTERNAL_ACCESS_DEFAULT;

    /**
     * protocols allowed for external references set by the stylesheet processing instruction, Document() function, Import and Include element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet.java
public abstract class AbstractTranslet implements Translet {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author G. Todd Miller
 * @author John Howard, JohnH@schemasoft.com
 */
