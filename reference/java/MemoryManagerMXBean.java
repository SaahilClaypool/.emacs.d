_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String[] getMemoryPoolNames();

    /**
     * Returns the name of memory pools that this memory manager manages.
     *
     * @return an array of <tt>String</tt> objects, each is
     * the name of a memory pool that this memory manager manages.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public boolean isValid();

    /**
     * Tests if this memory manager is valid in the Java virtual
     * machine.  A memory manager becomes invalid once the Java virtual
     * machine removes it from the memory system.
     *
     * @return <tt>true</tt> if the memory manager is valid in the
     *               Java virtual machine;
     *         <tt>false</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String getName();

    /**
     * Returns the name representing this memory manager.
     *
     * @return the name of this memory manager.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
public interface MemoryManagerMXBean extends PlatformManagedObject {

/**
 * The management interface for a memory manager.
 * A memory manager manages one or more memory pools of the
 * Java virtual machine.
 *
 * <p> A Java virtual machine has one or more memory managers.
 * An instance implementing this interface is
 * an <a href="ManagementFactory.html#MXBean">MXBean</a>
 * that can be obtained by calling
 * the {@link ManagementFactory#getMemoryManagerMXBeans} method or
 * from the {@link ManagementFactory#getPlatformMBeanServer
 * platform <tt>MBeanServer</tt>} method.
 *
 * <p>The <tt>ObjectName</tt> for uniquely identifying the MXBean for
 * a memory manager within an MBeanServer is:
 * <blockquote>
 *   {@link ManagementFactory#MEMORY_MANAGER_MXBEAN_DOMAIN_TYPE
 *    <tt>java.lang:type=MemoryManager</tt>}<tt>,name=</tt><i>manager's name</i>
 * </blockquote>
 *
 * It can be obtained by calling the
 * {@link PlatformManagedObject#getObjectName} method.
 *
 * @see ManagementFactory#getPlatformMXBeans(Class)
 * @see MemoryMXBean
 *
 * @see <a href="../../../javax/management/package-summary.html">
 *      JMX Specification.</a>
 * @see <a href="package-summary.html#examples">
 *      Ways to Access MXBeans</a>
 *
 * @author  Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String[] getMemoryPoolNames();

    /**
     * Returns the name of memory pools that this memory manager manages.
     *
     * @return an array of <tt>String</tt> objects, each is
     * the name of a memory pool that this memory manager manages.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public boolean isValid();

    /**
     * Tests if this memory manager is valid in the Java virtual
     * machine.  A memory manager becomes invalid once the Java virtual
     * machine removes it from the memory system.
     *
     * @return <tt>true</tt> if the memory manager is valid in the
     *               Java virtual machine;
     *         <tt>false</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String getName();

    /**
     * Returns the name representing this memory manager.
     *
     * @return the name of this memory manager.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
public interface MemoryManagerMXBean extends PlatformManagedObject {

/**
 * The management interface for a memory manager.
 * A memory manager manages one or more memory pools of the
 * Java virtual machine.
 *
 * <p> A Java virtual machine has one or more memory managers.
 * An instance implementing this interface is
 * an <a href="ManagementFactory.html#MXBean">MXBean</a>
 * that can be obtained by calling
 * the {@link ManagementFactory#getMemoryManagerMXBeans} method or
 * from the {@link ManagementFactory#getPlatformMBeanServer
 * platform <tt>MBeanServer</tt>} method.
 *
 * <p>The <tt>ObjectName</tt> for uniquely identifying the MXBean for
 * a memory manager within an MBeanServer is:
 * <blockquote>
 *   {@link ManagementFactory#MEMORY_MANAGER_MXBEAN_DOMAIN_TYPE
 *    <tt>java.lang:type=MemoryManager</tt>}<tt>,name=</tt><i>manager's name</i>
 * </blockquote>
 *
 * It can be obtained by calling the
 * {@link PlatformManagedObject#getObjectName} method.
 *
 * @see ManagementFactory#getPlatformMXBeans(Class)
 * @see MemoryMXBean
 *
 * @see <a href="../../../javax/management/package-summary.html">
 *      JMX Specification.</a>
 * @see <a href="package-summary.html#examples">
 *      Ways to Access MXBeans</a>
 *
 * @author  Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String[] getMemoryPoolNames();

    /**
     * Returns the name of memory pools that this memory manager manages.
     *
     * @return an array of <tt>String</tt> objects, each is
     * the name of a memory pool that this memory manager manages.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public boolean isValid();

    /**
     * Tests if this memory manager is valid in the Java virtual
     * machine.  A memory manager becomes invalid once the Java virtual
     * machine removes it from the memory system.
     *
     * @return <tt>true</tt> if the memory manager is valid in the
     *               Java virtual machine;
     *         <tt>false</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String getName();

    /**
     * Returns the name representing this memory manager.
     *
     * @return the name of this memory manager.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
public interface MemoryManagerMXBean extends PlatformManagedObject {

/**
 * The management interface for a memory manager.
 * A memory manager manages one or more memory pools of the
 * Java virtual machine.
 *
 * <p> A Java virtual machine has one or more memory managers.
 * An instance implementing this interface is
 * an <a href="ManagementFactory.html#MXBean">MXBean</a>
 * that can be obtained by calling
 * the {@link ManagementFactory#getMemoryManagerMXBeans} method or
 * from the {@link ManagementFactory#getPlatformMBeanServer
 * platform <tt>MBeanServer</tt>} method.
 *
 * <p>The <tt>ObjectName</tt> for uniquely identifying the MXBean for
 * a memory manager within an MBeanServer is:
 * <blockquote>
 *   {@link ManagementFactory#MEMORY_MANAGER_MXBEAN_DOMAIN_TYPE
 *    <tt>java.lang:type=MemoryManager</tt>}<tt>,name=</tt><i>manager's name</i>
 * </blockquote>
 *
 * It can be obtained by calling the
 * {@link PlatformManagedObject#getObjectName} method.
 *
 * @see ManagementFactory#getPlatformMXBeans(Class)
 * @see MemoryMXBean
 *
 * @see <a href="../../../javax/management/package-summary.html">
 *      JMX Specification.</a>
 * @see <a href="package-summary.html#examples">
 *      Ways to Access MXBeans</a>
 *
 * @author  Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String[] getMemoryPoolNames();

    /**
     * Returns the name of memory pools that this memory manager manages.
     *
     * @return an array of <tt>String</tt> objects, each is
     * the name of a memory pool that this memory manager manages.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public boolean isValid();

    /**
     * Tests if this memory manager is valid in the Java virtual
     * machine.  A memory manager becomes invalid once the Java virtual
     * machine removes it from the memory system.
     *
     * @return <tt>true</tt> if the memory manager is valid in the
     *               Java virtual machine;
     *         <tt>false</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String getName();

    /**
     * Returns the name representing this memory manager.
     *
     * @return the name of this memory manager.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
public interface MemoryManagerMXBean extends PlatformManagedObject {

/**
 * The management interface for a memory manager.
 * A memory manager manages one or more memory pools of the
 * Java virtual machine.
 *
 * <p> A Java virtual machine has one or more memory managers.
 * An instance implementing this interface is
 * an <a href="ManagementFactory.html#MXBean">MXBean</a>
 * that can be obtained by calling
 * the {@link ManagementFactory#getMemoryManagerMXBeans} method or
 * from the {@link ManagementFactory#getPlatformMBeanServer
 * platform <tt>MBeanServer</tt>} method.
 *
 * <p>The <tt>ObjectName</tt> for uniquely identifying the MXBean for
 * a memory manager within an MBeanServer is:
 * <blockquote>
 *   {@link ManagementFactory#MEMORY_MANAGER_MXBEAN_DOMAIN_TYPE
 *    <tt>java.lang:type=MemoryManager</tt>}<tt>,name=</tt><i>manager's name</i>
 * </blockquote>
 *
 * It can be obtained by calling the
 * {@link PlatformManagedObject#getObjectName} method.
 *
 * @see ManagementFactory#getPlatformMXBeans(Class)
 * @see MemoryMXBean
 *
 * @see <a href="../../../javax/management/package-summary.html">
 *      JMX Specification.</a>
 * @see <a href="package-summary.html#examples">
 *      Ways to Access MXBeans</a>
 *
 * @author  Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String[] getMemoryPoolNames();

    /**
     * Returns the name of memory pools that this memory manager manages.
     *
     * @return an array of <tt>String</tt> objects, each is
     * the name of a memory pool that this memory manager manages.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public boolean isValid();

    /**
     * Tests if this memory manager is valid in the Java virtual
     * machine.  A memory manager becomes invalid once the Java virtual
     * machine removes it from the memory system.
     *
     * @return <tt>true</tt> if the memory manager is valid in the
     *               Java virtual machine;
     *         <tt>false</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
    public String getName();

    /**
     * Returns the name representing this memory manager.
     *
     * @return the name of this memory manager.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryManagerMXBean.java
public interface MemoryManagerMXBean extends PlatformManagedObject {

/**
 * The management interface for a memory manager.
 * A memory manager manages one or more memory pools of the
 * Java virtual machine.
 *
 * <p> A Java virtual machine has one or more memory managers.
 * An instance implementing this interface is
 * an <a href="ManagementFactory.html#MXBean">MXBean</a>
 * that can be obtained by calling
 * the {@link ManagementFactory#getMemoryManagerMXBeans} method or
 * from the {@link ManagementFactory#getPlatformMBeanServer
 * platform <tt>MBeanServer</tt>} method.
 *
 * <p>The <tt>ObjectName</tt> for uniquely identifying the MXBean for
 * a memory manager within an MBeanServer is:
 * <blockquote>
 *   {@link ManagementFactory#MEMORY_MANAGER_MXBEAN_DOMAIN_TYPE
 *    <tt>java.lang:type=MemoryManager</tt>}<tt>,name=</tt><i>manager's name</i>
 * </blockquote>
 *
 * It can be obtained by calling the
 * {@link PlatformManagedObject#getObjectName} method.
 *
 * @see ManagementFactory#getPlatformMXBeans(Class)
 * @see MemoryMXBean
 *
 * @see <a href="../../../javax/management/package-summary.html">
 *      JMX Specification.</a>
 * @see <a href="package-summary.html#examples">
 *      Ways to Access MXBeans</a>
 *
 * @author  Mandy Chung
 * @since   1.5
 */
