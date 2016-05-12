_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes an {@link MBeanInfo} from an {@link ObjectInputStream}.
     * @serialData
     * For compatibility reasons, an object of this class is deserialized as follows.
     * <p>
     * The method {@link ObjectInputStream#defaultReadObject defaultReadObject()}
     * is called first to deserialize the object except the field
     * {@code descriptor}, which is not serialized in the default way. Then the method
     * {@link ObjectInputStream#read read()} is called to read a byte, the field
     * {@code descriptor} is deserialized according to the value of the byte value:
     *    <ul>
     *    <li>1. The method {@link ObjectInputStream#readObject readObject()}
     *       is called twice to obtain the field names (a {@code String[]}) and
     *       the field values (a {@code Object[]}) of the {@code descriptor}.
     *       The two obtained values then are used to construct
     *       an {@link ImmutableDescriptor} instance for the field
     *       {@code descriptor};</li>
     *    <li>0. The value for the field {@code descriptor} is obtained directly
     *       by calling the method {@link ObjectInputStream#readObject readObject()}.
     *       If the obtained value is null, the field {@code descriptor} is set to
     *       {@link ImmutableDescriptor#EMPTY_DESCRIPTOR EMPTY_DESCRIPTOR};</li>
     *    <li>-1. This means that there is no byte to read and that the object is from
     *       an earlier version of the JMX API. The field {@code descriptor} is set to
     *       {@link ImmutableDescriptor#EMPTY_DESCRIPTOR EMPTY_DESCRIPTOR}.</li>
     *    <li>Any other value. A {@link StreamCorruptedException} is thrown.</li>
     *    </ul>
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * Serializes an {@link MBeanInfo} to an {@link ObjectOutputStream}.
     * @serialData
     * For compatibility reasons, an object of this class is serialized as follows.
     * <p>
     * The method {@link ObjectOutputStream#defaultWriteObject defaultWriteObject()}
     * is called first to serialize the object except the field {@code descriptor}
     * which is declared as transient. The field {@code descriptor} is serialized
     * as follows:
     *     <ul>
     *     <li> If {@code descriptor} is an instance of the class
     *        {@link ImmutableDescriptor}, the method {@link ObjectOutputStream#write
     *        write(int val)} is called to write a byte with the value {@code 1},
     *        then the method {@link ObjectOutputStream#writeObject writeObject(Object obj)}
     *        is called twice to serialize the field names and the field values of the
     *        {@code descriptor}, respectively as a {@code String[]} and an
     *        {@code Object[]};</li>
     *     <li> Otherwise, the method {@link ObjectOutputStream#write write(int val)}
     *        is called to write a byte with the value {@code 0}, then the method
     *        {@link ObjectOutputStream#writeObject writeObject(Object obj)} is called
     *        to serialize the field {@code descriptor} directly.
     *     </ul>
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    static boolean arrayGettersSafe(Class<?> subclass, Class<?> immutableClass) {

    /**
     * Return true if <code>subclass</code> is known to preserve the
     * immutability of <code>immutableClass</code>.  The class
     * <code>immutableClass</code> is a reference class that is known
     * to be immutable.  The subclass <code>subclass</code> is
     * considered immutable if it does not override any public method
     * of <code>immutableClass</code> whose name begins with "get".
     * This is obviously not an infallible test for immutability,
     * but it works for the public interfaces of the MBean*Info classes.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private static final Map<Class<?>, Boolean> arrayGettersSafeMap =

    /**
     * Cached results of previous calls to arrayGettersSafe.  This is
     * a WeakHashMap so that we don't prevent a class from being
     * garbage collected just because we know whether it's immutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    @Override

    /**
     * <p>Compare this MBeanInfo to another.  Two MBeanInfo objects
     * are equal if and only if they return equal values for {@link
     * #getClassName()}, for {@link #getDescription()}, and for
     * {@link #getDescriptor()}, and the
     * arrays returned by the two objects for {@link
     * #getAttributes()}, {@link #getOperations()}, {@link
     * #getConstructors()}, and {@link #getNotifications()} are
     * pairwise equal.  Here "equal" means {@link
     * Object#equals(Object)}, not identity.</p>
     *
     * <p>If two MBeanInfo objects return the same values in one of
     * their arrays but in a different order then they are not equal.</p>
     *
     * @param o the object to compare to.
     *
     * @return true if and only if <code>o</code> is an MBeanInfo that is equal
     * to this one according to the rules above.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public Descriptor getDescriptor() {

    /**
     * Get the descriptor of this MBeanInfo.  Changing the returned value
     * will have no affect on the original descriptor.
     *
     * @return a descriptor that is either immutable or a copy of the original.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public MBeanNotificationInfo[] getNotifications()  {

    /**
     * Returns the list of the notifications emitted by the MBean.
     * Each notification is described by an <CODE>MBeanNotificationInfo</CODE> object.
     *
     * The returned array is a shallow copy of the internal array,
     * which means that it is a copy of the internal array of
     * references to the <CODE>MBeanNotificationInfo</CODE> objects
     * but that each referenced <CODE>MBeanNotificationInfo</CODE> object is not copied.
     *
     * @return  An array of <CODE>MBeanNotificationInfo</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public MBeanConstructorInfo[] getConstructors()  {

    /**
     * <p>Returns the list of the public constructors of the MBean.
     * Each constructor is described by an
     * <CODE>MBeanConstructorInfo</CODE> object.</p>
     *
     * <p>The returned array is a shallow copy of the internal array,
     * which means that it is a copy of the internal array of
     * references to the <CODE>MBeanConstructorInfo</CODE> objects but
     * that each referenced <CODE>MBeanConstructorInfo</CODE> object
     * is not copied.</p>
     *
     * <p>The returned list is not necessarily exhaustive.  That is,
     * the MBean may have a public constructor that is not in the
     * list.  In this case, the MBean server can construct another
     * instance of this MBean's class using that constructor, even
     * though it is not listed here.</p>
     *
     * @return  An array of <CODE>MBeanConstructorInfo</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public MBeanOperationInfo[] getOperations()  {

    /**
     * Returns the list of operations  of the MBean.
     * Each operation is described by an <CODE>MBeanOperationInfo</CODE> object.
     *
     * The returned array is a shallow copy of the internal array,
     * which means that it is a copy of the internal array of
     * references to the <CODE>MBeanOperationInfo</CODE> objects
     * but that each referenced <CODE>MBeanOperationInfo</CODE> object is not copied.
     *
     * @return  An array of <CODE>MBeanOperationInfo</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private MBeanAttributeInfo[] nonNullAttributes() {

    /**
     * Return the value of the attributes field, or an empty array if
     * the field is null.  This can't happen with a
     * normally-constructed instance of this class, but can if the
     * instance was deserialized from another implementation that
     * allows the field to be null.  It would be simpler if we enforced
     * the class invariant that these fields cannot be null by writing
     * a readObject() method, but that would require us to define the
     * various array fields as non-final, which is annoying because
     * conceptually they are indeed final.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public MBeanAttributeInfo[] getAttributes()   {

    /**
     * Returns the list of attributes exposed for management.
     * Each attribute is described by an <CODE>MBeanAttributeInfo</CODE> object.
     *
     * The returned array is a shallow copy of the internal array,
     * which means that it is a copy of the internal array of
     * references to the <CODE>MBeanAttributeInfo</CODE> objects
     * but that each referenced <CODE>MBeanAttributeInfo</CODE> object is not copied.
     *
     * @return  An array of <CODE>MBeanAttributeInfo</CODE> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public String getDescription()  {

    /**
     * Returns a human readable description of the MBean.
     *
     * @return the description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public String getClassName()  {

    /**
     * Returns the name of the Java class of the MBean described by
     * this <CODE>MBeanInfo</CODE>.
     *
     * @return the class name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
     @Override

    /**
     * <p>Returns a shallow clone of this instance.
     * The clone is obtained by simply calling <tt>super.clone()</tt>,
     * thus calling the default native shallow cloning mechanism
     * implemented by <tt>Object.clone()</tt>.
     * No deeper cloning of any internal field is made.</p>
     *
     * <p>Since this class is immutable, the clone method is chiefly of
     * interest to subclasses.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public MBeanInfo(String className,
                     String description,
                     MBeanAttributeInfo[] attributes,
                     MBeanConstructorInfo[] constructors,
                     MBeanOperationInfo[] operations,
                     MBeanNotificationInfo[] notifications,
                     Descriptor descriptor)

    /**
     * Constructs an <CODE>MBeanInfo</CODE>.
     *
     * @param className The name of the Java class of the MBean described
     * by this <CODE>MBeanInfo</CODE>.  This value may be any
     * syntactically legal Java class name.  It does not have to be a
     * Java class known to the MBean server or to the MBean's
     * ClassLoader.  If it is a Java class known to the MBean's
     * ClassLoader, it is recommended but not required that the
     * class's public methods include those that would appear in a
     * Standard MBean implementing the attributes and operations in
     * this MBeanInfo.
     * @param description A human readable description of the MBean (optional).
     * @param attributes The list of exposed attributes of the MBean.
     * This may be null with the same effect as a zero-length array.
     * @param constructors The list of public constructors of the
     * MBean.  This may be null with the same effect as a zero-length
     * array.
     * @param operations The list of operations of the MBean.  This
     * may be null with the same effect as a zero-length array.
     * @param notifications The list of notifications emitted.  This
     * may be null with the same effect as a zero-length array.
     * @param descriptor The descriptor for the MBean.  This may be null
     * which is equivalent to an empty descriptor.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    public MBeanInfo(String className,
                     String description,
                     MBeanAttributeInfo[] attributes,
                     MBeanConstructorInfo[] constructors,
                     MBeanOperationInfo[] operations,
                     MBeanNotificationInfo[] notifications)

    /**
     * Constructs an <CODE>MBeanInfo</CODE>.
     *
     * @param className The name of the Java class of the MBean described
     * by this <CODE>MBeanInfo</CODE>.  This value may be any
     * syntactically legal Java class name.  It does not have to be a
     * Java class known to the MBean server or to the MBean's
     * ClassLoader.  If it is a Java class known to the MBean's
     * ClassLoader, it is recommended but not required that the
     * class's public methods include those that would appear in a
     * Standard MBean implementing the attributes and operations in
     * this MBeanInfo.
     * @param description A human readable description of the MBean (optional).
     * @param attributes The list of exposed attributes of the MBean.
     * This may be null with the same effect as a zero-length array.
     * @param constructors The list of public constructors of the
     * MBean.  This may be null with the same effect as a zero-length
     * array.
     * @param operations The list of operations of the MBean.  This
     * may be null with the same effect as a zero-length array.
     * @param notifications The list of notifications emitted.  This
     * may be null with the same effect as a zero-length array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private final transient boolean arrayGettersSafe;

    /**
     * <p>True if this class is known not to override the array-valued
     * getters of MBeanInfo.  Obviously true for MBeanInfo itself, and true
     * for a subclass where we succeed in reflecting on the methods
     * and discover they are not overridden.</p>
     *
     * <p>The purpose of this variable is to avoid cloning the arrays
     * when doing operations like {@link #equals} where we know they
     * will not be changed.  If a subclass overrides a getter, we
     * cannot access the corresponding array directly.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private final MBeanNotificationInfo[] notifications;

    /**
     * @serial The MBean notification descriptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private final MBeanConstructorInfo[] constructors;

     /**
     * @serial The MBean constructor descriptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private final MBeanOperationInfo[] operations;

    /**
     * @serial The MBean operation descriptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private final MBeanAttributeInfo[] attributes;

    /**
     * @serial The MBean attribute descriptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private final String className;

    /**
     * @serial The MBean qualified name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private final String description;

    /**
     * @serial The human readable description of the class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
    private transient Descriptor descriptor;

    /**
     * @serial The Descriptor for the MBean.  This field
     * can be null, which is equivalent to an empty Descriptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanInfo.java
public class MBeanInfo implements Cloneable, Serializable, DescriptorRead {

/**
 * <p>Describes the management interface exposed by an MBean; that is,
 * the set of attributes and operations which are available for
 * management operations.  Instances of this class are immutable.
 * Subclasses may be mutable but this is not recommended.</p>
 *
 * <p id="info-changed">Usually the {@code MBeanInfo} for any given MBean does
 * not change over the lifetime of that MBean.  Dynamic MBeans can change their
 * {@code MBeanInfo} and in that case it is recommended that they emit a {@link
 * Notification} with a {@linkplain Notification#getType() type} of {@code
 * "jmx.mbean.info.changed"} and a {@linkplain Notification#getUserData()
 * userData} that is the new {@code MBeanInfo}.  This is not required, but
 * provides a conventional way for clients of the MBean to discover the change.
 * See also the <a href="Descriptor.html#immutableInfo">immutableInfo</a> and
 * <a href="Descriptor.html#infoTimeout">infoTimeout</a> fields in the {@code
 * MBeanInfo} {@link Descriptor}.</p>
 *
 * <p>The contents of the <code>MBeanInfo</code> for a Dynamic MBean
 * are determined by its {@link DynamicMBean#getMBeanInfo
 * getMBeanInfo()} method.  This includes Open MBeans and Model
 * MBeans, which are kinds of Dynamic MBeans.</p>
 *
 * <p>The contents of the <code>MBeanInfo</code> for a Standard MBean
 * are determined by the MBean server as follows:</p>
 *
 * <ul>
 *
 * <li>{@link #getClassName()} returns the Java class name of the MBean
 * object;
 *
 * <li>{@link #getConstructors()} returns the list of all public
 * constructors in that object;
 *
 * <li>{@link #getAttributes()} returns the list of all attributes
 * whose existence is deduced from the presence in the MBean interface
 * of a <code>get<i>Name</i></code>, <code>is<i>Name</i></code>, or
 * <code>set<i>Name</i></code> method that conforms to the conventions
 * for Standard MBeans;
 *
 * <li>{@link #getOperations()} returns the list of all methods in
 * the MBean interface that do not represent attributes;
 *
 * <li>{@link #getNotifications()} returns an empty array if the MBean
 * does not implement the {@link NotificationBroadcaster} interface,
 * otherwise the result of calling {@link
 * NotificationBroadcaster#getNotificationInfo()} on it;
 *
 * <li>{@link #getDescriptor()} returns a descriptor containing the contents
 * of any descriptor annotations in the MBean interface (see
 * {@link DescriptorKey &#64;DescriptorKey}).
 *
 * </ul>
 *
 * <p>The description returned by {@link #getDescription()} and the
 * descriptions of the contained attributes and operations are not specified.</p>
 *
 * <p>The remaining details of the <code>MBeanInfo</code> for a
 * Standard MBean are not specified.  This includes the description of
 * any contained constructors, and notifications; the names
 * of parameters to constructors and operations; and the descriptions of
 * constructor parameters.</p>
 *
 * @since 1.5
 */
