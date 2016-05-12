_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setContentHandler(ContentHandler ch)

    /**
     * @see SerializationHandler#setContentHandler(org.xml.sax.ContentHandler)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getNamespaceURI(String qname, boolean isElement)

    /**
     * @see ExtendedContentHandler#getNamespaceURI(java.lang.String, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void entityReference(String entityName) throws SAXException

    /**
     * @see ExtendedContentHandler#entityReference(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getPrefix(String namespaceURI)

    /**
     * @see ExtendedContentHandler#getPrefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void flushPending() throws SAXException

    /**
     * @see SerializationHandler#flushPending()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public NamespaceMappings getNamespaceMappings()

    /**
     * Get the current namespace mappings.
     * Simply returns the mappings of the wrapped handler.
     * @see ExtendedContentHandler#getNamespaceMappings()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttributes(Attributes atts) throws SAXException

    /**
     * @see ExtendedContentHandler#addAttributes(org.xml.sax.Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setCdataSectionElements(Vector URI_and_localNames)

    /**
     * @param URI_and_localNames Vector a list of pairs of URI/localName
     * specified in the cdata-section-elements attribute.
     * @see SerializationHandler#setCdataSectionElements(java.util.Vector)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public DOMSerializer asDOMSerializer() throws IOException

    /**
     * @see Serializer#asDOMSerializer()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean isFirstElemHTML()

    /**
     * Determine if the firts element in the document is <html> or <HTML>
     * This uses the cached first element name, first element prefix and the
     * cached namespaces from previous method calls
     *
     * @return true if the first element is an opening <html> tag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String getPrefixPartUnknown(String qname)

    /**
         * Utility function to return prefix
         *
         * Don't want to override static function on SerializerBase
         * So added Unknown suffix to method name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String getLocalNameUnknown(String value)

    /**
     * Utility function for calls to local-name().
     *
     * Don't want to override static function on SerializerBase
     * So added Unknown suffix to method name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private void initStreamOutput() throws SAXException

    /**
     * Initialize the wrapped output stream (XML or HTML).
     * If the stream handler should be HTML, then replace the XML handler with
     * an HTML handler. After than send the starting method calls that were cached
     * to the wrapped handler.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startEntity(String name) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#startEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startDTD(String name, String publicId, String systemId)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startCDATA() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#startCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endEntity(String name) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#endEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endDTD() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#endDTD()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endCDATA() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#endCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void comment(char[] ch, int start, int length) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void skippedEntity(String name) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#skippedEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDocumentLocator(Locator locator)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void processingInstruction(String target, String data)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void ignorableWhitespace(char[] ch, int start, int length)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endPrefixMapping(String prefix) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#endPrefixMapping(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endElement(String namespaceURI, String localName, String qName)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#endElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endDocument() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#endDocument()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void characters(char[] characters, int offset, int length)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#characters(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void internalEntityDecl(String arg0, String arg1)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void externalEntityDecl(
        String name,
        String publicId,
        String systemId)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void elementDecl(String arg0, String arg1) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    /**

    /**
     * @see XSLOutputAttributes#setVersion(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setStandalone(String standalone)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setStandalone(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setOmitXMLDeclaration(boolean b)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setOmitXMLDeclaration(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setMediaType(String mediaType)

    /**
     * @see XSLOutputAttributes#setMediaType(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setIndentAmount(int value)

    /**
     * Pass the call on to the underlying handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setIndent(boolean indent)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setIndent(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setEncoding(String encoding)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setEncoding(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDoctypeSystem(String doctype)

    /**
     * Set the doctype in the underlying XML handler. Remember that this method
     * was called, just in case we need to transfer this doctype to an HTML handler
     * @param doctype the system doctype to set
     * @see XSLOutputAttributes#setDoctypeSystem(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDoctypePublic(String doctype)

    /**
     * Set the doctype in the underlying XML handler. Remember that this method
     * was called, just in case we need to transfer this doctype to an HTML handler
     * @param doctype the public doctype to set
     * @see XSLOutputAttributes#setDoctypePublic(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDoctype(String system, String pub)

    /**
     * @see XSLOutputAttributes#setDoctype(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getVersion()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getVersion()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getStandalone()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getStandalone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean getOmitXMLDeclaration()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getOmitXMLDeclaration()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getMediaType()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getMediaType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public int getIndentAmount()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getIndentAmount()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean getIndent()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getIndent()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getEncoding()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getEncoding()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getDoctypeSystem()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getDoctypeSystem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getDoctypePublic()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getDoctypePublic()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void comment(String comment) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see ExtendedLexicalHandler#comment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startDocument() throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#startDocument()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setVersion(String version)

    /**
      * This method cannot be cached because default is different in
      * HTML and XML (we need more than a boolean).
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void namespaceAfterStartElement(String prefix, String uri)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startPrefixMapping(String prefix, String uri) throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String)
     * @param prefix The prefix that maps to the URI
     * @param uri The URI for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endElement(String elementName) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void characters(String chars) throws SAXException

    /**
     * Converts the String to a character array and calls the SAX method
     * characters(char[],int,int);
     *
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addUniqueAttribute(String rawName, String value, int flags)

    /**
     * Adds a unique attribute to the currenly open tag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttribute(String rawName, String value)

    /**
     * Adds an attribute to the currenly open tag
     * @param rawName the attribute name, with prefix (if any)
     * @param value the value of the parameter
     * @see ExtendedContentHandler#addAttribute(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds an attribute to the currenly open tag
     * @param uri the URI of a namespace
     * @param localName the attribute name, without prefix
     * @param rawName the attribute name, with prefix (if any)
     * @param type the type of the attribute, typically "CDATA"
     * @param value the value of the parameter
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value)

    /**
     * Adds an attribute to the currenly open tag
     * @param uri the URI of a namespace
     * @param localName the attribute name, without prefix
     * @param rawName the attribute name, with prefix (if any)
     * @param type the type of the attribute, typically "CDATA"
     * @param value the value of the parameter
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setWriter(Writer writer)

    /**
     * Sets the writer to write to
     * @param writer the writer to write to
     * @see Serializer#setWriter(Writer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setOutputStream(OutputStream output)

    /**
     * Sets the output stream to write to
     * @param output the OutputStream to write to
     * @see Serializer#setOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setOutputFormat(Properties format)

    /**
     * Set the properties of the handler
     * @param format the output properties to set
     * @see Serializer#setOutputFormat(Properties)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean setEscaping(boolean escape) throws SAXException

    /**
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void serialize(Node node) throws IOException

    /**
     * Converts the DOM node to output
     * @param node the DOM node to transform to output
     * @see DOMSerializer#serialize(Node)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean reset()

    /**
     * passes the call on to the underlying HTML or XML handler
     * @see Serializer#reset()
     * @return ???
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public Writer getWriter()

    /**
     * @see Serializer#getWriter()
     * @return the Writer of the underlying XML or HTML handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public OutputStream getOutputStream()

    /**
     * @see Serializer#getOutputStream()
     * @return the OutputStream of the underlying XML or HTML handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public Properties getOutputFormat()

    /**
     * @see Serializer#getOutputFormat()
     * @return the properties of the underlying handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void close()

    /**
     * @see SerializationHandler#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public ContentHandler asContentHandler() throws IOException

    /**
     * @see Serializer#asContentHandler()
     * @return the wrapped XML or HTML handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public ToUnknownStream()

    /**
     * Default constructor.
     * Initially this object wraps an XML Stream object, so _handler is never null.
     * That may change later to an HTML Stream object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_setMediaType_called = false;

    /**
     * true if setMediaType() was called before the underlying handler
     * was initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_setDoctypeSystem_called = false;

    /**
     * true if setDoctypeSystem() was called before the underlying handler
     * was initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_needToCallStartDocument = false;

    /**
     * true if startDocument() was called before the underlying handler
     * was initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private Vector m_namespaceURI = null;

    /**
     * A collection of namespace URI's (only for first element).
     * _namespacePrefix has the matching prefix for these URI's
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_firstTagNotEmitted = true;

    /**
     * true if the first tag has been emitted to the wrapped handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String m_firstElementLocalName = null;

    /**
     * the local name (no prefix) associated with the first element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String m_firstElementURI;

    /**
     * the namespace URI associated with the first element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String m_firstElementPrefix;

    /**
     * the prefix of the very first tag in the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_wrapped_handler_not_initialized = false;

    /**
     * true if the underlying handler (XML or HTML) is fully initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private static final String EMPTYSTRING = "";

    /**
     * A String with no characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private SerializationHandler m_handler;

    /**
     * The wrapped handler, initially XML but possibly switched to HTML
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
public final class ToUnknownStream extends SerializerBase

/**
 *This class wraps another SerializationHandler. The wrapped object will either
 * handler XML or HTML, which is not known until a little later when the first XML
 * tag is seen.  If the first tag is <html> then the wrapped object is an HTML
 * handler, otherwise it is an XML handler.
 *
 * This class effectively caches the first few calls to it then passes them
 * on to the wrapped handler (once it exists).  After that subsequent calls a
 * simply passed directly to the wrapped handler.
 *
 * The user of this class doesn't know if the output is ultimatley XML or HTML.
 *
 * This class is not a public API, it is public because it is used within Xalan.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setContentHandler(ContentHandler ch)

    /**
     * @see SerializationHandler#setContentHandler(org.xml.sax.ContentHandler)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getNamespaceURI(String qname, boolean isElement)

    /**
     * @see ExtendedContentHandler#getNamespaceURI(java.lang.String, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void entityReference(String entityName) throws SAXException

    /**
     * @see ExtendedContentHandler#entityReference(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getPrefix(String namespaceURI)

    /**
     * @see ExtendedContentHandler#getPrefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void flushPending() throws SAXException

    /**
     * @see SerializationHandler#flushPending()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public NamespaceMappings getNamespaceMappings()

    /**
     * Get the current namespace mappings.
     * Simply returns the mappings of the wrapped handler.
     * @see ExtendedContentHandler#getNamespaceMappings()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttributes(Attributes atts) throws SAXException

    /**
     * @see ExtendedContentHandler#addAttributes(org.xml.sax.Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setCdataSectionElements(Vector URI_and_localNames)

    /**
     * @param URI_and_localNames Vector a list of pairs of URI/localName
     * specified in the cdata-section-elements attribute.
     * @see SerializationHandler#setCdataSectionElements(java.util.Vector)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public DOMSerializer asDOMSerializer() throws IOException

    /**
     * @see Serializer#asDOMSerializer()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean isFirstElemHTML()

    /**
     * Determine if the firts element in the document is <html> or <HTML>
     * This uses the cached first element name, first element prefix and the
     * cached namespaces from previous method calls
     *
     * @return true if the first element is an opening <html> tag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String getPrefixPartUnknown(String qname)

    /**
         * Utility function to return prefix
         *
         * Don't want to override static function on SerializerBase
         * So added Unknown suffix to method name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String getLocalNameUnknown(String value)

    /**
     * Utility function for calls to local-name().
     *
     * Don't want to override static function on SerializerBase
     * So added Unknown suffix to method name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private void initStreamOutput() throws SAXException

    /**
     * Initialize the wrapped output stream (XML or HTML).
     * If the stream handler should be HTML, then replace the XML handler with
     * an HTML handler. After than send the starting method calls that were cached
     * to the wrapped handler.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startEntity(String name) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#startEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startDTD(String name, String publicId, String systemId)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startCDATA() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#startCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endEntity(String name) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#endEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endDTD() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#endDTD()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endCDATA() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#endCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void comment(char[] ch, int start, int length) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void skippedEntity(String name) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#skippedEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDocumentLocator(Locator locator)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void processingInstruction(String target, String data)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void ignorableWhitespace(char[] ch, int start, int length)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endPrefixMapping(String prefix) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#endPrefixMapping(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endElement(String namespaceURI, String localName, String qName)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#endElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endDocument() throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#endDocument()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void characters(char[] characters, int offset, int length)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ContentHandler#characters(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void internalEntityDecl(String arg0, String arg1)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void externalEntityDecl(
        String name,
        String publicId,
        String systemId)

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void elementDecl(String arg0, String arg1) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    /**

    /**
     * @see XSLOutputAttributes#setVersion(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setStandalone(String standalone)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setStandalone(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setOmitXMLDeclaration(boolean b)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setOmitXMLDeclaration(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setMediaType(String mediaType)

    /**
     * @see XSLOutputAttributes#setMediaType(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setIndentAmount(int value)

    /**
     * Pass the call on to the underlying handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setIndent(boolean indent)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setIndent(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setEncoding(String encoding)

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#setEncoding(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDoctypeSystem(String doctype)

    /**
     * Set the doctype in the underlying XML handler. Remember that this method
     * was called, just in case we need to transfer this doctype to an HTML handler
     * @param doctype the system doctype to set
     * @see XSLOutputAttributes#setDoctypeSystem(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDoctypePublic(String doctype)

    /**
     * Set the doctype in the underlying XML handler. Remember that this method
     * was called, just in case we need to transfer this doctype to an HTML handler
     * @param doctype the public doctype to set
     * @see XSLOutputAttributes#setDoctypePublic(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setDoctype(String system, String pub)

    /**
     * @see XSLOutputAttributes#setDoctype(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getVersion()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getVersion()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getStandalone()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getStandalone()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean getOmitXMLDeclaration()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getOmitXMLDeclaration()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getMediaType()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getMediaType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public int getIndentAmount()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getIndentAmount()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean getIndent()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getIndent()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getEncoding()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getEncoding()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getDoctypeSystem()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getDoctypeSystem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public String getDoctypePublic()

    /**
     * Pass the call on to the underlying handler
     * @see XSLOutputAttributes#getDoctypePublic()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void comment(String comment) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see ExtendedLexicalHandler#comment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startDocument() throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#startDocument()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setVersion(String version)

    /**
      * This method cannot be cached because default is different in
      * HTML and XML (we need more than a boolean).
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void namespaceAfterStartElement(String prefix, String uri)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void startPrefixMapping(String prefix, String uri) throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String)
     * @param prefix The prefix that maps to the URI
     * @param uri The URI for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void endElement(String elementName) throws SAXException

    /**
     * Pass the call on to the underlying handler
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void characters(String chars) throws SAXException

    /**
     * Converts the String to a character array and calls the SAX method
     * characters(char[],int,int);
     *
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addUniqueAttribute(String rawName, String value, int flags)

    /**
     * Adds a unique attribute to the currenly open tag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttribute(String rawName, String value)

    /**
     * Adds an attribute to the currenly open tag
     * @param rawName the attribute name, with prefix (if any)
     * @param value the value of the parameter
     * @see ExtendedContentHandler#addAttribute(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds an attribute to the currenly open tag
     * @param uri the URI of a namespace
     * @param localName the attribute name, without prefix
     * @param rawName the attribute name, with prefix (if any)
     * @param type the type of the attribute, typically "CDATA"
     * @param value the value of the parameter
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value)

    /**
     * Adds an attribute to the currenly open tag
     * @param uri the URI of a namespace
     * @param localName the attribute name, without prefix
     * @param rawName the attribute name, with prefix (if any)
     * @param type the type of the attribute, typically "CDATA"
     * @param value the value of the parameter
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setWriter(Writer writer)

    /**
     * Sets the writer to write to
     * @param writer the writer to write to
     * @see Serializer#setWriter(Writer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setOutputStream(OutputStream output)

    /**
     * Sets the output stream to write to
     * @param output the OutputStream to write to
     * @see Serializer#setOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void setOutputFormat(Properties format)

    /**
     * Set the properties of the handler
     * @param format the output properties to set
     * @see Serializer#setOutputFormat(Properties)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean setEscaping(boolean escape) throws SAXException

    /**
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void serialize(Node node) throws IOException

    /**
     * Converts the DOM node to output
     * @param node the DOM node to transform to output
     * @see DOMSerializer#serialize(Node)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public boolean reset()

    /**
     * passes the call on to the underlying HTML or XML handler
     * @see Serializer#reset()
     * @return ???
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public Writer getWriter()

    /**
     * @see Serializer#getWriter()
     * @return the Writer of the underlying XML or HTML handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public OutputStream getOutputStream()

    /**
     * @see Serializer#getOutputStream()
     * @return the OutputStream of the underlying XML or HTML handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public Properties getOutputFormat()

    /**
     * @see Serializer#getOutputFormat()
     * @return the properties of the underlying handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public void close()

    /**
     * @see SerializationHandler#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public ContentHandler asContentHandler() throws IOException

    /**
     * @see Serializer#asContentHandler()
     * @return the wrapped XML or HTML handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    public ToUnknownStream()

    /**
     * Default constructor.
     * Initially this object wraps an XML Stream object, so _handler is never null.
     * That may change later to an HTML Stream object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_setMediaType_called = false;

    /**
     * true if setMediaType() was called before the underlying handler
     * was initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_setDoctypeSystem_called = false;

    /**
     * true if setDoctypeSystem() was called before the underlying handler
     * was initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_needToCallStartDocument = false;

    /**
     * true if startDocument() was called before the underlying handler
     * was initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private Vector m_namespaceURI = null;

    /**
     * A collection of namespace URI's (only for first element).
     * _namespacePrefix has the matching prefix for these URI's
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_firstTagNotEmitted = true;

    /**
     * true if the first tag has been emitted to the wrapped handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String m_firstElementLocalName = null;

    /**
     * the local name (no prefix) associated with the first element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String m_firstElementURI;

    /**
     * the namespace URI associated with the first element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private String m_firstElementPrefix;

    /**
     * the prefix of the very first tag in the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private boolean m_wrapped_handler_not_initialized = false;

    /**
     * true if the underlying handler (XML or HTML) is fully initialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private static final String EMPTYSTRING = "";

    /**
     * A String with no characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
    private SerializationHandler m_handler;

    /**
     * The wrapped handler, initially XML but possibly switched to HTML
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToUnknownStream.java
public final class ToUnknownStream extends SerializerBase

/**
 *This class wraps another SerializationHandler. The wrapped object will either
 * handler XML or HTML, which is not known until a little later when the first XML
 * tag is seen.  If the first tag is <html> then the wrapped object is an HTML
 * handler, otherwise it is an XML handler.
 *
 * This class effectively caches the first few calls to it then passes them
 * on to the wrapped handler (once it exists).  After that subsequent calls a
 * simply passed directly to the wrapped handler.
 *
 * The user of this class doesn't know if the output is ultimatley XML or HTML.
 *
 * This class is not a public API, it is public because it is used within Xalan.
 * @xsl.usage internal
 */
