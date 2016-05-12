_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanException.java
    public Throwable getCause() {

    /**
     * Return the actual {@link Exception} thrown.
     *
     * @return the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanException.java
    public Exception getTargetException()  {

    /**
     * Return the actual {@link Exception} thrown.
     *
     * @return the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanException.java
    public MBeanException(java.lang.Exception e, String message) {

    /**
     * Creates an <CODE>MBeanException</CODE> that wraps the actual <CODE>java.lang.Exception</CODE> with
     * a detail message.
     *
     * @param e the wrapped exception.
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanException.java
    public MBeanException(java.lang.Exception e) {

    /**
     * Creates an <CODE>MBeanException</CODE> that wraps the actual <CODE>java.lang.Exception</CODE>.
     *
     * @param e the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanException.java
    private java.lang.Exception exception ;

    /**
     * @serial Encapsulated {@link Exception}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/MBeanException.java
public class MBeanException extends JMException   {

/**
 * Represents "user defined" exceptions thrown by MBean methods
 * in the agent. It "wraps" the actual "user defined" exception thrown.
 * This exception will be built by the MBeanServer when a call to an
 * MBean method results in an unknown exception.
 *
 * @since 1.5
 */
