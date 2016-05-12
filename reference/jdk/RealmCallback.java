_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/RealmCallback.java
    public RealmCallback(String prompt, String defaultRealmInfo) {

    /**
     * Constructs a {@code RealmCallback} with a prompt and default
     * realm information.
     *
     * @param prompt The non-null prompt to use to request the realm information.
     * @param defaultRealmInfo The non-null default realm information to use.
     * @throws IllegalArgumentException If {@code prompt} is null or
     * the empty string,
     * or if {@code defaultRealm} is empty or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/RealmCallback.java
    public RealmCallback(String prompt) {

    /**
     * Constructs a {@code RealmCallback} with a prompt.
     *
     * @param prompt The non-null prompt to use to request the realm information.
     * @throws IllegalArgumentException If {@code prompt} is null or
     * the empty string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/sasl/RealmCallback.java
public class RealmCallback extends TextInputCallback {

/**
  * This callback is used by {@code SaslClient} and {@code SaslServer}
  * to retrieve realm information.
  *
  * @since 1.5
  *
  * @author Rosanna Lee
  * @author Rob Weltman
  */
