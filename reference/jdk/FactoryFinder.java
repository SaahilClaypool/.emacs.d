_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    static <T> T find(Class<T> type, String fallbackClassName)

    /**
     * Finds the implementation Class object in the specified order.  Main
     * entry point.
     * @return Class object of factory, never null
     *
     * @param type                  Base class / Service interface  of the
     *                              factory to find.
     * @param fallbackClassName     Implementation class name, if nothing else
     *                              is found.  Use null to mean no fallback.
     *
     * Package private so this code can be shared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    static <T> T newInstance(Class<T> type, String className, ClassLoader cl,
            boolean doFallback, boolean useBSClsLoader)

    /**
     * Create an instance of a class. Delegates to method
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param type Base class / Service interface  of the factory to
     *             instantiate.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl ClassLoader to use to load the class, null means to use
     * the bootstrap ClassLoader
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     *
     * @param useBSClsLoader True if cl=null actually meant bootstrap classLoader. This parameter
     * is needed since DocumentBuilderFactory/SAXParserFactory defined null as context classLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    static <T> T newInstance(Class<T> type, String className, ClassLoader cl, boolean doFallback)

    /**
     * Create an instance of a class. Delegates to method
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param type Base class / Service interface  of the factory to
     *             instantiate.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
     * current <code>Thread</code>'s context classLoader is used to load the factory class.
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    static private Class<?> getProviderClass(String className, ClassLoader cl,
            boolean doFallback, boolean useBSClsLoader) throws ClassNotFoundException

    /**
     * Attempt to load a class using the class loader supplied. If that fails
     * and fall back is enabled, the current (i.e. bootstrap) class loader is
     * tried.
     *
     * If the class loader supplied is <code>null</code>, first try using the
     * context class loader followed by the current (i.e. bootstrap) class
     * loader.
     *
     * Use bootstrap classLoader if cl = null and useBSClsLoader is true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    private final static SecuritySupport ss = new SecuritySupport();

    /**
     * Security support class use to check access control before
     * getting certain system resources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    private static volatile boolean firstTime = true;

    /**
     * Flag indicating if properties from java.home/lib/jaxp.properties
     * have been cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    private final static Properties cacheProps = new Properties();

    /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
    private static boolean debug = false;

    /**
     * Internal debug flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/FactoryFinder.java
class FactoryFinder {

/**
 * <p>Implements pluggable Datatypes.</p>
 *
 * <p>This class is duplicated for each JAXP subpackage so keep it in
 * sync.  It is package private for secure class loading.</p>
 *
 * @author Santiago.PericasGeertsen@sun.com
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    static <T> T find(Class<T> type, String fallbackClassName)

    /**
     * Finds the implementation Class object in the specified order.  Main
     * entry point.
     * @return Class object of factory, never null
     *
     * @param type                  Base class / Service interface  of the
     *                              factory to find.
     * @param fallbackClassName     Implementation class name, if nothing else
     *                              is found.  Use null to mean no fallback.
     *
     * Package private so this code can be shared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    static <T> T newInstance(Class<T> type, String className, ClassLoader cl,
                             boolean doFallback, boolean useBSClsLoader)

    /**
     * Create an instance of a class. Delegates to method
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param type Base class / Service interface  of the factory to
     *             instantiate.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
     * current <code>Thread</code>'s context classLoader is used to load the factory class.
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     *
     * @param useBSClsLoader True if cl=null actually meant bootstrap classLoader. This parameter
     * is needed since DocumentBuilderFactory/SAXParserFactory defined null as context classLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    static <T> T newInstance(Class<T> type, String className, ClassLoader cl,
                             boolean doFallback)

    /**
     * Create an instance of a class. Delegates to method
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param type Base class / Service interface  of the factory to
     *             instantiate.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
     * current <code>Thread</code>'s context classLoader is used to load the factory class.
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    static private Class<?> getProviderClass(String className, ClassLoader cl,
            boolean doFallback, boolean useBSClsLoader) throws ClassNotFoundException

    /**
     * Attempt to load a class using the class loader supplied. If that fails
     * and fall back is enabled, the current (i.e. bootstrap) class loader is
     * tried.
     *
     * If the class loader supplied is <code>null</code>, first try using the
     * context class loader followed by the current (i.e. bootstrap) class
     * loader.
     *
     * Use bootstrap classLoader if cl = null and useBSClsLoader is true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    private static final SecuritySupport ss = new SecuritySupport();

    /**
     * Security support class use to check access control before
     * getting certain system resources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    static volatile boolean firstTime = true;

    /**
     * Flag indicating if properties from java.home/lib/jaxp.properties
     * have been cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    private static final Properties cacheProps = new Properties();

    /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
    private static boolean debug = false;

    /**
     * Internal debug flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryFinder.java
class FactoryFinder {

/**
 * <p>Implements pluggable Parsers.</p>
 *
 * <p>This class is duplicated for each JAXP subpackage so keep it in
 * sync.  It is package private for secure class loading.</p>
 *
 * @author Santiago.PericasGeertsen@sun.com
 * @author Huizhe.Wang@oracle.com
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/FactoryFinder.java
    private static Class safeLoadClass(String className,
                                       ClassLoader classLoader)

    /**
     * Loads the class, provided that the calling thread has an access to the
     * class being loaded. If this is the specified default factory class and it
     * is restricted by package.access we get a SecurityException and can do a
     * Class.forName() on it so it will be loaded by the bootstrap class loader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/FactoryFinder.java
    static Object find(String factoryId, String defaultClassName,
                       boolean tryFallback) throws SOAPException {

    /**
     * Finds the implementation <code>Class</code> object for the given
     * factory name, or if that fails, finds the <code>Class</code> object
     * for the given default class name, but only if <code>tryFallback</code>
     * is <code>true</code>.  The arguments supplied must be used in order
     * If using the first argument is successful, the second one will not
     * be used.  Note the default class name may be needed even if fallback
     * is not to be attempted, so certain error conditions can be handled.
     * <P>
     * This method is package private so that this code can be shared.
     *
     * @return the <code>Class</code> object of the specified message factory;
     *         may not be <code>null</code>
     *
     * @param factoryId             the name of the factory to find, which is
     *                              a system property
     * @param defaultClassName      the implementation class name, which is
     *                              to be used only if nothing else
     *                              is found; <code>null</code> to indicate
     *                              that there is no default class name
     * @param tryFallback           whether to try the default class as a
     *                              fallback
     * @exception SOAPException if there is a SOAP error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/FactoryFinder.java
    static Object find(String factoryId, String fallbackClassName)

    /**
     * Finds the implementation <code>Class</code> object for the given
     * factory name, or if that fails, finds the <code>Class</code> object
     * for the given fallback class name. The arguments supplied must be
     * used in order. If using the first argument is successful, the second
     * one will not be used.
     * <P>
     * This method is package private so that this code can be shared.
     *
     * @return the <code>Class</code> object of the specified message factory;
     *         may be <code>null</code>
     *
     * @param factoryId             the name of the factory to find, which is
     *                              a system property
     * @param fallbackClassName     the implementation class name, which is
     *                              to be used only if nothing else
     *                              is found; <code>null</code> to indicate that
     *                              there is no fallback class name
     * @exception SOAPException if there is a SOAP error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/FactoryFinder.java
    static Object find(String factoryId)

    /**
     * Finds the implementation <code>Class</code> object for the given
     * factory name, or null if that fails.
     * <P>
     * This method is package private so that this code can be shared.
     *
     * @return the <code>Class</code> object of the specified message factory;
     *         or <code>null</code>
     *
     * @param factoryId             the name of the factory to find, which is
     *                              a system property
     * @exception SOAPException if there is a SOAP error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/FactoryFinder.java
    private static Object newInstance(String className,
                                      ClassLoader classLoader)

    /**
     * Creates an instance of the specified class using the specified
     * <code>ClassLoader</code> object.
     *
     * @exception SOAPException if the given class could not be found
     *            or could not be instantiated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    static <T> T find(Class<T> type, String factoryId, ClassLoader cl, String fallbackClassName)

    /**
     * Finds the implementation Class object in the specified order.  Main
     * entry point.
     * @return Class object of factory, never null
     *
     * @param type                  Base class / Service interface  of the
     *                              factory to find.
     *
     * @param factoryId             Name of the factory to find, same as
     *                              a property name
     *
     * @param cl                    ClassLoader to be used to load the class, null means to use
     * the bootstrap ClassLoader
     *
     * @param fallbackClassName     Implementation class name, if nothing else
     *                              is found.  Use null to mean no fallback.
     *
     * Package private so this code can be shared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    static <T> T find(Class<T> type, String fallbackClassName)

    /**
     * Finds the implementation Class object in the specified order.
     *
     * @return Class object of factory, never null
     *
     * @param type                  Base class / Service interface  of the
     *                              factory to find.
     *
     * @param fallbackClassName     Implementation class name, if nothing else
     *                              is found.  Use null to mean no fallback.
     *
     * Package private so this code can be shared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    static <T> T newInstance(Class<T> type, String className, ClassLoader cl,
                              boolean doFallback, boolean useBSClsLoader)

    /**
     * Create an instance of a class. Delegates to method
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param type Base class / Service interface  of the factory to
     *             instantiate.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
     * current <code>Thread</code>'s context classLoader is used to load the factory class.
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     *
     * @param useBSClsLoader True if cl=null actually meant bootstrap classLoader. This parameter
     * is needed since DocumentBuilderFactory/SAXParserFactory defined null as context classLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    static <T> T newInstance(Class<T> type, String className, ClassLoader cl, boolean doFallback)

    /**
     * Create an instance of a class. Delegates to method
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param type Base class / Service interface  of the factory to
     *             instantiate.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
     * current <code>Thread</code>'s context classLoader is used to load the factory class.
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    static private Class getProviderClass(String className, ClassLoader cl,
            boolean doFallback, boolean useBSClsLoader) throws ClassNotFoundException

    /**
     * Attempt to load a class using the class loader supplied. If that fails
     * and fall back is enabled, the current (i.e. bootstrap) class loader is
     * tried.
     *
     * If the class loader supplied is <code>null</code>, first try using the
     * context class loader followed by the current (i.e. bootstrap) class
     * loader.
     *
     * Use bootstrap classLoader if cl = null and useBSClsLoader is true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    final private static SecuritySupport ss = new SecuritySupport();

    /**
     * Security support class use to check access control before
     * getting certain system resources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    private static volatile boolean firstTime = true;

    /**
     * Flag indicating if properties from java.home/lib/jaxp.properties
     * have been cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    final private static Properties cacheProps = new Properties();

    /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
    private static boolean debug = false;

    /**
     * Internal debug flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryFinder.java
class FactoryFinder {

/**
 * <p>Implements pluggable streams.</p>
 *
 * <p>This class is duplicated for each JAXP subpackage so keep it in
 * sync.  It is package private for secure class loading.</p>
 *
 * @author Santiago.PericasGeertsen@sun.com
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    static <T> T find(Class<T> type, String fallbackClassName)

    /**
     * Finds the implementation Class object in the specified order.  Main
     * entry point.
     * @return Class object of factory, never null
     *
     * @param type                  Base class / Service interface  of the
     *                              factory to find.
     *
     * @param fallbackClassName     Implementation class name, if nothing else
     *                              is found.  Use null to mean no fallback.
     *
     * Package private so this code can be shared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    private static <T> T newInstanceNoServiceLoader(Class<T> type, Class<?> providerClass) {

    /**
     * Try to construct using newTransformerFactoryNoServiceLoader
     *   method if available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    static <T> T newInstance(Class<T> type, String className, ClassLoader cl,
                             boolean doFallback, boolean useServicesMechanism)

    /**
     * Create an instance of a class. Delegates to method
     * <code>getProviderClass()</code> in order to load the class.
     *
     * @param type Base class / Service interface  of the factory to
     *             instantiate.
     *
     * @param className Name of the concrete class corresponding to the
     * service provider
     *
     * @param cl <code>ClassLoader</code> used to load the factory class. If <code>null</code>
     * current <code>Thread</code>'s context classLoader is used to load the factory class.
     *
     * @param doFallback True if the current ClassLoader should be tried as
     * a fallback if the class is not found using cl
     *
     * @param useServicesMechanism True use services mechanism
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    static private Class<?> getProviderClass(String className, ClassLoader cl,
            boolean doFallback, boolean useBSClsLoader) throws ClassNotFoundException

    /**
     * Attempt to load a class using the class loader supplied. If that fails
     * and fall back is enabled, the current (i.e. bootstrap) class loader is
     * tried.
     *
     * If the class loader supplied is <code>null</code>, first try using the
     * context class loader followed by the current (i.e. bootstrap) class
     * loader.
     *
     * Use bootstrap classLoader if cl = null and useBSClsLoader is true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    private final static SecuritySupport ss = new SecuritySupport();

    /**
     * Security support class use to check access control before
     * getting certain system resources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    static volatile boolean firstTime = true;

    /**
     * Flag indicating if properties from java.home/lib/jaxp.properties
     * have been cached.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    private final static Properties cacheProps = new Properties();

    /**
     * Cache for properties in java.home/lib/jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
    private static boolean debug = false;

    /**
     * Internal debug flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/FactoryFinder.java
class FactoryFinder {

/**
 * <p>Implements pluggable Datatypes.</p>
 *
 * <p>This class is duplicated for each JAXP subpackage so keep it in
 * sync.  It is package private for secure class loading.</p>
 *
 * @author Santiago.PericasGeertsen@sun.com
 * @author Huizhe.Wang@oracle.com
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/FactoryFinder.java
    private static Class safeLoadClass(String className, ClassLoader classLoader) throws ClassNotFoundException {

    /**
     * Loads the class, provided that the calling thread has an access to the class being loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/FactoryFinder.java
    static Object find(String factoryId, String fallbackClassName)

    /**
     * Finds the implementation <code>Class</code> object for the given
     * factory name, or if that fails, finds the <code>Class</code> object
     * for the given fallback class name. The arguments supplied MUST be
     * used in order. If using the first argument is successful, the second
     * one will not be used.
     * <P>
     * This method is package private so that this code can be shared.
     *
     * @return the <code>Class</code> object of the specified message factory;
     *         may not be <code>null</code>
     *
     * @param factoryId             the name of the factory to find, which is
     *                              a system property
     * @param fallbackClassName     the implementation class name, which is
     *                              to be used only if nothing else
     *                              is found; <code>null</code> to indicate that
     *                              there is no fallback class name
     * @exception WebServiceException if there is an error
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/FactoryFinder.java
    private static Object newInstance(String className,
                                      ClassLoader classLoader)

    /**
     * Creates an instance of the specified class using the specified
     * <code>ClassLoader</code> object.
     *
     * @exception WebServiceException if the given class could not be found
     *            or could not be instantiated
     */
