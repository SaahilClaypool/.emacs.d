_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private String makeAbsolute(String uri) {

  /** Attempt to construct an absolute URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public Source resolve(String href, String base)

  /** Transformer resolve API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /** SAX resolveEntity API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public BootstrapResolver() {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private final Map<String, String> uriMap = new HashMap<>();

  /** Private hash used for URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private final Map<String, String> systemMap = new HashMap<>();

  /** Private hash used for system identifiers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private final Map<String, String> publicMap = new HashMap<>();

  /** Private hash used for public identifiers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public static final String xmlCatalogSysId = "http://www.oasis-open.org/committees/entity/release/1.0/catalog.dtd";

  /** System identifier for OASIS XML Catalog files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public static final String xmlCatalogPubId = "-//OASIS//DTD XML Catalogs V1.0//EN";

  /** Public identifier for OASIS XML Catalog files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public static final String xmlCatalogRNG = "http://www.oasis-open.org/committees/entity/release/1.0/catalog.rng";

  /** URI of the RELAX NG Grammar for OASIS XML Catalog files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
public class BootstrapResolver implements EntityResolver, URIResolver {

/**
 * A simple bootstrapping resolver.
 *
 * <p>This class is used as the entity resolver when reading XML Catalogs.
 * It searches for the OASIS XML Catalog DTD, Relax NG Grammar and W3C XML Schema
 * as resources (e.g., in the resolver jar file).</p>
 *
 * <p>If you have your own DTDs or schemas, you can extend this class and
 * set the BootstrapResolver in your CatalogManager.</p>
 *
 * @see com.sun.org.apache.xml.internal.resolver.CatalogManager
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private String makeAbsolute(String uri) {

  /** Attempt to construct an absolute URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public Source resolve(String href, String base)

  /** Transformer resolve API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public InputSource resolveEntity (String publicId, String systemId) {

  /** SAX resolveEntity API. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public BootstrapResolver() {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private final Map<String, String> uriMap = new HashMap<>();

  /** Private hash used for URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private final Map<String, String> systemMap = new HashMap<>();

  /** Private hash used for system identifiers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  private final Map<String, String> publicMap = new HashMap<>();

  /** Private hash used for public identifiers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public static final String xmlCatalogSysId = "http://www.oasis-open.org/committees/entity/release/1.0/catalog.dtd";

  /** System identifier for OASIS XML Catalog files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public static final String xmlCatalogPubId = "-//OASIS//DTD XML Catalogs V1.0//EN";

  /** Public identifier for OASIS XML Catalog files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
  public static final String xmlCatalogRNG = "http://www.oasis-open.org/committees/entity/release/1.0/catalog.rng";

  /** URI of the RELAX NG Grammar for OASIS XML Catalog files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/BootstrapResolver.java
public class BootstrapResolver implements EntityResolver, URIResolver {

/**
 * A simple bootstrapping resolver.
 *
 * <p>This class is used as the entity resolver when reading XML Catalogs.
 * It searches for the OASIS XML Catalog DTD, Relax NG Grammar and W3C XML Schema
 * as resources (e.g., in the resolver jar file).</p>
 *
 * <p>If you have your own DTDs or schemas, you can extend this class and
 * set the BootstrapResolver in your CatalogManager.</p>
 *
 * @see com.sun.org.apache.xml.internal.resolver.CatalogManager
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
