_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeInfoFactory.java
    MonitoredAttributeInfo createMonitoredAttributeInfo( String description,
        Class type, boolean isWritable, boolean isStatistic  );

    /**
     *  A Simple Factory Method to create the Monitored Attribute Info.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeInfoFactory.java
public interface MonitoredAttributeInfoFactory {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 * MonitoredAttributeInfoFactory used mostly by internal classes. If the
 * User needs to define some special MonitoredAttributes like a Character
 * type Monitored Attribute, they can use this factory to build the meta
 * information.
 *
 * </p>
 */
