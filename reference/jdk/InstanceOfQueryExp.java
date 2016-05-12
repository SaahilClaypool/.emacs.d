_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InstanceOfQueryExp.java
    public String toString() {

    /**
     * Returns a string representation of this InstanceOfQueryExp.
     * @return a string representation of this InstanceOfQueryExp.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InstanceOfQueryExp.java
    public boolean apply(ObjectName name)

    /**
     * Applies the InstanceOf on a MBean.
     *
     * @param name The name of the MBean on which the InstanceOf will be applied.
     *
     * @return  True if the MBean specified by the name is instance of the class.
     * @exception BadAttributeValueExpException
     * @exception InvalidApplicationException
     * @exception BadStringOperationException
     * @exception BadBinaryOpValueExpException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InstanceOfQueryExp.java
    public StringValueExp getClassNameValue()  {

    /**
     * Returns the class name.
     * @returns The {@link StringValueExp} returning the name of
     *        the class of which selected MBeans should be instances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InstanceOfQueryExp.java
    // We are using StringValueExp here to be consistent with other queries,

    /**
     * Creates a new InstanceOfExp with a specific class name.
     * @param classNameValue The {@link StringValueExp} returning the name of
     *        the class of which selected MBeans should be instances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InstanceOfQueryExp.java
    private StringValueExp classNameValue;

    /**
     * @serial The {@link StringValueExp} returning the name of the class
     *         of which selected MBeans should be instances.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InstanceOfQueryExp.java
class InstanceOfQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query building mechanism for isInstanceOf expressions.
 * @serial include
 *
 * @since 1.6
 */
