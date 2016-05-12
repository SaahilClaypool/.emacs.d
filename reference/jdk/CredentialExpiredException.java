_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/CredentialExpiredException.java
    public CredentialExpiredException(String msg) {

    /**
     * Constructs a CredentialExpiredException with the specified detail
     * message.  A detail message is a String that describes this particular
     * exception.
     *
     * <p>
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/CredentialExpiredException.java
    public CredentialExpiredException() {

    /**
     * Constructs a CredentialExpiredException with no detail message. A detail
     * message is a String that describes this particular exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/login/CredentialExpiredException.java
public class CredentialExpiredException extends CredentialException {

/**
 * Signals that a {@code Credential} has expired.
 *
 * <p> This exception is thrown by LoginModules when they determine
 * that a {@code Credential} has expired.
 * For example, a {@code LoginModule} authenticating a user
 * in its {@code login} method may determine that the user's
 * password, although entered correctly, has expired.  In this case
 * the {@code LoginModule} throws this exception to notify
 * the application.  The application can then take the appropriate
 * steps to assist the user in updating the password.
 *
 */
