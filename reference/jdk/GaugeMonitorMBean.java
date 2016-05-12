_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public void setDifferenceMode(boolean value);

    /**
     * Sets the difference mode flag value.
     *
     * @param value The difference mode flag value.
     *
     * @see #getDifferenceMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public boolean getDifferenceMode();

    /**
     * Gets the difference mode flag value.
     *
     * @return <CODE>true</CODE> if the difference mode is used,
     * <CODE>false</CODE> otherwise.
     *
     * @see #setDifferenceMode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public void setNotifyLow(boolean value);

    /**
     * Sets the low notification's on/off switch value.
     *
     * @param value The low notification's on/off switch value.
     *
     * @see #getNotifyLow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public boolean getNotifyLow();

    /**
     * Gets the low notification's on/off switch value.
     *
     * @return <CODE>true</CODE> if the gauge monitor notifies when
     * exceeding the low threshold, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyLow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public void setNotifyHigh(boolean value);

    /**
     * Sets the high notification's on/off switch value.
     *
     * @param value The high notification's on/off switch value.
     *
     * @see #getNotifyHigh
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public boolean getNotifyHigh();

    /**
     * Gets the high notification's on/off switch value.
     *
     * @return <CODE>true</CODE> if the gauge monitor notifies when
     * exceeding the high threshold, <CODE>false</CODE> otherwise.
     *
     * @see #setNotifyHigh
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public void setThresholds(Number highValue, Number lowValue) throws java.lang.IllegalArgumentException;

    /**
     * Sets the high and the low threshold values.
     *
     * @param highValue The high threshold value.
     * @param lowValue The low threshold value.
     * @exception java.lang.IllegalArgumentException The specified high/low threshold is null
     * or the low threshold is greater than the high threshold
     * or the high threshold and the low threshold are not of the same type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public Number getLowThreshold();

    /**
     * Gets the low threshold value.
     *
     * @return The low threshold value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public Number getHighThreshold();

    /**
     * Gets the high threshold value.
     *
     * @return The high threshold value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    public Number getDerivedGauge(ObjectName object);

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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    @Deprecated

    /**
     * Gets the derived gauge timestamp.
     *
     * @return The derived gauge timestamp.
     * @deprecated As of JMX 1.2, replaced by {@link #getDerivedGaugeTimeStamp(ObjectName)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
    @Deprecated

    /**
     * Gets the derived gauge.
     *
     * @return The derived gauge.
     * @deprecated As of JMX 1.2, replaced by {@link #getDerivedGauge(ObjectName)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/GaugeMonitorMBean.java
public interface GaugeMonitorMBean extends MonitorMBean {

/**
 * Exposes the remote management interface of the gauge monitor MBean.
 *
 *
 * @since 1.5
 */
