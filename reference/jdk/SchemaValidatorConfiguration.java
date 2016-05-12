_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    public Object getProperty(String propertyId)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    public boolean getFeature(String featureId)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final ValidationManager fValidationManager;

    /** Validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final boolean fUseGrammarPoolOnly;

    /**
     * Tracks whether the validator should use components from
     * the grammar pool to the exclusion of all others.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final XMLGrammarPool fGrammarPool;

    /** The Schema's grammar pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final XMLComponentManager fParentComponentManager;

    /** Parent component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String PARSER_SETTINGS =

    /** Feature identifier: parser settings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String USE_GRAMMAR_POOL_ONLY =

    /** Feature identifier: use grammar pool only. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String SCHEMA_VALIDATION =

    /** Feature identifier: schema validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
final class SchemaValidatorConfiguration implements XMLComponentManager {

/**
 * <p>Parser configuration for Xerces' XMLSchemaValidator.</p>
 *
 * @version $Id: SchemaValidatorConfiguration.java,v 1.5 2010-11-01 04:40:06 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    public Object getProperty(String propertyId)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    public boolean getFeature(String featureId)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final ValidationManager fValidationManager;

    /** Validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final boolean fUseGrammarPoolOnly;

    /**
     * Tracks whether the validator should use components from
     * the grammar pool to the exclusion of all others.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final XMLGrammarPool fGrammarPool;

    /** The Schema's grammar pool. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private final XMLComponentManager fParentComponentManager;

    /** Parent component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String PARSER_SETTINGS =

    /** Feature identifier: parser settings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String USE_GRAMMAR_POOL_ONLY =

    /** Feature identifier: use grammar pool only. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
    private static final String SCHEMA_VALIDATION =

    /** Feature identifier: schema validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SchemaValidatorConfiguration.java
final class SchemaValidatorConfiguration implements XMLComponentManager {

/**
 * <p>Parser configuration for Xerces' XMLSchemaValidator.</p>
 *
 * @version $Id: SchemaValidatorConfiguration.java,v 1.5 2010-11-01 04:40:06 joehw Exp $
 */
