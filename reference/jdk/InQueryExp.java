_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    public String toString()  {

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    public boolean apply(ObjectName name)

    /**
     * Applies the InQueryExp on a MBean.
     *
     * @param name The name of the MBean on which the InQueryExp will be applied.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    public ValueExp[] getExplicitValues()  {

    /**
     * Returns the array of values of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    public ValueExp getCheckedValue()  {

    /**
     * Returns the checked value of the query.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    public InQueryExp(ValueExp v1, ValueExp items[]) {

    /**
     * Creates a new InQueryExp with the specified ValueExp to be found in
     * a specified array of ValueExp.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    public InQueryExp() {

    /**
     * Basic Constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    private ValueExp[]  valueList;

    /**
     * @serial The array of {@link ValueExp} to be searched
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
    private ValueExp val;

    /**
     * @serial The {@link ValueExp} to be found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InQueryExp.java
class InQueryExp extends QueryEval implements QueryExp {

/**
 * This class is used by the query-building mechanism to represent binary
 * operations.
 * @serial include
 *
 * @since 1.5
 */
