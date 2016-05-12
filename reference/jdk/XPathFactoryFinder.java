_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private XPathFactory findServiceProvider(final String objectModel)

    /**
     * Finds a service provider subclass of XPathFactory that supports the
     * given object model using the ServiceLoader.
     *
     * @param objectModel URI of object model to support.
     * @return An XPathFactory supporting the specified object model, or null
     *         if none is found.
     * @throws XPathFactoryConfigurationException if a configuration error is found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private static XPathFactory newInstanceNoServiceLoader(
         Class<?> providerClass
    ) throws XPathFactoryConfigurationException {

    /**
     * Try to construct using newXPathFactoryNoServiceLoader
     *   method if available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    XPathFactory createInstance( String className )

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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private Class<?> createClass(String className) {

    /** <p>Create class using appropriate ClassLoader.</p>
     *
     * @param className Name of class to create.
     * @return Created class or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private XPathFactory _newFactory(String uri) throws XPathFactoryConfigurationException {

    /**
     * <p>Lookup a {@link XPathFactory} for the given object model.</p>
     *
     * @param uri identifies the object model.
     *
     * @return {@link XPathFactory} for the given object model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    public XPathFactory newFactory(String uri) throws XPathFactoryConfigurationException {

    /**
     * <p>Creates a new {@link XPathFactory} object for the specified
     * object model.</p>
     *
     * @param uri
     *       Identifies the underlying object model.
     *
     * @return <code>null</code> if the callee fails to create one.
     *
     * @throws NullPointerException
     *      If the parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    public XPathFactoryFinder(ClassLoader loader) {

    /**
     * <p>Constructor that specifies <code>ClassLoader</code> to use
     * to find <code>XPathFactory</code>.</p>
     *
     * @param loader
     *      to be used to load resource and {@link XPathFactory}
     *      implementations during the resolution process.
     *      If this parameter is null, the default system class loader
     *      will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private final ClassLoader classLoader;

    /**
     * <p><code>ClassLoader</code> to use to find <code>XPathFactory</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private static void debugPrintln(String msg) {

    /**
     * <p>Conditional debug printing.</p>
     *
     * @param msg to print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private volatile static boolean firstTime = true;

    /**
     * <p>First time requires initialization overhead.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private static final Properties cacheProps = new Properties();

    /**
     * <p>Cache properties for performance.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
    private static boolean debug = false;

    /** debug support code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathFactoryFinder.java
class XPathFactoryFinder  {

/**
 * Implementation of {@link XPathFactory#newInstance(String)}.
 *
 * @author <a href="Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @version $Revision: 1.7 $, $Date: 2010-11-01 04:36:14 $
 * @since 1.5
 */
