_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    public DynamicMBean getObject()  {

    /**
     * Get the object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    public ObjectName getName()  {

    /**
     * Get the object name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    public int hashCode() {

    /**
     * Returns a hash code for this named object.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    public boolean equals(Object object)  {

    /**
     * Compares the current object name with another object name.
     *
     * @param object  The Named Object that the current object name is to be
     *        compared with.
     *
     * @return  True if the two named objects are equal, otherwise false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    public NamedObject(String objectName, DynamicMBean object) throws MalformedObjectNameException{

    /**
     * Allows a named object to be created.
     *
     *@param objectName The string representation of the object name of the object.
     *@param object A reference to the object.
     *
     *@exception MalformedObjectNameException The string passed does not have the format of a valid ObjectName
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    public NamedObject(ObjectName objectName, DynamicMBean object)  {

    /**
     * Allows a named object to be created.
     *
     *@param objectName The object name of the object.
     *@param object A reference to the object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    private final DynamicMBean object;

    /**
     * Object reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
    private final ObjectName name;

    /**
     * Object name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/NamedObject.java
public class NamedObject  {

/**
 * This class is used for storing a pair (name, object) where name is
 * an object name and object is a reference to the object.
 *
 * @since 1.5
 */
