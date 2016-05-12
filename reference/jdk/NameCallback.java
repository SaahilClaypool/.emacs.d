_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
    public String getName() {

    /**
     * Get the retrieved name.
     *
     * <p>
     *
     * @return the retrieved name (which may be null)
     *
     * @see #setName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
    public void setName(String name) {

    /**
     * Set the retrieved name.
     *
     * <p>
     *
     * @param name the retrieved name (which may be null).
     *
     * @see #getName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
    public String getDefaultName() {

    /**
     * Get the default name.
     *
     * <p>
     *
     * @return the default name, or null if this {@code NameCallback}
     *          was not instantiated with a {@code defaultName}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
    public NameCallback(String prompt, String defaultName) {

    /**
     * Construct a {@code NameCallback} with a prompt
     * and default name.
     *
     * <p>
     *
     * @param prompt the prompt used to request the information. <p>
     *
     * @param defaultName the name to be used as the default name displayed
     *                  with the prompt.
     *
     * @exception IllegalArgumentException if {@code prompt} is null,
     *                  if {@code prompt} has a length of 0,
     *                  if {@code defaultName} is null,
     *                  or if {@code defaultName} has a length of 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
    public NameCallback(String prompt) {

    /**
     * Construct a {@code NameCallback} with a prompt.
     *
     * <p>
     *
     * @param prompt the prompt used to request the name.
     *
     * @exception IllegalArgumentException if {@code prompt} is null
     *                  or if {@code prompt} has a length of 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
    private String inputName;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
    private String prompt;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/NameCallback.java
public class NameCallback implements Callback, java.io.Serializable {

/**
 * <p> Underlying security services instantiate and pass a
 * {@code NameCallback} to the {@code handle}
 * method of a {@code CallbackHandler} to retrieve name information.
 *
 * @see javax.security.auth.callback.CallbackHandler
 */
