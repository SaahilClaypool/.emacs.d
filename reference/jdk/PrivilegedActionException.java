_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PrivilegedActionException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this exception (the exception thrown by
     * the privileged computation that resulted in this
     * {@code PrivilegedActionException}).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PrivilegedActionException.java
    public Exception getException() {

    /**
     * Returns the exception thrown by the privileged computation that
     * resulted in this {@code PrivilegedActionException}.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the exception thrown by the privileged computation that
     *         resulted in this {@code PrivilegedActionException}.
     * @see PrivilegedExceptionAction
     * @see AccessController#doPrivileged(PrivilegedExceptionAction)
     * @see AccessController#doPrivileged(PrivilegedExceptionAction,
     *                                            AccessControlContext)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PrivilegedActionException.java
    public PrivilegedActionException(Exception exception) {

    /**
     * Constructs a new PrivilegedActionException &quot;wrapping&quot;
     * the specific Exception.
     *
     * @param exception The exception thrown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PrivilegedActionException.java
    private Exception exception;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/PrivilegedActionException.java
public class PrivilegedActionException extends Exception {

/**
 * This exception is thrown by
 * {@code doPrivileged(PrivilegedExceptionAction)} and
 * {@code doPrivileged(PrivilegedExceptionAction,
 * AccessControlContext context)} to indicate
 * that the action being performed threw a checked exception.  The exception
 * thrown by the action can be obtained by calling the
 * {@code getException} method.  In effect, an
 * {@code PrivilegedActionException} is a "wrapper"
 * for an exception thrown by a privileged action.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "exception thrown
 * by the privileged computation" that is provided at construction time and
 * accessed via the {@link #getException()} method is now known as the
 * <i>cause</i>, and may be accessed via the {@link Throwable#getCause()}
 * method, as well as the aforementioned "legacy method."
 *
 * @see PrivilegedExceptionAction
 * @see AccessController#doPrivileged(PrivilegedExceptionAction)
 * @see AccessController#doPrivileged(PrivilegedExceptionAction,AccessControlContext)
 */
