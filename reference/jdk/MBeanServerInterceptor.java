_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public ClassLoaderRepository getClassLoaderRepository();

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    @Deprecated

    /**
     * This method should never be called.
     * Usually hrows UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    @Deprecated

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    @Deprecated

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public Object instantiate(String className, ObjectName loaderName,
            Object[] params, String[] signature)

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public Object instantiate(String className, Object[] params,
            String[] signature) throws ReflectionException, MBeanException;

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public Object instantiate(String className, ObjectName loaderName)

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
public interface MBeanServerInterceptor extends MBeanServer {

/**
 * <p>This interface specifies the behavior to be implemented by an
 * MBean Server Interceptor.  An MBean Server Interceptor has
 * essentially the same interface as an MBean Server.  An MBean Server
 * forwards received requests to its default interceptor, which may
 * handle them itself or forward them to other interceptors.  The
 * default interceptor may be changed via the {@link
 * com.sun.jmx.mbeanserver.SunJmxMBeanServer#setMBeanServerInterceptor}
 * method.</p>
 *
 * <p>The initial default interceptor provides the standard MBean
 * Server behavior.  It handles a collection of named MBeans, each
 * represented by a Java object.  A replacement default interceptor
 * may build on this behavior, for instance by adding logging or
 * security checks, before forwarding requests to the initial default
 * interceptor.  Or, it may route each request to one of a number of
 * sub-interceptors, for instance based on the {@link ObjectName} in
 * the request.</p>
 *
 * <p>An interceptor, default or not, need not implement MBeans as
 * Java objects, in the way that the initial default interceptor does.
 * It may instead implement <em>virtual MBeans</em>, which do not
 * exist as Java objects when they are not in use.  For example, these
 * MBeans could be implemented by forwarding requests to a database,
 * or to a remote MBean server, or by performing system calls to query
 * or modify system resources.</p>
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public ClassLoaderRepository getClassLoaderRepository();

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    @Deprecated

    /**
     * This method should never be called.
     * Usually hrows UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    @Deprecated

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    @Deprecated

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public Object instantiate(String className, ObjectName loaderName,
            Object[] params, String[] signature)

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public Object instantiate(String className, Object[] params,
            String[] signature) throws ReflectionException, MBeanException;

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
    public Object instantiate(String className, ObjectName loaderName)

    /**
     * This method should never be called.
     * Usually throws UnsupportedOperationException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/MBeanServerInterceptor.java
public interface MBeanServerInterceptor extends MBeanServer {

/**
 * <p>This interface specifies the behavior to be implemented by an
 * MBean Server Interceptor.  An MBean Server Interceptor has
 * essentially the same interface as an MBean Server.  An MBean Server
 * forwards received requests to its default interceptor, which may
 * handle them itself or forward them to other interceptors.  The
 * default interceptor may be changed via the {@link
 * com.sun.jmx.mbeanserver.SunJmxMBeanServer#setMBeanServerInterceptor}
 * method.</p>
 *
 * <p>The initial default interceptor provides the standard MBean
 * Server behavior.  It handles a collection of named MBeans, each
 * represented by a Java object.  A replacement default interceptor
 * may build on this behavior, for instance by adding logging or
 * security checks, before forwarding requests to the initial default
 * interceptor.  Or, it may route each request to one of a number of
 * sub-interceptors, for instance based on the {@link ObjectName} in
 * the request.</p>
 *
 * <p>An interceptor, default or not, need not implement MBeans as
 * Java objects, in the way that the initial default interceptor does.
 * It may instead implement <em>virtual MBeans</em>, which do not
 * exist as Java objects when they are not in use.  For example, these
 * MBeans could be implemented by forwarding requests to a database,
 * or to a remote MBean server, or by performing system calls to query
 * or modify system resources.</p>
 *
 * @since 1.5
 */
