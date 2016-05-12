_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMBuilder.java
public interface DOMBuilder extends  ExtendedSAX { }

/**
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void skippedEntity(String name) throws org.xml.sax.SAXException{}

  /**
   * Receive notification of a skipped entity.
   *
   * <p>The Parser will invoke this method once for each entity
   * skipped.  Non-validating processors may skip entities if they
   * have not seen the declarations (because, for example, the
   * entity was declared in an external DTD subset).  All processors
   * may skip external entities, depending on the values of the
   * http://xml.org/sax/features/external-general-entities and the
   * http://xml.org/sax/features/external-parameter-entities
   * properties.</p>
   *
   * @param name The name of the skipped entity.  If it is a
   *        parameter entity, the name will begin with '%'.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endPrefixMapping(String prefix) throws org.xml.sax.SAXException{}

  /**
   * End the scope of a prefix-URI mapping.
   *
   * <p>See startPrefixMapping for details.  This event will
   * always occur after the corresponding endElement event,
   * but the order of endPrefixMapping events is not otherwise
   * guaranteed.</p>
   *
   * @param prefix The prefix that was being mapping.
   * @see #startPrefixMapping
   * @see #endElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startPrefixMapping(String prefix, String uri)

  /**
   * Begin the scope of a prefix-URI Namespace mapping.
   *
   * <p>The information from this event is not necessary for
   * normal Namespace processing: the SAX XML reader will
   * automatically replace prefixes for element and attribute
   * names when the http://xml.org/sax/features/namespaces
   * feature is true (the default).</p>
   *
   * <p>There are cases, however, when applications need to
   * use prefixes in character data or in attribute values,
   * where they cannot safely be expanded automatically; the
   * start/endPrefixMapping event supplies the information
   * to the application to expand prefixes in those contexts
   * itself, if necessary.</p>
   *
   * <p>Note that start/endPrefixMapping events are not
   * guaranteed to be properly nested relative to each-other:
   * all startPrefixMapping events will occur before the
   * corresponding startElement event, and all endPrefixMapping
   * events will occur after the corresponding endElement event,
   * but their order is not guaranteed.</p>
   *
   * @param prefix The Namespace prefix being declared.
   * @param uri The Namespace URI the prefix is mapped to.
   * @see #endPrefixMapping
   * @see #startElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endDTD() throws org.xml.sax.SAXException

  /**
   * Report the end of DTD declarations.
   *
   * @see #startDTD
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startDTD(String name, String publicId, String systemId)

  /**
   * Report the start of DTD declarations, if any.
   *
   * Any declarations are assumed to be in the internal subset
   * unless otherwise indicated.
   *
   * @param name The document type name.
   * @param publicId The declared public identifier for the
   *        external DTD subset, or null if none was declared.
   * @param systemId The declared system identifier for the
   *        external DTD subset, or null if none was declared.
   * @see #endDTD
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void cdata(char ch[], int start, int length) throws org.xml.sax.SAXException

  /**
   * Receive notification of cdata.
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
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @see #ignorableWhitespace
   * @see org.xml.sax.Locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endCDATA() throws org.xml.sax.SAXException

  /**
   * Report the end of a CDATA section.
   *
   * @see #startCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startCDATA() throws org.xml.sax.SAXException

  /**
   * Report the start of a CDATA section.
   *
   * @see #endCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected boolean m_inCData = false;

  /** Flag indicating that we are processing a CData section          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void comment(char ch[], int start, int length) throws org.xml.sax.SAXException

  /**
   * Report an XML comment anywhere in the document.
   *
   * This callback will be used for comments inside or outside the
   * document element, including comments in the external DTD
   * subset (if read).
   *
   * @param ch An array holding the characters in the comment.
   * @param start The starting position in the array.
   * @param length The number of characters to use from the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
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
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
   private boolean isOutsideDocElem()

  /**
   * Tell if the current node is outside the document element.
   *
   * @return true if the current node is outside the document element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void ignorableWhitespace(char ch[], int start, int length)

  /**
   * Receive notification of ignorable whitespace in element content.
   *
   * <p>Validating Parsers must use this method to report each chunk
   * of ignorable whitespace (see the W3C XML 1.0 recommendation,
   * section 2.10): non-validating parsers may also use this method
   * if they are capable of parsing and using content models.</p>
   *
   * <p>SAX parsers may return all contiguous whitespace in a single
   * chunk, or they may split it into several chunks; however, all of
   * the characters in any single event must come from the same
   * external entity, so that the Locator provides useful
   * information.</p>
   *
   * <p>The application must not attempt to read from the array
   * outside of the specified range.</p>
   *
   * @param ch The characters from the XML document.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @see #characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void entityReference(String name) throws org.xml.sax.SAXException

  /**
   * Receive notivication of a entityReference.
   *
   * @param name name of the entity reference
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endEntity(String name) throws org.xml.sax.SAXException{}

  /**
   * Report the end of an entity.
   *
   * @param name The name of the entity that is ending.
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startEntity(String name) throws org.xml.sax.SAXException

  /**
   * Report the beginning of an entity.
   *
   * The start and end of the document entity are not reported.
   * The start and end of the external DTD subset are reported
   * using the pseudo-name "[dtd]".  All other events must be
   * properly nested within start/end entity events.
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @see #endEntity
   * @see org.xml.sax.ext.DeclHandler#internalEntityDecl
   * @see org.xml.sax.ext.DeclHandler#externalEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void charactersRaw(char ch[], int start, int length)

  /**
   * If available, when the disable-output-escaping attribute is used,
   * output raw text without escaping.  A PI will be inserted in front
   * of the node with the name "lotusxsl-next-is-raw" and a value of
   * "formatter-to-dom".
   *
   * @param ch Array containing the characters
   * @param start Index to start of characters in the array
   * @param length Number of characters in the array
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void characters(char ch[], int start, int length) throws org.xml.sax.SAXException

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
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @see #ignorableWhitespace
   * @see org.xml.sax.Locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void setIDAttribute(String id, Element elem)

  /**
   * Set an ID string to node association in the ID table.
   *
   * @param id The ID string.
   * @param elem The associated ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endElement(String ns, String localName, String name)

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
   * @param ns the namespace of the element
   * @param localName The local part of the qualified name of the element
   * @param name The element name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startElement(
          String ns, String localName, String name, Attributes atts)

  /**
   * Receive notification of the beginning of an element.
   *
   * <p>The Parser will invoke this method at the beginning of every
   * element in the XML document; there will be a corresponding
   * endElement() event for every startElement() event (even when the
   * element is empty). All of the element's content will be
   * reported, in order, before the corresponding endElement()
   * event.</p>
   *
   * <p>If the element name has a namespace prefix, the prefix will
   * still be attached.  Note that the attribute list provided will
   * contain only attributes with explicit values (specified or
   * defaulted): #IMPLIED attributes will be omitted.</p>
   *
   *
   * @param ns The namespace of the node
   * @param localName The local part of the qualified name
   * @param name The element name.
   * @param atts The attributes attached to the element, if any.
   * @see #endElement
   * @see org.xml.sax.Attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endDocument() throws org.xml.sax.SAXException

  /**
   * Receive notification of the end of a document.
   *
   * <p>The SAX parser will invoke this method only once, and it will
   * be the last method invoked during the parse.  The parser shall
   * not invoke this method until it has either abandoned parsing
   * (because of an unrecoverable error) or reached the end of
   * input.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startDocument() throws org.xml.sax.SAXException

  /**
   * Receive notification of the beginning of a document.
   *
   * <p>The SAX parser will invoke this method only once, before any
   * other methods in this interface or in DTDHandler (except for
   * setDocumentLocator).</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void setDocumentLocator(Locator locator)

  /**
   * Receive an object for locating the origin of SAX document events.
   *
   * <p>SAX parsers are strongly encouraged (though not absolutely
   * required) to supply a locator: if it does so, it must supply
   * the locator to the application by invoking this method before
   * invoking any of the other methods in the ContentHandler
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
   *
   * @param locator An object that can return the location of
   *                any SAX document event.
   * @see org.xml.sax.Locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected void append(Node newNode) throws org.xml.sax.SAXException

  /**
   * Append a node to the current container.
   *
   * @param newNode New node to append
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public java.io.Writer getWriter()

  /**
   * Return null since there is no Writer for this class.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getNextSibling()

  /**
   * Return the next sibling node.
   *
   * @return the next sibling node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void setNextSibling(Node nextSibling)

  /**
   * Set the next sibling node, which is where the result nodes
   * should be inserted before.
   *
   * @param nextSibling the next sibling node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getCurrentNode()

  /**
   * Get the node currently being processed.
   *
   * @return the current node being processed
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getRootNode()

  /**
   * Get the root node of the DOM tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getRootDocument()

  /**
   * Get the root document or DocumentFragment of the DOM being created.
   *
   * @return The root document or document fragment if not null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DOMBuilder(Document doc)

  /**
   * DOMBuilder instance constructor... it will add the DOM nodes
   * to the document.
   *
   * @param doc Root document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DOMBuilder(Document doc, DocumentFragment docFrag)

  /**
   * DOMBuilder instance constructor... it will add the DOM nodes
   * to the document fragment.
   *
   * @param doc Root document
   * @param docFrag Document fragment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DOMBuilder(Document doc, Node node)

  /**
   * DOMBuilder instance constructor... it will add the DOM nodes
   * to the document fragment.
   *
   * @param doc Root document
   * @param node Current node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Stack m_elemStack = new Stack();

  /** Vector of element nodes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DocumentFragment m_docFrag = null;

  /** First node of document fragment or null if not a DocumentFragment     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Node m_nextSibling = null;

  /** The next sibling node  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Node m_root = null;

  /** The root node          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Node m_currentNode = null;

  /** Current node           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Document m_doc;

  /** Root document          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
public class DOMBuilder

/**
 * This class takes SAX events (in addition to some extra events
 * that SAX doesn't handle yet) and adds the result to a document
 * or document fragment.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMBuilder.java
public interface DOMBuilder extends  ExtendedSAX { }

/**
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void skippedEntity(String name) throws org.xml.sax.SAXException{}

  /**
   * Receive notification of a skipped entity.
   *
   * <p>The Parser will invoke this method once for each entity
   * skipped.  Non-validating processors may skip entities if they
   * have not seen the declarations (because, for example, the
   * entity was declared in an external DTD subset).  All processors
   * may skip external entities, depending on the values of the
   * http://xml.org/sax/features/external-general-entities and the
   * http://xml.org/sax/features/external-parameter-entities
   * properties.</p>
   *
   * @param name The name of the skipped entity.  If it is a
   *        parameter entity, the name will begin with '%'.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endPrefixMapping(String prefix) throws org.xml.sax.SAXException{}

  /**
   * End the scope of a prefix-URI mapping.
   *
   * <p>See startPrefixMapping for details.  This event will
   * always occur after the corresponding endElement event,
   * but the order of endPrefixMapping events is not otherwise
   * guaranteed.</p>
   *
   * @param prefix The prefix that was being mapping.
   * @see #startPrefixMapping
   * @see #endElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startPrefixMapping(String prefix, String uri)

  /**
   * Begin the scope of a prefix-URI Namespace mapping.
   *
   * <p>The information from this event is not necessary for
   * normal Namespace processing: the SAX XML reader will
   * automatically replace prefixes for element and attribute
   * names when the http://xml.org/sax/features/namespaces
   * feature is true (the default).</p>
   *
   * <p>There are cases, however, when applications need to
   * use prefixes in character data or in attribute values,
   * where they cannot safely be expanded automatically; the
   * start/endPrefixMapping event supplies the information
   * to the application to expand prefixes in those contexts
   * itself, if necessary.</p>
   *
   * <p>Note that start/endPrefixMapping events are not
   * guaranteed to be properly nested relative to each-other:
   * all startPrefixMapping events will occur before the
   * corresponding startElement event, and all endPrefixMapping
   * events will occur after the corresponding endElement event,
   * but their order is not guaranteed.</p>
   *
   * @param prefix The Namespace prefix being declared.
   * @param uri The Namespace URI the prefix is mapped to.
   * @see #endPrefixMapping
   * @see #startElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endDTD() throws org.xml.sax.SAXException

  /**
   * Report the end of DTD declarations.
   *
   * @see #startDTD
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startDTD(String name, String publicId, String systemId)

  /**
   * Report the start of DTD declarations, if any.
   *
   * Any declarations are assumed to be in the internal subset
   * unless otherwise indicated.
   *
   * @param name The document type name.
   * @param publicId The declared public identifier for the
   *        external DTD subset, or null if none was declared.
   * @param systemId The declared system identifier for the
   *        external DTD subset, or null if none was declared.
   * @see #endDTD
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void cdata(char ch[], int start, int length) throws org.xml.sax.SAXException

  /**
   * Receive notification of cdata.
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
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @see #ignorableWhitespace
   * @see org.xml.sax.Locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endCDATA() throws org.xml.sax.SAXException

  /**
   * Report the end of a CDATA section.
   *
   * @see #startCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startCDATA() throws org.xml.sax.SAXException

  /**
   * Report the start of a CDATA section.
   *
   * @see #endCDATA
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected boolean m_inCData = false;

  /** Flag indicating that we are processing a CData section          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void comment(char ch[], int start, int length) throws org.xml.sax.SAXException

  /**
   * Report an XML comment anywhere in the document.
   *
   * This callback will be used for comments inside or outside the
   * document element, including comments in the external DTD
   * subset (if read).
   *
   * @param ch An array holding the characters in the comment.
   * @param start The starting position in the array.
   * @param length The number of characters to use from the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
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
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
   private boolean isOutsideDocElem()

  /**
   * Tell if the current node is outside the document element.
   *
   * @return true if the current node is outside the document element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void ignorableWhitespace(char ch[], int start, int length)

  /**
   * Receive notification of ignorable whitespace in element content.
   *
   * <p>Validating Parsers must use this method to report each chunk
   * of ignorable whitespace (see the W3C XML 1.0 recommendation,
   * section 2.10): non-validating parsers may also use this method
   * if they are capable of parsing and using content models.</p>
   *
   * <p>SAX parsers may return all contiguous whitespace in a single
   * chunk, or they may split it into several chunks; however, all of
   * the characters in any single event must come from the same
   * external entity, so that the Locator provides useful
   * information.</p>
   *
   * <p>The application must not attempt to read from the array
   * outside of the specified range.</p>
   *
   * @param ch The characters from the XML document.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @see #characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void entityReference(String name) throws org.xml.sax.SAXException

  /**
   * Receive notivication of a entityReference.
   *
   * @param name name of the entity reference
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endEntity(String name) throws org.xml.sax.SAXException{}

  /**
   * Report the end of an entity.
   *
   * @param name The name of the entity that is ending.
   * @see #startEntity
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startEntity(String name) throws org.xml.sax.SAXException

  /**
   * Report the beginning of an entity.
   *
   * The start and end of the document entity are not reported.
   * The start and end of the external DTD subset are reported
   * using the pseudo-name "[dtd]".  All other events must be
   * properly nested within start/end entity events.
   *
   * @param name The name of the entity.  If it is a parameter
   *        entity, the name will begin with '%'.
   * @see #endEntity
   * @see org.xml.sax.ext.DeclHandler#internalEntityDecl
   * @see org.xml.sax.ext.DeclHandler#externalEntityDecl
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void charactersRaw(char ch[], int start, int length)

  /**
   * If available, when the disable-output-escaping attribute is used,
   * output raw text without escaping.  A PI will be inserted in front
   * of the node with the name "lotusxsl-next-is-raw" and a value of
   * "formatter-to-dom".
   *
   * @param ch Array containing the characters
   * @param start Index to start of characters in the array
   * @param length Number of characters in the array
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void characters(char ch[], int start, int length) throws org.xml.sax.SAXException

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
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @see #ignorableWhitespace
   * @see org.xml.sax.Locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void setIDAttribute(String id, Element elem)

  /**
   * Set an ID string to node association in the ID table.
   *
   * @param id The ID string.
   * @param elem The associated ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endElement(String ns, String localName, String name)

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
   * @param ns the namespace of the element
   * @param localName The local part of the qualified name of the element
   * @param name The element name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startElement(
          String ns, String localName, String name, Attributes atts)

  /**
   * Receive notification of the beginning of an element.
   *
   * <p>The Parser will invoke this method at the beginning of every
   * element in the XML document; there will be a corresponding
   * endElement() event for every startElement() event (even when the
   * element is empty). All of the element's content will be
   * reported, in order, before the corresponding endElement()
   * event.</p>
   *
   * <p>If the element name has a namespace prefix, the prefix will
   * still be attached.  Note that the attribute list provided will
   * contain only attributes with explicit values (specified or
   * defaulted): #IMPLIED attributes will be omitted.</p>
   *
   *
   * @param ns The namespace of the node
   * @param localName The local part of the qualified name
   * @param name The element name.
   * @param atts The attributes attached to the element, if any.
   * @see #endElement
   * @see org.xml.sax.Attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void endDocument() throws org.xml.sax.SAXException

  /**
   * Receive notification of the end of a document.
   *
   * <p>The SAX parser will invoke this method only once, and it will
   * be the last method invoked during the parse.  The parser shall
   * not invoke this method until it has either abandoned parsing
   * (because of an unrecoverable error) or reached the end of
   * input.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void startDocument() throws org.xml.sax.SAXException

  /**
   * Receive notification of the beginning of a document.
   *
   * <p>The SAX parser will invoke this method only once, before any
   * other methods in this interface or in DTDHandler (except for
   * setDocumentLocator).</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void setDocumentLocator(Locator locator)

  /**
   * Receive an object for locating the origin of SAX document events.
   *
   * <p>SAX parsers are strongly encouraged (though not absolutely
   * required) to supply a locator: if it does so, it must supply
   * the locator to the application by invoking this method before
   * invoking any of the other methods in the ContentHandler
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
   *
   * @param locator An object that can return the location of
   *                any SAX document event.
   * @see org.xml.sax.Locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected void append(Node newNode) throws org.xml.sax.SAXException

  /**
   * Append a node to the current container.
   *
   * @param newNode New node to append
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public java.io.Writer getWriter()

  /**
   * Return null since there is no Writer for this class.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getNextSibling()

  /**
   * Return the next sibling node.
   *
   * @return the next sibling node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public void setNextSibling(Node nextSibling)

  /**
   * Set the next sibling node, which is where the result nodes
   * should be inserted before.
   *
   * @param nextSibling the next sibling node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getCurrentNode()

  /**
   * Get the node currently being processed.
   *
   * @return the current node being processed
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getRootNode()

  /**
   * Get the root node of the DOM tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Node getRootDocument()

  /**
   * Get the root document or DocumentFragment of the DOM being created.
   *
   * @return The root document or document fragment if not null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DOMBuilder(Document doc)

  /**
   * DOMBuilder instance constructor... it will add the DOM nodes
   * to the document.
   *
   * @param doc Root document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DOMBuilder(Document doc, DocumentFragment docFrag)

  /**
   * DOMBuilder instance constructor... it will add the DOM nodes
   * to the document fragment.
   *
   * @param doc Root document
   * @param docFrag Document fragment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DOMBuilder(Document doc, Node node)

  /**
   * DOMBuilder instance constructor... it will add the DOM nodes
   * to the document fragment.
   *
   * @param doc Root document
   * @param node Current node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Stack m_elemStack = new Stack();

  /** Vector of element nodes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public DocumentFragment m_docFrag = null;

  /** First node of document fragment or null if not a DocumentFragment     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Node m_nextSibling = null;

  /** The next sibling node  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Node m_root = null;

  /** The root node          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  protected Node m_currentNode = null;

  /** Current node           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
  public Document m_doc;

  /** Root document          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOMBuilder.java
public class DOMBuilder

/**
 * This class takes SAX events (in addition to some extra events
 * that SAX doesn't handle yet) and adds the result to a document
 * or document fragment.
 * @xsl.usage general
 */
