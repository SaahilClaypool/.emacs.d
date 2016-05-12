_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    private static Class<?> findProviderClass(String className, ClassLoader cl,
                                           boolean doFallback)

    /**
     * Find a Class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    public static Class<?> findProviderClass(String className, boolean doFallback)

    /**
     * Find a Class using the same class loader for the ObjectFactory by default
     * or boot class loader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    static Object newInstance(String className, ClassLoader cl,
                                      boolean doFallback)

    /**
     * Create an instance of a class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    public static Object newInstance(String className, boolean doFallback)

    /**
     * Create an instance of a class using the same class loader for the ObjectFactory by default
     * or boot class loader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    public static ClassLoader findClassLoader()

    /**
     * Figure out which ClassLoader to use.  For JDK 1.2 and later use
     * the context ClassLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    private static void debugPrintln(String msg) {

    /** Prints a message to standard error if debugging is enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    private static final boolean DEBUG = false;

    /** Set to true for debugging */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
public class ObjectFactory {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 * <p>
 * This class was moved from the <code>javax.xml.parsers.ObjectFactory</code>
 * class and modified to be used as a general utility for creating objects
 * dynamically.
 *
 * @version $Id: ObjectFactory.java,v 1.11 2010-11-01 04:34:25 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Class findProviderClass(String className, ClassLoader cl,
                                      boolean doFallback)

    /**
     * Find a Class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Class findProviderClass(String className, boolean doFallback)

    /**
     * Find a Class using the same classloader for the ObjectFactory by default
     * or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Object newInstance(String className, ClassLoader cl,
                                      boolean doFallback)

    /**
     * Create an instance of a class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Object newInstance(String className, boolean doFallback)

    /**
     * Create an instance of a class using the same classloader for the ObjectFactory by default
     * or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static ClassLoader findClassLoader()

    /**
     * Figure out which ClassLoader to use.  For JDK 1.2 and later use
     * the context ClassLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    private static void debugPrintln(String msg) {

    /** Prints a message to standard error if debugging is enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    private static boolean isDebugEnabled() {

    /** Returns true if debug has been enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    private static final boolean DEBUG = isDebugEnabled();

    /** Set to true for debugging */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
public final class ObjectFactory {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 * <p>
 * This code is designed to implement the JAXP 1.1 spec pluggability
 * feature and is designed to run on JDK version 1.1 and
 * later, and to compile on JDK 1.2 and onward.
 * The code also runs both as part of an unbundled jar file and
 * when bundled as part of the JDK.
 * <p>
 *
 * @version $Id: ObjectFactory.java,v 1.6 2010/04/23 01:44:34 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    private static Class<?> findProviderClass(String className, ClassLoader cl,
                                           boolean doFallback)

    /**
     * Find a Class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    public static Class<?> findProviderClass(String className, boolean doFallback)

    /**
     * Find a Class using the same class loader for the ObjectFactory by default
     * or boot class loader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    static Object newInstance(String className, ClassLoader cl,
                                      boolean doFallback)

    /**
     * Create an instance of a class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    public static Object newInstance(String className, boolean doFallback)

    /**
     * Create an instance of a class using the same class loader for the ObjectFactory by default
     * or boot class loader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    public static ClassLoader findClassLoader()

    /**
     * Figure out which ClassLoader to use.  For JDK 1.2 and later use
     * the context ClassLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    private static void debugPrintln(String msg) {

    /** Prints a message to standard error if debugging is enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
    private static final boolean DEBUG = false;

    /** Set to true for debugging */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/ObjectFactory.java
public class ObjectFactory {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 * <p>
 * This class was moved from the <code>javax.xml.parsers.ObjectFactory</code>
 * class and modified to be used as a general utility for creating objects
 * dynamically.
 *
 * @version $Id: ObjectFactory.java,v 1.11 2010-11-01 04:34:25 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Class findProviderClass(String className, ClassLoader cl,
                                      boolean doFallback)

    /**
     * Find a Class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Class findProviderClass(String className, boolean doFallback)

    /**
     * Find a Class using the same classloader for the ObjectFactory by default
     * or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Object newInstance(String className, ClassLoader cl,
                                      boolean doFallback)

    /**
     * Create an instance of a class using the specified ClassLoader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static Object newInstance(String className, boolean doFallback)

    /**
     * Create an instance of a class using the same classloader for the ObjectFactory by default
     * or bootclassloader when Security Manager is in place
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    public static ClassLoader findClassLoader()

    /**
     * Figure out which ClassLoader to use.  For JDK 1.2 and later use
     * the context ClassLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    private static void debugPrintln(String msg) {

    /** Prints a message to standard error if debugging is enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    private static boolean isDebugEnabled() {

    /** Returns true if debug has been enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
    private static final boolean DEBUG = isDebugEnabled();

    /** Set to true for debugging */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/ObjectFactory.java
public final class ObjectFactory {

/**
 * This class is duplicated for each JAXP subpackage so keep it in sync.
 * It is package private and therefore is not exposed as part of the JAXP
 * API.
 * <p>
 * This code is designed to implement the JAXP 1.1 spec pluggability
 * feature and is designed to run on JDK version 1.1 and
 * later, and to compile on JDK 1.2 and onward.
 * The code also runs both as part of an unbundled jar file and
 * when bundled as part of the JDK.
 * <p>
 *
 * @version $Id: ObjectFactory.java,v 1.6 2010/04/23 01:44:34 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ObjectFactory.java
public interface ObjectFactory {

/**
  * This interface represents a factory for creating an object.
  *<p>
  * The JNDI framework allows for object implementations to
  * be loaded in dynamically via <em>object factories</em>.
  * For example, when looking up a printer bound in the name space,
  * if the print service binds printer names to References, the printer
  * Reference could be used to create a printer object, so that
  * the caller of lookup can directly operate on the printer object
  * after the lookup.
  * <p>An <tt>ObjectFactory</tt> is responsible
  * for creating objects of a specific type.  In the above example,
  * you may have a PrinterObjectFactory for creating Printer objects.
  *<p>
  * An object factory must implement the <tt>ObjectFactory</tt> interface.
  * In addition, the factory class must be public and must have a
  * public constructor that accepts no parameters.
  *<p>
  * The <tt>getObjectInstance()</tt> method of an object factory may
  * be invoked multiple times, possibly using different parameters.
  * The implementation is thread-safe.
  *<p>
  * The mention of URL in the documentation for this class refers to
  * a URL string as defined by RFC 1738 and its related RFCs. It is
  * any string that conforms to the syntax described therein, and
  * may not always have corresponding support in the java.net.URL
  * class or Web browsers.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see NamingManager#getObjectInstance
  * @see NamingManager#getURLContext
  * @see ObjectFactoryBuilder
  * @see StateFactory
  * @since 1.3
  */
