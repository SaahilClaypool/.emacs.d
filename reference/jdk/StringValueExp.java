_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
    /* There is no need for this method, because if a query is being

    /**
     * Sets the MBean server on which the query is to be performed.
     *
     * @param s The MBean server on which the query is to be performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
    public String toString()  {

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
    public String getValue()  {

    /**
     * Returns the string represented by the
     * <CODE>StringValueExp</CODE> instance.
     *
     * @return the string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
    public StringValueExp(String val) {

    /**
     * Creates a new <CODE>StringValueExp</CODE> representing the
     * given string.
     *
     * @param val the string that will be the value of this expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
    public StringValueExp() {

    /**
     * Basic constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
    private String val;

    /**
     * @serial The string literal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/StringValueExp.java
public class StringValueExp implements ValueExp   {

/**
 * Represents strings that are arguments to relational constraints.
 * A <CODE>StringValueExp</CODE> may be used anywhere a <CODE>ValueExp</CODE> is required.
 *
 * @since 1.5
 */
