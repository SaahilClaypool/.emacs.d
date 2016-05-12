_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
   public void setBaseId(String baseId) {

  /**
    * Added additional getter and setter methods for the Base Id
    * to fix bugzilla bug 24187
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public void startElement(
          String namespaceURI, String localName, String qName, Attributes atts)

  /**
   * The spec notes that "The xml-stylesheet processing instruction is allowed only in the prolog of an XML document.",
   * so, at least for right now, I'm going to go ahead an throw a TransformerException
   * in order to stop the parse.
   *
   * @param namespaceURI The Namespace URI, or an empty string.
   * @param localName The local name (without prefix), or empty string if not namespace processing.
   * @param qName The qualified name (with prefix).
   * @param atts  The specified or defaulted attributes.
   *
   * @throws StopParseException since there can be no valid xml-stylesheet processing
   *                            instructions past the first element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public void processingInstruction(String target, String data)

  /**
   * Handle the xml-stylesheet processing instruction.
   *
   * @param target The processing instruction target.
   * @param data The processing instruction data, or null if
   *             none is supplied.
   * @throws org.xml.sax.SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   * @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public Source getAssociatedStylesheet()

  /**
   * Return the last stylesheet found that match the constraints.
   *
   * @return Source object that references the last stylesheet reference
   *         that matches the constraints.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public StylesheetPIHandler(String baseID, String media, String title,
                             String charset)

  /**
   * Construct a StylesheetPIHandler instance that will search
   * for xml-stylesheet PIs based on the given criteria.
   *
   * @param baseID The base ID of the XML document, needed to resolve
   *               relative IDs.
   * @param media The desired media criteria.
   * @param title The desired title criteria.
   * @param charset The desired character set criteria.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public URIResolver getURIResolver()

  /**
   * Get the object that will be used to resolve URIs in href
   * in xml-stylesheet processing instruction.
   *
   * @return The URIResolver that was set with setURIResolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public void setURIResolver(URIResolver resolver)

  /**
   * Get the object that will be used to resolve URIs in href
   * in xml-stylesheet processing instruction.
   *
   * @param resolver An object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  URIResolver m_uriResolver;

  /**
   * The object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  Vector m_stylesheets = new Vector();

  /** A list of SAXSource objects that match the criteria.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_charset;

  /** The desired character set criteria.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_title;

  /** The desired title criteria.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_media;

  /** The desired media criteria. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_baseID;

  /** The baseID of the document being processed.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
public class StylesheetPIHandler extends DefaultHandler

/**
 * Search for the xml-stylesheet processing instructions in an XML document.
 * @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
   public void setBaseId(String baseId) {

  /**
    * Added additional getter and setter methods for the Base Id
    * to fix bugzilla bug 24187
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public void startElement(
          String namespaceURI, String localName, String qName, Attributes atts)

  /**
   * The spec notes that "The xml-stylesheet processing instruction is allowed only in the prolog of an XML document.",
   * so, at least for right now, I'm going to go ahead an throw a TransformerException
   * in order to stop the parse.
   *
   * @param namespaceURI The Namespace URI, or an empty string.
   * @param localName The local name (without prefix), or empty string if not namespace processing.
   * @param qName The qualified name (with prefix).
   * @param atts  The specified or defaulted attributes.
   *
   * @throws StopParseException since there can be no valid xml-stylesheet processing
   *                            instructions past the first element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public void processingInstruction(String target, String data)

  /**
   * Handle the xml-stylesheet processing instruction.
   *
   * @param target The processing instruction target.
   * @param data The processing instruction data, or null if
   *             none is supplied.
   * @throws org.xml.sax.SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   * @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public Source getAssociatedStylesheet()

  /**
   * Return the last stylesheet found that match the constraints.
   *
   * @return Source object that references the last stylesheet reference
   *         that matches the constraints.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public StylesheetPIHandler(String baseID, String media, String title,
                             String charset)

  /**
   * Construct a StylesheetPIHandler instance that will search
   * for xml-stylesheet PIs based on the given criteria.
   *
   * @param baseID The base ID of the XML document, needed to resolve
   *               relative IDs.
   * @param media The desired media criteria.
   * @param title The desired title criteria.
   * @param charset The desired character set criteria.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public URIResolver getURIResolver()

  /**
   * Get the object that will be used to resolve URIs in href
   * in xml-stylesheet processing instruction.
   *
   * @return The URIResolver that was set with setURIResolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  public void setURIResolver(URIResolver resolver)

  /**
   * Get the object that will be used to resolve URIs in href
   * in xml-stylesheet processing instruction.
   *
   * @param resolver An object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  URIResolver m_uriResolver;

  /**
   * The object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  Vector m_stylesheets = new Vector();

  /** A list of SAXSource objects that match the criteria.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_charset;

  /** The desired character set criteria.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_title;

  /** The desired title criteria.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_media;

  /** The desired media criteria. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
  String m_baseID;

  /** The baseID of the document being processed.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StylesheetPIHandler.java
public class StylesheetPIHandler extends DefaultHandler

/**
 * Search for the xml-stylesheet processing instructions in an XML document.
 * @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a>
 */
