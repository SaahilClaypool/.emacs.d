_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    public void clearPassword() {

    /**
     * Clear the retrieved password.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    public char[] getPassword() {

    /**
     * Get the retrieved password.
     *
     * <p> This method returns a copy of the retrieved password.
     *
     * <p>
     *
     * @return the retrieved password, which may be null.
     *
     * @see #setPassword
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    public void setPassword(char[] password) {

    /**
     * Set the retrieved password.
     *
     * <p> This method makes a copy of the input <i>password</i>
     * before storing it.
     *
     * <p>
     *
     * @param password the retrieved password, which may be null.
     *
     * @see #getPassword
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    public boolean isEchoOn() {

    /**
     * Return whether the password
     * should be displayed as it is being typed.
     *
     * <p>
     *
     * @return the whether the password
     *          should be displayed as it is being typed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    public String getPrompt() {

    /**
     * Get the prompt.
     *
     * <p>
     *
     * @return the prompt.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    public PasswordCallback(String prompt, boolean echoOn) {

    /**
     * Construct a {@code PasswordCallback} with a prompt
     * and a boolean specifying whether the password should be displayed
     * as it is being typed.
     *
     * <p>
     *
     * @param prompt the prompt used to request the password. <p>
     *
     * @param echoOn true if the password should be displayed
     *                  as it is being typed.
     *
     * @exception IllegalArgumentException if {@code prompt} is null or
     *                  if {@code prompt} has a length of 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    private char[] inputPassword;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
    private String prompt;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/PasswordCallback.java
public class PasswordCallback implements Callback, java.io.Serializable {

/**
 * <p> Underlying security services instantiate and pass a
 * {@code PasswordCallback} to the {@code handle}
 * method of a {@code CallbackHandler} to retrieve password information.
 *
 * @see javax.security.auth.callback.CallbackHandler
 */
