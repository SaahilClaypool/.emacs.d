_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeErrorException.java
    public Throwable getCause() {

    /**
     * Returns the actual {@link Error} thrown.
     *
     * @return the wrapped {@link Error}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeErrorException.java
    public java.lang.Error getTargetError()  {

    /**
     * Returns the actual {@link Error} thrown.
     *
     * @return the wrapped {@link Error}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeErrorException.java
    public RuntimeErrorException(java.lang.Error e, String message) {

    /**
     * Constructor that allows a specific error message to be specified.
     *
     * @param e the wrapped error.
     * @param message the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeErrorException.java
    public RuntimeErrorException(java.lang.Error e) {

    /**
     * Default constructor.
     *
     * @param e the wrapped error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeErrorException.java
    private java.lang.Error error ;

    /**
     * @serial The encapsulated {@link Error}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/RuntimeErrorException.java
public class RuntimeErrorException extends JMRuntimeException   {

/**
 * When a <CODE>java.lang.Error</CODE> occurs in the agent it should be caught and
 * re-thrown as a <CODE>RuntimeErrorException</CODE>.
 *
 * @since 1.5
 */
