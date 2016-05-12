_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeMBeanException.java
    public Throwable getCause() {

    /**
     * Returns the actual {@link RuntimeException} thrown.
     *
     * @return the wrapped {@link RuntimeException}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeMBeanException.java
    public java.lang.RuntimeException getTargetException()  {

    /**
     * Returns the actual {@link RuntimeException} thrown.
     *
     * @return the wrapped {@link RuntimeException}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeMBeanException.java
    public RuntimeMBeanException(java.lang.RuntimeException e, String message) {

    /**
     * Creates a <CODE>RuntimeMBeanException</CODE> that wraps the actual <CODE>java.lang.RuntimeException</CODE> with
     * a detailed message.
     *
     * @param e the wrapped exception.
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeMBeanException.java
    public RuntimeMBeanException(java.lang.RuntimeException e) {

    /**
     * Creates a <CODE>RuntimeMBeanException</CODE> that wraps the actual <CODE>java.lang.RuntimeException</CODE>.
     *
     * @param e the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeMBeanException.java
    private java.lang.RuntimeException runtimeException ;

    /**
     * @serial The encapsulated {@link RuntimeException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeMBeanException.java
public class RuntimeMBeanException extends JMRuntimeException   {

/**
 * Represents runtime exceptions thrown by MBean methods in
 * the agent. It "wraps" the actual <CODE>java.lang.RuntimeException</CODE> exception thrown.
 * This exception will be built by the MBeanServer when a call to an
 * MBean method throws a runtime exception.
 *
 * @since 1.5
 */
