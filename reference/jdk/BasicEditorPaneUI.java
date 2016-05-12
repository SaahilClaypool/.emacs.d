_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    private void updateFont(Font font) {

    /**
     * Update the font in the default style of the document.
     *
     * @param font the new font to use or null to remove the font attribute
     *             from the document's style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    private void updateForeground(Color color) {

    /**
     * Update the color in the default style of the document.
     *
     * @param color the new color to use or null to remove the color attribute
     *              from the document's style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    private static final String FONT_ATTRIBUTE_KEY = "FONT_ATTRIBUTE_KEY";

    /**
     * Attribute key to reference the default font.
     * used in javax.swing.text.StyleContext.getFont
     * to resolve the default font.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    protected void propertyChange(PropertyChangeEvent evt) {

    /**
     * This method gets called when a bound property is changed
     * on the associated JTextComponent.  This is a hook
     * which UI implementations may change to reflect how the
     * UI displays bound properties of JTextComponent subclasses.
     * This is implemented to rebuild the ActionMap based upon an
     * EditorKit change.
     *
     * @param evt the property change event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    ActionMap getActionMap() {

    /**
     * Fetch an action map to use.  The map for a JEditorPane
     * is not shared because it changes with the EditorKit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    public EditorKit getEditorKit(JTextComponent tc) {

    /**
     * Fetches the EditorKit for the UI.  This is whatever is
     * currently set in the associated JEditorPane.
     *
     * @return the editor capabilities
     * @see TextUI#getEditorKit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    public void uninstallUI(JComponent c) {

    /**
     *{@inheritDoc}
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    public void installUI(JComponent c) {

    /**
     *{@inheritDoc}
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    protected String getPropertyPrefix() {

    /**
     * Fetches the name used as a key to lookup properties through the
     * UIManager.  This is used as a prefix to all the standard
     * text properties.
     *
     * @return the name ("EditorPane")
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    public BasicEditorPaneUI() {

    /**
     * Creates a new BasicEditorPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for the JTextPane.
     *
     * @param c the JTextPane component
     * @return the UI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicEditorPaneUI.java
public class BasicEditorPaneUI extends BasicTextUI {

/**
 * Provides the look and feel for a JEditorPane.
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
 * @author  Timothy Prinzing
 */
