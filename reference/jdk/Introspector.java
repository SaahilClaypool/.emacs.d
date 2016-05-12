_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Method getReadMethod(Object pd) {

        /**
         * Invokes java.beans.PropertyDescriptor.getReadMethod()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static String getPropertyName(Object pd) {

        /**
         * Invokes java.beans.PropertyDescriptor.getName()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Object[] getPropertyDescriptors(Object bi) {

        /**
         * Invokes java.beans.BeanInfo.getPropertyDescriptors()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Object getBeanInfo(Class<?> clazz) throws Exception {

        /**
         * Invokes java.beans.Introspector.getBeanInfo(Class)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static boolean isAvailable() {

        /**
         * Returns {@code true} if java.beans is available.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static class BeansHelper {

    /**
     * A class that provides access to the JavaBeans Introspector and
     * PropertyDescriptors without creating a static dependency on java.beans.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Method getReadMethod(Class<?> clazz, String property) {

        /**
         * Returns the "getter" to read the given property from the given class or
         * {@code null} if no method is found.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static List<Method> getReadMethods(Class<?> clazz) {

        /**
         * Returns the list of "getter" methods for the given class. The list
         * is ordered so that isXXX methods appear before getXXX methods - this
         * is for compatibility with the JavaBeans Introspector.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static boolean isReadMethod(Method method) {

        /**
         * Returns {@code true} if the given method is a "getter" method (where
         * "getter" method is a public method of the form getXXX or "boolean
         * isXXX")
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        private static List<Method> getCachedMethods(Class<?> clazz) {

        /**
         * Returns the list of methods cached for the given class, or {@code null}
         * if not cached.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static class SimpleIntrospector {

    /**
     * A simple introspector that uses reflection to analyze a class and
     * identify its "getter" methods. This class is intended for use only when
     * Java Beans is not present (which implies that there isn't explicit
     * information about the bean available).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static <T> Class<? super T> implementsMBean(Class<T> c, String clName) {

    /**
     * Returns the XXMBean interface or null if no such interface exists
     *
     * @param c The interface to be tested
     * @param clName The name of the class implementing this interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static <T> Class<? super T> findMBeanInterface(
            Class<T> aClass, String aName) {

    /**
     * Try to find the MBean interface corresponding to the class aName
     * - i.e. <i>aName</i>MBean, from within aClass and its superclasses.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
public class Introspector {

/**
 * This class contains the methods for performing all the tests needed to verify
 * that a class represents a JMX compliant MBean.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    GenericBeanInfo(GenericBeanInfo old) {

    /**
     * Package-private dup constructor
     * This must isolate the new object from any changes to the old object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
class GenericBeanInfo extends SimpleBeanInfo {

/**
 * Package private implementation support class for Introspector's
 * internal use.
 * <p>
 * Mostly this is used as a placeholder for the descriptors.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static Object instantiate(Class<?> sibling, String className)

    /**
     * Try to create an instance of a named class.
     * First try the classloader of "sibling", then try the system
     * classloader then the class loader of the current Thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private boolean throwsException(Method method, Class<?> exception) {

    /**
     * Return true iff the given method throws the given exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static  boolean isSubclass(Class<?> a, Class<?> b) {

    /**
     * Return true if class a is either equivalent to class b, or
     * if class a is a subclass of class b, i.e. if a either "extends"
     * or "implements" b.
     * Note tht either or both "Class" objects may represent interfaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static Method findMethod(Class<?> cls, String methodName, int argCount,
                             Class args[]) {

    /**
     * Find a target methodName with specific parameter list on a given class.
     * <p>
     * Used in the contructors of the EventSetDescriptor,
     * PropertyDescriptor and the IndexedPropertyDescriptor.
     * <p>
     * @param cls The Class object on which to retrieve the method.
     * @param methodName Name of the method.
     * @param argCount Number of arguments for the desired method.
     * @param args Array of argument types for the method.
     * @return the method or null if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static Method findMethod(Class<?> cls, String methodName, int argCount) {

    /**
     * Find a target methodName on a given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private static Method internalFindMethod(Class<?> start, String methodName,
                                                 int argCount, Class args[]) {

    /**
     * Internal support for finding a target methodName with a given
     * parameter list on a given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private static String makeQualifiedMethodName(String name, String[] params) {

    /**
     * Creates a key for a method in a method cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private MethodDescriptor[] getTargetMethodInfo() {

    /**
     * @return An array of MethodDescriptors describing the private
     * methods supported by the target bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private EventSetDescriptor[] getTargetEventInfo() throws IntrospectionException {

    /**
     * @return An array of EventSetDescriptors describing the kinds of
     * events fired by the target bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private PropertyDescriptor mergePropertyDescriptor(IndexedPropertyDescriptor ipd,
                                                       PropertyDescriptor pd) {

    /**
     * Adds the property descriptor to the indexedproperty descriptor only if the
     * types are the same.
     *
     * The most specific property descriptor will take precedence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private void processPropertyDescriptors() {

    /**
     * Populates the property descriptor table by merging the
     * lists of Property descriptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private void addPropertyDescriptor(PropertyDescriptor pd) {

    /**
     * Adds the property descriptor to the list store.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private PropertyDescriptor[] getTargetPropertyInfo() {

    /**
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by the target bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private static BeanInfo findExplicitBeanInfo(Class<?> beanClass) {

    /**
     * Looks for an explicit BeanInfo class that corresponds to the Class.
     * First it looks in the existing package that the Class is defined in,
     * then it checks to see if the class is its own BeanInfo. Finally,
     * the BeanInfo search path is prepended to the class and searched.
     *
     * @param beanClass  the class type of the bean
     * @return Instance of an explicit BeanInfo class or null if one isn't found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private BeanInfo getBeanInfo() throws IntrospectionException {

    /**
     * Constructs a GenericBeanInfo class from the state of the Introspector
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static void flushFromCaches(Class<?> clz) {

    /**
     * Flush the Introspector's internal cached information for a given class.
     * This method is not normally required.  It is normally only needed
     * by advanced tools that update existing "Class" objects in-place
     * and need to make the Introspector re-analyze an existing Class object.
     *
     * Note that only the direct state associated with the target Class
     * object is flushed.  We do not flush state for other Class objects
     * with the same name, nor do we flush state for any related Class
     * objects (such as subclasses), even though their state may include
     * information indirectly obtained from the target Class object.
     *
     * @param clz  Class object to be flushed.
     * @throws NullPointerException If the Class object is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static void flushCaches() {

    /**
     * Flush all of the Introspector's internal caches.  This method is
     * not normally required.  It is normally only needed by advanced
     * tools that update existing "Class" objects in-place and need
     * to make the Introspector re-analyze existing Class objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static void setBeanInfoSearchPath(String[] path) {

    /**
     * Change the list of package names that will be used for
     *          finding BeanInfo classes.  The behaviour of
     *          this method is undefined if parameter path
     *          is null.
     *
     * <p>First, if there is a security manager, its <code>checkPropertiesAccess</code>
     * method is called. This could result in a SecurityException.
     *
     * @param path  Array of package names.
     * @exception  SecurityException  if a security manager exists and its
     *             <code>checkPropertiesAccess</code> method doesn't allow setting
     *              of system properties.
     * @see SecurityManager#checkPropertiesAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static String[] getBeanInfoSearchPath() {

    /**
     * Gets the list of package names that will be used for
     *          finding BeanInfo classes.
     *
     * @return  The array of package names that will be searched in
     *          order to find BeanInfo classes. The default value
     *          for this array is implementation-dependent; e.g.
     *          Sun implementation initially sets to {"sun.beans.infos"}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static String decapitalize(String name) {

    /**
     * Utility method to take a string and convert it to normal Java variable
     * name capitalization.  This normally means converting the first
     * character from upper case to lower case, but in the (unusual) special
     * case when there is more than one character and both the first and
     * second characters are upper case, we leave it alone.
     * <p>
     * Thus "FooBah" becomes "fooBah" and "X" becomes "x", but "URL" stays
     * as "URL".
     *
     * @param  name The string to be decapitalized.
     * @return  The decapitalized version of the string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass, Class<?> stopClass,
                                        int flags) throws IntrospectionException {

    /**
     * Introspect on a Java Bean and learn about all its properties,
     * exposed methods and events, below a given {@code stopClass} point
     * subject to some control {@code flags}.
     * <dl>
     *  <dt>USE_ALL_BEANINFO</dt>
     *  <dd>Any BeanInfo that can be discovered will be used.</dd>
     *  <dt>IGNORE_IMMEDIATE_BEANINFO</dt>
     *  <dd>Any BeanInfo associated with the specified {@code beanClass} will be ignored.</dd>
     *  <dt>IGNORE_ALL_BEANINFO</dt>
     *  <dd>Any BeanInfo associated with the specified {@code beanClass}
     *      or any of its parent classes will be ignored.</dd>
     * </dl>
     * Any methods/properties/events in the {@code stopClass}
     * or in its parent classes will be ignored in the analysis.
     * <p>
     * If the BeanInfo class for a Java Bean has been
     * previously introspected based on the same arguments then
     * the BeanInfo class is retrieved from the BeanInfo cache.
     *
     * @param beanClass  the bean class to be analyzed
     * @param stopClass  the parent class at which to stop the analysis
     * @param flags      flags to control the introspection
     * @return a BeanInfo object describing the target bean
     * @exception IntrospectionException if an exception occurs during introspection
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass, Class<?> stopClass)

    /**
     * Introspect on a Java bean and learn all about its properties, exposed
     * methods, below a given "stop" point.
     * <p>
     * If the BeanInfo class for a Java Bean has been previously Introspected
     * based on the same arguments, then the BeanInfo class is retrieved
     * from the BeanInfo cache.
     * @return the BeanInfo for the bean
     * @param beanClass The bean class to be analyzed.
     * @param stopClass The baseclass at which to stop the analysis.  Any
     *    methods/properties/events in the stopClass or in its baseclasses
     *    will be ignored in the analysis.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass, int flags)

    /**
     * Introspect on a Java bean and learn about all its properties, exposed
     * methods, and events, subject to some control flags.
     * <p>
     * If the BeanInfo class for a Java Bean has been previously Introspected
     * based on the same arguments then the BeanInfo class is retrieved
     * from the BeanInfo cache.
     *
     * @param beanClass  The bean class to be analyzed.
     * @param flags  Flags to control the introspection.
     *     If flags == USE_ALL_BEANINFO then we use all of the BeanInfo
     *          classes we can discover.
     *     If flags == IGNORE_IMMEDIATE_BEANINFO then we ignore any
     *           BeanInfo associated with the specified beanClass.
     *     If flags == IGNORE_ALL_BEANINFO then we ignore all BeanInfo
     *           associated with the specified beanClass or any of its
     *           parent classes.
     * @return  A BeanInfo object describing the target bean.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass)

    /**
     * Introspect on a Java Bean and learn about all its properties, exposed
     * methods, and events.
     * <p>
     * If the BeanInfo class for a Java Bean has been previously Introspected
     * then the BeanInfo class is retrieved from the BeanInfo cache.
     *
     * @param beanClass  The bean class to be analyzed.
     * @return  A BeanInfo object describing the target bean.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     * @see #flushCaches
     * @see #flushFromCaches
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public final static int IGNORE_ALL_BEANINFO        = 3;

    /**
     * Flag to indicate to ignore all beaninfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public final static int USE_ALL_BEANINFO           = 1;

    /**
     * Flag to indicate to use of all beaninfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
public class Introspector {

/**
 * The Introspector class provides a standard way for tools to learn about
 * the properties, events, and methods supported by a target Java Bean.
 * <p>
 * For each of those three kinds of information, the Introspector will
 * separately analyze the bean's class and superclasses looking for
 * either explicit or implicit information and use that information to
 * build a BeanInfo object that comprehensively describes the target bean.
 * <p>
 * For each class "Foo", explicit information may be available if there exists
 * a corresponding "FooBeanInfo" class that provides a non-null value when
 * queried for the information.   We first look for the BeanInfo class by
 * taking the full package-qualified name of the target bean class and
 * appending "BeanInfo" to form a new class name.  If this fails, then
 * we take the final classname component of this name, and look for that
 * class in each of the packages specified in the BeanInfo package search
 * path.
 * <p>
 * Thus for a class such as "sun.xyz.OurButton" we would first look for a
 * BeanInfo class called "sun.xyz.OurButtonBeanInfo" and if that failed we'd
 * look in each package in the BeanInfo search path for an OurButtonBeanInfo
 * class.  With the default search path, this would mean looking for
 * "sun.beans.infos.OurButtonBeanInfo".
 * <p>
 * If a class provides explicit BeanInfo about itself then we add that to
 * the BeanInfo information we obtained from analyzing any derived classes,
 * but we regard the explicit information as being definitive for the current
 * class and its base classes, and do not proceed any further up the superclass
 * chain.
 * <p>
 * If we don't find explicit BeanInfo on a class, we use low-level
 * reflection to study the methods of the class and apply standard design
 * patterns to identify property accessors, event sources, or public
 * methods.  We then proceed to analyze the class's superclass and add
 * in the information from it (and possibly on up the superclass chain).
 * <p>
 * For more information about introspection and design patterns, please
 * consult the
 *  <a href="http://www.oracle.com/technetwork/java/javase/documentation/spec-136004.html">JavaBeans&trade; specification</a>.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Method getReadMethod(Object pd) {

        /**
         * Invokes java.beans.PropertyDescriptor.getReadMethod()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static String getPropertyName(Object pd) {

        /**
         * Invokes java.beans.PropertyDescriptor.getName()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Object[] getPropertyDescriptors(Object bi) {

        /**
         * Invokes java.beans.BeanInfo.getPropertyDescriptors()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Object getBeanInfo(Class<?> clazz) throws Exception {

        /**
         * Invokes java.beans.Introspector.getBeanInfo(Class)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static boolean isAvailable() {

        /**
         * Returns {@code true} if java.beans is available.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static class BeansHelper {

    /**
     * A class that provides access to the JavaBeans Introspector and
     * PropertyDescriptors without creating a static dependency on java.beans.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static Method getReadMethod(Class<?> clazz, String property) {

        /**
         * Returns the "getter" to read the given property from the given class or
         * {@code null} if no method is found.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static List<Method> getReadMethods(Class<?> clazz) {

        /**
         * Returns the list of "getter" methods for the given class. The list
         * is ordered so that isXXX methods appear before getXXX methods - this
         * is for compatibility with the JavaBeans Introspector.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        static boolean isReadMethod(Method method) {

        /**
         * Returns {@code true} if the given method is a "getter" method (where
         * "getter" method is a public method of the form getXXX or "boolean
         * isXXX")
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
        private static List<Method> getCachedMethods(Class<?> clazz) {

        /**
         * Returns the list of methods cached for the given class, or {@code null}
         * if not cached.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static class SimpleIntrospector {

    /**
     * A simple introspector that uses reflection to analyze a class and
     * identify its "getter" methods. This class is intended for use only when
     * Java Beans is not present (which implies that there isn't explicit
     * information about the bean available).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static <T> Class<? super T> implementsMBean(Class<T> c, String clName) {

    /**
     * Returns the XXMBean interface or null if no such interface exists
     *
     * @param c The interface to be tested
     * @param clName The name of the class implementing this interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
    private static <T> Class<? super T> findMBeanInterface(
            Class<T> aClass, String aName) {

    /**
     * Try to find the MBean interface corresponding to the class aName
     * - i.e. <i>aName</i>MBean, from within aClass and its superclasses.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Introspector.java
public class Introspector {

/**
 * This class contains the methods for performing all the tests needed to verify
 * that a class represents a JMX compliant MBean.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    GenericBeanInfo(GenericBeanInfo old) {

    /**
     * Package-private dup constructor
     * This must isolate the new object from any changes to the old object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
class GenericBeanInfo extends SimpleBeanInfo {

/**
 * Package private implementation support class for Introspector's
 * internal use.
 * <p>
 * Mostly this is used as a placeholder for the descriptors.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static Object instantiate(Class<?> sibling, String className)

    /**
     * Try to create an instance of a named class.
     * First try the classloader of "sibling", then try the system
     * classloader then the class loader of the current Thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private boolean throwsException(Method method, Class<?> exception) {

    /**
     * Return true iff the given method throws the given exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static  boolean isSubclass(Class<?> a, Class<?> b) {

    /**
     * Return true if class a is either equivalent to class b, or
     * if class a is a subclass of class b, i.e. if a either "extends"
     * or "implements" b.
     * Note tht either or both "Class" objects may represent interfaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static Method findMethod(Class<?> cls, String methodName, int argCount,
                             Class args[]) {

    /**
     * Find a target methodName with specific parameter list on a given class.
     * <p>
     * Used in the contructors of the EventSetDescriptor,
     * PropertyDescriptor and the IndexedPropertyDescriptor.
     * <p>
     * @param cls The Class object on which to retrieve the method.
     * @param methodName Name of the method.
     * @param argCount Number of arguments for the desired method.
     * @param args Array of argument types for the method.
     * @return the method or null if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    static Method findMethod(Class<?> cls, String methodName, int argCount) {

    /**
     * Find a target methodName on a given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private static Method internalFindMethod(Class<?> start, String methodName,
                                                 int argCount, Class args[]) {

    /**
     * Internal support for finding a target methodName with a given
     * parameter list on a given class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private static String makeQualifiedMethodName(String name, String[] params) {

    /**
     * Creates a key for a method in a method cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private MethodDescriptor[] getTargetMethodInfo() {

    /**
     * @return An array of MethodDescriptors describing the private
     * methods supported by the target bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private EventSetDescriptor[] getTargetEventInfo() throws IntrospectionException {

    /**
     * @return An array of EventSetDescriptors describing the kinds of
     * events fired by the target bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private PropertyDescriptor mergePropertyDescriptor(IndexedPropertyDescriptor ipd,
                                                       PropertyDescriptor pd) {

    /**
     * Adds the property descriptor to the indexedproperty descriptor only if the
     * types are the same.
     *
     * The most specific property descriptor will take precedence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private void processPropertyDescriptors() {

    /**
     * Populates the property descriptor table by merging the
     * lists of Property descriptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private void addPropertyDescriptor(PropertyDescriptor pd) {

    /**
     * Adds the property descriptor to the list store.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private PropertyDescriptor[] getTargetPropertyInfo() {

    /**
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by the target bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private static BeanInfo findExplicitBeanInfo(Class<?> beanClass) {

    /**
     * Looks for an explicit BeanInfo class that corresponds to the Class.
     * First it looks in the existing package that the Class is defined in,
     * then it checks to see if the class is its own BeanInfo. Finally,
     * the BeanInfo search path is prepended to the class and searched.
     *
     * @param beanClass  the class type of the bean
     * @return Instance of an explicit BeanInfo class or null if one isn't found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    private BeanInfo getBeanInfo() throws IntrospectionException {

    /**
     * Constructs a GenericBeanInfo class from the state of the Introspector
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static void flushFromCaches(Class<?> clz) {

    /**
     * Flush the Introspector's internal cached information for a given class.
     * This method is not normally required.  It is normally only needed
     * by advanced tools that update existing "Class" objects in-place
     * and need to make the Introspector re-analyze an existing Class object.
     *
     * Note that only the direct state associated with the target Class
     * object is flushed.  We do not flush state for other Class objects
     * with the same name, nor do we flush state for any related Class
     * objects (such as subclasses), even though their state may include
     * information indirectly obtained from the target Class object.
     *
     * @param clz  Class object to be flushed.
     * @throws NullPointerException If the Class object is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static void flushCaches() {

    /**
     * Flush all of the Introspector's internal caches.  This method is
     * not normally required.  It is normally only needed by advanced
     * tools that update existing "Class" objects in-place and need
     * to make the Introspector re-analyze existing Class objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static void setBeanInfoSearchPath(String[] path) {

    /**
     * Change the list of package names that will be used for
     *          finding BeanInfo classes.  The behaviour of
     *          this method is undefined if parameter path
     *          is null.
     *
     * <p>First, if there is a security manager, its <code>checkPropertiesAccess</code>
     * method is called. This could result in a SecurityException.
     *
     * @param path  Array of package names.
     * @exception  SecurityException  if a security manager exists and its
     *             <code>checkPropertiesAccess</code> method doesn't allow setting
     *              of system properties.
     * @see SecurityManager#checkPropertiesAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static String[] getBeanInfoSearchPath() {

    /**
     * Gets the list of package names that will be used for
     *          finding BeanInfo classes.
     *
     * @return  The array of package names that will be searched in
     *          order to find BeanInfo classes. The default value
     *          for this array is implementation-dependent; e.g.
     *          Sun implementation initially sets to {"sun.beans.infos"}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static String decapitalize(String name) {

    /**
     * Utility method to take a string and convert it to normal Java variable
     * name capitalization.  This normally means converting the first
     * character from upper case to lower case, but in the (unusual) special
     * case when there is more than one character and both the first and
     * second characters are upper case, we leave it alone.
     * <p>
     * Thus "FooBah" becomes "fooBah" and "X" becomes "x", but "URL" stays
     * as "URL".
     *
     * @param  name The string to be decapitalized.
     * @return  The decapitalized version of the string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass, Class<?> stopClass,
                                        int flags) throws IntrospectionException {

    /**
     * Introspect on a Java Bean and learn about all its properties,
     * exposed methods and events, below a given {@code stopClass} point
     * subject to some control {@code flags}.
     * <dl>
     *  <dt>USE_ALL_BEANINFO</dt>
     *  <dd>Any BeanInfo that can be discovered will be used.</dd>
     *  <dt>IGNORE_IMMEDIATE_BEANINFO</dt>
     *  <dd>Any BeanInfo associated with the specified {@code beanClass} will be ignored.</dd>
     *  <dt>IGNORE_ALL_BEANINFO</dt>
     *  <dd>Any BeanInfo associated with the specified {@code beanClass}
     *      or any of its parent classes will be ignored.</dd>
     * </dl>
     * Any methods/properties/events in the {@code stopClass}
     * or in its parent classes will be ignored in the analysis.
     * <p>
     * If the BeanInfo class for a Java Bean has been
     * previously introspected based on the same arguments then
     * the BeanInfo class is retrieved from the BeanInfo cache.
     *
     * @param beanClass  the bean class to be analyzed
     * @param stopClass  the parent class at which to stop the analysis
     * @param flags      flags to control the introspection
     * @return a BeanInfo object describing the target bean
     * @exception IntrospectionException if an exception occurs during introspection
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass, Class<?> stopClass)

    /**
     * Introspect on a Java bean and learn all about its properties, exposed
     * methods, below a given "stop" point.
     * <p>
     * If the BeanInfo class for a Java Bean has been previously Introspected
     * based on the same arguments, then the BeanInfo class is retrieved
     * from the BeanInfo cache.
     * @return the BeanInfo for the bean
     * @param beanClass The bean class to be analyzed.
     * @param stopClass The baseclass at which to stop the analysis.  Any
     *    methods/properties/events in the stopClass or in its baseclasses
     *    will be ignored in the analysis.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass, int flags)

    /**
     * Introspect on a Java bean and learn about all its properties, exposed
     * methods, and events, subject to some control flags.
     * <p>
     * If the BeanInfo class for a Java Bean has been previously Introspected
     * based on the same arguments then the BeanInfo class is retrieved
     * from the BeanInfo cache.
     *
     * @param beanClass  The bean class to be analyzed.
     * @param flags  Flags to control the introspection.
     *     If flags == USE_ALL_BEANINFO then we use all of the BeanInfo
     *          classes we can discover.
     *     If flags == IGNORE_IMMEDIATE_BEANINFO then we ignore any
     *           BeanInfo associated with the specified beanClass.
     *     If flags == IGNORE_ALL_BEANINFO then we ignore all BeanInfo
     *           associated with the specified beanClass or any of its
     *           parent classes.
     * @return  A BeanInfo object describing the target bean.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public static BeanInfo getBeanInfo(Class<?> beanClass)

    /**
     * Introspect on a Java Bean and learn about all its properties, exposed
     * methods, and events.
     * <p>
     * If the BeanInfo class for a Java Bean has been previously Introspected
     * then the BeanInfo class is retrieved from the BeanInfo cache.
     *
     * @param beanClass  The bean class to be analyzed.
     * @return  A BeanInfo object describing the target bean.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     * @see #flushCaches
     * @see #flushFromCaches
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public final static int IGNORE_ALL_BEANINFO        = 3;

    /**
     * Flag to indicate to ignore all beaninfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
    public final static int USE_ALL_BEANINFO           = 1;

    /**
     * Flag to indicate to use of all beaninfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Introspector.java
public class Introspector {

/**
 * The Introspector class provides a standard way for tools to learn about
 * the properties, events, and methods supported by a target Java Bean.
 * <p>
 * For each of those three kinds of information, the Introspector will
 * separately analyze the bean's class and superclasses looking for
 * either explicit or implicit information and use that information to
 * build a BeanInfo object that comprehensively describes the target bean.
 * <p>
 * For each class "Foo", explicit information may be available if there exists
 * a corresponding "FooBeanInfo" class that provides a non-null value when
 * queried for the information.   We first look for the BeanInfo class by
 * taking the full package-qualified name of the target bean class and
 * appending "BeanInfo" to form a new class name.  If this fails, then
 * we take the final classname component of this name, and look for that
 * class in each of the packages specified in the BeanInfo package search
 * path.
 * <p>
 * Thus for a class such as "sun.xyz.OurButton" we would first look for a
 * BeanInfo class called "sun.xyz.OurButtonBeanInfo" and if that failed we'd
 * look in each package in the BeanInfo search path for an OurButtonBeanInfo
 * class.  With the default search path, this would mean looking for
 * "sun.beans.infos.OurButtonBeanInfo".
 * <p>
 * If a class provides explicit BeanInfo about itself then we add that to
 * the BeanInfo information we obtained from analyzing any derived classes,
 * but we regard the explicit information as being definitive for the current
 * class and its base classes, and do not proceed any further up the superclass
 * chain.
 * <p>
 * If we don't find explicit BeanInfo on a class, we use low-level
 * reflection to study the methods of the class and apply standard design
 * patterns to identify property accessors, event sources, or public
 * methods.  We then proceed to analyze the class's superclass and add
 * in the information from it (and possibly on up the superclass chain).
 * <p>
 * For more information about introspection and design patterns, please
 * consult the
 *  <a href="http://www.oracle.com/technetwork/java/javase/documentation/spec-136004.html">JavaBeans&trade; specification</a>.
 */
