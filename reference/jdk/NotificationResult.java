_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/NotificationResult.java
    public String toString() {

    /**
     * Returns a string representation of the object.  The result
     * should be a concise but informative representation that is easy
     * for a person to read.
     *
     * @return a string representation of the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/NotificationResult.java
    public TargetedNotification[] getTargetedNotifications() {

    /**
     * Returns the notifications resulting from the query, and the
     * listeners they correspond to.
     *
     * @return the notifications resulting from the query, and the
     * listeners they correspond to.  This array can be empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/NotificationResult.java
    public long getNextSequenceNumber() {

    /**
     * Returns the sequence number of the next notification available
     * for querying.
     *
     * @return the sequence number of the next notification available
     * for querying.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/NotificationResult.java
    public long getEarliestSequenceNumber() {

    /**
     * Returns the sequence number of the earliest notification still
     * in the buffer.
     *
     * @return the sequence number of the earliest notification still
     * in the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/NotificationResult.java
    public NotificationResult(long earliestSequenceNumber,
                              long nextSequenceNumber,
                              TargetedNotification[] targetedNotifications) {

    /**
     * <p>Constructs a notification query result.</p>
     *
     * @param earliestSequenceNumber the sequence number of the
     * earliest notification still in the buffer.
     * @param nextSequenceNumber the sequence number of the next
     * notification available for querying.
     * @param targetedNotifications the notifications resulting from
     * the query, and the listeners they correspond to.  This array
     * can be empty.
     *
     * @exception IllegalArgumentException if
     * <code>targetedNotifications</code> is null or if
     * <code>earliestSequenceNumber</code> or
     * <code>nextSequenceNumber</code> is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/NotificationResult.java
public class NotificationResult implements Serializable {

/**
 * <p>Result of a query for buffered notifications.  Notifications in
 * a notification buffer have positive, monotonically increasing
 * sequence numbers.  The result of a notification query contains the
 * following elements:</p>
 *
 * <ul>
 *
 * <li>The sequence number of the earliest notification still in
 * the buffer.
 *
 * <li>The sequence number of the next notification available for
 * querying.  This will be the starting sequence number for the next
 * notification query.
 *
 * <li>An array of (Notification,listenerID) pairs corresponding to
 * the returned notifications and the listeners they correspond to.
 *
 * </ul>
 *
 * <p>It is possible for the <code>nextSequenceNumber</code> to be less
 * than the <code>earliestSequenceNumber</code>.  This signifies that
 * notifications between the two might have been lost.</p>
 *
 * @since 1.5
 */
