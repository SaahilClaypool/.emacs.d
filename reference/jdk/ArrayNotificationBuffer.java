_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ArrayNotificationBuffer.java
    private static Exception extractException(Exception e) {

    /**
     * Iterate until we extract the real exception
     * from a stack of PrivilegedActionExceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ArrayNotificationBuffer.java
    public NotificationResult

    /**
     * <p>Fetch notifications that match the given listeners.</p>
     *
     * <p>The operation only considers notifications with a sequence
     * number at least <code>startSequenceNumber</code>.  It will take
     * no longer than <code>timeout</code>, and will return no more
     * than <code>maxNotifications</code> different notifications.</p>
     *
     * <p>If there are no notifications matching the criteria, the
     * operation will block until one arrives, subject to the
     * timeout.</p>
     *
     * @param filter an object that will add notifications to a
     * {@code List<TargetedNotification>} if they match the current
     * listeners with their filters.
     * @param startSequenceNumber the first sequence number to
     * consider.
     * @param timeout the maximum time to wait.  May be 0 to indicate
     * not to wait if there are no notifications.
     * @param maxNotifications the maximum number of notifications to
     * return.  May be 0 to indicate a wait for eligible notifications
     * that will return a usable <code>nextSequenceNumber</code>.  The
     * {@link TargetedNotification} array in the returned {@link
     * NotificationResult} may contain more than this number of
     * elements but will not contain more than this number of
     * different notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ArrayNotificationBuffer.java
/*

/** A circular buffer of notifications received from an MBean server. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ArrayNotificationBuffer.java
    private static Exception extractException(Exception e) {

    /**
     * Iterate until we extract the real exception
     * from a stack of PrivilegedActionExceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ArrayNotificationBuffer.java
    public NotificationResult

    /**
     * <p>Fetch notifications that match the given listeners.</p>
     *
     * <p>The operation only considers notifications with a sequence
     * number at least <code>startSequenceNumber</code>.  It will take
     * no longer than <code>timeout</code>, and will return no more
     * than <code>maxNotifications</code> different notifications.</p>
     *
     * <p>If there are no notifications matching the criteria, the
     * operation will block until one arrives, subject to the
     * timeout.</p>
     *
     * @param filter an object that will add notifications to a
     * {@code List<TargetedNotification>} if they match the current
     * listeners with their filters.
     * @param startSequenceNumber the first sequence number to
     * consider.
     * @param timeout the maximum time to wait.  May be 0 to indicate
     * not to wait if there are no notifications.
     * @param maxNotifications the maximum number of notifications to
     * return.  May be 0 to indicate a wait for eligible notifications
     * that will return a usable <code>nextSequenceNumber</code>.  The
     * {@link TargetedNotification} array in the returned {@link
     * NotificationResult} may contain more than this number of
     * elements but will not contain more than this number of
     * different notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ArrayNotificationBuffer.java
/*

/** A circular buffer of notifications received from an MBean server. */
