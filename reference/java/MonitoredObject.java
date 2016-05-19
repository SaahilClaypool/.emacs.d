_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public Collection getAttributes();

/**
 * <p>
 * Gets all the Monitored Attributes for this Monitored Objects. It doesn't
 * include the Child Monitored Object, that needs to be traversed using
 * getChild() or getChildren() call.
 * </p>
 * <p>
 *
 * @return Collection of all the Attributes for this MonitoredObject
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void removeAttribute(String name);

/**
 * <p>
 * Removes the attribute with the given name.
 * </p>
 * <p>
 *
 * </p>
 * <p>
 * @param name is the MonitoredAttribute name
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public MonitoredObject getParent();

/**
 * <p>
 * There will be only one parent for an instance of MontoredObject, this
 * call gets parent and returns null if the Monitored Object is the root.
 * </p>
 * <p>
 *
 * @return a MonitoredObject which is a Parent of this Monitored Object instance
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void setParent( MonitoredObject m );

/**
 * <p>
 * Sets the parent for this Monitored Object.
 * </p>
 * <p>
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public Collection getChildren();

/**
 * <p>
 * Gets all the Children registered under this instance of Monitored
 * Object.
 * </p>
 * <p>
 *
 * @return Collection of immediate Children associated with this MonitoredObject.
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public void addChild( MonitoredObject m );

/**
 * <p>
 * This method will add a child Monitored Object to this Monitored Object.
 * </p>
 * <p>
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
    public String getName();

/**
 * <p>
 * Gets the name of this MonitoredObject
 * </p><p>
 *
 * @return a String with name of this Monitored Object
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
  // operations

  ///////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredObject.java
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
