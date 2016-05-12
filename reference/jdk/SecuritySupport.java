_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static ClassLoader findClassLoader()

    /**
     * Figure out which ClassLoader to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(final String bundle, final Locale locale) {

    /**
     * Gets a resource bundle using the specified base name and locale, and the
     * caller's class loader.
     *
     * @param bundle the base name of the resource bundle, a fully qualified
     * class name
     * @param locale the locale for which a resource bundle is desired
     * @return a resource bundle for the given base name and locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(String bundle) {

    /**
     * Gets a resource bundle using the specified base name, the default locale,
     * and the caller's class loader.
     *
     * @param bundle the base name of the resource bundle, a fully qualified
     * class name
     * @return a resource bundle for the given base name and the default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static InputStream getResourceAsStream(final String name) {

    /**
     * Return resource using the same classloader for the ObjectFactory by
     * default or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
public final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync. It is
 * package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    static volatile boolean firstTime = true;

    /**
     * Flag indicating if the program has tried reading java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    static final Properties cacheProps = new Properties();

    /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    static String readJAXPProperty(String propertyId) {

    /**
     * Read from $java.home/lib/jaxp.properties for the specified property
     * The program
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static String getJAXPSystemProperty(String sysPropertyId) {

    /**
     * Read JAXP system property in this order: system property,
     * $java.home/lib/jaxp.properties if the system property is not specified
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    private static boolean isProtocolAllowed(String protocol, String allowedProtocols) {

    /**
     * Check if the protocol is in the allowed list of protocols. The check
     * is case-insensitive while ignoring whitespaces.
     *
     * @param protocol a protocol
     * @param allowedProtocols a list of allowed protocols
     * @return true if the protocol is in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static String checkAccess(String systemId, String allowedProtocols, String accessAny) throws IOException {

    /**
     * Check the protocol used in the systemId against allowed protocols
     *
     * @param systemId the Id of the URI
     * @param allowedProtocols a list of allowed protocols separated by comma
     * @param accessAny keyword to indicate allowing any protocol
     * @return the name of the protocol if rejected, null otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static String sanitizePath(String uri) {

    /**
     * Strip off path from an URI
     *
     * @param uri an URI with full path
     * @return the file name only
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(final String bundle, final Locale locale) {

    /**
     * Gets a resource bundle using the specified base name and locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @param locale the locale for which a resource bundle is desired
     * @return a resource bundle for the given base name and locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(String bundle) {

    /**
     * Gets a resource bundle using the specified base name, the default locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @return a resource bundle for the given base name and the default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static InputStream getResourceAsStream(final String name) {

    /**
     * Return resource using the same classloader for the ObjectFactory by
     * default or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
public final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync. It is
 * package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    static volatile boolean firstTime = true;

    /**
     * Flag indicating if the program has tried reading java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    static final Properties cacheProps = new Properties();

   /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    static String readJAXPProperty(String propertyId) {

     /**
     * Read from $java.home/lib/jaxp.properties for the specified property
     * The program
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static String getJAXPSystemProperty(String sysPropertyId) {

    /**
     * Read JAXP system property in this order: system property,
     * $java.home/lib/jaxp.properties if the system property is not specified
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    private static boolean isProtocolAllowed(String protocol, String allowedProtocols) {

    /**
     * Check if the protocol is in the allowed list of protocols. The check
     * is case-insensitive while ignoring whitespaces.
     *
     * @param protocol a protocol
     * @param allowedProtocols a list of allowed protocols
     * @return true if the protocol is in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static String checkAccess(String systemId, String allowedProtocols, String accessAny) throws IOException {

    /**
     * Check the protocol used in the systemId against allowed protocols
     *
     * @param systemId the Id of the URI
     * @param allowedProtocols a list of allowed protocols separated by comma
     * @param accessAny keyword to indicate allowing any protocol
     * @return the name of the protocol if rejected, null otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static String sanitizePath(String uri) {

    /**
     * Strip off path from an URI
     *
     * @param uri an URI with full path
     * @return the file name only
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static ResourceBundle getResourceBundle(final String bundle, final Locale locale) {

    /**
     * Gets a resource bundle using the specified base name and locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @param locale the locale for which a resource bundle is desired
     * @return a resource bundle for the given base name and locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static ResourceBundle getResourceBundle(String bundle) {

    /**
     * Gets a resource bundle using the specified base name, the default locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @return a resource bundle for the given base name and the default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static InputStream getResourceAsStream(final String name) {

    /**
     * Return resource using the same classloader for the ObjectFactory by default
     * or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
public final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/SecuritySupport.java
    static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/SecuritySupport.java
final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SecuritySupport.java
    static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SecuritySupport.java
final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static ClassLoader findClassLoader()

    /**
     * Figure out which ClassLoader to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(final String bundle, final Locale locale) {

    /**
     * Gets a resource bundle using the specified base name and locale, and the
     * caller's class loader.
     *
     * @param bundle the base name of the resource bundle, a fully qualified
     * class name
     * @param locale the locale for which a resource bundle is desired
     * @return a resource bundle for the given base name and locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(String bundle) {

    /**
     * Gets a resource bundle using the specified base name, the default locale,
     * and the caller's class loader.
     *
     * @param bundle the base name of the resource bundle, a fully qualified
     * class name
     * @return a resource bundle for the given base name and the default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static InputStream getResourceAsStream(final String name) {

    /**
     * Return resource using the same classloader for the ObjectFactory by
     * default or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
    public static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SecuritySupport.java
public final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync. It is
 * package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    static volatile boolean firstTime = true;

    /**
     * Flag indicating if the program has tried reading java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    static final Properties cacheProps = new Properties();

    /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    static String readJAXPProperty(String propertyId) {

    /**
     * Read from $java.home/lib/jaxp.properties for the specified property
     * The program
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static String getJAXPSystemProperty(String sysPropertyId) {

    /**
     * Read JAXP system property in this order: system property,
     * $java.home/lib/jaxp.properties if the system property is not specified
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    private static boolean isProtocolAllowed(String protocol, String allowedProtocols) {

    /**
     * Check if the protocol is in the allowed list of protocols. The check
     * is case-insensitive while ignoring whitespaces.
     *
     * @param protocol a protocol
     * @param allowedProtocols a list of allowed protocols
     * @return true if the protocol is in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static String checkAccess(String systemId, String allowedProtocols, String accessAny) throws IOException {

    /**
     * Check the protocol used in the systemId against allowed protocols
     *
     * @param systemId the Id of the URI
     * @param allowedProtocols a list of allowed protocols separated by comma
     * @param accessAny keyword to indicate allowing any protocol
     * @return the name of the protocol if rejected, null otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static String sanitizePath(String uri) {

    /**
     * Strip off path from an URI
     *
     * @param uri an URI with full path
     * @return the file name only
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(final String bundle, final Locale locale) {

    /**
     * Gets a resource bundle using the specified base name and locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @param locale the locale for which a resource bundle is desired
     * @return a resource bundle for the given base name and locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static ListResourceBundle getResourceBundle(String bundle) {

    /**
     * Gets a resource bundle using the specified base name, the default locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @return a resource bundle for the given base name and the default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static InputStream getResourceAsStream(final String name) {

    /**
     * Return resource using the same classloader for the ObjectFactory by
     * default or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
    public static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/SecuritySupport.java
public final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync. It is
 * package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    static volatile boolean firstTime = true;

    /**
     * Flag indicating if the program has tried reading java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    static final Properties cacheProps = new Properties();

   /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    static String readJAXPProperty(String propertyId) {

     /**
     * Read from $java.home/lib/jaxp.properties for the specified property
     * The program
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static String getJAXPSystemProperty(String sysPropertyId) {

    /**
     * Read JAXP system property in this order: system property,
     * $java.home/lib/jaxp.properties if the system property is not specified
     *
     * @param propertyId the Id of the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    private static boolean isProtocolAllowed(String protocol, String allowedProtocols) {

    /**
     * Check if the protocol is in the allowed list of protocols. The check
     * is case-insensitive while ignoring whitespaces.
     *
     * @param protocol a protocol
     * @param allowedProtocols a list of allowed protocols
     * @return true if the protocol is in the list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static String checkAccess(String systemId, String allowedProtocols, String accessAny) throws IOException {

    /**
     * Check the protocol used in the systemId against allowed protocols
     *
     * @param systemId the Id of the URI
     * @param allowedProtocols a list of allowed protocols separated by comma
     * @param accessAny keyword to indicate allowing any protocol
     * @return the name of the protocol if rejected, null otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static String sanitizePath(String uri) {

    /**
     * Strip off path from an URI
     *
     * @param uri an URI with full path
     * @return the file name only
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static ResourceBundle getResourceBundle(final String bundle, final Locale locale) {

    /**
     * Gets a resource bundle using the specified base name and locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @param locale the locale for which a resource bundle is desired
     * @return a resource bundle for the given base name and locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static ResourceBundle getResourceBundle(String bundle) {

    /**
     * Gets a resource bundle using the specified base name, the default locale, and the caller's class loader.
     * @param bundle the base name of the resource bundle, a fully qualified class name
     * @return a resource bundle for the given base name and the default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static InputStream getResourceAsStream(final String name) {

    /**
     * Return resource using the same classloader for the ObjectFactory by default
     * or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
    public static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/SecuritySupport.java
public final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/SecuritySupport.java
    static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/SecuritySupport.java
final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SecuritySupport.java
    static SecuritySupport getInstance() {

    /**
     * Return an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/SecuritySupport.java
final class SecuritySupport {

/**
 * This class is duplicated for each subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of any API.
 *
 * @xerces.internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/SecuritySupport.java
class SecuritySupport  {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 *
 * Security related methods that only work on J2SE 1.2 and newer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/SecuritySupport.java
class SecuritySupport  {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 *
 * Security related methods that only work on J2SE 1.2 and newer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/SecuritySupport.java
class SecuritySupport  {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 *
 * Security related methods that only work on J2SE 1.2 and newer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/SecuritySupport.java
class SecuritySupport  {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 *
 * Security related methods that only work on J2SE 1.2 and newer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SecuritySupport.java
class SecuritySupport  {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 *
 * Security related methods that only work on J2SE 1.2 and newer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/SecuritySupport.java
class SecuritySupport  {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 *
 * Security related methods that only work on J2SE 1.2 and newer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/SecuritySupport.java
class SecuritySupport  {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 *
 * Security related methods that only work on J2SE 1.2 and newer.
 */
