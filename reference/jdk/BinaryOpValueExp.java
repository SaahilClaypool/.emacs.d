_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    public String toString()  {

    /**
     * Returns the string representing the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    public ValueExp apply(ObjectName name) throws BadStringOperationException, BadBinaryOpValueExpException,

    /**
     * Applies the BinaryOpValueExp on a MBean.
     *
     * @param name The name of the MBean on which the BinaryOpValueExp will be applied.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    public ValueExp getRightValue()  {

    /**
     * Returns the right value of the value expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    public ValueExp getLeftValue()  {

    /**
     * Returns the left value of the value expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    public int getOperator()  {

    /**
     * Returns the operator of the value expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    public BinaryOpValueExp(int o, ValueExp v1, ValueExp v2) {

    /**
     * Creates a new BinaryOpValueExp using operator o applied on v1 and
     * v2 values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    public BinaryOpValueExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    private ValueExp exp2;

    /**
     * @serial The second value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    private ValueExp exp1;

    /**
     * @serial The first value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
    private int op;

    /**
     * @serial The operator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryOpValueExp.java
class BinaryOpValueExp extends QueryEval implements ValueExp {

/**
 * This class is used by the query-building mechanism to represent binary
 * operations.
 * @serial include
 *
 * @since 1.5
 */
