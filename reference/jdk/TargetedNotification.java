_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/TargetedNotification.java
    private Notification notif;

    /**
     * @serial A notification to transmit to the other side.
     * @see #getNotification()
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/TargetedNotification.java
    public String toString() {

    /**
     * Returns a textual representation of this Targeted Notification.
     *
     * @return a String representation of this Targeted Notification.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/TargetedNotification.java
    public Integer getListenerID() {

    /**
     * <p>The ID of the listener to which the notification is
     *    targeted.</p>
     *
     * @return The listener ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/TargetedNotification.java
    public Notification getNotification() {

    /**
     * <p>The emitted notification.</p>
     *
     * @return The notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/TargetedNotification.java
    public TargetedNotification(Notification notification,
                                Integer listenerID) {

    /**
     * <p>Constructs a <code>TargetedNotification</code> object.  The
     * object contains a pair (Notification, Listener ID).
     * The Listener ID identifies the client listener to which that
     * notification is targeted. The client listener ID is one
     * previously returned by the connector server in response to an
     * <code>addNotificationListener</code> request.</p>
     * @param notification Notification emitted from the MBean server.
     * @param listenerID   The ID of the listener to which this
     *        notification is targeted.
     * @exception IllegalArgumentException if the <var>listenerID</var>
     *        or <var>notification</var> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/TargetedNotification.java
//     public TargetedNotification(Notification notification,
//                              int listenerID) {

//     /**
//      * <p>Constructs a <code>TargetedNotification</code> object.  The
//      * object contains a pair (Notification, Listener ID).
//      * The Listener ID identifies the client listener to which that
//      * notification is targeted. The client listener ID is one
//      * previously returned by the connector server in response to an
//      * <code>addNotificationListener</code> request.</p>
//      * @param notification Notification emitted from the MBean server.
//      * @param listenerID   The ID of the listener to which this
//      *        notification is targeted.
//      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/TargetedNotification.java
public class TargetedNotification implements Serializable {

/**
 * <p>A (Notification, Listener ID) pair.</p>
 * <p>This class is used to associate an emitted notification
 *    with the listener ID to which it is targeted.</p>
 *
 * @since 1.5
 */
