_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public void setNotifyDiffer(boolean value);

    /**
     * Sets the differing notification's on/off switch value.
     *
     * @param value The differing notification's on/off switch value.
     *
     * @see #getNotifyDiffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public boolean getNotifyDiffer();

    /**
     * Gets the differing notification's on/off switch value.
     *
     * @return <CODE>true</CODE> if the string monitor notifies when
     * differing, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyDiffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public void setNotifyMatch(boolean value);

    /**
     * Sets the matching notification's on/off switch value.
     *
     * @param value The matching notification's on/off switch value.
     *
     * @see #getNotifyMatch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public boolean getNotifyMatch();

    /**
     * Gets the matching notification's on/off switch value.
     *
     * @return <CODE>true</CODE> if the string monitor notifies when
     * matching, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyMatch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public void setStringToCompare(String value) throws java.lang.IllegalArgumentException;

    /**
     * Sets the string to compare with the observed attribute.
     *
     * @param value The string value.
     * @exception java.lang.IllegalArgumentException The specified
     * string to compare is null.
     *
     * @see #getStringToCompare
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public String getStringToCompare();

    /**
     * Gets the string to compare with the observed attribute.
     *
     * @return The string value.
     *
     * @see #setStringToCompare
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public long getDerivedGaugeTimeStamp(ObjectName object);

    /**
     * Gets the derived gauge timestamp for the specified MBean.
     *
     * @param object the MBean for which the derived gauge timestamp is to be returned
     * @return The derived gauge timestamp for the specified MBean if this MBean
     *         is in the set of observed MBeans, or <code>null</code> otherwise.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    public String getDerivedGauge(ObjectName object);

    /**
     * Gets the derived gauge for the specified MBean.
     *
     * @param object the MBean for which the derived gauge is to be returned
     * @return The derived gauge for the specified MBean if this MBean is in the
     *         set of observed MBeans, or <code>null</code> otherwise.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    @Deprecated

    /**
     * Gets the derived gauge timestamp.
     *
     * @return The derived gauge timestamp.
     * @deprecated As of JMX 1.2, replaced by {@link #getDerivedGaugeTimeStamp(ObjectName)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
    @Deprecated

    /**
     * Gets the derived gauge.
     *
     * @return The derived gauge.
     * @deprecated As of JMX 1.2, replaced by {@link #getDerivedGauge(ObjectName)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/StringMonitorMBean.java
public interface StringMonitorMBean extends MonitorMBean {

/**
 * Exposes the remote management interface of the string monitor MBean.
 *
 *
 * @since 1.5
 */
