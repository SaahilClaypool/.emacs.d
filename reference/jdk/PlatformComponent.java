_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    interface MXBeanFetcher<T extends PlatformManagedObject> {

    /**
     * A task that returns the MXBeans for a component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    HOTSPOT_DIAGNOSTIC(
        "com.sun.management.HotSpotDiagnosticMXBean",
        "com.sun.management", "HotSpotDiagnostic", defaultKeyProperties(),

    /**
     * Diagnostic support for the HotSpot Virtual Machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    SUN_UNIX_OPERATING_SYSTEM(
        "com.sun.management.UnixOperatingSystemMXBean",
        "java.lang", "OperatingSystem", defaultKeyProperties(),

    /**
     * Unix operating system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    SUN_OPERATING_SYSTEM(
        "com.sun.management.OperatingSystemMXBean",
        "java.lang", "OperatingSystem", defaultKeyProperties(),

    /**
     * Sun extension operating system on which the Java virtual machine
     * is running.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    SUN_GARBAGE_COLLECTOR(
        "com.sun.management.GarbageCollectorMXBean",
        "java.lang", "GarbageCollector", keyProperties("name"),

    /**
     * Sun extension garbage collector that performs collections in cycles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    BUFFER_POOL(
        "java.lang.management.BufferPoolMXBean",
        "java.nio", "BufferPool", keyProperties("name"),

    /**
     * Buffer pools.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    LOGGING(
        "java.lang.management.PlatformLoggingMXBean",
        "java.util.logging", "Logging", defaultKeyProperties(),

    /**
     * Logging facility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    THREADING(
        "java.lang.management.ThreadMXBean",
        "java.lang", "Threading", defaultKeyProperties(),

    /**
     * Threading system of the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    RUNTIME(
        "java.lang.management.RuntimeMXBean",
        "java.lang", "Runtime", defaultKeyProperties(),

    /**
     * Runtime system of the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    OPERATING_SYSTEM(
        "java.lang.management.OperatingSystemMXBean",
        "java.lang", "OperatingSystem", defaultKeyProperties(),

    /**
     * Operating system on which the Java virtual machine is running
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    MEMORY_POOL(
        "java.lang.management.MemoryPoolMXBean",
        "java.lang", "MemoryPool", keyProperties("name"),

    /**
     * Memory pool in the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    MEMORY_MANAGER(
        "java.lang.management.MemoryManagerMXBean",
        "java.lang", "MemoryManager", keyProperties("name"),

    /**
     * Memory manager in the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    GARBAGE_COLLECTOR(
        "java.lang.management.GarbageCollectorMXBean",
        "java.lang", "GarbageCollector", keyProperties("name"),

    /**
     * Garbage Collector in the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    MEMORY(
        "java.lang.management.MemoryMXBean",
        "java.lang", "Memory", defaultKeyProperties(),

    /**
     * Memory system of the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    COMPILATION(
        "java.lang.management.CompilationMXBean",
        "java.lang", "Compilation", defaultKeyProperties(),

    /**
     * Compilation system of the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
    CLASS_LOADING(
        "java.lang.management.ClassLoadingMXBean",
        "java.lang", "ClassLoading", defaultKeyProperties(),

    /**
     * Class loading system of the Java virtual machine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/management/PlatformComponent.java
enum PlatformComponent {

/**
 * This enum class defines the list of platform components
 * that provides monitoring and management support.
 * Each enum represents one MXBean interface. A MXBean
 * instance could implement one or more MXBean interfaces.
 *
 * For example, com.sun.management.GarbageCollectorMXBean
 * extends java.lang.management.GarbageCollectorMXBean
 * and there is one set of garbage collection MXBean instances,
 * each of which implements both c.s.m. and j.l.m. interfaces.
 * There are two separate enums GARBAGE_COLLECTOR
 * and SUN_GARBAGE_COLLECTOR so that ManagementFactory.getPlatformMXBeans(Class)
 * will return the list of MXBeans of the specified type.
 *
 * To add a new MXBean interface for the Java platform,
 * add a new enum constant and implement the MXBeanFetcher.
 */
