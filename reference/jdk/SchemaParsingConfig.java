_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void resetNodePool() {

    /** */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final void resetXML11() throws XNIException {

    /**
     * Reset all XML 1.1 components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final void resetXML10() throws XNIException {

    /**
     * Reset all XML 1.0 components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    private void addRecognizedParamsAndSetDefaults(XMLComponent component) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected PropertyState checkProperty(String propertyId)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected void configureXML11Pipeline() {

    /** Configures the XML 1.1 pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected void configurePipeline() {

    /** Configures the XML 1.0 pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void reset() throws XNIException {

    /**
     * Reset all components before parsing.
     *
     * @throws XNIException Thrown if an error occurs during initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void cleanup() {

    /**
     * If the application decides to terminate parsing before the xml document
     * is fully parsed, the application should call this method to free any
     * resource allocated during parsing. For example, close all opened streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public boolean parse(boolean complete) throws XNIException, IOException {

    /**
     * Parses the document in a pull parsing fashion.
     *
     * @param complete True if the pull parser should parse the
     *                 remaining document completely.
     *
     * @return True if there is more document to parse.
     *
     * @exception XNIException Any XNI exception, possibly wrapping
     *                         another exception.
     * @exception IOException  An IO exception from the parser, possibly
     *                         from a byte stream or character stream
     *                         supplied by the parser.
     *
     * @see #setInputSource
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void setProperty(String propertyId, Object value)

    /**
     * setProperty
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public PropertyState getPropertyState(String propertyId)

    /**
     * Returns the value of a property.
     *
     * @param propertyId The property identifier.
     * @return the value of the property
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                   In general, components should
     *                                   only throw this exception if
     *                                   it is <strong>really</strong>
     *                                   a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig(SymbolTable symbolTable,
            XMLGrammarPool grammarPool) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    private boolean f11Initialized = false;

    /** Flag indiciating whether XML11 components have been initialized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected boolean fConfigUpdated = false;

    /**
     * fConfigUpdated is set to true if there has been any change to the configuration settings,
     * i.e a feature or a property was changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLLocator fLocator;

    /** Locator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLInputSource fInputSource;

    /** Input Source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLVersionDetector fVersionDetector;

    /** XML version detector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLGrammarPool fGrammarPool;

    /** Grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLDTDScanner fCurrentDTDScanner;

    /** Current DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLDocumentScanner fCurrentScanner;

    /** Current scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected DTDDVFactory fCurrentDVFactory;

    /** Current Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XML11DTDScannerImpl fXML11DTDScanner = null;

    /** The XML 1.1 DTD scanner. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XML11NSDocumentScannerImpl fXML11NSDocScanner = null;

    /** The XML 1.1 Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected DTDDVFactory fXML11DatatypeFactory = null;

    /** The XML 1.1 Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLDTDScannerImpl fDTDScanner;

    /** The XML 1.0 DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLNSDocumentScannerImpl fNamespaceScanner;

    /** The XML 1.0 Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final DTDDVFactory fDatatypeValidatorFactory;

    /** The XML 1.0 Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    private static final boolean PRINT_EXCEPTION_STACK_TRACE = false;

    /** Set to true and recompile to print exception stack trace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NAMESPACE_BINDER =

    /** Property identifier: namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature identifier: generate synthetic annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String SCHEMA_ELEMENT_DEFAULT =

    /** Feature identifier: send element default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NORMALIZE_DATA =

    /** Feature identifier: expose schema normalized value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NOTIFY_BUILTIN_REFS =

    /** Feature identifier: notify built-in refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String WARN_ON_UNDECLARED_ELEMDEF =

    /** Feature identifier: warn on undeclared element definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    //  protected static final String WARN_ON_DUPLICATE_ENTITYDEF = Constants.XERCES_FEATURE_PREFIX + Constants.WARN_ON_DUPLICATE_ENTITYDEF_FEATURE;

    /** Feature identifier: warn on duplicate entity definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attribute definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
public class SchemaParsingConfig extends BasicParserConfiguration

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: SchemaParsingConfig.java,v 1.8 2010-11-01 04:40:01 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void resetNodePool() {

    /** */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final void resetXML11() throws XNIException {

    /**
     * Reset all XML 1.1 components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final void resetXML10() throws XNIException {

    /**
     * Reset all XML 1.0 components before parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    private void addRecognizedParamsAndSetDefaults(XMLComponent component) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected PropertyState checkProperty(String propertyId)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected void configureXML11Pipeline() {

    /** Configures the XML 1.1 pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected void configurePipeline() {

    /** Configures the XML 1.0 pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void reset() throws XNIException {

    /**
     * Reset all components before parsing.
     *
     * @throws XNIException Thrown if an error occurs during initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void cleanup() {

    /**
     * If the application decides to terminate parsing before the xml document
     * is fully parsed, the application should call this method to free any
     * resource allocated during parsing. For example, close all opened streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public boolean parse(boolean complete) throws XNIException, IOException {

    /**
     * Parses the document in a pull parsing fashion.
     *
     * @param complete True if the pull parser should parse the
     *                 remaining document completely.
     *
     * @return True if there is more document to parse.
     *
     * @exception XNIException Any XNI exception, possibly wrapping
     *                         another exception.
     * @exception IOException  An IO exception from the parser, possibly
     *                         from a byte stream or character stream
     *                         supplied by the parser.
     *
     * @see #setInputSource
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public void setProperty(String propertyId, Object value)

    /**
     * setProperty
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public PropertyState getPropertyState(String propertyId)

    /**
     * Returns the value of a property.
     *
     * @param propertyId The property identifier.
     * @return the value of the property
     *
     * @throws XMLConfigurationException Thrown for configuration error.
     *                                   In general, components should
     *                                   only throw this exception if
     *                                   it is <strong>really</strong>
     *                                   a critical error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig(SymbolTable symbolTable,
            XMLGrammarPool grammarPool) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    public SchemaParsingConfig() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    private boolean f11Initialized = false;

    /** Flag indiciating whether XML11 components have been initialized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected boolean fConfigUpdated = false;

    /**
     * fConfigUpdated is set to true if there has been any change to the configuration settings,
     * i.e a feature or a property was changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLLocator fLocator;

    /** Locator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLInputSource fInputSource;

    /** Input Source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLVersionDetector fVersionDetector;

    /** XML version detector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLGrammarPool fGrammarPool;

    /** Grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLDTDScanner fCurrentDTDScanner;

    /** Current DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XMLDocumentScanner fCurrentScanner;

    /** Current scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected DTDDVFactory fCurrentDVFactory;

    /** Current Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XML11DTDScannerImpl fXML11DTDScanner = null;

    /** The XML 1.1 DTD scanner. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected XML11NSDocumentScannerImpl fXML11NSDocScanner = null;

    /** The XML 1.1 Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected DTDDVFactory fXML11DatatypeFactory = null;

    /** The XML 1.1 Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLDTDScannerImpl fDTDScanner;

    /** The XML 1.0 DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final XMLNSDocumentScannerImpl fNamespaceScanner;

    /** The XML 1.0 Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected final DTDDVFactory fDatatypeValidatorFactory;

    /** The XML 1.0 Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    private static final boolean PRINT_EXCEPTION_STACK_TRACE = false;

    /** Set to true and recompile to print exception stack trace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NAMESPACE_BINDER =

    /** Property identifier: namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature identifier: generate synthetic annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String SCHEMA_ELEMENT_DEFAULT =

    /** Feature identifier: send element default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NORMALIZE_DATA =

    /** Feature identifier: expose schema normalized value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String NOTIFY_BUILTIN_REFS =

    /** Feature identifier: notify built-in refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String WARN_ON_UNDECLARED_ELEMDEF =

    /** Feature identifier: warn on undeclared element definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    //  protected static final String WARN_ON_DUPLICATE_ENTITYDEF = Constants.XERCES_FEATURE_PREFIX + Constants.WARN_ON_DUPLICATE_ENTITYDEF_FEATURE;

    /** Feature identifier: warn on duplicate entity definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attribute definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/SchemaParsingConfig.java
public class SchemaParsingConfig extends BasicParserConfiguration

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: SchemaParsingConfig.java,v 1.8 2010-11-01 04:40:01 joehw Exp $
 */
