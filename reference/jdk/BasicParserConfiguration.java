_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected FeatureState checkFeature(String featureId)

    /**
     * Check a feature. If feature is know and supported, this method simply
     * returns. Otherwise, the appropriate exception is thrown.
     *
     * @param featureId The unique identifier (URI) of the feature.
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                   In general, components should
     *                                   only throw this exception if
     *                                   it is <strong>really</strong>
     *                                   a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected void reset() throws XNIException {

    /**
     * reset all components before parsing and namespace context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public Locale getLocale() {

    /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setProperty(String propertyId, Object value)

    /**
     * setProperty
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler handler) {

    /**
     * Sets the DTD content model handler.
     *
     * @param handler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public XMLDTDHandler getDTDHandler() {

    /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /**
     * Sets the document handler on the last component in the pipeline
     * to receive information about the document.
     *
     * @param documentHandler   The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public abstract void parse(XMLInputSource inputSource)

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
     * @param inputSource The input source for the top-level of the
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected void addComponent(XMLComponent component) {

    /**
     * Adds a component to the parser configuration. This method will
     * also add all of the component's recognized features and properties
     * to the list of default recognized features and properties.
     *
     * @param component The component to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected BasicParserConfiguration(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected BasicParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected BasicParserConfiguration() {

    /** Default Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDocumentSource fLastComponent;

    /** Last component in the document pipeline */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** The DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDTDHandler fDTDHandler;

    /** The DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDocumentHandler fDocumentHandler;

    /** The document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected ArrayList fComponents;

    /** Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected Locale fLocale;

    /** Locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String XML_STRING =

    /** Property identifier: xml string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String EXTERNAL_PARAMETER_ENTITIES =

    /** Feature identifier: external parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String EXTERNAL_GENERAL_ENTITIES =

    /** Feature identifier: external general entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
public abstract class BasicParserConfiguration

/**
 * A very basic parser configuration. This configuration class can
 * be used as a base class for custom parser configurations. The
 * basic parser configuration creates the symbol table (if not
 * specified at construction time) and manages all of the recognized
 * features and properties.
 * <p>
 * The basic parser configuration does <strong>not</strong> mandate
 * any particular pipeline configuration or the use of specific
 * components except for the symbol table. If even this is too much
 * for a basic parser configuration, the programmer can create a new
 * configuration class that implements the
 * <code>XMLParserConfiguration</code> interface.
 * <p>
 * Subclasses of the basic parser configuration can add their own
 * recognized features and properties by calling the
 * <code>addRecognizedFeature</code> and
 * <code>addRecognizedProperty</code> methods, respectively.
 * <p>
 * The basic parser configuration assumes that the configuration
 * will be made up of various parser components that implement the
 * <code>XMLComponent</code> interface. If subclasses of this
 * configuration create their own components for use in the
 * parser configuration, then each component should be added to
 * the list of components by calling the <code>addComponent</code>
 * method. The basic parser configuration will make sure to call
 * the <code>reset</code> method of each registered component
 * before parsing an instance document.
 * <p>
 * This class recognizes the following features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *   <li>http://xml.org/sax/features/validation</li>
 *   <li>http://xml.org/sax/features/namespaces</li>
 *   <li>http://xml.org/sax/features/external-general-entities</li>
 *   <li>http://xml.org/sax/features/external-parameter-entities</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://xml.org/sax/properties/xml-string</li>
 *   <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *   <li>http://apache.org/xml/properties/internal/error-handler</li>
 *   <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 *  </ul>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: BasicParserConfiguration.java,v 1.6 2010-11-01 04:40:09 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected FeatureState checkFeature(String featureId)

    /**
     * Check a feature. If feature is know and supported, this method simply
     * returns. Otherwise, the appropriate exception is thrown.
     *
     * @param featureId The unique identifier (URI) of the feature.
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                   In general, components should
     *                                   only throw this exception if
     *                                   it is <strong>really</strong>
     *                                   a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected void reset() throws XNIException {

    /**
     * reset all components before parsing and namespace context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public Locale getLocale() {

    /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setProperty(String propertyId, Object value)

    /**
     * setProperty
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler handler) {

    /**
     * Sets the DTD content model handler.
     *
     * @param handler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public XMLDTDHandler getDTDHandler() {

    /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /**
     * Sets the document handler on the last component in the pipeline
     * to receive information about the document.
     *
     * @param documentHandler   The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    public abstract void parse(XMLInputSource inputSource)

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
     * @param inputSource The input source for the top-level of the
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected void addComponent(XMLComponent component) {

    /**
     * Adds a component to the parser configuration. This method will
     * also add all of the component's recognized features and properties
     * to the list of default recognized features and properties.
     *
     * @param component The component to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected BasicParserConfiguration(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected BasicParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected BasicParserConfiguration() {

    /** Default Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDocumentSource fLastComponent;

    /** Last component in the document pipeline */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** The DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDTDHandler fDTDHandler;

    /** The DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected XMLDocumentHandler fDocumentHandler;

    /** The document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected ArrayList fComponents;

    /** Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected Locale fLocale;

    /** Locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String XML_STRING =

    /** Property identifier: xml string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String EXTERNAL_PARAMETER_ENTITIES =

    /** Feature identifier: external parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String EXTERNAL_GENERAL_ENTITIES =

    /** Feature identifier: external general entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/BasicParserConfiguration.java
public abstract class BasicParserConfiguration

/**
 * A very basic parser configuration. This configuration class can
 * be used as a base class for custom parser configurations. The
 * basic parser configuration creates the symbol table (if not
 * specified at construction time) and manages all of the recognized
 * features and properties.
 * <p>
 * The basic parser configuration does <strong>not</strong> mandate
 * any particular pipeline configuration or the use of specific
 * components except for the symbol table. If even this is too much
 * for a basic parser configuration, the programmer can create a new
 * configuration class that implements the
 * <code>XMLParserConfiguration</code> interface.
 * <p>
 * Subclasses of the basic parser configuration can add their own
 * recognized features and properties by calling the
 * <code>addRecognizedFeature</code> and
 * <code>addRecognizedProperty</code> methods, respectively.
 * <p>
 * The basic parser configuration assumes that the configuration
 * will be made up of various parser components that implement the
 * <code>XMLComponent</code> interface. If subclasses of this
 * configuration create their own components for use in the
 * parser configuration, then each component should be added to
 * the list of components by calling the <code>addComponent</code>
 * method. The basic parser configuration will make sure to call
 * the <code>reset</code> method of each registered component
 * before parsing an instance document.
 * <p>
 * This class recognizes the following features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *   <li>http://xml.org/sax/features/validation</li>
 *   <li>http://xml.org/sax/features/namespaces</li>
 *   <li>http://xml.org/sax/features/external-general-entities</li>
 *   <li>http://xml.org/sax/features/external-parameter-entities</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://xml.org/sax/properties/xml-string</li>
 *   <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *   <li>http://apache.org/xml/properties/internal/error-handler</li>
 *   <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 *  </ul>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: BasicParserConfiguration.java,v 1.6 2010-11-01 04:40:09 joehw Exp $
 */
