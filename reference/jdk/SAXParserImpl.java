_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            String propertyValue = (fSecurityManager != null) ?

            /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (fSAXParser != null && fSAXParser.fSchemaValidator != null) {

            /** Forward property to the schema validator if there is one. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
        public synchronized void setProperty(String name, Object value)

        /**
         * Override SAXParser's setProperty method to track the initial state
         * of properties. This keeps us from affecting the performance of the
         * SAXParser when it is created with XMLReaderFactory.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (fSAXParser != null && fSAXParser.fSchemaValidator != null) {

            /** Forward feature to the schema validator if there is one. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
        public synchronized void setFeature(String name, boolean value)

        /**
         * Override SAXParser's setFeature method to track the initial state
         * of features. This keeps us from affecting the performance of the
         * SAXParser when it is created with XMLReaderFactory.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (fSecurityManager == null) {

            /**
             * This class may be used directly. So initialize the security manager if
             * it is null.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public static class JAXPSAXParser extends com.sun.org.apache.xerces.internal.parsers.SAXParser {

    /**
     * Extension of SAXParser. This class tracks changes to
     * features and properties to allow the parser to be reset to
     * its initial state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
        xmlReader.setContentHandler(null);

        /** Restore various handlers. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            xmlReader.restoreInitState();

            /** Restore initial values of features and properties. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public Object getProperty(String name)

    /**
     * returns the particular property requested for in the underlying
     * implementation of org.xml.sax.XMLReader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public void setProperty(String name, Object value)

    /**
     * Sets the particular property in the underlying implementation of
     * org.xml.sax.XMLReader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public boolean isXIncludeAware() {

    /**
     * Gets the XInclude processing mode for this parser
     * @return the state of XInclude processing mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public XMLReader getXMLReader() {

    /**
     * Returns the XMLReader that is encapsulated by the implementation of
     * this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private void setFeatures(Map<String, Boolean> features)

    /**
     * Set any features of our XMLReader based on any features set on the
     * SAXParserFactory.
     *
     * XXX Does not handle possible conflicts between SAX feature names and
     * JAXP specific feature names, eg. SAXParserFactory.isValidating()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            else {

            /** For third party grammars, use the JAXP validator component. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (grammar instanceof XSGrammarPoolContainer) {

            /** For Xerces grammars, use built-in schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (features != null) {

            /**
             * By default, secure processing is set, no external access is allowed.
             * However, we need to check if it is actively set on the factory since we
             * allow the use of the System Property or jaxp.properties to override
             * the default value
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    SAXParserImpl(SAXParserFactoryImpl spf, Map<String, Boolean> features, boolean secureProcessing)

    /**
     * Create a SAX parser with the associated features
     * @param features Map of SAX features, may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    SAXParserImpl(SAXParserFactoryImpl spf, Map<String, Boolean> features)

    /**
     * Create a SAX parser with the associated features
     * @param features Map of SAX features, may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private final EntityResolver fInitEntityResolver;

    /** Initial EntityResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private final ErrorHandler fInitErrorHandler;

    /** Initial ErrorHandler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String XINCLUDE_FEATURE =

    /** Feature identifier: XInclude processing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String XMLSCHEMA_VALIDATION_FEATURE =

    /** Feature identifier: XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String VALIDATION_FEATURE =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String NAMESPACE_PREFIXES_FEATURE =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String NAMESPACES_FEATURE =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
public class SAXParserImpl extends javax.xml.parsers.SAXParser

/**
 * This is the implementation specific class for the
 * <code>javax.xml.parsers.SAXParser</code>.
 *
 * @author Rajiv Mordani
 * @author Edwin Goei
 *
 * @version $Id: SAXParserImpl.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            String propertyValue = (fSecurityManager != null) ?

            /** Check to see if the property is managed by the security manager **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (fSAXParser != null && fSAXParser.fSchemaValidator != null) {

            /** Forward property to the schema validator if there is one. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
        public synchronized void setProperty(String name, Object value)

        /**
         * Override SAXParser's setProperty method to track the initial state
         * of properties. This keeps us from affecting the performance of the
         * SAXParser when it is created with XMLReaderFactory.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (fSAXParser != null && fSAXParser.fSchemaValidator != null) {

            /** Forward feature to the schema validator if there is one. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
        public synchronized void setFeature(String name, boolean value)

        /**
         * Override SAXParser's setFeature method to track the initial state
         * of features. This keeps us from affecting the performance of the
         * SAXParser when it is created with XMLReaderFactory.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (fSecurityManager == null) {

            /**
             * This class may be used directly. So initialize the security manager if
             * it is null.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public static class JAXPSAXParser extends com.sun.org.apache.xerces.internal.parsers.SAXParser {

    /**
     * Extension of SAXParser. This class tracks changes to
     * features and properties to allow the parser to be reset to
     * its initial state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
        xmlReader.setContentHandler(null);

        /** Restore various handlers. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            xmlReader.restoreInitState();

            /** Restore initial values of features and properties. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public Object getProperty(String name)

    /**
     * returns the particular property requested for in the underlying
     * implementation of org.xml.sax.XMLReader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public void setProperty(String name, Object value)

    /**
     * Sets the particular property in the underlying implementation of
     * org.xml.sax.XMLReader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public boolean isXIncludeAware() {

    /**
     * Gets the XInclude processing mode for this parser
     * @return the state of XInclude processing mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    public XMLReader getXMLReader() {

    /**
     * Returns the XMLReader that is encapsulated by the implementation of
     * this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private void setFeatures(Map<String, Boolean> features)

    /**
     * Set any features of our XMLReader based on any features set on the
     * SAXParserFactory.
     *
     * XXX Does not handle possible conflicts between SAX feature names and
     * JAXP specific feature names, eg. SAXParserFactory.isValidating()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            else {

            /** For third party grammars, use the JAXP validator component. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (grammar instanceof XSGrammarPoolContainer) {

            /** For Xerces grammars, use built-in schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
            if (features != null) {

            /**
             * By default, secure processing is set, no external access is allowed.
             * However, we need to check if it is actively set on the factory since we
             * allow the use of the System Property or jaxp.properties to override
             * the default value
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    SAXParserImpl(SAXParserFactoryImpl spf, Map<String, Boolean> features, boolean secureProcessing)

    /**
     * Create a SAX parser with the associated features
     * @param features Map of SAX features, may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    SAXParserImpl(SAXParserFactoryImpl spf, Map<String, Boolean> features)

    /**
     * Create a SAX parser with the associated features
     * @param features Map of SAX features, may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private final EntityResolver fInitEntityResolver;

    /** Initial EntityResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private final ErrorHandler fInitErrorHandler;

    /** Initial ErrorHandler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String XINCLUDE_FEATURE =

    /** Feature identifier: XInclude processing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String XMLSCHEMA_VALIDATION_FEATURE =

    /** Feature identifier: XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String VALIDATION_FEATURE =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String NAMESPACE_PREFIXES_FEATURE =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
    private static final String NAMESPACES_FEATURE =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/SAXParserImpl.java
public class SAXParserImpl extends javax.xml.parsers.SAXParser

/**
 * This is the implementation specific class for the
 * <code>javax.xml.parsers.SAXParser</code>.
 *
 * @author Rajiv Mordani
 * @author Edwin Goei
 *
 * @version $Id: SAXParserImpl.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
