_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private static String which(String classname, ClassLoader loader) {

    /**
     * <p>Search the specified classloader for the given classname.</p>
     *
     * @param classname the fully qualified name of the class to search for
     * @param loader the classloader to search
     *
     * @return the source location of the resource, or null if it wasn't found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private SchemaFactory findServiceProvider(final String schemaLanguage) {

    /**
     * Finds a service provider subclass of SchemaFactory that supports the
     * given schema language using the ServiceLoader.
     *
     * @param schemaLanguage The schema language for which we seek a factory.
     * @return A SchemaFactory supporting the specified schema language, or null
     *         if none is found.
     * @throws SchemaFactoryConfigurationError if a configuration error is found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private static SchemaFactory newInstanceNoServiceLoader(
         Class<?> providerClass
    ) {

    /**
     * Try to construct using newXMLSchemaFactoryNoServiceLoader
     *   method if available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    SchemaFactory createInstance( String className ) {

    /**
     * <p>Creates an instance of the specified and returns it.</p>
     *
     * @param className
     *      fully qualified class name to be instantiated.
     *
     * @return null
     *      if it fails. Error messages will be printed by this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private Class<?> createClass(String className) {

    /** <p>Create class using appropriate ClassLoader.</p>
     *
     * @param className Name of class to create.
     * @return Created class or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private SchemaFactory _newFactory(String schemaLanguage) {

    /**
     * <p>Lookup a <code>SchemaFactory</code> for the given <code>schemaLanguage</code>.</p>
     *
     * @param schemaLanguage Schema language to lookup <code>SchemaFactory</code> for.
     *
     * @return <code>SchemaFactory</code> for the given <code>schemaLanguage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    public SchemaFactory newFactory(String schemaLanguage) {

    /**
     * <p>Creates a new {@link SchemaFactory} object for the specified
     * schema language.</p>
     *
     * @param schemaLanguage
     *      See {@link SchemaFactory Schema Language} table in <code>SchemaFactory</code>
     *      for the list of available schema languages.
     *
     * @return <code>null</code> if the callee fails to create one.
     *
     * @throws NullPointerException
     *      If the <code>schemaLanguage</code> parameter is null.
     * @throws SchemaFactoryConfigurationError
     *      If a configuration error is encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    public SchemaFactoryFinder(ClassLoader loader) {

    /**
     * <p>Constructor that specifies <code>ClassLoader</code> to use
     * to find <code>SchemaFactory</code>.</p>
     *
     * @param loader
     *      to be used to load resource, {@link SchemaFactory}, and
     *      {@link SchemaFactoryLoader} implementations during
     *      the resolution process.
     *      If this parameter is null, the default system class loader
     *      will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private final ClassLoader classLoader;

    /**
     * <p><code>ClassLoader</code> to use to find <code>SchemaFactory</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private static void debugPrintln(String msg) {

    /**
     * <p>Conditional debug printing.</p>
     *
     * @param msg to print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private static volatile boolean firstTime = true;

    /**
     * <p>First time requires initialization overhead.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private static final Properties cacheProps = new Properties();

    /**
     * <p>Cache properties for performance.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
    private static boolean debug = false;

    /** debug support code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryFinder.java
class SchemaFactoryFinder  {

/**
 * Implementation of {@link SchemaFactory#newInstance(String)}.
 *
 * @author <a href="Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @version $Revision: 1.8 $, $Date: 2010-11-01 04:36:13 $
 * @since 1.5
 */
