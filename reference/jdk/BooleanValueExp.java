_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BooleanValueExp.java
    public ValueExp apply(ObjectName name) throws BadStringOperationException, BadBinaryOpValueExpException,

    /**
     * Applies the ValueExp on a MBean.
     *
     * @param name The name of the MBean on which the ValueExp will be applied.
     *
     * @return  The <CODE>ValueExp</CODE>.
     *
     * @exception BadStringOperationException
     * @exception BadBinaryOpValueExpException
     * @exception BadAttributeValueExpException
     * @exception InvalidApplicationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BooleanValueExp.java
    public String toString()  {

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BooleanValueExp.java
    public Boolean getValue()  {

    /** Returns the  Boolean object representing the value of the BooleanValueExp object.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BooleanValueExp.java
    BooleanValueExp(Boolean val) {

    /**Creates a new BooleanValueExp representing the Boolean object {@code val}.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BooleanValueExp.java
    BooleanValueExp(boolean val) {

    /** Creates a new BooleanValueExp representing the boolean literal {@code val}.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BooleanValueExp.java
    private boolean val = false;

    /**
     * @serial The boolean value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BooleanValueExp.java
class BooleanValueExp extends QueryEval implements ValueExp {

/**
 * This class represents a boolean value. A BooleanValueExp may be
 * used anywhere a ValueExp is required.
 * @serial include
 *
 * @since 1.5
 */
