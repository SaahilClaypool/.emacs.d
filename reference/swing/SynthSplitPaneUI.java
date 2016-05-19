_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * Creates the default divider.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * Uninstalls the event listeners from the UI.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * Uninstalls the UI defaults.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * Installs the event listeners for the UI.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    @Override

    /**
     * Installs the UI defaults.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    public static ComponentUI createUI(JComponent x) {

    /**
     * Creates a new SynthSplitPaneUI instance
     *
     * @param x component to create UI object for
     * @return the UI object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    private SynthStyle dividerStyle;

    /**
     * Style for the divider.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    private SynthStyle style;

    /**
     * Style for the JSplitPane.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    private static Set<KeyStroke> managingFocusBackwardTraversalKeys;

    /**
     * Keys to use for backward focus traversal when the JComponent is
     * managing focus.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
    private static Set<KeyStroke> managingFocusForwardTraversalKeys;

    /**
     * Keys to use for forward focus traversal when the JComponent is
     * managing focus.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthSplitPaneUI.java
public class SynthSplitPaneUI extends BasicSplitPaneUI

/**
 * Provides the Synth L&amp;F UI delegate for
 * {@link javax.swing.JSplitPane}.
 *
 * @author Scott Violet
 * @since 1.7
 */
