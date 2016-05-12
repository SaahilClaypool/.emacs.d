_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected PropertyState checkProperty(String propertyId)

    /**
     * Check a property. If the property is known and supported, this method
     * simply returns. Otherwise, the appropriate exception is thrown.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     * @exception com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException If the
     *            requested feature is not known or supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected void reset() throws XNIException {

    /**
     * reset all components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public DOMStringList getParameterNames() {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
        public boolean canSetParameter(String name, Object value) {

    /**
     * DOM Level 3 WD - Experimental.
     * Check if setting a parameter to a specific value is supported.
     *
     * @param name The name of the parameter to check.
     *
     * @param value An object. if null, the returned value is true.
     *
     * @return true if the parameter could be successfully set to the
     * specified value, or false if the parameter is not recognized or
     * the requested value is not supported. This does not change the
     * current value of the parameter itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
        public Object getParameter(String name) throws DOMException {

    /**
     * DOM Level 3 WD - Experimental.
     * getParameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setParameter(String name, Object value) throws DOMException {

    /**
     * DOM Level 3 WD - Experimental.
     * setParameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public Locale getLocale() {

    /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setLocale(Locale locale) throws XNIException {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception XNIException Thrown if the parser does not support the
     *                         specified locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setProperty(String propertyId, Object value)

    /**
     * setProperty
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setFeature(String featureId, boolean state)

    /**
     * Set the state of a feature.
     *
     * Set the state of any feature in a SAX2 parser.  The parser
     * might not recognize the feature, and if it does recognize
     * it, it might not be able to fulfill the request.
     *
     * @param featureId The unique identifier (URI) of the feature.
     * @param state The requested state of the feature (true or false).
     *
     * @exception com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException If the
     *            requested feature is not known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLErrorHandler getErrorHandler() {

    /**
     * Return the current error handler.
     *
     * @return The current error handler, or null if none
     *         has been registered.
     * @see #setErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Allow an application to register an error event handler.
     *
     * <p>If the application does not register an error handler, all
     * error events reported by the SAX parser will be silently
     * ignored; however, normal processing may not continue.  It is
     * highly recommended that all SAX applications implement an
     * error handler to avoid unexpected bugs.</p>
     *
     * <p>Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.</p>
     *
     * @param errorHandler The error handler.
     * @exception java.lang.NullPointerException If the handler
     *            argument is null.
     * @see #getErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLEntityResolver getEntityResolver() {

    /**
     * Return the current entity resolver.
     *
     * @return The current entity resolver, or null if none
     *         has been registered.
     * @see #setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setEntityResolver(XMLEntityResolver resolver) {

    /**
     * Sets the resolver used to resolve external entities. The EntityResolver
     * interface supports resolution of public and system identifiers.
     *
     * @param resolver The new entity resolver. Passing a null value will
     *                 uninstall the currently installed resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler handler) {

    /**
     * Sets the DTD content model handler.
     *
     * @param handler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLDTDHandler getDTDHandler() {

    /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /**
     * Sets the document handler on the last component in the pipeline
     * to receive information about the document.
     *
     * @param documentHandler   The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void parse(XMLInputSource inputSource)

    /**
     * Parse an XML document.
     * <p>
     * The parser can use this method to instruct this configuration
     * to begin parsing an XML document from any valid input source
     * (a character stream, a byte stream, or a URI).
     * <p>
     * Parsers may not invoke this method while a parse is in progress.
     * Once a parse is complete, the parser may then parse another XML
     * document.
     * <p>
     * This method is synchronous: it will not return until parsing
     * has ended.  If a client application wants to terminate
     * parsing early, it should throw an exception.
     *
     * @param source The input source for the top-level of the
     *               XML document.
     *
     * @exception XNIException Any XNI exception, possibly wrapping
     *                         another exception.
     * @exception IOException  An IO exception from the parser, possibly
     *                         from a byte stream or character stream
     *                         supplied by the parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected DOMConfigurationImpl(SymbolTable symbolTable,
                                    XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table
     * and parent settings.
     *
     * @param symbolTable    The symbol table to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected DOMConfigurationImpl(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected DOMConfigurationImpl() {

    /** Default Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected Locale fLocale;

    /** Locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected ArrayList fComponents;

    /** Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected short features = 0;

    /** Normalization features*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

    /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String SCHEMA_DV_FACTORY =

    /** Property identifier: Schema DV Factory */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source/ DOM schema-location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language / DOM schema-type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String GRAMMAR_POOL =

    /** Property id: Grammar pool*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String XML_STRING =

    /** Property identifier: xml string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String SEND_PSVI =

    /** sending psvi in the pipeline */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String XERCES_NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String XERCES_VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
public class DOMConfigurationImpl extends ParserConfigurationSettings

