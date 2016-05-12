_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private void setPropertyDefaults(final XMLComponent component, final String [] recognizedProperties) {

    /** Sets property defaults for the given component on this configuration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private void setFeatureDefaults(final XMLComponent component,
            final String [] recognizedFeatures, XSGrammarPoolContainer grammarContainer) {

    /** Sets feature defaults for the given component on this configuration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    void restoreInitialState() {

    /** Cleans out configuration, restoring it to its initial state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void reset() throws XNIException {

    /** Calls reset on each of the components owned by this component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void addRecognizedParamsAndSetDefaults(XMLComponent component, XSGrammarPoolContainer grammarContainer) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void setProperty(String propertyId, Object value) throws XMLConfigurationException {

    /**
     * Sets the state of a property.
     *
     * @param propertyId The unique identifier (URI) of the property.
     * @param value The requested state of the property.
     *
     * @exception XMLConfigurationException If the requested property is not known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void setFeature(String featureId, boolean value) throws XMLConfigurationException {

    /**
     * Set the state of a feature.
     *
     * @param featureId The unique identifier (URI) of the feature.
     * @param state The requested state of the feature (true or false).
     *
     * @exception XMLConfigurationException If the requested feature is not known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public XMLSchemaValidatorComponentManager(XSGrammarPoolContainer grammarContainer) {

    /** Constructs a component manager suitable for Xerces' schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private Locale fLocale = null;

    /** Locale chosen by the application. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private LSResourceResolver fResourceResolver = null;

    /** Application's LSResourceResolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private ErrorHandler fErrorHandler = null;

    /** Application's ErrorHandler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final XMLSecurityPropertyManager fSecurityPropertyMgr;

    /** Stores the initial security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLSecurityManager fInitSecurityManager;

    /** Stores the initial security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final HashMap fInitProperties = new HashMap();

    /** Stores initial property values for validator reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final HashMap fInitFeatures = new HashMap();

    /** Stores initial feature values for validator reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private ValidationManager fValidationManager;

    /** Validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLSchemaValidator fSchemaValidator;

    /** XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private NamespaceContext fNamespaceContext;

    /** Namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final HashMap fComponents = new HashMap();

    /** Lookup map for components required for validation. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private boolean fUseGrammarPoolOnly;

    /**
     * Tracks whether the validator should use components from
     * the grammar pool to the exclusion of all others.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private boolean fConfigUpdated = true;

    /**
     * fConfigUpdated is set to true if there has been any change to the configuration settings,
     * i.e a feature or a property was changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private boolean _isSecureMode = false;

    /**
     * <p>State of secure mode.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String NAMESPACE_CONTEXT =

    /** Property identifier: namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String USE_GRAMMAR_POOL_ONLY =

    /** Feature identifier: use grammar pool only. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SCHEMA_ELEMENT_DEFAULT =

    /** Feature identifier: send element default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SCHEMA_VALIDATION =

    /** Feature identifier: schema validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
final class XMLSchemaValidatorComponentManager extends ParserConfigurationSettings implements

/**
 * <p>An implementation of XMLComponentManager for a schema validator.</p>
 *
 * @author Michael Glavassevich, IBM
 * @version $Id: XMLSchemaValidatorComponentManager.java,v 1.9 2010-11-01 04:40:08 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private void setPropertyDefaults(final XMLComponent component, final String [] recognizedProperties) {

    /** Sets property defaults for the given component on this configuration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private void setFeatureDefaults(final XMLComponent component,
            final String [] recognizedFeatures, XSGrammarPoolContainer grammarContainer) {

    /** Sets feature defaults for the given component on this configuration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    void restoreInitialState() {

    /** Cleans out configuration, restoring it to its initial state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void reset() throws XNIException {

    /** Calls reset on each of the components owned by this component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void addRecognizedParamsAndSetDefaults(XMLComponent component, XSGrammarPoolContainer grammarContainer) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void setProperty(String propertyId, Object value) throws XMLConfigurationException {

    /**
     * Sets the state of a property.
     *
     * @param propertyId The unique identifier (URI) of the property.
     * @param value The requested state of the property.
     *
     * @exception XMLConfigurationException If the requested property is not known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public void setFeature(String featureId, boolean value) throws XMLConfigurationException {

    /**
     * Set the state of a feature.
     *
     * @param featureId The unique identifier (URI) of the feature.
     * @param state The requested state of the feature (true or false).
     *
     * @exception XMLConfigurationException If the requested feature is not known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    public XMLSchemaValidatorComponentManager(XSGrammarPoolContainer grammarContainer) {

    /** Constructs a component manager suitable for Xerces' schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private Locale fLocale = null;

    /** Locale chosen by the application. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private LSResourceResolver fResourceResolver = null;

    /** Application's LSResourceResolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private ErrorHandler fErrorHandler = null;

    /** Application's ErrorHandler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final XMLSecurityPropertyManager fSecurityPropertyMgr;

    /** Stores the initial security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLSecurityManager fInitSecurityManager;

    /** Stores the initial security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final HashMap fInitProperties = new HashMap();

    /** Stores initial property values for validator reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final HashMap fInitFeatures = new HashMap();

    /** Stores initial feature values for validator reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private ValidationManager fValidationManager;

    /** Validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLSchemaValidator fSchemaValidator;

    /** XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private NamespaceContext fNamespaceContext;

    /** Namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private XMLEntityManager fEntityManager;

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private final HashMap fComponents = new HashMap();

    /** Lookup map for components required for validation. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private boolean fUseGrammarPoolOnly;

    /**
     * Tracks whether the validator should use components from
     * the grammar pool to the exclusion of all others.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private boolean fConfigUpdated = true;

    /**
     * fConfigUpdated is set to true if there has been any change to the configuration settings,
     * i.e a feature or a property was changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private boolean _isSecureMode = false;

    /**
     * <p>State of secure mode.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String NAMESPACE_CONTEXT =

    /** Property identifier: namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String USE_GRAMMAR_POOL_ONLY =

    /** Feature identifier: use grammar pool only. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SCHEMA_ELEMENT_DEFAULT =

    /** Feature identifier: send element default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
    private static final String SCHEMA_VALIDATION =

    /** Feature identifier: schema validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaValidatorComponentManager.java
final class XMLSchemaValidatorComponentManager extends ParserConfigurationSettings implements

/**
 * <p>An implementation of XMLComponentManager for a schema validator.</p>
 *
 * @author Michael Glavassevich, IBM
 * @version $Id: XMLSchemaValidatorComponentManager.java,v 1.9 2010-11-01 04:40:08 joehw Exp $
 */
