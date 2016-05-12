_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    class InputStreamEnumeration implements NamingEnumeration<InputStream> {

    /**
     * Given an enumeration of URLs, an instance of this class represents
     * an enumeration of their InputStreams.  Each operation on the URL
     * enumeration is performed within a doPrivileged block.
     * This is used to enumerate the resources under a foreign codebase.
     * This class is not MT-safe.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    ClassLoader getContextClassLoader() {

    /**
     * Package private.
     *
     * This internal method returns Thread Context Class Loader (TCCL),
     * if null, returns the system Class Loader.
     *
     * Please don't expose this method as public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    public Class<?> loadClass(String className, String codebase)

    /**
     * @param className A non-null fully qualified class name.
     * @param codebase A non-null, space-separated list of URL strings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    Class<?> loadClass(String className, ClassLoader cl)

    /**
     * Package private.
     *
     * This internal method is used with Thread Context Class Loader (TCCL),
     * please don't expose this method as public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
final class VersionHelper12 extends VersionHelper {

/**
 * VersionHelper was used by JNDI to accommodate differences between
 * JDK 1.1.x and the Java 2 platform. As this is no longer necessary
 * since JNDI's inclusion in the platform, this class currently
 * serves as a set of utilities for performing system-level things,
 * such as class-loading and reading system properties.
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    class InputStreamEnumeration implements NamingEnumeration<InputStream> {

    /**
     * Given an enumeration of URLs, an instance of this class represents
     * an enumeration of their InputStreams.  Each operation on the URL
     * enumeration is performed within a doPrivileged block.
     * This is used to enumerate the resources under a foreign codebase.
     * This class is not MT-safe.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    ClassLoader getContextClassLoader() {

    /**
     * Package private.
     *
     * This internal method returns Thread Context Class Loader (TCCL),
     * if null, returns the system Class Loader.
     *
     * Please don't expose this method as public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    public Class<?> loadClass(String className, String codebase)

    /**
     * @param className A non-null fully qualified class name.
     * @param codebase A non-null, space-separated list of URL strings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
    Class<?> loadClass(String className, ClassLoader cl)

    /**
     * Package private.
     *
     * This internal method is used with Thread Context Class Loader (TCCL),
     * please don't expose this method as public.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/naming/internal/VersionHelper12.java
final class VersionHelper12 extends VersionHelper {

/**
 * VersionHelper was used by JNDI to accommodate differences between
 * JDK 1.1.x and the Java 2 platform. As this is no longer necessary
 * since JNDI's inclusion in the platform, this class currently
 * serves as a set of utilities for performing system-level things,
 * such as class-loading and reading system properties.
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 */
