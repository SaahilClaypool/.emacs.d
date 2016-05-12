_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void addRecognizedParamsAndSetDefaults(XMLComponent component) {

    /**
     * Adds all of the component's recognized features and properties
     * to the list of default recognized features and properties, and
     * sets default values on the configuration for features and
     * properties which were previously absent from the configuration.
     *
     * @param component The component whose recognized features
     * and properties will be added to the configuration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void addXML11Component(XMLComponent component) {

    /**
     * Adds an XML 1.1 component to the parser configuration. This method will
     * also add all of the component's recognized features and properties
     * to the list of default recognized features and properties.
     *
     * @param component The component to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void addCommonComponent(XMLComponent component) {

    /**
     * Adds common component to the parser configuration. This method will
     * also add all of the component's recognized features and properties
     * to the list of default recognized features and properties.
     *
     * @param component The component to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected PropertyState checkProperty(String propertyId) throws XMLConfigurationException {

    /**
     * Check a property. If the property is know and supported, this method
     * simply returns. Otherwise, the appropriate exception is thrown.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                   In general, components should
     *                                   only throw this exception if
     *                                   it is <strong>really</strong>
     *                                   a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected FeatureState checkFeature(String featureId) throws XMLConfigurationException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void configureXML11Pipeline() {

    /**
     *  Configures the XML 1.1 pipeline.
     *  Note: this method also resets the new XML11 components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected void resetXML11() throws XNIException {

        /**
         * reset all components before parsing and namespace context
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected void resetCommon() throws XNIException {

        /**
         * reset all common components before parsing
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected void reset() throws XNIException {

        /**
         * reset all XML 1.0 components before parsing and namespace context
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public Locale getLocale() {

        /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setProperty(String propertyId, Object value)

        /**
         * setProperty
         *
         * @param propertyId
         * @param value
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public FeatureState getFeatureState(String featureId)

        /**
         * Returns the state of a feature.
         *
         * @param featureId The feature identifier.
                 * @return true if the feature is supported
         *
         * @throws XMLConfigurationException Thrown for configuration error.
         *                                   In general, components should
         *                                   only throw this exception if
         *                                   it is <strong>really</strong>
         *                                   a critical error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public void parse(XMLInputSource source) throws XNIException, IOException {

    /**
     * Parses the specified input source.
     *
     * @param source The input source.
     *
     * @exception XNIException Throws exception on XNI error.
     * @exception java.io.IOException Throws exception on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public void cleanup() {

    /**
     * If the application decides to terminate parsing before the xml document
     * is fully parsed, the application should call this method to free any
     * resource allocated during parsing. For example, close all opened streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public XMLDTDContentModelHandler getDTDContentModelHandler() {

        /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setDTDContentModelHandler(XMLDTDContentModelHandler handler) {

        /**
         * Sets the DTD content model handler.
         *
         * @param handler The DTD content model handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public XMLDTDHandler getDTDHandler() {

        /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setDTDHandler(XMLDTDHandler dtdHandler) {

        /**
         * Sets the DTD handler.
         *
         * @param dtdHandler The DTD handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public XMLDocumentHandler getDocumentHandler() {

        /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setDocumentHandler(XMLDocumentHandler documentHandler) {

        /**
         * Sets the document handler on the last component in the pipeline
         * to receive information about the document.
         *
         * @param documentHandler   The document handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public void setInputSource(XMLInputSource inputSource)

    /**
     * Sets the input source for the document to parse.
     *
     * @param inputSource The document's input source.
     *
     * @exception XMLConfigurationException Thrown if there is a
     *                        configuration error when initializing the
     *                        parser.
     * @exception IOException Thrown on I/O error.
     *
     * @see #parse(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration(
        SymbolTable symbolTable,
        XMLGrammarPool grammarPool,
        XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration(SymbolTable symbolTable, XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    private boolean f11Initialized = false;

    /** Flag indiciating whether XML11 components have been initialized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDScanner fCurrentDTDScanner;

    /** Current DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected DTDDVFactory fCurrentDVFactory;

    /** Current Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentScanner fCurrentScanner;

    /** Current scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLGrammarPool fGrammarPool;

    /** Grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DTDProcessor fXML11DTDProcessor = null;

    /** The XML 1.1 DTD processor. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DTDScannerImpl fXML11DTDScanner = null;

    /** The XML 1.1 DTD scanner. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DTDValidator fXML11DTDValidator = null;

    /** The XML 1.1 DTD validator that does not do namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11NSDTDValidator fXML11NSDTDValidator = null;

    /** The XML 1.1 DTD validator that does namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DocumentScannerImpl fXML11DocScanner = null;

    /** The XML 1.1 document scanner that does not do namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11NSDocumentScannerImpl fXML11NSDocScanner = null;

    /** The XML 1.1 document scanner that does namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected DTDDVFactory fXML11DatatypeFactory = null;

    /** The XML 1.1 datatype factory. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDProcessor fDTDProcessor;

    /** The XML 1.0 DTD Processor . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDScanner fDTDScanner;

    /** The XML 1.0 DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDValidator fNonNSDTDValidator;

    /** The XML 1.0 DTD Validator that does not bind namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDValidator fDTDValidator;

    /** The XML 1.0 DTD Validator: binds namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentScannerImpl fNonNSScanner;

    /** The XML 1.0 Non-namespace implementation of scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLNSDocumentScannerImpl fNamespaceScanner;

    /** The XML 1.0 Document scanner that does namespace binding. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected DTDDVFactory fDatatypeValidatorFactory;

    /** The XML 1.0 Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected boolean fConfigUpdated = false;

    /**
     * fConfigUpdated is set to true if there has been any change to the configuration settings,
     * i.e a feature or a property was changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentSource fLastComponent;

    /** Last component in the document pipeline */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** The DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDHandler fDTDHandler;

    /** The DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentHandler fDocumentHandler;

    /** The document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected ArrayList fCommonComponents = null;

    /** Common components: XMLEntityManager, XMLErrorReporter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected ArrayList fXML11Components = null;

    /** XML 1.1. Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected ArrayList fComponents;

    /** XML 1.0 Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final boolean PRINT_EXCEPTION_STACK_TRACE = false;

    /** Set to true and recompile to print exception stack trace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source/ DOM schema-location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language / DOM schema-type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String NAMESPACE_BINDER =

    /** Property identifier: namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DTD_PROCESSOR =

    /** Property identifier: DTD loader. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String ENTITY_RESOLVER =

        /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String ERROR_HANDLER =

        /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String SYMBOL_TABLE =

        /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String XML_STRING =

        /** Property identifier: xml string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String EXTERNAL_PARAMETER_ENTITIES =

    /** Feature identifier: external parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String EXTERNAL_GENERAL_ENTITIES =

    /** Feature identifier: external general entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
public class XML11DTDConfiguration extends ParserConfigurationSettings

/**
 * This class is the DTD-only parser configuration
 * used to parse XML 1.0 and XML 1.1 documents.
 *
 * <p>
 * This class recognizes the following features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *   <li>http://xml.org/sax/features/validation</li>
 *   <li>http://xml.org/sax/features/namespaces</li>
 *   <li>http://xml.org/sax/features/external-general-entities</li>
 *   <li>http://xml.org/sax/features/external-parameter-entities</li>
 *   <li>http://apache.org/xml/features/continue-after-fatal-error</li>
 *   <li>http://apache.org/xml/features/load-external-dtd</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://xml.org/sax/properties/xml-string</li>
 *   <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *   <li>http://apache.org/xml/properties/internal/error-handler</li>
 *   <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 *   <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *   <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *   <li>http://apache.org/xml/properties/internal/document-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *   <li>http://apache.org/xml/properties/internal/validator/dtd</li>
 *   <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 *  </ul>
 * </ul>
 * @author Elena Litani, IBM
 * @author Neil Graham, IBM
 * @author Michael Glavassevich, IBM
 * @author John Kim, IBM
 *
 * @version $Id: XML11DTDConfiguration.java,v 1.5 2010-11-01 04:40:10 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void addRecognizedParamsAndSetDefaults(XMLComponent component) {

    /**
     * Adds all of the component's recognized features and properties
     * to the list of default recognized features and properties, and
     * sets default values on the configuration for features and
     * properties which were previously absent from the configuration.
     *
     * @param component The component whose recognized features
     * and properties will be added to the configuration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void addXML11Component(XMLComponent component) {

    /**
     * Adds an XML 1.1 component to the parser configuration. This method will
     * also add all of the component's recognized features and properties
     * to the list of default recognized features and properties.
     *
     * @param component The component to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void addCommonComponent(XMLComponent component) {

    /**
     * Adds common component to the parser configuration. This method will
     * also add all of the component's recognized features and properties
     * to the list of default recognized features and properties.
     *
     * @param component The component to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected PropertyState checkProperty(String propertyId) throws XMLConfigurationException {

    /**
     * Check a property. If the property is know and supported, this method
     * simply returns. Otherwise, the appropriate exception is thrown.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                   In general, components should
     *                                   only throw this exception if
     *                                   it is <strong>really</strong>
     *                                   a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected FeatureState checkFeature(String featureId) throws XMLConfigurationException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected void configureXML11Pipeline() {

    /**
     *  Configures the XML 1.1 pipeline.
     *  Note: this method also resets the new XML11 components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected void resetXML11() throws XNIException {

        /**
         * reset all components before parsing and namespace context
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected void resetCommon() throws XNIException {

        /**
         * reset all common components before parsing
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected void reset() throws XNIException {

        /**
         * reset all XML 1.0 components before parsing and namespace context
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public Locale getLocale() {

        /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setProperty(String propertyId, Object value)

        /**
         * setProperty
         *
         * @param propertyId
         * @param value
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public FeatureState getFeatureState(String featureId)

        /**
         * Returns the state of a feature.
         *
         * @param featureId The feature identifier.
                 * @return true if the feature is supported
         *
         * @throws XMLConfigurationException Thrown for configuration error.
         *                                   In general, components should
         *                                   only throw this exception if
         *                                   it is <strong>really</strong>
         *                                   a critical error.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public void parse(XMLInputSource source) throws XNIException, IOException {

    /**
     * Parses the specified input source.
     *
     * @param source The input source.
     *
     * @exception XNIException Throws exception on XNI error.
     * @exception java.io.IOException Throws exception on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public void cleanup() {

    /**
     * If the application decides to terminate parsing before the xml document
     * is fully parsed, the application should call this method to free any
     * resource allocated during parsing. For example, close all opened streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public XMLDTDContentModelHandler getDTDContentModelHandler() {

        /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setDTDContentModelHandler(XMLDTDContentModelHandler handler) {

        /**
         * Sets the DTD content model handler.
         *
         * @param handler The DTD content model handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public XMLDTDHandler getDTDHandler() {

        /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setDTDHandler(XMLDTDHandler dtdHandler) {

        /**
         * Sets the DTD handler.
         *
         * @param dtdHandler The DTD handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public XMLDocumentHandler getDocumentHandler() {

        /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        public void setDocumentHandler(XMLDocumentHandler documentHandler) {

        /**
         * Sets the document handler on the last component in the pipeline
         * to receive information about the document.
         *
         * @param documentHandler   The document handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public void setInputSource(XMLInputSource inputSource)

    /**
     * Sets the input source for the document to parse.
     *
     * @param inputSource The document's input source.
     *
     * @exception XMLConfigurationException Thrown if there is a
     *                        configuration error when initializing the
     *                        parser.
     * @exception IOException Thrown on I/O error.
     *
     * @see #parse(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration(
        SymbolTable symbolTable,
        XMLGrammarPool grammarPool,
        XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration(SymbolTable symbolTable, XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    public XML11DTDConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    private boolean f11Initialized = false;

    /** Flag indiciating whether XML11 components have been initialized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDScanner fCurrentDTDScanner;

    /** Current DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected DTDDVFactory fCurrentDVFactory;

    /** Current Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentScanner fCurrentScanner;

    /** Current scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLGrammarPool fGrammarPool;

    /** Grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DTDProcessor fXML11DTDProcessor = null;

    /** The XML 1.1 DTD processor. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DTDScannerImpl fXML11DTDScanner = null;

    /** The XML 1.1 DTD scanner. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DTDValidator fXML11DTDValidator = null;

    /** The XML 1.1 DTD validator that does not do namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11NSDTDValidator fXML11NSDTDValidator = null;

    /** The XML 1.1 DTD validator that does namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11DocumentScannerImpl fXML11DocScanner = null;

    /** The XML 1.1 document scanner that does not do namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XML11NSDocumentScannerImpl fXML11NSDocScanner = null;

    /** The XML 1.1 document scanner that does namespace binding. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected DTDDVFactory fXML11DatatypeFactory = null;

    /** The XML 1.1 datatype factory. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDProcessor fDTDProcessor;

    /** The XML 1.0 DTD Processor . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDScanner fDTDScanner;

    /** The XML 1.0 DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDValidator fNonNSDTDValidator;

    /** The XML 1.0 DTD Validator that does not bind namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDValidator fDTDValidator;

    /** The XML 1.0 DTD Validator: binds namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentScannerImpl fNonNSScanner;

    /** The XML 1.0 Non-namespace implementation of scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLNSDocumentScannerImpl fNamespaceScanner;

    /** The XML 1.0 Document scanner that does namespace binding. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected DTDDVFactory fDatatypeValidatorFactory;

    /** The XML 1.0 Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected boolean fConfigUpdated = false;

    /**
     * fConfigUpdated is set to true if there has been any change to the configuration settings,
     * i.e a feature or a property was changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentSource fLastComponent;

    /** Last component in the document pipeline */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** The DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDTDHandler fDTDHandler;

    /** The DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected XMLDocumentHandler fDocumentHandler;

    /** The document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected ArrayList fCommonComponents = null;

    /** Common components: XMLEntityManager, XMLErrorReporter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected ArrayList fXML11Components = null;

    /** XML 1.1. Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected ArrayList fComponents;

    /** XML 1.0 Components. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final boolean PRINT_EXCEPTION_STACK_TRACE = false;

    /** Set to true and recompile to print exception stack trace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source/ DOM schema-location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language / DOM schema-type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String NAMESPACE_BINDER =

    /** Property identifier: namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DTD_PROCESSOR =

    /** Property identifier: DTD loader. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String ENTITY_RESOLVER =

        /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String ERROR_HANDLER =

        /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String SYMBOL_TABLE =

        /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
        protected static final String XML_STRING =

        /** Property identifier: xml string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String EXTERNAL_PARAMETER_ENTITIES =

    /** Feature identifier: external parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String EXTERNAL_GENERAL_ENTITIES =

    /** Feature identifier: external general entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XML11DTDConfiguration.java
public class XML11DTDConfiguration extends ParserConfigurationSettings

/**
 * This class is the DTD-only parser configuration
 * used to parse XML 1.0 and XML 1.1 documents.
 *
 * <p>
 * This class recognizes the following features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *   <li>http://xml.org/sax/features/validation</li>
 *   <li>http://xml.org/sax/features/namespaces</li>
 *   <li>http://xml.org/sax/features/external-general-entities</li>
 *   <li>http://xml.org/sax/features/external-parameter-entities</li>
 *   <li>http://apache.org/xml/features/continue-after-fatal-error</li>
 *   <li>http://apache.org/xml/features/load-external-dtd</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://xml.org/sax/properties/xml-string</li>
 *   <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *   <li>http://apache.org/xml/properties/internal/error-handler</li>
 *   <li>http://apache.org/xml/properties/internal/entity-resolver</li>
 *   <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *   <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *   <li>http://apache.org/xml/properties/internal/document-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *   <li>http://apache.org/xml/properties/internal/validator/dtd</li>
 *   <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 *  </ul>
 * </ul>
 * @author Elena Litani, IBM
 * @author Neil Graham, IBM
 * @author Michael Glavassevich, IBM
 * @author John Kim, IBM
 *
 * @version $Id: XML11DTDConfiguration.java,v 1.5 2010-11-01 04:40:10 joehw Exp $
 */
