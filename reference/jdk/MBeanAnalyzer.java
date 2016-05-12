_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanAnalyzer.java
    private static class MethodOrder implements Comparator<Method> {

    /**
     * A comparator that defines a total order so that methods have the
     * same name and identical signatures appear next to each others.
     * The methods are sorted in such a way that methods which
     * override each other will sit next to each other, with the
     * overridden method first - e.g. Object getFoo() is placed before
     * Integer getFoo(). This makes it possible to determine whether
     * a method overrides another one simply by looking at the method(s)
     * that precedes it in the list. (see eliminateCovariantMethods).
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanAnalyzer.java
    // Currently it's two different but equivalent objects.  This only

    /**
     * <p>Return an MBeanAnalyzer for the given MBean interface and
     * MBeanIntrospector.  Calling this method twice with the same
     * parameters may return the same object or two different but
     * equivalent objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanAnalyzer.java
class MBeanAnalyzer<M> {

/**
 * <p>An analyzer for a given MBean interface.  The analyzer can
 * be for Standard MBeans or MXBeans, depending on the MBeanIntrospector
 * passed at construction.
 *
 * <p>The analyzer can
 * visit the attributes and operations of the interface, calling
 * a caller-supplied visitor method for each one.</p>
 *
 * @param <M> Method or ConvertingMethod according as this is a
 * Standard MBean or an MXBean.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanAnalyzer.java
    private static class MethodOrder implements Comparator<Method> {

    /**
     * A comparator that defines a total order so that methods have the
     * same name and identical signatures appear next to each others.
     * The methods are sorted in such a way that methods which
     * override each other will sit next to each other, with the
     * overridden method first - e.g. Object getFoo() is placed before
     * Integer getFoo(). This makes it possible to determine whether
     * a method overrides another one simply by looking at the method(s)
     * that precedes it in the list. (see eliminateCovariantMethods).
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanAnalyzer.java
    // Currently it's two different but equivalent objects.  This only

    /**
     * <p>Return an MBeanAnalyzer for the given MBean interface and
     * MBeanIntrospector.  Calling this method twice with the same
     * parameters may return the same object or two different but
     * equivalent objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanAnalyzer.java
class MBeanAnalyzer<M> {

/**
 * <p>An analyzer for a given MBean interface.  The analyzer can
 * be for Standard MBeans or MXBeans, depending on the MBeanIntrospector
 * passed at construction.
 *
 * <p>The analyzer can
 * visit the attributes and operations of the interface, calling
 * a caller-supplied visitor method for each one.</p>
 *
 * @param <M> Method or ConvertingMethod according as this is a
 * Standard MBean or an MXBean.
 *
 * @since 1.6
 */
