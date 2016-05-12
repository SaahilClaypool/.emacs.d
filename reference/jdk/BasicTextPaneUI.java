_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextPaneUI.java
    protected void propertyChange(PropertyChangeEvent evt) {

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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextPaneUI.java
    protected String getPropertyPrefix() {

    /**
     * Fetches the name used as a key to lookup properties through the
     * UIManager.  This is used as a prefix to all the standard
     * text properties.
     *
     * @return the name ("TextPane")
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextPaneUI.java
    public BasicTextPaneUI() {

    /**
     * Creates a new BasicTextPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextPaneUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for the JTextPane.
     *
     * @param c the JTextPane object
     * @return the UI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextPaneUI.java
public class BasicTextPaneUI extends BasicEditorPaneUI {

/**
 * Provides the look and feel for a styled text editor.
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
