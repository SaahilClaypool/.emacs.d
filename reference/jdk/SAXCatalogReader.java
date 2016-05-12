_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void skippedEntity (String name)

  /** The SAX <code>skippedentity</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endPrefixMapping (String prefix)

  /** The SAX <code>endPrefixMapping</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startPrefixMapping (String prefix, String uri)

  /** The SAX <code>startPrefixMapping</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void processingInstruction (String target, String data)

  /** The SAX <code>processingInstruction</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void ignorableWhitespace (char ch[], int start, int length)

  /** The SAX <code>ignorableWhitespace</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void characters (char ch[], int start, int length)

  /** The SAX <code>characters</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endElement (String namespaceURI,
                          String localName,
                          String qName) throws SAXException {

  /** The SAX2 <code>endElement</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endElement (String name) throws SAXException {

  /** The SAX <code>endElement</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startElement (String namespaceURI,
                            String localName,
                            String qName,
                            Attributes atts)

  /**
   * The SAX2 <code>startElement</code> method.
   *
   * <p>The catalog parser is selected based on the namespace of the
   * first element encountered in the catalog.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startElement (String name,
                            AttributeList atts)

  /**
   * The SAX <code>startElement</code> method.
   *
   * <p>The catalog parser is selected based on the namespace of the
   * first element encountered in the catalog.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endDocument ()throws SAXException {

  /** The SAX <code>endDocument</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startDocument () throws SAXException {

  /** The SAX <code>startDocument</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setDocumentLocator (Locator locator) {

  /** The SAX <code>setDocumentLocator</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void readCatalog(Catalog catalog, InputStream is)

  /**
   * Parse an XML Catalog stream.
   *
   * @param catalog The catalog to which this catalog file belongs
   * @param is The input stream from which the catalog will be read
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   * @throws CatalogException A Catalog exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
    }

      url = new URL("file:///" + fileUrl);
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void readCatalog(Catalog catalog, String fileUrl)

  /**
   * Parse an XML Catalog file.
   *
   * @param catalog The catalog to which this catalog file belongs
   * @param fileUrl The URL or filename of the catalog file to process
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public String getCatalogParser(String namespaceURI,
                                 String rootElement) {

  /** Get the SAXCatalogParser class for the given namespace/root
     * element type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setCatalogParser(String namespaceURI,
                               String rootElement,
                               String parserClass) {

  /** Set the SAXCatalogParser class for the given namespace/root
     * element type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXCatalogReader(String parserClass) {

  /** The constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXCatalogReader(SAXParserFactory parserFactory) {

  /** The constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXCatalogReader() {

  /** The constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  protected Debug debug = CatalogManager.getStaticManager().debug;

  /** The debug class to use for this reader.
   *
   * This is a bit of a hack. Anyway, whenever we read for a catalog,
   * we extract the debug object
   * from the catalog's manager so that we can use it to print messages.
   *
   * In production, we don't really expect any messages so it doesn't
   * really matter. But it's still a bit of a hack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public String getParserClass() {

  /** Get the parser class currently in use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXParserFactory getParserFactory() {

  /** Get the parser factory currently in use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setParserClass(String parserClass) {

  /** Set the XML SAX Parser Class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setParserFactory(SAXParserFactory parserFactory) {

  /** Set the XML SAX Parser Factory.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  private Catalog catalog;

  /** The Catalog that we're working for. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  private boolean abandonHope = false;

  /** Set if something goes horribly wrong. It allows the class to
     * ignore the rest of the events that are received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  private SAXCatalogParser saxParser = null;

  /** The parser in use for the current catalog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  protected Map<String, String> namespaceMap = new HashMap<>();

  /**
     * Mapping table from QNames to CatalogParser classes.
     *
     * <p>Each key in this hash table has the form "elementname"
     * or "{namespaceuri}elementname". The former is used if the
     * namespace URI is null.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  protected String parserClass = null;

  /** The SAX Parser Class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
public class SAXCatalogReader implements CatalogReader, ContentHandler, DocumentHandler {

/**
 * A SAX-based CatalogReader.
 *
 * <p>This class is used to read XML Catalogs using the SAX. This reader
 * has an advantage over the DOM-based reader in that it functions on
 * the stream of SAX events. It has the disadvantage
 * that it cannot look around in the tree.</p>
 *
 * <p>Since the choice of CatalogReaders (in the InputStream case) can only
 * be made on the basis of MIME type, the following problem occurs: only
 * one CatalogReader can exist for all XML mime types. In order to get
 * around this problem, the SAXCatalogReader relies on a set of external
 * CatalogParsers to actually build the catalog.</p>
 *
 * <p>The selection of CatalogParsers is made on the basis of the QName
 * of the root element of the document.</p>
 *
 * @see Catalog
 * @see CatalogReader
 * @see SAXCatalogReader
 * @see TextCatalogReader
 * @see DOMCatalogParser
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void skippedEntity (String name)

  /** The SAX <code>skippedentity</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endPrefixMapping (String prefix)

  /** The SAX <code>endPrefixMapping</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startPrefixMapping (String prefix, String uri)

  /** The SAX <code>startPrefixMapping</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void processingInstruction (String target, String data)

  /** The SAX <code>processingInstruction</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void ignorableWhitespace (char ch[], int start, int length)

  /** The SAX <code>ignorableWhitespace</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void characters (char ch[], int start, int length)

  /** The SAX <code>characters</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endElement (String namespaceURI,
                          String localName,
                          String qName) throws SAXException {

  /** The SAX2 <code>endElement</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endElement (String name) throws SAXException {

  /** The SAX <code>endElement</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startElement (String namespaceURI,
                            String localName,
                            String qName,
                            Attributes atts)

  /**
   * The SAX2 <code>startElement</code> method.
   *
   * <p>The catalog parser is selected based on the namespace of the
   * first element encountered in the catalog.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startElement (String name,
                            AttributeList atts)

  /**
   * The SAX <code>startElement</code> method.
   *
   * <p>The catalog parser is selected based on the namespace of the
   * first element encountered in the catalog.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void endDocument ()throws SAXException {

  /** The SAX <code>endDocument</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void startDocument () throws SAXException {

  /** The SAX <code>startDocument</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setDocumentLocator (Locator locator) {

  /** The SAX <code>setDocumentLocator</code> method. Does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void readCatalog(Catalog catalog, InputStream is)

  /**
   * Parse an XML Catalog stream.
   *
   * @param catalog The catalog to which this catalog file belongs
   * @param is The input stream from which the catalog will be read
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   * @throws CatalogException A Catalog exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
    }

      url = new URL("file:///" + fileUrl);
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void readCatalog(Catalog catalog, String fileUrl)

  /**
   * Parse an XML Catalog file.
   *
   * @param catalog The catalog to which this catalog file belongs
   * @param fileUrl The URL or filename of the catalog file to process
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public String getCatalogParser(String namespaceURI,
                                 String rootElement) {

  /** Get the SAXCatalogParser class for the given namespace/root
     * element type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setCatalogParser(String namespaceURI,
                               String rootElement,
                               String parserClass) {

  /** Set the SAXCatalogParser class for the given namespace/root
     * element type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXCatalogReader(String parserClass) {

  /** The constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXCatalogReader(SAXParserFactory parserFactory) {

  /** The constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXCatalogReader() {

  /** The constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  protected Debug debug = CatalogManager.getStaticManager().debug;

  /** The debug class to use for this reader.
   *
   * This is a bit of a hack. Anyway, whenever we read for a catalog,
   * we extract the debug object
   * from the catalog's manager so that we can use it to print messages.
   *
   * In production, we don't really expect any messages so it doesn't
   * really matter. But it's still a bit of a hack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public String getParserClass() {

  /** Get the parser class currently in use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public SAXParserFactory getParserFactory() {

  /** Get the parser factory currently in use. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setParserClass(String parserClass) {

  /** Set the XML SAX Parser Class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  public void setParserFactory(SAXParserFactory parserFactory) {

  /** Set the XML SAX Parser Factory.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  private Catalog catalog;

  /** The Catalog that we're working for. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  private boolean abandonHope = false;

  /** Set if something goes horribly wrong. It allows the class to
     * ignore the rest of the events that are received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  private SAXCatalogParser saxParser = null;

  /** The parser in use for the current catalog. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  protected Map<String, String> namespaceMap = new HashMap<>();

  /**
     * Mapping table from QNames to CatalogParser classes.
     *
     * <p>Each key in this hash table has the form "elementname"
     * or "{namespaceuri}elementname". The former is used if the
     * namespace URI is null.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
  protected String parserClass = null;

  /** The SAX Parser Class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/SAXCatalogReader.java
public class SAXCatalogReader implements CatalogReader, ContentHandler, DocumentHandler {

/**
 * A SAX-based CatalogReader.
 *
 * <p>This class is used to read XML Catalogs using the SAX. This reader
 * has an advantage over the DOM-based reader in that it functions on
 * the stream of SAX events. It has the disadvantage
 * that it cannot look around in the tree.</p>
 *
 * <p>Since the choice of CatalogReaders (in the InputStream case) can only
 * be made on the basis of MIME type, the following problem occurs: only
 * one CatalogReader can exist for all XML mime types. In order to get
 * around this problem, the SAXCatalogReader relies on a set of external
 * CatalogParsers to actually build the catalog.</p>
 *
 * <p>The selection of CatalogParsers is made on the basis of the QName
 * of the root element of the document.</p>
 *
 * @see Catalog
 * @see CatalogReader
 * @see SAXCatalogReader
 * @see TextCatalogReader
 * @see DOMCatalogParser
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
