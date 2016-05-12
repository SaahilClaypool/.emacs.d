_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    @Override

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    public boolean apply(ObjectName name) throws BadStringOperationException, BadBinaryOpValueExpException,

    /**
     * Applies the BinaryRelQueryExp on an MBean.
     *
     * @param name The name of the MBean on which the BinaryRelQueryExp will be applied.
     *
     * @return  True if the query was successfully applied to the MBean, false otherwise.
     *
     * @exception BadStringOperationException
     * @exception BadBinaryOpValueExpException
     * @exception BadAttributeValueExpException
     * @exception InvalidApplicationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    public ValueExp getRightValue()  {

    /**
     * Returns the right value of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    public ValueExp getLeftValue()  {

    /**
     * Returns the left value of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    public int getOperator()  {

    /**
     * Returns the operator of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    public BinaryRelQueryExp(int op, ValueExp v1, ValueExp v2) {

    /**
     * Creates a new BinaryRelQueryExp with operator op applied on v1 and
     * v2 values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    public BinaryRelQueryExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    private ValueExp exp2;

    /**
     * @serial The second value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    private ValueExp exp1;

    /**
     * @serial The first value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
    private int relOp;

    /**
     * @serial The operator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BinaryRelQueryExp.java
class BinaryRelQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query-building mechanism to represent binary
 * operations.
 * @serial include
 *
 * @since 1.5
 */
