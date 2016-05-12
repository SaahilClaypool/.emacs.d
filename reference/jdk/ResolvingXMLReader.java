_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
  public ResolvingXMLReader(CatalogManager manager) {

  /**
   * Construct a new reader from the JAXP factory.
   *
   * <p>In order to do its job, a ResolvingXMLReader must in fact be
   * a filter. So the only difference between this code and the filter
   * code is that the constructor builds a new reader.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
  public ResolvingXMLReader() {

  /**
   * Construct a new reader from the JAXP factory.
   *
   * <p>In order to do its job, a ResolvingXMLReader must in fact be
   * a filter. So the only difference between this code and the filter
   * code is that the constructor builds a new reader.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
  public static boolean validating = false;

  /** Make the parser validating? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
public class ResolvingXMLReader extends ResolvingXMLFilter {

/**
 * A SAX XMLReader that performs catalog-based entity resolution.
 *
 * <p>This class implements a SAX XMLReader that performs entity resolution
 * using the CatalogResolver. The actual, underlying parser is obtained
 * from a SAXParserFactory.</p>
 * </p>
 *
 * @see CatalogResolver
 * @see org.xml.sax.XMLReader
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
  public ResolvingXMLReader(CatalogManager manager) {

  /**
   * Construct a new reader from the JAXP factory.
   *
   * <p>In order to do its job, a ResolvingXMLReader must in fact be
   * a filter. So the only difference between this code and the filter
   * code is that the constructor builds a new reader.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
  public ResolvingXMLReader() {

  /**
   * Construct a new reader from the JAXP factory.
   *
   * <p>In order to do its job, a ResolvingXMLReader must in fact be
   * a filter. So the only difference between this code and the filter
   * code is that the constructor builds a new reader.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
  public static boolean validating = false;

  /** Make the parser validating? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/tools/ResolvingXMLReader.java
public class ResolvingXMLReader extends ResolvingXMLFilter {

/**
 * A SAX XMLReader that performs catalog-based entity resolution.
 *
 * <p>This class implements a SAX XMLReader that performs entity resolution
 * using the CatalogResolver. The actual, underlying parser is obtained
 * from a SAXParserFactory.</p>
 * </p>
 *
 * @see CatalogResolver
 * @see org.xml.sax.XMLReader
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
