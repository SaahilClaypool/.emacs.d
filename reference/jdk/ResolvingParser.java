_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private void explain(String systemId) {

  /** Provide one possible explanation for an InternalError. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private void setupParse(String systemId) {

  /** Setup for parsing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /**
   * Implements the <code>resolveEntity</code> method
   * for the SAX interface, using an underlying CatalogResolver
   * to do the real work.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void unparsedEntityDecl (String name,
                                  String publicId,
                                  String systemId,
                                  String notationName)

  /** SAX DTDHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void notationDecl (String name, String publicId, String systemId)

  /** SAX DTDHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void startElement(String name, AttributeList atts)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void startDocument() throws SAXException {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setDocumentLocator(Locator locator) {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void processingInstruction(String target, String pidata)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void ignorableWhitespace(char[] ch, int start, int length)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void endElement(String name) throws SAXException {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void endDocument() throws SAXException {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void characters(char[] ch, int start, int length)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setLocale(Locale locale) throws SAXException {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setErrorHandler(ErrorHandler handler) {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setEntityResolver(EntityResolver resolver) {

  /**
   * SAX Parser API.
   *
   * <p>The purpose of this class is to implement an entity resolver.
   * Attempting to set a different one is pointless (and ignored).</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setDTDHandler(DTDHandler handler) {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setDocumentHandler(DocumentHandler handler) {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void parse(String systemId)

  /** SAX Parser API.
   *
   * @see #parse(InputSource)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void parse(InputSource input)

  /**
   * SAX Parser API.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public Catalog getCatalog() {

  /** Return the Catalog being used. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private void initParser() {

  /** Initialize the parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public ResolvingParser(CatalogManager manager) {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public ResolvingParser() {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private URL baseURL = null;

  /** The base URI of the input document, if known. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private boolean oasisXMLCatalogPI = false;

  /** Has an oasis-xml-catalog PI been seen? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private boolean allowXMLCatalogPI = false;

  /** Are we in the prolog? Is an oasis-xml-catalog PI valid now? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private CatalogResolver piCatalogResolver = null;

  /** A separate resolver for oasis-xml-pi catalogs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private CatalogResolver catalogResolver = null;

  /** The underlying catalog resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The manager for the underlying resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private DTDHandler dtdHandler = null;

  /** The underlying DTDHandler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private DocumentHandler documentHandler = null;

  /** The underlying DocumentHandler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private Parser parser = null;

  /** The underlying reader. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private SAXParser saxParser = null;

  /** The underlying parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public static boolean suppressExplanation = false;

  /** Suppress explanatory message?
   *
   * @see #parse(InputSource)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public static boolean validating = false;

  /** Make the parser validating? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public static boolean namespaceAware = true;

  /** Make the parser Namespace aware? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
public class ResolvingParser

/**
 * A SAX Parser that performs catalog-based entity resolution.
 *
 * <p>This class implements a SAX Parser that performs entity resolution
 * using the CatalogResolver. The actual, underlying parser is obtained
 * from a SAXParserFactory.</p>
 * </p>
 *
 * @deprecated This interface has been replaced by the
 *             {@link com.sun.org.apache.xml.internal.resolver.tools.ResolvingXMLReader} for SAX2.
 * @see CatalogResolver
 * @see org.xml.sax.Parser
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private void explain(String systemId) {

  /** Provide one possible explanation for an InternalError. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private void setupParse(String systemId) {

  /** Setup for parsing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /**
   * Implements the <code>resolveEntity</code> method
   * for the SAX interface, using an underlying CatalogResolver
   * to do the real work.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void unparsedEntityDecl (String name,
                                  String publicId,
                                  String systemId,
                                  String notationName)

  /** SAX DTDHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void notationDecl (String name, String publicId, String systemId)

  /** SAX DTDHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void startElement(String name, AttributeList atts)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void startDocument() throws SAXException {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setDocumentLocator(Locator locator) {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void processingInstruction(String target, String pidata)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void ignorableWhitespace(char[] ch, int start, int length)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void endElement(String name) throws SAXException {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void endDocument() throws SAXException {

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void characters(char[] ch, int start, int length)

  /** SAX DocumentHandler API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setLocale(Locale locale) throws SAXException {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setErrorHandler(ErrorHandler handler) {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setEntityResolver(EntityResolver resolver) {

  /**
   * SAX Parser API.
   *
   * <p>The purpose of this class is to implement an entity resolver.
   * Attempting to set a different one is pointless (and ignored).</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setDTDHandler(DTDHandler handler) {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void setDocumentHandler(DocumentHandler handler) {

  /** SAX Parser API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void parse(String systemId)

  /** SAX Parser API.
   *
   * @see #parse(InputSource)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public void parse(InputSource input)

  /**
   * SAX Parser API.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public Catalog getCatalog() {

  /** Return the Catalog being used. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private void initParser() {

  /** Initialize the parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public ResolvingParser(CatalogManager manager) {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public ResolvingParser() {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private URL baseURL = null;

  /** The base URI of the input document, if known. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private boolean oasisXMLCatalogPI = false;

  /** Has an oasis-xml-catalog PI been seen? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private boolean allowXMLCatalogPI = false;

  /** Are we in the prolog? Is an oasis-xml-catalog PI valid now? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private CatalogResolver piCatalogResolver = null;

  /** A separate resolver for oasis-xml-pi catalogs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private CatalogResolver catalogResolver = null;

  /** The underlying catalog resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The manager for the underlying resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private DTDHandler dtdHandler = null;

  /** The underlying DTDHandler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private DocumentHandler documentHandler = null;

  /** The underlying DocumentHandler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private Parser parser = null;

  /** The underlying reader. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  private SAXParser saxParser = null;

  /** The underlying parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public static boolean suppressExplanation = false;

  /** Suppress explanatory message?
   *
   * @see #parse(InputSource)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public static boolean validating = false;

  /** Make the parser validating? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
  public static boolean namespaceAware = true;

  /** Make the parser Namespace aware? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingParser.java
public class ResolvingParser

/**
 * A SAX Parser that performs catalog-based entity resolution.
 *
 * <p>This class implements a SAX Parser that performs entity resolution
 * using the CatalogResolver. The actual, underlying parser is obtained
 * from a SAXParserFactory.</p>
 * </p>
 *
 * @deprecated This interface has been replaced by the
 *             {@link com.sun.org.apache.xml.internal.resolver.tools.ResolvingXMLReader} for SAX2.
 * @see CatalogResolver
 * @see org.xml.sax.Parser
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
