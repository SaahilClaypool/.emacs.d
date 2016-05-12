_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    public String toString() {

    /**
     * Returns a string representing this ObjectInstance object. The format of this string
     * is not specified, but users can expect that two ObjectInstances return the same
     * string if and only if they are equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    public String getClassName()  {

    /**
     * Returns the class part.
     *
     * @return the class name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    public ObjectName getObjectName()  {

    /**
     * Returns the object name part.
     *
     * @return the object name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    public boolean equals(Object object)  {

    /**
     * Compares the current object instance with another object instance.
     *
     * @param object  The object instance that the current object instance is
     *     to be compared with.
     *
     * @return  True if the two object instances are equal, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    public ObjectInstance(ObjectName objectName, String className) {

    /**
     * Allows an object instance to be created given an object name and
     * the full class name, including the package name.
     *
     * @param objectName  The object name.
     * @param className  The full class name, including the package
     * name, of the object instance.  If the MBean is a Dynamic MBean
     * the class name corresponds to its {@link
     * DynamicMBean#getMBeanInfo()
     * getMBeanInfo()}<code>.getClassName()</code>.
     * If the MBean is a Dynamic MBean the class name should be retrieved
     * from the <CODE>MBeanInfo</CODE> it provides.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    public ObjectInstance(String objectName, String className)

    /**
     * Allows an object instance to be created given a string representation of
     * an object name and the full class name, including the package name.
     *
     * @param objectName  A string representation of the object name.
     * @param className The full class name, including the package
     * name, of the object instance.  If the MBean is a Dynamic MBean
     * the class name corresponds to its {@link
     * DynamicMBean#getMBeanInfo()
     * getMBeanInfo()}<code>.getClassName()</code>.
     *
     * @exception MalformedObjectNameException The string passed as a
     * parameter does not have the right format.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    private String className;

    /**
     * @serial Class name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
    private ObjectName name;

    /**
     * @serial Object name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ObjectInstance.java
public class ObjectInstance implements Serializable   {

/**
 * Used to represent the object name of an MBean and its class name.
 * If the MBean is a Dynamic MBean the class name should be retrieved from
 * the <CODE>MBeanInfo</CODE> it provides.
 *
 * @since 1.5
 */
