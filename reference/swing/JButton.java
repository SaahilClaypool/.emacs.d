_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JButton</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to button user-interface
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JButton</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JButton</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See readObject() and writeObject() in JComponent for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public void removeNotify() {

    /**
     * Overrides <code>JComponent.removeNotify</code> to check if
     * this button is currently set as the default button on the
     * <code>RootPane</code>, and if so, sets the <code>RootPane</code>'s
     * default button to <code>null</code> to ensure the
     * <code>RootPane</code> doesn't hold onto an invalid button reference.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public void setDefaultCapable(boolean defaultCapable) {

    /**
     * Sets the <code>defaultCapable</code> property,
     * which determines whether this button can be
     * made the default button for its root pane.
     * The default value of the <code>defaultCapable</code>
     * property is <code>true</code> unless otherwise
     * specified by the look and feel.
     *
     * @param defaultCapable <code>true</code> if this button will be
     *        capable of being the default button on the
     *        <code>RootPane</code>; otherwise <code>false</code>
     * @see #isDefaultCapable
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Whether or not this button can be the default button
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public boolean isDefaultCapable() {

    /**
     * Gets the value of the <code>defaultCapable</code> property.
     *
     * @return the value of the <code>defaultCapable</code> property
     * @see #setDefaultCapable
     * @see #isDefaultButton
     * @see JRootPane#setDefaultButton
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public boolean isDefaultButton() {

    /**
     * Gets the value of the <code>defaultButton</code> property,
     * which if <code>true</code> means that this button is the current
     * default button for its <code>JRootPane</code>.
     * Most look and feels render the default button
     * differently, and may potentially provide bindings
     * to access the default button.
     *
     * @return the value of the <code>defaultButton</code> property
     * @see JRootPane#setDefaultButton
     * @see #isDefaultCapable
     * @beaninfo
     *  description: Whether or not this button is the default button
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public String getUIClassID() {

    /**
     * Returns a string that specifies the name of the L&amp;F class
     * that renders this component.
     *
     * @return the string "ButtonUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     * @beaninfo
     *        expert: true
     *   description: A string that specifies the name of the L&amp;F class.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and
     * feel.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public JButton(String text, Icon icon) {

    /**
     * Creates a button with initial text and an icon.
     *
     * @param text  the text of the button
     * @param icon  the Icon image to display on the button
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public JButton(Action a) {

    /**
     * Creates a button where properties are taken from the
     * <code>Action</code> supplied.
     *
     * @param a the <code>Action</code> used to specify the new button
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    @ConstructorProperties({"text"})

    /**
     * Creates a button with text.
     *
     * @param text  the text of the button
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public JButton(Icon icon) {

    /**
     * Creates a button with an icon.
     *
     * @param icon  the Icon image to display on the button
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    public JButton() {

    /**
     * Creates a button with no set text or icon.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
    private static final String uiClassID = "ButtonUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JButton.java
@SuppressWarnings("serial")

/**
 * An implementation of a "push" button.
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
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/button.html">How to Use Buttons, Check Boxes, and Radio Buttons</a>
 * in <em>The Java Tutorial</em>
 * for information and examples of using buttons.
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
 * description: An implementation of a \"push\" button.
 *
 * @author Jeff Dinkins
 */
