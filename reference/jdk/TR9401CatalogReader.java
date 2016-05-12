_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TR9401CatalogReader.java
  public void readCatalog(Catalog catalog, InputStream is)

  /**
   * Start parsing an OASIS TR9401 Open Catalog file. The file is
   * actually read and parsed
   * as needed by <code>nextEntry</code>.
   *
   * <p>In a TR9401 Catalog the 'DELEGATE' entry delegates public
   * identifiers. There is no delegate entry for system identifiers
   * or URIs.</p>
   *
   * @param catalog The Catalog to populate
   * @param is The input stream from which to read the TR9401 Catalog
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TR9401CatalogReader.java
public class TR9401CatalogReader extends TextCatalogReader {

/**
 * Parses OASIS Open Catalog files.
 *
 * <p>This class reads OASIS Open Catalog files, returning a stream
 * of tokens.</p>
 *
 * <p>This code interrogates the following non-standard system properties:</p>
 *
 * <dl>
 * <dt><b>xml.catalog.debug</b></dt>
 * <dd><p>Sets the debug level. A value of 0 is assumed if the
 * property is not set or is not a number.</p></dd>
 * </dl>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TR9401CatalogReader.java
  public void readCatalog(Catalog catalog, InputStream is)

  /**
   * Start parsing an OASIS TR9401 Open Catalog file. The file is
   * actually read and parsed
   * as needed by <code>nextEntry</code>.
   *
   * <p>In a TR9401 Catalog the 'DELEGATE' entry delegates public
   * identifiers. There is no delegate entry for system identifiers
   * or URIs.</p>
   *
   * @param catalog The Catalog to populate
   * @param is The input stream from which to read the TR9401 Catalog
   *
   * @throws MalformedURLException Improper fileUrl
   * @throws IOException Error reading catalog file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/readers/TR9401CatalogReader.java
public class TR9401CatalogReader extends TextCatalogReader {

/**
 * Parses OASIS Open Catalog files.
 *
 * <p>This class reads OASIS Open Catalog files, returning a stream
 * of tokens.</p>
 *
 * <p>This code interrogates the following non-standard system properties:</p>
 *
 * <dl>
 * <dt><b>xml.catalog.debug</b></dt>
 * <dd><p>Sets the debug level. A value of 0 is assumed if the
 * property is not set or is not a number.</p></dd>
 * </dl>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
