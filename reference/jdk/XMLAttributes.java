_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setAugmentations(int attrIndex, Augmentations augs);

    /**
     * Sets the augmentations of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param augs      The augmentations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public Augmentations getAugmentations(String qName);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public Augmentations getAugmentations (String uri, String localPart);

    /**
     * Look up an augmentation by namespace name.
     *
     * @param uri       The Namespace URI, or the empty string if
     *                  the name has no Namespace URI.
     * @param localPart
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public Augmentations getAugmentations (int attributeIndex);

    /**
     * Look up an augmentation by attribute's index.
     *
     * @param attributeIndex The attribute index.
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public boolean isSpecified(int attrIndex);

    /**
     * Returns true if the attribute is specified in the instance document.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setSpecified(int attrIndex, boolean specified);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getNonNormalizedValue(int attrIndex);

    /**
     * Returns the non-normalized value of the attribute at the specified
     * index. If no non-normalized value is set, this method will return
     * the same value as the <code>getValue(int)</code> method.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setNonNormalizedValue(int attrIndex, String attrValue);

    /**
     * Sets the non-normalized value of the attribute at the specified
     * index.
     *
     * @param attrIndex The attribute index.
     * @param attrValue The new non-normalized attribute value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getValue(String uri, String localName);

    /**
     * Look up an attribute's value by Namespace name.
     * <p>
     * See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.
     *
     * @param uri       The Namespace URI, or the empty String if the
     *                  name has no Namespace URI.
     * @param localName The local name of the attribute.
     *
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getValue(String qName);

    /**
     * Look up an attribute's value by XML 1.0 qualified name.
     * <p>
     * See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.
     *
     * @param qName The XML 1.0 qualified name.
     *
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getValue(int index);

    /**
     * Look up an attribute's value by index.
     * <p>
     * If the attribute value is a list of tokens (IDREFS,
     * ENTITIES, or NMTOKENS), the tokens will be concatenated
     * into a single string with each token separated by a
     * single space.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The attribute's value as a string, or null if the
     *         index is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setValue(int attrIndex, String attrValue);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getType(String uri, String localName);

    /**
     * Look up an attribute's type by Namespace name.
     * <p>
     * See {@link #getType(int) getType(int)} for a description
     * of the possible types.
     *
     * @param uri       The Namespace URI, or the empty String if the
     *                  name has no Namespace URI.
     * @param localName The local name of the attribute.
     *
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if Namespace
     *         processing is not being performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getType(String qName);

    /**
     * Look up an attribute's type by XML 1.0 qualified name.
     * <p>
     * See {@link #getType(int) getType(int)} for a description
     * of the possible types.
     *
     * @param qName The XML 1.0 qualified name.
     *
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getType(int index);

    /**
     * Look up an attribute's type by index.
     * <p>
     * The attribute type is one of the strings "CDATA", "ID",
     * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES",
     * or "NOTATION" (always in upper case).
     * <p>
     * If the parser has not read a declaration for the attribute,
     * or if the parser does not report attribute types, then it must
     * return the value "CDATA" as stated in the XML 1.0 Recommentation
     * (clause 3.3.3, "Attribute-Value Normalization").
     * <p>
     * For an enumerated attribute that is not a notation, the
     * parser will report the type as "NMTOKEN".
     *
     * @param index The attribute index (zero-based).
     *
     * @return The attribute's type as a string, or null if the
     *         index is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setType(int attrIndex, String attrType);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getQName(int index);

    /**
     * Look up an attribute's XML 1.0 qualified name by index.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The XML 1.0 qualified name, or the empty string
     *         if none is available, or null if the index
     *         is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getLocalName(int index);

    /**
     * Look up an attribute's local name by index.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The local name, or the empty string if Namespace
     *         processing is not being performed, or null
     *         if the index is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getURI(int index);

    /**
     * Look up an attribute's Namespace URI by index.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The Namespace URI, or the empty string if none
     *         is available, or null if the index is out of
     *         range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getPrefix(int index);

    /**
     * Returns the prefix of the attribute at the specified index.
     *
     * @param index The index of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void getName(int attrIndex, QName attrName);

    /**
     * Sets the fields in the given QName structure with the values
     * of the attribute name at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The attribute name structure to fill in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setName(int attrIndex, QName attrName);

    /**
     * Sets the name of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The new attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int getIndex(String uri, String localPart);

    /**
     * Look up the index of an attribute by Namespace name.
     *
     * @param uri       The Namespace URI, or the empty string if
     *                  the name has no Namespace URI.
     * @param localName The attribute's local name.
     *
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int getIndex(String qName);

    /**
     * Look up the index of an attribute by XML 1.0 qualified name.
     *
     * @param qName The qualified (prefixed) name.
     *
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int getLength();

    /**
     * Returns the number of attributes in the list.
     * <p>
     * Once you know the number of attributes, you can iterate
     * through the list.
     *
     * @see #getURI(int)
     * @see #getLocalName(int)
     * @see #getQName(int)
     * @see #getType(int)
     * @see #getValue(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void removeAttributeAt(int attrIndex);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void removeAllAttributes();

    /**
     * Removes all of the attributes. This method will also remove all
     * entities associated to the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int addAttribute(QName attrName, String attrType, String attrValue);

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
     * @param attrName  The attribute name.
     * @param attrType  The attribute type. The type name is determined by
     *                  the type specified for this attribute in the DTD.
     *                  For example: "CDATA", "ID", "NMTOKEN", etc. However,
     *                  attributes of type enumeration will have the type
     *                  value specified as the pipe ('|') separated list of
     *                  the enumeration values prefixed by an open
     *                  parenthesis and suffixed by a close parenthesis.
     *                  For example: "(true|false)".
     * @param attrValue The attribute value.
     *
     * @return Returns the attribute index.
     *
     * @see #setNonNormalizedValue
     * @see #setSpecified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
public interface XMLAttributes {

/**
 * The XMLAttributes interface defines a collection of attributes for
 * an element. In the parser, the document source would scan the entire
 * start element and collect the attributes. The attributes are
 * communicated to the document handler in the startElement method.
 * <p>
 * The attributes are read-write so that subsequent stages in the document
 * pipeline can modify the values or change the attributes that are
 * propogated to the next stage.
 *
 * @see XMLDocumentHandler#startElement
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setAugmentations(int attrIndex, Augmentations augs);

    /**
     * Sets the augmentations of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param augs      The augmentations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public Augmentations getAugmentations(String qName);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public Augmentations getAugmentations (String uri, String localPart);

    /**
     * Look up an augmentation by namespace name.
     *
     * @param uri       The Namespace URI, or the empty string if
     *                  the name has no Namespace URI.
     * @param localPart
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public Augmentations getAugmentations (int attributeIndex);

    /**
     * Look up an augmentation by attribute's index.
     *
     * @param attributeIndex The attribute index.
     * @return Augmentations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public boolean isSpecified(int attrIndex);

    /**
     * Returns true if the attribute is specified in the instance document.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setSpecified(int attrIndex, boolean specified);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getNonNormalizedValue(int attrIndex);

    /**
     * Returns the non-normalized value of the attribute at the specified
     * index. If no non-normalized value is set, this method will return
     * the same value as the <code>getValue(int)</code> method.
     *
     * @param attrIndex The attribute index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setNonNormalizedValue(int attrIndex, String attrValue);

    /**
     * Sets the non-normalized value of the attribute at the specified
     * index.
     *
     * @param attrIndex The attribute index.
     * @param attrValue The new non-normalized attribute value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getValue(String uri, String localName);

    /**
     * Look up an attribute's value by Namespace name.
     * <p>
     * See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.
     *
     * @param uri       The Namespace URI, or the empty String if the
     *                  name has no Namespace URI.
     * @param localName The local name of the attribute.
     *
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getValue(String qName);

    /**
     * Look up an attribute's value by XML 1.0 qualified name.
     * <p>
     * See {@link #getValue(int) getValue(int)} for a description
     * of the possible values.
     *
     * @param qName The XML 1.0 qualified name.
     *
     * @return The attribute value as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getValue(int index);

    /**
     * Look up an attribute's value by index.
     * <p>
     * If the attribute value is a list of tokens (IDREFS,
     * ENTITIES, or NMTOKENS), the tokens will be concatenated
     * into a single string with each token separated by a
     * single space.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The attribute's value as a string, or null if the
     *         index is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setValue(int attrIndex, String attrValue);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getType(String uri, String localName);

    /**
     * Look up an attribute's type by Namespace name.
     * <p>
     * See {@link #getType(int) getType(int)} for a description
     * of the possible types.
     *
     * @param uri       The Namespace URI, or the empty String if the
     *                  name has no Namespace URI.
     * @param localName The local name of the attribute.
     *
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if Namespace
     *         processing is not being performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getType(String qName);

    /**
     * Look up an attribute's type by XML 1.0 qualified name.
     * <p>
     * See {@link #getType(int) getType(int)} for a description
     * of the possible types.
     *
     * @param qName The XML 1.0 qualified name.
     *
     * @return The attribute type as a string, or null if the
     *         attribute is not in the list or if qualified names
     *         are not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getType(int index);

    /**
     * Look up an attribute's type by index.
     * <p>
     * The attribute type is one of the strings "CDATA", "ID",
     * "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES",
     * or "NOTATION" (always in upper case).
     * <p>
     * If the parser has not read a declaration for the attribute,
     * or if the parser does not report attribute types, then it must
     * return the value "CDATA" as stated in the XML 1.0 Recommentation
     * (clause 3.3.3, "Attribute-Value Normalization").
     * <p>
     * For an enumerated attribute that is not a notation, the
     * parser will report the type as "NMTOKEN".
     *
     * @param index The attribute index (zero-based).
     *
     * @return The attribute's type as a string, or null if the
     *         index is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setType(int attrIndex, String attrType);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getQName(int index);

    /**
     * Look up an attribute's XML 1.0 qualified name by index.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The XML 1.0 qualified name, or the empty string
     *         if none is available, or null if the index
     *         is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getLocalName(int index);

    /**
     * Look up an attribute's local name by index.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The local name, or the empty string if Namespace
     *         processing is not being performed, or null
     *         if the index is out of range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getURI(int index);

    /**
     * Look up an attribute's Namespace URI by index.
     *
     * @param index The attribute index (zero-based).
     *
     * @return The Namespace URI, or the empty string if none
     *         is available, or null if the index is out of
     *         range.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public String getPrefix(int index);

    /**
     * Returns the prefix of the attribute at the specified index.
     *
     * @param index The index of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void getName(int attrIndex, QName attrName);

    /**
     * Sets the fields in the given QName structure with the values
     * of the attribute name at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The attribute name structure to fill in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void setName(int attrIndex, QName attrName);

    /**
     * Sets the name of the attribute at the specified index.
     *
     * @param attrIndex The attribute index.
     * @param attrName  The new attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int getIndex(String uri, String localPart);

    /**
     * Look up the index of an attribute by Namespace name.
     *
     * @param uri       The Namespace URI, or the empty string if
     *                  the name has no Namespace URI.
     * @param localName The attribute's local name.
     *
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int getIndex(String qName);

    /**
     * Look up the index of an attribute by XML 1.0 qualified name.
     *
     * @param qName The qualified (prefixed) name.
     *
     * @return The index of the attribute, or -1 if it does not
     *         appear in the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int getLength();

    /**
     * Returns the number of attributes in the list.
     * <p>
     * Once you know the number of attributes, you can iterate
     * through the list.
     *
     * @see #getURI(int)
     * @see #getLocalName(int)
     * @see #getQName(int)
     * @see #getType(int)
     * @see #getValue(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void removeAttributeAt(int attrIndex);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public void removeAllAttributes();

    /**
     * Removes all of the attributes. This method will also remove all
     * entities associated to the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
    public int addAttribute(QName attrName, String attrType, String attrValue);

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
     * @param attrName  The attribute name.
     * @param attrType  The attribute type. The type name is determined by
     *                  the type specified for this attribute in the DTD.
     *                  For example: "CDATA", "ID", "NMTOKEN", etc. However,
     *                  attributes of type enumeration will have the type
     *                  value specified as the pipe ('|') separated list of
     *                  the enumeration values prefixed by an open
     *                  parenthesis and suffixed by a close parenthesis.
     *                  For example: "(true|false)".
     * @param attrValue The attribute value.
     *
     * @return Returns the attribute index.
     *
     * @see #setNonNormalizedValue
     * @see #setSpecified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLAttributes.java
public interface XMLAttributes {

/**
 * The XMLAttributes interface defines a collection of attributes for
 * an element. In the parser, the document source would scan the entire
 * start element and collect the attributes. The attributes are
 * communicated to the document handler in the startElement method.
 * <p>
 * The attributes are read-write so that subsequent stages in the document
 * pipeline can modify the values or change the attributes that are
 * propogated to the next stage.
 *
 * @see XMLDocumentHandler#startElement
 *
 * @author Andy Clark, IBM
 *
 */
