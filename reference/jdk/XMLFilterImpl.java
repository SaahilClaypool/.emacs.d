_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Internal state.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    private void setupParse ()

    /**
     * Set up before a parse.
     *
     * <p>Before every parse, check whether the parent is
     * non-null, and re-register the filter for all of the
     * events.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Internal methods.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void fatalError (SAXParseException e)

    /**
     * Filter a fatal error event.
     *
     * @param e The error as an exception.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void error (SAXParseException e)

    /**
     * Filter an error event.
     *
     * @param e The error as an exception.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void warning (SAXParseException e)

    /**
     * Filter a warning event.
     *
     * @param e The warning as an exception.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Implementation of org.xml.sax.ErrorHandler.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void skippedEntity (String name)

    /**
     * Filter a skipped entity event.
     *
     * @param name The name of the skipped entity.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void processingInstruction (String target, String data)

    /**
     * Filter a processing instruction event.
     *
     * @param target The processing instruction target.
     * @param data The text following the target.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void ignorableWhitespace (char ch[], int start, int length)

    /**
     * Filter an ignorable whitespace event.
     *
     * @param ch An array of characters.
     * @param start The starting position in the array.
     * @param length The number of characters to use from the array.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void characters (char ch[], int start, int length)

    /**
     * Filter a character data event.
     *
     * @param ch An array of characters.
     * @param start The starting position in the array.
     * @param length The number of characters to use from the array.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void endElement (String uri, String localName, String qName)

    /**
     * Filter an end element event.
     *
     * @param uri The element's Namespace URI, or the empty string.
     * @param localName The element's local name, or the empty string.
     * @param qName The element's qualified (prefixed) name, or the empty
     *        string.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void startElement (String uri, String localName, String qName,
                              Attributes atts)

    /**
     * Filter a start element event.
     *
     * @param uri The element's Namespace URI, or the empty string.
     * @param localName The element's local name, or the empty string.
     * @param qName The element's qualified (prefixed) name, or the empty
     *        string.
     * @param atts The element's attributes.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void endPrefixMapping (String prefix)

    /**
     * Filter an end Namespace prefix mapping event.
     *
     * @param prefix The Namespace prefix.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void startPrefixMapping (String prefix, String uri)

    /**
     * Filter a start Namespace prefix mapping event.
     *
     * @param prefix The Namespace prefix.
     * @param uri The Namespace URI.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void endDocument ()

    /**
     * Filter an end document event.
     *
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void startDocument ()

    /**
     * Filter a start document event.
     *
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setDocumentLocator (Locator locator)

    /**
     * Filter a new document locator event.
     *
     * @param locator The document locator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Implementation of org.xml.sax.ContentHandler.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void unparsedEntityDecl (String name, String publicId,
                                    String systemId, String notationName)

    /**
     * Filter an unparsed entity declaration event.
     *
     * @param name The entity name.
     * @param publicId The entity's public identifier, or null.
     * @param systemId The entity's system identifier, or null.
     * @param notationName The name of the associated notation.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void notationDecl (String name, String publicId, String systemId)

    /**
     * Filter a notation declaration event.
     *
     * @param name The notation name.
     * @param publicId The notation's public identifier, or null.
     * @param systemId The notation's system identifier, or null.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Implementation of org.xml.sax.DTDHandler.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public InputSource resolveEntity (String publicId, String systemId)

    /**
     * Filter an external entity resolution.
     *
     * @param publicId The entity's public identifier, or null.
     * @param systemId The entity's system identifier.
     * @return A new InputSource or null for the default.
     * @exception org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     * @exception java.io.IOException The client may throw an
     *            I/O-related exception while obtaining the
     *            new InputSource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Implementation of org.xml.sax.EntityResolver.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void parse (String systemId)

    /**
     * Parse a document.
     *
     * @param systemId The system identifier as a fully-qualified URI.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @exception java.io.IOException An IO exception from the parser,
     *            possibly from a byte stream or character stream
     *            supplied by the application.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void parse (InputSource input)

    /**
     * Parse a document.
     *
     * @param input The input source for the document entity.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @exception java.io.IOException An IO exception from the parser,
     *            possibly from a byte stream or character stream
     *            supplied by the application.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public ErrorHandler getErrorHandler ()

    /**
     * Get the current error event handler.
     *
     * @return The current error handler, or null if none was set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setErrorHandler (ErrorHandler handler)

    /**
     * Set the error event handler.
     *
     * @param handler the new error handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public ContentHandler getContentHandler ()

    /**
     * Get the content event handler.
     *
     * @return The current content handler, or null if none was set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setContentHandler (ContentHandler handler)

    /**
     * Set the content event handler.
     *
     * @param handler the new content handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public DTDHandler getDTDHandler ()

    /**
     * Get the current DTD event handler.
     *
     * @return The current DTD handler, or null if none was set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setDTDHandler (DTDHandler handler)

    /**
     * Set the DTD event handler.
     *
     * @param handler the new DTD handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public EntityResolver getEntityResolver ()

    /**
     * Get the current entity resolver.
     *
     * @return The current entity resolver, or null if none was set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setEntityResolver (EntityResolver resolver)

    /**
     * Set the entity resolver.
     *
     * @param resolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public Object getProperty (String name)

    /**
     * Look up the value of a property.
     *
     * @param name The property name.
     * @return The current value of the property.
     * @exception org.xml.sax.SAXNotRecognizedException If the property
     *            value can't be assigned or retrieved from the parent.
     * @exception org.xml.sax.SAXNotSupportedException When the
     *            parent recognizes the property name but
     *            cannot determine its value at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setProperty (String name, Object value)

    /**
     * Set the value of a property.
     *
     * <p>This will always fail if the parent is null.</p>
     *
     * @param name The property name.
     * @param value The requested property value.
     * @exception org.xml.sax.SAXNotRecognizedException If the property
     *            value can't be assigned or retrieved from the parent.
     * @exception org.xml.sax.SAXNotSupportedException When the
     *            parent recognizes the property name but
     *            cannot set the requested value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public boolean getFeature (String name)

    /**
     * Look up the value of a feature.
     *
     * <p>This will always fail if the parent is null.</p>
     *
     * @param name The feature name.
     * @return The current value of the feature.
     * @exception org.xml.sax.SAXNotRecognizedException If the feature
     *            value can't be assigned or retrieved from the parent.
     * @exception org.xml.sax.SAXNotSupportedException When the
     *            parent recognizes the feature name but
     *            cannot determine its value at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setFeature (String name, boolean value)

    /**
     * Set the value of a feature.
     *
     * <p>This will always fail if the parent is null.</p>
     *
     * @param name The feature name.
     * @param value The requested feature value.
     * @exception org.xml.sax.SAXNotRecognizedException If the feature
     *            value can't be assigned or retrieved from the parent.
     * @exception org.xml.sax.SAXNotSupportedException When the
     *            parent recognizes the feature name but
     *            cannot set the requested value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Implementation of org.xml.sax.XMLReader.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public XMLReader getParent ()

    /**
     * Get the parent reader.
     *
     * @return The parent XML reader, or null if none is set.
     * @see #setParent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public void setParent (XMLReader parent)

    /**
     * Set the parent reader.
     *
     * <p>This is the {@link org.xml.sax.XMLReader XMLReader} from which
     * this filter will obtain its events and to which it will pass its
     * configuration requests.  The parent may itself be another filter.</p>
     *
     * <p>If there is no parent reader set, any attempt to parse
     * or to set or get a feature or property will fail.</p>
     *
     * @param parent The parent XML reader.
     * @see #getParent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Implementation of org.xml.sax.XMLFilter.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public XMLFilterImpl (XMLReader parent)

    /**
     * Construct an XML filter with the specified parent.
     *
     * @see #setParent
     * @see #getParent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    public XMLFilterImpl ()

    /**
     * Construct an empty XML filter, with no parent.
     *
     * <p>This filter will have no parent: you must assign a parent
     * before you start a parse or do any configuration with
     * setFeature or setProperty, unless you use this as a pure event
     * consumer rather than as an {@link XMLReader}.</p>
     *
     * @see org.xml.sax.XMLReader#setFeature
     * @see org.xml.sax.XMLReader#setProperty
     * @see #setParent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
    // Constructors.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/XMLFilterImpl.java
public class XMLFilterImpl

/**
 * Base class for deriving an XML filter.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class is designed to sit between an {@link org.xml.sax.XMLReader
 * XMLReader} and the client application's event handlers.  By default, it
 * does nothing but pass requests up to the reader and events
 * on to the handlers unmodified, but subclasses can override
 * specific methods to modify the event stream or the configuration
 * requests as they pass through.</p>
 *
 * @since SAX 2.0
 * @author David Megginson
 * @see org.xml.sax.XMLFilter
 * @see org.xml.sax.XMLReader
 * @see org.xml.sax.EntityResolver
 * @see org.xml.sax.DTDHandler
 * @see org.xml.sax.ContentHandler
 * @see org.xml.sax.ErrorHandler
 */
