_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static InputStream getResourceAsStream(final ClassLoader classLoader,
                                                   final String name) {

    /**
     * This method returns an Inputstream for the reading resource
     * META_INF/services/org.w3c.dom.DOMImplementationSourceList after checking
     * access control privileges. For a JRE 1.1, this check is not done.
     *
     * @param classLoader classLoader
     * @param name the resource
     * @return an Inputstream for the resource specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static String getSystemProperty(final String name) {

    /**
     * This method returns the system property indicated by the specified name
     * after checking access control privileges. For a JRE 1.1, this check is
     * not done.
     *
     * @param name the name of the system property
     * @return the system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static ClassLoader getContextClassLoader() {

    /**
     * This method returns the ContextClassLoader or <code>null</code> if
     * running in a JRE 1.1
     *
     * @return The Context Classloader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static boolean isJRE11() {

    /**
     * A simple JRE (Java Runtime Environment) 1.1 test
     *
     * @return <code>true</code> if JRE 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static String getServiceValue(final ClassLoader classLoader) {

    /**
     * This method attempts to return the first line of the resource
     * META_INF/services/org.w3c.dom.DOMImplementationSourceList
     * from the provided ClassLoader.
     *
     * @param classLoader classLoader, may not be <code>null</code>.
     * @return first line of resource, or <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static ClassLoader getClassLoader() {

    /**
     *
     * Gets a class loader.
     *
     * @return A class loader, possibly <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    public void addSource(final DOMImplementationSource s) {

    /**
     * Register an implementation.
     *
     * @param s The source to be registered, may not be <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    public DOMImplementationList getDOMImplementationList(final String features) {

    /**
     * Return a list of implementations that support the
     * desired features.
     *
     * @param features
     *            A string that specifies which features are required. This is
     *            a space separated list in which each feature is specified by
     *            its name optionally followed by a space and a version number.
     *            This is something like: "XML 1.0 Traversal +Events 2.0"
     * @return A list of DOMImplementations that support the desired features.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    public DOMImplementation getDOMImplementation(final String features) {

    /**
     * Return the first implementation that has the desired
     * features, or <code>null</code> if none is found.
     *
     * @param features
     *            A string that specifies which features are required. This is
     *            a space separated list in which each feature is specified by
     *            its name optionally followed by a space and a version number.
     *            This is something like: "XML 1.0 Traversal +Events 2.0"
     * @return An implementation that has the desired features,
     *         or <code>null</code> if none found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    public static DOMImplementationRegistry newInstance()

    /**
     * Obtain a new instance of a <code>DOMImplementationRegistry</code>.
     *

     * The <code>DOMImplementationRegistry</code> is initialized by the
     * application or the implementation, depending on the context, by
     * first checking the value of the Java system property
     * <code>org.w3c.dom.DOMImplementationSourceList</code> and
     * the service provider whose contents are at
     * "<code>META_INF/services/org.w3c.dom.DOMImplementationSourceList</code>".
     * The value of this property is a white-space separated list of
     * names of availables classes implementing the
     * <code>DOMImplementationSource</code> interface. Each class listed
     * in the class name list is instantiated and any exceptions
     * encountered are thrown to the application.
     *
     * @return an initialized instance of DOMImplementationRegistry
     * @throws ClassNotFoundException
     *     If any specified class can not be found
     * @throws InstantiationException
     *     If any specified class is an interface or abstract class
     * @throws IllegalAccessException
     *     If the default constructor of a specified class is not accessible
     * @throws ClassCastException
     *     If any specified class does not implement
     * <code>DOMImplementationSource</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private DOMImplementationRegistry(final Vector srcs) {

    /**
     * Private constructor.
     * @param srcs Vector List of DOMImplementationSources
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static final String FALLBACK_CLASS =

    /**
     * Default class name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private Vector sources;

    /**
     * The list of DOMImplementationSources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
    private static final int DEFAULT_LINE_LENGTH = 80;

    /**
     * Default columns per line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/bootstrap/DOMImplementationRegistry.java
public final class DOMImplementationRegistry {

/**
 * A factory that enables applications to obtain instances of
 * <code>DOMImplementation</code>.
 *
 * <p>
 * Example:
 * </p>
 *
 * <pre class='example'>
 *  // get an instance of the DOMImplementation registry
 *  DOMImplementationRegistry registry =
 *       DOMImplementationRegistry.newInstance();
 *  // get a DOM implementation the Level 3 XML module
 *  DOMImplementation domImpl =
 *       registry.getDOMImplementation("XML 3.0");
 * </pre>
 *
 * <p>
 * This provides an application with an implementation-independent starting
 * point. DOM implementations may modify this class to meet new security
 * standards or to provide *additional* fallbacks for the list of
 * DOMImplementationSources.
 * </p>
 *
 * @see DOMImplementation
 * @see DOMImplementationSource
 * @since DOM Level 3
 */
