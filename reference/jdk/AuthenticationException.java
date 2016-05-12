_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/AuthenticationException.java
    private static final long serialVersionUID = 3678497619904568096L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/AuthenticationException.java
    public AuthenticationException() {

    /**
      * Constructs a new instance of AuthenticationException.
      * All fields are set to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/AuthenticationException.java
public class AuthenticationException extends NamingSecurityException {

/**
  * This exception is thrown when an authentication error occurs while
  * accessing the naming or directory service.
  * An authentication error can happen, for example, when the credentials
  * supplied by the user program is invalid or otherwise fails to
  * authenticate the user to the naming/directory service.
  *<p>
  * If the program wants to handle this exception in particular, it
  * should catch AuthenticationException explicitly before attempting to
  * catch NamingException. After catching AuthenticationException, the
  * program could reattempt the authentication by updating
  * the resolved context's environment properties with the appropriate
  * appropriate credentials.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthenticationException.java
    private static final long serialVersionUID = -3579708765071815007L;

    /** Use serialVersionUID from JSR 28 RI for interoperability */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthenticationException.java
    public AuthenticationException (String detail, Throwable ex) {

    /**
     * Constructs a new instance of {@code AuthenticationException} with a detailed message
     * and a root exception.
     *
     * @param detail A possibly null string containing details of the exception.
     * @param ex A possibly null root exception that caused this exception.
     *
     * @see java.lang.Throwable#getMessage
     * @see #getCause
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthenticationException.java
    public AuthenticationException (String detail) {

    /**
     * Constructs a new instance of {@code AuthenticationException}
     * with a detailed message.
     * The root exception is null.
     * @param detail A possibly null string containing details of the exception.
     *
     * @see java.lang.Throwable#getMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/AuthenticationException.java
public class AuthenticationException extends SaslException {

/**
 * This exception is thrown by a SASL mechanism implementation
 * to indicate that the SASL
 * exchange has failed due to reasons related to authentication, such as
 * an invalid identity, passphrase, or key.
 * <p>
 * Note that the lack of an AuthenticationException does not mean that
 * the failure was not due to an authentication error.  A SASL mechanism
 * implementation might throw the more general SaslException instead of
 * AuthenticationException if it is unable to determine the nature
 * of the failure, or if does not want to disclose the nature of
 * the failure, for example, due to security reasons.
 *
 * @since 1.5
 *
 * @author Rosanna Lee
 * @author Rob Weltman
 */
