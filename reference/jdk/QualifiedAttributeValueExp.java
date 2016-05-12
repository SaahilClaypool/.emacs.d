_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QualifiedAttributeValueExp.java
    @Override

    /**
     * Returns the string representing its value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QualifiedAttributeValueExp.java
    @Override

    /**
     * Applies the QualifiedAttributeValueExp to an MBean.
     *
     * @param name The name of the MBean on which the QualifiedAttributeValueExp will be applied.
     *
     * @return  The ValueExp.
     *
     * @exception BadStringOperationException
     * @exception BadBinaryOpValueExpException
     * @exception BadAttributeValueExpException
     * @exception InvalidApplicationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QualifiedAttributeValueExp.java
    public String getAttrClassName()  {

    /**
     * Returns a string representation of the class name of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QualifiedAttributeValueExp.java
    public QualifiedAttributeValueExp(String className, String attr) {

    /**
     * Creates a new QualifiedAttributeValueExp representing the specified object
     * attribute, named attr with class name className.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QualifiedAttributeValueExp.java
    @Deprecated

    /**
     * Basic Constructor.
     * @deprecated see {@link AttributeValueExp#AttributeValueExp()}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QualifiedAttributeValueExp.java
    private String className;

    /**
     * @serial The attribute class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QualifiedAttributeValueExp.java
class QualifiedAttributeValueExp extends AttributeValueExp   {

/**
 * <p>Represents attributes used as arguments to relational constraints,
 * where the attribute must be in an MBean of a specified {@linkplain
 * MBeanInfo#getClassName() class}. A QualifiedAttributeValueExp may be used
 * anywhere a ValueExp is required.
 *
 * @serial include
 *
 * @since 1.5
 */
