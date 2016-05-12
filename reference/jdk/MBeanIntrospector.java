_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final MBeanInfo getClassMBeanInfo(Class<?> resourceClass,
            PerInterface<M> perInterface) {

    /**
     * Return the basic MBeanInfo for resources of the given class and
     * per-interface data.  This MBeanInfo might not be the final MBeanInfo
     * for instances of the class, because if the class is a
     * NotificationBroadcaster then each instance gets to decide what
     * MBeanNotificationInfo[] to put in its own MBeanInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final MBeanInfo getMBeanInfo(Object resource, PerInterface<M> perInterface) {

    /**
     * Return the MBeanInfo for the given resource, based on the given
     * per-interface data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
        MBeanInfo makeMBeanInfo(Class<?> mbeanInterface,
                String description) {

        /** Make an MBeanInfo based on the attributes and operations
         *  found in the interface. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    private class MBeanInfoMaker

    /** A visitor that constructs the per-interface MBeanInfo. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    /* If the value is of the wrong type for the method we are about to

    /**
     * Invoke the given setter on the given target with the given argument
     * and cookie.  Wrap exceptions appropriately.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final Object invokeM(M m, Object target, Object[] args, Object cookie)

    /**
     * Invoke the given M on the given target with the given args and cookie.
     * Wrap exceptions appropriately.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final boolean consistent(M getter, M setter) {

    /** True if the given getter and setter are consistent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    private MBeanInfo makeInterfaceMBeanInfo(Class<?> mbeanInterface,
            MBeanAnalyzer<M> analyzer) {

    /**
     * Make the MBeanInfo skeleton for the given MBean interface using
     * the given analyzer.  This will never be the MBeanInfo of any real
     * MBean (because the getClassName() must be a concrete class), but
     * its MBeanAttributeInfo[] and MBeanOperationInfo[] can be inserted
     * into such an MBeanInfo, and its Descriptor can be the basis for
     * the MBeanInfo's Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final List<Method> getMethods(final Class<?> mbeanType) {

    /**
     * Get the methods to be analyzed to build the MBean interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Descriptor getMBeanDescriptor(Class<?> resourceClass);

    /**
     * Get a Descriptor containing additional fields beyond the ones
     * from getBasicMBeanDescriptor that MBeans whose concrete class
     * is resourceClass will always have.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Descriptor getBasicMBeanDescriptor();

    /**
     * Get a Descriptor containing fields that MBeans of this kind will
     * always have.  For example, MXBeans will always have "mxbean=true".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract MBeanAttributeInfo getMBeanAttributeInfo(String attributeName,
            M getter, M setter);

    /**
     * Construct an MBeanAttributeInfo for the given attribute based on the
     * given getter and setter.  One but not both of the getter and setter
     * may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract boolean validParameter(M m, Object value, int paramNo,
            Object cookie);

    /**
     * Test whether the given value is valid for the given parameter of this
     * M.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    /*

    /**
     * Invoke the method with the given target and arguments.
     *
     * @param cookie Additional information about the target.  For an
     * MXBean, this is the MXBeanLookup associated with the MXBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract void checkMethod(M m);

    /**
     * Check that this method is valid.  For example, a method in an
     * MXBean interface is not valid if one of its parameters cannot be
     * mapped to an Open Type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract String[] getSignature(M m);

    /**
     * Get the signature of this method as a caller would have to supply
     * it in MBeanServer.invoke.  For MXBeans, the named types will be
     * the mapped Open Types for the parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Type[] getGenericParameterTypes(M m);

    /**
     * Get the parameter types of this method in the Java interface
     * it came from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Type getGenericReturnType(M m);

    /**
     * Get the return type of this method.  This is the return type
     * of a method in a Java interface, so for MXBeans it is the
     * declared Java type, not the mapped Open Type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract String getName(M m);

    /** Get the name of this method. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract M mFrom(Method m);

    /** Find the M corresponding to the given Method. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract boolean isMXBean();

    /** True if MBeans with this kind of introspector are MXBeans. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract MBeanAnalyzer<M> getAnalyzer(Class<?> mbeanInterface)

    /** Make an interface analyzer for this type of MBean. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract PerInterfaceMap<M> getPerInterfaceMap();

    /** The map from interface to PerInterface for this type of MBean. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
/*

/**
 * An introspector for MBeans of a certain type.  There is one instance
 * of this class for Standard MBeans, and one for every MXBeanMappingFactory;
 * these two cases correspond to the two concrete subclasses of this abstract
 * class.
 *
 * @param <M> the representation of methods for this kind of MBean:
 * Method for Standard MBeans, ConvertingMethod for MXBeans.
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final MBeanInfo getClassMBeanInfo(Class<?> resourceClass,
            PerInterface<M> perInterface) {

    /**
     * Return the basic MBeanInfo for resources of the given class and
     * per-interface data.  This MBeanInfo might not be the final MBeanInfo
     * for instances of the class, because if the class is a
     * NotificationBroadcaster then each instance gets to decide what
     * MBeanNotificationInfo[] to put in its own MBeanInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final MBeanInfo getMBeanInfo(Object resource, PerInterface<M> perInterface) {

    /**
     * Return the MBeanInfo for the given resource, based on the given
     * per-interface data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
        MBeanInfo makeMBeanInfo(Class<?> mbeanInterface,
                String description) {

        /** Make an MBeanInfo based on the attributes and operations
         *  found in the interface. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    private class MBeanInfoMaker

    /** A visitor that constructs the per-interface MBeanInfo. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    /* If the value is of the wrong type for the method we are about to

    /**
     * Invoke the given setter on the given target with the given argument
     * and cookie.  Wrap exceptions appropriately.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final Object invokeM(M m, Object target, Object[] args, Object cookie)

    /**
     * Invoke the given M on the given target with the given args and cookie.
     * Wrap exceptions appropriately.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final boolean consistent(M getter, M setter) {

    /** True if the given getter and setter are consistent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    private MBeanInfo makeInterfaceMBeanInfo(Class<?> mbeanInterface,
            MBeanAnalyzer<M> analyzer) {

    /**
     * Make the MBeanInfo skeleton for the given MBean interface using
     * the given analyzer.  This will never be the MBeanInfo of any real
     * MBean (because the getClassName() must be a concrete class), but
     * its MBeanAttributeInfo[] and MBeanOperationInfo[] can be inserted
     * into such an MBeanInfo, and its Descriptor can be the basis for
     * the MBeanInfo's Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    final List<Method> getMethods(final Class<?> mbeanType) {

    /**
     * Get the methods to be analyzed to build the MBean interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Descriptor getMBeanDescriptor(Class<?> resourceClass);

    /**
     * Get a Descriptor containing additional fields beyond the ones
     * from getBasicMBeanDescriptor that MBeans whose concrete class
     * is resourceClass will always have.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Descriptor getBasicMBeanDescriptor();

    /**
     * Get a Descriptor containing fields that MBeans of this kind will
     * always have.  For example, MXBeans will always have "mxbean=true".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract MBeanAttributeInfo getMBeanAttributeInfo(String attributeName,
            M getter, M setter);

    /**
     * Construct an MBeanAttributeInfo for the given attribute based on the
     * given getter and setter.  One but not both of the getter and setter
     * may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract boolean validParameter(M m, Object value, int paramNo,
            Object cookie);

    /**
     * Test whether the given value is valid for the given parameter of this
     * M.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    /*

    /**
     * Invoke the method with the given target and arguments.
     *
     * @param cookie Additional information about the target.  For an
     * MXBean, this is the MXBeanLookup associated with the MXBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract void checkMethod(M m);

    /**
     * Check that this method is valid.  For example, a method in an
     * MXBean interface is not valid if one of its parameters cannot be
     * mapped to an Open Type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract String[] getSignature(M m);

    /**
     * Get the signature of this method as a caller would have to supply
     * it in MBeanServer.invoke.  For MXBeans, the named types will be
     * the mapped Open Types for the parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Type[] getGenericParameterTypes(M m);

    /**
     * Get the parameter types of this method in the Java interface
     * it came from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract Type getGenericReturnType(M m);

    /**
     * Get the return type of this method.  This is the return type
     * of a method in a Java interface, so for MXBeans it is the
     * declared Java type, not the mapped Open Type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract String getName(M m);

    /** Get the name of this method. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract M mFrom(Method m);

    /** Find the M corresponding to the given Method. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract boolean isMXBean();

    /** True if MBeans with this kind of introspector are MXBeans. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract MBeanAnalyzer<M> getAnalyzer(Class<?> mbeanInterface)

    /** Make an interface analyzer for this type of MBean. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
    abstract PerInterfaceMap<M> getPerInterfaceMap();

    /** The map from interface to PerInterface for this type of MBean. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/MBeanIntrospector.java
/*

/**
 * An introspector for MBeans of a certain type.  There is one instance
 * of this class for Standard MBeans, and one for every MXBeanMappingFactory;
 * these two cases correspond to the two concrete subclasses of this abstract
 * class.
 *
 * @param <M> the representation of methods for this kind of MBean:
 * Method for Standard MBeans, ConvertingMethod for MXBeans.
 *
 * @since 1.6
 */
