_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/StandardMBeanSupport.java
    public <T> StandardMBeanSupport(T resource, Class<T> mbeanInterfaceType)

    /**
     * <p>Construct a Standard MBean that wraps the given resource using the
     * given Standard MBean interface.</p>
     *
     * @param resource the underlying resource for the new MBean.
     * @param mbeanInterfaceType the class or interface to be used to determine
     *       the MBean's management interface.  An interface if this is a
     *       classic Standard MBean; a class if this is a {@code @ManagedResource}.
     * @param <T> a type parameter that allows the compiler to check
     *       that {@code resource} implements {@code mbeanInterfaceType},
     *       provided that {@code mbeanInterfaceType} is a class constant like
     *       {@code SomeMBean.class}.
     * @throws IllegalArgumentException if {@code resource} is null or
     *       if it does not implement the class {@code mbeanInterfaceType} or if
     *       that class is not a valid Standard MBean interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/StandardMBeanSupport.java
public class StandardMBeanSupport extends MBeanSupport<Method> {

/**
 * Base class for Standard MBeans.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/StandardMBeanSupport.java
    public <T> StandardMBeanSupport(T resource, Class<T> mbeanInterfaceType)

    /**
     * <p>Construct a Standard MBean that wraps the given resource using the
     * given Standard MBean interface.</p>
     *
     * @param resource the underlying resource for the new MBean.
     * @param mbeanInterfaceType the class or interface to be used to determine
     *       the MBean's management interface.  An interface if this is a
     *       classic Standard MBean; a class if this is a {@code @ManagedResource}.
     * @param <T> a type parameter that allows the compiler to check
     *       that {@code resource} implements {@code mbeanInterfaceType},
     *       provided that {@code mbeanInterfaceType} is a class constant like
     *       {@code SomeMBean.class}.
     * @throws IllegalArgumentException if {@code resource} is null or
     *       if it does not implement the class {@code mbeanInterfaceType} or if
     *       that class is not a valid Standard MBean interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/StandardMBeanSupport.java
public class StandardMBeanSupport extends MBeanSupport<Method> {

/**
 * Base class for Standard MBeans.
 *
 * @since 1.6
 */
