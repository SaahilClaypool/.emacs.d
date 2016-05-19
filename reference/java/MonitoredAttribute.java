_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttribute.java
    public void clearState();

/**
 * <p>
 * If this attribute needs to be cleared, the user needs to implement this
 * method to reset the state to initial state. If the Monitored Attribute
 * doesn't change like for example (ConnectionManager High Water Mark),
 * then clearState() is a No Op.
 * </p>
 *
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttribute.java
    public String getName();

/**
 * <p>
 * Gets the name of the Monitored Attribute.
 * </p>
 * <p>
 *
 * @param name of this Attribute
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttribute.java
    public Object getValue();

/**
 * <p>
 * Gets the value of the Monitored Attribute. The value can be obtained
 * from different parts of the module. User may choose to delegate the call
 * to getValue() to other variables.
 *
 * NOTE: It is important to make sure that the type of Object returned in
 * getvalue is same as the one specified in MonitoredAttributeInfo for this
 * attribute.
 * </p>
 * <p>
 *
 * </p>
 * <p>
 *
 * @param value is the current value for this MonitoredAttribute
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttribute.java
    public void setValue(Object value);

/**
 * <p>
 * Sets the value for the Monitored Attribute if isWritable() is false, the
 * method will throw ILLEGAL Operation exception.
 *
 * Also, the type of 'value' should be same as specified in the
 * MonitoredAttributeInfo for a particular instance.
 * </p>
 * <p>
 *
 * @param value should be any one of the Basic Java Type Objects which are
 * Long, Double, Float, String, Integer, Short, Character, Byte.
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttribute.java
    public MonitoredAttributeInfo getAttributeInfo();

/**
 * <p>
 * Gets the Monitored Attribute Info for the attribute.
 * </p>
 * <p>
 *
 * @param monitoredAttributeInfo for this Monitored Attribute.
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttribute.java
  // operations

  ///////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/MonitoredAttribute.java
public interface MonitoredAttribute {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 * Monitored Attribute is the interface to represent a Monitorable
 * Attribute. Using this interface, one can get the value of the attribute
 * and set the value if it is a writeable attribute.
 * </p>
 */
