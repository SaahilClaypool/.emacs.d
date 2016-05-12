_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getValue (String qName)

        /**
         * Look up the value of an attribute by qualified (prefixed) name.
         *
         * @param qName The qualified name.
         * @return The attribute's value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getValue (String uri, String localName)

        /**
         * Look up the value of an attribute by Namespace name.
         *
         * @param uri The Namespace URI
         * @param localName The local name.
         * @return The attribute's value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getType (String qName)

        /**
         * Look up the type of an attribute by qualified (prefixed) name.
         *
         * @param qName The qualified name.
         * @return The attribute's type as an internalized string.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getType (String uri, String localName)

        /**
         * Look up the type of an attribute by Namespace name.
         *
         * @param uri The Namespace URI
         * @param localName The local name.
         * @return The attribute's type as an internalized string.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public int getIndex (String qName)

        /**
         * Look up an attribute index by qualified (prefixed) name.
         *
         * @param qName The qualified name.
         * @return The attributes index, or -1 if none was found.
         * @see org.xml.sax.Attributes#getIndex(java.lang.String)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public int getIndex (String uri, String localName)

        /**
         * Look up an attribute index by Namespace name.
         *
         * @param uri The Namespace URI or the empty string.
         * @param localName The local name.
         * @return The attributes index, or -1 if none was found.
         * @see org.xml.sax.Attributes#getIndex(java.lang.String,java.lang.String)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getValue (int i)

        /**
         * Return the value of the specified attribute.
         *
         * @param The attribute's index.
         * @return The attribute's value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getType (int i)

        /**
         * Return the type of the specified attribute.
         *
         * @param The attribute's index.
         * @return The attribute's type as an internalized string.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getQName (int i)

        /**
         * Return the qualified (prefixed) name of the specified attribute.
         *
         * @param The attribute's index.
         * @return The attribute's qualified name, internalized.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getLocalName (int i)

        /**
         * Return the local name of the specified attribute.
         *
         * @param The attribute's index.
         * @return Always the empty string.
         * @see org.xml.sax.Attributes#getLocalName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public String getURI (int i)

        /**
         * Return the Namespace URI of the specified attribute.
         *
         * @param The attribute's index.
         * @return Always the empty string.
         * @see org.xml.sax.Attributes#getURI
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        public int getLength ()

        /**
         * Return the length of the attribute list.
         *
         * @return The number of attributes in the list.
         * @see org.xml.sax.Attributes#getLength
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        void setAttributeList (AttributeList qAtts)

        /**
         * Set the embedded AttributeList.
         *
         * <p>This method must be invoked before any of the others
         * can be used.</p>
         *
         * @param The SAX1 attribute list (with qnames).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
        AttributeListAdapter ()

        /**
         * Construct a new adapter.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    final class AttributeListAdapter implements Attributes

    /**
     * Adapt a SAX1 AttributeList as a SAX2 Attributes object.
     *
     * <p>This class is in the Public Domain, and comes with NO
     * WARRANTY of any kind.</p>
     *
     * <p>This wrapper class is used only when Namespace support
     * is disabled -- it provides pretty much a direct mapping
     * from SAX1 to SAX2, except that names and types are
     * interned whenever requested.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    // Inner class to wrap an AttributeList when not doing NS proc.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    // Internal state.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    private void checkNotParsing (String type, String name)

    /**
     * Throw an exception if we are parsing.
     *
     * <p>Use this method to detect illegal feature or
     * property changes.</p>
     *
     * @param type The type of thing (feature or property).
     * @param name The feature or property name.
     * @exception SAXNotSupportedException If a
     *            document is currently being parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    private SAXParseException makeException (String message)

    /**
     * Construct an exception for the current context.
     *
     * @param message The error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    void reportError (String message)

    /**
     * Report a non-fatal error.
     *
     * @param message The error message.
     * @exception SAXException The client may throw
     *            an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    private String [] processName (String qName, boolean isAttribute,
                                   boolean useException)

    /**
     * Process a qualified (prefixed) name.
     *
     * <p>If the name has an undeclared prefix, use only the qname
     * and make an ErrorHandler.error callback in case the app is
     * interested.</p>
     *
     * @param qName The qualified (prefixed) name.
     * @param isAttribute true if this is an attribute name.
     * @return The name split into three parts.
     * @exception SAXException The client may throw
     *            an exception if there is an error callback.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    private void setupParser ()

    /**
     * Initialize the parser before each run.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    // Internal utility methods.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void processingInstruction (String target, String data)

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 processing instruction event.
     *
     * @param target The processing instruction target.
     * @param data The remainder of the processing instruction
     * @exception SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.DocumentHandler#processingInstruction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void ignorableWhitespace (char ch[], int start, int length)

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 ignorable whitespace event.
     *
     * @param ch An array of characters.
     * @param start The starting position in the array.
     * @param length The number of characters to use.
     * @exception SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.DocumentHandler#ignorableWhitespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void characters (char ch[], int start, int length)

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 characters event.
     *
     * @param ch An array of characters.
     * @param start The starting position in the array.
     * @param length The number of characters to use.
     * @exception SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.DocumentHandler#characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void endElement (String qName)

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 end element event.
     *
     * @param qName The qualified (prefixed) name.
     * @exception SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.DocumentHandler#endElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void startElement (String qName, AttributeList qAtts)

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 startElement event.
     *
     * <p>If necessary, perform Namespace processing.</p>
     *
     * @param qName The qualified (prefixed) name.
     * @param qAtts The XML attribute list (with qnames).
     * @exception SAXException The client may raise a
     *            processing exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void endDocument ()

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 end document event.
     *
     * @exception SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.DocumentHandler#endDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void startDocument ()

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 start document event.
     *
     * @exception SAXException The client may raise a
     *            processing exception.
     * @see org.xml.sax.DocumentHandler#startDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void setDocumentLocator (Locator locator)

    /**
     * Adapter implementation method; do not call.
     * Adapt a SAX1 document locator event.
     *
     * @param locator A document locator.
     * @see org.xml.sax.ContentHandler#setDocumentLocator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    // Implementation of org.xml.sax.DocumentHandler.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void parse (InputSource input)

    /**
     * Parse an XML document.
     *
     * @param input An input source for the document.
     * @exception java.io.IOException If there is a problem reading
     *            the raw content of the document.
     * @exception SAXException If there is a problem
     *            processing the document.
     * @see #parse(java.lang.String)
     * @see org.xml.sax.Parser#parse(org.xml.sax.InputSource)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void parse (String systemId)

    /**
     * Parse an XML document.
     *
     * @param systemId The absolute URL of the document.
     * @exception java.io.IOException If there is a problem reading
     *            the raw content of the document.
     * @exception SAXException If there is a problem
     *            processing the document.
     * @see #parse(org.xml.sax.InputSource)
     * @see org.xml.sax.Parser#parse(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public ErrorHandler getErrorHandler ()

    /**
     * Return the current error handler.
     *
     * @return The current error handler, or null if none was supplied.
     * @see org.xml.sax.XMLReader#getEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void setErrorHandler (ErrorHandler handler)

    /**
     * Set the error handler.
     *
     * @param handler The new error handler.
     * @see org.xml.sax.XMLReader#setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public ContentHandler getContentHandler ()

    /**
     * Return the current content handler.
     *
     * @return The current content handler, or null if none was supplied.
     * @see org.xml.sax.XMLReader#getEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void setContentHandler (ContentHandler handler)

    /**
     * Set the content handler.
     *
     * @param handler the new content handler
     * @see org.xml.sax.XMLReader#setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public DTDHandler getDTDHandler ()

    /**
     * Return the current DTD handler.
     *
     * @return the current DTD handler, or null if none was supplied
     * @see org.xml.sax.XMLReader#getEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void setDTDHandler (DTDHandler handler)

    /**
     * Set the DTD handler.
     *
     * @param handler the new DTD handler
     * @see org.xml.sax.XMLReader#setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public EntityResolver getEntityResolver ()

    /**
     * Return the current entity resolver.
     *
     * @return The current entity resolver, or null if none was supplied.
     * @see org.xml.sax.XMLReader#getEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void setEntityResolver (EntityResolver resolver)

    /**
     * Set the entity resolver.
     *
     * @param resolver The new entity resolver.
     * @see org.xml.sax.XMLReader#setEntityResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public Object getProperty (String name)

    /**
     * Get a parser property.
     *
     * <p>No properties are currently recognized.</p>
     *
     * @param name The property name.
     * @return The property value.
     * @exception SAXNotRecognizedException If the property
     *            value can't be assigned or retrieved.
     * @exception SAXNotSupportedException If the property
     *            value is not currently readable.
     * @see org.xml.sax.XMLReader#getProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void setProperty (String name, Object value)

    /**
     * Set a parser property.
     *
     * <p>No properties are currently recognized.</p>
     *
     * @param name The property name.
     * @param value The property value.
     * @exception SAXNotRecognizedException If the property
     *            value can't be assigned or retrieved.
     * @exception SAXNotSupportedException If the property
     *            can't be assigned that value.
     * @see org.xml.sax.XMLReader#setProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public boolean getFeature (String name)

    /**
     * Check a parser feature flag.
     *
     * <p>The only features recognized are namespaces and
     * namespace-prefixes.</p>
     *
     * @param name The feature name, as a complete URI.
     * @return The current feature value.
     * @exception SAXNotRecognizedException If the feature
     *            value can't be assigned or retrieved.
     * @exception SAXNotSupportedException If the
     *            feature is not currently readable.
     * @see org.xml.sax.XMLReader#setFeature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public void setFeature (String name, boolean value)

    /**
     * Set a feature flag for the parser.
     *
     * <p>The only features recognized are namespaces and
     * namespace-prefixes.</p>
     *
     * @param name The feature name, as a complete URI.
     * @param value The requested feature value.
     * @exception SAXNotRecognizedException If the feature
     *            can't be assigned or retrieved.
     * @exception SAXNotSupportedException If the feature
     *            can't be assigned that value.
     * @see org.xml.sax.XMLReader#setFeature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    // Implementation of org.xml.sax.XMLReader.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    private void setup (Parser parser)

    /**
     * Internal setup method.
     *
     * @param parser The embedded parser.
     * @exception java.lang.NullPointerException If the parser parameter
     *            is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public ParserAdapter (Parser parser)

    /**
     * Construct a new parser adapter.
     *
     * <p>Note that the embedded parser cannot be changed once the
     * adapter is created; to embed a different parser, allocate
     * a new ParserAdapter.</p>
     *
     * @param parser The SAX1 parser to embed.
     * @exception java.lang.NullPointerException If the parser parameter
     *            is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    public ParserAdapter ()

    /**
     * Construct a new parser adapter.
     *
     * <p>Use the "org.xml.sax.parser" property to locate the
     * embedded SAX1 driver.</p>
     *
     * @exception SAXException If the embedded driver
     *            cannot be instantiated or if the
     *            org.xml.sax.parser property is not specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
    // Constructors.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/ParserAdapter.java
public class ParserAdapter implements XMLReader, DocumentHandler

/**
 * Adapt a SAX1 Parser as a SAX2 XMLReader.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class wraps a SAX1 {@link org.xml.sax.Parser Parser}
 * and makes it act as a SAX2 {@link org.xml.sax.XMLReader XMLReader},
 * with feature, property, and Namespace support.  Note
 * that it is not possible to report {@link org.xml.sax.ContentHandler#skippedEntity
 * skippedEntity} events, since SAX1 does not make that information available.</p>
 *
 * <p>This adapter does not test for duplicate Namespace-qualified
 * attribute names.</p>
 *
 * @since SAX 2.0
 * @author David Megginson
 * @version 2.0.1 (sax2r2)
 * @see org.xml.sax.helpers.XMLReaderAdapter
 * @see org.xml.sax.XMLReader
 * @see org.xml.sax.Parser
 */
