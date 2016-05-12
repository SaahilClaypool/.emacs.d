_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public static final ObjectName DELEGATE_NAME =

    /**
     * Defines the default ObjectName of the MBeanServerDelegate.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public void sendNotification(Notification notification) {

    /**
     * Enables the MBean server to send a notification.
     * If the passed <var>notification</var> has a sequence number lesser
     * or equal to 0, then replace it with the delegate's own sequence
     * number.
     * @param notification The notification to send.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public String getImplementationVendor()  {

    /**
     * Returns the JMX implementation vendor (the vendor of this product).
     *
     * @return the implementation vendor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public String getImplementationVersion() {

    /**
     * Returns the JMX implementation version (the version of this product).
     *
     * @return the implementation version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public String getImplementationName() {

    /**
     * Returns the JMX implementation name (the name of this product).
     *
     * @return the implementation name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public String getSpecificationVendor() {

    /**
     * Returns the vendor of the JMX specification implemented
     * by this product.
     *
     * @return the specification vendor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public String getSpecificationVersion() {

    /**
     * Returns the version of the JMX specification implemented
     * by this product.
     *
     * @return the specification version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public String getSpecificationName() {

    /**
     * Returns the full name of the JMX specification implemented
     * by this product.
     *
     * @return the specification name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public synchronized String getMBeanServerId() {

    /**
     * Returns the MBean server agent identity.
     *
     * @return the identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    public MBeanServerDelegate () {

    /**
     * Create a MBeanServerDelegate object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    private final NotificationBroadcasterSupport broadcaster;

    /** The NotificationBroadcasterSupport object that sends the
        notifications */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
    private String mbeanServerId ;

    /** The MBean server agent identification.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanServerDelegate.java
public class MBeanServerDelegate implements MBeanServerDelegateMBean,

/**
 * Represents  the MBean server from the management point of view.
 * The MBeanServerDelegate MBean emits the MBeanServerNotifications when
 * an MBean is registered/unregistered in the MBean server.
 *
 * @since 1.5
 */
