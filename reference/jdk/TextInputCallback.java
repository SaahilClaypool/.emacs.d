_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
    public String getText() {

    /**
     * Get the retrieved text.
     *
     * <p>
     *
     * @return the retrieved text, which may be null.
     *
     * @see #setText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
    public void setText(String text) {

    /**
     * Set the retrieved text.
     *
     * <p>
     *
     * @param text the retrieved text, which may be null.
     *
     * @see #getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
    public String getDefaultText() {

    /**
     * Get the default text.
     *
     * <p>
     *
     * @return the default text, or null if this {@code TextInputCallback}
     *          was not instantiated with {@code defaultText}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
    public TextInputCallback(String prompt, String defaultText) {

    /**
     * Construct a {@code TextInputCallback} with a prompt
     * and default input value.
     *
     * <p>
     *
     * @param prompt the prompt used to request the information. <p>
     *
     * @param defaultText the text to be used as the default text displayed
     *                  with the prompt.
     *
     * @exception IllegalArgumentException if {@code prompt} is null,
     *                  if {@code prompt} has a length of 0,
     *                  if {@code defaultText} is null
     *                  or if {@code defaultText} has a length of 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
    public TextInputCallback(String prompt) {

    /**
     * Construct a {@code TextInputCallback} with a prompt.
     *
     * <p>
     *
     * @param prompt the prompt used to request the information.
     *
     * @exception IllegalArgumentException if {@code prompt} is null
     *                  or if {@code prompt} has a length of 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
    private String inputText;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
    private String prompt;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextInputCallback.java
public class TextInputCallback implements Callback, java.io.Serializable {

/**
 * <p> Underlying security services instantiate and pass a
 * {@code TextInputCallback} to the {@code handle}
 * method of a {@code CallbackHandler} to retrieve generic text
 * information.
 *
 * @see javax.security.auth.callback.CallbackHandler
 */
