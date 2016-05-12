_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/UnsolicitedNotificationEvent.java
    public void dispatch(UnsolicitedNotificationListener listener) {

    /**
     * Invokes the <tt>notificationReceived()</tt> method on
     * a listener using this event.
     * @param listener The non-null listener on which to invoke
     * <tt>notificationReceived</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/UnsolicitedNotificationEvent.java
    public UnsolicitedNotification getNotification() {

    /**
     * Returns the unsolicited notification.
     * @return The non-null unsolicited notification that caused this
     * event to be fired.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/UnsolicitedNotificationEvent.java
    public UnsolicitedNotificationEvent(Object src,
        UnsolicitedNotification notice) {

    /**
     * Constructs a new instance of <tt>UnsolicitedNotificationEvent</tt>.
     *
     * @param src The non-null source that fired the event.
     * @param notice The non-null unsolicited notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/UnsolicitedNotificationEvent.java
public class UnsolicitedNotificationEvent extends java.util.EventObject {

/**
 * This class represents an event fired in response to an unsolicited
 * notification sent by the LDAP server.
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 * @author Vincent Ryan
 *
 * @see UnsolicitedNotification
 * @see UnsolicitedNotificationListener
 * @see javax.naming.event.EventContext#addNamingListener
 * @see javax.naming.event.EventDirContext#addNamingListener
 * @see javax.naming.event.EventContext#removeNamingListener
 * @since 1.3
 */
