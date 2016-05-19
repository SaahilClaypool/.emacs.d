_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    protected class AccessibleJCheckBoxMenuItem extends AccessibleJMenuItem {

    /**
     * This class implements accessibility support for the
     * <code>JCheckBoxMenuItem</code> class.  It provides an implementation
     * of the Java Accessibility API appropriate to checkbox menu item
     * user-interface elements.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    boolean shouldUpdateSelectedStateFromAction() {

    /**
     * Overriden to return true, JCheckBoxMenuItem supports
     * the selected state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    protected String paramString() {

    /**
     * Returns a string representation of this JCheckBoxMenuItem. This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this JCheckBoxMenuItem.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See readObject() and writeObject() in JComponent for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public Object[] getSelectedObjects() {

    /**
     * Returns an array (length 1) containing the check box menu item
     * label or null if the check box is not selected.
     *
     * @return an array containing one Object -- the text of the menu item
     *         -- if the item is selected; otherwise null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public synchronized void setState(boolean b) {

    /**
     * Sets the selected-state of the item. This method
     * exists for AWT compatibility only.  New code should
     * use setSelected() instead.
     *
     * @param b  a boolean value indicating the item's
     *           selected-state, where true=selected
     * @beaninfo
     * description: The selection state of the check box menu item
     *      hidden: true
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public boolean getState() {

     /**
      * Returns the selected-state of the item. This method
      * exists for AWT compatibility only.  New code should
      * use isSelected() instead.
      *
      * @return true  if the item is selected
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class
     * that renders this component.
     *
     * @return "CheckBoxMenuItemUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public JCheckBoxMenuItem(String text, Icon icon, boolean b) {

    /**
     * Creates a check box menu item with the specified text, icon, and selection state.
     *
     * @param text the text of the check box menu item
     * @param icon the icon of the check box menu item
     * @param b the selected state of the check box menu item
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public JCheckBoxMenuItem(String text, boolean b) {

    /**
     * Creates a check box menu item with the specified text and selection state.
     *
     * @param text the text of the check box menu item.
     * @param b the selected state of the check box menu item
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public JCheckBoxMenuItem(String text, Icon icon) {

    /**
     * Creates an initially unselected check box menu item with the specified text and icon.
     *
     * @param text the text of the CheckBoxMenuItem
     * @param icon the icon of the CheckBoxMenuItem
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public JCheckBoxMenuItem(Action a) {

    /**
     * Creates a menu item whose properties are taken from the
     * Action supplied.
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public JCheckBoxMenuItem(String text) {

    /**
     * Creates an initially unselected check box menu item with text.
     *
     * @param text the text of the CheckBoxMenuItem
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public JCheckBoxMenuItem(Icon icon) {

    /**
     * Creates an initially unselected check box menu item with an icon.
     *
     * @param icon the icon of the CheckBoxMenuItem.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    public JCheckBoxMenuItem() {

    /**
     * Creates an initially unselected check box menu item with no set text or icon.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
    private static final String uiClassID = "CheckBoxMenuItemUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBoxMenuItem.java
public class JCheckBoxMenuItem extends JMenuItem implements SwingConstants,

/**
 * A menu item that can be selected or deselected. If selected, the menu
 * item typically appears with a checkmark next to it. If unselected or
 * deselected, the menu item appears without a checkmark. Like a regular
 * menu item, a check box menu item can have either text or a graphic
 * icon associated with it, or both.
 * <p>
 * Either <code>isSelected</code>/<code>setSelected</code> or
 * <code>getState</code>/<code>setState</code> can be used
 * to determine/specify the menu item's selection state. The
 * preferred methods are <code>isSelected</code> and
 * <code>setSelected</code>, which work for all menus and buttons.
 * The <code>getState</code> and <code>setState</code> methods exist for
 * compatibility with other component sets.
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
 * For further information and examples of using check box menu items,
 * see <a
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
 * description: A menu item which can be selected or deselected.
 *
 * @author Georges Saab
 * @author David Karlton
 */
