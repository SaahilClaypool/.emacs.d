_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanIntrospector.java
    private static boolean canUseOpenInfo(Type type) {

    /**
     * <p>True if this type can be faithfully represented in an
     * OpenMBean*Info.</p>
     *
     * <p>Compatibility with JSR 174 means that primitive types must be
     * represented by an MBean*Info whose getType() is the primitive type
     * string, e.g. "int".  If we used an OpenMBean*Info then this string
     * would be the wrapped type, e.g. "java.lang.Integer".</p>
     *
     * <p>Compatibility with JMX 1.2 (including J2SE 5.0) means that arrays
     * of primitive types cannot use an ArrayType representing an array of
     * primitives, because that didn't exist in JMX 1.2.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanIntrospector.java
class MXBeanIntrospector extends MBeanIntrospector<ConvertingMethod> {

/**
 * Introspector for MXBeans.  There is exactly one instance of this class.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanIntrospector.java
    private static boolean canUseOpenInfo(Type type) {

    /**
     * <p>True if this type can be faithfully represented in an
     * OpenMBean*Info.</p>
     *
     * <p>Compatibility with JSR 174 means that primitive types must be
     * represented by an MBean*Info whose getType() is the primitive type
     * string, e.g. "int".  If we used an OpenMBean*Info then this string
     * would be the wrapped type, e.g. "java.lang.Integer".</p>
     *
     * <p>Compatibility with JMX 1.2 (including J2SE 5.0) means that arrays
     * of primitive types cannot use an ArrayType representing an array of
     * primitives, because that didn't exist in JMX 1.2.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanIntrospector.java
class MXBeanIntrospector extends MBeanIntrospector<ConvertingMethod> {

/**
 * Introspector for MXBeans.  There is exactly one instance of this class.
 *
 * @since 1.6
 */
