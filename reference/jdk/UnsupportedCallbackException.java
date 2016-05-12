_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/UnsupportedCallbackException.java
    public Callback getCallback() {

    /**
     * Get the unrecognized {@code Callback}.
     *
     * <p>
     *
     * @return the unrecognized {@code Callback}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/UnsupportedCallbackException.java
    public UnsupportedCallbackException(Callback callback, String msg) {

    /**
     * Constructs a UnsupportedCallbackException with the specified detail
     * message.  A detail message is a String that describes this particular
     * exception.
     *
     * <p>
     *
     * @param callback the unrecognized {@code Callback}. <p>
     *
     * @param msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/UnsupportedCallbackException.java
    public UnsupportedCallbackException(Callback callback) {

    /**
     * Constructs a {@code UnsupportedCallbackException}
     * with no detail message.
     *
     * <p>
     *
     * @param callback the unrecognized {@code Callback}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/UnsupportedCallbackException.java
    private Callback callback;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/UnsupportedCallbackException.java
public class UnsupportedCallbackException extends Exception {

/**
 * Signals that a {@code CallbackHandler} does not
 * recognize a particular {@code Callback}.
 *
 */
