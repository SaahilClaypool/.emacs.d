_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerCloneException.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerCloneException.java
    public String getMessage() {

    /**
     * Returns the detail message, including the message from the cause, if
     * any, of this exception.
     *
     * @return the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerCloneException.java
    public ServerCloneException(String s, Exception cause) {

    /**
     * Constructs a <code>ServerCloneException</code> with the specified
     * detail message and cause.
     *
     * @param s the detail message.
     * @param cause the cause
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerCloneException.java
    public ServerCloneException(String s) {

    /**
     * Constructs a <code>ServerCloneException</code> with the specified
     * detail message.
     *
     * @param s the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerCloneException.java
    public Exception detail;

    /**
     * The cause of the exception.
     *
     * <p>This field predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerCloneException.java
public class ServerCloneException extends CloneNotSupportedException {

/**
 * A <code>ServerCloneException</code> is thrown if a remote exception occurs
 * during the cloning of a <code>UnicastRemoteObject</code>.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "nested exception"
 * that may be provided at construction time and accessed via the public
 * {@link #detail} field is now known as the <i>cause</i>, and may be
 * accessed via the {@link Throwable#getCause()} method, as well as
 * the aforementioned "legacy field."
 *
 * <p>Invoking the method {@link Throwable#initCause(Throwable)} on an
 * instance of <code>ServerCloneException</code> always throws {@link
 * IllegalStateException}.
 *
 * @author  Ann Wollrath
 * @since   JDK1.1
 * @see     java.rmi.server.UnicastRemoteObject#clone()
 */
