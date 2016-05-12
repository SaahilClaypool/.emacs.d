_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    static boolean immutableInfo(Class<? extends StandardMBean> subclass) {

    /**
     * Return true if {@code subclass} is known to preserve the immutability
     * of the {@code MBeanInfo}. The {@code subclass} is considered to have
     * an immutable {@code MBeanInfo} if it does not override any of the
     * getMBeanInfo, getCachedMBeanInfo, cacheMBeanInfo and getNotificationInfo
     * methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    private static final Map<Class<?>, Boolean> mbeanInfoSafeMap =

    /**
     * Cached results of previous calls to immutableInfo. This is
     * a WeakHashMap so that we don't prevent a class from being
     * garbage collected just because we know whether its MBeanInfo
     * is immutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public void postDeregister() {

    /**
     * <p>Allows the MBean to perform any operations needed after having been
     * unregistered in the MBean server.</p>
     *
     * <p>The default implementation of this method does nothing for
     * Standard MBeans.  For MXBeans, it removes any information that
     * was recorded by the {@link #preRegister preRegister} method.</p>
     *
     * <p>It is good practice for a subclass that overrides this method
     * to call the overridden method via {@code super.postRegister(...)}.
     * This is necessary if this object is an MXBean that is referenced
     * by attributes or operations in other MXBeans.</p>
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public void preDeregister() throws Exception {

    /**
     * <p>Allows the MBean to perform any operations it needs before
     * being unregistered by the MBean server.</p>
     *
     * <p>The default implementation of this method does nothing.</p>
     *
     * <p>It is good practice for a subclass that overrides this method
     * to call the overridden method via {@code super.preDeregister(...)}.</p>
     *
     * @throws Exception no checked exceptions are throw by this method
     * but {@code Exception} is declared so that subclasses can override
     * this method and throw their own exceptions.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public void postRegister(Boolean registrationDone) {

    /**
     * <p>Allows the MBean to perform any operations needed after having been
     * registered in the MBean server or after the registration has failed.</p>
     *
     * <p>The default implementation of this method does nothing for
     * Standard MBeans.  For MXBeans, it undoes any work done by
     * {@link #preRegister preRegister} if registration fails.</p>
     *
     * <p>It is good practice for a subclass that overrides this method
     * to call the overridden method via {@code super.postRegister(...)}.
     * This is necessary if this object is an MXBean that is referenced
     * by attributes or operations in other MXBeans.</p>
     *
     * @param registrationDone Indicates whether or not the MBean has
     * been successfully registered in the MBean server. The value
     * false means that the registration phase has failed.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public ObjectName preRegister(MBeanServer server, ObjectName name)

    /**
     * <p>Allows the MBean to perform any operations it needs before
     * being registered in the MBean server.  If the name of the MBean
     * is not specified, the MBean can provide a name for its
     * registration.  If any exception is raised, the MBean will not be
     * registered in the MBean server.</p>
     *
     * <p>The default implementation of this method returns the {@code name}
     * parameter.  It does nothing else for
     * Standard MBeans.  For MXBeans, it records the {@code MBeanServer}
     * and {@code ObjectName} parameters so they can be used to translate
     * inter-MXBean references.</p>
     *
     * <p>It is good practice for a subclass that overrides this method
     * to call the overridden method via {@code super.preRegister(...)}.
     * This is necessary if this object is an MXBean that is referenced
     * by attributes or operations in other MXBeans.</p>
     *
     * @param server The MBean server in which the MBean will be registered.
     *
     * @param name The object name of the MBean.  This name is null if
     * the name parameter to one of the <code>createMBean</code> or
     * <code>registerMBean</code> methods in the {@link MBeanServer}
     * interface is null.  In that case, this method must return a
     * non-null ObjectName for the new MBean.
     *
     * @return The name under which the MBean is to be registered.
     * This value must not be null.  If the <code>name</code>
     * parameter is not null, it will usually but not necessarily be
     * the returned value.
     *
     * @throws IllegalArgumentException if this is an MXBean and
     * {@code name} is null.
     *
     * @throws InstanceAlreadyExistsException if this is an MXBean and
     * it has already been registered under another name (in this
     * MBean Server or another).
     *
     * @throws Exception no other checked exceptions are thrown by
     * this method but {@code Exception} is declared so that subclasses
     * can override the method and throw their own exceptions.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected void cacheMBeanInfo(MBeanInfo info) {

    /**
     * Customization hook:
     * cache the MBeanInfo built for this object.
     *
     * <p>Subclasses may redefine this method in order to implement
     * their own caching policy.  The default implementation stores
     * <code>info</code> in this instance.  A subclass can define
     * other policies, such as not saving <code>info</code> (so it is
     * reconstructed every time {@link #getMBeanInfo()} is called) or
     * sharing a unique {@link MBeanInfo} object when several
     * <code>StandardMBean</code> instances have equal {@link
     * MBeanInfo} values.
     *
     * @param info the new <code>MBeanInfo</code> to cache.  Any
     * previously cached value is discarded.  This parameter may be
     * null, in which case there is no new cached value.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected MBeanInfo getCachedMBeanInfo() {

    /**
     * Customization hook:
     * Return the MBeanInfo cached for this object.
     *
     * <p>Subclasses may redefine this method in order to implement their
     * own caching policy.  The default implementation stores one
     * {@link MBeanInfo} object per instance.
     *
     * @return The cached MBeanInfo, or null if no MBeanInfo is cached.
     *
     * @see #cacheMBeanInfo(MBeanInfo)
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    Descriptor getDescriptor(MBeanInfo info, boolean immutableInfo) {

    /**
     * <p>Get the Descriptor that will be used in the MBeanInfo
     * returned by this MBean.</p>
     *
     * <p>Subclasses may redefine this method in order to supply
     * their custom descriptor.</p>
     *
     * <p>The default implementation of this method returns a Descriptor
     * that contains at least the field {@code interfaceClassName}, with
     * value {@link #getMBeanInterface()}.getName(). It may also contain
     * the field {@code immutableInfo}, with a value that is the string
     * {@code "true"} if the implementation can determine that the
     * {@code MBeanInfo} returned by {@link #getMBeanInfo()} will always
     * be the same. It may contain other fields: fields defined by the
     * JMX specification must have appropriate values, and other fields
     * must follow the conventions for non-standard field names.</p>
     *
     * @param info The default MBeanInfo derived by reflection.
     * @return the Descriptor for the new MBeanInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    MBeanNotificationInfo[] getNotifications(MBeanInfo info) {

    /**
     * Customization hook:
     * Get the MBeanNotificationInfo[] that will be used in the MBeanInfo
     * returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom notifications.
     * @param info The default MBeanInfo derived by reflection.
     * @return the MBeanNotificationInfo[] for the new MBeanInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected MBeanConstructorInfo[]

    /**
     * Customization hook:
     * Get the MBeanConstructorInfo[] that will be used in the MBeanInfo
     * returned by this MBean.
     * <br>
     * By default, this method returns <code>null</code> if the wrapped
     * implementation is not <var>this</var>. Indeed, if the wrapped
     * implementation is not this object itself, it will not be possible
     * to recreate a wrapped implementation by calling the implementation
     * constructors through <code>MBeanServer.createMBean(...)</code>.<br>
     * Otherwise, if the wrapped implementation is <var>this</var>,
     * <var>ctors</var> is returned.
     * <br>
     * Subclasses may redefine this method in order to modify this
     * behavior, if needed.
     * @param ctors The default MBeanConstructorInfo[] derived by reflection.
     * @param impl  The wrapped implementation. If <code>null</code> is
     *        passed, the wrapped implementation is ignored and
     *        <var>ctors</var> is returned.
     * @return the MBeanConstructorInfo[] for the new MBeanInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getDescription(MBeanOperationInfo op,
                                    MBeanParameterInfo param,
                                    int sequence) {

    /**
     * Customization hook:
     * Get the description that will be used for the  <var>sequence</var>
     * MBeanParameterInfo of the MBeanOperationInfo returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom description.  The default implementation returns
     * {@link MBeanParameterInfo#getDescription() param.getDescription()}.
     *
     * @param op    The default MBeanOperationInfo derived by reflection.
     * @param param The default MBeanParameterInfo derived by reflection.
     * @param sequence The sequence number of the parameter considered
     *        ("0" for the first parameter, "1" for the second parameter,
     *        etc...).
     * @return the description for the given MBeanParameterInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getParameterName(MBeanOperationInfo op,
                                      MBeanParameterInfo param,
                                      int sequence) {

    /**
     * Customization hook:
     * Get the name that will be used for the <var>sequence</var>
     * MBeanParameterInfo of the MBeanOperationInfo returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom parameter name.  The default implementation returns
     * {@link MBeanParameterInfo#getName() param.getName()}.
     *
     * @param op    The default MBeanOperationInfo derived by reflection.
     * @param param The default MBeanParameterInfo derived by reflection.
     * @param sequence The sequence number of the parameter considered
     *        ("0" for the first parameter, "1" for the second parameter,
     *        etc...).
     * @return the name to use for the given MBeanParameterInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected int getImpact(MBeanOperationInfo info) {

    /**
     * Customization hook:
     * Get the <var>impact</var> flag of the operation that will be used in
     * the MBeanOperationInfo returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom impact flag.  The default implementation returns
     * {@link MBeanOperationInfo#getImpact() info.getImpact()}.
     * @param info The default MBeanOperationInfo derived by reflection.
     * @return the impact flag for the given MBeanOperationInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getDescription(MBeanOperationInfo info) {

    /**
     * Customization hook:
     * Get the description that will be used in the MBeanOperationInfo
     * returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom description.  The default implementation returns
     * {@link #getDescription(MBeanFeatureInfo)
     * getDescription((MBeanFeatureInfo) info)}.
     * @param info The default MBeanOperationInfo derived by reflection.
     * @return the description for the given MBeanOperationInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getParameterName(MBeanConstructorInfo ctor,
                                      MBeanParameterInfo param,
                                      int sequence) {

    /**
     * Customization hook:
     * Get the name that will be used for the <var>sequence</var>
     * MBeanParameterInfo of the MBeanConstructorInfo returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom parameter name.  The default implementation returns
     * {@link MBeanParameterInfo#getName() param.getName()}.
     *
     * @param ctor  The default MBeanConstructorInfo derived by reflection.
     * @param param The default MBeanParameterInfo derived by reflection.
     * @param sequence The sequence number of the parameter considered
     *        ("0" for the first parameter, "1" for the second parameter,
     *        etc...).
     * @return the name for the given MBeanParameterInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getDescription(MBeanConstructorInfo ctor,
                                    MBeanParameterInfo   param,
                                    int sequence) {

    /**
     * Customization hook:
     * Get the description that will be used for the  <var>sequence</var>
     * MBeanParameterInfo of the MBeanConstructorInfo returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom description.  The default implementation returns
     * {@link MBeanParameterInfo#getDescription() param.getDescription()}.
     *
     * @param ctor  The default MBeanConstructorInfo derived by reflection.
     * @param param The default MBeanParameterInfo derived by reflection.
     * @param sequence The sequence number of the parameter considered
     *        ("0" for the first parameter, "1" for the second parameter,
     *        etc...).
     * @return the description for the given MBeanParameterInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getDescription(MBeanConstructorInfo info) {

    /**
     * Customization hook:
     * Get the description that will be used in the MBeanConstructorInfo
     * returned by this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom description.
     * The default implementation returns {@link
     * #getDescription(MBeanFeatureInfo)
     * getDescription((MBeanFeatureInfo) info)}.
     * @param info The default MBeanConstructorInfo derived by reflection.
     * @return the description for the given MBeanConstructorInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getDescription(MBeanAttributeInfo info) {

    /**
     * Customization hook:
     * Get the description that will be used in the MBeanAttributeInfo
     * returned by this MBean.
     *
     * <p>Subclasses may redefine this method in order to supply their
     * custom description.  The default implementation returns {@link
     * #getDescription(MBeanFeatureInfo)
     * getDescription((MBeanFeatureInfo) info)}.
     * @param info The default MBeanAttributeInfo derived by reflection.
     * @return the description for the given MBeanAttributeInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getDescription(MBeanFeatureInfo info) {

    /**
     * <p>Customization hook:
     * Get the description that will be used in the MBeanFeatureInfo
     * returned by this MBean.</p>
     *
     * <p>Subclasses may redefine this method in order to supply
     * their custom description.  The default implementation returns
     * {@link MBeanFeatureInfo#getDescription()
     * info.getDescription()}.</p>
     *
     * <p>This method is called by
     *      {@link #getDescription(MBeanAttributeInfo)},
     *      {@link #getDescription(MBeanOperationInfo)},
     *      {@link #getDescription(MBeanConstructorInfo)}.</p>
     *
     * @param info The default MBeanFeatureInfo derived by reflection.
     * @return the description for the given MBeanFeatureInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getDescription(MBeanInfo info) {

    /**
     * Customization hook:
     * Get the description that will be used in the MBeanInfo returned by
     * this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom MBean description.  The default implementation returns
     * {@link MBeanInfo#getDescription() info.getDescription()}.
     * @param info The default MBeanInfo derived by reflection.
     * @return the description for the new MBeanInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected String getClassName(MBeanInfo info) {

    /**
     * Customization hook:
     * Get the className that will be used in the MBeanInfo returned by
     * this MBean.
     * <br>
     * Subclasses may redefine this method in order to supply their
     * custom class name.  The default implementation returns
     * {@link MBeanInfo#getClassName() info.getClassName()}.
     * @param info The default MBeanInfo derived by reflection.
     * @return the class name for the new MBeanInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public MBeanInfo getMBeanInfo() {

    /**
     * Get the {@link MBeanInfo} for this MBean.
     * <p>
     * This method implements
     * {@link javax.management.DynamicMBean#getMBeanInfo()
     *   DynamicMBean.getMBeanInfo()}.
     * <p>
     * This method first calls {@link #getCachedMBeanInfo()} in order to
     * retrieve the cached MBeanInfo for this MBean, if any. If the
     * MBeanInfo returned by {@link #getCachedMBeanInfo()} is not null,
     * then it is returned.<br>
     * Otherwise, this method builds a default MBeanInfo for this MBean,
     * using the Management Interface specified for this MBean.
     * <p>
     * While building the MBeanInfo, this method calls the customization
     * hooks that make it possible for subclasses to supply their custom
     * descriptions, parameter names, etc...<br>
     * Finally, it calls {@link #cacheMBeanInfo(javax.management.MBeanInfo)
     * cacheMBeanInfo()} in order to cache the new MBeanInfo.
     * @return The cached MBeanInfo for that MBean, if not null, or a
     *         newly built MBeanInfo if none was cached.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public Class<?> getImplementationClass() {

    /**
     * Get the class of the implementation of this Standard MBean (or MXBean).
     * @return The class of the implementation of this Standard MBean (or MXBean).
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public final Class<?> getMBeanInterface() {

    /**
     * Get the Management Interface of this Standard MBean (or MXBean).
     * @return The management interface of this Standard MBean (or MXBean).
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public Object getImplementation() {

    /**
     * Get the implementation of this Standard MBean (or MXBean).
     * @return The implementation of this Standard MBean (or MXBean).
     *
     * @see #setImplementation
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public void setImplementation(Object implementation)

    /**
     * <p>Replace the implementation object wrapped in this object.</p>
     *
     * @param implementation The new implementation of this Standard MBean
     * (or MXBean). The <code>implementation</code> object must implement
     * the Standard MBean (or MXBean) interface that was supplied when this
     * <code>StandardMBean</code> was constructed.
     *
     * @exception IllegalArgumentException if the given
     * <var>implementation</var> is null.
     *
     * @exception NotCompliantMBeanException if the given
     * <var>implementation</var> does not implement the
     * Standard MBean (or MXBean) interface that was
     * supplied at construction.
     *
     * @see #getImplementation
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected StandardMBean(Class<?> mbeanInterface, boolean isMXBean) {

    /**
     * <p>Make a DynamicMBean out of <var>this</var>, using the specified
     * <var>mbeanInterface</var> class, and choosing whether the resulting
     * MBean is an MXBean.  This constructor can be used
     * to make either Standard MBeans or MXBeans.  Unlike the
     * constructor {@link #StandardMBean(Object, Class)}, it
     * does not throw NotCompliantMBeanException.</p>
     *
     * <p>Calls {@link #StandardMBean(java.lang.Object, java.lang.Class, boolean)
     *       this(this, mbeanInterface, isMXBean)}.
     * This constructor is reserved to subclasses.</p>
     *
     * @param mbeanInterface The Management Interface exported by this
     *        MBean.
     * @param isMXBean If true, the {@code mbeanInterface} parameter
     * names an MXBean interface and the resultant MBean is an MXBean.
     *
     * @exception IllegalArgumentException if the <var>mbeanInterface</var>
     *    does not follow JMX design patterns for Management Interfaces, or
     *    if <var>this</var> does not implement the specified interface.
     *
     * @since 1.6
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public <T> StandardMBean(T implementation, Class<T> mbeanInterface,
                             boolean isMXBean) {

    /**
     * <p>Make a DynamicMBean out of the object
     * <var>implementation</var>, using the specified
     * <var>mbeanInterface</var> class, and choosing whether the
     * resultant MBean is an MXBean.  This constructor can be used
     * to make either Standard MBeans or MXBeans.  Unlike the
     * constructor {@link #StandardMBean(Object, Class)}, it
     * does not throw NotCompliantMBeanException.</p>
     *
     * @param implementation The implementation of this MBean.
     * @param mbeanInterface The Management Interface exported by this
     *        MBean's implementation. If <code>null</code>, then this
     *        object will use standard JMX design pattern to determine
     *        the management interface associated with the given
     *        implementation.
     * @param isMXBean If true, the {@code mbeanInterface} parameter
     * names an MXBean interface and the resultant MBean is an MXBean.
     * @param <T> Allows the compiler to check
     * that {@code implementation} does indeed implement the class
     * described by {@code mbeanInterface}.  The compiler can only
     * check this if {@code mbeanInterface} is a class literal such
     * as {@code MyMBean.class}.
     *
     * @exception IllegalArgumentException if the given
     *    <var>implementation</var> is null, or if the <var>mbeanInterface</var>
     *    does not follow JMX design patterns for Management Interfaces, or
     *    if the given <var>implementation</var> does not implement the
     *    specified interface.
     *
     * @since 1.6
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    protected StandardMBean(Class<?> mbeanInterface)

    /**
     * <p>Make a DynamicMBean out of <var>this</var>, using the specified
     * <var>mbeanInterface</var> class.</p>
     *
     * <p>Calls {@link #StandardMBean(java.lang.Object, java.lang.Class)
     *       this(this,mbeanInterface)}.
     * This constructor is reserved to subclasses.</p>
     *
     * @param mbeanInterface The Management Interface exported by this
     *        MBean.
     *
     * @exception NotCompliantMBeanException if the <var>mbeanInterface</var>
     *    does not follow JMX design patterns for Management Interfaces, or
     *    if <var>this</var> does not implement the specified interface.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    public <T> StandardMBean(T implementation, Class<T> mbeanInterface)

    /**
     * <p>Make a DynamicMBean out of the object
     * <var>implementation</var>, using the specified
     * <var>mbeanInterface</var> class.</p>
     *
     * @param implementation The implementation of this MBean.
     * @param mbeanInterface The Management Interface exported by this
     *        MBean's implementation. If <code>null</code>, then this
     *        object will use standard JMX design pattern to determine
     *        the management interface associated with the given
     *        implementation.
     * @param <T> Allows the compiler to check
     * that {@code implementation} does indeed implement the class
     * described by {@code mbeanInterface}.  The compiler can only
     * check this if {@code mbeanInterface} is a class literal such
     * as {@code MyMBean.class}.
     *
     * @exception IllegalArgumentException if the given
     *    <var>implementation</var> is null.
     * @exception NotCompliantMBeanException if the <var>mbeanInterface</var>
     *    does not follow JMX design patterns for Management Interfaces, or
     *    if the given <var>implementation</var> does not implement the
     *    specified interface.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    private <T> void construct(T implementation, Class<T> mbeanInterface,
                               boolean nullImplementationAllowed,
                               boolean isMXBean)

    /**
     * Make a DynamicMBean out of <var>implementation</var>, using the
     * specified <var>mbeanInterface</var> class.
     * @param implementation The implementation of this MBean.
     *        If <code>null</code>, and null implementation is allowed,
     *        then the implementation is assumed to be <var>this</var>.
     * @param mbeanInterface The Management Interface exported by this
     *        MBean's implementation. If <code>null</code>, then this
     *        object will use standard JMX design pattern to determine
     *        the management interface associated with the given
     *        implementation.
     * @param nullImplementationAllowed <code>true</code> if a null
     *        implementation is allowed. If null implementation is allowed,
     *        and a null implementation is passed, then the implementation
     *        is assumed to be <var>this</var>.
     * @exception IllegalArgumentException if the given
     *    <var>implementation</var> is null, and null is not allowed.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    private volatile MBeanInfo cachedMBeanInfo;

    /**
     * The cached MBeanInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
    private volatile MBeanSupport<?> mbean;

    /**
     * The DynamicMBean that wraps the MXBean or Standard MBean implementation.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StandardMBean.java
public class StandardMBean implements DynamicMBean, MBeanRegistration {

/**
 * <p>An MBean whose management interface is determined by reflection
 * on a Java interface.</p>
 *
 * <p>This class brings more flexibility to the notion of Management
 * Interface in the use of Standard MBeans.  Straightforward use of
 * the patterns for Standard MBeans described in the JMX Specification
 * means that there is a fixed relationship between the implementation
 * class of an MBean and its management interface (i.e., if the
 * implementation class is Thing, the management interface must be
 * ThingMBean).  This class makes it possible to keep the convenience
 * of specifying the management interface with a Java interface,
 * without requiring that there be any naming relationship between the
 * implementation and interface classes.</p>
 *
 * <p>By making a DynamicMBean out of an MBean, this class makes
 * it possible to select any interface implemented by the MBean as its
 * management interface, provided that it complies with JMX patterns
 * (i.e., attributes defined by getter/setter etc...).</p>
 *
 * <p> This class also provides hooks that make it possible to supply
 * custom descriptions and names for the {@link MBeanInfo} returned by
 * the DynamicMBean interface.</p>
 *
 * <p>Using this class, an MBean can be created with any
 * implementation class name <i>Impl</i> and with a management
 * interface defined (as for current Standard MBeans) by any interface
 * <i>Intf</i>, in one of two general ways:</p>
 *
 * <ul>
 *
 * <li>Using the public constructor
 *     {@link #StandardMBean(java.lang.Object, java.lang.Class, boolean)
 *     StandardMBean(impl,interface)}:
 *     <pre>
 *     MBeanServer mbs;
 *     ...
 *     Impl impl = new Impl(...);
 *     StandardMBean mbean = new StandardMBean(impl, Intf.class, false);
 *     mbs.registerMBean(mbean, objectName);
 *     </pre></li>
 *
 * <li>Subclassing StandardMBean:
 *     <pre>
 *     public class Impl extends StandardMBean implements Intf {
 *        public Impl() {
 *          super(Intf.class, false);
 *       }
 *       // implement methods of Intf
 *     }
 *
 *     [...]
 *
 *     MBeanServer mbs;
 *     ....
 *     Impl impl = new Impl();
 *     mbs.registerMBean(impl, objectName);
 *     </pre></li>
 *
 * </ul>
 *
 * <p>In either case, the class <i>Impl</i> must implement the
 * interface <i>Intf</i>.</p>
 *
 * <p>Standard MBeans based on the naming relationship between
 * implementation and interface classes are of course still
 * available.</p>
 *
 * <p>This class may also be used to construct MXBeans.  The usage
 * is exactly the same as for Standard MBeans except that in the
 * examples above, the {@code false} parameter to the constructor or
 * {@code super(...)} invocation is instead {@code true}.</p>
 *
 * @since 1.5
 */
