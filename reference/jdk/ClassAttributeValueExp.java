_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ClassAttributeValueExp.java
    public String toString()  {

    /**
     * Returns the string "Class" representing its value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ClassAttributeValueExp.java
    public ValueExp apply(ObjectName name)

    /**
     * Applies the ClassAttributeValueExp on an MBean. Returns the name of
     * the Java implementation class of the MBean.
     *
     * @param name The name of the MBean on which the ClassAttributeValueExp will be applied.
     *
     * @return  The ValueExp.
     *
     * @exception BadAttributeValueExpException
     * @exception InvalidApplicationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ClassAttributeValueExp.java
    public ClassAttributeValueExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ClassAttributeValueExp.java
    private String attr;

    /**
     * @serial The name of the attribute
     *
     * <p>The <b>serialVersionUID</b> of this class is <code>-1081892073854801359L</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ClassAttributeValueExp.java
@SuppressWarnings("serial")  // serialVersionUID is not constant

/**
 * This class represents the name of the Java implementation class of
 * the MBean. It is used for performing queries based on the class of
 * the MBean.
 * @serial include
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-1081892073854801359L</code>.
 *
 * @since 1.5
 */
