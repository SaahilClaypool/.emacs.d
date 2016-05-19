_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    static Class<?>[] loadSignatureClasses(String signature[],
                                           ClassLoader loader)

    /**
     * Load the classes specified in the signature with the given loader,
     * or with this object class loader.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    static Class<?> loadClass(String className, ClassLoader loader)

    /**
     * Load a class with the specified loader, or with this object
     * class loader if the specified loader is null.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public ModifiableClassLoaderRepository getClassLoaderRepository() {

    /**
     * Return the Default Loader Repository used by this instantiator object.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Object instantiate(String className,
                              ObjectName loaderName,
                              Object params[],
                              String signature[],
                              ClassLoader loader)

    /**
     * Instantiates an object. The class loader to be used is identified by its
     * object name.
     * <P>If the object name of the loader is null, a default has to be
     * provided (for example, for a MBean Server, the ClassLoader that loaded
     * it will be used).
     * <P>The object's class should have a public constructor.
     * <P>The call returns a reference to the newly created object.
     * <P>The newly created object is not registered in the MBean server.
     *
     * @param className The class name of the object to be instantiated.
     * @param params An array containing the parameters of the constructor to
     * be invoked.
     * @param signature An array containing the signature of the constructor to
     * be invoked.
     * @param loaderName The object name of the class loader to be used.
     *
     * @return The newly instantiated object.
     *
     * @exception ReflectionException Wraps a
     * <CODE>java.lang.ClassNotFoundException</CODE> or the
     * <CODE>java.lang.Exception</CODE> that occurred when trying to invoke the
     * object's constructor.
     * @exception MBeanException The constructor of the object has thrown an
     * exception
     * @exception InstanceNotFoundException The specified class loader is not
     * registered in the MBean Interceptor.
     * @exception RuntimeOperationsException Wraps a
     * <CODE>java.lang.IllegalArgumentException</CODE>: the className passed in
     * parameter is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Object instantiate(String className,
                              Object params[],
                              String signature[],
                              ClassLoader loader)

    /**
     * Instantiates an object using the list of all class loaders registered
     * in the MBean server
     * (using its {@link javax.management.loading.ClassLoaderRepository}).
     * <P>The object's class should have a public constructor.
     * <P>The call returns a reference to the newly created object.
     * <P>The newly created object is not registered in the MBean Interceptor.
     *
     * @param className The class name of the object to be instantiated.
     * @param params An array containing the parameters of the constructor to
     * be invoked.
     * @param signature An array containing the signature of the constructor to
     * be invoked.
     *
     * @return The newly instantiated object.
     *
     * @exception ReflectionException Wraps a
     * <CODE>java.lang.ClassNotFoundException</CODE> or the
     * <CODE>java.lang.Exception</CODE> that occurred when trying to invoke the
     * object's constructor.
     * @exception MBeanException The constructor of the object has thrown an
     * exception
     * @exception RuntimeOperationsException Wraps a
     * <CODE>java.lang.IllegalArgumentException</CODE>: the className passed in
     * parameter is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Object instantiate(String className, ObjectName loaderName,
                              ClassLoader loader)

    /**
     * Instantiates an object using the class Loader specified by its
     * <CODE>ObjectName</CODE>.
     * <P>If the loader name is null, a default one has to be provided (for a
     * MBean Server, the ClassLoader that loaded it will be used).
     * <P>The object's class should have a public constructor.
     * <P>It returns a reference to the newly created object.
     * <P>The newly created object is not registered in the MBean Interceptor.
     *
     * @param className The class name of the MBean to be instantiated.
     * @param loaderName The object name of the class loader to be used.
     *
     * @return The newly instantiated object.
     *
     * @exception ReflectionException Wraps a
     * <CODE>java.lang.ClassNotFoundException</CODE> or the
     * <CODE>java.lang.Exception</CODE> that occurred when trying to invoke the
     * object's constructor.
     * @exception MBeanException The constructor of the object has thrown an
     * exception.
     * @exception InstanceNotFoundException The specified class loader is not
     * registered in the MBeanServerInterceptor.
     * @exception RuntimeOperationsException Wraps a
     * <CODE>java.lang.IllegalArgumentException</CODE>: the className passed in
     * parameter is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Object instantiate(String className)

    /**
     * Instantiates an object using the list of all class loaders registered
     * in the MBean Interceptor
     * (using its {@link javax.management.loading.ClassLoaderRepository}).
     * <P>The object's class should have a public constructor.
     * <P>It returns a reference to the newly created object.
     * <P>The newly created object is not registered in the MBean Interceptor.
     *
     * @param className The class name of the object to be instantiated.
     *
     * @return The newly instantiated object.
     *
     * @exception ReflectionException Wraps a
     * <CODE>java.lang.ClassNotFoundException</CODE> or the
     * <CODE>java.lang.Exception</CODE> that occurred when trying to invoke the
     * object's constructor.
     * @exception MBeanException The constructor of the object has thrown an
     * exception
     * @exception RuntimeOperationsException Wraps a
     * <CODE>java.lang.IllegalArgumentException</CODE>: the className passed in
     * parameter is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public ObjectInputStream deserialize(String className,
                                         ObjectName loaderName,
                                         byte[] data,
                                         ClassLoader loader)

    /**
     * De-serializes a byte array in the context of a given MBean class loader.
     * <P>The class loader is the one that loaded the class with name
     * "className".
     * <P>The name of the class loader to be used for loading the specified
     * class is specified. If null, a default one has to be provided (for a
     * MBean Server, its own class loader will be used).
     *
     * @param className The name of the class whose class loader should
     *  be used for the de-serialization.
     * @param data The byte array to be de-sererialized.
     * @param loaderName The name of the class loader to be used for loading
     * the specified class. If null, a default one has to be provided (for a
     * MBean Server, its own class loader will be used).
     *
     * @return  The de-serialized object stream.
     *
     * @exception InstanceNotFoundException The specified class loader MBean is
     * not found.
     * @exception OperationsException Any of the usual Input/Output related
     * exceptions.
     * @exception ReflectionException The specified class could not be loaded
     * by the specified class loader.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public ObjectInputStream deserialize(ClassLoader loader, byte[] data)

    /**
     * De-serializes a byte array in the context of a classloader.
     *
     * @param loader the classloader to use for de-serialization
     * @param data The byte array to be de-sererialized.
     *
     * @return  The de-serialized object stream.
     *
     * @exception OperationsException Any of the usual Input/Output related
     * exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Object instantiate(Class<?> theClass, Object params[],
                              String signature[], ClassLoader loader)

   /**
     * Instantiates an object given its class, the parameters and
     * signature of its constructor The call returns a reference to
     * the newly created object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Object instantiate(Class<?> theClass)

    /**
     * Instantiates an object given its class, using its empty constructor.
     * The call returns a reference to the newly created object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Class<?>[] findSignatureClasses(String signature[],
                                           ClassLoader loader)

    /**
     * Return an array of Class corresponding to the given signature, using
     * the specified class loader.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Class<?> findClass(String className, ObjectName aLoader)

    /**
     * Gets the class for the specified class name using the specified
     * class loader
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Class<?> findClass(String className, ClassLoader loader)

    /**
     * Gets the class for the specified class name using the MBean
     * Interceptor's classloader
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public Class<?> findClassWithDefaultLoaderRepository(String className)

    /**
     * Loads the class with the specified name using this object's
     * Default Loader Repository.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
    public void testCreation(Class<?> c) throws NotCompliantMBeanException {

    /**
     * This methods tests if the MBean class makes it possible to
     * instantiate an MBean of this class in the MBeanServer.
     * e.g. it must have a public constructor, be a concrete class...
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanInstantiator.java
public class MBeanInstantiator {

/**
 * Implements the MBeanInstantiator interface. Provides methods for
 * instantiating objects, finding the class given its name and using
 * different class loaders, deserializing objects in the context of a
 * given class loader.
 *
 * @since 1.5
 */
