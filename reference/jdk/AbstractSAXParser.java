_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public void setAttributes(XMLAttributes attributes) {

        /** Sets the XML attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        protected XMLAttributes fAttributes;

        /** XML attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public int getColumnNumber() {

        /** Column number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public int getLineNumber() {

        /** Line number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public String getSystemId() {

        /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public String getPublicId() {

        /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public LocatorProxy(XMLLocator locator) {

        /** Constructs an XML locator proxy. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        protected XMLLocator fLocator;

        /** XML locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void reset() throws XNIException {

    /**
     * Reset all components before parsing.
     *
     * @throws XNIException Thrown if an error occurs during initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected final void endNamespaceMapping() throws SAXException {

    /**
     * Send endPrefixMapping events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected final void startNamespaceMapping() throws SAXException{

    /**
     * Send startPrefixMapping events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected LexicalHandler getLexicalHandler()

    /**
     * Returns the lexical handler.
     *
     * @see #setLexicalHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected void setLexicalHandler(LexicalHandler handler)

    /**
     * Set the lexical event handler.
     * <p>
     * This method is the equivalent to the property:
     * <pre>
     * http://xml.org/sax/properties/lexical-handler
     * </pre>
     *
     * @param handler lexical event handler
     *
     * @see #getLexicalHandler
     * @see #setProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected DeclHandler getDeclHandler()

    /**
     * Returns the DTD declaration event handler.
     *
     * @see #setDeclHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected void setDeclHandler(DeclHandler handler)

    /**
     * Set the DTD declaration event handler.
     * <p>
     * This method is the equivalent to the property:
     * <pre>
     * http://xml.org/sax/properties/declaration-handler
     * </pre>
     *
     * @param handler The new handler.
     *
     * @see #getDeclHandler
     * @see #setProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public Object getProperty(String propertyId)

    /**
     * Query the value of a property.
     *
     * Return the current value of a property in a SAX2 parser.
     * The parser might not recognize the property.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     * @return The current value of the property.
     * @exception org.xml.sax.SAXNotRecognizedException If the
     *            requested property is not known.
     * @exception SAXNotSupportedException If the
     *            requested property is known but not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setProperty(String propertyId, Object value)

    /**
     * Set the value of any property in a SAX2 parser.  The parser
     * might not recognize the property, and if it does recognize
     * it, it might not support the requested value.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     * @param value The value to which the property is being set.
     *
     * @exception SAXNotRecognizedException If the
     *            requested property is not known.
     * @exception SAXNotSupportedException If the
     *            requested property is known, but the requested
     *            value is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public boolean getFeature(String featureId)

    /**
     * Query the state of a feature.
     *
     * Query the current state of any feature in a SAX2 parser.  The
     * parser might not recognize the feature.
     *
     * @param featureId The unique identifier (URI) of the feature
     *                  being set.
     * @return The current state of the feature.
     * @exception org.xml.sax.SAXNotRecognizedException If the
     *            requested feature is not known.
     * @exception SAXNotSupportedException If the
     *            requested feature is known but not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setFeature(String featureId, boolean state)

    /**
     * Set the state of any feature in a SAX2 parser.  The parser
     * might not recognize the feature, and if it does recognize
     * it, it might not be able to fulfill the request.
     *
     * @param featureId The unique identifier (URI) of the feature.
     * @param state The requested state of the feature (true or false).
     *
     * @exception SAXNotRecognizedException If the
     *            requested feature is not known.
     * @exception SAXNotSupportedException If the
     *            requested feature is known, but the requested
     *            state is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public DTDHandler getDTDHandler() {

    /**
     * Return the current DTD handler.
     *
     * @return The current DTD handler, or null if none
     *         has been registered.
     * @see #setDTDHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public ContentHandler getContentHandler() {

    /**
     * Return the current content handler.
     *
     * @return The current content handler, or null if none
     *         has been registered.
     *
     * @see #setContentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setContentHandler(ContentHandler contentHandler) {

    /**
     * Allow an application to register a content event handler.
     * <p>
     * If the application does not register a content handler, all
     * content events reported by the SAX parser will be silently
     * ignored.
     * <p>
     * Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.
     *
     * @param contentHandler The content handler.
     *
     * @see #getContentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setDocumentHandler(DocumentHandler documentHandler) {

    /**
     * Allow an application to register a document event handler.
     * <p>
     * If the application does not register a document handler, all
     * document events reported by the SAX parser will be silently
     * ignored (this is the default behaviour implemented by
     * HandlerBase).
     * <p>
     * Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.
     *
     * @param documentHandler The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setDTDHandler(DTDHandler dtdHandler) {

    /**
     * Allow an application to register a DTD event handler.
     * <p>
     * If the application does not register a DTD handler, all DTD
     * events reported by the SAX parser will be silently ignored.
     * <p>
     * Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.
     *
     * @param dtdHandler The DTD handler.
     *

     * @see #getDTDHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setLocale(Locale locale) throws SAXException {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception SAXException An exception thrown if the parser does not
     *                         support the specified locale.
     *
     * @see org.xml.sax.Parser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public ErrorHandler getErrorHandler() {

    /**
     * Return the current error handler.
     *
     * @return The current error handler, or null if none
     *         has been registered.
     * @see #setErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setErrorHandler(ErrorHandler errorHandler) {

    /**
     * Allow an application to register an error event handler.
     *
     * <p>If the application does not register an error handler, all
     * error events reported by the SAX parser will be silently
     * ignored; however, normal processing may not continue.  It is
     * highly recommended that all SAX applications implement an
     * error handler to avoid unexpected bugs.</p>
     *
     * <p>Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.</p>
     *
     * @param errorHandler The error handler.
     * @see #getErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public EntityResolver getEntityResolver() {

    /**
     * Return the current entity resolver.
     *
     * @return The current entity resolver, or null if none
     *         has been registered.
     * @see #setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setEntityResolver(EntityResolver resolver) {

    /**
     * Sets the resolver used to resolve external entities. The EntityResolver
     * interface supports resolution of public and system identifiers.
     *
     * @param resolver The new entity resolver. Passing a null value will
     *                 uninstall the currently installed resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void parse(InputSource inputSource)

    /**
     * parse
     *
     * @param inputSource
     *
     * @exception org.xml.sax.SAXException
     * @exception java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void parse(String systemId) throws SAXException, IOException {

    /**
     * Parses the input source specified by the given system identifier.
     * <p>
     * This method is equivalent to the following:
     * <pre>
     *     parse(new InputSource(systemId));
     * </pre>
     *
     * @param systemId The system identifier (URI).
     *
     * @exception org.xml.sax.SAXException Throws exception on SAX error.
     * @exception java.io.IOException Throws exception on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endDTD(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void notationDecl(String name, XMLResourceIdentifier identifier,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void unparsedEntityDecl(String name, XMLResourceIdentifier identifier,
                                   String notation,
                                   Augmentations augs) throws XNIException {

    /**
     * An unparsed entity declaration.
     *
     * @param name     The name of the entity.
     * @param identifier    An object containing all location information
     *                      pertinent to this entity.
     * @param notation The name of the notation.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void externalEntityDecl(String name, XMLResourceIdentifier identifier,
                                   Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void internalEntityDecl(String name, XMLString text,
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
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void attributeDecl(String elementName, String attributeName,
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
     *
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void elementDecl(String name, String contentModel, Augmentations augs)

    /**
     * An element declaration.
     *
     * @param name         The name of the element.
     * @param contentModel The element content model.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endParameterEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entity
     * names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the end of the document entity by calling the
     * endEntity method with the entity name "[xml]" <em>after</em> calling
     * the endDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name The name of the parameter entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startParameterEntity(String name,
                                     XMLResourceIdentifier identifier,
                                     String encoding, Augmentations augs)

    /**
     * This method notifies of the start of parameter entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entity names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the start of the document entity by calling the
     * startEntity method with the entity name "[xml]" <em>before</em> calling
     * the startDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endExternalSubset(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startExternalSubset(XMLResourceIdentifier identifier,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startCDATA(Augmentations augs) throws XNIException {

        /**
     * The start of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entity
     * names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the end of the document entity by calling the
     * endEntity method with the entity name "[xml]" <em>after</em> calling
     * the endDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name The name of the entity.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startGeneralEntity(String name, XMLResourceIdentifier identifier,
                                   String encoding, Augmentations augs)

        /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entity names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the start of the document entity by calling the
     * startEntity method with the entity name "[xml]" <em>before</em> calling
     * the startDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal parameter entities).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void doctypeDecl(String rootElement,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
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
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startDocument(XMLLocator locator, String encoding,
                              NamespaceContext namespaceContext, Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator The document locator, or null if the document
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected AbstractSAXParser(XMLParserConfiguration config) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected LexicalHandler fLexicalHandler;

    /** Lexical handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected DeclHandler fDeclHandler;

    /** Decl handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected org.xml.sax.DTDHandler fDTDHandler;

    /** DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected NamespaceContext fNamespaceContext;

    /** Namespace context */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected DocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected ContentHandler fContentHandler;

    /** Content handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fXMLNSURIs = false;

    /**
     * XMLNS URIs: Namespace declarations in the
     * http://www.w3.org/2000/xmlns/ namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fUseEntityResolver2 = true;

    /** Use EntityResolver2. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fResolveDTDURIs = true;

    /** Resolve DTD URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fStandalone;

    /** Standalone document declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fLexicalHandlerParameterEntities = true;

    /** Lexical handler parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fNamespacePrefixes = false;

    /** Namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fNamespaces;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    private static final String SECURITY_MANAGER =

    /** Property id: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String DOM_NODE =

    /** Property id: DOM node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String DECLARATION_HANDLER =

    /** Property id: declaration handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String LEXICAL_HANDLER =

    /** Property id: lexical handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    // this is not meant to be a recognized feature, but we need it here to use

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String STRING_INTERNING =

    /** Feature id: string interning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String NAMESPACE_PREFIXES =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
public abstract class AbstractSAXParser

/**
 * This is the base class of all SAX parsers. It implements both the
 * SAX1 and SAX2 parser functionality, while the actual pipeline is
 * defined in the parser configuration.
 *
 * @author Arnaud Le Hors, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: AbstractSAXParser.java,v 1.6 2010-11-01 04:40:09 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public void setAttributes(XMLAttributes attributes) {

        /** Sets the XML attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        protected XMLAttributes fAttributes;

        /** XML attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public int getColumnNumber() {

        /** Column number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public int getLineNumber() {

        /** Line number. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public String getSystemId() {

        /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public String getPublicId() {

        /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        public LocatorProxy(XMLLocator locator) {

        /** Constructs an XML locator proxy. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
        protected XMLLocator fLocator;

        /** XML locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void reset() throws XNIException {

    /**
     * Reset all components before parsing.
     *
     * @throws XNIException Thrown if an error occurs during initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected final void endNamespaceMapping() throws SAXException {

    /**
     * Send endPrefixMapping events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected final void startNamespaceMapping() throws SAXException{

    /**
     * Send startPrefixMapping events
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected LexicalHandler getLexicalHandler()

    /**
     * Returns the lexical handler.
     *
     * @see #setLexicalHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected void setLexicalHandler(LexicalHandler handler)

    /**
     * Set the lexical event handler.
     * <p>
     * This method is the equivalent to the property:
     * <pre>
     * http://xml.org/sax/properties/lexical-handler
     * </pre>
     *
     * @param handler lexical event handler
     *
     * @see #getLexicalHandler
     * @see #setProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected DeclHandler getDeclHandler()

    /**
     * Returns the DTD declaration event handler.
     *
     * @see #setDeclHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected void setDeclHandler(DeclHandler handler)

    /**
     * Set the DTD declaration event handler.
     * <p>
     * This method is the equivalent to the property:
     * <pre>
     * http://xml.org/sax/properties/declaration-handler
     * </pre>
     *
     * @param handler The new handler.
     *
     * @see #getDeclHandler
     * @see #setProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public Object getProperty(String propertyId)

    /**
     * Query the value of a property.
     *
     * Return the current value of a property in a SAX2 parser.
     * The parser might not recognize the property.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     * @return The current value of the property.
     * @exception org.xml.sax.SAXNotRecognizedException If the
     *            requested property is not known.
     * @exception SAXNotSupportedException If the
     *            requested property is known but not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setProperty(String propertyId, Object value)

    /**
     * Set the value of any property in a SAX2 parser.  The parser
     * might not recognize the property, and if it does recognize
     * it, it might not support the requested value.
     *
     * @param propertyId The unique identifier (URI) of the property
     *                   being set.
     * @param value The value to which the property is being set.
     *
     * @exception SAXNotRecognizedException If the
     *            requested property is not known.
     * @exception SAXNotSupportedException If the
     *            requested property is known, but the requested
     *            value is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public boolean getFeature(String featureId)

    /**
     * Query the state of a feature.
     *
     * Query the current state of any feature in a SAX2 parser.  The
     * parser might not recognize the feature.
     *
     * @param featureId The unique identifier (URI) of the feature
     *                  being set.
     * @return The current state of the feature.
     * @exception org.xml.sax.SAXNotRecognizedException If the
     *            requested feature is not known.
     * @exception SAXNotSupportedException If the
     *            requested feature is known but not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setFeature(String featureId, boolean state)

    /**
     * Set the state of any feature in a SAX2 parser.  The parser
     * might not recognize the feature, and if it does recognize
     * it, it might not be able to fulfill the request.
     *
     * @param featureId The unique identifier (URI) of the feature.
     * @param state The requested state of the feature (true or false).
     *
     * @exception SAXNotRecognizedException If the
     *            requested feature is not known.
     * @exception SAXNotSupportedException If the
     *            requested feature is known, but the requested
     *            state is not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public DTDHandler getDTDHandler() {

    /**
     * Return the current DTD handler.
     *
     * @return The current DTD handler, or null if none
     *         has been registered.
     * @see #setDTDHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public ContentHandler getContentHandler() {

    /**
     * Return the current content handler.
     *
     * @return The current content handler, or null if none
     *         has been registered.
     *
     * @see #setContentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setContentHandler(ContentHandler contentHandler) {

    /**
     * Allow an application to register a content event handler.
     * <p>
     * If the application does not register a content handler, all
     * content events reported by the SAX parser will be silently
     * ignored.
     * <p>
     * Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.
     *
     * @param contentHandler The content handler.
     *
     * @see #getContentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setDocumentHandler(DocumentHandler documentHandler) {

    /**
     * Allow an application to register a document event handler.
     * <p>
     * If the application does not register a document handler, all
     * document events reported by the SAX parser will be silently
     * ignored (this is the default behaviour implemented by
     * HandlerBase).
     * <p>
     * Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.
     *
     * @param documentHandler The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setDTDHandler(DTDHandler dtdHandler) {

    /**
     * Allow an application to register a DTD event handler.
     * <p>
     * If the application does not register a DTD handler, all DTD
     * events reported by the SAX parser will be silently ignored.
     * <p>
     * Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.
     *
     * @param dtdHandler The DTD handler.
     *

     * @see #getDTDHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setLocale(Locale locale) throws SAXException {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception SAXException An exception thrown if the parser does not
     *                         support the specified locale.
     *
     * @see org.xml.sax.Parser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public ErrorHandler getErrorHandler() {

    /**
     * Return the current error handler.
     *
     * @return The current error handler, or null if none
     *         has been registered.
     * @see #setErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setErrorHandler(ErrorHandler errorHandler) {

    /**
     * Allow an application to register an error event handler.
     *
     * <p>If the application does not register an error handler, all
     * error events reported by the SAX parser will be silently
     * ignored; however, normal processing may not continue.  It is
     * highly recommended that all SAX applications implement an
     * error handler to avoid unexpected bugs.</p>
     *
     * <p>Applications may register a new or different handler in the
     * middle of a parse, and the SAX parser must begin using the new
     * handler immediately.</p>
     *
     * @param errorHandler The error handler.
     * @see #getErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public EntityResolver getEntityResolver() {

    /**
     * Return the current entity resolver.
     *
     * @return The current entity resolver, or null if none
     *         has been registered.
     * @see #setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void setEntityResolver(EntityResolver resolver) {

    /**
     * Sets the resolver used to resolve external entities. The EntityResolver
     * interface supports resolution of public and system identifiers.
     *
     * @param resolver The new entity resolver. Passing a null value will
     *                 uninstall the currently installed resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void parse(InputSource inputSource)

    /**
     * parse
     *
     * @param inputSource
     *
     * @exception org.xml.sax.SAXException
     * @exception java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void parse(String systemId) throws SAXException, IOException {

    /**
     * Parses the input source specified by the given system identifier.
     * <p>
     * This method is equivalent to the following:
     * <pre>
     *     parse(new InputSource(systemId));
     * </pre>
     *
     * @param systemId The system identifier (URI).
     *
     * @exception org.xml.sax.SAXException Throws exception on SAX error.
     * @exception java.io.IOException Throws exception on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endDTD(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void notationDecl(String name, XMLResourceIdentifier identifier,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void unparsedEntityDecl(String name, XMLResourceIdentifier identifier,
                                   String notation,
                                   Augmentations augs) throws XNIException {

    /**
     * An unparsed entity declaration.
     *
     * @param name     The name of the entity.
     * @param identifier    An object containing all location information
     *                      pertinent to this entity.
     * @param notation The name of the notation.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void externalEntityDecl(String name, XMLResourceIdentifier identifier,
                                   Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void internalEntityDecl(String name, XMLString text,
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
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void attributeDecl(String elementName, String attributeName,
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
     *
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void elementDecl(String name, String contentModel, Augmentations augs)

    /**
     * An element declaration.
     *
     * @param name         The name of the element.
     * @param contentModel The element content model.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endParameterEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entity
     * names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the end of the document entity by calling the
     * endEntity method with the entity name "[xml]" <em>after</em> calling
     * the endDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name The name of the parameter entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startParameterEntity(String name,
                                     XMLResourceIdentifier identifier,
                                     String encoding, Augmentations augs)

    /**
     * This method notifies of the start of parameter entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entity names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the start of the document entity by calling the
     * startEntity method with the entity name "[xml]" <em>before</em> calling
     * the startDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endExternalSubset(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startExternalSubset(XMLResourceIdentifier identifier,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startCDATA(Augmentations augs) throws XNIException {

        /**
     * The start of a CDATA section.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void ignorableWhitespace(XMLString text, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entity
     * names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the end of the document entity by calling the
     * endEntity method with the entity name "[xml]" <em>after</em> calling
     * the endDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name The name of the entity.
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startGeneralEntity(String name, XMLResourceIdentifier identifier,
                                   String encoding, Augmentations augs)

        /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entity names are just the entity name.
     * <p>
     * <strong>Note:</strong> Since the document is an entity, the handler
     * will be notified of the start of the document entity by calling the
     * startEntity method with the entity name "[xml]" <em>before</em> calling
     * the startDocument method. When exposing entity boundaries through the
     * SAX API, the document entity is never reported, however.
     * <p>
     * <strong>Note:</strong> This method is not called for entity references
     * appearing as part of attribute values.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal parameter entities).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void doctypeDecl(String rootElement,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
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
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    public void startDocument(XMLLocator locator, String encoding,
                              NamespaceContext namespaceContext, Augmentations augs)

    /**
     * The start of the document.
     *
     * @param locator The document locator, or null if the document
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
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected AbstractSAXParser(XMLParserConfiguration config) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fParseInProgress = false;

    /**
     * True if a parse is in progress. This state is needed because
     * some features/properties cannot be set while parsing (e.g.
     * validation and namespaces).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected LexicalHandler fLexicalHandler;

    /** Lexical handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected DeclHandler fDeclHandler;

    /** Decl handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected org.xml.sax.DTDHandler fDTDHandler;

    /** DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected NamespaceContext fNamespaceContext;

    /** Namespace context */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected DocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected ContentHandler fContentHandler;

    /** Content handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fXMLNSURIs = false;

    /**
     * XMLNS URIs: Namespace declarations in the
     * http://www.w3.org/2000/xmlns/ namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fUseEntityResolver2 = true;

    /** Use EntityResolver2. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fResolveDTDURIs = true;

    /** Resolve DTD URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fStandalone;

    /** Standalone document declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fLexicalHandlerParameterEntities = true;

    /** Lexical handler parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fNamespacePrefixes = false;

    /** Namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected boolean fNamespaces;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    private static final String SECURITY_MANAGER =

    /** Property id: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String DOM_NODE =

    /** Property id: DOM node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String DECLARATION_HANDLER =

    /** Property id: declaration handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String LEXICAL_HANDLER =

    /** Property id: lexical handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    // this is not meant to be a recognized feature, but we need it here to use

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String STRING_INTERNING =

    /** Feature id: string interning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String NAMESPACE_PREFIXES =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/AbstractSAXParser.java
public abstract class AbstractSAXParser

/**
 * This is the base class of all SAX parsers. It implements both the
 * SAX1 and SAX2 parser functionality, while the actual pipeline is
 * defined in the parser configuration.
 *
 * @author Arnaud Le Hors, IBM
 * @author Andy Clark, IBM
 *
 * @version $Id: AbstractSAXParser.java,v 1.6 2010-11-01 04:40:09 joehw Exp $
 */
