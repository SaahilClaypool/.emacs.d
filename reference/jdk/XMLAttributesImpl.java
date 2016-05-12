_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public Attribute next;

        /** Pointer to the next attribute in the chain. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public Augmentations augs = new AugmentationsImpl();

        /**
         * Augmentations information for this attribute.
         * XMLAttributes has no knowledge if any augmentations
         * were attached to Augmentations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public boolean schemaId;

        /** Schema ID type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public boolean specified;

        /** Specified. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public String nonNormalizedValue;

        /** Non-normalized value. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public XMLString xmlValue;

        /** This will point to the ScannedEntities buffer.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public String value;

        /** Value. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public String type;

        /** Type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public QName name = new QName();

        /** Name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    static class Attribute {

    /**
     * Attribute information.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private void rebalanceTableViewNS(final int count) {

    /**
     * Randomly selects a new hash function and reorganizes the table view
     * in order to more evenly distribute its entries. This method is called
     * automatically when the number of attributes in one bucket exceeds
     * MAX_HASH_COLLISIONS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private void rebalanceTableView(final int count) {

    /**
     * Randomly selects a new hash function and reorganizes the table view
     * in order to more evenly distribute its entries. This method is called
     * automatically when the number of attributes in one bucket exceeds
     * MAX_HASH_COLLISIONS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void refresh() {

    /**
     * This method will be invoked by XMLEntityReader before ScannedEntities buffer
     * is reloaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setURI(int attrIndex, String uri) {

    /**
     * Sets the uri of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param uri       Namespace uri
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setAugmentations(int attrIndex, Augmentations augs) {

    /**
     * Sets the augmentations of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param augs      The augmentations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public Augmentations getAugmentations (int attributeIndex){

    /**
     * Look up an augmentations by attributes index.
     *
     * @param attributeIndex The attribute index.
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public Augmentations getAugmentations(String qName){

    /**
     * Look up an augmentation by XML 1.0 qualified name.
     * <p>
     *
     * @param qName The XML 1.0 qualified name.
     *
     * @return Augmentations
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public Augmentations getAugmentations (String uri, String localName) {

    /**
     * Look up an augmentations by Namespace name.
     *
     * @param uri The Namespace URI, or null if the
     * @param localName The local name of the attribute.
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getValue(String uri, String localName) {

    /**
     * Look up an attribute's value by Namespace name and
     * Local name. If Namespace is null, ignore namespace
     * comparison. If Namespace is "", treat the name as
     * having no Namespace URI.
     *
     * <p>See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.</p>
     *
     * @param uri The Namespace URI, or null namespaces are ignored.
     * @param localName The local name of the attribute.
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getURI(int index) {

    /**
     * Look up an attribute's Namespace URI by index.
     *
     * @param index The attribute index (zero-based).
     * @return The Namespace URI
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getPrefix(int index) {

    /**
     * Returns the prefix of the attribute at the specified index.
     *
     * @param index The index of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected void prepareAndPopulateTableView() {

    /**
     * Prepares the table view of the attributes list for use,
     * and populates it with the attributes which have been
     * previously read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected void prepareTableView() {

    /**
     * Prepares the table view of the attributes list for use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private void growTableView() {

     /**
     * Increases the capacity of the table view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected void cleanTableView() {

    /**
     * Purges all elements from the table view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int getTableViewBucket(String localpart, String uri) {

    /**
     * Returns the position in the table view
     * where the given attribute name would be hashed.
     *
     * @param localpart the local part of the attribute
     * @param uri the namespace name of the attribute
     * @return the position in the table view where the given attribute
     * would be hashed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int getTableViewBucket(String qname) {

    /**
     * Returns the position in the table view
     * where the given attribute name would be hashed.
     *
     * @param qname the attribute name
     * @return the position in the table view where the given attribute
     * would be hashed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private String getReportableType(String type) {

    /**
     * Returns the value passed in or NMTOKEN if it's an enumerated type.
     *
     * @param type attribute type
     * @return the value passed in or NMTOKEN if it's an enumerated type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndexFast(String uri, String localPart) {

    /**
     * Look up the index of an attribute by Namespace name.
     * <p>
     * <strong>Note:</strong>
     * This method uses reference comparison, and thus should
     * only be used internally. We cannot use this method in any
     * code exposed to users as they may not pass in unique strings.
     *
     * @param uri The Namespace URI, or null if
     *        the name has no Namespace URI.
     * @param localName The attribute's local name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public QName checkDuplicatesNS() {

    /**
     * Checks for duplicate expanded names (local part and namespace name
     * pairs) in the attribute specification. If a duplicate is found its
     * name is returned.
     * <p>
     * This should be called once all the in-scope namespaces for the element
     * enclosing these attributes is known, and after all the attributes
     * have gone through namespace binding.
     *
     * @return the name of a duplicate attribute found in the search,
     * otherwise null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void addAttributeNS(QName name, String type, String value) {

    /**
     * Adds an attribute. The attribute's non-normalized value of the
     * attribute will have the same value as the attribute value until
     * set using the <code>setNonNormalizedValue</code> method. Also,
     * the added attribute will be marked as specified in the XML instance
     * document unless set otherwise using the <code>setSpecified</code>
     * method.
     * <p>
     * This method differs from <code>addAttribute</code> in that it
     * does not check if an attribute of the same name already exists
     * in the list before adding it. In order to improve performance
     * of namespace processing, this method allows uniqueness checks
     * to be deferred until all the namespace information is available
     * after the entire attribute specification has been read.
     * <p>
     * <strong>Caution:</strong> If this method is called it should
     * not be mixed with calls to <code>addAttribute</code> unless
     * it has been determined that all the attribute names are unique.
     *
     * @param name the attribute name
     * @param type the attribute type
     * @param value the attribute value
     *
     * @see #setNonNormalizedValue
     * @see #setSpecified
     * @see #checkDuplicatesNS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndexFast(String qName) {

    /**
     * Look up the index of an attribute by XML 1.0 qualified name.
     * <p>
     * <strong>Note:</strong>
     * This method uses reference comparison, and thus should
     * only be used internally. We cannot use this method in any
     * code exposed to users as they may not pass in unique strings.
     *
     * @param qName The qualified (prefixed) name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getType(String uri, String localName) {

    /**
     * Look up an attribute's type by Namespace name.
     *
     * <p>See {@link #getType(int) getType(int)} for a description
     * of the possible types.</p>
     *
     * @param uri The Namespace URI, or null if the
     *        name has no Namespace URI.
     * @param localName The local name of the attribute.
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if Namespace
     *         processing is not being performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getQName(int index) {

    /**
     * Look up an attribute's XML 1.0 qualified name by index.
     *
     * @param index The attribute index (zero-based).
     * @return The XML 1.0 qualified name, or the empty string
     *         if none is available, or null if the index
     *         is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getLocalName(int index) {

    /**
     * Look up an attribute's local name by index.
     *
     * @param index The attribute index (zero-based).
     * @return The local name, or the empty string if Namespace
     *         processing is not being performed, or null
     *         if the index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndexByLocalName(String localPart) {

    /**
     * Look up the index of an attribute by local name only,
     * ignoring its namespace.
     *
     * @param localName The attribute's local name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndex(String uri, String localPart) {

    /**
     * Look up the index of an attribute by Namespace name.
     *
     * @param uri The Namespace URI, or null if
     *        the name has no Namespace URI.
     * @param localName The attribute's local name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndex(String qName) {

    /**
     * Look up the index of an attribute by XML 1.0 qualified name.
     *
     * @param qName The qualified (prefixed) name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getName(int index) {

    /**
     * Return the name of an attribute in this list (by position).
     *
     * <p>The names must be unique: the SAX parser shall not include the
     * same attribute twice.  Attributes without values (those declared
     * #IMPLIED without a value specified in the start tag) will be
     * omitted from the list.</p>
     *
     * <p>If the attribute name has a namespace prefix, the prefix
     * will still be attached.</p>
     *
     * @param i The index of the attribute in the list (starting at 0).
     * @return The name of the indexed attribute, or null
     *         if the index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getValue(String qname) {

    /**
     * Look up an attribute's value by XML 1.0 qualified name.
     *
     * <p>See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.</p>
     *
     * @param qname The XML 1.0 qualified name.
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getValue(int index) {

    /**
     * Look up an attribute's value by index.
     *
     * <p>If the attribute value is a list of tokens (IDREFS,
     * ENTITIES, or NMTOKENS), the tokens will be concatenated
     * into a single string with each token separated by a
     * single space.</p>
     *
     * @param index The attribute index (zero-based).
     * @return The attribute's value as a string, or null if the
     *         index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getType(String qname) {

    /**
     * Look up an attribute's type by XML 1.0 qualified name.
     *
     * <p>See {@link #getType(int) getType(int)} for a description
     * of the possible types.</p>
     *
     * @param qname The XML 1.0 qualified name.
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getType(int index) {

    /**
     * Look up an attribute's type by index.
     *
     * <p>The attribute type is one of the strings "CDATA", "ID",
     * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES",
     * or "NOTATION" (always in upper case).</p>
     *
     * <p>If the parser has not read a declaration for the attribute,
     * or if the parser does not report attribute types, then it must
     * return the value "CDATA" as stated in the XML 1.0 Recommentation
     * (clause 3.3.3, "Attribute-Value Normalization").</p>
     *
     * <p>For an enumerated attribute that is not a notation, the
     * parser will report the type as "NMTOKEN".</p>
     *
     * @param index The attribute index (zero-based).
     * @return The attribute's type as a string, or null if the
     *         index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getLength() {

    /**
     * Return the number of attributes in the list.
     *
     * <p>Once you know the number of attributes, you can iterate
     * through the list.</p>
     *
     * @return The number of attributes in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public boolean isSpecified(int attrIndex) {

    /**
     * Returns true if the attribute is specified in the instance document.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setSpecified(int attrIndex, boolean specified) {

    /**
     * Sets whether an attribute is specified in the instance document
     * or not.
     *
     * @param attrIndex The attribute index.
     * @param specified True if the attribute is specified in the instance
     *                  document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getNonNormalizedValue(int attrIndex) {

    /**
     * Returns the non-normalized value of the attribute at the specified
     * index. If no non-normalized value is set, this method will return
     * the same value as the <code>getValue(int)</code> method.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setNonNormalizedValue(int attrIndex, String attrValue) {

    /**
     * Sets the non-normalized value of the attribute at the specified
     * index.
     *
     * @param attrIndex The attribute index.
     * @param attrValue The new non-normalized attribute value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setValue(int attrIndex, String attrValue) {

    /**
     * Sets the value of the attribute at the specified index. This
     * method will overwrite the non-normalized value of the attribute.
     *
     * @param attrIndex The attribute index.
     * @param attrValue The new attribute value.
     *
     * @see #setNonNormalizedValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setType(int attrIndex, String attrType) {

    /**
     * Sets the type of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrType  The attribute type. The type name is determined by
     *                  the type specified for this attribute in the DTD.
     *                  For example: "CDATA", "ID", "NMTOKEN", etc. However,
     *                  attributes of type enumeration will have the type
     *                  value specified as the pipe ('|') separated list of
     *                  the enumeration values prefixed by an open
     *                  parenthesis and suffixed by a close parenthesis.
     *                  For example: "(true|false)".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void getName(int attrIndex, QName attrName) {

    /**
     * Sets the fields in the given QName structure with the values
     * of the attribute name at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The attribute name structure to fill in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setName(int attrIndex, QName attrName) {

    /**
     * Sets the name of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The new attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void removeAttributeAt(int attrIndex) {

    /**
     * Removes the attribute at the specified index.
     * <p>
     * <strong>Note:</strong> This operation changes the indexes of all
     * attributes following the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void removeAllAttributes() {

    /**
     * Removes all of the attributes. This method will also remove all
     * entities associated to the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
            if (!fIsTableViewConsistent || fLength == SIZE_LIMIT ||
                (fLength > SIZE_LIMIT && fLength > fTableViewBuckets)) {

            /**
             * If attributes were removed from the list after the table
             * becomes in use this isn't reflected in the table view. It's
             * assumed that once a user starts removing attributes they're
             * not likely to add more. We only make the view consistent if
             * the user of this class adds attributes, removes them, and
             * then adds more.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int addAttribute(QName name, String type, String value) {

    /**
     * Adds an attribute. The attribute's non-normalized value of the
     * attribute will have the same value as the attribute value until
     * set using the <code>setNonNormalizedValue</code> method. Also,
     * the added attribute will be marked as specified in the XML instance
     * document unless set otherwise using the <code>setSpecified</code>
     * method.
     * <p>
     * <strong>Note:</strong> If an attribute of the same name already
     * exists, the old values for the attribute are replaced by the new
     * values.
     *
     * @param name  The attribute name.
     * @param type  The attribute type. The type name is determined by
     *                  the type specified for this attribute in the DTD.
     *                  For example: "CDATA", "ID", "NMTOKEN", etc. However,
     *                  attributes of type enumeration will have the type
     *                  value specified as the pipe ('|') separated list of
     *                  the enumeration values prefixed by an open
     *                  parenthesis and suffixed by a close parenthesis.
     *                  For example: "(true|false)".
     * @param value The attribute value.
     *
     * @return Returns the attribute index.
     *
     * @see #setNonNormalizedValue
     * @see #setSpecified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setNamespaces(boolean namespaces) {

    /**
     * Sets whether namespace processing is being performed. This state
     * is needed to return the correct value from the getLocalName method.
     *
     * @param namespaces True if namespace processing is turned on.
     *
     * @see #getLocalName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public XMLAttributesImpl(int tableSize) {

    /**
     * @param tableSize initial size of table view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public XMLAttributesImpl() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int[] fHashMultipliers;

    /**
     * Array of randomly selected hash function multipliers or <code>null</code>
     * if the default String.hashCode() function should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected boolean fIsTableViewConsistent;

    /**
     * Indicates whether the table view contains consistent data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int fTableViewBuckets;

    /**
     * Actual number of buckets in the table view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int[] fAttributeTableViewChainState;

    /**
     * Tracks whether each chain in the hash table is stale
     * with respect to the current state of this object.
     * A chain is stale if its state is not the same as the number
     * of times the attribute table view has been used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected Attribute[] fAttributeTableView;

    /**
     * Provides an alternate view of the attribute specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected Attribute[] fAttributes = new Attribute[4];

    /** Attribute information. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int fLength;

    /** Attribute count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int fLargeCount = 1;

    /**
     * Usage count for the attribute table view.
     * Incremented each time all attributes are removed
     * when the attribute table view is in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected boolean fNamespaces = true;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected static final int SIZE_LIMIT = 20;

    /**
     * Threshold at which an instance is treated
     * as a large attribute list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected static final int MAX_HASH_COLLISIONS = 40;

    /** Maximum hash collisions per bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected static final int TABLE_SIZE = 101;

    /** Default table size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
public class XMLAttributesImpl

/**
 * The XMLAttributesImpl class is an implementation of the XMLAttributes
 * interface which defines a collection of attributes for an element.
 * In the parser, the document source would scan the entire start element
 * and collect the attributes. The attributes are communicated to the
 * document handler in the startElement method.
 * <p>
 * The attributes are read-write so that subsequent stages in the document
 * pipeline can modify the values or change the attributes that are
 * propogated to the next stage.
 *
 * @see com.sun.org.apache.xerces.internal.xni.XMLDocumentHandler#startElement
 *
 * @author Andy Clark, IBM
 * @author Elena Litani, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XMLAttributesImpl.java,v 1.7 2010/05/07 20:13:09 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public Attribute next;

        /** Pointer to the next attribute in the chain. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public Augmentations augs = new AugmentationsImpl();

        /**
         * Augmentations information for this attribute.
         * XMLAttributes has no knowledge if any augmentations
         * were attached to Augmentations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public boolean schemaId;

        /** Schema ID type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public boolean specified;

        /** Specified. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public String nonNormalizedValue;

        /** Non-normalized value. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public XMLString xmlValue;

        /** This will point to the ScannedEntities buffer.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public String value;

        /** Value. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public String type;

        /** Type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
        public QName name = new QName();

        /** Name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    static class Attribute {

    /**
     * Attribute information.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private void rebalanceTableViewNS(final int count) {

    /**
     * Randomly selects a new hash function and reorganizes the table view
     * in order to more evenly distribute its entries. This method is called
     * automatically when the number of attributes in one bucket exceeds
     * MAX_HASH_COLLISIONS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private void rebalanceTableView(final int count) {

    /**
     * Randomly selects a new hash function and reorganizes the table view
     * in order to more evenly distribute its entries. This method is called
     * automatically when the number of attributes in one bucket exceeds
     * MAX_HASH_COLLISIONS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void refresh() {

    /**
     * This method will be invoked by XMLEntityReader before ScannedEntities buffer
     * is reloaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setURI(int attrIndex, String uri) {

    /**
     * Sets the uri of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param uri       Namespace uri
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setAugmentations(int attrIndex, Augmentations augs) {

    /**
     * Sets the augmentations of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param augs      The augmentations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public Augmentations getAugmentations (int attributeIndex){

    /**
     * Look up an augmentations by attributes index.
     *
     * @param attributeIndex The attribute index.
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public Augmentations getAugmentations(String qName){

    /**
     * Look up an augmentation by XML 1.0 qualified name.
     * <p>
     *
     * @param qName The XML 1.0 qualified name.
     *
     * @return Augmentations
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public Augmentations getAugmentations (String uri, String localName) {

    /**
     * Look up an augmentations by Namespace name.
     *
     * @param uri The Namespace URI, or null if the
     * @param localName The local name of the attribute.
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getValue(String uri, String localName) {

    /**
     * Look up an attribute's value by Namespace name and
     * Local name. If Namespace is null, ignore namespace
     * comparison. If Namespace is "", treat the name as
     * having no Namespace URI.
     *
     * <p>See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.</p>
     *
     * @param uri The Namespace URI, or null namespaces are ignored.
     * @param localName The local name of the attribute.
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getURI(int index) {

    /**
     * Look up an attribute's Namespace URI by index.
     *
     * @param index The attribute index (zero-based).
     * @return The Namespace URI
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getPrefix(int index) {

    /**
     * Returns the prefix of the attribute at the specified index.
     *
     * @param index The index of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected void prepareAndPopulateTableView() {

    /**
     * Prepares the table view of the attributes list for use,
     * and populates it with the attributes which have been
     * previously read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected void prepareTableView() {

    /**
     * Prepares the table view of the attributes list for use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private void growTableView() {

     /**
     * Increases the capacity of the table view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected void cleanTableView() {

    /**
     * Purges all elements from the table view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int getTableViewBucket(String localpart, String uri) {

    /**
     * Returns the position in the table view
     * where the given attribute name would be hashed.
     *
     * @param localpart the local part of the attribute
     * @param uri the namespace name of the attribute
     * @return the position in the table view where the given attribute
     * would be hashed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int getTableViewBucket(String qname) {

    /**
     * Returns the position in the table view
     * where the given attribute name would be hashed.
     *
     * @param qname the attribute name
     * @return the position in the table view where the given attribute
     * would be hashed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    private String getReportableType(String type) {

    /**
     * Returns the value passed in or NMTOKEN if it's an enumerated type.
     *
     * @param type attribute type
     * @return the value passed in or NMTOKEN if it's an enumerated type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndexFast(String uri, String localPart) {

    /**
     * Look up the index of an attribute by Namespace name.
     * <p>
     * <strong>Note:</strong>
     * This method uses reference comparison, and thus should
     * only be used internally. We cannot use this method in any
     * code exposed to users as they may not pass in unique strings.
     *
     * @param uri The Namespace URI, or null if
     *        the name has no Namespace URI.
     * @param localName The attribute's local name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public QName checkDuplicatesNS() {

    /**
     * Checks for duplicate expanded names (local part and namespace name
     * pairs) in the attribute specification. If a duplicate is found its
     * name is returned.
     * <p>
     * This should be called once all the in-scope namespaces for the element
     * enclosing these attributes is known, and after all the attributes
     * have gone through namespace binding.
     *
     * @return the name of a duplicate attribute found in the search,
     * otherwise null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void addAttributeNS(QName name, String type, String value) {

    /**
     * Adds an attribute. The attribute's non-normalized value of the
     * attribute will have the same value as the attribute value until
     * set using the <code>setNonNormalizedValue</code> method. Also,
     * the added attribute will be marked as specified in the XML instance
     * document unless set otherwise using the <code>setSpecified</code>
     * method.
     * <p>
     * This method differs from <code>addAttribute</code> in that it
     * does not check if an attribute of the same name already exists
     * in the list before adding it. In order to improve performance
     * of namespace processing, this method allows uniqueness checks
     * to be deferred until all the namespace information is available
     * after the entire attribute specification has been read.
     * <p>
     * <strong>Caution:</strong> If this method is called it should
     * not be mixed with calls to <code>addAttribute</code> unless
     * it has been determined that all the attribute names are unique.
     *
     * @param name the attribute name
     * @param type the attribute type
     * @param value the attribute value
     *
     * @see #setNonNormalizedValue
     * @see #setSpecified
     * @see #checkDuplicatesNS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndexFast(String qName) {

    /**
     * Look up the index of an attribute by XML 1.0 qualified name.
     * <p>
     * <strong>Note:</strong>
     * This method uses reference comparison, and thus should
     * only be used internally. We cannot use this method in any
     * code exposed to users as they may not pass in unique strings.
     *
     * @param qName The qualified (prefixed) name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getType(String uri, String localName) {

    /**
     * Look up an attribute's type by Namespace name.
     *
     * <p>See {@link #getType(int) getType(int)} for a description
     * of the possible types.</p>
     *
     * @param uri The Namespace URI, or null if the
     *        name has no Namespace URI.
     * @param localName The local name of the attribute.
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if Namespace
     *         processing is not being performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getQName(int index) {

    /**
     * Look up an attribute's XML 1.0 qualified name by index.
     *
     * @param index The attribute index (zero-based).
     * @return The XML 1.0 qualified name, or the empty string
     *         if none is available, or null if the index
     *         is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getLocalName(int index) {

    /**
     * Look up an attribute's local name by index.
     *
     * @param index The attribute index (zero-based).
     * @return The local name, or the empty string if Namespace
     *         processing is not being performed, or null
     *         if the index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndexByLocalName(String localPart) {

    /**
     * Look up the index of an attribute by local name only,
     * ignoring its namespace.
     *
     * @param localName The attribute's local name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndex(String uri, String localPart) {

    /**
     * Look up the index of an attribute by Namespace name.
     *
     * @param uri The Namespace URI, or null if
     *        the name has no Namespace URI.
     * @param localName The attribute's local name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getIndex(String qName) {

    /**
     * Look up the index of an attribute by XML 1.0 qualified name.
     *
     * @param qName The qualified (prefixed) name.
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getName(int index) {

    /**
     * Return the name of an attribute in this list (by position).
     *
     * <p>The names must be unique: the SAX parser shall not include the
     * same attribute twice.  Attributes without values (those declared
     * #IMPLIED without a value specified in the start tag) will be
     * omitted from the list.</p>
     *
     * <p>If the attribute name has a namespace prefix, the prefix
     * will still be attached.</p>
     *
     * @param i The index of the attribute in the list (starting at 0).
     * @return The name of the indexed attribute, or null
     *         if the index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getValue(String qname) {

    /**
     * Look up an attribute's value by XML 1.0 qualified name.
     *
     * <p>See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.</p>
     *
     * @param qname The XML 1.0 qualified name.
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getValue(int index) {

    /**
     * Look up an attribute's value by index.
     *
     * <p>If the attribute value is a list of tokens (IDREFS,
     * ENTITIES, or NMTOKENS), the tokens will be concatenated
     * into a single string with each token separated by a
     * single space.</p>
     *
     * @param index The attribute index (zero-based).
     * @return The attribute's value as a string, or null if the
     *         index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getType(String qname) {

    /**
     * Look up an attribute's type by XML 1.0 qualified name.
     *
     * <p>See {@link #getType(int) getType(int)} for a description
     * of the possible types.</p>
     *
     * @param qname The XML 1.0 qualified name.
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getType(int index) {

    /**
     * Look up an attribute's type by index.
     *
     * <p>The attribute type is one of the strings "CDATA", "ID",
     * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES",
     * or "NOTATION" (always in upper case).</p>
     *
     * <p>If the parser has not read a declaration for the attribute,
     * or if the parser does not report attribute types, then it must
     * return the value "CDATA" as stated in the XML 1.0 Recommentation
     * (clause 3.3.3, "Attribute-Value Normalization").</p>
     *
     * <p>For an enumerated attribute that is not a notation, the
     * parser will report the type as "NMTOKEN".</p>
     *
     * @param index The attribute index (zero-based).
     * @return The attribute's type as a string, or null if the
     *         index is out of range.
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int getLength() {

    /**
     * Return the number of attributes in the list.
     *
     * <p>Once you know the number of attributes, you can iterate
     * through the list.</p>
     *
     * @return The number of attributes in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public boolean isSpecified(int attrIndex) {

    /**
     * Returns true if the attribute is specified in the instance document.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setSpecified(int attrIndex, boolean specified) {

    /**
     * Sets whether an attribute is specified in the instance document
     * or not.
     *
     * @param attrIndex The attribute index.
     * @param specified True if the attribute is specified in the instance
     *                  document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public String getNonNormalizedValue(int attrIndex) {

    /**
     * Returns the non-normalized value of the attribute at the specified
     * index. If no non-normalized value is set, this method will return
     * the same value as the <code>getValue(int)</code> method.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setNonNormalizedValue(int attrIndex, String attrValue) {

    /**
     * Sets the non-normalized value of the attribute at the specified
     * index.
     *
     * @param attrIndex The attribute index.
     * @param attrValue The new non-normalized attribute value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setValue(int attrIndex, String attrValue) {

    /**
     * Sets the value of the attribute at the specified index. This
     * method will overwrite the non-normalized value of the attribute.
     *
     * @param attrIndex The attribute index.
     * @param attrValue The new attribute value.
     *
     * @see #setNonNormalizedValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setType(int attrIndex, String attrType) {

    /**
     * Sets the type of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrType  The attribute type. The type name is determined by
     *                  the type specified for this attribute in the DTD.
     *                  For example: "CDATA", "ID", "NMTOKEN", etc. However,
     *                  attributes of type enumeration will have the type
     *                  value specified as the pipe ('|') separated list of
     *                  the enumeration values prefixed by an open
     *                  parenthesis and suffixed by a close parenthesis.
     *                  For example: "(true|false)".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void getName(int attrIndex, QName attrName) {

    /**
     * Sets the fields in the given QName structure with the values
     * of the attribute name at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The attribute name structure to fill in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setName(int attrIndex, QName attrName) {

    /**
     * Sets the name of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The new attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void removeAttributeAt(int attrIndex) {

    /**
     * Removes the attribute at the specified index.
     * <p>
     * <strong>Note:</strong> This operation changes the indexes of all
     * attributes following the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void removeAllAttributes() {

    /**
     * Removes all of the attributes. This method will also remove all
     * entities associated to the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
            if (!fIsTableViewConsistent || fLength == SIZE_LIMIT ||
                (fLength > SIZE_LIMIT && fLength > fTableViewBuckets)) {

            /**
             * If attributes were removed from the list after the table
             * becomes in use this isn't reflected in the table view. It's
             * assumed that once a user starts removing attributes they're
             * not likely to add more. We only make the view consistent if
             * the user of this class adds attributes, removes them, and
             * then adds more.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public int addAttribute(QName name, String type, String value) {

    /**
     * Adds an attribute. The attribute's non-normalized value of the
     * attribute will have the same value as the attribute value until
     * set using the <code>setNonNormalizedValue</code> method. Also,
     * the added attribute will be marked as specified in the XML instance
     * document unless set otherwise using the <code>setSpecified</code>
     * method.
     * <p>
     * <strong>Note:</strong> If an attribute of the same name already
     * exists, the old values for the attribute are replaced by the new
     * values.
     *
     * @param name  The attribute name.
     * @param type  The attribute type. The type name is determined by
     *                  the type specified for this attribute in the DTD.
     *                  For example: "CDATA", "ID", "NMTOKEN", etc. However,
     *                  attributes of type enumeration will have the type
     *                  value specified as the pipe ('|') separated list of
     *                  the enumeration values prefixed by an open
     *                  parenthesis and suffixed by a close parenthesis.
     *                  For example: "(true|false)".
     * @param value The attribute value.
     *
     * @return Returns the attribute index.
     *
     * @see #setNonNormalizedValue
     * @see #setSpecified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public void setNamespaces(boolean namespaces) {

    /**
     * Sets whether namespace processing is being performed. This state
     * is needed to return the correct value from the getLocalName method.
     *
     * @param namespaces True if namespace processing is turned on.
     *
     * @see #getLocalName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public XMLAttributesImpl(int tableSize) {

    /**
     * @param tableSize initial size of table view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    public XMLAttributesImpl() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int[] fHashMultipliers;

    /**
     * Array of randomly selected hash function multipliers or <code>null</code>
     * if the default String.hashCode() function should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected boolean fIsTableViewConsistent;

    /**
     * Indicates whether the table view contains consistent data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int fTableViewBuckets;

    /**
     * Actual number of buckets in the table view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int[] fAttributeTableViewChainState;

    /**
     * Tracks whether each chain in the hash table is stale
     * with respect to the current state of this object.
     * A chain is stale if its state is not the same as the number
     * of times the attribute table view has been used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected Attribute[] fAttributeTableView;

    /**
     * Provides an alternate view of the attribute specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected Attribute[] fAttributes = new Attribute[4];

    /** Attribute information. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int fLength;

    /** Attribute count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected int fLargeCount = 1;

    /**
     * Usage count for the attribute table view.
     * Incremented each time all attributes are removed
     * when the attribute table view is in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected boolean fNamespaces = true;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected static final int SIZE_LIMIT = 20;

    /**
     * Threshold at which an instance is treated
     * as a large attribute list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected static final int MAX_HASH_COLLISIONS = 40;

    /** Maximum hash collisions per bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
    protected static final int TABLE_SIZE = 101;

    /** Default table size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLAttributesImpl.java
public class XMLAttributesImpl

/**
 * The XMLAttributesImpl class is an implementation of the XMLAttributes
 * interface which defines a collection of attributes for an element.
 * In the parser, the document source would scan the entire start element
 * and collect the attributes. The attributes are communicated to the
 * document handler in the startElement method.
 * <p>
 * The attributes are read-write so that subsequent stages in the document
 * pipeline can modify the values or change the attributes that are
 * propogated to the next stage.
 *
 * @see com.sun.org.apache.xerces.internal.xni.XMLDocumentHandler#startElement
 *
 * @author Andy Clark, IBM
 * @author Elena Litani, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XMLAttributesImpl.java,v 1.7 2010/05/07 20:13:09 joehw Exp $
 */
