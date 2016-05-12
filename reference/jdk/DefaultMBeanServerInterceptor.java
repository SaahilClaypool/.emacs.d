_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext makeResourceContextFor(Object resource,
            ObjectName logicalName) {

    /**
     * Creates a ResourceContext for the given resource.
     * If the resource does not need a ResourceContext, returns
     * ResourceContext.NONE.
     * At this time, only ClassLoaders need a ResourceContext.
     *
     * @param resource     The resource being registered or unregistered.
     * @param logicalName  The name of the associated MBean.
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext createClassLoaderContext(
            final ClassLoader loader,
            final ObjectName logicalName) {

    /**
     * Creates a ResourceContext for a ClassLoader MBean.
     * The resource context makes it possible to add the ClassLoader to
     * (ResourceContext.registering) or resp. remove the ClassLoader from
     * (ResourceContext.unregistered) the CLR
     * when the associated MBean is added to or resp. removed from the
     * repository.
     *
     * @param loader       The ClassLoader MBean being registered or
     *                     unregistered.
     * @param logicalName  The name of the ClassLoader MBean.
     * @return a ResourceContext that takes in charge the addition or removal
     *         of the loader to or from the CLR.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private void removeClassLoader(ClassLoader loader,
            final ObjectName logicalName) {

    /**
     * Unregisters a ClassLoader from the CLR.
     * This method is called by the ResourceContext from within the
     * repository lock.
     * @param loader       The ClassLoader.
     * @param logicalName  The ClassLoader MBean ObjectName.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private void addClassLoader(ClassLoader loader,
            final ObjectName logicalName) {

    /**
     * Registers a ClassLoader with the CLR.
     * This method is called by the ResourceContext from within the
     * repository lock.
     * @param loader       The ClassLoader.
     * @param logicalName  The ClassLoader MBean ObjectName.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext unregisterFromRepository(
            final Object resource,
            final DynamicMBean object,
            final ObjectName logicalName)

    /**
     * Removes a MBean in the repository,
     * sends MBeanServerNotification.UNREGISTRATION_NOTIFICATION,
     * returns ResourceContext for special resources such as ClassLoaders
     * or JMXNamespaces, or null. For regular MBean this method returns
     * ResourceContext.NONE.
     *
     * @return a ResourceContext for special resources such as ClassLoaders
     *         or JMXNamespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext registerWithRepository(
            final Object resource,
            final DynamicMBean object,
            final ObjectName logicalName)

    /**
     * Adds a MBean in the repository,
     * sends MBeanServerNotification.REGISTRATION_NOTIFICATION,
     * returns ResourceContext for special resources such as ClassLoaders
     * or JMXNamespaces. For regular MBean this method returns
     * ResourceContext.NONE.
     * @return a ResourceContext for special resources such as ClassLoaders
     *         or JMXNamespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
        public static final ResourceContext NONE = new ResourceContext() {

        /** An empty ResourceContext which does nothing **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private static interface ResourceContext extends RegistrationContext {

    /**
     * A RegistrationContext that makes it possible to perform additional
     * post registration actions (or post unregistration actions) outside
     * of the repository lock, once postRegister (or postDeregister) has
     * been called.
     * The method {@code done()} will be called in registerMBean or
     * unregisterMBean, at the end.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private Set<ObjectInstance>

    /**
     * Applies the specified queries to the set of ObjectInstances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private Set<ObjectInstance>

    /**
     * Applies the specified queries to the set of NamedObjects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private Set<ObjectName>

    /**
     * Applies the specified queries to the set of NamedObjects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private void sendNotification(String NotifType, ObjectName name) {

    /**
     * Sends an MBeanServerNotifications with the specified type for the
     * MBean with the specified ObjectName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    public ClassLoader getClassLoader(ObjectName loaderName)

    /**
     * <p>Return the named {@link java.lang.ClassLoader}.
     * @param loaderName The ObjectName of the ClassLoader.
     * @return The named ClassLoader.
     * @exception InstanceNotFoundException if the named ClassLoader
     * is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    public ClassLoader getClassLoaderFor(ObjectName mbeanName)

    /**
     * <p>Return the {@link java.lang.ClassLoader} that was used for
     * loading the class of the named MBean.
     * @param mbeanName The ObjectName of the MBean.
     * @return The ClassLoader used for that MBean.
     * @exception InstanceNotFoundException if the named MBean is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private DynamicMBean getMBean(ObjectName name)

    /**
     * Gets a specific MBean controlled by the DefaultMBeanServerInterceptor.
     * The name must have a non-default domain.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ObjectInstance registerObject(String classname,
                                          Object object, ObjectName name)

    /**
     * Register <code>object</code> in the repository, with the
     * given <code>name</code>.
     * This method is called by the various createMBean() flavours
     * and by registerMBean() after all MBean compliance tests
     * have been performed.
     * <p>
     * This method does not performed any kind of test compliance,
     * and the caller should make sure that the given <code>object</code>
     * is MBean compliant.
     * <p>
     * This methods performed all the basic steps needed for object
     * registration:
     * <ul>
     * <li>If the <code>object</code> implements the MBeanRegistration
     *     interface, it invokes preRegister() on the object.</li>
     * <li>Then the object is added to the repository with the given
     *     <code>name</code>.</li>
     * <li>Finally, if the <code>object</code> implements the
     *     MBeanRegistration interface, it invokes postRegister()
     *     on the object.</li>
     * </ul>
     * @param object A reference to a MBean compliant object.
     * @param name   The ObjectName of the <code>object</code> MBean.
     * @return the actual ObjectName with which the object was registered.
     * @exception InstanceAlreadyExistsException if an object is already
     *            registered with that name.
     * @exception MBeanRegistrationException if an exception occurs during
     *            registration.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    public DefaultMBeanServerInterceptor(MBeanServer         outer,
                                         MBeanServerDelegate delegate,
                                         MBeanInstantiator   instantiator,
                                         Repository          repository) {

    /**
     * Creates a DefaultMBeanServerInterceptor with the specified
     * repository instance.
     * <p>Do not forget to call <code>initialize(outer,delegate)</code>
     * before using this object.
     * @param outer A pointer to the MBeanServer object that must be
     *        passed to the MBeans when invoking their
     *        {@link javax.management.MBeanRegistration} interface.
     * @param delegate A pointer to the MBeanServerDelegate associated
     *        with the new MBeanServer. The new MBeanServer must register
     *        this MBean in its MBean repository.
     * @param instantiator The MBeanInstantiator that will be used to
     *        instantiate MBeans and take care of class loading issues.
     * @param repository The repository to use for this MBeanServer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    // Now sequence number is handled by MBeanServerDelegate.

    /** The sequence number identifying the notifications sent */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final String domain;

    /** The default domain of the object names */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    /* See the comment before addNotificationListener below.  */

    /** Wrappers for client listeners.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final transient Repository repository;

    /** The Repository object used by the DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final transient MBeanServerDelegate delegate;

    /** The MBean server delegate object that is associated to the
     *  DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private transient MBeanServer server = null;

    /** The MBean server object that is associated to the
     *  DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final transient MBeanInstantiator instantiator;

    /** The MBeanInstantiator object used by the
     *  DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
public class DefaultMBeanServerInterceptor implements MBeanServerInterceptor {

/**
 * This is the default class for MBean manipulation on the agent side. It
 * contains the methods necessary for the creation, registration, and
 * deletion of MBeans as well as the access methods for registered MBeans.
 * This is the core component of the JMX infrastructure.
 * <P>
 * Every MBean which is added to the MBean server becomes manageable: its attributes and operations
 * become remotely accessible through the connectors/adaptors connected to that MBean server.
 * A Java object cannot be registered in the MBean server unless it is a JMX compliant MBean.
 * <P>
 * When an MBean is registered or unregistered in the MBean server an
 * {@link javax.management.MBeanServerNotification MBeanServerNotification}
 * Notification is emitted. To register an object as listener to MBeanServerNotifications
 * you should call the MBean server method {@link #addNotificationListener addNotificationListener} with <CODE>ObjectName</CODE>
 * the <CODE>ObjectName</CODE> of the {@link javax.management.MBeanServerDelegate MBeanServerDelegate}.
 * This <CODE>ObjectName</CODE> is:
 * <BR>
 * <CODE>JMImplementation:type=MBeanServerDelegate</CODE>.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext makeResourceContextFor(Object resource,
            ObjectName logicalName) {

    /**
     * Creates a ResourceContext for the given resource.
     * If the resource does not need a ResourceContext, returns
     * ResourceContext.NONE.
     * At this time, only ClassLoaders need a ResourceContext.
     *
     * @param resource     The resource being registered or unregistered.
     * @param logicalName  The name of the associated MBean.
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext createClassLoaderContext(
            final ClassLoader loader,
            final ObjectName logicalName) {

    /**
     * Creates a ResourceContext for a ClassLoader MBean.
     * The resource context makes it possible to add the ClassLoader to
     * (ResourceContext.registering) or resp. remove the ClassLoader from
     * (ResourceContext.unregistered) the CLR
     * when the associated MBean is added to or resp. removed from the
     * repository.
     *
     * @param loader       The ClassLoader MBean being registered or
     *                     unregistered.
     * @param logicalName  The name of the ClassLoader MBean.
     * @return a ResourceContext that takes in charge the addition or removal
     *         of the loader to or from the CLR.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private void removeClassLoader(ClassLoader loader,
            final ObjectName logicalName) {

    /**
     * Unregisters a ClassLoader from the CLR.
     * This method is called by the ResourceContext from within the
     * repository lock.
     * @param loader       The ClassLoader.
     * @param logicalName  The ClassLoader MBean ObjectName.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private void addClassLoader(ClassLoader loader,
            final ObjectName logicalName) {

    /**
     * Registers a ClassLoader with the CLR.
     * This method is called by the ResourceContext from within the
     * repository lock.
     * @param loader       The ClassLoader.
     * @param logicalName  The ClassLoader MBean ObjectName.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext unregisterFromRepository(
            final Object resource,
            final DynamicMBean object,
            final ObjectName logicalName)

    /**
     * Removes a MBean in the repository,
     * sends MBeanServerNotification.UNREGISTRATION_NOTIFICATION,
     * returns ResourceContext for special resources such as ClassLoaders
     * or JMXNamespaces, or null. For regular MBean this method returns
     * ResourceContext.NONE.
     *
     * @return a ResourceContext for special resources such as ClassLoaders
     *         or JMXNamespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ResourceContext registerWithRepository(
            final Object resource,
            final DynamicMBean object,
            final ObjectName logicalName)

    /**
     * Adds a MBean in the repository,
     * sends MBeanServerNotification.REGISTRATION_NOTIFICATION,
     * returns ResourceContext for special resources such as ClassLoaders
     * or JMXNamespaces. For regular MBean this method returns
     * ResourceContext.NONE.
     * @return a ResourceContext for special resources such as ClassLoaders
     *         or JMXNamespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
        public static final ResourceContext NONE = new ResourceContext() {

        /** An empty ResourceContext which does nothing **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private static interface ResourceContext extends RegistrationContext {

    /**
     * A RegistrationContext that makes it possible to perform additional
     * post registration actions (or post unregistration actions) outside
     * of the repository lock, once postRegister (or postDeregister) has
     * been called.
     * The method {@code done()} will be called in registerMBean or
     * unregisterMBean, at the end.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private Set<ObjectInstance>

    /**
     * Applies the specified queries to the set of ObjectInstances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private Set<ObjectInstance>

    /**
     * Applies the specified queries to the set of NamedObjects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private Set<ObjectName>

    /**
     * Applies the specified queries to the set of NamedObjects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private void sendNotification(String NotifType, ObjectName name) {

    /**
     * Sends an MBeanServerNotifications with the specified type for the
     * MBean with the specified ObjectName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    public ClassLoader getClassLoader(ObjectName loaderName)

    /**
     * <p>Return the named {@link java.lang.ClassLoader}.
     * @param loaderName The ObjectName of the ClassLoader.
     * @return The named ClassLoader.
     * @exception InstanceNotFoundException if the named ClassLoader
     * is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    public ClassLoader getClassLoaderFor(ObjectName mbeanName)

    /**
     * <p>Return the {@link java.lang.ClassLoader} that was used for
     * loading the class of the named MBean.
     * @param mbeanName The ObjectName of the MBean.
     * @return The ClassLoader used for that MBean.
     * @exception InstanceNotFoundException if the named MBean is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private DynamicMBean getMBean(ObjectName name)

    /**
     * Gets a specific MBean controlled by the DefaultMBeanServerInterceptor.
     * The name must have a non-default domain.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private ObjectInstance registerObject(String classname,
                                          Object object, ObjectName name)

    /**
     * Register <code>object</code> in the repository, with the
     * given <code>name</code>.
     * This method is called by the various createMBean() flavours
     * and by registerMBean() after all MBean compliance tests
     * have been performed.
     * <p>
     * This method does not performed any kind of test compliance,
     * and the caller should make sure that the given <code>object</code>
     * is MBean compliant.
     * <p>
     * This methods performed all the basic steps needed for object
     * registration:
     * <ul>
     * <li>If the <code>object</code> implements the MBeanRegistration
     *     interface, it invokes preRegister() on the object.</li>
     * <li>Then the object is added to the repository with the given
     *     <code>name</code>.</li>
     * <li>Finally, if the <code>object</code> implements the
     *     MBeanRegistration interface, it invokes postRegister()
     *     on the object.</li>
     * </ul>
     * @param object A reference to a MBean compliant object.
     * @param name   The ObjectName of the <code>object</code> MBean.
     * @return the actual ObjectName with which the object was registered.
     * @exception InstanceAlreadyExistsException if an object is already
     *            registered with that name.
     * @exception MBeanRegistrationException if an exception occurs during
     *            registration.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    public DefaultMBeanServerInterceptor(MBeanServer         outer,
                                         MBeanServerDelegate delegate,
                                         MBeanInstantiator   instantiator,
                                         Repository          repository) {

    /**
     * Creates a DefaultMBeanServerInterceptor with the specified
     * repository instance.
     * <p>Do not forget to call <code>initialize(outer,delegate)</code>
     * before using this object.
     * @param outer A pointer to the MBeanServer object that must be
     *        passed to the MBeans when invoking their
     *        {@link javax.management.MBeanRegistration} interface.
     * @param delegate A pointer to the MBeanServerDelegate associated
     *        with the new MBeanServer. The new MBeanServer must register
     *        this MBean in its MBean repository.
     * @param instantiator The MBeanInstantiator that will be used to
     *        instantiate MBeans and take care of class loading issues.
     * @param repository The repository to use for this MBeanServer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    // Now sequence number is handled by MBeanServerDelegate.

    /** The sequence number identifying the notifications sent */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final String domain;

    /** The default domain of the object names */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    /* See the comment before addNotificationListener below.  */

    /** Wrappers for client listeners.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final transient Repository repository;

    /** The Repository object used by the DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final transient MBeanServerDelegate delegate;

    /** The MBean server delegate object that is associated to the
     *  DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private transient MBeanServer server = null;

    /** The MBean server object that is associated to the
     *  DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
    private final transient MBeanInstantiator instantiator;

    /** The MBeanInstantiator object used by the
     *  DefaultMBeanServerInterceptor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/interceptor/DefaultMBeanServerInterceptor.java
public class DefaultMBeanServerInterceptor implements MBeanServerInterceptor {

/**
 * This is the default class for MBean manipulation on the agent side. It
 * contains the methods necessary for the creation, registration, and
 * deletion of MBeans as well as the access methods for registered MBeans.
 * This is the core component of the JMX infrastructure.
 * <P>
 * Every MBean which is added to the MBean server becomes manageable: its attributes and operations
 * become remotely accessible through the connectors/adaptors connected to that MBean server.
 * A Java object cannot be registered in the MBean server unless it is a JMX compliant MBean.
 * <P>
 * When an MBean is registered or unregistered in the MBean server an
 * {@link javax.management.MBeanServerNotification MBeanServerNotification}
 * Notification is emitted. To register an object as listener to MBeanServerNotifications
 * you should call the MBean server method {@link #addNotificationListener addNotificationListener} with <CODE>ObjectName</CODE>
 * the <CODE>ObjectName</CODE> of the {@link javax.management.MBeanServerDelegate MBeanServerDelegate}.
 * This <CODE>ObjectName</CODE> is:
 * <BR>
 * <CODE>JMImplementation:type=MBeanServerDelegate</CODE>.
 *
 * @since 1.5
 */
