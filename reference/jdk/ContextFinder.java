_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    private static Class safeLoadClass(String className, ClassLoader classLoader) throws ClassNotFoundException {

    /**
     * Loads the class, provided that the calling thread has an access to the class being loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    private static final String PLATFORM_DEFAULT_FACTORY_CLASS = "com.sun.xml.internal.bind.v2.ContextFactory";

    /**
     * When JAXB is in J2SE, rt.jar has to have a JAXB implementation.
     * However, rt.jar cannot have META-INF/services/javax.xml.bind.JAXBContext
     * because if it has, it will take precedence over any file that applications have
     * in their jar files.
     *
     * <p>
     * When the user bundles his own JAXB implementation, we'd like to use it, and we
     * want the platform default to be used only when there's no other JAXB provider.
     *
     * <p>
     * For this reason, we have to hard-code the class name into the API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    static URL which(Class clazz) {

    /**
     * Get the URL for the Class from it's ClassLoader.
     *
     * Convenience method for {@link #which(Class, ClassLoader)}.
     *
     * Equivalent to calling: which(clazz, clazz.getClassLoader())
     *
     * @param clazz
     *          The class to search for
     * @return
     *          the URL for the class or null if it wasn't found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    static URL which(Class clazz, ClassLoader loader) {

    /**
     * Search the given ClassLoader for an instance of the specified class and
     * return a string representation of the URL that points to the resource.
     *
     * @param clazz
     *          The class to search for
     * @param loader
     *          The ClassLoader to search.  If this parameter is null, then the
     *          system class loader will be searched
     * @return
     *          the URL for the class or null if it wasn't found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    static JAXBContext newInstance(
                              Class[] classes,
                              Map properties,
                              String className) throws JAXBException {

    /**
     * Create an instance of a class using the thread context ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    static JAXBContext newInstance( String contextPath,
                               String className,
                               ClassLoader classLoader,
                               Map properties )

    /**
     * Create an instance of a class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    private static JAXBException handleClassCastException(Class originalType, Class targetType) {

    /**
     * Determine if two types (JAXBContext in this case) will generate a ClassCastException.
     *
     * For example, (targetType)originalType
     *
     * @param originalType
     *          The Class object of the type being cast
     * @param targetType
     *          The Class object of the type that is being cast to
     * @return JAXBException to be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
    private static void handleInvocationTargetException(InvocationTargetException x) throws JAXBException {

    /**
     * If the {@link InvocationTargetException} wraps an exception that shouldn't be wrapped,
     * throw the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/ContextFinder.java
class ContextFinder {

/**
 * This class is package private and therefore is not exposed as part of the
 * JAXB API.
 *
 * This code is designed to implement the JAXB 1.0 spec pluggability feature
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li></ul>
 * @see JAXBContext
 */
