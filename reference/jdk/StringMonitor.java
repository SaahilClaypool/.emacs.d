_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    @Override

    /**
     * Check that the type of the supplied observed attribute
     * value is one of the value types supported by this monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    @Override

    /**
     * Factory method for ObservedObject creation.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    @Override

    /**
     * Returns a <CODE>NotificationInfo</CODE> object containing the name of
     * the Java class of the notification and the notification types sent by
     * the string monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized void setNotifyDiffer(boolean value) {

    /**
     * Sets the differing notification's on/off switch value common to
     * all observed MBeans.
     *
     * @param value The differing notification's on/off switch value.
     *
     * @see #getNotifyDiffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized boolean getNotifyDiffer() {

    /**
     * Gets the differing notification's on/off switch value common to
     * all observed MBeans.
     *
     * @return <CODE>true</CODE> if the string monitor notifies when
     * differing from the string to compare, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyDiffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized void setNotifyMatch(boolean value) {

    /**
     * Sets the matching notification's on/off switch value common to
     * all observed MBeans.
     *
     * @param value The matching notification's on/off switch value.
     *
     * @see #getNotifyMatch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized boolean getNotifyMatch() {

    /**
     * Gets the matching notification's on/off switch value common to
     * all observed MBeans.
     *
     * @return <CODE>true</CODE> if the string monitor notifies when
     * matching the string to compare, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyMatch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized void setStringToCompare(String value)

    /**
     * Sets the string to compare with the observed attribute common
     * to all observed MBeans.
     *
     * @param value The string value.
     *
     * @exception IllegalArgumentException The specified
     * string to compare is null.
     *
     * @see #getStringToCompare
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized String getStringToCompare() {

    /**
     * Gets the string to compare with the observed attribute common
     * to all observed MBeans.
     *
     * @return The string value.
     *
     * @see #setStringToCompare
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    @Override

    /**
     * Gets the derived gauge of the specified object, if this object is
     * contained in the set of observed MBeans, or <code>null</code> otherwise.
     *
     * @param object the name of the MBean whose derived gauge is required.
     *
     * @return The derived gauge of the specified object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized void stop() {

    /**
     * Stops the string monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public synchronized void start() {

    /**
     * Starts the string monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    public StringMonitor() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    private boolean notifyDiffer = false;

    /**
     * Flag indicating if the string monitor notifies when differing
     * from the string to compare.
     * <BR>The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    private boolean notifyMatch = false;

    /**
     * Flag indicating if the string monitor notifies when matching
     * the string to compare.
     * <BR>The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
    private String stringToCompare = "";

    /**
     * String to compare with the observed attribute.
     * <BR>The default value is an empty character sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitor.java
public class StringMonitor extends Monitor implements StringMonitorMBean {

/**
 * Defines a monitor MBean designed to observe the values of a string
 * attribute.
 * <P>
 * A string monitor sends notifications as follows:
 * <UL>
 * <LI> if the attribute value matches the string to compare value,
 *      a {@link MonitorNotification#STRING_TO_COMPARE_VALUE_MATCHED
 *      match notification} is sent.
 *      The notify match flag must be set to <CODE>true</CODE>.
 *      <BR>Subsequent matchings of the string to compare values do not
 *      cause further notifications unless
 *      the attribute value differs from the string to compare value.
 * <LI> if the attribute value differs from the string to compare value,
 *      a {@link MonitorNotification#STRING_TO_COMPARE_VALUE_DIFFERED
 *      differ notification} is sent.
 *      The notify differ flag must be set to <CODE>true</CODE>.
 *      <BR>Subsequent differences from the string to compare value do
 *      not cause further notifications unless
 *      the attribute value matches the string to compare value.
 * </UL>
 *
 *
 * @since 1.5
 */
