_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    protected class AccessibleJCheckBox extends AccessibleJToggleButton {

    /**
     * This class implements accessibility support for the
     * <code>JCheckBox</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to check box user-interface
     * elements.
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    protected String paramString() {

    /**
     * Returns a string representation of this JCheckBox. This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     * specific new aspects of the JFC components.
     *
     * @return  a string representation of this JCheckBox.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    private void readObject(ObjectInputStream s)

    /**
     * See JComponent.readObject() for information about serialization
     * in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    void setIconFromAction(Action a) {

    /**
     * The icon for checkboxs comes from the look and feel,
     * not the Action; this is overriden to do nothing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public String getUIClassID() {

    /**
     * Returns a string that specifies the name of the L&amp;F class
     * that renders this component.
     *
     * @return the string "CheckBoxUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     * @beaninfo
     *        expert: true
     *   description: A string that specifies the name of the L&amp;F class
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public boolean isBorderPaintedFlat() {

    /**
     * Gets the value of the <code>borderPaintedFlat</code> property.
     *
     * @return the value of the <code>borderPaintedFlat</code> property
     * @see #setBorderPaintedFlat
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public void setBorderPaintedFlat(boolean b) {

    /**
     * Sets the <code>borderPaintedFlat</code> property,
     * which gives a hint to the look and feel as to the
     * appearance of the check box border.
     * This is usually set to <code>true</code> when a
     * <code>JCheckBox</code> instance is used as a
     * renderer in a component such as a <code>JTable</code> or
     * <code>JTree</code>.  The default value for the
     * <code>borderPaintedFlat</code> property is <code>false</code>.
     * This method fires a property changed event.
     * Some look and feels might not implement flat borders;
     * they will ignore this property.
     *
     * @param b <code>true</code> requests that the border be painted flat;
     *          <code>false</code> requests normal borders
     * @see #isBorderPaintedFlat
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Whether the border is painted flat.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox (String text, Icon icon, boolean selected) {

    /**
     * Creates a check box with text and icon,
     * and specifies whether or not it is initially selected.
     *
     * @param text the text of the check box.
     * @param icon  the Icon image to display
     * @param selected a boolean value indicating the initial selection
     *        state. If <code>true</code> the check box is selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox(String text, Icon icon) {

    /**
     * Creates an initially unselected check box with
     * the specified text and icon.
     *
     * @param text the text of the check box.
     * @param icon  the Icon image to display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox (String text, boolean selected) {

    /**
     * Creates a check box with text and specifies whether
     * or not it is initially selected.
     *
     * @param text the text of the check box.
     * @param selected a boolean value indicating the initial selection
     *        state. If <code>true</code> the check box is selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox(Action a) {

    /**
     * Creates a check box where properties are taken from the
     * Action supplied.
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox (String text) {

    /**
     * Creates an initially unselected check box with text.
     *
     * @param text the text of the check box.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox(Icon icon, boolean selected) {

    /**
     * Creates a check box with an icon and specifies whether
     * or not it is initially selected.
     *
     * @param icon  the Icon image to display
     * @param selected a boolean value indicating the initial selection
     *        state. If <code>true</code> the check box is selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox(Icon icon) {

    /**
     * Creates an initially unselected check box with an icon.
     *
     * @param icon  the Icon image to display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public JCheckBox () {

    /**
     * Creates an initially unselected check box button with no text, no icon.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    private static final String uiClassID = "CheckBoxUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
    public static final String BORDER_PAINTED_FLAT_CHANGED_PROPERTY = "borderPaintedFlat";

    /** Identifies a change to the flat property. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JCheckBox.java
public class JCheckBox extends JToggleButton implements Accessible {

/**
 * An implementation of a check box -- an item that can be selected or
 * deselected, and which displays its state to the user.
 * By convention, any number of check boxes in a group can be selected.
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/button.html">How to Use Buttons, Check Boxes, and Radio Buttons</a>
 * in <em>The Java Tutorial</em>
 * for examples and information on using check boxes.
 * <p>
 * Buttons can be configured, and to some degree controlled, by
 * <code><a href="Action.html">Action</a></code>s.  Using an
 * <code>Action</code> with a button has many benefits beyond directly
 * configuring a button.  Refer to <a href="Action.html#buttonActions">
 * Swing Components Supporting <code>Action</code></a> for more
 * details, and you can find more information in <a
 * href="https://docs.oracle.com/javase/tutorial/uiswing/misc/action.html">How
 * to Use Actions</a>, a section in <em>The Java Tutorial</em>.
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
 * @see JRadioButton
 *
 * @beaninfo
 *   attribute: isContainer false
 * description: A component which can be selected or deselected.
 *
 * @author Jeff Dinkins
 */
