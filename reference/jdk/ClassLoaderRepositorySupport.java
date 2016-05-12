_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private final Map<ObjectName,ClassLoader> loadersWithNames =

    /**
     * List of named class loaders.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private final Map<String,List<ClassLoader>> search =

    /**
     * List of valid search
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private synchronized boolean remove(ObjectName name, ClassLoader cl) {

    /**
     * Same behavior as remove(Object o) in {@link java.util.List}.
     * Replace the loader list with a new one in which the old loader
     * has been removed.
     *
     * The ObjectName may be null, in which case the entry to
     * be removed must also have a null ObjectName and the ClassLoader
     * values must match.  If the ObjectName is not null, then
     * the first entry with a matching ObjectName is removed,
     * regardless of whether ClassLoader values match.  (In fact,
     * the ClassLoader parameter will usually be null in this case.)
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private synchronized boolean add(ObjectName name, ClassLoader cl) {

    /**
     * Same behavior as add(Object o) in {@link java.util.List}.
     * Replace the loader list with a new one in which the new
     * loader has been added.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private LoaderEntry[] loaders = EMPTY_LOADER_ARRAY;

    /**
     * List of class loaders
     * Only read-only actions should be performed on this object.
     *
     * We do O(n) operations on this array, e.g. when removing
     * a ClassLoader.  The assumption is that the number of elements
     * is small, probably less than ten, and that the vast majority
     * of operations are searches (loadClass) which are by definition
     * linear.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
final class ClassLoaderRepositorySupport

/**
 * This class keeps the list of Class Loaders registered in the MBean Server.
 * It provides the necessary methods to load classes using the
 * registered Class Loaders.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private final Map<ObjectName,ClassLoader> loadersWithNames =

    /**
     * List of named class loaders.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private final Map<String,List<ClassLoader>> search =

    /**
     * List of valid search
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private synchronized boolean remove(ObjectName name, ClassLoader cl) {

    /**
     * Same behavior as remove(Object o) in {@link java.util.List}.
     * Replace the loader list with a new one in which the old loader
     * has been removed.
     *
     * The ObjectName may be null, in which case the entry to
     * be removed must also have a null ObjectName and the ClassLoader
     * values must match.  If the ObjectName is not null, then
     * the first entry with a matching ObjectName is removed,
     * regardless of whether ClassLoader values match.  (In fact,
     * the ClassLoader parameter will usually be null in this case.)
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private synchronized boolean add(ObjectName name, ClassLoader cl) {

    /**
     * Same behavior as add(Object o) in {@link java.util.List}.
     * Replace the loader list with a new one in which the new
     * loader has been added.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
    private LoaderEntry[] loaders = EMPTY_LOADER_ARRAY;

    /**
     * List of class loaders
     * Only read-only actions should be performed on this object.
     *
     * We do O(n) operations on this array, e.g. when removing
     * a ClassLoader.  The assumption is that the number of elements
     * is small, probably less than ten, and that the vast majority
     * of operations are searches (loadClass) which are by definition
     * linear.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/ClassLoaderRepositorySupport.java
final class ClassLoaderRepositorySupport

/**
 * This class keeps the list of Class Loaders registered in the MBean Server.
 * It provides the necessary methods to load classes using the
 * registered Class Loaders.
 *
 * @since 1.5
 */
