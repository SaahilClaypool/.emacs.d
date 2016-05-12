_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Override

    /**
     * Tests if the threshold, offset and modulus of the specified observed
     * object are of the same type as the counter. Only integer types are
     * allowed.
     *
     * Note:
     *   If the optional offset or modulus have not been initialized, their
     *   default value is an Integer object with a value equal to zero.
     *
     * @param object The observed object.
     * @param attribute The observed attribute.
     * @param value The sample value.
     * @return <CODE>true</CODE> if type is the same,
     * <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Override

    /**
     * This method globally sets the derived gauge type for the given
     * "object" and "attribute" after checking that the type of the
     * supplied observed attribute value is one of the value types
     * supported by this monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Override

    /**
     * Factory method for ObservedObject creation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private synchronized void setDerivedGaugeWithDifference(
        Number scanCounter, Number mod, CounterMonitorObservedObject o) {

    /**
     * Sets the derived gauge of the specified observed object when the
     * differenceMode flag is set to <CODE>true</CODE>.  Integer types
     * only are allowed.
     *
     * @param scanCounter The value of the observed attribute.
     * @param mod The counter modulus value.
     * @param o The observed object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private synchronized void updateThreshold(CounterMonitorObservedObject o) {

    /**
     * Updates the threshold attribute of the observed object.
     * @param o The observed object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private synchronized MonitorNotification updateNotifications(
        CounterMonitorObservedObject o) {

    /**
     * Updates the notification attribute of the observed object
     * and notifies the listeners only once if the notify flag
     * is set to <CODE>true</CODE>.
     * @param o The observed object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private synchronized boolean updateDerivedGauge(
        Object scanCounter, CounterMonitorObservedObject o) {

    /**
     * Updates the derived gauge attribute of the observed object.
     *
     * @param scanCounter The value of the observed attribute.
     * @param o The observed object.
     * @return <CODE>true</CODE> if the derived gauge value is valid,
     * <CODE>false</CODE> otherwise.  The derived gauge value is
     * invalid when the differenceMode flag is set to
     * <CODE>true</CODE> and it is the first notification (so we
     * haven't 2 consecutive values to update the derived gauge).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Override

    /**
     * Returns a <CODE>NotificationInfo</CODE> object containing the
     * name of the Java class of the notification and the notification
     * types sent by the counter monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized void setDifferenceMode(boolean value) {

    /**
     * Sets the difference mode flag value common to all observed MBeans.
     *
     * @param value The difference mode flag value.
     *
     * @see #getDifferenceMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized boolean getDifferenceMode() {

    /**
     * Gets the difference mode flag value common to all observed MBeans.
     *
     * @return <CODE>true</CODE> if the difference mode is used,
     * <CODE>false</CODE> otherwise.
     *
     * @see #setDifferenceMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized void setNotify(boolean value) {

    /**
     * Sets the notification's on/off switch value common to all
     * observed MBeans.
     *
     * @param value The notification's on/off switch value.
     *
     * @see #getNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized boolean getNotify() {

    /**
     * Gets the notification's on/off switch value common to all
     * observed MBeans.
     *
     * @return <CODE>true</CODE> if the counter monitor notifies when
     * exceeding the threshold, <CODE>false</CODE> otherwise.
     *
     * @see #setNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized void setModulus(Number value)

    /**
     * Sets the modulus value common to all observed MBeans.
     *
     * @param value The modulus value.
     *
     * @exception IllegalArgumentException The specified
     * modulus is null or the modulus value is less than zero.
     *
     * @see #getModulus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized Number getModulus() {

    /**
     * Gets the modulus value common to all observed MBeans.
     *
     * @see #setModulus
     *
     * @return The modulus value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized void setOffset(Number value)

    /**
     * Sets the offset value common to all observed MBeans.
     *
     * @param value The offset value.
     *
     * @exception IllegalArgumentException The specified
     * offset is null or the offset value is less than zero.
     *
     * @see #getOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized Number getOffset() {

    /**
     * Gets the offset value common to all observed MBeans.
     *
     * @return The offset value.
     *
     * @see #setOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Deprecated

    /**
     * Sets the initial threshold value.
     *
     * @param value The initial threshold value.
     *
     * @exception IllegalArgumentException The specified threshold is
     * null or the threshold value is less than zero.
     *
     * @see #getThreshold()
     *
     * @deprecated As of JMX 1.2, replaced by {@link #setInitThreshold}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Deprecated

    /**
     * Gets the threshold value of the first object in the set of
     * observed MBeans.
     *
     * @return The threshold value.
     *
     * @see #setThreshold
     *
     * @deprecated As of JMX 1.2, replaced by {@link #getThreshold(ObjectName)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Deprecated

    /**
     * Gets the derived gauge timestamp of the first object in the set
     * of observed MBeans.
     *
     * @return The derived gauge timestamp.
     *
     * @deprecated As of JMX 1.2, replaced by
     * {@link #getDerivedGaugeTimeStamp(ObjectName)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Deprecated

    /**
     * Returns the derived gauge of the first object in the set of
     * observed MBeans.
     *
     * @return The derived gauge.
     *
     * @deprecated As of JMX 1.2, replaced by
     * {@link #getDerivedGauge(ObjectName)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized void setInitThreshold(Number value)

    /**
     * Sets the initial threshold value common to all observed objects.
     *
     * <BR>The current threshold of every object in the set of
     * observed MBeans is updated consequently.
     *
     * @param value The initial threshold value.
     *
     * @exception IllegalArgumentException The specified
     * threshold is null or the threshold value is less than zero.
     *
     * @see #getInitThreshold
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized Number getInitThreshold() {

    /**
     * Gets the initial threshold value common to all observed objects.
     *
     * @return The initial threshold.
     *
     * @see #setInitThreshold
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized Number getThreshold(ObjectName object) {

    /**
     * Gets the current threshold value of the specified object, if
     * this object is contained in the set of observed MBeans, or
     * <code>null</code> otherwise.
     *
     * @param object the name of the object whose threshold is to be
     * returned.
     *
     * @return The threshold value of the specified object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    @Override

    /**
     * Gets the derived gauge of the specified object, if this object is
     * contained in the set of observed MBeans, or <code>null</code> otherwise.
     *
     * @param object the name of the object whose derived gauge is to
     * be returned.
     *
     * @return The derived gauge of the specified object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized void stop() {

    /**
     * Stops the counter monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public synchronized void start() {

    /**
     * Starts the counter monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    public CounterMonitor() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private Number initThreshold = INTEGER_ZERO;

    /**
     * Initial counter threshold.  This value is used to initialize
     * the threshold when a new object is added to the list and reset
     * the threshold to its initial value each time the counter
     * resets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private boolean differenceMode = false;

    /**
     * Flag indicating if the counter difference mode is used.  If the
     * counter difference mode is used, the derived gauge is the
     * difference between two consecutive observed values.  Otherwise,
     * the derived gauge is directly the value of the observed
     * attribute.  The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private boolean notify = false;

    /**
     * Flag indicating if the counter monitor notifies when exceeding
     * the threshold.  The default value is set to
     * <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private Number offset = INTEGER_ZERO;

    /**
     * Counter offset.
     * <BR>The default value is a null Integer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
    private Number modulus = INTEGER_ZERO;

    /**
     * Counter modulus.
     * <BR>The default value is a null Integer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/CounterMonitor.java
public class CounterMonitor extends Monitor implements CounterMonitorMBean {

/**
 * Defines a monitor MBean designed to observe the values of a counter
 * attribute.
 *
 * <P> A counter monitor sends a {@link
 * MonitorNotification#THRESHOLD_VALUE_EXCEEDED threshold
 * notification} when the value of the counter reaches or exceeds a
 * threshold known as the comparison level.  The notify flag must be
 * set to <CODE>true</CODE>.
 *
 * <P> In addition, an offset mechanism enables particular counting
 * intervals to be detected.  If the offset value is not zero,
 * whenever the threshold is triggered by the counter value reaching a
 * comparison level, that comparison level is incremented by the
 * offset value.  This is regarded as taking place instantaneously,
 * that is, before the count is incremented.  Thus, for each level,
 * the threshold triggers an event notification every time the count
 * increases by an interval equal to the offset value.
 *
 * <P> If the counter can wrap around its maximum value, the modulus
 * needs to be specified.  The modulus is the value at which the
 * counter is reset to zero.
 *
 * <P> If the counter difference mode is used, the value of the
 * derived gauge is calculated as the difference between the observed
 * counter values for two successive observations.  If this difference
 * is negative, the value of the derived gauge is incremented by the
 * value of the modulus.  The derived gauge value (V[t]) is calculated
 * using the following method:
 *
 * <UL>
 * <LI>if (counter[t] - counter[t-GP]) is positive then
 * V[t] = counter[t] - counter[t-GP]
 * <LI>if (counter[t] - counter[t-GP]) is negative then
 * V[t] = counter[t] - counter[t-GP] + MODULUS
 * </UL>
 *
 * This implementation of the counter monitor requires the observed
 * attribute to be of the type integer (<CODE>Byte</CODE>,
 * <CODE>Integer</CODE>, <CODE>Short</CODE>, <CODE>Long</CODE>).
 *
 *
 * @since 1.5
 */
