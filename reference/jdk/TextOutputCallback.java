_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextOutputCallback.java
    public String getMessage() {

    /**
     * Get the message to be displayed.
     *
     * <p>
     *
     * @return the message to be displayed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextOutputCallback.java
    public int getMessageType() {

    /**
     * Get the message type.
     *
     * <p>
     *
     * @return the message type ({@code INFORMATION},
     *                  {@code WARNING} or {@code ERROR}).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextOutputCallback.java
    public TextOutputCallback(int messageType, String message) {

    /**
     * Construct a TextOutputCallback with a message type and message
     * to be displayed.
     *
     * <p>
     *
     * @param messageType the message type ({@code INFORMATION},
     *                  {@code WARNING} or {@code ERROR}). <p>
     *
     * @param message the message to be displayed. <p>
     *
     * @exception IllegalArgumentException if {@code messageType}
     *                  is not either {@code INFORMATION},
     *                  {@code WARNING} or {@code ERROR},
     *                  if {@code message} is null,
     *                  or if {@code message} has a length of 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextOutputCallback.java
    private int messageType;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextOutputCallback.java
    public static final int ERROR               = 2;

    /** Error message. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextOutputCallback.java
    public static final int INFORMATION         = 0;

    /** Information message. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/TextOutputCallback.java
public class TextOutputCallback implements Callback, java.io.Serializable {

/**
 * <p> Underlying security services instantiate and pass a
 * {@code TextOutputCallback} to the {@code handle}
 * method of a {@code CallbackHandler} to display information messages,
 * warning messages and error messages.
 *
 * @see javax.security.auth.callback.CallbackHandler
 */
