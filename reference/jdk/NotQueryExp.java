_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotQueryExp.java
    @Override

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotQueryExp.java
    public boolean apply(ObjectName name) throws BadStringOperationException, BadBinaryOpValueExpException,

    /**
     * Applies the NotQueryExp on a MBean.
     *
     * @param name The name of the MBean on which the NotQueryExp will be applied.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotQueryExp.java
    public QueryExp getNegatedExp()  {

    /**
     * Returns the negated query expression of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotQueryExp.java
    public NotQueryExp(QueryExp q) {

    /**
     * Creates a new NotQueryExp for negating the specified QueryExp.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotQueryExp.java
    public NotQueryExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotQueryExp.java
    private QueryExp exp;

    /**
     * @serial The negated {@link QueryExp}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/NotQueryExp.java
class NotQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query-building mechanism to represent negations
 * of relational expressions.
 * @serial include
 *
 * @since 1.5
 */
