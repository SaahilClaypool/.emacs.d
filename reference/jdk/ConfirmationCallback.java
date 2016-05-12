_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public int getSelectedIndex() {

    /**
     * Get the selected confirmation option.
     *
     * <p>
     *
     * @return the selected confirmation option represented as
     *          {@code YES}, {@code NO}, {@code OK} or
     *          {@code CANCEL} if an {@code optionType}
     *          was specified to the constructor of this
     *          {@code ConfirmationCallback}.
     *          Otherwise, this method returns the selected confirmation
     *          option as an index into the
     *          {@code options} array specified to the constructor
     *          of this {@code ConfirmationCallback}.
     *
     * @see #setSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public void setSelectedIndex(int selection) {

    /**
     * Set the selected confirmation option.
     *
     * <p>
     *
     * @param selection the selection represented as {@code YES},
     *          {@code NO}, {@code OK} or {@code CANCEL}
     *          if an {@code optionType} was specified to the constructor
     *          of this {@code ConfirmationCallback}.
     *          Otherwise, the selection represents the index into the
     *          {@code options} array specified to the constructor
     *          of this {@code ConfirmationCallback}.
     *
     * @see #getSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public int getDefaultOption() {

    /**
     * Get the default option.
     *
     * <p>
     *
     * @return the default option, represented as
     *          {@code YES}, {@code NO}, {@code OK} or
     *          {@code CANCEL} if an {@code optionType}
     *          was specified to the constructor of this
     *          {@code ConfirmationCallback}.
     *          Otherwise, this method returns the default option as
     *          an index into the
     *          {@code options} array specified to the constructor
     *          of this {@code ConfirmationCallback}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public String[] getOptions() {

    /**
     * Get the confirmation options.
     *
     * <p>
     *
     * @return the list of confirmation options, or null if this
     *          {@code ConfirmationCallback} was instantiated with
     *          an {@code optionType} instead of {@code options}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public int getOptionType() {

    /**
     * Get the option type.
     *
     * <p> If this method returns {@code UNSPECIFIED_OPTION}, then this
     * {@code ConfirmationCallback} was instantiated with
     * {@code options} instead of an {@code optionType}.
     * In this case, invoke the {@code getOptions} method
     * to determine which confirmation options to display.
     *
     * <p>
     *
     * @return the option type ({@code YES_NO_OPTION},
     *          {@code YES_NO_CANCEL_OPTION} or
     *          {@code OK_CANCEL_OPTION}), or
     *          {@code UNSPECIFIED_OPTION} if this
     *          {@code ConfirmationCallback} was instantiated with
     *          {@code options} instead of an {@code optionType}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public int getMessageType() {

    /**
     * Get the message type.
     *
     * <p>
     *
     * @return the message type ({@code INFORMATION},
     *          {@code WARNING} or {@code ERROR}).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public String getPrompt() {

    /**
     * Get the prompt.
     *
     * <p>
     *
     * @return the prompt, or null if this {@code ConfirmationCallback}
     *          was instantiated without a {@code prompt}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public ConfirmationCallback(String prompt, int messageType,
                String[] options, int defaultOption) {

    /**
     * Construct a {@code ConfirmationCallback} with a prompt,
     * message type, a list of options and a default option.
     *
     * <p> Underlying security services use this constructor if
     * they require a confirmation different from the available preset
     * confirmations provided (for example, CONTINUE/ABORT or STOP/GO).
     * The confirmation options are listed in the {@code options} array,
     * and are displayed by the {@code CallbackHandler} implementation
     * in a manner consistent with the way preset options are displayed.
     *
     * <p>
     *
     * @param prompt the prompt used to describe the list of options. <p>
     *
     * @param messageType the message type ({@code INFORMATION},
     *                  {@code WARNING} or {@code ERROR}). <p>
     *
     * @param options the list of confirmation options. <p>
     *
     * @param defaultOption the default option, represented as an index
     *                  into the {@code options} array.
     *
     * @exception IllegalArgumentException if {@code prompt} is null,
     *                  if {@code prompt} has a length of 0,
     *                  if messageType is not either
     *                  {@code INFORMATION}, {@code WARNING},
     *                  or {@code ERROR}, if {@code options} is null,
     *                  if {@code options} has a length of 0,
     *                  if any element from {@code options} is null,
     *                  if any element from {@code options}
     *                  has a length of 0, or if {@code defaultOption}
     *                  does not lie within the array boundaries of
     *                  {@code options}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public ConfirmationCallback(String prompt, int messageType,
                int optionType, int defaultOption) {

    /**
     * Construct a {@code ConfirmationCallback} with a prompt,
     * message type, an option type and a default option.
     *
     * <p> Underlying security services use this constructor if
     * they require either a YES/NO, YES/NO/CANCEL or OK/CANCEL
     * confirmation.
     *
     * <p>
     *
     * @param prompt the prompt used to describe the list of options. <p>
     *
     * @param messageType the message type ({@code INFORMATION},
     *                  {@code WARNING} or {@code ERROR}). <p>
     *
     * @param optionType the option type ({@code YES_NO_OPTION},
     *                  {@code YES_NO_CANCEL_OPTION} or
     *                  {@code OK_CANCEL_OPTION}). <p>
     *
     * @param defaultOption the default option
     *                  from the provided optionType ({@code YES},
     *                  {@code NO}, {@code CANCEL} or
     *                  {@code OK}).
     *
     * @exception IllegalArgumentException if {@code prompt} is null,
     *                  if {@code prompt} has a length of 0,
     *                  if messageType is not either
     *                  {@code INFORMATION}, {@code WARNING},
     *                  or {@code ERROR}, if optionType is not either
     *                  {@code YES_NO_OPTION},
     *                  {@code YES_NO_CANCEL_OPTION}, or
     *                  {@code OK_CANCEL_OPTION},
     *                  or if {@code defaultOption}
     *                  does not correspond to one of the options in
     *                  {@code optionType}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public ConfirmationCallback(int messageType,
                String[] options, int defaultOption) {

    /**
     * Construct a {@code ConfirmationCallback} with a
     * message type, a list of options and a default option.
     *
     * <p> Underlying security services use this constructor if
     * they require a confirmation different from the available preset
     * confirmations provided (for example, CONTINUE/ABORT or STOP/GO).
     * The confirmation options are listed in the {@code options} array,
     * and are displayed by the {@code CallbackHandler} implementation
     * in a manner consistent with the way preset options are displayed.
     *
     * <p>
     *
     * @param messageType the message type ({@code INFORMATION},
     *                  {@code WARNING} or {@code ERROR}). <p>
     *
     * @param options the list of confirmation options. <p>
     *
     * @param defaultOption the default option, represented as an index
     *                  into the {@code options} array.
     *
     * @exception IllegalArgumentException if messageType is not either
     *                  {@code INFORMATION}, {@code WARNING},
     *                  or {@code ERROR}, if {@code options} is null,
     *                  if {@code options} has a length of 0,
     *                  if any element from {@code options} is null,
     *                  if any element from {@code options}
     *                  has a length of 0, or if {@code defaultOption}
     *                  does not lie within the array boundaries of
     *                  {@code options}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public ConfirmationCallback(int messageType,
                int optionType, int defaultOption) {

    /**
     * Construct a {@code ConfirmationCallback} with a
     * message type, an option type and a default option.
     *
     * <p> Underlying security services use this constructor if
     * they require either a YES/NO, YES/NO/CANCEL or OK/CANCEL
     * confirmation.
     *
     * <p>
     *
     * @param messageType the message type ({@code INFORMATION},
     *                  {@code WARNING} or {@code ERROR}). <p>
     *
     * @param optionType the option type ({@code YES_NO_OPTION},
     *                  {@code YES_NO_CANCEL_OPTION} or
     *                  {@code OK_CANCEL_OPTION}). <p>
     *
     * @param defaultOption the default option
     *                  from the provided optionType ({@code YES},
     *                  {@code NO}, {@code CANCEL} or
     *                  {@code OK}).
     *
     * @exception IllegalArgumentException if messageType is not either
     *                  {@code INFORMATION}, {@code WARNING},
     *                  or {@code ERROR}, if optionType is not either
     *                  {@code YES_NO_OPTION},
     *                  {@code YES_NO_CANCEL_OPTION}, or
     *                  {@code OK_CANCEL_OPTION},
     *                  or if {@code defaultOption}
     *                  does not correspond to one of the options in
     *                  {@code optionType}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    private int selection;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    private int defaultOption;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    private int messageType;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int ERROR                       = 2;

    /** ERROR message type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int WARNING                     = 1;

    /** WARNING message type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int INFORMATION                 = 0;

    /** INFORMATION message type.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int OK                          = 3;

    /**
     * OK option.
     *
     * <p> If an {@code optionType} was specified to this
     * {@code ConfirmationCallback}, this option may be specified as a
     * {@code defaultOption} or returned as the selected index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int CANCEL                      = 2;

    /**
     * CANCEL option.
     *
     * <p> If an {@code optionType} was specified to this
     * {@code ConfirmationCallback}, this option may be specified as a
     * {@code defaultOption} or returned as the selected index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int NO                          = 1;

    /**
     * NO option.
     *
     * <p> If an {@code optionType} was specified to this
     * {@code ConfirmationCallback}, this option may be specified as a
     * {@code defaultOption} or returned as the selected index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int YES                         = 0;

    /**
     * YES option.
     *
     * <p> If an {@code optionType} was specified to this
     * {@code ConfirmationCallback}, this option may be specified as a
     * {@code defaultOption} or returned as the selected index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int OK_CANCEL_OPTION            = 2;

    /**
     * OK/CANCEL confirmation confirmation option.
     *
     * <p> An underlying security service specifies this as the
     * {@code optionType} to a {@code ConfirmationCallback}
     * constructor if it requires a confirmation which can be answered
     * with either {@code OK} or {@code CANCEL}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int YES_NO_CANCEL_OPTION        = 1;

    /**
     * YES/NO/CANCEL confirmation confirmation option.
     *
     * <p> An underlying security service specifies this as the
     * {@code optionType} to a {@code ConfirmationCallback}
     * constructor if it requires a confirmation which can be answered
     * with either {@code YES}, {@code NO} or {@code CANCEL}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int YES_NO_OPTION               = 0;

    /**
     * YES/NO confirmation option.
     *
     * <p> An underlying security service specifies this as the
     * {@code optionType} to a {@code ConfirmationCallback}
     * constructor if it requires a confirmation which can be answered
     * with either {@code YES} or {@code NO}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
    public static final int UNSPECIFIED_OPTION          = -1;

    /**
     * Unspecified option type.
     *
     * <p> The {@code getOptionType} method returns this
     * value if this {@code ConfirmationCallback} was instantiated
     * with {@code options} instead of an {@code optionType}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ConfirmationCallback.java
public class ConfirmationCallback implements Callback, java.io.Serializable {

/**
 * <p> Underlying security services instantiate and pass a
 * {@code ConfirmationCallback} to the {@code handle}
 * method of a {@code CallbackHandler} to ask for YES/NO,
 * OK/CANCEL, YES/NO/CANCEL or other similar confirmations.
 *
 * @see javax.security.auth.callback.CallbackHandler
 */
