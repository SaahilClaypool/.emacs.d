_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private boolean beingReconnected = false;

    /**
     * This variable is used to tell whether a connector (RMIConnector or ClientIntermediary)
     * is doing reconnection.
     * This variable will be set to true by the method <code>preReconnection</code>, and set
     * to false by <code>postReconnection</code>.
     * When beingReconnected == true, no thread will be created for fetching notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int TERMINATED = 4;

    /**
     * This state means that this object is terminated and no more thread will be created
     * for fetching notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STOPPED = 3;

    /**
     * This state means that the fetching thread is already stopped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STOPPING = 2;

    /**
     * This state means that the fetching thread is informed to stop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STARTED = 1;

    /**
     * This state tells that a thread has been started for fetching and forwarding notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STARTING = 0;

    /**
     * This state means that a thread is being created for fetching and forwarding notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private synchronized void beforeRemove() throws IOException {

    /**
     * Import: should not remove a listener during reconnection, the reconnection
     * needs to change the listener list and that will possibly make removal fail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    public synchronized void postReconnection(ClientListenerInfo[] listenerInfos)

    /**
     * Called after reconnection is finished.
     * This method is intended to be called only by a client connector:
     * <code>RMIConnector</code> and <code>ClientIntermediary</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    abstract protected void lostNotifs(String message, long number);

    /**
     * Used to send out a notification about lost notifs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    abstract protected NotificationResult fetchNotifs(long clientSequenceNumber,
                                                      int maxNotifications,
                                                      long timeout)

    /**
     * Called to to fetch notifications from a server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private boolean beingReconnected = false;

    /**
     * This variable is used to tell whether a connector (RMIConnector or ClientIntermediary)
     * is doing reconnection.
     * This variable will be set to true by the method <code>preReconnection</code>, and set
     * to false by <code>postReconnection</code>.
     * When beingReconnected == true, no thread will be created for fetching notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int TERMINATED = 4;

    /**
     * This state means that this object is terminated and no more thread will be created
     * for fetching notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STOPPED = 3;

    /**
     * This state means that the fetching thread is already stopped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STOPPING = 2;

    /**
     * This state means that the fetching thread is informed to stop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STARTED = 1;

    /**
     * This state tells that a thread has been started for fetching and forwarding notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private static final int STARTING = 0;

    /**
     * This state means that a thread is being created for fetching and forwarding notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    private synchronized void beforeRemove() throws IOException {

    /**
     * Import: should not remove a listener during reconnection, the reconnection
     * needs to change the listener list and that will possibly make removal fail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    public synchronized void postReconnection(ClientListenerInfo[] listenerInfos)

    /**
     * Called after reconnection is finished.
     * This method is intended to be called only by a client connector:
     * <code>RMIConnector</code> and <code>ClientIntermediary</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    abstract protected void lostNotifs(String message, long number);

    /**
     * Used to send out a notification about lost notifs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ClientNotifForwarder.java
    abstract protected NotificationResult fetchNotifs(long clientSequenceNumber,
                                                      int maxNotifications,
                                                      long timeout)

    /**
     * Called to to fetch notifications from a server.
     */
