_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void fatalError (SAXParseException e)

    /**
     * Report a fatal XML parsing error.
     *
     * <p>The default implementation throws a SAXParseException.
     * Application writers may override this method in a subclass if
     * they need to take specific actions for each fatal error (such as
     * collecting all of the errors into a single report): in any case,
     * the application must stop all regular processing when this
     * method is invoked, since the document is no longer reliable, and
     * the parser may no longer report parsing events.</p>
     *
     * @param e The error information encoded as an exception.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ErrorHandler#fatalError
     * @see org.xml.sax.SAXParseException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void error (SAXParseException e)

    /**
     * Receive notification of a recoverable parser error.
     *
     * <p>The default implementation does nothing.  Application writers
     * may override this method in a subclass to take specific actions
     * for each error, such as inserting the message in a log file or
     * printing it to the console.</p>
     *
     * @param e The error information encoded as an exception.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ErrorHandler#warning
     * @see org.xml.sax.SAXParseException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void warning (SAXParseException e)

    /**
     * Receive notification of a parser warning.
     *
     * <p>The default implementation does nothing.  Application writers
     * may override this method in a subclass to take specific actions
     * for each warning, such as inserting the message in a log file or
     * printing it to the console.</p>
     *
     * @param e The warning information encoded as an exception.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ErrorHandler#warning
     * @see org.xml.sax.SAXParseException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    // Default implementation of the ErrorHandler interface.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void skippedEntity (String name)

    /**
     * Receive notification of a skipped entity.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions for each
     * processing instruction, such as setting status variables or
     * invoking other methods.</p>
     *
     * @param name The name of the skipped entity.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#processingInstruction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void processingInstruction (String target, String data)

    /**
     * Receive notification of a processing instruction.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions for each
     * processing instruction, such as setting status variables or
     * invoking other methods.</p>
     *
     * @param target The processing instruction target.
     * @param data The processing instruction data, or null if
     *             none is supplied.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#processingInstruction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void ignorableWhitespace (char ch[], int start, int length)

    /**
     * Receive notification of ignorable whitespace in element content.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method to take specific actions for each chunk of ignorable
     * whitespace (such as adding data to a node or buffer, or printing
     * it to a file).</p>
     *
     * @param ch The whitespace characters.
     * @param start The start position in the character array.
     * @param length The number of characters to use from the
     *               character array.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#ignorableWhitespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void characters (char ch[], int start, int length)

    /**
     * Receive notification of character data inside an element.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method to take specific actions for each chunk of character data
     * (such as adding the data to a node or buffer, or printing it to
     * a file).</p>
     *
     * @param ch The characters.
     * @param start The start position in the character array.
     * @param length The number of characters to use from the
     *               character array.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void endElement (String uri, String localName, String qName)

    /**
     * Receive notification of the end of an element.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the end of
     * each element (such as finalising a tree node or writing
     * output to a file).</p>
     *
     * @param uri The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param qName The qualified name (with prefix), or the
     *        empty string if qualified names are not available.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#endElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void startElement (String uri, String localName,
                              String qName, Attributes attributes)

    /**
     * Receive notification of the start of an element.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the start of
     * each element (such as allocating a new tree node or writing
     * output to a file).</p>
     *
     * @param uri The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param qName The qualified name (with prefix), or the
     *        empty string if qualified names are not available.
     * @param attributes The attributes attached to the element.  If
     *        there are no attributes, it shall be an empty
     *        Attributes object.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void endPrefixMapping (String prefix)

    /**
     * Receive notification of the end of a Namespace mapping.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the end of
     * each prefix mapping.</p>
     *
     * @param prefix The Namespace prefix being declared.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#endPrefixMapping
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void startPrefixMapping (String prefix, String uri)

    /**
     * Receive notification of the start of a Namespace mapping.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the start of
     * each Namespace prefix scope (such as storing the prefix mapping).</p>
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI mapped to the prefix.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startPrefixMapping
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void endDocument ()

    /**
     * Receive notification of the end of the document.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the end
     * of a document (such as finalising a tree or closing an output
     * file).</p>
     *
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#endDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void startDocument ()

    /**
     * Receive notification of the beginning of the document.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to take specific actions at the beginning
     * of a document (such as allocating the root node of a tree or
     * creating an output file).</p>
     *
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void setDocumentLocator (Locator locator)

    /**
     * Receive a Locator object for document events.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass if they wish to store the locator for use
     * with other document events.</p>
     *
     * @param locator A locator for all SAX document events.
     * @see org.xml.sax.ContentHandler#setDocumentLocator
     * @see org.xml.sax.Locator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    // Default implementation of ContentHandler interface.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void unparsedEntityDecl (String name, String publicId,
                                    String systemId, String notationName)

    /**
     * Receive notification of an unparsed entity declaration.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass to keep track of the unparsed entities
     * declared in a document.</p>
     *
     * @param name The entity name.
     * @param publicId The entity public identifier, or null if not
     *                 available.
     * @param systemId The entity system identifier.
     * @param notationName The name of the associated notation.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public void notationDecl (String name, String publicId, String systemId)

    /**
     * Receive notification of a notation declaration.
     *
     * <p>By default, do nothing.  Application writers may override this
     * method in a subclass if they wish to keep track of the notations
     * declared in a document.</p>
     *
     * @param name The notation name.
     * @param publicId The notation public identifier, or null if not
     *                 available.
     * @param systemId The notation system identifier.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.DTDHandler#notationDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    // Default implementation of DTDHandler interface.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    public InputSource resolveEntity (String publicId, String systemId)

    /**
     * Resolve an external entity.
     *
     * <p>Always return null, so that the parser will use the system
     * identifier provided in the XML document.  This method implements
     * the SAX default behaviour: application writers can override it
     * in a subclass to do special translations such as catalog lookups
     * or URI redirection.</p>
     *
     * @param publicId The public identifier, or null if none is
     *                 available.
     * @param systemId The system identifier provided in the XML
     *                 document.
     * @return The new input source, or null to require the
     *         default behaviour.
     * @exception java.io.IOException If there is an error setting
     *            up the new input source.
     * @exception org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.EntityResolver#resolveEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
    // Default implementation of the EntityResolver interface.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/DefaultHandler.java
public class DefaultHandler

/**
 * Default base class for SAX2 event handlers.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class is available as a convenience base class for SAX2
 * applications: it provides default implementations for all of the
 * callbacks in the four core SAX2 handler classes:</p>
 *
 * <ul>
 * <li>{@link org.xml.sax.EntityResolver EntityResolver}</li>
 * <li>{@link org.xml.sax.DTDHandler DTDHandler}</li>
 * <li>{@link org.xml.sax.ContentHandler ContentHandler}</li>
 * <li>{@link org.xml.sax.ErrorHandler ErrorHandler}</li>
 * </ul>
 *
 * <p>Application writers can extend this class when they need to
 * implement only part of an interface; parser writers can
 * instantiate this class to provide default handlers when the
 * application has not supplied its own.</p>
 *
 * <p>This class replaces the deprecated SAX1
 * {@link org.xml.sax.HandlerBase HandlerBase} class.</p>
 *
 * @since SAX 2.0
 * @author David Megginson,
 * @see org.xml.sax.EntityResolver
 * @see org.xml.sax.DTDHandler
 * @see org.xml.sax.ContentHandler
 * @see org.xml.sax.ErrorHandler
 */
