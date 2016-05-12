_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    public int[] getSelectedIndexes() {

    /**
     * Get the selected choices.
     *
     * <p>
     *
     * @return the selected choices, represented as indexes into the
     *          {@code choices} list.
     *
     * @see #setSelectedIndexes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    public void setSelectedIndexes(int[] selections) {

    /**
     * Set the selected choices.
     *
     * <p>
     *
     * @param selections the selections represented as indexes into the
     *          {@code choices} list.
     *
     * @exception UnsupportedOperationException if multiple selections are
     *          not allowed, as determined by
     *          {@code allowMultipleSelections}.
     *
     * @see #getSelectedIndexes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    public void setSelectedIndex(int selection) {

    /**
     * Set the selected choice.
     *
     * <p>
     *
     * @param selection the selection represented as an index into the
     *          {@code choices} list.
     *
     * @see #getSelectedIndexes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    public boolean allowMultipleSelections() {

    /**
     * Get the boolean determining whether multiple selections from
     * the {@code choices} list are allowed.
     *
     * <p>
     *
     * @return whether multiple selections are allowed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    public int getDefaultChoice() {

    /**
     * Get the defaultChoice.
     *
     * <p>
     *
     * @return the defaultChoice, represented as an index into
     *          the {@code choices} list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    public String[] getChoices() {

    /**
     * Get the list of choices.
     *
     * <p>
     *
     * @return the list of choices.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    public ChoiceCallback(String prompt, String[] choices,
                int defaultChoice, boolean multipleSelectionsAllowed) {

    /**
     * Construct a {@code ChoiceCallback} with a prompt,
     * a list of choices, a default choice, and a boolean specifying
     * whether or not multiple selections from the list of choices are allowed.
     *
     * <p>
     *
     * @param prompt the prompt used to describe the list of choices. <p>
     *
     * @param choices the list of choices. <p>
     *
     * @param defaultChoice the choice to be used as the default choice
     *                  when the list of choices are displayed.  This value
     *                  is represented as an index into the
     *                  {@code choices} array. <p>
     *
     * @param multipleSelectionsAllowed boolean specifying whether or
     *                  not multiple selections can be made from the
     *                  list of choices.
     *
     * @exception IllegalArgumentException if {@code prompt} is null,
     *                  if {@code prompt} has a length of 0,
     *                  if {@code choices} is null,
     *                  if {@code choices} has a length of 0,
     *                  if any element from {@code choices} is null,
     *                  if any element from {@code choices}
     *                  has a length of 0 or if {@code defaultChoice}
     *                  does not fall within the array boundaries of
     *                  {@code choices}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    private int[] selections;

    /**
     * @serial the selected choices, represented as indexes into the
     *          {@code choices} list.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    private int defaultChoice;

    /**
     * @serial the choice to be used as the default choice
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
    private String prompt;

    /**
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/security/auth/callback/ChoiceCallback.java
public class ChoiceCallback implements Callback, java.io.Serializable {

/**
 * <p> Underlying security services instantiate and pass a
 * {@code ChoiceCallback} to the {@code handle}
 * method of a {@code CallbackHandler} to display a list of choices
 * and to retrieve the selected choice(s).
 *
 * @see javax.security.auth.callback.CallbackHandler
 */
