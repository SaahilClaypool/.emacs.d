_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SecureClassLoaderRepository.java
    public SecureClassLoaderRepository(ClassLoaderRepository clr) {

    /**
     * Creates a new secure ClassLoaderRepository wrapping an
     * unsecure implementation.
     * @param clr Unsecure {@link ClassLoaderRepository} implementation
     *            to wrap.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SecureClassLoaderRepository.java
final class SecureClassLoaderRepository

/**
 * Fix security hole in ClassLoaderRepository. This class wraps
 * the actual ClassLoaderRepository implementation so that
 * only the methods from {@link javax.management.loading.ClassLoaderRepository}
 * can be accessed (read-only).
 *
 * @since 1.5
 */
