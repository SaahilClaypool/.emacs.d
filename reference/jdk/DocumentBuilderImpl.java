_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
        if (domParser.getEntityResolver() != fInitEntityResolver) {

        /** Restore the initial entity resolver. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
        if (domParser.getErrorHandler() != fInitErrorHandler) {

        /** Restore the initial error handler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public boolean isXIncludeAware() {

    /**
     * Gets the XInclude processing mode for this parser
     * @return the state of XInclude processing mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public Document newDocument() {

    /**
     * Non-preferred: use the getDOMImplementation() method instead of this
     * one to get a DOM Level 2 DOMImplementation object and then use DOM
     * Level 2 methods to create a DOM Document object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private void setDocumentBuilderFactoryAttributes( Map<String, Object> dbfAttrs)

    /**
     * Set any DocumentBuilderFactory attributes of our underlying DOMParser
     *
     * Note: code does not handle possible conflicts between DOMParser
     * attribute names and JAXP specific attribute names,
     * eg. DocumentBuilderFactory.setValidating()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
            else {

            /** For third party grammars, use the JAXP validator component. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
            if (grammar instanceof XSGrammarPoolContainer) {

            /** For Xerces grammars, use built-in schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
            if (features != null) {

            /**
             * If secure processing is explicitly set on the factory, the
             * access properties will be set unless the corresponding
             * System Properties or jaxp.properties are set
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private final EntityResolver fInitEntityResolver;

    /** Initial EntityResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private final ErrorHandler fInitErrorHandler;

    /** Initial ErrorHandler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public static final String ACCESS_EXTERNAL_SCHEMA = XMLConstants.ACCESS_EXTERNAL_SCHEMA;

    /** Property identifier: access to external schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public static final String ACCESS_EXTERNAL_DTD = XMLConstants.ACCESS_EXTERNAL_DTD;

    /** property identifier: access external dtd. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String VALIDATION_FEATURE =

    /** Feature identifier: validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String XMLSCHEMA_VALIDATION_FEATURE =

    /** feature identifier: XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String XINCLUDE_FEATURE =

    /** Feature identifier: XInclude processing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String CREATE_CDATA_NODES_FEATURE =

    /** Feature identifier: create cdata nodes feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String INCLUDE_COMMENTS_FEATURE =

    /** Feature identifier: include comments feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String CREATE_ENTITY_REF_NODES_FEATURE =

    /** Feature identifier: create entiry ref nodes feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String INCLUDE_IGNORABLE_WHITESPACE =

    /** Feature identifier: include ignorable white space. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String NAMESPACES_FEATURE =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
public class DocumentBuilderImpl extends DocumentBuilder

/**
 * @author Rajiv Mordani
 * @author Edwin Goei
 * @version $Id: DocumentBuilderImpl.java,v 1.8 2010-11-01 04:40:06 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
        if (domParser.getEntityResolver() != fInitEntityResolver) {

        /** Restore the initial entity resolver. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
        if (domParser.getErrorHandler() != fInitErrorHandler) {

        /** Restore the initial error handler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public boolean isXIncludeAware() {

    /**
     * Gets the XInclude processing mode for this parser
     * @return the state of XInclude processing mode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public Document newDocument() {

    /**
     * Non-preferred: use the getDOMImplementation() method instead of this
     * one to get a DOM Level 2 DOMImplementation object and then use DOM
     * Level 2 methods to create a DOM Document object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private void setDocumentBuilderFactoryAttributes( Map<String, Object> dbfAttrs)

    /**
     * Set any DocumentBuilderFactory attributes of our underlying DOMParser
     *
     * Note: code does not handle possible conflicts between DOMParser
     * attribute names and JAXP specific attribute names,
     * eg. DocumentBuilderFactory.setValidating()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
            else {

            /** For third party grammars, use the JAXP validator component. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
            if (grammar instanceof XSGrammarPoolContainer) {

            /** For Xerces grammars, use built-in schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
            if (features != null) {

            /**
             * If secure processing is explicitly set on the factory, the
             * access properties will be set unless the corresponding
             * System Properties or jaxp.properties are set
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private final EntityResolver fInitEntityResolver;

    /** Initial EntityResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private final ErrorHandler fInitErrorHandler;

    /** Initial ErrorHandler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public static final String ACCESS_EXTERNAL_SCHEMA = XMLConstants.ACCESS_EXTERNAL_SCHEMA;

    /** Property identifier: access to external schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    public static final String ACCESS_EXTERNAL_DTD = XMLConstants.ACCESS_EXTERNAL_DTD;

    /** property identifier: access external dtd. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String VALIDATION_FEATURE =

    /** Feature identifier: validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String XMLSCHEMA_VALIDATION_FEATURE =

    /** feature identifier: XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String XINCLUDE_FEATURE =

    /** Feature identifier: XInclude processing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String CREATE_CDATA_NODES_FEATURE =

    /** Feature identifier: create cdata nodes feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String INCLUDE_COMMENTS_FEATURE =

    /** Feature identifier: include comments feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String CREATE_ENTITY_REF_NODES_FEATURE =

    /** Feature identifier: create entiry ref nodes feature. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String INCLUDE_IGNORABLE_WHITESPACE =

    /** Feature identifier: include ignorable white space. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
    private static final String NAMESPACES_FEATURE =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/DocumentBuilderImpl.java
public class DocumentBuilderImpl extends DocumentBuilder

/**
 * @author Rajiv Mordani
 * @author Edwin Goei
 * @version $Id: DocumentBuilderImpl.java,v 1.8 2010-11-01 04:40:06 joehw Exp $
 */
