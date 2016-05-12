_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    private void resetToXMLSAXHandler()

    /**
     * Reset all of the fields owned by ToXMLSAXHandler class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public boolean reset()

    /**
     * Try's to reset the super class and reset this class for
     * re-use, so that you don't need to create a new serializer
     * (mostly for performance reasons).
     *
     * @return true if the class was successfuly reset.
     * @see Serializer#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds the given attribute to the set of attributes, and also makes sure
     * that the needed prefix/uri mapping is declared, but only if there is a
     * currently open element.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName    the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startElement(
    String namespaceURI,
    String localName,
    String name,
    Attributes atts)

    /**
     * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    protected boolean popNamespace(String prefix)

    /**
     * Undeclare the namespace that is currently pointed to by a given
     * prefix. Inform SAX handler if prefix was previously mapped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void processingInstruction(String target, String data)

    /**
     *
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     * Send a processing instruction to the output document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void namespaceAfterStartElement(
        final String prefix,
        final String uri)

    /**
     * Send a namespace declaration in the output document. The namespace
     * declaration will not be include if the namespace is already in scope
     * with the same prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endElement(String elemName) throws SAXException

    /**
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startElement(
    String elementNamespaceURI,
    String elementLocalName,
    String elementName) throws SAXException

    /**
     * Start an element in the output document. This might be an XML element
     * (<elem>data</elem> type) or a CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public ToXMLSAXHandler(ContentHandler handler, String encoding)

    /////////////////// from XSLTC //////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void characters(String chars) throws SAXException

    /**
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startEntity(String arg0) throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#startEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endDTD() throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#endDTD()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endCDATA() throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#endCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void comment(char[] arg0, int arg1, int arg2) throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * Remember the prefix/uri mapping at the current nested element depth.
     *
     * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String)
     * @param prefix The prefix that maps to the URI
     * @param uri The URI for the namespace
     * @param shouldFlush a flag indicating if the mapping applies to the
     * current element or an up coming child (not used).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String)
     * @param prefix The prefix that maps to the URI
     * @param uri The URI for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void skippedEntity(String arg0) throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#skippedEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setDocumentLocator(Locator arg0)

    /**
     * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void ignorableWhitespace(char[] arg0, int arg1, int arg2)

    /**
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endPrefixMapping(String prefix) throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#endPrefixMapping(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endElement(String namespaceURI, String localName, String qName)

    /**
     * @see org.xml.sax.ContentHandler#endElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void closeCDATA() throws SAXException

    /**
     * Closes ane open cdata tag, and
     * unlike the this.endCDATA() method (from the LexicalHandler) interface,
     * this "internal" method will send the endCDATA() call to the wrapped
     * handler.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    protected void closeStartTag() throws SAXException

    /**
     * This method is called when all the data needed for a call to the
     * SAX handler's startElement() method has been gathered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endDocument() throws SAXException

    /**
     * Receives notification of the end of the document.
     * @see org.xml.sax.ContentHandler#endDocument()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void internalEntityDecl(String arg0, String arg1)

    /**
     * @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void externalEntityDecl(String arg0, String arg1, String arg2)

    /**
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void elementDecl(String arg0, String arg1) throws SAXException

    /**
     * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void attributeDecl(
        String arg0,
        String arg1,
        String arg2,
        String arg3,
        String arg4)

    /**
     * @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setWriter(Writer writer)

    /**
     * @see Serializer#setWriter(Writer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setOutputStream(OutputStream output)

    /**
     * @see Serializer#setOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setOutputFormat(Properties format)

    /**
     * @see Serializer#setOutputFormat(Properties)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public boolean setEscaping(boolean escape) throws SAXException

    /**
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void serialize(Node node) throws IOException

    /**
     * @see DOMSerializer#serialize(Node)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void indent(int n) throws SAXException

    /**
     * Do nothing for SAX.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public Writer getWriter()

    /**
     * @see Serializer#getWriter()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public OutputStream getOutputStream()

    /**
     * @see Serializer#getOutputStream()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public Properties getOutputFormat()

    /**
     * @see Serializer#getOutputFormat()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    protected boolean m_escapeSetting = true;

    /**
     * Keeps track of whether output escaping is currently enabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
public final class ToXMLSAXHandler extends ToSAXHandler

/**
 * This class receives notification of SAX-like events, and with gathered
 * information over these calls it will invoke the equivalent SAX methods
 * on a handler, the ultimate xsl:output method is known to be "xml".
 *
 * This class is not a public API, it is only public because it is used by Xalan.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    private void resetToXMLSAXHandler()

    /**
     * Reset all of the fields owned by ToXMLSAXHandler class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public boolean reset()

    /**
     * Try's to reset the super class and reset this class for
     * re-use, so that you don't need to create a new serializer
     * (mostly for performance reasons).
     *
     * @return true if the class was successfuly reset.
     * @see Serializer#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Adds the given attribute to the set of attributes, and also makes sure
     * that the needed prefix/uri mapping is declared, but only if there is a
     * currently open element.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName    the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if this attribute is coming from an xsl:attribute element
     * @see ExtendedContentHandler#addAttribute(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startElement(
    String namespaceURI,
    String localName,
    String name,
    Attributes atts)

    /**
     * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    protected boolean popNamespace(String prefix)

    /**
     * Undeclare the namespace that is currently pointed to by a given
     * prefix. Inform SAX handler if prefix was previously mapped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void processingInstruction(String target, String data)

    /**
     *
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     * Send a processing instruction to the output document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void namespaceAfterStartElement(
        final String prefix,
        final String uri)

    /**
     * Send a namespace declaration in the output document. The namespace
     * declaration will not be include if the namespace is already in scope
     * with the same prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endElement(String elemName) throws SAXException

    /**
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startElement(
    String elementNamespaceURI,
    String elementLocalName,
    String elementName) throws SAXException

    /**
     * Start an element in the output document. This might be an XML element
     * (<elem>data</elem> type) or a CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public ToXMLSAXHandler(ContentHandler handler, String encoding)

    /////////////////// from XSLTC //////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void characters(String chars) throws SAXException

    /**
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startEntity(String arg0) throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#startEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endDTD() throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#endDTD()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endCDATA() throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#endCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void comment(char[] arg0, int arg1, int arg2) throws SAXException

    /**
     * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * Remember the prefix/uri mapping at the current nested element depth.
     *
     * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String)
     * @param prefix The prefix that maps to the URI
     * @param uri The URI for the namespace
     * @param shouldFlush a flag indicating if the mapping applies to the
     * current element or an up coming child (not used).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String)
     * @param prefix The prefix that maps to the URI
     * @param uri The URI for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void skippedEntity(String arg0) throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#skippedEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setDocumentLocator(Locator arg0)

    /**
     * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void ignorableWhitespace(char[] arg0, int arg1, int arg2)

    /**
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endPrefixMapping(String prefix) throws SAXException

    /**
     * @see org.xml.sax.ContentHandler#endPrefixMapping(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endElement(String namespaceURI, String localName, String qName)

    /**
     * @see org.xml.sax.ContentHandler#endElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void closeCDATA() throws SAXException

    /**
     * Closes ane open cdata tag, and
     * unlike the this.endCDATA() method (from the LexicalHandler) interface,
     * this "internal" method will send the endCDATA() call to the wrapped
     * handler.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    protected void closeStartTag() throws SAXException

    /**
     * This method is called when all the data needed for a call to the
     * SAX handler's startElement() method has been gathered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void endDocument() throws SAXException

    /**
     * Receives notification of the end of the document.
     * @see org.xml.sax.ContentHandler#endDocument()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void internalEntityDecl(String arg0, String arg1)

    /**
     * @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void externalEntityDecl(String arg0, String arg1, String arg2)

    /**
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void elementDecl(String arg0, String arg1) throws SAXException

    /**
     * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void attributeDecl(
        String arg0,
        String arg1,
        String arg2,
        String arg3,
        String arg4)

    /**
     * @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setWriter(Writer writer)

    /**
     * @see Serializer#setWriter(Writer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setOutputStream(OutputStream output)

    /**
     * @see Serializer#setOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void setOutputFormat(Properties format)

    /**
     * @see Serializer#setOutputFormat(Properties)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public boolean setEscaping(boolean escape) throws SAXException

    /**
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void serialize(Node node) throws IOException

    /**
     * @see DOMSerializer#serialize(Node)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public void indent(int n) throws SAXException

    /**
     * Do nothing for SAX.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public Writer getWriter()

    /**
     * @see Serializer#getWriter()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public OutputStream getOutputStream()

    /**
     * @see Serializer#getOutputStream()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    public Properties getOutputFormat()

    /**
     * @see Serializer#getOutputFormat()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
    protected boolean m_escapeSetting = true;

    /**
     * Keeps track of whether output escaping is currently enabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLSAXHandler.java
public final class ToXMLSAXHandler extends ToSAXHandler

/**
 * This class receives notification of SAX-like events, and with gathered
 * information over these calls it will invoke the equivalent SAX methods
 * on a handler, the ultimate xsl:output method is known to be "xml".
 *
 * This class is not a public API, it is only public because it is used by Xalan.
 * @xsl.usage internal
 */
