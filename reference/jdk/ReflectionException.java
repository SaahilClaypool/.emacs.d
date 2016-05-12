_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ReflectionException.java
    public Throwable getCause() {

    /**
     * Returns the actual {@link Exception} thrown.
     *
     * @return the wrapped {@link Exception}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ReflectionException.java
    public java.lang.Exception getTargetException()  {

    /**
     * Returns the actual {@link Exception} thrown.
     *
     * @return the wrapped {@link Exception}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ReflectionException.java
    public ReflectionException(java.lang.Exception e, String message) {

    /**
     * Creates a <CODE>ReflectionException</CODE> that wraps the actual <CODE>java.lang.Exception</CODE> with
     * a detail message.
     *
     * @param e the wrapped exception.
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ReflectionException.java
    public ReflectionException(java.lang.Exception e) {

    /**
     * Creates a <CODE>ReflectionException</CODE> that wraps the actual <CODE>java.lang.Exception</CODE>.
     *
     * @param e the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ReflectionException.java
    private java.lang.Exception exception ;

    /**
     * @serial The wrapped {@link Exception}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/ReflectionException.java
public class ReflectionException extends JMException   {

/**
 * Represents exceptions thrown in the MBean server when using the
 * java.lang.reflect classes to invoke methods on MBeans. It "wraps" the
 * actual java.lang.Exception thrown.
 *
 * @since 1.5
 */
