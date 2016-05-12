_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void loadGrammarWithContext(XMLDTDValidator validator, String rootName,
            String publicId, String systemId, String baseSystemId, String internalSubset)

    /**
     * Parse a DTD internal and/or external subset and insert the content
     * into the existing DTD grammar owned by the given DTDValidator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public XMLEntityResolver getEntityResolver() {

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setEntityResolver(XMLEntityResolver entityResolver) {

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public XMLErrorHandler getErrorHandler() {

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public Locale getLocale() {

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public XMLDTDLoader() {

    /** Deny default construction; we need a SymtolTable! */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected XMLEntityResolver fEntityResolver;

    /** Entity resolver . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    private boolean fBalanceSyntaxTrees = false;

    /** Controls whether the DTD grammar produces balanced syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    private static final String[] LOADER_RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected static final String BALANCE_SYNTAX_TREES =

    /** Feature identifier: balance syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier: standard uri conformant feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
public class XMLDTDLoader

/**
 * The DTD loader. The loader knows how to build grammars from XMLInputSources.
 * It extends the DTD processor in order to do this; it's
 * a separate class because DTD processors don't need to know how
 * to talk to the outside world in their role as instance-document
 * helpers.
 * <p>
 * This component requires the following features and properties.  It
 * know ho to set them if no one else does:from the
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *  <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XMLDTDLoader.java,v 1.6 2010-11-01 04:39:42 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void loadGrammarWithContext(XMLDTDValidator validator, String rootName,
            String publicId, String systemId, String baseSystemId, String internalSubset)

    /**
     * Parse a DTD internal and/or external subset and insert the content
     * into the existing DTD grammar owned by the given DTDValidator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public XMLEntityResolver getEntityResolver() {

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setEntityResolver(XMLEntityResolver entityResolver) {

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public XMLErrorHandler getErrorHandler() {

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public Locale getLocale() {

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the component
     * manager any time after reset when a property changes value.
     * <p>
     * <strong>Note:</strong> Components should silently ignore properties
     * that do not affect the operation of the component.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the component
     * manager any time after reset when a feature changes state.
     * <p>
     * <strong>Note:</strong> Components should silently ignore features
     * that do not affect the operation of the component.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws SAXNotRecognizedException The component should not throw
     *                                   this exception.
     * @throws SAXNotSupportedException The component should not throw
     *                                  this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public XMLDTDLoader() {

    /** Deny default construction; we need a SymtolTable! */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected XMLEntityResolver fEntityResolver;

    /** Entity resolver . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    private boolean fBalanceSyntaxTrees = false;

    /** Controls whether the DTD grammar produces balanced syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    private static final String[] LOADER_RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected static final String BALANCE_SYNTAX_TREES =

    /** Feature identifier: balance syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier: standard uri conformant feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDLoader.java
public class XMLDTDLoader

/**
 * The DTD loader. The loader knows how to build grammars from XMLInputSources.
 * It extends the DTD processor in order to do this; it's
 * a separate class because DTD processors don't need to know how
 * to talk to the outside world in their role as instance-document
 * helpers.
 * <p>
 * This component requires the following features and properties.  It
 * know ho to set them if no one else does:from the
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *  <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XMLDTDLoader.java,v 1.6 2010-11-01 04:39:42 joehw Exp $
 */
