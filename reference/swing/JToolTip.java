_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
        public String getAccessibleDescription() {

        /**
         * Get the accessible description of this object.
         *
         * @return a localized String describing this object.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JToolTip</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to tool tip user-interface elements.
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JToolTip</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JToolTip</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code>
     * in <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    // package private

    /**
     * Always returns true since tooltips, by definition,
     * should always be on top of all other windows.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public JComponent getComponent() {

    /**
     * Returns the component the tooltip applies to.
     * The returned value may be <code>null</code>.
     *
     * @return the component that the tooltip describes
     *
     * @see JComponent#createToolTip
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public void setComponent(JComponent c) {

    /**
     * Specifies the component that the tooltip describes.
     * The component <code>c</code> may be <code>null</code>
     * and will have no effect.
     * <p>
     * This is a bound property.
     *
     * @param c the <code>JComponent</code> being described
     * @see JComponent#createToolTip
     * @beaninfo
     *       bound: true
     * description: Sets the component that the tooltip describes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public String getTipText() {

    /**
     * Returns the text that is shown when the tool tip is displayed.
     * The returned value may be <code>null</code>.
     *
     * @return the <code>String</code> that is displayed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public void setTipText(String tipText) {

    /**
     * Sets the text to show when the tool tip is displayed.
     * The string <code>tipText</code> may be <code>null</code>.
     *
     * @param tipText the <code>String</code> to display
     * @beaninfo
     *    preferred: true
     *        bound: true
     *  description: Sets the text of the tooltip
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "ToolTipUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public ToolTipUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return the <code>ToolTipUI</code> object that renders this component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    public JToolTip() {

    /** Creates a tool tip. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
    private static final String uiClassID = "ToolTipUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolTip.java
@SuppressWarnings("serial")

/**
 * Used to display a "Tip" for a Component. Typically components provide api
 * to automate the process of using <code>ToolTip</code>s.
 * For example, any Swing component can use the <code>JComponent</code>
 * <code>setToolTipText</code> method to specify the text
 * for a standard tooltip. A component that wants to create a custom
 * <code>ToolTip</code>
 * display can override <code>JComponent</code>'s <code>createToolTip</code>
 * method and use a subclass of this class.
 * <p>
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/tooltip.html">How to Use Tool Tips</a>
 * in <em>The Java Tutorial</em>
 * for further documentation.
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
 * @see JComponent#setToolTipText
 * @see JComponent#createToolTip
 * @author Dave Moore
 * @author Rich Shiavi
 */
