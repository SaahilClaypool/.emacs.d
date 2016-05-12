_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public Throwable getCause() {

    /**
     * Returns the exception that terminated the operation (the <i>cause</i>).
     *
     * @return  the exception that terminated the operation (the <i>cause</i>),
     *          which may be null.
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public String getMessage() {

    /**
     * Produce the message and include the message from the nested
     * exception, if there is one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public WriteAbortedException(String s, Exception ex) {

    /**
     * Constructs a WriteAbortedException with a string describing
     * the exception and the exception causing the abort.
     * @param s   String describing the exception.
     * @param ex  Exception causing the abort.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public Exception detail;

    /**
     * Exception that was caught while writing the ObjectStream.
     *
     * <p>This field predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
public class WriteAbortedException extends ObjectStreamException {

/**
 * Signals that one of the ObjectStreamExceptions was thrown during a
 * write operation.  Thrown during a read operation when one of the
 * ObjectStreamExceptions was thrown during a write operation.  The
 * exception that terminated the write can be found in the detail
 * field. The stream is reset to it's initial state and all references
 * to objects already deserialized are discarded.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "exception causing
 * the abort" that is provided at construction time and
 * accessed via the public {@link #detail} field is now known as the
 * <i>cause</i>, and may be accessed via the {@link Throwable#getCause()}
 * method, as well as the aforementioned "legacy field."
 *
 * @author  unascribed
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public Throwable getCause() {

    /**
     * Returns the exception that terminated the operation (the <i>cause</i>).
     *
     * @return  the exception that terminated the operation (the <i>cause</i>),
     *          which may be null.
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public String getMessage() {

    /**
     * Produce the message and include the message from the nested
     * exception, if there is one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public WriteAbortedException(String s, Exception ex) {

    /**
     * Constructs a WriteAbortedException with a string describing
     * the exception and the exception causing the abort.
     * @param s   String describing the exception.
     * @param ex  Exception causing the abort.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
    public Exception detail;

    /**
     * Exception that was caught while writing the ObjectStream.
     *
     * <p>This field predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/WriteAbortedException.java
public class WriteAbortedException extends ObjectStreamException {

/**
 * Signals that one of the ObjectStreamExceptions was thrown during a
 * write operation.  Thrown during a read operation when one of the
 * ObjectStreamExceptions was thrown during a write operation.  The
 * exception that terminated the write can be found in the detail
 * field. The stream is reset to it's initial state and all references
 * to objects already deserialized are discarded.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "exception causing
 * the abort" that is provided at construction time and
 * accessed via the public {@link #detail} field is now known as the
 * <i>cause</i>, and may be accessed via the {@link Throwable#getCause()}
 * method, as well as the aforementioned "legacy field."
 *
 * @author  unascribed
 * @since   JDK1.1
 */
