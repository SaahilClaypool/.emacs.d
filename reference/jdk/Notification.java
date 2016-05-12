_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link Notification} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link Notification} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    @Override

    /**
     * Returns a String representation of this notification.
     *
     * @return A String representation of this notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public void setUserData(Object userData) {

    /**
     * Set the user data.
     *
     * @param userData The user data object. It is used for whatever data
     * the notification source wishes to communicate to its consumers.
     *
     * @see #getUserData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public Object getUserData() {

    /**
     * Get the user data.
     *
     * @return The user data object. It is used for whatever data
     * the notification source wishes to communicate to its consumers.
     *
     * @see #setUserData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public String getMessage() {

    /**
     * Get the notification message.
     *
     * @return The message string of this notification object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public void setTimeStamp(long timeStamp) {

    /**
     * Set the notification timestamp.
     *
     * @param timeStamp The notification timestamp. It indicates when the notification was generated.
     *
     * @see #getTimeStamp
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public long getTimeStamp() {

    /**
     * Get the notification timestamp.
     *
     * @return The notification timestamp.
     *
     * @see #setTimeStamp
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public String getType() {

    /**
     * Get the notification type.
     *
     * @return The notification type. It's a string expressed in a dot notation
     * similar to Java properties. It is recommended that the notification type
     * should follow the reverse-domain-name convention used by Java package
     * names.  An example of a notification type is com.example.alarm.router.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public void setSequenceNumber(long sequenceNumber) {

    /**
     * Set the notification sequence number.
     *
     * @param sequenceNumber The notification sequence number within the source object. It is
     * a serial number identifying a particular instance of notification in the
     * context of the notification source.
     *
     * @see #getSequenceNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public long getSequenceNumber() {

    /**
     * Get the notification sequence number.
     *
     * @return The notification sequence number within the source object. It's a serial number
     * identifying a particular instance of notification in the context of the notification source.
     * The notification model does not assume that notifications will be received in the same order
     * that they are sent. The sequence number helps listeners to sort received notifications.
     *
     * @see #setSequenceNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public void setSource(Object source) {

    /**
     * Sets the source.
     *
     * @param source the new source for this object.
     *
     * @see EventObject#getSource
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public Notification(String type, Object source, long sequenceNumber, long timeStamp, String message) {

    /**
     * Creates a Notification object.
     *
     * @param type The notification type.
     * @param source The notification source.
     * @param sequenceNumber The notification sequence number within the source object.
     * @param timeStamp The notification emission date.
     * @param message The detailed message.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public Notification(String type, Object source, long sequenceNumber, long timeStamp) {

    /**
     * Creates a Notification object.
     *
     * @param type The notification type.
     * @param source The notification source.
     * @param sequenceNumber The notification sequence number within the source object.
     * @param timeStamp The notification emission date.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public Notification(String type, Object source, long sequenceNumber, String message) {

    /**
     * Creates a Notification object.
     * The notification timeStamp is set to the current date.
     *
     * @param type The notification type.
     * @param source The notification source.
     * @param sequenceNumber The notification sequence number within the source object.
     * @param message The detailed message.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    public Notification(String type, Object source, long sequenceNumber) {

    /**
     * Creates a Notification object.
     * The notification timeStamp is set to the current date.
     *
     * @param type The notification type.
     * @param source The notification source.
     * @param sequenceNumber The notification sequence number within the source object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    protected Object source = null;

    /**
     * <p>This field hides the {@link EventObject#source} field in the
     * parent class to make it non-transient and therefore part of the
     * serialized form.</p>
     *
     * @serial The object on which the notification initially occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private String message  = "";

    /**
     * @serial The notification message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private Object userData = null;

    /**
     * @serial The notification user data.
     *         Used for whatever other data the notification
     *         source wishes to communicate to its consumers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private long timeStamp;

    /**
     * @serial The notification timestamp.
     *         Indicating when the notification was generated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private long sequenceNumber;

    /**
     * @serial The notification sequence number.
     *         A serial number which identify particular instance
     *         of notification in the context of the notification source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private String type;

    /**
     * @serial The notification type.
     *         A string expressed in a dot notation similar to Java properties.
     *         An example of a notification type is network.alarm.router
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField type String The notification type.
     *              A string expressed in a dot notation similar to Java properties.
     *              An example of a notification type is network.alarm.router
     * @serialField sequenceNumber long The notification sequence number.
     *              A serial number which identify particular instance
     *              of notification in the context of the notification source.
     * @serialField timeStamp long The notification timestamp.
     *              Indicating when the notification was generated
     * @serialField userData Object The notification user data.
     *              Used for whatever other data the notification
     *              source wishes to communicate to its consumers
     * @serialField message String The notification message.
     * @serialField source Object The object on which the notification initially occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Notification.java
@SuppressWarnings("serial")  // serialVersionUID is not constant

/**
 * <p>The Notification class represents a notification emitted by an
 * MBean.  It contains a reference to the source MBean: if the
 * notification has been forwarded through the MBean server, and the
 * original source of the notification was a reference to the emitting
 * MBean object, then the MBean server replaces it by the MBean's
 * ObjectName.  If the listener has registered directly with the
 * MBean, this is either the object name or a direct reference to the
 * MBean.</p>
 *
 * <p>It is strongly recommended that notification senders use the
 * object name rather than a reference to the MBean object as the
 * source.</p>
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-7516092053498031989L</code>.
 *
 * @since 1.5
 */
