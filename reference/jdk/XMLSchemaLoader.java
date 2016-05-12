_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
        // check whether there is a Reader

        /**
         * An LSParser looks at inputs specified in LSInput in
         * the following order: characterStream, byteStream,
         * stringData, systemId, publicId. For consistency
         * have the same behaviour for XSLoader.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private void processJAXPSchemaSource(
            Map<String, LocationArray> locationPairs) throws IOException {

    /**
     * Translate the various JAXP SchemaSource property types to XNI
     * XMLInputSource.  Valid types are: String, org.xml.sax.InputSource,
     * InputStream, File, or Object[] of any of previous types.
     * REVISIT:  the JAXP 1.2 spec is less than clear as to whether this property
     * should be available to imported schemas.  I have assumed
     * that it should.  - NG
     * Note: all JAXP schema files will be checked for full-schema validity if the feature was set up
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static XMLInputSource resolveDocument(XSDDescription desc,
            Map<String, LocationArray> locationPairs,
            XMLEntityResolver entityResolver) throws IOException {

    /** This method tries to resolve location of the given schema.
     * The loader stores the namespace/location pairs in a map (use "" as the
     * namespace of absent namespace). When resolving an entity, loader first tries
     * to find in the map whether there is a value for that namespace,
     * if so, pass that location value to the user-defined entity resolver.
     *
     * @param desc
     * @param locationPairs
     * @param entityResolver
     * @return
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    SchemaGrammar loadSchema(XSDDescription desc, XMLInputSource source,
            Map<String, LocationArray> locationPairs) throws IOException, XNIException {

    /**
     * This method is called either from XMLGrammarLoader.loadGrammar or from XMLSchemaValidator.
     * Note: in either case, the EntityManager (or EntityResolvers) are not going to be invoked
     * to resolve the location of the schema in XSDDescription
     * @param desc
     * @param source
     * @param locationPairs
     * @return An XML Schema grammar
     * @throws IOException
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public Grammar loadGrammar(XMLInputSource source)

    /**
     * Returns a Grammar object by parsing the contents of the
     * entity pointed to by source.
     *
     * @param source        the location of the entity which forms
     *                          the starting point of the grammar to be constructed.
     * @throws IOException      When a problem is encountered reading the entity
     *          XNIException    When a condition arises (such as a FatalError) that requires parsing
     *                              of the entity be terminated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void loadGrammar(XMLInputSource source[])

    /**
     * Returns a Grammar object by parsing the contents of the
     * entities pointed to by sources.
     *
     * @param source[]  the locations of the entity which forms
     *                      the staring point of the grammars to be constructed
     * @throws IOException  when a problem is encounted reading the entity
     * @throws XNIException when a condition arises (such as a FatalError) that requires parsing
     *                          of the entity be terminated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public XMLEntityResolver getEntityResolver() {

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setEntityResolver(XMLEntityResolver entityResolver) {

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public XMLErrorHandler getErrorHandler() {

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public Locale getLocale() {

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setLocale(Locale locale) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setProperty(String propertyId,
            Object state) throws XMLConfigurationException {

    /**
     * Sets the state of a property.
     *
     * @param propertyId The property identifier.
     * @param state     The state of the property.
     *
     * @throws XMLConfigurationException Thrown when a property is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public Object getProperty(String propertyId)

    /**
     * Returns the state of a property.
     *
     * @param propertyId The property identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no properties
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setFeature(String featureId,
            boolean state) throws XMLConfigurationException {

    /**
     * Sets the state of a feature.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws XMLConfigurationException Thrown when a feature is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public boolean getFeature(String featureId)

    /**
     * Returns the state of a feature.
     *
     * @param featureId The feature identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no features
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    XMLSchemaLoader(XMLErrorReporter errorReporter,
            XSGrammarBucket grammarBucket,
            SubstitutionGroupHandler sHandler, CMBuilder builder) {

    /**
     * This constractor is used by the XMLSchemaValidator. Additional properties, i.e. XMLEntityManager,
     * will be passed during reset(XMLComponentManager).
     * @param errorReporter
     * @param grammarBucket
     * @param sHandler
     * @param builder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private DOMEntityResolverWrapper fResourceResolver = null;

    /** DOM L3 resource resolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private DOMErrorHandlerWrapper fErrorHandler = null;

    /** DOM L3 error handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ACCESS_EXTERNAL_SCHEMA = XMLConstants.ACCESS_EXTERNAL_SCHEMA;

    /** Property identifier: access to external schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ACCESS_EXTERNAL_DTD = XMLConstants.ACCESS_EXTERNAL_DTD;

    /** Property identifier: access to external dtd */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_NONS_LOCATION =

    /** Property identifier: no namespace schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_LOCATION =

    /** Property identifier: schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_DV_FACTORY =

    /** Property identifier: Schema DV Factory */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String HONOUR_ALL_SCHEMALOCATIONS =

    /** Feature identifier: honour all schemaLocations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature: generate synthetic annotations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String DISALLOW_DOCTYPE =

    /** Feature: disallow doctype*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String VALIDATE_ANNOTATIONS =

    /** Feature identifier: validate annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier: standard uri conformant feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow java encodings to be recognized when parsing schema docs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_FULL_CHECKING =

    /** Feature identifier: schema full checking*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
public class XMLSchemaLoader implements XMLGrammarLoader, XMLComponent,

/**
 * This class implements xni.grammars.XMLGrammarLoader.
 * It also serves as implementation of xs.XSLoader interface and DOMConfiguration interface.
 *
 * This class is designed to interact either with a proxy for a user application
 * which wants to preparse schemas, or with our own Schema validator.
 * It is hoped that none of these "external" classes will therefore need to communicate directly
 * with XSDHandler in future.
 * <p>This class only knows how to make XSDHandler do its thing.
 * The caller must ensure that all its properties (schemaLocation, JAXPSchemaSource
 * etc.) have been properly set.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @version $Id: XMLSchemaLoader.java,v 1.10 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
        // check whether there is a Reader

        /**
         * An LSParser looks at inputs specified in LSInput in
         * the following order: characterStream, byteStream,
         * stringData, systemId, publicId. For consistency
         * have the same behaviour for XSLoader.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private void processJAXPSchemaSource(
            Map<String, LocationArray> locationPairs) throws IOException {

    /**
     * Translate the various JAXP SchemaSource property types to XNI
     * XMLInputSource.  Valid types are: String, org.xml.sax.InputSource,
     * InputStream, File, or Object[] of any of previous types.
     * REVISIT:  the JAXP 1.2 spec is less than clear as to whether this property
     * should be available to imported schemas.  I have assumed
     * that it should.  - NG
     * Note: all JAXP schema files will be checked for full-schema validity if the feature was set up
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static XMLInputSource resolveDocument(XSDDescription desc,
            Map<String, LocationArray> locationPairs,
            XMLEntityResolver entityResolver) throws IOException {

    /** This method tries to resolve location of the given schema.
     * The loader stores the namespace/location pairs in a map (use "" as the
     * namespace of absent namespace). When resolving an entity, loader first tries
     * to find in the map whether there is a value for that namespace,
     * if so, pass that location value to the user-defined entity resolver.
     *
     * @param desc
     * @param locationPairs
     * @param entityResolver
     * @return
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    SchemaGrammar loadSchema(XSDDescription desc, XMLInputSource source,
            Map<String, LocationArray> locationPairs) throws IOException, XNIException {

    /**
     * This method is called either from XMLGrammarLoader.loadGrammar or from XMLSchemaValidator.
     * Note: in either case, the EntityManager (or EntityResolvers) are not going to be invoked
     * to resolve the location of the schema in XSDDescription
     * @param desc
     * @param source
     * @param locationPairs
     * @return An XML Schema grammar
     * @throws IOException
     * @throws XNIException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public Grammar loadGrammar(XMLInputSource source)

    /**
     * Returns a Grammar object by parsing the contents of the
     * entity pointed to by source.
     *
     * @param source        the location of the entity which forms
     *                          the starting point of the grammar to be constructed.
     * @throws IOException      When a problem is encountered reading the entity
     *          XNIException    When a condition arises (such as a FatalError) that requires parsing
     *                              of the entity be terminated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void loadGrammar(XMLInputSource source[])

    /**
     * Returns a Grammar object by parsing the contents of the
     * entities pointed to by sources.
     *
     * @param source[]  the locations of the entity which forms
     *                      the staring point of the grammars to be constructed
     * @throws IOException  when a problem is encounted reading the entity
     * @throws XNIException when a condition arises (such as a FatalError) that requires parsing
     *                          of the entity be terminated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public XMLEntityResolver getEntityResolver() {

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setEntityResolver(XMLEntityResolver entityResolver) {

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public XMLErrorHandler getErrorHandler() {

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public Locale getLocale() {

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setLocale(Locale locale) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setProperty(String propertyId,
            Object state) throws XMLConfigurationException {

    /**
     * Sets the state of a property.
     *
     * @param propertyId The property identifier.
     * @param state     The state of the property.
     *
     * @throws XMLConfigurationException Thrown when a property is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public Object getProperty(String propertyId)

    /**
     * Returns the state of a property.
     *
     * @param propertyId The property identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no properties
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public void setFeature(String featureId,
            boolean state) throws XMLConfigurationException {

    /**
     * Sets the state of a feature.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws XMLConfigurationException Thrown when a feature is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public boolean getFeature(String featureId)

    /**
     * Returns the state of a feature.
     *
     * @param featureId The feature identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no features
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    XMLSchemaLoader(XMLErrorReporter errorReporter,
            XSGrammarBucket grammarBucket,
            SubstitutionGroupHandler sHandler, CMBuilder builder) {

    /**
     * This constractor is used by the XMLSchemaValidator. Additional properties, i.e. XMLEntityManager,
     * will be passed during reset(XMLComponentManager).
     * @param errorReporter
     * @param grammarBucket
     * @param sHandler
     * @param builder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private DOMEntityResolverWrapper fResourceResolver = null;

    /** DOM L3 resource resolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private DOMErrorHandlerWrapper fErrorHandler = null;

    /** DOM L3 error handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ACCESS_EXTERNAL_SCHEMA = XMLConstants.ACCESS_EXTERNAL_SCHEMA;

    /** Property identifier: access to external schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ACCESS_EXTERNAL_DTD = XMLConstants.ACCESS_EXTERNAL_DTD;

    /** Property identifier: access to external dtd */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_NONS_LOCATION =

    /** Property identifier: no namespace schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_LOCATION =

    /** Property identifier: schema location. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    public static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_DV_FACTORY =

    /** Property identifier: Schema DV Factory */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String HONOUR_ALL_SCHEMALOCATIONS =

    /** Feature identifier: honour all schemaLocations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature: generate synthetic annotations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String DISALLOW_DOCTYPE =

    /** Feature: disallow doctype*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String VALIDATE_ANNOTATIONS =

    /** Feature identifier: validate annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier: standard uri conformant feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow java encodings to be recognized when parsing schema docs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
    protected static final String SCHEMA_FULL_CHECKING =

    /** Feature identifier: schema full checking*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XMLSchemaLoader.java
public class XMLSchemaLoader implements XMLGrammarLoader, XMLComponent,

/**
 * This class implements xni.grammars.XMLGrammarLoader.
 * It also serves as implementation of xs.XSLoader interface and DOMConfiguration interface.
 *
 * This class is designed to interact either with a proxy for a user application
 * which wants to preparse schemas, or with our own Schema validator.
 * It is hoped that none of these "external" classes will therefore need to communicate directly
 * with XSDHandler in future.
 * <p>This class only knows how to make XSDHandler do its thing.
 * The caller must ensure that all its properties (schemaLocation, JAXPSchemaSource
 * etc.) have been properly set.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @version $Id: XMLSchemaLoader.java,v 1.10 2010-11-01 04:39:55 joehw Exp $
 */
