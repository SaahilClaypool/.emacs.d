_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformManagedObject.java
public interface PlatformManagedObject {

/**
 * A platform managed object is a {@linkplain javax.management.MXBean JMX MXBean}
 * for monitoring and managing a component in the Java platform.
 * Each platform managed object has a unique
 * <a href="ManagementFactory.html#MXBean">object name</a>
 * for the {@linkplain ManagementFactory#getPlatformMBeanServer
 * platform MBeanServer} access.
 * All platform MXBeans will implement this interface.
 *
 * <p>
 * Note:
 * The platform MXBean interfaces (i.e. all subinterfaces
 * of {@code PlatformManagedObject}) are implemented
 * by the Java platform only.  New methods may be added in these interfaces
 * in future Java SE releases.
 * In addition, this {@code PlatformManagedObject} interface is only
 * intended for the management interfaces for the platform to extend but
 * not for applications.
 *
 * @see ManagementFactory
 * @since 1.7
 */
