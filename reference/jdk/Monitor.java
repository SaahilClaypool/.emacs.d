_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private static class DaemonThreadFactory implements ThreadFactory {

    /**
     * Daemon thread factory used by the monitor executors.
     * <P>
     * This factory creates all new threads used by an Executor in
     * the same ThreadGroup. If there is a SecurityManager, it uses
     * the group of System.getSecurityManager(), else the group of
     * the thread instantiating this DaemonThreadFactory. Each new
     * thread is created as a daemon thread with priority
     * Thread.NORM_PRIORITY. New threads have names accessible via
     * Thread.getName() of "{@literal JMX Monitor <pool-name> Pool [Thread-M]}",
     * where M is the sequence number of the thread created by this
     * factory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private class MonitorTask implements Runnable {

    /**
     * MonitorTask nested class: This class implements the Runnable interface.
     *
     * The MonitorTask is executed periodically with a given fixed delay by the
     * Scheduled Executor Service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private class SchedulerTask implements Runnable {

    /**
     * SchedulerTask nested class: This class implements the Runnable interface.
     *
     * The SchedulerTask is executed periodically with a given fixed delay by
     * the Scheduled Executor Service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private synchronized void cleanupIsComplexTypeAttribute() {

    /**
     * Cleanup the "is complex type attribute" info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private synchronized void cleanupFutures() {

    /**
     * Cleanup the scheduler and monitor tasks futures.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private void monitor(ObservedObject o, int index, int an[]) {

    /**
     * This method is called by the monitor each time
     * the granularity period has been exceeded.
     * @param o The observed object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private void sendNotification(String type, long timeStamp, String msg,
                                  Object derGauge, Object trigger,
                                  ObjectName object, boolean onError) {

    /**
     * This method is used by the monitor MBean to create and send a
     * monitor notification to all the listeners registered for this
     * kind of notification.
     *
     * @param type The notification type.
     * @param timeStamp The notification emission date.
     * @param msg The notification message.
     * @param derGauge The derived gauge.
     * @param trigger The threshold/string (depending on the monitor
     * type) that triggered off the notification.
     * @param object The ObjectName of the observed object that triggered
     * off the notification.
     * @param onError Flag indicating if this monitor notification is
     * an error notification or an alarm notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized int computeAlreadyNotifiedIndex(ObservedObject o,
                                                 int index, int an[]) {

    /**
     * Check if the {@link #alreadyNotifieds} array has been modified.
     * If true recompute the index for the given observed object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized void resetAllAlreadyNotified(ObservedObject o,
                                              int index, int an[]) {

    /**
     * Reset all bits in the given element of {@link #alreadyNotifieds}.
     * Ensure the deprecated {@link #alreadyNotified} field is updated
     * if appropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized void resetAlreadyNotified(ObservedObject o,
                                           int index, int mask) {

    /**
     * Reset the given bits in the given element of {@link #alreadyNotifieds}.
     * Ensure the deprecated {@link #alreadyNotified} field is updated
     * if appropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized void setAlreadyNotified(ObservedObject o, int index,
                                         int mask, int an[]) {

    /**
     * Set the given bits in the given element of {@link #alreadyNotifieds}.
     * Ensure the deprecated {@link #alreadyNotified} field is updated
     * if appropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized boolean isAlreadyNotified(ObservedObject o, int mask) {

    /**
     * Check if the given bits in the given element of {@link #alreadyNotifieds}
     * are set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized void updateAlreadyNotified(ObservedObject o, int index) {

    /**
     * Update the {@link #alreadyNotifieds} array element at the given index
     * with the already notified flag in the given {@code ObservedObject}.
     * Ensure the deprecated {@link #alreadyNotified} field is updated
     * if appropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized void updateDeprecatedAlreadyNotified() {

    /**
     * Update the deprecated {@link #alreadyNotified} field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized void createAlreadyNotified() {

    /**
     * Create the {@link #alreadyNotified} array from
     * the {@code ObservedObject} array list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    ObservedObject createObservedObject(ObjectName object) {

    /**
     * Factory method for ObservedObject creation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized ObservedObject getObservedObject(ObjectName object) {

    /**
     * Get the specified {@code ObservedObject} if this object is
     * contained in the set of observed MBeans, or {@code null}
     * otherwise.
     *
     * @param object the name of the {@code ObservedObject} to retrieve.
     *
     * @return The {@code ObservedObject} associated to the supplied
     * {@code ObjectName}.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized long getDerivedGaugeTimeStamp(ObjectName object) {

    /**
     * Gets the derived gauge timestamp of the specified object, if
     * this object is contained in the set of observed MBeans, or
     * <code>0</code> otherwise.
     *
     * @param object the name of the object whose derived gauge
     * timestamp is to be returned.
     *
     * @return The derived gauge timestamp of the specified object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    synchronized Object getDerivedGauge(ObjectName object) {

    /**
     * Gets the derived gauge of the specified object, if this object is
     * contained in the set of observed MBeans, or <code>null</code> otherwise.
     *
     * @param object the name of the object whose derived gauge is to
     * be returned.
     *
     * @return The derived gauge of the specified object.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    void doStop() {

    /**
     * Stops the monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    void doStart() {

    /**
     * Starts the monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    /* This method must be synchronized so that the monitoring thread will

    /**
     * Tests whether the monitor MBean is active.  A monitor MBean is
     * marked active when the {@link #start start} method is called.
     * It becomes inactive when the {@link #stop stop} method is
     * called.
     *
     * @return <CODE>true</CODE> if the monitor MBean is active,
     * <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public synchronized void setGranularityPeriod(long period)

    /**
     * Sets the granularity period (in milliseconds).
     * <BR>The default value of the granularity period is 10 seconds.
     *
     * @param period The granularity period value.
     * @exception IllegalArgumentException The granularity
     * period is less than or equal to zero.
     *
     * @see #getGranularityPeriod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public synchronized long getGranularityPeriod() {

    /**
     * Gets the granularity period (in milliseconds).
     * <BR>The default value of the granularity period is 10 seconds.
     *
     * @return The granularity period value.
     *
     * @see #setGranularityPeriod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public void setObservedAttribute(String attribute)

    /**
     * Sets the attribute to observe.
     * <BR>The observed attribute is not initialized by default (set to null).
     *
     * @param attribute The attribute to observe.
     * @exception IllegalArgumentException The specified
     * attribute is null.
     *
     * @see #getObservedAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public synchronized String getObservedAttribute() {

    /**
     * Gets the attribute being observed.
     * <BR>The observed attribute is not initialized by default (set to null).
     *
     * @return The attribute being observed.
     *
     * @see #setObservedAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public synchronized ObjectName[] getObservedObjects() {

    /**
     * Returns an array containing the objects being observed.
     *
     * @return The objects being observed.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public synchronized boolean containsObservedObject(ObjectName object) {

    /**
     * Tests whether the specified object is in the set of observed MBeans.
     *
     * @param object The object to check.
     * @return <CODE>true</CODE> if the specified object is present,
     * <CODE>false</CODE> otherwise.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public synchronized void removeObservedObject(ObjectName object) {

    /**
     * Removes the specified object from the set of observed MBeans.
     *
     * @param object The object to remove.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public synchronized void addObservedObject(ObjectName object)

    /**
     * Adds the specified object in the set of observed MBeans, if this object
     * is not already present.
     *
     * @param object The object to observe.
     * @exception IllegalArgumentException The specified object is null.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    @Deprecated

    /**
     * Removes all objects from the set of observed objects, and then adds the
     * specified object.
     *
     * @param object The object to observe.
     * @exception IllegalArgumentException The specified
     * object is null.
     *
     * @see #getObservedObject()
     *
     * @deprecated As of JMX 1.2, replaced by {@link #addObservedObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    @Deprecated

    /**
     * Returns the object name of the first object in the set of observed
     * MBeans, or <code>null</code> if there is no such object.
     *
     * @return The object being observed.
     *
     * @see #setObservedObject(ObjectName)
     *
     * @deprecated As of JMX 1.2, replaced by {@link #getObservedObjects}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public abstract void stop();

    /**
     * Stops the monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public abstract void start();

    /**
     * Starts the monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public void postDeregister() {

    /**
     * Allows the monitor MBean to perform any operations needed after
     * having been unregistered by the MBean server.
     * <P>
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public void preDeregister() throws Exception {

    /**
     * Allows the monitor MBean to perform any operations it needs
     * before being unregistered by the MBean server.
     * <P>
     * Stops the monitor.
     *
     * @exception Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public void postRegister(Boolean registrationDone) {

    /**
     * Allows the monitor MBean to perform any operations needed after
     * having been registered in the MBean server or after the
     * registration has failed.
     * <P>
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    public ObjectName preRegister(MBeanServer server, ObjectName name)

    /**
     * Allows the monitor MBean to perform any operations it needs
     * before being registered in the MBean server.
     * <P>
     * Initializes the reference to the MBean server.
     *
     * @param server The MBean server in which the monitor MBean will
     * be registered.
     * @param name The object name of the monitor MBean.
     *
     * @return The name of the monitor MBean registered.
     *
     * @exception Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    static final Integer INTEGER_ZERO = 0;

    /**
     * Constant used to initialize all the numeric values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    enum NumericalType { BYTE, SHORT, INTEGER, LONG, FLOAT, DOUBLE };

    /**
     * Enumeration used to keep trace of the derived gauge type
     * in counter and gauge monitors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    static final int THRESHOLD_ERROR_NOTIFIED                           = 16;

    /**
     * Flag denoting that a notification has occurred after changing
     * the threshold. This flag is used to notify any exception
     * related to invalid thresholds settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    final List<ObservedObject> observedObjects =

    /**
     * List of ObservedObjects to which the attribute to observe belongs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    @Deprecated

    /**
     * This field is retained for compatibility but should not be referenced.
     *
     * @deprecated No replacement.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected static final int RUNTIME_ERROR_NOTIFIED                   = 8;

    /**
     * Flag denoting that a notification has occurred after changing
     * the observed object or the observed attribute.  This flag is
     * used to notify any exception (except the cases described above)
     * when trying to get the value of the observed attribute at the
     * time of the first notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected static final int OBSERVED_ATTRIBUTE_TYPE_ERROR_NOTIFIED   = 4;

    /**
     * Flag denoting that a notification has occurred after changing
     * the observed object or the observed attribute.  This flag is
     * used to check that the observed attribute type is correct
     * (depending on the monitor in use) at the time of the first
     * notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected static final int OBSERVED_ATTRIBUTE_ERROR_NOTIFIED        = 2;

    /**
     * Flag denoting that a notification has occurred after changing
     * the observed attribute.  This flag is used to check that the
     * new observed attribute belongs to the observed object at the
     * time of the first notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected static final int OBSERVED_OBJECT_ERROR_NOTIFIED           = 1;

    /**
     * Flag denoting that a notification has occurred after changing
     * the observed object.  This flag is used to check that the new
     * observed object is registered in the MBean server at the time
     * of the first notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected static final int RESET_FLAGS_ALREADY_NOTIFIED             = 0;

    /**
     * This flag is used to reset the {@link #alreadyNotifieds
     * alreadyNotifieds} monitor attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected MBeanServer server;

    /**
     * Reference to the MBean server.  This reference is null when the
     * monitor MBean is not registered in an MBean server.  This
     * reference is initialized before the monitor MBean is registered
     * in the MBean server.
     * @see #preRegister(MBeanServer server, ObjectName name)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected int alreadyNotifieds[] = new int[capacityIncrement];

    /**
     * <p>Selected monitor errors that have already been notified.</p>
     *
     * <p>Each element in this array corresponds to an observed object
     * in the vector.  It contains a bit mask of the flags {@link
     * #OBSERVED_OBJECT_ERROR_NOTIFIED} etc, indicating whether the
     * corresponding notification has already been sent for the MBean
     * being monitored.</p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    @Deprecated

    /**
     * Monitor errors that have already been notified.
     * @deprecated equivalent to {@link #alreadyNotifieds}[0].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected int elementCount = 0;

    /**
     * The number of valid components in the vector of observed objects.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    protected final static int capacityIncrement = 16;

    /**
     * The amount by which the capacity of the monitor arrays are
     * automatically incremented when their size becomes greater than
     * their capacity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private ScheduledFuture<?> schedulerFuture;

    /**
     * ScheduledFuture associated to the current scheduler task.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private final SchedulerTask schedulerTask = new SchedulerTask();

    /**
     * Scheduler task to be executed by the Scheduler Service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private Future<?> monitorFuture;

    /**
     * Future associated to the current monitor task.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private static final int maximumPoolSize;

    /**
     * Maximum Pool Size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private static final Object executorsLock = new Object();

    /**
     * Lock for executors map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private static final Map<ThreadPoolExecutor, Void> executors =

    /**
     * Map containing the thread pool executor per thread group.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private static final ScheduledExecutorService scheduler =

    /**
     * Scheduler Service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private static final AccessControlContext noPermissionsACC =

    /**
     * AccessControlContext of the Monitor.start() caller.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private final List<String> remainingAttributes =

    /**
     * Remaining attribute names extracted from complex type attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private String firstAttribute;

    /**
     * First attribute name extracted from complex type attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private boolean isComplexTypeAttribute = false;

    /**
     * Complex type attribute flag.
     * The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private final AtomicLong sequenceNumber = new AtomicLong();

    /**
     * Monitor sequence number.
     * The default value is set to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private boolean isActive = false;

    /**
     * Monitor state.
     * The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private long granularityPeriod = 10000;

    /**
     * Monitor granularity period (in milliseconds).
     * The default value is set to 10 seconds.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
    private String observedAttribute;

    /**
     * Attribute to observe.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/Monitor.java
public abstract class Monitor

/**
 * Defines the part common to all monitor MBeans.
 * A monitor MBean monitors values of an attribute common to a set of observed
 * MBeans. The observed attribute is monitored at intervals specified by the
 * granularity period. A gauge value (derived gauge) is derived from the values
 * of the observed attribute.
 *
 *
 * @since 1.5
 */
