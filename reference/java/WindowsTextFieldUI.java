_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsTextFieldUI.java
        protected Highlighter.HighlightPainter getSelectionPainter() {

        /**
         * Gets the painter for the Highlighter.
         *
         * @return the painter
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsTextFieldUI.java
        protected void adjustVisibility(Rectangle r) {

        /**
         * Adjusts the visibility of the caret according to
         * the windows feel which seems to be to move the
         * caret out into the field by about a quarter of
         * a field length if not visible.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsTextFieldUI.java
    static class WindowsFieldCaret extends DefaultCaret implements UIResource {

    /**
     * WindowsFieldCaret has different scrolling behavior than
     * DefaultCaret.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsTextFieldUI.java
    protected Caret createCaret() {

    /**
     * Creates the caret for a field.
     *
     * @return the caret
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsTextFieldUI.java
    protected void paintBackground(Graphics g) {

    /**
     * Paints a background for the view.  This will only be
     * called if isOpaque() on the associated component is
     * true.  The default is to paint the background color
     * of the component.
     *
     * @param g the graphics context
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsTextFieldUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for a JTextField.
     *
     * @param c the text field
     * @return the UI
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/WindowsTextFieldUI.java
public class WindowsTextFieldUI extends BasicTextFieldUI

/**
 * Provides the Windows look and feel for a text field.  This
 * is basically the following customizations to the default
 * look-and-feel.
 * <ul>
 * <li>The border is beveled (using the standard control color).
 * <li>The background is white by default.
 * <li>The highlight color is a dark color, blue by default.
 * <li>The foreground color is high contrast in the selected
 *  area, white by default.  The unselected foreground is black.
 * <li>The cursor blinks at about 1/2 second intervals.
 * <li>The entire value is selected when focus is gained.
 * <li>Shift-left-arrow and shift-right-arrow extend selection
 * <li>Ctrl-left-arrow and ctrl-right-arrow act like home and
 *   end respectively.
 * </ul>
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
