_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public ErrorHandler getSAXErrorHandler() {

    /**
     * Gets the internal XMLErrorHandler
     * as SAX ErrorHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public XMLErrorHandler getErrorHandler() {

    /**
     * Get the internal XMLErrrorHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(XMLLocator location,
                            String domain, String key, Object[] arguments,
                            short severity, Exception exception) throws XNIException {

    /**
     * Reports an error at a specific location.
     *
     * @param location  The error location.
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @param exception The exception to wrap.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(XMLLocator location,
            String domain, String key, Object[] arguments,
            short severity) throws XNIException {

    /**
     * Reports an error at a specific location.
     *
     * @param location  The error location.
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(String domain, String key, Object[] arguments,
            short severity, Exception exception) throws XNIException {

    /**
     * Reports an error. The error message passed to the error handler
     * is formatted for the locale by the message formatter installed
     * for the specified error domain.
     *
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @param exception The exception to wrap.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(String domain, String key, Object[] arguments,
                            short severity) throws XNIException {

    /**
     * Reports an error. The error message passed to the error handler
     * is formatted for the locale by the message formatter installed
     * for the specified error domain.
     *
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public MessageFormatter removeMessageFormatter(String domain) {

    /**
     * Removes the message formatter for the specified domain and
     * returns the removed message formatter.
     *
     * @param domain The domain of the message formatter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public MessageFormatter getMessageFormatter(String domain) {

    /**
     * Returns the message formatter associated with the specified domain,
     * or null if no message formatter is registered for that domain.
     *
     * @param domain The domain of the message formatter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void putMessageFormatter(String domain,
                                    MessageFormatter messageFormatter) {

    /**
     * Registers a message formatter for the specified domain.
     * <p>
     * <strong>Note:</strong> Registering a message formatter for a domain
     * when there is already a formatter registered will cause the previous
     * formatter to be lost. This method replaces any previously registered
     * message formatter for the specified domain.
     *
     * @param domain
     * @param messageFormatter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void setDocumentLocator(XMLLocator locator) {

    /**
     * Sets the document locator.
     *
     * @param locator The locator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public Locale getLocale() {

    /**
     * Gets the current locale.
     *
     * @return the current Locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void setLocale(Locale locale) {

    /**
     * Sets the current locale.
     *
     * @param locale The new locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public XMLErrorReporter() {

    /** Constructs an error reporter with a locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private ErrorHandler fSaxProxy = null;

    /** A SAX proxy to the error handler contained in this error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected XMLErrorHandler fDefaultErrorHandler;

    /**
     * Default error handler. This error handler is only used in the
     * absence of a registered error handler so that errors are not
     * "swallowed" silently. This is one of the most common "problems"
     * reported by users of the parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected boolean fContinueAfterFatalError;

    /** Continue after fatal error feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected XMLLocator fLocator;

    /** Document locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected XMLErrorHandler fErrorHandler;

    /** Error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected Map<String, MessageFormatter> fMessageFormatters;

    /** Mapping of Message formatters for domains. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected Locale fLocale;

    /** The locale to be used to format error messages. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public static final short SEVERITY_FATAL_ERROR = 2;

    /**
     * Severity: fatal error. Fatal errors are errors in the syntax of the
     * XML document or invalid byte sequences for a given encoding. The
     * XML 1.0 Specification mandates that errors of this type are not
     * recoverable.
     * <p>
     * <strong>Note:</strong> The parser does have a "continue after fatal
     * error" feature but it should be used with extreme caution and care.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public static final short SEVERITY_ERROR = 1;

    /**
     * Severity: error. Common causes of errors are document structure and/or
     * content that that does not conform to the grammar rules specified for
     * the document. These are typically validation errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public static final short SEVERITY_WARNING = 0;

    /**
     * Severity: warning. Warnings represent informational messages only
     * that should not be considered serious enough to stop parsing or
     * indicate an error in the document's validity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
public class XMLErrorReporter

/**
 * This class is a common element of all parser configurations and is
 * used to report errors that occur. This component can be queried by
 * parser components from the component manager using the following
 * property ID:
 * <pre>
 *   http://apache.org/xml/properties/internal/error-reporter
 * </pre>
 * <p>
 * Errors are separated into domains that categorize a class of errors.
 * In a parser configuration, the parser would register a
 * <code>MessageFormatter</code> for each domain that is capable of
 * localizing error messages and formatting them based on information
 * about the error. Any parser component can invent new error domains
 * and register additional message formatters to localize messages in
 * those domains.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://apache.org/xml/properties/internal/error-handler</li>
 * </ul>
 * <p>
 * This component can use the following features and properties but they
 * are not required:
 * <ul>
 *  <li>http://apache.org/xml/features/continue-after-fatal-error</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @see MessageFormatter
 *
 * @author Eric Ye, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: XMLErrorReporter.java,v 1.5 2010-11-01 04:39:41 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public ErrorHandler getSAXErrorHandler() {

    /**
     * Gets the internal XMLErrorHandler
     * as SAX ErrorHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public XMLErrorHandler getErrorHandler() {

    /**
     * Get the internal XMLErrrorHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(XMLLocator location,
                            String domain, String key, Object[] arguments,
                            short severity, Exception exception) throws XNIException {

    /**
     * Reports an error at a specific location.
     *
     * @param location  The error location.
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @param exception The exception to wrap.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(XMLLocator location,
            String domain, String key, Object[] arguments,
            short severity) throws XNIException {

    /**
     * Reports an error at a specific location.
     *
     * @param location  The error location.
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(String domain, String key, Object[] arguments,
            short severity, Exception exception) throws XNIException {

    /**
     * Reports an error. The error message passed to the error handler
     * is formatted for the locale by the message formatter installed
     * for the specified error domain.
     *
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @param exception The exception to wrap.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public String reportError(String domain, String key, Object[] arguments,
                            short severity) throws XNIException {

    /**
     * Reports an error. The error message passed to the error handler
     * is formatted for the locale by the message formatter installed
     * for the specified error domain.
     *
     * @param domain    The error domain.
     * @param key       The key of the error message.
     * @param arguments The replacement arguments for the error message,
     *                  if needed.
     * @param severity  The severity of the error.
     * @return          The formatted error message.
     *
     * @see #SEVERITY_WARNING
     * @see #SEVERITY_ERROR
     * @see #SEVERITY_FATAL_ERROR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public MessageFormatter removeMessageFormatter(String domain) {

    /**
     * Removes the message formatter for the specified domain and
     * returns the removed message formatter.
     *
     * @param domain The domain of the message formatter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public MessageFormatter getMessageFormatter(String domain) {

    /**
     * Returns the message formatter associated with the specified domain,
     * or null if no message formatter is registered for that domain.
     *
     * @param domain The domain of the message formatter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void putMessageFormatter(String domain,
                                    MessageFormatter messageFormatter) {

    /**
     * Registers a message formatter for the specified domain.
     * <p>
     * <strong>Note:</strong> Registering a message formatter for a domain
     * when there is already a formatter registered will cause the previous
     * formatter to be lost. This method replaces any previously registered
     * message formatter for the specified domain.
     *
     * @param domain
     * @param messageFormatter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void setDocumentLocator(XMLLocator locator) {

    /**
     * Sets the document locator.
     *
     * @param locator The locator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public Locale getLocale() {

    /**
     * Gets the current locale.
     *
     * @return the current Locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public void setLocale(Locale locale) {

    /**
     * Sets the current locale.
     *
     * @param locale The new locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public XMLErrorReporter() {

    /** Constructs an error reporter with a locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private ErrorHandler fSaxProxy = null;

    /** A SAX proxy to the error handler contained in this error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected XMLErrorHandler fDefaultErrorHandler;

    /**
     * Default error handler. This error handler is only used in the
     * absence of a registered error handler so that errors are not
     * "swallowed" silently. This is one of the most common "problems"
     * reported by users of the parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected boolean fContinueAfterFatalError;

    /** Continue after fatal error feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected XMLLocator fLocator;

    /** Document locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected XMLErrorHandler fErrorHandler;

    /** Error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected Map<String, MessageFormatter> fMessageFormatters;

    /** Mapping of Message formatters for domains. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected Locale fLocale;

    /** The locale to be used to format error messages. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier: continue after fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public static final short SEVERITY_FATAL_ERROR = 2;

    /**
     * Severity: fatal error. Fatal errors are errors in the syntax of the
     * XML document or invalid byte sequences for a given encoding. The
     * XML 1.0 Specification mandates that errors of this type are not
     * recoverable.
     * <p>
     * <strong>Note:</strong> The parser does have a "continue after fatal
     * error" feature but it should be used with extreme caution and care.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public static final short SEVERITY_ERROR = 1;

    /**
     * Severity: error. Common causes of errors are document structure and/or
     * content that that does not conform to the grammar rules specified for
     * the document. These are typically validation errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
    public static final short SEVERITY_WARNING = 0;

    /**
     * Severity: warning. Warnings represent informational messages only
     * that should not be considered serious enough to stop parsing or
     * indicate an error in the document's validity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLErrorReporter.java
public class XMLErrorReporter

/**
 * This class is a common element of all parser configurations and is
 * used to report errors that occur. This component can be queried by
 * parser components from the component manager using the following
 * property ID:
 * <pre>
 *   http://apache.org/xml/properties/internal/error-reporter
 * </pre>
 * <p>
 * Errors are separated into domains that categorize a class of errors.
 * In a parser configuration, the parser would register a
 * <code>MessageFormatter</code> for each domain that is capable of
 * localizing error messages and formatting them based on information
 * about the error. Any parser component can invent new error domains
 * and register additional message formatters to localize messages in
 * those domains.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://apache.org/xml/properties/internal/error-handler</li>
 * </ul>
 * <p>
 * This component can use the following features and properties but they
 * are not required:
 * <ul>
 *  <li>http://apache.org/xml/features/continue-after-fatal-error</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @see MessageFormatter
 *
 * @author Eric Ye, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: XMLErrorReporter.java,v 1.5 2010-11-01 04:39:41 joehw Exp $
 */
