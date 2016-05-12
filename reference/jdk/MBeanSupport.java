_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanSupport.java
    abstract Object getCookie();

    /**
     * Return a cookie for this MBean.  This cookie will be passed to
     * MBean method invocations where it can supply additional information
     * to the invocation.  For example, with MXBeans it can be used to
     * supply the MXBeanLookup context for resolving inter-MXBean references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanSupport.java
    abstract MBeanIntrospector<M> getMBeanIntrospector();

    /** Return the appropriate introspector for this type of MBean. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanSupport.java
/*

/**
 * Base class for MBeans.  There is one instance of this class for
 * every Standard MBean and every MXBean.  We try to limit the amount
 * of information per instance so we can handle very large numbers of
 * MBeans comfortably.
 *
 * @param <M> either Method or ConvertingMethod, for Standard MBeans
 * and MXBeans respectively.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanSupport.java
    abstract Object getCookie();

    /**
     * Return a cookie for this MBean.  This cookie will be passed to
     * MBean method invocations where it can supply additional information
     * to the invocation.  For example, with MXBeans it can be used to
     * supply the MXBeanLookup context for resolving inter-MXBean references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanSupport.java
    abstract MBeanIntrospector<M> getMBeanIntrospector();

    /** Return the appropriate introspector for this type of MBean. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanSupport.java
/*

/**
 * Base class for MBeans.  There is one instance of this class for
 * every Standard MBean and every MXBean.  We try to limit the amount
 * of information per instance so we can handle very large numbers of
 * MBeans comfortably.
 *
 * @param <M> either Method or ConvertingMethod, for Standard MBeans
 * and MXBeans respectively.
 *
 * @since 1.6
 */
