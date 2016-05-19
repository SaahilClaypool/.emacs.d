_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
    static final JTextComponent.KeyBinding[] defaultBindings = {

    /**
     * Default bindings all keymaps implementing the Motif feel.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
        public void paint(Graphics g) {

        /**
         * Renders the caret as a vertical line.  If this is reimplemented
         * the damage method should also be reimplemented as it assumes the
         * shape of the caret is a vertical line.  Does nothing if isVisible()
         * is false.  The caret color is derived from getCaretColor() if
         * the component has focus, else from getDisabledTextColor().
         *
         * @param g the graphics context
         * @see #damage
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
        protected void damage(Rectangle r) {

        /**
         * Damages the area surrounding the caret to cause
         * it to be repainted.  If paint() is reimplemented,
         * this method should also be reimplemented.
         *
         * @param r  the current location of the caret, does nothing if null
         * @see #paint
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
        public void focusLost(FocusEvent e) {

        /**
         * Called when the component containing the caret loses
         * focus.  This is implemented to set the caret to visibility
         * to false.
         *
         * @param e the focus event
         * @see FocusListener#focusLost
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
        public void focusGained(FocusEvent e) {

        /**
         * Called when the component containing the caret gains
         * focus.  This is implemented to repaint the component
         * so the focus rectangle will be re-rendered, as well
         * as providing the superclass behavior.
         *
         * @param e the focus event
         * @see FocusListener#focusGained
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
    public static class MotifCaret extends DefaultCaret implements UIResource {

    /**
     * The motif caret is rendered as an I beam.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases.  The current serialization support is appropriate
     * for short term storage or RMI between applications running the same
     * version of Swing.  A future release of Swing will provide support for
     * long term persistence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
    public static Caret createCaret() {

    /**
     * Creates the object to use for a caret for all of the Motif
     * text components.  The caret is rendered as an I-beam on Motif.
     *
     * @return the caret object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/motif/MotifTextUI.java
public class MotifTextUI {

/**
 * Provides the look and feel features that are common across
 * the Motif/CDE text LAF implementations.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 *
 * @author  Timothy Prinzing
 */
