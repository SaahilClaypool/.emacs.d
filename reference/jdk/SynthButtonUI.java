_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    protected Icon getSizingIcon(AbstractButton b) {

    /**
     * Returns the Icon used in calculating the
     * preferred/minimum/maximum size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    private int getTextShiftOffset(SynthContext state) {

    /**
     * Returns the amount to shift the text/icon when painting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    private Icon getIcon(AbstractButton b, Icon specificIcon, Icon defaultIcon,
            int state) {

    /**
     * This method will return the icon that should be used for a button.  We
     * only want to use the synth icon defined by the style if the specific
     * icon has not been defined for the button state and the backup icon is a
     * UIResource (we set it, not the developer).
     *
     * @param b button
     * @param specificIcon icon returned from the button for the specific state
     * @param defaultIcon fallback icon
     * @param state the synth state of the button
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    protected Icon getIcon(AbstractButton b) {

    /**
     * Returns the Icon to use for painting the button. The icon is chosen with
     * respect to the current state of the button.
     *
     * @param b button the icon is associated with
     * @return an icon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    protected Icon getDefaultIcon(AbstractButton b) {

    /**
     * Returns the default icon. This should not callback
     * to the JComponent.
     *
     * @param b button the icon is associated with
     * @return default icon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    private int getComponentState(JComponent c) {

    /**
     * Returns the current state of the passed in <code>AbstractButton</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a new UI object for the given component.
     *
     * @param c component to create UI object for
     * @return the UI object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthButtonUI.java
public class SynthButtonUI extends BasicButtonUI implements

/**
 * Provides the Synth L&amp;F UI delegate for
 * {@link javax.swing.JButton}.
 *
 * @author Scott Violet
 * @since 1.7
 */
