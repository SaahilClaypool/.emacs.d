_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/LanguageCallback.java
    public Locale getLocale() {

    /**
     * Get the retrieved {@code Locale}.
     *
     * <p>
     *
     * @return the retrieved {@code Locale}, or null
     *          if no {@code Locale} could be retrieved.
     *
     * @see #setLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/LanguageCallback.java
    public void setLocale(Locale locale) {

    /**
     * Set the retrieved {@code Locale}.
     *
     * <p>
     *
     * @param locale the retrieved {@code Locale}.
     *
     * @see #getLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/LanguageCallback.java
    public LanguageCallback() { }

    /**
     * Construct a {@code LanguageCallback}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/LanguageCallback.java
    private Locale locale;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/LanguageCallback.java
public class LanguageCallback implements Callback, java.io.Serializable {

/**
 * <p> Underlying security services instantiate and pass a
 * {@code LanguageCallback} to the {@code handle}
 * method of a {@code CallbackHandler} to retrieve the {@code Locale}
 * used for localizing text.
 *
 * @see javax.security.auth.callback.CallbackHandler
 */
