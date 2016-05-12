_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public boolean isActive();

    /**
     * Tests if the monitor MBean is active.
     * A monitor MBean is marked active when the {@link #start start} method is called.
     * It becomes inactive when the {@link #stop stop} method is called.
     *
     * @return <CODE>true</CODE> if the monitor MBean is active, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public void setGranularityPeriod(long period) throws java.lang.IllegalArgumentException;

    /**
     * Sets the granularity period (in milliseconds).
     *
     * @param period The granularity period.
     * @exception java.lang.IllegalArgumentException The granularity
     * period is less than or equal to zero.
     *
     * @see #getGranularityPeriod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public long getGranularityPeriod();

    /**
     * Gets the granularity period (in milliseconds).
     *
     * @return The granularity period.
     *
     * @see #setGranularityPeriod
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public void setObservedAttribute(String attribute);

    /**
     * Sets the attribute to observe.
     *
     * @param attribute The attribute to observe.
     *
     * @see #getObservedAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public String getObservedAttribute();

    /**
     * Gets the attribute being observed.
     *
     * @return The attribute being observed.
     *
     * @see #setObservedAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    @Deprecated

    /**
     * Sets the object to observe identified by its object name.
     *
     * @param object The object to observe.
     *
     * @see #getObservedObject
     *
     * @deprecated As of JMX 1.2, replaced by {@link #addObservedObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    @Deprecated

    /**
     * Gets the object name of the object being observed.
     *
     * @return The object being observed.
     *
     * @see #setObservedObject
     *
     * @deprecated As of JMX 1.2, replaced by {@link #getObservedObjects}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public ObjectName[] getObservedObjects();

    /**
     * Returns an array containing the objects being observed.
     *
     * @return The objects being observed.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public boolean containsObservedObject(ObjectName object);

    /**
     * Tests whether the specified object is in the set of observed MBeans.
     *
     * @param object The object to check.
     * @return <CODE>true</CODE> if the specified object is in the set, <CODE>false</CODE> otherwise.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public void removeObservedObject(ObjectName object);

    /**
     * Removes the specified object from the set of observed MBeans.
     *
     * @param object The object to remove.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public void addObservedObject(ObjectName object) throws java.lang.IllegalArgumentException;

    /**
     * Adds the specified object in the set of observed MBeans.
     *
     * @param object The object to observe.
     * @exception java.lang.IllegalArgumentException the specified object is null.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public void stop();

    /**
     * Stops the monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
    public void start();

    /**
     * Starts the monitor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorMBean.java
public interface MonitorMBean {

/**
 * Exposes the remote management interface of monitor MBeans.
 *
 *
 * @since 1.5
 */