/**
 * Xerces implementation of DOMConfiguration that maintains a table of recognized parameters.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems.
 * @version $Id: DOMConfigurationImpl.java,v 1.9 2010-11-01 04:39:37 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected PropertyState checkProperty(String propertyId)

    /**
     * Check a property. If the property is known and supported, this method
     * simply returns. Otherwise, the appropriate exception is thrown.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     * @exception com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException If the
     *            requested feature is not known or supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected void reset() throws XNIException {

    /**
     * reset all components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public DOMStringList getParameterNames() {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
        public boolean canSetParameter(String name, Object value) {

    /**
     * DOM Level 3 WD - Experimental.
     * Check if setting a parameter to a specific value is supported.
     *
     * @param name The name of the parameter to check.
     *
     * @param value An object. if null, the returned value is true.
     *
     * @return true if the parameter could be successfully set to the
     * specified value, or false if the parameter is not recognized or
     * the requested value is not supported. This does not change the
     * current value of the parameter itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
        public Object getParameter(String name) throws DOMException {

    /**
     * DOM Level 3 WD - Experimental.
     * getParameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setParameter(String name, Object value) throws DOMException {

    /**
     * DOM Level 3 WD - Experimental.
     * setParameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public Locale getLocale() {

    /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setLocale(Locale locale) throws XNIException {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception XNIException Thrown if the parser does not support the
     *                         specified locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setProperty(String propertyId, Object value)

    /**
     * setProperty
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setFeature(String featureId, boolean state)

    /**
     * Set the state of a feature.
     *
     * Set the state of any feature in a SAX2 parser.  The parser
     * might not recognize the feature, and if it does recognize
     * it, it might not be able to fulfill the request.
     *
     * @param featureId The unique identifier (URI) of the feature.
     * @param state The requested state of the feature (true or false).
     *
     * @exception com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException If the
     *            requested feature is not known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLErrorHandler getErrorHandler() {

    /**
     * Return the current error handler.
     *
     * @return The current error handler, or null if none
     *         has been registered.
     * @see #setErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Allow an application to register an error event handler.
     *
     * <p>If the application does not register an error handler, all
     * error events reported by the SAX parser will be silently
     * ignored; however, normal processing may not continue.  It is
     * highly recommended that all SAX applications implement an
     * error handler to avoid unexpected bugs.</p>
     *
     * <p>Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.</p>
     *
     * @param errorHandler The error handler.
     * @exception java.lang.NullPointerException If the handler
     *            argument is null.
     * @see #getErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLEntityResolver getEntityResolver() {

    /**
     * Return the current entity resolver.
     *
     * @return The current entity resolver, or null if none
     *         has been registered.
     * @see #setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setEntityResolver(XMLEntityResolver resolver) {

    /**
     * Sets the resolver used to resolve external entities. The EntityResolver
     * interface supports resolution of public and system identifiers.
     *
     * @param resolver The new entity resolver. Passing a null value will
     *                 uninstall the currently installed resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler handler) {

    /**
     * Sets the DTD content model handler.
     *
     * @param handler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLDTDHandler getDTDHandler() {

    /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /**
     * Sets the document handler on the last component in the pipeline
     * to receive information about the document.
     *
     * @param documentHandler   The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    public void parse(XMLInputSource inputSource)

    /**
     * Parse an XML document.
     * <p>
     * The parser can use this method to instruct this configuration
     * to begin parsing an XML document from any valid input source
     * (a character stream, a byte stream, or a URI).
     * <p>
     * Parsers may not invoke this method while a parse is in progress.
     * Once a parse is complete, the parser may then parse another XML
     * document.
     * <p>
     * This method is synchronous: it will not return until parsing
     * has ended.  If a client application wants to terminate
     * parsing early, it should throw an exception.
     *
     * @param source The input source for the top-level of the
     *               XML document.
     *
     * @exception XNIException Any XNI exception, possibly wrapping
     *                         another exception.
     * @exception IOException  An IO exception from the parser, possibly
     *                         from a byte stream or character stream
     *                         supplied by the parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected DOMConfigurationImpl(SymbolTable symbolTable,
                                    XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table
     * and parent settings.
     *
     * @param symbolTable    The symbol table to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected DOMConfigurationImpl(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected DOMConfigurationImpl() {

    /** Default Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected Locale fLocale;

    /** Locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected ArrayList fComponents;

    /** Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected short features = 0;

    /** Normalization features*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

    /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String SCHEMA_DV_FACTORY =

    /** Property identifier: Schema DV Factory */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source/ DOM schema-location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language / DOM schema-type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String GRAMMAR_POOL =

    /** Property id: Grammar pool*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String XML_STRING =

    /** Property identifier: xml string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String SEND_PSVI =

    /** sending psvi in the pipeline */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String XERCES_NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
    protected static final String XERCES_VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMConfigurationImpl.java
public class DOMConfigurationImpl extends ParserConfigurationSettings

/**
 * Xerces implementation of DOMConfiguration that maintains a table of recognized parameters.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems.
 * @version $Id: DOMConfigurationImpl.java,v 1.9 2010-11-01 04:39:37 joehw Exp $
 */
