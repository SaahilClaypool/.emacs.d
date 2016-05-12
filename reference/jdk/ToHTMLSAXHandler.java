_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    private void resetToHTMLSAXHandler()

    /**
     * Reset all of the fields owned by ToHTMLSAXHandler class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void namespaceAfterStartElement(
        final String prefix,
        final String uri)

    /**
     * This method is used when a prefix/uri namespace mapping
     * is indicated after the element was started with a
     * startElement() and before and endElement().
     * startPrefixMapping(prefix,uri) would be used before the
     * startElement() call.
     * @param prefix the prefix associated with the given URI.
     * @param uri the URI of the namespace
     *
     * @see ExtendedContentHandler#namespaceAfterStartElement(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * Begin the scope of a prefix-URI Namespace mapping
     * just before another element is about to start.
     * This call will close any open tags so that the prefix mapping
     * will not apply to the current element, but the up comming child.
     *
     * @see org.xml.sax.ContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * Handle a prefix/uri mapping, which is associated with a startElement()
     * that is soon to follow. Need to close any open start tag to make
     * sure than any name space attributes due to this event are associated wih
     * the up comming element, not the current one.
     * @see ExtendedContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     * @param shouldFlush true if any open tags need to be closed first, this
     * will impact which element the mapping applies to (open parent, or its up
     * comming child)
     * @return returns true if the call made a change to the current
     * namespace information, false if it did not change anything, e.g. if the
     * prefix/namespace mapping was already in scope from before.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void flushPending() throws SAXException

    /**
     * This method flushes any pending events, which can be startDocument()
     * closing the opening tag of an element, or closing an open CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void characters(char[] ch, int off, int len) throws SAXException

    /**
     * Receive notification of character data.
     *
     * <p>The Parser will call this method to report each chunk of
     * character data.  SAX parsers may return all contiguous character
     * data in a single chunk, or they may split it into several
     * chunks; however, all of the characters in any single event
     * must come from the same external entity, so that the Locator
     * provides useful information.</p>
     *
     * <p>The application must not attempt to read from the array
     * outside of the specified range.</p>
     *
     * <p>Note that some parsers will report whitespace using the
     * ignorableWhitespace() method rather than this one (validating
     * parsers must do so).</p>
     *
     * @param ch The characters from the XML document.
     * @param off The start position in the array.
     * @param len The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #ignorableWhitespace
     * @see org.xml.sax.Locator
     *
     * @throws org.xml.sax.SAXException
     *
     * @see org.xml.sax.ContentHandler#characters(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endElement(String elementName) throws SAXException

    /**
     * Receive notification of the end of an element.
     * @param elementName The element type name
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *     wrapping another exception.
     *
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startElement(String elementName) throws SAXException

    /**
     * An element starts, but attributes are not fully known yet.
     *
     * @param elementName the element name, with prefix, if any
     *
     * @see ExtendedContentHandler#startElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startElement(
        String elementNamespaceURI,
        String elementLocalName,
        String elementName) throws SAXException

    /**
     * An element starts, but attributes are not fully known yet.
     *
     * @param elementNamespaceURI the URI of the namespace of the element
     * (optional)
     * @param elementLocalName the element name, but without prefix
     * (optional)
     * @param elementName the element name, with prefix, if any (required)
     *
     * @see ExtendedContentHandler#startElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public ToHTMLSAXHandler(
        ContentHandler handler,
        LexicalHandler lex,
        String encoding)

    /**
     * A constructor.
     * @param handler the wrapped SAX content handler
     * @param lex the wrapped lexical handler
     * @param encoding the encoding of the output HTML document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public ToHTMLSAXHandler(ContentHandler handler, String encoding)

    /**
     * A constructor
     * @param handler the wrapped SAX content handler
     * @param encoding the encoding of the output HTML document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void characters(final String chars) throws SAXException

    /**
     * Receive notification of character data.
     *
     * @param chars The string of characters to process.
     *
     * @throws org.xml.sax.SAXException
     *
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void close()

    /**
     * Do nothing.
     * @see SerializationHandler#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    protected void closeStartTag() throws SAXException

    /**
     * This method is called when all the data needed for a call to the
     * SAX handler's startElement() method has been gathered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endDocument() throws SAXException

    /**
     * Receive notification of the end of a document.
     *
     * <p>The SAX parser will invoke this method only once, and it will
     * be the last method invoked during the parse.  The parser shall
     * not invoke this method until it has either abandoned parsing
     * (because of an unrecoverable error) or reached the end of
     * input.</p>
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     *
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startEntity(String arg0) throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#startEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startCDATA() throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#startCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endDTD() throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#endDTD()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endCDATA() throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#endCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void comment(char[] ch, int start, int length) throws SAXException

    /**
     * Receive notification of a comment anywhere in the document. This callback
     * will be used for comments inside or outside the document element.
     * @param ch An array holding the characters in the comment.
     * @param start The starting position in the array.
     * @param length The number of characters to use from the array.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     *
     * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startElement(
        String namespaceURI,
        String localName,
        String qName,
        Attributes atts)

    /**
     * Receive notification of the beginning of an element, although this is a
     * SAX method additional namespace or attribute information can occur before
     * or after this call, that is associated with this element.
     *
     *
     * @param namespaceURI The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param qName The elements name.
     * @param atts The attributes attached to the element, if any.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startElement
     * @see org.xml.sax.ContentHandler#endElement
     * @see org.xml.sax.AttributeList
     *
     * @throws org.xml.sax.SAXException
     *
     * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void skippedEntity(String arg0) throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ContentHandler#skippedEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setDocumentLocator(Locator arg0)

    /**
     * Does nothing.
     * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void processingInstruction(String target, String data)

    /**
     * Receive notification of a processing instruction.
     *
     * <p>The Parser will invoke this method once for each processing
     * instruction found: note that processing instructions may occur
     * before or after the main document element.</p>
     *
     * <p>A SAX parser should never report an XML declaration (XML 1.0,
     * section 2.8) or a text declaration (XML 1.0, section 4.3.1)
     * using this method.</p>
     *
     * @param target The processing instruction target.
     * @param data The processing instruction data, or null if
     *        none was supplied.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void ignorableWhitespace(char[] ch, int start, int length)

    /**
     * Does nothing.
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endPrefixMapping(String prefix) throws SAXException

    /**
     * Does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endElement(String uri, String localName, String qName)

    /**
     * Receive notification of the end of an element.
     *
     * <p>The SAX parser will invoke this method at the end of every
     * element in the XML document; there will be a corresponding
     * startElement() event for every endElement() event (even when the
     * element is empty).</p>
     *
     * <p>If the element name has a namespace prefix, the prefix will
     * still be attached to the name.</p>
     *
     *
     * @param uri The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param qName The qualified name (with prefix), or the
     *        empty string if qualified names are not available.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#endElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void internalEntityDecl(String name, String value)

    /**
     * Does nothing.
     *
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void externalEntityDecl(String arg0, String arg1, String arg2)

    /**
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void elementDecl(String name, String model) throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    /**

    /**
     * @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setWriter(Writer writer)

    /**
     * Does nothing.
     * @param writer this parameter is ignored.
     * @see Serializer#setWriter(Writer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setOutputStream(OutputStream output)

    /**
     * Does nothing.
     * @param output this parameter is ignored
     * @see Serializer#setOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setOutputFormat(Properties format)

    /**
     * Does nothing.
     * @param format this parameter is not used
     * @see Serializer#setOutputFormat(Properties)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setIndent(boolean indent)

    /**
     * Does nothing
     * @param indent the number of spaces to indent per indentation level
     * (ignored)
     * @see SerializationHandler#setIndent(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public boolean setEscaping(boolean escape) throws SAXException

    /**
     * Turns special character escaping on/off.
     *
     *
     * @param escape true if escaping is to be set on.
     *
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void serialize(Node node) throws IOException

    /**
     * Does nothing.
     * @see DOMSerializer#serialize(Node)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void indent(int n) throws SAXException

    /**
     * Does nothing.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public Writer getWriter()

    /**
     * Returns null
     * @return null
     * @see Serializer#getWriter()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public OutputStream getOutputStream()

    /**
     * Reurns null
     * @return null
     * @see Serializer#getOutputStream()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public Properties getOutputFormat()

    /**
     * Returns null.
     * @return null
     * @see Serializer#getOutputFormat()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    protected boolean m_escapeSetting = true;

    /**
     * Keeps track of whether output escaping is currently enabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
        private boolean m_dtdHandled = false;

        /**
         *  Handle document type declaration (for first element only)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
public final class ToHTMLSAXHandler extends ToSAXHandler

/**
 * This class accepts SAX-like calls, then sends true SAX calls to a
 * wrapped SAX handler.  There is optimization done knowing that the ultimate
 * output is HTML.
 *
 * This class is not a public API.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    private void resetToHTMLSAXHandler()

    /**
     * Reset all of the fields owned by ToHTMLSAXHandler class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void namespaceAfterStartElement(
        final String prefix,
        final String uri)

    /**
     * This method is used when a prefix/uri namespace mapping
     * is indicated after the element was started with a
     * startElement() and before and endElement().
     * startPrefixMapping(prefix,uri) would be used before the
     * startElement() call.
     * @param prefix the prefix associated with the given URI.
     * @param uri the URI of the namespace
     *
     * @see ExtendedContentHandler#namespaceAfterStartElement(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * Begin the scope of a prefix-URI Namespace mapping
     * just before another element is about to start.
     * This call will close any open tags so that the prefix mapping
     * will not apply to the current element, but the up comming child.
     *
     * @see org.xml.sax.ContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * Handle a prefix/uri mapping, which is associated with a startElement()
     * that is soon to follow. Need to close any open start tag to make
     * sure than any name space attributes due to this event are associated wih
     * the up comming element, not the current one.
     * @see ExtendedContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     * @param shouldFlush true if any open tags need to be closed first, this
     * will impact which element the mapping applies to (open parent, or its up
     * comming child)
     * @return returns true if the call made a change to the current
     * namespace information, false if it did not change anything, e.g. if the
     * prefix/namespace mapping was already in scope from before.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void flushPending() throws SAXException

    /**
     * This method flushes any pending events, which can be startDocument()
     * closing the opening tag of an element, or closing an open CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void characters(char[] ch, int off, int len) throws SAXException

    /**
     * Receive notification of character data.
     *
     * <p>The Parser will call this method to report each chunk of
     * character data.  SAX parsers may return all contiguous character
     * data in a single chunk, or they may split it into several
     * chunks; however, all of the characters in any single event
     * must come from the same external entity, so that the Locator
     * provides useful information.</p>
     *
     * <p>The application must not attempt to read from the array
     * outside of the specified range.</p>
     *
     * <p>Note that some parsers will report whitespace using the
     * ignorableWhitespace() method rather than this one (validating
     * parsers must do so).</p>
     *
     * @param ch The characters from the XML document.
     * @param off The start position in the array.
     * @param len The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #ignorableWhitespace
     * @see org.xml.sax.Locator
     *
     * @throws org.xml.sax.SAXException
     *
     * @see org.xml.sax.ContentHandler#characters(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endElement(String elementName) throws SAXException

    /**
     * Receive notification of the end of an element.
     * @param elementName The element type name
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *     wrapping another exception.
     *
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startElement(String elementName) throws SAXException

    /**
     * An element starts, but attributes are not fully known yet.
     *
     * @param elementName the element name, with prefix, if any
     *
     * @see ExtendedContentHandler#startElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startElement(
        String elementNamespaceURI,
        String elementLocalName,
        String elementName) throws SAXException

    /**
     * An element starts, but attributes are not fully known yet.
     *
     * @param elementNamespaceURI the URI of the namespace of the element
     * (optional)
     * @param elementLocalName the element name, but without prefix
     * (optional)
     * @param elementName the element name, with prefix, if any (required)
     *
     * @see ExtendedContentHandler#startElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public ToHTMLSAXHandler(
        ContentHandler handler,
        LexicalHandler lex,
        String encoding)

    /**
     * A constructor.
     * @param handler the wrapped SAX content handler
     * @param lex the wrapped lexical handler
     * @param encoding the encoding of the output HTML document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public ToHTMLSAXHandler(ContentHandler handler, String encoding)

    /**
     * A constructor
     * @param handler the wrapped SAX content handler
     * @param encoding the encoding of the output HTML document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void characters(final String chars) throws SAXException

    /**
     * Receive notification of character data.
     *
     * @param chars The string of characters to process.
     *
     * @throws org.xml.sax.SAXException
     *
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void close()

    /**
     * Do nothing.
     * @see SerializationHandler#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    protected void closeStartTag() throws SAXException

    /**
     * This method is called when all the data needed for a call to the
     * SAX handler's startElement() method has been gathered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endDocument() throws SAXException

    /**
     * Receive notification of the end of a document.
     *
     * <p>The SAX parser will invoke this method only once, and it will
     * be the last method invoked during the parse.  The parser shall
     * not invoke this method until it has either abandoned parsing
     * (because of an unrecoverable error) or reached the end of
     * input.</p>
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     *
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startEntity(String arg0) throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#startEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startCDATA() throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#startCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endDTD() throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#endDTD()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endCDATA() throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.LexicalHandler#endCDATA()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void comment(char[] ch, int start, int length) throws SAXException

    /**
     * Receive notification of a comment anywhere in the document. This callback
     * will be used for comments inside or outside the document element.
     * @param ch An array holding the characters in the comment.
     * @param start The starting position in the array.
     * @param length The number of characters to use from the array.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     *
     * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void startElement(
        String namespaceURI,
        String localName,
        String qName,
        Attributes atts)

    /**
     * Receive notification of the beginning of an element, although this is a
     * SAX method additional namespace or attribute information can occur before
     * or after this call, that is associated with this element.
     *
     *
     * @param namespaceURI The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param qName The elements name.
     * @param atts The attributes attached to the element, if any.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startElement
     * @see org.xml.sax.ContentHandler#endElement
     * @see org.xml.sax.AttributeList
     *
     * @throws org.xml.sax.SAXException
     *
     * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void skippedEntity(String arg0) throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ContentHandler#skippedEntity(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setDocumentLocator(Locator arg0)

    /**
     * Does nothing.
     * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void processingInstruction(String target, String data)

    /**
     * Receive notification of a processing instruction.
     *
     * <p>The Parser will invoke this method once for each processing
     * instruction found: note that processing instructions may occur
     * before or after the main document element.</p>
     *
     * <p>A SAX parser should never report an XML declaration (XML 1.0,
     * section 2.8) or a text declaration (XML 1.0, section 4.3.1)
     * using this method.</p>
     *
     * @param target The processing instruction target.
     * @param data The processing instruction data, or null if
     *        none was supplied.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void ignorableWhitespace(char[] ch, int start, int length)

    /**
     * Does nothing.
     * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endPrefixMapping(String prefix) throws SAXException

    /**
     * Does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void endElement(String uri, String localName, String qName)

    /**
     * Receive notification of the end of an element.
     *
     * <p>The SAX parser will invoke this method at the end of every
     * element in the XML document; there will be a corresponding
     * startElement() event for every endElement() event (even when the
     * element is empty).</p>
     *
     * <p>If the element name has a namespace prefix, the prefix will
     * still be attached to the name.</p>
     *
     *
     * @param uri The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param qName The qualified name (with prefix), or the
     *        empty string if qualified names are not available.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#endElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void internalEntityDecl(String name, String value)

    /**
     * Does nothing.
     *
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void externalEntityDecl(String arg0, String arg1, String arg2)

    /**
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void elementDecl(String name, String model) throws SAXException

    /**
     * Does nothing.
     * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    /**

    /**
     * @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setWriter(Writer writer)

    /**
     * Does nothing.
     * @param writer this parameter is ignored.
     * @see Serializer#setWriter(Writer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setOutputStream(OutputStream output)

    /**
     * Does nothing.
     * @param output this parameter is ignored
     * @see Serializer#setOutputStream(OutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setOutputFormat(Properties format)

    /**
     * Does nothing.
     * @param format this parameter is not used
     * @see Serializer#setOutputFormat(Properties)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void setIndent(boolean indent)

    /**
     * Does nothing
     * @param indent the number of spaces to indent per indentation level
     * (ignored)
     * @see SerializationHandler#setIndent(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public boolean setEscaping(boolean escape) throws SAXException

    /**
     * Turns special character escaping on/off.
     *
     *
     * @param escape true if escaping is to be set on.
     *
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void serialize(Node node) throws IOException

    /**
     * Does nothing.
     * @see DOMSerializer#serialize(Node)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public void indent(int n) throws SAXException

    /**
     * Does nothing.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public Writer getWriter()

    /**
     * Returns null
     * @return null
     * @see Serializer#getWriter()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public OutputStream getOutputStream()

    /**
     * Reurns null
     * @return null
     * @see Serializer#getOutputStream()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    public Properties getOutputFormat()

    /**
     * Returns null.
     * @return null
     * @see Serializer#getOutputFormat()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
    protected boolean m_escapeSetting = true;

    /**
     * Keeps track of whether output escaping is currently enabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
        private boolean m_dtdHandled = false;

        /**
         *  Handle document type declaration (for first element only)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLSAXHandler.java
public final class ToHTMLSAXHandler extends ToSAXHandler

/**
 * This class accepts SAX-like calls, then sends true SAX calls to a
 * wrapped SAX handler.  There is optimization done knowing that the ultimate
 * output is HTML.
 *
 * This class is not a public API.
 *
 * @xsl.usage internal
 */
