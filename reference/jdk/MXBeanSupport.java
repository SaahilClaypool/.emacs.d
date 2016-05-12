_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanSupport.java
    public <T> MXBeanSupport(T resource, Class<T> mxbeanInterface)

    /**
       <p>Construct an MXBean that wraps the given resource using the
       given MXBean interface.</p>

       @param resource the underlying resource for the new MXBean.

       @param mxbeanInterface the interface to be used to determine
       the MXBean's management interface.

       @param <T> a type parameter that allows the compiler to check
       that {@code resource} implements {@code mxbeanInterface},
       provided that {@code mxbeanInterface} is a class constant like
       {@code SomeMXBean.class}.

       @throws IllegalArgumentException if {@code resource} is null or
       if it does not implement the class {@code mxbeanInterface} or if
       that class is not a valid MXBean interface.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanSupport.java
public class MXBeanSupport extends MBeanSupport<ConvertingMethod> {

/**
 * Base class for MXBeans.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanSupport.java
    public <T> MXBeanSupport(T resource, Class<T> mxbeanInterface)

    /**
       <p>Construct an MXBean that wraps the given resource using the
       given MXBean interface.</p>

       @param resource the underlying resource for the new MXBean.

       @param mxbeanInterface the interface to be used to determine
       the MXBean's management interface.

       @param <T> a type parameter that allows the compiler to check
       that {@code resource} implements {@code mxbeanInterface},
       provided that {@code mxbeanInterface} is a class constant like
       {@code SomeMXBean.class}.

       @throws IllegalArgumentException if {@code resource} is null or
       if it does not implement the class {@code mxbeanInterface} or if
       that class is not a valid MXBean interface.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MXBeanSupport.java
public class MXBeanSupport extends MBeanSupport<ConvertingMethod> {

/**
 * Base class for MXBeans.
 *
 * @since 1.6
 */
