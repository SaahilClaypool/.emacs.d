_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InvalidApplicationException.java
    public InvalidApplicationException(Object val) {

    /**
     * Constructs an <CODE>InvalidApplicationException</CODE> with the specified <CODE>Object</CODE>.
     *
     * @param val the detail message of this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InvalidApplicationException.java
    private Object val;

    /**
     * @serial The object representing the class of the MBean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/InvalidApplicationException.java
public class InvalidApplicationException extends Exception   {

/**
 * Thrown when an attempt is made to apply either of the following: A
 * subquery expression to an MBean or a qualified attribute expression
 * to an MBean of the wrong class.  This exception is used internally
 * by JMX during the evaluation of a query.  User code does not
 * usually see it.
 *
 * @since 1.5
 */
