_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
    private void updateFont(Font font) {

    /**
     * Update the font in the default style of the document.
     *
     * @param font the new font to use or null to remove the font attribute
     *             from the document's style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
    private void updateForeground(Color color) {

    /**
     * Update the color in the default style of the document.
     *
     * @param color the new color to use or null to remove the color attribute
     *              from the document's style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
    @Override

    /**
     * This method gets called when a bound property is changed
     * on the associated JTextComponent.  This is a hook
     * which UI implementations may change to reflect how the
     * UI displays bound properties of JTextComponent subclasses.
     * If the font, foreground or document has changed, the
     * the appropriate property is set in the default style of
     * the document.
     *
     * @param evt the property change event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
    @Override

    /**
     * Installs the UI for a component.  This does the following
     * things.
     * <ol>
     * <li>
     * Sets opaqueness of the associated component according to its style,
     * if the opaque property has not already been set by the client program.
     * <li>
     * Installs the default caret and highlighter into the
     * associated component. These properties are only set if their
     * current value is either {@code null} or an instance of
     * {@link UIResource}.
     * <li>
     * Attaches to the editor and model.  If there is no
     * model, a default one is created.
     * <li>
     * Creates the view factory and the view hierarchy used
     * to represent the model.
     * </ol>
     *
     * @param c the editor component
     * @see javax.swing.plaf.basic.BasicTextUI#installUI
     * @see ComponentUI#installUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
    @Override

    /**
     * Fetches the name used as a key to lookup properties through the
     * UIManager.  This is used as a prefix to all the standard
     * text properties.
     *
     * @return the name ("TextPane")
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for the JTextPane.
     *
     * @param c the JTextPane object
     * @return the UI object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthTextPaneUI.java
public class SynthTextPaneUI extends SynthEditorPaneUI {

/**
 * Provides the look and feel for a styled text editor in the
 * Synth look and feel.
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
 * @author  Shannon Hickey
 * @since 1.7
 */
