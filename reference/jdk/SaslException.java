_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslException.java
    private static final long serialVersionUID = 4579784287983423626L;

    /** Use serialVersionUID from JSR 28 RI for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslException.java
    // Override Throwable.toString() to conform to JSR 28

    /**
     * Returns the string representation of this exception.
     * The string representation contains
     * this exception's class name, its detailed message, and if
     * it has a root exception, the string representation of the root
     * exception. This string representation
     * is meant for debugging and not meant to be interpreted
     * programmatically.
     * @return The non-null string representation of this exception.
     * @see java.lang.Throwable#getMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslException.java
    public SaslException (String detail, Throwable ex) {

    /**
     * Constructs a new instance of {@code SaslException} with a detailed message
     * and a root exception.
     * For example, a SaslException might result from a problem with
     * the callback handler, which might throw a NoSuchCallbackException if
     * it does not support the requested callback, or throw an IOException
     * if it had problems obtaining data for the callback. The
     * SaslException's root exception would be then be the exception thrown
     * by the callback handler.
     *
     * @param detail A possibly null string containing details of the exception.
     * @param ex A possibly null root exception that caused this exception.
     *
     * @see java.lang.Throwable#getMessage
     * @see #getCause
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslException.java
    public SaslException (String detail) {

    /**
     * Constructs a new instance of {@code SaslException} with a detailed message.
     * The root exception is null.
     * @param detail A possibly null string containing details of the exception.
     *
     * @see java.lang.Throwable#getMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslException.java
    public SaslException () {

    /**
     * Constructs a new instance of {@code SaslException}.
     * The root exception and the detailed message are null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/SaslException.java
public class SaslException extends IOException {

/**
 * This class represents an error that has occurred when using SASL.
 *
 * @since 1.5
 *
 * @author Rosanna Lee
 * @author Rob Weltman
 */
