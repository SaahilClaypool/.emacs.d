_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SunJmxMBeanServer.java
    public MBeanServerDelegate getMBeanServerDelegate();

    /**
     * <p>Return the MBeanServerDelegate representing the MBeanServer.
     * Notifications can be sent from the MBean server delegate using
     * the method {@link MBeanServerDelegate#sendNotification}
     * in the returned object.</p>
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SunJmxMBeanServer.java
    public void setMBeanServerInterceptor(MBeanServer interceptor);

    /**
     * Set the MBeanServerInterceptor.
     * @exception UnsupportedOperationException if
     *            {@link MBeanServerInterceptor}s
     *            are not enabled on this object.
     * @see #interceptorsEnabled
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SunJmxMBeanServer.java
    public MBeanServer getMBeanServerInterceptor();

    /**
     * Return the MBeanServerInterceptor.
     * @exception UnsupportedOperationException if
     *            {@link MBeanServerInterceptor}s
     *            are not enabled on this object.
     * @see #interceptorsEnabled
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SunJmxMBeanServer.java
    public boolean interceptorsEnabled();

    /**
     * Tell whether {@link MBeanServerInterceptor}s are enabled on this
     * object.
     * @return <code>true</code> if {@link MBeanServerInterceptor}s are
     *         enabled.
     * @see #getMBeanServerInterceptor
     * @see #setMBeanServerInterceptor
     * @see #getMBeanInstantiator
     * @see com.sun.jmx.mbeanserver.JmxMBeanServerBuilder
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SunJmxMBeanServer.java
    public MBeanInstantiator getMBeanInstantiator();

    /**
     * Return the MBeanInstantiator associated to this MBeanServer.
     * @exception UnsupportedOperationException if
     *            {@link MBeanServerInterceptor}s
     *            are not enabled on this object.
     * @see #interceptorsEnabled
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/SunJmxMBeanServer.java
public interface SunJmxMBeanServer

/**
 * Extends the MBeanServer interface to
 * provide methods for getting the MetaData and MBeanServerInstantiator
 * objects associated with an MBeanServer.
 *
 * @since 1.5
 */
