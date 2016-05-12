_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDTDEntityExpansion(boolean expand) {

    /**
     * If set to false the serializer does not expand DTD entities,
     * but leaves them as is, the default value is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void unparsedEntityDecl(
        String arg0,
        String arg1,
        String arg2,
        String arg3)

    /**
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void notationDecl(String arg0, String arg1, String arg2)

    /**
     * @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttribute(String uri, String localName, String rawName, String type, String value) throws SAXException

    /**
     * This method adds an attribute the the current element,
     * but should not be used for an xsl:attribute child.
     * @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    final boolean inTemporaryOutputState()

    /**
     * Returns true if the serializer is used for temporary output rather than
     * final output.
     *
     * This concept is made clear in the XSLT 2.0 draft.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private void resetSerializerBase()

    /**
     * Reset all of the fields owned by SerializerBase
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setNamespaceMappings(NamespaceMappings mappings) {

    /**
     * Used only by TransformerSnapshotImpl to restore the serialization
     * to a previous state.
     *
     * @param mappings NamespaceMappings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setSourceLocator(SourceLocator locator)

    /**
     * This method is used to set the source locator, which might be used to
     * generated an error message.
     * @param locator the source locator
     *
     * @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void startDocumentInternal() throws org.xml.sax.SAXException

    /**
     * This method handles what needs to be done at a startDocument() call,
     * whether from an external caller, or internally called in the
     * serializer.  For historical reasons the serializer is flexible to
     * startDocument() not always being called.
     * Even if no external call is
     * made into startDocument() this method will always be called as a self
     * generated internal startDocument, it handles what needs to be done at a
     * startDocument() call.
     *
     * This method exists just to make sure that startDocument() is only ever
     * called from an external caller, which in principle is just a matter of
     * style.
     *
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void startDocument() throws org.xml.sax.SAXException

    /**
     * Receive notification of the beginning of a document.
     * This method is never a self generated call,
     * but only called externally.
     *
     * <p>The SAX parser will invoke this method only once, before any
     * other methods in this interface or in DTDHandler (except for
     * setDocumentLocator).</p>
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEntityReference(String name)

    /**
     * To fire off the entity reference trace event
     * @param name Name of entity reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEscapingEvent(String name, String data)

    /**
     * To fire off the PI trace event
     * @param name Name of PI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
//    protected void fireEndElem(String name)

    /**
     * To fire off the end element event
     * @param name Name of element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireStartElem(String elemName)

    /**
     * Report the start element trace event. This trace method needs to be
     * called just before the attributes are cleared.
     *
     * @param elemName the qualified name of the element
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEndDoc()

    /**
     * To fire off end document trace event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
     protected void fireStartDoc()

    /**
     * To fire off start document trace  event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void fireEndEntity(String name)

    /**
     * To fire off end entity trace event
     * @param name Name of entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireCommentEvent(char[] chars, int start, int length)

    /**
     * Report the comment trace event
     * @param chars  content of comment
     * @param start  starting index of comment to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireCDATAEvent(char[] chars, int start, int length)

    /**
     * Report the CDATA trace event
     * @param chars  content of CDATA
     * @param start  starting index of characters to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private void flushMyWriter()

    /**
     * This method is only used internally when flushing the writer from the
     * various fire...() trace events.  Due to the writer being wrapped with
     * SerializerTraceWriter it may cause the flush of these trace events:
     * EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS
     * EVENTTYPE_OUTPUT_CHARACTERS
     * which trace the output written to the output stream.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
//    protected void fireCharEvent(char[] chars, int start, int length)

    /**
     * Report the characters event
     * @param chars  content of characters
     * @param start  starting index of characters to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireStartEntity(String name)

    /**
     * To fire off start entity trace event
     * @param name Name of entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void warning(SAXParseException exc) throws SAXException

    /**
     * @see org.xml.sax.ErrorHandler#warning(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void fatalError(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#fatalError(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void error(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#error(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void characters(org.w3c.dom.Node node)

    /**
     * This method gets the nodes value as a String and uses that String as if
     * it were an input character notification.
     * @param node the Node to serialize
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public Transformer getTransformer()

    /**
     * Gets the transformer associated with this serializer
     * @return returns the transformer associated with this serializer.
     * @see SerializationHandler#getTransformer()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setTransformer(Transformer t)

    /**
     * Sets the transformer associated with this serializer
     * @param t the transformer associated with this serializer.
     * @see SerializationHandler#setTransformer(Transformer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void entityReference(String name) throws org.xml.sax.SAXException

    /**
     * Entity reference event.
     *
     * @param name Name of entity
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getNamespaceURIFromPrefix(String prefix)

    /**
     * Returns the URI of prefix (if any)
     *
         * @param prefix the prefix whose URI is searched for
     * @return the namespace URI currently associated with the
     * prefix, null if the prefix is undefined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getNamespaceURI(String qname, boolean isElement)

    /**
     * Returns the URI of an element or attribute. Note that default namespaces
     * do not apply directly to attributes.
     * @param qname a qualified name
     * @param isElement true if the qualified name is the name of
     * an element.
     * @return returns the namespace URI associated with the qualified name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getPrefix(String namespaceURI)

    /**
     * Returns the prefix currently pointing to the given URI (if any).
     * @param namespaceURI the uri of the namespace in question
     * @return a prefix pointing to the given URI (if any).
     * @see ExtendedContentHandler#getPrefix(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public NamespaceMappings getNamespaceMappings()

    /**
     * Some users of the serializer may need the current namespace mappings
     * @return the current namespace mappings (prefix/uri)
     * @see ExtendedContentHandler#getNamespaceMappings()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected static final String getPrefixPart(String qname)

    /**
     * Returns the local name of a qualified name.
     * If the name has no prefix,
     * then it works as the identity (SAX2).
     *
     * @param qname a qualified name
     * @return returns the prefix of the qualified name,
     * or null if there is no prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private static final boolean subPartMatch(String p, String t)

    /**
     * Tell if two strings are equal, without worry if the first string is null.
     *
     * @param p String reference, which may be null.
     * @param t String reference, which may be null.
     *
     * @return true if strings are equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean isCdataSection()

    /**
     * Push a boolean state based on if the name of the current element
     * is found in the list of qnames.  A state is only pushed if
     * there were some cdata-section-names were specified.
     * <p>
     * Hidden parameters are the vector of qualified elements specified in
     * cdata-section-names attribute, and the m_cdataSectionStates stack
     * onto which whether the current element is in the list is pushed (true or
     * false). Other hidden parameters are the current elements namespaceURI,
     * localName and qName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public DOMSerializer asDOMSerializer() throws IOException

    /**
     * Return a {@link DOMSerializer} interface into this serializer. If the
     * serializer does not support the {@link DOMSerializer} interface, it should
     * return null.
     *
     * @return A {@link DOMSerializer} interface into this serializer,  or null
     * if the serializer is not DOM capable
     * @throws IOException An I/O exception occured
     * @see Serializer#asDOMSerializer()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void namespaceAfterStartElement(String uri, String prefix)

    /**
     * This method is used when a prefix/uri namespace mapping
     * is indicated after the element was started with a
     * startElement() and before and endElement().
     * startPrefixMapping(prefix,uri) would be used before the
     * startElement() call.
     * @param uri the URI of the namespace
     * @param prefix the prefix associated with the given URI.
     *
     * @see ExtendedContentHandler#namespaceAfterStartElement(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setIsStandalone(boolean isStandalone)

    /**
     * Sets the isStandalone property
     * @param isStandalone true if the ORACLE_IS_STANDALONE is set to yes
     * @see OutputPropertiesFactory ORACLE_IS_STANDALONE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setIndent(boolean doIndent)

    /**
     * Sets the value coming from the xsl:output indent stylesheet
     * attribute.
     * @param doIndent true if the output document should be indented to
     * visually indicate its structure.
     * @see XSLOutputAttributes#setIndent(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setIndentAmount(int m_indentAmount)

    /**
     * Sets the indentation amount.
     * @param m_indentAmount The m_indentAmount to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public int getIndentAmount()

    /**
     * @return the number of spaces to indent for each indentation level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setMediaType(String mediaType)

    /**
     * Sets the value coming from the xsl:output media-type stylesheet attribute.
     * @param mediaType the non-null media-type or MIME type associated with the
     * output document.
     * @see javax.xml.transform.OutputKeys#MEDIA_TYPE
     * @see SerializationHandler#setMediaType(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setVersion(String version)

    /**
     * Sets the value coming from the xsl:output version attribute.
     * @param version the version of the output format.
     * @see SerializationHandler#setVersion(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getVersion()

    /**
     * Gets the version of the output format.
     * @return the version of the output format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getMediaType()

    /**
     * Gets the mediatype the media-type or MIME type associated with the output
     * document.
     * @return the mediatype the media-type or MIME type associated with the
     * output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public boolean getIndent()

    /**
     * @return true if the output document should be indented to visually
     * indicate its structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getStandalone()

    /**
     * Gets the XSL standalone attribute
     * @return a value of "yes" if the <code>standalone</code> delaration is to
     * be included in the output document.
     *  @see XSLOutputAttributes#getStandalone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void setStandaloneInternal(String standalone)

    /**
     * Sets the XSL standalone attribute, but does not remember if this is a
     * default or explicite setting.
     * @param standalone "yes" | "no"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setStandalone(String standalone)

    /**
     * Sets the value coming from the xsl:output standalone stylesheet attribute.
     * @param standalone a value of "yes" indicates that the
     * <code>standalone</code> delaration is to be included in the output
     * document. This method remembers if the value was explicitly set using
     * this method, verses if the value is the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDoctype(String doctypeSystem, String doctypePublic)

    /** Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties
     * @param doctypeSystem the system identifier to be used in the DOCTYPE
     * declaration in the output document.
     * @param doctypePublic the public identifier to be used in the DOCTYPE
     * declaration in the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDoctypeSystem(String doctypeSystem)

    /** Set the value coming from the xsl:output doctype-system stylesheet attribute.
      * @param doctypeSystem the system identifier to be used in the DOCTYPE
      * declaration in the output document.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getDoctypeSystem()

    /**
     * Returns the previously set value of the value to be used
     * as the system identifier in the document type declaration (DTD).
         * @return the system identifier to be used in the DOCTYPE declaration in
         * the output document.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDoctypePublic(String doctypePublic)

    /** Set the value coming from the xsl:output doctype-public stylesheet attribute.
      * @param doctypePublic the public identifier to be used in the DOCTYPE
      * declaration in the output document.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getDoctypePublic()

    /**
     * Returns the previously set value of the value to be used as the public
     * identifier in the document type declaration (DTD).
     *
     *@return the public identifier to be used in the DOCTYPE declaration in the
     * output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public boolean getOmitXMLDeclaration()

    /**
     * @return true if the XML declaration is to be omitted from the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setOmitXMLDeclaration(boolean b)

    /**
     * Sets the value coming from the xsl:output omit-xml-declaration stylesheet attribute
     * @param b true if the XML declaration is to be omitted from the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setEncoding(String m_encoding)

   /**
     * Sets the character encoding coming from the xsl:output encoding stylesheet attribute.
     * @param m_encoding the character encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getEncoding()

    /**
     * Returns the character encoding to be used in the output document.
     * @return the character encoding to be used in the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void initCDATA()

    /**
     * Initialize global variables
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void close()

    /**
     * Flush and close the underlying java.io.Writer. This method applies to
     * ToStream serializers, not ToSAXHandler serializers.
     * @see ToStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void endEntity(String name) throws org.xml.sax.SAXException

    /**
     * Report the end of an entity.
     *
     * @param name The name of the entity that is ending.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #startEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public ContentHandler asContentHandler() throws IOException

    /**
     * Return a {@link ContentHandler} interface into this serializer.
     * If the serializer does not support the {@link ContentHandler}
     * interface, it should return null.
     *
     * @return A {@link ContentHandler} interface into this serializer,
     *  or null if the serializer is not SAX 2 capable
     * @throws IOException An I/O exception occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttributes(Attributes atts) throws SAXException

    /**
     * Add the given attributes to the currently collected ones. These
     * attributes are always added, regardless of whether on not an element
     * is currently open.
     * @param atts List of attributes to add to this list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addXSLAttribute(String name, final String value, final String uri)

    /**
     * Adds the given xsl:attribute to the set of collected attributes,
     * but only if there is a currently open element.
     *
     * @param name the attribute's qualified name (prefix:localName)
     * @param value the value of the attribute
     * @param uri the URI that the prefix of the name points to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttribute(String name, final String value)

    /**
     *  Adds  the given attribute to the set of collected attributes,
     * but only if there is a currently open element.
     *
     * @param name the attribute's qualified name
     * @param value the value of the attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public boolean addAttributeAlways(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds the given attribute to the set of attributes, even if there is
     * no currently open element. This is useful if a SAX startPrefixMapping()
     * should need to add an attribute before the element name is seen.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName   the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @return true if the attribute was added,
     * false if an existing value was replaced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds the given attribute to the set of collected attributes , but only if
     * there is a currently open element.
     *
     * An element is currently open if a startElement() notification has
     * occured but the start of the element has not yet been written to the
     * output.  In the stream case this means that we have not yet been forced
     * to close the elements opening tag by another notification, such as a
     * character notification.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName    the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if this attribute is coming from an xsl:attriute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDocumentLocator(Locator locator)

    /**
     * Receive an object for locating the origin of SAX document events.
     *
     * @param locator An object that can return the location of any SAX document
     * event.
     *
     * Receive an object for locating the origin of SAX document events.
     *
     * <p>SAX parsers are strongly encouraged (though not absolutely
     * required) to supply a locator: if it does so, it must supply
     * the locator to the application by invoking this method before
     * invoking any of the other methods in the DocumentHandler
     * interface.</p>
     *
     * <p>The locator allows the application to determine the end
     * position of any document-related event, even if the parser is
     * not reporting an error.  Typically, the application will
     * use this information for reporting its own errors (such as
     * character content that does not match an application's
     * business rules).  The information returned by the locator
     * is probably not sufficient for use with a search engine.</p>
     *
     * <p>Note that the locator will return correct information only
     * during the invocation of the events in this interface.  The
     * application should not attempt to use it at any other time.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected static String getLocalName(String qname)

    /**
     * Returns the local name of a qualified name. If the name has no prefix,
     * then it works as the identity (SAX2).
     * @param qname the qualified name
     * @return the name, but excluding any prefix and colon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected String patchName(String qname)

    /**
     * If at runtime, when the qname of the attribute is
     * known, another prefix is specified for the attribute, then we can
     * patch or hack the name with this method. For
     * a qname of the form "ns?:otherprefix:name", this function patches the
     * qname by simply ignoring "otherprefix".
     * TODO: This method is a HACK! We do not have access to the
     * XML file, it sometimes generates a NS prefix of the form "ns?" for
     * an attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void comment(String data) throws SAXException

    /**
     * Receive notification of a comment.
     *
     * @see ExtendedLexicalHandler#comment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected char[] m_attrBuff = new char[30];

    /**
     * A utility buffer for converting Strings passed to
     * attribute methods to character arrays.
     * Reusing this buffer means not creating a new character array
     * everytime and it runs faster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected char[] m_charsBuff = new char[60];

    /**
     * A utility buffer for converting Strings passed to
     * character() methods to character arrays.
     * Reusing this buffer means not creating a new character array
     * everytime and it runs faster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected ElemContext m_elemContext = new ElemContext();

    /**
     * A reference to "stack frame" corresponding to
     * the current element. Such a frame is pushed at a startElement()
     * and popped at an endElement(). This frame contains information about
     * the element, such as its namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected java.io.Writer m_writer = null;

    /**
     * The writer to send output to. This field is only used in the ToStream
     * serializers, but exists here just so that the fireStartDoc() and
     * other fire... methods can flush this writer when tracing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected SerializerTrace m_tracer;

    /**
     * Handle for firing generate events.  This interface may be implemented
     * by the referenced transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected NamespaceMappings m_prefixMap;

    /**
     * Namespace support, that keeps track of currently defined
     * prefix/uri mappings. As processed elements come and go, so do
     * the associated mappings for that element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected Vector m_cdataSectionElements = null;

    /**
     * Pairs of local names and corresponding URIs of CDATA sections. This list
     * comes from the cdata-section-elements attribute. Every second one is a
     * local name, and every other second one is the URI for the local name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private Transformer m_transformer;

    /**
     * The transformer that was around when this output handler was created (if
     * any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_mediatype;

    /**
     * The mediatype.  Not used right now.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_version = null;

    /**
     * Tells the XML version, for writing out to the XML decl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_doIndent = false;

    /**
     * Flag to tell if indenting (pretty-printing) is on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_isStandalone = false;

    /**
     * Determine if the output is a standalone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_standaloneWasSpecified = false;

    /**
     * True if standalone was specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_standalone;

    /**
     * The standalone value for the doctype.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private boolean m_shouldNotWriteXMLHeader = false;

    /**
     * Tells if we should write the XML declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_encoding = null;

    /**
     * The character encoding.  Must match the encoding used for the
     * printWriter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    boolean m_needToOutputDocTypeDecl = true;

    /**
     * Flag to tell that we need to add the doctype decl, which we can't do
     * until the first element is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_doctypePublic;

    /**
     * The public ID for the doc type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_doctypeSystem;

    /**
     * The System ID for the doc type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_inExternalDTD = false;

    /** This flag is set while receiving events from the external DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_inEntityRef = false;

    /**
     * Tells if we're in an EntityRef event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected AttributesImplSerializer m_attributes = new AttributesImplSerializer();

    /**
     * All the attributes of the current element, collected from
     * startPrefixMapping() calls, or addAddtribute() calls, or
     * from the SAX attributes in a startElement() call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_cdataTagOpen = false;

    /** True if a trailing "]]>" still needs to be written to be
     * written out. Used to merge adjacent CDATA sections
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_needToCallStartDocument = true;

    /**
     * true if we still need to call startDocumentInternal()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireCharEvent(char[] chars, int start, int length)

    /**
     * Report the characters trace event
     * @param chars  content of characters
     * @param start  starting index of characters to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEndElem(String name)

    /**
     * To fire off the end element trace event
     * @param name Name of element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
public abstract class SerializerBase

/**
 * This class acts as a base class for the XML "serializers"
 * and the stream serializers.
 * It contains a number of common fields and methods.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDTDEntityExpansion(boolean expand) {

    /**
     * If set to false the serializer does not expand DTD entities,
     * but leaves them as is, the default value is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void unparsedEntityDecl(
        String arg0,
        String arg1,
        String arg2,
        String arg3)

    /**
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void notationDecl(String arg0, String arg1, String arg2)

    /**
     * @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttribute(String uri, String localName, String rawName, String type, String value) throws SAXException

    /**
     * This method adds an attribute the the current element,
     * but should not be used for an xsl:attribute child.
     * @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    final boolean inTemporaryOutputState()

    /**
     * Returns true if the serializer is used for temporary output rather than
     * final output.
     *
     * This concept is made clear in the XSLT 2.0 draft.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private void resetSerializerBase()

    /**
     * Reset all of the fields owned by SerializerBase
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setNamespaceMappings(NamespaceMappings mappings) {

    /**
     * Used only by TransformerSnapshotImpl to restore the serialization
     * to a previous state.
     *
     * @param mappings NamespaceMappings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setSourceLocator(SourceLocator locator)

    /**
     * This method is used to set the source locator, which might be used to
     * generated an error message.
     * @param locator the source locator
     *
     * @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void startDocumentInternal() throws org.xml.sax.SAXException

    /**
     * This method handles what needs to be done at a startDocument() call,
     * whether from an external caller, or internally called in the
     * serializer.  For historical reasons the serializer is flexible to
     * startDocument() not always being called.
     * Even if no external call is
     * made into startDocument() this method will always be called as a self
     * generated internal startDocument, it handles what needs to be done at a
     * startDocument() call.
     *
     * This method exists just to make sure that startDocument() is only ever
     * called from an external caller, which in principle is just a matter of
     * style.
     *
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void startDocument() throws org.xml.sax.SAXException

    /**
     * Receive notification of the beginning of a document.
     * This method is never a self generated call,
     * but only called externally.
     *
     * <p>The SAX parser will invoke this method only once, before any
     * other methods in this interface or in DTDHandler (except for
     * setDocumentLocator).</p>
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEntityReference(String name)

    /**
     * To fire off the entity reference trace event
     * @param name Name of entity reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEscapingEvent(String name, String data)

    /**
     * To fire off the PI trace event
     * @param name Name of PI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
//    protected void fireEndElem(String name)

    /**
     * To fire off the end element event
     * @param name Name of element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireStartElem(String elemName)

    /**
     * Report the start element trace event. This trace method needs to be
     * called just before the attributes are cleared.
     *
     * @param elemName the qualified name of the element
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEndDoc()

    /**
     * To fire off end document trace event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
     protected void fireStartDoc()

    /**
     * To fire off start document trace  event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void fireEndEntity(String name)

    /**
     * To fire off end entity trace event
     * @param name Name of entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireCommentEvent(char[] chars, int start, int length)

    /**
     * Report the comment trace event
     * @param chars  content of comment
     * @param start  starting index of comment to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireCDATAEvent(char[] chars, int start, int length)

    /**
     * Report the CDATA trace event
     * @param chars  content of CDATA
     * @param start  starting index of characters to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private void flushMyWriter()

    /**
     * This method is only used internally when flushing the writer from the
     * various fire...() trace events.  Due to the writer being wrapped with
     * SerializerTraceWriter it may cause the flush of these trace events:
     * EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS
     * EVENTTYPE_OUTPUT_CHARACTERS
     * which trace the output written to the output stream.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
//    protected void fireCharEvent(char[] chars, int start, int length)

    /**
     * Report the characters event
     * @param chars  content of characters
     * @param start  starting index of characters to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireStartEntity(String name)

    /**
     * To fire off start entity trace event
     * @param name Name of entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void warning(SAXParseException exc) throws SAXException

    /**
     * @see org.xml.sax.ErrorHandler#warning(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void fatalError(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#fatalError(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void error(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#error(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void characters(org.w3c.dom.Node node)

    /**
     * This method gets the nodes value as a String and uses that String as if
     * it were an input character notification.
     * @param node the Node to serialize
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public Transformer getTransformer()

    /**
     * Gets the transformer associated with this serializer
     * @return returns the transformer associated with this serializer.
     * @see SerializationHandler#getTransformer()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setTransformer(Transformer t)

    /**
     * Sets the transformer associated with this serializer
     * @param t the transformer associated with this serializer.
     * @see SerializationHandler#setTransformer(Transformer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void entityReference(String name) throws org.xml.sax.SAXException

    /**
     * Entity reference event.
     *
     * @param name Name of entity
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getNamespaceURIFromPrefix(String prefix)

    /**
     * Returns the URI of prefix (if any)
     *
         * @param prefix the prefix whose URI is searched for
     * @return the namespace URI currently associated with the
     * prefix, null if the prefix is undefined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getNamespaceURI(String qname, boolean isElement)

    /**
     * Returns the URI of an element or attribute. Note that default namespaces
     * do not apply directly to attributes.
     * @param qname a qualified name
     * @param isElement true if the qualified name is the name of
     * an element.
     * @return returns the namespace URI associated with the qualified name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getPrefix(String namespaceURI)

    /**
     * Returns the prefix currently pointing to the given URI (if any).
     * @param namespaceURI the uri of the namespace in question
     * @return a prefix pointing to the given URI (if any).
     * @see ExtendedContentHandler#getPrefix(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public NamespaceMappings getNamespaceMappings()

    /**
     * Some users of the serializer may need the current namespace mappings
     * @return the current namespace mappings (prefix/uri)
     * @see ExtendedContentHandler#getNamespaceMappings()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected static final String getPrefixPart(String qname)

    /**
     * Returns the local name of a qualified name.
     * If the name has no prefix,
     * then it works as the identity (SAX2).
     *
     * @param qname a qualified name
     * @return returns the prefix of the qualified name,
     * or null if there is no prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private static final boolean subPartMatch(String p, String t)

    /**
     * Tell if two strings are equal, without worry if the first string is null.
     *
     * @param p String reference, which may be null.
     * @param t String reference, which may be null.
     *
     * @return true if strings are equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean isCdataSection()

    /**
     * Push a boolean state based on if the name of the current element
     * is found in the list of qnames.  A state is only pushed if
     * there were some cdata-section-names were specified.
     * <p>
     * Hidden parameters are the vector of qualified elements specified in
     * cdata-section-names attribute, and the m_cdataSectionStates stack
     * onto which whether the current element is in the list is pushed (true or
     * false). Other hidden parameters are the current elements namespaceURI,
     * localName and qName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public DOMSerializer asDOMSerializer() throws IOException

    /**
     * Return a {@link DOMSerializer} interface into this serializer. If the
     * serializer does not support the {@link DOMSerializer} interface, it should
     * return null.
     *
     * @return A {@link DOMSerializer} interface into this serializer,  or null
     * if the serializer is not DOM capable
     * @throws IOException An I/O exception occured
     * @see Serializer#asDOMSerializer()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void namespaceAfterStartElement(String uri, String prefix)

    /**
     * This method is used when a prefix/uri namespace mapping
     * is indicated after the element was started with a
     * startElement() and before and endElement().
     * startPrefixMapping(prefix,uri) would be used before the
     * startElement() call.
     * @param uri the URI of the namespace
     * @param prefix the prefix associated with the given URI.
     *
     * @see ExtendedContentHandler#namespaceAfterStartElement(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setIsStandalone(boolean isStandalone)

    /**
     * Sets the isStandalone property
     * @param isStandalone true if the ORACLE_IS_STANDALONE is set to yes
     * @see OutputPropertiesFactory ORACLE_IS_STANDALONE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setIndent(boolean doIndent)

    /**
     * Sets the value coming from the xsl:output indent stylesheet
     * attribute.
     * @param doIndent true if the output document should be indented to
     * visually indicate its structure.
     * @see XSLOutputAttributes#setIndent(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setIndentAmount(int m_indentAmount)

    /**
     * Sets the indentation amount.
     * @param m_indentAmount The m_indentAmount to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public int getIndentAmount()

    /**
     * @return the number of spaces to indent for each indentation level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setMediaType(String mediaType)

    /**
     * Sets the value coming from the xsl:output media-type stylesheet attribute.
     * @param mediaType the non-null media-type or MIME type associated with the
     * output document.
     * @see javax.xml.transform.OutputKeys#MEDIA_TYPE
     * @see SerializationHandler#setMediaType(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setVersion(String version)

    /**
     * Sets the value coming from the xsl:output version attribute.
     * @param version the version of the output format.
     * @see SerializationHandler#setVersion(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getVersion()

    /**
     * Gets the version of the output format.
     * @return the version of the output format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getMediaType()

    /**
     * Gets the mediatype the media-type or MIME type associated with the output
     * document.
     * @return the mediatype the media-type or MIME type associated with the
     * output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public boolean getIndent()

    /**
     * @return true if the output document should be indented to visually
     * indicate its structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getStandalone()

    /**
     * Gets the XSL standalone attribute
     * @return a value of "yes" if the <code>standalone</code> delaration is to
     * be included in the output document.
     *  @see XSLOutputAttributes#getStandalone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void setStandaloneInternal(String standalone)

    /**
     * Sets the XSL standalone attribute, but does not remember if this is a
     * default or explicite setting.
     * @param standalone "yes" | "no"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setStandalone(String standalone)

    /**
     * Sets the value coming from the xsl:output standalone stylesheet attribute.
     * @param standalone a value of "yes" indicates that the
     * <code>standalone</code> delaration is to be included in the output
     * document. This method remembers if the value was explicitly set using
     * this method, verses if the value is the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDoctype(String doctypeSystem, String doctypePublic)

    /** Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties
     * @param doctypeSystem the system identifier to be used in the DOCTYPE
     * declaration in the output document.
     * @param doctypePublic the public identifier to be used in the DOCTYPE
     * declaration in the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDoctypeSystem(String doctypeSystem)

    /** Set the value coming from the xsl:output doctype-system stylesheet attribute.
      * @param doctypeSystem the system identifier to be used in the DOCTYPE
      * declaration in the output document.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getDoctypeSystem()

    /**
     * Returns the previously set value of the value to be used
     * as the system identifier in the document type declaration (DTD).
         * @return the system identifier to be used in the DOCTYPE declaration in
         * the output document.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDoctypePublic(String doctypePublic)

    /** Set the value coming from the xsl:output doctype-public stylesheet attribute.
      * @param doctypePublic the public identifier to be used in the DOCTYPE
      * declaration in the output document.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getDoctypePublic()

    /**
     * Returns the previously set value of the value to be used as the public
     * identifier in the document type declaration (DTD).
     *
     *@return the public identifier to be used in the DOCTYPE declaration in the
     * output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public boolean getOmitXMLDeclaration()

    /**
     * @return true if the XML declaration is to be omitted from the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setOmitXMLDeclaration(boolean b)

    /**
     * Sets the value coming from the xsl:output omit-xml-declaration stylesheet attribute
     * @param b true if the XML declaration is to be omitted from the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setEncoding(String m_encoding)

   /**
     * Sets the character encoding coming from the xsl:output encoding stylesheet attribute.
     * @param m_encoding the character encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public String getEncoding()

    /**
     * Returns the character encoding to be used in the output document.
     * @return the character encoding to be used in the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void initCDATA()

    /**
     * Initialize global variables
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void close()

    /**
     * Flush and close the underlying java.io.Writer. This method applies to
     * ToStream serializers, not ToSAXHandler serializers.
     * @see ToStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void endEntity(String name) throws org.xml.sax.SAXException

    /**
     * Report the end of an entity.
     *
     * @param name The name of the entity that is ending.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #startEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public ContentHandler asContentHandler() throws IOException

    /**
     * Return a {@link ContentHandler} interface into this serializer.
     * If the serializer does not support the {@link ContentHandler}
     * interface, it should return null.
     *
     * @return A {@link ContentHandler} interface into this serializer,
     *  or null if the serializer is not SAX 2 capable
     * @throws IOException An I/O exception occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttributes(Attributes atts) throws SAXException

    /**
     * Add the given attributes to the currently collected ones. These
     * attributes are always added, regardless of whether on not an element
     * is currently open.
     * @param atts List of attributes to add to this list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addXSLAttribute(String name, final String value, final String uri)

    /**
     * Adds the given xsl:attribute to the set of collected attributes,
     * but only if there is a currently open element.
     *
     * @param name the attribute's qualified name (prefix:localName)
     * @param value the value of the attribute
     * @param uri the URI that the prefix of the name points to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttribute(String name, final String value)

    /**
     *  Adds  the given attribute to the set of collected attributes,
     * but only if there is a currently open element.
     *
     * @param name the attribute's qualified name
     * @param value the value of the attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public boolean addAttributeAlways(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds the given attribute to the set of attributes, even if there is
     * no currently open element. This is useful if a SAX startPrefixMapping()
     * should need to add an attribute before the element name is seen.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName   the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @return true if the attribute was added,
     * false if an existing value was replaced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds the given attribute to the set of collected attributes , but only if
     * there is a currently open element.
     *
     * An element is currently open if a startElement() notification has
     * occured but the start of the element has not yet been written to the
     * output.  In the stream case this means that we have not yet been forced
     * to close the elements opening tag by another notification, such as a
     * character notification.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName    the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if this attribute is coming from an xsl:attriute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void setDocumentLocator(Locator locator)

    /**
     * Receive an object for locating the origin of SAX document events.
     *
     * @param locator An object that can return the location of any SAX document
     * event.
     *
     * Receive an object for locating the origin of SAX document events.
     *
     * <p>SAX parsers are strongly encouraged (though not absolutely
     * required) to supply a locator: if it does so, it must supply
     * the locator to the application by invoking this method before
     * invoking any of the other methods in the DocumentHandler
     * interface.</p>
     *
     * <p>The locator allows the application to determine the end
     * position of any document-related event, even if the parser is
     * not reporting an error.  Typically, the application will
     * use this information for reporting its own errors (such as
     * character content that does not match an application's
     * business rules).  The information returned by the locator
     * is probably not sufficient for use with a search engine.</p>
     *
     * <p>Note that the locator will return correct information only
     * during the invocation of the events in this interface.  The
     * application should not attempt to use it at any other time.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected static String getLocalName(String qname)

    /**
     * Returns the local name of a qualified name. If the name has no prefix,
     * then it works as the identity (SAX2).
     * @param qname the qualified name
     * @return the name, but excluding any prefix and colon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected String patchName(String qname)

    /**
     * If at runtime, when the qname of the attribute is
     * known, another prefix is specified for the attribute, then we can
     * patch or hack the name with this method. For
     * a qname of the form "ns?:otherprefix:name", this function patches the
     * qname by simply ignoring "otherprefix".
     * TODO: This method is a HACK! We do not have access to the
     * XML file, it sometimes generates a NS prefix of the form "ns?" for
     * an attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    public void comment(String data) throws SAXException

    /**
     * Receive notification of a comment.
     *
     * @see ExtendedLexicalHandler#comment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected char[] m_attrBuff = new char[30];

    /**
     * A utility buffer for converting Strings passed to
     * attribute methods to character arrays.
     * Reusing this buffer means not creating a new character array
     * everytime and it runs faster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected char[] m_charsBuff = new char[60];

    /**
     * A utility buffer for converting Strings passed to
     * character() methods to character arrays.
     * Reusing this buffer means not creating a new character array
     * everytime and it runs faster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected ElemContext m_elemContext = new ElemContext();

    /**
     * A reference to "stack frame" corresponding to
     * the current element. Such a frame is pushed at a startElement()
     * and popped at an endElement(). This frame contains information about
     * the element, such as its namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected java.io.Writer m_writer = null;

    /**
     * The writer to send output to. This field is only used in the ToStream
     * serializers, but exists here just so that the fireStartDoc() and
     * other fire... methods can flush this writer when tracing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected SerializerTrace m_tracer;

    /**
     * Handle for firing generate events.  This interface may be implemented
     * by the referenced transformer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected NamespaceMappings m_prefixMap;

    /**
     * Namespace support, that keeps track of currently defined
     * prefix/uri mappings. As processed elements come and go, so do
     * the associated mappings for that element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected Vector m_cdataSectionElements = null;

    /**
     * Pairs of local names and corresponding URIs of CDATA sections. This list
     * comes from the cdata-section-elements attribute. Every second one is a
     * local name, and every other second one is the URI for the local name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private Transformer m_transformer;

    /**
     * The transformer that was around when this output handler was created (if
     * any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_mediatype;

    /**
     * The mediatype.  Not used right now.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_version = null;

    /**
     * Tells the XML version, for writing out to the XML decl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_doIndent = false;

    /**
     * Flag to tell if indenting (pretty-printing) is on.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_isStandalone = false;

    /**
     * Determine if the output is a standalone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_standaloneWasSpecified = false;

    /**
     * True if standalone was specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_standalone;

    /**
     * The standalone value for the doctype.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private boolean m_shouldNotWriteXMLHeader = false;

    /**
     * Tells if we should write the XML declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_encoding = null;

    /**
     * The character encoding.  Must match the encoding used for the
     * printWriter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    boolean m_needToOutputDocTypeDecl = true;

    /**
     * Flag to tell that we need to add the doctype decl, which we can't do
     * until the first element is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_doctypePublic;

    /**
     * The public ID for the doc type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    private String m_doctypeSystem;

    /**
     * The System ID for the doc type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_inExternalDTD = false;

    /** This flag is set while receiving events from the external DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_inEntityRef = false;

    /**
     * Tells if we're in an EntityRef event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected AttributesImplSerializer m_attributes = new AttributesImplSerializer();

    /**
     * All the attributes of the current element, collected from
     * startPrefixMapping() calls, or addAddtribute() calls, or
     * from the SAX attributes in a startElement() call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_cdataTagOpen = false;

    /** True if a trailing "]]>" still needs to be written to be
     * written out. Used to merge adjacent CDATA sections
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected boolean m_needToCallStartDocument = true;

    /**
     * true if we still need to call startDocumentInternal()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireCharEvent(char[] chars, int start, int length)

    /**
     * Report the characters trace event
     * @param chars  content of characters
     * @param start  starting index of characters to output
     * @param length  number of characters to output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
    protected void fireEndElem(String name)

    /**
     * To fire off the end element trace event
     * @param name Name of element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializerBase.java
public abstract class SerializerBase

/**
 * This class acts as a base class for the XML "serializers"
 * and the stream serializers.
 * It contains a number of common fields and methods.
 *
 * @xsl.usage internal
 */
