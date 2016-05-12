_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    public String toString()  {

    /**
     * Returns the string representing the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    public boolean apply(ObjectName name) throws

    /**
     * Applies the MatchQueryExp on a MBean.
     *
     * @param name The name of the MBean on which the MatchQueryExp will be applied.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    public String getPattern()  {

    /**
     * Returns the pattern of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    public AttributeValueExp getAttribute()  {

    /**
     * Returns the attribute of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    public MatchQueryExp(AttributeValueExp a, StringValueExp s) {

    /**
     * Creates a new MatchQueryExp where the specified AttributeValueExp matches
     * the specified pattern StringValueExp.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    public MatchQueryExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    private String pattern;

    /**
     * @serial The pattern to be matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
    private AttributeValueExp exp;

    /**
     * @serial The attribute value to be matched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MatchQueryExp.java
class MatchQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query-building mechanism to represent binary
 * relations.
 * @serial include
 *
 * @since 1.5
 */
