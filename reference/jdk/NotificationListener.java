_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotificationListener.java
    public void handleNotification(Notification notification, Object handback);

    /**
    * Invoked when a JMX notification occurs.
    * The implementation of this method should return as soon as possible, to avoid
    * blocking its notification broadcaster.
    *
    * @param notification The notification.
    * @param handback An opaque object which helps the listener to associate
    * information regarding the MBean emitter. This object is passed to the
    * addNotificationListener call and resent, without modification, to the
    * listener.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotificationListener.java
public interface NotificationListener extends java.util.EventListener   {

/**
 * Should be implemented by an object that wants to receive notifications.
 *
 * @since 1.5
 */
