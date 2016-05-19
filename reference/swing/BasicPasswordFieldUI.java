_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicPasswordFieldUI.java
    ActionMap createActionMap() {

    /**
     * Create the action map for Password Field.  This map provides
     * same actions for double mouse click and
     * and for triple mouse click (see bug 4231444).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicPasswordFieldUI.java
    public View create(Element elem) {

    /**
     * Creates a view (PasswordView) for an element.
     *
     * @param elem the element
     * @return the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicPasswordFieldUI.java
    protected void installDefaults() {

    /**
     * Installs the necessary properties on the JPasswordField.
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicPasswordFieldUI.java
    protected String getPropertyPrefix() {

    /**
     * Fetches the name used as a key to look up properties through the
     * UIManager.  This is used as a prefix to all the standard
     * text properties.
     *
     * @return the name ("PasswordField")
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicPasswordFieldUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for a JPasswordField.
     *
     * @param c the JPasswordField
     * @return the UI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicPasswordFieldUI.java
public class BasicPasswordFieldUI extends BasicTextFieldUI {

/**
 * Provides the Windows look and feel for a password field.
 * The only difference from the standard text field is that
 * the view of the text is simply a string of the echo
 * character as specified in JPasswordField, rather than the
 * real text contained in the field.
 *
 * @author  Timothy Prinzing
 */
