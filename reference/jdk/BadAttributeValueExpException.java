_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadAttributeValueExpException.java
    public String toString()  {

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadAttributeValueExpException.java
    public BadAttributeValueExpException (Object val) {

    /**
     * Constructs a BadAttributeValueExpException using the specified Object to
     * create the toString() value.
     *
     * @param val the inappropriate value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadAttributeValueExpException.java
    private Object val;

    /**
     * @serial A string representation of the attribute that originated this exception.
     * for example, the string value can be the return of {@code attribute.toString()}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadAttributeValueExpException.java
public class BadAttributeValueExpException extends Exception   {

/**
 * Thrown when an invalid MBean attribute is passed to a query
 * constructing method.  This exception is used internally by JMX
 * during the evaluation of a query.  User code does not usually
 * see it.
 *
 * @since 1.5
 */
