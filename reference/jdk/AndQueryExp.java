_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    @Override

   /**
    * Returns a string representation of this AndQueryExp
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    public boolean apply(ObjectName name) throws BadStringOperationException, BadBinaryOpValueExpException,

    /**
     * Applies the AndQueryExp on a MBean.
     *
     * @param name The name of the MBean on which the AndQueryExp will be applied.
     *
     * @return  True if the query was successfully applied to the MBean, false otherwise.
     *
     *
     * @exception BadStringOperationException The string passed to the method is invalid.
     * @exception BadBinaryOpValueExpException The expression passed to the method is invalid.
     * @exception BadAttributeValueExpException The attribute value passed to the method is invalid.
     * @exception InvalidApplicationException  An attempt has been made to apply a subquery expression to a
     * managed object or a qualified attribute expression to a managed object of the wrong class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    public QueryExp getRightExp()  {

    /**
     * Returns the right query expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    public QueryExp getLeftExp()  {

    /**
     * Returns the left query expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    public AndQueryExp(QueryExp q1, QueryExp q2) {

    /**
     * Creates a new AndQueryExp with q1 and q2 QueryExp.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    public AndQueryExp() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    private QueryExp exp2;

    /**
     * @serial The second QueryExp of the conjunction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
    private QueryExp exp1;

    /**
     * @serial The first QueryExp of the conjunction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/AndQueryExp.java
class AndQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query building mechanism to represent conjunctions
 * of relational expressions.
 * @serial include
 *
 * @since 1.5
 */
