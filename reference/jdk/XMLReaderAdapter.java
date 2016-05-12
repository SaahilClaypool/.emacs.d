_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
        public String getValue (String qName)

        /**
         * Return the value of an attribute by qualified (prefixed) name.
         *
         * @return The value.
         * @see org.xml.sax.AttributeList#getValue(java.lang.String)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
        public String getType (String qName)

        /**
         * Return the type of an attribute by qualified (prefixed) name.
         *
         * @return The type.
         * @see org.xml.sax.AttributeList#getType(java.lang.String)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
        public String getValue (int i)

        /**
         * Return the value of an attribute by position.
         *
         * @return The value.
         * @see org.xml.sax.AttributeList#getValue(int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
        public String getType (int i)

        /**
         * Return the type of an attribute by position.
         *
         * @return The type.
         * @see org.xml.sax.AttributeList#getType(int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
        public String getName (int i)

        /**
         * Return the qualified (prefixed) name of an attribute by position.
         *
         * @return The qualified name.
         * @see org.xml.sax.AttributeList#getName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
        public int getLength ()

        /**
         * Return the number of attributes.
         *
         * @return The length of the attribute list.
         * @see org.xml.sax.AttributeList#getLength
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
        void setAttributes (Attributes attributes)

        /**
         * Set the embedded Attributes object.
         *
         * @param The embedded SAX2 Attributes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    final class AttributesAdapter implements AttributeList

    /**
     * Internal class to wrap a SAX2 Attributes object for SAX1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    // Internal class.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    // Internal state.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void skippedEntity (String name)

    /**
     * Adapt a SAX2 skipped entity event.
     *
     * @param name The name of the skipped entity.
     * @see org.xml.sax.ContentHandler#skippedEntity
     * @exception org.xml.sax.SAXException Throwable by subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void processingInstruction (String target, String data)

    /**
     * Adapt a SAX2 processing instruction event.
     *
     * @param target The processing instruction target.
     * @param data The remainder of the processing instruction
     * @exception org.xml.sax.SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.ContentHandler#processingInstruction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void ignorableWhitespace (char ch[], int start, int length)

    /**
     * Adapt a SAX2 ignorable whitespace event.
     *
     * @param ch An array of characters.
     * @param start The starting position in the array.
     * @param length The number of characters to use.
     * @exception org.xml.sax.SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.ContentHandler#ignorableWhitespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void characters (char ch[], int start, int length)

    /**
     * Adapt a SAX2 characters event.
     *
     * @param ch An array of characters.
     * @param start The starting position in the array.
     * @param length The number of characters to use.
     * @exception org.xml.sax.SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.ContentHandler#characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void endElement (String uri, String localName,
                            String qName)

    /**
     * Adapt a SAX2 end element event.
     *
     * @param uri The Namespace URI.
     * @param localName The Namespace local name.
     * @param qName The qualified (prefixed) name.
     * @exception org.xml.sax.SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.ContentHandler#endElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void startElement (String uri, String localName,
                              String qName, Attributes atts)

    /**
     * Adapt a SAX2 start element event.
     *
     * @param uri The Namespace URI.
     * @param localName The Namespace local name.
     * @param qName The qualified (prefixed) name.
     * @param atts The SAX2 attributes.
     * @exception org.xml.sax.SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.ContentHandler#endDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void endPrefixMapping (String prefix)

    /**
     * Adapt a SAX2 end prefix mapping event.
     *
     * @param prefix The prefix being mapped.
     * @see org.xml.sax.ContentHandler#endPrefixMapping
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void startPrefixMapping (String prefix, String uri)

    /**
     * Adapt a SAX2 start prefix mapping event.
     *
     * @param prefix The prefix being mapped.
     * @param uri The Namespace URI being mapped to.
     * @see org.xml.sax.ContentHandler#startPrefixMapping
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void endDocument ()

    /**
     * End document event.
     *
     * @exception org.xml.sax.SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.ContentHandler#endDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void startDocument ()

    /**
     * Start document event.
     *
     * @exception org.xml.sax.SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.ContentHandler#startDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void setDocumentLocator (Locator locator)

    /**
     * Set a document locator.
     *
     * @param locator The document locator.
     * @see org.xml.sax.ContentHandler#setDocumentLocator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    // Implementation of org.xml.sax.ContentHandler.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    private void setupXMLReader ()

    /**
     * Set up the XML reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void parse (InputSource input)

    /**
     * Parse the document.
     *
     * <p>This method will throw an exception if the embedded
     * XMLReader does not support the
     * http://xml.org/sax/features/namespace-prefixes property.</p>
     *
     * @param input An input source for the document.
     * @exception java.io.IOException If there is a problem reading
     *            the raw content of the document.
     * @exception org.xml.sax.SAXException If there is a problem
     *            processing the document.
     * @see #parse(java.lang.String)
     * @see org.xml.sax.Parser#parse(org.xml.sax.InputSource)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void parse (String systemId)

    /**
     * Parse the document.
     *
     * <p>This method will throw an exception if the embedded
     * XMLReader does not support the
     * http://xml.org/sax/features/namespace-prefixes property.</p>
     *
     * @param systemId The absolute URL of the document.
     * @exception java.io.IOException If there is a problem reading
     *            the raw content of the document.
     * @exception org.xml.sax.SAXException If there is a problem
     *            processing the document.
     * @see #parse(org.xml.sax.InputSource)
     * @see org.xml.sax.Parser#parse(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void setErrorHandler (ErrorHandler handler)

    /**
     * Register the error event handler.
     *
     * @param handler The new error event handler.
     * @see org.xml.sax.Parser#setErrorHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void setDocumentHandler (DocumentHandler handler)

    /**
     * Register the SAX1 document event handler.
     *
     * <p>Note that the SAX1 document handler has no Namespace
     * support.</p>
     *
     * @param handler The new SAX1 document event handler.
     * @see org.xml.sax.Parser#setDocumentHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void setDTDHandler (DTDHandler handler)

    /**
     * Register the DTD event handler.
     *
     * @param handler The new DTD event handler.
     * @see org.xml.sax.Parser#setDTDHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void setEntityResolver (EntityResolver resolver)

    /**
     * Register the entity resolver.
     *
     * @param resolver The new resolver.
     * @see org.xml.sax.Parser#setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public void setLocale (Locale locale)

    /**
     * Set the locale for error reporting.
     *
     * <p>This is not supported in SAX2, and will always throw
     * an exception.</p>
     *
     * @param locale the locale for error reporting.
     * @see org.xml.sax.Parser#setLocale
     * @exception org.xml.sax.SAXException Thrown unless overridden.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    // Implementation of org.xml.sax.Parser.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    private void setup (XMLReader xmlReader)

    /**
     * Internal setup.
     *
     * @param xmlReader The embedded XMLReader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public XMLReaderAdapter (XMLReader xmlReader)

    /**
     * Create a new adapter.
     *
     * <p>Create a new adapter, wrapped around a SAX2 XMLReader.
     * The adapter will make the XMLReader act like a SAX1
     * Parser.</p>
     *
     * @param xmlReader The SAX2 XMLReader to wrap.
     * @exception java.lang.NullPointerException If the argument is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    public XMLReaderAdapter ()

    /**
     * Create a new adapter.
     *
     * <p>Use the "org.xml.sax.driver" property to locate the SAX2
     * driver to embed.</p>
     *
     * @exception org.xml.sax.SAXException If the embedded driver
     *            cannot be instantiated or if the
     *            org.xml.sax.driver property is not specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
    // Constructor.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLReaderAdapter.java
public class XMLReaderAdapter implements Parser, ContentHandler

/**
 * Adapt a SAX2 XMLReader as a SAX1 Parser.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class wraps a SAX2 {@link org.xml.sax.XMLReader XMLReader}
 * and makes it act as a SAX1 {@link org.xml.sax.Parser Parser}.  The XMLReader
 * must support a true value for the
 * http://xml.org/sax/features/namespace-prefixes property or parsing will fail
 * with a {@link org.xml.sax.SAXException SAXException}; if the XMLReader
 * supports a false value for the http://xml.org/sax/features/namespaces
 * property, that will also be used to improve efficiency.</p>
 *
 * @since SAX 2.0
 * @author David Megginson
 * @see org.xml.sax.Parser
 * @see org.xml.sax.XMLReader
 */
