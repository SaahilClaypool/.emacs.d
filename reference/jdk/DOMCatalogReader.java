_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public void readCatalog(Catalog catalog, String fileUrl)

  /**
   * Read the catalog behind the specified URL.
   *
   * @see #readCatalog(Catalog, InputStream)
   *
   * @param catalog The catalog for which we are reading.
   * @param fileUrl The URL of the document that should be read.
   *
   * @throws MalformedURLException if the specified URL cannot be
   * turned into a URL object.
   * @throws IOException if the URL cannot be read.
   * @throws UnknownCatalogFormatException if the catalog format is
   * not recognized.
   * @throws UnparseableCatalogException if the catalog cannot be parsed.
   * (For example, if it is supposed to be XML and isn't well-formed.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public void readCatalog(Catalog catalog, InputStream is)

  /**
   * Read a catalog from an input stream.
   *
   * <p>This class reads a catalog from an input stream:</p>
   *
   * <ul>
   * <li>Based on the QName of the root element, it determines which
   * parser to instantiate for this catalog.</li>
   * <li>It constructs a DOM Document from the catalog and</li>
   * <li>For each child of the root node, it calls the parser's
   * parseCatalogEntry method. This method is expected to make
   * appropriate calls back into the catalog to add entries for the
   * entries in the catalog. It is free to do this in whatever manner
   * is appropriate (perhaps using just the node passed in, perhaps
   * wandering arbitrarily throughout the tree).</li>
   * </ul>
   *
   * @param catalog The catalog for which this reader is called.
   * @param is The input stream that is to be read.
   * @throws IOException if the URL cannot be read.
   * @throws UnknownCatalogFormatException if the catalog format is
   * not recognized.
   * @throws UnparseableCatalogException if the catalog cannot be parsed.
   * (For example, if it is supposed to be XML and isn't well-formed or
   * if the parser class cannot be instantiated.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public DOMCatalogReader() { }

  /**
   * Null constructor; something for subclasses to call.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public String getCatalogParser(String namespaceURI,
                                 String rootElement) {

  /**
   * Get the name of the parser class for a given catalog type.
   *
   * <p>This method returns the parserClass associated with the
   * namespaceURI/rootElement names specified.</p>
   *
   * @param namespaceURI The namespace URI. <em>Not</em> the prefix.
   * @param rootElement The name of the root element.
   * @return The parser class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public void setCatalogParser(String namespaceURI,
                               String rootElement,
                               String parserClass) {

  /**
   * Add a new parser to the reader.
   *
   * <p>This method associates the specified parserClass with the
   * namespaceURI/rootElement names specified.</p>
   *
   * @param namespaceURI The namespace URI. <em>Not</em> the prefix.
   * @param rootElement The name of the root element.
   * @param parserClass The name of the parserClass to instantiate
   * for this kind of catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
public class DOMCatalogReader implements CatalogReader {

/**
 * A DOM-based CatalogReader.
 *
 * <p>This class is used to read XML Catalogs using the DOM. This reader
 * has an advantage over the SAX-based reader that it can analyze the
 * DOM tree rather than simply a series of SAX events. It has the disadvantage
 * that it requires all of the code necessary to build and walk a DOM
 * tree.</p>
 *
 * <p>Since the choice of CatalogReaders (in the InputStream case) can only
 * be made on the basis of MIME type, the following problem occurs: only
 * one CatalogReader can exist for all XML mime types. In order to get
 * around this problem, the DOMCatalogReader relies on a set of external
 * CatalogParsers to actually build the catalog.</p>
 *
 * <p>The selection of CatalogParsers is made on the basis of the QName
 * of the root element of the document.</p>
 *
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public void readCatalog(Catalog catalog, String fileUrl)

  /**
   * Read the catalog behind the specified URL.
   *
   * @see #readCatalog(Catalog, InputStream)
   *
   * @param catalog The catalog for which we are reading.
   * @param fileUrl The URL of the document that should be read.
   *
   * @throws MalformedURLException if the specified URL cannot be
   * turned into a URL object.
   * @throws IOException if the URL cannot be read.
   * @throws UnknownCatalogFormatException if the catalog format is
   * not recognized.
   * @throws UnparseableCatalogException if the catalog cannot be parsed.
   * (For example, if it is supposed to be XML and isn't well-formed.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public void readCatalog(Catalog catalog, InputStream is)

  /**
   * Read a catalog from an input stream.
   *
   * <p>This class reads a catalog from an input stream:</p>
   *
   * <ul>
   * <li>Based on the QName of the root element, it determines which
   * parser to instantiate for this catalog.</li>
   * <li>It constructs a DOM Document from the catalog and</li>
   * <li>For each child of the root node, it calls the parser's
   * parseCatalogEntry method. This method is expected to make
   * appropriate calls back into the catalog to add entries for the
   * entries in the catalog. It is free to do this in whatever manner
   * is appropriate (perhaps using just the node passed in, perhaps
   * wandering arbitrarily throughout the tree).</li>
   * </ul>
   *
   * @param catalog The catalog for which this reader is called.
   * @param is The input stream that is to be read.
   * @throws IOException if the URL cannot be read.
   * @throws UnknownCatalogFormatException if the catalog format is
   * not recognized.
   * @throws UnparseableCatalogException if the catalog cannot be parsed.
   * (For example, if it is supposed to be XML and isn't well-formed or
   * if the parser class cannot be instantiated.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public DOMCatalogReader() { }

  /**
   * Null constructor; something for subclasses to call.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public String getCatalogParser(String namespaceURI,
                                 String rootElement) {

  /**
   * Get the name of the parser class for a given catalog type.
   *
   * <p>This method returns the parserClass associated with the
   * namespaceURI/rootElement names specified.</p>
   *
   * @param namespaceURI The namespace URI. <em>Not</em> the prefix.
   * @param rootElement The name of the root element.
   * @return The parser class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
  public void setCatalogParser(String namespaceURI,
                               String rootElement,
                               String parserClass) {

  /**
   * Add a new parser to the reader.
   *
   * <p>This method associates the specified parserClass with the
   * namespaceURI/rootElement names specified.</p>
   *
   * @param namespaceURI The namespace URI. <em>Not</em> the prefix.
   * @param rootElement The name of the root element.
   * @param parserClass The name of the parserClass to instantiate
   * for this kind of catalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/DOMCatalogReader.java
public class DOMCatalogReader implements CatalogReader {

/**
 * A DOM-based CatalogReader.
 *
 * <p>This class is used to read XML Catalogs using the DOM. This reader
 * has an advantage over the SAX-based reader that it can analyze the
 * DOM tree rather than simply a series of SAX events. It has the disadvantage
 * that it requires all of the code necessary to build and walk a DOM
 * tree.</p>
 *
 * <p>Since the choice of CatalogReaders (in the InputStream case) can only
 * be made on the basis of MIME type, the following problem occurs: only
 * one CatalogReader can exist for all XML mime types. In order to get
 * around this problem, the DOMCatalogReader relies on a set of external
 * CatalogParsers to actually build the catalog.</p>
 *
 * <p>The selection of CatalogParsers is made on the basis of the QName
 * of the root element of the document.</p>
 *
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
