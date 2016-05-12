_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public SourceLocator getSourceLocatorFor(int node)

  /** Retrieve the SourceLocator associated with a specific node.
   * This is only meaningful if the XalanProperties.SOURCE_LOCATION flag was
   * set True using setProperty; if it was never set, or was set false, we
   * will return null.
   *
   * (We _could_ return a locator with the document's base URI and bogus
   * line/column information. Trying that; see the else clause.)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setProperty(String property, Object value)

  /**
   * Set a run time property for this DTM instance.
   *
   * %REVIEW% Now that we no longer use this method to support
   * getSourceLocatorFor, can we remove it?
   *
   * @param property a <code>String</code> value
   * @param value an <code>Object</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void comment(char ch[], int start, int length) throws SAXException

  /**
   * Report an XML comment anywhere in the document.
   *
   * <p>This callback will be used for comments inside or outside the
   * document element, including comments in the external DTD
   * subset (if read).</p>
   *
   * @param ch An array holding the characters in the comment.
   * @param start The starting position in the array.
   * @param length The number of characters to use from the array.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endCDATA() throws SAXException

  /**
   * Report the end of a CDATA section.
   *
   * @throws SAXException The application may raise an exception.
   * @see #startCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startCDATA() throws SAXException

  /**
   * Report the start of a CDATA section.
   *
   * <p>The contents of the CDATA section will be reported through
   * the regular {@link org.xml.sax.ContentHandler#characters
   * characters} event.</p>
   *
   * @throws SAXException The application may raise an exception.
   * @see #endCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endEntity(String name) throws SAXException

  /**
   * Report the end of an entity.
   *
   * @param name The name of the entity that is ending.
   * @throws SAXException The application may raise an exception.
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startEntity(String name) throws SAXException

  /**
   * Report the beginning of an entity in content.
   *
   * <p><strong>NOTE:</entity> entity references in attribute
   * values -- and the start and end of the document entity --
   * are never reported.</p>
   *
   * <p>The start and end of the external DTD subset are reported
   * using the pseudo-name "[dtd]".  All other events must be
   * properly nested within start/end entity events.</p>
   *
   * <p>Note that skipped entities will be reported through the
   * {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity}
   * event, which is part of the ContentHandler interface.</p>
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @throws SAXException The application may raise an exception.
   * @see #endEntity
   * @see org.xml.sax.ext.DeclHandler#internalEntityDecl
   * @see org.xml.sax.ext.DeclHandler#externalEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endDTD() throws SAXException

  /**
   * Report the end of DTD declarations.
   *
   * @throws SAXException The application may raise an exception.
   * @see #startDTD
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startDTD(String name, String publicId, String systemId)

  /**
   * Report the start of DTD declarations, if any.
   *
   * <p>Any declarations are assumed to be in the internal subset
   * unless otherwise indicated by a {@link #startEntity startEntity}
   * event.</p>
   *
   * <p>Note that the start/endDTD events will appear within
   * the start/endDocument events from ContentHandler and
   * before the first startElement event.</p>
   *
   * @param name The document type name.
   * @param publicId The declared public identifier for the
   *        external DTD subset, or null if none was declared.
   * @param systemId The declared system identifier for the
   *        external DTD subset, or null if none was declared.
   * @throws SAXException The application may raise an
   *            exception.
   * @see #endDTD
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the LexicalHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void externalEntityDecl(
          String name, String publicId, String systemId) throws SAXException

  /**
   * Report a parsed external entity declaration.
   *
   * <p>Only the effective (first) declaration for each entity
   * will be reported.</p>
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @param publicId The declared public identifier of the entity, or
   *        null if none was declared.
   * @param systemId The declared system identifier of the entity.
   * @throws SAXException The application may raise an exception.
   * @see #internalEntityDecl
   * @see org.xml.sax.DTDHandler#unparsedEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void internalEntityDecl(String name, String value)

  /**
   * Report an internal entity declaration.
   *
   * <p>Only the effective (first) declaration for each entity
   * will be reported.</p>
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @param value The replacement text of the entity.
   * @throws SAXException The application may raise an exception.
   * @see #externalEntityDecl
   * @see org.xml.sax.DTDHandler#unparsedEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void attributeDecl(
          String eName, String aName, String type, String valueDefault, String value)

  /**
   * Report an attribute type declaration.
   *
   * <p>Only the effective (first) declaration for an attribute will
   * be reported.  The type will be one of the strings "CDATA",
   * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY",
   * "ENTITIES", or "NOTATION", or a parenthesized token group with
   * the separator "|" and all whitespace removed.</p>
   *
   * @param eName The name of the associated element.
   * @param aName The name of the attribute.
   * @param type A string representing the attribute type.
   * @param valueDefault A string representing the attribute default
   *        ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if
   *        none of these applies.
   * @param value A string representing the attribute's default value,
   *        or null if there is none.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void elementDecl(String name, String model) throws SAXException

  /**
   * Report an element type declaration.
   *
   * <p>The content model will consist of the string "EMPTY", the
   * string "ANY", or a parenthesised group, optionally followed
   * by an occurrence indicator.  The model will be normalized so
   * that all whitespace is removed,and will include the enclosing
   * parentheses.</p>
   *
   * @param name The element type name.
   * @param model The content model as a normalized string.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the DeclHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void fatalError(SAXParseException e) throws SAXException

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ErrorHandler#fatalError
   * @see org.xml.sax.SAXParseException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void error(SAXParseException e) throws SAXException

  /**
   * Receive notification of a recoverable parser error.
   *
   * <p>The default implementation does nothing.  Application writers
   * may override this method in a subclass to take specific actions
   * for each error, such as inserting the message in a log file or
   * printing it to the console.</p>
   *
   * @param e The warning information encoded as an exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ErrorHandler#warning
   * @see org.xml.sax.SAXParseException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void warning(SAXParseException e) throws SAXException

  /**
   * Receive notification of a parser warning.
   *
   * <p>The default implementation does nothing.  Application writers
   * may override this method in a subclass to take specific actions
   * for each warning, such as inserting the message in a log file or
   * printing it to the console.</p>
   *
   * @param e The warning information encoded as an exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ErrorHandler#warning
   * @see org.xml.sax.SAXParseException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the ErrorHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void skippedEntity(String name) throws SAXException

  /**
   * Receive notification of a skipped entity.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions for each
   * processing instruction, such as setting status variables or
   * invoking other methods.</p>
   *
   * @param name The name of the skipped entity.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void processingInstruction(String target, String data)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void ignorableWhitespace(char ch[], int start, int length)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#ignorableWhitespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void characters(char ch[], int start, int length) throws SAXException

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endElement(String uri, String localName, String qName)

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
   * @param qName The qualified XML 1.0 name (with prefix), or the
   *        empty string if qualified names are not available.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startElement(
          String uri, String localName, String qName, Attributes attributes)

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
   * @param attributes The specified or defaulted attributes.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean declAlreadyDeclared(String prefix)

  /**
   * Check if a declaration has already been made for a given prefix.
   *
   * @param prefix non-null prefix string.
   *
   * @return true if the declaration has already been declared in the
   *         current context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endPrefixMapping(String prefix) throws SAXException

  /**
   * Receive notification of the end of a Namespace mapping.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the end of
   * each prefix mapping.</p>
   *
   * @param prefix The Namespace prefix being declared.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endPrefixMapping
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startPrefixMapping(String prefix, String uri)

  /**
   * Receive notification of the start of a Namespace mapping.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the start of
   * each Namespace prefix scope (such as storing the prefix mapping).</p>
   *
   * @param prefix The Namespace prefix being declared.
   * @param uri The Namespace URI mapped to the prefix.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startPrefixMapping
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endDocument() throws SAXException

  /**
   * Receive notification of the end of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startDocument() throws SAXException

  /**
   * Receive notification of the beginning of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setDocumentLocator(Locator locator)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of ContentHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void unparsedEntityDecl(
          String name, String publicId, String systemId, String notationName)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.DTDHandler#unparsedEntityDecl
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void notationDecl(String name, String publicId, String systemId)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.DTDHandler#notationDecl
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of DTDHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public InputSource resolveEntity(String publicId, String systemId)

  /**
   * Resolve an external entity.
   *
   * <p>Always return null, so that the parser will use the system
   * identifier provided in the XML document.  This method implements
   * the SAX default behaviour: application writers can override it
   * in a subclass to do special translations such as catalog lookups
   * or URI redirection.</p>
   *
   * @param publicId The public identifer, or null if none is
   *                 available.
   * @param systemId The system identifier provided in the XML
   *                 document.
   * @return The new input source, or null to require the
   *         default behaviour.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.EntityResolver#resolveEntity
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the EntityResolver interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected void charactersFlush()

  /**
   * Check whether accumulated text should be stripped; if not,
   * append the appropriate flavor of text/cdata node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setIDAttribute(String id, int elem)

  /**
   * Set an ID string to node association in the ID table.
   *
   * @param id The ID string.
   * @param elem The associated element handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNamespaceURI(String prefix)

    /**
   * Get a prefix either from the qname or from the uri mapping, or just make
   * one up!
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getIdForNamespace(String uri)

  /**
   * Get a prefix either from the uri mapping, or just make
   * one up!
   *
   * @param uri The namespace URI, which may be null.
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getPrefix(String qname, String uri)

  /**
   * Get a prefix either from the qname or from the uri mapping, or just make
   * one up!
   *
   * @param qname The qualified name, which may be null.
   * @param uri The namespace URI, which may be null.
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getElementById(String elementId)

  /**
   * Returns the <code>Element</code> whose <code>ID</code> is given by
   * <code>elementId</code>. If no such element exists, returns
   * <code>DTM.NULL</code>. Behavior is not defined if more than one element
   * has this <code>ID</code>. Attributes (including those
   * with the name "ID") are not of type ID unless so defined by DTD/Schema
   * information available to the DTM implementation.
   * Implementations that do not know whether attributes are of type ID or
   * not are expected to return <code>DTM.NULL</code>.
   *
   * <p>%REVIEW% Presumably IDs are still scoped to a single document,
   * and this operation searches only within a single document, right?
   * Wouldn't want collisions between DTMs in the same process.</p>
   *
   * @param elementId The unique <code>id</code> value for an element.
   * @return The handle of the matching element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public boolean isWhitespace(int nodeHandle)

  /**
   * Determine if the string-value of a node is whitespace
   *
   * @param nodeHandle The node Handle.
   *
   * @return Return true if the given node is whitespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public XMLString getStringValue(int nodeHandle)

  /**
   * Get the string-value of a node as a String object
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNamespaceURI(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style namespace URI
   * (As defined in Namespaces, this is the declared URI which this node's
   * prefix -- or default in lieu thereof -- was mapped to.)
   *
   * <p>%REVIEW% Null or ""? -sb</p>
   *
   * @param nodeHandle the id of the node.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
    error(XMLMessages.createXMLMessage(XMLErrorResources.ER_METHOD_NOT_SUPPORTED, null));//"Not yet supported!");

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMDefaultBase abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getDocumentTypeDeclarationPublicIdentifier()

  /**
   * Return the public identifier of the external subset,
   * normalized as described in 4.2.2 External Entities [XML]. If there is
   * no external subset or if it has no public identifier, this property
   * has no value.
   *
   * @return the public identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getAttributeNode(int nodeHandle, String namespaceURI,
                              String name)

  /**
   * Retrieves an attribute node by by qualified name and namespace URI.
   *
   * @param nodeHandle int Handle of the node upon which to look up this attribute..
   * @param namespaceURI The namespace URI of the attribute to
   *   retrieve, or null.
   * @param name The local name of the attribute to
   *   retrieve.
   * @return The attribute node handle with the specified name (
   *   <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such
   *   attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getPrefix(int nodeHandle)

  /**
   * Given a namespace handle, return the prefix that the namespace decl is
   * mapping.
   * Given a node handle, return the prefix used to map to the namespace.
   *
   * <p> %REVIEW% Are you sure you want "" for no prefix?  </p>
   * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb  </p>
   *
   * @param nodeHandle the id of the node.
   * @return String prefix of this node's name, or "" if no explicit
   * namespace prefix was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getUnparsedEntityURI(String name)

  /**
   * The getUnparsedEntityURI function returns the URI of the unparsed
   * entity with the specified name in the same document as the context
   * node (see [3.3 Unparsed Entities]). It returns the empty string if
   * there is no such entity.
   * <p>
   * XML processors may choose to use the System Identifier (if one
   * is provided) to resolve the entity, rather than the URI in the
   * Public Identifier. The details are dependent on the processor, and
   * we would have to support some form of plug-in resolver to handle
   * this properly. Currently, we simply return the System Identifier if
   * present, and hope that it a usable URI or that our caller can
   * map it to one.
   * TODO: Resolve Public Identifiers... or consider changing function name.
   * <p>
   * If we find a relative URI
   * reference, XML expects it to be resolved in terms of the base URI
   * of the document. The DOM doesn't do that for us, and it isn't
   * entirely clear whether that should be done here; currently that's
   * pushed up to a higher level of our application. (Note that DOM Level
   * 1 didn't store the document's base URI.)
   * TODO: Consider resolving Relative URIs.
   * <p>
   * (The DOM's statement that "An XML processor may choose to
   * completely expand entities before the structure model is passed
   * to the DOM" refers only to parsed entities, not unparsed, and hence
   * doesn't affect this function.)
   *
   * @param name A string containing the Entity Name of the unparsed
   * entity.
   *
   * @return String containing the URI of the Unparsed Entity, or an
   * empty string if no such entity exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getLocalName(int nodeHandle)

  /**
   * Given a node handle, return its XPath-style localname.
   * (As defined in Namespaces, this is the portion of the name after any
   * colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNodeValue(int nodeHandle)

  /**
   * Given a node handle, return its node value. This is mostly
   * as defined by the DOM, but may ignore some conveniences.
   * <p>
   *
   * @param nodeHandle The node id.
   * @return String Value of this node, or null if not
   * meaningful for this node type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected void setSourceLocation() {

  /**
   * Store the source location of the current node.  This method must be called
   * as every node is added to the DTM or for no node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void migrateTo(DTMManager manager) {

  /**
    * Migrate a DTM built with an old DTMManager to a new DTMManager.
    * After the migration, the new DTMManager will treat the DTM as
    * one that is built by itself.
    * This is used to support DTM sharing between multiple transformations.
    * @param manager the DTMManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected void addNewDTMID(int nodeIndex) {

  /**
   * Get a new DTM ID beginning at the specified node index.
   * @param  nodeIndex The node identity at which the new DTM ID will begin
   * addressing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int addNode(int type, int expandedTypeID,
                        int parentIndex, int previousSibling,
                        int dataOrPrefix, boolean canHaveFirstChild)

  /**
   * Construct the node map from the node.
   *
   * @param type raw type ID, one of DTM.XXX_NODE.
   * @param expandedTypeID The expended type ID.
   * @param parentIndex The current parent index.
   * @param previousSibling The previous sibling index.
   * @param dataOrPrefix index into m_data table, or string handle.
   * @param canHaveFirstChild true if the node can have a first child, false
   *                          if it is atomic.
   *
   * @return The index identity of the node that was added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
//    protected void ensureSize(int index)

//    /**
//     * Ensure that the size of the information arrays can hold another entry
//     * at the given index.
//     *
//     * @param on exit from this function, the information arrays sizes must be
//     * at least index+1.
//     *
//     * NEEDSDOC @param index
//     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private final boolean isTextType(int type)

  /**
   * Bottleneck determination of text type.
   *
   * @param type oneof DTM.XXX_NODE.
   *
   * @return true if this is a text or cdata section.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean nextNode()

  /**
   * This method should try and build one or more nodes in the table.
   *
   * @return The true if a next node is found or false if
   *         there are no more nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getNumberOfNodes()

  /**
   * Get the number of nodes that have been added.
   *
   * @return The number of that are currently in the tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void dispatchToEvents(int nodeHandle, org.xml.sax.ContentHandler ch)

  /**
   * Directly create SAX parser events from a subtree.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int getNextNodeIdentity(int identity)

  /**
   * Get the next node identity value in the list, and call the iterator
   * if it hasn't been added yet.
   *
   * @param identity The node identity (index).
   * @return identity+1, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
    error(XMLMessages.createXMLMessage(XMLErrorResources.ER_METHOD_NOT_SUPPORTED, null));//"Not yet supported!");

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMDefaultBase abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getDocumentTypeDeclarationSystemIdentifier()

  /**
   *   A document type declaration information item has the following properties:
   *
   *     1. [system identifier] The system identifier of the external subset, if
   *        it exists. Otherwise this property has no value.
   *
   * @return the system identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public boolean isAttributeSpecified(int attributeHandle)

  /**
   *     5. [specified] A flag indicating whether this attribute was actually
   *        specified in the start-tag of its element, or was defaulted from the
   *        DTD.
   *
   * @param attributeHandle Must be a valid handle to an attribute node.
   * @return <code>true</code> if the attribute was specified;
   *         <code>false</code> if it was defaulted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNodeNameX(int nodeHandle)

  /**
   * Given a node handle, return the XPath node name.  This should be
   * the name as described by the XPath data model, NOT the DOM-style
   * name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNodeName(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style node name. This will
   * include names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void dispatchCharactersEvents(int nodeHandle, ContentHandler ch,
                                       boolean normalize)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   * @param normalize true if the content should be normalized according to
   * the rules for the XPath
   * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a>
   * function.
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public boolean needsTwoThreads()

  /**
   * @return true iff we're building this model incrementally (eg
   * we're partnered with a IncrementalSAXSource) and thus require that the
   * transformation and the parse run simultaneously. Guidance to the
   * DTMManager.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public DeclHandler getDeclHandler()

  /**
   * Return this DTM's DeclHandler.
   *
   * @return null if this model doesn't respond to SAX Decl events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public ErrorHandler getErrorHandler()

  /**
   * Return this DTM's ErrorHandler.
   *
   * @return null if this model doesn't respond to SAX error events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public DTDHandler getDTDHandler()

  /**
   * Return this DTM's DTDHandler.
   *
   * @return null if this model doesn't respond to SAX dtd events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public EntityResolver getEntityResolver()

  /**
   * Return this DTM's EntityResolver.
   *
   * @return null if this model doesn't respond to SAX entity ref events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public LexicalHandler getLexicalHandler()

  /**
   * Return this DTM's lexical handler.
   *
   * %REVIEW% Should this return null if constrution already done/begun?
   *
   * @return null if this model doesn't respond to lexical SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrementalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   *
   * Note that IncrementalSAXSource_Filter is package private, hence
   * it can be statically referenced using instanceof (CR 6537912).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public ContentHandler getContentHandler()

  /**
   * getContentHandler returns "our SAX builder" -- the thing that
   * someone else should send SAX events to in order to extend this
   * DTM model.
   *
   * %REVIEW% Should this return null if constrution already done/begun?
   *
   * @return null if this model doesn't respond to SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrementalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   *
   * Note that IncrementalSAXSource_Filter is package private, hence
   * it can be statically referenced using instanceof (CR 6537912).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setIncrementalSAXSource(IncrementalSAXSource incrementalSAXSource)

  /**
   * Bind a IncrementalSAXSource to this DTM. If we discover we need nodes
   * that have not yet been built, we will ask this object to send us more
   * events, and it will manage interactions with its data sources.
   *
   * Note that we do not actually build the IncrementalSAXSource, since we don't
   * know what source it's reading from, what thread that source will run in,
   * or when it will run.
   *
   * @param incrementalSAXSource The parser that we want to recieve events from
   * on demand.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void clearCoRoutine(boolean callDoTerminate)

  /**
   * Ask the CoRoutine parser to doTerminate and clear the reference. If
   * the CoRoutine parser has already been cleared, this will have no effect.
   *
   * @param callDoTerminate true of doTerminate should be called on the
   * coRoutine parser.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void clearCoRoutine()

  /**
   * Ask the CoRoutine parser to doTerminate and clear the reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int _dataOrQName(int identity)

  /**
   * Get the data or qualified name for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The data or qualified name, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setUseSourceLocation(boolean useSourceLocation)

  /**
   * Set whether information about document source location
   * should be maintained or not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public SAX2DTM(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing,
                 int blocksize,
                 boolean usePrevsib,
                 boolean newNameTable)

  /**
   * Construct a SAX2DTM object ready to be constructed from SAX2
   * ContentHandler events.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source the JAXP 1.1 Source object for this DTM.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory XMLString factory for creating character content.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public SAX2DTM(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing)

  /**
   * Construct a SAX2DTM object using the default block size.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source the JAXP 1.1 Source object for this DTM.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory XMLString factory for creating character content.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected IntVector m_sourceColumn;

   /** Made protected for access by SAX2RTFDTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected StringVector m_sourceSystemId;

   /** Made protected for access by SAX2RTFDTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean m_useSourceLocationProperty = false;

  /**
   * Describes whether information about document source location
   * should be maintained or not.
   *
   * Made protected for access by SAX2RTFDTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int m_textPendingStart = -1;

  /**
   * The starting offset within m_chars for the text or
   * CDATA_SECTION node currently being acumulated,
   * or -1 if there is no text node in progress
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELDS_PER = 4;

  /** Number of entries per record for m_entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_NAME = 3;

  /** m_entities name offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_NOTATIONNAME = 2;

  /** m_entities notation name offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_SYSTEMID = 1;

  /** m_entities system ID offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_PUBLICID = 0;

  /** m_entities public ID offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private Vector m_entities = null;

  /**
   * Vector of entities.  Each record is composed of four Strings:
   *  publicId, systemID, notationName, and name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final String[] m_fixednames = { null,

  /**
   * fixed dom-style names.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected Map<String, Integer> m_idAttributes = new HashMap<>();

  /**
   * This table holds the ID string to node associations, for
   * XML IDs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected SuballocatedIntVector m_dataOrQName;

  /** Data or qualified name values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean m_endDocumentOccured = false;

  /** End document has been reached.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected DTMStringPool m_valuesOrPrefixes;

  /** pool of string values that come as strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected DTMTreeWalker m_walker = new DTMTreeWalker();

  /** Tree Walker for dispatchToEvents. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected boolean m_insideDTD = false;

  /** We are inside the DTD.  This is used for ignoring comments.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient private String m_systemId = null;

  /** The SAX Document system-id */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected Locator m_locator = null;

  /** The SAX Document locator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected int m_coalescedTextType = DTM.TEXT_NODE;

  /**
   * Type of coalesced text block. See logic in the characters()
   * method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected int m_textType = DTM.TEXT_NODE;

  /** Type of next characters() event within text block in prgress. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected IntStack m_contextIndexes;

  /** Namespace support, only relevent at construction time.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected java.util.Vector m_prefixMappings =

  /** Namespace support, only relevent at construction time.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected int m_previous = 0;

  /** The current previous node, needed only for construction time.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected IntStack m_parents;

  /** The parent stack, needed only for construction.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected SuballocatedIntVector m_data;

  /** This vector holds offset and length data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  //private FastStringBuffer m_chars = new FastStringBuffer(13, 13);

  /**
   * All the character content, including attribute values, are stored in
   * this buffer.
   *
   * %REVIEW% Should this have an option of being shared across DTMs?
   * Sequentially only; not threadsafe... Currently, I think not.
   *
   * %REVIEW% Initial size was pushed way down to reduce weight of RTFs.
   * pending reduction in number of RTF DTMs. Now that we're sharing a DTM
   * between RTFs, and tail-pruning... consider going back to the larger/faster.
   *
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private IncrementalSAXSource m_incrementalSAXSource = null;

  /**
   * If we're building the model incrementally on demand, we need to
   * be able to tell the source when to send us more data.
   *
   * Note that if this has not been set, and you attempt to read ahead
   * of the current build point, we'll probably throw a null-pointer
   * exception. We could try to wait-and-retry instead, as a very poor
   * fallback, but that has all the known problems with multithreading
   * on multiprocessors and we Don't Want to Go There.
   *
   * @see setIncrementalSAXSource
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final boolean DEBUG = false;

  /** Set true to monitor SAX events and similar diagnostic info. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
public class SAX2DTM extends DTMDefaultBaseIterators

/**
 * This class implements a DTM that tends to be optimized more for speed than
 * for compactness, that is constructed via SAX2 ContentHandler events.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public SourceLocator getSourceLocatorFor(int node)

  /** Retrieve the SourceLocator associated with a specific node.
   * This is only meaningful if the XalanProperties.SOURCE_LOCATION flag was
   * set True using setProperty; if it was never set, or was set false, we
   * will return null.
   *
   * (We _could_ return a locator with the document's base URI and bogus
   * line/column information. Trying that; see the else clause.)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setProperty(String property, Object value)

  /**
   * Set a run time property for this DTM instance.
   *
   * %REVIEW% Now that we no longer use this method to support
   * getSourceLocatorFor, can we remove it?
   *
   * @param property a <code>String</code> value
   * @param value an <code>Object</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void comment(char ch[], int start, int length) throws SAXException

  /**
   * Report an XML comment anywhere in the document.
   *
   * <p>This callback will be used for comments inside or outside the
   * document element, including comments in the external DTD
   * subset (if read).</p>
   *
   * @param ch An array holding the characters in the comment.
   * @param start The starting position in the array.
   * @param length The number of characters to use from the array.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endCDATA() throws SAXException

  /**
   * Report the end of a CDATA section.
   *
   * @throws SAXException The application may raise an exception.
   * @see #startCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startCDATA() throws SAXException

  /**
   * Report the start of a CDATA section.
   *
   * <p>The contents of the CDATA section will be reported through
   * the regular {@link org.xml.sax.ContentHandler#characters
   * characters} event.</p>
   *
   * @throws SAXException The application may raise an exception.
   * @see #endCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endEntity(String name) throws SAXException

  /**
   * Report the end of an entity.
   *
   * @param name The name of the entity that is ending.
   * @throws SAXException The application may raise an exception.
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startEntity(String name) throws SAXException

  /**
   * Report the beginning of an entity in content.
   *
   * <p><strong>NOTE:</entity> entity references in attribute
   * values -- and the start and end of the document entity --
   * are never reported.</p>
   *
   * <p>The start and end of the external DTD subset are reported
   * using the pseudo-name "[dtd]".  All other events must be
   * properly nested within start/end entity events.</p>
   *
   * <p>Note that skipped entities will be reported through the
   * {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity}
   * event, which is part of the ContentHandler interface.</p>
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @throws SAXException The application may raise an exception.
   * @see #endEntity
   * @see org.xml.sax.ext.DeclHandler#internalEntityDecl
   * @see org.xml.sax.ext.DeclHandler#externalEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endDTD() throws SAXException

  /**
   * Report the end of DTD declarations.
   *
   * @throws SAXException The application may raise an exception.
   * @see #startDTD
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startDTD(String name, String publicId, String systemId)

  /**
   * Report the start of DTD declarations, if any.
   *
   * <p>Any declarations are assumed to be in the internal subset
   * unless otherwise indicated by a {@link #startEntity startEntity}
   * event.</p>
   *
   * <p>Note that the start/endDTD events will appear within
   * the start/endDocument events from ContentHandler and
   * before the first startElement event.</p>
   *
   * @param name The document type name.
   * @param publicId The declared public identifier for the
   *        external DTD subset, or null if none was declared.
   * @param systemId The declared system identifier for the
   *        external DTD subset, or null if none was declared.
   * @throws SAXException The application may raise an
   *            exception.
   * @see #endDTD
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the LexicalHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void externalEntityDecl(
          String name, String publicId, String systemId) throws SAXException

  /**
   * Report a parsed external entity declaration.
   *
   * <p>Only the effective (first) declaration for each entity
   * will be reported.</p>
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @param publicId The declared public identifier of the entity, or
   *        null if none was declared.
   * @param systemId The declared system identifier of the entity.
   * @throws SAXException The application may raise an exception.
   * @see #internalEntityDecl
   * @see org.xml.sax.DTDHandler#unparsedEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void internalEntityDecl(String name, String value)

  /**
   * Report an internal entity declaration.
   *
   * <p>Only the effective (first) declaration for each entity
   * will be reported.</p>
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @param value The replacement text of the entity.
   * @throws SAXException The application may raise an exception.
   * @see #externalEntityDecl
   * @see org.xml.sax.DTDHandler#unparsedEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void attributeDecl(
          String eName, String aName, String type, String valueDefault, String value)

  /**
   * Report an attribute type declaration.
   *
   * <p>Only the effective (first) declaration for an attribute will
   * be reported.  The type will be one of the strings "CDATA",
   * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY",
   * "ENTITIES", or "NOTATION", or a parenthesized token group with
   * the separator "|" and all whitespace removed.</p>
   *
   * @param eName The name of the associated element.
   * @param aName The name of the attribute.
   * @param type A string representing the attribute type.
   * @param valueDefault A string representing the attribute default
   *        ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if
   *        none of these applies.
   * @param value A string representing the attribute's default value,
   *        or null if there is none.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void elementDecl(String name, String model) throws SAXException

  /**
   * Report an element type declaration.
   *
   * <p>The content model will consist of the string "EMPTY", the
   * string "ANY", or a parenthesised group, optionally followed
   * by an occurrence indicator.  The model will be normalized so
   * that all whitespace is removed,and will include the enclosing
   * parentheses.</p>
   *
   * @param name The element type name.
   * @param model The content model as a normalized string.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the DeclHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void fatalError(SAXParseException e) throws SAXException

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ErrorHandler#fatalError
   * @see org.xml.sax.SAXParseException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void error(SAXParseException e) throws SAXException

  /**
   * Receive notification of a recoverable parser error.
   *
   * <p>The default implementation does nothing.  Application writers
   * may override this method in a subclass to take specific actions
   * for each error, such as inserting the message in a log file or
   * printing it to the console.</p>
   *
   * @param e The warning information encoded as an exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ErrorHandler#warning
   * @see org.xml.sax.SAXParseException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void warning(SAXParseException e) throws SAXException

  /**
   * Receive notification of a parser warning.
   *
   * <p>The default implementation does nothing.  Application writers
   * may override this method in a subclass to take specific actions
   * for each warning, such as inserting the message in a log file or
   * printing it to the console.</p>
   *
   * @param e The warning information encoded as an exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ErrorHandler#warning
   * @see org.xml.sax.SAXParseException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the ErrorHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void skippedEntity(String name) throws SAXException

  /**
   * Receive notification of a skipped entity.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions for each
   * processing instruction, such as setting status variables or
   * invoking other methods.</p>
   *
   * @param name The name of the skipped entity.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void processingInstruction(String target, String data)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void ignorableWhitespace(char ch[], int start, int length)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#ignorableWhitespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void characters(char ch[], int start, int length) throws SAXException

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endElement(String uri, String localName, String qName)

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
   * @param qName The qualified XML 1.0 name (with prefix), or the
   *        empty string if qualified names are not available.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startElement(
          String uri, String localName, String qName, Attributes attributes)

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
   * @param attributes The specified or defaulted attributes.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean declAlreadyDeclared(String prefix)

  /**
   * Check if a declaration has already been made for a given prefix.
   *
   * @param prefix non-null prefix string.
   *
   * @return true if the declaration has already been declared in the
   *         current context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endPrefixMapping(String prefix) throws SAXException

  /**
   * Receive notification of the end of a Namespace mapping.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the end of
   * each prefix mapping.</p>
   *
   * @param prefix The Namespace prefix being declared.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endPrefixMapping
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startPrefixMapping(String prefix, String uri)

  /**
   * Receive notification of the start of a Namespace mapping.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the start of
   * each Namespace prefix scope (such as storing the prefix mapping).</p>
   *
   * @param prefix The Namespace prefix being declared.
   * @param uri The Namespace URI mapped to the prefix.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startPrefixMapping
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void endDocument() throws SAXException

  /**
   * Receive notification of the end of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void startDocument() throws SAXException

  /**
   * Receive notification of the beginning of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setDocumentLocator(Locator locator)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of ContentHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void unparsedEntityDecl(
          String name, String publicId, String systemId, String notationName)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.DTDHandler#unparsedEntityDecl
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void notationDecl(String name, String publicId, String systemId)

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
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.DTDHandler#notationDecl
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of DTDHandler interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public InputSource resolveEntity(String publicId, String systemId)

  /**
   * Resolve an external entity.
   *
   * <p>Always return null, so that the parser will use the system
   * identifier provided in the XML document.  This method implements
   * the SAX default behaviour: application writers can override it
   * in a subclass to do special translations such as catalog lookups
   * or URI redirection.</p>
   *
   * @param publicId The public identifer, or null if none is
   *                 available.
   * @param systemId The system identifier provided in the XML
   *                 document.
   * @return The new input source, or null to require the
   *         default behaviour.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.EntityResolver#resolveEntity
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  // Implementation of the EntityResolver interface.

  ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected void charactersFlush()

  /**
   * Check whether accumulated text should be stripped; if not,
   * append the appropriate flavor of text/cdata node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setIDAttribute(String id, int elem)

  /**
   * Set an ID string to node association in the ID table.
   *
   * @param id The ID string.
   * @param elem The associated element handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNamespaceURI(String prefix)

    /**
   * Get a prefix either from the qname or from the uri mapping, or just make
   * one up!
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getIdForNamespace(String uri)

  /**
   * Get a prefix either from the uri mapping, or just make
   * one up!
   *
   * @param uri The namespace URI, which may be null.
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getPrefix(String qname, String uri)

  /**
   * Get a prefix either from the qname or from the uri mapping, or just make
   * one up!
   *
   * @param qname The qualified name, which may be null.
   * @param uri The namespace URI, which may be null.
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getElementById(String elementId)

  /**
   * Returns the <code>Element</code> whose <code>ID</code> is given by
   * <code>elementId</code>. If no such element exists, returns
   * <code>DTM.NULL</code>. Behavior is not defined if more than one element
   * has this <code>ID</code>. Attributes (including those
   * with the name "ID") are not of type ID unless so defined by DTD/Schema
   * information available to the DTM implementation.
   * Implementations that do not know whether attributes are of type ID or
   * not are expected to return <code>DTM.NULL</code>.
   *
   * <p>%REVIEW% Presumably IDs are still scoped to a single document,
   * and this operation searches only within a single document, right?
   * Wouldn't want collisions between DTMs in the same process.</p>
   *
   * @param elementId The unique <code>id</code> value for an element.
   * @return The handle of the matching element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public boolean isWhitespace(int nodeHandle)

  /**
   * Determine if the string-value of a node is whitespace
   *
   * @param nodeHandle The node Handle.
   *
   * @return Return true if the given node is whitespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public XMLString getStringValue(int nodeHandle)

  /**
   * Get the string-value of a node as a String object
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNamespaceURI(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style namespace URI
   * (As defined in Namespaces, this is the declared URI which this node's
   * prefix -- or default in lieu thereof -- was mapped to.)
   *
   * <p>%REVIEW% Null or ""? -sb</p>
   *
   * @param nodeHandle the id of the node.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
    error(XMLMessages.createXMLMessage(XMLErrorResources.ER_METHOD_NOT_SUPPORTED, null));//"Not yet supported!");

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMDefaultBase abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getDocumentTypeDeclarationPublicIdentifier()

  /**
   * Return the public identifier of the external subset,
   * normalized as described in 4.2.2 External Entities [XML]. If there is
   * no external subset or if it has no public identifier, this property
   * has no value.
   *
   * @return the public identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getAttributeNode(int nodeHandle, String namespaceURI,
                              String name)

  /**
   * Retrieves an attribute node by by qualified name and namespace URI.
   *
   * @param nodeHandle int Handle of the node upon which to look up this attribute..
   * @param namespaceURI The namespace URI of the attribute to
   *   retrieve, or null.
   * @param name The local name of the attribute to
   *   retrieve.
   * @return The attribute node handle with the specified name (
   *   <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such
   *   attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getPrefix(int nodeHandle)

  /**
   * Given a namespace handle, return the prefix that the namespace decl is
   * mapping.
   * Given a node handle, return the prefix used to map to the namespace.
   *
   * <p> %REVIEW% Are you sure you want "" for no prefix?  </p>
   * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb  </p>
   *
   * @param nodeHandle the id of the node.
   * @return String prefix of this node's name, or "" if no explicit
   * namespace prefix was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getUnparsedEntityURI(String name)

  /**
   * The getUnparsedEntityURI function returns the URI of the unparsed
   * entity with the specified name in the same document as the context
   * node (see [3.3 Unparsed Entities]). It returns the empty string if
   * there is no such entity.
   * <p>
   * XML processors may choose to use the System Identifier (if one
   * is provided) to resolve the entity, rather than the URI in the
   * Public Identifier. The details are dependent on the processor, and
   * we would have to support some form of plug-in resolver to handle
   * this properly. Currently, we simply return the System Identifier if
   * present, and hope that it a usable URI or that our caller can
   * map it to one.
   * TODO: Resolve Public Identifiers... or consider changing function name.
   * <p>
   * If we find a relative URI
   * reference, XML expects it to be resolved in terms of the base URI
   * of the document. The DOM doesn't do that for us, and it isn't
   * entirely clear whether that should be done here; currently that's
   * pushed up to a higher level of our application. (Note that DOM Level
   * 1 didn't store the document's base URI.)
   * TODO: Consider resolving Relative URIs.
   * <p>
   * (The DOM's statement that "An XML processor may choose to
   * completely expand entities before the structure model is passed
   * to the DOM" refers only to parsed entities, not unparsed, and hence
   * doesn't affect this function.)
   *
   * @param name A string containing the Entity Name of the unparsed
   * entity.
   *
   * @return String containing the URI of the Unparsed Entity, or an
   * empty string if no such entity exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getLocalName(int nodeHandle)

  /**
   * Given a node handle, return its XPath-style localname.
   * (As defined in Namespaces, this is the portion of the name after any
   * colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNodeValue(int nodeHandle)

  /**
   * Given a node handle, return its node value. This is mostly
   * as defined by the DOM, but may ignore some conveniences.
   * <p>
   *
   * @param nodeHandle The node id.
   * @return String Value of this node, or null if not
   * meaningful for this node type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected void setSourceLocation() {

  /**
   * Store the source location of the current node.  This method must be called
   * as every node is added to the DTM or for no node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void migrateTo(DTMManager manager) {

  /**
    * Migrate a DTM built with an old DTMManager to a new DTMManager.
    * After the migration, the new DTMManager will treat the DTM as
    * one that is built by itself.
    * This is used to support DTM sharing between multiple transformations.
    * @param manager the DTMManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected void addNewDTMID(int nodeIndex) {

  /**
   * Get a new DTM ID beginning at the specified node index.
   * @param  nodeIndex The node identity at which the new DTM ID will begin
   * addressing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int addNode(int type, int expandedTypeID,
                        int parentIndex, int previousSibling,
                        int dataOrPrefix, boolean canHaveFirstChild)

  /**
   * Construct the node map from the node.
   *
   * @param type raw type ID, one of DTM.XXX_NODE.
   * @param expandedTypeID The expended type ID.
   * @param parentIndex The current parent index.
   * @param previousSibling The previous sibling index.
   * @param dataOrPrefix index into m_data table, or string handle.
   * @param canHaveFirstChild true if the node can have a first child, false
   *                          if it is atomic.
   *
   * @return The index identity of the node that was added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
//    protected void ensureSize(int index)

//    /**
//     * Ensure that the size of the information arrays can hold another entry
//     * at the given index.
//     *
//     * @param on exit from this function, the information arrays sizes must be
//     * at least index+1.
//     *
//     * NEEDSDOC @param index
//     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private final boolean isTextType(int type)

  /**
   * Bottleneck determination of text type.
   *
   * @param type oneof DTM.XXX_NODE.
   *
   * @return true if this is a text or cdata section.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean nextNode()

  /**
   * This method should try and build one or more nodes in the table.
   *
   * @return The true if a next node is found or false if
   *         there are no more nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public int getNumberOfNodes()

  /**
   * Get the number of nodes that have been added.
   *
   * @return The number of that are currently in the tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void dispatchToEvents(int nodeHandle, org.xml.sax.ContentHandler ch)

  /**
   * Directly create SAX parser events from a subtree.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int getNextNodeIdentity(int identity)

  /**
   * Get the next node identity value in the list, and call the iterator
   * if it hasn't been added yet.
   *
   * @param identity The node identity (index).
   * @return identity+1, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
    error(XMLMessages.createXMLMessage(XMLErrorResources.ER_METHOD_NOT_SUPPORTED, null));//"Not yet supported!");

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMDefaultBase abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getDocumentTypeDeclarationSystemIdentifier()

  /**
   *   A document type declaration information item has the following properties:
   *
   *     1. [system identifier] The system identifier of the external subset, if
   *        it exists. Otherwise this property has no value.
   *
   * @return the system identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public boolean isAttributeSpecified(int attributeHandle)

  /**
   *     5. [specified] A flag indicating whether this attribute was actually
   *        specified in the start-tag of its element, or was defaulted from the
   *        DTD.
   *
   * @param attributeHandle Must be a valid handle to an attribute node.
   * @return <code>true</code> if the attribute was specified;
   *         <code>false</code> if it was defaulted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNodeNameX(int nodeHandle)

  /**
   * Given a node handle, return the XPath node name.  This should be
   * the name as described by the XPath data model, NOT the DOM-style
   * name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public String getNodeName(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style node name. This will
   * include names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void dispatchCharactersEvents(int nodeHandle, ContentHandler ch,
                                       boolean normalize)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   * @param normalize true if the content should be normalized according to
   * the rules for the XPath
   * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a>
   * function.
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public boolean needsTwoThreads()

  /**
   * @return true iff we're building this model incrementally (eg
   * we're partnered with a IncrementalSAXSource) and thus require that the
   * transformation and the parse run simultaneously. Guidance to the
   * DTMManager.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public DeclHandler getDeclHandler()

  /**
   * Return this DTM's DeclHandler.
   *
   * @return null if this model doesn't respond to SAX Decl events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public ErrorHandler getErrorHandler()

  /**
   * Return this DTM's ErrorHandler.
   *
   * @return null if this model doesn't respond to SAX error events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public DTDHandler getDTDHandler()

  /**
   * Return this DTM's DTDHandler.
   *
   * @return null if this model doesn't respond to SAX dtd events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public EntityResolver getEntityResolver()

  /**
   * Return this DTM's EntityResolver.
   *
   * @return null if this model doesn't respond to SAX entity ref events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public LexicalHandler getLexicalHandler()

  /**
   * Return this DTM's lexical handler.
   *
   * %REVIEW% Should this return null if constrution already done/begun?
   *
   * @return null if this model doesn't respond to lexical SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrementalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   *
   * Note that IncrementalSAXSource_Filter is package private, hence
   * it can be statically referenced using instanceof (CR 6537912).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public ContentHandler getContentHandler()

  /**
   * getContentHandler returns "our SAX builder" -- the thing that
   * someone else should send SAX events to in order to extend this
   * DTM model.
   *
   * %REVIEW% Should this return null if constrution already done/begun?
   *
   * @return null if this model doesn't respond to SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrementalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   *
   * Note that IncrementalSAXSource_Filter is package private, hence
   * it can be statically referenced using instanceof (CR 6537912).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setIncrementalSAXSource(IncrementalSAXSource incrementalSAXSource)

  /**
   * Bind a IncrementalSAXSource to this DTM. If we discover we need nodes
   * that have not yet been built, we will ask this object to send us more
   * events, and it will manage interactions with its data sources.
   *
   * Note that we do not actually build the IncrementalSAXSource, since we don't
   * know what source it's reading from, what thread that source will run in,
   * or when it will run.
   *
   * @param incrementalSAXSource The parser that we want to recieve events from
   * on demand.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void clearCoRoutine(boolean callDoTerminate)

  /**
   * Ask the CoRoutine parser to doTerminate and clear the reference. If
   * the CoRoutine parser has already been cleared, this will have no effect.
   *
   * @param callDoTerminate true of doTerminate should be called on the
   * coRoutine parser.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void clearCoRoutine()

  /**
   * Ask the CoRoutine parser to doTerminate and clear the reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int _dataOrQName(int identity)

  /**
   * Get the data or qualified name for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The data or qualified name, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public void setUseSourceLocation(boolean useSourceLocation)

  /**
   * Set whether information about document source location
   * should be maintained or not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public SAX2DTM(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing,
                 int blocksize,
                 boolean usePrevsib,
                 boolean newNameTable)

  /**
   * Construct a SAX2DTM object ready to be constructed from SAX2
   * ContentHandler events.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source the JAXP 1.1 Source object for this DTM.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory XMLString factory for creating character content.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  public SAX2DTM(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing)

  /**
   * Construct a SAX2DTM object using the default block size.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source the JAXP 1.1 Source object for this DTM.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory XMLString factory for creating character content.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected IntVector m_sourceColumn;

   /** Made protected for access by SAX2RTFDTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected StringVector m_sourceSystemId;

   /** Made protected for access by SAX2RTFDTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean m_useSourceLocationProperty = false;

  /**
   * Describes whether information about document source location
   * should be maintained or not.
   *
   * Made protected for access by SAX2RTFDTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected int m_textPendingStart = -1;

  /**
   * The starting offset within m_chars for the text or
   * CDATA_SECTION node currently being acumulated,
   * or -1 if there is no text node in progress
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELDS_PER = 4;

  /** Number of entries per record for m_entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_NAME = 3;

  /** m_entities name offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_NOTATIONNAME = 2;

  /** m_entities notation name offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_SYSTEMID = 1;

  /** m_entities system ID offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final int ENTITY_FIELD_PUBLICID = 0;

  /** m_entities public ID offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private Vector m_entities = null;

  /**
   * Vector of entities.  Each record is composed of four Strings:
   *  publicId, systemID, notationName, and name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final String[] m_fixednames = { null,

  /**
   * fixed dom-style names.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected Map<String, Integer> m_idAttributes = new HashMap<>();

  /**
   * This table holds the ID string to node associations, for
   * XML IDs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected SuballocatedIntVector m_dataOrQName;

  /** Data or qualified name values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected boolean m_endDocumentOccured = false;

  /** End document has been reached.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected DTMStringPool m_valuesOrPrefixes;

  /** pool of string values that come as strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected DTMTreeWalker m_walker = new DTMTreeWalker();

  /** Tree Walker for dispatchToEvents. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected boolean m_insideDTD = false;

  /** We are inside the DTD.  This is used for ignoring comments.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient private String m_systemId = null;

  /** The SAX Document system-id */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected Locator m_locator = null;

  /** The SAX Document locator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected int m_coalescedTextType = DTM.TEXT_NODE;

  /**
   * Type of coalesced text block. See logic in the characters()
   * method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected int m_textType = DTM.TEXT_NODE;

  /** Type of next characters() event within text block in prgress. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected IntStack m_contextIndexes;

  /** Namespace support, only relevent at construction time.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected java.util.Vector m_prefixMappings =

  /** Namespace support, only relevent at construction time.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected int m_previous = 0;

  /** The current previous node, needed only for construction time.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  transient protected IntStack m_parents;

  /** The parent stack, needed only for construction.
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  protected SuballocatedIntVector m_data;

  /** This vector holds offset and length data.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  //private FastStringBuffer m_chars = new FastStringBuffer(13, 13);

  /**
   * All the character content, including attribute values, are stored in
   * this buffer.
   *
   * %REVIEW% Should this have an option of being shared across DTMs?
   * Sequentially only; not threadsafe... Currently, I think not.
   *
   * %REVIEW% Initial size was pushed way down to reduce weight of RTFs.
   * pending reduction in number of RTF DTMs. Now that we're sharing a DTM
   * between RTFs, and tail-pruning... consider going back to the larger/faster.
   *
   * Made protected rather than private so SAX2RTFDTM can access it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private IncrementalSAXSource m_incrementalSAXSource = null;

  /**
   * If we're building the model incrementally on demand, we need to
   * be able to tell the source when to send us more data.
   *
   * Note that if this has not been set, and you attempt to read ahead
   * of the current build point, we'll probably throw a null-pointer
   * exception. We could try to wait-and-retry instead, as a very poor
   * fallback, but that has all the known problems with multithreading
   * on multiprocessors and we Don't Want to Go There.
   *
   * @see setIncrementalSAXSource
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
  private static final boolean DEBUG = false;

  /** Set true to monitor SAX events and similar diagnostic info. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM.java
public class SAX2DTM extends DTMDefaultBaseIterators

/**
 * This class implements a DTM that tends to be optimized more for speed than
 * for compactness, that is constructed via SAX2 ContentHandler events.
 */
