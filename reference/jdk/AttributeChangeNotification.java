_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    public Object getNewValue() {

    /**
     * Gets the new value of the attribute which has changed.
     *
     * @return An Object containing the new value of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    public Object getOldValue() {

    /**
     * Gets the old value of the attribute which has changed.
     *
     * @return An Object containing the old value of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    public String getAttributeType() {

    /**
     * Gets the type of the attribute which has changed.
     *
     * @return A String containing the type of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    public String getAttributeName() {

    /**
     * Gets the name of the attribute which has changed.
     *
     * @return A String containing the name of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    public AttributeChangeNotification(Object source, long sequenceNumber, long timeStamp, String msg,
                                       String attributeName, String attributeType, Object oldValue, Object newValue) {

    /**
     * Constructs an attribute change notification object.
     * In addition to the information common to all notification, the caller must supply the name and type
     * of the attribute, as well as its old and new values.
     *
     * @param source The notification producer, that is, the MBean the attribute belongs to.
     * @param sequenceNumber The notification sequence number within the source object.
     * @param timeStamp The date at which the notification is being sent.
     * @param msg A String containing the message of the notification.
     * @param attributeName A String giving the name of the attribute.
     * @param attributeType A String containing the type of the attribute.
     * @param oldValue An object representing value of the attribute before the change.
     * @param newValue An object representing value of the attribute after the change.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    private Object newValue = null;

    /**
     * @serial The MBean attribute new value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    private Object oldValue = null;

    /**
     * @serial The MBean attribute old value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    private String attributeType = null;

    /**
     * @serial The MBean attribute type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    private String attributeName = null;

    /**
     * @serial The MBean attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
    public static final String ATTRIBUTE_CHANGE = "jmx.attribute.change";

    /**
     * Notification type which indicates that the observed MBean attribute value has changed.
     * <BR>The value of this type string is <CODE>jmx.attribute.change</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AttributeChangeNotification.java
public class AttributeChangeNotification extends javax.management.Notification {

/**
 * Provides definitions of the attribute change notifications sent by MBeans.
 * <P>
 * It's up to the MBean owning the attribute of interest to create and send
 * attribute change notifications when the attribute change occurs.
 * So the <CODE>NotificationBroadcaster</CODE> interface has to be implemented
 * by any MBean for which an attribute change is of interest.
 * <P>
 * Example:
 * If an MBean called <CODE>myMbean</CODE> needs to notify registered listeners
 * when its attribute:
 * <BLOCKQUOTE><CODE>
 *      String myString
 * </CODE></BLOCKQUOTE>
 * is modified, <CODE>myMbean</CODE> creates and emits the following notification:
 * <BLOCKQUOTE><CODE>
 * new AttributeChangeNotification(myMbean, sequenceNumber, timeStamp, msg,
 *                                 "myString", "String", oldValue, newValue);
 * </CODE></BLOCKQUOTE>
 *
 * @since 1.5
 */
