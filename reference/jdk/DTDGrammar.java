_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        public int[] type = new int[2];

        /** Left and right children types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        public QName[] qname = new QName[2];

        /** Left and right children names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        public int length = 0;

        /** Length. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static class ChildrenList {

    /**
     * Children list for <code>contentSpecTree</code> method.
     *
     * @xerces.internal
     *
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private void contentSpecTree(int contentSpecIndex,
                                 XMLContentSpec contentSpec,
                                 ChildrenList children) {

    /**
     * Build a vector of valid QNames from Content Spec
     * table.
     *
     * @param contentSpecIndex
     *               Content Spec index
     * @param vectorQName
     *               Array of QName
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private synchronized ContentModelValidator createChildModel(int contentSpecIndex) {

    /**
     * When the element has a 'CHILDREN' model, this method is called to
     * create the content model object. It looks for some special case simple
     * models and creates SimpleContentModel objects for those. For the rest
     * it creates the standard DFA style model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected void initializeContentModelStack() {

    /** Initialize content model stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int addContentSpecNode(short nodeType,
                                     int leftNodeIndex, int rightNodeIndex) {

    /**
     * Create an XMLContentSpec for a two child leaf
     *
     * @param nodeType the type of XMLContentSpec to create - from XMLContentSpec.CONTENTSPECNODE_*
     * @param leftNodeIndex handle to an XMLContentSpec
     * @param rightNodeIndex handle to an XMLContentSpec
     * @return handle to the newly create XMLContentSpec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int addUniqueLeafNode(String elementName) {

    /**
     * create an XMLContentSpec for a leaf
     *
     * @param   elementName  the name (Element) for the node
     * @return handle to the newly create XMLContentSpec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int addContentSpecNode(short nodeType, String nodeValue) {

    /**
     * Create an XMLContentSpec for a single non-leaf
     *
     * @param nodeType the type of XMLContentSpec to create - from XMLContentSpec.CONTENTSPECNODE_*
     * @param nodeValue handle to an XMLContentSpec
     * @return handle to the newly create XMLContentSpec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        XMLContentSpec  contentSpec = new XMLContentSpec();

        /***
        if ( contentSpecIndex == -1 )
            return null;
        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected ContentModelValidator getElementContentModelValidator(int elementDeclIndex) {

    /**
     * getElementContentModelValidator
     *
     * @param elementDeclIndex
     *
     * @return its ContentModelValidator if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected void addContentSpecToElement(XMLElementDecl elementDecl) {

    /**
     * Adds the content spec to the given element declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public String getContentSpecAsString(int elementDeclIndex){

    /**
     * getContentSpecAsString
     *
     * @param elementDeclIndex
     *
     * @return String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getContentSpecIndex(int elementDeclIndex) {

    /**
     * Returns the index to the content spec for the given element
     * declaration, or <code>-1</code> if the element declaration
     * index was invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getContentSpec(int contentSpecIndex, XMLContentSpec contentSpec) {

    /**
     * getContentSpec
     *
     * @param contentSpecIndex
     * @param contentSpec
     *
     * @return true if find the requested contentSpec node, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getNotationDecl(int notationDeclIndex, XMLNotationDecl notationDecl) {

    /**
     * getNotationDecl
     *
     * @param notationDeclIndex
     * @param notationDecl
     *
     * @return return true of getNotationDecl can fill notationDecl with information about
     * the notation at notationDeclIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getNotationDeclIndex(String notationDeclName) {

    /**
     * getNotationDeclIndex
     *
     * @param notationDeclName
     *
     * @return the index if found a notation with the name, otherwise -1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getEntityDecl(int entityDeclIndex, XMLEntityDecl entityDecl) {

    /**
     * getEntityDecl
     *
     * @param entityDeclIndex
     * @param entityDecl
     *
     * @return true if getEntityDecl was able to fill entityDecl with the contents of the entity
     * with index entityDeclIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getEntityDeclIndex(String entityDeclName) {

    /**
     * getEntityDeclIndex
     *
     * @param entityDeclName
     *
     * @return the index of the EntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean isCDATAAttribute(QName elName, QName atName) {

    /**
     * Returns whether the given attribute is of type CDATA or not
     *
     * @param elName The element name.
     * @param atName The attribute name.
     *
     * @return true if the attribute is of type CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getAttributeDecl(int attributeDeclIndex, XMLAttributeDecl attributeDecl) {

    /**
     * getAttributeDecl
     *
     * @param attributeDeclIndex
     * @param attributeDecl The values of this structure are set by this call.
     *
     * @return true if getAttributeDecl was able to fill in the value of attributeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getNextAttributeDeclIndex(int attributeDeclIndex) {

    /**
     * getNextAttributeDeclIndex
     *
     * @param attributeDeclIndex
     *
     * @return index of the next attribute of the attribute at attributeDeclIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getFirstAttributeDeclIndex(int elementDeclIndex) {

    /**
     * getFirstAttributeDeclIndex
     *
     * @param elementDeclIndex
     *
     * @return index of the first attribute for element declaration elementDeclIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getElementDecl(int elementDeclIndex,
                                  XMLElementDecl elementDecl) {

    /**
     * getElementDecl
     *
     * @param elementDeclIndex
     * @param elementDecl The values of this structure are set by this call.
     *
     * @return True if find the element, False otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
                public short getContentSpecType(int elementIndex){

                /** make separate function for getting contentSpecType of element.
      * we can avoid setting of the element values.
                */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getElementDeclIndex(QName elementDeclQName) {

    /** Returns the element decl index.
     * @param elementDeclQName qualilfied name of the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getElementDeclIndex(String elementDeclName) {

    /**
     * getElementDeclIndex
     *
     * @param elementDeclName
     *
     * @return index of the elementDeclName in scope
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getNextElementDeclIndex(int elementDeclIndex) {

    /**
     * Returns the next index of the element declaration following the
     * specified element declaration.
     *
     * @param elementDeclIndex The element declaration index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getFirstElementDeclIndex() {

    /**
     * Returns the index of the first element declaration. This index
     * is then used to query more information about the element declaration.
     *
     * @see #getNextElementDeclIndex
     * @see #getElementDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public SymbolTable getSymbolTable() {

    /** Returns the symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean isNamespaceAware() {

    /** Returns true if this grammar is namespace aware. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endContentModel(Augmentations augs) throws XNIException {}

    /**
     * The end of a content model.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void empty(Augmentations augs) throws XNIException {}

    /**
     * A content model of EMPTY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void any(Augmentations augs) throws XNIException {}

    /**
     * A content model of ANY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #empty
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endGroup(Augmentations augs) throws XNIException {

    /**
     * The end of a group for mixed or children content models.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void occurrence(short occurrence, Augmentations augs) throws XNIException {

    /**
     * The occurrence count for a child in a children content model or
     * for the mixed content model group.
     *
     * @param occurrence The occurrence count for the last element
     *                   or group.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void separator(short separator, Augmentations augs) throws XNIException {

    /**
     * The separator between choices or sequences of a mixed or children
     * content model.
     *
     * @param separator The type of children separator.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_CHOICE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_SEQUENCE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void pcdata(Augmentations augs) throws XNIException {

    /**
     * The appearance of "#PCDATA" within a group signifying a
     * mixed content model. This method will be the first called
     * following the content model's <code>startGroup()</code>.
     *
     *@param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startGroup(Augmentations augs) throws XNIException {

    /**
     * A start of either a mixed or children content model. A mixed
     * content model will immediately be followed by a call to the
     * <code>pcdata()</code> method. A children content model will
     * contain additional groups and/or elements.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startContentModel(String elementName, Augmentations augs)

    /**
     * The start of a content model. Depending on the type of the content
     * model, specific methods may be called between the call to the
     * startContentModel method and the call to the endContentModel method.
     *
     * @param elementName The name of the element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endConditional(Augmentations augs) throws XNIException {}

    /**
     * The end of a conditional section.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void ignoredCharacters(XMLString text, Augmentations augs)

    /**
     * Characters within an IGNORE conditional section.
     *
     * @param text The ignored text.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startConditional(short type, Augmentations augs)

    /**
     * The start of a conditional section.
     *
     * @param type The type of the conditional section. This value will
     *             either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see XMLDTDHandler#CONDITIONAL_INCLUDE
     * @see XMLDTDHandler#CONDITIONAL_IGNORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endAttlist(Augmentations augs) throws XNIException {}

    /**
     * The end of an attribute list.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startAttlist(String elementName, Augmentations augs)

    /**
     * The start of an attribute list.
     *
     * @param elementName The name of the element that this attribute
     *                    list is associated with.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void processingInstruction(String target, XMLString data,
                                      Augmentations augs) throws XNIException {}

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
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {}

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void textDecl(String version, String encoding, Augmentations augs)

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startEntity call.
     * <p>
     * <strong>Note:</strong> This method is only called for external
     * parameter entities referenced in the DTD.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endDTD(Augmentations augs) throws XNIException {

    /**
     * The end of the DTD.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void externalEntityDecl(String name,
                                   XMLResourceIdentifier identifier,
                                   Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this external entity declaration.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @param enumeration   If the type has the value "ENUMERATION", this
     *                      array holds the allowed attribute values;
     *                      otherwise, this array is null.
     * @param defaultType   The attribute default type. This value will be
     *                      one of the following: "#FIXED", "#IMPLIED",
     *                      "#REQUIRED", or null.
     * @param defaultValue  The attribute default value, or null if no
     *                      default value is specified.
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void elementDecl(String name, String contentModel, Augmentations augs)

    /**
     * An element declaration.
     *
     * @param name         The name of the element.
     * @param contentModel The element content model.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endParameterEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" and parameter entity names start with '%'.
     * <p>
     * <strong>Note:</strong> Since the DTD is an entity, the handler
     * will be notified of the end of the DTD entity by calling the
     * endEntity method with the entity name "[dtd]" <em>after</em> calling
     * the endDTD method.
     *
     * @param name The name of the entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startParameterEntity(String name,
                                     XMLResourceIdentifier identifier,
                                     String encoding,
                                     Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" and parameter entity names start with '%'.
     * <p>
     * <strong>Note:</strong> Since the DTD is an entity, the handler
     * will be notified of the start of the DTD entity by calling the
     * startParameterEntity method with the entity name "[dtd]" <em>before</em> calling
     * the startDTD method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getAttributeDeclIsExternal(int attributeDeclIndex) {

    /**
     * Returns true if the specified attribute declaration is external.
     *
     * @param attributeDeclIndex Attribute declaration index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getElementDeclIsExternal(int elementDeclIndex) {

    /**
     * Returns true if the specified element declaration is external.
     *
     * @param elementDeclIndex The element declaration index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public DTDGrammar(SymbolTable symbolTable, XMLDTDDescription desc) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fAttributeDeclIsExternal[][] = new int[INITIAL_CHUNK_COUNT][];

    /** flag if the AttributeDecl is External. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclIsExternal[][] = new int[INITIAL_CHUNK_COUNT][];

    /** flag if the elementDecl is External. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private boolean[] fPEntityStack = new boolean[4];

    /** Entity stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fDepth = 0;

    /** Stack depth   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int[] fPrevNodeIndexStack = null;

    /** Children content model previous node index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int[] fNodeIndexStack = null;

    /** Children content model index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private short[] fOpStack = null;

    /** Children content model operation stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    Map<String, XMLElementDecl> fElementDeclTab = new HashMap<>();

    /** table of XMLElementDecl   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLContentSpec fContentSpec = new XMLContentSpec();

    /** Content spec node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLSimpleType fSimpleType = new XMLSimpleType();

    /** Simple type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLEntityDecl fEntityDecl = new XMLEntityDecl();

    /** Entity declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLElementDecl fElementDecl = new XMLElementDecl();

    /** Element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected final XMLAttributeDecl fAttributeDecl = new XMLAttributeDecl();

    /** Temporary Attribute decl. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final QName fQName2 = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final QName fQName = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private boolean fMixed;

    /** Mixed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final Map<String, Integer> fNotationIndexMap = new HashMap<>();

    /** Notation index mapping table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final Map<String, Integer> fEntityIndexMap = new HashMap<>();

    /** Entity index mapping table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final Map<String, Integer> fElementIndexMap = new HashMap<>();

    /** Element index mapping table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private String[] fAttributeDeclEnumeration[][] = new String[INITIAL_CHUNK_COUNT][][];

    /** Attribute declaration enumeration values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private short fAttributeDeclType[][] = new short[INITIAL_CHUNK_COUNT][];

    /**
     * Attribute declaration type.
     * @see XMLAttributeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private QName fAttributeDeclName[][] = new QName[INITIAL_CHUNK_COUNT][];

    /** Attribute declaration name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fAttributeDeclCount = 0 ;

    /** Number of attribute declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclLastAttributeDeclIndex[][] = new int[INITIAL_CHUNK_COUNT][];

    /** Last attribute declaration of an element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclFirstAttributeDeclIndex[][] = new int[INITIAL_CHUNK_COUNT][];

    /** First attribute declaration of an element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private ContentModelValidator fElementDeclContentModelValidator[][] = new ContentModelValidator[INITIAL_CHUNK_COUNT][];

    /**
     * Element declaration content model validator. This validator is
     * constructed from the content spec nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclContentSpecIndex[][] = new int[INITIAL_CHUNK_COUNT][];

    /**
     * Element declaration content spec index. This index value is used
     * to refer to the content spec information tables.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private short fElementDeclType[][] = new short[INITIAL_CHUNK_COUNT][];

    /**
     * Element declaration type.
     * @see XMLElementDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private QName fElementDeclName[][] = new QName[INITIAL_CHUNK_COUNT][];

    /** Element declaration name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclCount = 0;

    /** Number of element declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected boolean fReadingExternalDTD = false;

    /** fReadingExternalDTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int fCurrentAttributeIndex;

    /** Current attribute index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int fCurrentElementIndex;

    /** Current element index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final boolean DEBUG = false;

    /** Debug DTDGrammar. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final short LIST_MASK = ~LIST_FLAG;

    /** List mask (~LIST_FLAG). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final short LIST_FLAG = 0x80;

    /** List flag (0x80). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int INITIAL_CHUNK_COUNT = (1 << (10 - CHUNK_SHIFT)); // 2^10 = 1k

    /** Initial chunk count (1 << (10 - CHUNK_SHIFT)). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int CHUNK_SIZE = (1 << CHUNK_SHIFT);

    /** Chunk size (1 << CHUNK_SHIFT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int CHUNK_SHIFT = 8; // 2^8 = 256

    /** Chunk shift (8). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public static final int TOP_LEVEL_SCOPE = -1;

    /** Top level scope (-1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
public class DTDGrammar

/**
 * A DTD grammar. This class implements the XNI handler interfaces
 * for DTD information so that it can build the appropriate validation
 * structures automatically from the callbacks.
 *
 * @xerces.internal
 *
 * @author Eric Ye, IBM
 * @author Jeffrey Rodriguez, IBM
 * @author Andy Clark, IBM
 * @author Neil Graham, IBM
 *
 * @version $Id: DTDGrammar.java,v 1.4 2010/08/11 07:18:37 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        public int[] type = new int[2];

        /** Left and right children types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        public QName[] qname = new QName[2];

        /** Left and right children names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        public int length = 0;

        /** Length. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static class ChildrenList {

    /**
     * Children list for <code>contentSpecTree</code> method.
     *
     * @xerces.internal
     *
     * @author Eric Ye, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private void contentSpecTree(int contentSpecIndex,
                                 XMLContentSpec contentSpec,
                                 ChildrenList children) {

    /**
     * Build a vector of valid QNames from Content Spec
     * table.
     *
     * @param contentSpecIndex
     *               Content Spec index
     * @param vectorQName
     *               Array of QName
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private synchronized ContentModelValidator createChildModel(int contentSpecIndex) {

    /**
     * When the element has a 'CHILDREN' model, this method is called to
     * create the content model object. It looks for some special case simple
     * models and creates SimpleContentModel objects for those. For the rest
     * it creates the standard DFA style model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected void initializeContentModelStack() {

    /** Initialize content model stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int addContentSpecNode(short nodeType,
                                     int leftNodeIndex, int rightNodeIndex) {

    /**
     * Create an XMLContentSpec for a two child leaf
     *
     * @param nodeType the type of XMLContentSpec to create - from XMLContentSpec.CONTENTSPECNODE_*
     * @param leftNodeIndex handle to an XMLContentSpec
     * @param rightNodeIndex handle to an XMLContentSpec
     * @return handle to the newly create XMLContentSpec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int addUniqueLeafNode(String elementName) {

    /**
     * create an XMLContentSpec for a leaf
     *
     * @param   elementName  the name (Element) for the node
     * @return handle to the newly create XMLContentSpec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int addContentSpecNode(short nodeType, String nodeValue) {

    /**
     * Create an XMLContentSpec for a single non-leaf
     *
     * @param nodeType the type of XMLContentSpec to create - from XMLContentSpec.CONTENTSPECNODE_*
     * @param nodeValue handle to an XMLContentSpec
     * @return handle to the newly create XMLContentSpec
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
        XMLContentSpec  contentSpec = new XMLContentSpec();

        /***
        if ( contentSpecIndex == -1 )
            return null;
        /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected ContentModelValidator getElementContentModelValidator(int elementDeclIndex) {

    /**
     * getElementContentModelValidator
     *
     * @param elementDeclIndex
     *
     * @return its ContentModelValidator if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected void addContentSpecToElement(XMLElementDecl elementDecl) {

    /**
     * Adds the content spec to the given element declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public String getContentSpecAsString(int elementDeclIndex){

    /**
     * getContentSpecAsString
     *
     * @param elementDeclIndex
     *
     * @return String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getContentSpecIndex(int elementDeclIndex) {

    /**
     * Returns the index to the content spec for the given element
     * declaration, or <code>-1</code> if the element declaration
     * index was invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getContentSpec(int contentSpecIndex, XMLContentSpec contentSpec) {

    /**
     * getContentSpec
     *
     * @param contentSpecIndex
     * @param contentSpec
     *
     * @return true if find the requested contentSpec node, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getNotationDecl(int notationDeclIndex, XMLNotationDecl notationDecl) {

    /**
     * getNotationDecl
     *
     * @param notationDeclIndex
     * @param notationDecl
     *
     * @return return true of getNotationDecl can fill notationDecl with information about
     * the notation at notationDeclIndex.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getNotationDeclIndex(String notationDeclName) {

    /**
     * getNotationDeclIndex
     *
     * @param notationDeclName
     *
     * @return the index if found a notation with the name, otherwise -1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getEntityDecl(int entityDeclIndex, XMLEntityDecl entityDecl) {

    /**
     * getEntityDecl
     *
     * @param entityDeclIndex
     * @param entityDecl
     *
     * @return true if getEntityDecl was able to fill entityDecl with the contents of the entity
     * with index entityDeclIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getEntityDeclIndex(String entityDeclName) {

    /**
     * getEntityDeclIndex
     *
     * @param entityDeclName
     *
     * @return the index of the EntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean isCDATAAttribute(QName elName, QName atName) {

    /**
     * Returns whether the given attribute is of type CDATA or not
     *
     * @param elName The element name.
     * @param atName The attribute name.
     *
     * @return true if the attribute is of type CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getAttributeDecl(int attributeDeclIndex, XMLAttributeDecl attributeDecl) {

    /**
     * getAttributeDecl
     *
     * @param attributeDeclIndex
     * @param attributeDecl The values of this structure are set by this call.
     *
     * @return true if getAttributeDecl was able to fill in the value of attributeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getNextAttributeDeclIndex(int attributeDeclIndex) {

    /**
     * getNextAttributeDeclIndex
     *
     * @param attributeDeclIndex
     *
     * @return index of the next attribute of the attribute at attributeDeclIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getFirstAttributeDeclIndex(int elementDeclIndex) {

    /**
     * getFirstAttributeDeclIndex
     *
     * @param elementDeclIndex
     *
     * @return index of the first attribute for element declaration elementDeclIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getElementDecl(int elementDeclIndex,
                                  XMLElementDecl elementDecl) {

    /**
     * getElementDecl
     *
     * @param elementDeclIndex
     * @param elementDecl The values of this structure are set by this call.
     *
     * @return True if find the element, False otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
                public short getContentSpecType(int elementIndex){

                /** make separate function for getting contentSpecType of element.
      * we can avoid setting of the element values.
                */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getElementDeclIndex(QName elementDeclQName) {

    /** Returns the element decl index.
     * @param elementDeclQName qualilfied name of the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getElementDeclIndex(String elementDeclName) {

    /**
     * getElementDeclIndex
     *
     * @param elementDeclName
     *
     * @return index of the elementDeclName in scope
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getNextElementDeclIndex(int elementDeclIndex) {

    /**
     * Returns the next index of the element declaration following the
     * specified element declaration.
     *
     * @param elementDeclIndex The element declaration index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public int getFirstElementDeclIndex() {

    /**
     * Returns the index of the first element declaration. This index
     * is then used to query more information about the element declaration.
     *
     * @see #getNextElementDeclIndex
     * @see #getElementDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public SymbolTable getSymbolTable() {

    /** Returns the symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean isNamespaceAware() {

    /** Returns true if this grammar is namespace aware. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endContentModel(Augmentations augs) throws XNIException {}

    /**
     * The end of a content model.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void empty(Augmentations augs) throws XNIException {}

    /**
     * A content model of EMPTY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void any(Augmentations augs) throws XNIException {}

    /**
     * A content model of ANY.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #empty
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endGroup(Augmentations augs) throws XNIException {

    /**
     * The end of a group for mixed or children content models.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void occurrence(short occurrence, Augmentations augs) throws XNIException {

    /**
     * The occurrence count for a child in a children content model or
     * for the mixed content model group.
     *
     * @param occurrence The occurrence count for the last element
     *                   or group.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void separator(short separator, Augmentations augs) throws XNIException {

    /**
     * The separator between choices or sequences of a mixed or children
     * content model.
     *
     * @param separator The type of children separator.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_CHOICE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_SEQUENCE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void pcdata(Augmentations augs) throws XNIException {

    /**
     * The appearance of "#PCDATA" within a group signifying a
     * mixed content model. This method will be the first called
     * following the content model's <code>startGroup()</code>.
     *
     *@param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startGroup(Augmentations augs) throws XNIException {

    /**
     * A start of either a mixed or children content model. A mixed
     * content model will immediately be followed by a call to the
     * <code>pcdata()</code> method. A children content model will
     * contain additional groups and/or elements.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startContentModel(String elementName, Augmentations augs)

    /**
     * The start of a content model. Depending on the type of the content
     * model, specific methods may be called between the call to the
     * startContentModel method and the call to the endContentModel method.
     *
     * @param elementName The name of the element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endConditional(Augmentations augs) throws XNIException {}

    /**
     * The end of a conditional section.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void ignoredCharacters(XMLString text, Augmentations augs)

    /**
     * Characters within an IGNORE conditional section.
     *
     * @param text The ignored text.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startConditional(short type, Augmentations augs)

    /**
     * The start of a conditional section.
     *
     * @param type The type of the conditional section. This value will
     *             either be CONDITIONAL_INCLUDE or CONDITIONAL_IGNORE.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see XMLDTDHandler#CONDITIONAL_INCLUDE
     * @see XMLDTDHandler#CONDITIONAL_IGNORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endAttlist(Augmentations augs) throws XNIException {}

    /**
     * The end of an attribute list.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startAttlist(String elementName, Augmentations augs)

    /**
     * The start of an attribute list.
     *
     * @param elementName The name of the element that this attribute
     *                    list is associated with.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void processingInstruction(String target, XMLString data,
                                      Augmentations augs) throws XNIException {}

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
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void comment(XMLString text, Augmentations augs) throws XNIException {}

    /**
     * A comment.
     *
     * @param text The text in the comment.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void textDecl(String version, String encoding, Augmentations augs)

    /**
     * Notifies of the presence of a TextDecl line in an entity. If present,
     * this method will be called immediately following the startEntity call.
     * <p>
     * <strong>Note:</strong> This method is only called for external
     * parameter entities referenced in the DTD.
     *
     * @param version  The XML version, or null if not specified.
     * @param encoding The IANA encoding name of the entity.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endDTD(Augmentations augs) throws XNIException {

    /**
     * The end of the DTD.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void externalEntityDecl(String name,
                                   XMLResourceIdentifier identifier,
                                   Augmentations augs) throws XNIException {

    /**
     * An external entity declaration.
     *
     * @param name     The name of the entity. Parameter entity names start
     *                 with '%', whereas the name of a general entity is just
     *                 the entity name.
     * @param identifier    An object containing all location information
     *                      pertinent to this external entity declaration.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     * @param enumeration   If the type has the value "ENUMERATION", this
     *                      array holds the allowed attribute values;
     *                      otherwise, this array is null.
     * @param defaultType   The attribute default type. This value will be
     *                      one of the following: "#FIXED", "#IMPLIED",
     *                      "#REQUIRED", or null.
     * @param defaultValue  The attribute default value, or null if no
     *                      default value is specified.
     * @param nonNormalizedDefaultValue  The attribute default value with no normalization
     *                      performed, or null if no default value is specified.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void elementDecl(String name, String contentModel, Augmentations augs)

    /**
     * An element declaration.
     *
     * @param name         The name of the element.
     * @param contentModel The element content model.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void endParameterEntity(String name, Augmentations augs) throws XNIException {

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" and parameter entity names start with '%'.
     * <p>
     * <strong>Note:</strong> Since the DTD is an entity, the handler
     * will be notified of the end of the DTD entity by calling the
     * endEntity method with the entity name "[dtd]" <em>after</em> calling
     * the endDTD method.
     *
     * @param name The name of the entity.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public void startParameterEntity(String name,
                                     XMLResourceIdentifier identifier,
                                     String encoding,
                                     Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" and parameter entity names start with '%'.
     * <p>
     * <strong>Note:</strong> Since the DTD is an entity, the handler
     * will be notified of the start of the DTD entity by calling the
     * startParameterEntity method with the entity name "[dtd]" <em>before</em> calling
     * the startDTD method.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
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
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getAttributeDeclIsExternal(int attributeDeclIndex) {

    /**
     * Returns true if the specified attribute declaration is external.
     *
     * @param attributeDeclIndex Attribute declaration index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public boolean getElementDeclIsExternal(int elementDeclIndex) {

    /**
     * Returns true if the specified element declaration is external.
     *
     * @param elementDeclIndex The element declaration index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public DTDGrammar(SymbolTable symbolTable, XMLDTDDescription desc) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fAttributeDeclIsExternal[][] = new int[INITIAL_CHUNK_COUNT][];

    /** flag if the AttributeDecl is External. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclIsExternal[][] = new int[INITIAL_CHUNK_COUNT][];

    /** flag if the elementDecl is External. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private boolean[] fPEntityStack = new boolean[4];

    /** Entity stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fDepth = 0;

    /** Stack depth   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int[] fPrevNodeIndexStack = null;

    /** Children content model previous node index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int[] fNodeIndexStack = null;

    /** Children content model index stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private short[] fOpStack = null;

    /** Children content model operation stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    Map<String, XMLElementDecl> fElementDeclTab = new HashMap<>();

    /** table of XMLElementDecl   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLContentSpec fContentSpec = new XMLContentSpec();

    /** Content spec node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLSimpleType fSimpleType = new XMLSimpleType();

    /** Simple type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLEntityDecl fEntityDecl = new XMLEntityDecl();

    /** Entity declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private XMLElementDecl fElementDecl = new XMLElementDecl();

    /** Element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected final XMLAttributeDecl fAttributeDecl = new XMLAttributeDecl();

    /** Temporary Attribute decl. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final QName fQName2 = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final QName fQName = new QName();

    /** Temporary qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private boolean fMixed;

    /** Mixed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final Map<String, Integer> fNotationIndexMap = new HashMap<>();

    /** Notation index mapping table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final Map<String, Integer> fEntityIndexMap = new HashMap<>();

    /** Entity index mapping table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private final Map<String, Integer> fElementIndexMap = new HashMap<>();

    /** Element index mapping table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private String[] fAttributeDeclEnumeration[][] = new String[INITIAL_CHUNK_COUNT][][];

    /** Attribute declaration enumeration values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private short fAttributeDeclType[][] = new short[INITIAL_CHUNK_COUNT][];

    /**
     * Attribute declaration type.
     * @see XMLAttributeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private QName fAttributeDeclName[][] = new QName[INITIAL_CHUNK_COUNT][];

    /** Attribute declaration name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fAttributeDeclCount = 0 ;

    /** Number of attribute declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclLastAttributeDeclIndex[][] = new int[INITIAL_CHUNK_COUNT][];

    /** Last attribute declaration of an element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclFirstAttributeDeclIndex[][] = new int[INITIAL_CHUNK_COUNT][];

    /** First attribute declaration of an element declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private ContentModelValidator fElementDeclContentModelValidator[][] = new ContentModelValidator[INITIAL_CHUNK_COUNT][];

    /**
     * Element declaration content model validator. This validator is
     * constructed from the content spec nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclContentSpecIndex[][] = new int[INITIAL_CHUNK_COUNT][];

    /**
     * Element declaration content spec index. This index value is used
     * to refer to the content spec information tables.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private short fElementDeclType[][] = new short[INITIAL_CHUNK_COUNT][];

    /**
     * Element declaration type.
     * @see XMLElementDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private QName fElementDeclName[][] = new QName[INITIAL_CHUNK_COUNT][];

    /** Element declaration name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private int fElementDeclCount = 0;

    /** Number of element declarations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected boolean fReadingExternalDTD = false;

    /** fReadingExternalDTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int fCurrentAttributeIndex;

    /** Current attribute index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    protected int fCurrentElementIndex;

    /** Current element index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final boolean DEBUG = false;

    /** Debug DTDGrammar. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final short LIST_MASK = ~LIST_FLAG;

    /** List mask (~LIST_FLAG). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final short LIST_FLAG = 0x80;

    /** List flag (0x80). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int INITIAL_CHUNK_COUNT = (1 << (10 - CHUNK_SHIFT)); // 2^10 = 1k

    /** Initial chunk count (1 << (10 - CHUNK_SHIFT)). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int CHUNK_SIZE = (1 << CHUNK_SHIFT);

    /** Chunk size (1 << CHUNK_SHIFT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    private static final int CHUNK_SHIFT = 8; // 2^8 = 256

    /** Chunk shift (8). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
    public static final int TOP_LEVEL_SCOPE = -1;

    /** Top level scope (-1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammar.java
public class DTDGrammar

/**
 * A DTD grammar. This class implements the XNI handler interfaces
 * for DTD information so that it can build the appropriate validation
 * structures automatically from the callbacks.
 *
 * @xerces.internal
 *
 * @author Eric Ye, IBM
 * @author Jeffrey Rodriguez, IBM
 * @author Andy Clark, IBM
 * @author Neil Graham, IBM
 *
 * @version $Id: DTDGrammar.java,v 1.4 2010/08/11 07:18:37 joehw Exp $
 */
