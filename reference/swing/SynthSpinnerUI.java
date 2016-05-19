_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
        @Override public void focusLost(FocusEvent e) {

        /** Invoked when a editor text field loses the keyboard focus. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
        @Override public void focusGained(FocusEvent e) {

        /** Invoked when a editor text field gains the keyboard focus. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    private class EditorFocusHandler implements FocusListener{

    /** Listen to editor text field focus changes and repaint whole spinner */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    private static class SpinnerLayout implements LayoutManager, UIResource

    /**
     * A simple layout manager for the editor and the next/previous buttons.
     * See the SynthSpinnerUI javadoc for more information about exactly
     * how the components are arranged.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    protected void paint(SynthContext context, Graphics g) {

    /**
     * Paints the specified component. This implementation does nothing.
     *
     * @param context context for the component being painted
     * @param g the {@code Graphics} object used for painting
     * @see #update(Graphics,JComponent)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * Called by the <code>PropertyChangeListener</code> when the
     * <code>JSpinner</code> editor property changes.  It's the responsibility
     * of this method to remove the old editor and add the new one.  By
     * default this operation is just:
     * <pre>
     * spinner.remove(oldEditor);
     * spinner.add(newEditor, "Editor");
     * </pre>
     * The implementation of <code>replaceEditor</code> should be coordinated
     * with the <code>createEditor</code> method.
     *
     * @see #createEditor
     * @see #createPropertyChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * This method is called by installUI to get the editor component
     * of the <code>JSpinner</code>.  By default it just returns
     * <code>JSpinner.getEditor()</code>.  Subclasses can override
     * <code>createEditor</code> to return a component that contains
     * the spinner's editor or null, if they're going to handle adding
     * the editor to the <code>JSpinner</code> in an
     * <code>installUI</code> override.
     * <p>
     * Typically this method would be overridden to wrap the editor
     * with a container with a custom border, since one can't assume
     * that the editors border can be set directly.
     * <p>
     * The <code>replaceEditor</code> method is called when the spinners
     * editor is changed with <code>JSpinner.setEditor</code>.  If you've
     * overriden this method, then you'll probably want to override
     * <code>replaceEditor</code> as well.
     *
     * @return the JSpinners editor JComponent, spinner.getEditor() by default
     * @see #installUI
     * @see #replaceEditor
     * @see JSpinner#getEditor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * Sets the <code>JSpinner's</code> layout manager to null.  This
     * method is called by <code>uninstallUI</code>.
     *
     * @see #installDefaults
     * @see #uninstallUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * Initializes the <code>JSpinner</code> <code>border</code>,
     * <code>foreground</code>, and <code>background</code>, properties
     * based on the corresponding "Spinner.*" properties from defaults table.
     * The <code>JSpinners</code> layout is set to the value returned by
     * <code>createLayout</code>.  This method is called by <code>installUI</code>.
     *
     * @see #uninstallDefaults
     * @see #installUI
     * @see #createLayout
     * @see LookAndFeel#installBorder
     * @see LookAndFeel#installColors
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Returns a new instance of SynthSpinnerUI.
     *
     * @param c the JSpinner (not used)
     * @see ComponentUI#createUI
     * @return a new SynthSpinnerUI object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
    private EditorFocusHandler editorFocusHandler = new EditorFocusHandler();

    /**
     * A FocusListener implementation which causes the entire spinner to be
     * repainted whenever the editor component (typically a text field) becomes
     * focused, or loses focus. This is necessary because since SynthSpinnerUI
     * is composed of an editor and two buttons, it is necessary that all three
     * components indicate that they are "focused" so that they can be drawn
     * appropriately. The repaint is used to ensure that the buttons are drawn
     * in the new focused or unfocused state, mirroring that of the editor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSpinnerUI.java
public class SynthSpinnerUI extends BasicSpinnerUI

/**
 * Provides the Synth L&amp;F UI delegate for
 * {@link javax.swing.JSpinner}.
 *
 * @author Hans Muller
 * @author Joshua Outwater
 * @since 1.7
 */
