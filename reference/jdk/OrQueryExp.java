_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    @Override

    /**
     * Returns a string representation of this OrQueryExp
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    public boolean apply(ObjectName name) throws BadStringOperationException,

    /**
     * Applies the OrQueryExp on a MBean.
     *
     * @param name The name of the MBean on which the OrQueryExp will be applied.
     *
     * @return  True if the query was successfully applied to the MBean, false otherwise.
     *
     *
     * @exception BadStringOperationException The string passed to the method is invalid.
     * @exception BadBinaryOpValueExpException The expression passed to the method is invalid.
     * @exception BadAttributeValueExpException The attribute value passed to the method is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    public QueryExp getRightExp() {

    /**
     * Returns the right query expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    public QueryExp getLeftExp() {

    /**
     * Returns the left query expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    public OrQueryExp(QueryExp q1, QueryExp q2) {

    /**
     * Creates a new OrQueryExp with the specified ValueExps
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    public OrQueryExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    private QueryExp exp2;

    /**
     * @serial The right query expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
    private QueryExp exp1;

    /**
     * @serial The left query expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/OrQueryExp.java
class OrQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query-building mechanism to represent
 * disjunctions of relational expressions.
 * @serial include
 *
 * @since 1.5
 */
