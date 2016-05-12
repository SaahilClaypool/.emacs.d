_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public XMLDocumentSource getDocumentSource(){

    /** Returns the document source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void setDocumentSource(XMLDocumentSource source){

    /** Sets the document source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void endDocument(Augmentations augs) throws XNIException{

    /**
     * The end of the document.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void endCDATA(Augmentations augs) throws XNIException{

    /**
     * The end of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void startCDATA(Augmentations augs) throws XNIException{

    /**
     * The start of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs    Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException{

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text   The ignorable whitespace.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void characters(XMLString text, Augmentations augs) throws XNIException{

    /**
     * Character content.
     *
     * @param text   The content.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException{

    /**
     * This method notifies the end of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name   The name of the entity.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void textDecl(String version, String encoding, Augmentations augs) throws XNIException{

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startEntity call.
     * <p>
     * <strong>Note:</strong> This method will never be called for the
     * document entity; it is only called for external general entities
     * referenced in document content.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void startGeneralEntity(String name,
                                   XMLResourceIdentifier identifier,
                                   String encoding,
                                   Augmentations augs) throws XNIException{

    /**
     * This method notifies the start of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name     The name of the general entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void processingInstruction(String target, XMLString data, Augmentations augs)

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param target The target.
     * @param data   The data or null if none specified.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void comment(XMLString text, Augmentations augs) throws XNIException{

    /**
     * A comment.
     *
     * @param text   The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void doctypeDecl(String rootElement, String publicId, String systemId, Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement
     *                 The name of the root element.
     * @param publicId The public identifier if an external DTD or null
     *                 if the external DTD is specified using SYSTEM.
     * @param systemId The system identifier if an external DTD, null
     *                 otherwise.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void xmlDecl(String version, String encoding, String standalone, Augmentations augs)

    /**
     * Notifies of the presence of an XMLDecl line in the document. If
     * present, this method will be called immediately following the
     * startDocument call.
     *
     * @param version    The XML version.
     * @param encoding   The IANA encoding name of the document, or null if
     *                   not specified.
     * @param standalone The standalone value, or null if not specified.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void startDocument(XMLLocator locator, String encoding,
                              NamespaceContext namespaceContext,
                              Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator  The document locator, or null if the document
     *                 location cannot be reported during the parsing
     *                 of this document. However, it is <em>strongly</em>
     *                 recommended that a locator be supplied that can
     *                 at least report the system identifier of the
     *                 document.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param namespaceContext
     *                 The namespace context in effect at the
     *                 start of this document.
     *                 This object represents the current context.
     *                 Implementors of this class are responsible
     *                 for copying the namespace bindings from the
     *                 the current context (and its parent contexts)
     *                 if that information is important.
     *
     * @param augs     Additional information that may include infoset augmentations
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void setAugmentations(int attrIndex, Augmentations augs) {

        /**
         * Sets the augmentations of the attribute at the specified index.
         *
         * @param attrIndex The attribute index.
         * @param augs      The augmentations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
                public int addAttribute(QName qname, String attrType, String attrValue) {

                /**
         * This method adds default declarations
                 * @see com.sun.org.apache.xerces.internal.xni.XMLAttributes#addAttribute(QName, String, String)
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void reportDOMError(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
                        String message, short severity, String type ) {

    /**
     * Reports a DOM error to the user handler.
     *
     * If the error is fatal, the processing will be always aborted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isAttrValueWF(DOMErrorHandler errorHandler, DOMErrorImpl error,
            DOMLocatorImpl locator, NamedNodeMap attributes, Attr a, String value, boolean xml11Version) {

    /** NON-DOM: check if attribute value is well-formed
     * @param attributes
     * @param a
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isCommentWF(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
        String datavalue, boolean isXML11Version)

    /**
     * NON-DOM: check if value of the comment is well-formed
     * @param datavalue
     * @param isXML11Version = true if XML 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isXMLCharWF(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
        String datavalue, boolean isXML11Version)

    /**
     * NON-DOM: check for valid XML characters as per the XML version
     * @param datavalue
     * @param isXML11Version = true if XML 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isCDataWF(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
        String datavalue, boolean isXML11Version)

    /**
     * Check if CDATA section is well-formed
     * @param datavalue
     * @param isXML11Version = true if XML 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final void addNamespaceDecl(String prefix, String uri, ElementImpl element){

    /**
     * Adds a namespace attribute or replaces the value of existing namespace
     * attribute with the given prefix and value for URI.
     * In case prefix is empty will add/update default namespace declaration.
     *
     * @param prefix
     * @param uri
     * @exception IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected Node normalizeNode (Node node){

    /**
     *
     * This method acts as if the document was going through a save
     * and load cycle, putting the document in a "normal" form. The actual result
     * depends on the features being set and governing what operations actually
     * take place. See setNormalizationFeature for details. Noticeably this method
     * normalizes Text nodes, makes the document "namespace wellformed",
     * according to the algorithm described below in pseudo code, by adding missing
     * namespace declaration attributes and adding or changing namespace prefixes, updates
     * the replacement tree of EntityReference nodes,normalizes attribute values, etc.
     *
     * @param node   Modified node or null. If node is returned, we need
     *               to normalize again starting on the node returned.
     * @return  the normalized Node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        protected void normalizeDocument(CoreDocumentImpl document, DOMConfigurationImpl config) {

    /**
     * Normalizes document.
     * Note: reset() must be called before this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final RuntimeException abort = new RuntimeException();

    /**
     * If the user stops the process, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected Node fCurrentNode = null;

    /** for setting the PSVI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final DOMLocatorImpl fLocator = new DOMLocatorImpl();

    /** DOM Locator -  for namespace fixup algorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final ArrayList fAttributeList = new ArrayList(5);

    /** list of attributes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final NamespaceContext fLocalNSBinder = new NamespaceSupport();

    /** Stores all namespace bindings on the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final NamespaceContext fNamespaceContext = new NamespaceSupport();

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    private final DOMErrorImpl fError = new DOMErrorImpl();

    /**
     * Cached {@link DOMError} impl.
     * The same object is re-used to report multiple errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected SymbolTable fSymbolTable;

    /** symbol table */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected RevalidationHandler fValidationHandler;

    /** Validation handler represents validator instance. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final static String PREFIX = "NS";

    /** prefix added by namespace fixup algorithm should follow a pattern "NS" + index*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final static boolean DEBUG_EVENTS = false;

    /** Debug document handler events */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final static boolean DEBUG_ND = false;

    /** Debug normalize document*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
public class DOMNormalizer implements XMLDocumentHandler {

/**
 * This class adds implementation for normalizeDocument method.
 * It acts as if the document was going through a save and load cycle, putting
 * the document in a "normal" form. The actual result depends on the features being set
 * and governing what operations actually take place. See setNormalizationFeature for details.
 * Noticeably this method normalizes Text nodes, makes the document "namespace wellformed",
 * according to the algorithm described below in pseudo code, by adding missing namespace
 * declaration attributes and adding or changing namespace prefixes, updates the replacement
 * tree of EntityReference nodes, normalizes attribute values, etc.
 * Mutation events, when supported, are generated to reflect the changes occuring on the
 * document.
 * See Namespace normalization for details on how namespace declaration attributes and prefixes
 * are normalized.
 *
 * NOTE: There is an initial support for DOM revalidation with XML Schema as a grammar.
 * The tree might not be validated correctly if entityReferences, CDATA sections are
 * present in the tree. The PSVI information is not exposed, normalized data (including element
 * default content is not available).
 *
 * @xerces.experimental
 *
 * @author Elena Litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @version $Id: DOMNormalizer.java,v 1.9 2010-11-01 04:39:38 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public XMLDocumentSource getDocumentSource(){

    /** Returns the document source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void setDocumentSource(XMLDocumentSource source){

    /** Sets the document source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void endDocument(Augmentations augs) throws XNIException{

    /**
     * The end of the document.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void endCDATA(Augmentations augs) throws XNIException{

    /**
     * The end of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void startCDATA(Augmentations augs) throws XNIException{

    /**
     * The start of a CDATA section.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs    Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException{

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text   The ignorable whitespace.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void characters(XMLString text, Augmentations augs) throws XNIException{

    /**
     * Character content.
     *
     * @param text   The content.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException{

    /**
     * This method notifies the end of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name   The name of the entity.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void textDecl(String version, String encoding, Augmentations augs) throws XNIException{

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startEntity call.
     * <p>
     * <strong>Note:</strong> This method will never be called for the
     * document entity; it is only called for external general entities
     * referenced in document content.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void startGeneralEntity(String name,
                                   XMLResourceIdentifier identifier,
                                   String encoding,
                                   Augmentations augs) throws XNIException{

    /**
     * This method notifies the start of a general entity.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name     The name of the general entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void processingInstruction(String target, XMLString data, Augmentations augs)

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param target The target.
     * @param data   The data or null if none specified.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void comment(XMLString text, Augmentations augs) throws XNIException{

    /**
     * A comment.
     *
     * @param text   The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void doctypeDecl(String rootElement, String publicId, String systemId, Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement
     *                 The name of the root element.
     * @param publicId The public identifier if an external DTD or null
     *                 if the external DTD is specified using SYSTEM.
     * @param systemId The system identifier if an external DTD, null
     *                 otherwise.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void xmlDecl(String version, String encoding, String standalone, Augmentations augs)

    /**
     * Notifies of the presence of an XMLDecl line in the document. If
     * present, this method will be called immediately following the
     * startDocument call.
     *
     * @param version    The XML version.
     * @param encoding   The IANA encoding name of the document, or null if
     *                   not specified.
     * @param standalone The standalone value, or null if not specified.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public void startDocument(XMLLocator locator, String encoding,
                              NamespaceContext namespaceContext,
                              Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator  The document locator, or null if the document
     *                 location cannot be reported during the parsing
     *                 of this document. However, it is <em>strongly</em>
     *                 recommended that a locator be supplied that can
     *                 at least report the system identifier of the
     *                 document.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param namespaceContext
     *                 The namespace context in effect at the
     *                 start of this document.
     *                 This object represents the current context.
     *                 Implementors of this class are responsible
     *                 for copying the namespace bindings from the
     *                 the current context (and its parent contexts)
     *                 if that information is important.
     *
     * @param augs     Additional information that may include infoset augmentations
     * @exception XNIException
     *                   Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        public void setAugmentations(int attrIndex, Augmentations augs) {

        /**
         * Sets the augmentations of the attribute at the specified index.
         *
         * @param attrIndex The attribute index.
         * @param augs      The augmentations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
                public int addAttribute(QName qname, String attrType, String attrValue) {

                /**
         * This method adds default declarations
                 * @see com.sun.org.apache.xerces.internal.xni.XMLAttributes#addAttribute(QName, String, String)
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void reportDOMError(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
                        String message, short severity, String type ) {

    /**
     * Reports a DOM error to the user handler.
     *
     * If the error is fatal, the processing will be always aborted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isAttrValueWF(DOMErrorHandler errorHandler, DOMErrorImpl error,
            DOMLocatorImpl locator, NamedNodeMap attributes, Attr a, String value, boolean xml11Version) {

    /** NON-DOM: check if attribute value is well-formed
     * @param attributes
     * @param a
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isCommentWF(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
        String datavalue, boolean isXML11Version)

    /**
     * NON-DOM: check if value of the comment is well-formed
     * @param datavalue
     * @param isXML11Version = true if XML 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isXMLCharWF(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
        String datavalue, boolean isXML11Version)

    /**
     * NON-DOM: check for valid XML characters as per the XML version
     * @param datavalue
     * @param isXML11Version = true if XML 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final void isCDataWF(DOMErrorHandler errorHandler, DOMErrorImpl error, DOMLocatorImpl locator,
        String datavalue, boolean isXML11Version)

    /**
     * Check if CDATA section is well-formed
     * @param datavalue
     * @param isXML11Version = true if XML 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final void addNamespaceDecl(String prefix, String uri, ElementImpl element){

    /**
     * Adds a namespace attribute or replaces the value of existing namespace
     * attribute with the given prefix and value for URI.
     * In case prefix is empty will add/update default namespace declaration.
     *
     * @param prefix
     * @param uri
     * @exception IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected Node normalizeNode (Node node){

    /**
     *
     * This method acts as if the document was going through a save
     * and load cycle, putting the document in a "normal" form. The actual result
     * depends on the features being set and governing what operations actually
     * take place. See setNormalizationFeature for details. Noticeably this method
     * normalizes Text nodes, makes the document "namespace wellformed",
     * according to the algorithm described below in pseudo code, by adding missing
     * namespace declaration attributes and adding or changing namespace prefixes, updates
     * the replacement tree of EntityReference nodes,normalizes attribute values, etc.
     *
     * @param node   Modified node or null. If node is returned, we need
     *               to normalize again starting on the node returned.
     * @return  the normalized Node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
        protected void normalizeDocument(CoreDocumentImpl document, DOMConfigurationImpl config) {

    /**
     * Normalizes document.
     * Note: reset() must be called before this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    public static final RuntimeException abort = new RuntimeException();

    /**
     * If the user stops the process, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected Node fCurrentNode = null;

    /** for setting the PSVI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final DOMLocatorImpl fLocator = new DOMLocatorImpl();

    /** DOM Locator -  for namespace fixup algorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final ArrayList fAttributeList = new ArrayList(5);

    /** list of attributes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final NamespaceContext fLocalNSBinder = new NamespaceSupport();

    /** Stores all namespace bindings on the current element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final NamespaceContext fNamespaceContext = new NamespaceSupport();

    /** The namespace context of this document: stores namespaces in scope */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    private final DOMErrorImpl fError = new DOMErrorImpl();

    /**
     * Cached {@link DOMError} impl.
     * The same object is re-used to report multiple errors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected SymbolTable fSymbolTable;

    /** symbol table */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected RevalidationHandler fValidationHandler;

    /** Validation handler represents validator instance. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final static String PREFIX = "NS";

    /** prefix added by namespace fixup algorithm should follow a pattern "NS" + index*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final static boolean DEBUG_EVENTS = false;

    /** Debug document handler events */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
    protected final static boolean DEBUG_ND = false;

    /** Debug normalize document*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMNormalizer.java
public class DOMNormalizer implements XMLDocumentHandler {

/**
 * This class adds implementation for normalizeDocument method.
 * It acts as if the document was going through a save and load cycle, putting
 * the document in a "normal" form. The actual result depends on the features being set
 * and governing what operations actually take place. See setNormalizationFeature for details.
 * Noticeably this method normalizes Text nodes, makes the document "namespace wellformed",
 * according to the algorithm described below in pseudo code, by adding missing namespace
 * declaration attributes and adding or changing namespace prefixes, updates the replacement
 * tree of EntityReference nodes, normalizes attribute values, etc.
 * Mutation events, when supported, are generated to reflect the changes occuring on the
 * document.
 * See Namespace normalization for details on how namespace declaration attributes and prefixes
 * are normalized.
 *
 * NOTE: There is an initial support for DOM revalidation with XML Schema as a grammar.
 * The tree might not be validated correctly if entityReferences, CDATA sections are
 * present in the tree. The PSVI information is not exposed, normalized data (including element
 * default content is not available).
 *
 * @xerces.experimental
 *
 * @author Elena Litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @version $Id: DOMNormalizer.java,v 1.9 2010-11-01 04:39:38 joehw Exp $
 */
