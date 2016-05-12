_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void handleEndElement(QName element,  Augmentations augs, boolean isEmpty)

    /** Handle end element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean handleStartElement(QName element, XMLAttributes attributes, Augmentations augs)

    /** Handle element
     * @return true if validator is removed from the pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private void ensureStackCapacity (int newElementDepth) {

    /** ensure element stack capacity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void init() {

    /** initialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private String getAttributeTypeName(XMLAttributeDecl attrDecl) {

    /** convert attribute type from ints to strings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private void charDataInContent() {

    /** Character data in content. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int getContentSpecType(int elementIndex) {

    /** Returns the content spec type for an element index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
        }

            /****
            fErrorReporter.reportError(fErrorReporter.getLocator(),
                                       ImplementationMessages.XERCES_IMPLEMENTATION_DOMAIN,
                                       ImplementationMessages.VAL_CST,
                                       0,
                                       null,
                                       XMLErrorReporter.ERRORTYPE_FATAL_ERROR);
            /****/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
        }

            /****
            reportRecoverableXMLError(XMLMessages.MSG_ELEMENT_NOT_DECLARED,
                                      XMLMessages.VC_ELEMENT_VALID,
                                      elementType);
            /****/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int checkContent(int elementIndex,
                             QName[] children,
                             int childOffset,
                             int childCount) throws XNIException {

    /**
     * Check that the content of an element is valid.
     * <p>
     * This is the method of primary concern to the validator. This method is called
     * upon the scanner reaching the end tag of an element. At that time, the
     * element's children must be structurally validated, so it calls this method.
     * The index of the element being checked (in the decl pool), is provided as
     * well as an array of element name indexes of the children. The validator must
     * confirm that this element can have these children in this order.
     * <p>
     * This can also be called to do 'what if' testing of content models just to see
     * if they would be valid.
     * <p>
     * Note that the element index is an index into the element decl pool, whereas
     * the children indexes are name indexes, i.e. into the string pool.
     * <p>
     * A value of -1 in the children array indicates a PCDATA node. All other
     * indexes will be positive and represent child elements. The count can be
     * zero, since some elements have the EMPTY content model and that must be
     * confirmed.
     *
     * @param elementIndex The index within the <code>ElementDeclPool</code> of this
     *                     element.
     * @param childCount The number of entries in the <code>children</code> array.
     * @param children The children of this element.
     *
     * @return The value -1 if fully valid, else the 0 based index of the child
     *         that first failed. If the value returned is equal to the number
     *         of children, then additional content is required to reach a valid
     *         ending state.
     *
     * @exception Exception Thrown on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final void rootElementSpecified(QName rootElement) throws XNIException {

    /** Root element specified. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
        }

            /*** BUG #3512 ***
            int entityCount = attributes.getEntityCount(index);
            for (int j=0;  j < entityCount; j++) {
                int offset = attributes.getEntityOffset(index, j);
                int length = attributes.getEntityLength(index, j);
                if (offset < count-1) {
                    if (offset+length == count) {
                        length--;
                    }
                }
                else {
                    offset--;
                }
                attributes.setEntityOffset(index, j, offset);
                attributes.setEntityLength(index, j, length);
            }
            /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
                    }

                        /*** BUG #3512 ***
                        int entityCount = attributes.getEntityCount(index);
                        for (int j = 0;  j < entityCount; j++) {
                            int offset = attributes.getEntityOffset(index, j);
                            int length = attributes.getEntityLength(index, j);
                            if (offset <= i-eaten+1) {
                                if (offset+length >= i-eaten+1) {
                                    if (length > 0)
                                        length--;
                                }
                            }
                            else {
                                if (offset > 0)
                                    offset--;
                            }
                            attributes.setEntityOffset(index, j, offset);
                            attributes.setEntityLength(index, j, length);
                        }
                        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean normalizeAttrValue(XMLAttributes attributes, int index) {

    /**
     * Normalize the attribute value of a non CDATA attributes collapsing
     * sequences of space characters (x20)
     *
     * @param attributes The list of attributes
     * @param index The index of the attribute to normalize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean invalidStandaloneAttDef(QName element, QName attribute) {

    /** Returns true if invalid standalone attribute definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void validateDTDattribute(QName element, String attValue,
                                      XMLAttributeDecl attributeDecl)

    /**
     * Validate attributes in DTD fashion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected String getExternalEntityRefInAttrValue(String nonNormalizedValue) {

    /** Checks entities in attribute values for standalone VC. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void addDTDDefaultAttrsAndValidate(QName elementName, int elementIndex,
                                               XMLAttributes attributes)

    /** Add default attributes and validate. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startGeneralEntity(String name,
                                   XMLResourceIdentifier identifier,
                                   String encoding,
                                   Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text The content.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void doctypeDecl(String rootElement, String publicId, String systemId,
                            Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement The name of the root element.
     * @param publicId    The public identifier if an external DTD or null
     *                    if the external DTD is specified using SYSTEM.
     * @param systemId    The system identifier if an external DTD, null
     *                    otherwise.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startDocument(XMLLocator locator, String encoding,
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
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public XMLDocumentSource getDocumentSource (){

    /** Returns the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void setDocumentSource(XMLDocumentSource source){

    /** Sets the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the document handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /** Sets the document handler to receive information about the document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public XMLDTDValidator() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValNOTATION;

    /** Datatype validator: NOTATION. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValNMTOKENS;

    /** Datatype validator: NMTOKENS. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValNMTOKEN;

    /** Datatype validator: NMTOKEN. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValENTITIES;

    /** Datatype validator: ENTITIES. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValENTITY;

    /** Datatype validator: ENTITY. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValIDRefs;

    /** Datatype validator: IDREFS. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValIDRef;

    /** Datatype validator: IDREF. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValID;

    /** Datatype validator: ID. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final StringBuffer fBuffer = new StringBuffer();

    /** Temporary string buffers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final QName fTempQName = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final XMLEntityDecl fEntityDecl = new XMLEntityDecl();

    /** Temporary entity declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final XMLAttributeDecl fTempAttDecl = new XMLAttributeDecl();

    /** Temporary atribute declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private XMLElementDecl fTempElementDecl = new XMLElementDecl();

    /** Temporary element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean fInElementContent = false;

    /** True if inside of element content. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean fSeenRootElement = false;

    /** True if seen the root element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fElementDepth = -1;

    /** Element depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int[] fElementChildrenOffsetStack = new int[32];

    /**
     * Element children offset stack. This stack refers to offsets
     * into the <code>fElementChildren</code> array.
     * @see #fElementChildren
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fElementChildrenLength = 0;

    /** Element children count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private QName[] fElementChildren = new QName[32];

    /**
     * Element children. This data structure is a growing stack that
     * holds the children of elements from the root to the current
     * element depth. This structure never gets "deeper" than the
     * deepest element. Space is re-used once each element is closed.
     * <p>
     * <strong>Note:</strong> This is much more efficient use of memory
     * than creating new arrays for each element depth.
     * <p>
     * <strong>Note:</strong> The use of this data structure is for
     * validation "on the way out". If the validation model changes to
     * "on the way in", then this data structure is not needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private QName[] fElementQNamePartsStack = new QName[8];

    /** Element name stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int[] fContentSpecTypeStack = new int[8];

    /** Content spec type stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int[] fElementIndexStack = new int[8];

    /** Element index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final QName fRootElement = new QName();

    /** The root element name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fCurrentContentSpecType = -1;

    /** Current content spec type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fCurrentElementIndex = -1;

    /** Current element index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final QName fCurrentElement = new QName();

    /** Current element name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private String fSchemaType;

    /** Schema type: None, DTD, Schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean fPerformValidation;

    /** Perform validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fSeenDoctypeDecl = false;

    /** True if seen DOCTYPE declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DTDGrammar fDTDGrammar;

    /** DTD Grammar. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected XMLDocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DTDDVFactory fDatatypeValidatorFactory;

    /** Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected NamespaceContext fNamespaceContext = null;

    /** Namespace support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DTDGrammarBucket fGrammarBucket;

    /** Grammar bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fWarnDuplicateAttdef;

    /** warn on duplicate attribute definition, this feature works only when validation is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fBalanceSyntaxTrees;

    /** Controls whether the DTD grammar produces balanced syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fDynamicValidation;

    /**
     * Dynamic validation. This state of this feature is only useful when
     * the validation feature is set to <code>true</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fDTDValidation;

    /** Validation against only DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fValidation;

    /** Validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fNamespaces;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final boolean DEBUG_ELEMENT_CHILDREN = false;

    /** Compile to true to debug element children. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final boolean DEBUG_ATTRIBUTES = false;

    /** Compile to true to debug attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attdef */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String BALANCE_SYNTAX_TREES =

    /** Feature identifier: balance syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String DYNAMIC_VALIDATION =

    /** Feature identifier: dynamic validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    /** Top level scope (-1). */

    /** Symbol: "&lt;&lt;datatypes>>". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
public class XMLDTDValidator

/**
 * The DTD validator. The validator implements a document
 * filter: receiving document events from the scanner; validating
 * the content and structure; augmenting the InfoSet, if applicable;
 * and notifying the parser of the information resulting from the
 * validation process.
 * <p> Formerly, this component also handled DTD events and grammar construction.
 * To facilitate the development of a meaningful DTD grammar caching/preparsing
 * framework, this functionality has been moved into the XMLDTDLoader
 * class.  Therefore, this class no longer implements the DTDFilter
 * or DTDContentModelFilter interfaces.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/validation/dynamic</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *  <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Eric Ye, IBM
 * @author Andy Clark, IBM
 * @author Jeffrey Rodriguez IBM
 * @author Neil Graham, IBM
 *
 * @version $Id: XMLDTDValidator.java,v 1.8 2010-11-01 04:39:42 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void handleEndElement(QName element,  Augmentations augs, boolean isEmpty)

    /** Handle end element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean handleStartElement(QName element, XMLAttributes attributes, Augmentations augs)

    /** Handle element
     * @return true if validator is removed from the pipeline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private void ensureStackCapacity (int newElementDepth) {

    /** ensure element stack capacity */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void init() {

    /** initialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private String getAttributeTypeName(XMLAttributeDecl attrDecl) {

    /** convert attribute type from ints to strings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private void charDataInContent() {

    /** Character data in content. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int getContentSpecType(int elementIndex) {

    /** Returns the content spec type for an element index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
        }

            /****
            fErrorReporter.reportError(fErrorReporter.getLocator(),
                                       ImplementationMessages.XERCES_IMPLEMENTATION_DOMAIN,
                                       ImplementationMessages.VAL_CST,
                                       0,
                                       null,
                                       XMLErrorReporter.ERRORTYPE_FATAL_ERROR);
            /****/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
        }

            /****
            reportRecoverableXMLError(XMLMessages.MSG_ELEMENT_NOT_DECLARED,
                                      XMLMessages.VC_ELEMENT_VALID,
                                      elementType);
            /****/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int checkContent(int elementIndex,
                             QName[] children,
                             int childOffset,
                             int childCount) throws XNIException {

    /**
     * Check that the content of an element is valid.
     * <p>
     * This is the method of primary concern to the validator. This method is called
     * upon the scanner reaching the end tag of an element. At that time, the
     * element's children must be structurally validated, so it calls this method.
     * The index of the element being checked (in the decl pool), is provided as
     * well as an array of element name indexes of the children. The validator must
     * confirm that this element can have these children in this order.
     * <p>
     * This can also be called to do 'what if' testing of content models just to see
     * if they would be valid.
     * <p>
     * Note that the element index is an index into the element decl pool, whereas
     * the children indexes are name indexes, i.e. into the string pool.
     * <p>
     * A value of -1 in the children array indicates a PCDATA node. All other
     * indexes will be positive and represent child elements. The count can be
     * zero, since some elements have the EMPTY content model and that must be
     * confirmed.
     *
     * @param elementIndex The index within the <code>ElementDeclPool</code> of this
     *                     element.
     * @param childCount The number of entries in the <code>children</code> array.
     * @param children The children of this element.
     *
     * @return The value -1 if fully valid, else the 0 based index of the child
     *         that first failed. If the value returned is equal to the number
     *         of children, then additional content is required to reach a valid
     *         ending state.
     *
     * @exception Exception Thrown on error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final void rootElementSpecified(QName rootElement) throws XNIException {

    /** Root element specified. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
        }

            /*** BUG #3512 ***
            int entityCount = attributes.getEntityCount(index);
            for (int j=0;  j < entityCount; j++) {
                int offset = attributes.getEntityOffset(index, j);
                int length = attributes.getEntityLength(index, j);
                if (offset < count-1) {
                    if (offset+length == count) {
                        length--;
                    }
                }
                else {
                    offset--;
                }
                attributes.setEntityOffset(index, j, offset);
                attributes.setEntityLength(index, j, length);
            }
            /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
                    }

                        /*** BUG #3512 ***
                        int entityCount = attributes.getEntityCount(index);
                        for (int j = 0;  j < entityCount; j++) {
                            int offset = attributes.getEntityOffset(index, j);
                            int length = attributes.getEntityLength(index, j);
                            if (offset <= i-eaten+1) {
                                if (offset+length >= i-eaten+1) {
                                    if (length > 0)
                                        length--;
                                }
                            }
                            else {
                                if (offset > 0)
                                    offset--;
                            }
                            attributes.setEntityOffset(index, j, offset);
                            attributes.setEntityLength(index, j, length);
                        }
                        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean normalizeAttrValue(XMLAttributes attributes, int index) {

    /**
     * Normalize the attribute value of a non CDATA attributes collapsing
     * sequences of space characters (x20)
     *
     * @param attributes The list of attributes
     * @param index The index of the attribute to normalize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean invalidStandaloneAttDef(QName element, QName attribute) {

    /** Returns true if invalid standalone attribute definition. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void validateDTDattribute(QName element, String attValue,
                                      XMLAttributeDecl attributeDecl)

    /**
     * Validate attributes in DTD fashion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected String getExternalEntityRefInAttrValue(String nonNormalizedValue) {

    /** Checks entities in attribute values for standalone VC. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected void addDTDDefaultAttrsAndValidate(QName elementName, int elementIndex,
                                               XMLAttributes attributes)

    /** Add default attributes and validate. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endGeneralEntity(String name, Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startGeneralEntity(String name,
                                   XMLResourceIdentifier identifier,
                                   String encoding,
                                   Augmentations augs) throws XNIException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endDocument(Augmentations augs) throws XNIException {

    /**
     * The end of the document.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endCDATA(Augmentations augs) throws XNIException {

    /**
     * The end of a CDATA section.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startCDATA(Augmentations augs) throws XNIException {

    /**
     * The start of a CDATA section.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void endElement(QName element, Augmentations augs) throws XNIException {

    /**
     * The end of an element.
     *
     * @param element The name of the element.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void characters(XMLString text, Augmentations augs) throws XNIException {

    /**
     * Character content.
     *
     * @param text The content.
     *
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void emptyElement(QName element, XMLAttributes attributes, Augmentations augs)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs)

    /**
     * The start of an element.
     *
     * @param element    The name of the element.
     * @param attributes The element attributes.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void doctypeDecl(String rootElement, String publicId, String systemId,
                            Augmentations augs)

    /**
     * Notifies of the presence of the DOCTYPE line in the document.
     *
     * @param rootElement The name of the root element.
     * @param publicId    The public identifier if an external DTD or null
     *                    if the external DTD is specified using SYSTEM.
     * @param systemId    The system identifier if an external DTD, null
     *                    otherwise.
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void startDocument(XMLLocator locator, String encoding,
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
     * @param augs   Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public XMLDocumentSource getDocumentSource (){

    /** Returns the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void setDocumentSource(XMLDocumentSource source){

    /** Sets the document source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public XMLDocumentHandler getDocumentHandler() {

    /** Returns the document handler */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {

    /** Sets the document handler to receive information about the document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    public XMLDTDValidator() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValNOTATION;

    /** Datatype validator: NOTATION. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValNMTOKENS;

    /** Datatype validator: NMTOKENS. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValNMTOKEN;

    /** Datatype validator: NMTOKEN. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValENTITIES;

    /** Datatype validator: ENTITIES. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValENTITY;

    /** Datatype validator: ENTITY. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValIDRefs;

    /** Datatype validator: IDREFS. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValIDRef;

    /** Datatype validator: IDREF. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DatatypeValidator fValID;

    /** Datatype validator: ID. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final StringBuffer fBuffer = new StringBuffer();

    /** Temporary string buffers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final QName fTempQName = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final XMLEntityDecl fEntityDecl = new XMLEntityDecl();

    /** Temporary entity declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final XMLAttributeDecl fTempAttDecl = new XMLAttributeDecl();

    /** Temporary atribute declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private XMLElementDecl fTempElementDecl = new XMLElementDecl();

    /** Temporary element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean fInElementContent = false;

    /** True if inside of element content. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean fSeenRootElement = false;

    /** True if seen the root element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fElementDepth = -1;

    /** Element depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int[] fElementChildrenOffsetStack = new int[32];

    /**
     * Element children offset stack. This stack refers to offsets
     * into the <code>fElementChildren</code> array.
     * @see #fElementChildren
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fElementChildrenLength = 0;

    /** Element children count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private QName[] fElementChildren = new QName[32];

    /**
     * Element children. This data structure is a growing stack that
     * holds the children of elements from the root to the current
     * element depth. This structure never gets "deeper" than the
     * deepest element. Space is re-used once each element is closed.
     * <p>
     * <strong>Note:</strong> This is much more efficient use of memory
     * than creating new arrays for each element depth.
     * <p>
     * <strong>Note:</strong> The use of this data structure is for
     * validation "on the way out". If the validation model changes to
     * "on the way in", then this data structure is not needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private QName[] fElementQNamePartsStack = new QName[8];

    /** Element name stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int[] fContentSpecTypeStack = new int[8];

    /** Content spec type stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int[] fElementIndexStack = new int[8];

    /** Element index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final QName fRootElement = new QName();

    /** The root element name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fCurrentContentSpecType = -1;

    /** Current content spec type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private int fCurrentElementIndex = -1;

    /** Current element index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private final QName fCurrentElement = new QName();

    /** Current element name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private String fSchemaType;

    /** Schema type: None, DTD, Schema */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private boolean fPerformValidation;

    /** Perform validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fSeenDoctypeDecl = false;

    /** True if seen DOCTYPE declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DTDGrammar fDTDGrammar;

    /** DTD Grammar. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected XMLDocumentHandler fDocumentHandler;

    /** Document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DTDDVFactory fDatatypeValidatorFactory;

    /** Datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected NamespaceContext fNamespaceContext = null;

    /** Namespace support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected DTDGrammarBucket fGrammarBucket;

    /** Grammar bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fWarnDuplicateAttdef;

    /** warn on duplicate attribute definition, this feature works only when validation is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fBalanceSyntaxTrees;

    /** Controls whether the DTD grammar produces balanced syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fDynamicValidation;

    /**
     * Dynamic validation. This state of this feature is only useful when
     * the validation feature is set to <code>true</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fDTDValidation;

    /** Validation against only DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fValidation;

    /** Validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected boolean fNamespaces;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final boolean DEBUG_ELEMENT_CHILDREN = false;

    /** Compile to true to debug element children. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final boolean DEBUG_ATTRIBUTES = false;

    /** Compile to true to debug attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String DATATYPE_VALIDATOR_FACTORY =

    /** Property identifier: datatype validator factory. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String WARN_ON_DUPLICATE_ATTDEF =

    /** Feature identifier: warn on duplicate attdef */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String BALANCE_SYNTAX_TREES =

    /** Feature identifier: balance syntax trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String DYNAMIC_VALIDATION =

    /** Feature identifier: dynamic validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
    /** Top level scope (-1). */

    /** Symbol: "&lt;&lt;datatypes>>". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDValidator.java
public class XMLDTDValidator

/**
 * The DTD validator. The validator implements a document
 * filter: receiving document events from the scanner; validating
 * the content and structure; augmenting the InfoSet, if applicable;
 * and notifying the parser of the information resulting from the
 * validation process.
 * <p> Formerly, this component also handled DTD events and grammar construction.
 * To facilitate the development of a meaningful DTD grammar caching/preparsing
 * framework, this functionality has been moved into the XMLDTDLoader
 * class.  Therefore, this class no longer implements the DTDFilter
 * or DTDContentModelFilter interfaces.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/validation/dynamic</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *  <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Eric Ye, IBM
 * @author Andy Clark, IBM
 * @author Jeffrey Rodriguez IBM
 * @author Neil Graham, IBM
 *
 * @version $Id: XMLDTDValidator.java,v 1.8 2010-11-01 04:39:42 joehw Exp $
 */
