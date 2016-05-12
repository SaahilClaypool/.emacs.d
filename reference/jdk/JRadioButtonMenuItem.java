_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    protected class AccessibleJRadioButtonMenuItem extends AccessibleJMenuItem {

    /**
     * This class implements accessibility support for the
     * <code>JRadioButtonMenuItem</code> class.  It provides an
     * implementation of the Java Accessibility API appropriate to
     * <code>JRadioButtonMenuItem</code> user-interface elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JRadioButtonMenuItem.
     * For JRadioButtonMenuItems, the AccessibleContext takes the form of an
     * AccessibleJRadioButtonMenuItem.
     * A new AccessibleJRadioButtonMenuItem instance is created if necessary.
     *
     * @return an AccessibleJRadioButtonMenuItem that serves as the
     *         AccessibleContext of this JRadioButtonMenuItem
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    boolean shouldUpdateSelectedStateFromAction() {

    /**
     * Overriden to return true, JRadioButtonMenuItem supports
     * the selected state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    protected String paramString() {

    /**
     * Returns a string representation of this
     * <code>JRadioButtonMenuItem</code>.  This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this
     *          <code>JRadioButtonMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "RadioButtonMenuItemUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem(String text, Icon icon, boolean selected) {

    /**
     * Creates a radio button menu item that has the specified
     * text, image, and selection state.  All other constructors
     * defer to this one.
     *
     * @param text  the string displayed on the radio button
     * @param icon  the image that the button should display
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem(Icon icon, boolean selected) {

    /**
     * Creates a radio button menu item with the specified image
     * and selection state, but no text.
     *
     * @param icon  the image that the button should display
     * @param selected  if true, the button is initially selected;
     *                  otherwise, the button is initially unselected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem(String text, boolean selected) {

    /**
     * Creates a radio button menu item with the specified text
     * and selection state.
     *
     * @param text the text of the <code>CheckBoxMenuItem</code>
     * @param selected the selected state of the <code>CheckBoxMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem(String text, Icon icon) {

    /**
     * Creates a radio button menu item with the specified text
     * and <code>Icon</code>.
     *
     * @param text the text of the <code>JRadioButtonMenuItem</code>
     * @param icon the icon to display on the <code>JRadioButtonMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem(Action a) {

    /**
     * Creates a radio button menu item whose properties are taken from the
     * <code>Action</code> supplied.
     *
     * @param  a the <code>Action</code> on which to base the radio
     *          button menu item
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem(String text) {

    /**
     * Creates a <code>JRadioButtonMenuItem</code> with text.
     *
     * @param text the text of the <code>JRadioButtonMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem(Icon icon) {

    /**
     * Creates a <code>JRadioButtonMenuItem</code> with an icon.
     *
     * @param icon the <code>Icon</code> to display on the
     *          <code>JRadioButtonMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
    public JRadioButtonMenuItem() {

    /**
     * Creates a <code>JRadioButtonMenuItem</code> with no set text or icon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JRadioButtonMenuItem.java
public class JRadioButtonMenuItem extends JMenuItem implements Accessible {

/**
 * An implementation of a radio button menu item.
 * A <code>JRadioButtonMenuItem</code> is
 * a menu item that is part of a group of menu items in which only one
 * item in the group can be selected. The selected item displays its
 * selected state. Selecting it causes any other selected item to
 * switch to the unselected state.
 * To control the selected state of a group of radio button menu items,
 * use a <code>ButtonGroup</code> object.
 * <p>
 * Menu items can be configured, and to some degree controlled, by
 * <code><a href="Action.html">Action</a></code>s.  Using an
 * <code>Action</code> with a menu item has many benefits beyond directly
 * configuring a menu item.  Refer to <a href="Action.html#buttonActions">
 * Swing Components Supporting <code>Action</code></a> for more
 * details, and you can find more information in <a
 * href="https://docs.oracle.com/javase/tutorial/uiswing/misc/action.html">How
 * to Use Actions</a>, a section in <em>The Java Tutorial</em>.
 * <p>
 * For further documentation and examples see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html">How to Use Menus</a>,
 * a section in <em>The Java Tutorial.</em>
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
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
 * @beaninfo
 *   attribute: isContainer false
 * description: A component within a group of menu items which can be selected.
 *
 * @author Georges Saab
 * @author David Karlton
 * @see ButtonGroup
 */
