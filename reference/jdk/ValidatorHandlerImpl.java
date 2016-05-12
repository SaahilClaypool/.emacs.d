_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private String resolveSystemId(String systemId, String baseURI) {

        /** Resolves a system identifier against a base URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public InputSource resolveEntity(String publicId, String systemId)

        /** Delegates to EntityResolver2.resolveEntity(String, String, String, String). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
                    InputSource inputSource = new InputSource();

                    /**
                     * An LSParser looks at inputs specified in LSInput in
                     * the following order: characterStream, byteStream,
                     * stringData, systemId, publicId. For consistency
                     * with the DOM Level 3 Load and Save Recommendation
                     * use the same lookup order here.
                     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public InputSource resolveEntity(String name, String publicId,
                String baseURI, String systemId) throws SAXException, IOException {

        /**
         * Resolves the given resource and adapts the <code>LSInput</code>
         * returned into an <code>InputSource</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public InputSource getExternalSubset(String name, String baseURI)

        /**
         * Always returns <code>null</code>. An LSResourceResolver has no corresponding method.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public LSResourceResolver getEntityResolver() {

        /** Returns the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public void setEntityResolver(LSResourceResolver entityResolver) {

        /** Sets the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public ResolutionForwarder(LSResourceResolver entityResolver) {

        /** Wraps the specified DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public ResolutionForwarder() {}

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        protected LSResourceResolver fEntityResolver;

        /** The DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private static final String XML_TYPE = "http://www.w3.org/TR/REC-xml";

        /** XML 1.0 type constant according to DOM L3 LS REC spec "http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final ResolutionForwarder fResolutionForwarder = new ResolutionForwarder(null);

    /** SAX adapter for an LSResourceResolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private void checkState(boolean forElementInfo) {

        /**
         * Throws a {@link IllegalStateException} if we are not in
         * the startElement callback. the JAXP API requires this
         * for most of the public methods.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void finishEndElement() {

        /** Cleanup at the end of end element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void beginEndElement(Augmentations elementAugs) {

        /** Initializes the TypeInfoProvider with type information for the current element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void finishStartElement() {

        /** Cleanup at the end of start element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void beginStartElement(Augmentations elementAugs, XMLAttributes attributes) {

        /** Initializes the TypeInfoProvider with type information for the current element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private boolean fInEndElement = false;

        /** In end element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private boolean fInStartElement = false;

        /** In start element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private XMLAttributes fAttributes;

        /** Attributes: augmentations for each attribute contain AttributePSVI. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private Augmentations fElementAugs;

        /** Element augmentations: contains ElementPSVI. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final XMLSchemaTypeInfoProvider fTypeInfoProvider = new XMLSchemaTypeInfoProvider();

    /**
     * {@link TypeInfoProvider} implementation.
     *
     * REVISIT: I'm not sure if this code should belong here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillXMLAttribute(Attributes att, int index) {

    /** Adds an attribute to the XMLAttributes object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillXMLAttributes2(Attributes2 att) {

    /** Fills in the XMLAttributes object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillXMLAttributes(Attributes att) {

    /** Fills in the XMLAttributes object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillQName(QName toFill, String uri, String localpart, String raw) {

    /** Fills in a QName object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        if (fContentHandler != null) {

        /**
         * Processing instructions do not participate in schema validation,
         * so just forward the event to the application's content
         * handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        startElement(element, attributes, augs);

        /** Split empty element event. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private boolean fStringsInternalized = false;

    /** Flag used to track whether XML names and Namespace URIs have been internalized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private HashMap fUnparsedEntities = null;

    /** Map for tracking unparsed entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private boolean fNeedPushNSContext = true;

    /** Flag used to track whether the namespace context needs to be pushed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final SAXLocatorWrapper fSAXLocatorWrapper = new SAXLocatorWrapper();

    /** XML Locator wrapper for SAX. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private XMLSchemaValidatorComponentManager fComponentManager;

    /** Component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private ValidationManager fValidationManager;

    /** Validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private XMLSchemaValidator fSchemaValidator;

    /** Schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private NamespaceContext fNamespaceContext;

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String NAMESPACE_CONTEXT =

    /** Property identifier: namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    protected static final String STRING_INTERNING =

    /** Feature identifier: string interning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String NAMESPACE_PREFIXES =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
final class ValidatorHandlerImpl extends ValidatorHandler implements

/**
 * <p>Implementation of ValidatorHandler for W3C XML Schemas and
 * also a validator helper for <code>SAXSource</code>s.</p>
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: ValidatorHandlerImpl.java,v 1.10 2010-11-01 04:40:08 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private String resolveSystemId(String systemId, String baseURI) {

        /** Resolves a system identifier against a base URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public InputSource resolveEntity(String publicId, String systemId)

        /** Delegates to EntityResolver2.resolveEntity(String, String, String, String). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
                    InputSource inputSource = new InputSource();

                    /**
                     * An LSParser looks at inputs specified in LSInput in
                     * the following order: characterStream, byteStream,
                     * stringData, systemId, publicId. For consistency
                     * with the DOM Level 3 Load and Save Recommendation
                     * use the same lookup order here.
                     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public InputSource resolveEntity(String name, String publicId,
                String baseURI, String systemId) throws SAXException, IOException {

        /**
         * Resolves the given resource and adapts the <code>LSInput</code>
         * returned into an <code>InputSource</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public InputSource getExternalSubset(String name, String baseURI)

        /**
         * Always returns <code>null</code>. An LSResourceResolver has no corresponding method.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public LSResourceResolver getEntityResolver() {

        /** Returns the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public void setEntityResolver(LSResourceResolver entityResolver) {

        /** Sets the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public ResolutionForwarder(LSResourceResolver entityResolver) {

        /** Wraps the specified DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        public ResolutionForwarder() {}

        /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        protected LSResourceResolver fEntityResolver;

        /** The DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private static final String XML_TYPE = "http://www.w3.org/TR/REC-xml";

        /** XML 1.0 type constant according to DOM L3 LS REC spec "http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final ResolutionForwarder fResolutionForwarder = new ResolutionForwarder(null);

    /** SAX adapter for an LSResourceResolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private void checkState(boolean forElementInfo) {

        /**
         * Throws a {@link IllegalStateException} if we are not in
         * the startElement callback. the JAXP API requires this
         * for most of the public methods.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void finishEndElement() {

        /** Cleanup at the end of end element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void beginEndElement(Augmentations elementAugs) {

        /** Initializes the TypeInfoProvider with type information for the current element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void finishStartElement() {

        /** Cleanup at the end of start element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        void beginStartElement(Augmentations elementAugs, XMLAttributes attributes) {

        /** Initializes the TypeInfoProvider with type information for the current element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private boolean fInEndElement = false;

        /** In end element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private boolean fInStartElement = false;

        /** In start element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private XMLAttributes fAttributes;

        /** Attributes: augmentations for each attribute contain AttributePSVI. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        private Augmentations fElementAugs;

        /** Element augmentations: contains ElementPSVI. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final XMLSchemaTypeInfoProvider fTypeInfoProvider = new XMLSchemaTypeInfoProvider();

    /**
     * {@link TypeInfoProvider} implementation.
     *
     * REVISIT: I'm not sure if this code should belong here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillXMLAttribute(Attributes att, int index) {

    /** Adds an attribute to the XMLAttributes object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillXMLAttributes2(Attributes2 att) {

    /** Fills in the XMLAttributes object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillXMLAttributes(Attributes att) {

    /** Fills in the XMLAttributes object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private void fillQName(QName toFill, String uri, String localpart, String raw) {

    /** Fills in a QName object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        if (fContentHandler != null) {

        /**
         * Processing instructions do not participate in schema validation,
         * so just forward the event to the application's content
         * handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
        startElement(element, attributes, augs);

        /** Split empty element event. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private boolean fStringsInternalized = false;

    /** Flag used to track whether XML names and Namespace URIs have been internalized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private HashMap fUnparsedEntities = null;

    /** Map for tracking unparsed entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private boolean fNeedPushNSContext = true;

    /** Flag used to track whether the namespace context needs to be pushed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private final SAXLocatorWrapper fSAXLocatorWrapper = new SAXLocatorWrapper();

    /** XML Locator wrapper for SAX. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private XMLSchemaValidatorComponentManager fComponentManager;

    /** Component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private ValidationManager fValidationManager;

    /** Validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private XMLSchemaValidator fSchemaValidator;

    /** Schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private NamespaceContext fNamespaceContext;

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String NAMESPACE_CONTEXT =

    /** Property identifier: namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    protected static final String STRING_INTERNING =

    /** Feature identifier: string interning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
    private static final String NAMESPACE_PREFIXES =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorHandlerImpl.java
final class ValidatorHandlerImpl extends ValidatorHandler implements

/**
 * <p>Implementation of ValidatorHandler for W3C XML Schemas and
 * also a validator helper for <code>SAXSource</code>s.</p>
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: ValidatorHandlerImpl.java,v 1.10 2010-11-01 04:40:08 joehw Exp $
 */
