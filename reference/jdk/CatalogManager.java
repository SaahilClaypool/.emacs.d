_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public String catalogClassName() {

  /**
   * Get the current Catalog class name.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setCatalogClassName(String className) {

  /**
   * Set the Catalog class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public String getCatalogClassName() {

  /**
   * Get the current Catalog class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public String queryCatalogClassName () {

  /**
   * Obtain the Catalog class name setting from the properties.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean allowOasisXMLCatalogPI() {

  /**
   * Get the current XML Catalog PI setting.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setAllowOasisXMLCatalogPI(boolean allowPI) {

  /**
   * Set the XML Catalog PI setting
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getAllowOasisXMLCatalogPI () {

  /**
   * Get the current XML Catalog PI setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean queryAllowOasisXMLCatalogPI () {

  /**
   * <p>Obtain the oasisXMLCatalogPI setting from the properties.</p>
   *
   * <p>In the properties, a value of 'yes', 'true', or '1' is considered
   * true, anything else is false.</p>
   *
   * @return The oasisXMLCatalogPI setting from the propertyFile or the
   * defaultOasisXMLCatalogPI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Catalog getCatalog() {

  /**
   * Get a catalog instance.
   *
   * If this manager uses static catalogs, the same static catalog will
   * always be returned. Otherwise a new catalog will be returned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Catalog getPrivateCatalog() {

  /**
   * Get a new catalog instance.
   *
   * This method always returns a new instance of the underlying catalog class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean staticCatalog() {

  /**
   * Get the current use static catalog setting.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setUseStaticCatalog(boolean useStatic) {

  /**
   * Set the use static catalog setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getUseStaticCatalog() {

  /**
   * Get the current use static catalog setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean queryUseStaticCatalog () {

  /**
   * Obtain the static-catalog setting from the properties.
   *
   * <p>In the properties, a value of 'yes', 'true', or '1' is considered
   * true, anything else is false.</p>
   *
   * @return The static-catalog setting from the propertyFile or the
   * defaultUseStaticCatalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean preferPublic () {

  /**
   * Return the current prefer public setting.
   *
   * @return True if public identifiers are preferred.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setPreferPublic (boolean preferPublic) {

  /**
   * Set the prefer public setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getPreferPublic () {

  /**
   * Return the current prefer public setting.
   *
   * @return True if public identifiers are preferred.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean queryPreferPublic () {

  /**
   * Obtain the preferPublic setting from the properties.
   *
   * <p>In the properties, a value of 'public' is true,
   * anything else is false.</p>
   *
   * @return True if prefer is public or the
   * defaultPreferSetting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Vector catalogFiles() {

  /**
   * Return the current list of catalog files.
   *
   * @return A vector of the catalog file names or null if no catalogs
   * are available in the properties.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setCatalogFiles(String fileList) {

  /**
   * Set the list of catalog files.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Vector getCatalogFiles() {

  /**
   * Return the current list of catalog files.
   *
   * @return A vector of the catalog file names or null if no catalogs
   * are available in the properties.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String queryCatalogFiles () {

  /**
   * Obtain the list of catalog files from the properties.
   *
   * @return A semicolon delimited list of catlog file URIs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean relativeCatalogs () {

  /**
   * Get the relativeCatalogs setting.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setRelativeCatalogs (boolean relative) {

  /**
   * Set the relativeCatalogs setting.
   *
   * @see #getRelativeCatalogs()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getRelativeCatalogs () {

  /**
   * Get the relativeCatalogs setting.
   *
   * <p>This property is used when the catalogFiles property is
   * interrogated. If true, then relative catalog entry file names
   * are returned. If false, relative catalog entry file names are
   * made absolute with respect to the properties file before returning
   * them.</p>
   *
   * <p>This property <emph>only applies</emph> when the catalog files
   * come from a properties file. If they come from a system property or
   * the default list, they are never considered relative. (What would
   * they be relative to?)</p>
   *
   * <p>In the properties, a value of 'yes', 'true', or '1' is considered
   * true, anything else is false.</p>
   *
   * @return The relativeCatalogs setting from the propertyFile or the
   * defaultRelativeCatalogs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean queryRelativeCatalogs () {

  /**
   * Obtain the relativeCatalogs setting from the properties.
   *
   * @return The relativeCatalogs setting from the propertyFile or the
   * defaultRelativeCatalogs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public int verbosity () {

  /**
   * What is the current verbosity?
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setVerbosity (int verbosity) {

  /**
   * Set the current verbosity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public int getVerbosity() {

  /**
   * What is the current verbosity?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private int queryVerbosity () {

  /**
   * Obtain the verbosity setting from the properties.
   *
   * @return The verbosity level from the propertyFile or the
   * defaultVerbosity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void ignoreMissingProperties(boolean ignore) {

  /**
   * How are missing properties handled?
   *
   * <p>If ignore is true, missing or unreadable property files will
   * not be reported. Otherwise, a message will be sent to System.err.
   * </p>
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setIgnoreMissingProperties(boolean ignore) {

  /**
   * How should missing properties be handled?
   *
   * <p>If ignore is true, missing or unreadable property files will
   * not be reported. Otherwise, a message will be sent to System.err.
   * </p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getIgnoreMissingProperties() {

  /**
   * How are missing properties handled?
   *
   * <p>If true, missing or unreadable property files will
   * not be reported. Otherwise, a message will be sent to System.err.
   * </p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public static CatalogManager getStaticManager() {

  /**
   * Allow access to the static CatalogManager
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private synchronized void readProperties() {

  /**
   * Load the properties from the propertyFile and build the
   * resources from it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public BootstrapResolver getBootstrapResolver() {

  /** Get the bootstrap resolver.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setBootstrapResolver(BootstrapResolver resolver) {

  /** Set the bootstrap resolver.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public CatalogManager(String propertyFile) {

  /** Constructor that specifies an explicit property file. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public CatalogManager() {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Debug debug = null;

  /** The manager's debug object. Used for printing debugging messages.
   *
   * <p>This field is public so that objects that have access to this
   * CatalogManager can use this debug object.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String catalogClassName = null;

  /** Current catalog class name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean relativeCatalogs = null;

  /** Current setting of the relativeCatalogs flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultRelativeCatalogs = true;

  /** Default setting of the relativeCatalogs flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean oasisXMLCatalogPI = null;

  /** Current setting of the oasisXMLCatalogPI flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultOasisXMLCatalogPI = true;

  /** Default setting of the oasisXMLCatalogPI flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private static Catalog staticCatalog = null;

  /** The static catalog used by this manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean useStaticCatalog = null;

  /** Current setting of the static catalog flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultUseStaticCatalog = true;

  /** Default setting of the static catalog flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean preferPublic = null;

  /** Current preference setting. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultPreferPublic = true;

  /** Default preference setting. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Integer verbosity = null;

  /** Current verbosity level. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private int defaultVerbosity = 1;

  /** Default verbosity level if there is no property setting for it. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean fromPropertiesFile = false;

  /** Did the catalogFiles come from the properties file? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String catalogFiles = null;

  /** Current catalog files list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String defaultCatalogFiles = "./xcatalog";

  /** Default catalog files list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private URL propertyFileURI = null;

  /** The location of the propertyFile */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String propertyFile = "CatalogManager.properties";

  /** The name of the CatalogManager properties file. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private ResourceBundle resources;

  /** Holds the resources after they are loaded from the file. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean ignoreMissingProperties

  /** Flag to ignore missing property files and/or properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private BootstrapResolver bResolver = new BootstrapResolver();

  /** The bootstrap resolver to use when loading XML Catalogs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private static CatalogManager staticManager = new CatalogManager();

  /** A static CatalogManager instance for sharing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
public class CatalogManager {

/**
 * CatalogManager provides an interface to the catalog properties.
 *
 * <p>Properties can come from two places: from system properties or
 * from a <i>CatalogManager.properties</i> file. This class provides a transparent
 * interface to both, with system properties preferred over property file values.</p>
 *
 * <p>The following table summarizes the properties:</p>
 *
 * <table border="1">
 * <thead>
 * <tr>
 * <td>System Property</td>
 * <td>CatalogManager.properties<br/>Property</td>
 * <td>Description</td>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td>xml.catalog.ignoreMissing</td>
 * <td>&#160;</td>
 * <td>If true, a missing <i>CatalogManager.properties</i> file or missing properties
 * within that file will not generate warning messages. See also the
 * <i>ignoreMissingProperties</i> method.</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.files</td>
 * <td>catalogs</td>
 * <td>The <emph>semicolon-delimited</emph> list of catalog files.</td>
 * </tr>
 *
 * <tr>
 * <td>&#160;</td>
 * <td>relative-catalogs</td>
 * <td>If false, relative catalog URIs are made absolute with respect to the base URI of
 * the <i>CatalogManager.properties</i> file. This setting only applies to catalog
 * URIs obtained from the <i>catalogs</i> property <emph>in the</emph>
 * <i>CatalogManager.properties</i> file</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.verbosity</td>
 * <td>verbosity</td>
 * <td>If non-zero, the Catalog classes will print informative and debugging messages.
 * The higher the number, the more messages.</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.prefer</td>
 * <td>prefer</td>
 * <td>Which identifier is preferred, "public" or "system"?</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.staticCatalog</td>
 * <td>static-catalog</td>
 * <td>Should a single catalog be constructed for all parsing, or should a different
 * catalog be created for each parser?</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.allowPI</td>
 * <td>allow-oasis-xml-catalog-pi</td>
 * <td>If the source document contains "oasis-xml-catalog" processing instructions,
 * should they be used?</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.className</td>
 * <td>catalog-class-name</td>
 * <td>If you're using the convenience classes
 * <tt>com.sun.org.apache.xml.internal.resolver.tools.*</tt>), this setting
 * allows you to specify an alternate class name to use for the underlying
 * catalog.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public String catalogClassName() {

  /**
   * Get the current Catalog class name.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setCatalogClassName(String className) {

  /**
   * Set the Catalog class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public String getCatalogClassName() {

  /**
   * Get the current Catalog class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public String queryCatalogClassName () {

  /**
   * Obtain the Catalog class name setting from the properties.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean allowOasisXMLCatalogPI() {

  /**
   * Get the current XML Catalog PI setting.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setAllowOasisXMLCatalogPI(boolean allowPI) {

  /**
   * Set the XML Catalog PI setting
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getAllowOasisXMLCatalogPI () {

  /**
   * Get the current XML Catalog PI setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean queryAllowOasisXMLCatalogPI () {

  /**
   * <p>Obtain the oasisXMLCatalogPI setting from the properties.</p>
   *
   * <p>In the properties, a value of 'yes', 'true', or '1' is considered
   * true, anything else is false.</p>
   *
   * @return The oasisXMLCatalogPI setting from the propertyFile or the
   * defaultOasisXMLCatalogPI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Catalog getCatalog() {

  /**
   * Get a catalog instance.
   *
   * If this manager uses static catalogs, the same static catalog will
   * always be returned. Otherwise a new catalog will be returned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Catalog getPrivateCatalog() {

  /**
   * Get a new catalog instance.
   *
   * This method always returns a new instance of the underlying catalog class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean staticCatalog() {

  /**
   * Get the current use static catalog setting.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setUseStaticCatalog(boolean useStatic) {

  /**
   * Set the use static catalog setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getUseStaticCatalog() {

  /**
   * Get the current use static catalog setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean queryUseStaticCatalog () {

  /**
   * Obtain the static-catalog setting from the properties.
   *
   * <p>In the properties, a value of 'yes', 'true', or '1' is considered
   * true, anything else is false.</p>
   *
   * @return The static-catalog setting from the propertyFile or the
   * defaultUseStaticCatalog.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean preferPublic () {

  /**
   * Return the current prefer public setting.
   *
   * @return True if public identifiers are preferred.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setPreferPublic (boolean preferPublic) {

  /**
   * Set the prefer public setting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getPreferPublic () {

  /**
   * Return the current prefer public setting.
   *
   * @return True if public identifiers are preferred.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean queryPreferPublic () {

  /**
   * Obtain the preferPublic setting from the properties.
   *
   * <p>In the properties, a value of 'public' is true,
   * anything else is false.</p>
   *
   * @return True if prefer is public or the
   * defaultPreferSetting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Vector catalogFiles() {

  /**
   * Return the current list of catalog files.
   *
   * @return A vector of the catalog file names or null if no catalogs
   * are available in the properties.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setCatalogFiles(String fileList) {

  /**
   * Set the list of catalog files.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Vector getCatalogFiles() {

  /**
   * Return the current list of catalog files.
   *
   * @return A vector of the catalog file names or null if no catalogs
   * are available in the properties.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String queryCatalogFiles () {

  /**
   * Obtain the list of catalog files from the properties.
   *
   * @return A semicolon delimited list of catlog file URIs
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean relativeCatalogs () {

  /**
   * Get the relativeCatalogs setting.
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setRelativeCatalogs (boolean relative) {

  /**
   * Set the relativeCatalogs setting.
   *
   * @see #getRelativeCatalogs()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getRelativeCatalogs () {

  /**
   * Get the relativeCatalogs setting.
   *
   * <p>This property is used when the catalogFiles property is
   * interrogated. If true, then relative catalog entry file names
   * are returned. If false, relative catalog entry file names are
   * made absolute with respect to the properties file before returning
   * them.</p>
   *
   * <p>This property <emph>only applies</emph> when the catalog files
   * come from a properties file. If they come from a system property or
   * the default list, they are never considered relative. (What would
   * they be relative to?)</p>
   *
   * <p>In the properties, a value of 'yes', 'true', or '1' is considered
   * true, anything else is false.</p>
   *
   * @return The relativeCatalogs setting from the propertyFile or the
   * defaultRelativeCatalogs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean queryRelativeCatalogs () {

  /**
   * Obtain the relativeCatalogs setting from the properties.
   *
   * @return The relativeCatalogs setting from the propertyFile or the
   * defaultRelativeCatalogs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public int verbosity () {

  /**
   * What is the current verbosity?
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setVerbosity (int verbosity) {

  /**
   * Set the current verbosity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public int getVerbosity() {

  /**
   * What is the current verbosity?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private int queryVerbosity () {

  /**
   * Obtain the verbosity setting from the properties.
   *
   * @return The verbosity level from the propertyFile or the
   * defaultVerbosity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void ignoreMissingProperties(boolean ignore) {

  /**
   * How are missing properties handled?
   *
   * <p>If ignore is true, missing or unreadable property files will
   * not be reported. Otherwise, a message will be sent to System.err.
   * </p>
   *
   * @deprecated No longer static; use get/set methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setIgnoreMissingProperties(boolean ignore) {

  /**
   * How should missing properties be handled?
   *
   * <p>If ignore is true, missing or unreadable property files will
   * not be reported. Otherwise, a message will be sent to System.err.
   * </p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public boolean getIgnoreMissingProperties() {

  /**
   * How are missing properties handled?
   *
   * <p>If true, missing or unreadable property files will
   * not be reported. Otherwise, a message will be sent to System.err.
   * </p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public static CatalogManager getStaticManager() {

  /**
   * Allow access to the static CatalogManager
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private synchronized void readProperties() {

  /**
   * Load the properties from the propertyFile and build the
   * resources from it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public BootstrapResolver getBootstrapResolver() {

  /** Get the bootstrap resolver.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public void setBootstrapResolver(BootstrapResolver resolver) {

  /** Set the bootstrap resolver.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public CatalogManager(String propertyFile) {

  /** Constructor that specifies an explicit property file. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public CatalogManager() {

  /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  public Debug debug = null;

  /** The manager's debug object. Used for printing debugging messages.
   *
   * <p>This field is public so that objects that have access to this
   * CatalogManager can use this debug object.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String catalogClassName = null;

  /** Current catalog class name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean relativeCatalogs = null;

  /** Current setting of the relativeCatalogs flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultRelativeCatalogs = true;

  /** Default setting of the relativeCatalogs flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean oasisXMLCatalogPI = null;

  /** Current setting of the oasisXMLCatalogPI flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultOasisXMLCatalogPI = true;

  /** Default setting of the oasisXMLCatalogPI flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private static Catalog staticCatalog = null;

  /** The static catalog used by this manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean useStaticCatalog = null;

  /** Current setting of the static catalog flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultUseStaticCatalog = true;

  /** Default setting of the static catalog flag. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Boolean preferPublic = null;

  /** Current preference setting. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean defaultPreferPublic = true;

  /** Default preference setting. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private Integer verbosity = null;

  /** Current verbosity level. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private int defaultVerbosity = 1;

  /** Default verbosity level if there is no property setting for it. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean fromPropertiesFile = false;

  /** Did the catalogFiles come from the properties file? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String catalogFiles = null;

  /** Current catalog files list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String defaultCatalogFiles = "./xcatalog";

  /** Default catalog files list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private URL propertyFileURI = null;

  /** The location of the propertyFile */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private String propertyFile = "CatalogManager.properties";

  /** The name of the CatalogManager properties file. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private ResourceBundle resources;

  /** Holds the resources after they are loaded from the file. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private boolean ignoreMissingProperties

  /** Flag to ignore missing property files and/or properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private BootstrapResolver bResolver = new BootstrapResolver();

  /** The bootstrap resolver to use when loading XML Catalogs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
  private static CatalogManager staticManager = new CatalogManager();

  /** A static CatalogManager instance for sharing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogManager.java
public class CatalogManager {

/**
 * CatalogManager provides an interface to the catalog properties.
 *
 * <p>Properties can come from two places: from system properties or
 * from a <i>CatalogManager.properties</i> file. This class provides a transparent
 * interface to both, with system properties preferred over property file values.</p>
 *
 * <p>The following table summarizes the properties:</p>
 *
 * <table border="1">
 * <thead>
 * <tr>
 * <td>System Property</td>
 * <td>CatalogManager.properties<br/>Property</td>
 * <td>Description</td>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td>xml.catalog.ignoreMissing</td>
 * <td>&#160;</td>
 * <td>If true, a missing <i>CatalogManager.properties</i> file or missing properties
 * within that file will not generate warning messages. See also the
 * <i>ignoreMissingProperties</i> method.</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.files</td>
 * <td>catalogs</td>
 * <td>The <emph>semicolon-delimited</emph> list of catalog files.</td>
 * </tr>
 *
 * <tr>
 * <td>&#160;</td>
 * <td>relative-catalogs</td>
 * <td>If false, relative catalog URIs are made absolute with respect to the base URI of
 * the <i>CatalogManager.properties</i> file. This setting only applies to catalog
 * URIs obtained from the <i>catalogs</i> property <emph>in the</emph>
 * <i>CatalogManager.properties</i> file</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.verbosity</td>
 * <td>verbosity</td>
 * <td>If non-zero, the Catalog classes will print informative and debugging messages.
 * The higher the number, the more messages.</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.prefer</td>
 * <td>prefer</td>
 * <td>Which identifier is preferred, "public" or "system"?</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.staticCatalog</td>
 * <td>static-catalog</td>
 * <td>Should a single catalog be constructed for all parsing, or should a different
 * catalog be created for each parser?</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.allowPI</td>
 * <td>allow-oasis-xml-catalog-pi</td>
 * <td>If the source document contains "oasis-xml-catalog" processing instructions,
 * should they be used?</td>
 * </tr>
 *
 * <tr>
 * <td>xml.catalog.className</td>
 * <td>catalog-class-name</td>
 * <td>If you're using the convenience classes
 * <tt>com.sun.org.apache.xml.internal.resolver.tools.*</tt>), this setting
 * allows you to specify an alternate class name to use for the underlying
 * catalog.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
