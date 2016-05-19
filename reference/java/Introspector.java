_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static Method getReadMethod(Object pd) {

        /**
         * Invokes java.beans.PropertyDescriptor.getReadMethod()
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static String getPropertyName(Object pd) {

        /**
         * Invokes java.beans.PropertyDescriptor.getName()
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static Object[] getPropertyDescriptors(Object bi) {

        /**
         * Invokes java.beans.BeanInfo.getPropertyDescriptors()
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static Object getBeanInfo(Class<?> clazz) throws Exception {

        /**
         * Invokes java.beans.Introspector.getBeanInfo(Class)
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static boolean isAvailable() {

        /**
         * Returns {@code true} if java.beans is available.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    private static class BeansHelper {

    /**
     * A class that provides access to the JavaBeans Introspector and
     * PropertyDescriptors without creating a static dependency on java.beans.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static Method getReadMethod(Class<?> clazz, String property) {

        /**
         * Returns the "getter" to read the given property from the given class or
         * {@code null} if no method is found.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static List<Method> getReadMethods(Class<?> clazz) {

        /**
         * Returns the list of "getter" methods for the given class. The list
         * is ordered so that isXXX methods appear before getXXX methods - this
         * is for compatibility with the JavaBeans Introspector.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        static boolean isReadMethod(Method method) {

        /**
         * Returns {@code true} if the given method is a "getter" method (where
         * "getter" method is a public method of the form getXXX or "boolean
         * isXXX")
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
        private static List<Method> getCachedMethods(Class<?> clazz) {

        /**
         * Returns the list of methods cached for the given class, or {@code null}
         * if not cached.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    private static class SimpleIntrospector {

    /**
     * A simple introspector that uses reflection to analyze a class and
     * identify its "getter" methods. This class is intended for use only when
     * Java Beans is not present (which implies that there isn't explicit
     * information about the bean available).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    private static <T> Class<? super T> implementsMBean(Class<T> c, String clName) {

    /**
     * Returns the XXMBean interface or null if no such interface exists
     *
     * @param c The interface to be tested
     * @param clName The name of the class implementing this interface
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    static NotCompliantMBeanException throwException(Class<?> notCompliant,
            Throwable cause)

    /**
     * Throws a NotCompliantMBeanException or a SecurityException.
     * @param notCompliant the class which was under examination
     * @param cause the raeson why NotCompliantMBeanException should
     *        be thrown.
     * @return nothing - this method always throw an exception.
     *         The return type makes it possible to write
     *         <pre> throw throwException(clazz,cause); </pre>
     * @throws SecurityException - if cause is a SecurityException
     * @throws NotCompliantMBeanException otherwise.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    private static <T> Class<? super T> findMBeanInterface(
            Class<T> aClass, String aName) {

    /**
     * Try to find the MBean interface corresponding to the class aName
     * - i.e. <i>aName</i>MBean, from within aClass and its superclasses.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static <T> Class<? super T> getMXBeanInterface(Class<T> baseClass)

    /**
     * Get the MXBean interface implemented by a JMX MXBean class.
     *
     * @param baseClass The class to be tested.
     *
     * @return The MXBean interface implemented by the MXBean.
     *
     * @throws NotCompliantMBeanException The specified class is
     * not a JMX compliant MXBean.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static <T> Class<? super T> getStandardMBeanInterface(Class<T> baseClass)

    /**
     * Get the MBean interface implemented by a JMX Standard MBean class.
     *
     * @param baseClass The class to be tested.
     *
     * @return The MBean interface implemented by the Standard MBean.
     *
     * @throws NotCompliantMBeanException The specified class is
     * not a JMX compliant Standard MBean.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static Class<?> getMBeanInterface(Class<?> baseClass) {

    /**
     * Get the MBean interface implemented by a JMX Standard
     * MBean class. This method is only called by the legacy
     * code in "com.sun.management.jmx".
     *
     * @param baseClass The class to be tested.
     *
     * @return The MBean interface implemented by the MBean.
     *         Return <code>null</code> if the MBean is a DynamicMBean,
     *         or if no MBean interface is found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static synchronized MBeanInfo

    /**
     * Basic method for testing if a given class is a JMX compliant
     * Standard MBean.  This method is only called by the legacy code
     * in com.sun.management.jmx.
     *
     * @param baseClass The class to be tested.
     *
     * @param mbeanInterface the MBean interface that the class implements,
     * or null if the interface must be determined by introspection.
     *
     * @return the computed {@link javax.management.MBeanInfo}.
     * @exception NotCompliantMBeanException The specified class is not a
     *            JMX compliant Standard MBean
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static void testComplianceMBeanInterface(Class<?> interfaceClass)

    /**
     * Tests the given interface class for being a compliant MBean interface.
     * A compliant MBean interface is any publicly accessible interface
     * following the {@code MBean} conventions.
     * @param interfaceClass An interface class to test for the MBean compliance
     * @throws NotCompliantMBeanException Thrown when the tested interface
     * is not public or contradicts the {@code MBean} conventions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static void testComplianceMXBeanInterface(Class<?> interfaceClass)

    /**
     * Tests the given interface class for being a compliant MXBean interface.
     * A compliant MXBean interface is any publicly accessible interface
     * following the {@link MXBean} conventions.
     * @param interfaceClass An interface class to test for the MXBean compliance
     * @throws NotCompliantMBeanException Thrown when the tested interface
     * is not public or contradicts the {@link MXBean} conventions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static MBeanInfo testCompliance(Class<?> baseClass)

    /**
     * Basic method for testing if a given class is a JMX compliant MBean.
     *
     * @param baseClass The class to be tested
     *
     * @return <code>null</code> if the MBean is a DynamicMBean,
     *         the computed {@link javax.management.MBeanInfo} otherwise.
     * @exception NotCompliantMBeanException The specified class is not a
     *            JMX compliant MBean
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static void testCreation(Class<?> c)

    /**
     * Basic method for testing that a MBean of a given class can be
     * instantiated by the MBean server.<p>
     * This method checks that:
     * <ul><li>The given class is a concrete class.</li>
     *     <li>The given class exposes at least one public constructor.</li>
     * </ul>
     * If these conditions are not met, throws a NotCompliantMBeanException.
     * @param c The class of the MBean we want to create.
     * @exception NotCompliantMBeanException if the MBean class makes it
     *            impossible to instantiate the MBean from within the
     *            MBeanServer.
     *
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
    public static final boolean isDynamic(final Class<?> c) {

    /**
     * Tell whether a MBean of the given class is a Dynamic MBean.
     * This method does nothing more than returning
     * <pre>
     * javax.management.DynamicMBean.class.isAssignableFrom(c)
     * </pre>
     * This method does not check for any JMX MBean compliance:
     * <ul><li>If <code>true</code> is returned, then instances of
     *     <code>c</code> are DynamicMBean.</li>
     *     <li>If <code>false</code> is returned, then no further
     *     assumption can be made on instances of <code>c</code>.
     *     In particular, instances of <code>c</code> may, or may not
     *     be JMX standard MBeans.</li>
     * </ul>
     * @param c The class of the MBean under examination.
     * @return <code>true</code> if instances of <code>c</code> are
     *         Dynamic MBeans, <code>false</code> otherwise.
     *
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/Introspector.java
public class Introspector {

/**
 * This class contains the methods for performing all the tests needed to verify
 * that a class represents a JMX compliant MBean.
 *
 * @since 1.5
 */
