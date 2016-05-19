_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultSwatchChooserPanel.java
    public void installChooserPanel(JColorChooser enclosingChooser) {

    /**
     * The background color, foreground color, and font are already set to the
     * defaults from the defaults table before this method is called.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultSwatchChooserPanel.java
    public int getDisplayedMnemonicIndex() {

    /**
     * Provides a hint to the look and feel as to the index of the character in
     * <code>getDisplayName</code> that should be visually identified as the
     * mnemonic. The look and feel should only use this if
     * <code>getMnemonic</code> returns a value > 0.
     * <p>
     * The return value here is a hint, it is ultimately up to the look
     * and feel to honor the return value in some meaningful way. For example,
     * a look and feel may wish to render each
     * <code>AbstractColorChooserPanel</code> in a <code>JTabbedPane</code>,
     * and further use this return value to underline a character in
     * the <code>getDisplayName</code>.
     * <p>
     * This implementation looks up the value from the default
     * <code>ColorChooser.rgbDisplayedMnemonicIndex</code>, or if it
     * isn't available (or not an <code>Integer</code>) returns -1.
     * The lookup for the default is done through the <code>UIManager</code>:
     * <code>UIManager.get("ColorChooser.swatchesDisplayedMnemonicIndex");</code>.
     *
     * @return Character index to render mnemonic for; -1 to provide no
     *                   visual identifier for this panel.
     * @see #getMnemonic
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultSwatchChooserPanel.java
    public int getMnemonic() {

    /**
     * Provides a hint to the look and feel as to the
     * <code>KeyEvent.VK</code> constant that can be used as a mnemonic to
     * access the panel. A return value <= 0 indicates there is no mnemonic.
     * <p>
     * The return value here is a hint, it is ultimately up to the look
     * and feel to honor the return value in some meaningful way.
     * <p>
     * This implementation looks up the value from the default
     * <code>ColorChooser.swatchesMnemonic</code>, or if it
     * isn't available (or not an <code>Integer</code>) returns -1.
     * The lookup for the default is done through the <code>UIManager</code>:
     * <code>UIManager.get("ColorChooser.swatchesMnemonic");</code>.
     *
     * @return KeyEvent.VK constant identifying the mnemonic; <= 0 for no
     *         mnemonic
     * @see #getDisplayedMnemonicIndex
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultSwatchChooserPanel.java
class DefaultSwatchChooserPanel extends AbstractColorChooserPanel {

/**
 * The standard color swatch chooser.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Steve Wilson
 */
