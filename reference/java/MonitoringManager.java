_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoringManager.java
    public void clearState();

/**
 * <p>
 * Initialize is called whenever there is a start monitoring call to CORBA
 * MBean. This will result in triaging initialize to all the
 * MonitoredObjects and it's Monitored Attributes.
 * </p>
 *
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoringManager.java
    public MonitoredObject getRootMonitoredObject();

/**
 * <p>
 * Gets the Root Monitored Object which contains a Hierarchy Of Monitored
 * Objects exposing various Monitorable Attributes of Various modules.
 * </p>
 * <p>
 *
 * @param MonitoredObject ...
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoringManager.java
  // operations

  ///////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoringManager.java
public interface MonitoringManager extends Closeable {

/**
 * <p>
 * Monitoring Manager will have a 1 to 1 association with the ORB. This
 * gives access to the top level Monitored Object, using which more
 * Monitored Objects and Attributes can be added and traversed.
 * </p>
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 */
