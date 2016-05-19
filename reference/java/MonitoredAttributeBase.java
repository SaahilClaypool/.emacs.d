_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    public String getName( ) {

    /**
     * Gets the name of the attribute.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    public MonitoredAttributeInfo getAttributeInfo( ) {

    /**
     *  Gets the MonitoredAttributeInfo for the attribute.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    public void setValue( Object value ) {

    /**
     *  This method should be implemented by the concrete class only if the
     *  attribute is writable. If the attribute is not writable and if this
     *  method called, it will result in an IllegalStateException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    public abstract Object getValue( );

    /**
     *  This method should be implemented by the concrete class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    public void clearState( ) {

    /**
     *  If the concrete class decides not to provide the implementation of this
     *  method, then it's OK. Some of the  examples where we may decide to not
     *  provide the implementation is the connection state. Irrespective of
     *  the call to clearState, the connection state will be showing the
     *  currect state of the connection.
     *  NOTE: This method is only used to clear the Monitored Attribute state,
     *  not the real state of the system itself.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    void setMonitoredAttributeInfo( MonitoredAttributeInfo info ) {

    /**
     * A Package Private convenience method for setting MonitoredAttributeInfo
     * for this Monitored Attribute.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    MonitoredAttributeBase( String name ) {

    /**
     * A Package Private Constructor for internal use only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
    public MonitoredAttributeBase( String name, MonitoredAttributeInfo info ) {

    /**
     * Constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttributeBase.java
public abstract class MonitoredAttributeBase implements MonitoredAttribute {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 *  A Convenient class provided to help users extend and implement only
 *  getValue(), if there is no need to clear the state and the attribute is not
 *  writable.
 *
 * </p>
 */
