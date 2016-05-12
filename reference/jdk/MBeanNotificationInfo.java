_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
    public boolean equals(Object o) {

    /**
     * Compare this MBeanNotificationInfo to another.
     *
     * @param o the object to compare to.
     *
     * @return true if and only if <code>o</code> is an MBeanNotificationInfo
     * such that its {@link #getName()}, {@link #getDescription()},
     * {@link #getDescriptor()},
     * and {@link #getNotifTypes()} values are equal (not necessarily
     * identical) to those of this MBeanNotificationInfo.  Two
     * notification type arrays are equal if their corresponding
     * elements are equal.  They are not equal if they have the same
     * elements but in a different order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
    public String[] getNotifTypes() {

    /**
     * Returns the array of strings (in dot notation) containing the
     * notification types that the MBean may emit.
     *
     * @return the array of strings.  Changing the returned array has no
     * effect on this MBeanNotificationInfo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
     public Object clone () {

    /**
     * Returns a shallow clone of this instance.
     * The clone is obtained by simply calling <tt>super.clone()</tt>,
     * thus calling the default native shallow cloning mechanism
     * implemented by <tt>Object.clone()</tt>.
     * No deeper cloning of any internal field is made.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
    public MBeanNotificationInfo(String[] notifTypes,
                                 String name,
                                 String description,
                                 Descriptor descriptor) {

    /**
     * Constructs an <CODE>MBeanNotificationInfo</CODE> object.
     *
     * @param notifTypes The array of strings (in dot notation)
     * containing the notification types that the MBean may emit.
     * This may be null with the same effect as a zero-length array.
     * @param name The fully qualified Java class name of the
     * described notifications.
     * @param description A human readable description of the data.
     * @param descriptor The descriptor for the notifications.  This may be null
     * which is equivalent to an empty descriptor.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
    public MBeanNotificationInfo(String[] notifTypes,
                                 String name,
                                 String description) {

    /**
     * Constructs an <CODE>MBeanNotificationInfo</CODE> object.
     *
     * @param notifTypes The array of strings (in dot notation)
     * containing the notification types that the MBean may emit.
     * This may be null with the same effect as a zero-length array.
     * @param name The fully qualified Java class name of the
     * described notifications.
     * @param description A human readable description of the data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
    private final transient boolean arrayGettersSafe;

    /** @see MBeanInfo#arrayGettersSafe */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
    private String[] types;

    /**
     * @serial The different types of the notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanNotificationInfo.java
public class MBeanNotificationInfo extends MBeanFeatureInfo implements Cloneable {

/**
 * <p>The <CODE>MBeanNotificationInfo</CODE> class is used to describe the
 * characteristics of the different notification instances
 * emitted by an MBean, for a given Java class of notification.
 * If an MBean emits notifications that can be instances of different Java classes,
 * then the metadata for that MBean should provide an <CODE>MBeanNotificationInfo</CODE>
 * object for each of these notification Java classes.</p>
 *
 * <p>Instances of this class are immutable.  Subclasses may be
 * mutable but this is not recommended.</p>
 *
 * <p>This class extends <CODE>javax.management.MBeanFeatureInfo</CODE>
 * and thus provides <CODE>name</CODE> and <CODE>description</CODE> fields.
 * The <CODE>name</CODE> field should be the fully qualified Java class name of
 * the notification objects described by this class.</p>
 *
 * <p>The <CODE>getNotifTypes</CODE> method returns an array of
 * strings containing the notification types that the MBean may
 * emit. The notification type is a dot-notation string which
 * describes what the emitted notification is about, not the Java
 * class of the notification.  A single generic notification class can
 * be used to send notifications of several types.  All of these types
 * are returned in the string array result of the
 * <CODE>getNotifTypes</CODE> method.
 *
 * @since 1.5
 */
