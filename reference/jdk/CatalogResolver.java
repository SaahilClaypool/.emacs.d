_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private String makeAbsolute(String uri) {

  /** Attempt to construct an absolute URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private void setEntityResolver(SAXSource source) throws TransformerException {

  /**
   * <p>Establish an entityResolver for newly resolved URIs.</p>
   *
   * <p>This is called from the URIResolver to set an EntityResolver
   * on the SAX parser to be used for new XML documents that are
   * encountered as a result of the document() function, xsl:import,
   * or xsl:include.  This is done because the XSLT processor calls
   * out to the SAXParserFactory itself to create a new SAXParser to
   * parse the new document.  The new parser does not automatically
   * inherit the EntityResolver of the original (although arguably
   * it should).  See below:</p>
   *
   * <tt>"If an application wants to set the ErrorHandler or
   * EntityResolver for an XMLReader used during a transformation,
   * it should use a URIResolver to return the SAXSource which
   * provides (with getXMLReader) a reference to the XMLReader"</tt>
   *
   * <p>...quoted from page 118 of the Java API for XML
   * Processing 1.1 specification</p>
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public Source resolve(String href, String base)

  /** JAXP URIResolver API */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /**
   * Implements the <code>resolveEntity</code> method
   * for the SAX interface.
   *
   * <p>Presented with an optional public identifier and a system
   * identifier, this function attempts to locate a mapping in the
   * catalogs.</p>
   *
   * <p>If such a mapping is found, the resolver attempts to open
   * the mapped value as an InputSource and return it. Exceptions are
   * ignored and null is returned if the mapped value cannot be opened
   * as an input source.</p>
   *
   * <p>If no mapping is found (or an error occurs attempting to open
   * the mapped value as an input source), null is returned and the system
   * will use the specified system identifier as if no entityResolver
   * was specified.</p>
   *
   * @param publicId  The public identifier for the entity in question.
   * This may be null.
   *
   * @param systemId  The system identifier for the entity in question.
   * XML requires a system identifier on all external entities, so this
   * value is always specified.
   *
   * @return An InputSource for the mapped identifier, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public String getResolvedEntity (String publicId, String systemId) {

  /**
   * Implements the guts of the <code>resolveEntity</code> method
   * for the SAX interface.
   *
   * <p>Presented with an optional public identifier and a system
   * identifier, this function attempts to locate a mapping in the
   * catalogs.</p>
   *
   * <p>If such a mapping is found, it is returned.  If no mapping is
   * found, null is returned.</p>
   *
   * @param publicId  The public identifier for the entity in question.
   * This may be null.
   *
   * @param systemId  The system identifier for the entity in question.
   * XML requires a system identifier on all external entities, so this
   * value is always specified.
   *
   * @return The resolved identifier (a URI reference).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public Catalog getCatalog() {

  /** Return the underlying catalog */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private void initializeCatalogs(boolean privateCatalog) {

  /** Initialize catalog */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public CatalogResolver(CatalogManager manager) {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public CatalogResolver(boolean privateCatalog) {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public CatalogResolver() {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The catalog manager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private Catalog catalog = null;

  /** The underlying catalog */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public boolean validating = false;

  /** Make the parser validating? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
public class CatalogResolver implements EntityResolver, URIResolver {

/**
 * A SAX EntityResolver/JAXP URIResolver that uses catalogs.
 *
 * <p>This class implements both a SAX EntityResolver and a JAXP URIResolver.
 * </p>
 *
 * <p>This resolver understands OASIS TR9401 catalogs, XCatalogs, and the
 * current working draft of the OASIS Entity Resolution Technical
 * Committee specification.</p>
 *
 * @see Catalog
 * @see org.xml.sax.EntityResolver
 * @see javax.xml.transform.URIResolver
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private String makeAbsolute(String uri) {

  /** Attempt to construct an absolute URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private void setEntityResolver(SAXSource source) throws TransformerException {

  /**
   * <p>Establish an entityResolver for newly resolved URIs.</p>
   *
   * <p>This is called from the URIResolver to set an EntityResolver
   * on the SAX parser to be used for new XML documents that are
   * encountered as a result of the document() function, xsl:import,
   * or xsl:include.  This is done because the XSLT processor calls
   * out to the SAXParserFactory itself to create a new SAXParser to
   * parse the new document.  The new parser does not automatically
   * inherit the EntityResolver of the original (although arguably
   * it should).  See below:</p>
   *
   * <tt>"If an application wants to set the ErrorHandler or
   * EntityResolver for an XMLReader used during a transformation,
   * it should use a URIResolver to return the SAXSource which
   * provides (with getXMLReader) a reference to the XMLReader"</tt>
   *
   * <p>...quoted from page 118 of the Java API for XML
   * Processing 1.1 specification</p>
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public Source resolve(String href, String base)

  /** JAXP URIResolver API */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /**
   * Implements the <code>resolveEntity</code> method
   * for the SAX interface.
   *
   * <p>Presented with an optional public identifier and a system
   * identifier, this function attempts to locate a mapping in the
   * catalogs.</p>
   *
   * <p>If such a mapping is found, the resolver attempts to open
   * the mapped value as an InputSource and return it. Exceptions are
   * ignored and null is returned if the mapped value cannot be opened
   * as an input source.</p>
   *
   * <p>If no mapping is found (or an error occurs attempting to open
   * the mapped value as an input source), null is returned and the system
   * will use the specified system identifier as if no entityResolver
   * was specified.</p>
   *
   * @param publicId  The public identifier for the entity in question.
   * This may be null.
   *
   * @param systemId  The system identifier for the entity in question.
   * XML requires a system identifier on all external entities, so this
   * value is always specified.
   *
   * @return An InputSource for the mapped identifier, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public String getResolvedEntity (String publicId, String systemId) {

  /**
   * Implements the guts of the <code>resolveEntity</code> method
   * for the SAX interface.
   *
   * <p>Presented with an optional public identifier and a system
   * identifier, this function attempts to locate a mapping in the
   * catalogs.</p>
   *
   * <p>If such a mapping is found, it is returned.  If no mapping is
   * found, null is returned.</p>
   *
   * @param publicId  The public identifier for the entity in question.
   * This may be null.
   *
   * @param systemId  The system identifier for the entity in question.
   * XML requires a system identifier on all external entities, so this
   * value is always specified.
   *
   * @return The resolved identifier (a URI reference).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public Catalog getCatalog() {

  /** Return the underlying catalog */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private void initializeCatalogs(boolean privateCatalog) {

  /** Initialize catalog */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public CatalogResolver(CatalogManager manager) {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public CatalogResolver(boolean privateCatalog) {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public CatalogResolver() {

  /** Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private CatalogManager catalogManager = CatalogManager.getStaticManager();

  /** The catalog manager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  private Catalog catalog = null;

  /** The underlying catalog */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
  public boolean validating = false;

  /** Make the parser validating? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/CatalogResolver.java
public class CatalogResolver implements EntityResolver, URIResolver {

/**
 * A SAX EntityResolver/JAXP URIResolver that uses catalogs.
 *
 * <p>This class implements both a SAX EntityResolver and a JAXP URIResolver.
 * </p>
 *
 * <p>This resolver understands OASIS TR9401 catalogs, XCatalogs, and the
 * current working draft of the OASIS Entity Resolution Technical
 * Committee specification.</p>
 *
 * @see Catalog
 * @see org.xml.sax.EntityResolver
 * @see javax.xml.transform.URIResolver
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
