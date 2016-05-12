_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeOperationsException.java
    public Throwable getCause() {

    /**
     * Returns the actual {@link RuntimeException} thrown.
     *
     * @return the wrapped {@link RuntimeException}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeOperationsException.java
    public java.lang.RuntimeException getTargetException()  {

    /**
     * Returns the actual {@link RuntimeException} thrown.
     *
     * @return the wrapped {@link RuntimeException}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeOperationsException.java
    public RuntimeOperationsException(java.lang.RuntimeException e, String message) {

    /**
     * Creates a <CODE>RuntimeOperationsException</CODE> that wraps the actual <CODE>java.lang.RuntimeException</CODE>
     * with a detailed message.
     *
     * @param e the wrapped exception.
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeOperationsException.java
    public RuntimeOperationsException(java.lang.RuntimeException e) {

    /**
     * Creates a <CODE>RuntimeOperationsException</CODE> that wraps the actual <CODE>java.lang.RuntimeException</CODE>.
     *
     * @param e the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeOperationsException.java
    private java.lang.RuntimeException runtimeException ;

    /**
     * @serial The encapsulated {@link RuntimeException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeOperationsException.java
public class RuntimeOperationsException extends JMRuntimeException   {

/**
 * Represents runtime exceptions thrown in the agent when performing operations on MBeans.
 * It wraps the actual <CODE>java.lang.RuntimeException</CODE> thrown.
 *
 * @since 1.5
 */
