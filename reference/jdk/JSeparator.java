_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JSeparator</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to separator user-interface elements.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JSeparator.
     * For separators, the AccessibleContext takes the form of an
     * AccessibleJSeparator.
     * A new AccessibleJSeparator instance is created if necessary.
     *
     * @return an AccessibleJSeparator that serves as the
     *         AccessibleContext of this JSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JSeparator</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JSeparator</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public void setOrientation( int orientation ) {

    /**
     * Sets the orientation of the separator.
     * The default value of this property is HORIZONTAL.
     * @param orientation  either <code>SwingConstants.HORIZONTAL</code>
     *                  or <code>SwingConstants.VERTICAL</code>
     * @exception IllegalArgumentException  if <code>orientation</code>
     *          is neither <code>SwingConstants.HORIZONTAL</code>
     *          nor <code>SwingConstants.VERTICAL</code>
     *
     * @see SwingConstants
     * @see #getOrientation
     * @beaninfo
     *        bound: true
     *    preferred: true
     *         enum: HORIZONTAL SwingConstants.HORIZONTAL
     *               VERTICAL   SwingConstants.VERTICAL
     *    attribute: visualUpdate true
     *  description: The orientation of the separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public int getOrientation() {

    /**
     * Returns the orientation of this separator.
     *
     * @return   The value of the orientation property, one of the
     *           following constants defined in <code>SwingConstants</code>:
     *           <code>VERTICAL</code>, or
     *           <code>HORIZONTAL</code>.
     *
     * @see SwingConstants
     * @see #setOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "SeparatorUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public void setUI(SeparatorUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the SeparatorUI L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public SeparatorUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return the SeparatorUI object that renders this component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public JSeparator( int orientation )

    /**
     * Creates a new separator with the specified horizontal or
     * vertical orientation.
     *
     * @param orientation an integer specifying
     *          <code>SwingConstants.HORIZONTAL</code> or
     *          <code>SwingConstants.VERTICAL</code>
     * @exception IllegalArgumentException if <code>orientation</code>
     *          is neither <code>SwingConstants.HORIZONTAL</code> nor
     *          <code>SwingConstants.VERTICAL</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    public JSeparator()

    /** Creates a new horizontal separator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
    private static final String uiClassID = "SeparatorUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JSeparator.java
@SuppressWarnings("serial")

/**
 * <code>JSeparator</code> provides a general purpose component for
 * implementing divider lines - most commonly used as a divider
 * between menu items that breaks them up into logical groupings.
 * Instead of using <code>JSeparator</code> directly,
 * you can use the <code>JMenu</code> or <code>JPopupMenu</code>
 * <code>addSeparator</code> method to create and add a separator.
 * <code>JSeparator</code>s may also be used elsewhere in a GUI
 * wherever a visual divider is useful.
 *
 * <p>
 *
 * For more information and examples see
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
 *      attribute: isContainer false
 *    description: A divider between menu items.
 *
 * @author Georges Saab
 * @author Jeff Shapiro
 */
