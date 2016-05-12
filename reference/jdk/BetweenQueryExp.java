_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    @Override

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    public boolean apply(ObjectName name) throws BadStringOperationException, BadBinaryOpValueExpException,

    /**
     * Applies the BetweenQueryExp on an MBean.
     *
     * @param name The name of the MBean on which the BetweenQueryExp will be applied.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    public ValueExp getUpperBound()  {

    /**
     * Returns the upper bound value of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    public ValueExp getLowerBound()  {

    /**
     * Returns the lower bound value of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    public ValueExp getCheckedValue()  {

    /**
     * Returns the checked value of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    public BetweenQueryExp(ValueExp v1, ValueExp v2, ValueExp v3) {

    /**
     * Creates a new BetweenQueryExp with v1 checked value, v2 lower bound
     * and v3 upper bound values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    public BetweenQueryExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    private ValueExp exp3;

    /**
     * @serial The upper bound value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    private ValueExp exp2;

    /**
     * @serial The lower bound value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
    private ValueExp exp1;

    /**
     * @serial The checked value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BetweenQueryExp.java
class BetweenQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query-building mechanism to represent binary
 * relations.
 * @serial include
 *
 * @since 1.5
 */
