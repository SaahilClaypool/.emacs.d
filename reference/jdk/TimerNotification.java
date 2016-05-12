_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/TimerNotification.java
    Object cloneTimerNotification() {

    /**
     * Creates and returns a copy of this object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/TimerNotification.java
    public Integer getNotificationID() {

    /**
     * Gets the identifier of this timer notification.
     *
     * @return The identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/TimerNotification.java
    public TimerNotification(String type, Object source, long sequenceNumber, long timeStamp, String msg, Integer id) {

    /**
     * Creates a timer notification object.
     *
     * @param type The notification type.
     * @param source The notification producer.
     * @param sequenceNumber The notification sequence number within the source object.
     * @param timeStamp The notification emission date.
     * @param msg The notification message.
     * @param id The notification identifier.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/TimerNotification.java
    private Integer notificationID;

    /**
     * @serial Timer notification identifier.
     *         This identifier is used to retrieve a timer notification from the timer list of notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/TimerNotification.java
public class TimerNotification extends javax.management.Notification {

/**
 * This class provides definitions of the notifications sent by timer MBeans.
 * <BR>It defines a timer notification identifier which allows to retrieve a timer notification
 * from the list of notifications of a timer MBean.
 * <P>
 * The timer notifications are created and handled by the timer MBean.
 *
 * @since 1.5
 */
