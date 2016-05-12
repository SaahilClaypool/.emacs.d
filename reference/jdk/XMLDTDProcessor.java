_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private void checkDeclaredElements(DTDGrammar grammar, int elementIndex,
            int contentSpecIndex, XMLContentSpec contentSpec) {

    /**
     * Does a recursive (if necessary) check on the specified element's
     * content spec to make sure that all children refer to declared
     * elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private void checkDeclaredElements(DTDGrammar grammar) {

    /**
     * Checks that all elements referenced in content models have
     * been declared. This method calls out to the error handler
     * to indicate warnings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private boolean normalizeDefaultAttrValue(XMLString value) {

    /**
     * Normalize the attribute value of a non CDATA default attribute
     * collapsing sequences of space characters (x20)
     *
     * @param value The value to normalize
     * @return Whether the value was changed or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endContentModel(Augmentations augs) throws XNIException {

    /**
     * The end of a content model.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endGroup(Augmentations augs) throws XNIException {

    /**
     * The end of a group for mixed or children content models.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void occurrence(short occurrence, Augmentations augs)

    /**
     * The occurrence count for a child in a children content model or
     * for the mixed content model group.
     *
     * @param occurrence The occurrence count for the last element
     *                   or group.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #OCCURS_ZERO_OR_ONE
     * @see #OCCURS_ZERO_OR_MORE
     * @see #OCCURS_ONE_OR_MORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void separator(short separator, Augmentations augs)

    /**
     * The separator between choices or sequences of a mixed or children
     * content model.
     *
     * @param separator The type of children separator.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #SEPARATOR_CHOICE
     * @see #SEPARATOR_SEQUENCE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void element(String elementName, Augmentations augs) throws XNIException {

    /**
     * A referenced element in a mixed or children content model.
     *
     * @param elementName The name of the referenced element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void pcdata(Augmentations augs) {

    /**
     * The appearance of "#PCDATA" within a group signifying a
     * mixed content model. This method will be the first called
     * following the content model's <code>startGroup()</code>.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startGroup(Augmentations augs) throws XNIException {

    /**
     * A start of either a mixed or children content model. A mixed
     * content model will immediately be followed by a call to the
     * <code>pcdata()</code> method. A children content model will
     * contain additional groups and/or elements.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void empty(Augmentations augs) throws XNIException {

    /**
     * A content model of EMPTY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void any(Augmentations augs) throws XNIException {

    /**
     * A content model of ANY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #empty
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startContentModel(String elementName, Augmentations augs)

    /**
     * The start of a content model. Depending on the type of the content
     * model, specific methods may be called between the call to the
     * startContentModel method and the call to the endContentModel method.
     *
     * @param elementName The name of the element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endConditional(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startConditional(short type, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void externalEntityDecl(String name, XMLResourceIdentifier identifier,
                                   Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this external entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endAttlist(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startAttlist(String elementName, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void elementDecl(String name, String contentModel, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endParameterEntity(String name, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startParameterEntity(String name,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void textDecl(String version, String encoding, Augmentations augs) throws XNIException {

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startParameterEntity call.
     * <p>
     * <strong>Note:</strong> This method is only called for external
     * parameter entities referenced in the DTD.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void ignoredCharacters(XMLString text, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startDTD(XMLLocator locator, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static void checkStandaloneEntityRef(String name, DTDGrammar grammar,
                    XMLEntityDecl tempEntityDecl, XMLErrorReporter errorReporter) throws XNIException {

    /**
     * Check standalone entity reference.
     * Made static to make common between the validator and loader.
     *
     * @param name
     *@param grammar    grammar to which entity belongs
     * @param tempEntityDecl    empty entity declaration to put results in
     * @param errorReporter     error reporter to send errors to
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /**
     * Gets the DTD content model handler.
     *
     * @return dtdContentModelHandler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler dtdContentModelHandler) {

    /**
     * Sets the DTD content model handler.
     *
     * @param dtdContentModelHandler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public XMLDTDHandler getDTDHandler() {

    /**
     * Returns the DTD handler.
     *
     * @return The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public XMLDTDProcessor() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private HashMap fNotationEnumVals;

    /** NOTATION enumeration values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private HashMap fTableOfNOTATIONAttributeNames;

    /** NOTATION attribute names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private HashMap fTableOfIDAttributeNames;

    /** ID attribute names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final ArrayList fDTDElementDecls = new ArrayList();

    /** Element declarations in DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final ArrayList fMixedElementTypes = new ArrayList();

    /** Mixed element type "hash". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private String fDTDElementDeclName = null;

    /** DTD element declaration name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final HashMap fNDataDeclNotations = new HashMap();

    /** Notation declaration hash. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final XMLEntityDecl fEntityDecl = new XMLEntityDecl();

    /** Temporary entity declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private boolean fMixed;

    /** Mixed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fInDTDIgnore;

    /** True if in an ignore conditional section of the DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private boolean fPerformValidation;

    /** Perform validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected DTDGrammar fDTDGrammar;

    /** DTD Grammar. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDContentModelSource fDTDContentModelSource;

    /** DTD content model source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDSource fDTDSource;

    /** DTD source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDHandler fDTDHandler;

    /** DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected DTDGrammarBucket fGrammarBucket;

    /** Grammar bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fWarnOnUndeclaredElemdef;

    /** warn on undeclared element referenced in content model, this feature only works when valiation is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fWarnDuplicateAttdef;

    /** warn on duplicate attribute definition, this feature works only when validation is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fDTDValidation;

    /** Validation against only DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fValidation;

    /** Validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: validator . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String WARN_ON_UNDECLARED_ELEMDEF =

    /** Feature identifier: warn on undeclared element referenced in content model. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attdef */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final int TOP_LEVEL_SCOPE = -1;

    /** Top level scope (-1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
public class XMLDTDProcessor

/**
 * The DTD processor. The processor implements a DTD
 * filter: receiving DTD events from the DTD scanner; validating
 * the content and structure; building a grammar, if applicable;
 * and notifying the DTDHandler of the information resulting from the
 * process.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
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
 *
 * @version $Id: XMLDTDProcessor.java,v 1.5 2010-11-01 04:39:42 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private void checkDeclaredElements(DTDGrammar grammar, int elementIndex,
            int contentSpecIndex, XMLContentSpec contentSpec) {

    /**
     * Does a recursive (if necessary) check on the specified element's
     * content spec to make sure that all children refer to declared
     * elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private void checkDeclaredElements(DTDGrammar grammar) {

    /**
     * Checks that all elements referenced in content models have
     * been declared. This method calls out to the error handler
     * to indicate warnings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private boolean normalizeDefaultAttrValue(XMLString value) {

    /**
     * Normalize the attribute value of a non CDATA default attribute
     * collapsing sequences of space characters (x20)
     *
     * @param value The value to normalize
     * @return Whether the value was changed or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endContentModel(Augmentations augs) throws XNIException {

    /**
     * The end of a content model.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endGroup(Augmentations augs) throws XNIException {

    /**
     * The end of a group for mixed or children content models.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void occurrence(short occurrence, Augmentations augs)

    /**
     * The occurrence count for a child in a children content model or
     * for the mixed content model group.
     *
     * @param occurrence The occurrence count for the last element
     *                   or group.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #OCCURS_ZERO_OR_ONE
     * @see #OCCURS_ZERO_OR_MORE
     * @see #OCCURS_ONE_OR_MORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void separator(short separator, Augmentations augs)

    /**
     * The separator between choices or sequences of a mixed or children
     * content model.
     *
     * @param separator The type of children separator.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #SEPARATOR_CHOICE
     * @see #SEPARATOR_SEQUENCE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void element(String elementName, Augmentations augs) throws XNIException {

    /**
     * A referenced element in a mixed or children content model.
     *
     * @param elementName The name of the referenced element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void pcdata(Augmentations augs) {

    /**
     * The appearance of "#PCDATA" within a group signifying a
     * mixed content model. This method will be the first called
     * following the content model's <code>startGroup()</code>.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startGroup(Augmentations augs) throws XNIException {

    /**
     * A start of either a mixed or children content model. A mixed
     * content model will immediately be followed by a call to the
     * <code>pcdata()</code> method. A children content model will
     * contain additional groups and/or elements.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void empty(Augmentations augs) throws XNIException {

    /**
     * A content model of EMPTY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void any(Augmentations augs) throws XNIException {

    /**
     * A content model of ANY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #empty
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startContentModel(String elementName, Augmentations augs)

    /**
     * The start of a content model. Depending on the type of the content
     * model, specific methods may be called between the call to the
     * startContentModel method and the call to the endContentModel method.
     *
     * @param elementName The name of the element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endConditional(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startConditional(short type, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void externalEntityDecl(String name, XMLResourceIdentifier identifier,
                                   Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this external entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endAttlist(Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startAttlist(String elementName, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void elementDecl(String name, String contentModel, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void endParameterEntity(String name, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startParameterEntity(String name,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void textDecl(String version, String encoding, Augmentations augs) throws XNIException {

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startParameterEntity call.
     * <p>
     * <strong>Note:</strong> This method is only called for external
     * parameter entities referenced in the DTD.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void ignoredCharacters(XMLString text, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void startDTD(XMLLocator locator, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static void checkStandaloneEntityRef(String name, DTDGrammar grammar,
                    XMLEntityDecl tempEntityDecl, XMLErrorReporter errorReporter) throws XNIException {

    /**
     * Check standalone entity reference.
     * Made static to make common between the validator and loader.
     *
     * @param name
     *@param grammar    grammar to which entity belongs
     * @param tempEntityDecl    empty entity declaration to put results in
     * @param errorReporter     error reporter to send errors to
     *
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /**
     * Gets the DTD content model handler.
     *
     * @return dtdContentModelHandler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler dtdContentModelHandler) {

    /**
     * Sets the DTD content model handler.
     *
     * @param dtdContentModelHandler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public XMLDTDHandler getDTDHandler() {

    /**
     * Returns the DTD handler.
     *
     * @return The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    public XMLDTDProcessor() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private HashMap fNotationEnumVals;

    /** NOTATION enumeration values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private HashMap fTableOfNOTATIONAttributeNames;

    /** NOTATION attribute names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private HashMap fTableOfIDAttributeNames;

    /** ID attribute names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final ArrayList fDTDElementDecls = new ArrayList();

    /** Element declarations in DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final ArrayList fMixedElementTypes = new ArrayList();

    /** Mixed element type "hash". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private String fDTDElementDeclName = null;

    /** DTD element declaration name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final HashMap fNDataDeclNotations = new HashMap();

    /** Notation declaration hash. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private final XMLEntityDecl fEntityDecl = new XMLEntityDecl();

    /** Temporary entity declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private boolean fMixed;

    /** Mixed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fInDTDIgnore;

    /** True if in an ignore conditional section of the DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private boolean fPerformValidation;

    /** Perform validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected DTDGrammar fDTDGrammar;

    /** DTD Grammar. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDContentModelSource fDTDContentModelSource;

    /** DTD content model source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDSource fDTDSource;

    /** DTD source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLDTDHandler fDTDHandler;

    /** DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected DTDGrammarBucket fGrammarBucket;

    /** Grammar bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fWarnOnUndeclaredElemdef;

    /** warn on undeclared element referenced in content model, this feature only works when valiation is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fWarnDuplicateAttdef;

    /** warn on duplicate attribute definition, this feature works only when validation is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fDTDValidation;

    /** Validation against only DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected boolean fValidation;

    /** Validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String DTD_VALIDATOR =

    /** Property identifier: validator . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String WARN_ON_UNDECLARED_ELEMDEF =

    /** Feature identifier: warn on undeclared element referenced in content model. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attdef */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
    private static final int TOP_LEVEL_SCOPE = -1;

    /** Top level scope (-1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDProcessor.java
public class XMLDTDProcessor

/**
 * The DTD processor. The processor implements a DTD
 * filter: receiving DTD events from the DTD scanner; validating
 * the content and structure; building a grammar, if applicable;
 * and notifying the DTDHandler of the information resulting from the
 * process.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
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
 *
 * @version $Id: XMLDTDProcessor.java,v 1.5 2010-11-01 04:39:42 joehw Exp $
 */
