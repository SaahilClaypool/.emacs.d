_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this exception.  This method returns the value
     * of the {@link #detail} field.
     *
     * @return  the cause, which may be <tt>null</tt>.
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
    public String getMessage() {

    /**
     * Returns the detail message, including the message from the cause, if
     * any, of this exception.
     *
     * @return  the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
    public ActivationException(String s, Throwable cause) {

    /**
     * Constructs an <code>ActivationException</code> with the specified
     * detail message and cause.  This constructor sets the {@link #detail}
     * field to the specified <code>Throwable</code>.
     *
     * @param s the detail message
     * @param cause the cause
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
    public ActivationException(String s) {

    /**
     * Constructs an <code>ActivationException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
    public ActivationException() {

    /**
     * Constructs an <code>ActivationException</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
    private static final long serialVersionUID = -4320118837291406071L;

    /** indicate compatibility with the Java 2 SDK v1.2 version of class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
    public Throwable detail;

    /**
     * The cause of the activation exception.
     *
     * <p>This field predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationException.java
public class ActivationException extends Exception {

/**
 * General exception used by the activation interfaces.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "detail exception"
 * that may be provided at construction time and accessed via the public
 * {@link #detail} field is now known as the <i>cause</i>, and may be
 * accessed via the {@link Throwable#getCause()} method, as well as
 * the aforementioned "legacy field."
 *
 * <p>Invoking the method {@link Throwable#initCause(Throwable)} on an
 * instance of <code>ActivationException</code> always throws {@link
 * IllegalStateException}.
 *
 * @author      Ann Wollrath
 * @since       1.2
 */
