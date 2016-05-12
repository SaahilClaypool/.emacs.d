_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void endPrefixMapping(String prefix)

  /** The SAX <code>endPrefixMapping</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void startPrefixMapping(String prefix, String uri)

  /** The SAX <code>startPrefixMapping</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void skippedEntity (String name)

  /** The SAX <code>skippedEntity</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void processingInstruction (String target, String data)

  /** The SAX <code>processingInstruction</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void ignorableWhitespace (char ch[], int start, int length)

  /** The SAX <code>ignorableWhitespace</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void characters (char ch[], int start, int length)

  /** The SAX <code>characters</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void endElement (String namespaceURI,
                          String localName,
                          String qName)

  /** The SAX <code>endElement</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void startElement (String namespaceURI,
                            String localName,
                            String qName,
                            Attributes atts)

  /**
   * The SAX <code>startElement</code> method recognizes elements
   * from the plain catalog format and instantiates CatalogEntry
   * objects for them.
   *
   * @param namespaceURI The namespace name of the element.
   * @param localName The local name of the element.
   * @param qName The QName of the element.
   * @param atts The list of attributes on the element.
   *
   * @see CatalogEntry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void endDocument ()

  /** The SAX <code>endDocument</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void startDocument ()

  /** The SAX <code>startDocument</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void setDocumentLocator (Locator locator) {

  /** The SAX <code>setDocumentLocator</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  protected boolean inExtensionNamespace() {

  /**
   * Are we in an extension namespace?
   *
   * @return true if the current stack of open namespaces includes
   *               an extension namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public Catalog getCatalog () {

  /** Get the current catalog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void setCatalog (Catalog catalog) {

  /** Set the current catalog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public static final String tr9401NamespaceName = "urn:oasis:names:tc:entity:xmlns:tr9401:catalog";

  /** The namespace name of OASIS ERTC TR9401 catalog extension */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public static final String namespaceName = "urn:oasis:names:tc:entity:xmlns:xml:catalog";

  /** The namespace name of OASIS ERTC catalogs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
public class OASISXMLCatalogReader extends SAXCatalogReader implements SAXCatalogParser {

/**
 * Parse OASIS Entity Resolution Technical Committee
 * XML Catalog files.
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void endPrefixMapping(String prefix)

  /** The SAX <code>endPrefixMapping</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void startPrefixMapping(String prefix, String uri)

  /** The SAX <code>startPrefixMapping</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void skippedEntity (String name)

  /** The SAX <code>skippedEntity</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void processingInstruction (String target, String data)

  /** The SAX <code>processingInstruction</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void ignorableWhitespace (char ch[], int start, int length)

  /** The SAX <code>ignorableWhitespace</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void characters (char ch[], int start, int length)

  /** The SAX <code>characters</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void endElement (String namespaceURI,
                          String localName,
                          String qName)

  /** The SAX <code>endElement</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void startElement (String namespaceURI,
                            String localName,
                            String qName,
                            Attributes atts)

  /**
   * The SAX <code>startElement</code> method recognizes elements
   * from the plain catalog format and instantiates CatalogEntry
   * objects for them.
   *
   * @param namespaceURI The namespace name of the element.
   * @param localName The local name of the element.
   * @param qName The QName of the element.
   * @param atts The list of attributes on the element.
   *
   * @see CatalogEntry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void endDocument ()

  /** The SAX <code>endDocument</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void startDocument ()

  /** The SAX <code>startDocument</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void setDocumentLocator (Locator locator) {

  /** The SAX <code>setDocumentLocator</code> method does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  protected boolean inExtensionNamespace() {

  /**
   * Are we in an extension namespace?
   *
   * @return true if the current stack of open namespaces includes
   *               an extension namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public Catalog getCatalog () {

  /** Get the current catalog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public void setCatalog (Catalog catalog) {

  /** Set the current catalog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public static final String tr9401NamespaceName = "urn:oasis:names:tc:entity:xmlns:tr9401:catalog";

  /** The namespace name of OASIS ERTC TR9401 catalog extension */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
  public static final String namespaceName = "urn:oasis:names:tc:entity:xmlns:xml:catalog";

  /** The namespace name of OASIS ERTC catalogs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/OASISXMLCatalogReader.java
public class OASISXMLCatalogReader extends SAXCatalogReader implements SAXCatalogParser {

/**
 * Parse OASIS Entity Resolution Technical Committee
 * XML Catalog files.
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
