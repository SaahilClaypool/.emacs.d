_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private void explain(String systemId) {

  /** Provide one possible explanation for an InternalError. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private void setupBaseURI(String systemId) {

  /** Save the base URI of the document being parsed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void processingInstruction(String target, String pidata)

  /** SAX ContentHandler API.
   *
   * <p>Detect and use the oasis-xml-catalog PI if it occurs.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void startElement (String uri, String localName, String qName,
                            Attributes atts)

  /** SAX ContentHandler API.
   *
   * <p>Captured here only to detect the end of the prolog so that
   * we can ignore subsequent oasis-xml-catalog PIs. Otherwise
   * the events are just passed through.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void unparsedEntityDecl (String name,
                                  String publicId,
                                  String systemId,
                                  String notationName)

  /** SAX DTDHandler API.
   *
   * <p>Captured here only to detect the end of the prolog so that
   * we can ignore subsequent oasis-xml-catalog PIs. Otherwise
   * the events are just passed through.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void notationDecl (String name, String publicId, String systemId)

  /** SAX DTDHandler API.
   *
   * <p>Captured here only to detect the end of the prolog so that
   * we can ignore subsequent oasis-xml-catalog PIs. Otherwise
   * the events are just passed through.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /**
   * Implements the <code>resolveEntity</code> method
   * for the SAX interface, using an underlying CatalogResolver
   * to do the real work.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void parse(String systemId)

  /** SAX XMLReader API.
   *
   * @see #parse(InputSource)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void parse(InputSource input)

  /**
   * SAX XMLReader API.
   *
   * <p>Note that the JAXP 1.1ea2 parser crashes with an InternalError if
   * it encounters a system identifier that appears to be a relative URI
   * that begins with a slash. For example, the declaration:</p>
   *
   * <pre>
   * &lt;!DOCTYPE book SYSTEM "/path/to/dtd/on/my/system/docbookx.dtd">
   * </pre>
   *
   * <p>would cause such an error. As a convenience, this method catches
   * that error and prints an explanation. (Unfortunately, it's not possible
   * to identify the particular system identifier that causes the problem.)
   * </p>
   *
   * <p>The underlying error is forwarded after printing the explanatory
   * message. The message is only every printed once and if
   * <code>suppressExplanation</code> is set to <code>false</code> before
   * parsing, it will never be printed.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public Catalog getCatalog() {

  /**
   * Provide accessto the underlying Catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter(XMLReader parent, CatalogManager manager) {

  /** Construct an XML filter with the specified parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter(CatalogManager manager) {

  /** Construct an XML filter with the specified parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter(XMLReader parent) {

  /** Construct an XML filter with the specified parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter() {

  /** Construct an empty XML Filter with no parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private URL baseURL = null;

  /** The base URI of the input document, if known. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private boolean oasisXMLCatalogPI = false;

  /** Has an oasis-xml-catalog PI been seen? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private boolean allowXMLCatalogPI = false;

  /** Are we in the prolog? Is an oasis-xml-catalog PI valid now? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private CatalogResolver piCatalogResolver = null;

  /** A separate resolver for oasis-xml-pi catalogs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private CatalogResolver catalogResolver = null;

  /** The underlying catalog resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The manager for the underlying resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
public class ResolvingXMLFilter extends XMLFilterImpl {

/**
 * A SAX XMLFilter that performs catalog-based entity resolution.
 *
 * <p>This class implements a SAX XMLFilter that performs entity resolution
 * using the CatalogResolver. The actual, underlying parser is obtained
 * from a SAXParserFactory.</p>
 * </p>
 *
 * @see CatalogResolver
 * @see org.xml.sax.XMLFilter
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private void explain(String systemId) {

  /** Provide one possible explanation for an InternalError. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private void setupBaseURI(String systemId) {

  /** Save the base URI of the document being parsed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void processingInstruction(String target, String pidata)

  /** SAX ContentHandler API.
   *
   * <p>Detect and use the oasis-xml-catalog PI if it occurs.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void startElement (String uri, String localName, String qName,
                            Attributes atts)

  /** SAX ContentHandler API.
   *
   * <p>Captured here only to detect the end of the prolog so that
   * we can ignore subsequent oasis-xml-catalog PIs. Otherwise
   * the events are just passed through.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void unparsedEntityDecl (String name,
                                  String publicId,
                                  String systemId,
                                  String notationName)

  /** SAX DTDHandler API.
   *
   * <p>Captured here only to detect the end of the prolog so that
   * we can ignore subsequent oasis-xml-catalog PIs. Otherwise
   * the events are just passed through.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void notationDecl (String name, String publicId, String systemId)

  /** SAX DTDHandler API.
   *
   * <p>Captured here only to detect the end of the prolog so that
   * we can ignore subsequent oasis-xml-catalog PIs. Otherwise
   * the events are just passed through.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /**
   * Implements the <code>resolveEntity</code> method
   * for the SAX interface, using an underlying CatalogResolver
   * to do the real work.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void parse(String systemId)

  /** SAX XMLReader API.
   *
   * @see #parse(InputSource)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public void parse(InputSource input)

  /**
   * SAX XMLReader API.
   *
   * <p>Note that the JAXP 1.1ea2 parser crashes with an InternalError if
   * it encounters a system identifier that appears to be a relative URI
   * that begins with a slash. For example, the declaration:</p>
   *
   * <pre>
   * &lt;!DOCTYPE book SYSTEM "/path/to/dtd/on/my/system/docbookx.dtd">
   * </pre>
   *
   * <p>would cause such an error. As a convenience, this method catches
   * that error and prints an explanation. (Unfortunately, it's not possible
   * to identify the particular system identifier that causes the problem.)
   * </p>
   *
   * <p>The underlying error is forwarded after printing the explanatory
   * message. The message is only every printed once and if
   * <code>suppressExplanation</code> is set to <code>false</code> before
   * parsing, it will never be printed.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public Catalog getCatalog() {

  /**
   * Provide accessto the underlying Catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter(XMLReader parent, CatalogManager manager) {

  /** Construct an XML filter with the specified parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter(CatalogManager manager) {

  /** Construct an XML filter with the specified parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter(XMLReader parent) {

  /** Construct an XML filter with the specified parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  public ResolvingXMLFilter() {

  /** Construct an empty XML Filter with no parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private URL baseURL = null;

  /** The base URI of the input document, if known. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private boolean oasisXMLCatalogPI = false;

  /** Has an oasis-xml-catalog PI been seen? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private boolean allowXMLCatalogPI = false;

  /** Are we in the prolog? Is an oasis-xml-catalog PI valid now? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private CatalogResolver piCatalogResolver = null;

  /** A separate resolver for oasis-xml-pi catalogs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  private CatalogResolver catalogResolver = null;

  /** The underlying catalog resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
  CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The manager for the underlying resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLFilter.java
public class ResolvingXMLFilter extends XMLFilterImpl {

/**
 * A SAX XMLFilter that performs catalog-based entity resolution.
 *
 * <p>This class implements a SAX XMLFilter that performs entity resolution
 * using the CatalogResolver. The actual, underlying parser is obtained
 * from a SAXParserFactory.</p>
 * </p>
 *
 * @see CatalogResolver
 * @see org.xml.sax.XMLFilter
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
