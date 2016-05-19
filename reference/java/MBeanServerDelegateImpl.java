_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanServerDelegateImpl.java
    public MBeanInfo getMBeanInfo() {

    /**
     * Provides the MBeanInfo describing the MBeanServerDelegate.
     *
     * @return  The MBeanInfo describing the MBeanServerDelegate.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanServerDelegateImpl.java
    public Object invoke(String actionName, Object params[],
                         String signature[])

    /**
     * Always fails since the MBeanServerDelegate MBean has no operation.
     *
     * @param actionName The name of the action to be invoked.
     * @param params An array containing the parameters to be set when the
     *        action is invoked.
     * @param signature An array containing the signature of the action.
     *
     * @return  The object returned by the action, which represents
     *          the result of invoking the action on the MBean specified.
     *
     * @exception MBeanException  Wraps a <CODE>java.lang.Exception</CODE>
     *         thrown by the MBean's invoked method.
     * @exception ReflectionException  Wraps a
     *      <CODE>java.lang.Exception</CODE> thrown while trying to invoke
     *      the method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanServerDelegateImpl.java
    public AttributeList setAttributes(AttributeList attributes) {

    /**
     * This method always return an empty list since all
     * MBeanServerDelegateMBean attributes are read-only.
     *
     * @param attributes A list of attributes: The identification of the
     * attributes to be set and  the values they are to be set to.
     *
     * @return  The list of attributes that were set, with their new values.
     *          In fact, this method always return an empty list since all
     *          MBeanServerDelegateMBean attributes are read-only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanServerDelegateImpl.java
    public AttributeList getAttributes(String[] attributes) {

    /**
     * Makes it possible to get the values of several attributes of
     * the MBeanServerDelegate.
     *
     * @param attributes A list of the attributes to be retrieved.
     *
     * @return  The list of attributes retrieved.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanServerDelegateImpl.java
    public void setAttribute(Attribute attribute)

    /**
     * This method always fail since all MBeanServerDelegateMBean attributes
     * are read-only.
     *
     * @param attribute The identification of the attribute to
     * be set and  the value it is to be set to.
     *
     * @exception AttributeNotFoundException
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanServerDelegateImpl.java
    public Object getAttribute(String attribute)

    /**
     * Obtains the value of a specific attribute of the MBeanServerDelegate.
     *
     * @param attribute The name of the attribute to be retrieved
     *
     * @return  The value of the attribute retrieved.
     *
     * @exception AttributeNotFoundException
     * @exception MBeanException
     *            Wraps a <CODE>java.lang.Exception</CODE> thrown by the
     *            MBean's getter.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/MBeanServerDelegateImpl.java
final class MBeanServerDelegateImpl

/**
 * This class is the MBean implementation of the MBeanServerDelegate.
 *
 * @since 1.5
 */
