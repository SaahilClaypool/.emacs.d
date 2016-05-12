_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected DTDDVFactory createDatatypeValidatorFactory() {

    /** Create a datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLNamespaceBinder createNamespaceBinder() {

    /** Create a namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDValidator createDTDValidator() {

    /** Create a DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDProcessor createDTDProcessor() {

    /** Create a DTD loader . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDScanner createDTDScanner() {

    /** Create a DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDocumentScanner createDocumentScanner() {

    /** Create a document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLErrorReporter createErrorReporter() {

    /** Creates an error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLEntityManager createEntityManager() {

    /** Creates an entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
        protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected void reset() throws XNIException {

    /**
     * Reset all components before parsing.
     *
     * @throws XNIException Thrown if an error occurs during initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public void cleanup() {

    /**
     * If the application decides to terminate parsing before the xml document
     * is fully parsed, the application should call this method to free any
     * resource allocated during parsing. For example, close all opened streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLLocator fLocator;

    /** Locator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLNamespaceBinder fNamespaceBinder;

    /** Namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDValidator fDTDValidator;

    /** DTD Validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDProcessor fDTDProcessor;

    /** DTD Processor . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDScanner fDTDScanner;

    /** DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLInputSource fInputSource;

    /** Input Source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDocumentScanner fScanner;

    /** Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected DTDDVFactory fDatatypeValidatorFactory;

    /** Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLGrammarPool fGrammarPool;

    /** Grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final boolean PRINT_EXCEPTION_STACK_TRACE = false;

    /** Set to true and recompile to print exception stack trace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
     private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

     /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
      protected static final String XML_SECURITY_PROPERTY_MANAGER =

      /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source/ DOM schema-location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language / DOM schema-type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String NAMESPACE_BINDER =

    /** Property identifier: namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DTD_PROCESSOR =

    /** Property identifier: DTD loader. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String NOTIFY_BUILTIN_REFS =

    /** Feature identifier: notify built-in refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String WARN_ON_UNDECLARED_ELEMDEF =

    /** Feature identifier: warn on undeclared element definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String WARN_ON_DUPLICATE_ENTITYDEF =

    /** Feature identifier: warn on duplicate entity definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attribute definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
public class DTDConfiguration

/**
 * This is the DTD-only parser configuration.  It extends the basic
 * configuration with a standard set of parser components appropriate
 * to DTD-centric validation. Since
 * the Xerces2 reference implementation document and DTD scanner
 * implementations are capable of acting as pull parsers, this
 * configuration implements the
 * <code>XMLPullParserConfiguration</code> interface.
 * <p>
 * In addition to the features and properties recognized by the base
 * parser configuration, this class recognizes these additional
 * features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *   <li>http://apache.org/xml/features/validation/warn-on-duplicate-attdef</li>
 *   <li>http://apache.org/xml/features/validation/warn-on-undeclared-elemdef</li>
 *   <li>http://apache.org/xml/features/allow-java-encodings</li>
 *   <li>http://apache.org/xml/features/continue-after-fatal-error</li>
 *   <li>http://apache.org/xml/features/load-external-dtd</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *   <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *   <li>http://apache.org/xml/properties/internal/document-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *   <li>http://apache.org/xml/properties/internal/validator/dtd</li>
 *   <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 *  </ul>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Neil Graham, IBM
 *
 * @version $Id: DTDConfiguration.java,v 1.7 2010-11-01 04:40:09 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected DTDDVFactory createDatatypeValidatorFactory() {

    /** Create a datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLNamespaceBinder createNamespaceBinder() {

    /** Create a namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDValidator createDTDValidator() {

    /** Create a DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDProcessor createDTDProcessor() {

    /** Create a DTD loader . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDScanner createDTDScanner() {

    /** Create a DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDocumentScanner createDocumentScanner() {

    /** Create a document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLErrorReporter createErrorReporter() {

    /** Creates an error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLEntityManager createEntityManager() {

    /** Creates an entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
        protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected void reset() throws XNIException {

    /**
     * Reset all components before parsing.
     *
     * @throws XNIException Thrown if an error occurs during initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public void cleanup() {

    /**
     * If the application decides to terminate parsing before the xml document
     * is fully parsed, the application should call this method to free any
     * resource allocated during parsing. For example, close all opened streams.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration(SymbolTable symbolTable,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    public DTDConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLLocator fLocator;

    /** Locator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLNamespaceBinder fNamespaceBinder;

    /** Namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDValidator fDTDValidator;

    /** DTD Validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDProcessor fDTDProcessor;

    /** DTD Processor . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDTDScanner fDTDScanner;

    /** DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLInputSource fInputSource;

    /** Input Source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLDocumentScanner fScanner;

    /** Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected DTDDVFactory fDatatypeValidatorFactory;

    /** Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected XMLGrammarPool fGrammarPool;

    /** Grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final boolean PRINT_EXCEPTION_STACK_TRACE = false;

    /** Set to true and recompile to print exception stack trace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
     private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

     /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
      protected static final String XML_SECURITY_PROPERTY_MANAGER =

      /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source/ DOM schema-location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String JAXP_SCHEMA_LANGUAGE =

    /** Property identifier: JAXP schema language / DOM schema-type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String NAMESPACE_BINDER =

    /** Property identifier: namespace binder. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: DTD validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DTD_PROCESSOR =

    /** Property identifier: DTD loader. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DTD_SCANNER =

    /** Property identifier: DTD scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String DOCUMENT_SCANNER =

    /** Property identifier document scanner: */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String NOTIFY_BUILTIN_REFS =

    /** Feature identifier: notify built-in refereces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String LOAD_EXTERNAL_DTD =

    /** Feature identifier: load external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String WARN_ON_UNDECLARED_ELEMDEF =

    /** Feature identifier: warn on undeclared element definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String WARN_ON_DUPLICATE_ENTITYDEF =

    /** Feature identifier: warn on duplicate entity definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attribute definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/DTDConfiguration.java
public class DTDConfiguration

/**
 * This is the DTD-only parser configuration.  It extends the basic
 * configuration with a standard set of parser components appropriate
 * to DTD-centric validation. Since
 * the Xerces2 reference implementation document and DTD scanner
 * implementations are capable of acting as pull parsers, this
 * configuration implements the
 * <code>XMLPullParserConfiguration</code> interface.
 * <p>
 * In addition to the features and properties recognized by the base
 * parser configuration, this class recognizes these additional
 * features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *   <li>http://apache.org/xml/features/validation/warn-on-duplicate-attdef</li>
 *   <li>http://apache.org/xml/features/validation/warn-on-undeclared-elemdef</li>
 *   <li>http://apache.org/xml/features/allow-java-encodings</li>
 *   <li>http://apache.org/xml/features/continue-after-fatal-error</li>
 *   <li>http://apache.org/xml/features/load-external-dtd</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *   <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *   <li>http://apache.org/xml/properties/internal/document-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *   <li>http://apache.org/xml/properties/internal/validator/dtd</li>
 *   <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 *  </ul>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Neil Graham, IBM
 *
 * @version $Id: DTDConfiguration.java,v 1.7 2010-11-01 04:40:09 joehw Exp $
 */
