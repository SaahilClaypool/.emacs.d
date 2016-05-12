_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DynamicMBean.java
    public MBeanInfo getMBeanInfo();

    /**
     * Provides the exposed attributes and actions of the Dynamic MBean using an MBeanInfo object.
     *
     * @return  An instance of <CODE>MBeanInfo</CODE> allowing all attributes and actions
     * exposed by this Dynamic MBean to be retrieved.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DynamicMBean.java
    public Object invoke(String actionName, Object params[], String signature[])

    /**
     * Allows an action to be invoked on the Dynamic MBean.
     *
     * @param actionName The name of the action to be invoked.
     * @param params An array containing the parameters to be set when the action is
     * invoked.
     * @param signature An array containing the signature of the action. The class objects will
     * be loaded through the same class loader as the one used for loading the
     * MBean on which the action is invoked.
     *
     * @return  The object returned by the action, which represents the result of
     * invoking the action on the MBean specified.
     *
     * @exception MBeanException  Wraps a <CODE>java.lang.Exception</CODE> thrown by the MBean's invoked method.
     * @exception ReflectionException  Wraps a <CODE>java.lang.Exception</CODE> thrown while trying to invoke the method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DynamicMBean.java
    public AttributeList setAttributes(AttributeList attributes);

    /**
     * Sets the values of several attributes of the Dynamic MBean.
     *
     * @param attributes A list of attributes: The identification of the
     * attributes to be set and  the values they are to be set to.
     *
     * @return  The list of attributes that were set, with their new values.
     *
     * @see #getAttributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DynamicMBean.java
    public AttributeList getAttributes(String[] attributes);

    /**
     * Get the values of several attributes of the Dynamic MBean.
     *
     * @param attributes A list of the attributes to be retrieved.
     *
     * @return  The list of attributes retrieved.
     *
     * @see #setAttributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DynamicMBean.java
    public void setAttribute(Attribute attribute) throws AttributeNotFoundException,

    /**
     * Set the value of a specific attribute of the Dynamic MBean.
     *
     * @param attribute The identification of the attribute to
     * be set and  the value it is to be set to.
     *
     * @exception AttributeNotFoundException
     * @exception InvalidAttributeValueException
     * @exception MBeanException Wraps a <CODE>java.lang.Exception</CODE> thrown by the MBean's setter.
     * @exception ReflectionException Wraps a <CODE>java.lang.Exception</CODE> thrown while trying to invoke the MBean's setter.
     *
     * @see #getAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DynamicMBean.java
    public Object getAttribute(String attribute) throws AttributeNotFoundException,

    /**
     * Obtain the value of a specific attribute of the Dynamic MBean.
     *
     * @param attribute The name of the attribute to be retrieved
     *
     * @return  The value of the attribute retrieved.
     *
     * @exception AttributeNotFoundException
     * @exception MBeanException  Wraps a <CODE>java.lang.Exception</CODE> thrown by the MBean's getter.
     * @exception ReflectionException  Wraps a <CODE>java.lang.Exception</CODE> thrown while trying to invoke the getter.
     *
     * @see #setAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/DynamicMBean.java
public interface DynamicMBean {

/**
 * Defines the methods that should be implemented by
 * a Dynamic MBean (MBean that exposes a dynamic management interface).
 *
 * @since 1.5
 */
