_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    public static Object getFactory(String propName, Hashtable<?,?> env,
            Context ctx, String classSuffix, String defaultPkgPrefix)

    /**
     * Retrieves a factory from a list of packages specified in a
     * property.
     *
     * The property is gotten from the environment and the provider
     * resource file associated with the given context and concatenated.
     * classSuffix is added to the end of this list.
     * See getProperty(). The resulting property value is a list of package
     * prefixes.
     *<p>
     * This method then constructs a list of class names by concatenating
     * each package prefix with classSuffix and attempts to load and
     * instantiate the class until one succeeds.
     * Any class that cannot be loaded is ignored.
     * The resulting object is then cached in a two-level hash table,
     * keyed first by the context class loader and then by the property's
     * value and classSuffix.
     * The next time threads of the same context class loader call this
     * method, they use the cached factory.
     * If no factory can be loaded, NO_FACTORY is recorded in the table
     * so that next time it'll return quickly.
     *
     * @param propName  The non-null property name
     * @param env       The possibly null environment properties
     * @param ctx       The possibly null context
     * @param classSuffix The non-null class name
     *                  (e.g. ".ldap.ldapURLContextFactory).
     * @param defaultPkgPrefix The non-null default package prefix.
     *        (e.g., "com.sun.jndi.url").
     * @return An factory object; null if none.
     * @exception NamingException If encounter problem while reading the provider
     * property file, or problem instantiating the factory.
     *
     * @see javax.naming.spi.NamingManager#getURLContext
     * @see javax.naming.spi.NamingManager#getURLObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    public static FactoryEnumeration getFactories(String propName,
        Hashtable<?,?> env, Context ctx) throws NamingException {

    /**
     * Retrieves an enumeration of factory classes/object specified by a
     * property.
     *
     * The property is gotten from the environment and the provider
     * resource file associated with the given context and concantenated.
     * See getProperty(). The resulting property value is a list of class names.
     *<p>
     * This method then loads each class using the current thread's context
     * class loader and keeps them in a list. Any class that cannot be loaded
     * is ignored. The resulting list is then cached in a two-level
     * hash table, keyed first by the context class loader and then by
     * the property's value.
     * The next time threads of the same context class loader call this
     * method, they can use the cached list.
     *<p>
     * After obtaining the list either from the cache or by creating one from
     * the property value, this method then creates and returns a
     * FactoryEnumeration using the list. As the FactoryEnumeration is
     * traversed, the cached Class object in the list is instantiated and
     * replaced by an instance of the factory object itself.  Both class
     * objects and factories are wrapped in weak references so as not to
     * prevent GC of the class loader.
     *<p>
     * Note that multiple threads can be accessing the same cached list
     * via FactoryEnumeration, which locks the list during each next().
     * The size of the list will not change,
     * but a cached Class object might be replaced by an instantiated factory
     * object.
     *
     * @param propName  The non-null property name
     * @param env       The possibly null environment properties
     * @param ctx       The possibly null context
     * @return An enumeration of factory classes/objects; null if none.
     * @exception NamingException If encounter problem while reading the provider
     * property file.
     * @see javax.naming.spi.NamingManager#getObjectInstance
     * @see javax.naming.spi.NamingManager#getStateToBind
     * @see javax.naming.spi.DirectoryManager#getObjectInstance
     * @see javax.naming.spi.DirectoryManager#getStateToBind
     * @see javax.naming.ldap.ControlFactory#getControlInstance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    public static String getProperty(String propName, Hashtable<?,?> env,
        Context ctx, boolean concat)

    /**
      * Retrieves the property from the environment, or from the provider
      * resource file associated with the given context.  The environment
      * may in turn contain values that come from applet parameters,
      * system properties, or application resource files.
      *
      * If <tt>concat</tt> is true and both the environment and the provider
      * resource file contain the property, the two values are concatenated
      * (with a ':' separator).
      *
      * Returns null if no value is found.
      *
      * @param propName The non-null property name
      * @param env      The possibly null environment properties
      * @param ctx      The possibly null context
      * @param concat   True if multiple values should be concatenated
      * @return the property value, or null is there is none.
      * @throws NamingException if an error occurs while reading the provider
      * resource file.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
        static Object get(Object applet, String name) {

        /**
         * Returns the value of the applet's named parameter.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    private static class AppletParameter {

    /**
     * A class to allow JNDI properties be specified as applet parameters
     * without creating a static dependency on java.applet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
public final class ResourceManager {

/**
  * The ResourceManager class facilitates the reading of JNDI resource files.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    public static Object getFactory(String propName, Hashtable<?,?> env,
            Context ctx, String classSuffix, String defaultPkgPrefix)

    /**
     * Retrieves a factory from a list of packages specified in a
     * property.
     *
     * The property is gotten from the environment and the provider
     * resource file associated with the given context and concatenated.
     * classSuffix is added to the end of this list.
     * See getProperty(). The resulting property value is a list of package
     * prefixes.
     *<p>
     * This method then constructs a list of class names by concatenating
     * each package prefix with classSuffix and attempts to load and
     * instantiate the class until one succeeds.
     * Any class that cannot be loaded is ignored.
     * The resulting object is then cached in a two-level hash table,
     * keyed first by the context class loader and then by the property's
     * value and classSuffix.
     * The next time threads of the same context class loader call this
     * method, they use the cached factory.
     * If no factory can be loaded, NO_FACTORY is recorded in the table
     * so that next time it'll return quickly.
     *
     * @param propName  The non-null property name
     * @param env       The possibly null environment properties
     * @param ctx       The possibly null context
     * @param classSuffix The non-null class name
     *                  (e.g. ".ldap.ldapURLContextFactory).
     * @param defaultPkgPrefix The non-null default package prefix.
     *        (e.g., "com.sun.jndi.url").
     * @return An factory object; null if none.
     * @exception NamingException If encounter problem while reading the provider
     * property file, or problem instantiating the factory.
     *
     * @see javax.naming.spi.NamingManager#getURLContext
     * @see javax.naming.spi.NamingManager#getURLObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    public static FactoryEnumeration getFactories(String propName,
        Hashtable<?,?> env, Context ctx) throws NamingException {

    /**
     * Retrieves an enumeration of factory classes/object specified by a
     * property.
     *
     * The property is gotten from the environment and the provider
     * resource file associated with the given context and concantenated.
     * See getProperty(). The resulting property value is a list of class names.
     *<p>
     * This method then loads each class using the current thread's context
     * class loader and keeps them in a list. Any class that cannot be loaded
     * is ignored. The resulting list is then cached in a two-level
     * hash table, keyed first by the context class loader and then by
     * the property's value.
     * The next time threads of the same context class loader call this
     * method, they can use the cached list.
     *<p>
     * After obtaining the list either from the cache or by creating one from
     * the property value, this method then creates and returns a
     * FactoryEnumeration using the list. As the FactoryEnumeration is
     * traversed, the cached Class object in the list is instantiated and
     * replaced by an instance of the factory object itself.  Both class
     * objects and factories are wrapped in weak references so as not to
     * prevent GC of the class loader.
     *<p>
     * Note that multiple threads can be accessing the same cached list
     * via FactoryEnumeration, which locks the list during each next().
     * The size of the list will not change,
     * but a cached Class object might be replaced by an instantiated factory
     * object.
     *
     * @param propName  The non-null property name
     * @param env       The possibly null environment properties
     * @param ctx       The possibly null context
     * @return An enumeration of factory classes/objects; null if none.
     * @exception NamingException If encounter problem while reading the provider
     * property file.
     * @see javax.naming.spi.NamingManager#getObjectInstance
     * @see javax.naming.spi.NamingManager#getStateToBind
     * @see javax.naming.spi.DirectoryManager#getObjectInstance
     * @see javax.naming.spi.DirectoryManager#getStateToBind
     * @see javax.naming.ldap.ControlFactory#getControlInstance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    public static String getProperty(String propName, Hashtable<?,?> env,
        Context ctx, boolean concat)

    /**
      * Retrieves the property from the environment, or from the provider
      * resource file associated with the given context.  The environment
      * may in turn contain values that come from applet parameters,
      * system properties, or application resource files.
      *
      * If <tt>concat</tt> is true and both the environment and the provider
      * resource file contain the property, the two values are concatenated
      * (with a ':' separator).
      *
      * Returns null if no value is found.
      *
      * @param propName The non-null property name
      * @param env      The possibly null environment properties
      * @param ctx      The possibly null context
      * @param concat   True if multiple values should be concatenated
      * @return the property value, or null is there is none.
      * @throws NamingException if an error occurs while reading the provider
      * resource file.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
        static Object get(Object applet, String name) {

        /**
         * Returns the value of the applet's named parameter.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
    private static class AppletParameter {

    /**
     * A class to allow JNDI properties be specified as applet parameters
     * without creating a static dependency on java.applet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/ResourceManager.java
public final class ResourceManager {

/**
  * The ResourceManager class facilitates the reading of JNDI resource files.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  */
