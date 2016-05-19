_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/DynamicMBean2.java
    public void registerFailed();

    /**
     * Additional registration hook.  This method is called if preRegister
     * and preRegister2 succeed, but then the MBean cannot be registered
     * (for example because there is already another MBean of the same name).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/DynamicMBean2.java
    public void preRegister2(MBeanServer mbs, ObjectName name)

    /**
     * Additional registration hook.  This method is called after
     * {@link javax.management.MBeanRegistration#preRegister preRegister}.
     * Unlike that method, if it throws an exception and the MBean implements
     * {@code MBeanRegistration}, then {@link
     * javax.management.MBeanRegistration#postRegister postRegister(false)}
     * will be called on the MBean.  This is the behavior that the MBean
     * expects for a problem that does not come from its own preRegister
     * method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/DynamicMBean2.java
    public String getClassName();

    /**
     * The name of this MBean's class, as used by permission checks.
     * This is typically equal to getResource().getClass().getName().
     * This method is typically faster, sometimes much faster,
     * than getMBeanInfo().getClassName(), but should return the same
     * result.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/DynamicMBean2.java
    public Object getResource();

    /**
     * The resource corresponding to this MBean.  This is the object whose
     * class name should be reflected by the MBean's
     * getMBeanInfo().getClassName() for example.  For a "plain"
     * DynamicMBean it will be "this".  For an MBean that wraps another
     * object, like javax.management.StandardMBean, it will be the wrapped
     * object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/DynamicMBean2.java
public interface DynamicMBean2 extends DynamicMBean {

/**
 * A dynamic MBean that wraps an underlying resource.  A version of this
 * interface might eventually appear in the public JMX API.
 *
 * @since 1.6
 */
