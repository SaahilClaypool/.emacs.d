_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void clearState();

/**
 * <p>
 * Clears the state of all the Monitored Attributes associated with the
 * Monitored Object. It will also clear the state on all it's child
 * Monitored Object. The call to clearState will be initiated from
 * CORBAMBean.startMonitoring() call.
 * </p>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public MonitoredAttribute getAttribute(String name);

/**
 * <p>
 * Gets the Monitored Object registered by the given name
 * </p>
 *
 * <p>
 * @return a MonitoredAttribute identified by the given name
 * </p>
 * <p>
 * @param name of the attribute
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void addAttribute(MonitoredAttribute value);

/**
 * <p>
 * Adds the attribute with the given name.
 * </p>
 * <p>
 *
 * </p>
 * <p>
 * @param value is the MonitoredAttribute which will be set as one of the
 * attribute of this MonitoredObject.
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void setParent( MonitoredObject m );

/**
 * <p>
 * Sets the parent for this Monitored Object.
 * </p>
 * <p>
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public MonitoredObject getChild(String name);

/**
 * <p>
 * Gets the child MonitoredObject associated with this MonitoredObject
 * instance using name as the key. The name should be fully qualified name
 * like orb.connectionmanager
 * </p>
 * <p>
 *
 * @return a MonitoredObject identified by the given name
 * </p>
 * <p>
 * @param name of the ChildMonitored Object
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void removeChild( String name );

/**
 * <p>
 * This method will remove child Monitored Object identified by the given name
 * </p>
 * <p>
 * @param name of the ChildMonitored Object
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public String getDescription();

/**
 * <p>
 * Gets the description of MonitoredObject
 * </p><p>
 *
 * @return a String with Monitored Object Description.
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
  // operations

  ///////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
public interface MonitoredObject {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 * Monitored Object provides an Hierarchichal view of the ORB Monitoring
 * System. It can contain multiple children and a single parent. Each
 * Monitored Object may also contain Multiple Monitored Attributes.
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void clearState();

/**
 * <p>
 * Clears the state of all the Monitored Attributes associated with the
 * Monitored Object. It will also clear the state on all it's child
 * Monitored Object. The call to clearState will be initiated from
 * CORBAMBean.startMonitoring() call.
 * </p>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public MonitoredAttribute getAttribute(String name);

/**
 * <p>
 * Gets the Monitored Object registered by the given name
 * </p>
 *
 * <p>
 * @return a MonitoredAttribute identified by the given name
 * </p>
 * <p>
 * @param name of the attribute
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void addAttribute(MonitoredAttribute value);

/**
 * <p>
 * Adds the attribute with the given name.
 * </p>
 * <p>
 *
 * </p>
 * <p>
 * @param value is the MonitoredAttribute which will be set as one of the
 * attribute of this MonitoredObject.
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void setParent( MonitoredObject m );

/**
 * <p>
 * Sets the parent for this Monitored Object.
 * </p>
 * <p>
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public MonitoredObject getChild(String name);

/**
 * <p>
 * Gets the child MonitoredObject associated with this MonitoredObject
 * instance using name as the key. The name should be fully qualified name
 * like orb.connectionmanager
 * </p>
 * <p>
 *
 * @return a MonitoredObject identified by the given name
 * </p>
 * <p>
 * @param name of the ChildMonitored Object
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void removeChild( String name );

/**
 * <p>
 * This method will remove child Monitored Object identified by the given name
 * </p>
 * <p>
 * @param name of the ChildMonitored Object
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public String getDescription();

/**
 * <p>
 * Gets the description of MonitoredObject
 * </p><p>
 *
 * @return a String with Monitored Object Description.
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
  // operations

  ///////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
public interface MonitoredObject {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 * Monitored Object provides an Hierarchichal view of the ORB Monitoring
 * System. It can contain multiple children and a single parent. Each
 * Monitored Object may also contain Multiple Monitored Attributes.
 * </p>
 */
