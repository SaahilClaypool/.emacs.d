_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/ModifiableClassLoaderRepository.java
    public ClassLoader getClassLoader(ObjectName name);

    /**
     * Get a named ClassLoader from the repository.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/ModifiableClassLoaderRepository.java
    public void removeClassLoader(ObjectName name);

    /**
     * Remove a named ClassLoader from the repository.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/ModifiableClassLoaderRepository.java
    public void addClassLoader(ObjectName name, ClassLoader loader);

    /**
     * Add a named ClassLoader to the repository.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/ModifiableClassLoaderRepository.java
    public void removeClassLoader(ClassLoader loader);

    /**
     * Remove the specified ClassLoader to the repository.
     * The class loader may or may not be anonymous.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/ModifiableClassLoaderRepository.java
    public void addClassLoader(ClassLoader loader);

    /**
     * Add an anonymous ClassLoader to the repository.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/ModifiableClassLoaderRepository.java
public interface ModifiableClassLoaderRepository

/**
 * This interface keeps the list of Class Loaders registered in the
 * MBean Server.
 * It provides the necessary methods to load classes using the
 * registered Class Loaders, and to add/remove class loaders from the
 * list.
 *
 * @since 1.5
 */
