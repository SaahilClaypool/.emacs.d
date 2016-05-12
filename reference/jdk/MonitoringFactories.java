_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    public static MonitoringManagerFactory getMonitoringManagerFactory( ) {

/**
 * <p>
 * Gets the MonitoredManagerFactory. The user is not expected to use this
 * Factory, since the ORB will be automatically initialized with the
 * MonitoringManager.
 *
 * User can get hold of MonitoringManager associated with ORB by calling
 * orb.getMonitoringManager( )
 * </p>
 * <p>
 *
 * @return a MonitoredManagerFactory
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    public static MonitoredAttributeInfoFactory

/**
 * <p>
 * Gets the MonitoredAttributeInfoFactory. The user is not expected to use this
 * Factory, since the MonitoredAttributeInfo is internally created by
 * StringMonitoredAttributeBase, LongMonitoredAttributeBase and
 * StatisticMonitoredAttribute. If User wants to create a MonitoredAttribute
 * of some other special type like a DoubleMonitoredAttribute, they can
 * build a DoubleMonitoredAttributeBase like LongMonitoredAttributeBase
 * and build a MonitoredAttributeInfo required by MonitoredAttributeBase
 * internally by using this Factory.
 * </p>
 * <p>
 *
 * @return a MonitoredAttributeInfoFactory
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    public static MonitoredObjectFactory getMonitoredObjectFactory( ) {

/**
 * <p>
 * Gets the MonitoredObjectFactory
 * </p>
 * <p>
 *
 * @return a MonitoredObjectFactory
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    // operations

    ///////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
public class MonitoringFactories {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 *  This is used for getting the default factories for
 *  MonitoredObject, MonitoredAttributeInfo and MonitoringManager. We do not
 *  expect users to use the MonitoredAttributeInfo factory most of the time
 *  because the Info is automatically built by StringMonitoredAttributeBase
 *  and LongMonitoredAttributeBase.
 *  </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    public static MonitoringManagerFactory getMonitoringManagerFactory( ) {

/**
 * <p>
 * Gets the MonitoredManagerFactory. The user is not expected to use this
 * Factory, since the ORB will be automatically initialized with the
 * MonitoringManager.
 *
 * User can get hold of MonitoringManager associated with ORB by calling
 * orb.getMonitoringManager( )
 * </p>
 * <p>
 *
 * @return a MonitoredManagerFactory
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    public static MonitoredAttributeInfoFactory

/**
 * <p>
 * Gets the MonitoredAttributeInfoFactory. The user is not expected to use this
 * Factory, since the MonitoredAttributeInfo is internally created by
 * StringMonitoredAttributeBase, LongMonitoredAttributeBase and
 * StatisticMonitoredAttribute. If User wants to create a MonitoredAttribute
 * of some other special type like a DoubleMonitoredAttribute, they can
 * build a DoubleMonitoredAttributeBase like LongMonitoredAttributeBase
 * and build a MonitoredAttributeInfo required by MonitoredAttributeBase
 * internally by using this Factory.
 * </p>
 * <p>
 *
 * @return a MonitoredAttributeInfoFactory
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    public static MonitoredObjectFactory getMonitoredObjectFactory( ) {

/**
 * <p>
 * Gets the MonitoredObjectFactory
 * </p>
 * <p>
 *
 * @return a MonitoredObjectFactory
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
    // operations

    ///////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/monitoring/MonitoringFactories.java
public class MonitoringFactories {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 *  This is used for getting the default factories for
 *  MonitoredObject, MonitoredAttributeInfo and MonitoringManager. We do not
 *  expect users to use the MonitoredAttributeInfo factory most of the time
 *  because the Info is automatically built by StringMonitoredAttributeBase
 *  and LongMonitoredAttributeBase.
 *  </p>
 */
