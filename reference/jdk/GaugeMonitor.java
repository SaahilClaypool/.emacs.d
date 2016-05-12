_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    @Override

    /**
     * Tests if the threshold high and threshold low are both of the
     * same type as the gauge.  Both integer and floating-point types
     * are allowed.
     *
     * Note:
     *   If the optional lowThreshold or highThreshold have not been
     *   initialized, their default value is an Integer object with
     *   a value equal to zero.
     *
     * @param object The observed object.
     * @param attribute The observed attribute.
     * @param value The sample value.
     * @return <CODE>true</CODE> if type is the same,
     * <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    @Override

    /**
     * This method globally sets the derived gauge type for the given
     * "object" and "attribute" after checking that the type of the
     * supplied observed attribute value is one of the value types
     * supported by this monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    @Override

    /**
     * Factory method for ObservedObject creation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private boolean isFirstStrictlyGreaterThanLast(Number greater,
                                                   Number less,
                                                   String className) {

    /**
     * Tests if the first specified Number is strictly greater than the last.
     * Both integer and floating-point types are allowed.
     *
     * @param greater The first Number to compare with the second.
     * @param less The second Number to compare with the first.
     * @param className The number class name.
     * @return <CODE>true</CODE> if the first specified Number is
     * strictly greater than the last, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private boolean isFirstGreaterThanLast(Number greater,
                                           Number less,
                                           NumericalType type) {

    /**
     * Tests if the first specified Number is greater than or equal to
     * the last.  Both integer and floating-point types are allowed.
     *
     * @param greater The first Number to compare with the second.
     * @param less The second Number to compare with the first.
     * @param type The number type.
     * @return <CODE>true</CODE> if the first specified Number is
     * greater than or equal to the last, <CODE>false</CODE>
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private synchronized void setDerivedGaugeWithDifference(
        Number scanGauge, GaugeMonitorObservedObject o) {

    /**
     * Sets the derived gauge when the differenceMode flag is set to
     * <CODE>true</CODE>.  Both integer and floating-point types are
     * allowed.
     *
     * @param scanGauge The value of the observed attribute.
     * @param o The observed object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private synchronized MonitorNotification updateNotifications(
        GaugeMonitorObservedObject o) {

    /**
     * Updates the notification attribute of the observed object
     * and notifies the listeners only once if the notify flag
     * is set to <CODE>true</CODE>.
     * @param o The observed object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private synchronized boolean updateDerivedGauge(
        Object scanGauge, GaugeMonitorObservedObject o) {

    /**
     * Updates the derived gauge attribute of the observed object.
     *
     * @param scanGauge The value of the observed attribute.
     * @param o The observed object.
     * @return <CODE>true</CODE> if the derived gauge value is valid,
     * <CODE>false</CODE> otherwise.  The derived gauge value is
     * invalid when the differenceMode flag is set to
     * <CODE>true</CODE> and it is the first notification (so we
     * haven't 2 consecutive values to update the derived gauge).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    @Override

   /**
     * Returns a <CODE>NotificationInfo</CODE> object containing the
     * name of the Java class of the notification and the notification
     * types sent by the gauge monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized void setNotifyLow(boolean value) {

    /**
     * Sets the low notification's on/off switch value common to all
     * observed MBeans.
     *
     * @param value The low notification's on/off switch value.
     *
     * @see #getNotifyLow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized boolean getNotifyLow() {

    /**
     * Gets the low notification's on/off switch value common to all
     * observed MBeans.
     *
     * @return <CODE>true</CODE> if the gauge monitor notifies when
     * exceeding the low threshold, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyLow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized void setNotifyHigh(boolean value) {

    /**
     * Sets the high notification's on/off switch value common to all
     * observed MBeans.
     *
     * @param value The high notification's on/off switch value.
     *
     * @see #getNotifyHigh
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized boolean getNotifyHigh() {

    /**
     * Gets the high notification's on/off switch value common to all
     * observed MBeans.
     *
     * @return <CODE>true</CODE> if the gauge monitor notifies when
     * exceeding the high threshold, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyHigh
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized void setThresholds(Number highValue, Number lowValue)

    /**
     * Sets the high and the low threshold values common to all
     * observed MBeans.
     *
     * @param highValue The high threshold value.
     * @param lowValue The low threshold value.
     *
     * @exception IllegalArgumentException The specified high/low
     * threshold is null or the low threshold is greater than the high
     * threshold or the high threshold and the low threshold are not
     * of the same type.
     *
     * @see #getHighThreshold
     * @see #getLowThreshold
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized Number getLowThreshold() {

    /**
     * Gets the low threshold value common to all observed MBeans.
     *
     * @return The low threshold value.
     *
     * @see #setThresholds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized Number getHighThreshold() {

    /**
     * Gets the high threshold value common to all observed MBeans.
     *
     * @return The high threshold value.
     *
     * @see #setThresholds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    @Override

    /**
     * Gets the derived gauge of the specified object, if this object is
     * contained in the set of observed MBeans, or <code>null</code> otherwise.
     *
     * @param object the name of the MBean.
     *
     * @return The derived gauge of the specified object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized void stop() {

    /**
     * Stops the gauge monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public synchronized void start() {

    /**
     * Starts the gauge monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    public GaugeMonitor() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private boolean differenceMode = false;

    /**
     * Flag indicating if the gauge difference mode is used.  If the
     * gauge difference mode is used, the derived gauge is the
     * difference between two consecutive observed values.  Otherwise,
     * the derived gauge is directly the value of the observed
     * attribute.
     *
     * <BR>The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private boolean notifyLow = false;

    /**
     * Flag indicating if the gauge monitor notifies when exceeding
     * the low threshold.
     *
     * <BR>The default value is <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private boolean notifyHigh = false;

    /**
     * Flag indicating if the gauge monitor notifies when exceeding
     * the high threshold.
     *
     * <BR>The default value is <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private Number lowThreshold = INTEGER_ZERO;

    /**
     * Gauge low threshold.
     *
     * <BR>The default value is a null Integer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
    private Number highThreshold = INTEGER_ZERO;

    /**
     * Gauge high threshold.
     *
     * <BR>The default value is a null Integer object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitor.java
public class GaugeMonitor extends Monitor implements GaugeMonitorMBean {

/**
 * Defines a monitor MBean designed to observe the values of a gauge attribute.
 *
 * <P> A gauge monitor observes an attribute that is continuously
 * variable with time. A gauge monitor sends notifications as
 * follows:
 *
 * <UL>
 *
 * <LI> if the attribute value is increasing and becomes equal to or
 * greater than the high threshold value, a {@link
 * MonitorNotification#THRESHOLD_HIGH_VALUE_EXCEEDED threshold high
 * notification} is sent. The notify high flag must be set to
 * <CODE>true</CODE>.
 *
 * <BR>Subsequent crossings of the high threshold value do not cause
 * further notifications unless the attribute value becomes equal to
 * or less than the low threshold value.</LI>
 *
 * <LI> if the attribute value is decreasing and becomes equal to or
 * less than the low threshold value, a {@link
 * MonitorNotification#THRESHOLD_LOW_VALUE_EXCEEDED threshold low
 * notification} is sent. The notify low flag must be set to
 * <CODE>true</CODE>.
 *
 * <BR>Subsequent crossings of the low threshold value do not cause
 * further notifications unless the attribute value becomes equal to
 * or greater than the high threshold value.</LI>
 *
 * </UL>
 *
 * This provides a hysteresis mechanism to avoid repeated triggering
 * of notifications when the attribute value makes small oscillations
 * around the high or low threshold value.
 *
 * <P> If the gauge difference mode is used, the value of the derived
 * gauge is calculated as the difference between the observed gauge
 * values for two successive observations.
 *
 * <BR>The derived gauge value (V[t]) is calculated using the following method:
 * <UL>
 * <LI>V[t] = gauge[t] - gauge[t-GP]</LI>
 * </UL>
 *
 * This implementation of the gauge monitor requires the observed
 * attribute to be of the type integer or floating-point
 * (<CODE>Byte</CODE>, <CODE>Integer</CODE>, <CODE>Short</CODE>,
 * <CODE>Long</CODE>, <CODE>Float</CODE>, <CODE>Double</CODE>).
 *
 *
 * @since 1.5
 */
