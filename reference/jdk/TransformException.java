_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public void printStackTrace(PrintWriter s) {

    /**
     * Prints this <code>TransformException</code>, its backtrace and
     * the cause's backtrace to the specified print writer.
     *
     * @param s <code>PrintWriter</code> to use for output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public void printStackTrace(PrintStream s) {

    /**
     * Prints this <code>TransformException</code>, its backtrace and
     * the cause's backtrace to the specified print stream.
     *
     * @param s <code>PrintStream</code> to use for output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public void printStackTrace() {

    /**
     * Prints this <code>TransformException</code>, its backtrace and
     * the cause's backtrace to the standard error stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this <code>TransformException</code> or
     * <code>null</code> if the cause is nonexistent or unknown.  (The
     * cause is the throwable that caused this
     * <code>TransformException</code> to get thrown.)
     *
     * @return the cause of this <code>TransformException</code> or
     *         <code>null</code> if the cause is nonexistent or unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public TransformException(Throwable cause) {

    /**
     * Constructs a new <code>TransformException</code> with the specified
     * cause and a detail message of
     * <code>(cause==null ? null : cause.toString())</code>
     * (which typically contains the class and detail message of
     * <code>cause</code>).
     *
     * @param cause the cause (A <tt>null</tt> value is permitted, and
     *        indicates that the cause is nonexistent or unknown.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public TransformException(String message, Throwable cause) {

    /**
     * Constructs a new <code>TransformException</code> with the
     * specified detail message and cause.
     * <p>Note that the detail message associated with
     * <code>cause</code> is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param message the detail message
     * @param cause the cause (A <tt>null</tt> value is permitted, and
     *        indicates that the cause is nonexistent or unknown.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public TransformException(String message) {

    /**
     * Constructs a new <code>TransformException</code> with the specified
     * detail message.
     *
     * @param message the detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    public TransformException() {

    /**
     * Constructs a new <code>TransformException</code> with
     * <code>null</code> as its detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
    private Throwable cause;

    /**
     * The throwable that caused this exception to get thrown, or null if this
     * exception was not caused by another throwable or if the causative
     * throwable is unknown.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/TransformException.java
public class TransformException extends Exception {

/**
 * Indicates an exceptional condition that occurred while executing a
 * transform algorithm.
 *
 * <p>A <code>TransformException</code> can contain a cause: another
 * throwable that caused this <code>TransformException</code> to get thrown.
 *
 * @see Transform#transform
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 */
