_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        public void propertyChange(PropertyChangeEvent evt) {

        /**
         * Called when the combos editor changes
         *
         * @param evt A PropertyChangeEvent object describing the event source and
         *            the property that has changed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        public void focusLost(FocusEvent e) {

        /** Invoked when a component loses the keyboard focus. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        public void focusGained(FocusEvent e) {

        /** Invoked when a component gains the keyboard focus. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private static class EditorFocusHandler implements FocusListener,

    /**
     * Handler for repainting combo when editor component gains/looses focus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        @Override

        /**
         * @inheritDoc
         *
         * Ensures that the combo box is repainted when the popup is closed.
         * This avoids a bug where clicking off the combo wasn't causing a repaint,
         * and thus the combo box still looked pressed even when it was not.
         *
         * This bug was only noticed when acting as a button, but may be generally
         * present. If so, remove the if() block
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        @Override

        /**
         * @inheritDoc
         *
         * Forwards rollover states to the internal "over" field
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        @Override

        /**
         * @inheritDoc
         *
         * Forwards pressed states to the internal "pressed" field
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        @Override

        /**
         * @inheritDoc
         *
         * Ensures that isRollover() will return true if the combo is
         * rolled over, or the arrowButton is rolled over.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        @Override

        /**
         * @inheritDoc
         *
         * Ensures that the armed state is in sync with the pressed state
         * if shouldActLikeButton is true. Without this method, the arrow
         * button will not look pressed when the popup is open, regardless
         * of the result of isPressed() alone.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        @Override

        /**
         * @inheritDoc
         *
         * Ensures that isPressed() will return true if the combo is pressed,
         * or the arrowButton is pressed, <em>or</em> if the combo popup is
         * visible. This is the case because a combo box looks pressed when
         * the popup is visible, and so should the arrow button.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        private void updateOver(boolean o) {

        /**
         * <p>Updates the internal "over" state. If shouldActLikeButton()
         * is true, and if this method call will change the internal state,
         * then the combo and button will be repainted.</p>
         *
         * <p>Note that this method is called either when a mouseover/mouseoff event
         * occurs on the combo box, or on the arrow button.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        private void updatePressed(boolean p) {

        /**
         * <p>Updates the internal "pressed" state. If shouldActLikeButton()
         * is true, and if this method call will change the internal state,
         * then the combo and button will be repainted.</p>
         *
         * <p>Note that this method is called either when a press event
         * occurs on the combo box, or on the arrow button.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
        private boolean over;

        /**
         * Indicates that the mouse is over the combo or the arrow button.
         * This field only has meaning if buttonWhenNotEnabled is true.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private final class ButtonHandler extends DefaultButtonModel

    /**
     * Handles all the logic for treating the combo as a button when it is
     * not editable, and when shouldActLikeButton() is true. This class is a
     * special ButtonModel, and installed on the arrowButton when appropriate.
     * It also is installed as a mouse listener and mouse motion listener on
     * the combo box. In this way, the state between the button and combo
     * are in sync. Whenever one is "over" both are. Whenever one is pressed,
     * both are.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private class SynthComboBoxRenderer extends JLabel implements ListCellRenderer<Object>, UIResource {

    /**
     * From BasicComboBoxRenderer v 1.18.
     *
     * Be aware that SynthFileChooserUIImpl relies on the fact that the default
     * renderer installed on a Synth combo box is a JLabel. If this is changed,
     * then an assert will fail in SynthFileChooserUIImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * Returns the default size of an empty display area of the combo box using
     * the current renderer and font.
     *
     * This method was overridden to use SynthComboBoxRenderer instead of
     * DefaultListCellRenderer as the default renderer when calculating the
     * size of the combo box. This is used in the case of the combo not having
     * any data.
     *
     * @return the size of an empty display area
     * @see #getDisplaySize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private boolean shouldActLikeButton() {

    /**
     * @return true if this combo box should act as one big button. Typically
     * only happens when buttonWhenNotEditable is true, and comboBox.isEditable
     * is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * Paints the currently selected item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    protected void paint(SynthContext context, Graphics g) {

    /**
     * Paints the specified component.
     *
     * @param context context for the component being painted
     * @param g the {@code Graphics} object used for painting
     * @see #update(Graphics,JComponent)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * Paints the specified component according to the Look and Feel.
     * <p>This method is not used by Synth Look and Feel.
     * Painting is handled by the {@link #paint(SynthContext,Graphics)} method.
     *
     * @param g the {@code Graphics} object used for painting
     * @param c the component being painted
     * @see #paint(SynthContext,Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * Notifies this UI delegate to repaint the specified component.
     * This method paints the component background, then calls
     * the {@link #paint(SynthContext,Graphics)} method.
     *
     * <p>In general, this method does not need to be overridden by subclasses.
     * All Look and Feel rendering code should reside in the {@code paint} method.
     *
     * @param g the {@code Graphics} object used for painting
     * @param c the component being painted
     * @see #paint(SynthContext,Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    @Override

    /**
     * {@inheritDoc}
     *
     * Overridden to ensure that ButtonHandler is created prior to any of
     * the other installXXX methods, since several of them reference
     * buttonHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a new UI object for the given component.
     *
     * @param c component to create UI object for
     * @return the UI object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private boolean forceOpaque = false;

    /**
     * If true, then the cell renderer will be forced to be non-opaque when
     * used for rendering the selected item in the combo box (not in the list),
     * and forced to opaque after rendering the selected value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private EditorFocusHandler editorFocusHandler;

    /**
     * Handler for repainting combo when editor component gains/looses focus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private ButtonHandler buttonHandler;

    /**
     * When buttonWhenNotEditable is true, this field is used to help make
     * the combo box appear and function as a button when the combo box is
     * not editable. In such a state, you can click anywhere on the button
     * to get it to open the popup. Also, anywhere you hover over the combo
     * will cause the entire combo to go into "rollover" state, and anywhere
     * you press will go into "pressed" state. This also keeps in sync the
     * state of the combo and the arrowButton.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private boolean pressedWhenPopupVisible;

    /**
     * A flag to indicate that the combo box and combo box button should
     * remain in the PRESSED state while the combo popup is visible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    private boolean buttonWhenNotEditable;

    /**
     * This flag may be set via UIDefaults. By default, it is false, to
     * preserve backwards compatibility. If true, then the combo will
     * "act as a button" when it is not editable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
    Insets popupInsets;

    /**
     * Used to adjust the location and size of the popup. Very useful for
     * situations such as we find in Nimbus where part of the border is used
     * to paint the focus. In such cases, the border is empty space, and not
     * part of the "visual" border, and in these cases, you'd like the popup
     * to be adjusted such that it looks as if it were next to the visual border.
     * You may want to use negative insets to get the right look.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthComboBoxUI.java
public class SynthComboBoxUI extends BasicComboBoxUI implements

/**
 * Provides the Synth L&amp;F UI delegate for
 * {@link javax.swing.JComboBox}.
 *
 * @author Scott Violet
 * @since 1.7
 */
