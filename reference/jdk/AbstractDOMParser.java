_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void abort () {

    /**
     * @see org.w3c.dom.ls.LSParser#abort()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endAttlist (Augmentations augs) throws XNIException {

    /**
     * The end of an attribute list.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startAttlist (String elementName, Augmentations augs) throws XNIException {

    /**
     * The start of an attribute list.
     *
     * @param elementName The name of the element that this attribute
     *                    list is associated with.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void attributeDecl (String elementName, String attributeName,
    String type, String[] enumeration,
    String defaultType, XMLString defaultValue,
    XMLString nonNormalizedDefaultValue, Augmentations augs) throws XNIException {

    /**
     * An attribute declaration.
     *
     * @param elementName   The name of the element that this attribute
     *                      is associated with.
     * @param attributeName The name of the attribute.
     * @param type          The attribute type. This value will be one of
     *                      the following: "CDATA", "ENTITY", "ENTITIES",
     *                      "ENUMERATION", "ID", "IDREF", "IDREFS",
     *                      "NMTOKEN", "NMTOKENS", or "NOTATION".
     * @param enumeration   If the type has the value "ENUMERATION" or
     *                      "NOTATION", this array holds the allowed attribute
     *                      values; otherwise, this array is null.
     * @param defaultType   The attribute default type. This value will be
     *                      one of the following: "#FIXED", "#IMPLIED",
     *                      "#REQUIRED", or null.
     * @param defaultValue  The attribute default value, or null if no
     *                      default value is specified.
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void elementDecl (String name, String contentModel, Augmentations augs)

    /**
     * An element declaration.
     *
     * @param name         The name of the element.
     * @param contentModel The element content model.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void ignoredCharacters (XMLString text, Augmentations augs) throws XNIException {

    /**
     * Characters within an IGNORE conditional section.
     *
     * @param text The ignored text.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void notationDecl (String name, XMLResourceIdentifier identifier,
    Augmentations augs) throws XNIException {

    /**
     * A notation declaration
     *
     * @param name     The name of the notation.
     * @param identifier    An object containing all location information
     *                      pertinent to this notation.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void unparsedEntityDecl (String name, XMLResourceIdentifier identifier,
    String notation, Augmentations augs)

    /**
     * An unparsed entity declaration.
     *
     * @param name     The name of the entity.
     * @param identifier    An object containing all location information
     *                      pertinent to this entity.
     * @param notation The name of the notation.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endParameterEntity (String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of a parameter entity. Parameter entity
     * names begin with a '%' character.
     *
     * @param name The name of the parameter entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startParameterEntity (String name,
    XMLResourceIdentifier identifier,
    String encoding,
    Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of a parameter entity. The parameter
     * entity name start with a '%' character.
     *
     * @param name     The name of the parameter entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal parameter entities).
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void externalEntityDecl (String name, XMLResourceIdentifier identifier,
    Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this notation.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void internalEntityDecl (String name, XMLString text,
    XMLString nonNormalizedText,
    Augmentations augs) throws XNIException {

    /**
     * An internal entity declaration.
     *
     * @param name The name of the entity. Parameter entity names start with
     *             '%', whereas the name of a general entity is just the
     *             entity name.
     * @param text The value of the entity.
     * @param nonNormalizedText The non-normalized value of the entity. This
     *             value contains the same sequence of characters that was in
     *             the internal entity declaration, without any entity
     *             references expanded.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endExternalSubset (Augmentations augs) throws XNIException {

    /**
     * The end of the DTD external subset.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startExternalSubset (XMLResourceIdentifier identifier,
    Augmentations augs) throws XNIException {

    /**
     * The start of the DTD external subset.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endConditional (Augmentations augs) throws XNIException {

    /**
     * The end of a conditional section.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startConditional (short type, Augmentations augs) throws XNIException  {

    /**
     * The start of a conditional section.
     *
     * @param type The type of the conditional section. This value will
     *             either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #CONDITIONAL_INCLUDE
     * @see #CONDITIONAL_IGNORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endDTD (Augmentations augs) throws XNIException {

    /**
     * The end of the DTD.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startDTD (XMLLocator locator, Augmentations augs) throws XNIException {

    /**
     * The start of the DTD.
     *
     * @param locator  The document locator, or null if the document
     *                 location cannot be reported during the parsing of
     *                 the document DTD. However, it is <em>strongly</em>
     *                 recommended that a locator be supplied that can
     *                 at least report the base system identifier of the
     *                 DTD.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final void handleBaseURI (int node){

    /**
     *
     * Record baseURI information for the Element (by adding xml:base attribute)
     * or for the ProcessingInstruction (by setting a baseURI field)
     * Deferred DOM.
     *
     * @param node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final void handleBaseURI (Node node){

    /**
     * Record baseURI information for the Element (by adding xml:base attribute)
     * or for the ProcessingInstruction (by setting a baseURI field)
     * Non deferred DOM.
     *
     * @param node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endGeneralEntity (String name, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endDocument (Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endCDATA (Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startCDATA (Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endElement (QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void ignorableWhitespace (XMLString text, Augmentations augs) throws XNIException {

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text The ignorable whitespace.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void characters (XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text The content.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void emptyElement (QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startElement (QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element. If the document specifies the start element
     * by using an empty tag, then the startElement method will immediately
     * be followed by the endElement method, with no intervening methods.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void doctypeDecl (String rootElement,
    String publicId, String systemId, Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement The name of the root element.
     * @param publicId    The public identifier if an external DTD or null
     *                    if the external DTD is specified using SYSTEM.
     * @param systemId    The system identifier if an external DTD, null
     *                    otherwise.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void xmlDecl (String version, String encoding, String standalone,
    Augmentations augs)

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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startDocument (XMLLocator locator, String encoding,
    NamespaceContext namespaceContext, Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator The system identifier of the entity if the entity
     *                 is external, null otherwise.
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void processingInstruction (String target, XMLString data, Augmentations augs)

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
     * @param augs       Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void comment (XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void textDecl (String version, String encoding, Augmentations augs) throws XNIException {

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
     * @param augs       Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startGeneralEntity (String name,
    XMLResourceIdentifier identifier,
    String encoding, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void setLocale (Locale locale) {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void reset () throws XNIException {

    /**
     * Resets the parser state.
     *
     * @throws SAXException Thrown on initialization error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public final void dropDocumentReferences() {

    /**
     * Drops all references to the last DOM which was built by this parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public Document getDocument () {

    /** Returns the DOM document object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected void setDocumentClassName (String documentClassName) {

    /**
     * This method allows the programmer to decide which document
     * factory to use when constructing the DOM tree. However, doing
     * so will lose the functionality of the default factory. Also,
     * a document class other than the default will lose the ability
     * to defer node expansion on the DOM tree produced.
     *
     * @param documentClassName The fully qualified class name of the
     *                      document factory to use when constructing
     *                      the DOM tree.
     *
     * @see #getDocumentClassName
     * @see #DEFAULT_DOCUMENT_CLASS_NAME
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected String getDocumentClassName () {

    /**
     * This method retrieves the name of current document class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected AbstractDOMParser (XMLParserConfiguration config) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private XMLLocator fLocator;

    /** Document locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private final QName fAttrQName = new QName();

    /** Attribute QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInEntityRef = false;

    /** LSParserFilter: true if inside entity reference */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Stack fSkippedElemStack = null;

    /** LSParserFilter: store depth of skipped elements */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected int fRejectedElementDepth = 0;

    /** LSParserFilter: tracks the element depth within a rejected subtree. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final Stack fBaseURIStack = new Stack ();

    /** Base uri stack*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fFilterReject = false;

    /** LSParserFilter: specifies that element with given QNAME and all its children
     * must be rejected */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fFirstChunk = false;

    /** True if saw the first chunk of characters*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInCDATASection;

    /** True if inside CDATA section. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Node fRoot;

    /** Root element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInDTDExternalSubset;

    /** True if inside DTD external subset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected StringBuilder fInternalSubset;

    /** Internal subset buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final StringBuilder fStringBuilder = new StringBuilder (50);

    /** Character buffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Node fCurrentNode;

    /** Current node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected DocumentType fDocumentType;

    /** The document type node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected String  fDocumentClassName;

    /** The document class name to use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fStorePSVI;

    /** Whether to store PSVI information in DOM tree. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected CoreDocumentImpl fDocumentImpl;

    /** The default Xerces document implementation, if used. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Document fDocument;

    /** The document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fCreateCDATANodes;

    /** Create cdata nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fIncludeComments;

    /** Include Comments. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fIncludeIgnorableWhitespace;

    /** Include ignorable whitespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fCreateEntityRefNodes;

    /** Create entity reference nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInDTD;

    /** True if inside DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected DOMErrorHandlerWrapper fErrorHandler = null;

    /** DOM L3 error handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    static final class Abort extends RuntimeException {

    /**
     * If the user stops the process, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String DEFAULT_DOCUMENT_CLASS_NAME =

    /** Default document class name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String DOCUMENT_CLASS_NAME =

    /** Property id: document class name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String DEFER_NODE_EXPANSION =

    /** Feature id: defer node expansion. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String INCLUDE_IGNORABLE_WHITESPACE =

    /** Feature id: include ignorable whitespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String CREATE_CDATA_NODES_FEATURE =

    /** Feature id: create cdata nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String INCLUDE_COMMENTS_FEATURE =

    /** Feature id: include comments. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String CREATE_ENTITY_REF_NODES =

    /** Feature id: create entity ref nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String NAMESPACES =

    /** Feature id: namespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
public class AbstractDOMParser extends AbstractXMLDocumentParser {

/**
 * This is the base class of all DOM parsers. It implements the XNI
 * callback methods to create the DOM tree. After a successful parse of
 * an XML document, the DOM Document object can be queried using the
 * <code>getDocument</code> method. The actual pipeline is defined in
 * parser configuration.
 *
 * @author Arnaud Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Elena Litani, IBM
 *
 * @version $Id: AbstractDOMParser.java,v 1.10 2010-11-01 04:40:09 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void abort () {

    /**
     * @see org.w3c.dom.ls.LSParser#abort()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endAttlist (Augmentations augs) throws XNIException {

    /**
     * The end of an attribute list.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startAttlist (String elementName, Augmentations augs) throws XNIException {

    /**
     * The start of an attribute list.
     *
     * @param elementName The name of the element that this attribute
     *                    list is associated with.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void attributeDecl (String elementName, String attributeName,
    String type, String[] enumeration,
    String defaultType, XMLString defaultValue,
    XMLString nonNormalizedDefaultValue, Augmentations augs) throws XNIException {

    /**
     * An attribute declaration.
     *
     * @param elementName   The name of the element that this attribute
     *                      is associated with.
     * @param attributeName The name of the attribute.
     * @param type          The attribute type. This value will be one of
     *                      the following: "CDATA", "ENTITY", "ENTITIES",
     *                      "ENUMERATION", "ID", "IDREF", "IDREFS",
     *                      "NMTOKEN", "NMTOKENS", or "NOTATION".
     * @param enumeration   If the type has the value "ENUMERATION" or
     *                      "NOTATION", this array holds the allowed attribute
     *                      values; otherwise, this array is null.
     * @param defaultType   The attribute default type. This value will be
     *                      one of the following: "#FIXED", "#IMPLIED",
     *                      "#REQUIRED", or null.
     * @param defaultValue  The attribute default value, or null if no
     *                      default value is specified.
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void elementDecl (String name, String contentModel, Augmentations augs)

    /**
     * An element declaration.
     *
     * @param name         The name of the element.
     * @param contentModel The element content model.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void ignoredCharacters (XMLString text, Augmentations augs) throws XNIException {

    /**
     * Characters within an IGNORE conditional section.
     *
     * @param text The ignored text.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void notationDecl (String name, XMLResourceIdentifier identifier,
    Augmentations augs) throws XNIException {

    /**
     * A notation declaration
     *
     * @param name     The name of the notation.
     * @param identifier    An object containing all location information
     *                      pertinent to this notation.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void unparsedEntityDecl (String name, XMLResourceIdentifier identifier,
    String notation, Augmentations augs)

    /**
     * An unparsed entity declaration.
     *
     * @param name     The name of the entity.
     * @param identifier    An object containing all location information
     *                      pertinent to this entity.
     * @param notation The name of the notation.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endParameterEntity (String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of a parameter entity. Parameter entity
     * names begin with a '%' character.
     *
     * @param name The name of the parameter entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startParameterEntity (String name,
    XMLResourceIdentifier identifier,
    String encoding,
    Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of a parameter entity. The parameter
     * entity name start with a '%' character.
     *
     * @param name     The name of the parameter entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal parameter entities).
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void externalEntityDecl (String name, XMLResourceIdentifier identifier,
    Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this notation.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void internalEntityDecl (String name, XMLString text,
    XMLString nonNormalizedText,
    Augmentations augs) throws XNIException {

    /**
     * An internal entity declaration.
     *
     * @param name The name of the entity. Parameter entity names start with
     *             '%', whereas the name of a general entity is just the
     *             entity name.
     * @param text The value of the entity.
     * @param nonNormalizedText The non-normalized value of the entity. This
     *             value contains the same sequence of characters that was in
     *             the internal entity declaration, without any entity
     *             references expanded.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endExternalSubset (Augmentations augs) throws XNIException {

    /**
     * The end of the DTD external subset.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startExternalSubset (XMLResourceIdentifier identifier,
    Augmentations augs) throws XNIException {

    /**
     * The start of the DTD external subset.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endConditional (Augmentations augs) throws XNIException {

    /**
     * The end of a conditional section.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startConditional (short type, Augmentations augs) throws XNIException  {

    /**
     * The start of a conditional section.
     *
     * @param type The type of the conditional section. This value will
     *             either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #CONDITIONAL_INCLUDE
     * @see #CONDITIONAL_IGNORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endDTD (Augmentations augs) throws XNIException {

    /**
     * The end of the DTD.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startDTD (XMLLocator locator, Augmentations augs) throws XNIException {

    /**
     * The start of the DTD.
     *
     * @param locator  The document locator, or null if the document
     *                 location cannot be reported during the parsing of
     *                 the document DTD. However, it is <em>strongly</em>
     *                 recommended that a locator be supplied that can
     *                 at least report the base system identifier of the
     *                 DTD.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final void handleBaseURI (int node){

    /**
     *
     * Record baseURI information for the Element (by adding xml:base attribute)
     * or for the ProcessingInstruction (by setting a baseURI field)
     * Deferred DOM.
     *
     * @param node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final void handleBaseURI (Node node){

    /**
     * Record baseURI information for the Element (by adding xml:base attribute)
     * or for the ProcessingInstruction (by setting a baseURI field)
     * Non deferred DOM.
     *
     * @param node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endGeneralEntity (String name, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endDocument (Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endCDATA (Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startCDATA (Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void endElement (QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void ignorableWhitespace (XMLString text, Augmentations augs) throws XNIException {

    /**
     * Ignorable whitespace. For this method to be called, the document
     * source must have some way of determining that the text containing
     * only whitespace characters should be considered ignorable. For
     * example, the validator can determine if a length of whitespace
     * characters in the document are ignorable based on the element
     * content model.
     *
     * @param text The ignorable whitespace.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void characters (XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text The content.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void emptyElement (QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * An empty element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startElement (QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element. If the document specifies the start element
     * by using an empty tag, then the startElement method will immediately
     * be followed by the endElement method, with no intervening methods.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void doctypeDecl (String rootElement,
    String publicId, String systemId, Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement The name of the root element.
     * @param publicId    The public identifier if an external DTD or null
     *                    if the external DTD is specified using SYSTEM.
     * @param systemId    The system identifier if an external DTD, null
     *                    otherwise.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void xmlDecl (String version, String encoding, String standalone,
    Augmentations augs)

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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startDocument (XMLLocator locator, String encoding,
    NamespaceContext namespaceContext, Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator The system identifier of the entity if the entity
     *                 is external, null otherwise.
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void processingInstruction (String target, XMLString data, Augmentations augs)

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
     * @param augs       Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void comment (XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs       Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void textDecl (String version, String encoding, Augmentations augs) throws XNIException {

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
     * @param augs       Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void startGeneralEntity (String name,
    XMLResourceIdentifier identifier,
    String encoding, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void setLocale (Locale locale) {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public void reset () throws XNIException {

    /**
     * Resets the parser state.
     *
     * @throws SAXException Thrown on initialization error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public final void dropDocumentReferences() {

    /**
     * Drops all references to the last DOM which was built by this parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    public Document getDocument () {

    /** Returns the DOM document object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected void setDocumentClassName (String documentClassName) {

    /**
     * This method allows the programmer to decide which document
     * factory to use when constructing the DOM tree. However, doing
     * so will lose the functionality of the default factory. Also,
     * a document class other than the default will lose the ability
     * to defer node expansion on the DOM tree produced.
     *
     * @param documentClassName The fully qualified class name of the
     *                      document factory to use when constructing
     *                      the DOM tree.
     *
     * @see #getDocumentClassName
     * @see #DEFAULT_DOCUMENT_CLASS_NAME
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected String getDocumentClassName () {

    /**
     * This method retrieves the name of current document class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected AbstractDOMParser (XMLParserConfiguration config) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private XMLLocator fLocator;

    /** Document locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private final QName fAttrQName = new QName();

    /** Attribute QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInEntityRef = false;

    /** LSParserFilter: true if inside entity reference */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Stack fSkippedElemStack = null;

    /** LSParserFilter: store depth of skipped elements */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected int fRejectedElementDepth = 0;

    /** LSParserFilter: tracks the element depth within a rejected subtree. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final Stack fBaseURIStack = new Stack ();

    /** Base uri stack*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fFilterReject = false;

    /** LSParserFilter: specifies that element with given QNAME and all its children
     * must be rejected */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fFirstChunk = false;

    /** True if saw the first chunk of characters*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInCDATASection;

    /** True if inside CDATA section. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Node fRoot;

    /** Root element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInDTDExternalSubset;

    /** True if inside DTD external subset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected StringBuilder fInternalSubset;

    /** Internal subset buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected final StringBuilder fStringBuilder = new StringBuilder (50);

    /** Character buffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Node fCurrentNode;

    /** Current node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected DocumentType fDocumentType;

    /** The document type node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected String  fDocumentClassName;

    /** The document class name to use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fStorePSVI;

    /** Whether to store PSVI information in DOM tree. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected CoreDocumentImpl fDocumentImpl;

    /** The default Xerces document implementation, if used. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected Document fDocument;

    /** The document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fCreateCDATANodes;

    /** Create cdata nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fIncludeComments;

    /** Include Comments. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fIncludeIgnorableWhitespace;

    /** Include ignorable whitespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fCreateEntityRefNodes;

    /** Create entity reference nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected boolean fInDTD;

    /** True if inside DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected DOMErrorHandlerWrapper fErrorHandler = null;

    /** DOM L3 error handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    static final class Abort extends RuntimeException {

    /**
     * If the user stops the process, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String DEFAULT_DOCUMENT_CLASS_NAME =

    /** Default document class name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String DOCUMENT_CLASS_NAME =

    /** Property id: document class name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String DEFER_NODE_EXPANSION =

    /** Feature id: defer node expansion. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String INCLUDE_IGNORABLE_WHITESPACE =

    /** Feature id: include ignorable whitespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String CREATE_CDATA_NODES_FEATURE =

    /** Feature id: create cdata nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String INCLUDE_COMMENTS_FEATURE =

    /** Feature id: include comments. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String CREATE_ENTITY_REF_NODES =

    /** Feature id: create entity ref nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
    protected static final String NAMESPACES =

    /** Feature id: namespace. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractDOMParser.java
public class AbstractDOMParser extends AbstractXMLDocumentParser {

/**
 * This is the base class of all DOM parsers. It implements the XNI
 * callback methods to create the DOM tree. After a successful parse of
 * an XML document, the DOM Document object can be queried using the
 * <code>getDocument</code> method. The actual pipeline is defined in
 * parser configuration.
 *
 * @author Arnaud Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Elena Litani, IBM
 *
 * @version $Id: AbstractDOMParser.java,v 1.10 2010-11-01 04:40:09 joehw Exp $
 */
