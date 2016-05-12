_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadBinaryOpValueExpException.java
    public String toString()  {

    /**
     * Returns the string representing the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadBinaryOpValueExpException.java
    public ValueExp getExp()  {

    /**
     * Returns the <CODE>ValueExp</CODE> that originated the exception.
     *
     * @return the problematic {@link ValueExp}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadBinaryOpValueExpException.java
    public BadBinaryOpValueExpException(ValueExp exp) {

    /**
     * Constructs a <CODE>BadBinaryOpValueExpException</CODE> with the specified <CODE>ValueExp</CODE>.
     *
     * @param exp the expression whose value was inappropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadBinaryOpValueExpException.java
    private ValueExp exp;

    /**
     * @serial the {@link ValueExp} that originated this exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/BadBinaryOpValueExpException.java
public class BadBinaryOpValueExpException extends Exception   {

/**
 * Thrown when an invalid expression is passed to a method for
 * constructing a query.  This exception is used internally by JMX
 * during the evaluation of a query.  User code does not usually see
 * it.
 *
 * @since 1.5
 */
